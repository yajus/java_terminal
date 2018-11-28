package part1;
import java.util.*;
public class main {

	public static void main(String[] args) {
		while(true)
		{
		System.out.println("input:");
	    Scanner read=new Scanner(System.in);
	    String a[];
	    int i=0;
	    int num=0;
	    
	    String str=read.nextLine();
	    a=str.split(" ");
	    
	    //System.out.println("test");
	    for(int j=0;j<a.length;j++)
	    {
	    	if(a[j].equals("-V")||a[j].equals("-h"))
	    		num++;
	    	//System.out.println(num);
	    }
	    if(num>=2)
	    {
	    	System.out.println("选项错误");
	    	continue;
	    }
	     boolean judge=true;
	    for(int j=0;j<a.length;j++)
	    {
	    	if((a[j].equals("-f")&&j==(a.length-1))||(a[j].equals("-f")&&a[j+1].charAt(0)=='-'))
	    	{
	    		System.out.println("-f选项错误，需要文件名");
	    		judge=false;
	    		break;
	    	}
	    	if(a[j].charAt(0)=='-'&&a[j].charAt(1)!='V'&&a[j].charAt(1)!='h'&&a[j].charAt(1)!='f'&&a[j].charAt(1)!='v')
	    	{
	    		System.out.println("选项错误");
	    		judge=false;
	    		break;
	    	}
	    	//if(a[j].equals("-f")&&a[j+1][])
	    		
	    }
	    if(!judge)
	    continue;
	    for(int j=0;j<a.length;j++)
	    {
	    	if(a[j].equals("-V"))
	    	{System.out.println("当前版本为：***.**");}
	    	if(a[j].equals("-h"))
	    	{System.out.println("帮助文档：**************");}
	    	if(a[j].equals("-f"))
	    	{System.out.println("成功从"+a[j+1]+"读取文档");}
	    	if(a[j].equals("-v"))
	    	{System.out.println("其他信息：************");}
	    }
	    
	   // String a=read.next();
	    //String b=read.next();
	    //System.out.println(a);
	    //System.out.println(b);
	}
	}
}

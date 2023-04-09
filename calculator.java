package youssef;
import static java.lang.Boolean.TRUE;

import java.util.Scanner;

public class calculator {
	static // double e = 2.718281828 ;
	boolean stillplaying =true;
	public static void main(String[] args) {
	
		while (stillplaying=true) {
		Scanner S= new Scanner(System.in);	
		System.out.println("press 1 to do                    'All basic mathematical operations' "); 	
		System.out.println("press 2 if you want to use       'trigonometric function'");
		System.out.println("press 3 if you want to use       'exponential function'");
		System.out.println("press 4 if you want to use       'factorial function'");  
		System.out.println("press 5 if you want to use       'degrees and radians measurments'");
		System.out.println("press 6 if you want to make      'Conversion between Binary, Octal, Decimal, and Hexadecimal systems' ");
		System.out.println("press 7 if you want to do some   ' logical operations' ");
		System.out.println("press 8 if you want to do some   'logic l gates' ");
		int  a = S.nextInt();
	// hena 7n3ml if w else
		if (a == 1) {

System.out.println("press 1 if you want to make 'addition'");
System.out.println("press 2 if you want to make 'subtraction'");
System.out.println("press 3 if you want to make 'multiplication'");
System.out.println("press 4 if you want to make 'division'");
System.out.println("press 5 if you want to make 'remainder of division'");		
int b=S.nextInt();
if (b==1) {
	addition();

}
else {
	if(b==2) {

	subtraction();
		}
else {
if(b==3) {
	multiplication();
	}
        
else{
	if(b==4) {
		division();
	}
	else
	if(b==5) {
		remainder();
	}	
     }      
     }
     }		
     }// if alkebera*/
		else {
		if (a==2) {
			
			System.out.println("press 1 if you want to make 'sin()'");
			System.out.println("press 2 if you want to make 'cos()'");
			System.out.println("press 3 if you want to make 'tan()'");
			System.out.println("press 4 if you want to make 'sin^-1()'");
			System.out.println("press 5 if you want to make 'cos^-1()");		
			System.out.println("press 5 if you want to make 'tan^-1()");
			System.out.println("press 7 if you want to make 'sinh()");
			System.out.println("press 8 if you want to make 'cosh()");
			System.out.println("press 9 if you want to make 'tanh()");
			int b=S.nextInt();
			if(b==1) {
				sin();
			}
			else {
		if (b==2) {
			cos();	
		}		
		else {
		if(b==3) {
			tan();		
		}	
		else {
		if(b==4) {
			sininverse();		
		}
		else {
		if(b==5) {
			cosinverse(); 	
			
		}
		else {
			if(b==6) {
				taninverse() ; 		
			}
			else {
			if(b==7) {
				sinh();
			}	
			else {
			if (b==8) {
			cosh();	
				
			}
			else {
			if(b==9) {
				
				tanh();
			}	
				
			}
				
			}	
			}
		}
			
		}	
			
		}			
		}	
		}		
		}	
		else {
		if(a==3) {
			System.out.println("press 1 if you want to make 'x^2'");
			System.out.println("press 2 if you want to make 'x^3'");
			System.out.println("press 3 if you want to make ' x^y'");
			System.out.println("press 4 if you want to make '√x'");
			System.out.println("press 5 if you want to make 'y^√x");		
			System.out.println("press 6 if you want to make '3^√x");
			System.out.println("press 7 if you want to make 'ln()");
			System.out.println("press 8 if you want to make 'log()");
			System.out.println("press 9 if you want to make 'e^x");
			int b=S.nextInt();
			if(b==1) {
				power2();
			}
			else {
			if(b==2) {
				power3();
				
			}
		    else {
			if(b==3) {
				powerneedednumber();
			}
			else{
			if(b==4) {
				sqrt();
				
			}	
			else {
			if(b==5) {
				rootneedednumer();
			}
			else {
			if(b==6) {
				cubic();		
			}	
			else {
			if(b==7) {
			ln();		
			}
			else {
			if(b==8) {
				log();
			}else {
			if(b==9) {
			exp();	
			}	
				
			}				
			}
				
			}	
				
			}
			}
				
				
			}
			}
				
			}	
		}		
		else {
		if(a==4) {
		factorial();
		}	
		else {
	  if(a==5) {
		 System.out.println("press 1 if you want to convert degree to radian");
		 System.out.println("press 2 if you want to convert radian to degree");  
		 int b=S.nextInt();   
	if(b==1){
		degreetoradian();
	}
	else {
	if(b==2) {
		
		radiantodegree();
	}	
		
	}
	  }
	  else {
		if(a==6) {
			System.out.println("press 1 if your input decimal");
			System.out.println("press 2 if your input bianry");
			System.out.println("press 3 if your input hexadicmal");
			System.out.println("press 4 if your input octal");
			int b=S.nextInt();
			if(b==1) {
				System.out.println("press 1 if you want to convert to binary");
				System.out.println("press 2 if you want to convert to hexadicmal");
				System.out.println("press 3 if you want to convert to octal");
				int c=S.nextInt();
				if (c==1) {
					dec_to_binary();
				}
				else {
				if (c==2) {
					Dec_to_hexa();
				}
				else {
			if(c==3) {
				dec_to_octa();		
			}		
					
					
				}
					
				}
			}
			else {
			if(b==2) {
				System.out.println("press 1 if you want to convert to decimal");
				System.out.println("press 2 if you want to convert to hexadicmal");
				System.out.println("press 3 if you want to convert to octal");
				int c=S.nextInt();
				if(c==1) {
			binary_to_dec();
					
					
				}
				else {
				if(c==2) {
				binary_to_hexa();	
				}
				else {
				if(c==3) {
				binary_to_octa();	
					
				}	
					
					
				}
				}
				
				
			}
			else {
			if(b==3) {
				System.out.println("press 1 if you want to convert to decimal");
				System.out.println("press 2 if you want to convert to binary");
				System.out.println("press 3 if you want to convert to octal");
				int c=S.nextInt();
				if(c==1) {
					hex_to_dec();
					
				}
				else {
				if(c==2) {
					hex_to_binary();
				}
				else {
				if(c==3) {
				hex_to_octa();	
				}	
					
				}
				}
			}	
			else {
			if(b==4) {
				System.out.println("press 1 if you want to convert to decimal");
				System.out.println("press 2 if you want to convert to binary");
				System.out.println("press 3 if you want to convert to hexadecimal");
				int c=S.nextInt();
				if(c==1) {
				octa_to_dec();	
				}
				else {
				if(c==2) {
				octa_to_binary();	
				}
				else {
				if(c==3) {
					octa_to_hexa();
				}	
				}
				}
				
			}	
			}	
				
			}	
				
				
			}
			
		}
		else {
		if(a==7) {
            System.out.println("press 1 to use AND operation");
            System.out.println("press 2 to use OR  operation");
            System.out.println("press 3 to use XOR operation");
            System.out.println("press 4 to use NOT operation");	
            int b = S.nextInt();
            if(b==1) {
            	and();
            }else {
            if(b==2) {
            or();
            	
            }else {
            if(b==3) {
           xor(); 	
            	
            	
            }else {
            if(b==4) {
            not();	
            }	
            }	
            	
            }	
            	
            	
            }
            }
			
			
			
		
		
		
		else {
            if(a==8){
                System.out.println("press 1 to use AND gate");
                System.out.println("press 2 to use OR gate");
                System.out.println("press 3 to use XOR gate");
                System.out.println("press 4 to use NOT gate");
                int b = S.nextInt();
        if(b==1){
                And();
                }
        else{
           if(b==2){
                Or();          
                   }
            else {
                if(b==3){
                 Xor();
                       }
                else {
                   if(b==4){
                     Not();
        
                        }
		
	
				
			
		}
		  
	  }
			
			
		}
		}	
        }
		
		}
		}
		}
		}
		}
		}
		}   
	
	 } // main
	public static void addition() {
     System.out.println("enter how many input");
		Scanner S = new Scanner(System.in);
int n = S.nextInt();
System.out.println("enter your numbers");
double []numbers=new double[n];
       for(int j=0;j<n;j++){
    numbers[j]= S.nextDouble();
}
         double sum = 0.0 ;
       for(int i=0;i<n;i++){
 
   sum += numbers[i];
}   
System.out.println(sum);
}
	private static void subtraction() {
	    Scanner S = new Scanner(System.in);
	   System.out.print("Enter the number you need to subtract from");
	  double b = S.nextDouble();
	  System.out.print("Enter how many values you need in subtraction");
	  int n = S.nextInt();
	   
	 double []numbers=new double[n];
	        for(int j=0;j<n;j++){
	     numbers[j]= S.nextDouble();
	 }
	        for(int i=0;i<n;i++){
	            b-= numbers[i];
	        }
	    System.out.print(b);
	    }
	 private static void multiplication() {
         Scanner S = new Scanner(System.in);
         System.out.println("enter how many input");
         int n = S.nextInt();
         System.out.println("enter your numbers");
 double []numbers=new double[n];
        for(int j=0;j<n;j++){
     numbers[j]= S.nextDouble();
 }
         double product = 1.0 ;
for(int i=0;i<n;i++){
   product *= numbers[i];
}
System.out.println(product);
}
	   private static void division() {
	double a,b,c;
		   Scanner S = new Scanner(System.in);
	System.out.println("enter your first number ");
	
	a=S.nextDouble();	
	System.out.println("enter your second number ");
	b=S.nextDouble();
	c=a/b;
	System.out.println(c);
	 }
	   private static void remainder() {
		   double a,b,c;
		   Scanner S = new Scanner(System.in);
	System.out.println("enter your first number ");
	
	a=S.nextDouble();	
	System.out.println("enter your second number ");
	b=S.nextDouble();
	c=((a)%(b));
	System.out.println(c);
	 } private static void power2() {
	        Scanner S = new Scanner(System.in);
	        double n = S.nextDouble();
	        System.out.println(n*n);
	        
	
	              }
	  private static void power3() {
	        Scanner S = new Scanner(System.in);
	double n = S.nextDouble();
 System.out.println(n*n*n);
	 }
	   private static void sqrt() {
	        Scanner S = new Scanner(System.in);
	double n = S.nextInt();
	 
	System.out.println(Math.sqrt(n));
	    
	   }
	   private static void cubic() {
			// TODO Auto-generated method stub
		    double c;
			   Scanner S = new Scanner(System.in);
		double n = S.nextDouble();
		 

			c=Math.cbrt(n);
		System.out.println(c);	
		}
	  public static void exp() {
		  Scanner S = new Scanner(System.in);
			double n = S.nextDouble();   
	Math.exp(n)	;   
	   }
	   
	   private static void powerneedednumber() {
	        Scanner S = new Scanner(System.in);
	System.out.println("enter the base");
	        double n = S.nextDouble();
	        System.out.println("enter the power");
	                double b = S.nextDouble();
	              System.out.println(Math.pow(n,b));

	        } 
	   private static void rootneedednumer() {
	            Scanner S = new Scanner(System.in);
	            System.out.println("enter the base of the root");
	                    double n = S.nextDouble();
	                    System.out.println("enter the power to the root");
	                            double b = S.nextDouble();
	                            System.out.println(Math.pow(n,Math.pow(b,-1)));
	                }
	   //this log
	   private static void log() {
		   Scanner S = new Scanner(System.in);
		   System.out.println("enter the base");
		           double n = S.nextDouble();
		   System.out.println(Math.log10(n));       
		       }
	   private static void ln() {
		    Scanner S = new Scanner(System.in);
		System.out.println("enter the base");
		        double n = S.nextDouble();
		        System.out.println(Math.log(n));
		    }
	   private static void factorial() {
		   Scanner S = new Scanner(System.in);
		   System.out.println("enter the number");
		           double n = S.nextDouble();
		           double fact = 1.0;
		          
		               for(int i=0;n>0;i++){
		                   fact *= n;
		                   n--;
		                  
		               }
		                   System.out.println(fact);
	    }
	   private static void degreetoradian() {
		   double b,c;
		   		Scanner s=new Scanner (System.in);
		   b=s.nextDouble();
		   c=(Math.PI/180)*b;
		   	System.out.println(c);
		   	
		   	}
		   	private static void radiantodegree() {
		   		double b,c;
		   				Scanner s=new Scanner (System.in);
		   		b=s.nextDouble();
		   		c=(180/Math.PI)*b;
		   			System.out.println(c);		   			
		   			}
		    private static void sin() {
   System.out.println("please enter the desired number in degree");
		Scanner S = new Scanner(System.in);
		double n = S.nextDouble();
		double  c=(Math.PI/180)*n;
		System.out.println(Math.sin(c));
		    }
		    private static void cos() {
		    	   System.out.println("please enter the desired number in degree");
		    	Scanner S = new Scanner(System.in);
		    	double n = S.nextDouble();
		    	double c=(Math.PI/180)*n;
		    	System.out.print(Math.cos(c));
		    	    }
		    private static void tan() {
		    	   System.out.println("please enter the desired number in degree");
		    	Scanner S = new Scanner(System.in);
		    	double n = S.nextDouble();
		    	double c=(Math.PI/180)*n;
		    	System.out.println(Math.tan(c));
	   }
		    private static void sininverse() {
		    	System.out.println("please enter a number between 0 and 1");
		    	Scanner S = new Scanner(System.in);
		    	double n = S.nextDouble();
		    	if(n<0 || n>1){
		    	    System.out.println("Error please go back to the begining and start again");
		    	}
		    	    else {
		    	        double c = Math.asin(n);
		    	        System.out.println("If you going to use degrees enter TRUE else enter False to use radians");
		    	boolean d = S.nextBoolean();
		    	if(d==TRUE){
		    	    System.out.println(Math.toDegrees(c));
		    	}
		    	else {
		    	    System.out.println(c);
		    	}
		    	}    
		    	}
		    private static void cosinverse() {
		    	System.out.println("please enter a number between 0 and 1");
		    	Scanner S = new Scanner(System.in);
		    	double n = S.nextDouble();
		    	if(n<0 || n>1){
		    	    System.out.println("Error please go back to the begining and start again");
		    	}
		    	    else {
		    	        double c = Math.acos(n);
		    	        System.out.println("If you going to use degrees enter TRUE else enter False to use radians");
		    	boolean d = S.nextBoolean();
		    	if(d==TRUE){
		    	    System.out.println(Math.toDegrees(c));
		    	}
		    	else {
		    	    System.out.println(c);
		    	}

		    	    }
		    	}
		    private static void taninverse() {
		    	System.out.println("please enter the desired number");
		    	Scanner S = new Scanner(System.in);
		    	double n = S.nextDouble();
		    	 double c = Math.atan(n);
		    	        System.out.println("If you going to use degrees enter TRUE else enter False to use radians");
		    	boolean d = S.nextBoolean();
		    	if(d==TRUE){
		    	    System.out.println(Math.toDegrees(c));
		    	}
		    	else {
		    	    System.out.println(c);
		    	}
		    	    }
		    private static void sinh() {
		    	 System.out.println("please enter the desired number in degree");
		    	Scanner S = new Scanner(System.in);
		    	double n = S.nextDouble();
		    	 System.out.println(Math.sinh(n));
		    	    }
		    private static void cosh() {
		    	System.out.println("please enter the desired number in radians");
		    	Scanner S = new Scanner(System.in);
		    	double n = S.nextDouble();
		    	 System.out.print(Math.cosh(n)); 
		    	 }
		    private static void tanh() {
		    	System.out.println("please enter the desired number in radians");
		    	Scanner S = new Scanner(System.in);
		    	double n = S.nextDouble();
		    	 System.out.print(Math.tanh(n));
		    	    }
		    public static double binary_to_dec(){
		        Scanner S = new Scanner(System.in);
		        String binary; int dec;;
		        System.out.println("enter the binary number");
		    binary=S.nextLine();
		    dec=Integer.parseInt(binary, 2);
		    System.out.println(dec); 
		    return(dec);
		    }
		    public static String binary_to_hexa(){
		    Scanner S = new Scanner(System.in);
		    String binary,hexa; int dec;
		    System.out.println("enter the binary number");
		    binary=S.nextLine();
		    dec=Integer.parseInt(binary, 2);
		    hexa=Integer.toHexString(dec);
		    System.out.println(hexa);
		    return(hexa);
		        }
		    public static String binary_to_octa(){
		    Scanner S = new Scanner(System.in);
		    String binary,octa; int dec;
		    System.out.println("enter the binary number");
		    binary=S.nextLine();
		    dec=Integer.parseInt(binary, 2);
		    octa=Integer.toOctalString(dec);
		    System.out.println(octa);
		    return(octa);
		    }
		    private static void Dec_to_hexa() {
		    	Scanner S = new Scanner(System.in);
		    	int decimal , reminder ;
		    	char[] hexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		    	String hexaValue="";
		    	System.out.println("Enter any number :");
		    	decimal=S.nextInt();
		    	while(decimal>0){
		    	    reminder = decimal%16;
		    	hexaValue=hexa[reminder]+hexaValue;
		    	decimal=decimal/16;
		    	}
		    	System.out.print("Hexa value is :"+hexaValue);
		    	    }
		    
		        public static String dec_to_binary(){
		        Scanner S=new Scanner(System.in);
		        String binary; int dec;
		        System.out.println("enter the Decimal number ");
		        dec=S.nextInt();
		        binary=Integer.toBinaryString(dec);
		        System.out.println(binary);
		        return(binary);
		    }
		        public static String dec_to_octa(){
		                Scanner S=new Scanner(System.in);
		    int dec; String octa;
		    System.out.println("enter the Decimal number ");
		        dec=S.nextInt();
		    octa=Integer.toOctalString(dec);
		        System.out.println(octa);
		            return(octa);
		        } 
		        public static int hex_to_dec(){
		    	    Scanner S=new Scanner(System.in);
		    	    String hex; int dec;
		    	    System.out.println("enter the Hexadecimal number ");
		    	 hex=S.nextLine();
		    	 dec=Integer.parseInt(hex, 16);
		    	 System.out.println(dec);
		    	    return(dec);
		    	} 
		    	public static String hex_to_octa(){
		    	        Scanner S=new Scanner(System.in);
		    	    String hex,octa; int dec;
		    	    System.out.println("enter the Hexadecimal number ");
		    	 hex=S.nextLine();
		    	     dec=Integer.parseInt(hex, 16);    
		    	octa=Integer.toOctalString(dec);
		    	 System.out.println(octa);
		    	    return(octa);

		    	}
		    	public static String hex_to_binary(){
		    	        Scanner S=new Scanner(System.in);
		    	    String hex,binary; int dec;
		    	        System.out.println("enter the Hexadecimal number ");
		    	 hex=S.nextLine();
		    	      dec=Integer.parseInt(hex, 16);    
		    	 binary=Integer.toBinaryString(dec);
		    	 System.out.println(binary);
		    	    return(binary);
		    	}
		    	private static void octa_to_hexa() {
		    		Scanner S = new Scanner(System.in);
		    		System.out.print("Enter an octal number :");
		    		String oct = S.nextLine();
		    		int dec =Integer.parseInt(oct,8);
		    		String hex=Integer.toHexString(dec);
		    		System.out.println("The Hexa value is :"+hex);
		        }
		         public static String octa_to_binary(){
		                  Scanner S=new Scanner(System.in);
		                       int octa; String binary;
		                  System.out.println("Enter the octa number");
		            octa=S.nextInt();
		       binary=Integer.toBinaryString(octa);
		            System.out.println(binary);      
		       return(binary);
		         }
		       public static  int octa_to_dec(){
		           Scanner S=new Scanner(System.in);
		            String octa ;int dec;       
		           System.out.println("Enter the octa number");
		            octa=S.nextLine();
		            dec=Integer.parseInt(octa,8);
		                System.out.println(dec);
		            return(dec);
		       }
		       private static void And() {
		    	   Scanner S = new Scanner(System.in);
		    	   System.out.print("please enter your input");

		    	   int a =S.nextInt();
		    	   int b =S.nextInt();
		    	   if( (a==0 || a==1) && (b==0 || b==1)){
		    	       if(a==1 && b==1){
		    	           System.out.println("The output is 1");
		    	       }
		    	       else{
		    	           System.out.println("The output is 0");
		    	   }
		    	   }
		    	       else {
		    	           System.out.println("invalid input please try again");
		    	           }

		    	       }

		    	       private static void Or() {
		    	   Scanner S = new Scanner(System.in);
		    	   System.out.print("please enter your input");

		    	   int a =S.nextInt();
		    	   int b =S.nextInt();
		    	   if( (a==0 || a==1) && (b==0 || b==1)){
		    	       if(a==1 || b==1){
		    	           System.out.println("The output is 1");
		    	       }
		    	       else{
		    	           System.out.println("The output is 0");
		    	   }
		    	   }
		    	       else {
		    	           System.out.println("invalid input please try again");
		    	           }
		    	       }

		    	       private static void Xor() {
		    	   Scanner S = new Scanner(System.in);
		    	   System.out.print("please enter your input");

		    	   int a =S.nextInt();
		    	   int b =S.nextInt();
		    	   if( (a==0 || a==1) && (b==0 || b==1)){
		    	       if((a==1 && b==0)||(a==0 && b==1)){
		    	           System.out.println("The output is 1");
		    	       }
		    	       else{
		    	           System.out.println("The output is 0");
		    	   }
		    	   }
		    	       else {
		    	           System.out.println("invalid input please try again");
		    	           }
		    	       }

		    	       private static void Not() {
		    	   Scanner S = new Scanner(System.in);
		    	   System.out.print("please enter your input");
		    	   int a =S.nextInt();
		    	   if( (a==0 || a==1) ){
		    	       if(a==0){
		    	           System.out.println("The output is 1");
		    	       }
		    	       else{
		    	           System.out.println("The output is 0");
		    	   }
		    	   }
		    	       else {
		    	           System.out.println("invalid input please try again");
		    	           }
		    	   
		 }       
		    	   	public static void and() {
		    	   		int a,b;
		    	   	    Scanner S=new Scanner(System.in);
		    	   	    //And
		    	   	    System.out.println("Enter the frist number");
		    	   	      a=S.nextInt();
		    	   	    System.out.println("Enter the second number");
		    	   	      b=S.nextInt();
		    	   	         System.out.println("num1&num2="+(a&b));	       
		    	   	}
		    	   private static void or() {
		    		 int a,b;
		    		   Scanner S=new Scanner(System.in);
		    	    System.out.println("Enter the frist number");
		    	     a=S.nextInt();
		    	    System.out.println("Enter the second number");
		    	     b=S.nextInt();
		    	       System.out.println("num1|num2="+(a|b));
		    	       }
		    	   private static void xor() { 
		    	int a,b;
		    		   Scanner S=new Scanner (System.in);
		    		   System.out.println("Enter the frist number");
		    		     a=S.nextInt();
		    		    System.out.println("Enter the second number");
		    		     b=S.nextInt();
		    		       System.out.println("num^&num2="+(a^b));
		    	   }
		    	   private static void not() { 
				    	int a,b;
				    	Scanner S=new Scanner (System.in);
				    	System.out.println("Enter the frist number");
				         a=S.nextInt();
				        
				           System.out.println("~num1="+(~a));
               }
}
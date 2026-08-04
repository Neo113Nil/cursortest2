package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f11727a;

    static {
        char[] cArr = new char[80];
        f11727a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(f11727a, 0, i8);
            i7 -= i8;
        }
    }

    public static void b(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i7, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i8 = 1; i8 < str.length(); i8++) {
                char cCharAt = str.charAt(i8);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0828h c0828h = AbstractC0829i.f11779b;
            sb.append(p113p3.f.E(new C0828h(((String) obj).getBytes(A.f11702a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0829i) {
            sb.append(": \"");
            sb.append(p113p3.f.E((AbstractC0829i) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0842w) {
            sb.append(" {");
            c((AbstractC0842w) obj, sb, i7 + 2);
            sb.append("\n");
            a(i7, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i9 = i7 + 2;
        b(sb, i9, "key", entry.getKey());
        b(sb, i9, "value", entry.getValue());
        sb.append("\n");
        a(i7, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:107:0x0207  */
    /* JADX WARN: Code duplicated, block: B:126:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:65:0x0173  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0197  */
    /* JADX WARN: Code duplicated, block: B:75:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x019d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d7  */
    public static void c(AbstractC0842w abstractC0842w, StringBuilder sb, int i7) {
        int i8;
        Method method;
        Method method2;
        Object objN;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0842w.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i8 = 3;
            if (i9 >= length) {
                break;
            }
            Method method5 = declaredMethods[i9];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i8);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                b(sb, i7, strSubstring.substring(0, strSubstring.length() - 4), AbstractC0842w.n(method4, abstractC0842w, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb, i7, strSubstring.substring(0, strSubstring.length() - 3), AbstractC0842w.n(method3, abstractC0842w, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objN = AbstractC0842w.n(method, abstractC0842w, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objN instanceof Boolean) {
                                    zEquals = !((Boolean) objN).booleanValue();
                                } else if (objN instanceof Integer) {
                                    if (((Integer) objN).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objN instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objN).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objN instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objN).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objN instanceof String) {
                                    zEquals = objN.equals("");
                                } else if (objN instanceof AbstractC0829i) {
                                    zEquals = objN.equals(AbstractC0829i.f11779b);
                                } else if ((objN instanceof AbstractC0821a) ? !((objN instanceof Enum) && ((Enum) objN).ordinal() == 0) : objN != ((AbstractC0821a) objN).a()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC0842w.n(method2, abstractC0842w, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i7, strSubstring, objN);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objN = AbstractC0842w.n(method, abstractC0842w, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objN instanceof Boolean) {
                                zEquals = !((Boolean) objN).booleanValue();
                            } else if (objN instanceof Integer) {
                                if (((Integer) objN).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objN instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objN).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objN instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objN).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objN instanceof String) {
                                zEquals = objN.equals("");
                            } else if (objN instanceof AbstractC0829i) {
                                zEquals = objN.equals(AbstractC0829i.f11779b);
                            } else if (objN instanceof AbstractC0821a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC0842w.n(method2, abstractC0842w, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb, i7, strSubstring, objN);
                        }
                    }
                }
            }
            i8 = 3;
        }
        f0 f0Var = abstractC0842w.unknownFields;
        if (f0Var != null) {
            for (int i10 = 0; i10 < f0Var.f11770a; i10++) {
                b(sb, i7, String.valueOf(f0Var.f11771b[i10] >>> 3), f0Var.f11772c[i10]);
            }
        }
    }
}

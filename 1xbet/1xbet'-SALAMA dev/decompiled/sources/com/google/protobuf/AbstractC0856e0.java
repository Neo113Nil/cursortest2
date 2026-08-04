package com.google.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.protobuf.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0856e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f12181a;

    static {
        char[] cArr = new char[80];
        f12181a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(f12181a, 0, i8);
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
            C0865j c0865j = AbstractC0867k.f12212b;
            sb.append(w0.Q(new C0865j(((String) obj).getBytes(K.f12112a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0867k) {
            sb.append(": \"");
            sb.append(w0.Q((AbstractC0867k) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof C) {
            sb.append(" {");
            c((C) obj, sb, i7 + 2);
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

    /* JADX WARN: Code duplicated, block: B:101:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:107:0x020c  */
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
    public static void c(C c3, StringBuilder sb, int i7) {
        int i8;
        Method method;
        Method method2;
        Object objL;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = c3.getClass().getDeclaredMethods();
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
                b(sb, i7, strSubstring.substring(0, strSubstring.length() - 4), C.l(method4, c3, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb, i7, strSubstring.substring(0, strSubstring.length() - 3), C.l(method3, c3, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objL = C.l(method, c3, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objL instanceof Boolean) {
                                    zEquals = !((Boolean) objL).booleanValue();
                                } else if (objL instanceof Integer) {
                                    if (((Integer) objL).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objL instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objL).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objL instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objL).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objL instanceof String) {
                                    zEquals = objL.equals("");
                                } else if (objL instanceof AbstractC0867k) {
                                    zEquals = objL.equals(AbstractC0867k.f12212b);
                                } else if ((objL instanceof AbstractC0847a) ? !((objL instanceof Enum) && ((Enum) objL).ordinal() == 0) : objL != ((C) ((C) ((AbstractC0847a) objL)).j(6))) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) C.l(method2, c3, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i7, strSubstring, objL);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objL = C.l(method, c3, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objL instanceof Boolean) {
                                zEquals = !((Boolean) objL).booleanValue();
                            } else if (objL instanceof Integer) {
                                if (((Integer) objL).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objL instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objL).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objL instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objL).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objL instanceof String) {
                                zEquals = objL.equals("");
                            } else if (objL instanceof AbstractC0867k) {
                                zEquals = objL.equals(AbstractC0867k.f12212b);
                            } else if (objL instanceof AbstractC0847a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) C.l(method2, c3, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb, i7, strSubstring, objL);
                        }
                    }
                }
            }
            i8 = 3;
        }
        B0 b7 = c3.unknownFields;
        if (b7 != null) {
            for (int i10 = 0; i10 < b7.f12099a; i10++) {
                b(sb, i7, String.valueOf(b7.f12100b[i10] >>> 3), b7.f12101c[i10]);
            }
        }
    }
}

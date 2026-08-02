package p000;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ro0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f6925a;

    static {
        char[] cArr = new char[80];
        f6925a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m4388a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f6925a, 0, i2);
            i -= i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4389b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m4389b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m4389b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m4388a(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
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
            C0799vd c0799vd = C0799vd.f8177l;
            sb.append(xe1.m5637e(new C0799vd(((String) obj).getBytes(ge0.f2710a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0799vd) {
            sb.append(": \"");
            sb.append(xe1.m5637e((C0799vd) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof t70) {
            sb.append(" {");
            m4390c((t70) obj, sb, i + 2);
            sb.append("\n");
            m4388a(i, sb);
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
        int i3 = i + 2;
        m4389b(sb, i3, "key", entry.getKey());
        m4389b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m4388a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX INFO: renamed from: c */
    public static void m4390c(t70 t70Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = t70Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    m4389b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), t70.m4752e(method2, t70Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m4389b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), t70.m4752e(method, t70Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM4752e = t70.m4752e(method4, t70Var, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objM4752e instanceof Boolean) {
                            zEquals = !((Boolean) objM4752e).booleanValue();
                        } else if (objM4752e instanceof Integer) {
                            if (((Integer) objM4752e).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM4752e instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM4752e).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM4752e instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objM4752e).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM4752e instanceof String) {
                            zEquals = objM4752e.equals("");
                        } else if (objM4752e instanceof C0799vd) {
                            zEquals = objM4752e.equals(C0799vd.f8177l);
                        } else if (!(objM4752e instanceof AbstractC0379k0) ? !((objM4752e instanceof Enum) && ((Enum) objM4752e).ordinal() == 0) : objM4752e != ((t70) ((t70) ((AbstractC0379k0) objM4752e)).mo507c(6))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) t70.m4752e(method5, t70Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m4389b(sb, i, strSubstring, objM4752e);
                    }
                }
            }
            i2 = i3;
        }
        of1 of1Var = t70Var.unknownFields;
        if (of1Var != null) {
            for (int i5 = 0; i5 < of1Var.f5718a; i5++) {
                m4389b(sb, i, String.valueOf(of1Var.f5719b[i5] >>> 3), of1Var.f5720c[i5]);
            }
        }
    }
}

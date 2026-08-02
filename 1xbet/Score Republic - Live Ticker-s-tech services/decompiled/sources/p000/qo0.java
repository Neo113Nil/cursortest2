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
public abstract class qo0 {

    /* JADX INFO: renamed from: a */
    public static final char[] f6548a;

    static {
        char[] cArr = new char[80];
        f6548a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m4117a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f6548a, 0, i2);
            i -= i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4118b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m4118b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m4118b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m4117a(i, sb);
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
            C0762ud c0762ud = C0762ud.f7797l;
            sb.append(d71.m1108c(new C0762ud(((String) obj).getBytes(fe0.f2381a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0762ud) {
            sb.append(": \"");
            sb.append(d71.m1108c((C0762ud) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof s70) {
            sb.append(" {");
            m4119c((s70) obj, sb, i + 2);
            sb.append("\n");
            m4117a(i, sb);
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
        m4118b(sb, i3, "key", entry.getKey());
        m4118b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        m4117a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX INFO: renamed from: c */
    public static void m4119c(s70 s70Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = s70Var.getClass().getDeclaredMethods();
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
                    m4118b(sb, i, strSubstring.substring(0, strSubstring.length() - 4), s70.m4491g(method2, s70Var, new Object[0]));
                }
                i2 = i3;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m4118b(sb, i, strSubstring.substring(0, strSubstring.length() - 3), s70.m4491g(method, s70Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM4491g = s70.m4491g(method4, s70Var, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objM4491g instanceof Boolean) {
                            zEquals = !((Boolean) objM4491g).booleanValue();
                        } else if (objM4491g instanceof Integer) {
                            if (((Integer) objM4491g).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM4491g instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM4491g).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM4491g instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objM4491g).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objM4491g instanceof String) {
                            zEquals = objM4491g.equals("");
                        } else if (objM4491g instanceof C0762ud) {
                            zEquals = objM4491g.equals(C0762ud.f7797l);
                        } else if (!(objM4491g instanceof AbstractC0342j0) ? !((objM4491g instanceof Enum) && ((Enum) objM4491g).ordinal() == 0) : objM4491g != ((s70) ((s70) ((AbstractC0342j0) objM4491g)).mo182e(6))) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) s70.m4491g(method5, s70Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        m4118b(sb, i, strSubstring, objM4491g);
                    }
                }
            }
            i2 = i3;
        }
        nf1 nf1Var = s70Var.unknownFields;
        if (nf1Var != null) {
            for (int i5 = 0; i5 < nf1Var.f5399a; i5++) {
                m4118b(sb, i, String.valueOf(nf1Var.f5400b[i5] >>> 3), nf1Var.f5401c[i5]);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.gC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1017gC {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f13575a;

    static {
        char[] cArr = new char[80];
        f13575a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C1733wB c1733wB = AbstractC1823yB.f16414l;
            sb.append(AbstractC0952et.m(new C1733wB(((String) obj).getBytes(VB.f11871a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1823yB) {
            sb.append(": \"");
            sb.append(AbstractC0952et.m((AbstractC1823yB) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof MB) {
            sb.append(" {");
            c((MB) obj, sb, i + 2);
            sb.append("\n");
            b(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i6 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i6, "key", entry.getKey());
        a(sb, i6, "value", entry.getValue());
        sb.append("\n");
        b(i, sb);
        sb.append("}");
    }

    public static void b(int i, StringBuilder sb) {
        while (i > 0) {
            int i5 = 80;
            if (i <= 80) {
                i5 = i;
            }
            sb.append(f13575a, 0, i5);
            i -= i5;
        }
    }

    public static void c(MB mb, StringBuilder sb, int i) {
        int i5;
        int i6;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = mb.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i7 = 0;
        while (true) {
            i5 = 3;
            if (i7 >= length) {
                break;
            }
            Method method3 = declaredMethods[i7];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i7++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i5);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i6 = i5;
            } else {
                i6 = i5;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, substring.substring(0, substring.length() - 4), MB.i(method2, mb, new Object[0]));
                    i5 = i6;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), MB.i(method, mb, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object i8 = MB.i(method4, mb, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) MB.i(method5, mb, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, i8);
                    } else if (i8 instanceof Boolean) {
                        if (!((Boolean) i8).booleanValue()) {
                        }
                        a(sb, i, substring, i8);
                    } else if (i8 instanceof Integer) {
                        if (((Integer) i8).intValue() == 0) {
                        }
                        a(sb, i, substring, i8);
                    } else if (i8 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) i8).floatValue()) == 0) {
                        }
                        a(sb, i, substring, i8);
                    } else if (i8 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) i8).doubleValue()) == 0) {
                        }
                        a(sb, i, substring, i8);
                    } else {
                        if (i8 instanceof String) {
                            equals = i8.equals("");
                        } else if (i8 instanceof AbstractC1823yB) {
                            equals = i8.equals(AbstractC1823yB.f16414l);
                        } else if (i8 instanceof AbstractC1464qB) {
                            if (i8 == ((MB) ((MB) ((AbstractC1464qB) i8)).s(6, null))) {
                            }
                            a(sb, i, substring, i8);
                        } else {
                            if ((i8 instanceof Enum) && ((Enum) i8).ordinal() == 0) {
                            }
                            a(sb, i, substring, i8);
                        }
                        if (equals) {
                        }
                        a(sb, i, substring, i8);
                    }
                }
            }
            i5 = i6;
        }
        C1779xC c1779xC = mb.zzt;
        if (c1779xC != null) {
            for (int i9 = 0; i9 < c1779xC.f16272a; i9++) {
                a(sb, i, String.valueOf(c1779xC.f16273b[i9] >>> 3), c1779xC.f16274c[i9]);
            }
        }
    }
}

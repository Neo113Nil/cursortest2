package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.play_billing.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0378v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f5271a;

    static {
        char[] cArr = new char[80];
        f5271a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i2, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
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
            sb.append(AbstractC0325d1.f(new Y0(((String) obj).getBytes(AbstractC0349l1.f5205a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof Y0) {
            sb.append(": \"");
            sb.append(AbstractC0325d1.f((Y0) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0334g1) {
            sb.append(" {");
            c((AbstractC0334g1) obj, sb, i2 + 2);
            sb.append("\n");
            b(i2, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i6 = i2 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i6, "key", entry.getKey());
        a(sb, i6, "value", entry.getValue());
        sb.append("\n");
        b(i2, sb);
        sb.append("}");
    }

    public static void b(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(f5271a, 0, i3);
            i2 -= i3;
        }
    }

    public static void c(AbstractC0334g1 abstractC0334g1, StringBuilder sb, int i2) {
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0334g1.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i6 = 0;
        while (true) {
            i3 = 3;
            if (i6 >= length) {
                break;
            }
            Method method3 = declaredMethods[i6];
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
            i6++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i3);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i2, substring.substring(0, substring.length() - 4), AbstractC0334g1.i(method2, abstractC0334g1, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i2, substring.substring(0, substring.length() - 3), AbstractC0334g1.i(method, abstractC0334g1, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object i7 = AbstractC0334g1.i(method4, abstractC0334g1, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) AbstractC0334g1.i(method5, abstractC0334g1, new Object[0])).booleanValue()) {
                        }
                        a(sb, i2, substring, i7);
                    } else if (i7 instanceof Boolean) {
                        if (!((Boolean) i7).booleanValue()) {
                        }
                        a(sb, i2, substring, i7);
                    } else if (i7 instanceof Integer) {
                        if (((Integer) i7).intValue() == 0) {
                        }
                        a(sb, i2, substring, i7);
                    } else if (i7 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) i7).floatValue()) == 0) {
                        }
                        a(sb, i2, substring, i7);
                    } else if (i7 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) i7).doubleValue()) == 0) {
                        }
                        a(sb, i2, substring, i7);
                    } else {
                        if (i7 instanceof String) {
                            equals = i7.equals("");
                        } else if (i7 instanceof Y0) {
                            equals = i7.equals(Y0.f5142c);
                        } else if (i7 instanceof S0) {
                            if (i7 == ((AbstractC0334g1) ((AbstractC0334g1) ((S0) i7)).d(6))) {
                            }
                            a(sb, i2, substring, i7);
                        } else {
                            if ((i7 instanceof Enum) && ((Enum) i7).ordinal() == 0) {
                            }
                            a(sb, i2, substring, i7);
                        }
                        if (equals) {
                        }
                        a(sb, i2, substring, i7);
                    }
                }
            }
            i3 = 3;
        }
        H1 h12 = abstractC0334g1.zzc;
        if (h12 != null) {
            for (int i8 = 0; i8 < h12.f5056a; i8++) {
                a(sb, i2, String.valueOf(h12.f5057b[i8] >>> 3), h12.f5058c[i8]);
            }
        }
    }
}

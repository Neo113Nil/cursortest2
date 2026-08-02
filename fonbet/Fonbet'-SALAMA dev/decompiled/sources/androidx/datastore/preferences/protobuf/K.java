package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f9116a;

    static {
        char[] cArr = new char[80];
        f9116a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i7, StringBuilder sb) {
        while (i7 > 0) {
            int i8 = 80;
            if (i7 <= 80) {
                i8 = i7;
            }
            sb.append(f9116a, 0, i8);
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
                char charAt = str.charAt(i8);
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
            C0683g c0683g = C0683g.f9182c;
            sb.append(Y4.D.o(new C0683g(((String) obj).getBytes(AbstractC0698w.f9255a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0683g) {
            sb.append(": \"");
            sb.append(Y4.D.o((C0683g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0696u) {
            sb.append(" {");
            c((AbstractC0696u) obj, sb, i7 + 2);
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

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0197, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a8, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01be, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(AbstractC0696u abstractC0696u, StringBuilder sb, int i7) {
        int i8;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0696u.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i8 = 3;
            if (i9 >= length) {
                break;
            }
            Method method3 = declaredMethods[i9];
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
            i9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i8);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i7, substring.substring(0, substring.length() - 4), AbstractC0696u.g(method2, abstractC0696u, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i7, substring.substring(0, substring.length() - 3), AbstractC0696u.g(method, abstractC0696u, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object g3 = AbstractC0696u.g(method4, abstractC0696u, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (g3 instanceof Boolean) {
                            equals = !((Boolean) g3).booleanValue();
                        } else if (!(g3 instanceof Integer)) {
                            if (!(g3 instanceof Float)) {
                                if (!(g3 instanceof Double)) {
                                    equals = g3 instanceof String ? g3.equals("") : g3 instanceof C0683g ? g3.equals(C0683g.f9182c) : !(g3 instanceof AbstractC0677a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) AbstractC0696u.g(method5, abstractC0696u, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb, i7, substring, g3);
                    }
                }
            }
            i8 = 3;
        }
        b0 b0Var = abstractC0696u.unknownFields;
        if (b0Var != null) {
            for (int i10 = 0; i10 < b0Var.f9167a; i10++) {
                b(sb, i7, String.valueOf(b0Var.f9168b[i10] >>> 3), b0Var.f9169c[i10]);
            }
        }
    }
}

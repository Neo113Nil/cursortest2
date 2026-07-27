package androidx.datastore.preferences.protobuf;

import com.startapp.simple.bloomfilter.codec.IOUtils;
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
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2170a;

    static {
        char[] cArr = new char[80];
        f2170a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i3, StringBuilder sb) {
        while (i3 > 0) {
            int i4 = 80;
            if (i3 <= 80) {
                i4 = i3;
            }
            sb.append(f2170a, 0, i4);
            i3 -= i4;
        }
    }

    public static void b(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i3, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i4 = 1; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
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
            C0132g c0132g = C0132g.f2230c;
            sb.append(F2.b.q(new C0132g(((String) obj).getBytes(AbstractC0149y.f2300a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0132g) {
            sb.append(": \"");
            sb.append(F2.b.q((C0132g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0147w) {
            sb.append(" {");
            c((AbstractC0147w) obj, sb, i3 + 2);
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            a(i3, sb);
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
        int i5 = i3 + 2;
        b(sb, i5, "key", entry.getKey());
        b(sb, i5, "value", entry.getValue());
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        a(i3, sb);
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x019a, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019c, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c5, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(AbstractC0147w abstractC0147w, StringBuilder sb, int i3) {
        int i4;
        int i5;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0147w.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i6 = 0;
        while (true) {
            i4 = 3;
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
            String substring = ((String) entry.getKey()).substring(i4);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i5 = i4;
            } else {
                i5 = i4;
                if (method2.getReturnType().equals(List.class)) {
                    b(sb, i3, substring.substring(0, substring.length() - 4), AbstractC0147w.e(method2, abstractC0147w, new Object[0]));
                    i4 = i5;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i3, substring.substring(0, substring.length() - 3), AbstractC0147w.e(method, abstractC0147w, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e3 = AbstractC0147w.e(method4, abstractC0147w, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (e3 instanceof Boolean) {
                            equals = !((Boolean) e3).booleanValue();
                        } else if (!(e3 instanceof Integer)) {
                            if (!(e3 instanceof Float)) {
                                if (!(e3 instanceof Double)) {
                                    equals = e3 instanceof String ? e3.equals("") : e3 instanceof C0132g ? e3.equals(C0132g.f2230c) : !(e3 instanceof AbstractC0126a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) AbstractC0147w.e(method5, abstractC0147w, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb, i3, substring, e3);
                    }
                }
            }
            i4 = i5;
        }
        d0 d0Var = abstractC0147w.unknownFields;
        if (d0Var != null) {
            for (int i7 = 0; i7 < d0Var.f2223a; i7++) {
                b(sb, i3, String.valueOf(d0Var.f2224b[i7] >>> 3), d0Var.f2225c[i7]);
            }
        }
    }
}

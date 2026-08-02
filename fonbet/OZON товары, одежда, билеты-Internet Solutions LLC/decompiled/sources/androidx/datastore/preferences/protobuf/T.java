package androidx.datastore.preferences.protobuf;

import E0.C2942q;
import androidx.datastore.preferences.protobuf.AbstractC5362h;
import androidx.datastore.preferences.protobuf.AbstractC5376w;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes8.dex */
final class T {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f42476a;

    static {
        char[] cArr = new char[80];
        f42476a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void a(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(f42476a, 0, i12);
            i11 -= i12;
        }
    }

    static void b(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i11, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i11, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i12 = 1; i12 < str.length(); i12++) {
                char charAt = str.charAt(i12);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            AbstractC5362h abstractC5362h = AbstractC5362h.f42524b;
            sb2.append(k0.a(new AbstractC5362h.g(((String) obj).getBytes(C5378y.f42628a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC5362h) {
            sb2.append(": \"");
            sb2.append(k0.a((AbstractC5362h) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC5376w) {
            sb2.append(" {");
            c((AbstractC5376w) obj, sb2, i11 + 2);
            sb2.append("\n");
            a(i11, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i11 + 2;
        b(sb2, i13, "key", entry.getKey());
        b(sb2, i13, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb2.append("\n");
        a(i11, sb2);
        sb2.append("}");
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
    private static void c(AbstractC5376w abstractC5376w, StringBuilder sb2, int i11) {
        int i12;
        int i13;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC5376w.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i14 = 0;
        while (true) {
            i12 = 3;
            if (i14 >= length) {
                break;
            }
            Method method3 = declaredMethods[i14];
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
            i14++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i12);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i13 = i12;
            } else {
                i13 = i12;
                if (method2.getReturnType().equals(List.class)) {
                    b(sb2, i11, substring.substring(0, substring.length() - 4), AbstractC5376w.l(method2, abstractC5376w, new Object[0]));
                    i12 = i13;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb2, i11, substring.substring(0, substring.length() - 3), AbstractC5376w.l(method, abstractC5376w, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object l11 = AbstractC5376w.l(method4, abstractC5376w, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (l11 instanceof Boolean) {
                            equals = !((Boolean) l11).booleanValue();
                        } else if (!(l11 instanceof Integer)) {
                            if (!(l11 instanceof Float)) {
                                if (!(l11 instanceof Double)) {
                                    equals = l11 instanceof String ? l11.equals("") : l11 instanceof AbstractC5362h ? l11.equals(AbstractC5362h.f42524b) : !(l11 instanceof Q) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) AbstractC5376w.l(method5, abstractC5376w, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb2, i11, substring, l11);
                    }
                }
            }
            i12 = i13;
        }
        if (abstractC5376w instanceof AbstractC5376w.c) {
            Iterator<Map.Entry<AbstractC5376w.d, Object>> m11 = ((AbstractC5376w.c) abstractC5376w).extensions.m();
            while (m11.hasNext()) {
                Map.Entry<AbstractC5376w.d, Object> next = m11.next();
                next.getKey().getClass();
                b(sb2, i11, "[0]", next.getValue());
            }
        }
        n0 n0Var = abstractC5376w.unknownFields;
        if (n0Var != null) {
            n0Var.i(i11, sb2);
        }
    }

    static String d(AbstractC5376w abstractC5376w, String str) {
        StringBuilder e11 = C2942q.e("# ", str);
        c(abstractC5376w, e11, 0);
        return e11.toString();
    }
}

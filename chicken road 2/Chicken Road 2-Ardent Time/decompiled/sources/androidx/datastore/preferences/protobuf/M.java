package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2238a;

    static {
        char[] cArr = new char[80];
        f2238a = cArr;
        java.util.Arrays.fill(cArr, ' ');
    }

    public static void a(int i2, java.lang.StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(f2238a, 0, i3);
            i2 -= i3;
        }
    }

    public static void b(java.lang.StringBuilder sb, int i2, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i2, str, (java.util.Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i2, sb);
        if (!str.isEmpty()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(java.lang.Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (java.lang.Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(java.lang.Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof java.lang.String) {
            sb.append(": \"");
            androidx.datastore.preferences.protobuf.C0071g c0071g = androidx.datastore.preferences.protobuf.C0071g.f2301c;
            sb.append(Q1.l.k(new androidx.datastore.preferences.protobuf.C0071g(((java.lang.String) obj).getBytes(androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.C0071g) {
            sb.append(": \"");
            sb.append(Q1.l.k((androidx.datastore.preferences.protobuf.C0071g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof androidx.datastore.preferences.protobuf.AbstractC0086w) {
            sb.append(" {");
            c((androidx.datastore.preferences.protobuf.AbstractC0086w) obj, sb, i2 + 2);
            sb.append("\n");
            a(i2, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        int i4 = i2 + 2;
        b(sb, i4, "key", entry.getKey());
        b(sb, i4, "value", entry.getValue());
        sb.append("\n");
        a(i2, sb);
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
    public static void c(androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w, java.lang.StringBuilder sb, int i2) {
        int i3;
        boolean booleanValue;
        boolean equals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.lang.reflect.Method[] declaredMethods = abstractC0086w.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i3 = 3;
            if (i4 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i4];
            if (!java.lang.reflect.Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (java.lang.reflect.Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String substring = ((java.lang.String) entry.getKey()).substring(i3);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(java.util.List.class)) {
                b(sb, i2, substring.substring(0, substring.length() - 4), androidx.datastore.preferences.protobuf.AbstractC0086w.g(method2, abstractC0086w, new java.lang.Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(java.util.Map.class) && !method.isAnnotationPresent(java.lang.Deprecated.class) && java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                b(sb, i2, substring.substring(0, substring.length() - 3), androidx.datastore.preferences.protobuf.AbstractC0086w.g(method, abstractC0086w, new java.lang.Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    java.lang.Object g2 = androidx.datastore.preferences.protobuf.AbstractC0086w.g(method4, abstractC0086w, new java.lang.Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (g2 instanceof java.lang.Boolean) {
                            equals = !((java.lang.Boolean) g2).booleanValue();
                        } else if (!(g2 instanceof java.lang.Integer)) {
                            if (!(g2 instanceof java.lang.Float)) {
                                if (!(g2 instanceof java.lang.Double)) {
                                    equals = g2 instanceof java.lang.String ? g2.equals("") : g2 instanceof androidx.datastore.preferences.protobuf.C0071g ? g2.equals(androidx.datastore.preferences.protobuf.C0071g.f2301c) : !(g2 instanceof androidx.datastore.preferences.protobuf.AbstractC0065a) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((java.lang.Boolean) androidx.datastore.preferences.protobuf.AbstractC0086w.g(method5, abstractC0086w, new java.lang.Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb, i2, substring, g2);
                    }
                }
            }
            i3 = 3;
        }
        androidx.datastore.preferences.protobuf.d0 d0Var = abstractC0086w.unknownFields;
        if (d0Var != null) {
            for (int i5 = 0; i5 < d0Var.f2293a; i5++) {
                b(sb, i2, java.lang.String.valueOf(d0Var.f2294b[i5] >>> 3), d0Var.f2295c[i5]);
            }
        }
    }
}

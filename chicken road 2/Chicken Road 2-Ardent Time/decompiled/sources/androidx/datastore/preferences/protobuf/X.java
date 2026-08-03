package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f2269a;

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.e0 f2270b;

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.e0 f2271c;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
        androidx.datastore.preferences.protobuf.e0 e0Var = null;
        try {
            cls = java.lang.Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f2269a = cls;
        try {
            androidx.datastore.preferences.protobuf.T t2 = androidx.datastore.preferences.protobuf.T.f2259c;
            try {
                cls2 = java.lang.Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (java.lang.Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                e0Var = (androidx.datastore.preferences.protobuf.e0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (java.lang.Throwable unused3) {
        }
        f2270b = e0Var;
        f2271c = new androidx.datastore.preferences.protobuf.e0();
    }

    public static void A(androidx.datastore.preferences.protobuf.e0 e0Var, java.lang.Object obj, java.lang.Object obj2) {
        e0Var.getClass();
        androidx.datastore.preferences.protobuf.AbstractC0086w abstractC0086w = (androidx.datastore.preferences.protobuf.AbstractC0086w) obj;
        androidx.datastore.preferences.protobuf.d0 d0Var = abstractC0086w.unknownFields;
        androidx.datastore.preferences.protobuf.d0 d0Var2 = ((androidx.datastore.preferences.protobuf.AbstractC0086w) obj2).unknownFields;
        androidx.datastore.preferences.protobuf.d0 d0Var3 = androidx.datastore.preferences.protobuf.d0.f2292f;
        if (!d0Var3.equals(d0Var2)) {
            if (d0Var3.equals(d0Var)) {
                int i2 = d0Var.f2293a + d0Var2.f2293a;
                int[] copyOf = java.util.Arrays.copyOf(d0Var.f2294b, i2);
                java.lang.System.arraycopy(d0Var2.f2294b, 0, copyOf, d0Var.f2293a, d0Var2.f2293a);
                java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(d0Var.f2295c, i2);
                java.lang.System.arraycopy(d0Var2.f2295c, 0, copyOf2, d0Var.f2293a, d0Var2.f2293a);
                d0Var = new androidx.datastore.preferences.protobuf.d0(i2, copyOf, copyOf2, true);
            } else {
                d0Var.getClass();
                if (!d0Var2.equals(d0Var3)) {
                    if (!d0Var.f2297e) {
                        throw new java.lang.UnsupportedOperationException();
                    }
                    int i3 = d0Var.f2293a + d0Var2.f2293a;
                    d0Var.a(i3);
                    java.lang.System.arraycopy(d0Var2.f2294b, 0, d0Var.f2294b, d0Var.f2293a, d0Var2.f2293a);
                    java.lang.System.arraycopy(d0Var2.f2295c, 0, d0Var.f2295c, d0Var.f2293a, d0Var2.f2293a);
                    d0Var.f2293a = i3;
                }
            }
        }
        abstractC0086w.unknownFields = d0Var;
    }

    public static boolean B(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0077m.i0(i2, ((java.lang.Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((java.lang.Boolean) list.get(i5)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C0077m.f2335f;
            i4++;
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.g0(((java.lang.Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public static void D(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((androidx.datastore.preferences.protobuf.C0077m) f2.f2229a).j0(i2, (androidx.datastore.preferences.protobuf.C0071g) list.get(i3));
        }
    }

    public static void E(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                double doubleValue = ((java.lang.Double) list.get(i3)).doubleValue();
                c0077m.getClass();
                c0077m.n0(i2, java.lang.Double.doubleToRawLongBits(doubleValue));
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((java.lang.Double) list.get(i5)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C0077m.f2335f;
            i4 += 8;
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.o0(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    public static void F(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0077m.p0(i2, ((java.lang.Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Integer) list.get(i5)).intValue());
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.q0(((java.lang.Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void G(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0077m.l0(i2, ((java.lang.Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((java.lang.Integer) list.get(i5)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C0077m.f2335f;
            i4 += 4;
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.m0(((java.lang.Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void H(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0077m.n0(i2, ((java.lang.Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((java.lang.Long) list.get(i5)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C0077m.f2335f;
            i4 += 8;
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.o0(((java.lang.Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void I(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                float floatValue = ((java.lang.Float) list.get(i3)).floatValue();
                c0077m.getClass();
                c0077m.l0(i2, java.lang.Float.floatToRawIntBits(floatValue));
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((java.lang.Float) list.get(i5)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C0077m.f2335f;
            i4 += 4;
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.m0(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    public static void J(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, androidx.datastore.preferences.protobuf.W w2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            f2.h(i2, list.get(i3), w2);
        }
    }

    public static void K(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0077m.p0(i2, ((java.lang.Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Integer) list.get(i5)).intValue());
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.q0(((java.lang.Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void L(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0077m.w0(i2, ((java.lang.Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Long) list.get(i5)).longValue());
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.x0(((java.lang.Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void M(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, androidx.datastore.preferences.protobuf.W w2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            f2.k(i2, list.get(i3), w2);
        }
    }

    public static void N(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0077m.l0(i2, ((java.lang.Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((java.lang.Integer) list.get(i5)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C0077m.f2335f;
            i4 += 4;
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.m0(((java.lang.Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void O(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0077m.n0(i2, ((java.lang.Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((java.lang.Long) list.get(i5)).getClass();
            java.util.logging.Logger logger = androidx.datastore.preferences.protobuf.C0077m.f2335f;
            i4 += 8;
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.o0(((java.lang.Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static void P(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                int intValue = ((java.lang.Integer) list.get(i3)).intValue();
                c0077m.u0(i2, (intValue >> 31) ^ (intValue << 1));
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int intValue2 = ((java.lang.Integer) list.get(i5)).intValue();
            i4 += androidx.datastore.preferences.protobuf.C0077m.b0((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            int intValue3 = ((java.lang.Integer) list.get(i3)).intValue();
            c0077m.v0((intValue3 >> 31) ^ (intValue3 << 1));
            i3++;
        }
    }

    public static void Q(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                long longValue = ((java.lang.Long) list.get(i3)).longValue();
                c0077m.w0(i2, (longValue >> 63) ^ (longValue << 1));
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long longValue2 = ((java.lang.Long) list.get(i5)).longValue();
            i4 += androidx.datastore.preferences.protobuf.C0077m.d0((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            long longValue3 = ((java.lang.Long) list.get(i3)).longValue();
            c0077m.x0((longValue3 >> 63) ^ (longValue3 << 1));
            i3++;
        }
    }

    public static void R(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f2.getClass();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((androidx.datastore.preferences.protobuf.C0077m) f2.f2229a).r0(i2, (java.lang.String) list.get(i3));
        }
    }

    public static void S(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0077m.u0(i2, ((java.lang.Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += androidx.datastore.preferences.protobuf.C0077m.b0(((java.lang.Integer) list.get(i5)).intValue());
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.v0(((java.lang.Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    public static void T(int i2, java.util.List list, androidx.datastore.preferences.protobuf.F f2, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        androidx.datastore.preferences.protobuf.C0077m c0077m = (androidx.datastore.preferences.protobuf.C0077m) f2.f2229a;
        int i3 = 0;
        if (!z2) {
            while (i3 < list.size()) {
                c0077m.w0(i2, ((java.lang.Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        c0077m.t0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Long) list.get(i5)).longValue());
        }
        c0077m.v0(i4);
        while (i3 < list.size()) {
            c0077m.x0(((java.lang.Long) list.get(i3)).longValue());
            i3++;
        }
    }

    public static int a(int i2, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return androidx.datastore.preferences.protobuf.C0077m.J(i2) * size;
    }

    public static int b(java.util.List list) {
        return list.size();
    }

    public static int c(int i2, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int size2 = ((androidx.datastore.preferences.protobuf.C0071g) list.get(i3)).size();
            Z2 += androidx.datastore.preferences.protobuf.C0077m.b0(size2) + size2;
        }
        return Z2;
    }

    public static int d(int i2, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C0077m.Z(i2) * size) + e(list);
    }

    public static int e(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int f(int i2, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return androidx.datastore.preferences.protobuf.C0077m.N(i2) * size;
    }

    public static int g(java.util.List list) {
        return list.size() * 4;
    }

    public static int h(int i2, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return androidx.datastore.preferences.protobuf.C0077m.O(i2) * size;
    }

    public static int i(java.util.List list) {
        return list.size() * 8;
    }

    public static int j(int i2, java.util.List list, androidx.datastore.preferences.protobuf.W w2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += androidx.datastore.preferences.protobuf.C0077m.Q(i2, (androidx.datastore.preferences.protobuf.AbstractC0065a) list.get(i4), w2);
        }
        return i3;
    }

    public static int k(int i2, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C0077m.Z(i2) * size) + l(list);
    }

    public static int l(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int m(int i2, java.util.List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C0077m.Z(i2) * list.size()) + n(list);
    }

    public static int n(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static int o(int i2, java.lang.Object obj, androidx.datastore.preferences.protobuf.W w2) {
        int Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i2);
        int a2 = ((androidx.datastore.preferences.protobuf.AbstractC0065a) obj).a(w2);
        return androidx.datastore.preferences.protobuf.C0077m.b0(a2) + a2 + Z2;
    }

    public static int p(int i2, java.util.List list, androidx.datastore.preferences.protobuf.W w2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            int a2 = ((androidx.datastore.preferences.protobuf.AbstractC0065a) list.get(i3)).a(w2);
            Z2 += androidx.datastore.preferences.protobuf.C0077m.b0(a2) + a2;
        }
        return Z2;
    }

    public static int q(int i2, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C0077m.Z(i2) * size) + r(list);
    }

    public static int r(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = ((java.lang.Integer) list.get(i3)).intValue();
            i2 += androidx.datastore.preferences.protobuf.C0077m.b0((intValue >> 31) ^ (intValue << 1));
        }
        return i2;
    }

    public static int s(int i2, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C0077m.Z(i2) * size) + t(list);
    }

    public static int t(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long longValue = ((java.lang.Long) list.get(i3)).longValue();
            i2 += androidx.datastore.preferences.protobuf.C0077m.d0((longValue >> 63) ^ (longValue << 1));
        }
        return i2;
    }

    public static int u(int i2, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Z2 = androidx.datastore.preferences.protobuf.C0077m.Z(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Object obj = list.get(i3);
            if (obj instanceof androidx.datastore.preferences.protobuf.C0071g) {
                int size2 = ((androidx.datastore.preferences.protobuf.C0071g) obj).size();
                Z2 = androidx.datastore.preferences.protobuf.C0077m.b0(size2) + size2 + Z2;
            } else {
                Z2 = androidx.datastore.preferences.protobuf.C0077m.Y((java.lang.String) obj) + Z2;
            }
        }
        return Z2;
    }

    public static int v(int i2, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C0077m.Z(i2) * size) + w(list);
    }

    public static int w(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += androidx.datastore.preferences.protobuf.C0077m.b0(((java.lang.Integer) list.get(i3)).intValue());
        }
        return i2;
    }

    public static int x(int i2, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (androidx.datastore.preferences.protobuf.C0077m.Z(i2) * size) + y(list);
    }

    public static int y(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += androidx.datastore.preferences.protobuf.C0077m.d0(((java.lang.Long) list.get(i3)).longValue());
        }
        return i2;
    }

    public static java.lang.Object z(java.lang.Object obj, int i2, androidx.datastore.preferences.protobuf.InterfaceC0087x interfaceC0087x, java.lang.Object obj2, androidx.datastore.preferences.protobuf.e0 e0Var) {
        return obj2;
    }
}

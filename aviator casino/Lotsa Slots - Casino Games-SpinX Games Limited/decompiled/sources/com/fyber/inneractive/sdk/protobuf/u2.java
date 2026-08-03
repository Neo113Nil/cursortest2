package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f4221a;
    public static final com.fyber.inneractive.sdk.protobuf.o3 b;
    public static final com.fyber.inneractive.sdk.protobuf.o3 c;
    public static final com.fyber.inneractive.sdk.protobuf.o3 d;

    static {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f4221a = cls;
        b = a(false);
        c = a(true);
        d = new com.fyber.inneractive.sdk.protobuf.o3();
    }

    public static java.lang.Object a(int i, java.util.List list, java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.o3 o3Var) {
        return obj;
    }

    public static void a(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.a(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Boolean) list.get(i4)).getClass();
            java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
            i3++;
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.a(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void b(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                com.fyber.inneractive.sdk.protobuf.b0 b0Var = c0Var.f4181a;
                double doubleValue = ((java.lang.Double) list.get(i2)).doubleValue();
                b0Var.getClass();
                b0Var.a(i, java.lang.Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Double) list.get(i4)).getClass();
            java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
            i3 += 8;
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            com.fyber.inneractive.sdk.protobuf.b0 b0Var2 = c0Var.f4181a;
            double doubleValue2 = ((java.lang.Double) list.get(i2)).doubleValue();
            b0Var2.getClass();
            b0Var2.c(java.lang.Double.doubleToRawLongBits(doubleValue2));
            i2++;
        }
    }

    public static void c(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.b(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += com.fyber.inneractive.sdk.protobuf.b0.a(((java.lang.Integer) list.get(i4)).intValue());
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.f(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void d(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.a(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
            i3 += 4;
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.e(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void e(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.a(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
            i3 += 8;
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.c(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void f(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                com.fyber.inneractive.sdk.protobuf.b0 b0Var = c0Var.f4181a;
                float floatValue = ((java.lang.Float) list.get(i2)).floatValue();
                b0Var.getClass();
                b0Var.a(i, java.lang.Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Float) list.get(i4)).getClass();
            java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
            i3 += 4;
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            com.fyber.inneractive.sdk.protobuf.b0 b0Var2 = c0Var.f4181a;
            float floatValue2 = ((java.lang.Float) list.get(i2)).floatValue();
            b0Var2.getClass();
            b0Var2.e(java.lang.Float.floatToRawIntBits(floatValue2));
            i2++;
        }
    }

    public static void g(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.b(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue = ((java.lang.Integer) list.get(i4)).intValue();
            i3 += intValue >= 0 ? com.fyber.inneractive.sdk.protobuf.b0.c(intValue) : 10;
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.f(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void h(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.b(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += com.fyber.inneractive.sdk.protobuf.b0.a(((java.lang.Long) list.get(i4)).longValue());
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.d(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void i(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.a(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
            i3 += 4;
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.e(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void j(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.a(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
            i3 += 8;
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.c(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void k(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.d(i, com.fyber.inneractive.sdk.protobuf.b0.d(((java.lang.Integer) list.get(i2)).intValue()));
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += com.fyber.inneractive.sdk.protobuf.b0.c(com.fyber.inneractive.sdk.protobuf.b0.d(((java.lang.Integer) list.get(i4)).intValue()));
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.g(com.fyber.inneractive.sdk.protobuf.b0.d(((java.lang.Integer) list.get(i2)).intValue()));
            i2++;
        }
    }

    public static void l(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.b(i, com.fyber.inneractive.sdk.protobuf.b0.b(((java.lang.Long) list.get(i2)).longValue()));
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += com.fyber.inneractive.sdk.protobuf.b0.a(com.fyber.inneractive.sdk.protobuf.b0.b(((java.lang.Long) list.get(i4)).longValue()));
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.d(com.fyber.inneractive.sdk.protobuf.b0.b(((java.lang.Long) list.get(i2)).longValue()));
            i2++;
        }
    }

    public static void m(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.d(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += com.fyber.inneractive.sdk.protobuf.b0.c(((java.lang.Integer) list.get(i4)).intValue());
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.g(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void n(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            c0Var.getClass();
            while (i2 < list.size()) {
                c0Var.f4181a.b(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c0Var.f4181a.c(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += com.fyber.inneractive.sdk.protobuf.b0.a(((java.lang.Long) list.get(i4)).longValue());
        }
        c0Var.f4181a.g(i3);
        while (i2 < list.size()) {
            c0Var.f4181a.d(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int d(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.fyber.inneractive.sdk.protobuf.a1) {
            com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) list;
            i = 0;
            while (i2 < size) {
                a1Var.d(i2);
                i += com.fyber.inneractive.sdk.protobuf.b0.c(com.fyber.inneractive.sdk.protobuf.b0.d(a1Var.b[i2]));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.fyber.inneractive.sdk.protobuf.b0.c(com.fyber.inneractive.sdk.protobuf.b0.d(((java.lang.Integer) list.get(i2)).intValue()));
                i2++;
            }
        }
        return i;
    }

    public static int e(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.fyber.inneractive.sdk.protobuf.u1) {
            com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) list;
            i = 0;
            while (i2 < size) {
                u1Var.c(i2);
                i += com.fyber.inneractive.sdk.protobuf.b0.a(com.fyber.inneractive.sdk.protobuf.b0.b(u1Var.b[i2]));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.fyber.inneractive.sdk.protobuf.b0.a(com.fyber.inneractive.sdk.protobuf.b0.b(((java.lang.Long) list.get(i2)).longValue()));
                i2++;
            }
        }
        return i;
    }

    public static int g(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.fyber.inneractive.sdk.protobuf.u1) {
            com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) list;
            i = 0;
            while (i2 < size) {
                u1Var.c(i2);
                i += com.fyber.inneractive.sdk.protobuf.b0.a(u1Var.b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.fyber.inneractive.sdk.protobuf.b0.a(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void a(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0Var.f4181a.a(i, (com.fyber.inneractive.sdk.protobuf.s) list.get(i2));
        }
    }

    public static void b(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        int i2 = 0;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.q1) {
            com.fyber.inneractive.sdk.protobuf.q1 q1Var = (com.fyber.inneractive.sdk.protobuf.q1) list;
            while (i2 < list.size()) {
                java.lang.Object a2 = q1Var.a(i2);
                if (a2 instanceof java.lang.String) {
                    c0Var.f4181a.a((java.lang.String) a2, i);
                } else {
                    c0Var.f4181a.a(i, (com.fyber.inneractive.sdk.protobuf.s) a2);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            c0Var.f4181a.a((java.lang.String) list.get(i2), i);
            i2++;
        }
    }

    public static int c(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.fyber.inneractive.sdk.protobuf.u1) {
            com.fyber.inneractive.sdk.protobuf.u1 u1Var = (com.fyber.inneractive.sdk.protobuf.u1) list;
            i = 0;
            while (i2 < size) {
                u1Var.c(i2);
                i += com.fyber.inneractive.sdk.protobuf.b0.a(u1Var.b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.fyber.inneractive.sdk.protobuf.b0.a(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int f(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.fyber.inneractive.sdk.protobuf.a1) {
            com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) list;
            i = 0;
            while (i2 < size) {
                a1Var.d(i2);
                i += com.fyber.inneractive.sdk.protobuf.b0.c(a1Var.b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.fyber.inneractive.sdk.protobuf.b0.c(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void a(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, com.fyber.inneractive.sdk.protobuf.t2 t2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0Var.a(i, list.get(i2), t2Var);
        }
    }

    public static int a(java.util.List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.fyber.inneractive.sdk.protobuf.a1) {
            com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) list;
            i = 0;
            while (i2 < size) {
                a1Var.d(i2);
                i += com.fyber.inneractive.sdk.protobuf.b0.a(a1Var.b[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += com.fyber.inneractive.sdk.protobuf.b0.a(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void b(int i, java.util.List list, com.fyber.inneractive.sdk.protobuf.c0 c0Var, com.fyber.inneractive.sdk.protobuf.t2 t2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c0Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0Var.f4181a.a(i, (com.fyber.inneractive.sdk.protobuf.d2) list.get(i2), t2Var);
        }
    }

    public static int c(int i, java.util.List list) {
        int a2;
        int a3;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int b2 = com.fyber.inneractive.sdk.protobuf.b0.b(i) * size;
        if (list instanceof com.fyber.inneractive.sdk.protobuf.q1) {
            com.fyber.inneractive.sdk.protobuf.q1 q1Var = (com.fyber.inneractive.sdk.protobuf.q1) list;
            while (i2 < size) {
                java.lang.Object a4 = q1Var.a(i2);
                if (a4 instanceof com.fyber.inneractive.sdk.protobuf.s) {
                    a3 = com.fyber.inneractive.sdk.protobuf.b0.a((com.fyber.inneractive.sdk.protobuf.s) a4);
                } else {
                    a3 = com.fyber.inneractive.sdk.protobuf.b0.a((java.lang.String) a4);
                }
                b2 = a3 + b2;
                i2++;
            }
        } else {
            while (i2 < size) {
                java.lang.Object obj = list.get(i2);
                if (obj instanceof com.fyber.inneractive.sdk.protobuf.s) {
                    a2 = com.fyber.inneractive.sdk.protobuf.b0.a((com.fyber.inneractive.sdk.protobuf.s) obj);
                } else {
                    a2 = com.fyber.inneractive.sdk.protobuf.b0.a((java.lang.String) obj);
                }
                b2 = a2 + b2;
                i2++;
            }
        }
        return b2;
    }

    public static int b(java.util.List list) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof com.fyber.inneractive.sdk.protobuf.a1) {
            com.fyber.inneractive.sdk.protobuf.a1 a1Var = (com.fyber.inneractive.sdk.protobuf.a1) list;
            i = 0;
            while (i4 < size) {
                a1Var.d(i4);
                int i5 = a1Var.b[i4];
                if (i5 >= 0) {
                    i3 = com.fyber.inneractive.sdk.protobuf.b0.c(i5);
                } else {
                    java.util.logging.Logger logger = com.fyber.inneractive.sdk.protobuf.b0.b;
                    i3 = 10;
                }
                i += i3;
                i4++;
            }
        } else {
            i = 0;
            while (i4 < size) {
                int intValue = ((java.lang.Integer) list.get(i4)).intValue();
                if (intValue >= 0) {
                    i2 = com.fyber.inneractive.sdk.protobuf.b0.c(intValue);
                } else {
                    java.util.logging.Logger logger2 = com.fyber.inneractive.sdk.protobuf.b0.b;
                    i2 = 10;
                }
                i += i2;
                i4++;
            }
        }
        return i;
    }

    public static int a(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.fyber.inneractive.sdk.protobuf.b0.b(i) + 4) * size;
    }

    public static com.fyber.inneractive.sdk.protobuf.o3 a(boolean z) {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (com.fyber.inneractive.sdk.protobuf.o3) cls.getConstructor(java.lang.Boolean.TYPE).newInstance(java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable unused2) {
            return null;
        }
    }

    public static boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static java.lang.Object a(int i, java.util.AbstractList abstractList, com.fyber.inneractive.sdk.protobuf.e1 e1Var, java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.o3 o3Var) {
        if (e1Var == null) {
            return obj;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Integer num = (java.lang.Integer) abstractList.get(i3);
            int intValue = num.intValue();
            if (e1Var.a(intValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj = a(i, intValue, obj, o3Var);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj;
    }

    public static int b(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (com.fyber.inneractive.sdk.protobuf.b0.b(i) + 8) * size;
    }

    public static java.lang.Object a(int i, int i2, java.lang.Object obj, com.fyber.inneractive.sdk.protobuf.o3 o3Var) {
        if (obj == null) {
            o3Var.getClass();
            obj = new com.fyber.inneractive.sdk.protobuf.n3();
        }
        o3Var.getClass();
        ((com.fyber.inneractive.sdk.protobuf.n3) obj).a(i << 3, java.lang.Long.valueOf(i2));
        return obj;
    }
}

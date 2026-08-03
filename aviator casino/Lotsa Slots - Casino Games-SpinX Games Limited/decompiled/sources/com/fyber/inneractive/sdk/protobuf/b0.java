package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public abstract class b0 extends com.fyber.inneractive.sdk.protobuf.k {
    public static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(com.fyber.inneractive.sdk.protobuf.b0.class.getName());
    public static final boolean c = com.fyber.inneractive.sdk.protobuf.x3.e;

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.protobuf.c0 f4178a;

    public static int a(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static long b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int c(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int d(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void a(byte b2);

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, com.fyber.inneractive.sdk.protobuf.d2 d2Var);

    public abstract void a(int i, com.fyber.inneractive.sdk.protobuf.d2 d2Var, com.fyber.inneractive.sdk.protobuf.t2 t2Var);

    public abstract void a(int i, com.fyber.inneractive.sdk.protobuf.s sVar);

    public abstract void a(int i, boolean z);

    public abstract void a(java.lang.String str, int i);

    public abstract void b(int i, int i2);

    public abstract void b(int i, long j);

    public abstract void b(int i, com.fyber.inneractive.sdk.protobuf.s sVar);

    public abstract void c(int i, int i2);

    public abstract void c(long j);

    public abstract void d(int i, int i2);

    public abstract void d(long j);

    public abstract void e(int i);

    public abstract void f(int i);

    public abstract void g(int i);

    public static int a(int i) {
        if (i >= 0) {
            return c(i);
        }
        return 10;
    }

    public static int b(int i) {
        return c(i << 3);
    }

    public static int a(java.lang.String str) {
        int length;
        try {
            length = com.fyber.inneractive.sdk.protobuf.d4.a(str);
        } catch (com.fyber.inneractive.sdk.protobuf.b4 unused) {
            length = str.getBytes(com.fyber.inneractive.sdk.protobuf.l1.f4203a).length;
        }
        return c(length) + length;
    }

    public static int a(com.fyber.inneractive.sdk.protobuf.s sVar) {
        int size = sVar.size();
        return c(size) + size;
    }

    public final void a(java.lang.String str, com.fyber.inneractive.sdk.protobuf.b4 b4Var) {
        b.log(java.util.logging.Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) b4Var);
        byte[] bytes = str.getBytes(com.fyber.inneractive.sdk.protobuf.l1.f4203a);
        try {
            g(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (com.fyber.inneractive.sdk.protobuf.z e) {
            throw e;
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new com.fyber.inneractive.sdk.protobuf.z(e2);
        }
    }
}

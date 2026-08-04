package com.google.crypto.tink.shaded.protobuf;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f11808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f11809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n0 f11810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f11811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f11812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f11813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f11814g;

    static {
        Unsafe unsafeM = m();
        f11808a = unsafeM;
        f11809b = AbstractC0823c.f11759a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        n0 m0Var = null;
        if (unsafeM != null) {
            if (!AbstractC0823c.a()) {
                m0Var = new m0(unsafeM);
            } else if (zF) {
                m0Var = new l0(unsafeM, 1);
            } else if (zF2) {
                m0Var = new l0(unsafeM, 0);
            }
        }
        f11810c = m0Var;
        f11811d = m0Var == null ? false : m0Var.s();
        f11812e = m0Var == null ? false : m0Var.r();
        f11813f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && m0Var != null) {
            m0Var.j(fieldE);
        }
        f11814g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(o0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f11808a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int c(Class cls) {
        if (f11812e) {
            return f11810c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f11812e) {
            f11810c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0823c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField(SentryLockReason.JsonKeys.ADDRESS);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean f(Class cls) {
        if (!AbstractC0823c.a()) {
            return false;
        }
        try {
            Class cls2 = f11809b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j) {
        return f11810c.d(f11813f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((f11810c.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((f11810c.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static int j(AbstractC0842w abstractC0842w, long j) {
        return f11810c.g(j, abstractC0842w);
    }

    public static long k(AbstractC0842w abstractC0842w, long j) {
        return f11810c.h(j, abstractC0842w);
    }

    public static Object l(AbstractC0842w abstractC0842w, long j) {
        return f11810c.i(j, abstractC0842w);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new k0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(Object obj, long j, boolean z4) {
        f11810c.k(obj, j, z4);
    }

    public static void o(byte[] bArr, long j, byte b7) {
        f11810c.l(bArr, f11813f + j, b7);
    }

    public static void p(Object obj, long j, byte b7) {
        long j3 = (-4) & j;
        int iG = f11810c.g(j3, obj);
        int i7 = ((~((int) j)) & 3) << 3;
        t(j3, obj, ((255 & b7) << i7) | (iG & (~(255 << i7))));
    }

    public static void q(Object obj, long j, byte b7) {
        long j3 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        t(j3, obj, ((255 & b7) << i7) | (f11810c.g(j3, obj) & (~(255 << i7))));
    }

    public static void r(Object obj, long j, double d7) {
        f11810c.m(obj, j, d7);
    }

    public static void s(Object obj, long j, float f7) {
        f11810c.n(obj, j, f7);
    }

    public static void t(long j, Object obj, int i7) {
        f11810c.o(j, obj, i7);
    }

    public static void u(Object obj, long j, long j3) {
        f11810c.p(obj, j, j3);
    }

    public static void v(Object obj, long j, Object obj2) {
        f11810c.q(obj, j, obj2);
    }
}

package com.google.crypto.tink.shaded.protobuf;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f11808a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f11809b;

    /* renamed from: c, reason: collision with root package name */
    public static final n0 f11810c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11811d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f11812e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f11813f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f11814g;

    static {
        Unsafe m7 = m();
        f11808a = m7;
        f11809b = AbstractC0867c.f11759a;
        boolean f7 = f(Long.TYPE);
        boolean f8 = f(Integer.TYPE);
        n0 n0Var = null;
        if (m7 != null) {
            if (!AbstractC0867c.a()) {
                n0Var = new m0(m7);
            } else if (f7) {
                n0Var = new l0(m7, 1);
            } else if (f8) {
                n0Var = new l0(m7, 0);
            }
        }
        f11810c = n0Var;
        f11811d = n0Var == null ? false : n0Var.s();
        f11812e = n0Var == null ? false : n0Var.r();
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
        Field e7 = e();
        if (e7 != null && n0Var != null) {
            n0Var.j(e7);
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
        Field field;
        Field field2;
        if (AbstractC0867c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField(SentryLockReason.JsonKeys.ADDRESS);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean f(Class cls) {
        if (!AbstractC0867c.a()) {
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

    public static int j(AbstractC0886w abstractC0886w, long j) {
        return f11810c.g(j, abstractC0886w);
    }

    public static long k(AbstractC0886w abstractC0886w, long j) {
        return f11810c.h(j, abstractC0886w);
    }

    public static Object l(AbstractC0886w abstractC0886w, long j) {
        return f11810c.i(j, abstractC0886w);
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
        int g3 = f11810c.g(j3, obj);
        int i7 = ((~((int) j)) & 3) << 3;
        t(j3, obj, ((255 & b7) << i7) | (g3 & (~(255 << i7))));
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

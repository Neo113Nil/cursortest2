package com.google.protobuf;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class K0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f12115a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f12116b;

    /* renamed from: c, reason: collision with root package name */
    public static final J0 f12117c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f12118d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f12119e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f12120f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f12121g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f12122h;

    static {
        Unsafe j = j();
        f12115a = j;
        f12116b = AbstractC0895c.f12177a;
        boolean f7 = f(Long.TYPE);
        boolean f8 = f(Integer.TYPE);
        J0 j02 = null;
        if (j != null) {
            if (!AbstractC0895c.a()) {
                j02 = new I0(j);
            } else if (f7) {
                j02 = new H0(j, 1);
            } else if (f8) {
                j02 = new H0(j, 0);
            }
        }
        f12117c = j02;
        f12118d = j02 == null ? false : j02.u();
        f12119e = j02 == null ? false : j02.t();
        f12120f = c(byte[].class);
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
        f12121g = (e7 == null || j02 == null) ? -1L : j02.l(e7);
        f12122h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(K0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f12115a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int c(Class cls) {
        if (f12119e) {
            return f12117c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f12119e) {
            f12117c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (AbstractC0895c.a()) {
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
        if (!AbstractC0895c.a()) {
            return false;
        }
        try {
            Class cls2 = f12116b;
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
        return f12117c.f(f12120f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((f12117c.i((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((f12117c.i((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new G0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j, boolean z4) {
        f12117c.m(obj, j, z4);
    }

    public static void l(byte[] bArr, long j, byte b7) {
        f12117c.n(bArr, f12120f + j, b7);
    }

    public static void m(Object obj, long j, byte b7) {
        long j3 = (-4) & j;
        int i7 = f12117c.i(j3, obj);
        int i8 = ((~((int) j)) & 3) << 3;
        q(j3, obj, ((255 & b7) << i8) | (i7 & (~(255 << i8))));
    }

    public static void n(Object obj, long j, byte b7) {
        long j3 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        q(j3, obj, ((255 & b7) << i7) | (f12117c.i(j3, obj) & (~(255 << i7))));
    }

    public static void o(Object obj, long j, double d7) {
        f12117c.o(obj, j, d7);
    }

    public static void p(Object obj, long j, float f7) {
        f12117c.p(obj, j, f7);
    }

    public static void q(long j, Object obj, int i7) {
        f12117c.q(j, obj, i7);
    }

    public static void r(Object obj, long j, long j3) {
        f12117c.r(obj, j, j3);
    }

    public static void s(Object obj, long j, Object obj2) {
        f12117c.s(obj, j, obj2);
    }
}

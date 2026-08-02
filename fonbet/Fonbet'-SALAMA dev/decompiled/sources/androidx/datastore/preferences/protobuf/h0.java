package androidx.datastore.preferences.protobuf;

import io.sentry.SentryLockReason;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f9194a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f9195b;

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f9196c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f9197d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f9198e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f9199f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f9200g;

    static {
        Unsafe i7 = i();
        f9194a = i7;
        f9195b = AbstractC0679c.f9172a;
        boolean h6 = h(Long.TYPE);
        boolean h7 = h(Integer.TYPE);
        g0 g0Var = null;
        if (i7 != null) {
            if (!AbstractC0679c.a()) {
                g0Var = new f0(i7);
            } else if (h6) {
                g0Var = new e0(i7, 1);
            } else if (h7) {
                g0Var = new e0(i7, 0);
            }
        }
        f9196c = g0Var;
        f9197d = g0Var == null ? false : g0Var.r();
        f9198e = g0Var == null ? false : g0Var.q();
        f9199f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g3 = g();
        if (g3 != null && g0Var != null) {
            g0Var.i(g3);
        }
        f9200g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(h0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, Object obj) {
        return ((byte) ((f9196c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j, Object obj) {
        return ((byte) ((f9196c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f9194a.allocateInstance(cls);
        } catch (InstantiationException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static int e(Class cls) {
        if (f9198e) {
            return f9196c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f9198e) {
            f9196c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0679c.a()) {
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

    public static boolean h(Class cls) {
        if (!AbstractC0679c.a()) {
            return false;
        }
        try {
            Class cls2 = f9195b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new d0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b7) {
        f9196c.k(bArr, f9199f + j, b7);
    }

    public static void k(Object obj, long j, byte b7) {
        long j3 = (-4) & j;
        int f7 = f9196c.f(j3, obj);
        int i7 = ((~((int) j)) & 3) << 3;
        m(j3, obj, ((255 & b7) << i7) | (f7 & (~(255 << i7))));
    }

    public static void l(Object obj, long j, byte b7) {
        long j3 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        m(j3, obj, ((255 & b7) << i7) | (f9196c.f(j3, obj) & (~(255 << i7))));
    }

    public static void m(long j, Object obj, int i7) {
        f9196c.n(j, obj, i7);
    }

    public static void n(Object obj, long j, long j3) {
        f9196c.o(obj, j, j3);
    }

    public static void o(Object obj, long j, Object obj2) {
        f9196c.p(obj, j, obj2);
    }
}

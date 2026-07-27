package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f4456a;

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f4457b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f4458c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4459d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f4460e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f4461f;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0;
        int i2 = 1;
        Unsafe i3 = i();
        f4456a = i3;
        Class cls = AbstractC0208c.f4420a;
        boolean h3 = h(Long.TYPE);
        boolean h6 = h(Integer.TYPE);
        h0 h0Var = null;
        if (i3 != null) {
            if (!AbstractC0208c.a()) {
                h0Var = new g0(i3);
            } else if (h3) {
                h0Var = new f0(i3, i2);
            } else if (h6) {
                h0Var = new f0(i3, objArr == true ? 1 : 0);
            }
        }
        f4457b = h0Var;
        f4458c = h0Var == null ? false : h0Var.r();
        f4459d = h0Var == null ? false : h0Var.q();
        f4460e = e(byte[].class);
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
        Field g6 = g();
        if (g6 != null && h0Var != null) {
            h0Var.i(g6);
        }
        f4461f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(i0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j2, Object obj) {
        return ((byte) ((f4457b.f((-4) & j2, obj) >>> ((int) (((~j2) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean c(long j2, Object obj) {
        return ((byte) ((f4457b.f((-4) & j2, obj) >>> ((int) ((j2 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f4456a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int e(Class cls) {
        if (f4459d) {
            return f4457b.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f4459d) {
            f4457b.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0208c.a()) {
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
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean h(Class cls) {
        if (!AbstractC0208c.a()) {
            return false;
        }
        try {
            Class cls2 = AbstractC0208c.f4420a;
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
            return (Unsafe) AccessController.doPrivileged(new e0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j2, byte b6) {
        f4457b.k(bArr, f4460e + j2, b6);
    }

    public static void k(Object obj, long j2, byte b6) {
        long j6 = (-4) & j2;
        int f3 = f4457b.f(j6, obj);
        int i2 = ((~((int) j2)) & 3) << 3;
        m(obj, j6, ((255 & b6) << i2) | (f3 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    public static void l(Object obj, long j2, byte b6) {
        long j6 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        m(obj, j6, ((255 & b6) << i2) | (f4457b.f(j6, obj) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    public static void m(Object obj, long j2, int i2) {
        f4457b.n(obj, j2, i2);
    }

    public static void n(Object obj, long j2, long j6) {
        f4457b.o(obj, j2, j6);
    }

    public static void o(long j2, Object obj, Object obj2) {
        f4457b.p(j2, obj, obj2);
    }
}

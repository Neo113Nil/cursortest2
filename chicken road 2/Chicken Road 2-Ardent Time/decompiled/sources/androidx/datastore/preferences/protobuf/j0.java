package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final sun.misc.Unsafe f2324a;

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.i0 f2325b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f2326c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2327d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2328e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f2329f;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.lang.Object[] objArr = 0;
        int i2 = 1;
        sun.misc.Unsafe i3 = i();
        f2324a = i3;
        java.lang.Class cls = androidx.datastore.preferences.protobuf.AbstractC0067c.f2287a;
        boolean h2 = h(java.lang.Long.TYPE);
        boolean h3 = h(java.lang.Integer.TYPE);
        androidx.datastore.preferences.protobuf.i0 i0Var = null;
        if (i3 != null) {
            if (!androidx.datastore.preferences.protobuf.AbstractC0067c.a()) {
                i0Var = new androidx.datastore.preferences.protobuf.h0(i3);
            } else if (h2) {
                i0Var = new androidx.datastore.preferences.protobuf.g0(i3, i2);
            } else if (h3) {
                i0Var = new androidx.datastore.preferences.protobuf.g0(i3, objArr == true ? 1 : 0);
            }
        }
        f2325b = i0Var;
        f2326c = i0Var == null ? false : i0Var.r();
        f2327d = i0Var == null ? false : i0Var.q();
        f2328e = e(byte[].class);
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
        e(java.lang.Object[].class);
        f(java.lang.Object[].class);
        java.lang.reflect.Field g2 = g();
        if (g2 != null && i0Var != null) {
            i0Var.i(g2);
        }
        f2329f = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN;
    }

    public static void a(java.lang.Throwable th) {
        java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.j0.class.getName()).log(java.util.logging.Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j2, java.lang.Object obj) {
        return ((byte) ((f2325b.f((-4) & j2, obj) >>> ((int) (((~j2) & 3) << 3))) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean c(long j2, java.lang.Object obj) {
        return ((byte) ((f2325b.f((-4) & j2, obj) >>> ((int) ((j2 & 3) << 3))) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static java.lang.Object d(java.lang.Class cls) {
        try {
            return f2324a.allocateInstance(cls);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.IllegalStateException(e2);
        }
    }

    public static int e(java.lang.Class cls) {
        if (f2327d) {
            return f2325b.a(cls);
        }
        return -1;
    }

    public static void f(java.lang.Class cls) {
        if (f2327d) {
            f2325b.b(cls);
        }
    }

    public static java.lang.reflect.Field g() {
        java.lang.reflect.Field field;
        java.lang.reflect.Field field2;
        if (androidx.datastore.preferences.protobuf.AbstractC0067c.a()) {
            try {
                field2 = java.nio.Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (java.lang.Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = java.nio.Buffer.class.getDeclaredField("address");
        } catch (java.lang.Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != java.lang.Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean h(java.lang.Class cls) {
        if (!androidx.datastore.preferences.protobuf.AbstractC0067c.a()) {
            return false;
        }
        try {
            java.lang.Class cls2 = androidx.datastore.preferences.protobuf.AbstractC0067c.f2287a;
            java.lang.Class cls3 = java.lang.Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, java.lang.Long.TYPE, cls3);
            java.lang.Class cls4 = java.lang.Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, java.lang.Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static sun.misc.Unsafe i() {
        try {
            return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new androidx.datastore.preferences.protobuf.f0());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j2, byte b2) {
        f2325b.k(bArr, f2328e + j2, b2);
    }

    public static void k(java.lang.Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int f2 = f2325b.f(j3, obj);
        int i2 = ((~((int) j2)) & 3) << 3;
        m(obj, j3, ((255 & b2) << i2) | (f2 & (~(kotlin.KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    public static void l(java.lang.Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        m(obj, j3, ((255 & b2) << i2) | (f2325b.f(j3, obj) & (~(kotlin.KotlinVersion.MAX_COMPONENT_VALUE << i2))));
    }

    public static void m(java.lang.Object obj, long j2, int i2) {
        f2325b.n(obj, j2, i2);
    }

    public static void n(java.lang.Object obj, long j2, long j3) {
        f2325b.o(obj, j2, j3);
    }

    public static void o(java.lang.Object obj, long j2, java.lang.Object obj2) {
        f2325b.p(obj, j2, obj2);
    }
}

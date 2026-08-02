package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f42600a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f42601b;

    /* renamed from: c, reason: collision with root package name */
    private static final e f42602c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f42603d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f42604e;

    /* renamed from: f, reason: collision with root package name */
    static final long f42605f;

    /* renamed from: g, reason: collision with root package name */
    static final boolean f42606g;

    final class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return a();
        }
    }

    /* loaded from: classes8.dex */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final boolean c(Object obj, long j11) {
            return p0.f42606g ? p0.e(j11, obj) : p0.f(j11, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final double d(Object obj, long j11) {
            return Double.longBitsToDouble(g(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final float e(Object obj, long j11) {
            return Float.intBitsToFloat(f(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void j(Object obj, long j11, boolean z11) {
            if (p0.f42606g) {
                p0.g(obj, j11, z11);
            } else {
                p0.h(obj, j11, z11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void k(Object obj, long j11, byte b11) {
            if (p0.f42606g) {
                p0.y(obj, j11, b11);
            } else {
                p0.z(obj, j11, b11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void l(Object obj, long j11, double d11) {
            o(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void m(Object obj, long j11, float f7) {
            n(obj, j11, Float.floatToIntBits(f7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final boolean r() {
            return false;
        }
    }

    private static final class c extends e {
        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final boolean c(Object obj, long j11) {
            return p0.f42606g ? p0.e(j11, obj) : p0.f(j11, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final double d(Object obj, long j11) {
            return Double.longBitsToDouble(g(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final float e(Object obj, long j11) {
            return Float.intBitsToFloat(f(obj, j11));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void j(Object obj, long j11, boolean z11) {
            if (p0.f42606g) {
                p0.g(obj, j11, z11);
            } else {
                p0.h(obj, j11, z11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void k(Object obj, long j11, byte b11) {
            if (p0.f42606g) {
                p0.y(obj, j11, b11);
            } else {
                p0.z(obj, j11, b11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void l(Object obj, long j11, double d11) {
            o(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void m(Object obj, long j11, float f7) {
            n(obj, j11, Float.floatToIntBits(f7));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final boolean r() {
            return false;
        }
    }

    /* loaded from: classes8.dex */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final boolean c(Object obj, long j11) {
            return this.f42607a.getBoolean(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final double d(Object obj, long j11) {
            return this.f42607a.getDouble(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final float e(Object obj, long j11) {
            return this.f42607a.getFloat(obj, j11);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void j(Object obj, long j11, boolean z11) {
            this.f42607a.putBoolean(obj, j11, z11);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void k(Object obj, long j11, byte b11) {
            this.f42607a.putByte(obj, j11, b11);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void l(Object obj, long j11, double d11) {
            this.f42607a.putDouble(obj, j11, d11);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final void m(Object obj, long j11, float f7) {
            this.f42607a.putFloat(obj, j11, f7);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final boolean q() {
            if (!super.q()) {
                return false;
            }
            try {
                Class<?> cls = this.f42607a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th2) {
                p0.a(th2);
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public final boolean r() {
            Unsafe unsafe = this.f42607a;
            if (unsafe != null) {
                try {
                    Class<?> cls = unsafe.getClass();
                    cls.getMethod("objectFieldOffset", Field.class);
                    Class cls2 = Long.TYPE;
                    cls.getMethod("getLong", Object.class, cls2);
                    if (p0.l() != null) {
                        try {
                            Class<?> cls3 = this.f42607a.getClass();
                            cls3.getMethod("getByte", cls2);
                            cls3.getMethod("putByte", cls2, Byte.TYPE);
                            cls3.getMethod("getInt", cls2);
                            cls3.getMethod("putInt", cls2, Integer.TYPE);
                            cls3.getMethod("getLong", cls2);
                            cls3.getMethod("putLong", cls2, cls2);
                            cls3.getMethod("copyMemory", cls2, cls2, cls2);
                            cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                            return true;
                        } catch (Throwable th2) {
                            p0.a(th2);
                            return false;
                        }
                    }
                } catch (Throwable th3) {
                    p0.a(th3);
                }
            }
            return false;
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f42607a;

        e(Unsafe unsafe) {
            this.f42607a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f42607a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f42607a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j11);

        public abstract double d(Object obj, long j11);

        public abstract float e(Object obj, long j11);

        public final int f(Object obj, long j11) {
            return this.f42607a.getInt(obj, j11);
        }

        public final long g(Object obj, long j11) {
            return this.f42607a.getLong(obj, j11);
        }

        public final Object h(Object obj, long j11) {
            return this.f42607a.getObject(obj, j11);
        }

        public final long i(Field field) {
            return this.f42607a.objectFieldOffset(field);
        }

        public abstract void j(Object obj, long j11, boolean z11);

        public abstract void k(Object obj, long j11, byte b11);

        public abstract void l(Object obj, long j11, double d11);

        public abstract void m(Object obj, long j11, float f7);

        public final void n(Object obj, long j11, int i11) {
            this.f42607a.putInt(obj, j11, i11);
        }

        public final void o(Object obj, long j11, long j12) {
            this.f42607a.putLong(obj, j11, j12);
        }

        public final void p(Object obj, long j11, Object obj2) {
            this.f42607a.putObject(obj, j11, obj2);
        }

        public boolean q() {
            Unsafe unsafe = this.f42607a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                p0.a(th2);
                return false;
            }
        }

        public abstract boolean r();
    }

    static {
        Unsafe t2 = t();
        f42600a = t2;
        f42601b = C5358d.a();
        boolean m11 = m(Long.TYPE);
        boolean m12 = m(Integer.TYPE);
        e eVar = null;
        if (t2 != null) {
            if (!C5358d.b()) {
                eVar = new d(t2);
            } else if (m11) {
                eVar = new c(t2);
            } else if (m12) {
                eVar = new b(t2);
            }
        }
        f42602c = eVar;
        f42603d = eVar == null ? false : eVar.r();
        f42604e = eVar == null ? false : eVar.q();
        f42605f = j(byte[].class);
        j(boolean[].class);
        k(boolean[].class);
        j(int[].class);
        k(int[].class);
        j(long[].class);
        k(long[].class);
        j(float[].class);
        k(float[].class);
        j(double[].class);
        k(double[].class);
        j(Object[].class);
        k(Object[].class);
        Field l11 = l();
        if (l11 != null && eVar != null) {
            eVar.i(l11);
        }
        f42606g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private p0() {
    }

    static void A(Object obj, long j11, double d11) {
        f42602c.l(obj, j11, d11);
    }

    static void B(Object obj, long j11, float f7) {
        f42602c.m(obj, j11, f7);
    }

    static void C(Object obj, long j11, int i11) {
        f42602c.n(obj, j11, i11);
    }

    static void D(Object obj, long j11, long j12) {
        f42602c.o(obj, j11, j12);
    }

    static void E(Object obj, long j11, Object obj2) {
        f42602c.p(obj, j11, obj2);
    }

    static void a(Throwable th2) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static boolean e(long j11, Object obj) {
        return ((byte) ((f42602c.f(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255)) != 0;
    }

    static boolean f(long j11, Object obj) {
        return ((byte) ((f42602c.f(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255)) != 0;
    }

    static void g(Object obj, long j11, boolean z11) {
        y(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    static void h(Object obj, long j11, boolean z11) {
        z(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    static <T> T i(Class<T> cls) {
        try {
            return (T) f42600a.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static int j(Class<?> cls) {
        if (f42604e) {
            return f42602c.a(cls);
        }
        return -1;
    }

    private static void k(Class cls) {
        if (f42604e) {
            f42602c.b(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field l() {
        Field field;
        Field field2;
        if (C5358d.b()) {
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
            field = Buffer.class.getDeclaredField(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    static boolean m(Class<?> cls) {
        if (!C5358d.b()) {
            return false;
        }
        try {
            Class<?> cls2 = f42601b;
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

    static boolean n(Object obj, long j11) {
        return f42602c.c(obj, j11);
    }

    static double o(Object obj, long j11) {
        return f42602c.d(obj, j11);
    }

    static float p(Object obj, long j11) {
        return f42602c.e(obj, j11);
    }

    static int q(Object obj, long j11) {
        return f42602c.f(obj, j11);
    }

    static long r(Object obj, long j11) {
        return f42602c.g(obj, j11);
    }

    static Object s(Object obj, long j11) {
        return f42602c.h(obj, j11);
    }

    static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean u() {
        return f42604e;
    }

    static boolean v() {
        return f42603d;
    }

    static void w(Object obj, long j11, boolean z11) {
        f42602c.j(obj, j11, z11);
    }

    static void x(byte[] bArr, long j11, byte b11) {
        f42602c.k(bArr, f42605f + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int f7 = f42602c.f(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        C(obj, j12, ((255 & b11) << i11) | (f7 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        C(obj, j12, ((255 & b11) << i11) | (f42602c.f(obj, j12) & (~(255 << i11))));
    }
}

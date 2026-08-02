package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tq1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f7568a;

    /* JADX INFO: renamed from: b */
    public static final Class f7569b;

    /* JADX INFO: renamed from: c */
    public static final sq1 f7570c;

    /* JADX INFO: renamed from: d */
    public static final boolean f7571d;

    /* JADX INFO: renamed from: e */
    public static final long f7572e;

    /* JADX INFO: renamed from: f */
    public static final boolean f7573f;

    static {
        boolean z;
        sq1 sq1Var;
        Unsafe unsafeM4836l = m4836l();
        f7568a = unsafeM4836l;
        int i = fo1.f2465a;
        f7569b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM4837m = m4837m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM4837m2 = m4837m(cls2);
        sq1 qq1Var = null;
        if (unsafeM4836l != null) {
            if (zM4837m) {
                qq1Var = new rq1(unsafeM4836l);
            } else if (zM4837m2) {
                qq1Var = new qq1(unsafeM4836l);
            }
        }
        f7570c = qq1Var;
        if (qq1Var != null) {
            try {
                Class<?> cls3 = ((Unsafe) qq1Var.f7192j).getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                m4825a();
            } catch (Throwable th) {
                Logger.getLogger(tq1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        sq1 sq1Var2 = f7570c;
        if (sq1Var2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = ((Unsafe) sq1Var2.f7192j).getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(tq1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = false;
            }
        }
        f7571d = z;
        f7572e = m4840p(byte[].class);
        m4840p(boolean[].class);
        m4841q(boolean[].class);
        m4840p(int[].class);
        m4841q(int[].class);
        m4840p(long[].class);
        m4841q(long[].class);
        m4840p(float[].class);
        m4841q(float[].class);
        m4840p(double[].class);
        m4841q(double[].class);
        m4840p(Object[].class);
        m4841q(Object[].class);
        Field fieldM4825a = m4825a();
        if (fieldM4825a != null && (sq1Var = f7570c) != null) {
            ((Unsafe) sq1Var.f7192j).objectFieldOffset(fieldM4825a);
        }
        f7573f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static Field m4825a() {
        Field declaredField;
        Field declaredField2;
        int i = fo1.f2465a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    /* JADX INFO: renamed from: b */
    public static void m4826b(Object obj, long j, byte b) {
        Unsafe unsafe = (Unsafe) f7570c.f7192j;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: renamed from: c */
    public static void m4827c(Object obj, long j, byte b) {
        Unsafe unsafe = (Unsafe) f7570c.f7192j;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: d */
    public static Object m4828d(Class cls) {
        try {
            return f7568a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m4829e(Object obj, long j) {
        return ((Unsafe) f7570c.f7192j).getInt(obj, j);
    }

    /* JADX INFO: renamed from: f */
    public static void m4830f(Object obj, long j, int i) {
        ((Unsafe) f7570c.f7192j).putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: g */
    public static long m4831g(Object obj, long j) {
        return ((Unsafe) f7570c.f7192j).getLong(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public static void m4832h(Object obj, long j, long j2) {
        ((Unsafe) f7570c.f7192j).putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: i */
    public static Object m4833i(Object obj, long j) {
        return ((Unsafe) f7570c.f7192j).getObject(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public static void m4834j(long j, Object obj, Object obj2) {
        ((Unsafe) f7570c.f7192j).putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: k */
    public static void m4835k(byte[] bArr, long j, byte b) {
        f7570c.mo4126o(bArr, f7572e + j, b);
    }

    /* JADX INFO: renamed from: l */
    public static Unsafe m4836l() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new pq1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(tq1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m4837m(Class cls) {
        int i = fo1.f2465a;
        try {
            Class cls2 = f7569b;
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

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m4838n(Object obj, long j) {
        return ((byte) ((((Unsafe) f7570c.f7192j).getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ boolean m4839o(Object obj, long j) {
        return ((byte) ((((Unsafe) f7570c.f7192j).getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: p */
    public static int m4840p(Class cls) {
        if (f7571d) {
            return ((Unsafe) f7570c.f7192j).arrayBaseOffset(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public static void m4841q(Class cls) {
        if (f7571d) {
            ((Unsafe) f7570c.f7192j).arrayIndexScale(cls);
        }
    }
}

package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gg1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f2726a;

    /* JADX INFO: renamed from: b */
    public static final Class f2727b;

    /* JADX INFO: renamed from: c */
    public static final eg1 f2728c;

    /* JADX INFO: renamed from: d */
    public static final boolean f2729d;

    /* JADX INFO: renamed from: e */
    public static final boolean f2730e;

    /* JADX INFO: renamed from: f */
    public static final long f2731f;

    /* JADX INFO: renamed from: g */
    public static final boolean f2732g;

    static {
        Unsafe unsafeM2044i = m2044i();
        f2726a = unsafeM2044i;
        f2727b = AbstractC0085c4.f1084a;
        boolean zM2043h = m2043h(Long.TYPE);
        boolean zM2043h2 = m2043h(Integer.TYPE);
        char c = 1;
        int i = 0;
        eg1 cg1Var = null;
        if (unsafeM2044i != null) {
            if (!AbstractC0085c4.m846a()) {
                cg1Var = new cg1(unsafeM2044i);
            } else if (zM2043h) {
                cg1Var = new ag1(unsafeM2044i, c == true ? 1 : 0);
            } else if (zM2043h2) {
                cg1Var = new ag1(unsafeM2044i, i);
            }
        }
        f2728c = cg1Var;
        f2729d = cg1Var == null ? false : cg1Var.mo212r();
        f2730e = cg1Var == null ? false : cg1Var.mo931q();
        f2731f = m2040e(byte[].class);
        m2040e(boolean[].class);
        m2041f(boolean[].class);
        m2040e(int[].class);
        m2041f(int[].class);
        m2040e(long[].class);
        m2041f(long[].class);
        m2040e(float[].class);
        m2041f(float[].class);
        m2040e(double[].class);
        m2041f(double[].class);
        m2040e(Object[].class);
        m2041f(Object[].class);
        Field fieldM2042g = m2042g();
        if (fieldM2042g != null && cg1Var != null) {
            cg1Var.m1421i(fieldM2042g);
        }
        f2732g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m2036a(Throwable th) {
        Logger.getLogger(gg1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2037b(Object obj, long j) {
        return ((byte) ((f2728c.m1418f(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2038c(Object obj, long j) {
        return ((byte) ((f2728c.m1418f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: d */
    public static Object m2039d(Class cls) {
        try {
            return f2726a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m2040e(Class cls) {
        if (f2730e) {
            return f2728c.m1416a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static void m2041f(Class cls) {
        if (f2730e) {
            f2728c.m1417b(cls);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Field m2042g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0085c4.m846a()) {
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
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2043h(Class cls) {
        if (!AbstractC0085c4.m846a()) {
            return false;
        }
        try {
            Class cls2 = f2727b;
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

    /* JADX INFO: renamed from: i */
    public static Unsafe m2044i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new yf1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m2045j(byte[] bArr, long j, byte b) {
        f2728c.mo209k(bArr, f2731f + j, b);
    }

    /* JADX INFO: renamed from: k */
    public static void m2046k(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM1418f = f2728c.m1418f(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m2048m(obj, j2, ((255 & b) << i) | (iM1418f & (~(255 << i))));
    }

    /* JADX INFO: renamed from: l */
    public static void m2047l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m2048m(obj, j2, ((255 & b) << i) | (f2728c.m1418f(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: m */
    public static void m2048m(Object obj, long j, int i) {
        f2728c.m1422n(obj, j, i);
    }

    /* JADX INFO: renamed from: n */
    public static void m2049n(Object obj, long j, long j2) {
        f2728c.m1423o(obj, j, j2);
    }

    /* JADX INFO: renamed from: o */
    public static void m2050o(long j, Object obj, Object obj2) {
        f2728c.m1424p(j, obj, obj2);
    }
}

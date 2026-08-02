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
public abstract class fg1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f2397a;

    /* JADX INFO: renamed from: b */
    public static final Class f2398b;

    /* JADX INFO: renamed from: c */
    public static final dg1 f2399c;

    /* JADX INFO: renamed from: d */
    public static final boolean f2400d;

    /* JADX INFO: renamed from: e */
    public static final boolean f2401e;

    /* JADX INFO: renamed from: f */
    public static final long f2402f;

    /* JADX INFO: renamed from: g */
    public static final boolean f2403g;

    static {
        Unsafe unsafeM1784j = m1784j();
        f2397a = unsafeM1784j;
        f2398b = AbstractC0049b4.f704a;
        boolean zM1780f = m1780f(Long.TYPE);
        boolean zM1780f2 = m1780f(Integer.TYPE);
        char c = 1;
        int i = 0;
        dg1 bg1Var = null;
        if (unsafeM1784j != null) {
            if (!AbstractC0049b4.m589a()) {
                bg1Var = new bg1(unsafeM1784j);
            } else if (zM1780f) {
                bg1Var = new zf1(unsafeM1784j, c == true ? 1 : 0);
            } else if (zM1780f2) {
                bg1Var = new zf1(unsafeM1784j, i);
            }
        }
        f2399c = bg1Var;
        f2400d = bg1Var == null ? false : bg1Var.mo659s();
        f2401e = bg1Var == null ? false : bg1Var.mo658r();
        f2402f = m1777c(byte[].class);
        m1777c(boolean[].class);
        m1778d(boolean[].class);
        m1777c(int[].class);
        m1778d(int[].class);
        m1777c(long[].class);
        m1778d(long[].class);
        m1777c(float[].class);
        m1778d(float[].class);
        m1777c(double[].class);
        m1778d(double[].class);
        m1777c(Object[].class);
        m1778d(Object[].class);
        Field fieldM1779e = m1779e();
        if (fieldM1779e != null && bg1Var != null) {
            bg1Var.m1208j(fieldM1779e);
        }
        f2403g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m1775a(Throwable th) {
        Logger.getLogger(fg1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static Object m1776b(Class cls) {
        try {
            return f2397a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m1777c(Class cls) {
        if (f2401e) {
            return f2399c.m1203a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m1778d(Class cls) {
        if (f2401e) {
            f2399c.m1204b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m1779e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0049b4.m589a()) {
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

    /* JADX INFO: renamed from: f */
    public static boolean m1780f(Class cls) {
        if (!AbstractC0049b4.m589a()) {
            return false;
        }
        try {
            Class cls2 = f2398b;
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

    /* JADX INFO: renamed from: g */
    public static byte m1781g(byte[] bArr, long j) {
        return f2399c.mo651d(bArr, f2402f + j);
    }

    /* JADX INFO: renamed from: h */
    public static byte m1782h(Object obj, long j) {
        return (byte) ((f2399c.m1205g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m1783i(Object obj, long j) {
        return (byte) ((f2399c.m1205g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m1784j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new xf1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m1785k(byte[] bArr, long j, byte b) {
        f2399c.mo655l(bArr, f2402f + j, b);
    }

    /* JADX INFO: renamed from: l */
    public static void m1786l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM1205g = f2399c.m1205g(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m1788n(obj, j2, ((255 & b) << i) | (iM1205g & (~(255 << i))));
    }

    /* JADX INFO: renamed from: m */
    public static void m1787m(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m1788n(obj, j2, ((255 & b) << i) | (f2399c.m1205g(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: n */
    public static void m1788n(Object obj, long j, int i) {
        f2399c.m1209o(obj, j, i);
    }

    /* JADX INFO: renamed from: o */
    public static void m1789o(Object obj, long j, long j2) {
        f2399c.m1210p(obj, j, j2);
    }

    /* JADX INFO: renamed from: p */
    public static void m1790p(long j, Object obj, Object obj2) {
        f2399c.m1211q(j, obj, obj2);
    }
}

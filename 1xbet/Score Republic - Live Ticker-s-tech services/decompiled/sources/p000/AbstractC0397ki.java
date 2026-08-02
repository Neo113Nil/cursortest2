package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ki */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0397ki {

    /* JADX INFO: renamed from: b */
    public static final Logger f4383b = Logger.getLogger(AbstractC0397ki.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f4384c = fg1.f2401e;

    /* JADX INFO: renamed from: a */
    public b90 f4385a;

    /* JADX INFO: renamed from: a */
    public static int m3031a(int i) {
        if (i >= 0) {
            return m3034d(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: b */
    public static int m3032b(String str) {
        int length;
        try {
            length = wg1.m5331b(str);
        } catch (ug1 unused) {
            length = str.getBytes(fe0.f2381a).length;
        }
        return m3034d(length) + length;
    }

    /* JADX INFO: renamed from: c */
    public static int m3033c(int i) {
        return m3034d(i << 3);
    }

    /* JADX INFO: renamed from: d */
    public static int m3034d(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: e */
    public static int m3035e(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo2056A(long j);

    /* JADX INFO: renamed from: f */
    public final void m3036f(String str, ug1 ug1Var) throws C0287hi {
        f4383b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) ug1Var);
        byte[] bytes = str.getBytes(fe0.f2381a);
        try {
            mo2077y(bytes.length);
            mo2070r(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C0287hi(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo2059g(byte b);

    /* JADX INFO: renamed from: h */
    public abstract void mo2060h(int i, boolean z);

    /* JADX INFO: renamed from: i */
    public abstract void mo2061i(int i, byte[] bArr);

    /* JADX INFO: renamed from: j */
    public abstract void mo2062j(int i, C0762ud c0762ud);

    /* JADX INFO: renamed from: k */
    public abstract void mo2063k(C0762ud c0762ud);

    /* JADX INFO: renamed from: l */
    public abstract void mo2064l(int i, int i2);

    /* JADX INFO: renamed from: m */
    public abstract void mo2065m(int i);

    /* JADX INFO: renamed from: n */
    public abstract void mo2066n(int i, long j);

    /* JADX INFO: renamed from: o */
    public abstract void mo2067o(long j);

    /* JADX INFO: renamed from: p */
    public abstract void mo2068p(int i, int i2);

    /* JADX INFO: renamed from: q */
    public abstract void mo2069q(int i);

    /* JADX INFO: renamed from: r */
    public abstract void mo2070r(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: s */
    public abstract void mo2071s(int i, AbstractC0342j0 abstractC0342j0, r51 r51Var);

    /* JADX INFO: renamed from: t */
    public abstract void mo2072t(AbstractC0342j0 abstractC0342j0);

    /* JADX INFO: renamed from: u */
    public abstract void mo2073u(String str, int i);

    /* JADX INFO: renamed from: v */
    public abstract void mo2074v(String str);

    /* JADX INFO: renamed from: w */
    public abstract void mo2075w(int i, int i2);

    /* JADX INFO: renamed from: x */
    public abstract void mo2076x(int i, int i2);

    /* JADX INFO: renamed from: y */
    public abstract void mo2077y(int i);

    /* JADX INFO: renamed from: z */
    public abstract void mo2078z(int i, long j);
}

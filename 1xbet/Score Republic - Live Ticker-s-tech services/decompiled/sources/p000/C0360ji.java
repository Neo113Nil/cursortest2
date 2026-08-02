package p000;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ji */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0360ji {

    /* JADX INFO: renamed from: f */
    public static final Logger f3932f = Logger.getLogger(C0360ji.class.getName());

    /* JADX INFO: renamed from: g */
    public static final boolean f3933g = gg1.f2730e;

    /* JADX INFO: renamed from: a */
    public nu1 f3934a;

    /* JADX INFO: renamed from: b */
    public final byte[] f3935b;

    /* JADX INFO: renamed from: c */
    public final int f3936c;

    /* JADX INFO: renamed from: d */
    public int f3937d;

    /* JADX INFO: renamed from: e */
    public final mo0 f3938e;

    public C0360ji(mo0 mo0Var, int i) {
        if (i < 0) {
            C0270h1.m2190f("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.f3935b = new byte[iMax];
        this.f3936c = iMax;
        this.f3938e = mo0Var;
    }

    /* JADX INFO: renamed from: f */
    public static int m2870f(int i, C0799vd c0799vd) {
        int iM2872h = m2872h(i);
        int size = c0799vd.size();
        return m2873i(size) + size + iM2872h;
    }

    /* JADX INFO: renamed from: g */
    public static int m2871g(String str) {
        int length;
        try {
            length = xg1.m5661a(str);
        } catch (vg1 unused) {
            length = str.getBytes(ge0.f2710a).length;
        }
        return m2873i(length) + length;
    }

    /* JADX INFO: renamed from: h */
    public static int m2872h(int i) {
        return m2873i(i << 3);
    }

    /* JADX INFO: renamed from: i */
    public static int m2873i(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: j */
    public static int m2874j(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: A */
    public final void m2875A(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM2873i = m2873i(length);
            int i = iM2873i + length;
            int i2 = this.f3936c;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iMo3414d = xg1.f8962a.mo3414d(str, bArr, 0, length);
                m2878D(iMo3414d);
                m2889n(bArr, 0, iMo3414d);
                return;
            }
            if (i > i2 - this.f3937d) {
                m2886k();
            }
            int iM2873i2 = m2873i(str.length());
            int i3 = this.f3937d;
            byte[] bArr2 = this.f3935b;
            try {
                if (iM2873i2 == iM2873i) {
                    int i4 = i3 + iM2873i2;
                    this.f3937d = i4;
                    int iMo3414d2 = xg1.f8962a.mo3414d(str, bArr2, i4, i2 - i4);
                    this.f3937d = i3;
                    m2884d((iMo3414d2 - i3) - iM2873i2);
                    this.f3937d = iMo3414d2;
                } else {
                    int iM5661a = xg1.m5661a(str);
                    m2884d(iM5661a);
                    this.f3937d = xg1.f8962a.mo3414d(str, bArr2, this.f3937d, iM5661a);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new C0287hi(e);
            } catch (vg1 e2) {
                this.f3937d = i3;
                throw e2;
            }
        } catch (vg1 e3) {
            f3932f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(ge0.f2710a);
            try {
                m2878D(bytes.length);
                m2899x(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new C0287hi(e4);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m2876B(int i, int i2) {
        m2878D((i << 3) | i2);
    }

    /* JADX INFO: renamed from: C */
    public final void m2877C(int i, int i2) {
        m2887l(20);
        m2883c(i, 0);
        m2884d(i2);
    }

    /* JADX INFO: renamed from: D */
    public final void m2878D(int i) {
        m2887l(5);
        m2884d(i);
    }

    /* JADX INFO: renamed from: E */
    public final void m2879E(int i, long j) {
        m2887l(20);
        m2883c(i, 0);
        m2885e(j);
    }

    /* JADX INFO: renamed from: F */
    public final void m2880F(long j) {
        m2887l(10);
        m2885e(j);
    }

    /* JADX INFO: renamed from: a */
    public final void m2881a(int i) {
        int i2 = this.f3937d;
        int i3 = i2 + 1;
        this.f3937d = i3;
        byte[] bArr = this.f3935b;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f3937d = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f3937d = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f3937d = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: b */
    public final void m2882b(long j) {
        int i = this.f3937d;
        int i2 = i + 1;
        this.f3937d = i2;
        byte[] bArr = this.f3935b;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f3937d = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f3937d = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f3937d = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f3937d = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f3937d = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f3937d = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f3937d = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: c */
    public final void m2883c(int i, int i2) {
        m2884d((i << 3) | i2);
    }

    /* JADX INFO: renamed from: d */
    public final void m2884d(int i) {
        boolean z = f3933g;
        byte[] bArr = this.f3935b;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f3937d;
                if (i2 == 0) {
                    this.f3937d = i3 + 1;
                    gg1.m2045j(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f3937d = i3 + 1;
                    gg1.m2045j(bArr, i3, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f3937d;
                if (i4 == 0) {
                    this.f3937d = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f3937d = i5 + 1;
                    bArr[i5] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2885e(long j) {
        boolean z = f3933g;
        byte[] bArr = this.f3935b;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f3937d;
                if (j2 == 0) {
                    this.f3937d = i + 1;
                    gg1.m2045j(bArr, i, (byte) j);
                    return;
                } else {
                    this.f3937d = i + 1;
                    gg1.m2045j(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f3937d;
                if (j3 == 0) {
                    this.f3937d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f3937d = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2886k() {
        this.f3938e.write(this.f3935b, 0, this.f3937d);
        this.f3937d = 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m2887l(int i) {
        if (this.f3936c - this.f3937d < i) {
            m2886k();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2888m(byte b) {
        if (this.f3937d == this.f3936c) {
            m2886k();
        }
        int i = this.f3937d;
        this.f3937d = i + 1;
        this.f3935b[i] = b;
    }

    /* JADX INFO: renamed from: n */
    public final void m2889n(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f3937d;
        int i4 = this.f3936c;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f3935b;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f3937d += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f3937d = i4;
        m2886k();
        if (i7 > i4) {
            this.f3938e.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f3937d = i7;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2890o(int i, boolean z) {
        m2887l(11);
        m2883c(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f3937d;
        this.f3937d = i2 + 1;
        this.f3935b[i2] = b;
    }

    /* JADX INFO: renamed from: p */
    public final void m2891p(int i, C0799vd c0799vd) throws IOException {
        m2876B(i, 2);
        m2892q(c0799vd);
    }

    /* JADX INFO: renamed from: q */
    public final void m2892q(C0799vd c0799vd) throws IOException {
        m2878D(c0799vd.size());
        m2899x(c0799vd.f8180k, c0799vd.mo4340f(), c0799vd.size());
    }

    /* JADX INFO: renamed from: r */
    public final void m2893r(int i, int i2) {
        m2887l(14);
        m2883c(i, 5);
        m2881a(i2);
    }

    /* JADX INFO: renamed from: s */
    public final void m2894s(int i) {
        m2887l(4);
        m2881a(i);
    }

    /* JADX INFO: renamed from: t */
    public final void m2895t(int i, long j) {
        m2887l(18);
        m2883c(i, 1);
        m2882b(j);
    }

    /* JADX INFO: renamed from: u */
    public final void m2896u(long j) {
        m2887l(8);
        m2882b(j);
    }

    /* JADX INFO: renamed from: v */
    public final void m2897v(int i, int i2) {
        m2887l(20);
        m2883c(i, 0);
        if (i2 >= 0) {
            m2884d(i2);
        } else {
            m2885e(i2);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2898w(int i) {
        if (i >= 0) {
            m2878D(i);
        } else {
            m2880F(i);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2899x(byte[] bArr, int i, int i2) throws IOException {
        m2889n(bArr, i, i2);
    }

    /* JADX INFO: renamed from: y */
    public final void m2900y(int i, AbstractC0379k0 abstractC0379k0, s51 s51Var) {
        m2876B(i, 2);
        m2878D(abstractC0379k0.mo2975a(s51Var));
        s51Var.mo4481g(abstractC0379k0, this.f3934a);
    }

    /* JADX INFO: renamed from: z */
    public final void m2901z(String str, int i) throws IOException {
        m2876B(i, 2);
        m2875A(str);
    }
}

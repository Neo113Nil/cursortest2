package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: ii */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0323ii extends AbstractC0397ki {

    /* JADX INFO: renamed from: d */
    public final byte[] f3575d;

    /* JADX INFO: renamed from: e */
    public final int f3576e;

    /* JADX INFO: renamed from: f */
    public int f3577f;

    /* JADX INFO: renamed from: g */
    public final OutputStream f3578g;

    public C0323ii(OutputStream outputStream, int i) {
        if (i < 0) {
            C0270h1.m2190f("bufferSize must be >= 0");
            throw null;
        }
        int iMax = Math.max(i, 20);
        this.f3575d = new byte[iMax];
        this.f3576e = iMax;
        if (outputStream != null) {
            this.f3578g = outputStream;
        } else {
            C0270h1.m2192h("out");
            throw null;
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: A */
    public final void mo2056A(long j) {
        m2647H(10);
        m2645F(j);
    }

    /* JADX INFO: renamed from: B */
    public final void m2641B(int i) {
        int i2 = this.f3577f;
        int i3 = i2 + 1;
        this.f3577f = i3;
        byte[] bArr = this.f3575d;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f3577f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.f3577f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f3577f = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: C */
    public final void m2642C(long j) {
        int i = this.f3577f;
        int i2 = i + 1;
        this.f3577f = i2;
        byte[] bArr = this.f3575d;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f3577f = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.f3577f = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.f3577f = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.f3577f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.f3577f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.f3577f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f3577f = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    /* JADX INFO: renamed from: D */
    public final void m2643D(int i, int i2) {
        m2644E((i << 3) | i2);
    }

    /* JADX INFO: renamed from: E */
    public final void m2644E(int i) {
        boolean z = AbstractC0397ki.f4384c;
        byte[] bArr = this.f3575d;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f3577f;
                if (i2 == 0) {
                    this.f3577f = i3 + 1;
                    fg1.m1785k(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f3577f = i3 + 1;
                    fg1.m1785k(bArr, i3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f3577f;
                if (i4 == 0) {
                    this.f3577f = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f3577f = i5 + 1;
                    bArr[i5] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m2645F(long j) {
        boolean z = AbstractC0397ki.f4384c;
        byte[] bArr = this.f3575d;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f3577f;
                if (j2 == 0) {
                    this.f3577f = i + 1;
                    fg1.m1785k(bArr, i, (byte) j);
                    return;
                } else {
                    this.f3577f = i + 1;
                    fg1.m1785k(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i2 = this.f3577f;
                if (j3 == 0) {
                    this.f3577f = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    this.f3577f = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m2646G() {
        this.f3578g.write(this.f3575d, 0, this.f3577f);
        this.f3577f = 0;
    }

    /* JADX INFO: renamed from: H */
    public final void m2647H(int i) {
        if (this.f3576e - this.f3577f < i) {
            m2646G();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m2648I(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f3577f;
        int i4 = this.f3576e;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f3575d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f3577f += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f3577f = i4;
        m2646G();
        if (i7 > i4) {
            this.f3578g.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f3577f = i7;
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: g */
    public final void mo2059g(byte b) {
        if (this.f3577f == this.f3576e) {
            m2646G();
        }
        int i = this.f3577f;
        this.f3577f = i + 1;
        this.f3575d[i] = b;
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: h */
    public final void mo2060h(int i, boolean z) {
        m2647H(11);
        m2643D(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f3577f;
        this.f3577f = i2 + 1;
        this.f3575d[i2] = b;
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: i */
    public final void mo2061i(int i, byte[] bArr) throws IOException {
        mo2077y(i);
        m2648I(bArr, 0, i);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: j */
    public final void mo2062j(int i, C0762ud c0762ud) throws IOException {
        mo2075w(i, 2);
        mo2063k(c0762ud);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: k */
    public final void mo2063k(C0762ud c0762ud) throws IOException {
        mo2077y(c0762ud.size());
        mo2070r(c0762ud.f7800k, c0762ud.mo4065e(), c0762ud.size());
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: l */
    public final void mo2064l(int i, int i2) {
        m2647H(14);
        m2643D(i, 5);
        m2641B(i2);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: m */
    public final void mo2065m(int i) {
        m2647H(4);
        m2641B(i);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: n */
    public final void mo2066n(int i, long j) {
        m2647H(18);
        m2643D(i, 1);
        m2642C(j);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: o */
    public final void mo2067o(long j) {
        m2647H(8);
        m2642C(j);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: p */
    public final void mo2068p(int i, int i2) {
        m2647H(20);
        m2643D(i, 0);
        if (i2 >= 0) {
            m2644E(i2);
        } else {
            m2645F(i2);
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: q */
    public final void mo2069q(int i) {
        if (i >= 0) {
            mo2077y(i);
        } else {
            mo2056A(i);
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: r */
    public final void mo2070r(byte[] bArr, int i, int i2) throws IOException {
        m2648I(bArr, i, i2);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: s */
    public final void mo2071s(int i, AbstractC0342j0 abstractC0342j0, r51 r51Var) {
        mo2075w(i, 2);
        mo2077y(abstractC0342j0.mo2754a(r51Var));
        r51Var.mo4255h(abstractC0342j0, this.f4385a);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: t */
    public final void mo2072t(AbstractC0342j0 abstractC0342j0) {
        mo2077y(((s70) abstractC0342j0).mo2754a(null));
        abstractC0342j0.mo2756c(this);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: u */
    public final void mo2073u(String str, int i) throws IOException {
        mo2075w(i, 2);
        mo2074v(str);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: v */
    public final void mo2074v(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM3034d = AbstractC0397ki.m3034d(length);
            int i = iM3034d + length;
            int i2 = this.f3576e;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iMo4523e = wg1.f8548a.mo4523e(str, bArr, 0, length);
                mo2077y(iMo4523e);
                m2648I(bArr, 0, iMo4523e);
                return;
            }
            if (i > i2 - this.f3577f) {
                m2646G();
            }
            int iM3034d2 = AbstractC0397ki.m3034d(str.length());
            int i3 = this.f3577f;
            byte[] bArr2 = this.f3575d;
            try {
                if (iM3034d2 == iM3034d) {
                    int i4 = i3 + iM3034d2;
                    this.f3577f = i4;
                    int iMo4523e2 = wg1.f8548a.mo4523e(str, bArr2, i4, i2 - i4);
                    this.f3577f = i3;
                    m2644E((iMo4523e2 - i3) - iM3034d2);
                    this.f3577f = iMo4523e2;
                } else {
                    int iM5331b = wg1.m5331b(str);
                    m2644E(iM5331b);
                    this.f3577f = wg1.f8548a.mo4523e(str, bArr2, this.f3577f, iM5331b);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new C0287hi(e);
            } catch (ug1 e2) {
                this.f3577f = i3;
                throw e2;
            }
        } catch (ug1 e3) {
            m3036f(str, e3);
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: w */
    public final void mo2075w(int i, int i2) {
        mo2077y((i << 3) | i2);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: x */
    public final void mo2076x(int i, int i2) {
        m2647H(20);
        m2643D(i, 0);
        m2644E(i2);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: y */
    public final void mo2077y(int i) {
        m2647H(5);
        m2644E(i);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: z */
    public final void mo2078z(int i, long j) {
        m2647H(20);
        m2643D(i, 0);
        m2645F(j);
    }
}

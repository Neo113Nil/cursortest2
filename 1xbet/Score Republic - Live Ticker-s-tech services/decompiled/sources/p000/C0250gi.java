package p000;

/* JADX INFO: renamed from: gi */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0250gi extends AbstractC0397ki {

    /* JADX INFO: renamed from: d */
    public final byte[] f2739d;

    /* JADX INFO: renamed from: e */
    public final int f2740e;

    /* JADX INFO: renamed from: f */
    public int f2741f;

    public C0250gi(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            C0270h1.m2192h("buffer");
            throw null;
        }
        int i3 = i + i2;
        if ((i | i2 | (bArr.length - i3)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.f2739d = bArr;
        this.f2741f = i;
        this.f2740e = i3;
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: A */
    public final void mo2056A(long j) throws C0287hi {
        boolean z = AbstractC0397ki.f4384c;
        byte[] bArr = this.f2739d;
        if (!z || m2057B() < 10) {
            while (true) {
                long j2 = j & (-128);
                int i = this.f2741f;
                if (j2 == 0) {
                    this.f2741f = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        this.f2741f = i + 1;
                        bArr[i] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new C0287hi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2741f), Integer.valueOf(this.f2740e), 1), e);
                    }
                }
                throw new C0287hi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2741f), Integer.valueOf(this.f2740e), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i2 = this.f2741f;
            if (j3 == 0) {
                this.f2741f = i2 + 1;
                fg1.m1785k(bArr, i2, (byte) j);
                return;
            } else {
                this.f2741f = i2 + 1;
                fg1.m1785k(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final int m2057B() {
        return this.f2740e - this.f2741f;
    }

    /* JADX INFO: renamed from: C */
    public final void m2058C(byte[] bArr, int i, int i2) throws C0287hi {
        try {
            System.arraycopy(bArr, i, this.f2739d, this.f2741f, i2);
            this.f2741f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C0287hi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2741f), Integer.valueOf(this.f2740e), Integer.valueOf(i2)), e);
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: g */
    public final void mo2059g(byte b) throws C0287hi {
        try {
            byte[] bArr = this.f2739d;
            int i = this.f2741f;
            this.f2741f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C0287hi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2741f), Integer.valueOf(this.f2740e), 1), e);
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: h */
    public final void mo2060h(int i, boolean z) throws C0287hi {
        mo2075w(i, 0);
        mo2059g(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: i */
    public final void mo2061i(int i, byte[] bArr) throws C0287hi {
        mo2077y(i);
        m2058C(bArr, 0, i);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: j */
    public final void mo2062j(int i, C0762ud c0762ud) throws C0287hi {
        mo2075w(i, 2);
        mo2063k(c0762ud);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: k */
    public final void mo2063k(C0762ud c0762ud) throws C0287hi {
        mo2077y(c0762ud.size());
        mo2070r(c0762ud.f7800k, c0762ud.mo4065e(), c0762ud.size());
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: l */
    public final void mo2064l(int i, int i2) throws C0287hi {
        mo2075w(i, 5);
        mo2065m(i2);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: m */
    public final void mo2065m(int i) throws C0287hi {
        try {
            byte[] bArr = this.f2739d;
            int i2 = this.f2741f;
            int i3 = i2 + 1;
            this.f2741f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f2741f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f2741f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f2741f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C0287hi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2741f), Integer.valueOf(this.f2740e), 1), e);
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: n */
    public final void mo2066n(int i, long j) throws C0287hi {
        mo2075w(i, 1);
        mo2067o(j);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: o */
    public final void mo2067o(long j) throws C0287hi {
        try {
            byte[] bArr = this.f2739d;
            int i = this.f2741f;
            int i2 = i + 1;
            this.f2741f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f2741f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f2741f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f2741f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f2741f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f2741f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f2741f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f2741f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C0287hi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2741f), Integer.valueOf(this.f2740e), 1), e);
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: p */
    public final void mo2068p(int i, int i2) throws C0287hi {
        mo2075w(i, 0);
        mo2069q(i2);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: q */
    public final void mo2069q(int i) throws C0287hi {
        if (i >= 0) {
            mo2077y(i);
        } else {
            mo2056A(i);
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: r */
    public final void mo2070r(byte[] bArr, int i, int i2) throws C0287hi {
        m2058C(bArr, i, i2);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: s */
    public final void mo2071s(int i, AbstractC0342j0 abstractC0342j0, r51 r51Var) throws C0287hi {
        mo2075w(i, 2);
        mo2077y(abstractC0342j0.mo2754a(r51Var));
        r51Var.mo4255h(abstractC0342j0, this.f4385a);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: t */
    public final void mo2072t(AbstractC0342j0 abstractC0342j0) throws C0287hi {
        mo2077y(((s70) abstractC0342j0).mo2754a(null));
        abstractC0342j0.mo2756c(this);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: u */
    public final void mo2073u(String str, int i) throws C0287hi {
        mo2075w(i, 2);
        mo2074v(str);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: v */
    public final void mo2074v(String str) throws C0287hi {
        int i = this.f2741f;
        try {
            int iM3034d = AbstractC0397ki.m3034d(str.length() * 3);
            int iM3034d2 = AbstractC0397ki.m3034d(str.length());
            byte[] bArr = this.f2739d;
            if (iM3034d2 != iM3034d) {
                mo2077y(wg1.m5331b(str));
                this.f2741f = wg1.f8548a.mo4523e(str, bArr, this.f2741f, m2057B());
                return;
            }
            int i2 = i + iM3034d2;
            this.f2741f = i2;
            int iMo4523e = wg1.f8548a.mo4523e(str, bArr, i2, m2057B());
            this.f2741f = i;
            mo2077y((iMo4523e - i) - iM3034d2);
            this.f2741f = iMo4523e;
        } catch (IndexOutOfBoundsException e) {
            throw new C0287hi(e);
        } catch (ug1 e2) {
            this.f2741f = i;
            m3036f(str, e2);
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: w */
    public final void mo2075w(int i, int i2) throws C0287hi {
        mo2077y((i << 3) | i2);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: x */
    public final void mo2076x(int i, int i2) throws C0287hi {
        mo2075w(i, 0);
        mo2077y(i2);
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: y */
    public final void mo2077y(int i) throws C0287hi {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.f2741f;
            byte[] bArr = this.f2739d;
            if (i2 == 0) {
                this.f2741f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.f2741f = i3 + 1;
                    bArr[i3] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C0287hi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2741f), Integer.valueOf(this.f2740e), 1), e);
                }
            }
            throw new C0287hi(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2741f), Integer.valueOf(this.f2740e), 1), e);
        }
    }

    @Override // p000.AbstractC0397ki
    /* JADX INFO: renamed from: z */
    public final void mo2078z(int i, long j) throws C0287hi {
        mo2075w(i, 0);
        mo2056A(j);
    }
}

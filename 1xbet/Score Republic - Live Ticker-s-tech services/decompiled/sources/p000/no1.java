package p000;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class no1 extends ro1 {

    /* JADX INFO: renamed from: c */
    public final byte[] f5476c;

    /* JADX INFO: renamed from: d */
    public final int f5477d;

    /* JADX INFO: renamed from: e */
    public int f5478e;

    public no1(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            C0270h1.m2190f(AbstractC0024an.m281d(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.f5476c = bArr;
        this.f5478e = 0;
        this.f5477d = i;
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: c */
    public final void mo3555c(byte[] bArr, int i, int i2) throws C0287hi {
        m3575w(bArr, i, i2);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: d */
    public final void mo3556d(int i, int i2) throws C0287hi {
        mo3570r((i << 3) | i2);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: e */
    public final void mo3557e(int i, int i2) throws C0287hi {
        mo3570r(i << 3);
        mo3569q(i2);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: f */
    public final void mo3558f(int i, int i2) throws C0287hi {
        mo3570r(i << 3);
        mo3570r(i2);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: g */
    public final void mo3559g(int i, int i2) throws C0287hi {
        mo3570r((i << 3) | 5);
        mo3571s(i2);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: h */
    public final void mo3560h(int i, long j) throws C0287hi {
        mo3570r(i << 3);
        mo3572t(j);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: i */
    public final void mo3561i(int i, long j) throws C0287hi {
        mo3570r((i << 3) | 1);
        mo3573u(j);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: j */
    public final void mo3562j(int i, boolean z) throws C0287hi {
        mo3570r(i << 3);
        mo3568p(z ? (byte) 1 : (byte) 0);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: k */
    public final void mo3563k(String str, int i) throws C0287hi {
        mo3570r((i << 3) | 2);
        mo3574v(str);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: l */
    public final void mo3564l(int i, ko1 ko1Var) throws C0287hi {
        mo3570r((i << 3) | 2);
        mo3565m(ko1Var);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: m */
    public final void mo3565m(ko1 ko1Var) throws C0287hi {
        mo3570r(ko1Var.mo2330c());
        ko1Var.mo2333f(this);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: n */
    public final void mo3566n(int i, byte[] bArr) throws C0287hi {
        mo3570r(i);
        m3575w(bArr, 0, i);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: o */
    public final void mo3567o(do1 do1Var) throws C0287hi {
        zo1 zo1Var = (zo1) do1Var;
        mo3570r(zo1Var.m5971m());
        zo1Var.m5964f(this);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: p */
    public final void mo3568p(byte b) throws C0287hi {
        int i = this.f5478e;
        try {
            int i2 = i + 1;
            try {
                this.f5476c[i] = b;
                this.f5478e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new C0287hi(i, this.f5477d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: q */
    public final void mo3569q(int i) throws C0287hi {
        if (i >= 0) {
            mo3570r(i);
        } else {
            mo3572t(i);
        }
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: r */
    public final void mo3570r(int i) throws C0287hi {
        int i2;
        int i3 = this.f5478e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f5476c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f5478e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new C0287hi(i2, this.f5477d, 1, e);
                }
            }
            throw new C0287hi(i2, this.f5477d, 1, e);
        }
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: s */
    public final void mo3571s(int i) throws C0287hi {
        int i2 = this.f5478e;
        try {
            byte[] bArr = this.f5476c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f5478e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new C0287hi(i2, this.f5477d, 4, e);
        }
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: t */
    public final void mo3572t(long j) throws C0287hi {
        int i;
        int i2 = this.f5478e;
        byte[] bArr = this.f5476c;
        int i3 = this.f5477d;
        if (!ro1.f6926b || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new C0287hi(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new C0287hi(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                tq1.m4835k(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            tq1.m4835k(bArr, i2, (byte) j);
        }
        this.f5478e = i;
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: u */
    public final void mo3573u(long j) throws C0287hi {
        int i = this.f5478e;
        try {
            byte[] bArr = this.f5476c;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f5478e = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new C0287hi(i, this.f5477d, 8, e);
        }
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: v */
    public final void mo3574v(String str) throws C0287hi {
        int i = this.f5478e;
        try {
            int iM4391a = ro1.m4391a(str.length() * 3);
            int iM4391a2 = ro1.m4391a(str.length());
            byte[] bArr = this.f5476c;
            if (iM4391a2 != iM4391a) {
                mo3570r(vq1.m5184b(str));
                int i2 = this.f5478e;
                this.f5478e = vq1.m5185c(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + iM4391a2;
                this.f5478e = i3;
                int iM5185c = vq1.m5185c(str, bArr, i3, bArr.length - i3);
                this.f5478e = i;
                mo3570r((iM5185c - i) - iM4391a2);
                this.f5478e = iM5185c;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new C0287hi(e);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m3575w(byte[] bArr, int i, int i2) throws C0287hi {
        try {
            System.arraycopy(bArr, i, this.f5476c, this.f5478e, i2);
            this.f5478e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C0287hi(this.f5478e, this.f5477d, i2, e);
        }
    }

    /* JADX INFO: renamed from: x */
    public final int m3576x() {
        return this.f5477d - this.f5478e;
    }
}

package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 extends ro1 {

    /* JADX INFO: renamed from: c */
    public final byte[] f5817c;

    /* JADX INFO: renamed from: d */
    public final int f5818d;

    /* JADX INFO: renamed from: e */
    public int f5819e;

    /* JADX INFO: renamed from: f */
    public final OutputStream f5820f;

    public oo1(OutputStream outputStream, int i) {
        if (outputStream == null) {
            C0270h1.m2192h("out");
            throw null;
        }
        this.f5820f = outputStream;
        if (i < 0) {
            C0270h1.m2190f("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.f5817c = bArr;
        this.f5818d = bArr.length;
    }

    /* JADX INFO: renamed from: A */
    public final void m3720A(int i) {
        if (this.f5818d - this.f5819e < i) {
            m3721B();
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m3721B() {
        this.f5820f.write(this.f5817c, 0, this.f5819e);
        this.f5819e = 0;
    }

    /* JADX INFO: renamed from: C */
    public final void m3722C(int i) {
        boolean z = ro1.f6926b;
        byte[] bArr = this.f5817c;
        if (z) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f5819e;
                if (i2 == 0) {
                    this.f5819e = i3 + 1;
                    tq1.m4835k(bArr, i3, (byte) i);
                    return;
                } else {
                    this.f5819e = i3 + 1;
                    tq1.m4835k(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                }
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f5819e;
                if (i4 == 0) {
                    this.f5819e = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f5819e = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: c */
    public final void mo3555c(byte[] bArr, int i, int i2) throws IOException {
        m3726z(bArr, i, i2);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: d */
    public final void mo3556d(int i, int i2) {
        mo3570r((i << 3) | i2);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: e */
    public final void mo3557e(int i, int i2) {
        m3720A(20);
        m3722C(i << 3);
        if (i2 >= 0) {
            m3722C(i2);
        } else {
            m3723w(i2);
        }
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: f */
    public final void mo3558f(int i, int i2) {
        m3720A(20);
        m3722C(i << 3);
        m3722C(i2);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: g */
    public final void mo3559g(int i, int i2) {
        m3720A(14);
        m3722C((i << 3) | 5);
        m3724x(i2);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: h */
    public final void mo3560h(int i, long j) {
        m3720A(20);
        m3722C(i << 3);
        m3723w(j);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: i */
    public final void mo3561i(int i, long j) {
        m3720A(18);
        m3722C((i << 3) | 1);
        m3725y(j);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: j */
    public final void mo3562j(int i, boolean z) {
        m3720A(11);
        m3722C(i << 3);
        int i2 = this.f5819e;
        this.f5817c[i2] = z ? (byte) 1 : (byte) 0;
        this.f5819e = i2 + 1;
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: k */
    public final void mo3563k(String str, int i) throws IOException {
        mo3570r((i << 3) | 2);
        mo3574v(str);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: l */
    public final void mo3564l(int i, ko1 ko1Var) {
        mo3570r((i << 3) | 2);
        mo3565m(ko1Var);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: m */
    public final void mo3565m(ko1 ko1Var) {
        mo3570r(ko1Var.mo2330c());
        ko1Var.mo2333f(this);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: n */
    public final void mo3566n(int i, byte[] bArr) throws IOException {
        mo3570r(i);
        m3726z(bArr, 0, i);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: o */
    public final void mo3567o(do1 do1Var) {
        zo1 zo1Var = (zo1) do1Var;
        mo3570r(zo1Var.m5971m());
        zo1Var.m5964f(this);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: p */
    public final void mo3568p(byte b) {
        if (this.f5819e == this.f5818d) {
            m3721B();
        }
        int i = this.f5819e;
        this.f5817c[i] = b;
        this.f5819e = i + 1;
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: q */
    public final void mo3569q(int i) {
        if (i >= 0) {
            mo3570r(i);
        } else {
            mo3572t(i);
        }
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: r */
    public final void mo3570r(int i) {
        m3720A(5);
        m3722C(i);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: s */
    public final void mo3571s(int i) {
        m3720A(4);
        m3724x(i);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: t */
    public final void mo3572t(long j) {
        m3720A(10);
        m3723w(j);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: u */
    public final void mo3573u(long j) {
        m3720A(8);
        m3725y(j);
    }

    @Override // p000.ro1
    /* JADX INFO: renamed from: v */
    public final void mo3574v(String str) throws IOException {
        int length = str.length() * 3;
        int iM4391a = ro1.m4391a(length);
        int i = iM4391a + length;
        int i2 = this.f5818d;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int iM5185c = vq1.m5185c(str, bArr, 0, length);
            mo3570r(iM5185c);
            m3726z(bArr, 0, iM5185c);
            return;
        }
        if (i > i2 - this.f5819e) {
            m3721B();
        }
        int iM4391a2 = ro1.m4391a(str.length());
        int i3 = this.f5819e;
        byte[] bArr2 = this.f5817c;
        try {
            if (iM4391a2 == iM4391a) {
                int i4 = i3 + iM4391a2;
                this.f5819e = i4;
                int iM5185c2 = vq1.m5185c(str, bArr2, i4, i2 - i4);
                this.f5819e = i3;
                m3722C((iM5185c2 - i3) - iM4391a2);
                this.f5819e = iM5185c2;
            } else {
                int iM5184b = vq1.m5184b(str);
                m3722C(iM5184b);
                this.f5819e = vq1.m5185c(str, bArr2, this.f5819e, iM5184b);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C0287hi(e);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m3723w(long j) {
        boolean z = ro1.f6926b;
        byte[] bArr = this.f5817c;
        if (z) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.f5819e;
                if (j2 == 0) {
                    this.f5819e = i2 + 1;
                    tq1.m4835k(bArr, i2, (byte) i);
                    return;
                } else {
                    this.f5819e = i2 + 1;
                    tq1.m4835k(bArr, i2, (byte) (i | 128));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i4 = this.f5819e;
                if (j3 == 0) {
                    this.f5819e = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.f5819e = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m3724x(int i) {
        int i2 = this.f5819e;
        byte[] bArr = this.f5817c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f5819e = i2 + 4;
    }

    /* JADX INFO: renamed from: y */
    public final void m3725y(long j) {
        int i = this.f5819e;
        byte[] bArr = this.f5817c;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f5819e = i + 8;
    }

    /* JADX INFO: renamed from: z */
    public final void m3726z(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f5819e;
        int i4 = this.f5818d;
        int i5 = i4 - i3;
        byte[] bArr2 = this.f5817c;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f5819e += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        this.f5819e = i4;
        m3721B();
        int i7 = i2 - i5;
        if (i7 > i4) {
            this.f5820f.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f5819e = i7;
        }
    }
}

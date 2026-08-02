package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class DB extends EB {

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f8180o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8181p;

    /* renamed from: q, reason: collision with root package name */
    public int f8182q;

    /* renamed from: r, reason: collision with root package name */
    public final ByteArrayOutputStream f8183r;

    public DB(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.f8180o = new byte[max];
        this.f8181p = max;
        this.f8183r = byteArrayOutputStream;
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void A0(int i) {
        if (i >= 0) {
            F0(i);
        } else {
            H0(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void B0(int i, AbstractC1464qB abstractC1464qB, InterfaceC1554sC interfaceC1554sC) {
        F0((i << 3) | 2);
        F0(abstractC1464qB.a(interfaceC1554sC));
        interfaceC1554sC.j(abstractC1464qB, this.f8471l);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void C0(String str, int i) {
        F0((i << 3) | 2);
        try {
            int length = str.length() * 3;
            int p02 = EB.p0(length);
            int i5 = p02 + length;
            int i6 = this.f8181p;
            if (i5 > i6) {
                byte[] bArr = new byte[length];
                int b3 = EC.b(str, bArr, 0, length);
                F0(b3);
                O0(bArr, 0, b3);
                return;
            }
            if (i5 > i6 - this.f8182q) {
                I0();
            }
            int p03 = EB.p0(str.length());
            int i7 = this.f8182q;
            byte[] bArr2 = this.f8180o;
            try {
                if (p03 == p02) {
                    int i8 = i7 + p03;
                    this.f8182q = i8;
                    int b5 = EC.b(str, bArr2, i8, i6 - i8);
                    this.f8182q = i7;
                    M0((b5 - i7) - p03);
                    this.f8182q = b5;
                } else {
                    int c5 = EC.c(str);
                    M0(c5);
                    this.f8182q = EC.b(str, bArr2, this.f8182q, c5);
                }
            } catch (DC e3) {
                this.f8182q = i7;
                throw e3;
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new N3.c(e5);
            }
        } catch (DC e6) {
            r0(str, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void D0(int i, int i5) {
        F0((i << 3) | i5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void E0(int i, int i5) {
        J0(20);
        M0(i << 3);
        M0(i5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void F0(int i) {
        J0(5);
        M0(i);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void G0(int i, long j5) {
        J0(20);
        M0(i << 3);
        N0(j5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void H0(long j5) {
        J0(10);
        N0(j5);
    }

    public final void I0() {
        this.f8183r.write(this.f8180o, 0, this.f8182q);
        this.f8182q = 0;
    }

    public final void J0(int i) {
        if (this.f8181p - this.f8182q < i) {
            I0();
        }
    }

    public final void K0(int i) {
        int i5 = this.f8182q;
        byte[] bArr = this.f8180o;
        bArr[i5] = (byte) i;
        bArr[i5 + 1] = (byte) (i >> 8);
        bArr[i5 + 2] = (byte) (i >> 16);
        bArr[i5 + 3] = (byte) (i >> 24);
        this.f8182q = i5 + 4;
    }

    public final void L0(long j5) {
        int i = this.f8182q;
        byte[] bArr = this.f8180o;
        bArr[i] = (byte) j5;
        bArr[i + 1] = (byte) (j5 >> 8);
        bArr[i + 2] = (byte) (j5 >> 16);
        bArr[i + 3] = (byte) (j5 >> 24);
        bArr[i + 4] = (byte) (j5 >> 32);
        bArr[i + 5] = (byte) (j5 >> 40);
        bArr[i + 6] = (byte) (j5 >> 48);
        bArr[i + 7] = (byte) (j5 >> 56);
        this.f8182q = i + 8;
    }

    public final void M0(int i) {
        boolean z3 = EB.f8470n;
        byte[] bArr = this.f8180o;
        if (z3) {
            while ((i & (-128)) != 0) {
                int i5 = this.f8182q;
                this.f8182q = i5 + 1;
                CC.k(bArr, i5, (byte) (i | 128));
                i >>>= 7;
            }
            int i6 = this.f8182q;
            this.f8182q = i6 + 1;
            CC.k(bArr, i6, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i7 = this.f8182q;
            this.f8182q = i7 + 1;
            bArr[i7] = (byte) (i | 128);
            i >>>= 7;
        }
        int i8 = this.f8182q;
        this.f8182q = i8 + 1;
        bArr[i8] = (byte) i;
    }

    public final void N0(long j5) {
        boolean z3 = EB.f8470n;
        byte[] bArr = this.f8180o;
        if (z3) {
            while (true) {
                int i = (int) j5;
                if ((j5 & (-128)) == 0) {
                    int i5 = this.f8182q;
                    this.f8182q = i5 + 1;
                    CC.k(bArr, i5, (byte) i);
                    return;
                } else {
                    int i6 = this.f8182q;
                    this.f8182q = i6 + 1;
                    CC.k(bArr, i6, (byte) (i | 128));
                    j5 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i7 = (int) j5;
                if ((j5 & (-128)) == 0) {
                    int i8 = this.f8182q;
                    this.f8182q = i8 + 1;
                    bArr[i8] = (byte) i7;
                    return;
                } else {
                    int i9 = this.f8182q;
                    this.f8182q = i9 + 1;
                    bArr[i9] = (byte) (i7 | 128);
                    j5 >>>= 7;
                }
            }
        }
    }

    public final void O0(byte[] bArr, int i, int i5) {
        int i6 = this.f8182q;
        int i7 = this.f8181p;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f8180o;
        if (i8 >= i5) {
            System.arraycopy(bArr, i, bArr2, i6, i5);
            this.f8182q += i5;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i6, i8);
        int i9 = i + i8;
        this.f8182q = i7;
        I0();
        int i10 = i5 - i8;
        if (i10 > i7) {
            this.f8183r.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f8182q = i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1400ot
    public final void o(byte[] bArr, int i, int i5) {
        O0(bArr, i, i5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void s0(byte b3) {
        if (this.f8182q == this.f8181p) {
            I0();
        }
        int i = this.f8182q;
        this.f8180o[i] = b3;
        this.f8182q = i + 1;
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void t0(int i, boolean z3) {
        J0(11);
        M0(i << 3);
        int i5 = this.f8182q;
        this.f8180o[i5] = z3 ? (byte) 1 : (byte) 0;
        this.f8182q = i5 + 1;
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void u0(int i, AbstractC1823yB abstractC1823yB) {
        F0((i << 3) | 2);
        F0(abstractC1823yB.g());
        abstractC1823yB.n(this);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void v0(int i, int i5) {
        J0(14);
        M0((i << 3) | 5);
        K0(i5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void w0(int i) {
        J0(4);
        K0(i);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void x0(int i, long j5) {
        J0(18);
        M0((i << 3) | 1);
        L0(j5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void y0(long j5) {
        J0(8);
        L0(j5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void z0(int i, int i5) {
        J0(20);
        M0(i << 3);
        if (i5 >= 0) {
            M0(i5);
        } else {
            N0(i5);
        }
    }
}

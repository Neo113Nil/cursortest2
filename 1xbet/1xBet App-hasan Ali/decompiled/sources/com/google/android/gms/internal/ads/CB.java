package com.google.android.gms.internal.ads;

import java.util.Locale;

/* loaded from: classes.dex */
public final class CB extends EB {

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f7968o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7969p;

    /* renamed from: q, reason: collision with root package name */
    public int f7970q;

    public CB(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(L1.a.k(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.f7968o = bArr;
        this.f7970q = 0;
        this.f7969p = i;
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
        int i5 = this.f7970q;
        try {
            int p02 = EB.p0(str.length() * 3);
            int p03 = EB.p0(str.length());
            byte[] bArr = this.f7968o;
            int i6 = this.f7969p;
            if (p03 != p02) {
                F0(EC.c(str));
                int i7 = this.f7970q;
                this.f7970q = EC.b(str, bArr, i7, i6 - i7);
            } else {
                int i8 = i5 + p03;
                this.f7970q = i8;
                int b3 = EC.b(str, bArr, i8, i6 - i8);
                this.f7970q = i5;
                F0((b3 - i5) - p03);
                this.f7970q = b3;
            }
        } catch (DC e3) {
            this.f7970q = i5;
            r0(str, e3);
        } catch (IndexOutOfBoundsException e5) {
            throw new N3.c(e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void D0(int i, int i5) {
        F0((i << 3) | i5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void E0(int i, int i5) {
        F0(i << 3);
        F0(i5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void F0(int i) {
        int i5;
        int i6 = this.f7970q;
        while (true) {
            int i7 = i & (-128);
            byte[] bArr = this.f7968o;
            if (i7 == 0) {
                i5 = i6 + 1;
                bArr[i6] = (byte) i;
                this.f7970q = i5;
                return;
            } else {
                i5 = i6 + 1;
                try {
                    bArr[i6] = (byte) (i | 128);
                    i >>>= 7;
                    i6 = i5;
                } catch (IndexOutOfBoundsException e3) {
                    throw new N3.c(i5, this.f7969p, 1, e3);
                }
            }
            throw new N3.c(i5, this.f7969p, 1, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void G0(int i, long j5) {
        F0(i << 3);
        H0(j5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void H0(long j5) {
        int i;
        int i5 = this.f7970q;
        byte[] bArr = this.f7968o;
        boolean z3 = EB.f8470n;
        int i6 = this.f7969p;
        if (!z3 || i6 - i5 < 10) {
            long j6 = j5;
            while ((j6 & (-128)) != 0) {
                i = i5 + 1;
                try {
                    bArr[i5] = (byte) (((int) j6) | 128);
                    j6 >>>= 7;
                    i5 = i;
                } catch (IndexOutOfBoundsException e3) {
                    throw new N3.c(i, i6, 1, e3);
                }
            }
            i = i5 + 1;
            bArr[i5] = (byte) j6;
        } else {
            long j7 = j5;
            while ((j7 & (-128)) != 0) {
                CC.k(bArr, i5, (byte) (((int) j7) | 128));
                j7 >>>= 7;
                i5++;
            }
            i = i5 + 1;
            CC.k(bArr, i5, (byte) j7);
        }
        this.f7970q = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1400ot
    public final void o(byte[] bArr, int i, int i5) {
        try {
            System.arraycopy(bArr, i, this.f7968o, this.f7970q, i5);
            this.f7970q += i5;
        } catch (IndexOutOfBoundsException e3) {
            throw new N3.c(this.f7970q, this.f7969p, i5, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void s0(byte b3) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.f7970q;
        try {
            int i5 = i + 1;
            try {
                this.f7968o[i] = b3;
                this.f7970q = i5;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i = i5;
                throw new N3.c(i, this.f7969p, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e5) {
            indexOutOfBoundsException = e5;
        }
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void t0(int i, boolean z3) {
        F0(i << 3);
        s0(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void u0(int i, AbstractC1823yB abstractC1823yB) {
        F0((i << 3) | 2);
        F0(abstractC1823yB.g());
        abstractC1823yB.n(this);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void v0(int i, int i5) {
        F0((i << 3) | 5);
        w0(i5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void w0(int i) {
        int i5 = this.f7970q;
        try {
            byte[] bArr = this.f7968o;
            bArr[i5] = (byte) i;
            bArr[i5 + 1] = (byte) (i >> 8);
            bArr[i5 + 2] = (byte) (i >> 16);
            bArr[i5 + 3] = (byte) (i >> 24);
            this.f7970q = i5 + 4;
        } catch (IndexOutOfBoundsException e3) {
            throw new N3.c(i5, this.f7969p, 4, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void x0(int i, long j5) {
        F0((i << 3) | 1);
        y0(j5);
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void y0(long j5) {
        int i = this.f7970q;
        try {
            byte[] bArr = this.f7968o;
            bArr[i] = (byte) j5;
            bArr[i + 1] = (byte) (j5 >> 8);
            bArr[i + 2] = (byte) (j5 >> 16);
            bArr[i + 3] = (byte) (j5 >> 24);
            bArr[i + 4] = (byte) (j5 >> 32);
            bArr[i + 5] = (byte) (j5 >> 40);
            bArr[i + 6] = (byte) (j5 >> 48);
            bArr[i + 7] = (byte) (j5 >> 56);
            this.f7970q = i + 8;
        } catch (IndexOutOfBoundsException e3) {
            throw new N3.c(i, this.f7969p, 8, e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final void z0(int i, int i5) {
        F0(i << 3);
        A0(i5);
    }
}

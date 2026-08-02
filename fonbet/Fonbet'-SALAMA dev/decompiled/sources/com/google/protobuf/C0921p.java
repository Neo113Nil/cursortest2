package com.google.protobuf;

import java.io.OutputStream;

/* renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0921p extends AbstractC0923q {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f12253f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12254g;

    /* renamed from: h, reason: collision with root package name */
    public int f12255h;

    /* renamed from: i, reason: collision with root package name */
    public final OutputStream f12256i;

    public C0921p(OutputStream outputStream, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i7, 20);
        this.f12253f = new byte[max];
        this.f12254g = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f12256i = outputStream;
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void A0(int i7, int i8) {
        V0(14);
        R0(i7, 5);
        P0(i8);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void B0(int i7) {
        V0(4);
        P0(i7);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void C0(int i7, long j) {
        V0(18);
        R0(i7, 1);
        Q0(j);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void D0(long j) {
        V0(8);
        Q0(j);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void E0(int i7, int i8) {
        V0(20);
        R0(i7, 0);
        if (i8 >= 0) {
            S0(i8);
        } else {
            T0(i8);
        }
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void F0(int i7) {
        if (i7 >= 0) {
            M0(i7);
        } else {
            O0(i7);
        }
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void G0(int i7, AbstractC0891a abstractC0891a, InterfaceC0925r0 interfaceC0925r0) {
        K0(i7, 2);
        M0(abstractC0891a.c(interfaceC0925r0));
        interfaceC0925r0.e(abstractC0891a, this.f12261c);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void H0(AbstractC0891a abstractC0891a) {
        M0(((C) abstractC0891a).c(null));
        abstractC0891a.e(this);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void I0(int i7, String str) {
        K0(i7, 2);
        J0(str);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void J0(String str) {
        try {
            int length = str.length() * 3;
            int r02 = AbstractC0923q.r0(length);
            int i7 = r02 + length;
            int i8 = this.f12254g;
            if (i7 > i8) {
                byte[] bArr = new byte[length];
                int P7 = N0.f12134a.P(str, bArr, 0, length);
                M0(P7);
                W0(bArr, 0, P7);
                return;
            }
            if (i7 > i8 - this.f12255h) {
                U0();
            }
            int r03 = AbstractC0923q.r0(str.length());
            int i9 = this.f12255h;
            byte[] bArr2 = this.f12253f;
            try {
                if (r03 == r02) {
                    int i10 = i9 + r03;
                    this.f12255h = i10;
                    int P8 = N0.f12134a.P(str, bArr2, i10, i8 - i10);
                    this.f12255h = i9;
                    S0((P8 - i9) - r03);
                    this.f12255h = P8;
                } else {
                    int c3 = N0.c(str);
                    S0(c3);
                    this.f12255h = N0.f12134a.P(str, bArr2, this.f12255h, c3);
                }
            } catch (M0 e7) {
                this.f12255h = i9;
                throw e7;
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new Z4.b(e8);
            }
        } catch (M0 e9) {
            u0(str, e9);
        }
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void K0(int i7, int i8) {
        M0((i7 << 3) | i8);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void L0(int i7, int i8) {
        V0(20);
        R0(i7, 0);
        S0(i8);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void M0(int i7) {
        V0(5);
        S0(i7);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void N0(int i7, long j) {
        V0(20);
        R0(i7, 0);
        T0(j);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void O0(long j) {
        V0(10);
        T0(j);
    }

    public final void P0(int i7) {
        int i8 = this.f12255h;
        int i9 = i8 + 1;
        this.f12255h = i9;
        byte[] bArr = this.f12253f;
        bArr[i8] = (byte) (i7 & 255);
        int i10 = i8 + 2;
        this.f12255h = i10;
        bArr[i9] = (byte) ((i7 >> 8) & 255);
        int i11 = i8 + 3;
        this.f12255h = i11;
        bArr[i10] = (byte) ((i7 >> 16) & 255);
        this.f12255h = i8 + 4;
        bArr[i11] = (byte) ((i7 >> 24) & 255);
    }

    public final void Q0(long j) {
        int i7 = this.f12255h;
        int i8 = i7 + 1;
        this.f12255h = i8;
        byte[] bArr = this.f12253f;
        bArr[i7] = (byte) (j & 255);
        int i9 = i7 + 2;
        this.f12255h = i9;
        bArr[i8] = (byte) ((j >> 8) & 255);
        int i10 = i7 + 3;
        this.f12255h = i10;
        bArr[i9] = (byte) ((j >> 16) & 255);
        int i11 = i7 + 4;
        this.f12255h = i11;
        bArr[i10] = (byte) (255 & (j >> 24));
        int i12 = i7 + 5;
        this.f12255h = i12;
        bArr[i11] = (byte) (((int) (j >> 32)) & 255);
        int i13 = i7 + 6;
        this.f12255h = i13;
        bArr[i12] = (byte) (((int) (j >> 40)) & 255);
        int i14 = i7 + 7;
        this.f12255h = i14;
        bArr[i13] = (byte) (((int) (j >> 48)) & 255);
        this.f12255h = i7 + 8;
        bArr[i14] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void R0(int i7, int i8) {
        S0((i7 << 3) | i8);
    }

    public final void S0(int i7) {
        boolean z4 = AbstractC0923q.f12260e;
        byte[] bArr = this.f12253f;
        if (z4) {
            while ((i7 & (-128)) != 0) {
                int i8 = this.f12255h;
                this.f12255h = i8 + 1;
                K0.l(bArr, i8, (byte) ((i7 & 127) | 128));
                i7 >>>= 7;
            }
            int i9 = this.f12255h;
            this.f12255h = i9 + 1;
            K0.l(bArr, i9, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i10 = this.f12255h;
            this.f12255h = i10 + 1;
            bArr[i10] = (byte) ((i7 & 127) | 128);
            i7 >>>= 7;
        }
        int i11 = this.f12255h;
        this.f12255h = i11 + 1;
        bArr[i11] = (byte) i7;
    }

    public final void T0(long j) {
        boolean z4 = AbstractC0923q.f12260e;
        byte[] bArr = this.f12253f;
        if (z4) {
            while ((j & (-128)) != 0) {
                int i7 = this.f12255h;
                this.f12255h = i7 + 1;
                K0.l(bArr, i7, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i8 = this.f12255h;
            this.f12255h = i8 + 1;
            K0.l(bArr, i8, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i9 = this.f12255h;
            this.f12255h = i9 + 1;
            bArr[i9] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        int i10 = this.f12255h;
        this.f12255h = i10 + 1;
        bArr[i10] = (byte) j;
    }

    public final void U0() {
        this.f12256i.write(this.f12253f, 0, this.f12255h);
        this.f12255h = 0;
    }

    public final void V0(int i7) {
        if (this.f12254g - this.f12255h < i7) {
            U0();
        }
    }

    @Override // com.google.protobuf.w0
    public final void W(byte[] bArr, int i7, int i8) {
        W0(bArr, i7, i8);
    }

    public final void W0(byte[] bArr, int i7, int i8) {
        int i9 = this.f12255h;
        int i10 = this.f12254g;
        int i11 = i10 - i9;
        byte[] bArr2 = this.f12253f;
        if (i11 >= i8) {
            System.arraycopy(bArr, i7, bArr2, i9, i8);
            this.f12255h += i8;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i9, i11);
        int i12 = i7 + i11;
        int i13 = i8 - i11;
        this.f12255h = i10;
        U0();
        if (i13 > i10) {
            this.f12256i.write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f12255h = i13;
        }
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void v0(byte b7) {
        if (this.f12255h == this.f12254g) {
            U0();
        }
        int i7 = this.f12255h;
        this.f12255h = i7 + 1;
        this.f12253f[i7] = b7;
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void w0(int i7, boolean z4) {
        V0(11);
        R0(i7, 0);
        byte b7 = z4 ? (byte) 1 : (byte) 0;
        int i8 = this.f12255h;
        this.f12255h = i8 + 1;
        this.f12253f[i8] = b7;
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void x0(int i7, byte[] bArr) {
        M0(i7);
        W0(bArr, 0, i7);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void y0(int i7, AbstractC0911k abstractC0911k) {
        K0(i7, 2);
        z0(abstractC0911k);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void z0(AbstractC0911k abstractC0911k) {
        M0(abstractC0911k.size());
        abstractC0911k.M(this);
    }
}

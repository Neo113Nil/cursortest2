package com.google.protobuf;

/* renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0919o extends AbstractC0923q {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f12246f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12247g;

    /* renamed from: h, reason: collision with root package name */
    public int f12248h;

    public C0919o(byte[] bArr, int i7, int i8) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i9 = i7 + i8;
        if ((i7 | i8 | (bArr.length - i9)) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        this.f12246f = bArr;
        this.f12248h = i7;
        this.f12247g = i9;
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void A0(int i7, int i8) {
        K0(i7, 5);
        B0(i8);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void B0(int i7) {
        try {
            byte[] bArr = this.f12246f;
            int i8 = this.f12248h;
            int i9 = i8 + 1;
            this.f12248h = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.f12248h = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.f12248h = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.f12248h = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12248h), Integer.valueOf(this.f12247g), 1), e7, 3);
        }
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void C0(int i7, long j) {
        K0(i7, 1);
        D0(j);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void D0(long j) {
        try {
            byte[] bArr = this.f12246f;
            int i7 = this.f12248h;
            int i8 = i7 + 1;
            this.f12248h = i8;
            bArr[i7] = (byte) (((int) j) & 255);
            int i9 = i7 + 2;
            this.f12248h = i9;
            bArr[i8] = (byte) (((int) (j >> 8)) & 255);
            int i10 = i7 + 3;
            this.f12248h = i10;
            bArr[i9] = (byte) (((int) (j >> 16)) & 255);
            int i11 = i7 + 4;
            this.f12248h = i11;
            bArr[i10] = (byte) (((int) (j >> 24)) & 255);
            int i12 = i7 + 5;
            this.f12248h = i12;
            bArr[i11] = (byte) (((int) (j >> 32)) & 255);
            int i13 = i7 + 6;
            this.f12248h = i13;
            bArr[i12] = (byte) (((int) (j >> 40)) & 255);
            int i14 = i7 + 7;
            this.f12248h = i14;
            bArr[i13] = (byte) (((int) (j >> 48)) & 255);
            this.f12248h = i7 + 8;
            bArr[i14] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12248h), Integer.valueOf(this.f12247g), 1), e7, 3);
        }
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void E0(int i7, int i8) {
        K0(i7, 0);
        F0(i8);
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
        int i7 = this.f12248h;
        try {
            int r02 = AbstractC0923q.r0(str.length() * 3);
            int r03 = AbstractC0923q.r0(str.length());
            byte[] bArr = this.f12246f;
            if (r03 == r02) {
                int i8 = i7 + r03;
                this.f12248h = i8;
                int P7 = N0.f12134a.P(str, bArr, i8, P0());
                this.f12248h = i7;
                M0((P7 - i7) - r03);
                this.f12248h = P7;
            } else {
                M0(N0.c(str));
                this.f12248h = N0.f12134a.P(str, bArr, this.f12248h, P0());
            }
        } catch (M0 e7) {
            this.f12248h = i7;
            u0(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new Z4.b(e8);
        }
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void K0(int i7, int i8) {
        M0((i7 << 3) | i8);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void L0(int i7, int i8) {
        K0(i7, 0);
        M0(i8);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void M0(int i7) {
        while (true) {
            int i8 = i7 & (-128);
            byte[] bArr = this.f12246f;
            if (i8 == 0) {
                int i9 = this.f12248h;
                this.f12248h = i9 + 1;
                bArr[i9] = (byte) i7;
                return;
            } else {
                try {
                    int i10 = this.f12248h;
                    this.f12248h = i10 + 1;
                    bArr[i10] = (byte) ((i7 & 127) | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12248h), Integer.valueOf(this.f12247g), 1), e7, 3);
                }
            }
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12248h), Integer.valueOf(this.f12247g), 1), e7, 3);
        }
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void N0(int i7, long j) {
        K0(i7, 0);
        O0(j);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void O0(long j) {
        boolean z4 = AbstractC0923q.f12260e;
        byte[] bArr = this.f12246f;
        if (z4 && P0() >= 10) {
            while ((j & (-128)) != 0) {
                int i7 = this.f12248h;
                this.f12248h = i7 + 1;
                K0.l(bArr, i7, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i8 = this.f12248h;
            this.f12248h = i8 + 1;
            K0.l(bArr, i8, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i9 = this.f12248h;
                this.f12248h = i9 + 1;
                bArr[i9] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12248h), Integer.valueOf(this.f12247g), 1), e7, 3);
            }
        }
        int i10 = this.f12248h;
        this.f12248h = i10 + 1;
        bArr[i10] = (byte) j;
    }

    public final int P0() {
        return this.f12247g - this.f12248h;
    }

    public final void Q0(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, i7, this.f12246f, this.f12248h, i8);
            this.f12248h += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12248h), Integer.valueOf(this.f12247g), Integer.valueOf(i8)), e7, 3);
        }
    }

    @Override // com.google.protobuf.w0
    public final void W(byte[] bArr, int i7, int i8) {
        Q0(bArr, i7, i8);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void v0(byte b7) {
        try {
            byte[] bArr = this.f12246f;
            int i7 = this.f12248h;
            this.f12248h = i7 + 1;
            bArr[i7] = b7;
        } catch (IndexOutOfBoundsException e7) {
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12248h), Integer.valueOf(this.f12247g), 1), e7, 3);
        }
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void w0(int i7, boolean z4) {
        K0(i7, 0);
        v0(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC0923q
    public final void x0(int i7, byte[] bArr) {
        M0(i7);
        Q0(bArr, 0, i7);
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

package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0875o extends AbstractC0879q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f12246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12248h;

    public C0875o(byte[] bArr, int i7, int i8) {
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

    @Override // com.google.protobuf.AbstractC0879q
    public final void A0(int i7, int i8) throws Z4.b {
        K0(i7, 5);
        B0(i8);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void B0(int i7) throws Z4.b {
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

    @Override // com.google.protobuf.AbstractC0879q
    public final void C0(int i7, long j) throws Z4.b {
        K0(i7, 1);
        D0(j);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void D0(long j) throws Z4.b {
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

    @Override // com.google.protobuf.AbstractC0879q
    public final void E0(int i7, int i8) throws Z4.b {
        K0(i7, 0);
        F0(i8);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void F0(int i7) throws Z4.b {
        if (i7 >= 0) {
            M0(i7);
        } else {
            O0(i7);
        }
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void G0(int i7, AbstractC0847a abstractC0847a, InterfaceC0881r0 interfaceC0881r0) throws Z4.b {
        K0(i7, 2);
        M0(abstractC0847a.c(interfaceC0881r0));
        interfaceC0881r0.e(abstractC0847a, this.f12261c);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void H0(AbstractC0847a abstractC0847a) throws Z4.b {
        M0(((C) abstractC0847a).c(null));
        abstractC0847a.e(this);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void I0(int i7, String str) throws Z4.b {
        K0(i7, 2);
        J0(str);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void J0(String str) throws Z4.b {
        int i7 = this.f12248h;
        try {
            int iR0 = AbstractC0879q.r0(str.length() * 3);
            int iR1 = AbstractC0879q.r0(str.length());
            byte[] bArr = this.f12246f;
            if (iR1 == iR0) {
                int i8 = i7 + iR1;
                this.f12248h = i8;
                int iP = N0.f12134a.P(str, bArr, i8, P0());
                this.f12248h = i7;
                M0((iP - i7) - iR1);
                this.f12248h = iP;
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

    @Override // com.google.protobuf.AbstractC0879q
    public final void K0(int i7, int i8) throws Z4.b {
        M0((i7 << 3) | i8);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void L0(int i7, int i8) throws Z4.b {
        K0(i7, 0);
        M0(i8);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void M0(int i7) throws Z4.b {
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

    @Override // com.google.protobuf.AbstractC0879q
    public final void N0(int i7, long j) throws Z4.b {
        K0(i7, 0);
        O0(j);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void O0(long j) throws Z4.b {
        boolean z4 = AbstractC0879q.f12260e;
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

    public final void Q0(byte[] bArr, int i7, int i8) throws Z4.b {
        try {
            System.arraycopy(bArr, i7, this.f12246f, this.f12248h, i8);
            this.f12248h += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12248h), Integer.valueOf(this.f12247g), Integer.valueOf(i8)), e7, 3);
        }
    }

    @Override // com.google.protobuf.w0
    public final void W(byte[] bArr, int i7, int i8) throws Z4.b {
        Q0(bArr, i7, i8);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void v0(byte b7) throws Z4.b {
        try {
            byte[] bArr = this.f12246f;
            int i7 = this.f12248h;
            this.f12248h = i7 + 1;
            bArr[i7] = b7;
        } catch (IndexOutOfBoundsException e7) {
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f12248h), Integer.valueOf(this.f12247g), 1), e7, 3);
        }
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void w0(int i7, boolean z4) throws Z4.b {
        K0(i7, 0);
        v0(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void x0(int i7, byte[] bArr) throws Z4.b {
        M0(i7);
        Q0(bArr, 0, i7);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void y0(int i7, AbstractC0867k abstractC0867k) throws Z4.b {
        K0(i7, 2);
        z0(abstractC0867k);
    }

    @Override // com.google.protobuf.AbstractC0879q
    public final void z0(AbstractC0867k abstractC0867k) throws Z4.b {
        M0(abstractC0867k.size());
        abstractC0867k.M(this);
    }
}

package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0832l extends p097n3.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Logger f11798k = Logger.getLogger(C0832l.class.getName());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f11799l = o0.f11812e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L f11800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f11801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11802i;
    public int j;

    public C0832l(byte[] bArr, int i7) {
        if (((bArr.length - i7) | i7) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i7)));
        }
        this.f11801h = bArr;
        this.j = 0;
        this.f11802i = i7;
    }

    public static int A0(int i7, int i8) {
        return B0(i8) + z0(i7);
    }

    public static int B0(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int C0(int i7, long j) {
        return D0(j) + z0(i7);
    }

    public static int D0(long j) {
        int i7;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j) != 0) {
            i7 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static int h0(int i7) {
        return z0(i7) + 1;
    }

    public static int i0(int i7, AbstractC0829i abstractC0829i) {
        return j0(abstractC0829i) + z0(i7);
    }

    public static int j0(AbstractC0829i abstractC0829i) {
        int size = abstractC0829i.size();
        return B0(size) + size;
    }

    public static int k0(int i7) {
        return z0(i7) + 8;
    }

    public static int l0(int i7, int i8) {
        return r0(i8) + z0(i7);
    }

    public static int m0(int i7) {
        return z0(i7) + 4;
    }

    public static int n0(int i7) {
        return z0(i7) + 8;
    }

    public static int o0(int i7) {
        return z0(i7) + 4;
    }

    public static int p0(int i7, AbstractC0821a abstractC0821a, c0 c0Var) {
        return abstractC0821a.b(c0Var) + (z0(i7) * 2);
    }

    public static int q0(int i7, int i8) {
        return r0(i8) + z0(i7);
    }

    public static int r0(int i7) {
        if (i7 >= 0) {
            return B0(i7);
        }
        return 10;
    }

    public static int s0(int i7, long j) {
        return D0(j) + z0(i7);
    }

    public static int t0(int i7) {
        return z0(i7) + 4;
    }

    public static int u0(int i7) {
        return z0(i7) + 8;
    }

    public static int v0(int i7, int i8) {
        return B0((i8 >> 31) ^ (i8 << 1)) + z0(i7);
    }

    public static int w0(int i7, long j) {
        return D0((j >> 63) ^ (j << 1)) + z0(i7);
    }

    public static int x0(int i7, String str) {
        return y0(str) + z0(i7);
    }

    public static int y0(String str) {
        int length;
        try {
            length = r0.b(str);
        } catch (q0 unused) {
            length = str.getBytes(A.f11702a).length;
        }
        return B0(length) + length;
    }

    public static int z0(int i7) {
        return B0(i7 << 3);
    }

    public final void E0(byte b7) throws Z4.b {
        try {
            byte[] bArr = this.f11801h;
            int i7 = this.j;
            this.j = i7 + 1;
            bArr[i7] = b7;
        } catch (IndexOutOfBoundsException e7) {
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f11802i), 1), e7, 2);
        }
    }

    public final void F0(byte[] bArr, int i7, int i8) throws Z4.b {
        try {
            System.arraycopy(bArr, i7, this.f11801h, this.j, i8);
            this.j += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f11802i), Integer.valueOf(i8)), e7, 2);
        }
    }

    public final void G0(int i7, int i8) throws Z4.b {
        L0(i7, 5);
        H0(i8);
    }

    public final void H0(int i7) throws Z4.b {
        try {
            byte[] bArr = this.f11801h;
            int i8 = this.j;
            int i9 = i8 + 1;
            this.j = i9;
            bArr[i8] = (byte) (i7 & 255);
            int i10 = i8 + 2;
            this.j = i10;
            bArr[i9] = (byte) ((i7 >> 8) & 255);
            int i11 = i8 + 3;
            this.j = i11;
            bArr[i10] = (byte) ((i7 >> 16) & 255);
            this.j = i8 + 4;
            bArr[i11] = (byte) ((i7 >> 24) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f11802i), 1), e7, 2);
        }
    }

    public final void I0(int i7, long j) throws Z4.b {
        L0(i7, 1);
        J0(j);
    }

    public final void J0(long j) throws Z4.b {
        try {
            byte[] bArr = this.f11801h;
            int i7 = this.j;
            int i8 = i7 + 1;
            this.j = i8;
            bArr[i7] = (byte) (((int) j) & 255);
            int i9 = i7 + 2;
            this.j = i9;
            bArr[i8] = (byte) (((int) (j >> 8)) & 255);
            int i10 = i7 + 3;
            this.j = i10;
            bArr[i9] = (byte) (((int) (j >> 16)) & 255);
            int i11 = i7 + 4;
            this.j = i11;
            bArr[i10] = (byte) (((int) (j >> 24)) & 255);
            int i12 = i7 + 5;
            this.j = i12;
            bArr[i11] = (byte) (((int) (j >> 32)) & 255);
            int i13 = i7 + 6;
            this.j = i13;
            bArr[i12] = (byte) (((int) (j >> 40)) & 255);
            int i14 = i7 + 7;
            this.j = i14;
            bArr[i13] = (byte) (((int) (j >> 48)) & 255);
            this.j = i7 + 8;
            bArr[i14] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e7) {
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f11802i), 1), e7, 2);
        }
    }

    public final void K0(int i7) throws Z4.b {
        if (i7 >= 0) {
            M0(i7);
        } else {
            O0(i7);
        }
    }

    public final void L0(int i7, int i8) throws Z4.b {
        M0((i7 << 3) | i8);
    }

    public final void M0(int i7) throws Z4.b {
        while (true) {
            int i8 = i7 & (-128);
            byte[] bArr = this.f11801h;
            if (i8 == 0) {
                int i9 = this.j;
                this.j = i9 + 1;
                bArr[i9] = (byte) i7;
                return;
            } else {
                try {
                    int i10 = this.j;
                    this.j = i10 + 1;
                    bArr[i10] = (byte) ((i7 & 127) | 128);
                    i7 >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f11802i), 1), e7, 2);
                }
            }
            throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(this.f11802i), 1), e7, 2);
        }
    }

    public final void N0(int i7, long j) throws Z4.b {
        L0(i7, 0);
        O0(j);
    }

    public final void O0(long j) throws Z4.b {
        byte[] bArr = this.f11801h;
        boolean z4 = f11799l;
        int i7 = this.f11802i;
        if (z4 && i7 - this.j >= 10) {
            while ((j & (-128)) != 0) {
                int i8 = this.j;
                this.j = i8 + 1;
                o0.o(bArr, i8, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i9 = this.j;
            this.j = i9 + 1;
            o0.o(bArr, i9, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i10 = this.j;
                this.j = i10 + 1;
                bArr[i10] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new Z4.b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.j), Integer.valueOf(i7), 1), e7, 2);
            }
        }
        int i11 = this.j;
        this.j = i11 + 1;
        bArr[i11] = (byte) j;
    }
}

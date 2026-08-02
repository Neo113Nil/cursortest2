package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class hi extends java.io.FilterInputStream {
    private final int[] f;
    private final byte[][] g;
    private final int[] h;
    private final byte[] i;
    private final int j;
    private int k;
    private int l;
    private final int m;
    private final int n;

    /* renamed from: o, reason: collision with root package name */
    private final byte[] f3626o;
    private int p;
    private int t;
    private static final byte[] c = com.facetec.sdk.hd.b;
    private static final int[] d = com.facetec.sdk.hd.c;
    private static final int[] b = com.facetec.sdk.hd.d;
    private static final int[] e = com.facetec.sdk.hd.f3624a;

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f3625a = com.facetec.sdk.hd.e;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public hi(java.io.InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i, bArr, bArr2, (byte) 0);
    }

    private hi(java.io.InputStream inputStream, int i, byte[] bArr, byte[][] bArr2, byte b2) {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.f = new int[4];
        this.i = new byte[16];
        this.f3626o = new byte[16];
        this.l = 1;
        this.k = Integer.MAX_VALUE;
        this.t = 16;
        this.p = 16;
        this.j = i;
        this.h = com.facetec.sdk.hd.d(bArr, i);
        byte[][] bArr3 = new byte[bArr2.length][];
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr3[i2] = new byte[bArr2[i2].length];
            int i3 = 0;
            while (true) {
                byte[] bArr4 = bArr2[i2];
                if (i3 < bArr4.length) {
                    bArr3[i2][bArr4[i3]] = (byte) i3;
                    i3++;
                }
            }
        }
        this.g = bArr3;
        this.m = 100;
        this.n = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        a();
        int i = this.t;
        if (i >= this.p) {
            return -1;
        }
        byte[] bArr = this.f3626o;
        this.t = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            a();
            int i5 = this.t;
            if (i5 >= this.p) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.f3626o;
            this.t = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws java.io.IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws java.io.IOException {
        a();
        return this.p - this.t;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        synchronized (this) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws java.io.IOException {
        synchronized (this) {
        }
    }

    private int a() throws java.io.IOException {
        if (this.k == Integer.MAX_VALUE) {
            this.k = ((java.io.FilterInputStream) this).in.read();
        }
        if (this.t == 16) {
            byte[] bArr = this.i;
            int i = this.k;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((java.io.FilterInputStream) this).in.read(this.i, i2, 16 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 16);
            if (i2 < 16) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i3 = this.m;
            if (i3 == this.n) {
                e(this.i, this.f3626o);
            } else {
                if (this.l <= i3) {
                    e(this.i, this.f3626o);
                } else {
                    byte[] bArr2 = this.i;
                    java.lang.System.arraycopy(bArr2, 0, this.f3626o, 0, bArr2.length);
                }
                e();
            }
            int read2 = ((java.io.FilterInputStream) this).in.read();
            this.k = read2;
            this.t = 0;
            this.p = read2 < 0 ? 16 - (this.f3626o[15] & 255) : 16;
        }
        return this.p;
    }

    private void e(byte[] bArr, byte[] bArr2) {
        com.facetec.sdk.hi hiVar = this;
        int[] iArr = hiVar.f;
        char c2 = 0;
        byte b2 = bArr[0];
        char c3 = 1;
        byte b3 = bArr[1];
        char c4 = 2;
        byte b4 = bArr[2];
        char c5 = 3;
        byte b5 = bArr[3];
        int[] iArr2 = hiVar.h;
        iArr[0] = ((((b2 << com.google.common.base.Ascii.CAN) | ((b3 & 255) << 16)) | ((b4 & 255) << 8)) | (b5 & 255)) ^ iArr2[0];
        iArr[1] = ((((bArr[4] << com.google.common.base.Ascii.CAN) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << com.google.common.base.Ascii.CAN) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ ((((bArr[12] << com.google.common.base.Ascii.CAN) | ((bArr[13] & 255) << 16)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i = 4;
        int i2 = 1;
        while (i2 < hiVar.j) {
            int[] iArr3 = d;
            int[] iArr4 = hiVar.f;
            byte[][] bArr3 = hiVar.g;
            byte[] bArr4 = bArr3[c2];
            int i3 = iArr3[iArr4[bArr4[c2]] >>> 24];
            int[] iArr5 = b;
            byte[] bArr5 = bArr3[c3];
            int i4 = iArr5[(iArr4[bArr5[c2]] >>> 16) & 255];
            int[] iArr6 = e;
            byte[] bArr6 = bArr3[c4];
            int i5 = iArr6[(iArr4[bArr6[c2]] >>> 8) & 255];
            int[] iArr7 = f3625a;
            byte[] bArr7 = bArr3[c5];
            int i6 = iArr7[iArr4[bArr7[c2]] & 255];
            int[] iArr8 = hiVar.h;
            int i7 = iArr8[i];
            int i8 = iArr3[iArr4[bArr4[c3]] >>> 24];
            int i9 = iArr5[(iArr4[bArr5[c3]] >>> 16) & 255];
            int i10 = iArr6[(iArr4[bArr6[c3]] >>> 8) & 255];
            int i11 = iArr7[iArr4[bArr7[c3]] & 255];
            int i12 = iArr8[i + 1];
            int i13 = iArr3[iArr4[bArr4[c4]] >>> 24];
            int i14 = iArr5[(iArr4[bArr5[c4]] >>> 16) & 255];
            int i15 = iArr6[(iArr4[bArr6[c4]] >>> 8) & 255];
            int i16 = iArr7[iArr4[bArr7[2]] & 255];
            int i17 = iArr8[i + 2];
            int i18 = iArr3[iArr4[bArr4[3]] >>> 24];
            int i19 = iArr5[(iArr4[bArr5[3]] >>> 16) & 255];
            int i20 = i2;
            int i21 = iArr6[(iArr4[bArr6[3]] >>> 8) & 255];
            int i22 = iArr7[iArr4[bArr7[3]] & 255];
            int i23 = iArr8[i + 3];
            iArr4[0] = (((i3 ^ i4) ^ i5) ^ i6) ^ i7;
            iArr4[1] = ((i10 ^ (i8 ^ i9)) ^ i11) ^ i12;
            iArr4[2] = (((i13 ^ i14) ^ i15) ^ i16) ^ i17;
            iArr4[3] = (((i19 ^ i18) ^ i21) ^ i22) ^ i23;
            i2 = i20 + 1;
            i += 4;
            hiVar = this;
            c2 = 0;
            c3 = 1;
            c4 = 2;
            c5 = 3;
        }
        int[] iArr9 = hiVar.h;
        int i24 = iArr9[i];
        byte[] bArr8 = c;
        int[] iArr10 = hiVar.f;
        byte[][] bArr9 = hiVar.g;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i24 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i24 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i24 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (i24 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i25 = iArr9[i + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i25 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i25 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i25 >>> 8));
        bArr2[7] = (byte) (i25 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i26 = iArr9[i + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i26 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i26 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i26 >>> 8));
        bArr2[11] = (byte) (i26 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i27 = iArr9[i + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i27 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i27 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i27 >>> 8));
        bArr2[15] = (byte) (i27 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    private void e() {
        int i = this.l;
        if (i < this.n) {
            this.l = i + 1;
        } else {
            this.l = 1;
        }
    }
}

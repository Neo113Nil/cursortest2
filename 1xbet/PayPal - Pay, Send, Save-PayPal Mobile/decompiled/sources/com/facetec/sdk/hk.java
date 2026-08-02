package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class hk extends java.io.FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private static final short f3627a = (short) ((java.lang.Math.sqrt(5.0d) - 1.0d) * java.lang.Math.pow(2.0d, 15.0d));
    private int b;
    private byte[] c;
    private byte[] d;
    private byte[] e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private final int k;
    private int l;
    private int m;
    private final int n;

    /* renamed from: o, reason: collision with root package name */
    private int f3628o;
    private int r;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public hk(java.io.InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
        this(inputStream, iArr, i, bArr, i2, i3, (byte) 0);
    }

    private hk(java.io.InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, byte b) throws java.io.IOException {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.g = Integer.MAX_VALUE;
        this.r = 1;
        this.e = new byte[8];
        this.d = new byte[8];
        this.c = new byte[8];
        this.b = 8;
        this.f = 8;
        this.j = java.lang.Math.min(java.lang.Math.max(i2, 5), 16);
        this.h = i3;
        if (i3 == 3) {
            java.lang.System.arraycopy(bArr, 0, this.d, 0, 8);
        }
        long j = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i != 0) {
            int i4 = (int) j;
            this.i = i4;
            this.l = i4 * i;
            this.f3628o = i ^ i4;
            this.m = (int) (j >> 32);
        } else {
            this.i = (int) j;
            long j2 = j >> 3;
            long j3 = f3627a;
            this.l = (int) ((j3 * j2) >> 32);
            this.f3628o = (int) (j >> 32);
            this.m = (int) (j2 + j3);
        }
        this.n = 100;
        this.k = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        b();
        int i = this.b;
        if (i >= this.f) {
            return -1;
        }
        byte[] bArr = this.e;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            b();
            int i5 = this.b;
            if (i5 >= this.f) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.e;
            this.b = i5 + 1;
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
        b();
        return this.f - this.b;
    }

    private void e() {
        if (this.h == 3) {
            byte[] bArr = this.e;
            java.lang.System.arraycopy(bArr, 0, this.c, 0, bArr.length);
        }
        byte[] bArr2 = this.e;
        int i = ((bArr2[0] << com.google.common.base.Ascii.CAN) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << com.google.common.base.Ascii.CAN)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.j;
            if (i3 >= i4) {
                break;
            }
            int i5 = (i4 - i3) * f3627a;
            i2 -= ((i5 + i) ^ ((i << 4) + this.f3628o)) ^ ((i >>> 5) + this.m);
            i -= (((i2 << 4) + this.i) ^ (i5 + i2)) ^ ((i2 >>> 5) + this.l);
            i3++;
        }
        byte[] bArr3 = this.e;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.h == 3) {
            for (int i6 = 0; i6 < 8; i6++) {
                byte[] bArr4 = this.e;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.d[i6]);
            }
            byte[] bArr5 = this.c;
            java.lang.System.arraycopy(bArr5, 0, this.d, 0, bArr5.length);
        }
    }

    private int b() throws java.io.IOException {
        if (this.g == Integer.MAX_VALUE) {
            this.g = ((java.io.FilterInputStream) this).in.read();
        }
        if (this.b == 8) {
            byte[] bArr = this.e;
            int i = this.g;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((java.io.FilterInputStream) this).in.read(this.e, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i3 = this.n;
            if (i3 == this.k) {
                e();
            } else {
                if (this.r <= i3) {
                    e();
                }
                d();
            }
            int read2 = ((java.io.FilterInputStream) this).in.read();
            this.g = read2;
            this.b = 0;
            this.f = read2 < 0 ? 8 - (this.e[7] & 255) : 8;
        }
        return this.f;
    }

    private void d() {
        int i = this.r;
        if (i < this.k) {
            this.r = i + 1;
        } else {
            this.r = 1;
        }
    }
}

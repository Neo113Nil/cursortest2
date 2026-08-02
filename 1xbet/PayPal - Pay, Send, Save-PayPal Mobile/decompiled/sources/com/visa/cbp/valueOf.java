package com.visa.cbp;

/* loaded from: classes5.dex */
public final class valueOf extends java.io.FilterInputStream {
    private int getHighSpeedVideoSizesFor;
    private final byte[] getInputFormats;
    private final int[] getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private final byte[] getOutputMinFrameDurationlomOqCM;
    private final int getOutputSizes;
    private final byte[][] getOutputStallDuration;
    private final int[] getOutputStallDurationlomOqCM;
    private static final byte[] getHighSpeedVideoSizes = com.visa.cbp.setTokenInfo.getHighSpeedVideoSizes;
    private static final int[] getHighSpeedVideoFpsRanges = com.visa.cbp.setTokenInfo.getHighSpeedVideoFpsRangesFor;
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = com.visa.cbp.setTokenInfo.getHighSpeedVideoFpsRanges;
    private static final int[] Camera2StreamConfigurationMap = com.visa.cbp.setTokenInfo.getHighResolutionOutputSizeshNQ4ISI;
    private static final int[] getHighSpeedVideoFpsRangesFor = com.visa.cbp.setTokenInfo.Camera2StreamConfigurationMap;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public valueOf(java.io.InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.getInputSizeshNQ4ISI = new int[4];
        this.getInputFormats = new byte[16];
        this.getOutputMinFrameDurationlomOqCM = new byte[16];
        this.getOutputMinFrameDuration = Integer.MAX_VALUE;
        this.getOutputFormats = 16;
        this.getHighSpeedVideoSizesFor = 16;
        this.getOutputSizes = i;
        this.getOutputStallDurationlomOqCM = com.visa.cbp.setTokenInfo.getHighSpeedVideoSizes(bArr, i);
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
        this.getOutputStallDuration = bArr3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        getHighSpeedVideoSizes();
        int i = this.getOutputFormats;
        if (i >= this.getHighSpeedVideoSizesFor) {
            return -1;
        }
        byte[] bArr = this.getOutputMinFrameDurationlomOqCM;
        this.getOutputFormats = i + 1;
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
            getHighSpeedVideoSizes();
            int i5 = this.getOutputFormats;
            if (i5 >= this.getHighSpeedVideoSizesFor) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.getOutputMinFrameDurationlomOqCM;
            this.getOutputFormats = i5 + 1;
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
        getHighSpeedVideoSizes();
        return this.getHighSpeedVideoSizesFor - this.getOutputFormats;
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

    private int getHighSpeedVideoSizes() throws java.io.IOException {
        com.visa.cbp.valueOf valueof = this;
        if (valueof.getOutputMinFrameDuration == Integer.MAX_VALUE) {
            valueof.getOutputMinFrameDuration = ((java.io.FilterInputStream) valueof).in.read();
        }
        if (valueof.getOutputFormats == 16) {
            byte[] bArr = valueof.getInputFormats;
            int i = valueof.getOutputMinFrameDuration;
            char c = 0;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            char c2 = 1;
            int i2 = 1;
            do {
                int read = ((java.io.FilterInputStream) valueof).in.read(valueof.getInputFormats, i2, 16 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 16);
            if (i2 < 16) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            byte[] bArr2 = valueof.getInputFormats;
            byte[] bArr3 = valueof.getOutputMinFrameDurationlomOqCM;
            int[] iArr = valueof.getInputSizeshNQ4ISI;
            byte b = bArr2[0];
            byte b2 = bArr2[1];
            char c3 = 2;
            byte b3 = bArr2[2];
            char c4 = 3;
            byte b4 = bArr2[3];
            int[] iArr2 = valueof.getOutputStallDurationlomOqCM;
            iArr[0] = ((((b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16)) | ((b3 & 255) << 8)) | (b4 & 255)) ^ iArr2[0];
            iArr[1] = ((((bArr2[4] << com.google.common.base.Ascii.CAN) | ((bArr2[5] & 255) << 16)) | ((bArr2[6] & 255) << 8)) | (bArr2[7] & 255)) ^ iArr2[1];
            iArr[2] = ((((bArr2[8] << com.google.common.base.Ascii.CAN) | ((bArr2[9] & 255) << 16)) | ((bArr2[10] & 255) << 8)) | (bArr2[11] & 255)) ^ iArr2[2];
            iArr[3] = ((bArr2[15] & 255) | (((bArr2[12] << com.google.common.base.Ascii.CAN) | ((bArr2[13] & 255) << 16)) | ((bArr2[14] & 255) << 8))) ^ iArr2[3];
            int i3 = 1;
            int i4 = 4;
            while (i3 < valueof.getOutputSizes) {
                int[] iArr3 = getHighSpeedVideoFpsRanges;
                int[] iArr4 = valueof.getInputSizeshNQ4ISI;
                byte[][] bArr4 = valueof.getOutputStallDuration;
                byte[] bArr5 = bArr4[c];
                int i5 = iArr3[iArr4[bArr5[c]] >>> 24];
                int[] iArr5 = getHighResolutionOutputSizeshNQ4ISI;
                byte[] bArr6 = bArr4[c2];
                int i6 = iArr5[(iArr4[bArr6[c]] >>> 16) & 255];
                int[] iArr6 = Camera2StreamConfigurationMap;
                byte[] bArr7 = bArr4[c3];
                int i7 = iArr6[(iArr4[bArr7[c]] >>> 8) & 255];
                int[] iArr7 = getHighSpeedVideoFpsRangesFor;
                byte[] bArr8 = bArr4[c4];
                int i8 = iArr7[iArr4[bArr8[c]] & 255];
                int[] iArr8 = valueof.getOutputStallDurationlomOqCM;
                int i9 = iArr8[i4];
                int i10 = iArr3[iArr4[bArr5[c2]] >>> 24];
                int i11 = iArr5[(iArr4[bArr6[c2]] >>> 16) & 255];
                int i12 = iArr6[(iArr4[bArr7[c2]] >>> 8) & 255];
                int i13 = iArr7[iArr4[bArr8[c2]] & 255];
                int i14 = iArr8[i4 + 1];
                int i15 = iArr3[iArr4[bArr5[c3]] >>> 24];
                int i16 = iArr5[(iArr4[bArr6[c3]] >>> 16) & 255];
                int i17 = iArr6[(iArr4[bArr7[c3]] >>> 8) & 255];
                byte[] bArr9 = bArr3;
                int i18 = iArr7[iArr4[bArr8[2]] & 255];
                int i19 = iArr8[i4 + 2];
                int i20 = iArr3[iArr4[bArr5[3]] >>> 24];
                int i21 = iArr5[(iArr4[bArr6[3]] >>> 16) & 255];
                int i22 = i3;
                int i23 = iArr6[(iArr4[bArr7[3]] >>> 8) & 255];
                int i24 = iArr7[iArr4[bArr8[3]] & 255];
                int i25 = iArr8[i4 + 3];
                iArr4[0] = (i8 ^ (i7 ^ (i5 ^ i6))) ^ i9;
                iArr4[1] = ((i12 ^ (i10 ^ i11)) ^ i13) ^ i14;
                iArr4[2] = (((i15 ^ i16) ^ i17) ^ i18) ^ i19;
                iArr4[3] = (((i21 ^ i20) ^ i23) ^ i24) ^ i25;
                i3 = i22 + 1;
                i4 += 4;
                bArr3 = bArr9;
                c2 = 1;
                c = 0;
                c3 = 2;
                c4 = 3;
                valueof = this;
            }
            byte[] bArr10 = bArr3;
            int[] iArr9 = valueof.getOutputStallDurationlomOqCM;
            int i26 = iArr9[i4];
            byte[] bArr11 = getHighSpeedVideoSizes;
            int[] iArr10 = valueof.getInputSizeshNQ4ISI;
            byte[][] bArr12 = valueof.getOutputStallDuration;
            byte[] bArr13 = bArr12[0];
            bArr10[0] = (byte) (bArr11[iArr10[bArr13[0]] >>> 24] ^ (i26 >>> 24));
            byte[] bArr14 = bArr12[1];
            bArr10[1] = (byte) (bArr11[(iArr10[bArr14[0]] >>> 16) & 255] ^ (i26 >>> 16));
            byte[] bArr15 = bArr12[2];
            bArr10[2] = (byte) (bArr11[(iArr10[bArr15[0]] >>> 8) & 255] ^ (i26 >>> 8));
            byte[] bArr16 = bArr12[3];
            bArr10[3] = (byte) (i26 ^ bArr11[iArr10[bArr16[0]] & 255]);
            int i27 = iArr9[i4 + 1];
            bArr10[4] = (byte) (bArr11[iArr10[bArr13[1]] >>> 24] ^ (i27 >>> 24));
            bArr10[5] = (byte) (bArr11[(iArr10[bArr14[1]] >>> 16) & 255] ^ (i27 >>> 16));
            bArr10[6] = (byte) (bArr11[(iArr10[bArr15[1]] >>> 8) & 255] ^ (i27 >>> 8));
            bArr10[7] = (byte) (i27 ^ bArr11[iArr10[bArr16[1]] & 255]);
            int i28 = iArr9[i4 + 2];
            bArr10[8] = (byte) (bArr11[iArr10[bArr13[2]] >>> 24] ^ (i28 >>> 24));
            bArr10[9] = (byte) (bArr11[(iArr10[bArr14[2]] >>> 16) & 255] ^ (i28 >>> 16));
            bArr10[10] = (byte) (bArr11[(iArr10[bArr15[2]] >>> 8) & 255] ^ (i28 >>> 8));
            bArr10[11] = (byte) (i28 ^ bArr11[iArr10[bArr16[2]] & 255]);
            int i29 = iArr9[i4 + 3];
            bArr10[12] = (byte) (bArr11[iArr10[bArr13[3]] >>> 24] ^ (i29 >>> 24));
            bArr10[13] = (byte) (bArr11[(iArr10[bArr14[3]] >>> 16) & 255] ^ (i29 >>> 16));
            bArr10[14] = (byte) (bArr11[(iArr10[bArr15[3]] >>> 8) & 255] ^ (i29 >>> 8));
            bArr10[15] = (byte) (i29 ^ bArr11[iArr10[bArr16[3]] & 255]);
            int read2 = ((java.io.FilterInputStream) valueof).in.read();
            valueof.getOutputMinFrameDuration = read2;
            valueof.getOutputFormats = 0;
            valueof.getHighSpeedVideoSizesFor = read2 < 0 ? 16 - (valueof.getOutputMinFrameDurationlomOqCM[15] & 255) : 16;
        }
        return valueof.getHighSpeedVideoSizesFor;
    }
}

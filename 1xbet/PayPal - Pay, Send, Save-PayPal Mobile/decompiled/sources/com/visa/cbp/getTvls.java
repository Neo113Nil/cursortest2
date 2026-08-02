package com.visa.cbp;

/* loaded from: classes16.dex */
public final class getTvls extends java.io.FilterInputStream {
    private static final short getHighSpeedVideoFpsRangesFor = (short) ((java.lang.Math.sqrt(5.0d) - 1.0d) * java.lang.Math.pow(2.0d, 15.0d));
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public getTvls(java.io.InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.getOutputMinFrameDurationlomOqCM = Integer.MAX_VALUE;
        this.getOutputStallDuration = new byte[8];
        this.getHighSpeedVideoFpsRanges = new byte[8];
        this.getHighSpeedVideoSizes = new byte[8];
        this.getHighResolutionOutputSizeshNQ4ISI = 8;
        this.getInputFormats = 8;
        this.Camera2StreamConfigurationMap = java.lang.Math.min(java.lang.Math.max(i2, 5), 16);
        this.getOutputFormats = i3;
        if (i3 == 3) {
            java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoFpsRanges, 0, 8);
        }
        long j = ((iArr[0] & 4294967295L) << 32) | (4294967295L & iArr[1]);
        if (i != 0) {
            int i4 = (int) j;
            this.getOutputSizeshNQ4ISI = i4;
            this.getHighSpeedVideoSizesFor = i4 * i;
            this.getOutputMinFrameDuration = i4 ^ i;
            this.getInputSizeshNQ4ISI = (int) (j >> 32);
            return;
        }
        this.getOutputSizeshNQ4ISI = (int) j;
        long j2 = j >> 3;
        long j3 = getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = (int) ((j3 * j2) >> 32);
        this.getOutputMinFrameDuration = (int) (j >> 32);
        this.getInputSizeshNQ4ISI = (int) (j2 + j3);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        getHighSpeedVideoSizes();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i >= this.getInputFormats) {
            return -1;
        }
        byte[] bArr = this.getOutputStallDuration;
        this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getHighSpeedVideoSizes();
            int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i5 >= this.getInputFormats) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.getOutputStallDuration;
            this.getHighResolutionOutputSizeshNQ4ISI = i5 + 1;
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
        return this.getInputFormats - this.getHighResolutionOutputSizeshNQ4ISI;
    }

    private int getHighSpeedVideoSizes() throws java.io.IOException {
        if (this.getOutputMinFrameDurationlomOqCM == Integer.MAX_VALUE) {
            this.getOutputMinFrameDurationlomOqCM = ((java.io.FilterInputStream) this).in.read();
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == 8) {
            byte[] bArr = this.getOutputStallDuration;
            int i = this.getOutputMinFrameDurationlomOqCM;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((java.io.FilterInputStream) this).in.read(this.getOutputStallDuration, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            if (this.getOutputFormats == 3) {
                byte[] bArr2 = this.getOutputStallDuration;
                java.lang.System.arraycopy(bArr2, 0, this.getHighSpeedVideoSizes, 0, bArr2.length);
            }
            byte[] bArr3 = this.getOutputStallDuration;
            int i3 = ((bArr3[0] << com.google.common.base.Ascii.CAN) & (-16777216)) + ((bArr3[1] << 16) & 16711680) + ((bArr3[2] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr3[3] & 255);
            int i4 = ((-16777216) & (bArr3[4] << com.google.common.base.Ascii.CAN)) + (16711680 & (bArr3[5] << 16)) + (65280 & (bArr3[6] << 8)) + (bArr3[7] & 255);
            int i5 = 0;
            while (true) {
                int i6 = this.Camera2StreamConfigurationMap;
                if (i5 >= i6) {
                    break;
                }
                int i7 = (i6 - i5) * getHighSpeedVideoFpsRangesFor;
                i4 -= ((i7 + i3) ^ ((i3 << 4) + this.getOutputMinFrameDuration)) ^ ((i3 >>> 5) + this.getInputSizeshNQ4ISI);
                i3 -= (((i4 << 4) + this.getOutputSizeshNQ4ISI) ^ (i7 + i4)) ^ ((i4 >>> 5) + this.getHighSpeedVideoSizesFor);
                i5++;
            }
            byte[] bArr4 = this.getOutputStallDuration;
            bArr4[0] = (byte) (i3 >> 24);
            bArr4[1] = (byte) (i3 >> 16);
            bArr4[2] = (byte) (i3 >> 8);
            bArr4[3] = (byte) i3;
            bArr4[4] = (byte) (i4 >> 24);
            bArr4[5] = (byte) (i4 >> 16);
            bArr4[6] = (byte) (i4 >> 8);
            bArr4[7] = (byte) i4;
            if (this.getOutputFormats == 3) {
                for (int i8 = 0; i8 < 8; i8++) {
                    byte[] bArr5 = this.getOutputStallDuration;
                    bArr5[i8] = (byte) (bArr5[i8] ^ this.getHighSpeedVideoFpsRanges[i8]);
                }
                byte[] bArr6 = this.getHighSpeedVideoSizes;
                java.lang.System.arraycopy(bArr6, 0, this.getHighSpeedVideoFpsRanges, 0, bArr6.length);
            }
            int read2 = ((java.io.FilterInputStream) this).in.read();
            this.getOutputMinFrameDurationlomOqCM = read2;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getInputFormats = read2 < 0 ? 8 - (this.getOutputStallDuration[7] & 255) : 8;
        }
        return this.getInputFormats;
    }
}

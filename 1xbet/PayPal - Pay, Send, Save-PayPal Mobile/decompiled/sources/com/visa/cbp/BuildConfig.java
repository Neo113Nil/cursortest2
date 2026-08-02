package com.visa.cbp;

/* loaded from: classes5.dex */
public final class BuildConfig extends java.io.FilterInputStream {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private short getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private long[] getHighSpeedVideoSizesFor;
    private long[] getInputFormats;
    private int getOutputFormats;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public BuildConfig(java.io.InputStream inputStream, int i, int i2, short s, int i3, int i4) throws java.io.IOException {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.getHighResolutionOutputSizeshNQ4ISI = Integer.MAX_VALUE;
        int min = java.lang.Math.min(java.lang.Math.max((int) s, 4), 8);
        this.getHighSpeedVideoSizes = min;
        this.getHighSpeedVideoFpsRanges = new byte[min];
        this.getHighSpeedVideoSizesFor = new long[4];
        this.getInputFormats = new long[4];
        this.getOutputFormats = min;
        this.Camera2StreamConfigurationMap = min;
        this.getHighSpeedVideoSizesFor = com.visa.cbp.values.getHighSpeedVideoSizes(i ^ i4, min ^ i4);
        this.getInputFormats = com.visa.cbp.values.getHighSpeedVideoSizes(i2 ^ i4, i3 ^ i4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws java.io.IOException {
        getHighSpeedVideoFpsRanges();
        int i = this.getOutputFormats;
        if (i >= this.Camera2StreamConfigurationMap) {
            return -1;
        }
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        this.getOutputFormats = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getHighSpeedVideoFpsRanges();
            int i5 = this.getOutputFormats;
            if (i5 >= this.Camera2StreamConfigurationMap) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
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
        getHighSpeedVideoFpsRanges();
        return this.Camera2StreamConfigurationMap - this.getOutputFormats;
    }

    private int getHighSpeedVideoFpsRanges() throws java.io.IOException {
        int i;
        if (this.getHighResolutionOutputSizeshNQ4ISI == Integer.MAX_VALUE) {
            this.getHighResolutionOutputSizeshNQ4ISI = ((java.io.FilterInputStream) this).in.read();
        }
        if (this.getOutputFormats == this.getHighSpeedVideoSizes) {
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = ((java.io.FilterInputStream) this).in.read(this.getHighSpeedVideoFpsRanges, i3, this.getHighSpeedVideoSizes - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.getHighSpeedVideoSizes);
            if (i3 < this.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            long[] jArr = this.getHighSpeedVideoSizesFor;
            long[] jArr2 = this.getInputFormats;
            short s = this.getHighSpeedVideoFpsRangesFor;
            long j = jArr[s % 4];
            long j2 = jArr2[(s + 2) % 4];
            int i4 = (s + 3) % 4;
            jArr2[i4] = ((jArr[i4] * 2147483085) + j2) / androidx.collection.SieveCacheKt.NodeLinkMask;
            jArr[i4] = ((j * 2147483085) + j2) % androidx.collection.SieveCacheKt.NodeLinkMask;
            for (int i5 = 0; i5 < this.getHighSpeedVideoSizes; i5++) {
                this.getHighSpeedVideoFpsRanges[i5] = (byte) (r2[i5] ^ ((this.getHighSpeedVideoSizesFor[this.getHighSpeedVideoFpsRangesFor] >> (i5 << 3)) & 255));
            }
            this.getHighSpeedVideoFpsRangesFor = (short) ((this.getHighSpeedVideoFpsRangesFor + 1) % 4);
            int read2 = ((java.io.FilterInputStream) this).in.read();
            this.getHighResolutionOutputSizeshNQ4ISI = read2;
            this.getOutputFormats = 0;
            if (read2 < 0) {
                int i6 = this.getHighSpeedVideoSizes;
                i = i6 - (this.getHighSpeedVideoFpsRanges[i6 - 1] & 255);
            } else {
                i = this.getHighSpeedVideoSizes;
            }
            this.Camera2StreamConfigurationMap = i;
        }
        return this.Camera2StreamConfigurationMap;
    }
}

package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class BaseNCodecInputStream extends java.io.FilterInputStream {
    private final org.apache.commons.codec.binary.BaseNCodec.Context Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final org.apache.commons.codec.binary.BaseNCodec getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    protected BaseNCodecInputStream(java.io.InputStream inputStream, org.apache.commons.codec.binary.BaseNCodec baseNCodec, boolean z) {
        super(inputStream);
        this.getHighSpeedVideoSizes = new byte[1];
        this.Camera2StreamConfigurationMap = new org.apache.commons.codec.binary.BaseNCodec.Context();
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = baseNCodec;
        this.getHighSpeedVideoFpsRangesFor = new byte[z ? 4096 : 8192];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
        return !this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI ? 1 : 0;
    }

    public boolean isStrictDecoding() {
        return this.getHighSpeedVideoFpsRanges.isStrictDecoding();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        int read = read(this.getHighSpeedVideoSizes, 0, 1);
        while (read == 0) {
            read = read(this.getHighSpeedVideoSizes, 0, 1);
        }
        if (read <= 0) {
            return -1;
        }
        byte b = this.getHighSpeedVideoSizes[0];
        return b < 0 ? b + 256 : b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        java.util.Objects.requireNonNull(bArr, "array");
        if (i < 0 || i2 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i > bArr.length || i + i2 > bArr.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (!org.apache.commons.codec.binary.BaseNCodec.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap)) {
                int read = this.in.read(this.getHighSpeedVideoFpsRangesFor);
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, 0, read, this.Camera2StreamConfigurationMap);
                } else {
                    this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, 0, read, this.Camera2StreamConfigurationMap);
                }
            }
            int highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(bArr, i + i3, i2 - i3, this.Camera2StreamConfigurationMap);
            if (highSpeedVideoFpsRanges >= 0) {
                i3 += highSpeedVideoFpsRanges;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
        synchronized (this) {
            throw new java.io.IOException("mark/reset not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        int read;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Negative skip length: ".concat(java.lang.String.valueOf(j)));
        }
        byte[] bArr = new byte[512];
        long j2 = j;
        while (j2 > 0 && (read = read(bArr, 0, (int) java.lang.Math.min(512L, j2))) != -1) {
            j2 -= read;
        }
        return j - j2;
    }
}

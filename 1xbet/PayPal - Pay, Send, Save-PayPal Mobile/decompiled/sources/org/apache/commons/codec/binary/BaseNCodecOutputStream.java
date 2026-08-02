package org.apache.commons.codec.binary;

/* loaded from: classes17.dex */
public class BaseNCodecOutputStream extends java.io.FilterOutputStream {
    private final byte[] Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final org.apache.commons.codec.binary.BaseNCodec.Context getHighSpeedVideoFpsRanges;
    private final org.apache.commons.codec.binary.BaseNCodec getHighSpeedVideoFpsRangesFor;

    public BaseNCodecOutputStream(java.io.OutputStream outputStream, org.apache.commons.codec.binary.BaseNCodec baseNCodec, boolean z) {
        super(outputStream);
        this.Camera2StreamConfigurationMap = new byte[1];
        this.getHighSpeedVideoFpsRanges = new org.apache.commons.codec.binary.BaseNCodec.Context();
        this.getHighSpeedVideoFpsRangesFor = baseNCodec;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        eof();
        flush();
        this.out.close();
    }

    public void eof() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, 0, -1, this.getHighSpeedVideoFpsRanges);
        } else {
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, 0, -1, this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
        getHighSpeedVideoFpsRanges(true);
    }

    private void getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        byte[] bArr;
        int highSpeedVideoFpsRanges;
        int highSpeedVideoFpsRangesFor = org.apache.commons.codec.binary.BaseNCodec.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges);
        if (highSpeedVideoFpsRangesFor > 0 && (highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges((bArr = new byte[highSpeedVideoFpsRangesFor]), 0, highSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges)) > 0) {
            this.out.write(bArr, 0, highSpeedVideoFpsRanges);
        }
        if (z) {
            this.out.flush();
        }
    }

    public boolean isStrictDecoding() {
        return this.getHighSpeedVideoFpsRangesFor.isStrictDecoding();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        java.util.Objects.requireNonNull(bArr, "array");
        if (i < 0 || i2 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i > bArr.length || i + i2 > bArr.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i2 > 0) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(bArr, i, i2, this.getHighSpeedVideoFpsRanges);
            } else {
                this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(bArr, i, i2, this.getHighSpeedVideoFpsRanges);
            }
            getHighSpeedVideoFpsRanges(false);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }
}

package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
class IndefiniteLengthInputStream extends org.bouncycastle.asn1.LimitedInputStream {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoSizes;
    private boolean getInputSizeshNQ4ISI;

    final void getHighSpeedVideoFpsRanges(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
        getHighSpeedVideoFpsRanges();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.getInputSizeshNQ4ISI) {
            return -1;
        }
        int read = this.Camera2StreamConfigurationMap.read(bArr, i + 2, i2 - 2);
        if (read < 0) {
            throw new java.io.EOFException();
        }
        bArr[i] = (byte) this.getHighSpeedVideoSizes;
        bArr[i + 1] = (byte) this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap.read();
        int read2 = this.Camera2StreamConfigurationMap.read();
        this.getHighResolutionOutputSizeshNQ4ISI = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (getHighSpeedVideoFpsRanges()) {
            return -1;
        }
        int read = this.Camera2StreamConfigurationMap.read();
        if (read < 0) {
            throw new java.io.EOFException();
        }
        int i = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = read;
        return i;
    }

    private boolean getHighSpeedVideoFpsRanges() {
        if (!this.getInputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes == 0 && this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            this.getInputSizeshNQ4ISI = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }
        return this.getInputSizeshNQ4ISI;
    }

    IndefiniteLengthInputStream(java.io.InputStream inputStream, int i) throws java.io.IOException {
        super(inputStream, i);
        this.getInputSizeshNQ4ISI = false;
        this.getHighSpeedVideoFpsRanges = true;
        this.getHighSpeedVideoSizes = inputStream.read();
        int read = inputStream.read();
        this.getHighResolutionOutputSizeshNQ4ISI = read;
        if (read < 0) {
            throw new java.io.EOFException();
        }
        getHighSpeedVideoFpsRanges();
    }
}

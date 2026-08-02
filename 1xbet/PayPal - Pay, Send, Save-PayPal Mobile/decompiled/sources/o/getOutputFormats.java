package o;

/* loaded from: classes9.dex */
public class getOutputFormats extends java.io.FilterInputStream {
    private long[] Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private long[] getOutputFormats;
    private short getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public getOutputFormats(java.io.InputStream inputStream, int i, int i2, short s, int i3, int i4) throws java.io.IOException {
        this(inputStream, i, i2, s, i3, i4, 100, 100);
    }

    public getOutputFormats(java.io.InputStream inputStream, int i, int i2, short s, int i3, int i4, int i5, int i6) throws java.io.IOException {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.getHighSpeedVideoSizes = 1;
        this.getHighSpeedVideoSizesFor = Integer.MAX_VALUE;
        int min = java.lang.Math.min(java.lang.Math.max((int) s, 4), 8);
        this.getHighSpeedVideoFpsRanges = min;
        this.getInputSizeshNQ4ISI = new byte[min];
        this.Camera2StreamConfigurationMap = new long[4];
        this.getOutputFormats = new long[4];
        this.getInputFormats = min;
        this.getOutputMinFrameDurationlomOqCM = min;
        this.Camera2StreamConfigurationMap = o.getOutputStallDuration.getHighSpeedVideoFpsRanges(i ^ i4, min ^ i4);
        this.getOutputFormats = o.getOutputStallDuration.getHighSpeedVideoFpsRanges(i2 ^ i4, i3 ^ i4);
        this.getHighSpeedVideoFpsRangesFor = i5;
        this.getHighResolutionOutputSizeshNQ4ISI = i6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor();
        int i = this.getInputFormats;
        if (i >= this.getOutputMinFrameDurationlomOqCM) {
            return -1;
        }
        byte[] bArr = this.getInputSizeshNQ4ISI;
        this.getInputFormats = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getHighSpeedVideoFpsRangesFor();
            int i5 = this.getInputFormats;
            if (i5 >= this.getOutputMinFrameDurationlomOqCM) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.getInputSizeshNQ4ISI;
            this.getInputFormats = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws java.io.IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
        getHighSpeedVideoFpsRangesFor();
        return this.getOutputMinFrameDurationlomOqCM - this.getInputFormats;
    }

    private void getHighSpeedVideoFpsRanges() {
        o.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getOutputMinFrameDuration);
        for (int i = 0; i < this.getHighSpeedVideoFpsRanges; i++) {
            this.getInputSizeshNQ4ISI[i] = (byte) (r1[i] ^ ((this.Camera2StreamConfigurationMap[this.getOutputMinFrameDuration] >> (i * 8)) & 255));
        }
        this.getOutputMinFrameDuration = (short) ((this.getOutputMinFrameDuration + 1) % 4);
    }

    private int getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        int i;
        if (this.getHighSpeedVideoSizesFor == Integer.MAX_VALUE) {
            this.getHighSpeedVideoSizesFor = this.in.read();
        }
        if (this.getInputFormats == this.getHighSpeedVideoFpsRanges) {
            byte[] bArr = this.getInputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoSizesFor;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int read = this.in.read(this.getInputSizeshNQ4ISI, i3, this.getHighSpeedVideoFpsRanges - i3);
                if (read <= 0) {
                    break;
                }
                i3 += read;
            } while (i3 < this.getHighSpeedVideoFpsRanges);
            if (i3 < this.getHighSpeedVideoFpsRanges) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            if (i4 == this.getHighResolutionOutputSizeshNQ4ISI) {
                getHighSpeedVideoFpsRanges();
            } else {
                if (this.getHighSpeedVideoSizes <= i4) {
                    getHighSpeedVideoFpsRanges();
                }
                int i5 = this.getHighSpeedVideoSizes;
                if (i5 < this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoSizes = i5 + 1;
                } else {
                    this.getHighSpeedVideoSizes = 1;
                }
            }
            int read2 = this.in.read();
            this.getHighSpeedVideoSizesFor = read2;
            this.getInputFormats = 0;
            if (read2 < 0) {
                int i6 = this.getHighSpeedVideoFpsRanges;
                i = i6 - (this.getInputSizeshNQ4ISI[i6 - 1] & 255);
            } else {
                i = this.getHighSpeedVideoFpsRanges;
            }
            this.getOutputMinFrameDurationlomOqCM = i;
        }
        return this.getOutputMinFrameDurationlomOqCM;
    }
}

package o;

/* loaded from: classes9.dex */
public class getOutputSizes extends java.io.FilterInputStream {
    private static final short getHighSpeedVideoFpsRangesFor = (short) ((java.lang.Math.sqrt(5.0d) - 1.0d) * java.lang.Math.pow(2.0d, 15.0d));
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private final int getOutputSizeshNQ4ISI;
    private final int getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private int toString;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public getOutputSizes(java.io.InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
        this(inputStream, iArr, i, bArr, i2, i3, 100, 100);
    }

    public getOutputSizes(java.io.InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3, int i4, int i5) throws java.io.IOException {
        super(new java.io.BufferedInputStream(inputStream, 4096));
        this.getOutputMinFrameDuration = Integer.MAX_VALUE;
        this.toString = 1;
        this.Camera2StreamConfigurationMap = new byte[8];
        this.getHighSpeedVideoSizes = new byte[8];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[8];
        this.getHighSpeedVideoFpsRanges = 8;
        this.getOutputFormats = 8;
        this.getInputSizeshNQ4ISI = java.lang.Math.min(java.lang.Math.max(i2, 5), 16);
        this.getInputFormats = i3;
        if (i3 == 3) {
            java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoSizes, 0, 8);
        }
        long j = (iArr[1] & 4294967295L) | ((iArr[0] & 4294967295L) << 32);
        if (i != 0) {
            int i6 = (int) j;
            this.getHighSpeedVideoSizesFor = i6;
            this.getOutputSizes = i6 * i;
            this.getOutputStallDurationlomOqCM = i ^ i6;
            this.getOutputMinFrameDurationlomOqCM = (int) (j >> 32);
        } else {
            this.getHighSpeedVideoSizesFor = (int) j;
            long j2 = j >> 3;
            short s = getHighSpeedVideoFpsRangesFor;
            this.getOutputSizes = (int) ((s * j2) >> 32);
            this.getOutputStallDurationlomOqCM = (int) (j >> 32);
            this.getOutputMinFrameDurationlomOqCM = (int) (j2 + s);
        }
        this.getOutputStallDuration = i4;
        this.getOutputSizeshNQ4ISI = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        getHighSpeedVideoSizes();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i >= this.getOutputFormats) {
            return -1;
        }
        byte[] bArr = this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            getHighSpeedVideoSizes();
            int i5 = this.getHighSpeedVideoFpsRanges;
            if (i5 >= this.getOutputFormats) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = i5 + 1;
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
        getHighSpeedVideoSizes();
        return this.getOutputFormats - this.getHighSpeedVideoFpsRanges;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (this.getInputFormats == 3) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            java.lang.System.arraycopy(bArr, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr.length);
        }
        byte[] bArr2 = this.Camera2StreamConfigurationMap;
        int i = ((bArr2[0] << com.google.common.base.Ascii.CAN) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << com.google.common.base.Ascii.CAN)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.getInputSizeshNQ4ISI;
            if (i3 >= i4) {
                break;
            }
            short s = getHighSpeedVideoFpsRangesFor;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.getOutputStallDurationlomOqCM)) ^ ((i >>> 5) + this.getOutputMinFrameDurationlomOqCM);
            i -= (((i2 << 4) + this.getHighSpeedVideoSizesFor) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.getOutputSizes);
            i3++;
        }
        byte[] bArr3 = this.Camera2StreamConfigurationMap;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.getInputFormats == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.Camera2StreamConfigurationMap;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.getHighSpeedVideoSizes[i5]);
            }
            byte[] bArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.System.arraycopy(bArr5, 0, this.getHighSpeedVideoSizes, 0, bArr5.length);
        }
    }

    private int getHighSpeedVideoSizes() throws java.io.IOException {
        if (this.getOutputMinFrameDuration == Integer.MAX_VALUE) {
            this.getOutputMinFrameDuration = this.in.read();
        }
        if (this.getHighSpeedVideoFpsRanges == 8) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            int i = this.getOutputMinFrameDuration;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = this.in.read(this.Camera2StreamConfigurationMap, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new java.lang.IllegalStateException("unexpected block size");
            }
            int i3 = this.getOutputStallDuration;
            if (i3 == this.getOutputSizeshNQ4ISI) {
                getHighSpeedVideoFpsRangesFor();
            } else {
                if (this.toString <= i3) {
                    getHighSpeedVideoFpsRangesFor();
                }
                int i4 = this.toString;
                if (i4 < this.getOutputSizeshNQ4ISI) {
                    this.toString = i4 + 1;
                } else {
                    this.toString = 1;
                }
            }
            int read2 = this.in.read();
            this.getOutputMinFrameDuration = read2;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getOutputFormats = read2 < 0 ? 8 - (this.Camera2StreamConfigurationMap[7] & 255) : 8;
        }
        return this.getOutputFormats;
    }
}

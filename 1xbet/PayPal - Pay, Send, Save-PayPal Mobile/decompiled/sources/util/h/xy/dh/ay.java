package util.h.xy.dh;

/* loaded from: classes5.dex */
final class ay extends util.h.xy.dh.be {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private boolean Camera2StreamConfigurationMap;
    private int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private boolean getInputSizeshNQ4ISI;

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 5) % 128;
        if (!getHighSpeedVideoSizes()) {
            int read = this.getHighResolutionOutputSizeshNQ4ISI.read();
            if (read < 0) {
                throw new java.io.EOFException();
            }
            int i = this.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = read;
            return i;
        }
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = ((i2 | 7) << 1) - (i2 ^ 7);
        int i4 = i3 % 128;
        getHighSpeedVideoFpsRanges = i4;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoFpsRangesFor = (i4 + 105) % 128;
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i3 + 101) % 128;
        if (!this.getInputSizeshNQ4ISI) {
            int i4 = (((i3 | 77) << 1) - (i3 ^ 77)) % 128;
            getHighSpeedVideoFpsRangesFor = i4;
            if (i2 >= 3) {
                if (this.Camera2StreamConfigurationMap) {
                    getHighSpeedVideoFpsRanges = (i4 + 23) % 128;
                    getHighSpeedVideoFpsRanges = (((i4 | 75) << 1) - (i4 ^ 75)) % 128;
                    return -1;
                }
                java.io.InputStream inputStream = this.getHighResolutionOutputSizeshNQ4ISI;
                int i5 = -(-(i * com.knotapi.knot.utilities.Constants.ID_KROGER));
                int i6 = (i5 & 740) + (i5 | 740);
                int i7 = (i ^ 2) | (i & 2);
                int i8 = ~i;
                int i9 = -(-(((i7 ^ i8) | (i7 & i8)) * (-369)));
                int i10 = ~(i8 | 2);
                int i11 = ~i7;
                int i12 = (i8 ^ (-3)) | (i8 & (-3));
                int read = inputStream.read(bArr, (((((i6 | i9) << 1) - (i6 ^ i9)) + (((~i12) | i) * (-369))) - (~((((i11 ^ i10) | (i11 & i10)) | (~((i12 & i) | (i12 ^ i)))) * 369))) - 1, i2 - 2);
                if (read < 0) {
                    throw new java.io.EOFException();
                }
                bArr[i] = (byte) this.getHighSpeedVideoSizesFor;
                bArr[(i & 1) + (i | 1)] = (byte) this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizesFor = this.getHighResolutionOutputSizeshNQ4ISI.read();
                int read2 = this.getHighResolutionOutputSizeshNQ4ISI.read();
                this.getHighSpeedVideoSizes = read2;
                if (read2 < 0) {
                    throw new java.io.EOFException();
                }
                int i13 = read * (-1187);
                int i14 = (i13 & 1190) + (i13 | 1190);
                int i15 = ~((read ^ (-3)) | (read & (-3)));
                int i16 = ~((i8 ^ read) | (i8 & read));
                int i17 = -(-(((i16 ^ i15) | (i16 & i15)) * (-1188)));
                int i18 = ~read;
                int i19 = ~((i ^ i18) | (i & i18));
                int i20 = (i15 ^ i19) | (i15 & i19);
                int i21 = ~((i8 ^ 2) | (i8 & 2));
                int i22 = ~((i18 ^ i8) | (i8 & i18));
                int i23 = ~(i18 | 2);
                int i24 = (i23 ^ i22) | (i22 & i23);
                return ((((i14 & i17) + (i14 | i17)) + (((i20 ^ i21) | (i20 & i21)) * 594)) - (~(-(-(((i24 & i21) | (i21 ^ i24)) * 594))))) - 1;
            }
        }
        return super.read(bArr, i, i2);
    }

    private boolean getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (((i | 45) << 1) - (i ^ 45)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (!this.Camera2StreamConfigurationMap) {
            int i3 = i2 + 19;
            int i4 = i3 % 128;
            getHighSpeedVideoFpsRangesFor = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this.getInputSizeshNQ4ISI && this.getHighSpeedVideoSizesFor == 0) {
                int i5 = (i4 + 5) % 128;
                getHighSpeedVideoFpsRanges = i5;
                if (this.getHighSpeedVideoSizes == 0) {
                    int i6 = i5 + 1;
                    getHighSpeedVideoFpsRangesFor = i6 % 128;
                    if (i6 % 2 != 0) {
                        this.Camera2StreamConfigurationMap = false;
                        getHighSpeedVideoSizes(false);
                    } else {
                        this.Camera2StreamConfigurationMap = true;
                        getHighSpeedVideoSizes(true);
                    }
                }
            }
        }
        boolean z = this.Camera2StreamConfigurationMap;
        int i7 = getHighSpeedVideoFpsRanges;
        int i8 = (i7 ^ 47) + ((i7 & 47) << 1);
        getHighSpeedVideoFpsRangesFor = i8 % 128;
        if (i8 % 2 == 0) {
            return z;
        }
        throw new java.lang.ArithmeticException();
    }

    final void getHighSpeedVideoFpsRangesFor(boolean z) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 51) + (i | 51);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        this.getInputSizeshNQ4ISI = z;
        getHighSpeedVideoSizes();
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = (i3 & 103) + (i3 | 103);
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    ay(java.io.InputStream inputStream, int i) throws java.io.IOException {
        super(inputStream, i);
        this.Camera2StreamConfigurationMap = false;
        this.getInputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizesFor = inputStream.read();
        int read = inputStream.read();
        this.getHighSpeedVideoSizes = read;
        if (read < 0) {
            throw new java.io.EOFException();
        }
        getHighSpeedVideoSizes();
    }
}

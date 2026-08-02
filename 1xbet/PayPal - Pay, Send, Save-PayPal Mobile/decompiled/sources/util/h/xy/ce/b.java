package util.h.xy.ce;

/* loaded from: classes5.dex */
class b {
    static int getHighSpeedVideoFpsRanges = 1;
    static int getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 107) % 128;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoSizesFor;
    private final java.lang.String getInputFormats;
    private final java.lang.String getOutputFormats;
    private java.lang.String getOutputStallDurationlomOqCM;
    byte[] Camera2StreamConfigurationMap = null;
    byte[] getOutputMinFrameDuration = null;
    byte[] getInputSizeshNQ4ISI = null;
    byte[] getHighSpeedVideoSizes = null;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.getInputFormats = str;
        this.getOutputFormats = str2;
        this.getOutputStallDurationlomOqCM = str3;
        this.getHighResolutionOutputSizeshNQ4ISI = str4;
        this.getHighSpeedVideoSizesFor = str5;
    }

    public final byte[] getOutputFormats() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (((i | 47) << 1) - (i ^ 47)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        int i3 = (i2 + 25) % 128;
        getHighSpeedVideoFpsRanges = i3;
        int i4 = (i3 & 93) + (i3 | 93);
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges + 93;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            this.Camera2StreamConfigurationMap = (byte[]) bArr.clone();
        } else {
            this.Camera2StreamConfigurationMap = (byte[]) bArr.clone();
            throw new java.lang.ArithmeticException();
        }
    }

    public final byte[] Camera2StreamConfigurationMap() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 1) + (i | 1);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 != 0) {
            byte[] bArr = this.getOutputMinFrameDuration;
            if (bArr == null) {
                int i4 = ((i3 | 125) << 1) - (i3 ^ 125);
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }
            byte[] bArr2 = (byte[]) bArr.clone();
            int i5 = getHighSpeedVideoFpsRanges + 25;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            if (i5 % 2 == 0) {
                return bArr2;
            }
            throw new java.lang.ArithmeticException();
        }
        throw null;
    }

    public final void getHighSpeedVideoFpsRanges(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i ^ 13) + ((i & 13) << 1)) % 128;
        this.getOutputMinFrameDuration = (byte[]) bArr.clone();
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = ((i2 | 111) << 1) - (i2 ^ 111);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final byte[] getInputFormats() {
        int i = getHighSpeedVideoFpsRangesFor + 69;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            byte[] bArr = this.getInputSizeshNQ4ISI;
            if (bArr == null) {
                return null;
            }
            byte[] bArr2 = (byte[]) bArr.clone();
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 31) % 128;
            return bArr2;
        }
        throw null;
    }

    public final void Camera2StreamConfigurationMap(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i ^ 69) + ((i & 69) << 1)) % 128;
        this.getInputSizeshNQ4ISI = (byte[]) bArr.clone();
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 & 5) + (i2 | 5);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final java.lang.String getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoFpsRanges + 121;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return this.getOutputStallDurationlomOqCM;
        }
        throw null;
    }

    public final java.lang.String getInputSizeshNQ4ISI() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 23) << 1) - (i ^ 23);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = ((i | 15) << 1) - (i ^ 15);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String getHighSpeedVideoFpsRanges() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 85) + (i | 85);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRangesFor = (i + 87) % 128;
        return str;
    }

    public final byte[] getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i + 99) % 128;
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (bArr == null) {
            getHighSpeedVideoFpsRangesFor = (i + 37) % 128;
            return null;
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        int i2 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i2 | 11) << 1) - (i2 ^ 11)) % 128;
        return bArr2;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 51) % 128;
        this.getHighSpeedVideoSizes = (byte[]) bArr.clone();
        int i = getHighSpeedVideoFpsRanges + 27;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final int getOutputMinFrameDuration() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        int i4 = (i2 % 2 == 0 ? this.Camera2StreamConfigurationMap == null : this.Camera2StreamConfigurationMap == null) ? 0 : 1;
        if (this.getOutputMinFrameDuration != null) {
            int i5 = ((i3 & 35) + (i3 | 35)) % 128;
            getHighSpeedVideoFpsRanges = i5;
            i4++;
            getHighSpeedVideoFpsRangesFor = (i5 + 41) % 128;
        }
        if (this.getInputSizeshNQ4ISI != null) {
            i4 = ((i4 | 1) << 1) - (i4 ^ 1);
            int i6 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = ((i6 & 19) + (i6 | 19)) % 128;
        }
        if (this.getHighSpeedVideoSizes != null) {
            int i7 = getHighSpeedVideoFpsRanges;
            int i8 = i7 + 119;
            getHighSpeedVideoFpsRangesFor = i8 % 128;
            i4 = i8 % 2 != 0 ? i4 + 52 : i4 + 1;
            getHighSpeedVideoFpsRangesFor = (((i7 | 119) << 1) - (i7 ^ 119)) % 128;
        }
        int i9 = getHighSpeedVideoFpsRangesFor + 95;
        getHighSpeedVideoFpsRanges = i9 % 128;
        if (i9 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int getHighResolutionOutputSizeshNQ4ISI() {
        int i;
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 ^ 77) + ((i2 & 77) << 1);
        int i4 = i3 % 128;
        getHighSpeedVideoFpsRanges = i4;
        if (i3 % 2 != 0 ? this.Camera2StreamConfigurationMap == null : this.Camera2StreamConfigurationMap == null) {
            i = 0;
        } else {
            int i5 = ((i4 | 113) << 1) - (i4 ^ 113);
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            i = i5 % 2 != 0 ? 89 : 1;
        }
        if (this.getOutputMinFrameDuration != null) {
            int i6 = (i4 & 113) + (i4 | 113);
            getHighSpeedVideoFpsRangesFor = i6 % 128;
            i = i6 % 2 != 0 ? i + 96 : i + 1;
        }
        if (this.getHighSpeedVideoSizes != null) {
            int i7 = getHighSpeedVideoFpsRangesFor;
            int i8 = (i7 ^ 27) + ((i7 & 27) << 1);
            getHighSpeedVideoFpsRanges = i8 % 128;
            i = i8 % 2 == 0 ? ((i & 23) << 1) + (i ^ 23) : i + 1;
        }
        int i9 = getHighSpeedVideoFpsRanges + 55;
        getHighSpeedVideoFpsRangesFor = i9 % 128;
        if (i9 % 2 == 0) {
            return i;
        }
        throw new java.lang.ArithmeticException();
    }
}

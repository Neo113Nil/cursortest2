package util.h.xy.au;

/* loaded from: classes18.dex */
public final class mg {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getInputSizeshNQ4ISI;

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.lang.String m25192() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & 119) + (i | 119)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        java.lang.String str = this.getHighSpeedVideoSizes;
        int i3 = (i2 & 41) + (i2 | 41);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25193(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 63) + ((i & 63) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoSizes = str;
        } else {
            this.getHighSpeedVideoSizes = str;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m25195() {
        int i = Camera2StreamConfigurationMap + 85;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (i % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25191(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i | 65) << 1) - (i ^ 65);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(bArr, bArr.length);
        } else {
            this.getHighSpeedVideoFpsRanges = java.util.Arrays.copyOf(bArr, bArr.length);
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.lang.String m25196() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 55;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.getInputSizeshNQ4ISI;
        int i3 = i + 41;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25194(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i ^ 23) + ((i & 23) << 1)) % 128;
        Camera2StreamConfigurationMap = i2;
        this.getInputSizeshNQ4ISI = str;
        int i3 = (i2 & 91) + (i2 | 91);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final java.lang.String m25189() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i ^ 35) + ((i & 35) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i2 + 99) % 128;
        return str;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25190(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 101) + (i | 101);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoFpsRangesFor = str;
        } else {
            this.getHighSpeedVideoFpsRangesFor = str;
            throw new java.lang.ArithmeticException();
        }
    }
}

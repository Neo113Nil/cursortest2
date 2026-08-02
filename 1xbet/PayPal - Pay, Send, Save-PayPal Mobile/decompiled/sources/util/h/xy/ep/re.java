package util.h.xy.ep;

/* loaded from: classes18.dex */
public final class re extends util.h.xy.ep.md {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoSizes;
    private java.math.BigInteger getHighSpeedVideoSizesFor;
    private java.math.BigInteger getInputSizeshNQ4ISI;
    private java.math.BigInteger getOutputFormats;
    private java.math.BigInteger getOutputMinFrameDuration;

    /* renamed from: ͺ, reason: contains not printable characters */
    public final java.math.BigInteger m26682() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i & 115) + (i | 115)) % 128;
        Camera2StreamConfigurationMap = i2;
        java.math.BigInteger bigInteger = this.getOutputFormats;
        int i3 = (i2 & 59) + (i2 | 59);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final java.math.BigInteger m26680() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i & 77) + (i | 77)) % 128;
        java.math.BigInteger bigInteger = this.getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 121) + ((i & 121) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final java.math.BigInteger m26684() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 93;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.math.BigInteger bigInteger = this.getInputSizeshNQ4ISI;
        int i3 = ((i | 83) << 1) - (i ^ 83);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final java.math.BigInteger m26679() {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 77) << 1) - (i ^ 77)) % 128;
        java.math.BigInteger bigInteger = this.getOutputMinFrameDuration;
        getHighResolutionOutputSizeshNQ4ISI = (i + 35) % 128;
        return bigInteger;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.math.BigInteger m26683() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i + 7) % 128;
        java.math.BigInteger bigInteger = this.getHighSpeedVideoSizes;
        int i2 = ((i | 69) << 1) - (i ^ 69);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.math.BigInteger m26681() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 85;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.math.BigInteger bigInteger = this.getHighSpeedVideoSizesFor;
        int i3 = ((i | 89) << 1) - (i ^ 89);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }
}

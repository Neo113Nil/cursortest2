package util.h.xy.co;

/* loaded from: classes5.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;

    public ra(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoSizes = map;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final java.lang.String m25989() {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 119) << 1) - (i ^ 119)) % 128;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (i + 41) % 128;
        return str;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.lang.String m25990() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 57) + (i | 57);
        Camera2StreamConfigurationMap = i2 % 128;
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, java.lang.String> m25991() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 81;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return this.getHighSpeedVideoSizes;
        }
        throw null;
    }
}

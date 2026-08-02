package util.h.xy.au;

/* loaded from: classes5.dex */
public final class re extends com.gemalto.mfs.mwsdk.mobilegateway.MGConnectionConfiguration {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;
    private final int getOutputFormats;
    private final int getOutputMinFrameDuration;

    public re(java.lang.String str, int i, int i2, int i3, int i4) {
        this.getHighSpeedVideoSizes = str.getBytes();
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getOutputFormats = i3;
        this.getOutputMinFrameDuration = i4;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25206() {
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 113) % 128;
        byte[] bArr = (byte[]) this.getHighSpeedVideoSizes.clone();
        int i = getHighResolutionOutputSizeshNQ4ISI + 37;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int m25210() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
        return i;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m25209() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 31) + ((i & 31) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = this.getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 45) % 128;
        return i3;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m25207() {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i + 67) % 128;
        int i2 = this.getOutputFormats;
        int i3 = i + 15;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m25208() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 125;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return this.getOutputMinFrameDuration;
        }
        throw null;
    }
}

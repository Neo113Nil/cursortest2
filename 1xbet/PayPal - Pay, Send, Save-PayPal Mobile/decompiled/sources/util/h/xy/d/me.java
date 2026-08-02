package util.h.xy.d;

/* loaded from: classes5.dex */
public class me {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    final com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getInputSizeshNQ4ISI;
    private final java.lang.String getOutputFormats;

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 119) + ((i & 119) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public me(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.getHighResolutionOutputSizeshNQ4ISI = digitalizedCardState;
        this.getInputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getOutputFormats = str3;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m26214(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i ^ 67) + ((i & 67) << 1)) % 128;
        Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoSizes = str;
        getHighSpeedVideoFpsRangesFor = ((i2 ^ 33) + ((i2 & 33) << 1)) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public java.lang.String m26213() {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 117) % 128;
        java.lang.String str = this.getHighSpeedVideoSizes;
        int i2 = ((i | 93) << 1) - (i ^ 93);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public java.lang.String m26212() {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 91) % 128;
        java.lang.String str = this.getInputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i ^ 39) + ((i & 39) << 1)) % 128;
        return str;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public java.lang.String m26215() {
        int i = getHighSpeedVideoFpsRangesFor + 23;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return this.getHighSpeedVideoFpsRanges;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public java.lang.String m26217() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i | 101) << 1) - (i ^ 101)) % 128;
        java.lang.String str = this.getOutputFormats;
        getHighSpeedVideoFpsRangesFor = ((i ^ 65) + ((i & 65) << 1)) % 128;
        return str;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState m26216() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 35) + ((i & 35) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState = this.getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i & 47) + (i | 47)) % 128;
        return digitalizedCardState;
    }
}

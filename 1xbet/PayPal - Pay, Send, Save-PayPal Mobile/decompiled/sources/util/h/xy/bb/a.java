package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class a implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoSizes;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData
    public final java.lang.String getScheme() {
        int i = (getHighSpeedVideoFpsRangesFor + 67) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        int i2 = (i & 27) + (i | 27);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData
    public final java.lang.String getPayLoad() {
        int i = (getHighSpeedVideoFpsRangesFor + 11) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        java.lang.String str = this.getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (((i | 47) << 1) - (i ^ 47)) % 128;
        return str;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData
    public final java.lang.String getSource() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 47) << 1) - (i ^ 47)) % 128;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 121) + ((i & 121) << 1)) % 128;
        return str;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25297(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 75;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            this.Camera2StreamConfigurationMap = str;
            int i3 = i + 41;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.Camera2StreamConfigurationMap = str;
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25296(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 53) + (i | 53);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoSizes = str;
        } else {
            this.getHighSpeedVideoSizes = str;
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25298(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i ^ 67) + ((i & 67) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        this.getHighSpeedVideoFpsRanges = str;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
    }
}

package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class d implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.String Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getInputSizeshNQ4ISI;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod
    public final boolean isOtpRequired() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
        getHighSpeedVideoSizes = i;
        boolean z = this.getHighSpeedVideoFpsRanges;
        int i2 = i + 25;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25302(boolean z) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 7) + (i | 7);
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoFpsRanges = z;
            int i4 = (i3 & 71) + (i3 | 71);
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.getHighSpeedVideoFpsRanges = z;
        throw null;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod
    public final java.lang.String getId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f350);
        sb.append(util.h.xy.al.ra.f668);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getInputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod
    public final java.lang.String getType() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f350);
        sb.append(util.h.xy.al.ra.f645);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod
    public final java.lang.String getValue() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f350);
        sb.append(util.h.xy.al.ra.f474);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return str2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25304(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 121;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 == 0) {
            this.getInputSizeshNQ4ISI = str;
            int i3 = i2 + 9;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getInputSizeshNQ4ISI = str;
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25303(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 3) << 1) - (i ^ 3)) % 128;
        this.getHighSpeedVideoFpsRangesFor = str;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 85) + ((i & 85) << 1)) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25301(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i + 119) % 128;
        this.Camera2StreamConfigurationMap = str;
        getHighResolutionOutputSizeshNQ4ISI = (i + 99) % 128;
    }
}

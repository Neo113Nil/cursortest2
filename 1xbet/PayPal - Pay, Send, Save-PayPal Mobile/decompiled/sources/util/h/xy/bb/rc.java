package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class rc implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerData {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getOutputFormats;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerData
    public final java.lang.String getName() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f538);
        sb.append(util.h.xy.al.ra.f482);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 89) % 128;
        return str2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25359(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 121;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            this.getHighSpeedVideoFpsRanges = str;
        } else {
            this.getHighSpeedVideoFpsRanges = str;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerData
    public final java.lang.String getPhoneNumber() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f538);
        sb.append(util.h.xy.al.ra.f740);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        int i = getHighResolutionOutputSizeshNQ4ISI + 21;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25358(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 13;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            this.Camera2StreamConfigurationMap = str;
        } else {
            this.Camera2StreamConfigurationMap = str;
            throw null;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerData
    public final java.lang.String getWebsite() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f538);
        sb.append(util.h.xy.al.ra.f697);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputFormats;
        int i = getHighResolutionOutputSizeshNQ4ISI + 31;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25360(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 85) % 128;
        this.getOutputFormats = str;
        int i2 = i + 9;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerData
    public final java.lang.String getEmail() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f538);
        sb.append(util.h.xy.al.ra.f499);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
        return str2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25361(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 45;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            this.getHighSpeedVideoSizes = str;
        } else {
            this.getHighSpeedVideoSizes = str;
            throw null;
        }
    }
}

package util.h.xy.au;

/* loaded from: classes18.dex */
public final class ra implements com.gemalto.mfs.mwsdk.mobilegateway.MGCardLiteEntry {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLiteEntry
    public final java.lang.String getDigitalCardId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f445);
        sb.append(util.h.xy.al.ra.f753);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        int i = Camera2StreamConfigurationMap + 65;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return str2;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.au.ra m25197(java.lang.String str) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f445);
        sb.append(util.h.xy.al.ra.f765);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        this.getHighSpeedVideoFpsRangesFor = str;
        int i = getHighResolutionOutputSizeshNQ4ISI + 41;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGCardLiteEntry
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus getCardStatus() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f445);
        sb.append(util.h.xy.al.ra.f768);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus cardStatus = this.getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
        return cardStatus;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.au.ra m25198(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardStatus cardStatus) {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f445);
        sb.append(util.h.xy.al.ra.f771);
        util.h.xy.am.ma.m25027(str, sb.toString());
        this.getHighSpeedVideoFpsRanges = cardStatus;
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return this;
        }
        throw new java.lang.ArithmeticException();
    }
}

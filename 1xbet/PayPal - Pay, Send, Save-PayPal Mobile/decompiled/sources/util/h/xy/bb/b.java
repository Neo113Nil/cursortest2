package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class b implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtSize {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private int Camera2StreamConfigurationMap;
    private int getHighSpeedVideoSizes;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtSize
    public final int getWidth() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f380);
        sb.append(util.h.xy.al.ra.f697);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = this.Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
        return i;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtSize
    public final int getHeight() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f380);
        sb.append(util.h.xy.al.ra.f680);
        util.h.xy.am.ma.m25027(str, sb.toString());
        int i = this.getHighSpeedVideoSizes;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i2 & 27) + (i2 | 27)) % 128;
        return i;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25300(int i) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = ((i2 & 85) + (i2 | 85)) % 128;
        getHighSpeedVideoFpsRanges = i3;
        this.getHighSpeedVideoSizes = i;
        getHighResolutionOutputSizeshNQ4ISI = (i3 + 57) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25299(int i) {
        int i2 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (((i2 | 69) << 1) - (i2 ^ 69)) % 128;
        this.Camera2StreamConfigurationMap = i;
        int i3 = (i2 ^ 61) + ((i2 & 61) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}

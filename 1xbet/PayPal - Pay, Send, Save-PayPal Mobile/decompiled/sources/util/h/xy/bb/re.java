package util.h.xy.bb;

/* loaded from: classes18.dex */
public final class re implements com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ThreeDSecure {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ThreeDSecure
    public final java.lang.String getAcsMethod() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f535);
        sb.append(util.h.xy.al.ra.f756);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i ^ 85) + ((i & 85) << 1)) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ThreeDSecure
    public final java.lang.String getAcsUrl() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f535);
        sb.append(util.h.xy.al.ra.f739);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i & 33) + (i | 33)) % 128;
        return str2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ThreeDSecure
    public final java.lang.String getAcsQuery() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f535);
        sb.append(util.h.xy.al.ra.f761);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoSizes;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRanges = ((i & 49) + (i | 49)) % 128;
        return str2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25366(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (i + 3) % 128;
        this.Camera2StreamConfigurationMap = str;
        getHighResolutionOutputSizeshNQ4ISI = (i + 55) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25368(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i & 25) + (i | 25)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoFpsRangesFor = str;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 29) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25367(java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 47) % 128;
        this.getHighSpeedVideoSizes = str;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = ~(((-2133526449) ^ i) | (i & (-2133526449)));
        int i3 = ~(identityHashCode | (-1642875965));
        int i4 = ((i2 ^ i3) | (i2 & i3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
        int i5 = (i4 ^ (-288887884)) + ((i4 & (-288887884)) << 1);
        int i6 = ~((i ^ (-1642875965)) | (i & (-1642875965)) | 2133526448);
        int i7 = ~((identityHashCode ^ (-503513985)) | (identityHashCode & (-503513985)));
        int i8 = -(-(((i7 ^ i6) | (i7 & i6)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i9 = ~((identityHashCode2 ^ (-268969097)) | (identityHashCode2 & (-268969097)));
        int i10 = ~identityHashCode2;
        int i11 = ~(i10 | (-1795543589));
        int i12 = -(-(((i9 ^ i11) | (i9 & i11)) * 920));
        int i13 = ~((-277488844) | i10);
        if (((i5 | i8) << 1) - (i8 ^ i5) <= (((((-520788018) - (~i12)) - (~(((268969096 ^ i13) | (i13 & 268969096)) * 920))) - 1) - (~((((~((identityHashCode2 ^ (-8519748)) | (identityHashCode2 & (-8519748)))) | (~(((-268969097) ^ i10) | (i10 & (-268969097))))) | (~((identityHashCode2 & (-1795543589)) | (identityHashCode2 ^ (-1795543589))))) * 920))) - 1) {
            throw null;
        }
    }
}

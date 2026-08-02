package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes3.dex */
public class MGTransactionHistoryConfiguration implements com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration {
    public static final java.lang.String TAG = "MGTransactionHistoryConfiguration";
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 7;

    static {
        int i = 7 % 2;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration
    public java.lang.String getConfigurationName() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f672);
        sb.append(util.h.xy.al.ra.f448);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = util.h.xy.au.mf.f872;
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    /* loaded from: classes8.dex */
    public static class Builder {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoFpsRanges;

        public com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionHistoryConfiguration.Builder setConnectionParameters(java.lang.String str) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException {
            java.lang.String str2 = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f798);
            sb.append(util.h.xy.al.ra.f391);
            util.h.xy.am.ma.m25027(str2, sb.toString());
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f885);
            }
            if (!str.trim().startsWith(util.h.xy.al.ra.f363)) {
                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException(util.h.xy.ay.ma.f886);
            }
            this.getHighSpeedVideoFpsRanges = str;
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = (i & 77) + (i | 77);
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionHistoryConfiguration build() {
            java.lang.String str = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f798);
            sb.append(util.h.xy.al.ra.f429);
            util.h.xy.am.ma.m25027(str, sb.toString());
            if (this.getHighSpeedVideoFpsRanges == null) {
                throw new java.lang.IllegalStateException(util.h.xy.ay.ma.f885);
            }
            util.h.xy.au.e eVar = new util.h.xy.au.e(this.getHighSpeedVideoFpsRanges);
            int i = getHighResolutionOutputSizeshNQ4ISI + 57;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 != 0) {
                return eVar;
            }
            throw null;
        }
    }
}

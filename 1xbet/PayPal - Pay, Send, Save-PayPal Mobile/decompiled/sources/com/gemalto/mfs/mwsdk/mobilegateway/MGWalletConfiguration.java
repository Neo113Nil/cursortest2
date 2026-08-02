package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes3.dex */
public class MGWalletConfiguration implements com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration {
    public static final java.lang.String TAG = "MGWalletConfiguration";
    private static int getHighSpeedVideoFpsRanges = 120;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration
    public java.lang.String getConfigurationName() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f801);
        sb.append(util.h.xy.al.ra.f448);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = util.h.xy.au.mf.f873;
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        return str2;
    }

    /* loaded from: classes8.dex */
    public static class Builder {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private java.lang.String Camera2StreamConfigurationMap;
        private java.lang.String getHighSpeedVideoFpsRanges = null;

        public com.gemalto.mfs.mwsdk.mobilegateway.MGWalletConfiguration.Builder setWalletParameters(java.lang.String str) {
            java.lang.String str2 = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f318);
            sb.append(util.h.xy.al.ra.f527);
            util.h.xy.am.ma.m25027(str2, sb.toString());
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f891);
            }
            this.Camera2StreamConfigurationMap = str;
            java.lang.String str3 = com.gemalto.mfs.mwsdk.mobilegateway.MGWalletConfiguration.TAG;
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = (i ^ 5) + ((i & 5) << 1);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            throw new java.lang.ArithmeticException();
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.MGWalletConfiguration.Builder setWalletParameters(java.lang.String str, java.lang.String str2) {
            java.lang.String str3 = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f318);
            sb.append(util.h.xy.al.ra.f609);
            util.h.xy.am.ma.m25027(str3, sb.toString());
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f891);
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f909);
            }
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = str2;
            java.lang.String str4 = com.gemalto.mfs.mwsdk.mobilegateway.MGWalletConfiguration.TAG;
            int i = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 5) + (i | 5)) % 128;
            return this;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.MGWalletConfiguration.Builder setNotification(android.app.Notification notification) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = ((i ^ 55) + ((i & 55) << 1)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i2;
            int i3 = (i2 ^ 27) + ((i2 & 27) << 1);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.MGWalletConfiguration build() {
            java.lang.String str = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f318);
            sb.append(util.h.xy.al.ra.f429);
            util.h.xy.am.ma.m25027(str, sb.toString());
            if (android.text.TextUtils.isEmpty(this.Camera2StreamConfigurationMap)) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f891);
            }
            util.h.xy.au.rf rfVar = new util.h.xy.au.rf(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = (i ^ 25) + ((i & 25) << 1);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                return rfVar;
            }
            throw null;
        }
    }
}

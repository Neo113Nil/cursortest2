package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes3.dex */
public class MGConnectionConfiguration implements com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGConfiguration
    public java.lang.String getConfigurationName() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f661);
        sb.append(util.h.xy.al.ra.f448);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = util.h.xy.au.mf.f876;
        int i = getHighSpeedVideoFpsRangesFor + 97;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return str2;
        }
        throw null;
    }

    /* loaded from: classes8.dex */
    public static class Builder {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private java.lang.String getHighSpeedVideoSizesFor;
        private int getHighSpeedVideoFpsRangesFor = 10000;
        private int getHighSpeedVideoFpsRanges = 10000;
        private int getInputSizeshNQ4ISI = 0;
        private int getHighSpeedVideoSizes = 10000;

        public com.gemalto.mfs.mwsdk.mobilegateway.MGConnectionConfiguration.Builder setConnectionParameters(java.lang.String str, int i, int i2) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException {
            java.lang.String str2 = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f788);
            sb.append(util.h.xy.al.ra.f391);
            util.h.xy.am.ma.m25027(str2, sb.toString());
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f885);
            }
            if (!str.trim().startsWith(util.h.xy.al.ra.f363)) {
                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGConfigurationException(util.h.xy.ay.ma.f886);
            }
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f897);
            }
            if (i2 <= 0) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f904);
            }
            this.getHighSpeedVideoSizesFor = str;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = i2;
            return this;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.MGConnectionConfiguration.Builder setRetryParameters(int i, int i2) {
            java.lang.String str = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f788);
            sb.append(util.h.xy.al.ra.f323);
            util.h.xy.am.ma.m25027(str, sb.toString());
            if (i < 0) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f901);
            }
            if (i2 <= 0) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f903);
            }
            this.getInputSizeshNQ4ISI = i;
            this.getHighSpeedVideoSizes = i2;
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            int i4 = (i3 & 107) + (i3 | 107);
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public com.gemalto.mfs.mwsdk.mobilegateway.MGConnectionConfiguration build() {
            java.lang.String str = util.h.xy.al.ra.f281;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f788);
            sb.append(util.h.xy.al.ra.f429);
            util.h.xy.am.ma.m25027(str, sb.toString());
            if (this.getHighSpeedVideoSizesFor == null) {
                throw new java.lang.IllegalStateException(util.h.xy.ay.ma.f885);
            }
            if (this.getHighSpeedVideoFpsRangesFor <= 0) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f897);
            }
            if (this.getHighSpeedVideoFpsRanges <= 0) {
                throw new java.lang.IllegalArgumentException(util.h.xy.ay.ma.f904);
            }
            util.h.xy.au.re reVar = new util.h.xy.au.re(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
            int i = getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = ((i ^ 95) + ((i & 95) << 1)) % 128;
            return reVar;
        }
    }
}

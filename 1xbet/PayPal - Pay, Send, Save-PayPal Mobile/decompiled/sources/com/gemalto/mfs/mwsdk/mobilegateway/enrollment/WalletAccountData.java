package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public final class WalletAccountData {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.String Camera2StreamConfigurationMap;
    private com.gemalto.mfs.mwsdk.mobilegateway.enrollment.Address getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getInputFormats;

    public WalletAccountData(java.lang.String str) {
        this.getInputFormats = str;
    }

    public final java.lang.String getAccountId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f586);
        sb.append(util.h.xy.al.ra.f560);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getInputFormats;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 117) % 128;
        return str2;
    }

    public final void setAccountId(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 33) % 128;
        this.getInputFormats = str;
        getHighSpeedVideoSizes = (i + 125) % 128;
    }

    public final java.lang.String getName() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f586);
        sb.append(util.h.xy.al.ra.f482);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        int i = getHighSpeedVideoSizes + 41;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw null;
    }

    public final void setName(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 97) + ((i & 97) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoFpsRangesFor = str;
        } else {
            this.getHighSpeedVideoFpsRangesFor = str;
            throw null;
        }
    }

    public final java.lang.String getEmail() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f586);
        sb.append(util.h.xy.al.ra.f499);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 95) << 1) - (i ^ 95);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        throw null;
    }

    public final void setEmail(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 7) + (i | 7);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            this.Camera2StreamConfigurationMap = str;
        } else {
            this.Camera2StreamConfigurationMap = str;
            throw null;
        }
    }

    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.Address getAddress() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f586);
        sb.append(util.h.xy.al.ra.f539);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.Address address = this.getHighSpeedVideoFpsRanges;
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = ((i & 93) + (i | 93)) % 128;
        return address;
    }

    public final void setAddress(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.Address address) {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i + 1) % 128;
        this.getHighSpeedVideoFpsRanges = address;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 61) << 1) - (i ^ 61)) % 128;
    }
}

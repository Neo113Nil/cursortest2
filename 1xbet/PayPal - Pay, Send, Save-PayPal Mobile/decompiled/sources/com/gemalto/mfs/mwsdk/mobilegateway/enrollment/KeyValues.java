package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public final class KeyValues {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    public final void setKey(java.lang.String str) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 31) + (i | 31);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.getHighSpeedVideoFpsRangesFor = str;
            int i3 = (i & 25) + (i | 25);
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = str;
        throw null;
    }

    public final void setValue(java.lang.String str) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i & 61) + (i | 61)) % 128;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        int i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final java.lang.String getKey() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f488);
        sb.append(util.h.xy.al.ra.f442);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return str2;
    }

    public final java.lang.String getValue() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f488);
        sb.append(util.h.xy.al.ra.f474);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i & 19) + (i | 19)) % 128;
        return str2;
    }
}

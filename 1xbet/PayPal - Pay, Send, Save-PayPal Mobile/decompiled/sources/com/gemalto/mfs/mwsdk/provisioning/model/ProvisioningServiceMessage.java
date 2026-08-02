package com.gemalto.mfs.mwsdk.provisioning.model;

/* loaded from: classes3.dex */
public class ProvisioningServiceMessage {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 1;
    private final com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getOutputFormats;

    public ProvisioningServiceMessage(java.lang.String str, java.lang.String str2, java.lang.String[] strArr, com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification messageClassification) {
        this.getHighSpeedVideoFpsRangesFor = null;
        java.lang.String str3 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f599);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str3, sb.toString());
        this.getOutputFormats = str;
        this.getHighSpeedVideoFpsRanges = str2;
        if (strArr != null) {
            this.getHighSpeedVideoFpsRangesFor = (java.lang.String[]) strArr.clone();
        }
        this.Camera2StreamConfigurationMap = messageClassification;
    }

    public java.lang.String getMsgCode() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f599);
        sb.append(util.h.xy.al.ra.f559);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getOutputFormats;
        int i = getHighResolutionOutputSizeshNQ4ISI + 119;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return str2;
        }
        throw null;
    }

    public java.lang.String getMsgText() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f599);
        sb.append(util.h.xy.al.ra.f623);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        int i = getHighSpeedVideoSizes + 99;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return str2;
        }
        throw null;
    }

    public java.lang.String[] getMsgParams() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f599);
        sb.append(util.h.xy.al.ra.f624);
        util.h.xy.am.ma.m25027(str, sb.toString());
        java.lang.String[] strArr = this.getHighSpeedVideoFpsRangesFor;
        int i = getHighResolutionOutputSizeshNQ4ISI + 77;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return strArr;
        }
        throw null;
    }

    public com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification getMsgSeverity() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f599);
        sb.append(util.h.xy.al.ra.f640);
        util.h.xy.am.ma.m25027(str, sb.toString());
        com.gemalto.mfs.mwsdk.provisioning.model.MessageClassification messageClassification = this.Camera2StreamConfigurationMap;
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 125) + ((i & 125) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return messageClassification;
        }
        throw null;
    }
}

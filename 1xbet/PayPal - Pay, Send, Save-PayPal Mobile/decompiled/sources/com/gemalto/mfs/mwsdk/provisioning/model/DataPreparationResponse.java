package com.gemalto.mfs.mwsdk.provisioning.model;

/* loaded from: classes8.dex */
public class DataPreparationResponse {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRangesFor;

    public DataPreparationResponse(java.lang.String str, byte[] bArr) {
        java.lang.String str2 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f763);
        sb.append(util.h.xy.al.ra.f433);
        util.h.xy.am.ma.m25027(str2, sb.toString());
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = (byte[]) bArr.clone();
    }

    public java.lang.String getVasInstanceId() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f763);
        sb.append(util.h.xy.al.ra.f818);
        util.h.xy.am.ma.m25027(str, sb.toString());
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getVasProfile() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f763);
        sb.append(util.h.xy.al.ra.f813);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] bArr = (byte[]) this.getHighSpeedVideoFpsRangesFor.clone();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 97) % 128;
        return bArr;
    }
}

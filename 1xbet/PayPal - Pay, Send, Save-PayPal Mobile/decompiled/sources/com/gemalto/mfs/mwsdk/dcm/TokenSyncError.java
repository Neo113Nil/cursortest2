package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes8.dex */
public class TokenSyncError {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode getHighSpeedVideoSizes;

    public TokenSyncError(com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode tokenSyncErrorCode, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = tokenSyncErrorCode;
        java.lang.String str2 = util.h.xy.al.ra.f373;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(util.h.xy.al.ra.f644);
        sb.append(tokenSyncErrorCode);
        util.h.xy.am.ma.m25029(str2, sb.toString());
    }

    public com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode getErrorCode() {
        int i = (getHighSpeedVideoFpsRanges + 125) % 128;
        Camera2StreamConfigurationMap = i;
        com.gemalto.mfs.mwsdk.dcm.TokenSyncErrorCode tokenSyncErrorCode = this.getHighSpeedVideoSizes;
        int i2 = (i & 53) + (i | 53);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            return tokenSyncErrorCode;
        }
        throw null;
    }

    public java.lang.String getMessage() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 21) % 128;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 99) << 1) - (i ^ 99);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}

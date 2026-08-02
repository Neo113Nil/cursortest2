package com.visa.cbp;

/* loaded from: classes5.dex */
public class setParamsStatus {
    private byte[] Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private com.visa.cbp.sdk.facade.data.TokenKey getHighSpeedVideoFpsRangesFor;
    private long getHighSpeedVideoSizes;

    @java.lang.Deprecated
    public setParamsStatus() {
    }

    public setParamsStatus(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = tokenKey;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = bArr;
    }

    public long valueOf() {
        return this.getHighSpeedVideoSizes;
    }

    public void valueOf(long j) {
        this.getHighSpeedVideoSizes = j;
    }

    public com.visa.cbp.sdk.facade.data.TokenKey BuildConfig() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void values(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.getHighSpeedVideoFpsRangesFor = tokenKey;
    }

    public java.lang.String ReplenishAckRequest() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void ConfirmReplenishRequest(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public byte[] values() {
        return this.Camera2StreamConfigurationMap;
    }

    public void ConfirmReplenishRequest(byte[] bArr) {
        this.Camera2StreamConfigurationMap = bArr;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Token Key: ");
        sb.append(this.getHighSpeedVideoFpsRangesFor.getTokenId());
        sb.append("| DGI:");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("| DGI Data:");
        sb.append(this.Camera2StreamConfigurationMap);
        return sb.toString();
    }
}

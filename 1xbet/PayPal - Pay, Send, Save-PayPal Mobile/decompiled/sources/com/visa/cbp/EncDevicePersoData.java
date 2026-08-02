package com.visa.cbp;

/* loaded from: classes16.dex */
public class EncDevicePersoData {
    private java.lang.String Camera2StreamConfigurationMap;
    private com.visa.cbp.external.common.TokenInfo getHighResolutionOutputSizeshNQ4ISI;
    private com.visa.cbp.setDeviceIDType getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private com.visa.cbp.sdk.facade.data.TokenKey getHighSpeedVideoSizesFor;

    public void values() {
        setTokenInfo().setSc(1);
    }

    public com.visa.cbp.sdk.facade.data.TokenKey ReplenishAckRequest() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void values(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.getHighSpeedVideoSizesFor = tokenKey;
    }

    public com.visa.cbp.setDeviceIDType valueOf() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void valueOf(com.visa.cbp.setDeviceIDType setdeviceidtype) {
        this.getHighSpeedVideoFpsRanges = setdeviceidtype;
    }

    public com.visa.cbp.external.common.TokenInfo BuildConfig() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String ConfirmReplenishRequest() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void BuildConfig(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public void values(com.visa.cbp.external.common.TokenInfo tokenInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = tokenInfo;
    }

    public java.lang.String getTokenInfo() {
        return this.Camera2StreamConfigurationMap;
    }

    public void ReplenishAckRequest(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public java.lang.String getTvls() {
        return this.getHighSpeedVideoSizes;
    }

    public void ConfirmReplenishRequest(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public com.visa.cbp.external.common.DynParams setTokenInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHceData().getDynParams();
    }

    public java.lang.String setTvls() {
        return BuildConfig().getTokenStatus();
    }
}

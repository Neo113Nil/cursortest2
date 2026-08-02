package com.visa.cbp;

/* loaded from: classes16.dex */
public class getWalletAccountId {
    private java.lang.String Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private com.visa.cbp.getDki getHighSpeedVideoSizes;
    private java.lang.String getInputFormats;
    private java.lang.String getOutputFormats;
    private com.visa.cbp.sdk.facade.data.TokenKey getOutputMinFrameDuration;

    public com.visa.cbp.getDki values() {
        return this.getHighSpeedVideoSizes;
    }

    public void ReplenishAckRequest(com.visa.cbp.getDki getdki) {
        this.getHighSpeedVideoSizes = getdki;
    }

    public int BuildConfig() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void values(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public com.visa.cbp.sdk.facade.data.TokenKey ConfirmReplenishRequest() {
        return this.getOutputMinFrameDuration;
    }

    public void ConfirmReplenishRequest(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.getOutputMinFrameDuration = tokenKey;
    }

    public java.lang.String ReplenishAckRequest() {
        return this.getOutputFormats;
    }

    public void values(java.lang.String str) {
        this.getOutputFormats = str;
    }

    public java.lang.String valueOf() {
        return this.Camera2StreamConfigurationMap;
    }

    public void valueOf(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public boolean getTokenInfo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void ReplenishAckRequest(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    public java.lang.String ReplenishRequest() {
        return this.getInputFormats;
    }

    public void ConfirmReplenishRequest(java.lang.String str) {
        this.getInputFormats = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes.toString());
        sb.append(" | CheckStatusPeriod: ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("| SelectedCardTokenKey: ");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(" | CvmEntity: ");
        sb.append(this.getOutputFormats);
        sb.append(" | CvmType: ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(" | Environment: ");
        sb.append(this.getInputFormats);
        sb.append(" | IsVerified: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(" | maxTvl: ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        return sb.toString();
    }

    public void BuildConfig(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public int getTvls() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}

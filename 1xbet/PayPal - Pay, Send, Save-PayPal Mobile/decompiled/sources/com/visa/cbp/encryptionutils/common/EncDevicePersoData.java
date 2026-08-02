package com.visa.cbp.encryptionutils.common;

/* loaded from: classes5.dex */
public class EncDevicePersoData {
    public java.lang.String Camera2StreamConfigurationMap;
    public java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    public java.lang.String getHighSpeedVideoFpsRanges;
    public java.lang.String getHighSpeedVideoFpsRangesFor;
    public java.lang.String getHighSpeedVideoSizes;
    public java.lang.String getInputSizeshNQ4ISI;
    public java.lang.String getOutputFormats;

    public java.lang.String getDeviceId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setDeviceId(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public java.lang.String getWalletAccountId() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setWalletAccountId(java.lang.String str) {
        this.getInputSizeshNQ4ISI = str;
    }

    public java.lang.String getEncryptedDPM() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setEncryptedDPM(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public java.lang.String getSignExpo() {
        return this.getOutputFormats;
    }

    public void setSignExpo(java.lang.String str) {
        this.getOutputFormats = str;
    }

    public java.lang.String getEncExpo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setEncExpo(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    public java.lang.String getEncCert() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setEncCert(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public java.lang.String getSignCert() {
        return this.getHighSpeedVideoSizes;
    }

    public void setSignCert(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public java.lang.String toString() {
        return new com.google.gson.Gson().toJson(this);
    }
}

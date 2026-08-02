package com.microblink.blinkid.entities.recognizers;

/* loaded from: classes9.dex */
public class SignedPayload {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoSizes;

    public SignedPayload(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRanges = str3;
        this.getHighResolutionOutputSizeshNQ4ISI = str4;
    }

    public java.lang.String getBase64EncodedPayload() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getPayload() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getSignature() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getSignatureVersion() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean isEmpty() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        return str == null || this.getHighSpeedVideoFpsRanges == null || this.Camera2StreamConfigurationMap == null || str.isEmpty() || this.getHighSpeedVideoFpsRanges.isEmpty() || this.Camera2StreamConfigurationMap.isEmpty();
    }
}

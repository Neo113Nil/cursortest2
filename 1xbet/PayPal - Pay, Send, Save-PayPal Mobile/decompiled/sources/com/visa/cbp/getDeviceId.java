package com.visa.cbp;

/* loaded from: classes5.dex */
public class getDeviceId {
    private static final java.lang.String getOutputMinFrameDuration = "getDeviceId";
    long Camera2StreamConfigurationMap;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.String getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;
    java.lang.String getHighSpeedVideoSizesFor;
    java.lang.String getInputSizeshNQ4ISI;

    public java.lang.String valueOf() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void valueOf(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str;
    }

    public java.lang.String ConfirmReplenishRequest() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void values(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public long BuildConfig() {
        return this.getHighSpeedVideoSizes;
    }

    public void BuildConfig(long j) {
        this.getHighSpeedVideoSizes = j;
    }

    public java.lang.String ReplenishAckRequest() {
        return this.getInputSizeshNQ4ISI;
    }

    public void ReplenishAckRequest(java.lang.String str) {
        this.getInputSizeshNQ4ISI = str;
    }

    public java.lang.String values() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void BuildConfig(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public java.lang.String ReplenishRequest() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void ConfirmReplenishRequest(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    public long getTvls() {
        return this.Camera2StreamConfigurationMap;
    }

    public void valueOf(long j) {
        this.Camera2StreamConfigurationMap = j;
    }

    public static com.visa.cbp.getDeviceId valueOf(byte[] bArr) {
        try {
            return (com.visa.cbp.getDeviceId) new com.google.gson.Gson().fromJson(new java.lang.String(bArr), com.visa.cbp.getDeviceId.class);
        } catch (com.google.gson.JsonSyntaxException unused) {
            throw new com.visa.cbp.sdk.facade.exception.SDKUnrecoverableException("Visa's SDK encountered an unrecoverable exception. Please uninstall and reinstall your application");
        }
    }

    public byte[] setTokenInfo() {
        return new com.google.gson.Gson().toJson(this).getBytes();
    }
}

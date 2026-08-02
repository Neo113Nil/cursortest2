package com.visa.cbp.encryptionutils.common;

/* loaded from: classes16.dex */
public class DeviceKeyPair {
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighSpeedVideoFpsRanges;

    public DeviceKeyPair(java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = str2;
    }

    public java.lang.String getCertificate() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setCertificate(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public java.lang.String getPrivateKeyHex() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setPrivateKeyHex(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }
}

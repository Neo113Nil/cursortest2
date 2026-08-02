package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class EnrollDeviceCerts {
    private byte[] confidentialityKey;
    private java.lang.String deviceId;
    private byte[] deviceRootKey;
    private byte[] integrityKey;
    private boolean isOnBoardDeviceSuccessful;
    private java.lang.String visaConfidentialityCertId;
    private java.lang.String visaIntegrityCertId;

    public byte[] getConfidentialityKey() {
        return this.confidentialityKey;
    }

    public void setConfidentialityKey(byte[] bArr) {
        this.confidentialityKey = bArr;
    }

    public byte[] getIntegrityKey() {
        return this.integrityKey;
    }

    public void setIntegrityKey(byte[] bArr) {
        this.integrityKey = bArr;
    }

    public byte[] getDeviceRootKey() {
        return this.deviceRootKey;
    }

    public void setDeviceRootKey(byte[] bArr) {
        this.deviceRootKey = bArr;
    }

    public java.lang.String getVisaConfidentialityCertId() {
        return this.visaConfidentialityCertId;
    }

    public void setVisaConfidentialityCertId(java.lang.String str) {
        this.visaConfidentialityCertId = str;
    }

    public java.lang.String getVisaIntegrityCertId() {
        return this.visaIntegrityCertId;
    }

    public void setVisaIntegrityCertId(java.lang.String str) {
        this.visaIntegrityCertId = str;
    }

    public void setDeviceId(java.lang.String str) {
        this.deviceId = str;
    }

    public java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public boolean isOnBoardDeviceSuccessful() {
        return this.isOnBoardDeviceSuccessful;
    }

    public void setOnBoardDeviceSuccessful(boolean z) {
        this.isOnBoardDeviceSuccessful = z;
    }
}

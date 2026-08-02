package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class EncDevicePersoData {
    private java.lang.String deviceId;

    @com.visa.cbp.external.common.NullAndLengthValidate(regEx = "[a-zA-Z0-9\\-_]")
    private java.lang.String encCert;

    @com.visa.cbp.external.common.NullAndLengthValidate(regEx = "[a-zA-Z0-9\\-_]")
    private java.lang.String encExpo;

    @com.visa.cbp.external.common.NullAndLengthValidate(regEx = "[a-zA-Z0-9\\-_]")
    private java.lang.String encryptedDPM;
    private java.lang.String signCert;
    private java.lang.String signExpo;
    private java.lang.String walletAccountId;

    public java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(java.lang.String str) {
        this.deviceId = str;
    }

    public java.lang.String getWalletAccountId() {
        return this.walletAccountId;
    }

    public void setWalletAccountId(java.lang.String str) {
        this.walletAccountId = str;
    }

    public java.lang.String getEncryptedDPM() {
        return this.encryptedDPM;
    }

    public void setEncryptedDPM(java.lang.String str) {
        this.encryptedDPM = str;
    }

    public java.lang.String getSignExpo() {
        return this.signExpo;
    }

    public void setSignExpo(java.lang.String str) {
        this.signExpo = str;
    }

    public java.lang.String getEncExpo() {
        return this.encExpo;
    }

    public void setEncExpo(java.lang.String str) {
        this.encExpo = str;
    }

    public java.lang.String getEncCert() {
        return this.encCert;
    }

    public void setEncCert(java.lang.String str) {
        this.encCert = str;
    }

    public java.lang.String getSignCert() {
        return this.signCert;
    }

    public void setSignCert(java.lang.String str) {
        this.signCert = str;
    }
}

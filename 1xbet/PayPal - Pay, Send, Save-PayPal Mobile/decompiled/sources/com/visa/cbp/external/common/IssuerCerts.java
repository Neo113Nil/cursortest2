package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class IssuerCerts {

    @com.visa.cbp.external.common.NullAndEmptyValueValidate
    private byte[] deviceID;

    @com.visa.cbp.external.common.NullAndEmptyValueValidate
    private byte[] encCert;

    @com.visa.cbp.external.common.NullAndEmptyValueValidate
    private byte[] encExponent;

    @com.visa.cbp.external.common.NullAndEmptyValueValidate
    private byte[] signCert;

    @com.visa.cbp.external.common.NullAndEmptyValueValidate
    private byte[] signExponent;

    public byte[] getDeviceID() {
        return this.deviceID;
    }

    public void setDeviceID(byte[] bArr) {
        this.deviceID = bArr;
    }

    public byte[] getEncExponent() {
        return this.encExponent;
    }

    public void setEncExponent(byte[] bArr) {
        this.encExponent = bArr;
    }

    public byte[] getEncCert() {
        return this.encCert;
    }

    public void setEncCert(byte[] bArr) {
        this.encCert = bArr;
    }

    public byte[] getSignExponent() {
        return this.signExponent;
    }

    public void setSignExponent(byte[] bArr) {
        this.signExponent = bArr;
    }

    public byte[] getSignCert() {
        return this.signCert;
    }

    public void setSignCert(byte[] bArr) {
        this.signCert = bArr;
    }
}

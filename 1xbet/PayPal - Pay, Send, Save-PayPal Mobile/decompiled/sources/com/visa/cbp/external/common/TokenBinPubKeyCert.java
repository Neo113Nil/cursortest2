package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class TokenBinPubKeyCert {

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String certificate;

    @com.visa.cbp.external.common.NullValueValidate
    com.visa.cbp.external.common.ExpirationDate expirationDate;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String exponent;
    java.lang.String remainder;

    public java.lang.String getCertificate() {
        return this.certificate;
    }

    public void setCertificate(java.lang.String str) {
        this.certificate = str;
    }

    public java.lang.String getExponent() {
        return this.exponent;
    }

    public void setExponent(java.lang.String str) {
        this.exponent = str;
    }

    public java.lang.String getRemainder() {
        return this.remainder;
    }

    public void setRemainder(java.lang.String str) {
        this.remainder = str;
    }

    public com.visa.cbp.external.common.ExpirationDate getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(com.visa.cbp.external.common.ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}

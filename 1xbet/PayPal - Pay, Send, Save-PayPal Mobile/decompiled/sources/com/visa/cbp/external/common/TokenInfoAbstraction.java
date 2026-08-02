package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public abstract class TokenInfoAbstraction {
    private java.lang.String atc;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String encTokenInfo;

    @com.visa.cbp.external.common.NullValueValidate
    private com.visa.cbp.external.common.ExpirationDate expirationDate;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String last4;
    private java.lang.String paymentAccountReference;
    private java.lang.String tokenReferenceID;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String tokenRequestorID;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String tokenStatus;

    public java.lang.String getAtc() {
        return this.atc;
    }

    public void setAtc(java.lang.String str) {
        this.atc = str;
    }

    public java.lang.String getEncTokenInfo() {
        return this.encTokenInfo;
    }

    public void setEncTokenInfo(java.lang.String str) {
        this.encTokenInfo = str;
    }

    public java.lang.String getTokenStatus() {
        return this.tokenStatus;
    }

    public void setTokenStatus(java.lang.String str) {
        this.tokenStatus = str;
    }

    public java.lang.String getTokenRequestorID() {
        return this.tokenRequestorID;
    }

    public void setTokenRequestorID(java.lang.String str) {
        this.tokenRequestorID = str;
    }

    public java.lang.String getTokenReferenceID() {
        return this.tokenReferenceID;
    }

    public void setTokenReferenceID(java.lang.String str) {
        this.tokenReferenceID = str;
    }

    public java.lang.String getLast4() {
        return this.last4;
    }

    public void setLast4(java.lang.String str) {
        this.last4 = str;
    }

    public com.visa.cbp.external.common.ExpirationDate getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(com.visa.cbp.external.common.ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public java.lang.String getPaymentAccountReference() {
        return this.paymentAccountReference;
    }

    public void setPaymentAccountReference(java.lang.String str) {
        this.paymentAccountReference = str;
    }
}

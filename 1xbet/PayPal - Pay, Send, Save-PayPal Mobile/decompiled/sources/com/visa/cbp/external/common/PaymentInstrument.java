package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class PaymentInstrument {
    private java.lang.String accountStatus;
    private java.util.Map<java.lang.String, java.lang.Object> additionalProperties = new java.util.HashMap();

    @com.visa.cbp.external.common.NullValueValidate
    private com.visa.cbp.external.common.ExpirationDate expirationDate;
    private java.lang.String isTokenizable;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String last4;
    private java.lang.String paymentAccountReference;

    public java.lang.String getLast4() {
        return this.last4;
    }

    public void setLast4(java.lang.String str) {
        this.last4 = str;
    }

    public java.lang.String getAccountStatus() {
        return this.accountStatus;
    }

    public void setAccountStatus(java.lang.String str) {
        this.accountStatus = str;
    }

    public java.lang.String getIsTokenizable() {
        return this.isTokenizable;
    }

    public void setIsTokenizable(java.lang.String str) {
        this.isTokenizable = str;
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

    public java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(java.lang.String str, java.lang.Object obj) {
        this.additionalProperties.put(str, obj);
    }
}

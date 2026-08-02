package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class PaymentDataRequest {
    private java.lang.String atc;
    private java.lang.String clientPaymentDataID;
    private java.lang.String encryptionMetaData;
    private com.visa.cbp.external.common.PaymentRequest paymentRequest;

    public java.lang.String getEncryptionMetaData() {
        return this.encryptionMetaData;
    }

    public void setEncryptionMetaData(java.lang.String str) {
        this.encryptionMetaData = str;
    }

    public java.lang.String getClientPaymentDataID() {
        return this.clientPaymentDataID;
    }

    public void setClientPaymentDataID(java.lang.String str) {
        this.clientPaymentDataID = str;
    }

    public com.visa.cbp.external.common.PaymentRequest getPaymentRequest() {
        return this.paymentRequest;
    }

    public void setPaymentRequest(com.visa.cbp.external.common.PaymentRequest paymentRequest) {
        this.paymentRequest = paymentRequest;
    }

    public java.lang.String getAtc() {
        return this.atc;
    }

    public void setAtc(java.lang.String str) {
        this.atc = str;
    }
}

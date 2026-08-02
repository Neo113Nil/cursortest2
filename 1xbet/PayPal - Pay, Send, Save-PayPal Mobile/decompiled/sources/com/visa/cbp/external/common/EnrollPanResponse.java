package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class EnrollPanResponse {
    private com.visa.cbp.external.common.CardMetaData cardMetaData;
    private java.lang.String encryptionMetaData;
    private com.visa.cbp.external.common.PaymentInstrument paymentInstrument;
    private java.lang.String vPanEnrollmentID;

    public java.lang.String getvPanEnrollmentID() {
        return this.vPanEnrollmentID;
    }

    public void setvPanEnrollmentID(java.lang.String str) {
        this.vPanEnrollmentID = str;
    }

    public com.visa.cbp.external.common.PaymentInstrument getPaymentInstrument() {
        return this.paymentInstrument;
    }

    public void setPaymentInstrument(com.visa.cbp.external.common.PaymentInstrument paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public java.lang.String getEncryptionMetaData() {
        return this.encryptionMetaData;
    }

    public void setEncryptionMetaData(java.lang.String str) {
        this.encryptionMetaData = str;
    }

    public com.visa.cbp.external.common.CardMetaData getCardMetaData() {
        return this.cardMetaData;
    }

    public void setCardMetaData(com.visa.cbp.external.common.CardMetaData cardMetaData) {
        this.cardMetaData = cardMetaData;
    }
}

package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class CardMetadataUpdateResponse {
    private java.util.Map<java.lang.String, java.lang.Object> additionalProperties = new java.util.HashMap();
    private com.visa.cbp.external.common.CardMetaData cardMetaData;
    private com.visa.cbp.external.common.PaymentInstrument paymentInstrument;
    private java.lang.String vPanEnrollmentID;

    public java.lang.String getVPanEnrollmentID() {
        return this.vPanEnrollmentID;
    }

    public void setVPanEnrollmentID(java.lang.String str) {
        this.vPanEnrollmentID = str;
    }

    public com.visa.cbp.external.common.PaymentInstrument getPaymentInstrument() {
        return this.paymentInstrument;
    }

    public void setPaymentInstrument(com.visa.cbp.external.common.PaymentInstrument paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public com.visa.cbp.external.common.CardMetaData getCardMetaData() {
        return this.cardMetaData;
    }

    public void setCardMetaData(com.visa.cbp.external.common.CardMetaData cardMetaData) {
        this.cardMetaData = cardMetaData;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(java.lang.String str, java.lang.Object obj) {
        this.additionalProperties.put(str, obj);
    }
}

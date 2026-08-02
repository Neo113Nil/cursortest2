package com.visa.cbp.sdk.facade.request;

/* loaded from: classes16.dex */
public class ProvisionTokenParams {
    private java.lang.String cardArtUri;
    private java.lang.String cardRefId;
    private com.visa.cbp.external.common.ConsumerInfo consumerInfo;
    private java.lang.String encPaymentInstrument;

    public ProvisionTokenParams(java.lang.String str, java.lang.String str2) {
        this(null, str, str2, null, null, null, null, null);
    }

    public ProvisionTokenParams(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.encPaymentInstrument = str;
        this.cardRefId = str2;
        this.cardArtUri = str3;
        com.visa.cbp.external.common.ConsumerInfo consumerInfo = new com.visa.cbp.external.common.ConsumerInfo();
        this.consumerInfo = consumerInfo;
        consumerInfo.setLocale(str8);
        this.consumerInfo.setPhone(str7);
        this.consumerInfo.setFirstName(str4);
        this.consumerInfo.setLastName(str5);
        this.consumerInfo.setEmail(str6);
    }

    public java.lang.String getEncPaymentInstrument() {
        return this.encPaymentInstrument;
    }

    public java.lang.String getCardArtUri() {
        return this.cardArtUri;
    }

    public java.lang.String getCardRefId() {
        return this.cardRefId;
    }

    public com.visa.cbp.external.common.ConsumerInfo getConsumerInfo() {
        return this.consumerInfo;
    }
}

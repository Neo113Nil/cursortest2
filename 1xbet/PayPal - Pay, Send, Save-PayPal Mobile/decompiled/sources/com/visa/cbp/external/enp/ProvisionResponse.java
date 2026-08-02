package com.visa.cbp.external.enp;

/* loaded from: classes16.dex */
public class ProvisionResponse {
    private com.visa.cbp.external.common.ODAData ODAData;
    private java.lang.String encryptionMetaData;
    private com.visa.cbp.external.common.PaymentInstrument paymentInstrument;
    private java.util.ArrayList<com.visa.cbp.external.common.StepUpRequest> stepUpRequest = new java.util.ArrayList<>();
    private com.visa.cbp.external.common.TokenInfo tokenInfo;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String vProvisionedTokenID;

    public java.lang.String getVProvisionedTokenID() {
        return this.vProvisionedTokenID;
    }

    public void setVProvisionedTokenID(java.lang.String str) {
        this.vProvisionedTokenID = str;
    }

    public java.lang.String getEncryptionMetaData() {
        return this.encryptionMetaData;
    }

    public void setEncryptionMetaData(java.lang.String str) {
        this.encryptionMetaData = str;
    }

    public com.visa.cbp.external.common.PaymentInstrument getPaymentInstrument() {
        return this.paymentInstrument;
    }

    public void setPaymentInstrument(com.visa.cbp.external.common.PaymentInstrument paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public com.visa.cbp.external.common.TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public void setTokenInfo(com.visa.cbp.external.common.TokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
    }

    public java.util.ArrayList<com.visa.cbp.external.common.StepUpRequest> getStepUpRequest() {
        return this.stepUpRequest;
    }

    public void setStepUpRequest(java.util.ArrayList<com.visa.cbp.external.common.StepUpRequest> arrayList) {
        this.stepUpRequest = arrayList;
    }

    public com.visa.cbp.external.common.ODAData getODAData() {
        return this.ODAData;
    }

    public void setODAData(com.visa.cbp.external.common.ODAData oDAData) {
        this.ODAData = oDAData;
    }
}

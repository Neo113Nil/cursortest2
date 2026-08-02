package com.visa.cbp.external.enp;

/* loaded from: classes16.dex */
public class RepersoTokenResponse {
    private com.visa.cbp.external.common.PaymentInstrument paymentInstrument;
    private com.visa.cbp.external.common.TokenInfoReperso tokenInfo;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String vProvisionedTokenID;

    public java.lang.String getVProvisionedTokenID() {
        return this.vProvisionedTokenID;
    }

    public void setVProvisionedTokenID(java.lang.String str) {
        this.vProvisionedTokenID = str;
    }

    public com.visa.cbp.external.common.PaymentInstrument getPaymentInstrument() {
        return this.paymentInstrument;
    }

    public void setPaymentInstrument(com.visa.cbp.external.common.PaymentInstrument paymentInstrument) {
        this.paymentInstrument = paymentInstrument;
    }

    public com.visa.cbp.external.common.TokenInfoReperso getTokenInfo() {
        return this.tokenInfo;
    }

    public void setTokenInfo(com.visa.cbp.external.common.TokenInfoReperso tokenInfoReperso) {
        this.tokenInfo = tokenInfoReperso;
    }
}

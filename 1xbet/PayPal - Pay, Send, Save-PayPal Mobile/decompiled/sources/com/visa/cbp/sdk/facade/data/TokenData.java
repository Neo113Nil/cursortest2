package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public class TokenData {
    private boolean isVdtToken;
    private java.lang.String paymentInstrumentLast4;
    private com.visa.cbp.sdk.facade.data.TokenKey tokenKey;
    private java.lang.String tokenLast4;
    private java.lang.String tokenStatus;
    private java.lang.String vProvisionedTokenID;

    public TokenData() {
    }

    public TokenData(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str) {
        this.tokenKey = tokenKey;
        this.paymentInstrumentLast4 = str;
    }

    public com.visa.cbp.sdk.facade.data.TokenKey getTokenKey() {
        return this.tokenKey;
    }

    public void setTokenKey(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.tokenKey = tokenKey;
    }

    public java.lang.String getPaymentInstrumentLast4() {
        return this.paymentInstrumentLast4;
    }

    public void setPaymentInstrumentLast4(java.lang.String str) {
        this.paymentInstrumentLast4 = str;
    }

    public java.lang.String getTokenLast4() {
        return this.tokenLast4;
    }

    public void setTokenLast4(java.lang.String str) {
        this.tokenLast4 = str;
    }

    public java.lang.String getTokenStatus() {
        return this.tokenStatus;
    }

    public void setTokenStatus(java.lang.String str) {
        this.tokenStatus = str;
    }

    public java.lang.String getVProvisionedTokenID() {
        return this.vProvisionedTokenID;
    }

    public void setVProvisionedTokenID(java.lang.String str) {
        this.vProvisionedTokenID = str;
    }

    public boolean isVdtToken() {
        return this.isVdtToken;
    }

    public void setIsVdtToken(boolean z) {
        this.isVdtToken = z;
    }
}

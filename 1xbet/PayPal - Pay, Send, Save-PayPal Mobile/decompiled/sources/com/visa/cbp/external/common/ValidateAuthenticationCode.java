package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class ValidateAuthenticationCode extends com.visa.cbp.external.common.JsonConverter {
    java.lang.String date;
    java.lang.String issuerAuthCode;
    private transient java.lang.String vProvisionedTokenID;

    public java.lang.String getvProvisionedTokenID() {
        return this.vProvisionedTokenID;
    }

    public void setvProvisionedTokenID(java.lang.String str) {
        this.vProvisionedTokenID = str;
    }

    public java.lang.String getDate() {
        return this.date;
    }

    public void setDate(java.lang.String str) {
        this.date = str;
    }

    public java.lang.String getIssuerAuthCode() {
        return this.issuerAuthCode;
    }

    public void setIssuerAuthCode(java.lang.String str) {
        this.issuerAuthCode = str;
    }
}

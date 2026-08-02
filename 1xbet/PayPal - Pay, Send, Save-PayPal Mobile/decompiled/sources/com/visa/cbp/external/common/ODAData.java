package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class ODAData {
    java.lang.String appFileLocator;
    java.lang.String appProfile;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String caPubKeyIndex;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String enciccPrivateKey;

    @com.visa.cbp.external.common.NullValueValidate
    com.visa.cbp.external.common.IccPubKeyCert iccPubKeyCert;

    @com.visa.cbp.external.common.NullValueValidate
    com.visa.cbp.external.common.TokenBinPubKeyCert tokenBinPubKeyCert;

    public java.lang.String getAppFileLocator() {
        return this.appFileLocator;
    }

    public void setAppFileLocator(java.lang.String str) {
        this.appFileLocator = str;
    }

    public java.lang.String getAppProfile() {
        return this.appProfile;
    }

    public void setAppProfile(java.lang.String str) {
        this.appProfile = str;
    }

    public java.lang.String getCaPubKeyIndex() {
        return this.caPubKeyIndex;
    }

    public void setCaPubKeyIndex(java.lang.String str) {
        this.caPubKeyIndex = str;
    }

    public java.lang.String getEnciccPrivateKey() {
        return this.enciccPrivateKey;
    }

    public void setEnciccPrivateKey(java.lang.String str) {
        this.enciccPrivateKey = str;
    }

    public com.visa.cbp.external.common.IccPubKeyCert getIccPubKeyCert() {
        return this.iccPubKeyCert;
    }

    public void setIccPubKeyCert(com.visa.cbp.external.common.IccPubKeyCert iccPubKeyCert) {
        this.iccPubKeyCert = iccPubKeyCert;
    }

    public com.visa.cbp.external.common.TokenBinPubKeyCert getTokenBinPubKeyCert() {
        return this.tokenBinPubKeyCert;
    }

    public void setTokenBinPubKeyCert(com.visa.cbp.external.common.TokenBinPubKeyCert tokenBinPubKeyCert) {
        this.tokenBinPubKeyCert = tokenBinPubKeyCert;
    }
}

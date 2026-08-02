package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class PaywaveData {
    private java.lang.String IccPrivKExpo;
    private java.lang.String api;
    private java.lang.String appPrgrmID;
    private int atc;
    private com.visa.cbp.sdk.facade.data.CVMPriority cvmPriorityList;
    private com.visa.cbp.external.common.DynParams dynParams;
    private com.visa.cbp.external.common.ExpirationDate expirationDate;
    private short keySize;
    private java.lang.String lang;
    private com.visa.cbp.external.common.ODAData odaData;
    private java.lang.String paymentAccountReference;
    private com.visa.cbp.external.common.StaticParams staticParams;
    private java.lang.String token;
    private java.lang.String tokenRequestorID;
    private java.lang.String vProvisionedTokenId;

    public short getIccPrivKSize() {
        return this.keySize;
    }

    public void setIccPrivKSize(short s) {
        this.keySize = s;
    }

    public java.lang.String getToken() {
        return this.token;
    }

    public void setToken(java.lang.String str) {
        this.token = str;
    }

    public java.lang.String getAppPrgrmID() {
        return this.appPrgrmID;
    }

    public void setAppPrgrmID(java.lang.String str) {
        this.appPrgrmID = str;
    }

    public com.visa.cbp.external.common.ExpirationDate getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(com.visa.cbp.external.common.ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public java.lang.String getLang() {
        return this.lang;
    }

    public void setLang(java.lang.String str) {
        this.lang = str;
    }

    public java.lang.String getTokenRequestorID() {
        return this.tokenRequestorID;
    }

    public void setTokenRequestorID(java.lang.String str) {
        this.tokenRequestorID = str;
    }

    public java.lang.String getApi() {
        return this.api;
    }

    public void setApi(java.lang.String str) {
        this.api = str;
    }

    public java.lang.String getIccPrivKExpo() {
        return this.IccPrivKExpo;
    }

    public void setIccPrivKExpo(java.lang.String str) {
        this.IccPrivKExpo = str;
    }

    public com.visa.cbp.external.common.DynParams getDynParams() {
        return this.dynParams;
    }

    public void setDynParams(com.visa.cbp.external.common.DynParams dynParams) {
        this.dynParams = dynParams;
    }

    public com.visa.cbp.external.common.StaticParams getStaticParams() {
        return this.staticParams;
    }

    public void setStaticParams(com.visa.cbp.external.common.StaticParams staticParams) {
        this.staticParams = staticParams;
    }

    public int getAtc() {
        return this.atc;
    }

    public void setAtc(int i) {
        this.atc = i;
    }

    public java.lang.String getvProvisionedTokenId() {
        return this.vProvisionedTokenId;
    }

    public void setvProvisionedTokenId(java.lang.String str) {
        this.vProvisionedTokenId = str;
    }

    public com.visa.cbp.external.common.ODAData getODAData() {
        return this.odaData;
    }

    public void setODAData(com.visa.cbp.external.common.ODAData oDAData) {
        this.odaData = oDAData;
    }

    public java.lang.String getPaymentAccountReference() {
        return this.paymentAccountReference;
    }

    public void setPaymentAccountReference(java.lang.String str) {
        this.paymentAccountReference = str;
    }

    public com.visa.cbp.sdk.facade.data.CVMPriority getCvmPriorityList() {
        return this.cvmPriorityList;
    }

    public void setCvmPriorityList(com.visa.cbp.sdk.facade.data.CVMPriority cVMPriority) {
        this.cvmPriorityList = cVMPriority;
    }
}

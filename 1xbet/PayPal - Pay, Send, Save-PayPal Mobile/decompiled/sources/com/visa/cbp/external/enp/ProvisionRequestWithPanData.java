package com.visa.cbp.external.enp;

/* loaded from: classes16.dex */
public class ProvisionRequestWithPanData {
    private java.lang.String clientAppID;
    private java.lang.String clientDeviceID;
    private java.lang.String clientWalletAccountEmailAddress;
    private java.lang.String clientWalletAccountEmailAddressHash;
    private java.lang.String clientWalletAccountID;
    private java.lang.String consumerEntryMode;
    private java.lang.String encPaymentInstrument;
    private java.lang.String encRiskDataInfo;
    private java.lang.String ip4address;
    private java.lang.String issuerAuthCode;
    private java.lang.String locale;
    private java.lang.String location;
    private java.lang.String locationSource;
    private java.lang.String panSource;
    private java.util.List<java.lang.String> presentationType = new java.util.ArrayList();
    private java.lang.String protectionType;

    public java.lang.String getClientAppID() {
        return this.clientAppID;
    }

    public void setClientAppID(java.lang.String str) {
        this.clientAppID = str;
    }

    public java.lang.String getClientWalletAccountID() {
        return this.clientWalletAccountID;
    }

    public void setClientWalletAccountID(java.lang.String str) {
        this.clientWalletAccountID = str;
    }

    public java.lang.String getIp4address() {
        return this.ip4address;
    }

    public void setIp4address(java.lang.String str) {
        this.ip4address = str;
    }

    public java.lang.String getLocation() {
        return this.location;
    }

    public void setLocation(java.lang.String str) {
        this.location = str;
    }

    public java.lang.String getLocationSource() {
        return this.locationSource;
    }

    public void setLocationSource(java.lang.String str) {
        this.locationSource = str;
    }

    public java.lang.String getIssuerAuthCode() {
        return this.issuerAuthCode;
    }

    public void setIssuerAuthCode(java.lang.String str) {
        this.issuerAuthCode = str;
    }

    public java.lang.String getClientWalletAccountEmailAddress() {
        return this.clientWalletAccountEmailAddress;
    }

    public void setClientWalletAccountEmailAddress(java.lang.String str) {
        this.clientWalletAccountEmailAddress = str;
    }

    public java.lang.String getClientWalletAccountEmailAddressHash() {
        return this.clientWalletAccountEmailAddressHash;
    }

    public void setClientWalletAccountEmailAddressHash(java.lang.String str) {
        this.clientWalletAccountEmailAddressHash = str;
    }

    public java.lang.String getProtectionType() {
        return this.protectionType;
    }

    public void setProtectionType(java.lang.String str) {
        this.protectionType = str;
    }

    public java.lang.String getClientDeviceID() {
        return this.clientDeviceID;
    }

    public void setClientDeviceID(java.lang.String str) {
        this.clientDeviceID = str;
    }

    public java.lang.String getPanSource() {
        return this.panSource;
    }

    public void setPanSource(java.lang.String str) {
        this.panSource = str;
    }

    public java.lang.String getConsumerEntryMode() {
        return this.consumerEntryMode;
    }

    public void setConsumerEntryMode(java.lang.String str) {
        this.consumerEntryMode = str;
    }

    public java.util.List<java.lang.String> getPresentationType() {
        return this.presentationType;
    }

    public void setPresentationType(java.util.List<java.lang.String> list) {
        this.presentationType = list;
    }

    public java.lang.String getEncPaymentInstrument() {
        return this.encPaymentInstrument;
    }

    public void setEncPaymentInstrument(java.lang.String str) {
        this.encPaymentInstrument = str;
    }

    public java.lang.String getEncRiskDataInfo() {
        return this.encRiskDataInfo;
    }

    public void setEncRiskDataInfo(java.lang.String str) {
        this.encRiskDataInfo = str;
    }

    public java.lang.String getLocale() {
        return this.locale;
    }

    public void setLocale(java.lang.String str) {
        this.locale = str;
    }
}

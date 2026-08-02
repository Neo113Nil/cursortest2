package com.visa.cbp.external.enp;

/* loaded from: classes5.dex */
public class ProvisionRequestWithEnrollId {

    @com.visa.cbp.external.common.NullValueValidate
    public java.lang.String clientAppID;
    public java.lang.String clientDeviceID;
    public java.lang.String clientWalletAccountEmailAddress;

    @com.visa.cbp.external.common.NullValueValidate
    public java.lang.String clientWalletAccountEmailAddressHash;

    @com.visa.cbp.external.common.NullValueValidate
    public java.lang.String clientWalletAccountID;
    public java.lang.String encRiskDataInfo;
    public java.lang.String ip4address;
    public java.lang.String issuerAuthCode;
    public java.lang.String location;
    public java.lang.String locationSource;

    @com.visa.cbp.external.common.NullValueValidate
    public java.util.List<java.lang.String> presentationType = new java.util.ArrayList();

    @com.visa.cbp.external.common.NullValueValidate
    public java.lang.String protectionType;
    public com.visa.cbp.external.common.TermsAndConditions termsAndConditions;
    private transient java.lang.String vPanEnrollmentID;

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

    public java.lang.String getClientDeviceID() {
        return this.clientDeviceID;
    }

    public void setClientDeviceID(java.lang.String str) {
        this.clientDeviceID = str;
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

    public java.lang.String getIssuerAuthCode() {
        return this.issuerAuthCode;
    }

    public void setIssuerAuthCode(java.lang.String str) {
        this.issuerAuthCode = str;
    }

    public java.lang.String getProtectionType() {
        return this.protectionType;
    }

    public void setProtectionType(java.lang.String str) {
        this.protectionType = str;
    }

    public java.util.List<java.lang.String> getPresentationType() {
        return this.presentationType;
    }

    public void setPresentationType(java.util.List<java.lang.String> list) {
        this.presentationType = list;
    }

    public com.visa.cbp.external.common.TermsAndConditions getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public void setTermsAndConditions(com.visa.cbp.external.common.TermsAndConditions termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public java.lang.String getEncRiskDataInfo() {
        return this.encRiskDataInfo;
    }

    public void setEncRiskDataInfo(java.lang.String str) {
        this.encRiskDataInfo = str;
    }

    public java.lang.String getvPanEnrollmentID() {
        return this.vPanEnrollmentID;
    }

    public void setvPanEnrollmentID(java.lang.String str) {
        this.vPanEnrollmentID = str;
    }

    public java.lang.String getJSONRequest() {
        return new com.google.gson.Gson().toJson(this);
    }
}

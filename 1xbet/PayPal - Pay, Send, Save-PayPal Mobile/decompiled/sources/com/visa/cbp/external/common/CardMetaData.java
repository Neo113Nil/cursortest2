package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class CardMetaData {
    private java.lang.String backgroundColor;
    private java.lang.String contactEmail;
    private java.lang.String contactName;
    private java.lang.String contactNumber;
    private java.lang.String contactWebsite;
    private java.lang.String foregroundColor;
    private java.lang.String labelColor;
    private java.lang.String longDescription;
    private java.lang.String shortDescription;
    private java.lang.String termsAndConditionsID;
    private java.util.List<com.visa.cbp.external.common.CardDatum> cardData = new java.util.ArrayList();
    private java.util.Map<java.lang.String, java.lang.Object> additionalProperties = new java.util.HashMap();

    public java.lang.String getBackgroundColor() {
        return this.backgroundColor;
    }

    public void setBackgroundColor(java.lang.String str) {
        this.backgroundColor = str;
    }

    public java.lang.String getForegroundColor() {
        return this.foregroundColor;
    }

    public void setForegroundColor(java.lang.String str) {
        this.foregroundColor = str;
    }

    public java.lang.String getLabelColor() {
        return this.labelColor;
    }

    public void setLabelColor(java.lang.String str) {
        this.labelColor = str;
    }

    public java.lang.String getContactWebsite() {
        return this.contactWebsite;
    }

    public void setContactWebsite(java.lang.String str) {
        this.contactWebsite = str;
    }

    public java.lang.String getContactEmail() {
        return this.contactEmail;
    }

    public void setContactEmail(java.lang.String str) {
        this.contactEmail = str;
    }

    public java.lang.String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(java.lang.String str) {
        this.contactNumber = str;
    }

    public java.lang.String getContactName() {
        return this.contactName;
    }

    public void setContactName(java.lang.String str) {
        this.contactName = str;
    }

    public java.lang.String getTermsAndConditionsID() {
        return this.termsAndConditionsID;
    }

    public void setTermsAndConditionsID(java.lang.String str) {
        this.termsAndConditionsID = str;
    }

    public java.lang.String getShortDescription() {
        return this.shortDescription;
    }

    public void setShortDescription(java.lang.String str) {
        this.shortDescription = str;
    }

    public java.lang.String getLongDescription() {
        return this.longDescription;
    }

    public void setLongDescription(java.lang.String str) {
        this.longDescription = str;
    }

    public java.util.List<com.visa.cbp.external.common.CardDatum> getCardData() {
        return this.cardData;
    }

    public void setCardData(java.util.List<com.visa.cbp.external.common.CardDatum> list) {
        this.cardData = list;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(java.lang.String str, java.lang.Object obj) {
        this.additionalProperties.put(str, obj);
    }
}

package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class RecipientDetails {
    private java.lang.String recipientCity;
    private java.lang.String recipientCountryCode;
    private java.lang.String recipientLocation;
    private java.lang.String recipientLocationSource;
    private java.lang.String recipientName;
    private com.visa.cbp.mpqr.facade.RecipientPaymentInstrument recipientPaymentInstrument;
    private java.lang.String recipientPostalCode;

    public com.visa.cbp.mpqr.facade.RecipientPaymentInstrument getRecipientPaymentInstrument() {
        return this.recipientPaymentInstrument;
    }

    public void setRecipientPaymentInstrument(com.visa.cbp.mpqr.facade.RecipientPaymentInstrument recipientPaymentInstrument) {
        this.recipientPaymentInstrument = recipientPaymentInstrument;
    }

    public java.lang.String getRecipientName() {
        return this.recipientName;
    }

    public void setRecipientName(java.lang.String str) {
        this.recipientName = str;
    }

    public java.lang.String getrecipientCity() {
        return this.recipientCity;
    }

    public void setrecipientCity(java.lang.String str) {
        this.recipientCity = str;
    }

    public java.lang.String getrecipientPostalCode() {
        return this.recipientPostalCode;
    }

    public void setrecipientPostalCode(java.lang.String str) {
        this.recipientPostalCode = str;
    }

    public java.lang.String getrecipientCountryCode() {
        return this.recipientCountryCode;
    }

    public void setrecipientCountryCode(java.lang.String str) {
        this.recipientCountryCode = str;
    }

    public java.lang.String getrecipientLocation() {
        return this.recipientLocation;
    }

    public void setrecipientLocation(java.lang.String str) {
        this.recipientLocation = str;
    }

    public java.lang.String getrecipientLocationSource() {
        return this.recipientLocationSource;
    }

    public void setrecipientLocationSource(java.lang.String str) {
        this.recipientLocationSource = str;
    }
}

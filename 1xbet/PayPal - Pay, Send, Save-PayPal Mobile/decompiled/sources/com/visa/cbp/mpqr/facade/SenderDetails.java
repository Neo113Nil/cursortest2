package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class SenderDetails {
    private java.lang.String senderAddress;
    private java.lang.String senderCity;
    private java.lang.String senderCountryCode;
    private java.lang.String senderDateOfBirth;
    private java.lang.String senderLocation;
    private java.lang.String senderLocationSource;
    private java.lang.String senderName;
    private com.visa.cbp.mpqr.facade.SenderPaymentInstrument senderPaymentInstrument;
    private java.lang.String senderPostalCode;
    private java.lang.String senderReference;
    private java.lang.String senderStateCode;

    public java.lang.String getSenderAddress() {
        return this.senderAddress;
    }

    public void setSenderAddress(java.lang.String str) {
        this.senderAddress = str;
    }

    public java.lang.String getsenderLocation() {
        return this.senderLocation;
    }

    public void setsenderLocation(java.lang.String str) {
        this.senderLocation = str;
    }

    public java.lang.String getsenderLocationSource() {
        return this.senderLocationSource;
    }

    public void setsenderLocationSource(java.lang.String str) {
        this.senderLocationSource = str;
    }

    public java.lang.String getSenderPostalCode() {
        return this.senderPostalCode;
    }

    public void setSenderPostalCode(java.lang.String str) {
        this.senderPostalCode = str;
    }

    public java.lang.String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(java.lang.String str) {
        this.senderName = str;
    }

    public java.lang.String getSenderDateOfBirth() {
        return this.senderDateOfBirth;
    }

    public void setSenderDateOfBirth(java.lang.String str) {
        this.senderDateOfBirth = str;
    }

    public com.visa.cbp.mpqr.facade.SenderPaymentInstrument getSenderPaymentInstrument() {
        return this.senderPaymentInstrument;
    }

    public void setSenderPaymentInstrument(com.visa.cbp.mpqr.facade.SenderPaymentInstrument senderPaymentInstrument) {
        this.senderPaymentInstrument = senderPaymentInstrument;
    }

    public java.lang.String getSenderReference() {
        return this.senderReference;
    }

    public void setSenderReference(java.lang.String str) {
        this.senderReference = str;
    }

    public java.lang.String getSenderCity() {
        return this.senderCity;
    }

    public void setSenderCity(java.lang.String str) {
        this.senderCity = str;
    }

    public java.lang.String getSenderStateCode() {
        return this.senderStateCode;
    }

    public void setSenderStateCode(java.lang.String str) {
        this.senderStateCode = str;
    }

    public java.lang.String getSenderCountryCode() {
        return this.senderCountryCode;
    }

    public void setSenderCountryCode(java.lang.String str) {
        this.senderCountryCode = str;
    }
}

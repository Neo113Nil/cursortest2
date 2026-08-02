package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class BillingAddress {
    private java.lang.String city;
    private java.lang.String country;
    private java.lang.String line1;
    private java.lang.Object line2;
    private java.lang.String postalCode;
    private java.lang.String state;
    private java.lang.String zipCode;

    public java.lang.String getLine1() {
        return this.line1;
    }

    public void setLine1(java.lang.String str) {
        this.line1 = str;
    }

    public java.lang.Object getLine2() {
        return this.line2;
    }

    public void setLine2(java.lang.Object obj) {
        this.line2 = obj;
    }

    public java.lang.String getCity() {
        return this.city;
    }

    public void setCity(java.lang.String str) {
        this.city = str;
    }

    public java.lang.String getState() {
        return this.state;
    }

    public void setState(java.lang.String str) {
        this.state = str;
    }

    public java.lang.String getCountry() {
        return this.country;
    }

    public void setCountry(java.lang.String str) {
        this.country = str;
    }

    public java.lang.String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(java.lang.String str) {
        this.postalCode = str;
    }

    public java.lang.String getzipCode() {
        return this.zipCode;
    }

    public void setzipCode(java.lang.String str) {
        this.zipCode = str;
    }
}

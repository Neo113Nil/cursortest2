package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class IccCRTPrivateKey {
    java.lang.String CoefDmodP;
    java.lang.String CoefDmodQ;
    java.lang.String CoefQinvModP;
    java.lang.String exponent;
    java.lang.String modulus;
    java.lang.String primeP;
    java.lang.String primeQ;

    public java.lang.String getModulus() {
        return this.modulus;
    }

    public void setModulus(java.lang.String str) {
        this.modulus = str;
    }

    public java.lang.String getExponent() {
        return this.exponent;
    }

    public void setExponent(java.lang.String str) {
        this.exponent = str;
    }

    public java.lang.String getPrimeP() {
        return this.primeP;
    }

    public void setPrimeP(java.lang.String str) {
        this.primeP = str;
    }

    public java.lang.String getPrimeQ() {
        return this.primeQ;
    }

    public void setPrimeQ(java.lang.String str) {
        this.primeQ = str;
    }

    public java.lang.String getCoefDmodP() {
        return this.CoefDmodP;
    }

    public void setCoefDmodP(java.lang.String str) {
        this.CoefDmodP = str;
    }

    public java.lang.String getCoefDmodQ() {
        return this.CoefDmodQ;
    }

    public void setCoefDmodQ(java.lang.String str) {
        this.CoefDmodQ = str;
    }

    public java.lang.String getCoefQinvModP() {
        return this.CoefQinvModP;
    }

    public void setCoefQinvModP(java.lang.String str) {
        this.CoefQinvModP = str;
    }
}

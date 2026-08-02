package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class PullFundsTransaction {
    private java.lang.String cavv;
    private java.lang.String feeProgramIndicator;
    private java.lang.String foreignExchangeFeeTransaction;
    private java.lang.String memberComments;
    private java.lang.String surcharge;

    public java.lang.String getForeignExchangeFeeTransaction() {
        return this.foreignExchangeFeeTransaction;
    }

    public void setForeignExchangeFeeTransaction(java.lang.String str) {
        this.foreignExchangeFeeTransaction = str;
    }

    public java.lang.String getFeeProgramIndicator() {
        return this.feeProgramIndicator;
    }

    public void setFeeProgramIndicator(java.lang.String str) {
        this.feeProgramIndicator = str;
    }

    public java.lang.String getMemberComments() {
        return this.memberComments;
    }

    public void setMemberComments(java.lang.String str) {
        this.memberComments = str;
    }

    public java.lang.String getSurcharge() {
        return this.surcharge;
    }

    public void setSurcharge(java.lang.String str) {
        this.surcharge = str;
    }

    public java.lang.String getCavv() {
        return this.cavv;
    }

    public void setCavv(java.lang.String str) {
        this.cavv = str;
    }
}

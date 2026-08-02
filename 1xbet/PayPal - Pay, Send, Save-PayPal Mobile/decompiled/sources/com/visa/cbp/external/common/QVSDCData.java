package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class QVSDCData {

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String auc;
    java.lang.String ced;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String cid;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String countryCode;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String ctq;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String cvn;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String digitalWalletID;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String ffi;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String psn;
    com.visa.cbp.external.common.QVSDCWithODA qVSDCWithODA;
    com.visa.cbp.external.common.QVSDCWithoutODA qVSDCWithoutODA;

    public java.lang.String getCtq() {
        return this.ctq;
    }

    public void setCtq(java.lang.String str) {
        this.ctq = str;
    }

    public java.lang.String getFfi() {
        return this.ffi;
    }

    public void setFfi(java.lang.String str) {
        this.ffi = str;
    }

    public java.lang.String getAuc() {
        return this.auc;
    }

    public void setAuc(java.lang.String str) {
        this.auc = str;
    }

    public java.lang.String getPsn() {
        return this.psn;
    }

    public void setPsn(java.lang.String str) {
        this.psn = str;
    }

    public java.lang.String getCvn() {
        return this.cvn;
    }

    public void setCvn(java.lang.String str) {
        this.cvn = str;
    }

    public java.lang.String getDigitalWalletID() {
        return this.digitalWalletID;
    }

    public void setDigitalWalletID(java.lang.String str) {
        this.digitalWalletID = str;
    }

    public java.lang.String getCed() {
        return this.ced;
    }

    public void setCed(java.lang.String str) {
        this.ced = str;
    }

    public java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(java.lang.String str) {
        this.countryCode = str;
    }

    public com.visa.cbp.external.common.QVSDCWithoutODA getQVSDCWithoutODA() {
        return this.qVSDCWithoutODA;
    }

    public void setQVSDCWithoutODA(com.visa.cbp.external.common.QVSDCWithoutODA qVSDCWithoutODA) {
        this.qVSDCWithoutODA = qVSDCWithoutODA;
    }

    public com.visa.cbp.external.common.QVSDCWithODA getqVSDCWithODA() {
        return this.qVSDCWithODA;
    }

    public void setqVSDCWithODA(com.visa.cbp.external.common.QVSDCWithODA qVSDCWithODA) {
        this.qVSDCWithODA = qVSDCWithODA;
    }

    public java.lang.String getCid() {
        return this.cid;
    }

    public void setCid(java.lang.String str) {
        this.cid = str;
    }
}

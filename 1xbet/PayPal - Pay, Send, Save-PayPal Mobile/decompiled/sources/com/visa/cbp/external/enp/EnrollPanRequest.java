package com.visa.cbp.external.enp;

/* loaded from: classes5.dex */
public class EnrollPanRequest extends com.visa.cbp.external.common.JsonConverter {

    @com.visa.cbp.external.common.NullValueValidate
    public java.lang.String clientAppID;

    @com.visa.cbp.external.common.NullValueValidate
    public java.lang.String clientWalletAccountID;
    public java.lang.String consumerEntryMode;

    @com.visa.cbp.external.common.NullValueValidate
    public java.lang.String encPaymentInstrument;
    public java.lang.String encryptionMetaData;

    @com.visa.cbp.external.common.NullValueValidate
    public java.lang.String locale;

    @com.visa.cbp.external.common.NullValueValidate
    public java.lang.String panSource;

    public java.lang.String getClientAppID() {
        return this.clientAppID;
    }

    public void setClientAppID(java.lang.String str) {
        this.clientAppID = str;
    }

    public java.lang.String getLocale() {
        return this.locale;
    }

    public void setLocale(java.lang.String str) {
        this.locale = str;
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

    public java.lang.String getEncryptionMetaData() {
        return this.encryptionMetaData;
    }

    public void setEncryptionMetaData(java.lang.String str) {
        this.encryptionMetaData = str;
    }

    public java.lang.String getEncPaymentInstrument() {
        return this.encPaymentInstrument;
    }

    public void setEncPaymentInstrument(java.lang.String str) {
        this.encPaymentInstrument = str;
    }

    public java.lang.String getClientWalletAccountID() {
        return this.clientWalletAccountID;
    }

    public void setClientWalletAccountID(java.lang.String str) {
        this.clientWalletAccountID = str;
    }
}

package my.com.softspace.ssfasstapsdk.transaction;

/* loaded from: classes17.dex */
public class KernelConfigurationParams {
    private java.util.LinkedHashMap<java.lang.String, byte[]> applications;
    private boolean isDefaultConfig = false;
    private java.lang.String merchantCategoryCode;
    private java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> terminalCVMLimit;
    private java.lang.String terminalCountryCode;
    private java.lang.String transactionCurrencyCode;
    private java.lang.String transactionCurrencyExponent;
    private my.com.softspace.ssfasstapsdk.transaction.TransactionType transactionType;

    public java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> getTerminalCVMLimit() {
        return this.terminalCVMLimit;
    }

    public void setTerminalCVMLimit(java.util.LinkedHashMap<java.lang.Integer, java.lang.Long> linkedHashMap) {
        this.terminalCVMLimit = linkedHashMap;
    }

    public java.util.LinkedHashMap<java.lang.String, byte[]> getApplications() {
        return this.applications;
    }

    public void setApplications(java.util.LinkedHashMap<java.lang.String, byte[]> linkedHashMap) {
        this.applications = linkedHashMap;
    }

    public java.lang.String getTerminalCountryCode() {
        return this.terminalCountryCode;
    }

    public void setTerminalCountryCode(java.lang.String str) {
        this.terminalCountryCode = str;
    }

    public java.lang.String getTransactionCurrencyCode() {
        return this.transactionCurrencyCode;
    }

    public void setTransactionCurrencyCode(java.lang.String str) {
        this.transactionCurrencyCode = str;
    }

    public java.lang.String getTransactionCurrencyExponent() {
        return this.transactionCurrencyExponent;
    }

    public void setTransactionCurrencyExponent(java.lang.String str) {
        this.transactionCurrencyExponent = str;
    }

    public my.com.softspace.ssfasstapsdk.transaction.TransactionType getTransactionType() {
        return this.transactionType;
    }

    public void setTransactionType(my.com.softspace.ssfasstapsdk.transaction.TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public java.lang.String getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    public void setMerchantCategoryCode(java.lang.String str) {
        this.merchantCategoryCode = str;
    }

    public boolean isDefaultConfig() {
        return this.isDefaultConfig;
    }

    public void setDefaultConfig(boolean z) {
        this.isDefaultConfig = z;
    }
}

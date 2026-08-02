package my.com.softspace.reader;

/* loaded from: classes17.dex */
public class TransactionConfigurations {
    private java.lang.String Camera2StreamConfigurationMap;
    private java.util.LinkedHashMap<java.lang.String, byte[]> getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges = false;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;
    private android.util.SparseArray<java.lang.Long> getOutputMinFrameDuration;

    public java.lang.String getAmountOther() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setAmountOther(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public android.util.SparseArray<java.lang.Long> getTerminalCvmRequiredLimit() {
        return this.getOutputMinFrameDuration;
    }

    public void setTerminalCvmRequiredLimit(android.util.SparseArray<java.lang.Long> sparseArray) {
        this.getOutputMinFrameDuration = sparseArray;
    }

    public java.util.LinkedHashMap<java.lang.String, byte[]> getApplicationConfig() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setApplicationConfig(java.util.LinkedHashMap<java.lang.String, byte[]> linkedHashMap) {
        this.getHighResolutionOutputSizeshNQ4ISI = linkedHashMap;
    }

    public java.lang.String getTerminalCountryCode() {
        return this.getHighSpeedVideoSizes;
    }

    public void setTerminalCountryCode(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public java.lang.String getTransactionCurrencyCode() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setTransactionCurrencyCode(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str;
    }

    public java.lang.String getTransactionCurrencyExponent() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setTransactionCurrencyExponent(java.lang.String str) {
        this.getInputSizeshNQ4ISI = str;
    }

    public java.lang.String getTransactionType() {
        return this.getInputFormats;
    }

    public void setTransactionType(java.lang.String str) {
        this.getInputFormats = str;
    }

    public java.lang.String getMerchantCategoryCode() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setMerchantCategoryCode(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public boolean isDefaultConfig() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setDefaultConfig(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }
}

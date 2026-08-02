package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public enum InputMethod {
    BANK_APP("bankApp"),
    ON_FILE("on-file"),
    MANUAL("manual"),
    OCR(com.google.mlkit.common.sdkinternal.OptionalModuleUtils.OCR),
    READER_MODE("readermode");

    private java.lang.String getHighSpeedVideoSizes;

    InputMethod(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public final java.lang.String getValue() {
        return this.getHighSpeedVideoSizes;
    }
}

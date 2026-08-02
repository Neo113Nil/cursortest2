package com.microblink.blinkid.activity.result;

/* loaded from: classes9.dex */
public abstract class BaseScanResult<T> {
    private final java.lang.Throwable Camera2StreamConfigurationMap;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.activity.result.ResultStatus getHighSpeedVideoFpsRangesFor;

    public BaseScanResult(com.microblink.blinkid.activity.result.ResultStatus resultStatus, T t, java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRangesFor = resultStatus;
        this.getHighResolutionOutputSizeshNQ4ISI = t;
        this.Camera2StreamConfigurationMap = th;
    }

    public java.lang.Throwable getException() {
        return this.Camera2StreamConfigurationMap;
    }

    public T getResult() {
        return (T) this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.microblink.blinkid.activity.result.ResultStatus getResultStatus() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}

package com.microblink.blinkid.view.recognition;

/* loaded from: classes.dex */
public interface ScanResultListener {
    void onScanningDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType);

    void onUnrecoverableError(java.lang.Throwable th);
}

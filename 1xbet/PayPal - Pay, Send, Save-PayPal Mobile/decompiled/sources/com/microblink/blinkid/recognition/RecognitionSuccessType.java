package com.microblink.blinkid.recognition;

/* loaded from: classes.dex */
public enum RecognitionSuccessType {
    UNSUCCESSFUL,
    PARTIAL,
    SUCCESSFUL,
    STAGE_SUCCESSFUL;

    public static com.microblink.blinkid.recognition.RecognitionSuccessType fromNativeRecognitionState(int i) {
        return values()[i];
    }
}

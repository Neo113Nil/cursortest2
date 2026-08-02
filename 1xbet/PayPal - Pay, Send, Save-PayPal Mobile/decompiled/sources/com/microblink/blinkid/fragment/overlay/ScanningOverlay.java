package com.microblink.blinkid.fragment.overlay;

/* loaded from: classes10.dex */
public interface ScanningOverlay extends com.microblink.blinkid.view.recognition.ScanResultListener {
    void onFrameRecognitionDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType);

    void onRecognizerRunnerFragmentAttached(com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment, android.app.Activity activity);

    void onRecognizerRunnerViewCreated(com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment);

    void pauseScanning();

    void resumeScanning();
}

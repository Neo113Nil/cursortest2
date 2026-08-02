package com.microblink.blinkid.fragment.overlay.blinkid;

/* loaded from: classes10.dex */
public interface BlinkIdOverlayView {

    public enum ProcessingError {
        MANDATORY_FIELD_MISSING,
        BLUR_DETECTED,
        GLARE_DETECTED,
        SCANNING_WRONG_SIDE,
        FACE_PHOTO_NOT_FULLY_VISIBLE
    }

    void cleanup();

    android.view.ViewGroup createLayout(android.app.Activity activity, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView);

    com.microblink.blinkid.fragment.overlay.components.TorchController createTorchController(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView);

    com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getDataMismatchStrings();

    com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getDocumentNotSupportedDialogStrings();

    com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView getOnboardingView();

    com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getRecognitionTimeoutDialogStrings();

    com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getSidesNotMatchingDialogStrings();

    void onCardDetectionUpdate(com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus);

    void onConfigurationChanged(int i);

    void onDocumentClassified();

    void onErrorDialogShown();

    void onFirstSideScanStarted();

    void onFirstSideScanSuccess(boolean z, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation);

    void onGlare(boolean z);

    void onMovingCloserToBarcodeRequired();

    void onProcessingError(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError processingError);

    long onScanSuccess();

    void onSecondSideScanStarted();

    void onTorchStateChanged(boolean z);

    void setMandatoryFieldsMissingTooltipText(int[] iArr, android.app.Activity activity);

    void setRecognizerSupportsClassification(boolean z);

    void setScanRecognitionModeOverlay(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode scanRecognitionMode);

    void setShowBackSideBarcodeInstructions(boolean z);
}

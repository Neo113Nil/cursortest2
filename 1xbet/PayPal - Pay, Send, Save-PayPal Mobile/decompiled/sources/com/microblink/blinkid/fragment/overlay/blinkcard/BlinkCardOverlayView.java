package com.microblink.blinkid.fragment.overlay.blinkcard;

/* loaded from: classes10.dex */
public interface BlinkCardOverlayView {
    void cleanup();

    android.view.ViewGroup createLayout(android.app.Activity activity, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView);

    com.microblink.blinkid.fragment.overlay.components.TorchController createTorchController(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView);

    void disableManualEntryButton();

    void enableManualEntryButton(android.view.View.OnClickListener onClickListener);

    com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView getOnboardingView();

    com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getRecognitionTimeoutDialogStrings();

    void onCardDetectionUpdate(com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus);

    void onConfigurationChanged(int i);

    void onErrorDialogShown();

    void onFirstSideScanStarted();

    void onFrameProcessingStatus(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardProcessingStatus blinkCardProcessingStatus);

    long onScanSuccess();

    void onSecondSideScanStarted();

    void onTorchStateChanged(boolean z);
}

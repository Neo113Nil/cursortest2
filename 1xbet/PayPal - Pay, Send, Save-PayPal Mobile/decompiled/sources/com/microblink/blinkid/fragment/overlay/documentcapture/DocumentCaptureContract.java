package com.microblink.blinkid.fragment.overlay.documentcapture;

/* loaded from: classes10.dex */
public interface DocumentCaptureContract {

    public interface OverlayController {
        void onBackButtonClicked();

        void onCaptureButtonClicked();

        void onTorchButtonClicked();
    }

    public interface OverlayView {
        void bindOverlayController(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayController overlayController);

        void cleanup();

        void clearAction();

        void clearDetection();

        void createLayout(android.content.Context context, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView);

        void onConfigurationChanged(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, android.content.res.Configuration configuration);

        void onScanStarted();

        void onTorchStateChanged(boolean z);

        void onTorchSupportStatusAvailable(boolean z);

        void showAction(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction documentCaptureAction);

        void showDetection(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection);

        void showScanSuccess(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.UiUpdateListener uiUpdateListener);
    }

    public interface UiUpdateListener {
        void onUiUpdateFinished();
    }
}

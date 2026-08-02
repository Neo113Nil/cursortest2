package com.microblink.blinkid.fragment.overlay.documentcapture;

/* loaded from: classes10.dex */
public class DocumentCaptureOverlayController extends com.microblink.blinkid.fragment.overlay.BaseOverlayController implements com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayController {
    private final com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizer Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.directApi.RecognizerRunner getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizer getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlaySettings getHighSpeedVideoSizes;
    private final com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView getInputFormats;
    private com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener getOutputFormats;

    /* renamed from: com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController$2, reason: invalid class name */
    public class AnonymousClass2 implements com.microblink.blinkid.view.recognition.HighResImageListener {
        AnonymousClass2() {
        }

        @Override // com.microblink.blinkid.view.recognition.HighResImageListener
        public void onHighResImageAvailable(final com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
            final com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener = new com.microblink.blinkid.view.recognition.ScanResultListener() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.2.1
                @Override // com.microblink.blinkid.view.recognition.ScanResultListener
                public void onScanningDone(final com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
                    if (recognitionSuccessType != com.microblink.blinkid.recognition.RecognitionSuccessType.SUCCESSFUL) {
                        com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.resumeScanning();
                        return;
                    }
                    com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.Camera2StreamConfigurationMap.consumeResultFrom(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getHighSpeedVideoFpsRanges);
                    com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getHighSpeedVideoSizes.getDocumentCaptureRecognizerTransferable().setCapturedFullImage(highResImageWrapper);
                    com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.llIIlIIlll.play();
                    com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getInputFormats.showScanSuccess(new com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.UiUpdateListener() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.2.1.1
                        @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.UiUpdateListener
                        public void onUiUpdateFinished() {
                            com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.llIIlIlIIl.onScanningDone(recognitionSuccessType);
                            com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.resumeScanningAfterScanningDone();
                        }
                    });
                }

                @Override // com.microblink.blinkid.view.recognition.ScanResultListener
                public void onUnrecoverableError(java.lang.Throwable th) {
                    com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.llIIlIlIIl.onUnrecoverableError(th);
                }
            };
            com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getHighSpeedVideoFpsRanges);
            com.microblink.blinkid.image.InputImage inputImage = highResImageWrapper.getImage().toInputImage();
            com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getHighResolutionOutputSizeshNQ4ISI.resetRecognitionState();
            if (com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getHighResolutionOutputSizeshNQ4ISI.getCurrentState() != com.microblink.blinkid.directApi.RecognizerRunner.State.OFFLINE) {
                com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getHighResolutionOutputSizeshNQ4ISI.recognizeStillImageWithRecognizers(inputImage, scanResultListener, recognizerBundle);
            } else {
                com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getHighResolutionOutputSizeshNQ4ISI.initialize(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getContext(), recognizerBundle, new com.microblink.blinkid.directApi.DirectApiErrorListener() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.2.2
                    @Override // com.microblink.blinkid.directApi.DirectApiErrorListener
                    public void onRecognizerError(java.lang.Throwable th) {
                        scanResultListener.onUnrecoverableError(th);
                        com.microblink.blinkid.util.Log.e(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this, "Direct API error {}", th.getMessage());
                    }
                });
                com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getHighResolutionOutputSizeshNQ4ISI.recognizeStillImage(inputImage, scanResultListener);
            }
        }
    }

    public DocumentCaptureOverlayController(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlaySettings documentCaptureOverlaySettings, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener, com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView overlayView) {
        super(scanResultListener);
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getInputFormats = overlayView;
        overlayView.bindOverlayController(this);
        this.getHighSpeedVideoSizes = documentCaptureOverlaySettings;
        com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizer documentCaptureRecognizer = documentCaptureOverlaySettings.getDocumentCaptureRecognizerTransferable().getDocumentCaptureRecognizer();
        this.Camera2StreamConfigurationMap = documentCaptureRecognizer;
        com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizer mo10869clone = documentCaptureRecognizer.mo10869clone();
        this.getHighSpeedVideoFpsRanges = mo10869clone;
        mo10869clone.setMinDocumentScale(0.1f);
        this.getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.directApi.RecognizerRunner.getSingletonInstance();
    }

    static void Camera2StreamConfigurationMap(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController documentCaptureOverlayController) {
        if (documentCaptureOverlayController.getHighSpeedVideoFpsRangesFor) {
            documentCaptureOverlayController.getInputFormats.clearAction();
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final boolean llIIlIIlll() {
        return true;
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayController
    public void onBackButtonClicked() {
        this.IllIIIllII.getActivity().onBackPressed();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void onCameraAutofocusFailed() {
        this.getInputFormats.clearDetection();
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayController
    public void onCaptureButtonClicked() {
        pauseScanning();
        this.llIIIlllll.captureHighResImage(new com.microblink.blinkid.view.recognition.HighResImageListener() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.5
            @Override // com.microblink.blinkid.view.recognition.HighResImageListener
            public void onHighResImageAvailable(com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
                com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getHighSpeedVideoSizes.getDocumentCaptureRecognizerTransferable().setCapturedFullImage(highResImageWrapper);
                com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getInputFormats.showScanSuccess(new com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.UiUpdateListener() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.5.1
                    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.UiUpdateListener
                    public void onUiUpdateFinished() {
                        com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.llIIlIlIIl.onScanningDone(com.microblink.blinkid.recognition.RecognitionSuccessType.PARTIAL);
                        com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.resumeScanningAfterScanningDone();
                    }
                });
            }
        });
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void onRecognizerRunnerViewCreated(com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment) {
        super.onRecognizerRunnerViewCreated(recognizerRunnerFragment);
        this.llIIIlllll.setHighResFrameCaptureEnabled(true);
        this.getHighSpeedVideoSizes.getCameraSettings().apply(this.llIIIlllll);
        com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks = new com.microblink.blinkid.metadata.MetadataCallbacks();
        metadataCallbacks.setFailedDetectionCallback(new com.microblink.blinkid.metadata.detection.FailedDetectionCallback() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.3
            @Override // com.microblink.blinkid.metadata.detection.FailedDetectionCallback
            public void onDetectionFailed() {
                com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getInputFormats.clearDetection();
                com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.Camera2StreamConfigurationMap(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this);
            }
        });
        metadataCallbacks.setQuadDetectionCallback(new com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.4
            @Override // com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback
            public void onQuadDetection(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
                com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus = displayableQuadDetection.getDetectionStatus();
                if (displayableQuadDetection.getDetectionStatus() == com.microblink.blinkid.view.recognition.DetectionStatus.FAILED) {
                    com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getInputFormats.clearDetection();
                    return;
                }
                if (detectionStatus == com.microblink.blinkid.view.recognition.DetectionStatus.CAMERA_TOO_FAR) {
                    com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this, com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction.MOVE_CLOSER);
                } else if (detectionStatus == com.microblink.blinkid.view.recognition.DetectionStatus.SUCCESS) {
                    com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this, com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction.HOLD_STEADY);
                } else {
                    com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.Camera2StreamConfigurationMap(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this);
                }
                com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getInputFormats.showDetection(displayableQuadDetection);
            }
        });
        com.microblink.blinkid.image.DebugImageListener debugImageListener = this.getHighSpeedVideoSizes.getDebugImageListener();
        if (debugImageListener != null) {
            metadataCallbacks.setDebugImageCallback(debugImageListener);
        }
        this.llIIIlllll.setMetadataCallbacks(metadataCallbacks);
        this.llIIIlllll.setAnimateRotation(true);
        this.getInputFormats.createLayout(getContext(), this.llIIIlllll);
        this.IIlIIIllIl.setup(this.llIIIlllll);
        this.IIlIIIllIl.setTorchStateListener(new com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.1
            @Override // com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener
            public void onTorchStateChanged(boolean z) {
                com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getInputFormats.onTorchStateChanged(z);
                if (com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getOutputFormats != null) {
                    com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getOutputFormats.onTorchStateChanged(z);
                }
            }

            @Override // com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener
            public void onTorchStateInitialised(boolean z) {
                com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getInputFormats.onTorchSupportStatusAvailable(z);
                if (com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getOutputFormats != null) {
                    com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.this.getOutputFormats.onTorchStateInitialised(z);
                }
            }
        });
        this.llIIIlllll.setRecognizerBundle(new com.microblink.blinkid.entities.recognizers.RecognizerBundle(this.Camera2StreamConfigurationMap));
        this.getInputFormats.showAction(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction.SEARCHING_DOCUMENT);
        this.getInputFormats.onScanStarted();
    }

    @Override // com.microblink.blinkid.view.recognition.ScanResultListener
    public void onScanningDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        if (recognitionSuccessType == com.microblink.blinkid.recognition.RecognitionSuccessType.UNSUCCESSFUL) {
            return;
        }
        pauseScanning();
        com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction documentCaptureAction = com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction.HOLD_STEADY;
        this.getInputFormats.showAction(documentCaptureAction);
        if (documentCaptureAction != com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction.SEARCHING_DOCUMENT) {
            this.getHighSpeedVideoFpsRangesFor = true;
        }
        this.llIIIlllll.captureHighResImage(new com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController.AnonymousClass2());
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayController
    public void onTorchButtonClicked() {
        this.IIlIIIllIl.toggleTorchState();
    }

    public void resumeScanningAfterScanningDone() {
        resumeScanning();
        if (this.llIIIlllll.isScanningPaused()) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getInputFormats.showAction(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction.SEARCHING_DOCUMENT);
        this.getInputFormats.onScanStarted();
    }

    public void setTorchStateListener(com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener overlayTorchStateListener) {
        this.getOutputFormats = overlayTorchStateListener;
    }

    static void getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController documentCaptureOverlayController, com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction documentCaptureAction) {
        documentCaptureOverlayController.getInputFormats.showAction(documentCaptureAction);
        if (documentCaptureAction != com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction.SEARCHING_DOCUMENT) {
            documentCaptureOverlayController.getHighSpeedVideoFpsRangesFor = true;
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final int IlIllIlIIl() {
        return this.getHighSpeedVideoSizes.getSplashScreenLayoutResourceId();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IllIIIIllI() {
        this.getHighSpeedVideoSizes.getDocumentCaptureRecognizerTransferable().clearSavedState();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IllIIIllII() {
        this.getHighResolutionOutputSizeshNQ4ISI.terminate();
        this.getInputFormats.cleanup();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IlIllIlIIl(android.os.Bundle bundle) {
        this.getHighSpeedVideoSizes.getDocumentCaptureRecognizerTransferable().saveState();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final int llIIlIlIIl() {
        return this.getHighSpeedVideoSizes.getBeepSoundResourceId();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void llIIlIlIIl(android.content.res.Configuration configuration) {
        this.getInputFormats.onConfigurationChanged(this.llIIIlllll, this.IllIIIllII.getResources().getConfiguration());
    }
}

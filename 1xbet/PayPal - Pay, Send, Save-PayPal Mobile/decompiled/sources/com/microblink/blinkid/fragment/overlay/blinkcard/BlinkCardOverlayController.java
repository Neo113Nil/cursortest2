package com.microblink.blinkid.fragment.overlay.blinkcard;

/* loaded from: classes10.dex */
public class BlinkCardOverlayController extends com.microblink.blinkid.fragment.overlay.BaseOverlayController {
    private static final long Camera2StreamConfigurationMap = com.microblink.blinkid.fragment.overlay.components.FlipManager.FLIP_DURATION_MS;
    private static final long getHighSpeedVideoSizes = java.util.concurrent.TimeUnit.SECONDS.toMillis(8);
    private final com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.fragment.overlay.DocumentRecognizerManager getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.fragment.overlay.DocumentSide getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.metadata.recognition.FirstSideRecognitionCallback getHighSpeedVideoSizesFor;
    private final com.microblink.blinkid.entities.recognizers.HighResImagesBundle getInputFormats;
    private final android.os.Handler getInputSizeshNQ4ISI;
    private final com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingPresenter getOutputFormats;
    private com.microblink.blinkid.metadata.MetadataCallbacks getOutputMinFrameDuration;
    private final java.lang.Runnable getOutputMinFrameDurationlomOqCM;
    private final com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler getOutputStallDuration;
    private final com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView getOutputStallDurationlomOqCM;
    protected final com.microblink.blinkid.fragment.overlay.PingSessionFlowManager lllllIlIll;

    public BlinkCardOverlayController(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings blinkCardOverlaySettings, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener, com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayView blinkCardOverlayView) {
        super(scanResultListener);
        this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE;
        this.getInputFormats = new com.microblink.blinkid.entities.recognizers.HighResImagesBundle();
        com.microblink.blinkid.fragment.overlay.DocumentRecognizerManager documentRecognizerManager = new com.microblink.blinkid.fragment.overlay.DocumentRecognizerManager();
        this.getHighSpeedVideoFpsRanges = documentRecognizerManager;
        this.getInputSizeshNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighSpeedVideoSizesFor = new com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.AnonymousClass2();
        this.getOutputMinFrameDurationlomOqCM = new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.m10873$r8$lambda$GlgEj8m6kLivC8C_oEPF2SvJ2w(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this);
            }
        };
        this.getOutputStallDurationlomOqCM = blinkCardOverlayView;
        this.getHighResolutionOutputSizeshNQ4ISI = blinkCardOverlaySettings;
        documentRecognizerManager.setup(blinkCardOverlaySettings.getHighSpeedVideoFpsRanges, blinkCardOverlaySettings.getInputSizeshNQ4ISI);
        this.getOutputStallDuration = com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandlerFactory.create(blinkCardOverlaySettings.Camera2StreamConfigurationMap);
        if (blinkCardOverlayView.getOnboardingView() != null) {
            this.getOutputFormats = new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingPresenter(this, blinkCardOverlayView.getOnboardingView(), blinkCardOverlaySettings.getShowTooltipTimeIntervalMs());
        } else {
            this.getOutputFormats = null;
        }
        this.lllllIlIll = new com.microblink.blinkid.fragment.overlay.PingSessionFlowManager();
    }

    private void getHighSpeedVideoSizes() {
        pauseScanning();
        this.getOutputStallDurationlomOqCM.onSecondSideScanStarted();
        this.IllIIIIllI.postDelayed(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.resumeScanning();
            }
        }, Camera2StreamConfigurationMap);
        if (this.getHighSpeedVideoFpsRangesFor != com.microblink.blinkid.fragment.overlay.DocumentSide.SECOND_SIDE || this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration == 0) {
            return;
        }
        this.IllIIIIllI.postDelayed(this.getOutputMinFrameDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration);
    }

    public com.microblink.blinkid.entities.recognizers.HighResImagesBundle getHighResImagesBundle() {
        return this.getInputFormats;
    }

    protected final void lllIlIlIIl() {
        this.getOutputStallDurationlomOqCM.onFirstSideScanStarted();
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingPresenter blinkCardDialogOnboardingPresenter = this.getOutputFormats;
        if (blinkCardDialogOnboardingPresenter != null) {
            blinkCardDialogOnboardingPresenter.onFirstSideScanStarted();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void onFrameRecognitionDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardProcessingStatus blinkCardProcessingStatus;
        com.microblink.blinkid.entities.recognizers.Recognizer<?>[] recognizers = this.llIIIlllll.getRecognizerBundle().getRecognizers();
        int length = recognizers.length;
        for (int i = 0; i < length; i++) {
            com.microblink.blinkid.entities.recognizers.Recognizer<?> recognizer = recognizers[i];
            if (recognizer instanceof com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer) {
                recognizer = ((com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer) recognizer).getSlaveRecognizer();
            }
            if (recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer) {
                blinkCardProcessingStatus = ((com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result) ((com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer) recognizer).getResult()).getProcessingStatus();
                this.lllllIlIll.recordProcessingStatus(blinkCardProcessingStatus.ordinal());
            } else {
                blinkCardProcessingStatus = null;
            }
            this.lllllIlIll.recordResultState(((com.microblink.blinkid.entities.recognizers.Recognizer.Result) recognizer.getResult()).getResultState());
            this.getOutputStallDurationlomOqCM.onFrameProcessingStatus(blinkCardProcessingStatus);
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void onRecognizerRunnerViewCreated(com.microblink.blinkid.fragment.RecognizerRunnerFragment recognizerRunnerFragment) {
        super.onRecognizerRunnerViewCreated(recognizerRunnerFragment);
        this.llIIIlllll.setRecognizerBundle(this.getHighSpeedVideoFpsRanges.buildRecognizerBundle(this.getHighSpeedVideoFpsRangesFor));
        this.llIIIlllll.setHighResFrameCaptureEnabled(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes);
        this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats.apply(this.llIIIlllll);
        com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks = new com.microblink.blinkid.metadata.MetadataCallbacks();
        metadataCallbacks.setFailedDetectionCallback(new com.microblink.blinkid.metadata.detection.FailedDetectionCallback() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda8
            @Override // com.microblink.blinkid.metadata.detection.FailedDetectionCallback
            public final void onDetectionFailed() {
                com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getOutputStallDuration.clear();
            }
        });
        final com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler recognitionFeedbackHandler = this.getOutputStallDuration;
        java.util.Objects.requireNonNull(recognitionFeedbackHandler);
        metadataCallbacks.setPointsDetectionCallback(new com.microblink.blinkid.metadata.detection.points.PointsDetectionCallback() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda9
            @Override // com.microblink.blinkid.metadata.detection.points.PointsDetectionCallback
            public final void onPointsDetection(com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection displayablePointsDetection) {
                com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler.this.onPointsDetection(displayablePointsDetection);
            }
        });
        metadataCallbacks.setQuadDetectionCallback(new com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda10
            @Override // com.microblink.blinkid.metadata.detection.quad.QuadDetectionCallback
            public final void onQuadDetection(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
                com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.$r8$lambda$NsBCrnM43aD0nFrPsPT7C2ZCm18(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this, displayableQuadDetection);
            }
        });
        metadataCallbacks.setFirstSideRecognitionCallback(this.getHighSpeedVideoSizesFor);
        metadataCallbacks.setDebugImageCallback(this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI);
        this.getOutputMinFrameDuration = metadataCallbacks;
        this.llIIIlllll.setMetadataCallbacks(metadataCallbacks);
        android.view.View createView = this.getOutputStallDuration.createView(this.llIIIlllll, this.getOutputMinFrameDuration);
        if (createView != null) {
            this.llIIIlllll.addChildView(createView, false);
        }
        final boolean isInMultiWindowMode = recognizerRunnerFragment.getActivity().isInMultiWindowMode();
        this.llIIIlllll.setMetadataCallbacks(this.getOutputMinFrameDuration);
        this.llIIIlllll.setOrientationAllowedListener(new com.microblink.blinkid.view.OrientationAllowedListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda6
            @Override // com.microblink.blinkid.view.OrientationAllowedListener
            public final boolean isOrientationAllowed(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
                return com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.m10874$r8$lambda$ab0sPmeKwcWYSMLv5jR3TnQGQ(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this, isInMultiWindowMode, orientation);
            }
        });
        android.view.ViewGroup createLayout = this.getOutputStallDurationlomOqCM.createLayout(this.IllIIIllII.getActivity(), this.llIIIlllll);
        if (this.getHighSpeedVideoFpsRanges.getRecognitionDebugMode() != com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode.RECOGNITION) {
            new com.microblink.blinkid.fragment.overlay.components.debug.DebugViewHandler().initialize(this.IllIIIllII.getActivity(), createLayout, this.getOutputMinFrameDuration);
        }
        com.microblink.blinkid.fragment.overlay.components.TorchController createTorchController = this.getOutputStallDurationlomOqCM.createTorchController(this.llIIIlllll);
        this.IIlIIIllIl = createTorchController;
        createTorchController.setTorchStateListener(new com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.1
            @Override // com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener
            public void onTorchStateChanged(boolean z) {
                com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getOutputStallDurationlomOqCM.onTorchStateChanged(z);
            }

            @Override // com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener
            public void onTorchStateInitialised(boolean z) {
            }
        });
        Camera2StreamConfigurationMap();
    }

    @Override // com.microblink.blinkid.view.recognition.ScanResultListener
    public void onScanningDone(com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        if (recognitionSuccessType == com.microblink.blinkid.recognition.RecognitionSuccessType.UNSUCCESSFUL) {
            return;
        }
        pauseScanning();
        this.llIIlIIlll.play();
        if (this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes) {
            this.llIIIlllll.captureHighResImage(new com.microblink.blinkid.view.recognition.HighResImageListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda5
                @Override // com.microblink.blinkid.view.recognition.HighResImageListener
                public final void onHighResImageAvailable(com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
                    com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.$r8$lambda$kKldPE20CZrZ2sZs7_8De4o8slo(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this, highResImageWrapper);
                }
            });
        } else {
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.getScanSuccessType());
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void pauseScanning() {
        super.pauseScanning();
        this.IllIIIIllI.removeCallbacks(this.getOutputMinFrameDurationlomOqCM);
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController, com.microblink.blinkid.fragment.overlay.ScanningOverlay
    public void resumeScanning() {
        super.resumeScanning();
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.llIIIlllll;
        if (recognizerRunnerView == null || recognizerRunnerView.isScanningPaused() || this.getHighSpeedVideoFpsRangesFor != com.microblink.blinkid.fragment.overlay.DocumentSide.SECOND_SIDE || this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration == 0) {
            return;
        }
        this.IllIIIIllI.postDelayed(this.getOutputMinFrameDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Camera2StreamConfigurationMap() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.shouldShowManualEntryButton()) {
            this.getOutputStallDurationlomOqCM.disableManualEntryButton();
        } else {
            this.getInputSizeshNQ4ISI.removeCallbacksAndMessages(null);
            this.getInputSizeshNQ4ISI.postDelayed(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    r0.getOutputStallDurationlomOqCM.enableManualEntryButton(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.m10876$r8$lambda$mTZdW8NGtIX7yDuwNKslqjCnao(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this, view);
                        }
                    });
                }
            }, getHighSpeedVideoSizes);
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final int IlIllIlIIl() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IllIIIIllI() {
        this.getHighSpeedVideoFpsRanges.clearBundleState();
        this.getInputFormats.clearSavedState();
        this.getOutputStallDuration.clear();
        if (this.getHighSpeedVideoFpsRangesFor == com.microblink.blinkid.fragment.overlay.DocumentSide.SECOND_SIDE) {
            this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE;
            this.getInputFormats.clearImages();
            this.getOutputStallDuration.clear();
            this.llIIIlllll.reconfigureRecognizers(this.getHighSpeedVideoFpsRanges.buildRecognizerBundle(this.getHighSpeedVideoFpsRangesFor));
        }
        getHighResolutionOutputSizeshNQ4ISI(0L);
        Camera2StreamConfigurationMap();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IllIIIllII() {
        this.getInputSizeshNQ4ISI.removeCallbacksAndMessages(null);
        this.getOutputStallDurationlomOqCM.cleanup();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void llIIIlllll() {
        this.getOutputStallDurationlomOqCM.disableManualEntryButton();
        this.getInputSizeshNQ4ISI.removeCallbacksAndMessages(null);
        this.IllIIIIllI.removeCallbacks(this.getOutputMinFrameDurationlomOqCM);
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final boolean llIIlIIlll() {
        return this.getHighSpeedVideoFpsRangesFor == com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE;
    }

    static void getOutputStallDuration(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController blinkCardOverlayController) {
        blinkCardOverlayController.getOutputStallDuration.clear();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void IlIllIlIIl(android.os.Bundle bundle) {
        this.getHighSpeedVideoFpsRanges.saveBundleState();
        this.getInputFormats.saveState();
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final int llIIlIlIIl() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(final com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        long onScanSuccess = this.getOutputStallDurationlomOqCM.onScanSuccess();
        this.IllIIIIllI.removeCallbacks(this.getOutputMinFrameDurationlomOqCM);
        this.IllIIIIllI.postDelayed(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.m10875$r8$lambda$iVvwjgI4P_wWONbY8zRGG7tkqU(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this, recognitionSuccessType);
            }
        }, onScanSuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighResolutionOutputSizeshNQ4ISI(long j) {
        if (this.getHighSpeedVideoFpsRangesFor == com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE) {
            this.IllIIIIllI.postDelayed(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.lllIlIlIIl();
                }
            }, j);
        } else {
            getHighSpeedVideoSizes();
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.BaseOverlayController
    public final void llIIlIlIIl(android.content.res.Configuration configuration) {
        int hostScreenOrientation = this.llIIIlllll.getHostScreenOrientation();
        this.getOutputStallDuration.onOrientationChange(hostScreenOrientation);
        this.getOutputStallDurationlomOqCM.onConfigurationChanged(hostScreenOrientation);
        this.IIlIIIllIl.updateTorchState(false);
    }

    /* renamed from: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$2, reason: invalid class name */
    public class AnonymousClass2 implements com.microblink.blinkid.metadata.recognition.FirstSideRecognitionCallback {
        AnonymousClass2() {
        }

        @Override // com.microblink.blinkid.metadata.recognition.FirstSideRecognitionCallback
        public void onFirstSideRecognitionFinished() {
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.llIIIlllll.pauseScanning();
            if (com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes) {
                com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.llIIIlllll.captureHighResImage(new com.microblink.blinkid.view.recognition.HighResImageListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$2$$ExternalSyntheticLambda0
                    @Override // com.microblink.blinkid.view.recognition.HighResImageListener
                    public final void onHighResImageAvailable(com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
                        com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.AnonymousClass2.getHighSpeedVideoSizes(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.AnonymousClass2.this, highResImageWrapper);
                    }
                });
                return;
            }
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.llIIlIIlll.play();
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.fragment.overlay.DocumentSide.SECOND_SIDE;
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.llIIIlllll.reconfigureRecognizers(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getHighSpeedVideoFpsRanges.buildRecognizerBundle(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getHighSpeedVideoFpsRangesFor));
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.getOutputStallDuration(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this);
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getHighResolutionOutputSizeshNQ4ISI(0L);
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.llIIIlllll.resumeScanning(false);
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.Camera2StreamConfigurationMap();
        }

        public static /* synthetic */ void getHighSpeedVideoSizes(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.AnonymousClass2 anonymousClass2, com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getInputFormats.addImage(highResImageWrapper);
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.llIIlIIlll.play();
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.fragment.overlay.DocumentSide.SECOND_SIDE;
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.llIIIlllll.reconfigureRecognizers(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getHighSpeedVideoFpsRanges.buildRecognizerBundle(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getHighSpeedVideoFpsRangesFor));
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.getOutputStallDuration(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this);
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.getHighResolutionOutputSizeshNQ4ISI(0L);
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.llIIIlllll.resumeScanning(false);
            com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this.Camera2StreamConfigurationMap();
        }
    }

    /* renamed from: $r8$lambda$-GlgEj8m6kLivC8C_oEPF2SvJ2w, reason: not valid java name */
    public static /* synthetic */ void m10873$r8$lambda$GlgEj8m6kLivC8C_oEPF2SvJ2w(final com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController blinkCardOverlayController) {
        blinkCardOverlayController.pauseScanning();
        blinkCardOverlayController.getOutputStallDurationlomOqCM.onErrorDialogShown();
        com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings recognitionTimeoutDialogStrings = blinkCardOverlayController.getOutputStallDurationlomOqCM.getRecognitionTimeoutDialogStrings();
        new android.app.AlertDialog.Builder(blinkCardOverlayController.getContext()).setTitle(recognitionTimeoutDialogStrings.title).setMessage(recognitionTimeoutDialogStrings.message).setPositiveButton(recognitionTimeoutDialogStrings.retryButton, new android.content.DialogInterface.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.m10877$r8$lambda$nXrt7Ah2GhzwWeRZ7sjboIq3mY(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController.this, dialogInterface, i);
            }
        }).setCancelable(false).create().show();
    }

    public static /* synthetic */ void $r8$lambda$NsBCrnM43aD0nFrPsPT7C2ZCm18(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController blinkCardOverlayController, com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
        blinkCardOverlayController.lllllIlIll.recordDetectionStatus(displayableQuadDetection.getDetectionStatus());
        blinkCardOverlayController.getOutputStallDurationlomOqCM.onCardDetectionUpdate(displayableQuadDetection.getDetectionStatus());
    }

    /* renamed from: $r8$lambda$ab-0s-PmeKwcWYSMLv5jR3TnQGQ, reason: not valid java name */
    public static /* synthetic */ boolean m10874$r8$lambda$ab0sPmeKwcWYSMLv5jR3TnQGQ(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController blinkCardOverlayController, boolean z, com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        return z || !blinkCardOverlayController.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor || orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT || orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_PORTRAIT_UPSIDE;
    }

    /* renamed from: $r8$lambda$iVvwjgI4P_wWONbY8z-RGG7tkqU, reason: not valid java name */
    public static /* synthetic */ void m10875$r8$lambda$iVvwjgI4P_wWONbY8zRGG7tkqU(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController blinkCardOverlayController, com.microblink.blinkid.recognition.RecognitionSuccessType recognitionSuccessType) {
        blinkCardOverlayController.llIIlIlIIl.onScanningDone(recognitionSuccessType);
        if (!blinkCardOverlayController.getHighResolutionOutputSizeshNQ4ISI.isEditScreenEnabled()) {
            blinkCardOverlayController.resumeScanning();
        }
        if (blinkCardOverlayController.IllIIIllII.getActivity().isFinishing()) {
            return;
        }
        blinkCardOverlayController.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE;
        blinkCardOverlayController.getInputFormats.clearImages();
        blinkCardOverlayController.getOutputStallDuration.clear();
        blinkCardOverlayController.llIIIlllll.reconfigureRecognizers(blinkCardOverlayController.getHighSpeedVideoFpsRanges.buildRecognizerBundle(blinkCardOverlayController.getHighSpeedVideoFpsRangesFor));
        blinkCardOverlayController.getHighResolutionOutputSizeshNQ4ISI(100L);
    }

    public static /* synthetic */ void $r8$lambda$kKldPE20CZrZ2sZs7_8De4o8slo(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController blinkCardOverlayController, com.microblink.blinkid.image.highres.HighResImageWrapper highResImageWrapper) {
        blinkCardOverlayController.getInputFormats.addImage(highResImageWrapper);
        blinkCardOverlayController.getHighResolutionOutputSizeshNQ4ISI(blinkCardOverlayController.getHighSpeedVideoFpsRanges.getScanSuccessType());
    }

    /* renamed from: $r8$lambda$mTZdW8NGtIX7yDuw-NKslqjCnao, reason: not valid java name */
    public static /* synthetic */ void m10876$r8$lambda$mTZdW8NGtIX7yDuwNKslqjCnao(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController blinkCardOverlayController, android.view.View view) {
        blinkCardOverlayController.pauseScanning();
        blinkCardOverlayController.getHighResolutionOutputSizeshNQ4ISI(com.microblink.blinkid.recognition.RecognitionSuccessType.UNSUCCESSFUL);
    }

    /* renamed from: $r8$lambda$nXrt7Ah2G-hzwWeRZ7sjboIq3mY, reason: not valid java name */
    public static /* synthetic */ void m10877$r8$lambda$nXrt7Ah2GhzwWeRZ7sjboIq3mY(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController blinkCardOverlayController, android.content.DialogInterface dialogInterface, int i) {
        blinkCardOverlayController.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.fragment.overlay.DocumentSide.FIRST_SIDE;
        blinkCardOverlayController.getInputFormats.clearImages();
        blinkCardOverlayController.getOutputStallDuration.clear();
        blinkCardOverlayController.llIIIlllll.reconfigureRecognizers(blinkCardOverlayController.getHighSpeedVideoFpsRanges.buildRecognizerBundle(blinkCardOverlayController.getHighSpeedVideoFpsRangesFor));
        blinkCardOverlayController.getHighResolutionOutputSizeshNQ4ISI(0L);
        blinkCardOverlayController.resumeScanning();
    }
}

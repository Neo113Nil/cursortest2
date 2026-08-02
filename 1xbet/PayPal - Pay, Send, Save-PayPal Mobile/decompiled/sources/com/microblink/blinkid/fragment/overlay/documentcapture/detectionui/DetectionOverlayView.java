package com.microblink.blinkid.fragment.overlay.documentcapture.detectionui;

/* loaded from: classes10.dex */
public class DetectionOverlayView implements com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView {
    private com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayController Camera2StreamConfigurationMap;
    private com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager getHighSpeedVideoFpsRanges;
    private android.widget.ImageButton getHighSpeedVideoFpsRangesFor;
    private android.widget.ImageButton getHighSpeedVideoSizes;
    private com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonView getHighSpeedVideoSizesFor;
    private com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayResources getInputFormats;
    private com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager getInputSizeshNQ4ISI;
    private com.microblink.blinkid.view.viewfinder.quadview.QuadViewManager getOutputFormats;
    private com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView getOutputMinFrameDuration;
    private final boolean getOutputSizes;
    private final int getOutputSizeshNQ4ISI;
    private final android.os.Handler getOutputStallDuration;

    /* renamed from: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView$8, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction.SEARCHING_DOCUMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction.MOVE_CLOSER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction.HOLD_STEADY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public DetectionOverlayView(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings detectionOverlayStrings, int i, boolean z) {
        this.getOutputStallDuration = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighResolutionOutputSizeshNQ4ISI = detectionOverlayStrings;
        this.getOutputSizeshNQ4ISI = i;
        this.getOutputSizes = z;
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void bindOverlayController(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayController overlayController) {
        this.Camera2StreamConfigurationMap = overlayController;
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void cleanup() {
        this.getOutputMinFrameDuration.cancelAnimation();
        this.getOutputStallDuration.removeCallbacksAndMessages(null);
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void clearAction() {
        this.getInputSizeshNQ4ISI.updateStatus("");
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void clearDetection() {
        this.getOutputFormats.animateQuadToDefaultPosition();
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void createLayout(android.content.Context context, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings.getHighSpeedVideoSizes(context);
        }
        this.getInputFormats = new com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayResources(context, this.getOutputSizeshNQ4ISI);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.microblink.blinkid.resources.Layouts.IlIllIlllI, (android.view.ViewGroup) recognizerRunnerView, false);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) inflate.findViewById(com.microblink.blinkid.library.R.id.defaultTorchButton);
        this.getHighSpeedVideoFpsRangesFor = imageButton;
        imageButton.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.Camera2StreamConfigurationMap.onTorchButtonClicked();
            }
        });
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) inflate.findViewById(com.microblink.blinkid.library.R.id.defaultBackButton);
        this.getHighSpeedVideoSizes = imageButton2;
        if (this.getOutputSizes) {
            imageButton2.setImageDrawable(this.getInputFormats.getHighSpeedVideoSizes);
            this.getHighSpeedVideoSizes.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.Camera2StreamConfigurationMap.onBackButtonClicked();
                }
            });
        } else {
            inflate.findViewById(com.microblink.blinkid.library.R.id.topButtonsContainer).setVisibility(8);
        }
        com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonView captureButtonView = (com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonView) inflate.findViewById(com.microblink.blinkid.library.R.id.captureButton);
        this.getHighSpeedVideoSizesFor = captureButtonView;
        captureButtonView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.3
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.Camera2StreamConfigurationMap.onCaptureButtonClicked();
            }
        });
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager(this.getHighSpeedVideoSizesFor);
        android.widget.TextSwitcher textSwitcher = (android.widget.TextSwitcher) inflate.findViewById(com.microblink.blinkid.library.R.id.statusTextSwitcher);
        textSwitcher.setBackground(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI);
        this.getInputSizeshNQ4ISI = new com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager(textSwitcher, new com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler.Default(this.getInputFormats.getOutputMinFrameDuration));
        com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView successFlashView = (com.microblink.blinkid.fragment.overlay.components.feedback.view.SuccessFlashView) inflate.findViewById(com.microblink.blinkid.library.R.id.successFlashView);
        this.getOutputMinFrameDuration = successFlashView;
        successFlashView.setup(this.getInputFormats.getHighSpeedVideoFpsRanges);
        this.getOutputFormats = com.microblink.blinkid.view.viewfinder.quadview.QuadViewManagerFactory.createDocumentDetectionQuadViewManager(recognizerRunnerView, this.getInputFormats.getHighSpeedVideoFpsRangesFor);
        recognizerRunnerView.addChildView(inflate, false);
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void onConfigurationChanged(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, android.content.res.Configuration configuration) {
        this.getOutputFormats.configurationChanged(recognizerRunnerView, configuration);
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void onScanStarted() {
        this.getOutputStallDuration.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.6
            @Override // java.lang.Runnable
            public void run() {
                com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getHighSpeedVideoSizesFor.setEnabled(true);
                com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getHighSpeedVideoFpsRanges.startSpinnerAnimation();
            }
        });
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void onTorchStateChanged(final boolean z) {
        if (this.getOutputSizes) {
            this.getOutputStallDuration.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.5
                @Override // java.lang.Runnable
                public void run() {
                    if (z) {
                        com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getHighSpeedVideoFpsRangesFor.setImageDrawable(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getInputFormats.Camera2StreamConfigurationMap);
                    } else {
                        com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getHighSpeedVideoFpsRangesFor.setImageDrawable(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getInputFormats.getOutputFormats);
                    }
                }
            });
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void onTorchSupportStatusAvailable(final boolean z) {
        if (this.getOutputSizes) {
            this.getOutputStallDuration.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.4
                @Override // java.lang.Runnable
                public void run() {
                    if (z) {
                        com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getHighSpeedVideoFpsRangesFor.setVisibility(0);
                    } else {
                        com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getHighSpeedVideoFpsRangesFor.setVisibility(8);
                    }
                }
            });
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void showAction(com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureAction documentCaptureAction) {
        int i = com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.AnonymousClass8.getHighResolutionOutputSizeshNQ4ISI[documentCaptureAction.ordinal()];
        if (i == 1) {
            this.getInputSizeshNQ4ISI.updateStatus(this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap);
        } else if (i == 2) {
            this.getInputSizeshNQ4ISI.updateStatus(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges);
        } else {
            if (i != 3) {
                return;
            }
            this.getInputSizeshNQ4ISI.updateStatus(this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void showDetection(com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection displayableQuadDetection) {
        this.getOutputFormats.animateQuadToDetectionPosition(displayableQuadDetection);
    }

    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.OverlayView
    public void showScanSuccess(final com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureContract.UiUpdateListener uiUpdateListener) {
        this.getOutputStallDuration.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.7
            @Override // java.lang.Runnable
            public void run() {
                com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getHighSpeedVideoSizesFor.setEnabled(false);
                com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getOutputMinFrameDuration.setVisibility(0);
                com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getOutputMinFrameDuration.startAnimation();
                com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.this.getHighSpeedVideoFpsRanges.cancelSpinnerAnimation(new com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager.EndAnimationListener() { // from class: com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView.7.1
                    @Override // com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.capture.CaptureButtonManager.EndAnimationListener
                    public void onAnimationEnd() {
                        uiUpdateListener.onUiUpdateFinished();
                    }
                });
            }
        });
    }

    public DetectionOverlayView(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings detectionOverlayStrings, int i) {
        this(detectionOverlayStrings, i, true);
    }
}

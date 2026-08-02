package com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public class LegacyDocumentVerificationOverlayView implements com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView {
    private android.widget.TextView Camera2StreamConfigurationMap;
    private android.widget.TextView getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.view.viewfinder.managers.DocumentViewfinderManager getHighSpeedVideoSizes;
    private final int getInputFormats;
    private final boolean getInputSizeshNQ4ISI;
    private android.widget.ImageView getOutputFormats;
    private final android.view.View.OnClickListener getOutputMinFrameDuration;
    private com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayResources getOutputSizeshNQ4ISI;
    private final android.os.Handler getHighSpeedVideoSizesFor = new android.os.Handler(android.os.Looper.getMainLooper());
    private final android.os.CountDownTimer getHighResolutionOutputSizeshNQ4ISI = new android.os.CountDownTimer() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.5
        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.Camera2StreamConfigurationMap != null) {
                com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.getHighSpeedVideoSizesFor.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.Camera2StreamConfigurationMap.setVisibility(4);
                    }
                });
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    };

    /* renamed from: com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView$2, reason: invalid class name */
    class AnonymousClass2 implements java.lang.Runnable {
        final /* synthetic */ android.graphics.drawable.Drawable Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.graphics.drawable.Drawable getHighSpeedVideoSizes;

        AnonymousClass2(java.lang.String str, android.graphics.drawable.Drawable drawable, java.lang.String str2, android.graphics.drawable.Drawable drawable2) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizes = drawable;
            this.getHighSpeedVideoFpsRanges = str2;
            this.Camera2StreamConfigurationMap = drawable2;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.getHighSpeedVideoFpsRanges.setVisibility(4);
            if (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.getHighSpeedVideoSizes != null) {
                com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.getHighSpeedVideoSizes.showSplashScreen(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, com.microblink.blinkid.library.R.color.mb_viewfinder_inner_splash);
            }
            com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.getHighSpeedVideoFpsRanges.setText(this.getHighSpeedVideoFpsRanges);
            com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.getHighSpeedVideoFpsRanges.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, this.Camera2StreamConfigurationMap, (android.graphics.drawable.Drawable) null);
        }
    }

    /* renamed from: com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView$3, reason: invalid class name */
    class AnonymousClass3 implements java.lang.Runnable {
        AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.getHighSpeedVideoSizes.clearSplashScreen(0L, 500L, new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.3.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.getHighSpeedVideoFpsRanges != null) {
                        com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.getHighSpeedVideoFpsRanges.setVisibility(0);
                    }
                }
            });
        }
    }

    public LegacyDocumentVerificationOverlayView(boolean z, com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings legacyDocumentVerificationOverlayStrings, int i, android.view.View.OnClickListener onClickListener) {
        this.getInputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRangesFor = legacyDocumentVerificationOverlayStrings;
        this.getInputFormats = i;
        this.getOutputMinFrameDuration = onClickListener;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void cleanup() {
        this.getHighSpeedVideoSizesFor.removeCallbacksAndMessages(null);
        this.getHighResolutionOutputSizeshNQ4ISI.cancel();
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public android.view.ViewGroup createLayout(final android.app.Activity activity, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings.createDefault(activity);
        }
        this.getOutputSizeshNQ4ISI = new com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayResources(activity, this.getInputFormats);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.getLayoutInflater().inflate(com.microblink.blinkid.resources.Layouts.IIlIIIllIl, (android.view.ViewGroup) recognizerRunnerView, false);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.documentScanInstructions);
        this.getHighSpeedVideoFpsRanges = textView;
        android.view.View.OnClickListener onClickListener = this.getOutputMinFrameDuration;
        if (onClickListener != null) {
            textView.setOnClickListener(onClickListener);
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.tvGlareMessage);
        this.Camera2StreamConfigurationMap = textView2;
        textView2.setText(this.getHighSpeedVideoFpsRangesFor.getInputFormats);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.defaultBackButton);
        if (this.getInputSizeshNQ4ISI) {
            imageView.setImageDrawable(this.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    activity.onBackPressed();
                }
            });
        } else {
            imageView.setVisibility(8);
        }
        android.view.View findViewById = viewGroup.findViewById(com.microblink.blinkid.library.R.id.torchContainer);
        if (this.getInputSizeshNQ4ISI) {
            android.view.View findViewById2 = viewGroup.findViewById(com.microblink.blinkid.library.R.id.viewfinderMarginTop);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
            this.getOutputFormats = (android.widget.ImageView) findViewById.findViewById(com.microblink.blinkid.library.R.id.defaultTorchButton);
        } else {
            findViewById.setVisibility(8);
            this.getOutputFormats = null;
        }
        this.getHighSpeedVideoSizes = new com.microblink.blinkid.view.viewfinder.managers.DocumentViewfinderManager((com.microblink.blinkid.view.viewfinder.ViewfinderShapeView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.viewfinderRectangle), (android.widget.TextView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.tvCardMessage), (android.widget.ImageView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.ivCardIcon));
        recognizerRunnerView.addChildView(viewGroup, false);
        return viewGroup;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.components.TorchController createTorchController(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        com.microblink.blinkid.fragment.overlay.components.TorchController torchController = new com.microblink.blinkid.fragment.overlay.components.TorchController();
        android.widget.ImageView imageView = this.getOutputFormats;
        com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayResources legacyDocumentVerificationOverlayResources = this.getOutputSizeshNQ4ISI;
        torchController.setup(imageView, recognizerRunnerView, legacyDocumentVerificationOverlayResources.getInputSizeshNQ4ISI, legacyDocumentVerificationOverlayResources.getHighResolutionOutputSizeshNQ4ISI);
        return torchController;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getDataMismatchStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings legacyDocumentVerificationOverlayStrings = this.getHighSpeedVideoFpsRangesFor;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(legacyDocumentVerificationOverlayStrings.getOutputMinFrameDurationlomOqCM, legacyDocumentVerificationOverlayStrings.getHighSpeedVideoSizes, legacyDocumentVerificationOverlayStrings.getOutputMinFrameDuration);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getDocumentNotSupportedDialogStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings legacyDocumentVerificationOverlayStrings = this.getHighSpeedVideoFpsRangesFor;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(legacyDocumentVerificationOverlayStrings.getOutputFormats, legacyDocumentVerificationOverlayStrings.getOutputStallDuration, legacyDocumentVerificationOverlayStrings.getOutputMinFrameDuration);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView getOnboardingView() {
        return null;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getRecognitionTimeoutDialogStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings legacyDocumentVerificationOverlayStrings = this.getHighSpeedVideoFpsRangesFor;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(legacyDocumentVerificationOverlayStrings.getHighSpeedVideoFpsRanges, legacyDocumentVerificationOverlayStrings.getOutputSizes, legacyDocumentVerificationOverlayStrings.getOutputMinFrameDuration);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getSidesNotMatchingDialogStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings legacyDocumentVerificationOverlayStrings = this.getHighSpeedVideoFpsRangesFor;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(legacyDocumentVerificationOverlayStrings.Camera2StreamConfigurationMap, legacyDocumentVerificationOverlayStrings.getHighSpeedVideoSizesFor, legacyDocumentVerificationOverlayStrings.getOutputMinFrameDuration);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onCardDetectionUpdate(com.microblink.blinkid.view.recognition.DetectionStatus detectionStatus) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onConfigurationChanged(int i) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onDocumentClassified() {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onErrorDialogShown() {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onFirstSideScanStarted() {
        com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings legacyDocumentVerificationOverlayStrings = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str = legacyDocumentVerificationOverlayStrings.getHighResolutionOutputSizeshNQ4ISI;
        com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayResources legacyDocumentVerificationOverlayResources = this.getOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor.post(new com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.AnonymousClass2(str, legacyDocumentVerificationOverlayResources.Camera2StreamConfigurationMap, legacyDocumentVerificationOverlayStrings.getOutputSizeshNQ4ISI, legacyDocumentVerificationOverlayResources.getHighSpeedVideoFpsRanges));
        this.getHighSpeedVideoSizesFor.postDelayed(new com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.AnonymousClass3(), 1500L);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onFirstSideScanSuccess(boolean z, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onGlare(boolean z) {
        if (this.Camera2StreamConfigurationMap == null || !z) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        this.getHighSpeedVideoSizesFor.post(new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.4
            @Override // java.lang.Runnable
            public void run() {
                com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.this.Camera2StreamConfigurationMap.setVisibility(0);
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI.start();
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onMovingCloserToBarcodeRequired() {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onProcessingError(com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView.ProcessingError processingError) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public long onScanSuccess() {
        return 0L;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onSecondSideScanStarted() {
        com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings legacyDocumentVerificationOverlayStrings = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str = legacyDocumentVerificationOverlayStrings.getInputSizeshNQ4ISI;
        com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayResources legacyDocumentVerificationOverlayResources = this.getOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor.post(new com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.AnonymousClass2(str, legacyDocumentVerificationOverlayResources.getHighSpeedVideoSizesFor, legacyDocumentVerificationOverlayStrings.getHighSpeedVideoFpsRangesFor, legacyDocumentVerificationOverlayResources.getHighSpeedVideoSizes));
        this.getHighSpeedVideoSizesFor.postDelayed(new com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView.AnonymousClass3(), 1000L);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onTorchStateChanged(boolean z) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void setMandatoryFieldsMissingTooltipText(int[] iArr, android.app.Activity activity) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void setRecognizerSupportsClassification(boolean z) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void setScanRecognitionModeOverlay(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode scanRecognitionMode) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void setShowBackSideBarcodeInstructions(boolean z) {
    }
}

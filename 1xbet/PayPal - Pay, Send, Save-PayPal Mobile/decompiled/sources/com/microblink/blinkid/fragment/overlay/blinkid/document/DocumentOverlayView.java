package com.microblink.blinkid.fragment.overlay.blinkid.document;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public class DocumentOverlayView implements com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView {
    private android.widget.ImageView Camera2StreamConfigurationMap;
    private com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayResources getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    public DocumentOverlayView(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings documentOverlayStrings, int i) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = documentOverlayStrings;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void cleanup() {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public android.view.ViewGroup createLayout(final android.app.Activity activity, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayResources(activity, this.getHighSpeedVideoSizes);
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings.createDefault(activity);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.getLayoutInflater().inflate(com.microblink.blinkid.resources.Layouts.IllIIIllII, (android.view.ViewGroup) recognizerRunnerView, false);
        this.Camera2StreamConfigurationMap = (android.widget.ImageView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.defaultTorchButton);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.microblink.blinkid.library.R.id.defaultBackButton);
        imageView.setImageDrawable(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor);
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                activity.onBackPressed();
            }
        });
        recognizerRunnerView.addChildView(viewGroup, true);
        com.microblink.blinkid.view.viewfinder.quadview.QuadViewManagerFactory.createQuadViewFromPreset(recognizerRunnerView, com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset.DEFAULT_FROM_DOCUMENT_SCAN_ACTIVITY);
        return viewGroup;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.components.TorchController createTorchController(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        com.microblink.blinkid.fragment.overlay.components.TorchController torchController = new com.microblink.blinkid.fragment.overlay.components.TorchController();
        android.widget.ImageView imageView = this.Camera2StreamConfigurationMap;
        com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayResources documentOverlayResources = this.getHighSpeedVideoFpsRanges;
        torchController.setup(imageView, recognizerRunnerView, documentOverlayResources.getHighSpeedVideoSizes, documentOverlayResources.getHighSpeedVideoFpsRanges);
        return torchController;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getDataMismatchStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings documentOverlayStrings = this.getHighResolutionOutputSizeshNQ4ISI;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(documentOverlayStrings.Camera2StreamConfigurationMap, documentOverlayStrings.getOutputMinFrameDuration, documentOverlayStrings.getHighSpeedVideoFpsRanges);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getDocumentNotSupportedDialogStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings documentOverlayStrings = this.getHighResolutionOutputSizeshNQ4ISI;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(documentOverlayStrings.getHighResolutionOutputSizeshNQ4ISI, documentOverlayStrings.getInputSizeshNQ4ISI, documentOverlayStrings.getHighSpeedVideoFpsRanges);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView getOnboardingView() {
        return null;
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getRecognitionTimeoutDialogStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings documentOverlayStrings = this.getHighResolutionOutputSizeshNQ4ISI;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(documentOverlayStrings.getOutputFormats, documentOverlayStrings.getHighSpeedVideoSizes, documentOverlayStrings.getHighSpeedVideoFpsRanges);
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings getSidesNotMatchingDialogStrings() {
        com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings documentOverlayStrings = this.getHighResolutionOutputSizeshNQ4ISI;
        return new com.microblink.blinkid.fragment.overlay.reticle.RetryDialogStrings(documentOverlayStrings.getHighSpeedVideoSizesFor, documentOverlayStrings.getHighSpeedVideoFpsRangesFor, documentOverlayStrings.getHighSpeedVideoFpsRanges);
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
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onFirstSideScanSuccess(boolean z, com.microblink.blinkid.entities.recognizers.blinkid.generic.imageanalysis.CardRotation cardRotation) {
    }

    @Override // com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView
    public void onGlare(boolean z) {
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

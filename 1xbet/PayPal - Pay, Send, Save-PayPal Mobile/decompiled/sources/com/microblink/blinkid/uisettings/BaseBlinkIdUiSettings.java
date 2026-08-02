package com.microblink.blinkid.uisettings;

/* loaded from: classes10.dex */
public abstract class BaseBlinkIdUiSettings extends com.microblink.blinkid.uisettings.UISettings<com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController> implements com.microblink.blinkid.uisettings.options.BeepSoundUIOptions, com.microblink.blinkid.uisettings.options.DebugImageListenerUIOptions, com.microblink.blinkid.uisettings.options.CurrentImageListenerUIOptions, com.microblink.blinkid.uisettings.options.HighResSuccessFrameCaptureUIOptions, com.microblink.blinkid.uisettings.options.SplashScreenUIOptions, com.microblink.blinkid.uisettings.options.OcrResultDisplayUIOptions, com.microblink.blinkid.uisettings.options.DocumentDataMatchUIOptions, com.microblink.blinkid.uisettings.options.MrzDetectionUIOptions, com.microblink.blinkid.uisettings.options.DocumentNotSupportedDialogUIOptions, com.microblink.blinkid.uisettings.options.BackSideScanningTimeoutUIOptions, com.microblink.blinkid.uisettings.options.ScanUIEventListenerUIOptions {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static final long getHighSpeedVideoSizesFor = com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.DEFAULT_TIMEOUT_MS;
    private static final java.lang.String getInputFormats;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static final java.lang.String getOutputSizes;
    private static final java.lang.String getOutputSizeshNQ4ISI;
    private static final java.lang.String getOutputStallDurationlomOqCM;
    private final com.microblink.blinkid.entities.recognizers.RecognizerBundle getOutputStallDuration;

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mb.");
        sb.append("BaseBlinkIdUISettings");
        sb.append(".");
        sb.append("beepResource");
        getHighSpeedVideoFpsRangesFor = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mb.");
        sb2.append("BaseBlinkIdUISettings");
        sb2.append(".");
        sb2.append("debugImageListener");
        getOutputFormats = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("mb.");
        sb3.append("BaseBlinkIdUISettings");
        sb3.append(".");
        sb3.append("currentImageListener");
        getOutputSizeshNQ4ISI = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("mb.");
        sb4.append("BaseBlinkIdUISettings");
        sb4.append(".");
        sb4.append("scanUIEventListener");
        getHighResolutionOutputSizeshNQ4ISI = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("mb.");
        sb5.append("BaseBlinkIdUISettings");
        sb5.append(".");
        sb5.append("highResCapture");
        getOutputStallDurationlomOqCM = sb5.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mb.");
        sb6.append("BaseBlinkIdUISettings");
        sb6.append(".");
        sb6.append("splashResource");
        getHighSpeedVideoSizes = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mb.");
        sb7.append("BaseBlinkIdUISettings");
        sb7.append(".");
        sb7.append("requireDocumentDataMatch");
        getInputSizeshNQ4ISI = sb7.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("mb.");
        sb8.append("BaseBlinkIdUISettings");
        sb8.append(".");
        sb8.append("showOcrResultMode");
        getHighSpeedVideoFpsRanges = sb8.toString();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("mb.");
        sb9.append("BaseBlinkIdUISettings");
        sb9.append(".");
        sb9.append("showMrzDetection");
        getOutputMinFrameDuration = sb9.toString();
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("mb.");
        sb10.append("BaseBlinkIdUISettings");
        sb10.append(".");
        sb10.append("showNotSupportedDialog");
        Camera2StreamConfigurationMap = sb10.toString();
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("mb.");
        sb11.append("BaseBlinkIdUISettings");
        sb11.append(".");
        sb11.append("backSideScanningTimeoutMs");
        getInputFormats = sb11.toString();
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder("mb.");
        sb12.append("BaseBlinkIdUISettings");
        sb12.append(".");
        sb12.append("showTooltipTimeIntervalMs");
        getOutputSizes = sb12.toString();
    }

    protected BaseBlinkIdUiSettings(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        this.getOutputStallDuration = recognizerBundle;
    }

    protected abstract com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView createOverlayView();

    @Override // com.microblink.blinkid.uisettings.options.HighResSuccessFrameCaptureUIOptions
    public void enableHighResSuccessFrameCapture(boolean z) {
        getHighSpeedVideoFpsRanges(getOutputStallDurationlomOqCM, z);
    }

    public long getShowTooltipTimeIntervalMs() {
        return getHighSpeedVideoFpsRanges(com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions.DEFAULT_SHOW_TOOLTIP_TIME_INTERVAL_MS, getOutputSizes);
    }

    protected abstract boolean isLockedToPortrait();

    @Override // com.microblink.blinkid.uisettings.UISettings
    public void saveToIntent(android.content.Intent intent) {
        super.saveToIntent(intent);
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.getOutputStallDuration;
        if (recognizerBundle != null) {
            recognizerBundle.saveToIntent(intent);
        }
    }

    @Override // com.microblink.blinkid.uisettings.options.BackSideScanningTimeoutUIOptions
    public void setBackSideScanningTimeoutMs(long j) {
        getHighResolutionOutputSizeshNQ4ISI(j, getInputFormats);
    }

    @Override // com.microblink.blinkid.uisettings.options.BeepSoundUIOptions
    public void setBeepSoundResourceID(int i) {
        getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor, i);
    }

    @Override // com.microblink.blinkid.uisettings.options.CurrentImageListenerUIOptions
    public void setCurrentImageListener(com.microblink.blinkid.image.CurrentImageListener currentImageListener) {
        getHighResolutionOutputSizeshNQ4ISI(getOutputSizeshNQ4ISI, currentImageListener);
    }

    @Override // com.microblink.blinkid.uisettings.options.DebugImageListenerUIOptions
    public void setDebugImageListener(com.microblink.blinkid.image.DebugImageListener debugImageListener) {
        getHighResolutionOutputSizeshNQ4ISI(getOutputFormats, debugImageListener);
    }

    @Override // com.microblink.blinkid.uisettings.options.DocumentDataMatchUIOptions
    public void setDocumentDataMatchRequired(boolean z) {
        getHighSpeedVideoFpsRanges(getInputSizeshNQ4ISI, z);
    }

    @Override // com.microblink.blinkid.uisettings.options.OcrResultDisplayUIOptions
    public void setOcrResultDisplayMode(com.microblink.blinkid.uisettings.options.OcrResultDisplayMode ocrResultDisplayMode) {
        getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges, ocrResultDisplayMode);
    }

    @Override // com.microblink.blinkid.uisettings.options.ScanUIEventListenerUIOptions
    public void setScanUIEventListener(com.microblink.blinkid.uisettings.options.ScanUIEventListener scanUIEventListener) {
        getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI, scanUIEventListener);
    }

    @Override // com.microblink.blinkid.uisettings.options.MrzDetectionUIOptions
    public void setShowMrzDetection(boolean z) {
        getHighSpeedVideoFpsRanges(getOutputMinFrameDuration, z);
    }

    @Override // com.microblink.blinkid.uisettings.options.DocumentNotSupportedDialogUIOptions
    public void setShowNotSupportedDialog(boolean z) {
        getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, z);
    }

    public void setShowTooltipTimeIntervalMs(long j) {
        getHighResolutionOutputSizeshNQ4ISI(j, getOutputSizes);
    }

    @Override // com.microblink.blinkid.uisettings.options.SplashScreenUIOptions
    public void setSplashScreenLayoutResourceID(int i) {
        getHighSpeedVideoSizes(getHighSpeedVideoSizes, i);
    }

    protected BaseBlinkIdUiSettings(android.content.Intent intent) {
        super(intent);
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(new com.microblink.blinkid.entities.recognizers.Recognizer[0]);
        this.getOutputStallDuration = recognizerBundle;
        recognizerBundle.loadFromIntent(intent);
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController createOverlayController(android.app.Activity activity, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        return new com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayController(new com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder(this.getOutputStallDuration).setSplashResourceId(getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes, com.microblink.blinkid.resources.Layouts.lllIlIlIIl)).setBeepResourceId(getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor, 0)).setCameraSettings(getHighResolutionOutputSizeshNQ4ISI()).isHighResSuccessFrameCaptureEnabled(getHighResolutionOutputSizeshNQ4ISI(getOutputStallDurationlomOqCM, false)).setDebugImageListener((com.microblink.blinkid.image.DebugImageListener) getHighSpeedVideoFpsRanges(getOutputFormats)).setCurrentImageListener((com.microblink.blinkid.image.CurrentImageListener) getHighSpeedVideoFpsRanges(getOutputSizeshNQ4ISI)).setDocumentDataMatchRequired(getHighResolutionOutputSizeshNQ4ISI(getInputSizeshNQ4ISI, true)).setOcrResultDisplayMode((com.microblink.blinkid.uisettings.options.OcrResultDisplayMode) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges, com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.ANIMATED_DOTS)).setShowMrzDots(getHighResolutionOutputSizeshNQ4ISI(getOutputMinFrameDuration, true)).setLockedToPortrait(isLockedToPortrait()).setShowTooltipTimeIntervalMs(getShowTooltipTimeIntervalMs()).setShowNotSupportedDialog(getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap, true)).setBackSideScanningTimeoutMs(getHighSpeedVideoFpsRanges(getHighSpeedVideoSizesFor, getInputFormats)).setScanUIEventListener((com.microblink.blinkid.uisettings.options.ScanUIEventListener) getHighSpeedVideoFpsRanges(getHighResolutionOutputSizeshNQ4ISI)).build(), scanResultListener, createOverlayView());
    }
}

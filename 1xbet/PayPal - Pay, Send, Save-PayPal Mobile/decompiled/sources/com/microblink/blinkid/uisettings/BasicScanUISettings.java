package com.microblink.blinkid.uisettings;

/* loaded from: classes10.dex */
public abstract class BasicScanUISettings extends com.microblink.blinkid.uisettings.UISettings<com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController> implements com.microblink.blinkid.uisettings.options.DebugImageListenerUIOptions, com.microblink.blinkid.uisettings.options.SplashScreenUIOptions, com.microblink.blinkid.uisettings.options.BeepSoundUIOptions, com.microblink.blinkid.uisettings.options.HighResSuccessFrameCaptureUIOptions, com.microblink.blinkid.uisettings.options.HelpIntentUIOptions {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static final java.lang.String getInputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private final com.microblink.blinkid.entities.recognizers.RecognizerBundle getInputSizeshNQ4ISI;

    protected BasicScanUISettings(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        this.getInputSizeshNQ4ISI = recognizerBundle;
    }

    protected abstract com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder createOverlaySettingsBuilder();

    @Override // com.microblink.blinkid.uisettings.options.HighResSuccessFrameCaptureUIOptions
    public void enableHighResSuccessFrameCapture(boolean z) {
        getHighSpeedVideoFpsRanges(getInputFormats, z);
    }

    public com.microblink.blinkid.entities.recognizers.RecognizerBundle getRecognizerBundle() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public final void saveToIntent(android.content.Intent intent) {
        super.saveToIntent(intent);
        this.getInputSizeshNQ4ISI.saveToIntent(intent);
    }

    @Override // com.microblink.blinkid.uisettings.options.BeepSoundUIOptions
    public final void setBeepSoundResourceID(int i) {
        getHighSpeedVideoSizes(getHighSpeedVideoSizes, i);
    }

    @Override // com.microblink.blinkid.uisettings.options.DebugImageListenerUIOptions
    public final void setDebugImageListener(com.microblink.blinkid.image.DebugImageListener debugImageListener) {
        getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges, debugImageListener);
    }

    public void setForcedOrientation(com.microblink.blinkid.uisettings.options.OverlayOrientation overlayOrientation) {
        getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI, overlayOrientation);
    }

    @Override // com.microblink.blinkid.uisettings.options.HelpIntentUIOptions
    public final void setHelpIntent(android.content.Intent intent) {
        getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap, intent);
    }

    public final void setRegionOfInterestRotatable(boolean z) {
        getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor, z);
    }

    public final void setScanRegionOfInterest(com.microblink.blinkid.geometry.Rectangle rectangle) {
        getHighResolutionOutputSizeshNQ4ISI(getOutputMinFrameDuration, rectangle);
    }

    @Override // com.microblink.blinkid.uisettings.options.SplashScreenUIOptions
    public final void setSplashScreenLayoutResourceID(int i) {
        getHighSpeedVideoSizes(getHighSpeedVideoSizesFor, i);
    }

    protected BasicScanUISettings(android.content.Intent intent) {
        super(intent);
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(new com.microblink.blinkid.entities.recognizers.Recognizer[0]);
        this.getInputSizeshNQ4ISI = recognizerBundle;
        recognizerBundle.loadFromIntent(intent);
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController createOverlayController(final android.app.Activity activity, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder scanRegionOfInterestSettings = createOverlaySettingsBuilder().setCameraSettings(getHighResolutionOutputSizeshNQ4ISI()).setScanRegionOfInterestSettings(new com.microblink.blinkid.fragment.overlay.components.settings.ScanRegionOfInterestSettings((com.microblink.blinkid.geometry.Rectangle) getHighSpeedVideoFpsRanges(getOutputMinFrameDuration), getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor, false)));
        final android.content.Intent intent = (android.content.Intent) getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
        return new com.microblink.blinkid.fragment.overlay.basic.BasicOverlayController(scanRegionOfInterestSettings.setHelpAction(intent != null ? new java.lang.Runnable() { // from class: com.microblink.blinkid.uisettings.BasicScanUISettings.1
            @Override // java.lang.Runnable
            public void run() {
                activity.startActivity(intent);
            }
        } : null).setSplashResourceId(getHighSpeedVideoFpsRanges(getHighSpeedVideoSizesFor, com.microblink.blinkid.resources.Layouts.lllIlIlIIl)).setHighResFrameCaptureEnabled(getHighResolutionOutputSizeshNQ4ISI(getInputFormats, false)).setBeepSoundId(getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes, 0)).setDebugImageListener((com.microblink.blinkid.image.DebugImageListener) getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges)).setForcedOrientation((com.microblink.blinkid.uisettings.options.OverlayOrientation) getHighSpeedVideoSizes(getHighResolutionOutputSizeshNQ4ISI)).build(), scanResultListener);
    }

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mb.");
        sb.append("BasicScanActivity");
        sb.append(".");
        sb.append("roi");
        getOutputMinFrameDuration = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mb.");
        sb2.append("BasicScanActivity");
        sb2.append(".");
        sb2.append("roiRotatable");
        getHighSpeedVideoFpsRangesFor = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("mb.");
        sb3.append("BasicScanActivity");
        sb3.append(".");
        sb3.append("beepResource");
        getHighSpeedVideoSizes = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("mb.");
        sb4.append("BasicScanActivity");
        sb4.append(".");
        sb4.append("splashResource");
        getHighSpeedVideoSizesFor = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("mb.");
        sb5.append("BasicScanActivity");
        sb5.append(".");
        sb5.append("imageListener");
        getHighSpeedVideoFpsRanges = sb5.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mb.");
        sb6.append("BasicScanActivity");
        sb6.append(".");
        sb6.append("highResCapture");
        getInputFormats = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mb.");
        sb7.append("BasicScanActivity");
        sb7.append(".");
        sb7.append("overlayOrientation");
        getHighResolutionOutputSizeshNQ4ISI = sb7.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("mb.");
        sb8.append("BasicScanActivity");
        sb8.append(".");
        sb8.append("helpIntent");
        Camera2StreamConfigurationMap = sb8.toString();
    }
}

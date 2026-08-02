package com.microblink.blinkid.uisettings;

/* loaded from: classes10.dex */
public class FieldByFieldUISettings extends com.microblink.blinkid.uisettings.UISettings<com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController> implements com.microblink.blinkid.uisettings.options.HelpIntentUIOptions, com.microblink.blinkid.uisettings.options.OcrResultDisplayUIOptions, com.microblink.blinkid.uisettings.options.DebugImageListenerUIOptions, com.microblink.blinkid.uisettings.options.CurrentImageListenerUIOptions, com.microblink.blinkid.uisettings.options.SuccessfulImageListenerUIOptions, com.microblink.blinkid.uisettings.options.SplashScreenUIOptions {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static final java.lang.String getInputFormats;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle getHighSpeedVideoSizesFor;

    public FieldByFieldUISettings(com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle fieldByFieldBundle) {
        this.getHighSpeedVideoSizesFor = fieldByFieldBundle;
    }

    public com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle getFieldByFieldBundle() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public java.lang.Class<?> getTargetActivity() {
        return com.microblink.blinkid.activity.FieldByFieldScanActivity.class;
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public final void saveToIntent(android.content.Intent intent) {
        super.saveToIntent(intent);
        this.getHighSpeedVideoSizesFor.saveToIntent(intent);
    }

    @Override // com.microblink.blinkid.uisettings.options.CurrentImageListenerUIOptions
    public void setCurrentImageListener(com.microblink.blinkid.image.CurrentImageListener currentImageListener) {
        getHighResolutionOutputSizeshNQ4ISI(getInputFormats, currentImageListener);
    }

    @Override // com.microblink.blinkid.uisettings.options.DebugImageListenerUIOptions
    public void setDebugImageListener(com.microblink.blinkid.image.DebugImageListener debugImageListener) {
        getHighResolutionOutputSizeshNQ4ISI(getInputSizeshNQ4ISI, debugImageListener);
    }

    @Override // com.microblink.blinkid.uisettings.options.HelpIntentUIOptions
    public void setHelpIntent(android.content.Intent intent) {
        getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI, intent);
    }

    public void setInfiniteLoopScan(boolean z) {
        getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes, z);
    }

    @Override // com.microblink.blinkid.uisettings.options.OcrResultDisplayUIOptions
    public void setOcrResultDisplayMode(com.microblink.blinkid.uisettings.options.OcrResultDisplayMode ocrResultDisplayMode) {
        getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor, ocrResultDisplayMode);
    }

    @Override // com.microblink.blinkid.uisettings.options.SplashScreenUIOptions
    public final void setSplashScreenLayoutResourceID(int i) {
        getHighSpeedVideoSizes(Camera2StreamConfigurationMap, i);
    }

    @Override // com.microblink.blinkid.uisettings.options.SuccessfulImageListenerUIOptions
    public void setSuccessfulImageListener(com.microblink.blinkid.image.SuccessfulImageListener successfulImageListener) {
        getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges, successfulImageListener);
    }

    public FieldByFieldUISettings(android.content.Intent intent) {
        super(intent);
        com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle fieldByFieldBundle = new com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle(new com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldElement[0]);
        this.getHighSpeedVideoSizesFor = fieldByFieldBundle;
        fieldByFieldBundle.loadFromIntent(intent);
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController createOverlayController(android.app.Activity activity, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        return new com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlayController(new com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings.Builder(this.getHighSpeedVideoSizesFor).setCameraSettings(getHighResolutionOutputSizeshNQ4ISI()).setCurrentImageListener((com.microblink.blinkid.image.CurrentImageListener) getHighSpeedVideoFpsRanges(getInputFormats)).setSuccessImageListener((com.microblink.blinkid.image.SuccessfulImageListener) getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges)).setHelpIntent((android.content.Intent) getHighSpeedVideoFpsRanges(getHighResolutionOutputSizeshNQ4ISI)).setOcrResultDisplayMode((com.microblink.blinkid.uisettings.options.OcrResultDisplayMode) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRangesFor, com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.ANIMATED_DOTS)).setSplashResourceId(getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, 0)).setInfiniteLoopScan(getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes, false)).setDebugImageListener((com.microblink.blinkid.image.DebugImageListener) getHighSpeedVideoFpsRanges(getInputSizeshNQ4ISI)).build(), scanResultListener);
    }

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mb.");
        sb.append("FieldByFieldScanActivity");
        sb.append(".");
        sb.append("helpIntent");
        getHighResolutionOutputSizeshNQ4ISI = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mb.");
        sb2.append("FieldByFieldScanActivity");
        sb2.append(".");
        sb2.append("infiniteLoopScan");
        getHighSpeedVideoSizes = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("mb.");
        sb3.append("FieldByFieldScanActivity");
        sb3.append(".");
        sb3.append("showOcrResultMode");
        getHighSpeedVideoFpsRangesFor = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("mb.");
        sb4.append("FieldByFieldScanActivity");
        sb4.append(".");
        sb4.append("debugImageListener");
        getInputSizeshNQ4ISI = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("mb.");
        sb5.append("FieldByFieldScanActivity");
        sb5.append(".");
        sb5.append("successfulImageListener");
        getHighSpeedVideoFpsRanges = sb5.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mb.");
        sb6.append("FieldByFieldScanActivity");
        sb6.append(".");
        sb6.append("currentImageListener");
        getInputFormats = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mb.");
        sb7.append("FieldByFieldScanActivity");
        sb7.append(".");
        sb7.append("splashResource");
        Camera2StreamConfigurationMap = sb7.toString();
    }
}

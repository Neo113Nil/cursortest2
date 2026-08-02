package com.microblink.blinkid.uisettings;

/* loaded from: classes10.dex */
public class BlinkCardUISettings extends com.microblink.blinkid.uisettings.UISettings<com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController> implements com.microblink.blinkid.uisettings.options.BeepSoundUIOptions, com.microblink.blinkid.uisettings.options.DebugImageListenerUIOptions, com.microblink.blinkid.uisettings.options.CurrentImageListenerUIOptions, com.microblink.blinkid.uisettings.options.HighResSuccessFrameCaptureUIOptions, com.microblink.blinkid.uisettings.options.SplashScreenUIOptions, com.microblink.blinkid.uisettings.options.OcrResultDisplayUIOptions, com.microblink.blinkid.uisettings.options.StyleUIOptions, com.microblink.blinkid.uisettings.options.StringsUIOptions<com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings> {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static final java.lang.String getInputFormats;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static final java.lang.String getOutputMinFrameDurationlomOqCM;
    private static final java.lang.String getOutputSizes;
    private static final java.lang.String getOutputSizeshNQ4ISI;
    private static final java.lang.String getOutputStallDuration;
    private static final long getOutputStallDurationlomOqCM = com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.DEFAULT_TIMEOUT_MS;
    private static final java.lang.String isOutputSupportedFor;
    private static final java.lang.String toString;
    private static final java.lang.String unwrapAs;
    private final com.microblink.blinkid.entities.recognizers.RecognizerBundle isOutputSupportedForhNQ4ISI;

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mb.");
        sb.append("BlinkCardUISettings");
        sb.append(".");
        sb.append(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE);
        getHighSpeedVideoSizes = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mb.");
        sb2.append("BlinkCardUISettings");
        sb2.append(".");
        sb2.append("strings");
        getInputFormats = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("mb.");
        sb3.append("BlinkCardUISettings");
        sb3.append(".");
        sb3.append("beepResource");
        getOutputStallDuration = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("mb.");
        sb4.append("BlinkCardUISettings");
        sb4.append(".");
        sb4.append("debugImageListener");
        getHighResolutionOutputSizeshNQ4ISI = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("mb.");
        sb5.append("BlinkCardUISettings");
        sb5.append(".");
        sb5.append("currentImageListener");
        isOutputSupportedFor = sb5.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mb.");
        sb6.append("BlinkCardUISettings");
        sb6.append(".");
        sb6.append("highResCapture");
        getOutputFormats = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mb.");
        sb7.append("BlinkCardUISettings");
        sb7.append(".");
        sb7.append("splashResource");
        getOutputMinFrameDuration = sb7.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("mb.");
        sb8.append("BlinkCardUISettings");
        sb8.append(".");
        sb8.append("showOcrResultMode");
        getHighSpeedVideoFpsRanges = sb8.toString();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("mb.");
        sb9.append("BlinkCardUISettings");
        sb9.append(".");
        sb9.append("showEditSCreen");
        getOutputMinFrameDurationlomOqCM = sb9.toString();
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("mb.");
        sb10.append("BlinkCardUISettings");
        sb10.append(".");
        sb10.append("editScreenConfig");
        Camera2StreamConfigurationMap = sb10.toString();
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("mb.");
        sb11.append("BlinkCardUISettings");
        sb11.append(".");
        sb11.append("editScreenStrings");
        getOutputSizes = sb11.toString();
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder("mb.");
        sb12.append("BlinkCardUISettings");
        sb12.append(".");
        sb12.append("editScreenTheme");
        unwrapAs = sb12.toString();
        java.lang.StringBuilder sb13 = new java.lang.StringBuilder("mb.");
        sb13.append("BlinkCardUISettings");
        sb13.append(".");
        sb13.append("glareWarningEnabled");
        getOutputSizeshNQ4ISI = sb13.toString();
        java.lang.StringBuilder sb14 = new java.lang.StringBuilder("mb.");
        sb14.append("BlinkCardUISettings");
        sb14.append(".");
        sb14.append("showKeepCardVisibleDialog");
        getInputSizeshNQ4ISI = sb14.toString();
        java.lang.StringBuilder sb15 = new java.lang.StringBuilder("mb.");
        sb15.append("BlinkCardUISettings");
        sb15.append(".");
        sb15.append("showOnboardingInfo");
        toString = sb15.toString();
        java.lang.StringBuilder sb16 = new java.lang.StringBuilder("mb.");
        sb16.append("BlinkCardUISettings");
        sb16.append(".");
        sb16.append("backSideScanningTimeoutMs");
        getHighSpeedVideoFpsRangesFor = sb16.toString();
        java.lang.StringBuilder sb17 = new java.lang.StringBuilder("mb.");
        sb17.append("BlinkCardUISettings");
        sb17.append(".");
        sb17.append("showTooltipTimeIntervalMs");
        getHighSpeedVideoSizesFor = sb17.toString();
    }

    public BlinkCardUISettings(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        this.isOutputSupportedForhNQ4ISI = recognizerBundle;
    }

    @Override // com.microblink.blinkid.uisettings.options.HighResSuccessFrameCaptureUIOptions
    public void enableHighResSuccessFrameCapture(boolean z) {
        getHighSpeedVideoFpsRanges(getOutputFormats, z);
    }

    public com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration getEditScreenFieldConfiguration() {
        return (com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration) getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap, new com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration());
    }

    public com.microblink.blinkid.activity.edit.BlinkCardEditStrings getEditScreenStrings(android.content.Context context) {
        return (com.microblink.blinkid.activity.edit.BlinkCardEditStrings) getHighSpeedVideoFpsRangesFor(getOutputSizes, com.microblink.blinkid.activity.edit.BlinkCardEditStrings.createDefault(context));
    }

    public int getEditScreenTheme() {
        return getHighSpeedVideoFpsRanges(unwrapAs, 0);
    }

    public com.microblink.blinkid.entities.recognizers.RecognizerBundle getRecognizerBundle() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public long getShowTooltipTimeIntervalMs() {
        return getHighSpeedVideoFpsRanges(com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.DEFAULT_SHOW_TOOLTIP_TIME_INTERVAL_MS, getHighSpeedVideoSizesFor);
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public java.lang.Class<?> getTargetActivity() {
        return com.microblink.blinkid.activity.BlinkCardActivity.class;
    }

    public boolean isEditScreenEnabled() {
        return getHighResolutionOutputSizeshNQ4ISI(getOutputMinFrameDurationlomOqCM, false);
    }

    protected boolean isLockedToPortrait() {
        return false;
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public void saveToIntent(android.content.Intent intent) {
        super.saveToIntent(intent);
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = this.isOutputSupportedForhNQ4ISI;
        if (recognizerBundle != null) {
            recognizerBundle.saveToIntent(intent);
        }
    }

    public void setBackSideScanningTimeoutMs(long j) {
        getHighResolutionOutputSizeshNQ4ISI(j, getHighSpeedVideoFpsRangesFor);
    }

    @Override // com.microblink.blinkid.uisettings.options.BeepSoundUIOptions
    public void setBeepSoundResourceID(int i) {
        getHighSpeedVideoSizes(getOutputStallDuration, i);
    }

    @Override // com.microblink.blinkid.uisettings.options.CurrentImageListenerUIOptions
    public void setCurrentImageListener(com.microblink.blinkid.image.CurrentImageListener currentImageListener) {
        getHighResolutionOutputSizeshNQ4ISI(isOutputSupportedFor, currentImageListener);
    }

    @Override // com.microblink.blinkid.uisettings.options.DebugImageListenerUIOptions
    public void setDebugImageListener(com.microblink.blinkid.image.DebugImageListener debugImageListener) {
        getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI, debugImageListener);
    }

    public void setEditScreenEnabled(boolean z) {
        getHighSpeedVideoFpsRanges(getOutputMinFrameDurationlomOqCM, z);
    }

    public void setEditScreenFieldConfiguration(com.microblink.blinkid.activity.edit.BlinkCardEditFieldConfiguration blinkCardEditFieldConfiguration) {
        if (!blinkCardEditFieldConfiguration.isValid()) {
            throw new java.lang.IllegalArgumentException("At least one field needs to be enabled");
        }
        getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap, blinkCardEditFieldConfiguration);
    }

    public void setEditScreenStrings(com.microblink.blinkid.activity.edit.BlinkCardEditStrings blinkCardEditStrings) {
        getHighResolutionOutputSizeshNQ4ISI(getOutputSizes, blinkCardEditStrings);
    }

    public void setEditScreenTheme(int i) {
        getHighSpeedVideoSizes(unwrapAs, i);
    }

    @Override // com.microblink.blinkid.uisettings.options.OcrResultDisplayUIOptions
    public void setOcrResultDisplayMode(com.microblink.blinkid.uisettings.options.OcrResultDisplayMode ocrResultDisplayMode) {
        getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges, ocrResultDisplayMode);
    }

    @Override // com.microblink.blinkid.uisettings.options.StyleUIOptions
    public void setOverlayViewStyle(int i) {
        getHighSpeedVideoSizes(getHighSpeedVideoSizes, i);
    }

    public void setShowGlareWarning(boolean z) {
        getHighSpeedVideoFpsRanges(getOutputSizeshNQ4ISI, z);
    }

    public void setShowIntroductionDialog(boolean z) {
        getHighSpeedVideoFpsRanges(getInputSizeshNQ4ISI, z);
    }

    public void setShowOnboardingInfo(boolean z) {
        getHighSpeedVideoFpsRanges(toString, z);
    }

    public void setShowTooltipTimeIntervalMs(long j) {
        getHighResolutionOutputSizeshNQ4ISI(j, getHighSpeedVideoSizesFor);
    }

    @Override // com.microblink.blinkid.uisettings.options.SplashScreenUIOptions
    public void setSplashScreenLayoutResourceID(int i) {
        getHighSpeedVideoSizes(getOutputMinFrameDuration, i);
    }

    @Override // com.microblink.blinkid.uisettings.options.StringsUIOptions
    public void setStrings(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings blinkCardReticleOverlayStrings) {
        getHighResolutionOutputSizeshNQ4ISI(getInputFormats, blinkCardReticleOverlayStrings);
    }

    public BlinkCardUISettings(android.content.Intent intent) {
        super(intent);
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle = new com.microblink.blinkid.entities.recognizers.RecognizerBundle(new com.microblink.blinkid.entities.recognizers.Recognizer[0]);
        this.isOutputSupportedForhNQ4ISI = recognizerBundle;
        recognizerBundle.loadFromIntent(intent);
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController createOverlayController(android.app.Activity activity, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        return new com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlayController(new com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder(this.isOutputSupportedForhNQ4ISI).setSplashResourceId(getHighSpeedVideoFpsRanges(getOutputMinFrameDuration, com.microblink.blinkid.resources.Layouts.lllIlIlIIl)).setBeepResourceId(getHighSpeedVideoFpsRanges(getOutputStallDuration, 0)).setCameraSettings(getHighResolutionOutputSizeshNQ4ISI()).isHighResSuccessFrameCaptureEnabled(getHighResolutionOutputSizeshNQ4ISI(getOutputFormats, false)).setDebugImageListener((com.microblink.blinkid.image.DebugImageListener) getHighSpeedVideoFpsRanges(getHighResolutionOutputSizeshNQ4ISI)).setCurrentImageListener((com.microblink.blinkid.image.CurrentImageListener) getHighSpeedVideoFpsRanges(isOutputSupportedFor)).setOcrResultDisplayMode((com.microblink.blinkid.uisettings.options.OcrResultDisplayMode) getHighSpeedVideoFpsRangesFor(getHighSpeedVideoFpsRanges, com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.ANIMATED_DOTS)).setShouldShowManualEntryButton(isEditScreenEnabled()).setIsEditScreenEnabled(isEditScreenEnabled()).setLockedToPortrait(isLockedToPortrait()).setBackSideScanningTimeoutMs(getHighSpeedVideoFpsRanges(getOutputStallDurationlomOqCM, getHighSpeedVideoFpsRangesFor)).setShowTooltipTimeIntervalMs(getShowTooltipTimeIntervalMs()).build(), scanResultListener, new com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayView(true, getHighResolutionOutputSizeshNQ4ISI(getOutputSizeshNQ4ISI, true), getHighResolutionOutputSizeshNQ4ISI(getInputSizeshNQ4ISI, true), getHighResolutionOutputSizeshNQ4ISI(toString, true), (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings) getHighSpeedVideoFpsRanges(getInputFormats), getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes, 0)));
    }
}

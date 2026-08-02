package com.microblink.blinkid.uisettings;

/* loaded from: classes10.dex */
public class BlinkIdUISettings extends com.microblink.blinkid.uisettings.BaseBlinkIdUiSettings implements com.microblink.blinkid.uisettings.options.StringsUIOptions<com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings>, com.microblink.blinkid.uisettings.options.StyleUIOptions, com.microblink.blinkid.uisettings.options.FlashlightWarningUIOptions {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static final java.lang.String getInputFormats;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputMinFrameDuration;

    public BlinkIdUISettings(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        super(recognizerBundle);
    }

    protected boolean getShowFlashlightWarning() {
        return getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizesFor, true);
    }

    protected com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings getStrings() {
        return (com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings) getHighSpeedVideoFpsRanges(getOutputMinFrameDuration);
    }

    protected int getStyle() {
        return getHighSpeedVideoFpsRanges(getInputSizeshNQ4ISI, 0);
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public java.lang.Class<?> getTargetActivity() {
        return com.microblink.blinkid.activity.BlinkIdActivity.class;
    }

    @Override // com.microblink.blinkid.uisettings.BaseBlinkIdUiSettings
    protected boolean isLockedToPortrait() {
        return false;
    }

    public void setAllowHapticFeedback(boolean z) {
        getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor, z);
    }

    @Override // com.microblink.blinkid.uisettings.options.StyleUIOptions
    public void setOverlayViewStyle(int i) {
        getHighSpeedVideoSizes(getInputSizeshNQ4ISI, i);
    }

    public void setShowCancelButton(boolean z) {
        getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges, z);
    }

    @Override // com.microblink.blinkid.uisettings.options.FlashlightWarningUIOptions
    public void setShowFlashlightWarning(boolean z) {
        getHighSpeedVideoFpsRanges(getHighSpeedVideoSizesFor, z);
    }

    public void setShowIntroductionDialog(boolean z) {
        getHighSpeedVideoFpsRanges(getInputFormats, z);
    }

    public void setShowMandatoryFieldsMissing(boolean z) {
        getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes, z);
    }

    public void setShowOnboardingInfo(boolean z) {
        getHighSpeedVideoFpsRanges(getHighResolutionOutputSizeshNQ4ISI, z);
    }

    public void setShowTorchButton(boolean z) {
        getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap, z);
    }

    public BlinkIdUISettings(android.content.Intent intent) {
        super(intent);
    }

    @Override // com.microblink.blinkid.uisettings.options.StringsUIOptions
    public void setStrings(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings reticleOverlayStrings) {
        getHighResolutionOutputSizeshNQ4ISI(getOutputMinFrameDuration, reticleOverlayStrings);
    }

    @Override // com.microblink.blinkid.uisettings.BaseBlinkIdUiSettings
    protected com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView createOverlayView() {
        return new com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView(true, getShowFlashlightWarning(), getHighResolutionOutputSizeshNQ4ISI(getInputFormats, false), getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI, true), getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes, false), getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor, true), getStrings(), getStyle(), getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap, true), getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRanges, true));
    }

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mb.");
        sb.append("BlinkIdUISettings");
        sb.append(".");
        sb.append(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE);
        getInputSizeshNQ4ISI = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mb.");
        sb2.append("BlinkIdUISettings");
        sb2.append(".");
        sb2.append("strings");
        getOutputMinFrameDuration = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("mb.");
        sb3.append("BlinkIdUISettings");
        sb3.append(".");
        sb3.append("showFlashlightWarning");
        getHighSpeedVideoSizesFor = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("mb.");
        sb4.append("BlinkIdUISettings");
        sb4.append(".");
        sb4.append("showOnboardingInfo");
        getHighResolutionOutputSizeshNQ4ISI = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("mb.");
        sb5.append("BlinkIdUISettings");
        sb5.append(".");
        sb5.append("showKeepCardVisibleDialog");
        getInputFormats = sb5.toString();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mb.");
        sb6.append("BlinkIdUISettings");
        sb6.append(".");
        sb6.append("showTorchButton");
        Camera2StreamConfigurationMap = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mb.");
        sb7.append("BlinkIdUISettings");
        sb7.append(".");
        sb7.append("showCancelButton");
        getHighSpeedVideoFpsRanges = sb7.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("mb.");
        sb8.append("BlinkIdUISettings");
        sb8.append(".");
        sb8.append("showMandatoryFieldsMissing");
        getHighSpeedVideoSizes = sb8.toString();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("mb.");
        sb9.append("BlinkIdUISettings");
        sb9.append(".");
        sb9.append("allowHapticFeedback");
        getHighSpeedVideoFpsRangesFor = sb9.toString();
    }
}

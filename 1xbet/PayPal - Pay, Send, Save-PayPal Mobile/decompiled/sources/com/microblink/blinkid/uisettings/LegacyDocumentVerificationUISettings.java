package com.microblink.blinkid.uisettings;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public class LegacyDocumentVerificationUISettings extends com.microblink.blinkid.uisettings.BaseBlinkIdUiSettings implements com.microblink.blinkid.uisettings.options.StyleUIOptions, com.microblink.blinkid.uisettings.options.StringsUIOptions<com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings> {
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;

    public LegacyDocumentVerificationUISettings(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        super(recognizerBundle);
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public java.lang.Class<?> getTargetActivity() {
        return com.microblink.blinkid.activity.LegacyDocumentVerificationActivity.class;
    }

    @Override // com.microblink.blinkid.uisettings.BaseBlinkIdUiSettings
    protected boolean isLockedToPortrait() {
        return true;
    }

    @Override // com.microblink.blinkid.uisettings.options.StyleUIOptions
    public void setOverlayViewStyle(int i) {
        getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges, i);
    }

    public LegacyDocumentVerificationUISettings(android.content.Intent intent) {
        super(intent);
    }

    @Override // com.microblink.blinkid.uisettings.BaseBlinkIdUiSettings
    protected com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView createOverlayView() {
        return new com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayView(true, (com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings) getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor), getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges, 0), null);
    }

    @Override // com.microblink.blinkid.uisettings.options.StringsUIOptions
    public void setStrings(com.microblink.blinkid.fragment.overlay.blinkid.legacy.documentverification.LegacyDocumentVerificationOverlayStrings legacyDocumentVerificationOverlayStrings) {
        getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor, legacyDocumentVerificationOverlayStrings);
    }

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mb.");
        sb.append("LegacyDocumentVerificationUISettings");
        sb.append(".");
        sb.append(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE);
        getHighSpeedVideoFpsRanges = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mb.");
        sb2.append("LegacyDocumentVerificationUISettings");
        sb2.append(".");
        sb2.append("strings");
        getHighSpeedVideoFpsRangesFor = sb2.toString();
    }
}

package com.microblink.blinkid.uisettings;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public class DocumentUISettings extends com.microblink.blinkid.uisettings.BaseBlinkIdUiSettings implements com.microblink.blinkid.uisettings.options.StyleUIOptions, com.microblink.blinkid.uisettings.options.StringsUIOptions<com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings> {
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;

    public DocumentUISettings(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        super(recognizerBundle);
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public java.lang.Class<?> getTargetActivity() {
        return com.microblink.blinkid.activity.DocumentScanActivity.class;
    }

    @Override // com.microblink.blinkid.uisettings.BaseBlinkIdUiSettings
    protected boolean isLockedToPortrait() {
        return false;
    }

    @Override // com.microblink.blinkid.uisettings.options.StyleUIOptions
    public void setOverlayViewStyle(int i) {
        getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges, i);
    }

    public DocumentUISettings(android.content.Intent intent) {
        super(intent);
    }

    @Override // com.microblink.blinkid.uisettings.BaseBlinkIdUiSettings
    protected com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlayView createOverlayView() {
        return new com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayView((com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings) getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor), getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges, 0));
    }

    @Override // com.microblink.blinkid.uisettings.options.StringsUIOptions
    public void setStrings(com.microblink.blinkid.fragment.overlay.blinkid.document.DocumentOverlayStrings documentOverlayStrings) {
        getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoFpsRangesFor, documentOverlayStrings);
    }

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mb.");
        sb.append("DocumentScanActivity");
        sb.append(".");
        sb.append(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE);
        getHighSpeedVideoFpsRanges = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mb.");
        sb2.append("DocumentScanActivity");
        sb2.append(".");
        sb2.append("strings");
        getHighSpeedVideoFpsRangesFor = sb2.toString();
    }
}

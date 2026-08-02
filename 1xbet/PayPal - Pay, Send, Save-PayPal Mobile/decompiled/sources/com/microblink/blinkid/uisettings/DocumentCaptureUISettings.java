package com.microblink.blinkid.uisettings;

/* loaded from: classes10.dex */
public final class DocumentCaptureUISettings extends com.microblink.blinkid.uisettings.UISettings<com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController> implements com.microblink.blinkid.uisettings.options.DebugImageListenerUIOptions, com.microblink.blinkid.uisettings.options.SplashScreenUIOptions, com.microblink.blinkid.uisettings.options.BeepSoundUIOptions, com.microblink.blinkid.uisettings.options.StyleUIOptions, com.microblink.blinkid.uisettings.options.StringsUIOptions<com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings> {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private final com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable getHighSpeedVideoSizesFor;

    public DocumentCaptureUISettings(com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable documentCaptureRecognizerTransferable) {
        this.getHighSpeedVideoSizesFor = documentCaptureRecognizerTransferable;
    }

    public final com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable getDocumentCaptureRecognizerTransferable() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public final java.lang.Class<?> getTargetActivity() {
        return com.microblink.blinkid.activity.DocumentCaptureActivity.class;
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public final void saveToIntent(android.content.Intent intent) {
        super.saveToIntent(intent);
        this.getHighSpeedVideoSizesFor.saveToIntent(intent);
    }

    @Override // com.microblink.blinkid.uisettings.options.BeepSoundUIOptions
    public final void setBeepSoundResourceID(int i) {
        getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges, i);
    }

    @Override // com.microblink.blinkid.uisettings.options.DebugImageListenerUIOptions
    public final void setDebugImageListener(com.microblink.blinkid.image.DebugImageListener debugImageListener) {
        getHighResolutionOutputSizeshNQ4ISI(getHighResolutionOutputSizeshNQ4ISI, debugImageListener);
    }

    @Override // com.microblink.blinkid.uisettings.options.StyleUIOptions
    public final void setOverlayViewStyle(int i) {
        getHighSpeedVideoSizes(getHighSpeedVideoSizes, i);
    }

    @Override // com.microblink.blinkid.uisettings.options.SplashScreenUIOptions
    public final void setSplashScreenLayoutResourceID(int i) {
        getHighSpeedVideoSizes(getHighSpeedVideoFpsRangesFor, i);
    }

    @Override // com.microblink.blinkid.uisettings.options.StringsUIOptions
    public final void setStrings(com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings detectionOverlayStrings) {
        getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap, detectionOverlayStrings);
    }

    public DocumentCaptureUISettings(android.content.Intent intent) {
        super(intent);
        com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable createFromIntent = com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable.createFromIntent(intent);
        this.getHighSpeedVideoSizesFor = createFromIntent;
        if (createFromIntent == null) {
            throw new java.lang.IllegalStateException("Expected DocumentCaptureRecognizerTransferable object does not exist in the intent!");
        }
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public final com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController createOverlayController(android.app.Activity activity, com.microblink.blinkid.view.recognition.ScanResultListener scanResultListener) {
        return new com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlayController(new com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlaySettings.Builder(getDocumentCaptureRecognizerTransferable()).setCameraSettings(getHighResolutionOutputSizeshNQ4ISI()).setSplashScreenLayoutResourceId(getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor, com.microblink.blinkid.resources.Layouts.lllIlIlIIl)).setBeepSoundResourceId(getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRanges, 0)).setDebugImageListener((com.microblink.blinkid.image.DebugImageListener) getHighSpeedVideoFpsRanges(getHighResolutionOutputSizeshNQ4ISI)).build(), scanResultListener, new com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayView((com.microblink.blinkid.fragment.overlay.documentcapture.detectionui.DetectionOverlayStrings) getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap), getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes, 0)));
    }

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mb.");
        sb.append("DocumentCaptureUISettings");
        sb.append(".");
        sb.append("imageListener");
        getHighResolutionOutputSizeshNQ4ISI = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("mb.");
        sb2.append("DocumentCaptureUISettings");
        sb2.append(".");
        sb2.append("splashResource");
        getHighSpeedVideoFpsRangesFor = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("mb.");
        sb3.append("DocumentCaptureUISettings");
        sb3.append(".");
        sb3.append("beepResource");
        getHighSpeedVideoFpsRanges = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("mb.");
        sb4.append("DocumentCaptureUISettings");
        sb4.append(".");
        sb4.append(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE);
        getHighSpeedVideoSizes = sb4.toString();
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("mb.");
        sb5.append("DocumentCaptureUISettings");
        sb5.append(".");
        sb5.append("strings");
        Camera2StreamConfigurationMap = sb5.toString();
    }
}

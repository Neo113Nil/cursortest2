package com.microblink.blinkid.uisettings;

/* loaded from: classes10.dex */
public class BarcodeUISettings extends com.microblink.blinkid.uisettings.BasicScanUISettings {
    public BarcodeUISettings(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        super(recognizerBundle);
    }

    @Override // com.microblink.blinkid.uisettings.BasicScanUISettings
    protected com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder createOverlaySettingsBuilder() {
        return new com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder(getRecognizerBundle()).setQuadViewPreset(com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset.DEFAULT_CORNERS_FROM_BARCODE_SCAN_ACTIVITY).setRecognitionFeedbackHandler(new com.microblink.blinkid.fragment.overlay.components.feedback.PointSetFeedbackHandler(com.microblink.blinkid.metadata.detection.points.PointsType.BARCODE_DETECTION)).setControlsLayoutConfig(com.microblink.blinkid.fragment.overlay.components.settings.ControlsLayoutConfig.createDefault());
    }

    @Override // com.microblink.blinkid.uisettings.UISettings
    public java.lang.Class<?> getTargetActivity() {
        return com.microblink.blinkid.activity.BarcodeScanActivity.class;
    }

    public BarcodeUISettings(android.content.Intent intent) {
        super(intent);
    }
}

package com.microblink.blinkid.fragment.overlay.fieldbyfield;

/* loaded from: classes10.dex */
public class FieldByFieldOverlaySettings {
    final com.microblink.blinkid.image.SuccessfulImageListener Camera2StreamConfigurationMap;
    final com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final com.microblink.blinkid.image.DebugImageListener getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;
    final com.microblink.blinkid.uisettings.options.OcrResultDisplayMode getHighSpeedVideoSizesFor;
    final com.microblink.blinkid.image.CurrentImageListener getInputFormats;
    final com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getInputSizeshNQ4ISI;
    final android.content.Intent getOutputFormats;

    public static class Builder {
        com.microblink.blinkid.image.DebugImageListener Camera2StreamConfigurationMap;
        com.microblink.blinkid.image.SuccessfulImageListener getHighResolutionOutputSizeshNQ4ISI;
        final com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;
        com.microblink.blinkid.image.CurrentImageListener getHighSpeedVideoSizesFor;
        android.content.Intent getOutputMinFrameDuration;
        com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getInputFormats = new com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder().build();
        com.microblink.blinkid.uisettings.options.OcrResultDisplayMode getOutputFormats = com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.ANIMATED_DOTS;
        boolean getHighSpeedVideoFpsRangesFor = false;

        public Builder(com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle fieldByFieldBundle) {
            this.getHighSpeedVideoFpsRanges = fieldByFieldBundle;
        }

        public com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings build() {
            return new com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings(this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        public com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings.Builder setCameraSettings(com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings overlayCameraSettings) {
            this.getInputFormats = overlayCameraSettings;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings.Builder setCurrentImageListener(com.microblink.blinkid.image.CurrentImageListener currentImageListener) {
            this.getHighSpeedVideoSizesFor = currentImageListener;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings.Builder setDebugImageListener(com.microblink.blinkid.image.DebugImageListener debugImageListener) {
            this.Camera2StreamConfigurationMap = debugImageListener;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings.Builder setHelpIntent(android.content.Intent intent) {
            this.getOutputMinFrameDuration = intent;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings.Builder setInfiniteLoopScan(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings.Builder setOcrResultDisplayMode(com.microblink.blinkid.uisettings.options.OcrResultDisplayMode ocrResultDisplayMode) {
            this.getOutputFormats = ocrResultDisplayMode;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings.Builder setSplashResourceId(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.fieldbyfield.FieldByFieldOverlaySettings.Builder setSuccessImageListener(com.microblink.blinkid.image.SuccessfulImageListener successfulImageListener) {
            this.getHighResolutionOutputSizeshNQ4ISI = successfulImageListener;
            return this;
        }
    }

    FieldByFieldOverlaySettings(com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings overlayCameraSettings, com.microblink.blinkid.entities.parsers.config.fieldbyfield.FieldByFieldBundle fieldByFieldBundle, com.microblink.blinkid.image.DebugImageListener debugImageListener, com.microblink.blinkid.image.CurrentImageListener currentImageListener, int i, com.microblink.blinkid.uisettings.options.OcrResultDisplayMode ocrResultDisplayMode, android.content.Intent intent, boolean z, com.microblink.blinkid.image.SuccessfulImageListener successfulImageListener) {
        this.getInputSizeshNQ4ISI = overlayCameraSettings;
        this.getHighResolutionOutputSizeshNQ4ISI = fieldByFieldBundle;
        this.getHighSpeedVideoFpsRangesFor = debugImageListener;
        this.getInputFormats = currentImageListener;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizesFor = ocrResultDisplayMode;
        this.getOutputFormats = intent;
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = successfulImageListener;
    }
}

package com.microblink.blinkid.fragment.overlay.basic;

/* loaded from: classes10.dex */
public class BasicOverlaySettings {
    final com.microblink.blinkid.fragment.overlay.components.settings.ScanRegionOfInterestSettings Camera2StreamConfigurationMap;
    final com.microblink.blinkid.image.DebugImageListener getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getHighSpeedVideoFpsRangesFor;
    final com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler getHighSpeedVideoSizes;
    final com.microblink.blinkid.uisettings.options.OverlayOrientation getHighSpeedVideoSizesFor;
    final int getInputFormats;
    final java.lang.Runnable getInputSizeshNQ4ISI;
    final com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator getOutputFormats;
    final boolean getOutputMinFrameDuration;
    final com.microblink.blinkid.entities.recognizers.RecognizerBundle getOutputMinFrameDurationlomOqCM;
    final com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset getOutputSizeshNQ4ISI;
    final com.microblink.blinkid.fragment.overlay.components.settings.ControlsLayoutConfig getOutputStallDurationlomOqCM;

    public static class Builder {
        private com.microblink.blinkid.image.DebugImageListener Camera2StreamConfigurationMap;
        private int getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoSizesFor;
        private java.lang.Runnable getInputFormats;
        private com.microblink.blinkid.uisettings.options.OverlayOrientation getInputSizeshNQ4ISI;
        private int getOutputMinFrameDuration;
        private final com.microblink.blinkid.entities.recognizers.RecognizerBundle getOutputStallDurationlomOqCM;
        private com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder().build();
        private com.microblink.blinkid.fragment.overlay.components.settings.ScanRegionOfInterestSettings getHighSpeedVideoSizes = new com.microblink.blinkid.fragment.overlay.components.settings.ScanRegionOfInterestSettings(null, false);
        private com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset getOutputSizes = com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset.DEFAULT_CORNERS_FROM_BARCODE_SCAN_ACTIVITY;
        private com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler.EMPTY;
        private com.microblink.blinkid.fragment.overlay.components.settings.ControlsLayoutConfig getOutputSizeshNQ4ISI = com.microblink.blinkid.fragment.overlay.components.settings.ControlsLayoutConfig.createDefault();
        private com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator getOutputFormats = com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator.EMPTY;

        public Builder(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
            this.getOutputStallDurationlomOqCM = recognizerBundle;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings build() {
            return new com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings(this.getOutputStallDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getOutputSizes, this.getHighSpeedVideoFpsRangesFor, this.getOutputSizeshNQ4ISI, this.getOutputFormats);
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setBeepSoundId(int i) {
            this.getOutputMinFrameDuration = i;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setCameraSettings(com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings overlayCameraSettings) {
            this.getHighResolutionOutputSizeshNQ4ISI = overlayCameraSettings;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setControlsLayoutConfig(com.microblink.blinkid.fragment.overlay.components.settings.ControlsLayoutConfig controlsLayoutConfig) {
            this.getOutputSizeshNQ4ISI = controlsLayoutConfig;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setDebugImageListener(com.microblink.blinkid.image.DebugImageListener debugImageListener) {
            this.Camera2StreamConfigurationMap = debugImageListener;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setForcedOrientation(com.microblink.blinkid.uisettings.options.OverlayOrientation overlayOrientation) {
            this.getInputSizeshNQ4ISI = overlayOrientation;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setHelpAction(java.lang.Runnable runnable) {
            this.getInputFormats = runnable;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setHighResFrameCaptureEnabled(boolean z) {
            this.getHighSpeedVideoSizesFor = z;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setQuadViewPreset(com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset quadViewPreset) {
            this.getOutputSizes = quadViewPreset;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setRecognitionFeedbackHandler(com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler recognitionFeedbackHandler) {
            this.getHighSpeedVideoFpsRangesFor = recognitionFeedbackHandler;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setScanRegionOfInterestSettings(com.microblink.blinkid.fragment.overlay.components.settings.ScanRegionOfInterestSettings scanRegionOfInterestSettings) {
            this.getHighSpeedVideoSizes = scanRegionOfInterestSettings;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setSplashResourceId(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.basic.BasicOverlaySettings.Builder setStatusMessageTranslator(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator statusMessageTranslator) {
            this.getOutputFormats = statusMessageTranslator;
            return this;
        }
    }

    BasicOverlaySettings(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings overlayCameraSettings, com.microblink.blinkid.fragment.overlay.components.settings.ScanRegionOfInterestSettings scanRegionOfInterestSettings, java.lang.Runnable runnable, int i, boolean z, int i2, com.microblink.blinkid.image.DebugImageListener debugImageListener, com.microblink.blinkid.uisettings.options.OverlayOrientation overlayOrientation, com.microblink.blinkid.view.viewfinder.quadview.QuadViewPreset quadViewPreset, com.microblink.blinkid.fragment.overlay.components.feedback.RecognitionFeedbackHandler recognitionFeedbackHandler, com.microblink.blinkid.fragment.overlay.components.settings.ControlsLayoutConfig controlsLayoutConfig, com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusMessageTranslator statusMessageTranslator) {
        this.getOutputMinFrameDurationlomOqCM = recognizerBundle;
        this.getHighSpeedVideoFpsRangesFor = overlayCameraSettings;
        this.Camera2StreamConfigurationMap = scanRegionOfInterestSettings;
        this.getInputSizeshNQ4ISI = runnable;
        this.getHighSpeedVideoFpsRanges = i;
        this.getOutputMinFrameDuration = z;
        this.getInputFormats = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = debugImageListener;
        this.getHighSpeedVideoSizesFor = overlayOrientation;
        this.getOutputSizeshNQ4ISI = quadViewPreset;
        this.getHighSpeedVideoSizes = recognitionFeedbackHandler;
        this.getOutputStallDurationlomOqCM = controlsLayoutConfig;
        this.getOutputFormats = statusMessageTranslator;
    }
}

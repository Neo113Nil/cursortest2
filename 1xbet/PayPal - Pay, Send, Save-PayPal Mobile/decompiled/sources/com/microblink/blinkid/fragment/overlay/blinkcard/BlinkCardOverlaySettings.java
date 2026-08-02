package com.microblink.blinkid.fragment.overlay.blinkcard;

/* loaded from: classes10.dex */
public class BlinkCardOverlaySettings {
    public static final int TIMEOUT_INFINITY = 0;
    final com.microblink.blinkid.uisettings.options.OcrResultDisplayMode Camera2StreamConfigurationMap;
    final com.microblink.blinkid.image.DebugImageListener getHighResolutionOutputSizeshNQ4ISI;
    final com.microblink.blinkid.entities.recognizers.RecognizerBundle getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;
    final int getHighSpeedVideoSizesFor;
    final com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getInputFormats;
    final com.microblink.blinkid.image.CurrentImageListener getInputSizeshNQ4ISI;
    final int getOutputFormats;
    final long getOutputMinFrameDuration;
    private final long getOutputMinFrameDurationlomOqCM;
    private final boolean getOutputSizes;
    private final boolean getOutputStallDurationlomOqCM;
    public static final long DEFAULT_TIMEOUT_MS = java.util.concurrent.TimeUnit.SECONDS.toMillis(17);
    public static long DEFAULT_SHOW_TOOLTIP_TIME_INTERVAL_MS = com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions.DEFAULT_SHOW_TOOLTIP_TIME_INTERVAL_MS;

    public static class Builder {
        boolean Camera2StreamConfigurationMap;
        final com.microblink.blinkid.entities.recognizers.RecognizerBundle getHighResolutionOutputSizeshNQ4ISI;
        com.microblink.blinkid.image.DebugImageListener getHighSpeedVideoFpsRangesFor;
        int getInputSizeshNQ4ISI;
        com.microblink.blinkid.image.CurrentImageListener getOutputFormats;
        int getOutputMinFrameDuration;
        com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getHighSpeedVideoSizesFor = new com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder().build();
        boolean getHighSpeedVideoSizes = false;
        com.microblink.blinkid.uisettings.options.OcrResultDisplayMode getHighSpeedVideoFpsRanges = com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.ANIMATED_DOTS;
        private boolean getOutputMinFrameDurationlomOqCM = false;
        private boolean getOutputSizeshNQ4ISI = false;
        long getOutputSizes = com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.DEFAULT_TIMEOUT_MS;
        long getInputFormats = com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.DEFAULT_SHOW_TOOLTIP_TIME_INTERVAL_MS;

        public Builder(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
            this.getHighResolutionOutputSizeshNQ4ISI = recognizerBundle;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings build() {
            return new com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDurationlomOqCM, this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getOutputSizes, this.getInputFormats);
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder isHighResSuccessFrameCaptureEnabled(boolean z) {
            this.getHighSpeedVideoSizes = z;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder setBackSideScanningTimeoutMs(long j) {
            this.getOutputSizes = j;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder setBeepResourceId(int i) {
            this.getInputSizeshNQ4ISI = i;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder setCameraSettings(com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings overlayCameraSettings) {
            this.getHighSpeedVideoSizesFor = overlayCameraSettings;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder setCurrentImageListener(com.microblink.blinkid.image.CurrentImageListener currentImageListener) {
            this.getOutputFormats = currentImageListener;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder setDebugImageListener(com.microblink.blinkid.image.DebugImageListener debugImageListener) {
            this.getHighSpeedVideoFpsRangesFor = debugImageListener;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder setIsEditScreenEnabled(boolean z) {
            this.getOutputSizeshNQ4ISI = z;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder setLockedToPortrait(boolean z) {
            this.Camera2StreamConfigurationMap = z;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder setOcrResultDisplayMode(com.microblink.blinkid.uisettings.options.OcrResultDisplayMode ocrResultDisplayMode) {
            this.getHighSpeedVideoFpsRanges = ocrResultDisplayMode;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder setShouldShowManualEntryButton(boolean z) {
            this.getOutputMinFrameDurationlomOqCM = z;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder setShowTooltipTimeIntervalMs(long j) {
            this.getInputFormats = j;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.blinkcard.BlinkCardOverlaySettings.Builder setSplashResourceId(int i) {
            this.getOutputMinFrameDuration = i;
            return this;
        }
    }

    BlinkCardOverlaySettings(int i, com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings overlayCameraSettings, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, com.microblink.blinkid.image.DebugImageListener debugImageListener, com.microblink.blinkid.image.CurrentImageListener currentImageListener, boolean z, int i2, com.microblink.blinkid.uisettings.options.OcrResultDisplayMode ocrResultDisplayMode, boolean z2, boolean z3, boolean z4, long j, long j2) {
        this.getInputFormats = overlayCameraSettings;
        this.getHighSpeedVideoFpsRanges = recognizerBundle;
        this.getHighResolutionOutputSizeshNQ4ISI = debugImageListener;
        this.getInputSizeshNQ4ISI = currentImageListener;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoSizesFor = i2;
        this.getOutputFormats = i;
        this.Camera2StreamConfigurationMap = ocrResultDisplayMode;
        this.getOutputStallDurationlomOqCM = z2;
        this.getHighSpeedVideoFpsRangesFor = z4;
        this.getOutputSizes = z3;
        this.getOutputMinFrameDuration = j;
        this.getOutputMinFrameDurationlomOqCM = j2;
        if (z3 || z2) {
            com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result>[] recognizers = recognizerBundle.getRecognizers();
            com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer blinkCardRecognizer = null;
            for (com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.Recognizer.Result> recognizer : recognizers) {
                blinkCardRecognizer = recognizer instanceof com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer ? (com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer) recognizer : blinkCardRecognizer;
                if (recognizer instanceof com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer) {
                    com.microblink.blinkid.entities.recognizers.Recognizer<?> slaveRecognizer = ((com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer) recognizer).getSlaveRecognizer();
                    if (slaveRecognizer instanceof com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer) {
                        blinkCardRecognizer = (com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer) slaveRecognizer;
                    }
                }
            }
            if (blinkCardRecognizer == null) {
                throw new java.lang.IllegalArgumentException("Edit screen can only be used with BlinkCardRecognizer");
            }
        }
    }

    public long getShowTooltipTimeIntervalMs() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public boolean isEditScreenEnabled() {
        return this.getOutputSizes;
    }

    public boolean shouldShowManualEntryButton() {
        return this.getOutputStallDurationlomOqCM;
    }
}

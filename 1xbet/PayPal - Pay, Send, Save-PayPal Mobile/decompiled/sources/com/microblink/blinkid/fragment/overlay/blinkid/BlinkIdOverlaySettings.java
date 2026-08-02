package com.microblink.blinkid.fragment.overlay.blinkid;

/* loaded from: classes10.dex */
public class BlinkIdOverlaySettings {
    public static final long DEFAULT_TIMEOUT_MS = java.util.concurrent.TimeUnit.SECONDS.toMillis(17);
    public static final int TIMEOUT_INFINITY = 0;
    final long Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final com.microblink.blinkid.image.DebugImageListener getHighSpeedVideoSizes;
    final com.microblink.blinkid.image.CurrentImageListener getHighSpeedVideoSizesFor;
    final com.microblink.blinkid.uisettings.options.OcrResultDisplayMode getInputFormats;
    final com.microblink.blinkid.uisettings.options.ScanUIEventListener getInputSizeshNQ4ISI;
    final int getOutputFormats;
    final int getOutputMinFrameDuration;
    final boolean getOutputMinFrameDurationlomOqCM;
    final com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getOutputSizes;
    final boolean getOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.recognizers.RecognizerBundle getOutputStallDuration;
    public final long showTooltipTimeIntervalMs;

    public static class Builder implements com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions<com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder> {
        final com.microblink.blinkid.entities.recognizers.RecognizerBundle getHighResolutionOutputSizeshNQ4ISI;
        com.microblink.blinkid.uisettings.options.ScanUIEventListener getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizesFor;
        com.microblink.blinkid.image.DebugImageListener getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;
        com.microblink.blinkid.image.CurrentImageListener getOutputSizeshNQ4ISI;
        com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getOutputStallDuration = new com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder().build();
        boolean Camera2StreamConfigurationMap = false;
        boolean getHighSpeedVideoSizes = true;
        com.microblink.blinkid.uisettings.options.OcrResultDisplayMode getInputSizeshNQ4ISI = com.microblink.blinkid.uisettings.options.OcrResultDisplayMode.ANIMATED_DOTS;
        boolean getOutputStallDurationlomOqCM = true;
        boolean getOutputSizes = true;
        long getInputFormats = com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.DEFAULT_TIMEOUT_MS;
        long getOutputFormats = com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions.DEFAULT_SHOW_TOOLTIP_TIME_INTERVAL_MS;

        public Builder(com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
            this.getHighResolutionOutputSizeshNQ4ISI = recognizerBundle;
        }

        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings build() {
            return new com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings(this.getOutputMinFrameDurationlomOqCM, this.getOutputStallDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor, this.getOutputSizes, this.getInputFormats, this.getOutputFormats, this.getHighSpeedVideoFpsRanges);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder isHighResSuccessFrameCaptureEnabled(boolean z) {
            this.Camera2StreamConfigurationMap = z;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setBackSideScanningTimeoutMs(long j) {
            this.getInputFormats = j;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setBeepResourceId(int i) {
            this.getHighSpeedVideoSizesFor = i;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setCameraSettings(com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings overlayCameraSettings) {
            this.getOutputStallDuration = overlayCameraSettings;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setCurrentImageListener(com.microblink.blinkid.image.CurrentImageListener currentImageListener) {
            this.getOutputSizeshNQ4ISI = currentImageListener;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setDebugImageListener(com.microblink.blinkid.image.DebugImageListener debugImageListener) {
            this.getOutputMinFrameDuration = debugImageListener;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setDocumentDataMatchRequired(boolean z) {
            this.getHighSpeedVideoSizes = z;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setLockedToPortrait(boolean z) {
            this.getHighSpeedVideoFpsRangesFor = z;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setOcrResultDisplayMode(com.microblink.blinkid.uisettings.options.OcrResultDisplayMode ocrResultDisplayMode) {
            this.getInputSizeshNQ4ISI = ocrResultDisplayMode;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setScanUIEventListener(com.microblink.blinkid.uisettings.options.ScanUIEventListener scanUIEventListener) {
            this.getHighSpeedVideoFpsRanges = scanUIEventListener;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setShowMrzDots(boolean z) {
            this.getOutputStallDurationlomOqCM = z;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setShowNotSupportedDialog(boolean z) {
            this.getOutputSizes = z;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setShowTooltipTimeIntervalMs(long j) {
            this.getOutputFormats = j;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.microblink.blinkid.fragment.overlay.blinkid.settings.options.BlinkIdOverlaySettingsOptions
        public com.microblink.blinkid.fragment.overlay.blinkid.BlinkIdOverlaySettings.Builder setSplashResourceId(int i) {
            this.getOutputMinFrameDurationlomOqCM = i;
            return this;
        }
    }

    BlinkIdOverlaySettings(int i, com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings overlayCameraSettings, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, com.microblink.blinkid.image.DebugImageListener debugImageListener, com.microblink.blinkid.image.CurrentImageListener currentImageListener, boolean z, int i2, boolean z2, com.microblink.blinkid.uisettings.options.OcrResultDisplayMode ocrResultDisplayMode, boolean z3, boolean z4, boolean z5, long j, long j2, com.microblink.blinkid.uisettings.options.ScanUIEventListener scanUIEventListener) {
        this.getOutputSizes = overlayCameraSettings;
        this.getOutputStallDuration = recognizerBundle;
        this.getHighSpeedVideoSizes = debugImageListener;
        this.getHighSpeedVideoSizesFor = currentImageListener;
        this.getHighSpeedVideoFpsRanges = z;
        this.getOutputMinFrameDuration = i2;
        this.getOutputFormats = i;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getInputFormats = ocrResultDisplayMode;
        this.getOutputMinFrameDurationlomOqCM = z3;
        this.getHighSpeedVideoFpsRangesFor = z4;
        this.getOutputSizeshNQ4ISI = z5;
        this.Camera2StreamConfigurationMap = j;
        this.showTooltipTimeIntervalMs = j2;
        this.getInputSizeshNQ4ISI = scanUIEventListener;
    }

    public com.microblink.blinkid.entities.recognizers.RecognizerBundle getRecognizerBundle() {
        return this.getOutputStallDuration;
    }
}

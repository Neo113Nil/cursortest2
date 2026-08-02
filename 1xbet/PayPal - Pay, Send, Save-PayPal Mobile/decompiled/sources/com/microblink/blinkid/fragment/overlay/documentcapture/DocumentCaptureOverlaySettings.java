package com.microblink.blinkid.fragment.overlay.documentcapture;

/* loaded from: classes10.dex */
public class DocumentCaptureOverlaySettings {
    private final com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final com.microblink.blinkid.image.DebugImageListener getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getHighSpeedVideoSizes;

    public static class Builder {
        private int Camera2StreamConfigurationMap;
        private final com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable getHighResolutionOutputSizeshNQ4ISI;
        private com.microblink.blinkid.image.DebugImageListener getHighSpeedVideoFpsRanges;
        private com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder().build();
        private int getHighSpeedVideoSizes;

        public Builder(com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable documentCaptureRecognizerTransferable) {
            this.getHighResolutionOutputSizeshNQ4ISI = documentCaptureRecognizerTransferable;
        }

        public com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlaySettings build() {
            return new com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlaySettings(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        }

        public com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlaySettings.Builder setBeepSoundResourceId(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlaySettings.Builder setCameraSettings(com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings overlayCameraSettings) {
            this.getHighSpeedVideoFpsRangesFor = overlayCameraSettings;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlaySettings.Builder setDebugImageListener(com.microblink.blinkid.image.DebugImageListener debugImageListener) {
            this.getHighSpeedVideoFpsRanges = debugImageListener;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.documentcapture.DocumentCaptureOverlaySettings.Builder setSplashScreenLayoutResourceId(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }
    }

    DocumentCaptureOverlaySettings(com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable documentCaptureRecognizerTransferable, com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings overlayCameraSettings, int i, int i2, com.microblink.blinkid.image.DebugImageListener debugImageListener) {
        this.Camera2StreamConfigurationMap = documentCaptureRecognizerTransferable;
        this.getHighSpeedVideoSizes = overlayCameraSettings;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoFpsRangesFor = debugImageListener;
    }

    public int getBeepSoundResourceId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings getCameraSettings() {
        return this.getHighSpeedVideoSizes;
    }

    public com.microblink.blinkid.image.DebugImageListener getDebugImageListener() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.microblink.blinkid.entities.recognizers.blinkinput.documentcapture.DocumentCaptureRecognizerTransferable getDocumentCaptureRecognizerTransferable() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getSplashScreenLayoutResourceId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}

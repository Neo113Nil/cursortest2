package com.microblink.blinkid.fragment.overlay.components.settings;

/* loaded from: classes10.dex */
public class OverlayCameraSettings {
    public final com.microblink.blinkid.view.CameraAspectMode aspectMode;
    public final boolean forceLegacyApi;
    public final boolean isOptimizedForNearScan;
    public final boolean isPinchToZoomAllowed;
    public final float previewZoomScale;
    public final com.microblink.blinkid.view.surface.CameraSurface surface;
    public final com.microblink.blinkid.hardware.camera.CameraType type;
    public final com.microblink.blinkid.hardware.camera.VideoResolutionPreset videoResolutionPreset;

    public static class Builder {
        private com.microblink.blinkid.hardware.camera.CameraType getHighSpeedVideoSizesFor = com.microblink.blinkid.hardware.camera.CameraType.CAMERA_DEFAULT;
        private boolean Camera2StreamConfigurationMap = false;
        private com.microblink.blinkid.view.CameraAspectMode getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.view.CameraAspectMode.ASPECT_FILL;
        private float getOutputFormats = 1.0f;
        private com.microblink.blinkid.view.surface.CameraSurface getHighResolutionOutputSizeshNQ4ISI = com.microblink.blinkid.view.surface.CameraSurface.SURFACE_DEFAULT;
        private boolean getHighSpeedVideoSizes = false;
        private boolean getInputSizeshNQ4ISI = false;
        private com.microblink.blinkid.hardware.camera.VideoResolutionPreset getHighSpeedVideoFpsRanges = com.microblink.blinkid.hardware.camera.VideoResolutionPreset.VIDEO_RESOLUTION_DEFAULT;

        public com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings build() {
            return new com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        }

        public com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder setAspectMode(com.microblink.blinkid.view.CameraAspectMode cameraAspectMode) {
            this.getHighSpeedVideoFpsRangesFor = cameraAspectMode;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder setForceLegacyApi(boolean z) {
            this.getHighSpeedVideoSizes = z;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder setIsOptimizedForNearScan(boolean z) {
            this.Camera2StreamConfigurationMap = z;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder setIsPinchToZoomAllowed(boolean z) {
            this.getInputSizeshNQ4ISI = z;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder setPreviewZoomScale(float f) {
            this.getOutputFormats = f;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder setSurface(com.microblink.blinkid.view.surface.CameraSurface cameraSurface) {
            this.getHighResolutionOutputSizeshNQ4ISI = cameraSurface;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder setType(com.microblink.blinkid.hardware.camera.CameraType cameraType) {
            this.getHighSpeedVideoSizesFor = cameraType;
            return this;
        }

        public com.microblink.blinkid.fragment.overlay.components.settings.OverlayCameraSettings.Builder setVideoResolutionPreset(com.microblink.blinkid.hardware.camera.VideoResolutionPreset videoResolutionPreset) {
            this.getHighSpeedVideoFpsRanges = videoResolutionPreset;
            return this;
        }
    }

    OverlayCameraSettings(com.microblink.blinkid.hardware.camera.CameraType cameraType, boolean z, com.microblink.blinkid.view.CameraAspectMode cameraAspectMode, float f, com.microblink.blinkid.view.surface.CameraSurface cameraSurface, boolean z2, boolean z3, com.microblink.blinkid.hardware.camera.VideoResolutionPreset videoResolutionPreset) {
        this.type = cameraType;
        this.isOptimizedForNearScan = z;
        this.aspectMode = cameraAspectMode;
        this.previewZoomScale = f;
        this.surface = cameraSurface;
        this.forceLegacyApi = z2;
        this.isPinchToZoomAllowed = z3;
        this.videoResolutionPreset = videoResolutionPreset;
    }

    public void apply(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        recognizerRunnerView.setOptimizeCameraForNearScan(this.isOptimizedForNearScan);
        recognizerRunnerView.setCameraType(this.type);
        recognizerRunnerView.setAspectMode(this.aspectMode);
        recognizerRunnerView.setPreviewZoomScale(this.previewZoomScale);
        recognizerRunnerView.setRequestedSurfaceViewForCameraDisplay(this.surface);
        recognizerRunnerView.setVideoResolutionPreset(this.videoResolutionPreset);
        recognizerRunnerView.setForceUseLegacyCamera(this.forceLegacyApi);
        recognizerRunnerView.setPinchToZoomAllowed(this.isPinchToZoomAllowed);
    }
}

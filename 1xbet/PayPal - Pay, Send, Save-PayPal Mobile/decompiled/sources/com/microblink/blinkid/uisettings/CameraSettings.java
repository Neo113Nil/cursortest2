package com.microblink.blinkid.uisettings;

/* loaded from: classes10.dex */
public class CameraSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.uisettings.CameraSettings> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.uisettings.CameraSettings>() { // from class: com.microblink.blinkid.uisettings.CameraSettings.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.uisettings.CameraSettings createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.uisettings.CameraSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.uisettings.CameraSettings[] newArray(int i) {
            return new com.microblink.blinkid.uisettings.CameraSettings[i];
        }
    };
    public final com.microblink.blinkid.view.CameraAspectMode aspectMode;
    public final boolean forceLegacyApi;
    public final boolean isOptimizedForNearScan;
    public final boolean isPinchToZoomAllowed;
    public final float previewZoomScale;
    public final com.microblink.blinkid.view.surface.CameraSurface surface;
    public final com.microblink.blinkid.hardware.camera.CameraType type;
    public final com.microblink.blinkid.hardware.camera.VideoResolutionPreset videoResolutionPreset;

    public static class Builder {
        private com.microblink.blinkid.hardware.camera.CameraType getOutputMinFrameDuration = com.microblink.blinkid.hardware.camera.CameraType.CAMERA_DEFAULT;
        private boolean getHighResolutionOutputSizeshNQ4ISI = false;
        private com.microblink.blinkid.view.CameraAspectMode Camera2StreamConfigurationMap = com.microblink.blinkid.view.CameraAspectMode.ASPECT_FILL;
        private float getOutputFormats = 1.0f;
        private com.microblink.blinkid.view.surface.CameraSurface getHighSpeedVideoFpsRanges = com.microblink.blinkid.view.surface.CameraSurface.SURFACE_DEFAULT;
        private boolean getHighSpeedVideoSizes = false;
        private boolean getInputSizeshNQ4ISI = false;
        private com.microblink.blinkid.hardware.camera.VideoResolutionPreset getHighSpeedVideoFpsRangesFor = com.microblink.blinkid.hardware.camera.VideoResolutionPreset.VIDEO_RESOLUTION_DEFAULT;

        public com.microblink.blinkid.uisettings.CameraSettings build() {
            return new com.microblink.blinkid.uisettings.CameraSettings(this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        }

        public com.microblink.blinkid.uisettings.CameraSettings.Builder setAspectMode(com.microblink.blinkid.view.CameraAspectMode cameraAspectMode) {
            this.Camera2StreamConfigurationMap = cameraAspectMode;
            return this;
        }

        public com.microblink.blinkid.uisettings.CameraSettings.Builder setForceLegacyApi(boolean z) {
            this.getHighSpeedVideoSizes = z;
            return this;
        }

        public com.microblink.blinkid.uisettings.CameraSettings.Builder setIsOptimizedForNearScan(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            return this;
        }

        public com.microblink.blinkid.uisettings.CameraSettings.Builder setIsPinchToZoomAllowed(boolean z) {
            this.getInputSizeshNQ4ISI = z;
            return this;
        }

        public com.microblink.blinkid.uisettings.CameraSettings.Builder setPreviewZoomScale(float f) {
            this.getOutputFormats = f;
            return this;
        }

        public com.microblink.blinkid.uisettings.CameraSettings.Builder setSurface(com.microblink.blinkid.view.surface.CameraSurface cameraSurface) {
            this.getHighSpeedVideoFpsRanges = cameraSurface;
            return this;
        }

        public com.microblink.blinkid.uisettings.CameraSettings.Builder setType(com.microblink.blinkid.hardware.camera.CameraType cameraType) {
            this.getOutputMinFrameDuration = cameraType;
            return this;
        }

        public com.microblink.blinkid.uisettings.CameraSettings.Builder setVideoResolutionPreset(com.microblink.blinkid.hardware.camera.VideoResolutionPreset videoResolutionPreset) {
            this.getHighSpeedVideoFpsRangesFor = videoResolutionPreset;
            return this;
        }
    }

    CameraSettings(com.microblink.blinkid.hardware.camera.CameraType cameraType, boolean z, com.microblink.blinkid.view.CameraAspectMode cameraAspectMode, float f, com.microblink.blinkid.view.surface.CameraSurface cameraSurface, boolean z2, boolean z3, com.microblink.blinkid.hardware.camera.VideoResolutionPreset videoResolutionPreset) {
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

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.type, i);
        parcel.writeByte(this.isOptimizedForNearScan ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.aspectMode, i);
        parcel.writeFloat(this.previewZoomScale);
        parcel.writeParcelable(this.surface, i);
        parcel.writeByte(this.forceLegacyApi ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isPinchToZoomAllowed ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.videoResolutionPreset, i);
    }

    CameraSettings(android.os.Parcel parcel) {
        this.type = (com.microblink.blinkid.hardware.camera.CameraType) parcel.readParcelable(com.microblink.blinkid.hardware.camera.CameraType.class.getClassLoader());
        this.isOptimizedForNearScan = parcel.readByte() != 0;
        this.aspectMode = (com.microblink.blinkid.view.CameraAspectMode) parcel.readParcelable(com.microblink.blinkid.view.CameraAspectMode.class.getClassLoader());
        this.previewZoomScale = parcel.readFloat();
        this.surface = (com.microblink.blinkid.view.surface.CameraSurface) parcel.readParcelable(com.microblink.blinkid.view.surface.CameraSurface.class.getClassLoader());
        this.forceLegacyApi = parcel.readByte() != 0;
        this.isPinchToZoomAllowed = parcel.readByte() != 0;
        this.videoResolutionPreset = (com.microblink.blinkid.hardware.camera.VideoResolutionPreset) parcel.readParcelable(com.microblink.blinkid.hardware.camera.VideoResolutionPreset.class.getClassLoader());
    }
}

package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class AdapterCameraInfo extends androidx.camera.core.impl.ForwardingCameraInfo {
    public static final int CAMERA_OPERATION_AE_REGION = 3;
    public static final int CAMERA_OPERATION_AF_REGION = 2;
    public static final int CAMERA_OPERATION_AUTO_FOCUS = 1;
    public static final int CAMERA_OPERATION_AWB_REGION = 4;
    public static final int CAMERA_OPERATION_EXPOSURE_COMPENSATION = 7;
    public static final int CAMERA_OPERATION_EXTENSION_STRENGTH = 8;
    public static final int CAMERA_OPERATION_FLASH = 5;
    public static final int CAMERA_OPERATION_TORCH = 6;
    public static final int CAMERA_OPERATION_ZOOM = 0;
    private boolean Camera2StreamConfigurationMap;
    private androidx.view.LiveData<androidx.camera.core.ZoomState> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.impl.CameraInfoInternal getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.core.impl.CameraConfig getHighSpeedVideoSizes;
    private final androidx.camera.core.impl.SessionProcessor getInputFormats;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CameraOperation {
    }

    public static float getPercentageByRatio(float f, float f2, float f3) {
        if (f3 == f2) {
            return 0.0f;
        }
        if (f == f3) {
            return 1.0f;
        }
        if (f == f2) {
            return 0.0f;
        }
        float f4 = 1.0f / f2;
        return ((1.0f / f) - f4) / ((1.0f / f3) - f4);
    }

    public AdapterCameraInfo(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.CameraConfig cameraConfig) {
        super(cameraInfoInternal);
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = cameraInfoInternal;
        this.getHighSpeedVideoSizes = cameraConfig;
        this.getInputFormats = cameraConfig.getSessionProcessor(null);
        setPostviewSupported(cameraConfig.isPostviewSupported());
        setCaptureProcessProgressSupported(cameraConfig.isCaptureProcessProgressSupported());
    }

    public androidx.camera.core.impl.CameraConfig getCameraConfig() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public androidx.camera.core.impl.CameraInfoInternal getImplementation() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public androidx.camera.core.impl.SessionProcessor getSessionProcessor() {
        return this.getInputFormats;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        if (androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.getInputFormats, 5)) {
            return this.getHighSpeedVideoFpsRanges.hasFlashUnit();
        }
        return false;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public androidx.view.LiveData<java.lang.Integer> getTorchState() {
        if (!androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.getInputFormats, 6)) {
            return new androidx.view.MutableLiveData(0);
        }
        return this.getHighSpeedVideoFpsRanges.getTorchState();
    }

    public static float getZoomRatioByPercentage(float f, float f2, float f3) {
        if (f == 1.0f) {
            return f3;
        }
        if (f == 0.0f) {
            return f2;
        }
        double d = 1.0f / f2;
        return (float) androidx.core.math.MathUtils.clamp(1.0d / (d + (((1.0f / f3) - d) * f)), f2, f3);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public androidx.view.LiveData<androidx.camera.core.ZoomState> getZoomState() {
        if (!androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.getInputFormats, 0)) {
            return new androidx.view.MutableLiveData(androidx.camera.core.internal.ImmutableZoomState.create(1.0f, 1.0f, 1.0f, 0.0f));
        }
        if (this.getInputFormats != null) {
            androidx.camera.core.ZoomState value = this.getHighSpeedVideoFpsRanges.getZoomState().getValue();
            final android.util.Range<java.lang.Float> extensionZoomRange = this.getInputFormats.getExtensionZoomRange();
            if (extensionZoomRange != null && (extensionZoomRange.getLower().floatValue() != value.getGetHighSpeedVideoFpsRangesFor() || extensionZoomRange.getUpper().floatValue() != value.getGetHighSpeedVideoSizes())) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.impl.utils.LiveDataUtil.map(this.getHighSpeedVideoFpsRanges.getZoomState(), new androidx.arch.core.util.Function() { // from class: androidx.camera.core.impl.AdapterCameraInfo$$ExternalSyntheticLambda0
                        @Override // androidx.arch.core.util.Function
                        public final java.lang.Object apply(java.lang.Object obj) {
                            androidx.camera.core.ZoomState create;
                            create = androidx.camera.core.internal.ImmutableZoomState.create(r2.getGetHighResolutionOutputSizeshNQ4ISI(), ((java.lang.Float) r0.getUpper()).floatValue(), ((java.lang.Float) r0.getLower()).floatValue(), androidx.camera.core.impl.AdapterCameraInfo.getPercentageByRatio(((androidx.camera.core.ZoomState) obj).getGetHighResolutionOutputSizeshNQ4ISI(), ((java.lang.Float) r0.getLower()).floatValue(), ((java.lang.Float) extensionZoomRange.getUpper()).floatValue()));
                            return create;
                        }
                    });
                }
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }
        }
        return this.getHighSpeedVideoFpsRanges.getZoomState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public androidx.camera.core.ExposureState getExposureState() {
        if (!androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.getInputFormats, 7)) {
            return new androidx.camera.core.ExposureState() { // from class: androidx.camera.core.impl.AdapterCameraInfo.1
                @Override // androidx.camera.core.ExposureState
                /* renamed from: getExposureCompensationIndex */
                public int getGetHighSpeedVideoSizes() {
                    return 0;
                }

                @Override // androidx.camera.core.ExposureState
                /* renamed from: isExposureCompensationSupported */
                public boolean getGetHighResolutionOutputSizeshNQ4ISI() {
                    return false;
                }

                @Override // androidx.camera.core.ExposureState
                public android.util.Range<java.lang.Integer> getExposureCompensationRange() {
                    return new android.util.Range<>(0, 0);
                }

                @Override // androidx.camera.core.ExposureState
                /* renamed from: getExposureCompensationStep */
                public android.util.Rational getCamera2StreamConfigurationMap() {
                    return android.util.Rational.ZERO;
                }
            };
        }
        return this.getHighSpeedVideoFpsRanges.getExposureState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        androidx.camera.core.FocusMeteringAction modifiedFocusMeteringAction = androidx.camera.core.impl.utils.SessionProcessorUtil.getModifiedFocusMeteringAction(this.getInputFormats, focusMeteringAction);
        if (modifiedFocusMeteringAction == null) {
            return false;
        }
        return this.getHighSpeedVideoFpsRanges.isFocusMeteringSupported(modifiedFocusMeteringAction);
    }

    public void setPostviewSupported(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public void setCaptureProcessProgressSupported(boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isPostviewSupported() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isCaptureProcessProgressSupported() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public boolean isVideoStabilizationSupported() {
        int[] extensionAvailableStabilizationModes;
        androidx.camera.core.impl.SessionProcessor sessionProcessor = this.getInputFormats;
        if (sessionProcessor != null && (extensionAvailableStabilizationModes = sessionProcessor.getExtensionAvailableStabilizationModes()) != null) {
            for (int i : extensionAvailableStabilizationModes) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
        return super.isVideoStabilizationSupported();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public boolean isPreviewStabilizationSupported() {
        int[] extensionAvailableStabilizationModes;
        androidx.camera.core.impl.SessionProcessor sessionProcessor = this.getInputFormats;
        if (sessionProcessor != null && (extensionAvailableStabilizationModes = sessionProcessor.getExtensionAvailableStabilizationModes()) != null) {
            for (int i : extensionAvailableStabilizationModes) {
                if (i == 2) {
                    return true;
                }
            }
            return false;
        }
        return super.isPreviewStabilizationSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isUseCaseCombinationSupported(java.util.List<androidx.camera.core.UseCase> list, int i, boolean z) {
        return this.getHighSpeedVideoFpsRanges.isUseCaseCombinationSupported(list, i, z, this.getHighSpeedVideoSizes);
    }
}

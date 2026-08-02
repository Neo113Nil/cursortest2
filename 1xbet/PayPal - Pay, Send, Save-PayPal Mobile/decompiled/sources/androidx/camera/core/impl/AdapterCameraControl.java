package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class AdapterCameraControl extends androidx.camera.core.impl.ForwardingCameraControl {
    private final androidx.camera.core.impl.CameraControlInternal Camera2StreamConfigurationMap;
    private final androidx.camera.core.impl.SessionProcessor getHighSpeedVideoFpsRangesFor;

    public AdapterCameraControl(androidx.camera.core.impl.CameraControlInternal cameraControlInternal, androidx.camera.core.impl.SessionProcessor sessionProcessor) {
        super(cameraControlInternal);
        this.Camera2StreamConfigurationMap = cameraControlInternal;
        this.getHighSpeedVideoFpsRangesFor = sessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.CameraControlInternal getImplementation() {
        return this.Camera2StreamConfigurationMap;
    }

    public androidx.camera.core.impl.SessionProcessor getSessionProcessor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean z) {
        if (!androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.getHighSpeedVideoFpsRangesFor, 6)) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Torch is not supported"));
        }
        return this.Camera2StreamConfigurationMap.enableTorch(z);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        androidx.camera.core.FocusMeteringAction modifiedFocusMeteringAction = androidx.camera.core.impl.utils.SessionProcessorUtil.getModifiedFocusMeteringAction(this.getHighSpeedVideoFpsRangesFor, focusMeteringAction);
        if (modifiedFocusMeteringAction == null) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("FocusMetering is not supported"));
        }
        return this.Camera2StreamConfigurationMap.startFocusAndMetering(modifiedFocusMeteringAction);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelFocusAndMetering() {
        return this.Camera2StreamConfigurationMap.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float f) {
        android.util.Range<java.lang.Float> extensionZoomRange;
        if (!androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.getHighSpeedVideoFpsRangesFor, 0)) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Zoom is not supported"));
        }
        androidx.camera.core.impl.SessionProcessor sessionProcessor = this.getHighSpeedVideoFpsRangesFor;
        if (sessionProcessor != null && (extensionZoomRange = sessionProcessor.getExtensionZoomRange()) != null && (f < extensionZoomRange.getLower().floatValue() || f > extensionZoomRange.getUpper().floatValue())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested zoomRatio ");
            sb.append(f);
            sb.append(" is not within valid range [");
            sb.append(extensionZoomRange.getLower());
            sb.append(" , ");
            sb.append(extensionZoomRange.getUpper());
            sb.append("]");
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalArgumentException(sb.toString()));
        }
        return this.Camera2StreamConfigurationMap.setZoomRatio(f);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(float f) {
        if (!androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.getHighSpeedVideoFpsRangesFor, 0)) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("Zoom is not supported"));
        }
        androidx.camera.core.impl.SessionProcessor sessionProcessor = this.getHighSpeedVideoFpsRangesFor;
        if (sessionProcessor != null) {
            android.util.Range<java.lang.Float> extensionZoomRange = sessionProcessor.getExtensionZoomRange();
            if (extensionZoomRange == null) {
                return this.Camera2StreamConfigurationMap.setLinearZoom(f);
            }
            if (f > 1.0f || f < 0.0f) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested linearZoom ");
                sb.append(f);
                sb.append(" is not within valid range [0..1]");
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalArgumentException(sb.toString()));
            }
            return this.Camera2StreamConfigurationMap.setZoomRatio(androidx.camera.core.impl.AdapterCameraInfo.getZoomRatioByPercentage(f, extensionZoomRange.getLower().floatValue(), extensionZoomRange.getUpper().floatValue()));
        }
        return this.Camera2StreamConfigurationMap.setLinearZoom(f);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> setExposureCompensationIndex(int i) {
        if (!androidx.camera.core.impl.utils.SessionProcessorUtil.isOperationSupported(this.getHighSpeedVideoFpsRangesFor, 7)) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("ExposureCompensation is not supported"));
        }
        return this.Camera2StreamConfigurationMap.setExposureCompensationIndex(i);
    }
}

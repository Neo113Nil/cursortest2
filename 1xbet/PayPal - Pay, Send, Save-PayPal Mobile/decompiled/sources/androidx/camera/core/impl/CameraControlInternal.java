package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface CameraControlInternal extends androidx.camera.core.CameraControl {
    public static final androidx.camera.core.impl.CameraControlInternal DEFAULT_EMPTY_INSTANCE = new androidx.camera.core.impl.CameraControlInternal() { // from class: androidx.camera.core.impl.CameraControlInternal.2
        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addInteropConfig(androidx.camera.core.impl.Config config) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder builder) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void clearInteropConfig() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void clearZslConfig() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public int getFlashMode() {
            return 2;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public androidx.camera.core.impl.Config getInteropConfig() {
            return null;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public boolean isZslDisabledByByUserCaseConfig() {
            return false;
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setFlashMode(int i) {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public void setZslDisabledByUserCaseConfig(boolean z) {
        }

        @Override // androidx.camera.core.CameraControl
        public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean z) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> setExposureCompensationIndex(int i) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(0);
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> submitStillCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i, int i2) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(java.util.Collections.emptyList());
        }

        @Override // androidx.camera.core.impl.CameraControlInternal
        public androidx.camera.core.impl.SessionConfig getSessionConfig() {
            return androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig();
        }

        @Override // androidx.camera.core.CameraControl
        public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(androidx.camera.core.FocusMeteringResult.emptyInstance());
        }

        @Override // androidx.camera.core.CameraControl
        public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelFocusAndMetering() {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float f) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }

        @Override // androidx.camera.core.CameraControl
        public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(float f) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
        }
    };

    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(androidx.camera.core.impl.Config config);

    void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder builder);

    void clearInteropConfig();

    void clearZslConfig();

    default void decrementVideoUsage() {
    }

    int getFlashMode();

    default androidx.camera.core.impl.CameraControlInternal getImplementation() {
        return this;
    }

    androidx.camera.core.impl.Config getInteropConfig();

    androidx.camera.core.impl.SessionConfig getSessionConfig();

    default void incrementVideoUsage() {
    }

    default boolean isInVideoUsage() {
        return false;
    }

    boolean isZslDisabledByByUserCaseConfig();

    void setFlashMode(int i);

    default void setScreenFlash(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
    }

    void setZslDisabledByUserCaseConfig(boolean z);

    com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> submitStillCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i, int i2);

    default com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.imagecapture.CameraCapturePipeline> getCameraCapturePipelineAsync(int i, int i2) {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(new androidx.camera.core.imagecapture.CameraCapturePipeline() { // from class: androidx.camera.core.impl.CameraControlInternal.1
            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> invokePreCapture() {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
            }

            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> invokePostCapture() {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
            }
        });
    }

    public static final class CameraControlException extends java.lang.Exception {
        private androidx.camera.core.impl.CameraCaptureFailure getHighSpeedVideoFpsRanges;

        public CameraControlException(androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
            this.getHighSpeedVideoFpsRanges = cameraCaptureFailure;
        }

        public CameraControlException(androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure, java.lang.Throwable th) {
            super(th);
            this.getHighSpeedVideoFpsRanges = cameraCaptureFailure;
        }

        public final androidx.camera.core.impl.CameraCaptureFailure getCameraCaptureFailure() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }
}

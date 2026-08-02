package androidx.camera.core;

/* loaded from: classes.dex */
public interface CameraControl {
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelFocusAndMetering();

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean z);

    com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> setExposureCompensationIndex(int i);

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(float f);

    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float f);

    com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(androidx.camera.core.FocusMeteringAction focusMeteringAction);

    default com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableLowLightBoostAsync(boolean z) {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.CameraControl.OperationCanceledException("Not supported!"));
    }

    default com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setTorchStrengthLevel(int i) {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.UnsupportedOperationException("Setting torch strength is not supported on the device."));
    }

    /* loaded from: classes6.dex */
    public static final class OperationCanceledException extends java.lang.Exception {
        public OperationCanceledException(java.lang.String str) {
            super(str);
        }

        public OperationCanceledException(java.lang.String str, java.lang.Throwable th) {
            super(str, th);
        }
    }
}

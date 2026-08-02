package androidx.camera.core.internal.utils;

/* loaded from: classes6.dex */
public final class ZslRingBuffer extends androidx.camera.core.internal.utils.ArrayRingBuffer<androidx.camera.core.ImageProxy> {
    public ZslRingBuffer(int i, androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback<androidx.camera.core.ImageProxy> onRemoveCallback) {
        super(i, onRemoveCallback);
    }

    @Override // androidx.camera.core.internal.utils.ArrayRingBuffer, androidx.camera.core.internal.utils.RingBuffer
    public final void enqueue(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.impl.CameraCaptureResult retrieveCameraCaptureResult = androidx.camera.core.impl.CameraCaptureResults.retrieveCameraCaptureResult(imageProxy.getImageInfo());
        if (retrieveCameraCaptureResult != null && ((retrieveCameraCaptureResult.getAfState() == androidx.camera.core.impl.CameraCaptureMetaData.AfState.LOCKED_FOCUSED || retrieveCameraCaptureResult.getAfState() == androidx.camera.core.impl.CameraCaptureMetaData.AfState.PASSIVE_FOCUSED) && retrieveCameraCaptureResult.getAeState() == androidx.camera.core.impl.CameraCaptureMetaData.AeState.CONVERGED && retrieveCameraCaptureResult.getAwbState() == androidx.camera.core.impl.CameraCaptureMetaData.AwbState.CONVERGED)) {
            super.enqueue((androidx.camera.core.internal.utils.ZslRingBuffer) imageProxy);
        } else {
            this.getHighSpeedVideoFpsRangesFor.onRemove(imageProxy);
        }
    }
}

package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public final class CameraRequest {
    final java.util.List<androidx.camera.core.impl.CaptureConfig> getHighResolutionOutputSizeshNQ4ISI;
    final androidx.camera.core.imagecapture.TakePictureCallback getHighSpeedVideoFpsRanges;

    public CameraRequest(java.util.List<androidx.camera.core.impl.CaptureConfig> list, androidx.camera.core.imagecapture.TakePictureCallback takePictureCallback) {
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRanges = takePictureCallback;
    }
}

package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public abstract class TakePictureRequest {
    int getHighSpeedVideoSizes = new androidx.camera.core.internal.compat.workaround.CaptureFailedRetryEnabler().getRetryCount();
    private final java.util.Map<java.lang.Integer, java.lang.Boolean> Camera2StreamConfigurationMap = new java.util.HashMap();

    interface RetryControl {
        void retryRequest(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest);
    }

    abstract int Camera2StreamConfigurationMap();

    public abstract android.graphics.Rect getCropRect();

    abstract java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getHighResolutionOutputSizeshNQ4ISI();

    abstract android.graphics.Matrix getHighSpeedVideoFpsRanges();

    abstract java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor();

    abstract boolean getHighSpeedVideoSizes();

    public abstract androidx.camera.core.ImageCapture.OnImageCapturedCallback getInMemoryCallback();

    public abstract int getJpegQuality();

    public abstract androidx.camera.core.ImageCapture.OnImageSavedCallback getOnDiskCallback();

    public abstract androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions();

    public abstract int getRotationDegrees();

    public abstract androidx.camera.core.ImageCapture.OutputFileOptions getSecondaryOutputFileOptions();

    final void getHighSpeedVideoFpsRanges(int i) {
        if (!this.Camera2StreamConfigurationMap.containsKey(java.lang.Integer.valueOf(i))) {
            androidx.camera.core.Logger.e("TakePictureRequest", "The format is not supported in simultaneous capture");
        } else {
            this.Camera2StreamConfigurationMap.put(java.lang.Integer.valueOf(i), java.lang.Boolean.TRUE);
        }
    }

    final boolean getOutputMinFrameDuration() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.lang.Boolean>> it = this.Camera2StreamConfigurationMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static androidx.camera.core.imagecapture.TakePictureRequest of(java.util.concurrent.Executor executor, androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback, androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions2, android.graphics.Rect rect, android.graphics.Matrix matrix, int i, int i2, int i3, boolean z, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list) {
        androidx.core.util.Preconditions.checkArgument((onImageSavedCallback == null) == (outputFileOptions == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        androidx.core.util.Preconditions.checkArgument((onImageCapturedCallback == null) ^ (onImageSavedCallback == null), "One and only one on-disk or in-memory callback should be present.");
        androidx.camera.core.imagecapture.AutoValue_TakePictureRequest autoValue_TakePictureRequest = new androidx.camera.core.imagecapture.AutoValue_TakePictureRequest(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, outputFileOptions2, rect, matrix, i, i2, i3, z, list);
        if (z) {
            java.util.Map<java.lang.Integer, java.lang.Boolean> map = ((androidx.camera.core.imagecapture.TakePictureRequest) autoValue_TakePictureRequest).Camera2StreamConfigurationMap;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            map.put(32, bool);
            ((androidx.camera.core.imagecapture.TakePictureRequest) autoValue_TakePictureRequest).Camera2StreamConfigurationMap.put(256, bool);
        }
        return autoValue_TakePictureRequest;
    }
}

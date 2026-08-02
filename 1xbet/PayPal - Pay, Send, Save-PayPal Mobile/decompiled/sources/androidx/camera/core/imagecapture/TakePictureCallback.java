package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public interface TakePictureCallback {
    boolean isAborted();

    void onCaptureFailure(androidx.camera.core.ImageCaptureException imageCaptureException);

    void onCaptureProcessProgressed(int i);

    void onCaptureStarted();

    void onFinalResult(androidx.camera.core.ImageCapture.OutputFileResults outputFileResults);

    void onFinalResult(androidx.camera.core.ImageProxy imageProxy);

    void onImageCaptured();

    void onPostviewBitmapAvailable(android.graphics.Bitmap bitmap);

    void onProcessFailure(androidx.camera.core.ImageCaptureException imageCaptureException);
}

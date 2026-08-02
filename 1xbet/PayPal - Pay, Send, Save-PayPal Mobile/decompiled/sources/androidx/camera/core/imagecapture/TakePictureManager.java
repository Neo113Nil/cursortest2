package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public interface TakePictureManager {

    public interface Provider {
        androidx.camera.core.imagecapture.TakePictureManager newInstance(androidx.camera.core.imagecapture.ImageCaptureControl imageCaptureControl);
    }

    void abortRequests();

    androidx.camera.core.imagecapture.RequestWithCallback getCapturingRequest();

    androidx.camera.core.imagecapture.ImagePipeline getImagePipeline();

    java.util.List<androidx.camera.core.imagecapture.RequestWithCallback> getIncompleteRequests();

    boolean hasCapturingRequest();

    void offerRequest(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest);

    void pause();

    void resume();

    void setImagePipeline(androidx.camera.core.imagecapture.ImagePipeline imagePipeline);

    public static abstract class CaptureError {
        abstract androidx.camera.core.ImageCaptureException getHighResolutionOutputSizeshNQ4ISI();

        abstract int getHighSpeedVideoFpsRanges();

        static androidx.camera.core.imagecapture.TakePictureManager.CaptureError getHighSpeedVideoFpsRanges(int i, androidx.camera.core.ImageCaptureException imageCaptureException) {
            return new androidx.camera.core.imagecapture.AutoValue_TakePictureManager_CaptureError(i, imageCaptureException);
        }
    }
}

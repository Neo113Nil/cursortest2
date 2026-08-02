package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public final /* synthetic */ class TakePictureRequest$$ExternalSyntheticLambda4 implements java.lang.Runnable {
    public final /* synthetic */ androidx.camera.core.imagecapture.TakePictureRequest f$0;
    public final /* synthetic */ androidx.camera.core.ImageCaptureException f$1;

    public /* synthetic */ TakePictureRequest$$ExternalSyntheticLambda4(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest, androidx.camera.core.ImageCaptureException imageCaptureException) {
        this.f$0 = takePictureRequest;
        this.f$1 = imageCaptureException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest = this.f$0;
        androidx.camera.core.ImageCaptureException imageCaptureException = this.f$1;
        boolean z = takePictureRequest.getInMemoryCallback() != null;
        boolean z2 = takePictureRequest.getOnDiskCallback() != null;
        if (z && !z2) {
            ((androidx.camera.core.ImageCapture.OnImageCapturedCallback) java.util.Objects.requireNonNull(takePictureRequest.getInMemoryCallback())).onError(imageCaptureException);
        } else {
            if (!z2 || z) {
                throw new java.lang.IllegalStateException("One and only one callback is allowed.");
            }
            ((androidx.camera.core.ImageCapture.OnImageSavedCallback) java.util.Objects.requireNonNull(takePictureRequest.getOnDiskCallback())).onError(imageCaptureException);
        }
    }
}

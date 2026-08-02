package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class AutoValue_TakePictureManager_CaptureError extends androidx.camera.core.imagecapture.TakePictureManager.CaptureError {
    private final androidx.camera.core.ImageCaptureException Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;

    AutoValue_TakePictureManager_CaptureError(int i, androidx.camera.core.ImageCaptureException imageCaptureException) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (imageCaptureException == null) {
            throw new java.lang.NullPointerException("Null imageCaptureException");
        }
        this.Camera2StreamConfigurationMap = imageCaptureException;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    final int getHighSpeedVideoFpsRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    final androidx.camera.core.ImageCaptureException getHighResolutionOutputSizeshNQ4ISI() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CaptureError{requestId=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", imageCaptureException=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.TakePictureManager.CaptureError)) {
            return false;
        }
        androidx.camera.core.imagecapture.TakePictureManager.CaptureError captureError = (androidx.camera.core.imagecapture.TakePictureManager.CaptureError) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == captureError.getHighSpeedVideoFpsRanges() && this.Camera2StreamConfigurationMap.equals(captureError.getHighResolutionOutputSizeshNQ4ISI());
    }

    public final int hashCode() {
        return ((this.getHighResolutionOutputSizeshNQ4ISI ^ 1000003) * 1000003) ^ this.Camera2StreamConfigurationMap.hashCode();
    }
}

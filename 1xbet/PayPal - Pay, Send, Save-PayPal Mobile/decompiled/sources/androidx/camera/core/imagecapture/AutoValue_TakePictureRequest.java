package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class AutoValue_TakePictureRequest extends androidx.camera.core.imagecapture.TakePictureRequest {
    private final androidx.camera.core.ImageCapture.OnImageCapturedCallback Camera2StreamConfigurationMap;
    private final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.core.ImageCapture.OnImageSavedCallback getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private final androidx.camera.core.ImageCapture.OutputFileOptions getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private final androidx.camera.core.ImageCapture.OutputFileOptions getOutputMinFrameDuration;
    private final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getOutputMinFrameDurationlomOqCM;
    private final android.graphics.Matrix getOutputStallDuration;
    private final boolean getOutputStallDurationlomOqCM;

    AutoValue_TakePictureRequest(java.util.concurrent.Executor executor, androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback, androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions2, android.graphics.Rect rect, android.graphics.Matrix matrix, int i, int i2, int i3, boolean z, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list) {
        if (executor == null) {
            throw new java.lang.NullPointerException("Null appExecutor");
        }
        this.getHighSpeedVideoFpsRanges = executor;
        this.Camera2StreamConfigurationMap = onImageCapturedCallback;
        this.getHighSpeedVideoSizesFor = onImageSavedCallback;
        this.getInputSizeshNQ4ISI = outputFileOptions;
        this.getOutputMinFrameDuration = outputFileOptions2;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null cropRect");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = rect;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null sensorToBufferTransform");
        }
        this.getOutputStallDuration = matrix;
        this.getInputFormats = i;
        this.getOutputFormats = i2;
        this.getHighSpeedVideoFpsRangesFor = i3;
        this.getOutputStallDurationlomOqCM = z;
        if (list == null) {
            throw new java.lang.NullPointerException("Null sessionConfigCameraCaptureCallbacks");
        }
        this.getOutputMinFrameDurationlomOqCM = list;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public final androidx.camera.core.ImageCapture.OnImageCapturedCallback getInMemoryCallback() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public final androidx.camera.core.ImageCapture.OnImageSavedCallback getOnDiskCallback() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public final androidx.camera.core.ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public final androidx.camera.core.ImageCapture.OutputFileOptions getSecondaryOutputFileOptions() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public final android.graphics.Rect getCropRect() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final android.graphics.Matrix getHighSpeedVideoFpsRanges() {
        return this.getOutputStallDuration;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public final int getRotationDegrees() {
        return this.getInputFormats;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    public final int getJpegQuality() {
        return this.getOutputFormats;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final int Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final boolean getHighSpeedVideoSizes() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest
    final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getHighResolutionOutputSizeshNQ4ISI() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", inMemoryCallback=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", onDiskCallback=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", outputFileOptions=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", secondaryOutputFileOptions=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(", cropRect=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.getOutputStallDuration);
        sb.append(", rotationDegrees=");
        sb.append(this.getInputFormats);
        sb.append(", jpegQuality=");
        sb.append(this.getOutputFormats);
        sb.append(", captureMode=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", simultaneousCapture=");
        sb.append(this.getOutputStallDurationlomOqCM);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.TakePictureRequest)) {
            return false;
        }
        androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest = (androidx.camera.core.imagecapture.TakePictureRequest) obj;
        if (!this.getHighSpeedVideoFpsRanges.equals(takePictureRequest.getHighSpeedVideoFpsRangesFor())) {
            return false;
        }
        androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback = this.Camera2StreamConfigurationMap;
        if (onImageCapturedCallback == null) {
            if (takePictureRequest.getInMemoryCallback() != null) {
                return false;
            }
        } else if (!onImageCapturedCallback.equals(takePictureRequest.getInMemoryCallback())) {
            return false;
        }
        androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback = this.getHighSpeedVideoSizesFor;
        if (onImageSavedCallback == null) {
            if (takePictureRequest.getOnDiskCallback() != null) {
                return false;
            }
        } else if (!onImageSavedCallback.equals(takePictureRequest.getOnDiskCallback())) {
            return false;
        }
        androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions = this.getInputSizeshNQ4ISI;
        if (outputFileOptions == null) {
            if (takePictureRequest.getOutputFileOptions() != null) {
                return false;
            }
        } else if (!outputFileOptions.equals(takePictureRequest.getOutputFileOptions())) {
            return false;
        }
        androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions2 = this.getOutputMinFrameDuration;
        if (outputFileOptions2 == null) {
            if (takePictureRequest.getSecondaryOutputFileOptions() != null) {
                return false;
            }
        } else if (!outputFileOptions2.equals(takePictureRequest.getSecondaryOutputFileOptions())) {
            return false;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(takePictureRequest.getCropRect()) && this.getOutputStallDuration.equals(takePictureRequest.getHighSpeedVideoFpsRanges()) && this.getInputFormats == takePictureRequest.getRotationDegrees() && this.getOutputFormats == takePictureRequest.getJpegQuality() && this.getHighSpeedVideoFpsRangesFor == takePictureRequest.Camera2StreamConfigurationMap() && this.getOutputStallDurationlomOqCM == takePictureRequest.getHighSpeedVideoSizes() && this.getOutputMinFrameDurationlomOqCM.equals(takePictureRequest.getHighResolutionOutputSizeshNQ4ISI());
    }

    public final int hashCode() {
        int hashCode = this.getHighSpeedVideoFpsRanges.hashCode();
        androidx.camera.core.ImageCapture.OnImageCapturedCallback onImageCapturedCallback = this.Camera2StreamConfigurationMap;
        int hashCode2 = onImageCapturedCallback == null ? 0 : onImageCapturedCallback.hashCode();
        androidx.camera.core.ImageCapture.OnImageSavedCallback onImageSavedCallback = this.getHighSpeedVideoSizesFor;
        int hashCode3 = onImageSavedCallback == null ? 0 : onImageSavedCallback.hashCode();
        androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions = this.getInputSizeshNQ4ISI;
        int hashCode4 = outputFileOptions == null ? 0 : outputFileOptions.hashCode();
        androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions2 = this.getOutputMinFrameDuration;
        int hashCode5 = outputFileOptions2 != null ? outputFileOptions2.hashCode() : 0;
        int hashCode6 = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        int hashCode7 = this.getOutputStallDuration.hashCode();
        int i = this.getInputFormats;
        int i2 = this.getOutputFormats;
        return ((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor) * 1000003) ^ (this.getOutputStallDurationlomOqCM ? 1231 : 1237)) * 1000003) ^ this.getOutputMinFrameDurationlomOqCM.hashCode();
    }
}

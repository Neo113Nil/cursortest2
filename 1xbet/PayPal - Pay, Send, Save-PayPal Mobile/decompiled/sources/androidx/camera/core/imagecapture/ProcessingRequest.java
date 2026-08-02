package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class ProcessingRequest {
    final int Camera2StreamConfigurationMap;
    final android.graphics.Rect getHighResolutionOutputSizeshNQ4ISI;
    final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighSpeedVideoFpsRanges;
    final androidx.camera.core.imagecapture.TakePictureCallback getHighSpeedVideoSizes;
    final android.graphics.Matrix getHighSpeedVideoSizesFor;
    final int getInputFormats;
    final int getInputSizeshNQ4ISI;
    final androidx.camera.core.ImageCapture.OutputFileOptions getOutputFormats;
    final androidx.camera.core.ImageCapture.OutputFileOptions getOutputMinFrameDuration;
    final java.lang.String getOutputStallDuration;
    androidx.camera.core.imagecapture.TakePictureRequest getOutputStallDurationlomOqCM;
    int getHighSpeedVideoFpsRangesFor = -1;
    final java.util.List<java.lang.Integer> getOutputSizes = new java.util.ArrayList();

    ProcessingRequest(androidx.camera.core.impl.CaptureBundle captureBundle, androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest, androidx.camera.core.imagecapture.TakePictureCallback takePictureCallback, com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture, int i) {
        this.getInputSizeshNQ4ISI = i;
        this.getOutputStallDurationlomOqCM = takePictureRequest;
        this.getOutputFormats = takePictureRequest.getOutputFileOptions();
        this.getOutputMinFrameDuration = takePictureRequest.getSecondaryOutputFileOptions();
        this.Camera2StreamConfigurationMap = takePictureRequest.getJpegQuality();
        this.getInputFormats = takePictureRequest.getRotationDegrees();
        this.getHighResolutionOutputSizeshNQ4ISI = takePictureRequest.getCropRect();
        this.getHighSpeedVideoSizesFor = takePictureRequest.getHighSpeedVideoFpsRanges();
        this.getHighSpeedVideoSizes = takePictureCallback;
        this.getOutputStallDuration = java.lang.String.valueOf(captureBundle.hashCode());
        java.util.Iterator it = ((java.util.List) java.util.Objects.requireNonNull(captureBundle.getCaptureStages())).iterator();
        while (it.hasNext()) {
            this.getOutputSizes.add(java.lang.Integer.valueOf(((androidx.camera.core.impl.CaptureStage) it.next()).getId()));
        }
        this.getHighSpeedVideoFpsRanges = listenableFuture;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessingRequest: mRequestId = ");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", mTagBundleKey = ");
        sb.append(this.getOutputStallDuration);
        androidx.camera.core.Logger.d("ProcessingRequest", sb.toString());
    }

    public int getRequestId() {
        return this.getInputSizeshNQ4ISI;
    }
}

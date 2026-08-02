package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class DngImage2Disk implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.DngImage2Disk.In, androidx.camera.core.ImageCapture.OutputFileResults> {
    private android.hardware.camera2.DngCreator Camera2StreamConfigurationMap;

    public DngImage2Disk(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, android.hardware.camera2.CaptureResult captureResult) {
        this(new android.hardware.camera2.DngCreator(cameraCharacteristics, captureResult));
    }

    private DngImage2Disk(android.hardware.camera2.DngCreator dngCreator) {
        this.Camera2StreamConfigurationMap = dngCreator;
    }

    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.ImageCapture.OutputFileResults apply(androidx.camera.core.imagecapture.DngImage2Disk.In in) throws androidx.camera.core.ImageCaptureException {
        androidx.camera.core.ImageCapture.OutputFileOptions highResolutionOutputSizeshNQ4ISI = in.getHighResolutionOutputSizeshNQ4ISI();
        java.io.File highSpeedVideoFpsRangesFor = androidx.camera.core.imagecapture.FileUtil.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
        androidx.camera.core.ImageProxy highSpeedVideoSizes = in.getHighSpeedVideoSizes();
        int highSpeedVideoFpsRangesFor2 = in.getHighSpeedVideoFpsRangesFor();
        try {
            try {
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(highSpeedVideoFpsRangesFor);
                    try {
                        this.Camera2StreamConfigurationMap.setOrientation(highSpeedVideoFpsRangesFor2 != 0 ? highSpeedVideoFpsRangesFor2 != 90 ? highSpeedVideoFpsRangesFor2 != 180 ? highSpeedVideoFpsRangesFor2 != 270 ? 0 : 8 : 3 : 6 : 1);
                        this.Camera2StreamConfigurationMap.writeImage(fileOutputStream, highSpeedVideoSizes.getImage());
                        fileOutputStream.close();
                        highSpeedVideoSizes.close();
                        return new androidx.camera.core.ImageCapture.OutputFileResults(androidx.camera.core.imagecapture.FileUtil.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI), 32);
                    } catch (java.lang.Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.lang.IllegalArgumentException e) {
                    throw new androidx.camera.core.ImageCaptureException(1, "Image with an unsupported format was used", e);
                }
            } catch (java.io.IOException e2) {
                throw new androidx.camera.core.ImageCaptureException(1, "Failed to write to temp file", e2);
            } catch (java.lang.IllegalStateException e3) {
                throw new androidx.camera.core.ImageCaptureException(1, "Not enough metadata information has been set to write a well-formatted DNG file", e3);
            }
        } catch (java.lang.Throwable th3) {
            highSpeedVideoSizes.close();
            throw th3;
        }
    }

    static abstract class In {
        abstract androidx.camera.core.ImageCapture.OutputFileOptions getHighResolutionOutputSizeshNQ4ISI();

        abstract int getHighSpeedVideoFpsRangesFor();

        abstract androidx.camera.core.ImageProxy getHighSpeedVideoSizes();

        In() {
        }

        static androidx.camera.core.imagecapture.DngImage2Disk.In getHighSpeedVideoSizes(androidx.camera.core.ImageProxy imageProxy, int i, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
            return new androidx.camera.core.imagecapture.AutoValue_DngImage2Disk_In(imageProxy, i, outputFileOptions);
        }
    }
}

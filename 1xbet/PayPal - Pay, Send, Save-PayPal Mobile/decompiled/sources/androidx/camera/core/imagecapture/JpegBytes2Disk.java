package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class JpegBytes2Disk implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.JpegBytes2Disk.In, androidx.camera.core.ImageCapture.OutputFileResults> {
    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.ImageCapture.OutputFileResults apply(androidx.camera.core.imagecapture.JpegBytes2Disk.In in) throws androidx.camera.core.ImageCaptureException {
        androidx.camera.core.processing.Packet<byte[]> highSpeedVideoFpsRanges = in.getHighSpeedVideoFpsRanges();
        androidx.camera.core.ImageCapture.OutputFileOptions highResolutionOutputSizeshNQ4ISI = in.getHighResolutionOutputSizeshNQ4ISI();
        java.io.File highSpeedVideoFpsRangesFor = androidx.camera.core.imagecapture.FileUtil.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
        byte[] data = highSpeedVideoFpsRanges.getData();
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(highSpeedVideoFpsRangesFor);
            try {
                fileOutputStream.write(data, 0, new androidx.camera.core.internal.compat.workaround.InvalidJpegDataParser().getValidDataLength(data));
                fileOutputStream.close();
                androidx.camera.core.imagecapture.FileUtil.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor, (androidx.camera.core.impl.utils.Exif) java.util.Objects.requireNonNull(highSpeedVideoFpsRanges.getExif()), highResolutionOutputSizeshNQ4ISI, highSpeedVideoFpsRanges.getRotationDegrees());
                return new androidx.camera.core.ImageCapture.OutputFileResults(androidx.camera.core.imagecapture.FileUtil.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI), 256);
            } finally {
            }
        } catch (java.io.IOException e) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to write to temp file", e);
        }
    }

    public static abstract class In {
        abstract androidx.camera.core.ImageCapture.OutputFileOptions getHighResolutionOutputSizeshNQ4ISI();

        abstract androidx.camera.core.processing.Packet<byte[]> getHighSpeedVideoFpsRanges();

        public static androidx.camera.core.imagecapture.JpegBytes2Disk.In of(androidx.camera.core.processing.Packet<byte[]> packet, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) {
            return new androidx.camera.core.imagecapture.AutoValue_JpegBytes2Disk_In(packet, outputFileOptions);
        }
    }
}

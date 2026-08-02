package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class Bitmap2JpegBytes implements androidx.camera.core.processing.Operation<androidx.camera.core.imagecapture.Bitmap2JpegBytes.In, androidx.camera.core.processing.Packet<byte[]>> {
    @Override // androidx.camera.core.processing.Operation
    public androidx.camera.core.processing.Packet<byte[]> apply(androidx.camera.core.imagecapture.Bitmap2JpegBytes.In in) throws androidx.camera.core.ImageCaptureException {
        androidx.camera.core.processing.Packet<android.graphics.Bitmap> highSpeedVideoFpsRanges = in.getHighSpeedVideoFpsRanges();
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        highSpeedVideoFpsRanges.getData().compress(android.graphics.Bitmap.CompressFormat.JPEG, in.getHighSpeedVideoSizes(), byteArrayOutputStream);
        return androidx.camera.core.processing.Packet.of(byteArrayOutputStream.toByteArray(), (androidx.camera.core.impl.utils.Exif) java.util.Objects.requireNonNull(highSpeedVideoFpsRanges.getExif()), (android.os.Build.VERSION.SDK_INT < 34 || !androidx.camera.core.imagecapture.Bitmap2JpegBytes.Api34Impl.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges.getData())) ? 256 : 4101, highSpeedVideoFpsRanges.getSize(), highSpeedVideoFpsRanges.getCropRect(), highSpeedVideoFpsRanges.getRotationDegrees(), highSpeedVideoFpsRanges.getSensorToBufferTransform(), highSpeedVideoFpsRanges.getCameraCaptureResult());
    }

    static class Api34Impl {
        static boolean Camera2StreamConfigurationMap(android.graphics.Bitmap bitmap) {
            return bitmap.hasGainmap();
        }

        private Api34Impl() {
        }
    }

    public static abstract class In {
        abstract androidx.camera.core.processing.Packet<android.graphics.Bitmap> getHighSpeedVideoFpsRanges();

        abstract int getHighSpeedVideoSizes();

        public static androidx.camera.core.imagecapture.Bitmap2JpegBytes.In of(androidx.camera.core.processing.Packet<android.graphics.Bitmap> packet, int i) {
            return new androidx.camera.core.imagecapture.AutoValue_Bitmap2JpegBytes_In(packet, i);
        }
    }
}

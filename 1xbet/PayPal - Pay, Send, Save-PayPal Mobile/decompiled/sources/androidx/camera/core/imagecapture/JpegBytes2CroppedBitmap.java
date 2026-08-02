package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
final class JpegBytes2CroppedBitmap implements androidx.camera.core.processing.Operation<androidx.camera.core.processing.Packet<byte[]>, androidx.camera.core.processing.Packet<android.graphics.Bitmap>> {
    JpegBytes2CroppedBitmap() {
    }

    @Override // androidx.camera.core.processing.Operation
    public final /* synthetic */ androidx.camera.core.processing.Packet<android.graphics.Bitmap> apply(androidx.camera.core.processing.Packet<byte[]> packet) throws androidx.camera.core.ImageCaptureException {
        androidx.camera.core.processing.Packet<byte[]> packet2 = packet;
        android.graphics.Rect cropRect = packet2.getCropRect();
        android.graphics.Bitmap Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(packet2.getData(), cropRect);
        return androidx.camera.core.processing.Packet.of(Camera2StreamConfigurationMap, (androidx.camera.core.impl.utils.Exif) java.util.Objects.requireNonNull(packet2.getExif()), new android.graphics.Rect(0, 0, Camera2StreamConfigurationMap.getWidth(), Camera2StreamConfigurationMap.getHeight()), packet2.getRotationDegrees(), androidx.camera.core.impl.utils.TransformUtils.updateSensorToBufferTransform(packet2.getSensorToBufferTransform(), cropRect), packet2.getCameraCaptureResult());
    }

    private static android.graphics.Bitmap Camera2StreamConfigurationMap(byte[] bArr, android.graphics.Rect rect) throws androidx.camera.core.ImageCaptureException {
        try {
            return android.graphics.BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new android.graphics.BitmapFactory.Options());
        } catch (java.io.IOException e) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to decode JPEG.", e);
        }
    }
}

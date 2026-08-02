package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public abstract class Packet<T> {
    public abstract androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult();

    public abstract android.graphics.Rect getCropRect();

    public abstract T getData();

    public abstract androidx.camera.core.impl.utils.Exif getExif();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    public abstract android.graphics.Matrix getSensorToBufferTransform();

    public abstract android.util.Size getSize();

    public boolean hasCropping() {
        return androidx.camera.core.impl.utils.TransformUtils.hasCropping(getCropRect(), getSize());
    }

    public static androidx.camera.core.processing.Packet<android.graphics.Bitmap> of(android.graphics.Bitmap bitmap, androidx.camera.core.impl.utils.Exif exif, android.graphics.Rect rect, int i, android.graphics.Matrix matrix, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        return new androidx.camera.core.processing.AutoValue_Packet(bitmap, exif, 42, new android.util.Size(bitmap.getWidth(), bitmap.getHeight()), rect, i, matrix, cameraCaptureResult);
    }

    public static androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> of(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.impl.utils.Exif exif, android.graphics.Rect rect, int i, android.graphics.Matrix matrix, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        return of(imageProxy, exif, new android.util.Size(imageProxy.getWidth(), imageProxy.getHeight()), rect, i, matrix, cameraCaptureResult);
    }

    public static androidx.camera.core.processing.Packet<androidx.camera.core.ImageProxy> of(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.impl.utils.Exif exif, android.util.Size size, android.graphics.Rect rect, int i, android.graphics.Matrix matrix, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        if (androidx.camera.core.internal.utils.ImageUtil.isJpegFormats(imageProxy.getFormat())) {
            androidx.core.util.Preconditions.checkNotNull(exif, "JPEG image must have Exif.");
        }
        return new androidx.camera.core.processing.AutoValue_Packet(imageProxy, exif, imageProxy.getFormat(), size, rect, i, matrix, cameraCaptureResult);
    }

    public static androidx.camera.core.processing.Packet<byte[]> of(byte[] bArr, androidx.camera.core.impl.utils.Exif exif, int i, android.util.Size size, android.graphics.Rect rect, int i2, android.graphics.Matrix matrix, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        return new androidx.camera.core.processing.AutoValue_Packet(bArr, exif, i, size, rect, i2, matrix, cameraCaptureResult);
    }
}

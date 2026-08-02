package coil3.graphics;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcoil3/decode/ExifUtils;", "", "<init>", "()V", "", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Lokio/BufferedSource;", "source", "Lcoil3/decode/ExifOrientationStrategy;", "strategy", "Lcoil3/decode/ExifData;", "getExifData", "(Ljava/lang/String;Lokio/BufferedSource;Lcoil3/decode/ExifOrientationStrategy;)Lcoil3/decode/ExifData;", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "reverseTransformations", "(Landroid/graphics/Bitmap;Lcoil3/decode/ExifData;)Landroid/graphics/Bitmap;", "Landroid/graphics/Paint;", "Camera2StreamConfigurationMap", "Landroid/graphics/Paint;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExifUtils {
    public static final coil3.graphics.ExifUtils INSTANCE = new coil3.graphics.ExifUtils();
    private static final android.graphics.Paint Camera2StreamConfigurationMap = new android.graphics.Paint(3);

    private ExifUtils() {
    }

    public final coil3.graphics.ExifData getExifData(java.lang.String mimeType, okio.BufferedSource source, coil3.graphics.ExifOrientationStrategy strategy) {
        if (strategy.supports(mimeType, source)) {
            androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(new coil3.graphics.ExifInterfaceInputStream(source.peek().inputStream()));
            return new coil3.graphics.ExifData(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
        }
        return coil3.graphics.ExifData.NONE;
    }

    public final android.graphics.Bitmap reverseTransformations(android.graphics.Bitmap inBitmap, coil3.graphics.ExifData exifData) {
        android.graphics.Bitmap createBitmap;
        if (!exifData.getIsFlipped() && !coil3.graphics.ExifUtilsKt.isRotated(exifData)) {
            return inBitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float width = inBitmap.getWidth() / 2.0f;
        float height = inBitmap.getHeight() / 2.0f;
        if (exifData.getIsFlipped()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (coil3.graphics.ExifUtilsKt.isRotated(exifData)) {
            matrix.postRotate(exifData.getRotationDegrees(), width, height);
        }
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, inBitmap.getWidth(), inBitmap.getHeight());
        matrix.mapRect(rectF);
        if (rectF.left != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-rectF.left, -rectF.top);
        }
        if (coil3.graphics.ExifUtilsKt.isSwapped(exifData)) {
            createBitmap = android.graphics.Bitmap.createBitmap(inBitmap.getHeight(), inBitmap.getWidth(), coil3.content.Bitmap.getSafeConfig(inBitmap));
        } else {
            createBitmap = android.graphics.Bitmap.createBitmap(inBitmap.getWidth(), inBitmap.getHeight(), coil3.content.Bitmap.getSafeConfig(inBitmap));
        }
        new android.graphics.Canvas(createBitmap).drawBitmap(inBitmap, matrix, Camera2StreamConfigurationMap);
        inBitmap.recycle();
        return createBitmap;
    }
}

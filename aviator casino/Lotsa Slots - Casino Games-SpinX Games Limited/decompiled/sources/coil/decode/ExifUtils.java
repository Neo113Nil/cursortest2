package coil.decode;

/* compiled from: ExifUtils.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcoil/decode/ExifUtils;", "", "<init>", "()V", "PAINT", "Landroid/graphics/Paint;", "getExifData", "Lcoil/decode/ExifData;", "mimeType", "", "source", "Lokio/BufferedSource;", "policy", "Lcoil/decode/ExifOrientationPolicy;", "reverseTransformations", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExifUtils {
    public static final coil.decode.ExifUtils INSTANCE = new coil.decode.ExifUtils();
    private static final android.graphics.Paint PAINT = new android.graphics.Paint(3);

    private ExifUtils() {
    }

    public final coil.decode.ExifData getExifData(java.lang.String mimeType, okio.BufferedSource source, coil.decode.ExifOrientationPolicy policy) {
        if (coil.decode.ExifUtilsKt.supports(policy, mimeType)) {
            androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(new coil.decode.ExifInterfaceInputStream(source.peek().inputStream()));
            return new coil.decode.ExifData(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
        }
        return coil.decode.ExifData.NONE;
    }

    public final android.graphics.Bitmap reverseTransformations(android.graphics.Bitmap inBitmap, coil.decode.ExifData exifData) {
        android.graphics.Bitmap createBitmap;
        if (!exifData.getIsFlipped() && !coil.decode.ExifUtilsKt.isRotated(exifData)) {
            return inBitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float width = inBitmap.getWidth() / 2.0f;
        float height = inBitmap.getHeight() / 2.0f;
        if (exifData.getIsFlipped()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (coil.decode.ExifUtilsKt.isRotated(exifData)) {
            matrix.postRotate(exifData.getRotationDegrees(), width, height);
        }
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, inBitmap.getWidth(), inBitmap.getHeight());
        matrix.mapRect(rectF);
        if (rectF.left != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-rectF.left, -rectF.top);
        }
        if (coil.decode.ExifUtilsKt.isSwapped(exifData)) {
            createBitmap = android.graphics.Bitmap.createBitmap(inBitmap.getHeight(), inBitmap.getWidth(), coil.util.Bitmaps.getSafeConfig(inBitmap));
        } else {
            createBitmap = android.graphics.Bitmap.createBitmap(inBitmap.getWidth(), inBitmap.getHeight(), coil.util.Bitmaps.getSafeConfig(inBitmap));
        }
        new android.graphics.Canvas(createBitmap).drawBitmap(inBitmap, matrix, PAINT);
        inBitmap.recycle();
        return createBitmap;
    }
}

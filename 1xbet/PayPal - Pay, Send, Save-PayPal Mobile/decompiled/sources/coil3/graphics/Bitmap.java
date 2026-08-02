package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/graphics/Bitmap;", "input", "", "outputWidth", "outputHeight", "Landroid/graphics/Paint;", "newScaledShaderPaint", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Paint;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: coil3.transform.TransformationsKt, reason: from Kotlin metadata */
/* loaded from: classes7.dex */
public final class Bitmap {
    public static final android.graphics.Paint newScaledShaderPaint(android.graphics.Bitmap bitmap, int i, int i2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float computeSizeMultiplier = (float) coil3.graphics.DecodeUtils.computeSizeMultiplier(bitmap.getWidth(), bitmap.getHeight(), i, i2, coil3.view.Scale.FILL, coil3.view.Size.ORIGINAL);
        matrix.setTranslate((i - (bitmap.getWidth() * computeSizeMultiplier)) / 2.0f, (i2 - (bitmap.getHeight() * computeSizeMultiplier)) / 2.0f);
        matrix.preScale(computeSizeMultiplier, computeSizeMultiplier);
        android.graphics.Paint paint = new android.graphics.Paint(3);
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        return paint;
    }
}

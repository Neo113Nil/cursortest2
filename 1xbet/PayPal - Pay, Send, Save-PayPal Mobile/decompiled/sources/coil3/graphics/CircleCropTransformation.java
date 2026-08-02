package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcoil3/transform/CircleCropTransformation;", "Lcoil3/transform/Transformation;", "<init>", "()V", "Landroid/graphics/Bitmap;", "input", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "transform", "(Landroid/graphics/Bitmap;Lcoil3/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cacheKey", "Ljava/lang/String;", "getCacheKey", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CircleCropTransformation extends coil3.graphics.Transformation {
    private final java.lang.String cacheKey = java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getQualifiedName());

    @Override // coil3.graphics.Transformation
    public final java.lang.String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil3.graphics.Transformation
    public final java.lang.Object transform(android.graphics.Bitmap bitmap, coil3.view.Size size, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        int min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(min, min, coil3.content.Bitmap.getSafeConfig(bitmap));
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint newScaledShaderPaint = coil3.graphics.Bitmap.newScaledShaderPaint(bitmap, min, min);
        float f = min / 2.0f;
        canvas.drawCircle(f, f, f, newScaledShaderPaint);
        return createBitmap;
    }
}

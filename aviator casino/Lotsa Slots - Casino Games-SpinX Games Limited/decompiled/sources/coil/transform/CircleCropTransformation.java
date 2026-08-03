package coil.transform;

/* compiled from: CircleCropTransformation.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcoil/transform/CircleCropTransformation;", "Lcoil/transform/Transformation;", "<init>", "()V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "transform", "Landroid/graphics/Bitmap;", "input", "size", "Lcoil/size/Size;", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CircleCropTransformation implements coil.transform.Transformation {
    private final java.lang.String cacheKey = getClass().getName();

    @Override // coil.transform.Transformation
    public java.lang.String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil.transform.Transformation
    public java.lang.Object transform(android.graphics.Bitmap bitmap, coil.size.Size size, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        android.graphics.Paint paint = new android.graphics.Paint(3);
        int min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f = min / 2.0f;
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(min, min, coil.util.Bitmaps.getSafeConfig(bitmap));
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f - (bitmap.getWidth() / 2.0f), f - (bitmap.getHeight() / 2.0f), paint);
        return createBitmap;
    }

    public boolean equals(java.lang.Object other) {
        return other instanceof coil.transform.CircleCropTransformation;
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}

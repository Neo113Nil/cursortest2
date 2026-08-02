package coil3.content;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcoil3/util/DrawableUtils;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/Bitmap$Config;", "config", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcoil3/size/Scale;", "scale", "maxSize", "", "allowInexactSize", "Landroid/graphics/Bitmap;", "convertToBitmap", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lcoil3/size/Size;Lcoil3/size/Scale;Lcoil3/size/Size;Z)Landroid/graphics/Bitmap;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrawableUtils {
    public static final coil3.content.DrawableUtils INSTANCE = new coil3.content.DrawableUtils();

    private DrawableUtils() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003e, code lost:
    
        if (coil3.graphics.DecodeUtils.computeSizeMultiplier(r0.getWidth(), r0.getHeight(), coil3.content.IntPair.m9814getFirstimpl(r1), coil3.content.IntPair.m9815getSecondimpl(r1), r13, r14) == 1.0d) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.Bitmap convertToBitmap(android.graphics.drawable.Drawable drawable, android.graphics.Bitmap.Config config, coil3.view.Size size, coil3.view.Scale scale, coil3.view.Size maxSize, boolean allowInexactSize) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            if (bitmap.getConfig() == coil3.content.Bitmap.toSoftware(config)) {
                if (!allowInexactSize) {
                    long m9770computeDstSizesEdh43o = coil3.graphics.DecodeUtils.m9770computeDstSizesEdh43o(bitmap.getWidth(), bitmap.getHeight(), size, scale, maxSize);
                }
                return bitmap;
            }
        }
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        int width = coil3.content.Utils_androidKt.getWidth(mutate);
        if (width <= 0) {
            width = 512;
        }
        int height = coil3.content.Utils_androidKt.getHeight(mutate);
        int i = height > 0 ? height : 512;
        long m9770computeDstSizesEdh43o2 = coil3.graphics.DecodeUtils.m9770computeDstSizesEdh43o(width, i, size, scale, maxSize);
        double computeSizeMultiplier = coil3.graphics.DecodeUtils.computeSizeMultiplier(width, i, coil3.content.IntPair.m9814getFirstimpl(m9770computeDstSizesEdh43o2), coil3.content.IntPair.m9815getSecondimpl(m9770computeDstSizesEdh43o2), scale, maxSize);
        int roundToInt = kotlin.math.MathKt.roundToInt(width * computeSizeMultiplier);
        int roundToInt2 = kotlin.math.MathKt.roundToInt(computeSizeMultiplier * i);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(roundToInt, roundToInt2, coil3.content.Bitmap.toSoftware(config));
        android.graphics.Rect bounds = mutate.getBounds();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        mutate.setBounds(0, 0, roundToInt, roundToInt2);
        mutate.draw(new android.graphics.Canvas(createBitmap));
        mutate.setBounds(i2, i3, i4, i5);
        return createBitmap;
    }
}

package coil.transform;

/* compiled from: RoundedCornersTransformation.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcoil/transform/RoundedCornersTransformation;", "Lcoil/transform/Transformation;", "topLeft", "", "topRight", "bottomLeft", "bottomRight", "<init>", "(FFFF)V", com.helpshift.proactive.InAppViewConstants.RADIUS, "(F)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "transform", "Landroid/graphics/Bitmap;", "input", "size", "Lcoil/size/Size;", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateOutputSize", "Lkotlin/Pair;", "", "equals", "", "other", "", "hashCode", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoundedCornersTransformation implements coil.transform.Transformation {
    private final float bottomLeft;
    private final float bottomRight;
    private final java.lang.String cacheKey;
    private final float topLeft;
    private final float topRight;

    public RoundedCornersTransformation() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public RoundedCornersTransformation(float f, float f2, float f3, float f4) {
        this.topLeft = f;
        this.topRight = f2;
        this.bottomLeft = f3;
        this.bottomRight = f4;
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            throw new java.lang.IllegalArgumentException("All radii must be >= 0.".toString());
        }
        this.cacheKey = getClass().getName() + '-' + f + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + f2 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + f3 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA + f4;
    }

    public /* synthetic */ RoundedCornersTransformation(float f, float f2, float f3, float f4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public RoundedCornersTransformation(float f) {
        this(f, f, f, f);
    }

    @Override // coil.transform.Transformation
    public java.lang.String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil.transform.Transformation
    public java.lang.Object transform(android.graphics.Bitmap bitmap, coil.size.Size size, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        android.graphics.Paint paint = new android.graphics.Paint(3);
        kotlin.Pair<java.lang.Integer, java.lang.Integer> calculateOutputSize = calculateOutputSize(bitmap, size);
        int intValue = calculateOutputSize.component1().intValue();
        int intValue2 = calculateOutputSize.component2().intValue();
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(intValue, intValue2, coil.util.Bitmaps.getSafeConfig(bitmap));
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float computeSizeMultiplier = (float) coil.decode.DecodeUtils.computeSizeMultiplier(bitmap.getWidth(), bitmap.getHeight(), intValue, intValue2, coil.size.Scale.FILL);
        float f = 2;
        matrix.setTranslate((intValue - (bitmap.getWidth() * computeSizeMultiplier)) / f, (intValue2 - (bitmap.getHeight() * computeSizeMultiplier)) / f);
        matrix.preScale(computeSizeMultiplier, computeSizeMultiplier);
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f2 = this.topLeft;
        float f3 = this.topRight;
        float f4 = this.bottomRight;
        float f5 = this.bottomLeft;
        float[] fArr = {f2, f2, f3, f3, f4, f4, f5, f5};
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> calculateOutputSize(android.graphics.Bitmap input, coil.size.Size size) {
        if (coil.size.Sizes.isOriginal(size)) {
            return kotlin.TuplesKt.to(java.lang.Integer.valueOf(input.getWidth()), java.lang.Integer.valueOf(input.getHeight()));
        }
        coil.size.Dimension width = size.getWidth();
        coil.size.Dimension height = size.getHeight();
        if ((width instanceof coil.size.Dimension.Pixels) && (height instanceof coil.size.Dimension.Pixels)) {
            return kotlin.TuplesKt.to(java.lang.Integer.valueOf(((coil.size.Dimension.Pixels) width).px), java.lang.Integer.valueOf(((coil.size.Dimension.Pixels) height).px));
        }
        int width2 = input.getWidth();
        int height2 = input.getHeight();
        coil.size.Dimension width3 = size.getWidth();
        int i = width3 instanceof coil.size.Dimension.Pixels ? ((coil.size.Dimension.Pixels) width3).px : Integer.MIN_VALUE;
        coil.size.Dimension height3 = size.getHeight();
        double computeSizeMultiplier = coil.decode.DecodeUtils.computeSizeMultiplier(width2, height2, i, height3 instanceof coil.size.Dimension.Pixels ? ((coil.size.Dimension.Pixels) height3).px : Integer.MIN_VALUE, coil.size.Scale.FILL);
        return kotlin.TuplesKt.to(java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(input.getWidth() * computeSizeMultiplier)), java.lang.Integer.valueOf(kotlin.math.MathKt.roundToInt(computeSizeMultiplier * input.getHeight())));
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof coil.transform.RoundedCornersTransformation) {
            coil.transform.RoundedCornersTransformation roundedCornersTransformation = (coil.transform.RoundedCornersTransformation) other;
            if (this.topLeft == roundedCornersTransformation.topLeft && this.topRight == roundedCornersTransformation.topRight && this.bottomLeft == roundedCornersTransformation.bottomLeft && this.bottomRight == roundedCornersTransformation.bottomRight) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.topLeft) * 31) + java.lang.Float.floatToIntBits(this.topRight)) * 31) + java.lang.Float.floatToIntBits(this.bottomLeft)) * 31) + java.lang.Float.floatToIntBits(this.bottomRight);
    }
}

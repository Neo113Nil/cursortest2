package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00178\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcoil3/transform/RoundedCornersTransformation;", "Lcoil3/transform/Transformation;", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(FFFF)V", "radius", "(F)V", "Landroid/graphics/Bitmap;", "input", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "transform", "(Landroid/graphics/Bitmap;Lcoil3/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "", "cacheKey", "Ljava/lang/String;", "getCacheKey", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RoundedCornersTransformation extends coil3.graphics.Transformation {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String cacheKey;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;
    private final float getHighSpeedVideoSizes;

    public RoundedCornersTransformation(float f, float f2, float f3, float f4) {
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoSizes = f2;
        this.getHighSpeedVideoFpsRangesFor = f3;
        this.getHighResolutionOutputSizeshNQ4ISI = f4;
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            throw new java.lang.IllegalArgumentException("All radii must be >= 0.".toString());
        }
        java.lang.String getHighResolutionOutputSizeshNQ4ISI = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).getGetHighResolutionOutputSizeshNQ4ISI();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getHighResolutionOutputSizeshNQ4ISI);
        sb.append("-");
        sb.append(f);
        sb.append(",");
        sb.append(f2);
        sb.append(",");
        sb.append(f3);
        sb.append(",");
        sb.append(f4);
        this.cacheKey = sb.toString();
    }

    public /* synthetic */ RoundedCornersTransformation(float f, float f2, float f3, float f4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public RoundedCornersTransformation(float f) {
        this(f, f, f, f);
    }

    @Override // coil3.graphics.Transformation
    public final java.lang.String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil3.graphics.Transformation
    public final java.lang.Object transform(android.graphics.Bitmap bitmap, coil3.view.Size size, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        long m9811constructorimpl;
        if (coil3.view.SizeKt.isOriginal(size)) {
            m9811constructorimpl = coil3.content.IntPair.m9811constructorimpl(bitmap.getWidth(), bitmap.getHeight());
        } else {
            coil3.view.Dimension width = size.getWidth();
            coil3.view.Dimension height = size.getHeight();
            if ((width instanceof coil3.size.Dimension.Pixels) && (height instanceof coil3.size.Dimension.Pixels)) {
                m9811constructorimpl = coil3.content.IntPair.m9811constructorimpl(((coil3.size.Dimension.Pixels) width).m9807unboximpl(), ((coil3.size.Dimension.Pixels) height).m9807unboximpl());
            } else {
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                coil3.view.Dimension width3 = size.getWidth();
                int m9807unboximpl = width3 instanceof coil3.size.Dimension.Pixels ? ((coil3.size.Dimension.Pixels) width3).m9807unboximpl() : Integer.MIN_VALUE;
                coil3.view.Dimension height3 = size.getHeight();
                double computeSizeMultiplier = coil3.graphics.DecodeUtils.computeSizeMultiplier(width2, height2, m9807unboximpl, height3 instanceof coil3.size.Dimension.Pixels ? ((coil3.size.Dimension.Pixels) height3).m9807unboximpl() : Integer.MIN_VALUE, coil3.view.Scale.FILL, coil3.view.Size.ORIGINAL);
                m9811constructorimpl = coil3.content.IntPair.m9811constructorimpl(kotlin.math.MathKt.roundToInt(bitmap.getWidth() * computeSizeMultiplier), kotlin.math.MathKt.roundToInt(computeSizeMultiplier * bitmap.getHeight()));
            }
        }
        int m9814getFirstimpl = coil3.content.IntPair.m9814getFirstimpl(m9811constructorimpl);
        int m9815getSecondimpl = coil3.content.IntPair.m9815getSecondimpl(m9811constructorimpl);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(m9814getFirstimpl, m9815getSecondimpl, coil3.content.Bitmap.getSafeConfig(bitmap));
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint newScaledShaderPaint = coil3.graphics.Bitmap.newScaledShaderPaint(bitmap, m9814getFirstimpl, m9815getSecondimpl);
        float f = this.Camera2StreamConfigurationMap;
        float f2 = this.getHighSpeedVideoSizes;
        if (f == f2) {
            float f3 = this.getHighSpeedVideoFpsRangesFor;
            if (f2 == f3 && f3 == this.getHighResolutionOutputSizeshNQ4ISI) {
                canvas.drawRoundRect(0.0f, 0.0f, m9814getFirstimpl, m9815getSecondimpl, f, f, newScaledShaderPaint);
                return createBitmap;
            }
        }
        float f4 = this.getHighResolutionOutputSizeshNQ4ISI;
        float f5 = this.getHighSpeedVideoFpsRangesFor;
        float[] fArr = {f, f, f2, f2, f4, f4, f5, f5};
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, m9814getFirstimpl, m9815getSecondimpl);
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CW);
        canvas.drawPath(path, newScaledShaderPaint);
        return createBitmap;
    }

    public RoundedCornersTransformation() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }
}

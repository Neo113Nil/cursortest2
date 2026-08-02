package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/TileDrawable;", "Landroid/graphics/drawable/Drawable;", "p0", "Landroid/graphics/Shader$TileMode;", "p1", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Shader$TileMode;)V", "Landroid/graphics/Canvas;", "", "draw", "(Landroid/graphics/Canvas;)V", "", "getOpacity", "()I", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class TileDrawable extends android.graphics.drawable.Drawable {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.graphics.Paint Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    public TileDrawable(android.graphics.drawable.Drawable drawable, android.graphics.Shader.TileMode tileMode) {
        android.graphics.Bitmap bitmap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileMode, "");
        this.getHighResolutionOutputSizeshNQ4ISI = drawable.getOpacity();
        android.graphics.Paint paint = new android.graphics.Paint();
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmap, "");
        } else {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            bitmap = createBitmap;
        }
        paint.setShader(new android.graphics.BitmapShader(bitmap, tileMode, tileMode));
        this.Camera2StreamConfigurationMap = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        p0.drawPaint(this.Camera2StreamConfigurationMap);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int p0) {
        this.Camera2StreamConfigurationMap.setAlpha(p0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter p0) {
        this.Camera2StreamConfigurationMap.setColorFilter(p0);
    }
}

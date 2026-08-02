package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalBitmapRenderer;", "", "", "strokeSize", "backgroundColor", "", "ratioOfHumanFace", "<init>", "(IIF)V", "width", "height", "Landroid/graphics/Rect;", "ovalRect", "strokeColor", "Landroid/graphics/Bitmap;", "render", "(IILandroid/graphics/Rect;I)Landroid/graphics/Bitmap;", "getOvalRect", "(IILandroid/graphics/Rect;)Landroid/graphics/Rect;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OvalBitmapRenderer {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    public OvalBitmapRenderer(int i, int i2, float f) {
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighSpeedVideoFpsRanges = f;
    }

    public /* synthetic */ OvalBitmapRenderer(int i, int i2, float f, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 10 : i, (i3 & 2) != 0 ? -1291845632 : i2, (i3 & 4) != 0 ? 0.75f : f);
    }

    public final android.graphics.Rect getOvalRect(int width, int height, android.graphics.Rect ovalRect) {
        if (width <= 0 || height <= 0) {
            return new android.graphics.Rect();
        }
        if (ovalRect != null && !ovalRect.isEmpty()) {
            return ovalRect;
        }
        float f = width;
        float f2 = 0.8f * f;
        float f3 = f2 / this.getHighSpeedVideoFpsRanges;
        float f4 = (f - f2) / 2.0f;
        float f5 = (height - f3) / 2.0f;
        return new android.graphics.Rect((int) f4, (int) f5, (int) (f4 + f2), (int) (f5 + f3));
    }

    public final android.graphics.Bitmap render(int width, int height, android.graphics.Rect ovalRect, int strokeColor) {
        if (width <= 0 || height <= 0) {
            return android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawColor(this.Camera2StreamConfigurationMap);
        if (ovalRect == null || ovalRect.isEmpty()) {
            float f = width;
            float f2 = 0.8f * f;
            float f3 = f2 / this.getHighSpeedVideoFpsRanges;
            float f4 = (f - f2) / 2.0f;
            float f5 = (height - f3) / 2.0f;
            ovalRect = new android.graphics.Rect((int) f4, (int) f5, (int) (f4 + f2), (int) (f5 + f3));
        }
        int i = this.getHighSpeedVideoSizes / 2;
        int i2 = ovalRect.left;
        int i3 = ovalRect.top;
        int i4 = ovalRect.right;
        int i5 = ovalRect.bottom;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStrokeWidth(this.getHighSpeedVideoSizes);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        float f6 = i2 + i;
        float f7 = i3 + i;
        float f8 = i4 - i;
        float f9 = i5 - i;
        canvas.drawOval(f6, f7, f8, f9, paint);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setColor(strokeColor);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(this.getHighSpeedVideoSizes);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_OVER));
        canvas.drawOval(f6, f7, f8, f9, paint2);
        return createBitmap;
    }

    public OvalBitmapRenderer() {
        this(0, 0, 0.0f, 7, null);
    }
}

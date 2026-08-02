package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0015\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/TransparentOvalView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "rect", "", "setOvalRect", "(Landroid/graphics/Rect;)V", "", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "setStrokeColor", "(I)V", "Landroid/graphics/Canvas;", "p0", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/graphics/Rect;", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalBitmapRenderer;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalBitmapRenderer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class TransparentOvalView extends android.view.View {
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.graphics.Rect getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalBitmapRenderer getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.graphics.Bitmap getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransparentOvalView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = new android.graphics.Rect();
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getInputSizeshNQ4ISI = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalBitmapRenderer(0, 0, 0.0f, 7, null);
        setBackgroundColor(0);
        setLayerType(2, null);
    }

    public final void setOvalRect(android.graphics.Rect rect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        if (rect.isEmpty() || this.getHighSpeedVideoFpsRangesFor.equals(rect)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.set(rect);
        android.graphics.Bitmap bitmap = this.getHighSpeedVideoSizes;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.getHighSpeedVideoSizes = null;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[OvalGuide] Oval rect updated: ".concat(java.lang.String.valueOf(rect)), null, null, 6, null);
    }

    public final void setStrokeColor(int color) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != color) {
            this.getHighResolutionOutputSizeshNQ4ISI = color;
            android.graphics.Bitmap bitmap = this.getHighSpeedVideoSizes;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.getHighSpeedVideoSizes = null;
        }
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        super.onDraw(p0);
        if (this.getHighSpeedVideoSizes == null || getWidth() != this.Camera2StreamConfigurationMap || getHeight() != this.getHighSpeedVideoFpsRanges) {
            android.graphics.Bitmap bitmap = this.getHighSpeedVideoSizes;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.getHighSpeedVideoSizes = this.getInputSizeshNQ4ISI.render(getWidth(), getHeight(), this.getHighSpeedVideoFpsRangesFor.isEmpty() ? null : this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
            this.Camera2StreamConfigurationMap = getWidth();
            this.getHighSpeedVideoFpsRanges = getHeight();
        }
        android.graphics.Bitmap bitmap2 = this.getHighSpeedVideoSizes;
        if (bitmap2 != null) {
            p0.drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.graphics.Bitmap bitmap = this.getHighSpeedVideoSizes;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.getHighSpeedVideoSizes = null;
    }
}

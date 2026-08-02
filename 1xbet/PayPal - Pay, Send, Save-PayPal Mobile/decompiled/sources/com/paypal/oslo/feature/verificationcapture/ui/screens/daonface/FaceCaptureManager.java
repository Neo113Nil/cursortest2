package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000b\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FaceCaptureManager;", "", "<init>", "()V", "", "width", "height", "", "setDisplaySize", "(II)V", "setImageSize", "getHighSpeedVideoFpsRangesFor", "Landroid/graphics/Rect;", "getValidLayoutPositionOfFace", "()Landroid/graphics/Rect;", "rect", "", "ovalContainsRect", "(Landroid/graphics/Rect;)Z", "p0", "(Landroid/graphics/Rect;)Landroid/graphics/Rect;", "", "limit", "largerThanValidFaceRect", "(Landroid/graphics/Rect;F)Z", "smallerThanValidFaceRect", "getHighSpeedVideoSizesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getInputFormats", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "Landroid/graphics/Rect;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FaceCaptureManager {
    public static final int IDEAL_CAPTURE_HEIGHT = 720;
    public static final int IDEAL_CAPTURE_WIDTH = 1440;
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.graphics.Rect getInputFormats = new android.graphics.Rect();
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    public final void setDisplaySize(int width, int height) {
        com.paypal.android.logger.Logger log = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[FaceCaptureManager] setDisplaySize(");
        sb.append(width);
        sb.append(", ");
        sb.append(height);
        sb.append(")");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        this.getHighSpeedVideoFpsRanges = width;
        this.getHighSpeedVideoFpsRangesFor = height;
        getHighSpeedVideoFpsRangesFor();
    }

    public final void setImageSize(int width, int height) {
        com.paypal.android.logger.Logger log = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[FaceCaptureManager] setImageSize(");
        sb.append(width);
        sb.append(", ");
        sb.append(height);
        sb.append(")");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        this.getHighResolutionOutputSizeshNQ4ISI = width;
        this.getOutputMinFrameDuration = height;
        getHighSpeedVideoFpsRangesFor();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        int i;
        int i2;
        int i3;
        int i4 = this.getHighSpeedVideoFpsRanges;
        if (i4 == 0 || (i = this.getHighSpeedVideoFpsRangesFor) == 0 || (i2 = this.getHighResolutionOutputSizeshNQ4ISI) == 0 || (i3 = this.getOutputMinFrameDuration) == 0) {
            return;
        }
        double d = i2 / i3;
        double d2 = i4;
        double d3 = i;
        double d4 = d2 / d3;
        this.getHighSpeedVideoSizes = i4;
        this.Camera2StreamConfigurationMap = i;
        if (d > d4) {
            this.getHighSpeedVideoSizes = (int) (d * d3);
        } else {
            this.Camera2StreamConfigurationMap = (int) (d2 / d);
        }
    }

    public final android.graphics.Rect getValidLayoutPositionOfFace() {
        int i;
        float f;
        float f2;
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 == 0 || (i = this.getHighSpeedVideoFpsRangesFor) == 0 || this.getHighResolutionOutputSizeshNQ4ISI == 0 || this.getOutputMinFrameDuration == 0) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[FaceCaptureManager] Cannot calculate oval - sizes not set", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("layout_width", java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges)), kotlin.TuplesKt.to("layout_height", java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor)), kotlin.TuplesKt.to("image_width", java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI)), kotlin.TuplesKt.to("image_height", java.lang.Integer.valueOf(this.getOutputMinFrameDuration))), null, 4, null);
            return new android.graphics.Rect();
        }
        if (i2 >= i) {
            f2 = i * 0.8f;
            f = 0.75f * f2;
        } else {
            float f3 = i2 * 0.8f;
            f = f3;
            f2 = f3 / 0.75f;
        }
        this.getInputFormats.left = (int) ((i2 - f) / 2.0f);
        this.getInputFormats.top = (int) ((this.getHighSpeedVideoFpsRangesFor - f2) / 2.0f);
        this.getInputFormats.right = (int) (r0.left + f);
        this.getInputFormats.bottom = (int) (r0.top + f2);
        com.paypal.android.logger.Logger log = com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog();
        android.graphics.Rect rect = this.getInputFormats;
        int i3 = this.getHighSpeedVideoFpsRanges;
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        int i5 = this.getHighSpeedVideoSizes;
        int i6 = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[FaceCaptureManager] Calculated oval rect: ");
        sb.append(rect);
        sb.append(" (layout: ");
        sb.append(i3);
        sb.append("x");
        sb.append(i4);
        sb.append(", adjusted: ");
        sb.append(i5);
        sb.append("x");
        sb.append(i6);
        sb.append(")");
        com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
        return this.getInputFormats;
    }

    public final boolean ovalContainsRect(android.graphics.Rect rect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        android.graphics.Rect highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(rect);
        return this.getInputFormats.left <= highSpeedVideoFpsRangesFor.left && this.getInputFormats.right >= highSpeedVideoFpsRangesFor.right && this.getInputFormats.top <= highSpeedVideoFpsRangesFor.top && this.getInputFormats.bottom >= highSpeedVideoFpsRangesFor.bottom;
    }

    private final android.graphics.Rect getHighSpeedVideoFpsRangesFor(android.graphics.Rect p0) {
        android.graphics.Rect rect = new android.graphics.Rect();
        rect.left = (int) ((p0.left / this.getHighResolutionOutputSizeshNQ4ISI) * this.getHighSpeedVideoSizes);
        rect.top = (int) ((p0.top / this.getOutputMinFrameDuration) * this.Camera2StreamConfigurationMap);
        int width = (int) (this.getHighSpeedVideoSizes * (p0.width() / this.getHighResolutionOutputSizeshNQ4ISI));
        rect.right = rect.left + width;
        rect.bottom = rect.top + ((int) (this.Camera2StreamConfigurationMap * (p0.height() / this.getOutputMinFrameDuration)));
        return rect;
    }

    public final boolean largerThanValidFaceRect(android.graphics.Rect rect, float limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(limit, 0.0f, 1.0f);
        android.graphics.Rect highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(rect);
        return ((float) highSpeedVideoFpsRangesFor.width()) >= ((float) this.getInputFormats.width()) * coerceIn && ((float) highSpeedVideoFpsRangesFor.height()) >= ((float) this.getInputFormats.height()) * coerceIn;
    }

    public final boolean smallerThanValidFaceRect(android.graphics.Rect rect, float limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(limit, 0.0f, 1.0f);
        android.graphics.Rect highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(rect);
        return ((float) highSpeedVideoFpsRangesFor.width()) < ((float) this.getInputFormats.width()) * coerceIn || ((float) highSpeedVideoFpsRangesFor.height()) < ((float) this.getInputFormats.height()) * coerceIn;
    }
}

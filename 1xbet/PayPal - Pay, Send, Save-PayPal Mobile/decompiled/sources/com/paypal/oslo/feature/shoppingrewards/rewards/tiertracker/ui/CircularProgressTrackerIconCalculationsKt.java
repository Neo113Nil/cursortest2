package com.paypal.oslo.feature.shoppingrewards.rewards.tiertracker.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\t\u001a'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a?\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b#\u0010\""}, d2 = {"", "progress", "", "minStub", "calculateIconNormalizedProgress", "(IF)F", "canvasWidth", "referencePx", "calculateIconScaleFactor", "(FF)F", "basePx", "scaleFactor", "calculateScaledPx", "arcRadiusPx", "calculateIconRadius", "centerX", "centerY", "radius", "Landroidx/compose/ui/geometry/Offset;", "calculateIconArcTopLeft", "(FFF)J", "Landroidx/compose/ui/geometry/Size;", "calculateIconArcSize", "(F)J", "startAngle", "fullSweep", "normalizedProgress", "Lkotlin/Pair;", "calculateAccentArc", "(FFF)Lkotlin/Pair;", "totalSweep", "calculateIconIndicatorCenter", "(FFFFFF)J", "calculateIconCrosshairArm", "(F)F", "calculateIconCrosshairStroke"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CircularProgressTrackerIconCalculationsKt {
    public static final float calculateIconCrosshairArm(float f) {
        return f * 0.12f;
    }

    public static final float calculateIconCrosshairStroke(float f) {
        return f * 0.07f;
    }

    public static final float calculateIconRadius(float f, float f2) {
        return (f / 2.0f) - f2;
    }

    public static final float calculateIconScaleFactor(float f, float f2) {
        return f / f2;
    }

    public static final float calculateScaledPx(float f, float f2) {
        return f * f2;
    }

    public static final float calculateIconNormalizedProgress(int i, float f) {
        return kotlin.ranges.RangesKt.coerceAtLeast(kotlin.ranges.RangesKt.coerceIn(i, 0, 100) / 100.0f, f);
    }

    public static final kotlin.Pair<java.lang.Float, java.lang.Float> calculateAccentArc(float f, float f2, float f3) {
        return new kotlin.Pair<>(java.lang.Float.valueOf(f + ((1.0f - f3) * f2)), java.lang.Float.valueOf(f2 * f3));
    }

    public static final long calculateIconIndicatorCenter(float f, float f2, float f3, float f4, float f5, float f6) {
        double radians = java.lang.Math.toRadians(f + (f2 * f3));
        double d = f6;
        float cos = (float) (java.lang.Math.cos(radians) * d);
        float sin = (float) (d * java.lang.Math.sin(radians));
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f4 + cos) << 32) | (java.lang.Float.floatToRawIntBits(f5 + sin) & 4294967295L));
    }

    public static final long calculateIconArcTopLeft(float f, float f2, float f3) {
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f2 - f3) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f - f3) << 32));
    }

    public static final long calculateIconArcSize(float f) {
        float f2 = f * 2.0f;
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }
}

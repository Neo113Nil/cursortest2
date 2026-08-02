package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", "", "a", util.h.xy.cb.b.f1091, "c", "d", "<init>", "(FFFF)V", "fraction", "transform", "(F)F", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(F)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CubicBezierEasing implements androidx.compose.animation.core.Easing {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    public CubicBezierEasing(float f, float f2, float f3, float f4) {
        this.getHighSpeedVideoSizes = f;
        this.getHighResolutionOutputSizeshNQ4ISI = f2;
        this.Camera2StreamConfigurationMap = f3;
        this.getHighSpeedVideoFpsRangesFor = f4;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2) || java.lang.Float.isNaN(f3) || java.lang.Float.isNaN(f4)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ");
            sb.append(f);
            sb.append(", ");
            sb.append(f2);
            sb.append(", ");
            sb.append(f3);
            sb.append(", ");
            sb.append(f4);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            androidx.compose.animation.core.PreconditionsKt.throwIllegalArgumentException(sb.toString());
        }
        long computeCubicVerticalBounds = androidx.compose.ui.graphics.BezierKt.computeCubicVerticalBounds(0.0f, f2, f4, 1.0f, new float[5], 0);
        this.getHighSpeedVideoFpsRanges = java.lang.Float.intBitsToFloat((int) (computeCubicVerticalBounds >> 32));
        this.getOutputMinFrameDuration = java.lang.Float.intBitsToFloat((int) (computeCubicVerticalBounds & 4294967295L));
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float fraction) {
        if (fraction > 0.0f && fraction < 1.0f) {
            float max = java.lang.Math.max(fraction, 1.1920929E-7f);
            float findFirstCubicRoot = androidx.compose.ui.graphics.BezierKt.findFirstCubicRoot(0.0f - max, this.getHighSpeedVideoSizes - max, this.Camera2StreamConfigurationMap - max, 1.0f - max);
            if (java.lang.Float.isNaN(findFirstCubicRoot)) {
                getHighResolutionOutputSizeshNQ4ISI(fraction);
            }
            fraction = androidx.compose.ui.graphics.BezierKt.evaluateCubic(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, findFirstCubicRoot);
            float f = this.getHighSpeedVideoFpsRanges;
            float f2 = this.getOutputMinFrameDuration;
            if (fraction < f) {
                fraction = f;
            }
            if (fraction > f2) {
                return f2;
            }
        }
        return fraction;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(float p0) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The cubic curve with parameters (");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(") has no solution at ");
        sb.append(p0);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.animation.core.CubicBezierEasing)) {
            return false;
        }
        androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = (androidx.compose.animation.core.CubicBezierEasing) other;
        return this.getHighSpeedVideoSizes == cubicBezierEasing.getHighSpeedVideoSizes && this.getHighResolutionOutputSizeshNQ4ISI == cubicBezierEasing.getHighResolutionOutputSizeshNQ4ISI && this.Camera2StreamConfigurationMap == cubicBezierEasing.Camera2StreamConfigurationMap && this.getHighSpeedVideoFpsRangesFor == cubicBezierEasing.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return (((((java.lang.Float.hashCode(this.getHighSpeedVideoSizes) * 31) + java.lang.Float.hashCode(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + java.lang.Float.hashCode(this.Camera2StreamConfigurationMap)) * 31) + java.lang.Float.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CubicBezierEasing(a=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", b=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", c=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", d=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }
}

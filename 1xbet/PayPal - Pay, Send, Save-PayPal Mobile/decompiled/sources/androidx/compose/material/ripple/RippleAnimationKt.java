package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u000b\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "", "getRippleStartRadius-uvyYCjk", "(J)F", "getRippleStartRadius", "Landroidx/compose/ui/unit/Density;", "", "bounded", "getRippleEndRadius-cSwnlzA", "(Landroidx/compose/ui/unit/Density;ZJ)F", "getRippleEndRadius", "Landroidx/compose/ui/unit/Dp;", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RippleAnimationKt {
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f);

    /* renamed from: getRippleStartRadius-uvyYCjk, reason: not valid java name */
    public static final float m2855getRippleStartRadiusuvyYCjk(long j) {
        return java.lang.Math.max(androidx.compose.ui.geometry.Size.m5821getWidthimpl(j), androidx.compose.ui.geometry.Size.m5818getHeightimpl(j)) * 0.3f;
    }

    /* renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m2854getRippleEndRadiuscSwnlzA(androidx.compose.ui.unit.Density density, boolean z, long j) {
        float m5750getDistanceimpl = androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Size.m5821getWidthimpl(j), androidx.compose.ui.geometry.Size.m5818getHeightimpl(j))) / 2.0f;
        return z ? m5750getDistanceimpl + density.mo1418toPx0680j_4(getHighSpeedVideoFpsRangesFor) : m5750getDistanceimpl;
    }
}

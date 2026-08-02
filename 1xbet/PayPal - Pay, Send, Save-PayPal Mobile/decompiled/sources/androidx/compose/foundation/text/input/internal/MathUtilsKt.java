package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a*\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0005\u001a#\u0010\r\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00072\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "Lkotlin/Function0;", "defaultValue", "addExactOrElse", "(IILkotlin/jvm/functions/Function0;)I", "subtractExactOrElse", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "findClosestRect-9KIMszo", "(JLandroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)I", "findClosestRect", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(JLandroidx/compose/ui/geometry/Rect;)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i, int i2, kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        int i3 = i + i2;
        return ((i ^ i3) & (i2 ^ i3)) < 0 ? function0.invoke().intValue() : i3;
    }

    public static final int subtractExactOrElse(int i, int i2, kotlin.jvm.functions.Function0<java.lang.Integer> function0) {
        int i3 = i - i2;
        return ((i ^ i2) & (i ^ i3)) < 0 ? function0.invoke().intValue() : i3;
    }

    /* renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m2237findClosestRect9KIMszo(long j, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(j, rect);
        float highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(j, rect2);
        if (highResolutionOutputSizeshNQ4ISI == highResolutionOutputSizeshNQ4ISI2) {
            return 0;
        }
        return highResolutionOutputSizeshNQ4ISI < highResolutionOutputSizeshNQ4ISI2 ? -1 : 1;
    }

    private static final float getHighResolutionOutputSizeshNQ4ISI(long j, androidx.compose.ui.geometry.Rect rect) {
        if (androidx.compose.foundation.text.selection.SelectionManagerKt.m2425containsInclusiveUv8p0NA(rect, j)) {
            return 0.0f;
        }
        float m5751getDistanceSquaredimpl = androidx.compose.ui.geometry.Offset.m5751getDistanceSquaredimpl(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(rect.m5787getTopLeftF1C5BW0(), j));
        if (m5751getDistanceSquaredimpl >= Float.MAX_VALUE) {
            m5751getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float m5751getDistanceSquaredimpl2 = androidx.compose.ui.geometry.Offset.m5751getDistanceSquaredimpl(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(rect.m5788getTopRightF1C5BW0(), j));
        if (m5751getDistanceSquaredimpl2 < m5751getDistanceSquaredimpl) {
            m5751getDistanceSquaredimpl = m5751getDistanceSquaredimpl2;
        }
        float m5751getDistanceSquaredimpl3 = androidx.compose.ui.geometry.Offset.m5751getDistanceSquaredimpl(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(rect.m5780getBottomLeftF1C5BW0(), j));
        if (m5751getDistanceSquaredimpl3 < m5751getDistanceSquaredimpl) {
            m5751getDistanceSquaredimpl = m5751getDistanceSquaredimpl3;
        }
        float m5751getDistanceSquaredimpl4 = androidx.compose.ui.geometry.Offset.m5751getDistanceSquaredimpl(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(rect.m5781getBottomRightF1C5BW0(), j));
        return m5751getDistanceSquaredimpl4 < m5751getDistanceSquaredimpl ? m5751getDistanceSquaredimpl4 : m5751getDistanceSquaredimpl;
    }
}

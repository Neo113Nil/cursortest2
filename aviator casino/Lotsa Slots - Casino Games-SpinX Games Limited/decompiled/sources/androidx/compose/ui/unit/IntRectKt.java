package androidx.compose.ui.unit;

/* compiled from: IntRect.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0007\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"IntRect", "Landroidx/compose/ui/unit/IntRect;", "topLeft", "Landroidx/compose/ui/unit/IntOffset;", "bottomRight", "IntRect-E1MhUcY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "offset", "size", "Landroidx/compose/ui/unit/IntSize;", "IntRect-VbeCjmY", "center", com.helpshift.proactive.InAppViewConstants.RADIUS, "", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "lerp", "start", "stop", "fraction", "", "roundToIntRect", "Landroidx/compose/ui/geometry/Rect;", "toRect", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntRectKt {
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final androidx.compose.ui.unit.IntRect m4642IntRectVbeCjmY(long j, long j2) {
        return new androidx.compose.ui.unit.IntRect(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j), androidx.compose.ui.unit.IntOffset.m4610getXimpl(j) + androidx.compose.ui.unit.IntSize.m4652getWidthimpl(j2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j) + androidx.compose.ui.unit.IntSize.m4651getHeightimpl(j2));
    }

    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final androidx.compose.ui.unit.IntRect m4641IntRectE1MhUcY(long j, long j2) {
        return new androidx.compose.ui.unit.IntRect(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j), androidx.compose.ui.unit.IntOffset.m4610getXimpl(j2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j2));
    }

    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final androidx.compose.ui.unit.IntRect m4643IntRectar5cAso(long j, int i) {
        return new androidx.compose.ui.unit.IntRect(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j) - i, androidx.compose.ui.unit.IntOffset.m4611getYimpl(j) - i, androidx.compose.ui.unit.IntOffset.m4610getXimpl(j) + i, androidx.compose.ui.unit.IntOffset.m4611getYimpl(j) + i);
    }

    public static final androidx.compose.ui.unit.IntRect lerp(androidx.compose.ui.unit.IntRect intRect, androidx.compose.ui.unit.IntRect intRect2, float f) {
        return new androidx.compose.ui.unit.IntRect(androidx.compose.ui.util.MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f), androidx.compose.ui.util.MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f), androidx.compose.ui.util.MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f), androidx.compose.ui.util.MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f));
    }

    public static final androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.IntRect intRect) {
        return new androidx.compose.ui.geometry.Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }

    public static final androidx.compose.ui.unit.IntRect roundToIntRect(androidx.compose.ui.geometry.Rect rect) {
        return new androidx.compose.ui.unit.IntRect(kotlin.math.MathKt.roundToInt(rect.getLeft()), kotlin.math.MathKt.roundToInt(rect.getTop()), kotlin.math.MathKt.roundToInt(rect.getRight()), kotlin.math.MathKt.roundToInt(rect.getBottom()));
    }
}

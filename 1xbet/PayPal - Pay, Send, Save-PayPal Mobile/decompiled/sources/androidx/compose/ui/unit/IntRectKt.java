package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u00020\u0004*\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "offset", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/IntRect;", "IntRect-VbeCjmY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "IntRect", "topLeft", "bottomRight", "IntRect-E1MhUcY", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "", "radius", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "fraction", "lerp", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;F)Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/IntRect;)Landroidx/compose/ui/geometry/Rect;", "roundToIntRect", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/unit/IntRect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntRectKt {
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final androidx.compose.ui.unit.IntRect m8762IntRectVbeCjmY(long j, long j2) {
        return new androidx.compose.ui.unit.IntRect(androidx.compose.ui.unit.IntOffset.m8729getXimpl(j), androidx.compose.ui.unit.IntOffset.m8730getYimpl(j), androidx.compose.ui.unit.IntOffset.m8729getXimpl(j) + ((int) (j2 >> 32)), androidx.compose.ui.unit.IntOffset.m8730getYimpl(j) + ((int) (j2 & 4294967295L)));
    }

    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final androidx.compose.ui.unit.IntRect m8761IntRectE1MhUcY(long j, long j2) {
        return new androidx.compose.ui.unit.IntRect(androidx.compose.ui.unit.IntOffset.m8729getXimpl(j), androidx.compose.ui.unit.IntOffset.m8730getYimpl(j), androidx.compose.ui.unit.IntOffset.m8729getXimpl(j2), androidx.compose.ui.unit.IntOffset.m8730getYimpl(j2));
    }

    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final androidx.compose.ui.unit.IntRect m8763IntRectar5cAso(long j, int i) {
        return new androidx.compose.ui.unit.IntRect(androidx.compose.ui.unit.IntOffset.m8729getXimpl(j) - i, androidx.compose.ui.unit.IntOffset.m8730getYimpl(j) - i, androidx.compose.ui.unit.IntOffset.m8729getXimpl(j) + i, androidx.compose.ui.unit.IntOffset.m8730getYimpl(j) + i);
    }

    public static final androidx.compose.ui.unit.IntRect lerp(androidx.compose.ui.unit.IntRect intRect, androidx.compose.ui.unit.IntRect intRect2, float f) {
        return new androidx.compose.ui.unit.IntRect(androidx.compose.ui.util.MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f), androidx.compose.ui.util.MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f), androidx.compose.ui.util.MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f), androidx.compose.ui.util.MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f));
    }

    public static final androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.IntRect intRect) {
        return new androidx.compose.ui.geometry.Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }

    public static final androidx.compose.ui.unit.IntRect roundToIntRect(androidx.compose.ui.geometry.Rect rect) {
        return new androidx.compose.ui.unit.IntRect(java.lang.Math.round(rect.getLeft()), java.lang.Math.round(rect.getTop()), java.lang.Math.round(rect.getRight()), java.lang.Math.round(rect.getBottom()));
    }
}

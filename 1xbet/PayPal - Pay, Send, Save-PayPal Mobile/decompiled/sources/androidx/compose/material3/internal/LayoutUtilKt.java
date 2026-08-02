package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\f\u001a\u00020\u0000*\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\u00020\u0000*\u0004\u0018\u00010\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b"}, d2 = {"", "other", "subtractConstraintSafely", "(II)I", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "Landroidx/compose/ui/layout/Placeable;", "getWidthOrZero", "(Landroidx/compose/ui/layout/Placeable;)I", "widthOrZero", "getHeightOrZero", "heightOrZero"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutUtilKt {
    public static final java.lang.Object getLayoutId(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable) {
        java.lang.Object parentData = intrinsicMeasurable.getParentData();
        androidx.compose.ui.layout.LayoutIdParentData layoutIdParentData = parentData instanceof androidx.compose.ui.layout.LayoutIdParentData ? (androidx.compose.ui.layout.LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getGetHighSpeedVideoFpsRangesFor();
        }
        return null;
    }

    public static final int getWidthOrZero(androidx.compose.ui.layout.Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int getHeightOrZero(androidx.compose.ui.layout.Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int subtractConstraintSafely(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : kotlin.ranges.RangesKt.coerceAtLeast(i - i2, 0);
    }
}

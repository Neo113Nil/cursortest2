package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u0007*\u0004\u0018\u00010\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u000b*\u0004\u0018\u00010\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0013\u001a\u00020\u000b*\u0004\u0018\u00010\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMeasurable;", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getRowColumnParentData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "rowColumnParentData", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "weight", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "fill", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "isRelative"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RowColumnImplKt {
    public static final androidx.compose.foundation.layout.RowColumnParentData getRowColumnParentData(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable) {
        java.lang.Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof androidx.compose.foundation.layout.RowColumnParentData) {
            return (androidx.compose.foundation.layout.RowColumnParentData) parentData;
        }
        return null;
    }

    public static final androidx.compose.foundation.layout.RowColumnParentData getRowColumnParentData(androidx.compose.ui.layout.Placeable placeable) {
        java.lang.Object parentData = placeable.getParentData();
        if (parentData instanceof androidx.compose.foundation.layout.RowColumnParentData) {
            return (androidx.compose.foundation.layout.RowColumnParentData) parentData;
        }
        return null;
    }

    public static final float getWeight(androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    public static final boolean getFill(androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    public static final androidx.compose.foundation.layout.CrossAxisAlignment getCrossAxisAlignment(androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean isRelative(androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData) {
        androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout();
        }
        return false;
    }
}

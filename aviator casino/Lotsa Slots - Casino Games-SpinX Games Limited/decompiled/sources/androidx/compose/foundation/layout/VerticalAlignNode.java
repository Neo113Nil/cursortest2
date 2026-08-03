package androidx.compose.foundation.layout;

/* compiled from: RowColumnImpl.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\t\u001a\u00020\n*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", com.helpshift.proactive.InAppViewConstants.ORIENTATION_VERTICAL, "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Alignment$Vertical;)V", "getVertical", "()Landroidx/compose/ui/Alignment$Vertical;", "setVertical", "modifyParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "Landroidx/compose/ui/unit/Density;", "parentData", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VerticalAlignNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ParentDataModifierNode {
    public static final int $stable = 8;
    private androidx.compose.ui.Alignment.Vertical vertical;

    public final androidx.compose.ui.Alignment.Vertical getVertical() {
        return this.vertical;
    }

    public final void setVertical(androidx.compose.ui.Alignment.Vertical vertical) {
        this.vertical = vertical;
    }

    public VerticalAlignNode(androidx.compose.ui.Alignment.Vertical vertical) {
        this.vertical = vertical;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public androidx.compose.foundation.layout.RowColumnParentData modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
        androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData = obj instanceof androidx.compose.foundation.layout.RowColumnParentData ? (androidx.compose.foundation.layout.RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new androidx.compose.foundation.layout.RowColumnParentData(0.0f, false, null, 7, null);
        }
        rowColumnParentData.setCrossAxisAlignment(androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(this.vertical));
        return rowColumnParentData;
    }
}

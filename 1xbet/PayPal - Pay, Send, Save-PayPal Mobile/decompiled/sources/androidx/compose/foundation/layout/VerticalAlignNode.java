package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/Alignment$Vertical;", "vertical", "<init>", "(Landroidx/compose/ui/Alignment$Vertical;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Landroidx/compose/foundation/layout/RowColumnParentData;", "Landroidx/compose/ui/Alignment$Vertical;", "getVertical", "()Landroidx/compose/ui/Alignment$Vertical;", "setVertical"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VerticalAlignNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ParentDataModifierNode {
    public static final int $stable = 8;
    private androidx.compose.ui.Alignment.Vertical vertical;

    public VerticalAlignNode(androidx.compose.ui.Alignment.Vertical vertical) {
        this.vertical = vertical;
    }

    public final androidx.compose.ui.Alignment.Vertical getVertical() {
        return this.vertical;
    }

    public final void setVertical(androidx.compose.ui.Alignment.Vertical vertical) {
        this.vertical = vertical;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final androidx.compose.foundation.layout.RowColumnParentData modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
        androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData = obj instanceof androidx.compose.foundation.layout.RowColumnParentData ? (androidx.compose.foundation.layout.RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new androidx.compose.foundation.layout.RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.setCrossAxisAlignment(androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.vertical$foundation_layout(this.vertical));
        return rowColumnParentData;
    }
}

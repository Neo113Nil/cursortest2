package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/layout/FillCrossAxisSizeNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "fraction", "<init>", "(F)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Landroidx/compose/foundation/layout/RowColumnParentData;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFraction", "()F", "setFraction"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FillCrossAxisSizeNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ParentDataModifierNode {
    public static final int $stable = 8;
    private float fraction;

    public FillCrossAxisSizeNode(float f) {
        this.fraction = f;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final void setFraction(float f) {
        this.fraction = f;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final androidx.compose.foundation.layout.RowColumnParentData modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
        androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData = obj instanceof androidx.compose.foundation.layout.RowColumnParentData ? (androidx.compose.foundation.layout.RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new androidx.compose.foundation.layout.RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        androidx.compose.foundation.layout.FlowLayoutData flowLayoutData = rowColumnParentData.getFlowLayoutData();
        if (flowLayoutData == null) {
            flowLayoutData = new androidx.compose.foundation.layout.FlowLayoutData(this.fraction);
        }
        rowColumnParentData.setFlowLayoutData(flowLayoutData);
        androidx.compose.foundation.layout.FlowLayoutData flowLayoutData2 = rowColumnParentData.getFlowLayoutData();
        kotlin.jvm.internal.Intrinsics.checkNotNull(flowLayoutData2);
        flowLayoutData2.setFillCrossAxisFraction(this.fraction);
        return rowColumnParentData;
    }
}

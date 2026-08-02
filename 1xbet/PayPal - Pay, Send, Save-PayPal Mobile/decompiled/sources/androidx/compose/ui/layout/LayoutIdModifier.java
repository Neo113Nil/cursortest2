package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00048\u0017@QX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdModifier;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/layout/LayoutIdParentData;", "Landroidx/compose/ui/Modifier$Node;", "", "layoutId", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/ui/unit/Density;", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/Object;", "getLayoutId", "()Ljava/lang/Object;", "setLayoutId$ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutIdModifier extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.ParentDataModifierNode, androidx.compose.ui.layout.LayoutIdParentData {
    public static final int $stable = 8;
    private java.lang.Object layoutId;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final java.lang.Object modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
        return this;
    }

    public LayoutIdModifier(java.lang.Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public final java.lang.Object getLayoutId() {
        return this.layoutId;
    }

    public final void setLayoutId$ui(java.lang.Object obj) {
        this.layoutId = obj;
    }
}

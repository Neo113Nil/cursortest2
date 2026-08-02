package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/FocusGroupElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/FocusGroupNode;", "<init>", "()V", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "p0", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusGroupElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.foundation.FocusGroupNode> {
    public static final androidx.compose.foundation.FocusGroupElement INSTANCE = new androidx.compose.foundation.FocusGroupElement();

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object p0) {
        return p0 == this;
    }

    private FocusGroupElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(androidx.compose.foundation.FocusGroupNode focusGroupNode) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusGroup");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return "focusGroup".hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final /* synthetic */ androidx.compose.foundation.FocusGroupNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.foundation.FocusGroupNode();
    }
}

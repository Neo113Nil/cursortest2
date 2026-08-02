package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/ParentDataModifierNode;", "", "invalidateParentData", "(Landroidx/compose/ui/node/ParentDataModifierNode;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ParentDataModifierNodeKt {
    public static final void invalidateParentData(androidx.compose.ui.node.ParentDataModifierNode parentDataModifierNode) {
        androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(parentDataModifierNode).invalidateParentData$ui();
    }
}

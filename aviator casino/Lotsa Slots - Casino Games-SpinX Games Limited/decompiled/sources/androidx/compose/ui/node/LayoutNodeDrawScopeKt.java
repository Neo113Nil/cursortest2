package androidx.compose.ui.node;

/* compiled from: LayoutNodeDrawScope.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"nextDrawNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier.Node nextDrawNode(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(4);
        int m3613constructorimpl2 = androidx.compose.ui.node.NodeKind.m3613constructorimpl(2);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & m3613constructorimpl2) == 0) {
            if ((child.getKindSet() & m3613constructorimpl) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}

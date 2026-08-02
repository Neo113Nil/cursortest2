package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/Modifier$Node;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier.Node getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(4);
        int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(2);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
            return null;
        }
        while (child != null && (child.getKindSet() & m7621constructorimpl2) == 0) {
            if ((child.getKindSet() & m7621constructorimpl) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }
}

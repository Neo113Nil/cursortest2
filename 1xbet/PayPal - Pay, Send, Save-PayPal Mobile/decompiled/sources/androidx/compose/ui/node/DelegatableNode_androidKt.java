package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "Landroid/view/View;", "requireView", "(Landroidx/compose/ui/node/DelegatableNode;)Landroid/view/View;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DelegatableNode_androidKt {
    public static final android.view.View requireView(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Cannot get View because the Modifier node is not currently attached.");
        }
        java.lang.Object requireOwner = androidx.compose.ui.node.LayoutNodeKt.requireOwner(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(delegatableNode));
        kotlin.jvm.internal.Intrinsics.checkNotNull(requireOwner, "");
        return (android.view.View) requireOwner;
    }
}

package androidx.compose.ui.focus;

/* compiled from: FocusTargetNode.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "Landroidx/compose/ui/focus/FocusTargetNode;", "getFocusTransactionManager", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTransactionManager;", "invalidateFocusTarget", "", "requireTransactionManager", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTargetNodeKt {
    public static final androidx.compose.ui.focus.FocusTransactionManager requireTransactionManager(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        return androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getFocusTransactionManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.focus.FocusTransactionManager getFocusTransactionManager(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.LayoutNode layoutNode;
        androidx.compose.ui.node.Owner owner;
        androidx.compose.ui.focus.FocusOwner focusOwner;
        androidx.compose.ui.node.NodeCoordinator coordinator = focusTargetNode.getNode().getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null || (focusOwner = owner.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.getFocusTransactionManager();
    }

    public static final void invalidateFocusTarget(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().scheduleInvalidation(focusTargetNode);
    }
}

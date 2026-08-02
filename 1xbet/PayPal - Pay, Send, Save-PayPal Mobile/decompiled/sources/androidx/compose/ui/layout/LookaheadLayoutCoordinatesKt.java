package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/node/LookaheadDelegate;", "getRootLookaheadDelegate", "(Landroidx/compose/ui/node/LookaheadDelegate;)Landroidx/compose/ui/node/LookaheadDelegate;", "rootLookaheadDelegate"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LookaheadLayoutCoordinatesKt {
    public static final androidx.compose.ui.node.LookaheadDelegate getRootLookaheadDelegate(androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate) {
        androidx.compose.ui.node.LayoutNode layoutNode = lookaheadDelegate.getLayoutNode();
        while (true) {
            androidx.compose.ui.node.LayoutNode parent$ui = layoutNode.getParent$ui();
            if ((parent$ui != null ? parent$ui.getLookaheadRoot() : null) != null) {
                androidx.compose.ui.node.LayoutNode parent$ui2 = layoutNode.getParent$ui();
                androidx.compose.ui.node.LayoutNode lookaheadRoot = parent$ui2 != null ? parent$ui2.getLookaheadRoot() : null;
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadRoot);
                if (lookaheadRoot.getIsVirtualLookaheadRoot()) {
                    layoutNode = layoutNode.getParent$ui();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(layoutNode);
                } else {
                    androidx.compose.ui.node.LayoutNode parent$ui3 = layoutNode.getParent$ui();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(parent$ui3);
                    layoutNode = parent$ui3.getLookaheadRoot();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(layoutNode);
                }
            } else {
                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = layoutNode.getOuterCoordinator$ui().getLookaheadDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate2);
                return lookaheadDelegate2;
            }
        }
    }
}

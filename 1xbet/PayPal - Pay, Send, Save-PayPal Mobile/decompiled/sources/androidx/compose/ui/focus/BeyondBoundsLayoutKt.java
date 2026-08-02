package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0002\b\u0006H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"T", "Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "block", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "searchBeyondBounds"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m5640searchBeyondBoundsOMvw8(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope, ? extends T> function1) {
        androidx.compose.ui.Modifier.Node node;
        androidx.compose.ui.layout.BeyondBoundsLayout beyondBoundsLayoutParent;
        int m7346getBeforehoxUOeE;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = focusTargetNode2.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            if (requireLayoutNode == null) {
                node = null;
                break;
            }
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                        node = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                break loop0;
                            }
                            if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node);
                                                }
                                                node = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node;
        if ((focusTargetNode3 != null && kotlin.jvm.internal.Intrinsics.areEqual(focusTargetNode3.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) == null) {
            return null;
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s())) {
            m7346getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m7344getAbovehoxUOeE();
        } else if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s())) {
            m7346getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m7347getBelowhoxUOeE();
        } else if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s())) {
            m7346getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m7348getLefthoxUOeE();
        } else if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s())) {
            m7346getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m7349getRighthoxUOeE();
        } else if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s())) {
            m7346getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m7345getAfterhoxUOeE();
        } else {
            if (!androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s())) {
                throw new java.lang.IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            m7346getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m7346getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo1839layouto7g1Pn8(m7346getBeforehoxUOeE, function1);
    }
}

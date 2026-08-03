package androidx.compose.ui.focus;

/* compiled from: BeyondBoundsLayout.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\u0010\u0005\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006¢\u0006\u0002\b\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"searchBeyondBounds", "T", "Landroidx/compose/ui/focus/FocusTargetNode;", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "searchBeyondBounds--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m1787searchBeyondBoundsOMvw8(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope, ? extends T> function1) {
        androidx.compose.ui.Modifier.Node node;
        androidx.compose.ui.layout.BeyondBoundsLayout beyondBoundsLayoutParent;
        int m3388getBeforehoxUOeE;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node parent = focusTargetNode2.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            if (requireLayoutNode == null) {
                node = null;
                break;
            }
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                        node = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                break loop0;
                            }
                            if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                                if (i2 == 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node;
        if ((focusTargetNode3 != null && kotlin.jvm.internal.Intrinsics.areEqual(focusTargetNode3.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) == null) {
            return null;
        }
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s())) {
            m3388getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3386getAbovehoxUOeE();
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
            m3388getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3389getBelowhoxUOeE();
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s())) {
            m3388getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3390getLefthoxUOeE();
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s())) {
            m3388getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3391getRighthoxUOeE();
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1801getNextdhqQ8s())) {
            m3388getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3387getAfterhoxUOeE();
        } else {
            if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1802getPreviousdhqQ8s())) {
                throw new java.lang.IllegalStateException("Unsupported direction for beyond bounds layout".toString());
            }
            m3388getBeforehoxUOeE = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.INSTANCE.m3388getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo728layouto7g1Pn8(m3388getBeforehoxUOeE, function1);
    }
}

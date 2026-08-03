package androidx.compose.ui.semantics;

/* compiled from: SemanticsOwner.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsOwner;", "", "rootNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "rootSemanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRootSemanticsNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedRootSemanticsNode", "getUnmergedRootSemanticsNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsOwner {
    public static final int $stable = 8;
    private final androidx.compose.ui.node.LayoutNode rootNode;

    public SemanticsOwner(androidx.compose.ui.node.LayoutNode layoutNode) {
        this.rootNode = layoutNode;
    }

    public final androidx.compose.ui.semantics.SemanticsNode getRootSemanticsNode() {
        return androidx.compose.ui.semantics.SemanticsNodeKt.SemanticsNode(this.rootNode, true);
    }

    public final androidx.compose.ui.semantics.SemanticsNode getUnmergedRootSemanticsNode() {
        androidx.compose.ui.node.NodeChain nodes = this.rootNode.getNodes();
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(8);
        java.lang.Object obj = null;
        if ((nodes.getAggregateChildKindSet() & m3613constructorimpl) != 0) {
            androidx.compose.ui.Modifier.Node head = nodes.getHead();
            loop0: while (true) {
                if (head == null) {
                    break;
                }
                if ((head.getKindSet() & m3613constructorimpl) != 0) {
                    androidx.compose.ui.Modifier.Node node = head;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof androidx.compose.ui.node.SemanticsModifierNode) {
                            obj = node;
                            break loop0;
                        }
                        if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i = 0;
                            for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
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
                            if (i == 1) {
                            }
                        }
                        node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                    break;
                }
                head = head.getChild();
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        return new androidx.compose.ui.semantics.SemanticsNode(((androidx.compose.ui.node.SemanticsModifierNode) obj).getNode(), false, this.rootNode, new androidx.compose.ui.semantics.SemanticsConfiguration());
    }
}

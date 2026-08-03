package androidx.compose.ui.node;

/* compiled from: DelegatableNode.kt */
@kotlin.Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\u001a\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a5\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\n\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0007H\u0000\u001aA\u0010\u0012\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\"\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\n\u0010\u001b\u001a\u00020\u0005*\u00020\u0002\u001a3\u0010\u001c\u001a\u0004\u0018\u0001H\u000b\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u001d*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\rH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010 \u001a\u00020!H\u0000\u001a\u0016\u0010\"\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002\u001a\"\u0010#\u001a\u00020$*\u00020\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\rH\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\n\u0010'\u001a\u00020(*\u00020\u0002\u001a\n\u0010)\u001a\u00020**\u00020\u0002\u001a\f\u0010+\u001a\u00020,*\u00020\u0002H\u0000\u001a\f\u0010-\u001a\u00020.*\u00020\u0002H\u0000\u001aK\u0010/\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\b\b\u0002\u00100\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a3\u0010/\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\b\b\u0002\u00100\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u001aA\u00103\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a)\u00103\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u001aA\u00106\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b7\u00105\u001a)\u00106\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u001aA\u00108\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b9\u00105\u001a)\u00108\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u001aM\u0010:\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\n\u0010;\u001a\u0006\u0012\u0002\b\u00030\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001aA\u0010>\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b?\u00105\u001aA\u0010@\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\bA\u00105\u001a)\u0010@\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0015H\u0080\b\u001aA\u0010B\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00010\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\bC\u00105\u001a)\u0010B\u001a\u00020\u0005*\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0015H\u0080\b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"isDelegationRoot", "", "Landroidx/compose/ui/node/DelegatableNode;", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "addLayoutNodeChildren", "", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Node;", "node", "ancestors", "", "T", "type", "Landroidx/compose/ui/node/NodeKind;", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "asLayoutModifierNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "dispatchForKind", "kind", "block", "Lkotlin/Function1;", "dispatchForKind-6rFNWt0", "(Landroidx/compose/ui/Modifier$Node;ILkotlin/jvm/functions/Function1;)V", "has", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "invalidateSubtree", "nearestAncestor", "", "nearestAncestor-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "mask", "", "pop", "requireCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireDensity", "Landroidx/compose/ui/unit/Density;", "requireLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutNode", "Landroidx/compose/ui/node/LayoutNode;", "requireOwner", "Landroidx/compose/ui/node/Owner;", "visitAncestors", "includeSelf", "visitAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;IZLkotlin/jvm/functions/Function1;)V", "visitChildren", "visitChildren-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "visitLocalAncestors", "visitLocalAncestors-6rFNWt0", "visitLocalDescendants", "visitLocalDescendants-6rFNWt0", "visitSelfAndAncestors", "untilType", "visitSelfAndAncestors-5BbP62I", "(Landroidx/compose/ui/node/DelegatableNode;IILkotlin/jvm/functions/Function1;)V", "visitSelfAndChildren", "visitSelfAndChildren-6rFNWt0", "visitSubtree", "visitSubtree-6rFNWt0", "visitSubtreeIf", "visitSubtreeIf-6rFNWt0", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatableNodeKt {
    public static final boolean isDelegationRoot(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    public static final void visitAncestors(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> function1) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        function1.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static /* synthetic */ void visitAncestors$default(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        androidx.compose.ui.node.NodeChain nodes;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        function1.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static final androidx.compose.ui.Modifier.Node nearestAncestor(androidx.compose.ui.node.DelegatableNode delegatableNode, int i) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("nearestAncestor called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i) != 0) {
                        return parent;
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    public static final void visitSubtree(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitSubtree called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        androidx.compose.ui.node.NestedVectorStack nestedVectorStack = new androidx.compose.ui.node.NestedVectorStack();
        while (requireLayoutNode != null) {
            if (child == null) {
                child = requireLayoutNode.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i) != 0) {
                        function1.invoke(child);
                    }
                    child = child.getChild();
                }
            }
            nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
            child = null;
            requireLayoutNode = nestedVectorStack.isNotEmpty() ? (androidx.compose.ui.node.LayoutNode) nestedVectorStack.pop() : null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Node> mutableVector, androidx.compose.ui.Modifier.Node node) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i = size - 1;
            androidx.compose.ui.node.LayoutNode[] content = mutableVector2.getContent();
            do {
                mutableVector.add(content[i].getNodes().getHead());
                i--;
            } while (i >= 0);
        }
    }

    public static final void visitChildren(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) == 0) {
                addLayoutNodeChildren(mutableVector, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & i) != 0) {
                        function1.invoke(node);
                        break;
                    }
                    node = node.getChild();
                }
            }
        }
    }

    public static final void visitSubtreeIf(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, java.lang.Boolean> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null; node2 = node2.getChild()) {
                    if ((node2.getKindSet() & i) == 0 || function1.invoke(node2).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }

    public static final void visitLocalDescendants(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i) == 0) {
            return;
        }
        for (androidx.compose.ui.Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
            if ((child.getKindSet() & i) != 0) {
                function1.invoke(child);
            }
        }
    }

    public static final void visitLocalAncestors(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.Modifier.Node, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        for (androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i) != 0) {
                function1.invoke(parent);
            }
        }
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final /* synthetic */ <T> void m3515visitSelfAndAncestors5BbP62I(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, int i2, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        int i3 = i | i2;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node node2 = delegatableNode.getNode();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i3) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i3) != 0) {
                        if (node2 != node && (node2.getKindSet() & i2) != 0) {
                            return;
                        }
                        if ((node2.getKindSet() & i) != 0) {
                            androidx.compose.ui.Modifier.Node node3 = node2;
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            while (node3 != null) {
                                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                                if (node3 instanceof java.lang.Object) {
                                    function1.invoke(node3);
                                } else if ((node3.getKindSet() & i) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i4 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & i) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                node3 = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (node3 != null) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(node3);
                                                    }
                                                    node3 = null;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                node3 = pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node2 = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: visitSelfAndChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3516visitSelfAndChildren6rFNWt0(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (node instanceof java.lang.Object) {
                function1.invoke(node);
            } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i2 = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & i) != 0) {
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
            node = pop(mutableVector);
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector2, delegatableNode.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node2 = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node2.getAggregateChildKindSet() & i) == 0) {
                addLayoutNodeChildren(mutableVector2, node2);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet() & i) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node2 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node2 instanceof java.lang.Object) {
                                function1.invoke(node2);
                            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i3 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                    if ((delegate2.getKindSet() & i) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            node2 = delegate2;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(node2);
                                                }
                                                node2 = null;
                                            }
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(delegate2);
                                            }
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            node2 = pop(mutableVector3);
                        }
                    } else {
                        node2 = node2.getChild();
                    }
                }
            }
        }
    }

    /* renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m3507has64DMado(androidx.compose.ui.node.DelegatableNode delegatableNode, int i) {
        return (delegatableNode.getNode().getAggregateChildKindSet() & i) != 0;
    }

    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final androidx.compose.ui.node.NodeCoordinator m3509requireCoordinator64DMado(androidx.compose.ui.node.DelegatableNode delegatableNode, int i) {
        androidx.compose.ui.node.NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        kotlin.jvm.internal.Intrinsics.checkNotNull(coordinator);
        if (coordinator.getTail() != delegatableNode || !androidx.compose.ui.node.NodeKindKt.m3622getIncludeSelfInTraversalH91voCI(i)) {
            return coordinator;
        }
        androidx.compose.ui.node.NodeCoordinator wrapped = coordinator.getWrapped();
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrapped);
        return wrapped;
    }

    public static final androidx.compose.ui.node.LayoutNode requireLayoutNode(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        androidx.compose.ui.node.NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        if (coordinator == null) {
            throw new java.lang.IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
        }
        return coordinator.getLayoutNode();
    }

    public static final androidx.compose.ui.node.Owner requireOwner(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        androidx.compose.ui.node.Owner owner = requireLayoutNode(delegatableNode).getOwner();
        if (owner != null) {
            return owner;
        }
        throw new java.lang.IllegalStateException("This node does not have an owner.".toString());
    }

    public static final androidx.compose.ui.unit.Density requireDensity(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final androidx.compose.ui.unit.LayoutDirection requireLayoutDirection(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final void invalidateSubtree(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.node.LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    /* renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3506dispatchForKind6rFNWt0(androidx.compose.ui.Modifier.Node node, int i, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != null) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (node instanceof java.lang.Object) {
                function1.invoke(node);
            } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i2 = 0;
                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & i) != 0) {
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
            node = pop(mutableVector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.Modifier.Node pop(androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.isEmpty()) {
            return null;
        }
        return mutableVector.removeAt(mutableVector.getSize() - 1);
    }

    /* renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3514visitLocalDescendants6rFNWt0(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i) != 0) {
            for (androidx.compose.ui.Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i) != 0) {
                    androidx.compose.ui.Modifier.Node node2 = child;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (node2 != null) {
                        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                        if (node2 instanceof java.lang.Object) {
                            function1.invoke(node2);
                        } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i2 = 0;
                            for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & i) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        node2 = delegate;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        if (node2 != null) {
                                            if (mutableVector != null) {
                                                mutableVector.add(node2);
                                            }
                                            node2 = null;
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
                        node2 = pop(mutableVector);
                    }
                }
            }
        }
    }

    /* renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3513visitLocalAncestors6rFNWt0(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        for (androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i) != 0) {
                androidx.compose.ui.Modifier.Node node = parent;
                androidx.compose.runtime.collection.MutableVector mutableVector = null;
                while (node != null) {
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                    if (node instanceof java.lang.Object) {
                        function1.invoke(node);
                    } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                        int i2 = 0;
                        for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                            if ((delegate.getKindSet() & i) != 0) {
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
                    node = pop(mutableVector);
                }
            }
        }
    }

    /* renamed from: visitAncestors-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m3510visitAncestorsYYKmho(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node2 = node;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node2 instanceof java.lang.Object) {
                                function1.invoke(node2);
                            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node2 = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(node2);
                                                }
                                                node2 = null;
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
                            node2 = pop(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: visitAncestors-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m3511visitAncestorsYYKmho$default(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, boolean z, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        androidx.compose.ui.node.NodeChain nodes;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node2 = node;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (!(node2 instanceof java.lang.Object)) {
                                if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i3 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & i) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                node2 = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(node2);
                                                    }
                                                    node2 = null;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                            } else {
                                function1.invoke(node2);
                            }
                            node2 = pop(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> java.util.List<T> m3505ancestors64DMado(androidx.compose.ui.node.DelegatableNode delegatableNode, int i) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        java.util.ArrayList arrayList = null;
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node instanceof java.lang.Object) {
                                if (arrayList == null) {
                                    arrayList = new java.util.ArrayList();
                                }
                                arrayList.add(node);
                            } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
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
                            node = pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return arrayList;
    }

    /* renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m3508nearestAncestor64DMado(androidx.compose.ui.node.DelegatableNode delegatableNode, int i) {
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i) != 0) {
                        java.lang.Object obj = (T) parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (obj != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (obj instanceof java.lang.Object) {
                                return (T) obj;
                            }
                            java.lang.Object obj2 = obj;
                            if ((((androidx.compose.ui.Modifier.Node) obj).getKindSet() & i) != 0 && (obj instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = obj.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            obj = (T) delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            java.lang.Object obj3 = obj;
                                            if (obj != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(obj);
                                                }
                                                obj = (T) null;
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
                            obj = (T) pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* renamed from: visitSubtree-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3517visitSubtree6rFNWt0(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitSubtree called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        androidx.compose.ui.node.NestedVectorStack nestedVectorStack = new androidx.compose.ui.node.NestedVectorStack();
        while (requireLayoutNode != null) {
            if (child == null) {
                child = requireLayoutNode.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node = child;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node instanceof java.lang.Object) {
                                function1.invoke(node);
                            } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
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
                            node = pop(mutableVector);
                        }
                    }
                    child = child.getChild();
                }
            }
            nestedVectorStack.push(requireLayoutNode.get_children$ui_release());
            requireLayoutNode = nestedVectorStack.isNotEmpty() ? (androidx.compose.ui.node.LayoutNode) nestedVectorStack.pop() : null;
            child = null;
        }
    }

    /* renamed from: visitChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3512visitChildren6rFNWt0(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) == 0) {
                addLayoutNodeChildren(mutableVector, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & i) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node instanceof java.lang.Object) {
                                function1.invoke(node);
                            } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(node);
                                                }
                                                node = null;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = pop(mutableVector2);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
    }

    /* renamed from: visitSubtreeIf-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3518visitSubtreeIf6rFNWt0(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null; node2 = node2.getChild()) {
                    if ((node2.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node3 = node2;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node3 instanceof java.lang.Object) {
                                if (!function1.invoke(node3).booleanValue()) {
                                    break;
                                }
                            } else if ((node3.getKindSet() & i) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node3 = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node3 != null) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(node3);
                                                }
                                                node3 = null;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node3 = pop(mutableVector2);
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.node.LayoutModifierNode asLayoutModifierNode(androidx.compose.ui.Modifier.Node node) {
        if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(2) & node.getKindSet()) != 0) {
            if (node instanceof androidx.compose.ui.node.LayoutModifierNode) {
                return (androidx.compose.ui.node.LayoutModifierNode) node;
            }
            if (node instanceof androidx.compose.ui.node.DelegatingNode) {
                androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate();
                while (delegate != 0) {
                    if (delegate instanceof androidx.compose.ui.node.LayoutModifierNode) {
                        return (androidx.compose.ui.node.LayoutModifierNode) delegate;
                    }
                    if ((delegate instanceof androidx.compose.ui.node.DelegatingNode) && (androidx.compose.ui.node.NodeKind.m3613constructorimpl(2) & delegate.getKindSet()) != 0) {
                        delegate = ((androidx.compose.ui.node.DelegatingNode) delegate).getDelegate();
                    } else {
                        delegate = delegate.getChild();
                    }
                }
            }
        }
        return null;
    }
}

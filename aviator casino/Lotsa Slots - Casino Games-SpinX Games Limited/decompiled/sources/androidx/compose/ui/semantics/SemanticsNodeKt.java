package androidx.compose.ui.semantics;

/* compiled from: SemanticsNode.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\"\u0010\n\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0000\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0007H\u0002\u001a\"\u0010\u0011\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0013H\u0000\u001a\f\u0010\u0014\u001a\u00020\u0010*\u00020\u0007H\u0002\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"outerMergingSemantics", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/LayoutNode;", "getOuterMergingSemantics", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/SemanticsModifierNode;", "role", "Landroidx/compose/ui/semantics/Role;", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRole", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;", "SemanticsNode", "layoutNode", "mergingEnabled", "", "outerSemanticsNode", "contentDescriptionFakeNodeId", "", "findClosestParentNode", "selector", "Lkotlin/Function1;", "roleFakeNodeId", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsNodeKt {
    public static final androidx.compose.ui.semantics.SemanticsNode SemanticsNode(androidx.compose.ui.node.LayoutNode layoutNode, boolean z) {
        androidx.compose.ui.node.NodeChain nodes = layoutNode.getNodes();
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
        androidx.compose.ui.Modifier.Node node2 = ((androidx.compose.ui.node.SemanticsModifierNode) obj).getNode();
        androidx.compose.ui.semantics.SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(collapsedSemantics$ui_release);
        return new androidx.compose.ui.semantics.SemanticsNode(node2, z, layoutNode, collapsedSemantics$ui_release);
    }

    public static /* synthetic */ androidx.compose.ui.semantics.SemanticsNode SemanticsNode$default(androidx.compose.ui.node.SemanticsModifierNode semanticsModifierNode, boolean z, androidx.compose.ui.node.LayoutNode layoutNode, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            layoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(semanticsModifierNode);
        }
        return SemanticsNode(semanticsModifierNode, z, layoutNode);
    }

    public static final androidx.compose.ui.semantics.SemanticsNode SemanticsNode(androidx.compose.ui.node.SemanticsModifierNode semanticsModifierNode, boolean z, androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.Modifier.Node node = semanticsModifierNode.getNode();
        androidx.compose.ui.semantics.SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        if (collapsedSemantics$ui_release == null) {
            collapsedSemantics$ui_release = new androidx.compose.ui.semantics.SemanticsConfiguration();
        }
        return new androidx.compose.ui.semantics.SemanticsNode(node, z, layoutNode, collapsedSemantics$ui_release);
    }

    public static final androidx.compose.ui.node.SemanticsModifierNode getOuterMergingSemantics(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.node.NodeChain nodes = layoutNode.getNodes();
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
                            if (((androidx.compose.ui.node.SemanticsModifierNode) node).getShouldMergeDescendantSemantics()) {
                                obj = node;
                                break loop0;
                            }
                        } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
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
        return (androidx.compose.ui.node.SemanticsModifierNode) obj;
    }

    public static final androidx.compose.ui.node.LayoutNode findClosestParentNode(androidx.compose.ui.node.LayoutNode layoutNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.LayoutNode, java.lang.Boolean> function1) {
        for (androidx.compose.ui.node.LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (function1.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.semantics.Role getRole(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int roleFakeNodeId(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }
}

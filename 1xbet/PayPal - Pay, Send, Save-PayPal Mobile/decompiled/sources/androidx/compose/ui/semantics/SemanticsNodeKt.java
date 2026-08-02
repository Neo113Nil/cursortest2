package androidx.compose.ui.semantics;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\t\u001a*\u0010\f\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\nH\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0010\"\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "mergingEnabled", "Landroidx/compose/ui/semantics/SemanticsNode;", "SemanticsNode", "(Landroidx/compose/ui/node/LayoutNode;Z)Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "outerSemanticsNode", "(Landroidx/compose/ui/node/SemanticsModifierNode;ZLandroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Function1;", "selector", "findClosestParentNode", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/LayoutNode;", "", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/semantics/Role;", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SemanticsNodeKt {
    public static final androidx.compose.ui.semantics.SemanticsNode SemanticsNode(androidx.compose.ui.node.LayoutNode layoutNode, boolean z) {
        androidx.compose.ui.node.NodeChain nodes = layoutNode.getNodes();
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(8);
        java.lang.Object obj = null;
        if ((nodes.getHighSpeedVideoFpsRangesFor() & m7621constructorimpl) != 0) {
            androidx.compose.ui.Modifier.Node head = nodes.getHead();
            loop0: while (true) {
                if (head == null) {
                    break;
                }
                if ((head.getKindSet() & m7621constructorimpl) != 0) {
                    androidx.compose.ui.Modifier.Node node = head;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (node != null) {
                        if (node instanceof androidx.compose.ui.node.SemanticsModifierNode) {
                            obj = node;
                            break loop0;
                        }
                        if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i = 0;
                            for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                            if (i != 1) {
                            }
                        }
                        node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                    }
                }
                if ((head.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                    break;
                }
                head = head.getChild();
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
        androidx.compose.ui.Modifier.Node node2 = ((androidx.compose.ui.node.SemanticsModifierNode) obj).getNode();
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        if (semanticsConfiguration == null) {
            semanticsConfiguration = new androidx.compose.ui.semantics.SemanticsConfiguration();
        }
        return new androidx.compose.ui.semantics.SemanticsNode(node2, z, layoutNode, semanticsConfiguration);
    }

    public static /* synthetic */ androidx.compose.ui.semantics.SemanticsNode SemanticsNode$default(androidx.compose.ui.node.SemanticsModifierNode semanticsModifierNode, boolean z, androidx.compose.ui.node.LayoutNode layoutNode, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            layoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(semanticsModifierNode);
        }
        return SemanticsNode(semanticsModifierNode, z, layoutNode);
    }

    public static final androidx.compose.ui.semantics.SemanticsNode SemanticsNode(androidx.compose.ui.node.SemanticsModifierNode semanticsModifierNode, boolean z, androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.Modifier.Node node = semanticsModifierNode.getNode();
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        if (semanticsConfiguration == null) {
            semanticsConfiguration = new androidx.compose.ui.semantics.SemanticsConfiguration();
        }
        return new androidx.compose.ui.semantics.SemanticsNode(node, z, layoutNode, semanticsConfiguration);
    }

    public static final androidx.compose.ui.node.LayoutNode findClosestParentNode(androidx.compose.ui.node.LayoutNode layoutNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.LayoutNode, java.lang.Boolean> function1) {
        for (androidx.compose.ui.node.LayoutNode parent$ui = layoutNode.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (function1.invoke(parent$ui).booleanValue()) {
                return parent$ui;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.semantics.Role getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Camera2StreamConfigurationMap(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }
}

package androidx.compose.ui.node;

/* compiled from: NodeKind.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0000\u001a \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0000\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a#\u0010\u001c\u001a\u00020\t*\u00020\u00012\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\nH\u0080\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010 \u001a\u00020\u0001*\u00020\u00012\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\nH\u0080\fø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\f\u0010$\u001a\u00020\u000e*\u00020%H\u0002\u001a\f\u0010&\u001a\u00020\t*\u00020%H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u001c\u0010\b\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Inserted", "", "getInserted$annotations", "()V", "Removed", "getRemoved$annotations", "Updated", "getUpdated$annotations", "includeSelfInTraversal", "", "Landroidx/compose/ui/node/NodeKind;", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "autoInvalidateInsertedNode", "", "node", "Landroidx/compose/ui/Modifier$Node;", "autoInvalidateNodeIncludingDelegates", "remainingSet", "phase", "autoInvalidateNodeSelf", "selfKindSet", "autoInvalidateRemovedNode", "autoInvalidateUpdatedNode", "calculateNodeKindSetFrom", "element", "Landroidx/compose/ui/Modifier$Element;", "calculateNodeKindSetFromIncludingDelegates", "contains", "value", "contains-64DMado", "(II)Z", "or", "other", "or-64DMado", "(II)I", "scheduleInvalidationOfAssociatedFocusTargets", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "specifiesCanFocusProperty", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;

    /* renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m3621contains64DMado(int i, int i2) {
        return (i & i2) != 0;
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    /* renamed from: or-64DMado, reason: not valid java name */
    public static final int m3623or64DMado(int i, int i2) {
        return i | i2;
    }

    public static final int calculateNodeKindSetFrom(androidx.compose.ui.Modifier.Node node) {
        if (node.getKindSet() != 0) {
            return node.getKindSet();
        }
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1);
        if (node instanceof androidx.compose.ui.node.LayoutModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(2);
        }
        if (node instanceof androidx.compose.ui.node.DrawModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(4);
        }
        if (node instanceof androidx.compose.ui.node.SemanticsModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(8);
        }
        if (node instanceof androidx.compose.ui.node.PointerInputModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(16);
        }
        if (node instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(32);
        }
        if (node instanceof androidx.compose.ui.node.ParentDataModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(64);
        }
        if (node instanceof androidx.compose.ui.node.LayoutAwareModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(128);
        }
        if (node instanceof androidx.compose.ui.node.GlobalPositionAwareModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(256);
        }
        if (node instanceof androidx.compose.ui.layout.IntermediateLayoutModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(512);
        }
        if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        }
        if (node instanceof androidx.compose.ui.focus.FocusPropertiesModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(2048);
        }
        if (node instanceof androidx.compose.ui.focus.FocusEventModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(4096);
        }
        if (node instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(8192);
        }
        if (node instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(16384);
        }
        if (node instanceof androidx.compose.ui.node.CompositionLocalConsumerModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(32768);
        }
        if (node instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(131072);
        }
        return node instanceof androidx.compose.ui.node.TraversableNode ? m3613constructorimpl | androidx.compose.ui.node.NodeKind.m3613constructorimpl(262144) : m3613constructorimpl;
    }

    public static final void autoInvalidateRemovedNode(androidx.compose.ui.Modifier.Node node) {
        if (!node.getIsAttached()) {
            throw new java.lang.IllegalStateException("autoInvalidateRemovedNode called on unattached node".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateInsertedNode(androidx.compose.ui.Modifier.Node node) {
        if (!node.getIsAttached()) {
            throw new java.lang.IllegalStateException("autoInvalidateInsertedNode called on unattached node".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateUpdatedNode(androidx.compose.ui.Modifier.Node node) {
        if (!node.getIsAttached()) {
            throw new java.lang.IllegalStateException("autoInvalidateUpdatedNode called on unattached node".toString());
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final void autoInvalidateNodeIncludingDelegates(androidx.compose.ui.Modifier.Node node, int i, int i2) {
        if (node instanceof androidx.compose.ui.node.DelegatingNode) {
            androidx.compose.ui.node.DelegatingNode delegatingNode = (androidx.compose.ui.node.DelegatingNode) node;
            autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet() & i, i2);
            int i3 = (~delegatingNode.getSelfKindSet()) & i;
            for (androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                autoInvalidateNodeIncludingDelegates(delegate, i3, i2);
            }
            return;
        }
        autoInvalidateNodeSelf(node, i & node.getKindSet(), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(androidx.compose.ui.Modifier.Node node, int i, int i2) {
        if (i2 != 0 || node.getShouldAutoInvalidate()) {
            if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(2) & i) != 0 && (node instanceof androidx.compose.ui.node.LayoutModifierNode)) {
                androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement((androidx.compose.ui.node.LayoutModifierNode) node);
                if (i2 == 2) {
                    androidx.compose.ui.node.DelegatableNodeKt.m3509requireCoordinator64DMado(node, androidx.compose.ui.node.NodeKind.m3613constructorimpl(2)).onRelease();
                }
            }
            if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(256) & i) != 0 && (node instanceof androidx.compose.ui.node.GlobalPositionAwareModifierNode)) {
                androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(4) & i) != 0 && (node instanceof androidx.compose.ui.node.DrawModifierNode)) {
                androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw((androidx.compose.ui.node.DrawModifierNode) node);
            }
            if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(8) & i) != 0 && (node instanceof androidx.compose.ui.node.SemanticsModifierNode)) {
                androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics((androidx.compose.ui.node.SemanticsModifierNode) node);
            }
            if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(64) & i) != 0 && (node instanceof androidx.compose.ui.node.ParentDataModifierNode)) {
                androidx.compose.ui.node.ParentDataModifierNodeKt.invalidateParentData((androidx.compose.ui.node.ParentDataModifierNode) node);
            }
            if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024) & i) != 0 && (node instanceof androidx.compose.ui.focus.FocusTargetNode)) {
                if (i2 == 2) {
                    node.onReset();
                } else {
                    androidx.compose.ui.node.DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((androidx.compose.ui.focus.FocusTargetNode) node);
                }
            }
            if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(2048) & i) != 0 && (node instanceof androidx.compose.ui.focus.FocusPropertiesModifierNode)) {
                androidx.compose.ui.focus.FocusPropertiesModifierNode focusPropertiesModifierNode = (androidx.compose.ui.focus.FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    if (i2 == 2) {
                        scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                    } else {
                        androidx.compose.ui.focus.FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                    }
                }
            }
            if ((i & androidx.compose.ui.node.NodeKind.m3613constructorimpl(4096)) == 0 || !(node instanceof androidx.compose.ui.focus.FocusEventModifierNode)) {
                return;
            }
            androidx.compose.ui.focus.FocusEventModifierNodeKt.invalidateFocusEvent((androidx.compose.ui.focus.FocusEventModifierNode) node);
        }
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(androidx.compose.ui.focus.FocusPropertiesModifierNode focusPropertiesModifierNode) {
        androidx.compose.ui.focus.FocusPropertiesModifierNode focusPropertiesModifierNode2 = focusPropertiesModifierNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!focusPropertiesModifierNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusPropertiesModifierNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode2.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNodeKt.invalidateFocusTarget((androidx.compose.ui.focus.FocusTargetNode) node);
                            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector2);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
    }

    private static final boolean specifiesCanFocusProperty(androidx.compose.ui.focus.FocusPropertiesModifierNode focusPropertiesModifierNode) {
        androidx.compose.ui.node.CanFocusChecker.INSTANCE.reset();
        focusPropertiesModifierNode.applyFocusProperties(androidx.compose.ui.node.CanFocusChecker.INSTANCE);
        return androidx.compose.ui.node.CanFocusChecker.INSTANCE.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(androidx.compose.ui.Modifier.Node node) {
        if (node instanceof androidx.compose.ui.node.DelegatingNode) {
            androidx.compose.ui.node.DelegatingNode delegatingNode = (androidx.compose.ui.node.DelegatingNode) node;
            int selfKindSet = delegatingNode.getSelfKindSet();
            for (androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                selfKindSet |= calculateNodeKindSetFromIncludingDelegates(delegate);
            }
            return selfKindSet;
        }
        return calculateNodeKindSetFrom(node);
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m3622getIncludeSelfInTraversalH91voCI(int i) {
        return (i & androidx.compose.ui.node.NodeKind.m3613constructorimpl(128)) != 0;
    }

    public static final int calculateNodeKindSetFrom(androidx.compose.ui.Modifier.Element element) {
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1);
        if (element instanceof androidx.compose.ui.layout.LayoutModifier) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(2);
        }
        if (element instanceof androidx.compose.ui.draw.DrawModifier) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(4);
        }
        if (element instanceof androidx.compose.ui.semantics.SemanticsModifier) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(8);
        }
        if (element instanceof androidx.compose.ui.input.pointer.PointerInputModifier) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(16);
        }
        if ((element instanceof androidx.compose.ui.modifier.ModifierLocalConsumer) || (element instanceof androidx.compose.ui.modifier.ModifierLocalProvider)) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(32);
        }
        if (element instanceof androidx.compose.ui.focus.FocusEventModifier) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(4096);
        }
        if (element instanceof androidx.compose.ui.focus.FocusOrderModifier) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(2048);
        }
        if (element instanceof androidx.compose.ui.layout.OnGloballyPositionedModifier) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(256);
        }
        if (element instanceof androidx.compose.ui.layout.ParentDataModifier) {
            m3613constructorimpl |= androidx.compose.ui.node.NodeKind.m3613constructorimpl(64);
        }
        return ((element instanceof androidx.compose.ui.layout.OnPlacedModifier) || (element instanceof androidx.compose.ui.layout.OnRemeasuredModifier)) ? m3613constructorimpl | androidx.compose.ui.node.NodeKind.m3613constructorimpl(128) : m3613constructorimpl;
    }
}

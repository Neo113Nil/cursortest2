package androidx.compose.ui.focus;

/* compiled from: FocusInvalidationManager.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\rJ%\u0010\u000f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\b2\u0006\u0010\u0010\u001a\u0002H\u0011H\u0002¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusEventNodes", "", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "focusPropertiesNodes", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "focusTargetNodes", "Landroidx/compose/ui/focus/FocusTargetNode;", "invalidateNodes", "scheduleInvalidation", "node", "T", "(Ljava/util/Set;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;
    private final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> onRequestApplyChangesListener;
    private java.util.Set<androidx.compose.ui.focus.FocusTargetNode> focusTargetNodes = new java.util.LinkedHashSet();
    private java.util.Set<androidx.compose.ui.focus.FocusEventModifierNode> focusEventNodes = new java.util.LinkedHashSet();
    private java.util.Set<androidx.compose.ui.focus.FocusPropertiesModifierNode> focusPropertiesNodes = new java.util.LinkedHashSet();
    private final kotlin.jvm.functions.Function0<kotlin.Unit> invalidateNodes = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusInvalidationManager$invalidateNodes$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            invoke2();
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            java.util.Set set;
            java.util.Set set2;
            java.util.Set<androidx.compose.ui.focus.FocusEventModifierNode> set3;
            java.util.Set set4;
            java.util.Set<androidx.compose.ui.focus.FocusTargetNode> set5;
            java.util.Set set6;
            java.util.Set set7;
            java.util.Set set8;
            java.util.Set set9;
            androidx.compose.ui.focus.FocusStateImpl focusStateImpl;
            androidx.compose.ui.focus.FocusStateImpl focusStateImpl2;
            java.util.Set set10;
            java.util.Set set11;
            java.util.Set set12;
            java.util.Set set13;
            set = androidx.compose.ui.focus.FocusInvalidationManager.this.focusPropertiesNodes;
            androidx.compose.ui.focus.FocusInvalidationManager focusInvalidationManager = androidx.compose.ui.focus.FocusInvalidationManager.this;
            java.util.Iterator it = set.iterator();
            while (true) {
                int i = 1024;
                int i2 = 1;
                if (!it.hasNext()) {
                    set2 = androidx.compose.ui.focus.FocusInvalidationManager.this.focusPropertiesNodes;
                    set2.clear();
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                    set3 = androidx.compose.ui.focus.FocusInvalidationManager.this.focusEventNodes;
                    androidx.compose.ui.focus.FocusInvalidationManager focusInvalidationManager2 = androidx.compose.ui.focus.FocusInvalidationManager.this;
                    for (androidx.compose.ui.focus.FocusEventModifierNode focusEventModifierNode : set3) {
                        if (focusEventModifierNode.getNode().getIsAttached()) {
                            androidx.compose.ui.focus.FocusEventModifierNode focusEventModifierNode2 = focusEventModifierNode;
                            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(i);
                            androidx.compose.ui.Modifier.Node node = focusEventModifierNode2.getNode();
                            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = null;
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            boolean z = true;
                            boolean z2 = false;
                            while (node != null) {
                                if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                    androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) node;
                                    if (focusTargetNode != null) {
                                        z2 = true;
                                    }
                                    set11 = focusInvalidationManager2.focusTargetNodes;
                                    if (set11.contains(focusTargetNode2)) {
                                        linkedHashSet.add(focusTargetNode2);
                                        z = false;
                                    }
                                    focusTargetNode = focusTargetNode2;
                                } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate();
                                    int i3 = 0;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                            i3++;
                                            if (i3 == i2) {
                                                node = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (node != null) {
                                                    if (mutableVector != null) {
                                                        java.lang.Boolean.valueOf(mutableVector.add(node));
                                                    }
                                                    node = null;
                                                }
                                                if (mutableVector != null) {
                                                    java.lang.Boolean.valueOf(mutableVector.add(delegate));
                                                }
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        i2 = 1;
                                    }
                                    if (i3 == 1) {
                                        i2 = 1;
                                    }
                                }
                                node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                                i2 = 1;
                            }
                            if (!focusEventModifierNode2.getNode().getIsAttached()) {
                                throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
                            }
                            androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            androidx.compose.ui.Modifier.Node child = focusEventModifierNode2.getNode().getChild();
                            if (child == null) {
                                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusEventModifierNode2.getNode());
                            } else {
                                mutableVector2.add(child);
                            }
                            while (mutableVector2.isNotEmpty()) {
                                androidx.compose.ui.Modifier.Node node2 = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                                if ((node2.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                                    androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2);
                                } else {
                                    while (node2 != null) {
                                        if ((node2.getKindSet() & m3613constructorimpl) != 0) {
                                            androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                                            while (node2 != null) {
                                                if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                                    androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node2;
                                                    if (focusTargetNode != null) {
                                                        z2 = true;
                                                    }
                                                    set10 = focusInvalidationManager2.focusTargetNodes;
                                                    if (set10.contains(focusTargetNode3)) {
                                                        linkedHashSet.add(focusTargetNode3);
                                                        z = false;
                                                    }
                                                    focusTargetNode = focusTargetNode3;
                                                } else if ((node2.getKindSet() & m3613constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                                    int i4 = 0;
                                                    for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                                        if ((delegate2.getKindSet() & m3613constructorimpl) != 0) {
                                                            i4++;
                                                            if (i4 == 1) {
                                                                node2 = delegate2;
                                                            } else {
                                                                if (mutableVector3 == null) {
                                                                    mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                                }
                                                                if (node2 != null) {
                                                                    if (mutableVector3 != null) {
                                                                        java.lang.Boolean.valueOf(mutableVector3.add(node2));
                                                                    }
                                                                    node2 = null;
                                                                }
                                                                if (mutableVector3 != null) {
                                                                    java.lang.Boolean.valueOf(mutableVector3.add(delegate2));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if (i4 != 1) {
                                                        node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                                                    }
                                                }
                                                node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                                            }
                                        } else {
                                            node2 = node2.getChild();
                                        }
                                    }
                                }
                            }
                            if (z) {
                                if (z2) {
                                    focusStateImpl2 = androidx.compose.ui.focus.FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                                } else {
                                    if (focusTargetNode == null || (focusStateImpl = focusTargetNode.getFocusState()) == null) {
                                        focusStateImpl = androidx.compose.ui.focus.FocusStateImpl.Inactive;
                                    }
                                    focusStateImpl2 = focusStateImpl;
                                }
                                focusEventModifierNode.onFocusEvent(focusStateImpl2);
                            }
                        } else {
                            focusEventModifierNode.onFocusEvent(androidx.compose.ui.focus.FocusStateImpl.Inactive);
                        }
                        i = 1024;
                        i2 = 1;
                    }
                    set4 = androidx.compose.ui.focus.FocusInvalidationManager.this.focusEventNodes;
                    set4.clear();
                    set5 = androidx.compose.ui.focus.FocusInvalidationManager.this.focusTargetNodes;
                    for (androidx.compose.ui.focus.FocusTargetNode focusTargetNode4 : set5) {
                        if (focusTargetNode4.getIsAttached()) {
                            androidx.compose.ui.focus.FocusStateImpl focusState = focusTargetNode4.getFocusState();
                            focusTargetNode4.invalidateFocus$ui_release();
                            if (focusState != focusTargetNode4.getFocusState() || linkedHashSet.contains(focusTargetNode4)) {
                                androidx.compose.ui.focus.FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode4);
                            }
                        }
                    }
                    set6 = androidx.compose.ui.focus.FocusInvalidationManager.this.focusTargetNodes;
                    set6.clear();
                    linkedHashSet.clear();
                    set7 = androidx.compose.ui.focus.FocusInvalidationManager.this.focusPropertiesNodes;
                    if (!set7.isEmpty()) {
                        throw new java.lang.IllegalStateException("Unprocessed FocusProperties nodes".toString());
                    }
                    set8 = androidx.compose.ui.focus.FocusInvalidationManager.this.focusEventNodes;
                    if (!set8.isEmpty()) {
                        throw new java.lang.IllegalStateException("Unprocessed FocusEvent nodes".toString());
                    }
                    set9 = androidx.compose.ui.focus.FocusInvalidationManager.this.focusTargetNodes;
                    if (!set9.isEmpty()) {
                        throw new java.lang.IllegalStateException("Unprocessed FocusTarget nodes".toString());
                    }
                    return;
                }
                androidx.compose.ui.focus.FocusPropertiesModifierNode focusPropertiesModifierNode = (androidx.compose.ui.focus.FocusPropertiesModifierNode) it.next();
                if (focusPropertiesModifierNode.getNode().getIsAttached()) {
                    androidx.compose.ui.focus.FocusPropertiesModifierNode focusPropertiesModifierNode2 = focusPropertiesModifierNode;
                    int m3613constructorimpl2 = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
                    androidx.compose.ui.Modifier.Node node3 = focusPropertiesModifierNode2.getNode();
                    androidx.compose.runtime.collection.MutableVector mutableVector4 = null;
                    while (node3 != null) {
                        if (node3 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                            set13 = focusInvalidationManager.focusTargetNodes;
                            set13.add((androidx.compose.ui.focus.FocusTargetNode) node3);
                        } else if ((node3.getKindSet() & m3613constructorimpl2) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                            int i5 = 0;
                            for (androidx.compose.ui.Modifier.Node delegate3 = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                                if ((delegate3.getKindSet() & m3613constructorimpl2) != 0) {
                                    i5++;
                                    if (i5 == 1) {
                                        node3 = delegate3;
                                    } else {
                                        if (mutableVector4 == null) {
                                            mutableVector4 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                        }
                                        if (node3 != null) {
                                            if (mutableVector4 != null) {
                                                java.lang.Boolean.valueOf(mutableVector4.add(node3));
                                            }
                                            node3 = null;
                                        }
                                        if (mutableVector4 != null) {
                                            java.lang.Boolean.valueOf(mutableVector4.add(delegate3));
                                        }
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                        node3 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector4);
                    }
                    if (!focusPropertiesModifierNode2.getNode().getIsAttached()) {
                        throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
                    }
                    androidx.compose.runtime.collection.MutableVector mutableVector5 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                    androidx.compose.ui.Modifier.Node child2 = focusPropertiesModifierNode2.getNode().getChild();
                    if (child2 == null) {
                        androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, focusPropertiesModifierNode2.getNode());
                    } else {
                        mutableVector5.add(child2);
                    }
                    while (mutableVector5.isNotEmpty()) {
                        androidx.compose.ui.Modifier.Node node4 = (androidx.compose.ui.Modifier.Node) mutableVector5.removeAt(mutableVector5.getSize() - 1);
                        if ((node4.getAggregateChildKindSet() & m3613constructorimpl2) == 0) {
                            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, node4);
                        } else {
                            while (true) {
                                if (node4 == null) {
                                    break;
                                }
                                if ((node4.getKindSet() & m3613constructorimpl2) != 0) {
                                    androidx.compose.runtime.collection.MutableVector mutableVector6 = null;
                                    while (node4 != null) {
                                        if (node4 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                            set12 = focusInvalidationManager.focusTargetNodes;
                                            set12.add((androidx.compose.ui.focus.FocusTargetNode) node4);
                                        } else if ((node4.getKindSet() & m3613constructorimpl2) != 0 && (node4 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                            int i6 = 0;
                                            for (androidx.compose.ui.Modifier.Node delegate4 = ((androidx.compose.ui.node.DelegatingNode) node4).getDelegate(); delegate4 != null; delegate4 = delegate4.getChild()) {
                                                if ((delegate4.getKindSet() & m3613constructorimpl2) != 0) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        node4 = delegate4;
                                                    } else {
                                                        if (mutableVector6 == null) {
                                                            mutableVector6 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                        }
                                                        if (node4 != null) {
                                                            if (mutableVector6 != null) {
                                                                java.lang.Boolean.valueOf(mutableVector6.add(node4));
                                                            }
                                                            node4 = null;
                                                        }
                                                        if (mutableVector6 != null) {
                                                            java.lang.Boolean.valueOf(mutableVector6.add(delegate4));
                                                        }
                                                    }
                                                }
                                            }
                                            if (i6 == 1) {
                                            }
                                        }
                                        node4 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector6);
                                    }
                                } else {
                                    node4 = node4.getChild();
                                }
                            }
                        }
                    }
                }
            }
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function1) {
        this.onRequestApplyChangesListener = function1;
    }

    public final void scheduleInvalidation(androidx.compose.ui.focus.FocusTargetNode node) {
        scheduleInvalidation(this.focusTargetNodes, node);
    }

    public final void scheduleInvalidation(androidx.compose.ui.focus.FocusEventModifierNode node) {
        scheduleInvalidation(this.focusEventNodes, node);
    }

    public final void scheduleInvalidation(androidx.compose.ui.focus.FocusPropertiesModifierNode node) {
        scheduleInvalidation(this.focusPropertiesNodes, node);
    }

    private final <T> void scheduleInvalidation(java.util.Set<T> set, T t) {
        if (set.add(t) && this.focusTargetNodes.size() + this.focusEventNodes.size() + this.focusPropertiesNodes.size() == 1) {
            this.onRequestApplyChangesListener.invoke(this.invalidateNodes);
        }
    }
}

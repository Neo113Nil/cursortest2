package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001a/\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\r\u001a/\u0010\u000f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a/\u0010\u0011\u001a\u00020\u000b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\b¢\u0006\u0004\b\u0011\u0010\r\u001a/\u0010\u0011\u001a\u00020\u000b\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\b¢\u0006\u0004\b\u0011\u0010\u000e"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "key", "Landroidx/compose/ui/node/TraversableNode;", "findNearestAncestor", "(Landroidx/compose/ui/node/DelegatableNode;Ljava/lang/Object;)Landroidx/compose/ui/node/TraversableNode;", "T", "(Landroidx/compose/ui/node/TraversableNode;)Landroidx/compose/ui/node/TraversableNode;", "Lkotlin/Function1;", "", "block", "", "traverseAncestors", "(Landroidx/compose/ui/node/DelegatableNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Landroidx/compose/ui/node/TraversableNode;Lkotlin/jvm/functions/Function1;)V", "traverseChildren", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "traverseDescendants"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TraversableNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final <T extends androidx.compose.ui.node.TraversableNode> T findNearestAncestor(T t) {
        androidx.compose.ui.node.NodeChain nodes;
        T t2 = t;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
        if (!t2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = t2.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(t2);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.TraversableNode) {
                                T t3 = (T) delegatingNode;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(t.getTraverseKey(), t3.getTraverseKey()) && androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(t, t3)) {
                                    return t3;
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final <T extends androidx.compose.ui.node.TraversableNode> void traverseAncestors(T t, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        androidx.compose.ui.node.NodeChain nodes;
        T t2 = t;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
        if (!t2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = t2.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(t2);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.TraversableNode) {
                                androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) delegatingNode;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(t.getTraverseKey(), traversableNode.getTraverseKey()) && androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(t, traversableNode) && !function1.invoke(traversableNode).booleanValue()) {
                                    return;
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0038, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends androidx.compose.ui.node.TraversableNode> void traverseChildren(T t, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        T t2 = t;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
        if (!t2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = t2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, t2.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.node.DelegatingNode delegatingNode = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((delegatingNode.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, delegatingNode, false);
            } else {
                while (true) {
                    if (delegatingNode == 0) {
                        break;
                    }
                    if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.TraversableNode) {
                                androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) delegatingNode;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(t.getTraverseKey(), traversableNode.getTraverseKey()) && androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(t, traversableNode) && !function1.invoke(traversableNode).booleanValue()) {
                                    return;
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    } else {
                        delegatingNode = delegatingNode.getChild();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public static final <T extends androidx.compose.ui.node.TraversableNode> void traverseDescendants(T t, kotlin.jvm.functions.Function1<? super T, ? extends androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction> function1) {
        androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction;
        T t2 = t;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
        if (!t2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = t2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, t2.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null && node2.getIsAttached(); node2 = node2.getChild()) {
                    if ((node2.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = node2;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.TraversableNode) {
                                androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) delegatingNode;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(t.getTraverseKey(), traversableNode.getTraverseKey()) && androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(t, traversableNode)) {
                                    traverseDescendantsAction = function1.invoke(traversableNode);
                                } else {
                                    traverseDescendantsAction = androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                }
                                if (traverseDescendantsAction == androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsAction == androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    }
                }
            }
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, node, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final androidx.compose.ui.node.TraversableNode findNearestAncestor(androidx.compose.ui.node.DelegatableNode delegatableNode, java.lang.Object obj) {
        androidx.compose.ui.node.NodeChain nodes;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.TraversableNode) {
                                androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) delegatingNode;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, traversableNode.getTraverseKey())) {
                                    return traversableNode;
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final void traverseAncestors(androidx.compose.ui.node.DelegatableNode delegatableNode, java.lang.Object obj, kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.TraversableNode, java.lang.Boolean> function1) {
        androidx.compose.ui.node.NodeChain nodes;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.TraversableNode) {
                                androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) delegatingNode;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, traversableNode.getTraverseKey()) && !function1.invoke(traversableNode).booleanValue()) {
                                    return;
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void traverseChildren(androidx.compose.ui.node.DelegatableNode delegatableNode, java.lang.Object obj, kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.TraversableNode, java.lang.Boolean> function1) {
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, delegatableNode.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.node.DelegatingNode delegatingNode = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((delegatingNode.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, delegatingNode, false);
            } else {
                while (true) {
                    if (delegatingNode == 0) {
                        break;
                    }
                    if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.TraversableNode) {
                                androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) delegatingNode;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, traversableNode.getTraverseKey()) && !function1.invoke(traversableNode).booleanValue()) {
                                    return;
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    } else {
                        delegatingNode = delegatingNode.getChild();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    public static final void traverseDescendants(androidx.compose.ui.node.DelegatableNode delegatableNode, java.lang.Object obj, kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.TraversableNode, ? extends androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction> function1) {
        androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(262144);
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, delegatableNode.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null && node2.getIsAttached(); node2 = node2.getChild()) {
                    if ((node2.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.node.DelegatingNode delegatingNode = node2;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.node.TraversableNode) {
                                androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) delegatingNode;
                                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, traversableNode.getTraverseKey())) {
                                    traverseDescendantsAction = function1.invoke(traversableNode);
                                } else {
                                    traverseDescendantsAction = androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                }
                                if (traverseDescendantsAction == androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsAction == androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                int i = 0;
                                delegatingNode = delegatingNode;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            delegatingNode = delegate;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegatingNode);
                                                }
                                                delegatingNode = 0;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i != 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    }
                }
            }
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, node, false);
        }
    }
}

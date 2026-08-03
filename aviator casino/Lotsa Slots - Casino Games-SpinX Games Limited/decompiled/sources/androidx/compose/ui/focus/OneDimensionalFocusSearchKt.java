package androidx.compose.ui.focus;

/* compiled from: OneDimensionalFocusSearch.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a \u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002\u001aE\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\u0006\u0010\u000f\u001a\u0002H\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\f0\nH\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u0011\u001aE\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\u0006\u0010\u000f\u001a\u0002H\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\f0\nH\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\u0011\u001a \u0010\u0013\u001a\u00020\u0007*\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002\u001a:\u0010\u0014\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0007*\u00020\bH\u0002\u001a2\u0010\u001b\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a \u0010\u001e\u001a\u00020\u0007*\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002\u001a \u0010\u001f\u001a\u00020\u0007*\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002\u001a:\u0010 \u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\nH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0019\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"InvalidFocusDirection", "", "getInvalidFocusDirection$annotations", "()V", "NoActiveChild", "getNoActiveChild$annotations", "backwardFocusSearch", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "Lkotlin/Function1;", "forEachItemAfter", "", "T", "Landroidx/compose/runtime/collection/MutableVector;", "item", "action", "(Landroidx/compose/runtime/collection/MutableVector;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "forEachItemBefore", "forwardFocusSearch", "generateAndSearchChildren", "focusedItem", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "isRoot", "oneDimensionalFocusSearch", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "pickChildForBackwardSearch", "pickChildForForwardSearch", "searchChildren", "searchChildren-4C6V_qg", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {
    private static final java.lang.String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    private static final java.lang.String NoActiveChild = "ActiveParent must have a focusedChild";

    /* compiled from: OneDimensionalFocusSearch.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.focus.FocusStateImpl.values().length];
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Active.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Captured.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m1827oneDimensionalFocusSearchOMvw8(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1801getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetNode, function1);
        }
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1802getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetNode, function1);
        }
        throw new java.lang.IllegalStateException(InvalidFocusDirection.toString());
    }

    private static final boolean forwardFocusSearch(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        int i = androidx.compose.ui.focus.OneDimensionalFocusSearchKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            androidx.compose.ui.focus.FocusTargetNode activeChild = androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                return forwardFocusSearch(activeChild, function1) || m1826generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1801getNextdhqQ8s(), function1);
            }
            throw new java.lang.IllegalStateException(NoActiveChild.toString());
        }
        if (i == 2 || i == 3) {
            return pickChildForForwardSearch(focusTargetNode, function1);
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
            return function1.invoke(focusTargetNode).booleanValue();
        }
        return pickChildForForwardSearch(focusTargetNode, function1);
    }

    private static final boolean backwardFocusSearch(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        int i = androidx.compose.ui.focus.OneDimensionalFocusSearchKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            androidx.compose.ui.focus.FocusTargetNode activeChild = androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild == null) {
                throw new java.lang.IllegalStateException(NoActiveChild.toString());
            }
            int i2 = androidx.compose.ui.focus.OneDimensionalFocusSearchKt.WhenMappings.$EnumSwitchMapping$0[activeChild.getFocusState().ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    return m1826generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1802getPreviousdhqQ8s(), function1);
                }
                if (i2 == 4) {
                    throw new java.lang.IllegalStateException(NoActiveChild.toString());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (!backwardFocusSearch(activeChild, function1) && !m1826generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1802getPreviousdhqQ8s(), function1) && (!activeChild.fetchFocusProperties$ui_release().getCanFocus() || !function1.invoke(activeChild).booleanValue())) {
                return false;
            }
        } else {
            if (i == 2 || i == 3) {
                return pickChildForBackwardSearch(focusTargetNode, function1);
            }
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (!pickChildForBackwardSearch(focusTargetNode, function1) && (!focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() || !function1.invoke(focusTargetNode).booleanValue())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m1826generateAndSearchChildren4C6V_qg(final androidx.compose.ui.focus.FocusTargetNode focusTargetNode, final androidx.compose.ui.focus.FocusTargetNode focusTargetNode2, final int i, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        if (m1828searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) androidx.compose.ui.focus.BeyondBoundsLayoutKt.m1787searchBeyondBoundsOMvw8(focusTargetNode, i, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                boolean m1828searchChildren4C6V_qg;
                m1828searchChildren4C6V_qg = androidx.compose.ui.focus.OneDimensionalFocusSearchKt.m1828searchChildren4C6V_qg(androidx.compose.ui.focus.FocusTargetNode.this, focusTargetNode2, i, function1);
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(m1828searchChildren4C6V_qg);
                valueOf.getClass();
                if (m1828searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m1828searchChildren4C6V_qg(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.focus.FocusTargetNode focusTargetNode2, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        if (focusTargetNode.getFocusState() != androidx.compose.ui.focus.FocusStateImpl.ActiveParent) {
            throw new java.lang.IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = focusTargetNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!focusTargetNode3.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode3.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode3.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                mutableVector.add((androidx.compose.ui.focus.FocusTargetNode) node);
                            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            node = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(node);
                                                }
                                                node = null;
                                            }
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
        mutableVector.sortWith(androidx.compose.ui.focus.FocusableChildrenComparator.INSTANCE);
        if (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1801getNextdhqQ8s())) {
            if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1802getPreviousdhqQ8s())) {
                kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, mutableVector.getSize() - 1);
                int first = intRange.getFirst();
                int last = intRange.getLast();
                if (first <= last) {
                    boolean z = false;
                    while (true) {
                        if (z) {
                            androidx.compose.ui.focus.FocusTargetNode focusTargetNode4 = (androidx.compose.ui.focus.FocusTargetNode) mutableVector.getContent()[last];
                            if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && backwardFocusSearch(focusTargetNode4, function1)) {
                                return true;
                            }
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(mutableVector.getContent()[last], focusTargetNode2)) {
                            z = true;
                        }
                        if (last == first) {
                            break;
                        }
                        last--;
                    }
                }
            } else {
                throw new java.lang.IllegalStateException(InvalidFocusDirection.toString());
            }
        } else {
            kotlin.ranges.IntRange intRange2 = new kotlin.ranges.IntRange(0, mutableVector.getSize() - 1);
            int first2 = intRange2.getFirst();
            int last2 = intRange2.getLast();
            if (first2 <= last2) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        androidx.compose.ui.focus.FocusTargetNode focusTargetNode5 = (androidx.compose.ui.focus.FocusTargetNode) mutableVector.getContent()[first2];
                        if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode5) && forwardFocusSearch(focusTargetNode5, function1)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(mutableVector.getContent()[first2], focusTargetNode2)) {
                        z2 = true;
                    }
                    if (first2 == last2) {
                        break;
                    }
                    first2++;
                }
            }
        }
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1801getNextdhqQ8s()) || !focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetNode)) {
            return false;
        }
        return function1.invoke(focusTargetNode).booleanValue();
    }

    private static final boolean isRoot(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.Modifier.Node node;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node parent = focusTargetNode2.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            node = null;
            if (requireLayoutNode == null) {
                break;
            }
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.ui.Modifier.Node node2 = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                node = node2;
                                break loop0;
                            }
                            if ((node2.getKindSet() & m3613constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return node == null;
    }

    private static final boolean pickChildForForwardSearch(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode2.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                mutableVector.add((androidx.compose.ui.focus.FocusTargetNode) node);
                            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(node);
                                                }
                                                node = null;
                                            }
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
        mutableVector.sortWith(androidx.compose.ui.focus.FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        java.lang.Object[] content = mutableVector.getContent();
        int i2 = 0;
        do {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) content[i2];
            if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && forwardFocusSearch(focusTargetNode3, function1)) {
                return true;
            }
            i2++;
        } while (i2 < size);
        return false;
    }

    private static final boolean pickChildForBackwardSearch(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode2.getNode());
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.isNotEmpty()) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m3613constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                mutableVector.add((androidx.compose.ui.focus.FocusTargetNode) node);
                            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(node);
                                                }
                                                node = null;
                                            }
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
        mutableVector.sortWith(androidx.compose.ui.focus.FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize();
        if (size > 0) {
            int i2 = size - 1;
            java.lang.Object[] content = mutableVector.getContent();
            do {
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) content[i2];
                if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && backwardFocusSearch(focusTargetNode3, function1)) {
                    return true;
                }
                i2--;
            } while (i2 >= 0);
        }
        return false;
    }

    private static final <T> void forEachItemAfter(androidx.compose.runtime.collection.MutableVector<T> mutableVector, T t, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        boolean z = false;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, mutableVector.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            if (z) {
                function1.invoke(mutableVector.getContent()[first]);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(mutableVector.getContent()[first], t)) {
                z = true;
            }
            if (first == last) {
                return;
            } else {
                first++;
            }
        }
    }

    private static final <T> void forEachItemBefore(androidx.compose.runtime.collection.MutableVector<T> mutableVector, T t, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        boolean z = false;
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(0, mutableVector.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first > last) {
            return;
        }
        while (true) {
            if (z) {
                function1.invoke(mutableVector.getContent()[last]);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(mutableVector.getContent()[last], t)) {
                z = true;
            }
            if (last == first) {
                return;
            } else {
                last--;
            }
        }
    }
}

package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a/\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a7\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\f\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000f\u001a'\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000b\u001a'\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u000b\u001a\u0013\u0010\u0012\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "oneDimensionalFocusSearch", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/focus/FocusTargetNode;Lkotlin/jvm/functions/Function1;)Z", "getHighSpeedVideoSizes", "p1", "p2", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneDimensionalFocusSearchKt {
    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m5696oneDimensionalFocusSearchOMvw8(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s())) {
            return getHighResolutionOutputSizeshNQ4ISI(focusTargetNode, function1);
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s())) {
            return getHighSpeedVideoSizes(focusTargetNode, function1);
        }
        throw new java.lang.IllegalStateException("This function should only be used for 1-D focus search".toString());
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        int i = androidx.compose.ui.focus.OneDimensionalFocusSearchKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            androidx.compose.ui.focus.FocusTargetNode activeChild = androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                return getHighResolutionOutputSizeshNQ4ISI(activeChild, function1) || getHighSpeedVideoSizes(focusTargetNode, activeChild, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s(), function1);
            }
            throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        if (i == 2 || i == 3) {
            return getHighSpeedVideoFpsRanges(focusTargetNode, function1);
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (focusTargetNode.fetchFocusProperties$ui().getCanFocus()) {
            return function1.invoke(focusTargetNode).booleanValue();
        }
        return getHighSpeedVideoFpsRanges(focusTargetNode, function1);
    }

    private static final boolean getHighSpeedVideoSizes(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        int i = androidx.compose.ui.focus.OneDimensionalFocusSearchKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return getHighSpeedVideoFpsRangesFor(focusTargetNode, function1);
            }
            if (i == 4) {
                return getHighSpeedVideoFpsRangesFor(focusTargetNode, function1) || (focusTargetNode.fetchFocusProperties$ui().getCanFocus() && function1.invoke(focusTargetNode).booleanValue());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.compose.ui.focus.FocusTargetNode activeChild = androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        int i2 = androidx.compose.ui.focus.OneDimensionalFocusSearchKt.WhenMappings.$EnumSwitchMapping$0[activeChild.getFocusState().ordinal()];
        if (i2 == 1) {
            return getHighSpeedVideoSizes(activeChild, function1) || getHighSpeedVideoSizes(focusTargetNode, activeChild, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s(), function1) || (activeChild.fetchFocusProperties$ui().getCanFocus() && function1.invoke(activeChild).booleanValue());
        }
        if (i2 == 2 || i2 == 3) {
            return getHighSpeedVideoSizes(focusTargetNode, activeChild, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s(), function1);
        }
        if (i2 != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        throw new java.lang.IllegalStateException("ActiveParent must have a focusedChild".toString());
    }

    private static final boolean getHighSpeedVideoSizes(final androidx.compose.ui.focus.FocusTargetNode focusTargetNode, final androidx.compose.ui.focus.FocusTargetNode focusTargetNode2, final int i, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        if (Camera2StreamConfigurationMap(focusTargetNode, focusTargetNode2, i, function1)) {
            return true;
        }
        final androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        java.lang.Boolean bool = (java.lang.Boolean) androidx.compose.ui.focus.BeyondBoundsLayoutKt.m5640searchBeyondBoundsOMvw8(focusTargetNode, i, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.layout.BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                boolean Camera2StreamConfigurationMap;
                if (androidx.compose.ui.focus.FocusTargetNode.this == androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode()) {
                    Camera2StreamConfigurationMap = androidx.compose.ui.focus.OneDimensionalFocusSearchKt.Camera2StreamConfigurationMap(focusTargetNode, focusTargetNode2, i, function1);
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(Camera2StreamConfigurationMap);
                    if (valueOf.booleanValue() || !beyondBoundsScope.getHasMoreContent()) {
                        return valueOf;
                    }
                    return null;
                }
                return java.lang.Boolean.TRUE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.focus.FocusTargetNode focusTargetNode2, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        if (focusTargetNode.getFocusState() != androidx.compose.ui.focus.FocusStateImpl.ActiveParent) {
            throw new java.lang.IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = focusTargetNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode3.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode3.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusTargetNode3.getNode(), false);
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                mutableVector.add((androidx.compose.ui.focus.FocusTargetNode) node);
                            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                                if (i2 != 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector3);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
        mutableVector.sortWith(androidx.compose.ui.focus.FocusableChildrenComparator.INSTANCE);
        if (!androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s())) {
            if (!androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s())) {
                throw new java.lang.IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, mutableVector.getSize());
            int first = until.getFirst();
            int last = until.getLast();
            if (first <= last) {
                boolean z = false;
                while (true) {
                    if (z) {
                        androidx.compose.ui.focus.FocusTargetNode focusTargetNode4 = (androidx.compose.ui.focus.FocusTargetNode) mutableVector.content[last];
                        if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && getHighSpeedVideoSizes(focusTargetNode4, function1)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(mutableVector.content[last], focusTargetNode2)) {
                        z = true;
                    }
                    if (last == first) {
                        break;
                    }
                    last--;
                }
            }
        } else {
            kotlin.ranges.IntRange until2 = kotlin.ranges.RangesKt.until(0, mutableVector.getSize());
            int first2 = until2.getFirst();
            int last2 = until2.getLast();
            if (first2 <= last2) {
                boolean z2 = false;
                while (true) {
                    if (z2) {
                        androidx.compose.ui.focus.FocusTargetNode focusTargetNode5 = (androidx.compose.ui.focus.FocusTargetNode) mutableVector.content[first2];
                        if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode5) && getHighResolutionOutputSizeshNQ4ISI(focusTargetNode5, function1)) {
                            return true;
                        }
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(mutableVector.content[first2], focusTargetNode2)) {
                        z2 = true;
                    }
                    if (first2 == last2) {
                        break;
                    }
                    first2++;
                }
            }
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s()) || !focusTargetNode.fetchFocusProperties$ui().getCanFocus() || getHighSpeedVideoFpsRangesFor(focusTargetNode)) {
            return false;
        }
        return function1.invoke(focusTargetNode).booleanValue();
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.Modifier.Node node;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = focusTargetNode2.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            node = null;
            if (requireLayoutNode == null) {
                break;
            }
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.Modifier.Node node2 = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                node = node2;
                                break loop0;
                            }
                            if ((node2.getKindSet() & m7621constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                                if (i != 1) {
                                }
                            }
                            node2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return node == null;
    }

    private static final boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusTargetNode2.getNode(), false);
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                mutableVector.add((androidx.compose.ui.focus.FocusTargetNode) node);
                            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                                if (i != 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector3);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
        mutableVector.sortWith(androidx.compose.ui.focus.FocusableChildrenComparator.INSTANCE);
        java.lang.Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) objArr[i2];
            if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && getHighResolutionOutputSizeshNQ4ISI(focusTargetNode3, function1)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusTargetNode2.getNode(), false);
        } else {
            mutableVector2.add(child);
        }
        while (mutableVector2.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                mutableVector.add((androidx.compose.ui.focus.FocusTargetNode) node);
                            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                                if (i != 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector3);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
        mutableVector.sortWith(androidx.compose.ui.focus.FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize() - 1;
        java.lang.Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) objArr[size];
                if (androidx.compose.ui.focus.FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && getHighSpeedVideoSizes(focusTargetNode3, function1)) {
                    return true;
                }
                size--;
            }
        }
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
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
}

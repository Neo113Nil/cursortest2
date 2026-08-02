package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\u0010\u001a\u0004\u0018\u00010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0014\"\u0018\u0010\u0016\u001a\u00020\f*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u0000*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "customFocusSearch", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "Lkotlin/Function1;", "", "onFound", "focusSearch-0X8WOeE", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "focusSearch", "focusRect", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/geometry/Rect;", "findActiveFocusNode", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "getHighResolutionOutputSizeshNQ4ISI", "isEligibleForFocusSearch", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "getActiveChild", "activeChild"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTraversalKt {
    /* renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final androidx.compose.ui.focus.FocusRequester m5683customFocusSearchOMvw8(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.focus.FocusRequester end;
        androidx.compose.ui.focus.FocusRequester focusRequester;
        androidx.compose.ui.focus.FocusRequester start;
        androidx.compose.ui.focus.FocusProperties fetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s())) {
            return fetchFocusProperties$ui.getNext();
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s())) {
            return fetchFocusProperties$ui.getPrevious();
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s())) {
            return fetchFocusProperties$ui.getUp();
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s())) {
            return fetchFocusProperties$ui.getDown();
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s())) {
            int i2 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                start = fetchFocusProperties$ui.getStart();
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                start = fetchFocusProperties$ui.getEnd();
            }
            focusRequester = start != androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault() ? start : null;
            return focusRequester == null ? fetchFocusProperties$ui.getLeft() : focusRequester;
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s())) {
            int i3 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                end = fetchFocusProperties$ui.getEnd();
            } else {
                if (i3 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                end = fetchFocusProperties$ui.getStart();
            }
            focusRequester = end != androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault() ? end : null;
            return focusRequester == null ? fetchFocusProperties$ui.getRight() : focusRequester;
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5651getExitdhqQ8s())) {
            androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope(i, null);
            androidx.compose.ui.focus.FocusOwner focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
            androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s())) {
                fetchFocusProperties$ui.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
            } else {
                fetchFocusProperties$ui.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
            }
            if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                return androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel();
            }
            if (activeFocusTargetNode != focusOwner.getActiveFocusTargetNode()) {
                return androidx.compose.ui.focus.FocusRequester.INSTANCE.getRedirect$ui();
            }
            return androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault();
        }
        throw new java.lang.IllegalStateException("invalid FocusDirection".toString());
    }

    /* renamed from: focusSearch-0X8WOeE, reason: not valid java name */
    public static final java.lang.Boolean m5684focusSearch0X8WOeE(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        int m5655getRightdhqQ8s;
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5654getPreviousdhqQ8s())) {
            return java.lang.Boolean.valueOf(androidx.compose.ui.focus.OneDimensionalFocusSearchKt.m5696oneDimensionalFocusSearchOMvw8(focusTargetNode, i, function1));
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5656getUpdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5649getDowndhqQ8s())) {
            return androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m5702twoDimensionalFocusSearchsMXa3k8(focusTargetNode, i, rect, function1);
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s())) {
            int i2 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                m5655getRightdhqQ8s = androidx.compose.ui.focus.FocusDirection.INSTANCE.m5655getRightdhqQ8s();
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                m5655getRightdhqQ8s = androidx.compose.ui.focus.FocusDirection.INSTANCE.m5652getLeftdhqQ8s();
            }
            androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = findActiveFocusNode(focusTargetNode);
            if (findActiveFocusNode != null) {
                return androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m5702twoDimensionalFocusSearchsMXa3k8(findActiveFocusNode, m5655getRightdhqQ8s, rect, function1);
            }
            return null;
        }
        if (androidx.compose.ui.focus.FocusDirection.m5645equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5651getExitdhqQ8s())) {
            androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode2 = findActiveFocusNode(focusTargetNode);
            androidx.compose.ui.focus.FocusTargetNode highResolutionOutputSizeshNQ4ISI = findActiveFocusNode2 != null ? getHighResolutionOutputSizeshNQ4ISI(findActiveFocusNode2) : null;
            return java.lang.Boolean.valueOf((highResolutionOutputSizeshNQ4ISI == null || kotlin.jvm.internal.Intrinsics.areEqual(highResolutionOutputSizeshNQ4ISI, focusTargetNode)) ? false : function1.invoke(highResolutionOutputSizeshNQ4ISI).booleanValue());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Focus search invoked with invalid FocusDirection ");
        sb.append((java.lang.Object) androidx.compose.ui.focus.FocusDirection.m5647toStringimpl(i));
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public static final androidx.compose.ui.geometry.Rect focusRect(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.layout.LayoutCoordinates findRootCoordinates;
        if (!focusTargetNode.getIsAttached()) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        androidx.compose.ui.node.NodeCoordinator coordinator = focusTargetNode.getCoordinator();
        if (coordinator != null && (findRootCoordinates = androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(coordinator)) != null) {
            if (!findRootCoordinates.isAttached()) {
                findRootCoordinates = null;
            }
            if (findRootCoordinates != null) {
                return focusTargetNode.fetchFocusRect$ui(findRootCoordinates);
            }
        }
        return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
    }

    public static final boolean isEligibleForFocusSearch(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.LayoutNode layoutNode;
        androidx.compose.ui.node.NodeCoordinator coordinator;
        androidx.compose.ui.node.LayoutNode layoutNode2;
        androidx.compose.ui.node.NodeCoordinator coordinator2 = focusTargetNode.getCoordinator();
        return (coordinator2 == null || (layoutNode = coordinator2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator = focusTargetNode.getCoordinator()) == null || (layoutNode2 = coordinator.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0043, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.focus.FocusTargetNode getActiveChild(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.getNode().getIsAttached()) {
            return null;
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, focusTargetNode2.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node;
                                if (focusTargetNode3.getNode().getIsAttached()) {
                                    int i = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode3.getFocusState().ordinal()];
                                    if (i == 1 || i == 2 || i == 3) {
                                        return focusTargetNode3;
                                    }
                                    if (i != 4) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                }
                            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                                if (i2 != 1) {
                                }
                            }
                            node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
        return null;
    }

    public static final androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode == null || !activeFocusTargetNode.getIsAttached()) {
            return null;
        }
        return activeFocusTargetNode;
    }

    private static final androidx.compose.ui.focus.FocusTargetNode getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node parent = focusTargetNode2.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.Modifier.Node node = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node;
                                if (focusTargetNode3.fetchFocusProperties$ui().getCanFocus()) {
                                    return focusTargetNode3;
                                }
                            } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
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
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[androidx.compose.ui.unit.LayoutDirection.values().length];
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Ltr.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.unit.LayoutDirection.Rtl.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[androidx.compose.ui.focus.FocusStateImpl.values().length];
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.Active.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.Captured.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}

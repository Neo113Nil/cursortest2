package androidx.compose.ui.focus;

/* compiled from: FocusTraversal.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0007\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0001H\u0000\u001a:\u0010\u0013\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"activeChild", "Landroidx/compose/ui/focus/FocusTargetNode;", "getActiveChild", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "isEligibleForFocusSearch", "", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "customFocusSearch", "Landroidx/compose/ui/focus/FocusRequester;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "findActiveFocusNode", "findNonDeactivatedParent", "focusRect", "Landroidx/compose/ui/geometry/Rect;", "focusSearch", "onFound", "Lkotlin/Function1;", "focusSearch-sMXa3k8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTraversalKt {

    /* compiled from: FocusTraversal.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    /* renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final androidx.compose.ui.focus.FocusRequester m1823customFocusSearchOMvw8(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.focus.FocusRequester end;
        androidx.compose.ui.focus.FocusProperties fetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1801getNextdhqQ8s())) {
            return fetchFocusProperties$ui_release.getNext();
        }
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1802getPreviousdhqQ8s())) {
            return fetchFocusProperties$ui_release.getPrevious();
        }
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s())) {
            return fetchFocusProperties$ui_release.getUp();
        }
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
            return fetchFocusProperties$ui_release.getDown();
        }
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s())) {
            int i2 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                end = fetchFocusProperties$ui_release.getStart();
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                end = fetchFocusProperties$ui_release.getEnd();
            }
            if (end == androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault()) {
                end = null;
            }
            if (end == null) {
                return fetchFocusProperties$ui_release.getLeft();
            }
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s())) {
            int i3 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                end = fetchFocusProperties$ui_release.getEnd();
            } else {
                if (i3 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                end = fetchFocusProperties$ui_release.getStart();
            }
            if (end == androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault()) {
                end = null;
            }
            if (end == null) {
                return fetchFocusProperties$ui_release.getRight();
            }
        } else {
            if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1798getEnterdhqQ8s())) {
                return fetchFocusProperties$ui_release.getEnter().invoke(androidx.compose.ui.focus.FocusDirection.m1788boximpl(i));
            }
            if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1799getExitdhqQ8s())) {
                return fetchFocusProperties$ui_release.getExit().invoke(androidx.compose.ui.focus.FocusDirection.m1788boximpl(i));
            }
            throw new java.lang.IllegalStateException("invalid FocusDirection".toString());
        }
        return end;
    }

    /* renamed from: focusSearch-sMXa3k8, reason: not valid java name */
    public static final boolean m1824focusSearchsMXa3k8(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i, androidx.compose.ui.unit.LayoutDirection layoutDirection, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> function1) {
        int m1803getRightdhqQ8s;
        java.lang.Boolean m1836twoDimensionalFocusSearchOMvw8;
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1801getNextdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1802getPreviousdhqQ8s())) {
            return androidx.compose.ui.focus.OneDimensionalFocusSearchKt.m1827oneDimensionalFocusSearchOMvw8(focusTargetNode, i, function1);
        }
        if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1804getUpdhqQ8s()) || androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1797getDowndhqQ8s())) {
            java.lang.Boolean m1836twoDimensionalFocusSearchOMvw82 = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m1836twoDimensionalFocusSearchOMvw8(focusTargetNode, i, function1);
            if (m1836twoDimensionalFocusSearchOMvw82 != null) {
                return m1836twoDimensionalFocusSearchOMvw82.booleanValue();
            }
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1798getEnterdhqQ8s())) {
            int i2 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                m1803getRightdhqQ8s = androidx.compose.ui.focus.FocusDirection.INSTANCE.m1803getRightdhqQ8s();
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                m1803getRightdhqQ8s = androidx.compose.ui.focus.FocusDirection.INSTANCE.m1800getLeftdhqQ8s();
            }
            androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = findActiveFocusNode(focusTargetNode);
            if (findActiveFocusNode != null && (m1836twoDimensionalFocusSearchOMvw8 = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m1836twoDimensionalFocusSearchOMvw8(findActiveFocusNode, m1803getRightdhqQ8s, function1)) != null) {
                return m1836twoDimensionalFocusSearchOMvw8.booleanValue();
            }
        } else if (androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(i, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1799getExitdhqQ8s())) {
            androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode2 = findActiveFocusNode(focusTargetNode);
            androidx.compose.ui.focus.FocusTargetNode findNonDeactivatedParent = findActiveFocusNode2 != null ? findNonDeactivatedParent(findActiveFocusNode2) : null;
            if (findNonDeactivatedParent != null && !kotlin.jvm.internal.Intrinsics.areEqual(findNonDeactivatedParent, focusTargetNode)) {
                return function1.invoke(findNonDeactivatedParent).booleanValue();
            }
        } else {
            throw new java.lang.IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((java.lang.Object) androidx.compose.ui.focus.FocusDirection.m1793toStringimpl(i))).toString());
        }
        return false;
    }

    public static final androidx.compose.ui.geometry.Rect focusRect(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator();
        if (coordinator$ui_release != null) {
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator = coordinator$ui_release;
            androidx.compose.ui.geometry.Rect localBoundingBoxOf = androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(nodeCoordinator).localBoundingBoxOf(nodeCoordinator, false);
            if (localBoundingBoxOf != null) {
                return localBoundingBoxOf;
            }
        }
        return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
    }

    public static final boolean isEligibleForFocusSearch(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.LayoutNode layoutNode;
        androidx.compose.ui.node.NodeCoordinator coordinator$ui_release;
        androidx.compose.ui.node.LayoutNode layoutNode2;
        androidx.compose.ui.node.NodeCoordinator coordinator$ui_release2 = focusTargetNode.getCoordinator();
        return (coordinator$ui_release2 == null || (layoutNode = coordinator$ui_release2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator$ui_release = focusTargetNode.getCoordinator()) == null || (layoutNode2 = coordinator$ui_release.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x003d, code lost:
    
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
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode2.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetNode2.getNode());
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
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node;
                                if (focusTargetNode3.getNode().getIsAttached()) {
                                    int i = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode3.getFocusState().ordinal()];
                                    if (i == 1 || i == 2 || i == 3) {
                                        return focusTargetNode3;
                                    }
                                }
                            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i2 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector2);
                        }
                    } else {
                        node = node.getChild();
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0051, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        int i = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i != 1) {
            if (i == 2) {
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
                int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
                if (!focusTargetNode2.getNode().getIsAttached()) {
                    throw new java.lang.IllegalStateException("visitChildren called on an unattached node".toString());
                }
                androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                androidx.compose.ui.Modifier.Node child = focusTargetNode2.getNode().getChild();
                if (child == null) {
                    androidx.compose.ui.node.DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetNode2.getNode());
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
                                        androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = findActiveFocusNode((androidx.compose.ui.focus.FocusTargetNode) node);
                                        if (findActiveFocusNode != null) {
                                            return findActiveFocusNode;
                                        }
                                    } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                        int i2 = 0;
                                        for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                                    node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector2);
                                }
                            } else {
                                node = node.getChild();
                            }
                        }
                    }
                }
                return null;
            }
            if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return focusTargetNode;
    }

    private static final androidx.compose.ui.focus.FocusTargetNode findNonDeactivatedParent(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node parent = focusTargetNode2.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                        androidx.compose.ui.Modifier.Node node = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node;
                                if (focusTargetNode3.fetchFocusProperties$ui_release().getCanFocus()) {
                                    return focusTargetNode3;
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
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }
}

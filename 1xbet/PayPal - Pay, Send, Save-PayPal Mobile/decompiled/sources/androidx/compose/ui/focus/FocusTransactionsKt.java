package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001e\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a \u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0002\u001a)\u0010\n\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\b\u000f\u001a\f\u0010\u0010\u001a\u00020\u0002*\u00020\u0002H\u0002\u001a\u001b\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001b\u0010\u0017\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u001b\u0010\u0019\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"performRequestFocus", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "captureFocus", "freeFocus", "clearFocus", "forced", "refreshFocusEvents", "grantFocus", "clearChildFocus", "requestOwnerFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "previouslyFocusedRect", "Landroidx/compose/ui/geometry/Rect;", "requestOwnerFocus-Etdf9zw", "requireActiveChild", "performCustomRequestFocus", "Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomRequestFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomClearFocus", "performCustomClearFocus-Mxy_nc0", "performCustomEnter", "performCustomEnter-Mxy_nc0", "performCustomExit", "performCustomExit-Mxy_nc0", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTransactionsKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v21, types: [androidx.compose.ui.Modifier$Node] */
    public static final boolean performRequestFocus(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.runtime.collection.MutableVector mutableVector;
        androidx.compose.ui.node.NodeChain nodes;
        int i;
        androidx.compose.ui.node.NodeChain nodes2;
        int i2;
        androidx.compose.runtime.collection.MutableVector mutableVector2;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
        androidx.compose.ui.focus.FocusOwner focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode2).getFocusOwner();
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        androidx.compose.ui.focus.FocusStateImpl focusState = focusTargetNode.getFocusState();
        int i3 = 1;
        if (activeFocusTargetNode == focusTargetNode) {
            androidx.compose.ui.focus.FocusStateImpl focusStateImpl = focusState;
            focusTargetNode.dispatchFocusCallbacks$ui(focusStateImpl, focusStateImpl);
            return true;
        }
        int i4 = 0;
        if (androidx.compose.ui.ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            if ((activeFocusTargetNode == null || activeFocusTargetNode.getIsInteropViewHost()) && !focusTargetNode.getIsInteropViewHost() && !getHighSpeedVideoFpsRanges(focusTargetNode)) {
                return false;
            }
        } else if (activeFocusTargetNode == null && !getHighSpeedVideoFpsRanges(focusTargetNode)) {
            return false;
        }
        if (activeFocusTargetNode != null) {
            mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = activeFocusTargetNode;
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
            if (!focusTargetNode3.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node parent = focusTargetNode3.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode3);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                            androidx.compose.ui.Modifier.Node node = parent;
                            androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                            while (node != null) {
                                if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                    mutableVector.add((androidx.compose.ui.focus.FocusTargetNode) node);
                                } else if ((node.getKindSet() & m7621constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate();
                                    int i5 = 0;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                            i5++;
                                            if (i5 == i3) {
                                                node = delegate;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    i2 = i5;
                                                    mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                } else {
                                                    i2 = i5;
                                                    mutableVector2 = mutableVector3;
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
                                                mutableVector3 = mutableVector2;
                                                i5 = i2;
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        i3 = 1;
                                    }
                                    if (i5 == i3) {
                                    }
                                }
                                node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector3);
                                i3 = 1;
                            }
                        }
                        parent = parent.getParent();
                        i3 = 1;
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                parent = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
                i3 = 1;
            }
        } else {
            mutableVector = null;
        }
        androidx.compose.runtime.collection.MutableVector mutableVector4 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.focus.FocusTargetNode[16], 0);
        int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        ?? parent2 = focusTargetNode2.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        int i6 = 1;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode4 = parent2;
        while (requireLayoutNode2 != null) {
            if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl2) != 0) {
                for (androidx.compose.ui.focus.FocusTargetNode focusTargetNode5 = focusTargetNode4; focusTargetNode5 != null; focusTargetNode5 = focusTargetNode5.getParent()) {
                    if ((focusTargetNode5.getKindSet() & m7621constructorimpl2) != 0) {
                        androidx.compose.ui.focus.FocusTargetNode focusTargetNode6 = focusTargetNode5;
                        androidx.compose.runtime.collection.MutableVector mutableVector5 = null;
                        while (focusTargetNode6 != null) {
                            if (focusTargetNode6 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode7 = focusTargetNode6;
                                java.lang.Boolean valueOf = mutableVector != null ? java.lang.Boolean.valueOf(mutableVector.remove(focusTargetNode7)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    mutableVector4.add(focusTargetNode7);
                                }
                                if (focusTargetNode7 == activeFocusTargetNode) {
                                    i6 = i4;
                                }
                            } else if ((focusTargetNode6.getKindSet() & m7621constructorimpl2) != 0 && (focusTargetNode6 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                for (androidx.compose.ui.focus.FocusTargetNode focusTargetNode8 = ((androidx.compose.ui.node.DelegatingNode) focusTargetNode6).getDelegate(); focusTargetNode8 != null; focusTargetNode8 = focusTargetNode8.getChild()) {
                                    if ((focusTargetNode8.getKindSet() & m7621constructorimpl2) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            focusTargetNode6 = focusTargetNode8;
                                        } else {
                                            if (mutableVector5 == null) {
                                                i = i4;
                                                mutableVector5 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                            } else {
                                                i = i4;
                                            }
                                            if (focusTargetNode6 != null) {
                                                if (mutableVector5 != null) {
                                                    mutableVector5.add(focusTargetNode6);
                                                }
                                                focusTargetNode6 = null;
                                            }
                                            if (mutableVector5 != null) {
                                                mutableVector5.add(focusTargetNode8);
                                            }
                                            i4 = i;
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                    i4 = 0;
                                }
                            }
                            focusTargetNode6 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector5);
                            i4 = 0;
                        }
                    }
                    i4 = 0;
                }
            }
            requireLayoutNode2 = requireLayoutNode2.getParent$ui();
            i4 = 0;
            focusTargetNode4 = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? 0 : nodes.getTail();
        }
        if (i6 != 0 && activeFocusTargetNode != null && !clearFocus$default(activeFocusTargetNode, false, true, 1, null)) {
            return false;
        }
        getHighSpeedVideoFpsRangesFor(focusTargetNode);
        if (androidx.compose.ui.ComposeUiFlags.isOptimizedFocusEventDispatchEnabled && i6 != 0 && activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui(androidx.compose.ui.focus.FocusStateImpl.Active, androidx.compose.ui.focus.FocusStateImpl.Inactive);
        }
        if (mutableVector != null) {
            int size = mutableVector.getSize() - 1;
            java.lang.Object[] objArr = mutableVector.content;
            if (size < objArr.length) {
                while (size >= 0) {
                    androidx.compose.ui.focus.FocusTargetNode focusTargetNode9 = (androidx.compose.ui.focus.FocusTargetNode) objArr[size];
                    if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode9.dispatchFocusCallbacks$ui(androidx.compose.ui.focus.FocusStateImpl.ActiveParent, androidx.compose.ui.focus.FocusStateImpl.Inactive);
                    size--;
                }
            }
        }
        int size2 = mutableVector4.getSize() - 1;
        java.lang.Object[] objArr2 = mutableVector4.content;
        if (size2 < objArr2.length) {
            while (size2 >= 0) {
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode10 = (androidx.compose.ui.focus.FocusTargetNode) objArr2[size2];
                if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                    return false;
                }
                focusTargetNode10.dispatchFocusCallbacks$ui(focusTargetNode10 == activeFocusTargetNode ? androidx.compose.ui.focus.FocusStateImpl.Active : androidx.compose.ui.focus.FocusStateImpl.Inactive, androidx.compose.ui.focus.FocusStateImpl.ActiveParent);
                size2--;
            }
        }
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        focusTargetNode.dispatchFocusCallbacks$ui(focusState, androidx.compose.ui.focus.FocusStateImpl.Active);
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        if (!androidx.compose.ui.ComposeUiFlags.isViewFocusFixEnabled || androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2).getInteropView() != null) {
            return true;
        }
        getHighSpeedVideoFpsRanges(focusTargetNode, androidx.compose.ui.focus.FocusDirection.m5642boximpl(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5653getNextdhqQ8s()), null);
        return true;
    }

    public static final boolean captureFocus(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        int i = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(true);
            focusTargetNode.dispatchFocusCallbacks$ui(androidx.compose.ui.focus.FocusStateImpl.Active, androidx.compose.ui.focus.FocusStateImpl.Captured);
            return true;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final boolean freeFocus(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        int i = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return false;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(false);
            focusTargetNode.dispatchFocusCallbacks$ui(androidx.compose.ui.focus.FocusStateImpl.Captured, androidx.compose.ui.focus.FocusStateImpl.Active);
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetNode, z, z2);
    }

    public static final boolean clearFocus(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        int i = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            if (!androidx.compose.ui.ComposeUiFlags.isOptimizedFocusEventDispatchEnabled) {
                androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                if (z2) {
                    focusTargetNode.dispatchFocusCallbacks$ui(androidx.compose.ui.focus.FocusStateImpl.Active, androidx.compose.ui.focus.FocusStateImpl.Inactive);
                }
            }
            return true;
        }
        if (i == 2) {
            if (z && !androidx.compose.ui.ComposeUiFlags.isOptimizedFocusEventDispatchEnabled) {
                androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                if (z2) {
                    focusTargetNode.dispatchFocusCallbacks$ui(androidx.compose.ui.focus.FocusStateImpl.Captured, androidx.compose.ui.focus.FocusStateImpl.Inactive);
                }
            }
            return z;
        }
        if (i != 3) {
            if (i == 4) {
                return true;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (!Camera2StreamConfigurationMap(focusTargetNode, z, z2)) {
            return false;
        }
        if (z2) {
            focusTargetNode.dispatchFocusCallbacks$ui(androidx.compose.ui.focus.FocusStateImpl.ActiveParent, androidx.compose.ui.focus.FocusStateImpl.Inactive);
        }
        return true;
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(final androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(focusTargetNode, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
            public final void getHighSpeedVideoFpsRanges() {
                androidx.compose.ui.focus.FocusTargetNode.this.fetchFocusProperties$ui();
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRanges();
                return kotlin.Unit.INSTANCE;
            }

            {
                super(0);
            }
        });
        int i = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(focusTargetNode);
        }
        return true;
    }

    private static final boolean Camera2StreamConfigurationMap(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        androidx.compose.ui.focus.FocusTargetNode activeChild = androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z, z2);
        }
        return true;
    }

    private static /* synthetic */ boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        return getHighSpeedVideoFpsRanges(focusTargetNode, null, null);
    }

    private static final boolean getHighSpeedVideoFpsRanges(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.focus.FocusDirection focusDirection, androidx.compose.ui.geometry.Rect rect) {
        return androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().mo5666requestOwnerFocus7o62pno(focusDirection, null);
    }

    private static final androidx.compose.ui.focus.FocusTargetNode getHighSpeedVideoSizes(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.focus.FocusTargetNode activeChild = androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        throw new java.lang.IllegalArgumentException("ActiveParent with no focused child".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.Modifier$Node] */
    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final androidx.compose.ui.focus.CustomDestinationResult m5682performCustomRequestFocusMxy_nc0(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i) {
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2;
        int i2;
        androidx.compose.ui.node.NodeChain nodes;
        do {
            int i3 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i3 == 1 || i3 == 2) {
                return androidx.compose.ui.focus.CustomDestinationResult.None;
            }
            if (i3 == 3) {
                return m5681performCustomClearFocusMxy_nc0(getHighSpeedVideoSizes(focusTargetNode), i);
            }
            if (i3 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = focusTargetNode;
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
            if (!focusTargetNode3.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node parent = focusTargetNode3.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode3);
            while (true) {
                if (requireLayoutNode == null) {
                    focusTargetNode2 = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                            focusTargetNode2 = parent;
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            while (focusTargetNode2 != 0) {
                                if (focusTargetNode2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                    break;
                                }
                                if ((focusTargetNode2.getKindSet() & m7621constructorimpl) != 0 && (focusTargetNode2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    androidx.compose.ui.Modifier.Node delegate = focusTargetNode2.getDelegate();
                                    int i4 = 0;
                                    focusTargetNode2 = focusTargetNode2;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                focusTargetNode2 = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (focusTargetNode2 != 0) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(focusTargetNode2);
                                                    }
                                                    focusTargetNode2 = 0;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        focusTargetNode2 = focusTargetNode2;
                                    }
                                    if (i4 != 1) {
                                    }
                                }
                                focusTargetNode2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            }
            focusTargetNode = focusTargetNode2;
            if (focusTargetNode == null) {
                return androidx.compose.ui.focus.CustomDestinationResult.None;
            }
            i2 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i2 == 1) {
                return getHighSpeedVideoSizes(focusTargetNode, i);
            }
            if (i2 == 2) {
                return androidx.compose.ui.focus.CustomDestinationResult.Cancelled;
            }
        } while (i2 == 3);
        if (i2 != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.compose.ui.focus.CustomDestinationResult m5682performCustomRequestFocusMxy_nc0 = m5682performCustomRequestFocusMxy_nc0(focusTargetNode, i);
        androidx.compose.ui.focus.CustomDestinationResult customDestinationResult = m5682performCustomRequestFocusMxy_nc0 != androidx.compose.ui.focus.CustomDestinationResult.None ? m5682performCustomRequestFocusMxy_nc0 : null;
        return customDestinationResult == null ? getHighSpeedVideoSizes(focusTargetNode, i) : customDestinationResult;
    }

    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final androidx.compose.ui.focus.CustomDestinationResult m5681performCustomClearFocusMxy_nc0(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i) {
        int i2 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return androidx.compose.ui.focus.CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                androidx.compose.ui.focus.CustomDestinationResult m5681performCustomClearFocusMxy_nc0 = m5681performCustomClearFocusMxy_nc0(getHighSpeedVideoSizes(focusTargetNode), i);
                if (m5681performCustomClearFocusMxy_nc0 == androidx.compose.ui.focus.CustomDestinationResult.None) {
                    m5681performCustomClearFocusMxy_nc0 = null;
                }
                return m5681performCustomClearFocusMxy_nc0 == null ? getHighResolutionOutputSizeshNQ4ISI(focusTargetNode, i) : m5681performCustomClearFocusMxy_nc0;
            }
            if (i2 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return androidx.compose.ui.focus.CustomDestinationResult.None;
    }

    private static final androidx.compose.ui.focus.CustomDestinationResult getHighSpeedVideoSizes(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.getHighSpeedVideoSizes) {
            focusTargetNode.getHighSpeedVideoSizes = true;
            try {
                androidx.compose.ui.focus.FocusProperties fetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
                androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope(i, null);
                androidx.compose.ui.focus.FocusOwner focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
                androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                fetchFocusProperties$ui.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
                androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                    androidx.compose.ui.focus.FocusRequester cancel = androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel();
                    if (cancel == androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel()) {
                        return androidx.compose.ui.focus.CustomDestinationResult.Cancelled;
                    }
                    if (cancel == androidx.compose.ui.focus.FocusRequester.INSTANCE.getRedirect$ui()) {
                        return androidx.compose.ui.focus.CustomDestinationResult.Redirected;
                    }
                    return androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(cancel, 0, 1, null) ? androidx.compose.ui.focus.CustomDestinationResult.Redirected : androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled;
                }
                if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                    androidx.compose.ui.focus.FocusRequester redirect$ui = androidx.compose.ui.focus.FocusRequester.INSTANCE.getRedirect$ui();
                    if (redirect$ui == androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel()) {
                        return androidx.compose.ui.focus.CustomDestinationResult.Cancelled;
                    }
                    if (redirect$ui == androidx.compose.ui.focus.FocusRequester.INSTANCE.getRedirect$ui()) {
                        return androidx.compose.ui.focus.CustomDestinationResult.Redirected;
                    }
                    return androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(redirect$ui, 0, 1, null) ? androidx.compose.ui.focus.CustomDestinationResult.Redirected : androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.getHighSpeedVideoSizes = false;
            }
        }
        return androidx.compose.ui.focus.CustomDestinationResult.None;
    }

    private static final androidx.compose.ui.focus.CustomDestinationResult getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.getHighResolutionOutputSizeshNQ4ISI) {
            focusTargetNode.getHighResolutionOutputSizeshNQ4ISI = true;
            try {
                androidx.compose.ui.focus.FocusProperties fetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
                androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope(i, null);
                androidx.compose.ui.focus.FocusOwner focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
                androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                fetchFocusProperties$ui.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
                androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                    androidx.compose.ui.focus.FocusRequester cancel = androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel();
                    if (cancel == androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel()) {
                        return androidx.compose.ui.focus.CustomDestinationResult.Cancelled;
                    }
                    if (cancel == androidx.compose.ui.focus.FocusRequester.INSTANCE.getRedirect$ui()) {
                        return androidx.compose.ui.focus.CustomDestinationResult.Redirected;
                    }
                    return androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(cancel, 0, 1, null) ? androidx.compose.ui.focus.CustomDestinationResult.Redirected : androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled;
                }
                if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                    androidx.compose.ui.focus.FocusRequester redirect$ui = androidx.compose.ui.focus.FocusRequester.INSTANCE.getRedirect$ui();
                    if (redirect$ui == androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel()) {
                        return androidx.compose.ui.focus.CustomDestinationResult.Cancelled;
                    }
                    if (redirect$ui == androidx.compose.ui.focus.FocusRequester.INSTANCE.getRedirect$ui()) {
                        return androidx.compose.ui.focus.CustomDestinationResult.Redirected;
                    }
                    return androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(redirect$ui, 0, 1, null) ? androidx.compose.ui.focus.CustomDestinationResult.Redirected : androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.getHighResolutionOutputSizeshNQ4ISI = false;
            }
        }
        return androidx.compose.ui.focus.CustomDestinationResult.None;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.focus.FocusStateImpl.values().length];
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Active.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.Captured.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.focus.FocusStateImpl.ActiveParent.ordinal()] = 3;
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

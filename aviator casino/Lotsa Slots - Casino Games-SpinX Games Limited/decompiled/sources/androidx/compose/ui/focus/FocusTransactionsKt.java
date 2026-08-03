package androidx.compose.ui.focus;

/* compiled from: FocusTransactions.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001e\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001e\u0010\u0011\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u001e\u0010\u0013\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000e\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0002\u001a\f\u0010\u0019\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u001a\u001a\u00020\u0002*\u00020\u0002H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "clearChildFocus", "forced", "refreshFocusEvents", "clearFocus", "freeFocus", "grantFocus", "performCustomClearFocus", "Landroidx/compose/ui/focus/CustomDestinationResult;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "performCustomClearFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomEnter", "performCustomEnter-Mxy_nc0", "performCustomExit", "performCustomExit-Mxy_nc0", "performCustomRequestFocus", "performCustomRequestFocus-Mxy_nc0", "performRequestFocus", "requestFocus", "requestFocusForChild", "childNode", "requestFocusForOwner", "requireActiveChild", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTransactionsKt {

    /* compiled from: FocusTransactions.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[androidx.compose.ui.focus.CustomDestinationResult.values().length];
            try {
                iArr[androidx.compose.ui.focus.CustomDestinationResult.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.focus.CustomDestinationResult.Redirected.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.focus.CustomDestinationResult.Cancelled.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[androidx.compose.ui.focus.FocusStateImpl.values().length];
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.Active.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.Captured.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean requestFocus(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.focus.FocusTransactionManager requireTransactionManager = androidx.compose.ui.focus.FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (requireTransactionManager.ongoingTransaction) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            int i = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$0[m1822performCustomRequestFocusMxy_nc0(focusTargetNode, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1798getEnterdhqQ8s()).ordinal()];
            boolean z = true;
            if (i == 1) {
                z = performRequestFocus(focusTargetNode);
            } else if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                z = false;
            }
            return z;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
    
        if (grantFocus(r11) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0101, code lost:
    
        if (grantFocus(r11) != false) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean performRequestFocus(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.NodeChain nodes;
        int i = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            androidx.compose.ui.Modifier.Node node = null;
            if (i == 3) {
                if (clearChildFocus$default(focusTargetNode, false, false, 3, null)) {
                }
                z = false;
            } else if (i == 4) {
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
                int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
                if (!focusTargetNode2.getNode().getIsAttached()) {
                    throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                androidx.compose.ui.Modifier.Node parent = focusTargetNode2.getNode().getParent();
                androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
                loop0: while (true) {
                    if (requireLayoutNode == null) {
                        break;
                    }
                    if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                                androidx.compose.runtime.collection.MutableVector mutableVector = null;
                                androidx.compose.ui.Modifier.Node node2 = parent;
                                while (node2 != null) {
                                    if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                        node = node2;
                                        break loop0;
                                    }
                                    if ((node2.getKindSet() & m3613constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                        int i2 = 0;
                                        for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                            if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                                i2++;
                                                if (i2 == 1) {
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
                                        if (i2 == 1) {
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
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node;
                if (focusTargetNode3 != null) {
                    androidx.compose.ui.focus.FocusStateImpl focusState = focusTargetNode3.getFocusState();
                    z = requestFocusForChild(focusTargetNode3, focusTargetNode);
                    if (z && focusState != focusTargetNode3.getFocusState()) {
                        androidx.compose.ui.focus.FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode3);
                    }
                } else {
                    if (requestFocusForOwner(focusTargetNode)) {
                    }
                    z = false;
                }
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        if (z) {
            androidx.compose.ui.focus.FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
        }
        return z;
    }

    public static final boolean captureFocus(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.focus.FocusTransactionManager requireTransactionManager = androidx.compose.ui.focus.FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (requireTransactionManager.ongoingTransaction) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            int i = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
            boolean z = true;
            if (i == 1) {
                focusTargetNode.setFocusState(androidx.compose.ui.focus.FocusStateImpl.Captured);
                androidx.compose.ui.focus.FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            } else if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                z = false;
            }
            return z;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    public static final boolean freeFocus(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.focus.FocusTransactionManager requireTransactionManager = androidx.compose.ui.focus.FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (requireTransactionManager.ongoingTransaction) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            int i = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    z = false;
                } else {
                    focusTargetNode.setFocusState(androidx.compose.ui.focus.FocusStateImpl.Active);
                    androidx.compose.ui.focus.FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                }
            }
            return z;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    public static /* synthetic */ boolean clearFocus$default(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetNode, z, z2);
    }

    public static final boolean clearFocus(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        int i = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            focusTargetNode.setFocusState(androidx.compose.ui.focus.FocusStateImpl.Inactive);
            if (z2) {
                androidx.compose.ui.focus.FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
            }
        } else {
            if (i == 2) {
                if (!z) {
                    return z;
                }
                focusTargetNode.setFocusState(androidx.compose.ui.focus.FocusStateImpl.Inactive);
                if (!z2) {
                    return z;
                }
                androidx.compose.ui.focus.FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                return z;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            } else {
                if (!clearChildFocus(focusTargetNode, z, z2)) {
                    return false;
                }
                focusTargetNode.setFocusState(androidx.compose.ui.focus.FocusStateImpl.Inactive);
                if (z2) {
                    androidx.compose.ui.focus.FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode);
                }
            }
        }
        return true;
    }

    private static final boolean grantFocus(final androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(focusTargetNode, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1
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
                androidx.compose.ui.focus.FocusTargetNode.this.fetchFocusProperties$ui_release();
            }
        });
        int i = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i != 3 && i != 4) {
            return true;
        }
        focusTargetNode.setFocusState(androidx.compose.ui.focus.FocusStateImpl.Active);
        return true;
    }

    static /* synthetic */ boolean clearChildFocus$default(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return clearChildFocus(focusTargetNode, z, z2);
    }

    private static final boolean clearChildFocus(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, boolean z, boolean z2) {
        androidx.compose.ui.focus.FocusTargetNode activeChild = androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z, z2);
        }
        return true;
    }

    private static final boolean requestFocusForChild(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.focus.FocusTargetNode focusTargetNode2) {
        androidx.compose.ui.Modifier.Node node;
        androidx.compose.ui.Modifier.Node node2;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.NodeChain nodes2;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = focusTargetNode2;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!focusTargetNode3.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node parent = focusTargetNode3.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode3);
        loop0: while (true) {
            node = null;
            if (requireLayoutNode == null) {
                node2 = null;
                break;
            }
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                        node2 = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
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
            parent = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(node2, focusTargetNode)) {
            throw new java.lang.IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i2 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i2 == 1) {
            boolean grantFocus = grantFocus(focusTargetNode2);
            if (!grantFocus) {
                return grantFocus;
            }
            focusTargetNode.setFocusState(androidx.compose.ui.focus.FocusStateImpl.ActiveParent);
            return grantFocus;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                requireActiveChild(focusTargetNode);
                if (clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode2)) {
                    return true;
                }
            } else if (i2 == 4) {
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode4 = focusTargetNode;
                int m3613constructorimpl2 = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
                if (!focusTargetNode4.getNode().getIsAttached()) {
                    throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                androidx.compose.ui.Modifier.Node parent2 = focusTargetNode4.getNode().getParent();
                androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode4);
                loop4: while (true) {
                    if (requireLayoutNode2 == null) {
                        break;
                    }
                    if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl2) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & m3613constructorimpl2) != 0) {
                                androidx.compose.ui.Modifier.Node node3 = parent2;
                                androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                                while (node3 != null) {
                                    if (node3 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                        node = node3;
                                        break loop4;
                                    }
                                    if ((node3.getKindSet() & m3613constructorimpl2) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                        int i3 = 0;
                                        for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & m3613constructorimpl2) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    node3 = delegate2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                    }
                                                    if (node3 != null) {
                                                        if (mutableVector2 != null) {
                                                            mutableVector2.add(node3);
                                                        }
                                                        node3 = null;
                                                    }
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(delegate2);
                                                    }
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    node3 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                    parent2 = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
                }
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode5 = (androidx.compose.ui.focus.FocusTargetNode) node;
                if (focusTargetNode5 == null && requestFocusForOwner(focusTargetNode)) {
                    focusTargetNode.setFocusState(androidx.compose.ui.focus.FocusStateImpl.Active);
                    return requestFocusForChild(focusTargetNode, focusTargetNode2);
                }
                if (focusTargetNode5 != null && requestFocusForChild(focusTargetNode5, focusTargetNode)) {
                    boolean requestFocusForChild = requestFocusForChild(focusTargetNode, focusTargetNode2);
                    if (focusTargetNode.getFocusState() != androidx.compose.ui.focus.FocusStateImpl.ActiveParent) {
                        throw new java.lang.IllegalStateException("Deactivated node is focused".toString());
                    }
                    if (!requestFocusForChild) {
                        return requestFocusForChild;
                    }
                    androidx.compose.ui.focus.FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetNode5);
                    return requestFocusForChild;
                }
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    private static final boolean requestFocusForOwner(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.LayoutNode layoutNode;
        androidx.compose.ui.node.Owner owner;
        androidx.compose.ui.node.NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator();
        if (coordinator$ui_release == null || (layoutNode = coordinator$ui_release.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null) {
            throw new java.lang.IllegalStateException("Owner not initialized.".toString());
        }
        return owner.requestFocus();
    }

    private static final androidx.compose.ui.focus.FocusTargetNode requireActiveChild(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.focus.FocusTargetNode activeChild = androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        throw new java.lang.IllegalArgumentException("ActiveParent with no focused child".toString());
    }

    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final androidx.compose.ui.focus.CustomDestinationResult m1822performCustomRequestFocusMxy_nc0(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i) {
        androidx.compose.ui.Modifier.Node node;
        androidx.compose.ui.node.NodeChain nodes;
        int i2 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i2 == 1 || i2 == 2) {
            return androidx.compose.ui.focus.CustomDestinationResult.None;
        }
        if (i2 == 3) {
            return m1819performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i);
        }
        if (i2 == 4) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
            if (!focusTargetNode2.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.Modifier.Node parent = focusTargetNode2.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    node = null;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                            node = parent;
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            while (node != null) {
                                if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                    break loop0;
                                }
                                if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i3 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                            i3++;
                                            if (i3 == 1) {
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
                                    if (i3 == 1) {
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
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode3 = (androidx.compose.ui.focus.FocusTargetNode) node;
            if (focusTargetNode3 == null) {
                return androidx.compose.ui.focus.CustomDestinationResult.None;
            }
            int i4 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode3.getFocusState().ordinal()];
            if (i4 == 1) {
                return m1820performCustomEnterMxy_nc0(focusTargetNode3, i);
            }
            if (i4 == 2) {
                return androidx.compose.ui.focus.CustomDestinationResult.Cancelled;
            }
            if (i4 == 3) {
                return m1822performCustomRequestFocusMxy_nc0(focusTargetNode3, i);
            }
            if (i4 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            androidx.compose.ui.focus.CustomDestinationResult m1822performCustomRequestFocusMxy_nc0 = m1822performCustomRequestFocusMxy_nc0(focusTargetNode3, i);
            androidx.compose.ui.focus.CustomDestinationResult customDestinationResult = m1822performCustomRequestFocusMxy_nc0 != androidx.compose.ui.focus.CustomDestinationResult.None ? m1822performCustomRequestFocusMxy_nc0 : null;
            return customDestinationResult == null ? m1820performCustomEnterMxy_nc0(focusTargetNode3, i) : customDestinationResult;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final androidx.compose.ui.focus.CustomDestinationResult m1819performCustomClearFocusMxy_nc0(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i) {
        int i2 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$1[focusTargetNode.getFocusState().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return androidx.compose.ui.focus.CustomDestinationResult.Cancelled;
            }
            if (i2 == 3) {
                androidx.compose.ui.focus.CustomDestinationResult m1819performCustomClearFocusMxy_nc0 = m1819performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i);
                if (m1819performCustomClearFocusMxy_nc0 == androidx.compose.ui.focus.CustomDestinationResult.None) {
                    m1819performCustomClearFocusMxy_nc0 = null;
                }
                return m1819performCustomClearFocusMxy_nc0 == null ? m1821performCustomExitMxy_nc0(focusTargetNode, i) : m1819performCustomClearFocusMxy_nc0;
            }
            if (i2 != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return androidx.compose.ui.focus.CustomDestinationResult.None;
    }

    /* renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final androidx.compose.ui.focus.CustomDestinationResult m1820performCustomEnterMxy_nc0(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                androidx.compose.ui.focus.FocusRequester invoke = focusTargetNode.fetchFocusProperties$ui_release().getEnter().invoke(androidx.compose.ui.focus.FocusDirection.m1788boximpl(i));
                if (invoke != androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault()) {
                    if (invoke == androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel()) {
                        return androidx.compose.ui.focus.CustomDestinationResult.Cancelled;
                    }
                    return invoke.focus$ui_release() ? androidx.compose.ui.focus.CustomDestinationResult.Redirected : androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomEnter = false;
            }
        }
        return androidx.compose.ui.focus.CustomDestinationResult.None;
    }

    /* renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final androidx.compose.ui.focus.CustomDestinationResult m1821performCustomExitMxy_nc0(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                androidx.compose.ui.focus.FocusRequester invoke = focusTargetNode.fetchFocusProperties$ui_release().getExit().invoke(androidx.compose.ui.focus.FocusDirection.m1788boximpl(i));
                if (invoke != androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault()) {
                    if (invoke == androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel()) {
                        return androidx.compose.ui.focus.CustomDestinationResult.Cancelled;
                    }
                    return invoke.focus$ui_release() ? androidx.compose.ui.focus.CustomDestinationResult.Redirected : androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled;
                }
            } finally {
                focusTargetNode.isProcessingCustomExit = false;
            }
        }
        return androidx.compose.ui.focus.CustomDestinationResult.None;
    }
}

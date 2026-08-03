package androidx.compose.ui.focus;

/* compiled from: FocusOwnerImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016J\u001a\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0016ø\u0001\u0000¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,H\u0016J\n\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J\b\u00104\u001a\u00020\u0005H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u000207H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u000208H\u0016J\u0010\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u001aH\u0016J\b\u00109\u001a\u00020\u0005H\u0016J\u001a\u0010:\u001a\u00020!2\u0006\u0010$\u001a\u00020%H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010'J\u001a\u0010<\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u00103J\u000e\u0010>\u001a\u0004\u0018\u00010?*\u00020@H\u0002JY\u0010A\u001a\u00020\u0005\"\n\b\u0000\u0010B\u0018\u0001*\u00020@*\u00020@2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0D2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u0002HB\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u0002HB\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\bG\u0010HR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "keysCurrentlyDown", "Landroidx/collection/MutableLongSet;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "clearFocus", "force", "", "refreshFocusEvents", "dispatchInterceptedSoftKeyboardEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "dispatchKeyEvent-ZmokQxo", "dispatchRotaryEvent", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "getFocusRect", "Landroidx/compose/ui/geometry/Rect;", "moveFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "takeFocus", "validateKeyEvent", "validateKeyEvent-ZmokQxo", "wrapAroundFocus", "wrapAroundFocus-3ESFkO8", "lastLocalKeyInputNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "traverseAncestors", "T", "type", "Landroidx/compose/ui/node/NodeKind;", "onPreVisit", "onVisit", "traverseAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements androidx.compose.ui.focus.FocusOwner {
    public static final int $stable = 8;
    private final androidx.compose.ui.focus.FocusInvalidationManager focusInvalidationManager;
    private androidx.collection.MutableLongSet keysCurrentlyDown;
    public androidx.compose.ui.unit.LayoutDirection layoutDirection;
    private androidx.compose.ui.focus.FocusTargetNode rootFocusNode = new androidx.compose.ui.focus.FocusTargetNode();
    private final androidx.compose.ui.focus.FocusTransactionManager focusTransactionManager = new androidx.compose.ui.focus.FocusTransactionManager();
    private final androidx.compose.ui.Modifier modifier = new androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.focus.FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(java.lang.Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(androidx.compose.ui.focus.FocusTargetNode node) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public androidx.compose.ui.focus.FocusTargetNode create() {
            return androidx.compose.ui.focus.FocusOwnerImpl.this.getRootFocusNode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return androidx.compose.ui.focus.FocusOwnerImpl.this.getRootFocusNode().hashCode();
        }
    };

    /* compiled from: FocusOwnerImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[androidx.compose.ui.focus.CustomDestinationResult.values().length];
            try {
                iArr[androidx.compose.ui.focus.CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.focus.CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.focus.CustomDestinationResult.None.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[androidx.compose.ui.focus.FocusStateImpl.values().length];
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.Active.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.Captured.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[androidx.compose.ui.focus.FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FocusOwnerImpl(kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function1) {
        this.focusInvalidationManager = new androidx.compose.ui.focus.FocusInvalidationManager(function1);
    }

    /* renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final androidx.compose.ui.focus.FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    public final void setRootFocusNode$ui_release(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public androidx.compose.ui.focus.FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        androidx.compose.ui.unit.LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void takeFocus() {
        if (this.rootFocusNode.getFocusState() == androidx.compose.ui.focus.FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusState(androidx.compose.ui.focus.FocusStateImpl.Active);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        androidx.compose.ui.focus.FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean force) {
        clearFocus(force, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void clearFocus(boolean force, boolean refreshFocusEvents) {
        androidx.compose.ui.focus.FocusStateImpl focusStateImpl;
        androidx.compose.ui.focus.FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (!force) {
                int i = androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.$EnumSwitchMapping$0[androidx.compose.ui.focus.FocusTransactionsKt.m1819performCustomClearFocusMxy_nc0(this.rootFocusNode, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1799getExitdhqQ8s()).ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
            }
            androidx.compose.ui.focus.FocusStateImpl focusState = this.rootFocusNode.getFocusState();
            if (androidx.compose.ui.focus.FocusTransactionsKt.clearFocus(this.rootFocusNode, force, refreshFocusEvents)) {
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode = this.rootFocusNode;
                int i2 = androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.$EnumSwitchMapping$1[focusState.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    focusStateImpl = androidx.compose.ui.focus.FocusStateImpl.Active;
                } else {
                    if (i2 != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    focusStateImpl = androidx.compose.ui.focus.FocusStateImpl.Inactive;
                }
                focusTargetNode.setFocusState(focusStateImpl);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            focusTransactionManager.commitTransaction();
        }
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo1805moveFocus3ESFkO8(final int focusDirection) {
        final androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode == null) {
            return false;
        }
        androidx.compose.ui.focus.FocusRequester m1823customFocusSearchOMvw8 = androidx.compose.ui.focus.FocusTraversalKt.m1823customFocusSearchOMvw8(findActiveFocusNode, focusDirection, getLayoutDirection());
        if (m1823customFocusSearchOMvw8 != androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault()) {
            return m1823customFocusSearchOMvw8 != androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel() && m1823customFocusSearchOMvw8.focus$ui_release();
        }
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        boolean m1824focusSearchsMXa3k8 = androidx.compose.ui.focus.FocusTraversalKt.m1824focusSearchsMXa3k8(this.rootFocusNode, focusDirection, getLayoutDirection(), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$foundNextItem$1

            /* compiled from: FocusOwnerImpl.kt */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.compose.ui.focus.CustomDestinationResult.values().length];
                    try {
                        iArr[androidx.compose.ui.focus.CustomDestinationResult.Redirected.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.compose.ui.focus.CustomDestinationResult.Cancelled.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.compose.ui.focus.CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[androidx.compose.ui.focus.CustomDestinationResult.None.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                androidx.compose.ui.Modifier.Node node;
                boolean z;
                androidx.compose.ui.node.NodeChain nodes;
                if (kotlin.jvm.internal.Intrinsics.areEqual(focusTargetNode, androidx.compose.ui.focus.FocusTargetNode.this)) {
                    return false;
                }
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = focusTargetNode;
                int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
                if (!focusTargetNode2.getNode().getIsAttached()) {
                    throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                androidx.compose.ui.Modifier.Node parent = focusTargetNode2.getNode().getParent();
                androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
                loop0: while (true) {
                    node = null;
                    z = true;
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
                if (node == null) {
                    throw new java.lang.IllegalStateException("Focus search landed at the root.".toString());
                }
                androidx.compose.ui.focus.FocusTransactionManager focusTransactionManager = this.getFocusTransactionManager();
                int i2 = focusDirection;
                kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = booleanRef;
                try {
                    if (focusTransactionManager.ongoingTransaction) {
                        focusTransactionManager.cancelTransaction();
                    }
                    focusTransactionManager.beginTransaction();
                    int i3 = androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$foundNextItem$1.WhenMappings.$EnumSwitchMapping$0[androidx.compose.ui.focus.FocusTransactionsKt.m1822performCustomRequestFocusMxy_nc0(focusTargetNode, i2).ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2 || i3 == 3) {
                            booleanRef2.element = true;
                        } else {
                            if (i3 != 4) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            z = androidx.compose.ui.focus.FocusTransactionsKt.performRequestFocus(focusTargetNode);
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                } finally {
                    focusTransactionManager.commitTransaction();
                }
            }
        });
        if (booleanRef.element) {
            return false;
        }
        return m1824focusSearchsMXa3k8 || m1810wrapAroundFocus3ESFkO8(focusDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-ZmokQxo */
    public boolean mo1807dispatchKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        int size;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.DelegatingNode delegatingNode;
        androidx.compose.ui.node.NodeChain nodes2;
        if (!m1809validateKeyEventZmokQxo(keyEvent)) {
            return false;
        }
        androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode == null) {
            throw new java.lang.IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = findActiveFocusNode;
        androidx.compose.ui.Modifier.Node lastLocalKeyInputNode = lastLocalKeyInputNode(focusTargetNode);
        if (lastLocalKeyInputNode == null) {
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(8192);
            if (!focusTargetNode.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.Modifier.Node parent = focusTargetNode.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            delegatingNode = parent;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            androidx.compose.ui.input.key.KeyInputModifierNode keyInputModifierNode = (androidx.compose.ui.input.key.KeyInputModifierNode) delegatingNode;
            lastLocalKeyInputNode = keyInputModifierNode != null ? keyInputModifierNode.getNode() : null;
        }
        if (lastLocalKeyInputNode != null) {
            androidx.compose.ui.Modifier.Node node = lastLocalKeyInputNode;
            int m3613constructorimpl2 = androidx.compose.ui.node.NodeKind.m3613constructorimpl(8192);
            if (!node.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.Modifier.Node parent2 = node.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node);
            java.util.ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl2) != 0) {
                    while (parent2 != null) {
                        if ((parent2.getKindSet() & m3613constructorimpl2) != 0) {
                            androidx.compose.ui.Modifier.Node node2 = parent2;
                            androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(node2);
                                } else if ((node2.getKindSet() & m3613constructorimpl2) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & m3613constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node2 = delegate2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                }
                                                if (node2 != null) {
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(node2);
                                                    }
                                                    node2 = null;
                                                }
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegate2);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent2 = parent2.getParent();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                parent2 = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((androidx.compose.ui.input.key.KeyInputModifierNode) arrayList.get(size)).mo182onPreKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            androidx.compose.ui.node.DelegatingNode node3 = node.getNode();
            androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
            while (node3 != 0) {
                if (node3 instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
                    if (((androidx.compose.ui.input.key.KeyInputModifierNode) node3).mo182onPreKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & m3613constructorimpl2) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate3 = node3.getDelegate();
                    int i4 = 0;
                    node3 = node3;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & m3613constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node3 = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(node3);
                                    }
                                    node3 = 0;
                                }
                                if (mutableVector3 != null) {
                                    mutableVector3.add(delegate3);
                                }
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node3 = node3;
                    }
                    if (i4 == 1) {
                    }
                }
                node3 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
            }
            androidx.compose.ui.node.DelegatingNode node4 = node.getNode();
            androidx.compose.runtime.collection.MutableVector mutableVector4 = null;
            while (node4 != 0) {
                if (node4 instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
                    if (((androidx.compose.ui.input.key.KeyInputModifierNode) node4).mo180onKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node4.getKindSet() & m3613constructorimpl2) != 0 && (node4 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate4 = node4.getDelegate();
                    int i5 = 0;
                    node4 = node4;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & m3613constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node4 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                }
                                if (node4 != 0) {
                                    if (mutableVector4 != null) {
                                        mutableVector4.add(node4);
                                    }
                                    node4 = 0;
                                }
                                if (mutableVector4 != null) {
                                    mutableVector4.add(delegate4);
                                }
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node4 = node4;
                    }
                    if (i5 == 1) {
                    }
                }
                node4 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((androidx.compose.ui.input.key.KeyInputModifierNode) arrayList.get(i6)).mo180onKeyEventZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo1806dispatchInterceptedSoftKeyboardEventZmokQxo(android.view.KeyEvent keyEvent) {
        androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.DelegatingNode delegatingNode;
        androidx.compose.ui.node.NodeChain nodes2;
        androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = findActiveFocusNode;
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(131072);
            if (!focusTargetNode.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.Modifier.Node parent = focusTargetNode.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            delegatingNode = parent;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            softKeyboardInterceptionModifierNode = (androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) delegatingNode;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode2 = softKeyboardInterceptionModifierNode;
            int m3613constructorimpl2 = androidx.compose.ui.node.NodeKind.m3613constructorimpl(131072);
            if (!softKeyboardInterceptionModifierNode2.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.Modifier.Node parent2 = softKeyboardInterceptionModifierNode2.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode2);
            java.util.ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl2) != 0) {
                    while (parent2 != null) {
                        if ((parent2.getKindSet() & m3613constructorimpl2) != 0) {
                            androidx.compose.ui.Modifier.Node node = parent2;
                            androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                            while (node != null) {
                                if (node instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(node);
                                } else if ((node.getKindSet() & m3613constructorimpl2) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & m3613constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node = delegate2;
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
                                                    mutableVector2.add(delegate2);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent2 = parent2.getParent();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                parent2 = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo2822onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            androidx.compose.ui.node.DelegatingNode node2 = softKeyboardInterceptionModifierNode2.getNode();
            androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
            while (node2 != 0) {
                if (node2 instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) {
                    if (((androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) node2).mo2822onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & m3613constructorimpl2) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate3 = node2.getDelegate();
                    int i4 = 0;
                    node2 = node2;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & m3613constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node2 = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(node2);
                                    }
                                    node2 = 0;
                                }
                                if (mutableVector3 != null) {
                                    mutableVector3.add(delegate3);
                                }
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                    }
                    if (i4 == 1) {
                    }
                }
                node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
            }
            androidx.compose.ui.node.DelegatingNode node3 = softKeyboardInterceptionModifierNode2.getNode();
            androidx.compose.runtime.collection.MutableVector mutableVector4 = null;
            while (node3 != 0) {
                if (node3 instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) {
                    if (((androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) node3).mo2821onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & m3613constructorimpl2) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate4 = node3.getDelegate();
                    int i5 = 0;
                    node3 = node3;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & m3613constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node3 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    if (mutableVector4 != null) {
                                        mutableVector4.add(node3);
                                    }
                                    node3 = 0;
                                }
                                if (mutableVector4 != null) {
                                    mutableVector4.add(delegate4);
                                }
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                    }
                    if (i5 == 1) {
                    }
                }
                node3 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) arrayList.get(i6)).mo2821onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(androidx.compose.ui.input.rotary.RotaryScrollEvent event) {
        androidx.compose.ui.input.rotary.RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.DelegatingNode delegatingNode;
        androidx.compose.ui.node.NodeChain nodes2;
        androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = findActiveFocusNode;
            int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(16384);
            if (!focusTargetNode.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.Modifier.Node parent = focusTargetNode.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m3613constructorimpl) != 0) {
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            delegatingNode = parent;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                    int i = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
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
                                    if (i == 1) {
                                    }
                                }
                                delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            rotaryInputModifierNode = (androidx.compose.ui.input.rotary.RotaryInputModifierNode) delegatingNode;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            androidx.compose.ui.input.rotary.RotaryInputModifierNode rotaryInputModifierNode2 = rotaryInputModifierNode;
            int m3613constructorimpl2 = androidx.compose.ui.node.NodeKind.m3613constructorimpl(16384);
            if (!rotaryInputModifierNode2.getNode().getIsAttached()) {
                throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            androidx.compose.ui.Modifier.Node parent2 = rotaryInputModifierNode2.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode2);
            java.util.ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl2) != 0) {
                    while (parent2 != null) {
                        if ((parent2.getKindSet() & m3613constructorimpl2) != 0) {
                            androidx.compose.ui.Modifier.Node node = parent2;
                            androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                            while (node != null) {
                                if (node instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(node);
                                } else if ((node.getKindSet() & m3613constructorimpl2) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & m3613constructorimpl2) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                node = delegate2;
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
                                                    mutableVector2.add(delegate2);
                                                }
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent2 = parent2.getParent();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
                parent2 = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((androidx.compose.ui.input.rotary.RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            androidx.compose.ui.node.DelegatingNode node2 = rotaryInputModifierNode2.getNode();
            androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
            while (node2 != 0) {
                if (node2 instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode) {
                    if (((androidx.compose.ui.input.rotary.RotaryInputModifierNode) node2).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node2.getKindSet() & m3613constructorimpl2) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate3 = node2.getDelegate();
                    int i4 = 0;
                    node2 = node2;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & m3613constructorimpl2) != 0) {
                            i4++;
                            if (i4 == 1) {
                                node2 = delegate3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(node2);
                                    }
                                    node2 = 0;
                                }
                                if (mutableVector3 != null) {
                                    mutableVector3.add(delegate3);
                                }
                            }
                        }
                        delegate3 = delegate3.getChild();
                        node2 = node2;
                    }
                    if (i4 == 1) {
                    }
                }
                node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
            }
            androidx.compose.ui.node.DelegatingNode node3 = rotaryInputModifierNode2.getNode();
            androidx.compose.runtime.collection.MutableVector mutableVector4 = null;
            while (node3 != 0) {
                if (node3 instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode) {
                    if (((androidx.compose.ui.input.rotary.RotaryInputModifierNode) node3).onRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & m3613constructorimpl2) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate4 = node3.getDelegate();
                    int i5 = 0;
                    node3 = node3;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & m3613constructorimpl2) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node3 = delegate4;
                            } else {
                                if (mutableVector4 == null) {
                                    mutableVector4 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                }
                                if (node3 != 0) {
                                    if (mutableVector4 != null) {
                                        mutableVector4.add(node3);
                                    }
                                    node3 = 0;
                                }
                                if (mutableVector4 != null) {
                                    mutableVector4.add(delegate4);
                                }
                            }
                        }
                        delegate4 = delegate4.getChild();
                        node3 = node3;
                    }
                    if (i5 == 1) {
                    }
                }
                node3 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((androidx.compose.ui.input.rotary.RotaryInputModifierNode) arrayList.get(i6)).onRotaryScrollEvent(event)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(androidx.compose.ui.focus.FocusTargetNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(androidx.compose.ui.focus.FocusEventModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(androidx.compose.ui.focus.FocusPropertiesModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public androidx.compose.ui.geometry.Rect getFocusRect() {
        androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            return androidx.compose.ui.focus.FocusTraversalKt.focusRect(findActiveFocusNode);
        }
        return null;
    }

    /* renamed from: wrapAroundFocus-3ESFkO8, reason: not valid java name */
    private final boolean m1810wrapAroundFocus3ESFkO8(int focusDirection) {
        if (!this.rootFocusNode.getFocusState().getHasFocus() || this.rootFocusNode.getFocusState().isFocused() || (!androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(focusDirection, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1801getNextdhqQ8s()) && !androidx.compose.ui.focus.FocusDirection.m1791equalsimpl0(focusDirection, androidx.compose.ui.focus.FocusDirection.INSTANCE.m1802getPreviousdhqQ8s()))) {
            return false;
        }
        clearFocus(false);
        if (this.rootFocusNode.getFocusState().isFocused()) {
            return mo1805moveFocus3ESFkO8(focusDirection);
        }
        return false;
    }

    /* renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m1809validateKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        long m3134getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m3134getKeyZmokQxo(keyEvent);
        int m3135getTypeZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m3135getTypeZmokQxo(keyEvent);
        if (androidx.compose.ui.input.key.KeyEventType.m3127equalsimpl0(m3135getTypeZmokQxo, androidx.compose.ui.input.key.KeyEventType.INSTANCE.m3131getKeyDownCS__XNY())) {
            androidx.collection.MutableLongSet mutableLongSet = this.keysCurrentlyDown;
            if (mutableLongSet == null) {
                mutableLongSet = new androidx.collection.MutableLongSet(3);
                this.keysCurrentlyDown = mutableLongSet;
            }
            mutableLongSet.plusAssign(m3134getKeyZmokQxo);
        } else if (androidx.compose.ui.input.key.KeyEventType.m3127equalsimpl0(m3135getTypeZmokQxo, androidx.compose.ui.input.key.KeyEventType.INSTANCE.m3132getKeyUpCS__XNY())) {
            androidx.collection.MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
            if (mutableLongSet2 == null || !mutableLongSet2.contains(m3134getKeyZmokQxo)) {
                return false;
            }
            androidx.collection.MutableLongSet mutableLongSet3 = this.keysCurrentlyDown;
            if (mutableLongSet3 != null) {
                mutableLongSet3.remove(m3134getKeyZmokQxo);
            }
        }
        return true;
    }

    /* renamed from: traverseAncestors-Y-YKmho, reason: not valid java name */
    private final /* synthetic */ <T extends androidx.compose.ui.node.DelegatableNode> void m1808traverseAncestorsYYKmho(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function12) {
        int i2;
        int size;
        androidx.compose.ui.node.NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node parent = delegatableNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(delegatableNode);
        java.util.ArrayList arrayList = null;
        while (true) {
            if (requireLayoutNode == null) {
                break;
            }
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i) != 0) {
                        androidx.compose.ui.Modifier.Node node = parent;
                        androidx.compose.runtime.collection.MutableVector mutableVector = null;
                        while (node != null) {
                            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
                            if (node instanceof java.lang.Object) {
                                if (arrayList == null) {
                                    arrayList = new java.util.ArrayList();
                                }
                                arrayList.add(node);
                            } else if ((node.getKindSet() & i) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i3 = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
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
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i4 = size - 1;
                function1.invoke((java.lang.Object) arrayList.get(size));
                if (i4 < 0) {
                    break;
                } else {
                    size = i4;
                }
            }
        }
        androidx.compose.ui.Modifier.Node node2 = delegatableNode.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
        while (node2 != null) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (node2 instanceof java.lang.Object) {
                function1.invoke(node2);
            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i5 = 0;
                for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                    if ((delegate2.getKindSet() & i) != 0) {
                        i5++;
                        if (i5 == 1) {
                            node2 = delegate2;
                        } else {
                            if (mutableVector2 == null) {
                                mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (node2 != null) {
                                if (mutableVector2 != null) {
                                    mutableVector2.add(node2);
                                }
                                node2 = null;
                            }
                            if (mutableVector2 != null) {
                                mutableVector2.add(delegate2);
                            }
                        }
                    }
                }
                if (i5 == 1) {
                }
            }
            node2 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector2);
        }
        androidx.compose.ui.Modifier.Node node3 = delegatableNode.getNode();
        androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
        while (node3 != null) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (node3 instanceof java.lang.Object) {
                function12.invoke(node3);
            } else if ((node3.getKindSet() & i) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                int i6 = 0;
                for (androidx.compose.ui.Modifier.Node delegate3 = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                    if ((delegate3.getKindSet() & i) != 0) {
                        i6++;
                        if (i6 == 1) {
                            node3 = delegate3;
                        } else {
                            if (mutableVector3 == null) {
                                mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (node3 != null) {
                                if (mutableVector3 != null) {
                                    mutableVector3.add(node3);
                                }
                                node3 = null;
                            }
                            if (mutableVector3 != null) {
                                mutableVector3.add(delegate3);
                            }
                        }
                    }
                }
                if (i6 == 1) {
                }
            }
            node3 = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector3);
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (i2 = 0; i2 < size2; i2++) {
                function12.invoke((java.lang.Object) arrayList.get(i2));
            }
        }
    }

    private final androidx.compose.ui.Modifier.Node lastLocalKeyInputNode(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024) | androidx.compose.ui.node.NodeKind.m3613constructorimpl(8192);
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        androidx.compose.ui.Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet() & m3613constructorimpl) != 0) {
            for (androidx.compose.ui.Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & m3613constructorimpl) != 0) {
                    if ((androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024) & child.getKindSet()) != 0) {
                        return node2;
                    }
                    node2 = child;
                }
            }
        }
        return node2;
    }
}

package androidx.compose.ui.focus;

/* compiled from: FocusTargetNode.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00013B\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ/\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001e0$H\u0080\bø\u0001\u0000¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001e0$H\u0080\bø\u0001\u0000¢\u0006\u0004\b)\u0010'J\r\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\r\u0010-\u001a\u00020\u001eH\u0000¢\u0006\u0002\b.J\b\u0010/\u001a\u00020\u001eH\u0016J\b\u00100\u001a\u00020\u001eH\u0016J\r\u00101\u001a\u00020\u001eH\u0000¢\u0006\u0002\b2R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "()V", "beyondBoundsLayoutParent", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "committedFocusState", "Landroidx/compose/ui/focus/FocusStateImpl;", "value", "focusState", "getFocusState$annotations", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "isProcessingCustomEnter", "", "isProcessingCustomExit", "previouslyFocusedChildHash", "", "getPreviouslyFocusedChildHash", "()I", "setPreviouslyFocusedChildHash", "(I)V", "commitFocusState", "", "commitFocusState$ui_release", "fetchCustomEnter", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusRequester;", "fetchCustomEnter-aToIllA$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "fetchCustomExit", "fetchCustomExit-aToIllA$ui_release", "fetchFocusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties$ui_release", "invalidateFocus", "invalidateFocus$ui_release", "onObservedReadsChanged", "onReset", "scheduleInvalidationForFocusEvents", "scheduleInvalidationForFocusEvents$ui_release", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTargetNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.focus.FocusTargetModifierNode, androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.modifier.ModifierLocalModifierNode {
    public static final int $stable = 8;
    private androidx.compose.ui.focus.FocusStateImpl committedFocusState = androidx.compose.ui.focus.FocusStateImpl.Inactive;
    private boolean isProcessingCustomEnter;
    private boolean isProcessingCustomExit;
    private int previouslyFocusedChildHash;

    /* compiled from: FocusTargetNode.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    public static /* synthetic */ void getFocusState$annotations() {
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ java.lang.Object getCurrent(androidx.compose.ui.modifier.ModifierLocal modifierLocal) {
        return androidx.compose.ui.modifier.ModifierLocalModifierNode.CC.$default$getCurrent(this, modifierLocal);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ androidx.compose.ui.modifier.ModifierLocalMap getProvidedValues() {
        androidx.compose.ui.modifier.ModifierLocalMap modifierLocalMap;
        modifierLocalMap = androidx.compose.ui.modifier.EmptyMap.INSTANCE;
        return modifierLocalMap;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(androidx.compose.ui.modifier.ModifierLocal modifierLocal, java.lang.Object obj) {
        androidx.compose.ui.modifier.ModifierLocalModifierNode.CC.$default$provide(this, modifierLocal, obj);
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    public androidx.compose.ui.focus.FocusStateImpl getFocusState() {
        androidx.compose.ui.focus.FocusTransactionManager focusTransactionManager;
        androidx.compose.ui.focus.FocusStateImpl uncommittedFocusState;
        focusTransactionManager = androidx.compose.ui.focus.FocusTargetNodeKt.getFocusTransactionManager(this);
        return (focusTransactionManager == null || (uncommittedFocusState = focusTransactionManager.getUncommittedFocusState(this)) == null) ? this.committedFocusState : uncommittedFocusState;
    }

    public void setFocusState(androidx.compose.ui.focus.FocusStateImpl focusStateImpl) {
        androidx.compose.ui.focus.FocusTargetNodeKt.requireTransactionManager(this).setUncommittedFocusState(this, focusStateImpl);
    }

    public final int getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    public final void setPreviouslyFocusedChildHash(int i) {
        this.previouslyFocusedChildHash = i;
    }

    public final androidx.compose.ui.layout.BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return (androidx.compose.ui.layout.BeyondBoundsLayout) getCurrent(androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        androidx.compose.ui.focus.FocusStateImpl focusState = getFocusState();
        invalidateFocus$ui_release();
        if (focusState != getFocusState()) {
            androidx.compose.ui.focus.FocusEventModifierNodeKt.refreshFocusEventNodes(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        int i = androidx.compose.ui.focus.FocusTargetNode.WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            scheduleInvalidationForFocusEvents$ui_release();
            return;
        }
        scheduleInvalidationForFocusEvents$ui_release();
        androidx.compose.ui.focus.FocusTransactionManager requireTransactionManager = androidx.compose.ui.focus.FocusTargetNodeKt.requireTransactionManager(this);
        try {
            if (requireTransactionManager.ongoingTransaction) {
                requireTransactionManager.cancelTransaction();
            }
            requireTransactionManager.beginTransaction();
            setFocusState(androidx.compose.ui.focus.FocusStateImpl.Inactive);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            requireTransactionManager.commitTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [androidx.compose.ui.Modifier$Node] */
    public final androidx.compose.ui.focus.FocusProperties fetchFocusProperties$ui_release() {
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.focus.FocusPropertiesImpl focusPropertiesImpl = new androidx.compose.ui.focus.FocusPropertiesImpl();
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = this;
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(2048);
        int m3613constructorimpl2 = androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusTargetNode.getNode();
        int i = m3613constructorimpl | m3613constructorimpl2;
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node node2 = focusTargetNode.getNode();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i) != 0) {
                        if (node2 != node && (node2.getKindSet() & m3613constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & m3613constructorimpl) != 0) {
                            androidx.compose.ui.node.DelegatingNode delegatingNode = node2;
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof androidx.compose.ui.focus.FocusPropertiesModifierNode) {
                                    ((androidx.compose.ui.focus.FocusPropertiesModifierNode) delegatingNode).applyFocusProperties(focusPropertiesImpl);
                                } else if ((delegatingNode.getKindSet() & m3613constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node2 = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return focusPropertiesImpl;
    }

    /* renamed from: fetchCustomEnter-aToIllA$ui_release, reason: not valid java name */
    public final void m1817fetchCustomEnteraToIllA$ui_release(int focusDirection, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusRequester, kotlin.Unit> block) {
        if (this.isProcessingCustomEnter) {
            return;
        }
        this.isProcessingCustomEnter = true;
        try {
            androidx.compose.ui.focus.FocusRequester invoke = fetchFocusProperties$ui_release().getEnter().invoke(androidx.compose.ui.focus.FocusDirection.m1788boximpl(focusDirection));
            if (invoke != androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault()) {
                block.invoke(invoke);
            }
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            this.isProcessingCustomEnter = false;
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    /* renamed from: fetchCustomExit-aToIllA$ui_release, reason: not valid java name */
    public final void m1818fetchCustomExitaToIllA$ui_release(int focusDirection, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusRequester, kotlin.Unit> block) {
        if (this.isProcessingCustomExit) {
            return;
        }
        this.isProcessingCustomExit = true;
        try {
            androidx.compose.ui.focus.FocusRequester invoke = fetchFocusProperties$ui_release().getExit().invoke(androidx.compose.ui.focus.FocusDirection.m1788boximpl(focusDirection));
            if (invoke != androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault()) {
                block.invoke(invoke);
            }
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            this.isProcessingCustomExit = false;
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public final void commitFocusState$ui_release() {
        androidx.compose.ui.focus.FocusStateImpl uncommittedFocusState = androidx.compose.ui.focus.FocusTargetNodeKt.requireTransactionManager(this).getUncommittedFocusState(this);
        if (uncommittedFocusState == null) {
            throw new java.lang.IllegalStateException("committing a node that was not updated in the current transaction".toString());
        }
        this.committedFocusState = uncommittedFocusState;
    }

    public final void invalidateFocus$ui_release() {
        androidx.compose.ui.focus.FocusProperties focusProperties;
        int i = androidx.compose.ui.focus.FocusTargetNode.WhenMappings.$EnumSwitchMapping$0[getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.FocusProperties] */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    objectRef.element = this.fetchFocusProperties$ui_release();
                }
            });
            if (objectRef.element == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
                focusProperties = null;
            } else {
                focusProperties = (androidx.compose.ui.focus.FocusProperties) objectRef.element;
            }
            if (focusProperties.getCanFocus()) {
                return;
            }
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    public final void scheduleInvalidationForFocusEvents$ui_release() {
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.DelegatingNode node = getNode();
        int m3613constructorimpl = androidx.compose.ui.node.NodeKind.m3613constructorimpl(4096);
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (node != 0) {
            if (node instanceof androidx.compose.ui.focus.FocusEventModifierNode) {
                androidx.compose.ui.focus.FocusEventModifierNodeKt.invalidateFocusEvent((androidx.compose.ui.focus.FocusEventModifierNode) node);
            } else if ((node.getKindSet() & m3613constructorimpl) != 0 && (node instanceof androidx.compose.ui.node.DelegatingNode)) {
                androidx.compose.ui.Modifier.Node delegate = node.getDelegate();
                int i = 0;
                node = node;
                while (delegate != null) {
                    if ((delegate.getKindSet() & m3613constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            node = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (node != 0) {
                                if (mutableVector != null) {
                                    mutableVector.add(node);
                                }
                                node = 0;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                    delegate = delegate.getChild();
                    node = node;
                }
                if (i == 1) {
                }
            }
            node = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector);
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = this;
        int m3613constructorimpl2 = androidx.compose.ui.node.NodeKind.m3613constructorimpl(4096) | androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new java.lang.IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        androidx.compose.ui.Modifier.Node parent = focusTargetNode.getNode().getParent();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m3613constructorimpl2) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & m3613constructorimpl2) != 0 && (androidx.compose.ui.node.NodeKind.m3613constructorimpl(1024) & parent.getKindSet()) == 0 && parent.getIsAttached()) {
                        int m3613constructorimpl3 = androidx.compose.ui.node.NodeKind.m3613constructorimpl(4096);
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        androidx.compose.ui.node.DelegatingNode delegatingNode = parent;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof androidx.compose.ui.focus.FocusEventModifierNode) {
                                androidx.compose.ui.focus.FocusEventModifierNodeKt.invalidateFocusEvent((androidx.compose.ui.focus.FocusEventModifierNode) delegatingNode);
                            } else if ((delegatingNode.getKindSet() & m3613constructorimpl3) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                androidx.compose.ui.Modifier.Node delegate2 = delegatingNode.getDelegate();
                                int i2 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate2 != null) {
                                    if ((delegate2.getKindSet() & m3613constructorimpl3) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            delegatingNode = delegate2;
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
                                                mutableVector2.add(delegate2);
                                            }
                                        }
                                    }
                                    delegate2 = delegate2.getChild();
                                    delegatingNode = delegatingNode;
                                }
                                if (i2 == 1) {
                                }
                            }
                            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    /* compiled from: FocusTargetNode.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\f\u0010\u000e\u001a\u00020\f*\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetNode;", "()V", "create", "equals", "", "other", "", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FocusTargetElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.focus.FocusTargetNode> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.focus.FocusTargetNode.FocusTargetElement INSTANCE = new androidx.compose.ui.focus.FocusTargetNode.FocusTargetElement();

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(java.lang.Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(androidx.compose.ui.focus.FocusTargetNode node) {
        }

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public androidx.compose.ui.focus.FocusTargetNode create() {
            return new androidx.compose.ui.focus.FocusTargetNode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusTarget");
        }
    }
}

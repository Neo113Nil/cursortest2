package androidx.compose.ui.viewinterop;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0005R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u001b8\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\"\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u001b8\u0006¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c"}, d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "<init>", "()V", "Landroidx/compose/ui/focus/FocusProperties;", "p0", "", "applyFocusProperties", "(Landroidx/compose/ui/focus/FocusProperties;)V", "Landroidx/compose/ui/focus/FocusTargetNode;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroid/view/View;", "p1", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "onAttach", "onDetach", "Landroid/view/View;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/view/ViewTreeObserver;", "Camera2StreamConfigurationMap", "Landroid/view/ViewTreeObserver;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusGroupPropertiesNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.focus.FocusPropertiesModifierNode, android.view.ViewTreeObserver.OnGlobalFocusChangeListener {
    public android.view.ViewTreeObserver Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusEnterExitScope, kotlin.Unit> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusEnterExitScope, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusEnterExitScope focusEnterExitScope) {
            getHighSpeedVideoFpsRanges(focusEnterExitScope);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.focus.FocusEnterExitScope focusEnterExitScope) {
            android.view.View access$getEmbeddedView = androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$getEmbeddedView(androidx.compose.ui.viewinterop.FocusGroupPropertiesNode.this);
            if (access$getEmbeddedView.isFocused() || access$getEmbeddedView.hasFocus()) {
                return;
            }
            if (androidx.compose.ui.focus.FocusInteropUtils_androidKt.requestInteropFocus(access$getEmbeddedView, androidx.compose.ui.focus.FocusInteropUtils_androidKt.m5657toAndroidFocusDirection3ESFkO8(focusEnterExitScope.getRequestedFocusDirection()), androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$getCurrentlyFocusedRect(androidx.compose.ui.node.DelegatableNodeKt.requireOwner(androidx.compose.ui.viewinterop.FocusGroupPropertiesNode.this).getFocusOwner(), androidx.compose.ui.node.DelegatableNode_androidKt.requireView(androidx.compose.ui.viewinterop.FocusGroupPropertiesNode.this), access$getEmbeddedView))) {
                return;
            }
            focusEnterExitScope.cancelFocusChange();
        }

        {
            super(1);
        }
    };
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusEnterExitScope, kotlin.Unit> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusEnterExitScope, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.focus.FocusEnterExitScope focusEnterExitScope) {
            getHighSpeedVideoSizes(focusEnterExitScope);
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoSizes(androidx.compose.ui.focus.FocusEnterExitScope focusEnterExitScope) {
            android.view.View findNextFocusFromRect;
            android.view.View access$getEmbeddedView = androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$getEmbeddedView(androidx.compose.ui.viewinterop.FocusGroupPropertiesNode.this);
            if (androidx.compose.ui.ComposeUiFlags.isViewFocusFixEnabled) {
                if (access$getEmbeddedView.hasFocus() || access$getEmbeddedView.isFocused()) {
                    access$getEmbeddedView.clearFocus();
                    return;
                }
                return;
            }
            if (androidx.compose.ui.ComposeUiFlags.isBypassUnfocusableComposeViewEnabled || !access$getEmbeddedView.hasFocus()) {
                return;
            }
            androidx.compose.ui.focus.FocusOwner focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(androidx.compose.ui.viewinterop.FocusGroupPropertiesNode.this).getFocusOwner();
            android.view.View requireView = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(androidx.compose.ui.viewinterop.FocusGroupPropertiesNode.this);
            if (!(access$getEmbeddedView instanceof android.view.ViewGroup)) {
                if (!requireView.requestFocus()) {
                    throw new java.lang.IllegalStateException("host view did not take focus".toString());
                }
                return;
            }
            android.graphics.Rect access$getCurrentlyFocusedRect = androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$getCurrentlyFocusedRect(focusOwner, requireView, access$getEmbeddedView);
            java.lang.Integer m5657toAndroidFocusDirection3ESFkO8 = androidx.compose.ui.focus.FocusInteropUtils_androidKt.m5657toAndroidFocusDirection3ESFkO8(focusEnterExitScope.getRequestedFocusDirection());
            int intValue = m5657toAndroidFocusDirection3ESFkO8 != null ? m5657toAndroidFocusDirection3ESFkO8.intValue() : 130;
            android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
            androidx.compose.ui.viewinterop.FocusGroupPropertiesNode focusGroupPropertiesNode = androidx.compose.ui.viewinterop.FocusGroupPropertiesNode.this;
            if (focusGroupPropertiesNode.getHighResolutionOutputSizeshNQ4ISI != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(requireView, "");
                findNextFocusFromRect = focusFinder.findNextFocus((android.view.ViewGroup) requireView, focusGroupPropertiesNode.getHighResolutionOutputSizeshNQ4ISI, intValue);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(requireView, "");
                findNextFocusFromRect = focusFinder.findNextFocusFromRect((android.view.ViewGroup) requireView, access$getCurrentlyFocusedRect, intValue);
            }
            if (findNextFocusFromRect != null && androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$containsDescendant(access$getEmbeddedView, findNextFocusFromRect)) {
                findNextFocusFromRect.requestFocus(intValue, access$getCurrentlyFocusedRect);
                focusEnterExitScope.cancelFocusChange();
            } else if (!requireView.requestFocus()) {
                throw new java.lang.IllegalStateException("host view did not take focus".toString());
            }
        }

        {
            super(1);
        }
    };

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    android.view.View getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(androidx.compose.ui.focus.FocusProperties p0) {
        p0.setCanFocus(false);
        p0.setOnEnter(this.getHighSpeedVideoSizes);
        p0.setOnExit(this.getHighSpeedVideoFpsRanges);
    }

    private final androidx.compose.ui.focus.FocusTargetNode getHighSpeedVideoFpsRangesFor() {
        androidx.compose.ui.viewinterop.FocusGroupPropertiesNode focusGroupPropertiesNode = this;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusGroupPropertiesNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = focusGroupPropertiesNode.getNode();
        if ((node.getAggregateChildKindSet() & m7621constructorimpl) != 0) {
            boolean z = false;
            for (androidx.compose.ui.Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & m7621constructorimpl) != 0) {
                    androidx.compose.ui.Modifier.Node node2 = child;
                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                    while (node2 != null) {
                        if (node2 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = (androidx.compose.ui.focus.FocusTargetNode) node2;
                            if (z) {
                                return focusTargetNode;
                            }
                            z = true;
                        } else if ((node2.getKindSet() & m7621constructorimpl) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
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
            }
        }
        throw new java.lang.IllegalStateException("Could not find focus target of embedded view wrapper".toString());
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(android.view.View p0, android.view.View p1) {
        androidx.compose.ui.viewinterop.FocusGroupPropertiesNode focusGroupPropertiesNode = this;
        if (androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusGroupPropertiesNode).getOwner() != null) {
            android.view.View access$getEmbeddedView = androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$getEmbeddedView(this);
            androidx.compose.ui.focus.FocusOwner focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusGroupPropertiesNode).getFocusOwner();
            androidx.compose.ui.node.Owner requireOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusGroupPropertiesNode);
            boolean z = (p0 == null || kotlin.jvm.internal.Intrinsics.areEqual(p0, requireOwner) || !androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$containsDescendant(access$getEmbeddedView, p0)) ? false : true;
            boolean z2 = (p1 == null || kotlin.jvm.internal.Intrinsics.areEqual(p1, requireOwner) || !androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$containsDescendant(access$getEmbeddedView, p1)) ? false : true;
            if (z && z2) {
                this.getHighResolutionOutputSizeshNQ4ISI = p1;
                return;
            }
            if (z2) {
                this.getHighResolutionOutputSizeshNQ4ISI = p1;
                androidx.compose.ui.focus.FocusTargetNode highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                if (highSpeedVideoFpsRangesFor.getFocusState().getHasFocus()) {
                    return;
                }
                androidx.compose.ui.focus.FocusTransactionsKt.performRequestFocus(highSpeedVideoFpsRangesFor);
                return;
            }
            if (z) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                if (getHighSpeedVideoFpsRangesFor().getFocusState().isFocused()) {
                    focusOwner.mo5661clearFocusI7lrPNg(false, true, false, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5651getExitdhqQ8s());
                    return;
                }
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        android.view.ViewTreeObserver viewTreeObserver = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(this).getViewTreeObserver();
        this.Camera2StreamConfigurationMap = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        android.view.ViewTreeObserver viewTreeObserver = this.Camera2StreamConfigurationMap;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.Camera2StreamConfigurationMap = null;
        androidx.compose.ui.node.DelegatableNode_androidKt.requireView(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        super.onDetach();
    }
}

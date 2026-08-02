package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000f\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u001eJ\u001f\u0010%\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J7\u0010/\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\n2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\f0*H\u0016¢\u0006\u0004\b-\u0010.J%\u00106\u001a\u00020\f2\u0006\u00101\u001a\u0002002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\f02H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b7\u00108J%\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020:2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\f02H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\f2\u0006\u0010;\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0013H\u0016¢\u0006\u0004\bA\u0010\u0015J\u000f\u0010B\u001a\u00020\u0013H\u0016¢\u0006\u0004\bB\u0010\u0015J\u0017\u0010D\u001a\u00020\u00132\u0006\u0010C\u001a\u00020+H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010D\u001a\u00020\u00132\u0006\u0010C\u001a\u00020FH\u0016¢\u0006\u0004\bD\u0010GJ\u000f\u0010H\u001a\u00020\u0013H\u0016¢\u0006\u0004\bH\u0010\u0015J\u0011\u0010I\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\fH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\fH\u0016¢\u0006\u0004\bM\u0010LJ\u0011\u0010N\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\bN\u0010OJ\u0015\u0010R\u001a\u0004\u0018\u00010Q*\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\f2\u0006\u0010 \u001a\u000200H\u0002¢\u0006\u0004\bT\u00108R\u0014\u0010V\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010R\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010WR\"\u0010X\u001a\u00020+8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010O\"\u0004\b[\u0010ER\u0014\u0010T\u001a\u00020\\8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010]R\u001a\u0010_\u001a\u00020^8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u0018\u0010N\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010dR\u0014\u0010h\u001a\u00020e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR \u0010k\u001a\b\u0012\u0004\u0012\u00020j0i8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR.\u0010p\u001a\u0004\u0018\u00010+2\b\u0010o\u001a\u0004\u0018\u00010+8W@WX\u0097\u000e¢\u0006\u0012\n\u0004\bp\u0010Y\u001a\u0004\bq\u0010O\"\u0004\br\u0010ER*\u0010s\u001a\u00020\f2\u0006\u0010o\u001a\u00020\f8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bs\u0010L\"\u0004\bu\u0010\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/PlatformFocusOwner;", "platformFocusOwner", "Landroidx/compose/ui/node/Owner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "<init>", "(Landroidx/compose/ui/focus/PlatformFocusOwner;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "requestOwnerFocus-7o62pno", "(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", "requestOwnerFocus", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "takeFocus", "", "releaseFocus", "()V", "clearOwnerFocus", "force", "clearFocus", "(Z)V", "refreshFocusEvents", "clearFocus-I7lrPNg", "(ZZZI)Z", "resetFocus-3ESFkO8", "(I)Z", "resetFocus", "p0", "p1", "getHighSpeedVideoSizes", "(ZZ)Z", "moveFocus-3ESFkO8", "moveFocus", "wrapAroundForOneDimensionalFocus", "moveFocus-aToIllA", "(IZ)Z", "focusedRect", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "focusSearch", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "Lkotlin/Function0;", "onFocusedItem", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "event", "dispatchRotaryEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lkotlin/jvm/functions/Function0;)Z", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "dispatchIndirectPointerEvent", "(Landroidx/compose/ui/input/indirect/IndirectPointerEvent;)Z", "dispatchIndirectPointerCancel", "focusTargetAvailable", "node", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "scheduleInvalidationForOwner", "getFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "hasFocusableContent", "()Z", "hasNonInteropFocusableContent", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/Modifier$Node;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/focus/PlatformFocusOwner;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/node/Owner;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui", "setRootFocusNode$ui", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/collection/MutableLongSet;", "Landroidx/collection/MutableLongSet;", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "rootState", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/focus/FocusListener;", "listeners", "Landroidx/collection/MutableObjectList;", "getListeners", "()Landroidx/collection/MutableObjectList;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "activeFocusTargetNode", "getActiveFocusTargetNode", "setActiveFocusTargetNode", "isFocusCaptured", "Z", "setFocusCaptured"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements androidx.compose.ui.focus.FocusOwner {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.collection.MutableLongSet getHighSpeedVideoFpsRanges;
    private androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.focus.PlatformFocusOwner Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.node.Owner getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.focus.FocusInvalidationManager getHighResolutionOutputSizeshNQ4ISI;
    private boolean isFocusCaptured;
    private androidx.compose.ui.focus.FocusTargetNode rootFocusNode = new androidx.compose.ui.focus.FocusTargetNode(androidx.compose.ui.focus.Focusability.INSTANCE.m5693getNeverLCbbffg(), false, null, null, 14, null);
    private final androidx.compose.ui.Modifier modifier = new androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.focus.FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final boolean equals(java.lang.Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void update(androidx.compose.ui.focus.FocusTargetNode node) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* renamed from: create, reason: avoid collision after fix types in other method */
        public final androidx.compose.ui.focus.FocusTargetNode getGetHighResolutionOutputSizeshNQ4ISI() {
            return androidx.compose.ui.focus.FocusOwnerImpl.this.getRootFocusNode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final int hashCode() {
            return androidx.compose.ui.focus.FocusOwnerImpl.this.getRootFocusNode().hashCode();
        }
    };
    private final androidx.collection.MutableObjectList<androidx.compose.ui.focus.FocusListener> listeners = new androidx.collection.MutableObjectList<>(1);

    public FocusOwnerImpl(androidx.compose.ui.focus.PlatformFocusOwner platformFocusOwner, androidx.compose.ui.node.Owner owner) {
        this.Camera2StreamConfigurationMap = platformFocusOwner;
        this.getHighSpeedVideoFpsRangesFor = owner;
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.focus.FocusInvalidationManager(this, owner);
    }

    /* renamed from: getRootFocusNode$ui, reason: from getter */
    public final androidx.compose.ui.focus.FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    public final void setRootFocusNode$ui(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: requestOwnerFocus-7o62pno */
    public final boolean mo5666requestOwnerFocus7o62pno(androidx.compose.ui.focus.FocusDirection focusDirection, androidx.compose.ui.geometry.Rect previouslyFocusedRect) {
        return this.Camera2StreamConfigurationMap.mo5698requestOwnerFocus7o62pno(focusDirection, previouslyFocusedRect);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: takeFocus-aToIllA */
    public final boolean mo5668takeFocusaToIllA(final int focusDirection, androidx.compose.ui.geometry.Rect previouslyFocusedRect) {
        java.lang.Boolean mo5664focusSearchULY8qGw = mo5664focusSearchULY8qGw(focusDirection, previouslyFocusedRect, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                return java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(focusDirection));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (mo5664focusSearchULY8qGw != null) {
            return mo5664focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void releaseFocus() {
        androidx.compose.ui.focus.FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
        if (!androidx.compose.ui.ComposeUiFlags.isOptimizedFocusEventDispatchEnabled || getActiveFocusTargetNode() == null) {
            return;
        }
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        setActiveFocusTargetNode(null);
        if (activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui(androidx.compose.ui.focus.FocusStateImpl.Active, androidx.compose.ui.focus.FocusStateImpl.Inactive);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void clearOwnerFocus() {
        this.Camera2StreamConfigurationMap.clearOwnerFocus();
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public final void clearFocus(boolean force) {
        mo5661clearFocusI7lrPNg(force, true, true, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5651getExitdhqQ8s());
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: clearFocus-I7lrPNg */
    public final boolean mo5661clearFocusI7lrPNg(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) {
        boolean highSpeedVideoSizes;
        if (!force) {
            int i = androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.$EnumSwitchMapping$0[androidx.compose.ui.focus.FocusTransactionsKt.m5681performCustomClearFocusMxy_nc0(this.rootFocusNode, focusDirection).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                highSpeedVideoSizes = false;
                if (highSpeedVideoSizes && clearOwnerFocus) {
                    clearOwnerFocus();
                }
                return highSpeedVideoSizes;
            }
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        highSpeedVideoSizes = getHighSpeedVideoSizes(force, refreshFocusEvents);
        if (highSpeedVideoSizes) {
            clearOwnerFocus();
        }
        return highSpeedVideoSizes;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: resetFocus-3ESFkO8 */
    public final boolean mo5667resetFocus3ESFkO8(final int focusDirection) {
        if (!mo5661clearFocusI7lrPNg(false, true, false, focusDirection)) {
            return false;
        }
        java.lang.Boolean mo5664focusSearchULY8qGw = mo5664focusSearchULY8qGw(focusDirection, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$resetFocus$successfulReset$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                return java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(focusDirection));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        boolean booleanValue = mo5664focusSearchULY8qGw != null ? mo5664focusSearchULY8qGw.booleanValue() : false;
        if (!booleanValue) {
            clearOwnerFocus();
        }
        return booleanValue;
    }

    private final boolean getHighSpeedVideoSizes(boolean p0, boolean p1) {
        androidx.compose.ui.node.NodeChain nodes;
        if (getActiveFocusTargetNode() == null) {
            return true;
        }
        if (getIsFocusCaptured() && !p0) {
            return false;
        }
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        setActiveFocusTargetNode(null);
        if (p1 && activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui(getIsFocusCaptured() ? androidx.compose.ui.focus.FocusStateImpl.Captured : androidx.compose.ui.focus.FocusStateImpl.Active, androidx.compose.ui.focus.FocusStateImpl.Inactive);
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = activeFocusTargetNode;
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
            if (!focusTargetNode.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node parent = focusTargetNode.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m7621constructorimpl) != 0) {
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            androidx.compose.ui.Modifier.Node node = parent;
                            while (node != null) {
                                if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                    ((androidx.compose.ui.focus.FocusTargetNode) node).dispatchFocusCallbacks$ui(androidx.compose.ui.focus.FocusStateImpl.ActiveParent, androidx.compose.ui.focus.FocusStateImpl.Inactive);
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
        }
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public final boolean mo5659moveFocus3ESFkO8(int focusDirection) {
        return mo5665moveFocusaToIllA(focusDirection, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: moveFocus-aToIllA */
    public final boolean mo5665moveFocusaToIllA(final int focusDirection, boolean wrapAroundForOneDimensionalFocus) {
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode;
        if ((androidx.compose.ui.ComposeUiFlags.isViewFocusFixEnabled || (androidx.compose.ui.ComposeUiFlags.isBypassUnfocusableComposeViewEnabled && (activeFocusTargetNode = getActiveFocusTargetNode()) != null && activeFocusTargetNode.getIsInteropViewHost())) && this.Camera2StreamConfigurationMap.mo5697moveFocusInChildren3ESFkO8(focusDirection)) {
            return true;
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = java.lang.Boolean.FALSE;
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode2 = getActiveFocusTargetNode();
        java.lang.Boolean mo5664focusSearchULY8qGw = mo5664focusSearchULY8qGw(focusDirection, this.Camera2StreamConfigurationMap.getEmbeddedViewFocusRect(), new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                objectRef.element = java.lang.Boolean.valueOf(focusTargetNode.mo5674requestFocus3ESFkO8(focusDirection));
                return objectRef.element;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (kotlin.jvm.internal.Intrinsics.areEqual(mo5664focusSearchULY8qGw, java.lang.Boolean.TRUE) && activeFocusTargetNode2 != getActiveFocusTargetNode()) {
            return true;
        }
        if (mo5664focusSearchULY8qGw != null && objectRef.element != 0) {
            if (mo5664focusSearchULY8qGw.booleanValue() && ((java.lang.Boolean) objectRef.element).booleanValue()) {
                return true;
            }
            if (androidx.compose.ui.focus.FocusOwnerImplKt.m5669is1dFocusSearch3ESFkO8(focusDirection) && wrapAroundForOneDimensionalFocus) {
                return mo5661clearFocusI7lrPNg(false, true, false, focusDirection) && mo5668takeFocusaToIllA(focusDirection, null);
            }
            if (!androidx.compose.ui.ComposeUiFlags.isViewFocusFixEnabled && !androidx.compose.ui.ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                return this.Camera2StreamConfigurationMap.mo5697moveFocusInChildren3ESFkO8(focusDirection);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00bc, code lost:
    
        continue;
     */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: focusSearch-ULY8qGw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Boolean mo5664focusSearchULY8qGw(int focusDirection, androidx.compose.ui.geometry.Rect focusedRect, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean> onFound) {
        final androidx.compose.ui.focus.FocusTargetNode highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        if (highSpeedVideoFpsRanges != null) {
            androidx.compose.ui.focus.FocusRequester m5683customFocusSearchOMvw8 = androidx.compose.ui.focus.FocusTraversalKt.m5683customFocusSearchOMvw8(highSpeedVideoFpsRanges, focusDirection, this.getHighSpeedVideoFpsRangesFor.getLayoutDirection());
            if (kotlin.jvm.internal.Intrinsics.areEqual(m5683customFocusSearchOMvw8, androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel())) {
                return null;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(m5683customFocusSearchOMvw8, androidx.compose.ui.focus.FocusRequester.INSTANCE.getRedirect$ui())) {
                androidx.compose.ui.focus.FocusTargetNode highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges();
                if (highSpeedVideoFpsRanges2 != null) {
                    return onFound.invoke(highSpeedVideoFpsRanges2);
                }
                return null;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(m5683customFocusSearchOMvw8, androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault())) {
                if (!androidx.compose.ui.ComposeUiFlags.isRequestFocusOnNonFocusableFocusTargetEnabled) {
                    return java.lang.Boolean.valueOf(m5683customFocusSearchOMvw8.findFocusTargetNode$ui(onFound));
                }
                if (m5683customFocusSearchOMvw8 == androidx.compose.ui.focus.FocusRequester.INSTANCE.getDefault()) {
                    throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
                }
                if (m5683customFocusSearchOMvw8 == androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel()) {
                    throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
                }
                boolean z = false;
                if (m5683customFocusSearchOMvw8.getFocusRequesterNodes$ui().getSize() == 0) {
                    java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                } else {
                    androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.focus.FocusRequesterModifierNode> focusRequesterNodes$ui = m5683customFocusSearchOMvw8.getFocusRequesterNodes$ui();
                    androidx.compose.ui.focus.FocusRequesterModifierNode[] focusRequesterModifierNodeArr = focusRequesterNodes$ui.content;
                    int size = focusRequesterNodes$ui.getSize();
                    int i = 0;
                    boolean z2 = false;
                    while (i < size) {
                        androidx.compose.ui.focus.FocusRequesterModifierNode focusRequesterModifierNode = focusRequesterModifierNodeArr[i];
                        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
                        if (!focusRequesterModifierNode.getNode().getIsAttached()) {
                            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                        }
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                        androidx.compose.ui.Modifier.Node child = focusRequesterModifierNode.getNode().getChild();
                        if (child == null) {
                            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, focusRequesterModifierNode.getNode(), false);
                        } else {
                            mutableVector2.add(child);
                        }
                        while (true) {
                            if (mutableVector2.getSize() != 0) {
                                androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                                if ((node.getAggregateChildKindSet() & m7621constructorimpl) == 0) {
                                    androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector2, node, false);
                                } else {
                                    while (true) {
                                        if (node == null) {
                                            break;
                                        }
                                        if ((node.getKindSet() & m7621constructorimpl) != 0) {
                                            androidx.compose.runtime.collection.MutableVector mutableVector3 = mutableVector;
                                            while (node != null) {
                                                if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                                    if (onFound.invoke((androidx.compose.ui.focus.FocusTargetNode) node).booleanValue()) {
                                                        z2 = true;
                                                        break;
                                                    }
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
                                                    if (i2 == 1) {
                                                        mutableVector = null;
                                                    }
                                                }
                                                node = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector3);
                                                mutableVector = null;
                                            }
                                        } else {
                                            node = node.getChild();
                                            mutableVector = null;
                                        }
                                    }
                                }
                            }
                        }
                        i++;
                        mutableVector = null;
                    }
                    z = z2;
                }
                return java.lang.Boolean.valueOf(z);
            }
        } else {
            highSpeedVideoFpsRanges = null;
        }
        return androidx.compose.ui.focus.FocusTraversalKt.m5684focusSearch0X8WOeE(this.rootFocusNode, focusDirection, this.getHighSpeedVideoFpsRangesFor.getLayoutDirection(), focusedRect, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                boolean booleanValue;
                if (kotlin.jvm.internal.Intrinsics.areEqual(focusTargetNode, androidx.compose.ui.focus.FocusTargetNode.this)) {
                    booleanValue = false;
                } else {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(focusTargetNode, this.getRootFocusNode())) {
                        throw new java.lang.IllegalStateException("Focus search landed at the root.".toString());
                    }
                    booleanValue = onFound.invoke(focusTargetNode).booleanValue();
                }
                return java.lang.Boolean.valueOf(booleanValue);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
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
    public final boolean mo5662dispatchInterceptedSoftKeyboardEventZmokQxo(android.view.KeyEvent keyEvent) {
        androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.DelegatingNode delegatingNode;
        androidx.compose.ui.node.NodeChain nodes2;
        if (this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap()) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = findActiveFocusNode;
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(131072);
            if (!focusTargetNode.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node node = focusTargetNode.getNode();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & m7621constructorimpl) != 0) {
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
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
                        node = node.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                node = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            softKeyboardInterceptionModifierNode = (androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) delegatingNode;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode2 = softKeyboardInterceptionModifierNode;
            int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(131072);
            if (!softKeyboardInterceptionModifierNode2.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node parent = softKeyboardInterceptionModifierNode2.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode2);
            java.util.ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m7621constructorimpl2) != 0) {
                            androidx.compose.ui.Modifier.Node node2 = parent;
                            androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(node2);
                                } else if ((node2.getKindSet() & m7621constructorimpl2) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & m7621constructorimpl2) != 0) {
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
                                    if (i2 != 1) {
                                    }
                                }
                                node2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                parent = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size - 1;
                    if (((androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo6777onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            androidx.compose.ui.node.DelegatingNode node3 = softKeyboardInterceptionModifierNode2.getNode();
            androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
            while (node3 != 0) {
                if (node3 instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) {
                    if (((androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) node3).mo6777onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & m7621constructorimpl2) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate3 = node3.getDelegate();
                    int i4 = 0;
                    node3 = node3;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & m7621constructorimpl2) != 0) {
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
                    if (i4 != 1) {
                    }
                }
                node3 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector3);
            }
            androidx.compose.ui.node.DelegatingNode node4 = softKeyboardInterceptionModifierNode2.getNode();
            androidx.compose.runtime.collection.MutableVector mutableVector4 = null;
            while (node4 != 0) {
                if (node4 instanceof androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) {
                    if (((androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) node4).mo6776onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } else if ((node4.getKindSet() & m7621constructorimpl2) != 0 && (node4 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate4 = node4.getDelegate();
                    int i5 = 0;
                    node4 = node4;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & m7621constructorimpl2) != 0) {
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
                    if (i5 != 1) {
                    }
                }
                node4 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (((androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode) arrayList.get(i6)).mo6776onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean dispatchRotaryEvent(androidx.compose.ui.input.rotary.RotaryScrollEvent event, kotlin.jvm.functions.Function0<java.lang.Boolean> onFocusedItem) {
        androidx.compose.ui.input.rotary.RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.DelegatingNode delegatingNode;
        androidx.compose.ui.node.NodeChain nodes2;
        if (this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap()) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        androidx.compose.ui.focus.FocusTargetNode highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges != null) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = highSpeedVideoFpsRanges;
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(16384);
            if (!focusTargetNode.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node node = focusTargetNode.getNode();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & m7621constructorimpl) != 0) {
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
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
                        node = node.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                node = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            rotaryInputModifierNode = (androidx.compose.ui.input.rotary.RotaryInputModifierNode) delegatingNode;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            androidx.compose.ui.input.rotary.RotaryInputModifierNode rotaryInputModifierNode2 = rotaryInputModifierNode;
            int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(16384);
            if (!rotaryInputModifierNode2.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node parent = rotaryInputModifierNode2.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode2);
            java.util.ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m7621constructorimpl2) != 0) {
                            androidx.compose.ui.Modifier.Node node2 = parent;
                            androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(node2);
                                } else if ((node2.getKindSet() & m7621constructorimpl2) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & m7621constructorimpl2) != 0) {
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
                                    if (i2 != 1) {
                                    }
                                }
                                node2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                parent = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
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
            androidx.compose.ui.node.DelegatingNode node3 = rotaryInputModifierNode2.getNode();
            androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
            while (node3 != 0) {
                if (node3 instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode) {
                    if (((androidx.compose.ui.input.rotary.RotaryInputModifierNode) node3).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node3.getKindSet() & m7621constructorimpl2) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate3 = node3.getDelegate();
                    int i4 = 0;
                    node3 = node3;
                    while (delegate3 != null) {
                        if ((delegate3.getKindSet() & m7621constructorimpl2) != 0) {
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
                    if (i4 != 1) {
                    }
                }
                node3 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector3);
            }
            if (onFocusedItem.invoke().booleanValue()) {
                return true;
            }
            androidx.compose.ui.node.DelegatingNode node4 = rotaryInputModifierNode2.getNode();
            androidx.compose.runtime.collection.MutableVector mutableVector4 = null;
            while (node4 != 0) {
                if (node4 instanceof androidx.compose.ui.input.rotary.RotaryInputModifierNode) {
                    if (((androidx.compose.ui.input.rotary.RotaryInputModifierNode) node4).onRotaryScrollEvent(event)) {
                        return true;
                    }
                } else if ((node4.getKindSet() & m7621constructorimpl2) != 0 && (node4 instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate4 = node4.getDelegate();
                    int i5 = 0;
                    node4 = node4;
                    while (delegate4 != null) {
                        if ((delegate4.getKindSet() & m7621constructorimpl2) != 0) {
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
                    if (i5 != 1) {
                    }
                }
                node4 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector4);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean dispatchIndirectPointerEvent(androidx.compose.ui.input.indirect.IndirectPointerEvent event) {
        androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode indirectPointerInputModifierNode;
        int size;
        int size2;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.DelegatingNode delegatingNode;
        androidx.compose.ui.node.NodeChain nodes2;
        if (this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap()) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
            return false;
        }
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        if (activeFocusTargetNode != null) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = activeFocusTargetNode;
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(2097152);
            if (!focusTargetNode.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node node = focusTargetNode.getNode();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & m7621constructorimpl) != 0) {
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
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
                        node = node.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                node = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            indirectPointerInputModifierNode = (androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) delegatingNode;
        } else {
            indirectPointerInputModifierNode = null;
        }
        if (indirectPointerInputModifierNode != null) {
            androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode indirectPointerInputModifierNode2 = indirectPointerInputModifierNode;
            int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(2097152);
            if (!indirectPointerInputModifierNode2.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node parent = indirectPointerInputModifierNode2.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(indirectPointerInputModifierNode2);
            java.util.ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m7621constructorimpl2) != 0) {
                            androidx.compose.ui.Modifier.Node node2 = parent;
                            androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(node2);
                                } else if ((node2.getKindSet() & m7621constructorimpl2) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & m7621constructorimpl2) != 0) {
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
                                    if (i2 != 1) {
                                    }
                                }
                                node2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                parent = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            if (arrayList != null && (size2 = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size2 - 1;
                    ((androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) arrayList.get(size2)).onIndirectPointerEvent(event, androidx.compose.ui.input.pointer.PointerEventPass.Initial);
                    if (i3 < 0) {
                        break;
                    }
                    size2 = i3;
                }
            }
            indirectPointerInputModifierNode.onIndirectPointerEvent(event, androidx.compose.ui.input.pointer.PointerEventPass.Initial);
            indirectPointerInputModifierNode.onIndirectPointerEvent(event, androidx.compose.ui.input.pointer.PointerEventPass.Main);
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) arrayList.get(i4)).onIndirectPointerEvent(event, androidx.compose.ui.input.pointer.PointerEventPass.Main);
                }
            }
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i5 = size - 1;
                    ((androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) arrayList.get(size)).onIndirectPointerEvent(event, androidx.compose.ui.input.pointer.PointerEventPass.Final);
                    if (i5 < 0) {
                        break;
                    }
                    size = i5;
                }
            }
            indirectPointerInputModifierNode.onIndirectPointerEvent(event, androidx.compose.ui.input.pointer.PointerEventPass.Final);
        }
        java.util.List<androidx.compose.ui.input.indirect.IndirectPointerInputChange> changes = event.getChanges();
        int size4 = changes.size();
        for (int i6 = 0; i6 < size4; i6++) {
            if (changes.get(i6).getIsConsumed()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public final void dispatchIndirectPointerCancel() {
        androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode indirectPointerInputModifierNode;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.DelegatingNode delegatingNode;
        androidx.compose.ui.node.NodeChain nodes2;
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        if (activeFocusTargetNode != null) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = activeFocusTargetNode;
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(2097152);
            if (!focusTargetNode.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node node = focusTargetNode.getNode();
            androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    delegatingNode = 0;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet() & m7621constructorimpl) != 0) {
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            delegatingNode = node;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) {
                                    break loop0;
                                }
                                if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
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
                        node = node.getParent();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                node = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
            }
            indirectPointerInputModifierNode = (androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) delegatingNode;
        } else {
            indirectPointerInputModifierNode = null;
        }
        if (indirectPointerInputModifierNode != null) {
            androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode indirectPointerInputModifierNode2 = indirectPointerInputModifierNode;
            int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(2097152);
            if (!indirectPointerInputModifierNode2.getNode().getIsAttached()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.Modifier.Node parent = indirectPointerInputModifierNode2.getNode().getParent();
            androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(indirectPointerInputModifierNode2);
            java.util.ArrayList arrayList = null;
            while (requireLayoutNode2 != null) {
                if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl2) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m7621constructorimpl2) != 0) {
                            androidx.compose.ui.Modifier.Node node2 = parent;
                            androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                            while (node2 != null) {
                                if (node2 instanceof androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(node2);
                                } else if ((node2.getKindSet() & m7621constructorimpl2) != 0 && (node2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    int i2 = 0;
                                    for (androidx.compose.ui.Modifier.Node delegate2 = ((androidx.compose.ui.node.DelegatingNode) node2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                        if ((delegate2.getKindSet() & m7621constructorimpl2) != 0) {
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
                                    if (i2 != 1) {
                                    }
                                }
                                node2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                parent = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            }
            indirectPointerInputModifierNode.onCancelIndirectPointerInput();
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode) arrayList.get(i3)).onCancelIndirectPointerInput();
                }
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void focusTargetAvailable() {
        this.Camera2StreamConfigurationMap.focusTargetAvailable();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void scheduleInvalidation(androidx.compose.ui.focus.FocusTargetNode node) {
        this.getHighResolutionOutputSizeshNQ4ISI.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void scheduleInvalidation(androidx.compose.ui.focus.FocusEventModifierNode node) {
        this.getHighResolutionOutputSizeshNQ4ISI.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void scheduleInvalidationForOwner() {
        this.getHighResolutionOutputSizeshNQ4ISI.scheduleInvalidation();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final androidx.compose.ui.geometry.Rect getFocusRect() {
        androidx.compose.ui.focus.FocusTargetNode highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges != null) {
            return androidx.compose.ui.focus.FocusTraversalKt.focusRect(highSpeedVideoFpsRanges);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean hasFocusableContent() {
        if (!this.rootFocusNode.getIsAttached()) {
            return false;
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = this.rootFocusNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, focusTargetNode.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null && node2.getIsAttached(); node2 = node2.getChild()) {
                    if ((node2.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.Modifier.Node node3 = node2;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) node3;
                                if (focusTargetNode2.getIsAttached() && focusTargetNode2.fetchFocusProperties$ui().getCanFocus()) {
                                    return true;
                                }
                            } else if ((node3.getKindSet() & m7621constructorimpl) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node3 = delegate;
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
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            node3 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    }
                }
            }
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, node, false);
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean hasNonInteropFocusableContent() {
        if (!this.rootFocusNode.getIsAttached()) {
            return false;
        }
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = this.rootFocusNode;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
        androidx.compose.ui.Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, focusTargetNode.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            androidx.compose.ui.Modifier.Node node = (androidx.compose.ui.Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                for (androidx.compose.ui.Modifier.Node node2 = node; node2 != null && node2.getIsAttached(); node2 = node2.getChild()) {
                    if ((node2.getKindSet() & m7621constructorimpl) != 0) {
                        androidx.compose.ui.Modifier.Node node3 = node2;
                        androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = (androidx.compose.ui.focus.FocusTargetNode) node3;
                                if (focusTargetNode2.getIsAttached()) {
                                    androidx.compose.ui.focus.FocusProperties fetchFocusProperties$ui = focusTargetNode2.fetchFocusProperties$ui();
                                    if (focusTargetNode2.getIsAttached() && !focusTargetNode2.getIsInteropViewHost() && fetchFocusProperties$ui.getCanFocus()) {
                                        return true;
                                    }
                                }
                            } else if ((node3.getKindSet() & m7621constructorimpl) != 0 && (node3 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                int i = 0;
                                for (androidx.compose.ui.Modifier.Node delegate = ((androidx.compose.ui.node.DelegatingNode) node3).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node3 = delegate;
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
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            node3 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                        }
                    }
                }
            }
            androidx.compose.ui.node.DelegatableNodeKt.Camera2StreamConfigurationMap(mutableVector, node, false);
        }
        return false;
    }

    private final androidx.compose.ui.focus.FocusTargetNode getHighSpeedVideoFpsRanges() {
        return androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final androidx.compose.ui.focus.FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final androidx.collection.MutableObjectList<androidx.compose.ui.focus.FocusListener> getListeners() {
        return this.listeners;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final androidx.compose.ui.focus.FocusTargetNode getActiveFocusTargetNode() {
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = this.activeFocusTargetNode;
        if (focusTargetNode == null || !focusTargetNode.getIsAttached()) {
            return null;
        }
        return this.activeFocusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void setActiveFocusTargetNode(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            setFocusCaptured(false);
        }
        if (androidx.compose.ui.ComposeUiFlags.isSemanticAutofillEnabled) {
            androidx.collection.MutableObjectList<androidx.compose.ui.focus.FocusListener> listeners = getListeners();
            java.lang.Object[] objArr = listeners.content;
            int i = listeners._size;
            for (int i2 = 0; i2 < i; i2++) {
                ((androidx.compose.ui.focus.FocusListener) objArr[i2]).onFocusChanged(focusTargetNode2, focusTargetNode);
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: isFocusCaptured, reason: from getter */
    public final boolean getIsFocusCaptured() {
        return this.isFocusCaptured;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void setFocusCaptured(boolean z) {
        if (z && getActiveFocusTargetNode() == null) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = z;
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent p0) {
        long m7089getKeyZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(p0);
        int m7090getTypeZmokQxo = androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(p0);
        if (androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(m7090getTypeZmokQxo, androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7086getKeyDownCS__XNY())) {
            androidx.collection.MutableLongSet mutableLongSet = this.getHighSpeedVideoFpsRanges;
            if (mutableLongSet == null) {
                mutableLongSet = new androidx.collection.MutableLongSet(3);
                this.getHighSpeedVideoFpsRanges = mutableLongSet;
            }
            mutableLongSet.plusAssign(m7089getKeyZmokQxo);
        } else if (androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(m7090getTypeZmokQxo, androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7087getKeyUpCS__XNY())) {
            androidx.collection.MutableLongSet mutableLongSet2 = this.getHighSpeedVideoFpsRanges;
            if (mutableLongSet2 == null || !mutableLongSet2.contains(m7089getKeyZmokQxo)) {
                return false;
            }
            androidx.collection.MutableLongSet mutableLongSet3 = this.getHighSpeedVideoFpsRanges;
            if (mutableLongSet3 != null) {
                mutableLongSet3.remove(m7089getKeyZmokQxo);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-YhN2O0w */
    public final boolean mo5663dispatchKeyEventYhN2O0w(android.view.KeyEvent keyEvent, kotlin.jvm.functions.Function0<java.lang.Boolean> onFocusedItem) {
        androidx.compose.ui.node.DelegatingNode delegatingNode;
        androidx.compose.ui.Modifier.Node node;
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.node.DelegatingNode delegatingNode2;
        androidx.compose.ui.node.NodeChain nodes2;
        androidx.compose.ui.node.NodeChain nodes3;
        android.os.Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getCamera2StreamConfigurationMap()) {
                java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!getHighResolutionOutputSizeshNQ4ISI(keyEvent)) {
                return false;
            }
            androidx.compose.ui.focus.FocusTargetNode highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges == null || (node = getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges)) == null) {
                if (highSpeedVideoFpsRanges != null) {
                    androidx.compose.ui.focus.FocusTargetNode focusTargetNode = highSpeedVideoFpsRanges;
                    int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(8192);
                    if (!focusTargetNode.getNode().getIsAttached()) {
                        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                    }
                    androidx.compose.ui.Modifier.Node node2 = focusTargetNode.getNode();
                    androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                    loop10: while (true) {
                        if (requireLayoutNode == null) {
                            delegatingNode2 = 0;
                            break;
                        }
                        if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl) != 0) {
                            while (node2 != null) {
                                if ((node2.getKindSet() & m7621constructorimpl) != 0) {
                                    androidx.compose.runtime.collection.MutableVector mutableVector = null;
                                    delegatingNode2 = node2;
                                    while (delegatingNode2 != 0) {
                                        if (delegatingNode2 instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
                                            break loop10;
                                        }
                                        if ((delegatingNode2.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode2 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                            androidx.compose.ui.Modifier.Node delegate = delegatingNode2.getDelegate();
                                            int i = 0;
                                            delegatingNode2 = delegatingNode2;
                                            while (delegate != null) {
                                                if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                        delegatingNode2 = delegate;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                        }
                                                        if (delegatingNode2 != 0) {
                                                            if (mutableVector != null) {
                                                                mutableVector.add(delegatingNode2);
                                                            }
                                                            delegatingNode2 = 0;
                                                        }
                                                        if (mutableVector != null) {
                                                            mutableVector.add(delegate);
                                                        }
                                                    }
                                                }
                                                delegate = delegate.getChild();
                                                delegatingNode2 = delegatingNode2;
                                            }
                                            if (i != 1) {
                                            }
                                        }
                                        delegatingNode2 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                                    }
                                }
                                node2 = node2.getParent();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui();
                        node2 = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
                    }
                    androidx.compose.ui.input.key.KeyInputModifierNode keyInputModifierNode = (androidx.compose.ui.input.key.KeyInputModifierNode) delegatingNode2;
                    if (keyInputModifierNode != null) {
                        node = keyInputModifierNode.getNode();
                    }
                }
                androidx.compose.ui.focus.FocusTargetNode focusTargetNode2 = this.rootFocusNode;
                int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(8192);
                if (!focusTargetNode2.getNode().getIsAttached()) {
                    androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.Modifier.Node parent = focusTargetNode2.getNode().getParent();
                androidx.compose.ui.node.LayoutNode requireLayoutNode2 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
                loop14: while (true) {
                    if (requireLayoutNode2 == null) {
                        delegatingNode = 0;
                        break;
                    }
                    if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl2) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & m7621constructorimpl2) != 0) {
                                androidx.compose.runtime.collection.MutableVector mutableVector2 = null;
                                delegatingNode = parent;
                                while (delegatingNode != 0) {
                                    if (delegatingNode instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
                                        break loop14;
                                    }
                                    if ((delegatingNode.getKindSet() & m7621constructorimpl2) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                        androidx.compose.ui.Modifier.Node delegate2 = delegatingNode.getDelegate();
                                        int i2 = 0;
                                        delegatingNode = delegatingNode;
                                        while (delegate2 != null) {
                                            if ((delegate2.getKindSet() & m7621constructorimpl2) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
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
                                        if (i2 != 1) {
                                        }
                                    }
                                    delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector2);
                                }
                            }
                            parent = parent.getParent();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                    parent = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
                }
                androidx.compose.ui.input.key.KeyInputModifierNode keyInputModifierNode2 = (androidx.compose.ui.input.key.KeyInputModifierNode) delegatingNode;
                node = keyInputModifierNode2 != null ? keyInputModifierNode2.getNode() : null;
            }
            if (node != null) {
                androidx.compose.ui.Modifier.Node node3 = node;
                int m7621constructorimpl3 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(8192);
                if (!node3.getNode().getIsAttached()) {
                    androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.Modifier.Node parent2 = node3.getNode().getParent();
                androidx.compose.ui.node.LayoutNode requireLayoutNode3 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node3);
                java.util.ArrayList arrayList = null;
                while (requireLayoutNode3 != null) {
                    if ((requireLayoutNode3.getNodes().getHead().getAggregateChildKindSet() & m7621constructorimpl3) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & m7621constructorimpl3) != 0) {
                                androidx.compose.ui.Modifier.Node node4 = parent2;
                                androidx.compose.runtime.collection.MutableVector mutableVector3 = null;
                                while (node4 != null) {
                                    if (node4 instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
                                        if (arrayList == null) {
                                            arrayList = new java.util.ArrayList();
                                        }
                                        arrayList.add(node4);
                                    } else if ((node4.getKindSet() & m7621constructorimpl3) != 0 && (node4 instanceof androidx.compose.ui.node.DelegatingNode)) {
                                        int i3 = 0;
                                        for (androidx.compose.ui.Modifier.Node delegate3 = ((androidx.compose.ui.node.DelegatingNode) node4).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                                            if ((delegate3.getKindSet() & m7621constructorimpl3) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                    node4 = delegate3;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                                    }
                                                    if (node4 != null) {
                                                        if (mutableVector3 != null) {
                                                            mutableVector3.add(node4);
                                                        }
                                                        node4 = null;
                                                    }
                                                    if (mutableVector3 != null) {
                                                        mutableVector3.add(delegate3);
                                                    }
                                                }
                                            }
                                        }
                                        if (i3 != 1) {
                                        }
                                    }
                                    node4 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector3);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    requireLayoutNode3 = requireLayoutNode3.getParent$ui();
                    parent2 = (requireLayoutNode3 == null || (nodes3 = requireLayoutNode3.getNodes()) == null) ? null : nodes3.getTail();
                }
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i4 = size - 1;
                            if (((androidx.compose.ui.input.key.KeyInputModifierNode) arrayList.get(size)).mo1263onPreKeyEventZmokQxo(keyEvent)) {
                                return true;
                            }
                            if (i4 < 0) {
                                break;
                            }
                            size = i4;
                        }
                    }
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                }
                androidx.compose.ui.node.DelegatingNode node5 = node3.getNode();
                androidx.compose.runtime.collection.MutableVector mutableVector4 = null;
                while (node5 != 0) {
                    if (node5 instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
                        if (((androidx.compose.ui.input.key.KeyInputModifierNode) node5).mo1263onPreKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                    } else if ((node5.getKindSet() & m7621constructorimpl3) != 0 && (node5 instanceof androidx.compose.ui.node.DelegatingNode)) {
                        androidx.compose.ui.Modifier.Node delegate4 = node5.getDelegate();
                        int i5 = 0;
                        node5 = node5;
                        while (delegate4 != null) {
                            if ((delegate4.getKindSet() & m7621constructorimpl3) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                    node5 = delegate4;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                    }
                                    if (node5 != 0) {
                                        if (mutableVector4 != null) {
                                            mutableVector4.add(node5);
                                        }
                                        node5 = 0;
                                    }
                                    if (mutableVector4 != null) {
                                        mutableVector4.add(delegate4);
                                    }
                                }
                            }
                            delegate4 = delegate4.getChild();
                            node5 = node5;
                        }
                        if (i5 != 1) {
                        }
                    }
                    node5 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector4);
                }
                if (onFocusedItem.invoke().booleanValue()) {
                    return true;
                }
                androidx.compose.ui.node.DelegatingNode node6 = node3.getNode();
                androidx.compose.runtime.collection.MutableVector mutableVector5 = null;
                while (node6 != 0) {
                    if (node6 instanceof androidx.compose.ui.input.key.KeyInputModifierNode) {
                        if (((androidx.compose.ui.input.key.KeyInputModifierNode) node6).mo1261onKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                    } else if ((node6.getKindSet() & m7621constructorimpl3) != 0 && (node6 instanceof androidx.compose.ui.node.DelegatingNode)) {
                        androidx.compose.ui.Modifier.Node delegate5 = node6.getDelegate();
                        int i6 = 0;
                        node6 = node6;
                        while (delegate5 != null) {
                            if ((delegate5.getKindSet() & m7621constructorimpl3) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                    node6 = delegate5;
                                } else {
                                    if (mutableVector5 == null) {
                                        mutableVector5 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                    }
                                    if (node6 != 0) {
                                        if (mutableVector5 != null) {
                                            mutableVector5.add(node6);
                                        }
                                        node6 = 0;
                                    }
                                    if (mutableVector5 != null) {
                                        mutableVector5.add(delegate5);
                                    }
                                }
                            }
                            delegate5 = delegate5.getChild();
                            node6 = node6;
                        }
                        if (i6 != 1) {
                        }
                    }
                    node6 = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        if (((androidx.compose.ui.input.key.KeyInputModifierNode) arrayList.get(i7)).mo1261onKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                    }
                    kotlin.Unit unit7 = kotlin.Unit.INSTANCE;
                }
                kotlin.Unit unit8 = kotlin.Unit.INSTANCE;
            }
            return false;
        } finally {
            android.os.Trace.endSection();
        }
    }

    private static androidx.compose.ui.Modifier.Node getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024) | androidx.compose.ui.node.NodeKind.m7621constructorimpl(8192);
        if (!delegatableNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node = delegatableNode.getNode();
        androidx.compose.ui.Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet() & m7621constructorimpl) != 0) {
            for (androidx.compose.ui.Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & m7621constructorimpl) != 0) {
                    if ((androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024) & child.getKindSet()) != 0) {
                        return node2;
                    }
                    node2 = child;
                }
            }
        }
        return node2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
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
}

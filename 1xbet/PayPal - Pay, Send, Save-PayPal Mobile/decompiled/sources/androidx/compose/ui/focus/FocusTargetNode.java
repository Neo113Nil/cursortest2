package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001SB[\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012&\b\u0002\u0010\u000f\u001a \u0012\t\u0012\u00070\f¢\u0006\u0002\b\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020(2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b)\u0010*J,\u0010/\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000e0\u0010H\u0080\b¢\u0006\u0004\b-\u0010.J,\u00101\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000e0\u0010H\u0080\b¢\u0006\u0004\b0\u0010.J\u000f\u00102\u001a\u00020\u000eH\u0000¢\u0006\u0004\b2\u0010\u001dJ\u001f\u00105\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b5\u00106R\u0017\u0010\n\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b\n\u0010\u0015R2\u0010\u001b\u001a \u0012\t\u0012\u00070\f¢\u0006\u0002\b\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R\"\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u00107R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010?R\u001a\u0010@\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\b@\u00107\u001a\u0004\bA\u0010\u0015R\u0014\u0010D\u001a\u00020>8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR*\u0010\b\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u00078\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010L\u001a\u00020K8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010F\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\u0013\u0010R\u001a\u0004\u0018\u00010O8G¢\u0006\u0006\u001a\u0004\bP\u0010Q"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/Focusability;", "focusability", "", "isInteropViewHost", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusState;", "Lkotlin/ParameterName;", "", "onFocusChange", "Lkotlin/Function1;", "onDispatchEventsCompleted", "<init>", "(IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "requestFocus", "()Z", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "requestFocus-3ESFkO8", "(I)Z", "p0", "getHighSpeedVideoFpsRanges", "onObservedReadsChanged", "()V", "onReset", "onDetach", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onPlaced", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties$ui", "()Landroidx/compose/ui/focus/FocusProperties;", "relativeCoordinates", "Landroidx/compose/ui/geometry/Rect;", "fetchFocusRect$ui", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/focus/FocusRequester;", "block", "fetchCustomEnter-aToIllA$ui", "(ILkotlin/jvm/functions/Function1;)V", "fetchCustomEnter", "fetchCustomExit-aToIllA$ui", "fetchCustomExit", "invalidateFocus$ui", "previousState", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "dispatchFocusCallbacks$ui", "(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", "Z", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroidx/compose/ui/focus/FocusStateImpl;", "Landroidx/compose/ui/focus/FocusStateImpl;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "focusState", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getFocusability-LCbbffg", "()I", "setFocusability-josRg5g", "(I)V", "", "previouslyFocusedChildHash", "getPreviouslyFocusedChildHash", "setPreviouslyFocusedChildHash", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "beyondBoundsLayoutParent", "FocusTargetElement"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTargetNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.focus.FocusTargetModifierNode, androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.modifier.ModifierLocalModifierNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private int focusability;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.focus.FocusStateImpl Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<androidx.compose.ui.focus.FocusState, androidx.compose.ui.focus.FocusState, kotlin.Unit> getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoSizes;
    private final boolean isInteropViewHost;
    private int previouslyFocusedChildHash;
    private final boolean shouldAutoInvalidate;

    /* JADX WARN: Multi-variable type inference failed */
    private FocusTargetNode(int i, boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.ui.focus.FocusState, ? super androidx.compose.ui.focus.FocusState, kotlin.Unit> function2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusTargetNode, kotlin.Unit> function1) {
        this.isInteropViewHost = z;
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.focusability = i;
    }

    public /* synthetic */ FocusTargetNode(int i, boolean z, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? androidx.compose.ui.focus.Focusability.INSTANCE.m5692getAlwaysLCbbffg() : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : function2, (i2 & 8) != 0 ? null : function1, null);
    }

    /* renamed from: isInteropViewHost, reason: from getter */
    public final boolean getIsInteropViewHost() {
        return this.isInteropViewHost;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* renamed from: getShouldAutoInvalidate, reason: from getter */
    public final boolean getGetHighSpeedVideoSizes() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    public final androidx.compose.ui.focus.FocusStateImpl getFocusState() {
        androidx.compose.ui.focus.FocusOwner focusOwner;
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode;
        androidx.compose.ui.node.NodeChain nodes;
        if (getIsAttached() && (activeFocusTargetNode = (focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getFocusOwner()).getActiveFocusTargetNode()) != null) {
            if (this == activeFocusTargetNode) {
                return focusOwner.isFocusCaptured() ? androidx.compose.ui.focus.FocusStateImpl.Captured : androidx.compose.ui.focus.FocusStateImpl.Active;
            }
            if (activeFocusTargetNode.getIsAttached()) {
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
                                androidx.compose.ui.Modifier.Node node = parent;
                                androidx.compose.runtime.collection.MutableVector mutableVector = null;
                                while (node != null) {
                                    if (node instanceof androidx.compose.ui.focus.FocusTargetNode) {
                                        if (this == ((androidx.compose.ui.focus.FocusTargetNode) node)) {
                                            return androidx.compose.ui.focus.FocusStateImpl.ActiveParent;
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
            }
            return androidx.compose.ui.focus.FocusStateImpl.Inactive;
        }
        return androidx.compose.ui.focus.FocusStateImpl.Inactive;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the version accepting FocusDirection", replaceWith = @kotlin.ReplaceWith(expression = "this.requestFocus()", imports = {}))
    public final /* synthetic */ boolean requestFocus() {
        return mo5674requestFocus3ESFkO8(androidx.compose.ui.focus.FocusDirection.INSTANCE.m5650getEnterdhqQ8s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRanges(int p0) {
        int i = androidx.compose.ui.focus.FocusTargetNode.WhenMappings.$EnumSwitchMapping$0[androidx.compose.ui.focus.FocusTransactionsKt.m5682performCustomRequestFocusMxy_nc0(this, p0).ordinal()];
        if (i == 1) {
            return androidx.compose.ui.focus.FocusTransactionsKt.performRequestFocus(this);
        }
        if (i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: getFocusability-LCbbffg, reason: from getter */
    public final int getFocusability() {
        return this.focusability;
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: setFocusability-josRg5g */
    public final void mo5675setFocusabilityjosRg5g(int i) {
        if (androidx.compose.ui.focus.Focusability.m5688equalsimpl0(this.focusability, i)) {
            return;
        }
        this.focusability = i;
        if (getIsAttached()) {
            androidx.compose.ui.focus.FocusTargetNode focusTargetNode = this;
            if (this != androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode() || androidx.compose.ui.focus.Focusability.m5686canFocusimpl$ui(this.focusability, this)) {
                return;
            }
            if (androidx.compose.ui.ComposeUiFlags.isOptimizedFocusEventDispatchEnabled) {
                if (androidx.compose.ui.focus.FocusTransactionsKt.clearFocus(this, true, true)) {
                    androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
                    androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                    if (activeFocusTargetNode != null) {
                        activeFocusTargetNode.dispatchFocusCallbacks$ui(androidx.compose.ui.focus.FocusStateImpl.Active, androidx.compose.ui.focus.FocusStateImpl.Inactive);
                        return;
                    }
                    return;
                }
                return;
            }
            androidx.compose.ui.focus.FocusTransactionsKt.clearFocus(this, true, true);
        }
    }

    public final int getPreviouslyFocusedChildHash() {
        return this.previouslyFocusedChildHash;
    }

    public final void setPreviouslyFocusedChildHash(int i) {
        this.previouslyFocusedChildHash = i;
    }

    public final androidx.compose.ui.layout.BeyondBoundsLayout getBeyondBoundsLayoutParent() {
        return androidx.compose.ui.node.DelegatableNodeKt.findNearestBeyondBoundsLayoutAncestor(this);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        invalidateFocus$ui();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        if (getFocusState().isFocused()) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getFocusOwner().mo5661clearFocusI7lrPNg(true, true, true, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5651getExitdhqQ8s());
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.focus.FocusOwner focusOwner;
        int i = androidx.compose.ui.focus.FocusTargetNode.WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i == 1 || i == 2) {
            focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getFocusOwner();
            focusOwner.mo5661clearFocusI7lrPNg(true, true, false, androidx.compose.ui.focus.FocusDirection.INSTANCE.m5651getExitdhqQ8s());
            if (this.isInteropViewHost) {
                focusOwner.mo5666requestOwnerFocus7o62pno(null, null);
            }
        } else {
            if (i == 3) {
                focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getFocusOwner();
                androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode = androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(this);
                if (findActiveFocusNode != null && findActiveFocusNode.isInteropViewHost) {
                    focusOwner.mo5666requestOwnerFocus7o62pno(null, null);
                }
            } else if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.Camera2StreamConfigurationMap = null;
        }
        focusOwner.scheduleInvalidationForOwner();
        this.Camera2StreamConfigurationMap = null;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        if (androidx.compose.ui.ComposeUiFlags.isInitialFocusOnFocusableAvailable) {
            androidx.compose.ui.node.DelegatableNodeKt.requireOwner(getNode()).getFocusOwner().focusTargetAvailable();
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
    public final androidx.compose.ui.focus.FocusProperties fetchFocusProperties$ui() {
        androidx.compose.ui.node.NodeChain nodes;
        androidx.compose.ui.focus.FocusPropertiesImpl focusPropertiesImpl = new androidx.compose.ui.focus.FocusPropertiesImpl();
        focusPropertiesImpl.setCanFocus(androidx.compose.ui.focus.Focusability.m5686canFocusimpl$ui(getFocusability(), this));
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = this;
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(2048);
        int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusTargetNode.getNode();
        int i = m7621constructorimpl | m7621constructorimpl2;
        if (!focusTargetNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node2 = focusTargetNode.getNode();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i) != 0) {
                        if (node2 != node && (node2.getKindSet() & m7621constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & m7621constructorimpl) != 0) {
                            androidx.compose.ui.node.DelegatingNode delegatingNode = node2;
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (delegatingNode instanceof androidx.compose.ui.focus.FocusPropertiesModifierNode) {
                                    ((androidx.compose.ui.focus.FocusPropertiesModifierNode) delegatingNode).applyFocusProperties(focusPropertiesImpl);
                                } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                    androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                    int i2 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                                    if (i2 != 1) {
                                    }
                                }
                                delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node2 = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return focusPropertiesImpl;
    }

    public static /* synthetic */ androidx.compose.ui.geometry.Rect fetchFocusRect$ui$default(androidx.compose.ui.focus.FocusTargetNode focusTargetNode, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            layoutCoordinates = null;
        }
        return focusTargetNode.fetchFocusRect$ui(layoutCoordinates);
    }

    public final androidx.compose.ui.geometry.Rect fetchFocusRect$ui(androidx.compose.ui.layout.LayoutCoordinates relativeCoordinates) {
        androidx.compose.ui.geometry.Rect localBoundingBoxOf;
        androidx.compose.ui.geometry.Rect focusRect = fetchFocusProperties$ui().getFocusRect();
        return focusRect != androidx.compose.ui.focus.FocusProperties.INSTANCE.getUnsetFocusRect() ? relativeCoordinates == null ? focusRect : focusRect.m5789translatek4lQ0M(androidx.compose.ui.layout.LayoutCoordinates.m7360localPositionOfS_NoaFU$default(relativeCoordinates, androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(this), 0L, false, 6, null)) : (relativeCoordinates == null || (localBoundingBoxOf = relativeCoordinates.localBoundingBoxOf(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(this), false)) == null) ? androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0(), androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(this).mo7361getSizeYbymL2g())) : localBoundingBoxOf;
    }

    /* renamed from: fetchCustomEnter-aToIllA$ui, reason: not valid java name */
    public final void m5679fetchCustomEnteraToIllA$ui(int focusDirection, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusRequester, kotlin.Unit> block) {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        try {
            androidx.compose.ui.focus.FocusProperties fetchFocusProperties$ui = fetchFocusProperties$ui();
            androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope(focusDirection, null);
            androidx.compose.ui.focus.FocusOwner focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getFocusOwner();
            androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            fetchFocusProperties$ui.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
            androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                block.invoke(androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel());
            } else if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                block.invoke(androidx.compose.ui.focus.FocusRequester.INSTANCE.getRedirect$ui());
            }
        } finally {
            this.getHighSpeedVideoSizes = false;
        }
    }

    /* renamed from: fetchCustomExit-aToIllA$ui, reason: not valid java name */
    public final void m5680fetchCustomExitaToIllA$ui(int focusDirection, kotlin.jvm.functions.Function1<? super androidx.compose.ui.focus.FocusRequester, kotlin.Unit> block) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        try {
            androidx.compose.ui.focus.FocusProperties fetchFocusProperties$ui = fetchFocusProperties$ui();
            androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new androidx.compose.ui.focus.CancelIndicatingFocusBoundaryScope(focusDirection, null);
            androidx.compose.ui.focus.FocusOwner focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getFocusOwner();
            androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
            fetchFocusProperties$ui.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
            androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
            if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                block.invoke(androidx.compose.ui.focus.FocusRequester.INSTANCE.getCancel());
            } else if (activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null) {
                block.invoke(androidx.compose.ui.focus.FocusRequester.INSTANCE.getRedirect$ui());
            }
        } finally {
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }
    }

    public final void invalidateFocus$ui() {
        androidx.compose.ui.focus.FocusProperties focusProperties;
        int i = androidx.compose.ui.focus.FocusTargetNode.WhenMappings.$EnumSwitchMapping$1[getFocusState().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return;
        }
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusTargetNode$invalidateFocus$1
            /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.FocusProperties] */
            public final void getHighSpeedVideoSizes() {
                objectRef.element = this.fetchFocusProperties$ui();
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoSizes();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        if (objectRef.element == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            focusProperties = null;
        } else {
            focusProperties = (androidx.compose.ui.focus.FocusProperties) objectRef.element;
        }
        if (focusProperties.getCanFocus()) {
            return;
        }
        androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.ui.Modifier$Node] */
    public final void dispatchFocusCallbacks$ui(androidx.compose.ui.focus.FocusState previousState, androidx.compose.ui.focus.FocusState newState) {
        androidx.compose.ui.node.NodeChain nodes;
        kotlin.jvm.functions.Function2<androidx.compose.ui.focus.FocusState, androidx.compose.ui.focus.FocusState, kotlin.Unit> function2;
        androidx.compose.ui.focus.FocusTargetNode focusTargetNode = this;
        androidx.compose.ui.focus.FocusOwner focusOwner = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(previousState, newState) && (function2 = this.getHighSpeedVideoFpsRanges) != null) {
            function2.invoke(previousState, newState);
        }
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(4096);
        int m7621constructorimpl2 = androidx.compose.ui.node.NodeKind.m7621constructorimpl(1024);
        androidx.compose.ui.Modifier.Node node = focusTargetNode.getNode();
        int i = m7621constructorimpl | m7621constructorimpl2;
        if (!focusTargetNode.getNode().getIsAttached()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.Modifier.Node node2 = focusTargetNode.getNode();
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i) != 0) {
                        if (node2 != node && (node2.getKindSet() & m7621constructorimpl2) != 0) {
                            break loop0;
                        }
                        if ((node2.getKindSet() & m7621constructorimpl) != 0) {
                            androidx.compose.ui.node.DelegatingNode delegatingNode = node2;
                            androidx.compose.runtime.collection.MutableVector mutableVector = null;
                            while (delegatingNode != 0) {
                                if (!(delegatingNode instanceof androidx.compose.ui.focus.FocusEventModifierNode)) {
                                    if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                                        androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                                        int i2 = 0;
                                        delegatingNode = delegatingNode;
                                        while (delegate != null) {
                                            if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
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
                                        if (i2 != 1) {
                                        }
                                    }
                                } else {
                                    androidx.compose.ui.focus.FocusEventModifierNode focusEventModifierNode = (androidx.compose.ui.focus.FocusEventModifierNode) delegatingNode;
                                    if (activeFocusTargetNode == focusOwner.getActiveFocusTargetNode()) {
                                        focusEventModifierNode.onFocusEvent(newState);
                                    }
                                }
                                delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            node2 = (requireLayoutNode == null || (nodes = requireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "create", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "", "update", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FocusTargetElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.focus.FocusTargetNode> {
        public static final int $stable = 0;
        public static final androidx.compose.ui.focus.FocusTargetNode.FocusTargetElement INSTANCE = new androidx.compose.ui.focus.FocusTargetNode.FocusTargetElement();

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final boolean equals(java.lang.Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void update(androidx.compose.ui.focus.FocusTargetNode node) {
        }

        private FocusTargetElement() {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* renamed from: create, reason: avoid collision after fix types in other method */
        public final androidx.compose.ui.focus.FocusTargetNode getGetHighResolutionOutputSizeshNQ4ISI() {
            return new androidx.compose.ui.focus.FocusTargetNode(0, false, null, null, 15, null);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final int hashCode() {
            return "focusTarget".hashCode();
        }
    }

    @Override // androidx.compose.ui.focus.FocusTargetModifierNode
    /* renamed from: requestFocus-3ESFkO8 */
    public final boolean mo5674requestFocus3ESFkO8(final int focusDirection) {
        boolean z;
        android.os.Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (androidx.compose.ui.ComposeUiFlags.isRequestFocusOnNonFocusableFocusTargetEnabled) {
                if (fetchFocusProperties$ui().getCanFocus()) {
                    z = getHighSpeedVideoFpsRanges(focusDirection);
                } else {
                    z = androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m5700findChildCorrespondingToFocusEnterOMvw8(this, focusDirection, new kotlin.jvm.functions.Function1<androidx.compose.ui.focus.FocusTargetNode, java.lang.Boolean>() { // from class: androidx.compose.ui.focus.FocusTargetNode$requestFocus$1$1
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final java.lang.Boolean invoke(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
                            boolean highSpeedVideoFpsRanges;
                            highSpeedVideoFpsRanges = focusTargetNode.getHighSpeedVideoFpsRanges(focusDirection);
                            return java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    });
                }
            } else {
                z = fetchFocusProperties$ui().getCanFocus() && getHighSpeedVideoFpsRanges(focusDirection);
            }
            return z;
        } finally {
            android.os.Trace.endSection();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
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

    public /* synthetic */ FocusTargetNode(int i, boolean z, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, function2, function1);
    }
}

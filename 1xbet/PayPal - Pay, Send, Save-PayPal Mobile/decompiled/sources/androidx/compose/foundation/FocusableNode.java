package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 D2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001DB3\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\r*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0011\u0010\u0018\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b\u0018\u0010%J\u000f\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010'\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010\u001eJ\u001b\u0010\u0018\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0016\u001a\u00020)H\u0002¢\u0006\u0004\b\u0018\u0010*R\u0018\u0010&\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010+R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u001a\u0010-\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0012R\u0014\u00103\u001a\u0002008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010'\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u00108\u001a\u00020<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010=R\u0016\u0010@\u001a\u0004\u0018\u00010>8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010?R\u0011\u0010C\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\bA\u0010B"}, d2 = {"Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/focus/Focusability;", "focusability", "Lkotlin/Function1;", "", "", "onFocusChange", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "requestFocus", "()Z", "update", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "Landroidx/compose/ui/focus/FocusState;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "onReset", "()V", "onObservedReadsChanged", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/layout/PinnableContainer;", "()Landroidx/compose/ui/layout/PinnableContainer;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "(Z)V", "Landroidx/compose/foundation/interaction/Interaction;", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/Interaction;)V", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Lkotlin/jvm/functions/Function1;", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "", "getTraverseKey", "()Ljava/lang/Object;", "traverseKey", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "getOutputMinFrameDuration", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/foundation/FocusedBoundsObserverNode;", "()Landroidx/compose/foundation/FocusedBoundsObserverNode;", "getInputFormats", "getFocusState", "()Landroidx/compose/ui/focus/FocusState;", "focusState", "TraverseKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FocusableNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.ObserverModifierNode, androidx.compose.ui.node.TraversableNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoFpsRangesFor;
    private androidx.compose.ui.layout.LayoutCoordinates getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.focus.FocusTargetModifierNode getOutputMinFrameDuration;
    private androidx.compose.foundation.interaction.FocusInteraction.Focus getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.ui.layout.PinnableContainer.PinnedHandle Camera2StreamConfigurationMap;
    private final boolean shouldAutoInvalidate;
    private static final androidx.compose.foundation.FocusableNode.TraverseKey TraverseKey = new androidx.compose.foundation.FocusableNode.TraverseKey(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    private FocusableNode(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRangesFor = mutableInteractionSource;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getOutputMinFrameDuration = (androidx.compose.ui.focus.FocusTargetModifierNode) delegate(androidx.compose.ui.focus.FocusTargetModifierNodeKt.m5676FocusTargetModifierNodePYyLHbc(i, new androidx.compose.foundation.FocusableNode$focusTargetNode$1(this)));
    }

    public /* synthetic */ FocusableNode(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, kotlin.jvm.functions.Function1 function1, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, (i2 & 2) != 0 ? androidx.compose.ui.focus.Focusability.INSTANCE.m5692getAlwaysLCbbffg() : i, (i2 & 4) != 0 ? null : function1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* renamed from: getShouldAutoInvalidate, reason: from getter */
    public final boolean getGetInputFormats() {
        return this.shouldAutoInvalidate;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableNode$TraverseKey;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class TraverseKey {
        private TraverseKey() {
        }

        public /* synthetic */ TraverseKey(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final java.lang.Object getTraverseKey() {
        return TraverseKey;
    }

    public final boolean requestFocus() {
        return androidx.compose.ui.focus.FocusTargetModifierNode.m5672requestFocus3ESFkO8$default(this.getOutputMinFrameDuration, 0, 1, null);
    }

    private final androidx.compose.foundation.FocusedBoundsObserverNode getHighResolutionOutputSizeshNQ4ISI() {
        if (!getIsAttached()) {
            return null;
        }
        androidx.compose.ui.node.TraversableNode findNearestAncestor = androidx.compose.ui.node.TraversableNodeKt.findNearestAncestor(this, androidx.compose.foundation.FocusedBoundsObserverNode.INSTANCE);
        if (findNearestAncestor instanceof androidx.compose.foundation.FocusedBoundsObserverNode) {
            return (androidx.compose.foundation.FocusedBoundsObserverNode) findNearestAncestor;
        }
        return null;
    }

    public final void update(androidx.compose.foundation.interaction.MutableInteractionSource interactionSource) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, interactionSource)) {
            return;
        }
        Camera2StreamConfigurationMap();
        this.getHighSpeedVideoFpsRangesFor = interactionSource;
    }

    public final androidx.compose.ui.focus.FocusState getFocusState() {
        return this.getOutputMinFrameDuration.getFocusState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.focus.FocusState p0, androidx.compose.ui.focus.FocusState p1) {
        boolean isFocused;
        if (!getIsAttached() || (isFocused = p1.isFocused()) == p0.isFocused()) {
            return;
        }
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(isFocused));
        }
        if (isFocused) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.FocusableNode$onFocusStateChange$1(this, null), 3, null);
            androidx.compose.ui.layout.PinnableContainer highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            this.Camera2StreamConfigurationMap = highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.pin() : null;
            getHighSpeedVideoFpsRangesFor();
        } else {
            androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinnedHandle = this.Camera2StreamConfigurationMap;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.Camera2StreamConfigurationMap = null;
            androidx.compose.foundation.FocusedBoundsObserverNode highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI != null) {
                highResolutionOutputSizeshNQ4ISI.onFocusBoundsChanged(null);
            }
        }
        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        Camera2StreamConfigurationMap(isFocused);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.getOutputMinFrameDuration.getFocusState().isFocused());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new androidx.compose.foundation.FocusableNode$applySemantics$1(this), 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinnedHandle = this.Camera2StreamConfigurationMap;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.Camera2StreamConfigurationMap = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        androidx.compose.ui.layout.PinnableContainer highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (this.getOutputMinFrameDuration.getFocusState().isFocused()) {
            androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinnedHandle = this.Camera2StreamConfigurationMap;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.Camera2StreamConfigurationMap = highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.pin() : null;
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        this.getHighResolutionOutputSizeshNQ4ISI = coordinates;
        if (this.getOutputMinFrameDuration.getFocusState().isFocused()) {
            if (coordinates.isAttached()) {
                getHighSpeedVideoFpsRangesFor();
                return;
            }
            androidx.compose.foundation.FocusedBoundsObserverNode highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI != null) {
                highResolutionOutputSizeshNQ4ISI.onFocusBoundsChanged(null);
            }
        }
    }

    private final androidx.compose.ui.layout.PinnableContainer getHighSpeedVideoFpsRanges() {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.FocusableNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.FocusableNode.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.ObjectRef.this, this);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
        return (androidx.compose.ui.layout.PinnableContainer) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.ObjectRef objectRef, androidx.compose.foundation.FocusableNode focusableNode) {
        objectRef.element = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(focusableNode, androidx.compose.ui.layout.PinnableContainerKt.getLocalPinnableContainer());
        return kotlin.Unit.INSTANCE;
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        androidx.compose.foundation.FocusedBoundsObserverNode highResolutionOutputSizeshNQ4ISI;
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = this.getHighResolutionOutputSizeshNQ4ISI;
        if (layoutCoordinates != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(layoutCoordinates);
            if (!layoutCoordinates.isAttached() || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI()) == null) {
                return;
            }
            highResolutionOutputSizeshNQ4ISI.onFocusBoundsChanged(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    private final void Camera2StreamConfigurationMap(boolean p0) {
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighSpeedVideoFpsRangesFor;
        if (mutableInteractionSource != null) {
            if (p0) {
                androidx.compose.foundation.interaction.FocusInteraction.Focus focus = this.getHighSpeedVideoSizes;
                if (focus != null) {
                    getHighSpeedVideoFpsRanges(mutableInteractionSource, new androidx.compose.foundation.interaction.FocusInteraction.Unfocus(focus));
                    this.getHighSpeedVideoSizes = null;
                }
                androidx.compose.foundation.interaction.FocusInteraction.Focus focus2 = new androidx.compose.foundation.interaction.FocusInteraction.Focus();
                getHighSpeedVideoFpsRanges(mutableInteractionSource, focus2);
                this.getHighSpeedVideoSizes = focus2;
                return;
            }
            androidx.compose.foundation.interaction.FocusInteraction.Focus focus3 = this.getHighSpeedVideoSizes;
            if (focus3 != null) {
                getHighSpeedVideoFpsRanges(mutableInteractionSource, new androidx.compose.foundation.interaction.FocusInteraction.Unfocus(focus3));
                this.getHighSpeedVideoSizes = null;
            }
        }
    }

    private final void Camera2StreamConfigurationMap() {
        androidx.compose.foundation.interaction.FocusInteraction.Focus focus;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.getHighSpeedVideoFpsRangesFor;
        if (mutableInteractionSource != null && (focus = this.getHighSpeedVideoSizes) != null) {
            mutableInteractionSource.tryEmit(new androidx.compose.foundation.interaction.FocusInteraction.Unfocus(focus));
        }
        this.getHighSpeedVideoSizes = null;
    }

    private final void getHighSpeedVideoFpsRanges(final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final androidx.compose.foundation.interaction.Interaction interaction) {
        if (getIsAttached()) {
            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) getCoroutineScope().getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.FocusableNode$emitWithFallback$1(mutableInteractionSource, interaction, job != null ? job.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.FocusableNode$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.FocusableNode.Camera2StreamConfigurationMap(androidx.compose.foundation.interaction.MutableInteractionSource.this, interaction);
                    return Camera2StreamConfigurationMap;
                }
            }) : null, null), 3, null);
        } else {
            mutableInteractionSource.tryEmit(interaction);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.interaction.Interaction interaction) {
        mutableInteractionSource.tryEmit(interaction);
        return kotlin.Unit.INSTANCE;
    }

    public /* synthetic */ FocusableNode(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, i, function1);
    }
}

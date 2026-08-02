package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ]\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010-R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010'R\u0018\u00102\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010%\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010 R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u00106R\u0018\u00100\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u00109R\u0018\u00103\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010;R\u0018\u0010#\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0016\u0010/\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u0010'"}, d2 = {"Landroidx/compose/foundation/ScrollableAreaNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/foundation/gestures/ScrollableState;", "p0", "Landroidx/compose/foundation/gestures/Orientation;", "p1", "", "p2", "p3", "Landroidx/compose/foundation/gestures/FlingBehavior;", "p4", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p5", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "p6", "p7", "Landroidx/compose/foundation/OverscrollEffect;", "p8", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ZLandroidx/compose/foundation/OverscrollEffect;)V", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/foundation/OverscrollEffect;", "", "onAttach", "()V", "onDetach", "onLayoutDirectionChange", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "getHighSpeedVideoFpsRanges", "()Z", "getHighSpeedVideoSizes", "onObservedReadsChanged", "getOutputSizes", "Landroidx/compose/foundation/gestures/ScrollableState;", "getInputFormats", "Landroidx/compose/foundation/gestures/Orientation;", "Z", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/gestures/FlingBehavior;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getOutputMinFrameDuration", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "getOutputFormats", "getOutputSizeshNQ4ISI", "getOutputStallDuration", "Landroidx/compose/foundation/OverscrollEffect;", "getInputSizeshNQ4ISI", "getOutputMinFrameDurationlomOqCM", "getShouldAutoInvalidate", "Landroidx/compose/foundation/gestures/ScrollableNode;", "Landroidx/compose/foundation/gestures/ScrollableNode;", "getOutputStallDurationlomOqCM", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/foundation/OverscrollFactory;", "Landroidx/compose/foundation/OverscrollFactory;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScrollableAreaNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.ObserverModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.MutableInteractionSource getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.OverscrollFactory getOutputMinFrameDurationlomOqCM;
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.BringIntoViewSpec getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.FlingBehavior getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.Orientation getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.OverscrollEffect getOutputSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.ScrollableNode getOutputStallDurationlomOqCM;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.ui.node.DelegatableNode getOutputStallDuration;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final boolean getInputFormats;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.ScrollableState Camera2StreamConfigurationMap;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private androidx.compose.foundation.OverscrollEffect getInputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private boolean getOutputSizeshNQ4ISI;

    public ScrollableAreaNode(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, boolean z2, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec, boolean z3, androidx.compose.foundation.OverscrollEffect overscrollEffect) {
        this.Camera2StreamConfigurationMap = scrollableState;
        this.getHighSpeedVideoSizes = orientation;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = flingBehavior;
        this.getOutputMinFrameDuration = mutableInteractionSource;
        this.getOutputFormats = bringIntoViewSpec;
        this.getHighSpeedVideoSizesFor = z3;
        this.getInputSizeshNQ4ISI = overscrollEffect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.getInputFormats;
    }

    private androidx.compose.foundation.OverscrollEffect getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoSizesFor) {
            return this.getOutputSizes;
        }
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        this.getOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes();
        if (this.getOutputStallDurationlomOqCM == null) {
            this.getOutputStallDurationlomOqCM = (androidx.compose.foundation.gestures.ScrollableNode) delegate(new androidx.compose.foundation.gestures.ScrollableNode(this.Camera2StreamConfigurationMap, getHighSpeedVideoFpsRangesFor(), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputFormats));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.ui.node.DelegatableNode delegatableNode = this.getOutputStallDuration;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public final void onLayoutDirectionChange() {
        boolean highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (this.getOutputSizeshNQ4ISI != highSpeedVideoFpsRanges) {
            this.getOutputSizeshNQ4ISI = highSpeedVideoFpsRanges;
            Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, getHighSpeedVideoFpsRangesFor(), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputFormats);
        }
    }

    public final void Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.ScrollableState p0, androidx.compose.foundation.gestures.Orientation p1, boolean p2, androidx.compose.foundation.OverscrollEffect p3, boolean p4, boolean p5, androidx.compose.foundation.gestures.FlingBehavior p6, androidx.compose.foundation.interaction.MutableInteractionSource p7, androidx.compose.foundation.gestures.BringIntoViewSpec p8) {
        boolean z;
        this.Camera2StreamConfigurationMap = p0;
        this.getHighSpeedVideoSizes = p1;
        boolean z2 = false;
        if (this.getHighSpeedVideoSizesFor != p2) {
            this.getHighSpeedVideoSizesFor = p2;
            z = true;
        } else {
            z = false;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getInputSizeshNQ4ISI, p3)) {
            this.getInputSizeshNQ4ISI = p3;
            z2 = true;
        }
        if (z || (z2 && !p2)) {
            androidx.compose.ui.node.DelegatableNode delegatableNode = this.getOutputStallDuration;
            if (delegatableNode != null) {
                undelegate(delegatableNode);
            }
            this.getOutputStallDuration = null;
            getHighSpeedVideoSizes();
        }
        this.getHighSpeedVideoFpsRanges = p4;
        this.getHighSpeedVideoFpsRangesFor = p5;
        this.getHighResolutionOutputSizeshNQ4ISI = p6;
        this.getOutputMinFrameDuration = p7;
        this.getOutputFormats = p8;
        this.getOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges();
        androidx.compose.foundation.gestures.ScrollableNode scrollableNode = this.getOutputStallDurationlomOqCM;
        if (scrollableNode != null) {
            scrollableNode.update(p0, p1, getHighSpeedVideoFpsRangesFor(), p4, this.getOutputSizeshNQ4ISI, p6, p7, p8);
        }
    }

    private boolean getHighSpeedVideoFpsRanges() {
        androidx.compose.ui.unit.LayoutDirection layoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
        if (getIsAttached()) {
            layoutDirection = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutDirection(this);
        }
        return androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }

    private final void getHighSpeedVideoSizes() {
        androidx.compose.ui.node.DelegatableNode delegatableNode = this.getOutputStallDuration;
        if (delegatableNode == null) {
            if (this.getHighSpeedVideoSizesFor) {
                androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.ScrollableAreaNode$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit highSpeedVideoSizes;
                        highSpeedVideoSizes = androidx.compose.foundation.ScrollableAreaNode.getHighSpeedVideoSizes(androidx.compose.foundation.ScrollableAreaNode.this);
                        return highSpeedVideoSizes;
                    }
                });
            }
            androidx.compose.foundation.OverscrollEffect highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor != null) {
                androidx.compose.ui.node.DelegatableNode getHighSpeedVideoSizes = highSpeedVideoFpsRangesFor.getGetHighSpeedVideoSizes();
                if (getHighSpeedVideoSizes.getNode().getIsAttached()) {
                    return;
                }
                this.getOutputStallDuration = delegate(getHighSpeedVideoSizes);
                return;
            }
            return;
        }
        if (delegatableNode == null || delegatableNode.getNode().getIsAttached()) {
            return;
        }
        delegate(delegatableNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.ScrollableAreaNode scrollableAreaNode) {
        androidx.compose.foundation.OverscrollFactory overscrollFactory = (androidx.compose.foundation.OverscrollFactory) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(scrollableAreaNode, androidx.compose.foundation.OverscrollKt.getLocalOverscrollFactory());
        scrollableAreaNode.getOutputMinFrameDurationlomOqCM = overscrollFactory;
        scrollableAreaNode.getOutputSizes = overscrollFactory != null ? overscrollFactory.createOverscrollEffect() : null;
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        androidx.compose.foundation.OverscrollFactory overscrollFactory = (androidx.compose.foundation.OverscrollFactory) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.foundation.OverscrollKt.getLocalOverscrollFactory());
        if (kotlin.jvm.internal.Intrinsics.areEqual(overscrollFactory, this.getOutputMinFrameDurationlomOqCM)) {
            return;
        }
        this.getOutputMinFrameDurationlomOqCM = overscrollFactory;
        this.getOutputSizes = null;
        androidx.compose.ui.node.DelegatableNode delegatableNode = this.getOutputStallDuration;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.getOutputStallDuration = null;
        getHighSpeedVideoSizes();
        androidx.compose.foundation.gestures.ScrollableNode scrollableNode = this.getOutputStallDurationlomOqCM;
        if (scrollableNode != null) {
            scrollableNode.update(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, getHighSpeedVideoFpsRangesFor(), this.getHighSpeedVideoFpsRanges, this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputFormats);
        }
    }
}

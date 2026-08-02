package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0017\u001a\u00020\u001323\u0010\u0016\u001a/\b\u0001\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u0012\u0012\u0004\u0012\u00020\u00130\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000fH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J;\u0010$\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0013H\u0016¢\u0006\u0004\b)\u0010'J'\u00102\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0013\u00104\u001a\u00020\u0013*\u000203H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0013H\u0002¢\u0006\u0004\b6\u0010'J\u000f\u00107\u001a\u00020\u0013H\u0002¢\u0006\u0004\b7\u0010'R\u0018\u00106\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00108R\u0018\u0010(\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00109R\u001a\u0010:\u001a\u00020\t8\u0017X\u0096D¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010#R\u0014\u00107\u001a\u00020=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010>\u001a\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020C8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010KR4\u0010N\u001a \u0012\t\u0012\u00070M¢\u0006\u0002\b\u0012\u0012\t\u0012\u00070M¢\u0006\u0002\b\u0012\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010OR4\u0010A\u001a \b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010O"}, d2 = {"Landroidx/compose/foundation/gestures/Scrollable2DNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/foundation/gestures/Scrollable2DState;", "state", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "<init>", "(Landroidx/compose/foundation/gestures/Scrollable2DState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)V", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "drag", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "startedPosition", "onDragStarted-k-4lQ0M", "(J)V", "onDragStarted", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "event", "onDragStopped", "(Landroidx/compose/foundation/gestures/DragEvent$DragStopped;)V", "startDragImmediately", "()Z", "update", "(Landroidx/compose/foundation/gestures/Scrollable2DState;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "onAttach", "()V", "getHighSpeedVideoFpsRangesFor", "onDensityChange", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "getInputFormats", "Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/gestures/ScrollingLogic2D;", "getOutputFormats", "Landroidx/compose/foundation/gestures/ScrollingLogic2D;", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "getHighSpeedVideoSizesFor", "", "getOutputMinFrameDuration", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Scrollable2DNode extends androidx.compose.foundation.gestures.DragGestureNode implements androidx.compose.ui.node.SemanticsModifierNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.FlingBehavior getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollableNestedScrollConnection getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.DefaultFlingBehavior getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.OverscrollEffect getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollableContainerNode getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, ? extends java.lang.Object> getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollingLogic2D getInputSizeshNQ4ISI;
    private kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> getOutputMinFrameDuration;
    private final boolean shouldAutoInvalidate;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public final void mo1426onDragStartedk4lQ0M(long startedPosition) {
    }

    public Scrollable2DNode(androidx.compose.foundation.gestures.Scrollable2DState scrollable2DState, androidx.compose.foundation.OverscrollEffect overscrollEffect, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        super(androidx.compose.foundation.gestures.ScrollableKt.getCanDragCalculation(), z, mutableInteractionSource, null);
        this.getHighSpeedVideoFpsRanges = overscrollEffect;
        this.getHighSpeedVideoFpsRangesFor = flingBehavior;
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher();
        this.Camera2StreamConfigurationMap = nestedScrollDispatcher;
        this.getHighSpeedVideoSizes = (androidx.compose.foundation.gestures.ScrollableContainerNode) delegate(new androidx.compose.foundation.gestures.ScrollableContainerNode(z));
        androidx.compose.foundation.gestures.DefaultFlingBehavior defaultFlingBehavior = new androidx.compose.foundation.gestures.DefaultFlingBehavior(androidx.compose.animation.SplineBasedDecayKt.splineBasedDecay(androidx.compose.foundation.gestures.ScrollableKt.getUnityDensity()), null, 2, null);
        this.getHighResolutionOutputSizeshNQ4ISI = defaultFlingBehavior;
        androidx.compose.foundation.OverscrollEffect overscrollEffect2 = this.getHighSpeedVideoFpsRanges;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2 = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.foundation.gestures.ScrollingLogic2D scrollingLogic2D = new androidx.compose.foundation.gestures.ScrollingLogic2D(scrollable2DState, overscrollEffect2, flingBehavior2 == null ? defaultFlingBehavior : flingBehavior2, nestedScrollDispatcher, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.Scrollable2DNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.Scrollable2DNode.Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.Scrollable2DNode.this);
                return java.lang.Boolean.valueOf(Camera2StreamConfigurationMap);
            }
        });
        this.getInputSizeshNQ4ISI = scrollingLogic2D;
        androidx.compose.foundation.gestures.ScrollableNestedScrollConnection scrollableNestedScrollConnection = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection(scrollingLogic2D, z);
        this.getHighSpeedVideoSizesFor = scrollableNestedScrollConnection;
        delegate(androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.Scrollable2DNode scrollable2DNode) {
        return scrollable2DNode.getIsAttached();
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final java.lang.Object drag(kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.MutatePriority.UserInput, new androidx.compose.foundation.gestures.Scrollable2DNode$drag$2$1(function2, null), continuation);
        return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStopped(androidx.compose.foundation.gestures.DragEvent.DragStopped event) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap.getCoroutineScope(), null, null, new androidx.compose.foundation.gestures.Scrollable2DNode$onDragStopped$1(this, event, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: startDragImmediately */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap();
    }

    public final void update(androidx.compose.foundation.gestures.Scrollable2DState state, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean enabled, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource interactionSource) {
        boolean z;
        if (getEnabled() != enabled) {
            this.getHighSpeedVideoSizesFor.setEnabled(enabled);
            this.getHighSpeedVideoSizes.update(enabled);
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean Camera2StreamConfigurationMap = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap(state, overscrollEffect, flingBehavior == null ? this.getHighResolutionOutputSizeshNQ4ISI : flingBehavior, this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRanges = overscrollEffect;
        this.getHighSpeedVideoFpsRangesFor = flingBehavior;
        androidx.compose.foundation.gestures.DragGestureNode.update$default(this, androidx.compose.foundation.gestures.ScrollableKt.getCanDragCalculation(), enabled, interactionSource, null, Camera2StreamConfigurationMap, 8, null);
        if (z2) {
            Camera2StreamConfigurationMap();
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        getHighSpeedVideoFpsRangesFor();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        if (getIsAttached()) {
            this.getHighResolutionOutputSizeshNQ4ISI.updateDensity(androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        onCancelPointerInput();
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo1262onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (getCanDrag().invoke(androidx.compose.ui.input.pointer.PointerType.m7297boximpl(changes.get(i).getType())).booleanValue()) {
                super.mo1262onPointerEventH0pRuoY(pointerEvent, pass, bounds);
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (getEnabled() && (this.getOutputMinFrameDuration == null || this.getInputFormats == null)) {
            getHighSpeedVideoFpsRanges();
        }
        kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> function2 = this.getOutputMinFrameDuration;
        if (function2 != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, function2, 1, null);
        }
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, ? extends java.lang.Object> function22 = this.getInputFormats;
        if (function22 != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.scrollByOffset(semanticsPropertyReceiver, function22);
        }
    }

    private final void getHighSpeedVideoFpsRanges() {
        this.getOutputMinFrameDuration = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.Scrollable2DNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                boolean highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.Scrollable2DNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.Scrollable2DNode.this, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
                return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        };
        this.getInputFormats = new androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$2(this, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.Scrollable2DNode scrollable2DNode, float f, float f2) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scrollable2DNode.getCoroutineScope(), null, null, new androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$1$1(scrollable2DNode, f, f2, null), 3, null);
        return true;
    }

    private final void Camera2StreamConfigurationMap() {
        this.getOutputMinFrameDuration = null;
        this.getInputFormats = null;
    }
}

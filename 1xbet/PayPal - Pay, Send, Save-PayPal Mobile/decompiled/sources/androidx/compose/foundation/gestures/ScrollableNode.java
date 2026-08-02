package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010#\u001a\u00020\u001823\u0010\"\u001a/\b\u0001\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\u001e¢\u0006\u0002\b\u001f\u0012\u0004\u0012\u00020\u00180\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001cH\u0096@¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010\u001aJ\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010\u001aJ\u000f\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0002¢\u0006\u0004\b1\u00102JU\u00103\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0018H\u0016¢\u0006\u0004\b5\u00102J\u000f\u0010.\u001a\u00020\u0018H\u0002¢\u0006\u0004\b.\u00102J\u000f\u00106\u001a\u00020\u0018H\u0016¢\u0006\u0004\b6\u00102J\u0017\u0010:\u001a\u00020\r2\u0006\u0010)\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\r2\u0006\u0010)\u001a\u000207H\u0016¢\u0006\u0004\b;\u00109J'\u0010E\u001a\u00020\u00182\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0013\u0010G\u001a\u00020\u0018*\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0018H\u0002¢\u0006\u0004\bI\u00102J\u000f\u0010J\u001a\u00020\u0018H\u0002¢\u0006\u0004\bJ\u00102R\u0018\u00101\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010.\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\r8\u0017X\u0096D¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u00100R\u0014\u0010M\u001a\u00020R8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010J\u001a\u00020U8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010I\u001a\u00020X8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010YR\u0014\u0010]\u001a\u00020Z8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010K\u001a\u00020^8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010_R\u0014\u0010b\u001a\u00020`8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010aR\u0014\u0010e\u001a\u00020c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010dR4\u0010S\u001a \u0012\t\u0012\u00070f¢\u0006\u0002\b\u001f\u0012\t\u0012\u00070f¢\u0006\u0002\b\u001f\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010gR4\u0010h\u001a \b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160 \u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010gR\u0018\u0010[\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010j"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/foundation/gestures/OnScrollChangedDispatcher;", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "Landroidx/compose/ui/geometry/Offset;", "delta", "", "dispatchScrollDeltaInfo-k-4lQ0M", "(J)V", "dispatchScrollDeltaInfo", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "drag", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startedPosition", "onDragStarted-k-4lQ0M", "onDragStarted", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "event", "onDragStopped", "(Landroidx/compose/foundation/gestures/DragEvent$DragStopped;)V", "Landroidx/compose/ui/unit/Velocity;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "startDragImmediately", "()Z", "Camera2StreamConfigurationMap", "()V", "update", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "onAttach", "onDensityChange", "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onKeyEvent", "onPreKeyEvent-ZmokQxo", "onPreKeyEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/OverscrollEffect;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/gestures/FlingBehavior;", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getOutputFormats", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "getOutputSizes", "Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "Landroidx/compose/foundation/gestures/ScrollableDefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollableDefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "getOutputMinFrameDurationlomOqCM", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "getOutputMinFrameDuration", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "getInputFormats", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "getHighSpeedVideoSizesFor", "", "Lkotlin/jvm/functions/Function2;", "getOutputSizeshNQ4ISI", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScrollableNode extends androidx.compose.foundation.gestures.DragGestureNode implements androidx.compose.ui.input.key.KeyInputModifierNode, androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.foundation.gestures.OnScrollChangedDispatcher {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ContentInViewNode getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.focus.FocusTargetModifierNode getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.FlingBehavior getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.MouseWheelScrollingLogic getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, ? extends java.lang.Object> getOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.OverscrollEffect Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollableNestedScrollConnection getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollingLogic getOutputMinFrameDuration;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollableContainerNode getHighSpeedVideoFpsRangesFor;
    private final boolean shouldAutoInvalidate;

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public final void mo1426onDragStartedk4lQ0M(long startedPosition) {
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public final boolean mo1263onPreKeyEventZmokQxo(android.view.KeyEvent event) {
        return false;
    }

    public ScrollableNode(androidx.compose.foundation.gestures.ScrollableState scrollableState, androidx.compose.foundation.OverscrollEffect overscrollEffect, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.gestures.Orientation orientation, boolean z, boolean z2, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec) {
        super(androidx.compose.foundation.gestures.ScrollableKt.getCanDragCalculation(), z, mutableInteractionSource, orientation);
        this.Camera2StreamConfigurationMap = overscrollEffect;
        this.getHighResolutionOutputSizeshNQ4ISI = flingBehavior;
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher();
        this.getHighSpeedVideoFpsRanges = nestedScrollDispatcher;
        this.getHighSpeedVideoFpsRangesFor = (androidx.compose.foundation.gestures.ScrollableContainerNode) delegate(new androidx.compose.foundation.gestures.ScrollableContainerNode(z));
        androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior platformScrollableDefaultFlingBehavior = androidx.compose.foundation.gestures.Scrollable_androidKt.platformScrollableDefaultFlingBehavior();
        this.getHighSpeedVideoSizes = platformScrollableDefaultFlingBehavior;
        androidx.compose.foundation.OverscrollEffect overscrollEffect2 = this.Camera2StreamConfigurationMap;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2 = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = new androidx.compose.foundation.gestures.ScrollingLogic(scrollableState, overscrollEffect2, flingBehavior2 == null ? platformScrollableDefaultFlingBehavior : flingBehavior2, orientation, z2, nestedScrollDispatcher, this, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.ScrollableNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.ScrollableNode.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.ScrollableNode.this);
                return java.lang.Boolean.valueOf(highSpeedVideoFpsRangesFor);
            }
        });
        this.getOutputMinFrameDuration = scrollingLogic;
        androidx.compose.foundation.gestures.ScrollableNestedScrollConnection scrollableNestedScrollConnection = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection(scrollingLogic, z);
        this.getInputSizeshNQ4ISI = scrollableNestedScrollConnection;
        this.getInputFormats = (androidx.compose.ui.focus.FocusTargetModifierNode) delegate(androidx.compose.ui.focus.FocusTargetModifierNodeKt.m5677FocusTargetModifierNodePYyLHbc$default(androidx.compose.ui.focus.Focusability.INSTANCE.m5693getNeverLCbbffg(), null, 2, null));
        androidx.compose.foundation.gestures.ContentInViewNode contentInViewNode = (androidx.compose.foundation.gestures.ContentInViewNode) delegate(new androidx.compose.foundation.gestures.ContentInViewNode(orientation, scrollingLogic, z2, bringIntoViewSpec, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.ScrollableNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.ui.geometry.Rect highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.gestures.ScrollableNode.getHighSpeedVideoSizes(androidx.compose.foundation.gestures.ScrollableNode.this);
                return highSpeedVideoSizes;
            }
        }));
        this.getHighSpeedVideoSizesFor = contentInViewNode;
        delegate(androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.nestedScrollModifierNode(scrollableNestedScrollConnection, nestedScrollDispatcher));
        delegate(new androidx.compose.foundation.relocation.BringIntoViewResponderNode(contentInViewNode));
        if (androidx.compose.foundation.ComposeFoundationFlags.isKeepInViewFocusObservationChangeEnabled) {
            return;
        }
        delegate(new androidx.compose.foundation.FocusedBoundsObserverNode(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.ScrollableNode$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.ScrollableNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.ScrollableNode.this, (androidx.compose.ui.layout.LayoutCoordinates) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.ScrollableNode scrollableNode) {
        return scrollableNode.getIsAttached();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.geometry.Rect getHighSpeedVideoSizes(androidx.compose.foundation.gestures.ScrollableNode scrollableNode) {
        return androidx.compose.ui.focus.FocusTargetModifierNodeKt.getFocusedRect(scrollableNode.getInputFormats);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.ScrollableNode scrollableNode, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        scrollableNode.getHighSpeedVideoSizesFor.onFocusBoundsChanged(layoutCoordinates);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.OnScrollChangedDispatcher
    /* renamed from: dispatchScrollDeltaInfo-k-4lQ0M */
    public final void mo1493dispatchScrollDeltaInfok4lQ0M(long delta) {
        if (getIsAttached()) {
            androidx.compose.ui.node.DelegatableNodeKt.m7499dispatchOnScrollChangedUv8p0NA(this, delta);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final java.lang.Object drag(kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic = this.getOutputMinFrameDuration;
        java.lang.Object scroll = scrollingLogic.scroll(androidx.compose.foundation.MutatePriority.UserInput, new androidx.compose.foundation.gestures.ScrollableNode$drag$2$1(function2, scrollingLogic, null), continuation);
        return scroll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStopped(androidx.compose.foundation.gestures.DragEvent.DragStopped event) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges.getCoroutineScope(), null, null, new androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1(event, this, null), 3, null);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(long p0) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges.getCoroutineScope(), null, null, new androidx.compose.foundation.gestures.ScrollableNode$onWheelScrollStopped$1(this, p0, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: startDragImmediately */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getOutputMinFrameDuration.shouldScrollImmediately();
    }

    private final void Camera2StreamConfigurationMap() {
        if (this.getOutputMinFrameDurationlomOqCM == null) {
            this.getOutputMinFrameDurationlomOqCM = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic(this.getOutputMinFrameDuration, androidx.compose.foundation.gestures.AndroidScrollable_androidKt.platformScrollConfig(this), new androidx.compose.foundation.gestures.ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(this), androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this));
        }
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic = this.getOutputMinFrameDurationlomOqCM;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.startReceivingMouseWheelEvents(getCoroutineScope());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.lang.Object getHighSpeedVideoSizes(androidx.compose.foundation.gestures.ScrollableNode scrollableNode, long j) {
        scrollableNode.getHighResolutionOutputSizeshNQ4ISI(j);
        return kotlin.Unit.INSTANCE;
    }

    public final void update(androidx.compose.foundation.gestures.ScrollableState state, androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.foundation.OverscrollEffect overscrollEffect, boolean enabled, boolean reverseDirection, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, androidx.compose.foundation.gestures.BringIntoViewSpec bringIntoViewSpec) {
        boolean z;
        if (getEnabled() != enabled) {
            this.getInputSizeshNQ4ISI.setEnabled(enabled);
            this.getHighSpeedVideoFpsRangesFor.update(enabled);
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        boolean update = this.getOutputMinFrameDuration.update(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.getHighSpeedVideoSizes : flingBehavior, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoSizesFor.update(orientation, reverseDirection, bringIntoViewSpec);
        this.Camera2StreamConfigurationMap = overscrollEffect;
        this.getHighResolutionOutputSizeshNQ4ISI = flingBehavior;
        update(androidx.compose.foundation.gestures.ScrollableKt.getCanDragCalculation(), enabled, interactionSource, this.getOutputMinFrameDuration.isVertical() ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal, update);
        if (z2) {
            getHighSpeedVideoFpsRangesFor();
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        getHighResolutionOutputSizeshNQ4ISI();
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic = this.getOutputMinFrameDurationlomOqCM;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this));
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (getIsAttached()) {
            this.getHighSpeedVideoSizes.updateDensity(androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        onCancelPointerInput();
        getHighResolutionOutputSizeshNQ4ISI();
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic = this.getOutputMinFrameDurationlomOqCM;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.updateDensity(androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this));
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public final boolean mo1261onKeyEventZmokQxo(android.view.KeyEvent event) {
        long m5744constructorimpl;
        if (!getEnabled()) {
            return false;
        }
        if ((!androidx.compose.ui.input.key.Key.m6781equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event), androidx.compose.ui.input.key.Key.INSTANCE.m6969getPageDownEK5gGoQ()) && !androidx.compose.ui.input.key.Key.m6781equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event), androidx.compose.ui.input.key.Key.INSTANCE.m6970getPageUpEK5gGoQ())) || !androidx.compose.ui.input.key.KeyEventType.m7082equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7090getTypeZmokQxo(event), androidx.compose.ui.input.key.KeyEventType.INSTANCE.m7086getKeyDownCS__XNY()) || androidx.compose.ui.input.key.KeyEvent_androidKt.m7093isCtrlPressedZmokQxo(event)) {
            return false;
        }
        if (this.getOutputMinFrameDuration.isVertical()) {
            int viewportSize = (int) (this.getHighSpeedVideoSizesFor.getViewportSize() & 4294967295L);
            m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(androidx.compose.ui.input.key.Key.m6781equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event), androidx.compose.ui.input.key.Key.INSTANCE.m6970getPageUpEK5gGoQ()) ? viewportSize : -viewportSize)));
        } else {
            int viewportSize2 = (int) (this.getHighSpeedVideoSizesFor.getViewportSize() >> 32);
            m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(androidx.compose.ui.input.key.Key.m6781equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(event), androidx.compose.ui.input.key.Key.INSTANCE.m6970getPageUpEK5gGoQ()) ? viewportSize2 : -viewportSize2) << 32));
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1(this, m5744constructorimpl, null), 3, null);
        return true;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo1262onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (getCanDrag().invoke(androidx.compose.ui.input.pointer.PointerType.m7297boximpl(changes.get(i).getType())).booleanValue()) {
                super.mo1262onPointerEventH0pRuoY(pointerEvent, pass, bounds);
                break;
            }
            i++;
        }
        if (getEnabled()) {
            if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Initial && androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7189getScroll7fucELk())) {
                Camera2StreamConfigurationMap();
            }
            androidx.compose.foundation.gestures.MouseWheelScrollingLogic mouseWheelScrollingLogic = this.getOutputMinFrameDurationlomOqCM;
            if (mouseWheelScrollingLogic != null) {
                mouseWheelScrollingLogic.m1489onPointerEventH0pRuoY(pointerEvent, pass, bounds);
            }
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (getEnabled() && (this.getOutputFormats == null || this.getOutputSizeshNQ4ISI == null)) {
            getHighSpeedVideoSizes();
        }
        kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> function2 = this.getOutputFormats;
        if (function2 != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, function2, 1, null);
        }
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, ? extends java.lang.Object> function22 = this.getOutputSizeshNQ4ISI;
        if (function22 != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.scrollByOffset(semanticsPropertyReceiver, function22);
        }
    }

    private final void getHighSpeedVideoSizes() {
        this.getOutputFormats = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.ScrollableNode$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                boolean highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.gestures.ScrollableNode.getHighSpeedVideoSizes(androidx.compose.foundation.gestures.ScrollableNode.this, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
                return java.lang.Boolean.valueOf(highSpeedVideoSizes);
            }
        };
        this.getOutputSizeshNQ4ISI = new androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2(this, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoSizes(androidx.compose.foundation.gestures.ScrollableNode scrollableNode, float f, float f2) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scrollableNode.getCoroutineScope(), null, null, new androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1(scrollableNode, f, f2, null), 3, null);
        return true;
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        this.getOutputFormats = null;
        this.getOutputSizeshNQ4ISI = null;
    }
}

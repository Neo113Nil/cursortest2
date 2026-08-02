package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010H\u001a\u00020I2=\u0010J\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110L¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(O\u0012\u0004\u0012\u00020I0\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0P\u0012\u0006\u0012\u0004\u0018\u00010Q0KH¦@¢\u0006\u0002\u0010RJ\u0017\u0010S\u001a\u00020I2\u0006\u0010T\u001a\u00020AH&¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020I2\u0006\u0010X\u001a\u00020YH&J\b\u0010Z\u001a\u00020\bH&J\b\u0010[\u001a\u00020?H\u0002J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\b\u0010]\u001a\u00020DH\u0002J\b\u0010^\u001a\u00020IH\u0002J\b\u0010a\u001a\u00020IH\u0016J'\u0010b\u001a\u00020I2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020hH\u0016¢\u0006\u0004\bi\u0010jJ\u0018\u0010k\u001a\u00020I2\u0006\u0010X\u001a\u00020l2\u0006\u0010e\u001a\u00020fH\u0016J\b\u0010m\u001a\u00020IH\u0016J\b\u0010n\u001a\u00020`H\u0002J\b\u0010o\u001a\u00020IH\u0016J\u0016\u0010p\u001a\u00020I2\u0006\u0010X\u001a\u00020qH\u0082@¢\u0006\u0002\u0010rJ\u0016\u0010s\u001a\u00020I2\u0006\u0010X\u001a\u00020YH\u0082@¢\u0006\u0002\u0010tJ\u000e\u0010u\u001a\u00020IH\u0082@¢\u0006\u0002\u0010vJ\u0006\u0010w\u001a\u00020IJH\u0010x\u001a\u00020I2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010y\u001a\u00020\bJ\u0018\u0010z\u001a\u00020I2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020fH\u0002J\b\u0010{\u001a\u00020IH\u0002J8\u0010|\u001a\u00020I2\u0006\u0010}\u001a\u00020~2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\t\b\u0002\u0010\u0081\u0001\u001a\u00020A2\t\b\u0002\u0010\u0082\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001a\u0010\u0085\u0001\u001a\u00020I2\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0002¢\u0006\u0005\b\u0086\u0001\u0010VJ\t\u0010\u0087\u0001\u001a\u00020IH\u0002J+\u0010\u0088\u0001\u001a\u00020I2\u0006\u0010}\u001a\u00020~2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\u0006\u0010C\u001a\u00020DH\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\"\u0010\u008b\u0001\u001a\u00020I2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020f2\u0007\u0010\u008c\u0001\u001a\u00020)H\u0002J\"\u0010\u008d\u0001\u001a\u00020I2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020f2\u0007\u0010\u008c\u0001\u001a\u000203H\u0002J\"\u0010\u008e\u0001\u001a\u00020I2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020f2\u0007\u0010\u008c\u0001\u001a\u000208H\u0002J\"\u0010\u008f\u0001\u001a\u00020I2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020f2\u0007\u0010\u008c\u0001\u001a\u00020.H\u0002J-\u0010\u0090\u0001\u001a\u00020I2\u0007\u0010\u0091\u0001\u001a\u00020~2\u0007\u0010\u0092\u0001\u001a\u00020~2\u0007\u0010\u0093\u0001\u001a\u00020AH\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J$\u0010\u0096\u0001\u001a\u00020I2\u0007\u0010\u0097\u0001\u001a\u00020~2\u0007\u0010\u0098\u0001\u001a\u00020AH\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0012\u0010\u009b\u0001\u001a\u00020I2\u0007\u0010\u0097\u0001\u001a\u00020~H\u0002J\t\u0010\u009c\u0001\u001a\u00020IH\u0002J\u000f\u0010\u009d\u0001\u001a\u00020I2\u0006\u0010X\u001a\u00020\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R6\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010$R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u0002088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u00020AX\u0082\u000e¢\u0006\u0004\n\u0002\u0010BR\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010FX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u00020AX\u0082\u000e¢\u0006\u0004\n\u0002\u0010BR\u0010\u0010_\u001a\u0004\u0018\u00010`X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u009e\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/indirect/IndirectPointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "canDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerType;", "", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "orientationLock", "Landroidx/compose/foundation/gestures/Orientation;", "<init>", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;)V", "getOrientationLock", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientationLock", "(Landroidx/compose/foundation/gestures/Orientation;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getCanDrag", "()Lkotlin/jvm/functions/Function1;", "getEnabled", "()Z", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "_canDrag", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/DragEvent;", "dragInteraction", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "isListeningForEvents", "isListeningForEvents$foundation", "setListeningForEvents$foundation", "(Z)V", "isListeningForPointerInputEvents", "isListeningForPointerInputEvents$foundation", "setListeningForPointerInputEvents$foundation", "_awaitDownState", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown;", "awaitDownState", "getAwaitDownState", "()Landroidx/compose/foundation/gestures/DragDetectionState$AwaitDown;", "_draggingState", "Landroidx/compose/foundation/gestures/DragDetectionState$Dragging;", "draggingState", "getDraggingState", "()Landroidx/compose/foundation/gestures/DragDetectionState$Dragging;", "_awaitTouchSlopState", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitTouchSlop;", "awaitTouchSlopState", "getAwaitTouchSlopState", "()Landroidx/compose/foundation/gestures/DragDetectionState$AwaitTouchSlop;", "_awaitGesturePickupState", "Landroidx/compose/foundation/gestures/DragDetectionState$AwaitGesturePickup;", "awaitGesturePickupState", "getAwaitGesturePickupState", "()Landroidx/compose/foundation/gestures/DragDetectionState$AwaitGesturePickup;", "currentDragState", "Landroidx/compose/foundation/gestures/DragDetectionState;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "previousPositionOnScreen", "Landroidx/compose/ui/geometry/Offset;", "J", "touchSlopDetector", "Landroidx/compose/foundation/gestures/TouchSlopDetector;", "indirectPointerInputDragCycleDetector", "Landroidx/compose/foundation/gestures/IndirectPointerInputDragCycleDetector;", "nodeOffset", "drag", "", "forEachDelta", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", "name", "dragDelta", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStarted", "startedPosition", "onDragStarted-k-4lQ0M", "(J)V", "onDragStopped", "event", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "startDragImmediately", "requireVelocityTracker", "requireChannel", "requireTouchSlopDetector", "startListeningForEvents", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "onDetach", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onIndirectPointerEvent", "Landroidx/compose/ui/input/indirect/IndirectPointerEvent;", "onCancelIndirectPointerInput", "initializePointerInputNode", "onCancelPointerInput", "processDragStart", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "(Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStop", "(Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragCancel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disposeInteractionSource", "update", "shouldResetPointerInputHandling", "processRawPointerEvent", "resetDragDetectionState", "moveToAwaitTouchSlopState", "initialDown", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "initialTouchSlopPositionChange", "verifyConsumptionInFinalPass", "moveToAwaitTouchSlopState-aWI9W7U", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJZ)V", "moveToDraggingState", "moveToDraggingState-0FcD4WY", "moveToAwaitDownState", "moveToAwaitGesturePickupState", "moveToAwaitGesturePickupState-rnUCldI", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/foundation/gestures/TouchSlopDetector;)V", "processInitialDownState", "state", "processAwaitTouchSlop", "processAwaitGesturePickup", "processDraggingState", "sendDragStart", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "slopTriggerChange", "overSlopOffset", "sendDragStart-0AR0LA0", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "sendDragEvent", "change", "dragAmount", "sendDragEvent-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)V", "sendDragStopped", "sendDragCancelled", "onDragEvent", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class DragGestureNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.PointerInputModifierNode, androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private androidx.compose.foundation.gestures.DragDetectionState.AwaitGesturePickup Camera2StreamConfigurationMap;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> canDrag;
    private boolean enabled;
    private androidx.compose.foundation.gestures.DragDetectionState.Dragging getHighSpeedVideoFpsRanges;
    private androidx.compose.foundation.gestures.DragDetectionState.AwaitDown getHighSpeedVideoFpsRangesFor;
    private androidx.compose.foundation.gestures.DragDetectionState.AwaitTouchSlop getHighSpeedVideoSizes;
    private androidx.compose.foundation.gestures.DragDetectionState getHighSpeedVideoSizesFor;
    private androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector getInputFormats;
    private kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.DragEvent> getInputSizeshNQ4ISI;
    private androidx.compose.foundation.interaction.DragInteraction.Start getOutputMinFrameDuration;
    private androidx.compose.ui.input.pointer.util.VelocityTracker getOutputMinFrameDurationlomOqCM;
    private androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode getOutputStallDuration;
    private androidx.compose.foundation.gestures.TouchSlopDetector getOutputStallDurationlomOqCM;
    private androidx.compose.foundation.interaction.MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;
    private boolean isListeningForPointerInputEvents;
    private androidx.compose.foundation.gestures.Orientation orientationLock;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.DragGestureNode$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            boolean highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.DragGestureNode.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.DragGestureNode.this, (androidx.compose.ui.input.pointer.PointerType) obj);
            return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
        }
    };
    private long getOutputSizeshNQ4ISI = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
    private long getOutputFormats = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();

    public abstract java.lang.Object drag(kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* renamed from: onDragStarted-k-4lQ0M */
    public abstract void mo1426onDragStartedk4lQ0M(long startedPosition);

    public abstract void onDragStopped(androidx.compose.foundation.gestures.DragEvent.DragStopped event);

    /* renamed from: startDragImmediately */
    public abstract boolean getGetHighResolutionOutputSizeshNQ4ISI();

    public DragGestureNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> function1, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.gestures.Orientation orientation) {
        this.orientationLock = orientation;
        this.canDrag = function1;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
    }

    public final androidx.compose.foundation.gestures.Orientation getOrientationLock() {
        return this.orientationLock;
    }

    public final void setOrientationLock(androidx.compose.foundation.gestures.Orientation orientation) {
        this.orientationLock = orientation;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> getCanDrag() {
        return this.canDrag;
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final androidx.compose.foundation.interaction.MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, androidx.compose.ui.input.pointer.PointerType pointerType) {
        return dragGestureNode.canDrag.invoke(pointerType).booleanValue();
    }

    /* renamed from: isListeningForEvents$foundation, reason: from getter */
    public final boolean getIsListeningForEvents() {
        return this.isListeningForEvents;
    }

    public final void setListeningForEvents$foundation(boolean z) {
        this.isListeningForEvents = z;
    }

    /* renamed from: isListeningForPointerInputEvents$foundation, reason: from getter */
    public final boolean getIsListeningForPointerInputEvents() {
        return this.isListeningForPointerInputEvents;
    }

    public final void setListeningForPointerInputEvents$foundation(boolean z) {
        this.isListeningForPointerInputEvents = z;
    }

    private final androidx.compose.foundation.gestures.DragDetectionState.AwaitDown getHighSpeedVideoSizes() {
        androidx.compose.foundation.gestures.DragDetectionState.AwaitDown awaitDown = this.getHighSpeedVideoFpsRangesFor;
        if (awaitDown != null) {
            return awaitDown;
        }
        androidx.compose.foundation.gestures.DragDetectionState.AwaitDown awaitDown2 = new androidx.compose.foundation.gestures.DragDetectionState.AwaitDown(null, false, 3, null);
        this.getHighSpeedVideoFpsRangesFor = awaitDown2;
        return awaitDown2;
    }

    private final androidx.compose.foundation.gestures.DragDetectionState.Dragging Camera2StreamConfigurationMap() {
        androidx.compose.foundation.gestures.DragDetectionState.Dragging dragging = this.getHighSpeedVideoFpsRanges;
        if (dragging != null) {
            return dragging;
        }
        androidx.compose.foundation.gestures.DragDetectionState.Dragging dragging2 = new androidx.compose.foundation.gestures.DragDetectionState.Dragging(0L, 1, null);
        this.getHighSpeedVideoFpsRanges = dragging2;
        return dragging2;
    }

    private final androidx.compose.foundation.gestures.DragDetectionState.AwaitTouchSlop getHighSpeedVideoFpsRangesFor() {
        androidx.compose.foundation.gestures.DragDetectionState.AwaitTouchSlop awaitTouchSlop = this.getHighSpeedVideoSizes;
        if (awaitTouchSlop != null) {
            return awaitTouchSlop;
        }
        androidx.compose.foundation.gestures.DragDetectionState.AwaitTouchSlop awaitTouchSlop2 = new androidx.compose.foundation.gestures.DragDetectionState.AwaitTouchSlop(null, 0L, false, 7, null);
        this.getHighSpeedVideoSizes = awaitTouchSlop2;
        return awaitTouchSlop2;
    }

    private final androidx.compose.foundation.gestures.DragDetectionState.AwaitGesturePickup getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.foundation.gestures.DragDetectionState.AwaitGesturePickup awaitGesturePickup = this.Camera2StreamConfigurationMap;
        if (awaitGesturePickup != null) {
            return awaitGesturePickup;
        }
        androidx.compose.foundation.gestures.DragDetectionState.AwaitGesturePickup awaitGesturePickup2 = new androidx.compose.foundation.gestures.DragDetectionState.AwaitGesturePickup(null, 0L, null, 7, null);
        this.Camera2StreamConfigurationMap = awaitGesturePickup2;
        return awaitGesturePickup2;
    }

    private final androidx.compose.ui.input.pointer.util.VelocityTracker getOutputMinFrameDuration() {
        androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker = this.getOutputMinFrameDurationlomOqCM;
        if (velocityTracker != null) {
            return velocityTracker;
        }
        throw new java.lang.IllegalArgumentException("Velocity Tracker not initialized.".toString());
    }

    private final kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.DragEvent> getHighSpeedVideoSizesFor() {
        kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.DragEvent> channel = this.getInputSizeshNQ4ISI;
        if (channel != null) {
            return channel;
        }
        throw new java.lang.IllegalArgumentException("Events channel not initialized.".toString());
    }

    private final androidx.compose.foundation.gestures.TouchSlopDetector getInputSizeshNQ4ISI() {
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector = this.getOutputStallDurationlomOqCM;
        if (touchSlopDetector != null) {
            return touchSlopDetector;
        }
        throw new java.lang.IllegalArgumentException("Touch slop detector not initialized.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getOutputSizeshNQ4ISI() {
        this.isListeningForEvents = true;
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1(this, null), 3, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
        this.getOutputFormats = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1262onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        this.isListeningForPointerInputEvents = true;
        if (androidx.compose.foundation.ComposeFoundationFlags.isNonSuspendingPointerInputInDraggableEnabled) {
            if (this.enabled) {
                if (this.getHighSpeedVideoSizesFor == null) {
                    this.getHighSpeedVideoSizesFor = getHighSpeedVideoSizes();
                }
                getHighSpeedVideoFpsRanges(pointerEvent, pass);
                return;
            }
            return;
        }
        if (this.enabled && this.getOutputStallDuration == null) {
            this.getOutputStallDuration = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) delegate(getHighSpeedVideoFpsRanges());
        }
        androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.getOutputStallDuration;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo1262onPointerEventH0pRuoY(pointerEvent, pass, bounds);
        }
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onIndirectPointerEvent(androidx.compose.ui.input.indirect.IndirectPointerEvent event, androidx.compose.ui.input.pointer.PointerEventPass pass) {
        if (this.enabled) {
            if (this.getInputFormats == null) {
                this.getInputFormats = new androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector(this);
            }
            androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.getInputFormats;
            if (indirectPointerInputDragCycleDetector != null) {
                indirectPointerInputDragCycleDetector.processIndirectPointerInputEvent(event, pass);
            }
        }
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onCancelIndirectPointerInput() {
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.getInputFormats;
        if (indirectPointerInputDragCycleDetector != null) {
            indirectPointerInputDragCycleDetector.resetDragDetectionState();
        }
    }

    private final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode getHighSpeedVideoFpsRanges() {
        return androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1(this));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.getOutputStallDuration;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
        if (androidx.compose.foundation.ComposeFoundationFlags.isNonSuspendingPointerInputInDraggableEnabled && this.isListeningForPointerInputEvents) {
            getInputFormats();
        }
        this.isListeningForPointerInputEvents = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r2.emit(r5, r0) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(androidx.compose.foundation.gestures.DragEvent.DragStarted dragStarted, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1 dragGestureNode$processDragStart$1;
        int i;
        androidx.compose.foundation.interaction.DragInteraction.Start start;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource;
        androidx.compose.foundation.gestures.DragEvent.DragStarted dragStarted2;
        androidx.compose.foundation.interaction.DragInteraction.Start start2;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1) {
            dragGestureNode$processDragStart$1 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1) continuation;
            if ((dragGestureNode$processDragStart$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStart$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = dragGestureNode$processDragStart$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureNode$processDragStart$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.interaction.DragInteraction.Start start3 = this.getOutputMinFrameDuration;
                    if (start3 != null && (r2 = this.interactionSource) != null) {
                        androidx.compose.foundation.interaction.DragInteraction.Cancel cancel = new androidx.compose.foundation.interaction.DragInteraction.Cancel(start3);
                        dragGestureNode$processDragStart$1.getHighSpeedVideoFpsRanges = dragStarted;
                        dragGestureNode$processDragStart$1.Camera2StreamConfigurationMap = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        start2 = (androidx.compose.foundation.interaction.DragInteraction.Start) dragGestureNode$processDragStart$1.getHighResolutionOutputSizeshNQ4ISI;
                        dragStarted2 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) dragGestureNode$processDragStart$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        start = start2;
                        dragStarted = dragStarted2;
                        this.getOutputMinFrameDuration = start;
                        mo1426onDragStartedk4lQ0M(dragStarted.getStartPoint());
                        return kotlin.Unit.INSTANCE;
                    }
                    dragStarted = (androidx.compose.foundation.gestures.DragEvent.DragStarted) dragGestureNode$processDragStart$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                start = new androidx.compose.foundation.interaction.DragInteraction.Start();
                mutableInteractionSource = this.interactionSource;
                if (mutableInteractionSource != null) {
                    dragGestureNode$processDragStart$1.getHighSpeedVideoFpsRanges = dragStarted;
                    dragGestureNode$processDragStart$1.getHighResolutionOutputSizeshNQ4ISI = start;
                    dragGestureNode$processDragStart$1.Camera2StreamConfigurationMap = 2;
                    if (mutableInteractionSource.emit(start, dragGestureNode$processDragStart$1) != coroutine_suspended) {
                        dragStarted2 = dragStarted;
                        start2 = start;
                        start = start2;
                        dragStarted = dragStarted2;
                    }
                    return coroutine_suspended;
                }
                this.getOutputMinFrameDuration = start;
                mo1426onDragStartedk4lQ0M(dragStarted.getStartPoint());
                return kotlin.Unit.INSTANCE;
            }
        }
        dragGestureNode$processDragStart$1 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStart$1(this, continuation);
        java.lang.Object obj2 = dragGestureNode$processDragStart$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureNode$processDragStart$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        start = new androidx.compose.foundation.interaction.DragInteraction.Start();
        mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
        }
        this.getOutputMinFrameDuration = start;
        mo1426onDragStartedk4lQ0M(dragStarted.getStartPoint());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(androidx.compose.foundation.gestures.DragEvent.DragStopped dragStopped, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1 dragGestureNode$processDragStop$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1) {
            dragGestureNode$processDragStop$1 = (androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1) continuation;
            if ((dragGestureNode$processDragStop$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStop$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = dragGestureNode$processDragStop$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureNode$processDragStop$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.interaction.DragInteraction.Start start = this.getOutputMinFrameDuration;
                    if (start != null) {
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            androidx.compose.foundation.interaction.DragInteraction.Stop stop = new androidx.compose.foundation.interaction.DragInteraction.Stop(start);
                            dragGestureNode$processDragStop$1.getHighSpeedVideoSizes = dragStopped;
                            dragGestureNode$processDragStop$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            if (mutableInteractionSource.emit(stop, dragGestureNode$processDragStop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    onDragStopped(dragStopped);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dragStopped = (androidx.compose.foundation.gestures.DragEvent.DragStopped) dragGestureNode$processDragStop$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getOutputMinFrameDuration = null;
                onDragStopped(dragStopped);
                return kotlin.Unit.INSTANCE;
            }
        }
        dragGestureNode$processDragStop$1 = new androidx.compose.foundation.gestures.DragGestureNode$processDragStop$1(this, continuation);
        java.lang.Object obj2 = dragGestureNode$processDragStop$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureNode$processDragStop$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        this.getOutputMinFrameDuration = null;
        onDragStopped(dragStopped);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1 dragGestureNode$processDragCancel$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1) {
            dragGestureNode$processDragCancel$1 = (androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1) continuation;
            if ((dragGestureNode$processDragCancel$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragCancel$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = dragGestureNode$processDragCancel$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureNode$processDragCancel$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.interaction.DragInteraction.Start start = this.getOutputMinFrameDuration;
                    if (start != null) {
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            androidx.compose.foundation.interaction.DragInteraction.Cancel cancel = new androidx.compose.foundation.interaction.DragInteraction.Cancel(start);
                            dragGestureNode$processDragCancel$1.getHighSpeedVideoSizes = 1;
                            if (mutableInteractionSource.emit(cancel, dragGestureNode$processDragCancel$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    onDragStopped(new androidx.compose.foundation.gestures.DragEvent.DragStopped(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M(), false, null));
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getOutputMinFrameDuration = null;
                onDragStopped(new androidx.compose.foundation.gestures.DragEvent.DragStopped(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M(), false, null));
                return kotlin.Unit.INSTANCE;
            }
        }
        dragGestureNode$processDragCancel$1 = new androidx.compose.foundation.gestures.DragGestureNode$processDragCancel$1(this, continuation);
        java.lang.Object obj2 = dragGestureNode$processDragCancel$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureNode$processDragCancel$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        this.getOutputMinFrameDuration = null;
        onDragStopped(new androidx.compose.foundation.gestures.DragEvent.DragStopped(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M(), false, null));
        return kotlin.Unit.INSTANCE;
    }

    public final void disposeInteractionSource() {
        androidx.compose.foundation.interaction.DragInteraction.Start start = this.getOutputMinFrameDuration;
        if (start != null) {
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new androidx.compose.foundation.interaction.DragInteraction.Cancel(start));
            }
            this.getOutputMinFrameDuration = null;
        }
    }

    public static /* synthetic */ void update$default(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, kotlin.jvm.functions.Function1 function1, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.gestures.Orientation orientation, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
        }
        if ((i & 1) != 0) {
            function1 = dragGestureNode.canDrag;
        }
        if ((i & 2) != 0) {
            z = dragGestureNode.enabled;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            mutableInteractionSource = dragGestureNode.interactionSource;
        }
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 8) != 0) {
            orientation = dragGestureNode.orientationLock;
        }
        androidx.compose.foundation.gestures.Orientation orientation2 = orientation;
        if ((i & 16) != 0) {
            z2 = false;
        }
        dragGestureNode.update(function1, z3, mutableInteractionSource2, orientation2, z2);
    }

    public final void update(kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> canDrag, boolean enabled, androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, androidx.compose.foundation.gestures.Orientation orientationLock, boolean shouldResetPointerInputHandling) {
        this.canDrag = canDrag;
        if (this.enabled != enabled) {
            this.enabled = enabled;
            if (!enabled) {
                disposeInteractionSource();
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.getOutputStallDuration;
                if (suspendingPointerInputModifierNode != null) {
                    undelegate(suspendingPointerInputModifierNode);
                }
                this.getOutputStallDuration = null;
                this.getInputFormats = null;
            }
            shouldResetPointerInputHandling = true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.interactionSource, interactionSource)) {
            disposeInteractionSource();
            this.interactionSource = interactionSource;
        }
        if (this.orientationLock != orientationLock) {
            this.orientationLock = orientationLock;
        } else if (!shouldResetPointerInputHandling) {
            return;
        }
        if (androidx.compose.foundation.ComposeFoundationFlags.isNonSuspendingPointerInputInDraggableEnabled && this.isListeningForPointerInputEvents) {
            getInputFormats();
        }
        androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetector indirectPointerInputDragCycleDetector = this.getInputFormats;
        if (indirectPointerInputDragCycleDetector != null) {
            indirectPointerInputDragCycleDetector.resetDragDetectionState();
        }
        androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode suspendingPointerInputModifierNode2 = this.getOutputStallDuration;
        if (suspendingPointerInputModifierNode2 != null) {
            suspendingPointerInputModifierNode2.resetPointerInputHandler();
        }
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass) {
        androidx.compose.foundation.gestures.DragDetectionState dragDetectionState = this.getHighSpeedVideoSizesFor;
        if (dragDetectionState == null) {
            throw new java.lang.IllegalArgumentException("currentDragState should not be null".toString());
        }
        if (dragDetectionState instanceof androidx.compose.foundation.gestures.DragDetectionState.AwaitDown) {
            getHighResolutionOutputSizeshNQ4ISI(pointerEvent, pointerEventPass, (androidx.compose.foundation.gestures.DragDetectionState.AwaitDown) dragDetectionState);
            return;
        }
        if (dragDetectionState instanceof androidx.compose.foundation.gestures.DragDetectionState.AwaitTouchSlop) {
            getHighResolutionOutputSizeshNQ4ISI(pointerEvent, pointerEventPass, (androidx.compose.foundation.gestures.DragDetectionState.AwaitTouchSlop) dragDetectionState);
        } else if (dragDetectionState instanceof androidx.compose.foundation.gestures.DragDetectionState.AwaitGesturePickup) {
            getHighSpeedVideoFpsRangesFor(pointerEvent, pointerEventPass, (androidx.compose.foundation.gestures.DragDetectionState.AwaitGesturePickup) dragDetectionState);
        } else {
            if (!(dragDetectionState instanceof androidx.compose.foundation.gestures.DragDetectionState.Dragging)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            getHighSpeedVideoFpsRangesFor(pointerEvent, pointerEventPass, (androidx.compose.foundation.gestures.DragDetectionState.Dragging) dragDetectionState);
        }
    }

    private final void getInputFormats() {
        getOutputFormats();
        if (this.isListeningForEvents) {
            getOutputMinFrameDurationlomOqCM();
        }
        this.getOutputMinFrameDurationlomOqCM = null;
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.DragGestureNode dragGestureNode, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        dragGestureNode.Camera2StreamConfigurationMap(pointerInputChange, j, j2, false);
    }

    private final void Camera2StreamConfigurationMap(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, long j2, boolean z) {
        androidx.compose.foundation.gestures.DragDetectionState.AwaitTouchSlop highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        highSpeedVideoFpsRangesFor.setInitialDown(pointerInputChange);
        highSpeedVideoFpsRangesFor.m1443setPointerId0FcD4WY(j);
        androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector = this.getOutputStallDurationlomOqCM;
        if (touchSlopDetector == null) {
            this.getOutputStallDurationlomOqCM = new androidx.compose.foundation.gestures.TouchSlopDetector(this.orientationLock, 0L, 2, null);
        } else {
            if (touchSlopDetector != null) {
                touchSlopDetector.setOrientation(this.orientationLock);
            }
            androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2 = this.getOutputStallDurationlomOqCM;
            if (touchSlopDetector2 != null) {
                touchSlopDetector2.m1546resetk4lQ0M(j2);
            }
        }
        highSpeedVideoFpsRangesFor.setVerifyConsumptionInFinalPass(false);
        this.getHighSpeedVideoSizesFor = highSpeedVideoFpsRangesFor;
    }

    private final void getHighSpeedVideoFpsRangesFor(long j) {
        androidx.compose.foundation.gestures.DragDetectionState.Dragging Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        Camera2StreamConfigurationMap.m1445setPointerId0FcD4WY(j);
        this.getHighSpeedVideoSizesFor = Camera2StreamConfigurationMap;
    }

    private final void getOutputFormats() {
        androidx.compose.foundation.gestures.DragDetectionState.AwaitDown highSpeedVideoSizes = getHighSpeedVideoSizes();
        highSpeedVideoSizes.setAwaitTouchSlop(androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized);
        highSpeedVideoSizes.setConsumedOnInitial(false);
        this.getHighSpeedVideoSizesFor = highSpeedVideoSizes;
    }

    private final void Camera2StreamConfigurationMap(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector) {
        androidx.compose.foundation.gestures.DragDetectionState.AwaitGesturePickup highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        highResolutionOutputSizeshNQ4ISI.setInitialDown(pointerInputChange);
        highResolutionOutputSizeshNQ4ISI.m1441setPointerId0FcD4WY(j);
        androidx.compose.foundation.gestures.TouchSlopDetector.m1542resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
        highResolutionOutputSizeshNQ4ISI.setTouchSlopDetector(touchSlopDetector);
        this.getHighSpeedVideoSizesFor = highResolutionOutputSizeshNQ4ISI;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, androidx.compose.foundation.gestures.DragDetectionState.AwaitDown awaitDown) {
        androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop awaitTouchSlop;
        if (!pointerEvent.getChanges().isEmpty() && androidx.compose.foundation.gestures.TapGestureDetectorKt.isChangedToDown$default(pointerEvent, false, false, 2, null)) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) pointerEvent.getChanges());
            if (androidx.compose.foundation.gestures.DragGestureNode.WhenMappings.$EnumSwitchMapping$0[awaitDown.getAwaitTouchSlop().ordinal()] == 1) {
                if (!getGetHighResolutionOutputSizeshNQ4ISI()) {
                    awaitTouchSlop = androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop.Yes;
                } else {
                    awaitTouchSlop = androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop.No;
                }
            } else {
                awaitTouchSlop = awaitDown.getAwaitTouchSlop();
            }
            awaitDown.setAwaitTouchSlop(awaitTouchSlop);
            if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Initial && awaitTouchSlop == androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop.No) {
                pointerInputChange.consume();
                awaitDown.setConsumedOnInitial(true);
            }
            if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Main) {
                if (awaitTouchSlop == androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop.Yes) {
                    getHighSpeedVideoFpsRanges(this, pointerInputChange, pointerInputChange.getId(), 0L, 12);
                } else if (awaitDown.getConsumedOnInitial()) {
                    getHighResolutionOutputSizeshNQ4ISI(pointerInputChange, pointerInputChange, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
                    getHighSpeedVideoSizes(pointerInputChange, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
                    getHighSpeedVideoFpsRangesFor(pointerInputChange.getId());
                }
            }
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, androidx.compose.foundation.gestures.DragDetectionState.AwaitTouchSlop awaitTouchSlop) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        if (pointerEventPass != androidx.compose.ui.input.pointer.PointerEventPass.Initial) {
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            while (true) {
                pointerInputChange = null;
                if (i >= size) {
                    pointerInputChange2 = null;
                    break;
                }
                pointerInputChange2 = changes.get(i);
                if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange2.getId(), awaitTouchSlop.getPointerId())) {
                    break;
                } else {
                    i++;
                }
            }
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange2;
            if (pointerInputChange4 == null) {
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        pointerInputChange3 = null;
                        break;
                    }
                    pointerInputChange3 = changes2.get(i2);
                    if (pointerInputChange3.getPressed()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                pointerInputChange4 = pointerInputChange3;
                if (pointerInputChange4 == null) {
                    getOutputFormats();
                    return;
                }
                awaitTouchSlop.m1443setPointerId0FcD4WY(pointerInputChange4.getId());
            }
            if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Main) {
                if (!pointerInputChange4.isConsumed()) {
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent.getChanges();
                        int size3 = changes3.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size3) {
                                break;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = changes3.get(i3);
                            if (pointerInputChange5.getPressed()) {
                                pointerInputChange = pointerInputChange5;
                                break;
                            }
                            i3++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange6 = pointerInputChange;
                        if (pointerInputChange6 == null) {
                            getOutputFormats();
                        } else {
                            awaitTouchSlop.m1443setPointerId0FcD4WY(pointerInputChange6.getId());
                        }
                    } else {
                        long m1543addPositionsakrDWew = getInputSizeshNQ4ISI().m1543addPositionsakrDWew(pointerInputChange4.getPosition(), pointerInputChange4.getPreviousPosition(), androidx.compose.foundation.gestures.DragGestureDetectorKt.m1469pointerSlopE8SPZFQ((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()), pointerInputChange4.getType()));
                        if ((9223372034707292159L & m1543addPositionsakrDWew) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                            pointerInputChange4.consume();
                            androidx.compose.ui.input.pointer.PointerInputChange initialDown = awaitTouchSlop.getInitialDown();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(initialDown);
                            getHighResolutionOutputSizeshNQ4ISI(initialDown, pointerInputChange4, m1543addPositionsakrDWew);
                            getHighSpeedVideoSizes(pointerInputChange4, m1543addPositionsakrDWew);
                            getHighSpeedVideoFpsRangesFor(pointerInputChange4.getId());
                        } else {
                            awaitTouchSlop.setVerifyConsumptionInFinalPass(true);
                        }
                    }
                } else {
                    androidx.compose.ui.input.pointer.PointerInputChange initialDown2 = awaitTouchSlop.getInitialDown();
                    if (initialDown2 == null) {
                        throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized".toString());
                    }
                    long pointerId = awaitTouchSlop.getPointerId();
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector = this.getOutputStallDurationlomOqCM;
                    if (touchSlopDetector != null) {
                        Camera2StreamConfigurationMap(initialDown2, pointerId, touchSlopDetector);
                    } else {
                        throw new java.lang.IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized".toString());
                    }
                }
            }
            if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Final && awaitTouchSlop.getVerifyConsumptionInFinalPass()) {
                if (pointerInputChange4.isConsumed()) {
                    androidx.compose.ui.input.pointer.PointerInputChange initialDown3 = awaitTouchSlop.getInitialDown();
                    if (initialDown3 == null) {
                        throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized".toString());
                    }
                    long pointerId2 = awaitTouchSlop.getPointerId();
                    androidx.compose.foundation.gestures.TouchSlopDetector touchSlopDetector2 = this.getOutputStallDurationlomOqCM;
                    if (touchSlopDetector2 != null) {
                        Camera2StreamConfigurationMap(initialDown3, pointerId2, touchSlopDetector2);
                        return;
                    }
                    throw new java.lang.IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized".toString());
                }
                awaitTouchSlop.setVerifyConsumptionInFinalPass(false);
            }
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, androidx.compose.foundation.gestures.DragDetectionState.AwaitGesturePickup awaitGesturePickup) {
        boolean z;
        if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Final) {
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = true;
                    break;
                } else {
                    if (changes.get(i2).isConsumed()) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
            int size2 = changes2.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                if (!changes2.get(i).getPressed()) {
                    i++;
                } else if (!pointerEvent.getChanges().isEmpty()) {
                    if (z) {
                        long position = ((androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) pointerEvent.getChanges())).getPosition();
                        androidx.compose.ui.input.pointer.PointerInputChange initialDown = awaitGesturePickup.getInitialDown();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(initialDown);
                        long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(position, initialDown.getPosition());
                        androidx.compose.ui.input.pointer.PointerInputChange initialDown2 = awaitGesturePickup.getInitialDown();
                        if (initialDown2 != null) {
                            getHighSpeedVideoFpsRanges(this, initialDown2, awaitGesturePickup.getPointerId(), m5756minusMKHz9U, 8);
                            return;
                        }
                        throw new java.lang.IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.".toString());
                    }
                    return;
                }
            }
            getOutputFormats();
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, androidx.compose.foundation.gestures.DragDetectionState.Dragging dragging) {
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        if (pointerEventPass == androidx.compose.ui.input.pointer.PointerEventPass.Main) {
            long pointerId = dragging.getPointerId();
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                pointerInputChange = null;
                if (i2 >= size) {
                    pointerInputChange2 = null;
                    break;
                }
                pointerInputChange2 = changes.get(i2);
                if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange2.getId(), pointerId)) {
                    break;
                } else {
                    i2++;
                }
            }
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerInputChange2;
            if (pointerInputChange3 == null) {
                return;
            }
            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = changes2.get(i);
                    if (pointerInputChange4.getPressed()) {
                        pointerInputChange = pointerInputChange4;
                        break;
                    }
                    i++;
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange;
                if (pointerInputChange5 == null) {
                    if (!pointerInputChange3.isConsumed() && androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        getHighResolutionOutputSizeshNQ4ISI(pointerInputChange3);
                    } else {
                        getOutputMinFrameDurationlomOqCM();
                    }
                    getOutputFormats();
                    return;
                }
                dragging.m1445setPointerId0FcD4WY(pointerInputChange5.getId());
                return;
            }
            if (pointerInputChange3.isConsumed()) {
                getOutputMinFrameDurationlomOqCM();
            } else {
                if (androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3)) == 0.0f) {
                    return;
                }
                getHighSpeedVideoSizes(pointerInputChange3, androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange3));
                pointerInputChange3.consume();
            }
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2, long j) {
        if (this.getOutputMinFrameDurationlomOqCM == null) {
            this.getOutputMinFrameDurationlomOqCM = new androidx.compose.ui.input.pointer.util.VelocityTracker();
        }
        androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(getOutputMinFrameDuration(), pointerInputChange);
        long m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(pointerInputChange2.getPosition(), j);
        this.getOutputFormats = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        if (this.canDrag.invoke(androidx.compose.ui.input.pointer.PointerType.m7297boximpl(pointerInputChange.getType())).booleanValue()) {
            if (!this.isListeningForEvents) {
                if (this.getInputSizeshNQ4ISI == null) {
                    this.getInputSizeshNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                }
                getOutputSizeshNQ4ISI();
            }
            this.getOutputSizeshNQ4ISI = androidx.compose.ui.layout.LayoutCoordinatesKt.positionOnScreen(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(this));
            getHighSpeedVideoSizesFor().mo9266trySendJP2dKIU(new androidx.compose.foundation.gestures.DragEvent.DragStarted(m5756minusMKHz9U, null));
        }
    }

    private final void getHighSpeedVideoSizes(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j) {
        long positionOnScreen = androidx.compose.ui.layout.LayoutCoordinatesKt.positionOnScreen(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(getNode()));
        if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(this.getOutputSizeshNQ4ISI, androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0()) && !androidx.compose.ui.geometry.Offset.m5749equalsimpl0(positionOnScreen, this.getOutputSizeshNQ4ISI)) {
            this.getOutputFormats = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(this.getOutputFormats, androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(positionOnScreen, this.getOutputSizeshNQ4ISI));
        }
        this.getOutputSizeshNQ4ISI = positionOnScreen;
        androidx.compose.ui.input.pointer.util.VelocityTrackerKt.m7333addPointerInputChange0AR0LA0(getOutputMinFrameDuration(), pointerInputChange, this.getOutputFormats);
        getHighSpeedVideoSizesFor().mo9266trySendJP2dKIU(new androidx.compose.foundation.gestures.DragEvent.DragDelta(j, false, null));
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(getOutputMinFrameDuration(), pointerInputChange);
        float maximumFlingVelocity = ((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
        long m7332calculateVelocityAH228Gc = getOutputMinFrameDuration().m7332calculateVelocityAH228Gc(androidx.compose.ui.unit.VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
        getOutputMinFrameDuration().resetTracking();
        getHighSpeedVideoSizesFor().mo9266trySendJP2dKIU(new androidx.compose.foundation.gestures.DragEvent.DragStopped(androidx.compose.foundation.gestures.DraggableKt.m1474toValidVelocityTH1AsA0(m7332calculateVelocityAH228Gc), false, null));
        this.isListeningForPointerInputEvents = false;
    }

    private final void getOutputMinFrameDurationlomOqCM() {
        getHighSpeedVideoSizesFor().mo9266trySendJP2dKIU(androidx.compose.foundation.gestures.DragEvent.DragCancelled.INSTANCE);
    }

    public final void onDragEvent(androidx.compose.foundation.gestures.DragEvent event) {
        if ((event instanceof androidx.compose.foundation.gestures.DragEvent.DragStarted) && !this.isListeningForEvents) {
            this.isListeningForEvents = true;
            getOutputSizeshNQ4ISI();
        }
        getHighSpeedVideoSizesFor().mo9266trySendJP2dKIU(event);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop.values().length];
            try {
                iArr[androidx.compose.foundation.gestures.DragDetectionState.AwaitDown.AwaitTouchSlop.NotInitialized.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

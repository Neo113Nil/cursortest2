package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0017\u0010\u0010\u001a\u0013\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\u0017\u0010\u0012\u001a\u0013\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u001a\u001a\u00020\u000f23\u0010\u0019\u001a/\b\u0001\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u0012\u0010!J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\"J}\u0010#\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0017\u0010\u0010\u001a\u0013\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u000f0\u00042\u0017\u0010\u0012\u001a\u0013\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b#\u0010\u0014R\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R'\u0010+\u001a\u0013\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u000f0\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R'\u0010&\u001a\u0013\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000e\u0012\u0004\u0012\u00020\u000f0\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/foundation/gestures/Draggable2DState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerType;", "", "canDrag", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "reverseDirection", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "", "onDragStarted", "Landroidx/compose/ui/unit/Velocity;", "onDragStopped", "<init>", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "drag", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startedPosition", "onDragStarted-k-4lQ0M", "(J)V", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "event", "(Landroidx/compose/foundation/gestures/DragEvent$DragStopped;)V", "()Z", "update", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/gestures/Draggable2DState;", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Draggable2DNode extends androidx.compose.foundation.gestures.DragGestureNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Velocity, kotlin.Unit> getHighSpeedVideoSizes;
    private androidx.compose.foundation.gestures.Draggable2DState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    public Draggable2DNode(androidx.compose.foundation.gestures.Draggable2DState draggable2DState, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> function1, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Velocity, kotlin.Unit> function13) {
        super(function1, z, mutableInteractionSource, null);
        this.getHighResolutionOutputSizeshNQ4ISI = draggable2DState;
        this.getHighSpeedVideoFpsRangesFor = z2;
        this.getHighSpeedVideoFpsRanges = z3;
        this.Camera2StreamConfigurationMap = function12;
        this.getHighSpeedVideoSizes = function13;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final java.lang.Object drag(kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object drag = this.getHighResolutionOutputSizeshNQ4ISI.drag(androidx.compose.foundation.MutatePriority.UserInput, new androidx.compose.foundation.gestures.Draggable2DNode$drag$2(function2, this, null), continuation);
        return drag == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public final void mo1426onDragStartedk4lQ0M(long startedPosition) {
        this.Camera2StreamConfigurationMap.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(startedPosition));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStopped(androidx.compose.foundation.gestures.DragEvent.DragStopped event) {
        this.getHighSpeedVideoSizes.invoke(androidx.compose.ui.unit.Velocity.m8830boximpl(event.getVelocity()));
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: startDragImmediately, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void update(androidx.compose.foundation.gestures.Draggable2DState state, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> canDrag, boolean enabled, androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, boolean startDragImmediately, boolean reverseDirection, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> onDragStarted, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Velocity, kotlin.Unit> onDragStopped) {
        boolean z;
        boolean z2;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, state)) {
            z = false;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = state;
            z = true;
        }
        if (this.getHighSpeedVideoFpsRanges != reverseDirection) {
            this.getHighSpeedVideoFpsRanges = reverseDirection;
            z2 = true;
        } else {
            z2 = z;
        }
        this.Camera2StreamConfigurationMap = onDragStarted;
        this.getHighSpeedVideoSizes = onDragStopped;
        this.getHighSpeedVideoFpsRangesFor = startDragImmediately;
        update(canDrag, enabled, interactionSource, null, z2);
    }
}

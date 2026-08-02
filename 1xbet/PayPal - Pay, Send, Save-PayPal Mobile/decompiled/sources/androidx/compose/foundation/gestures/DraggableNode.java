package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u00122\u0010\u0016\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e¢\u0006\u0002\b\u0015\u00122\u0010\u0018\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e¢\u0006\u0002\b\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJE\u0010\u001f\u001a\u00020\u001323\u0010\u001e\u001a/\b\u0001\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\u001d¢\u0006\u0002\b\u0011\u0012\u0004\u0012\u00020\u00130\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001cH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b\u0018\u0010&J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010'J»\u0001\u0010(\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000622\u0010\u0016\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e¢\u0006\u0002\b\u001522\u0010\u0018\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e¢\u0006\u0002\b\u00152\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b(\u0010\u001bJ\u0013\u0010*\u001a\u00020)*\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010+R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010,\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103RB\u0010*\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e¢\u0006\u0002\b\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00104RB\u00102\u001a.\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e¢\u0006\u0002\b\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u00104R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00103"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/foundation/gestures/DraggableState;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerType;", "", "canDrag", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Landroidx/compose/foundation/gestures/DraggableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "forEachDelta", "drag", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startedPosition", "onDragStarted-k-4lQ0M", "(J)V", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "event", "(Landroidx/compose/foundation/gestures/DragEvent$DragStopped;)V", "()Z", "update", "Landroidx/compose/ui/unit/Velocity;", "getHighSpeedVideoFpsRangesFor", "(J)J", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Landroidx/compose/foundation/gestures/DraggableState;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/gestures/Orientation;", "getHighSpeedVideoFpsRanges", "Z", "Lkotlin/jvm/functions/Function3;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DraggableNode extends androidx.compose.foundation.gestures.DragGestureNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.Orientation getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.foundation.gestures.DraggableState Camera2StreamConfigurationMap;

    public DraggableNode(androidx.compose.foundation.gestures.DraggableState draggableState, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> function1, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, boolean z2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function32, boolean z3) {
        super(function1, z, mutableInteractionSource, orientation);
        this.Camera2StreamConfigurationMap = draggableState;
        this.getHighSpeedVideoSizes = orientation;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getHighSpeedVideoFpsRangesFor = function3;
        this.getHighSpeedVideoFpsRanges = function32;
        this.getInputSizeshNQ4ISI = z3;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final java.lang.Object drag(kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super androidx.compose.foundation.gestures.DragEvent.DragDelta, kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object drag = this.Camera2StreamConfigurationMap.drag(androidx.compose.foundation.MutatePriority.UserInput, new androidx.compose.foundation.gestures.DraggableNode$drag$2(function2, this, null), continuation);
        return drag == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: onDragStarted-k-4lQ0M */
    public final void mo1426onDragStartedk4lQ0M(long startedPosition) {
        kotlin.jvm.functions.Function3 function3;
        if (getIsAttached()) {
            kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function32 = this.getHighSpeedVideoFpsRangesFor;
            function3 = androidx.compose.foundation.gestures.DraggableKt.Camera2StreamConfigurationMap;
            if (kotlin.jvm.internal.Intrinsics.areEqual(function32, function3)) {
                return;
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1(this, startedPosition, null), 1, null);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void onDragStopped(androidx.compose.foundation.gestures.DragEvent.DragStopped event) {
        kotlin.jvm.functions.Function3 function3;
        if (getIsAttached()) {
            kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function32 = this.getHighSpeedVideoFpsRanges;
            function3 = androidx.compose.foundation.gestures.DraggableKt.getHighSpeedVideoFpsRangesFor;
            if (kotlin.jvm.internal.Intrinsics.areEqual(function32, function3)) {
                return;
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1(this, event, null), 1, null);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* renamed from: startDragImmediately, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void update(androidx.compose.foundation.gestures.DraggableState state, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerType, java.lang.Boolean> canDrag, androidx.compose.foundation.gestures.Orientation orientation, boolean enabled, androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, boolean startDragImmediately, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onDragStarted, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onDragStopped, boolean reverseDirection) {
        boolean z;
        boolean z2;
        kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, state)) {
            z = false;
        } else {
            this.Camera2StreamConfigurationMap = state;
            z = true;
        }
        if (this.getHighSpeedVideoSizes != orientation) {
            this.getHighSpeedVideoSizes = orientation;
            z = true;
        }
        if (this.getInputSizeshNQ4ISI != reverseDirection) {
            this.getInputSizeshNQ4ISI = reverseDirection;
            function3 = onDragStarted;
            z2 = true;
        } else {
            z2 = z;
            function3 = onDragStarted;
        }
        this.getHighSpeedVideoFpsRangesFor = function3;
        this.getHighSpeedVideoFpsRanges = onDragStopped;
        this.getHighResolutionOutputSizeshNQ4ISI = startDragImmediately;
        update(canDrag, enabled, interactionSource, orientation, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighSpeedVideoFpsRangesFor(long j) {
        return androidx.compose.ui.unit.Velocity.m8845timesadjELrA(j, this.getInputSizeshNQ4ISI ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHighSpeedVideoSizes(long j) {
        return androidx.compose.ui.geometry.Offset.m5759timestuRUvjQ(j, this.getInputSizeshNQ4ISI ? -1.0f : 1.0f);
    }
}

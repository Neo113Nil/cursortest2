package androidx.compose.foundation.gestures;

/* compiled from: Scrollable.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ \u0010-\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aRF\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0\u001c¢\u0006\u0002\b%X\u0082\u0004¢\u0006\u0004\n\u0002\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070,X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableGesturesNode;", "Landroidx/compose/ui/node/DelegatingNode;", "scrollLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "nestedScrollDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "draggableGesturesNode", "Landroidx/compose/foundation/gestures/DraggableNode;", "getDraggableGesturesNode", "()Landroidx/compose/foundation/gestures/DraggableNode;", "draggableState", "Landroidx/compose/foundation/gestures/ScrollDraggableState;", "getDraggableState", "()Landroidx/compose/foundation/gestures/ScrollDraggableState;", "getEnabled", "()Z", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getNestedScrollDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "onDragStopped", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/unit/Velocity;", "Lkotlin/ParameterName;", "name", "velocity", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function3;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getScrollLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "startDragImmediately", "Lkotlin/Function0;", "update", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableGesturesNode extends androidx.compose.ui.node.DelegatingNode {
    private final androidx.compose.foundation.gestures.DraggableNode draggableGesturesNode;
    private final androidx.compose.foundation.gestures.ScrollDraggableState draggableState;
    private final boolean enabled;
    private final androidx.compose.foundation.interaction.MutableInteractionSource interactionSource;
    private final androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher;
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onDragStopped;
    private final androidx.compose.foundation.gestures.Orientation orientation;
    private final androidx.compose.foundation.gestures.ScrollingLogic scrollLogic;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> startDragImmediately;

    public final androidx.compose.foundation.gestures.ScrollingLogic getScrollLogic() {
        return this.scrollLogic;
    }

    public final androidx.compose.foundation.gestures.Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    public final androidx.compose.foundation.interaction.MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public ScrollableGesturesNode(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.functions.Function3 function3;
        this.scrollLogic = scrollingLogic;
        this.orientation = orientation;
        this.enabled = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.interactionSource = mutableInteractionSource;
        delegate(new androidx.compose.foundation.gestures.MouseWheelScrollNode(scrollingLogic));
        androidx.compose.foundation.gestures.ScrollDraggableState scrollDraggableState = new androidx.compose.foundation.gestures.ScrollDraggableState(scrollingLogic);
        this.draggableState = scrollDraggableState;
        kotlin.jvm.functions.Function0<java.lang.Boolean> function0 = new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableGesturesNode$startDragImmediately$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.gestures.ScrollableGesturesNode.this.getScrollLogic().shouldScrollImmediately());
            }
        };
        this.startDragImmediately = function0;
        androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1 scrollableGesturesNode$onDragStopped$1 = new androidx.compose.foundation.gestures.ScrollableGesturesNode$onDragStopped$1(this, null);
        this.onDragStopped = scrollableGesturesNode$onDragStopped$1;
        function1 = androidx.compose.foundation.gestures.ScrollableKt.CanDragCalculation;
        function3 = androidx.compose.foundation.gestures.ScrollableKt.NoOpOnDragStarted;
        this.draggableGesturesNode = (androidx.compose.foundation.gestures.DraggableNode) delegate(new androidx.compose.foundation.gestures.DraggableNode(scrollDraggableState, function1, orientation, z, mutableInteractionSource, function0, function3, scrollableGesturesNode$onDragStopped$1, false));
    }

    public final androidx.compose.foundation.gestures.ScrollDraggableState getDraggableState() {
        return this.draggableState;
    }

    public final androidx.compose.foundation.gestures.DraggableNode getDraggableGesturesNode() {
        return this.draggableGesturesNode;
    }

    public final void update(androidx.compose.foundation.gestures.Orientation orientation, boolean enabled, androidx.compose.foundation.interaction.MutableInteractionSource interactionSource) {
        kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function1;
        androidx.compose.foundation.gestures.DraggableNode draggableNode = this.draggableGesturesNode;
        androidx.compose.foundation.gestures.ScrollDraggableState scrollDraggableState = this.draggableState;
        kotlin.jvm.functions.Function0<java.lang.Boolean> function0 = this.startDragImmediately;
        function3 = androidx.compose.foundation.gestures.ScrollableKt.NoOpOnDragStarted;
        kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function32 = this.onDragStopped;
        function1 = androidx.compose.foundation.gestures.ScrollableKt.CanDragCalculation;
        draggableNode.update(scrollDraggableState, function1, orientation, enabled, interactionSource, function0, function3, function32, false);
    }
}

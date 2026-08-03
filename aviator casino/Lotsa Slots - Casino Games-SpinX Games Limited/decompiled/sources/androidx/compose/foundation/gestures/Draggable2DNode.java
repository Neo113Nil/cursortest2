package androidx.compose.foundation.gestures;

/* compiled from: Draggable2D.kt */
@kotlin.Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u001e\b\u0000\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012<\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012<\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0002\u0010\u001cJ7\u0010*\u001a\u00020\u00152'\u0010+\u001a#\b\u0001\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160,¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0002\u0010.JË\u0001\u0010/\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2<\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00172<\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u00172\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0002\u0010\u001cJ\u001a\u00100\u001a\u00020\u0015*\u00020-2\u0006\u00101\u001a\u000202H\u0096@¢\u0006\u0002\u00103R\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DNode;", "Landroidx/compose/foundation/gestures/AbstractDraggableNode;", "state", "Landroidx/compose/foundation/gestures/Draggable2DState;", "canDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "Lkotlin/Function0;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "Landroidx/compose/ui/unit/Velocity;", "velocity", "reverseDirection", "(Landroidx/compose/foundation/gestures/Draggable2DState;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "abstractDragScope", "androidx/compose/foundation/gestures/Draggable2DNode$abstractDragScope$1", "Landroidx/compose/foundation/gestures/Draggable2DNode$abstractDragScope$1;", "drag2DScope", "Landroidx/compose/foundation/gestures/Drag2DScope;", "getDrag2DScope", "()Landroidx/compose/foundation/gestures/Drag2DScope;", "setDrag2DScope", "(Landroidx/compose/foundation/gestures/Drag2DScope;)V", "pointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "drag", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/AbstractDragScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "draggingBy", "dragDelta", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "(Landroidx/compose/foundation/gestures/AbstractDragScope;Landroidx/compose/foundation/gestures/DragEvent$DragDelta;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Draggable2DNode extends androidx.compose.foundation.gestures.AbstractDraggableNode {
    public static final int $stable = 8;
    private final androidx.compose.foundation.gestures.Draggable2DNode$abstractDragScope$1 abstractDragScope;
    private androidx.compose.foundation.gestures.Drag2DScope drag2DScope;
    private final androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig;
    private androidx.compose.foundation.gestures.Draggable2DState state;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.gestures.Draggable2DNode$abstractDragScope$1] */
    public Draggable2DNode(androidx.compose.foundation.gestures.Draggable2DState draggable2DState, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function1, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function32, boolean z2) {
        super(function1, z, mutableInteractionSource, function0, function3, function32, z2);
        androidx.compose.foundation.gestures.Drag2DScope drag2DScope;
        this.state = draggable2DState;
        drag2DScope = androidx.compose.foundation.gestures.Draggable2DKt.NoOpDrag2DScope;
        this.drag2DScope = drag2DScope;
        this.abstractDragScope = new androidx.compose.foundation.gestures.AbstractDragScope() { // from class: androidx.compose.foundation.gestures.Draggable2DNode$abstractDragScope$1
            @Override // androidx.compose.foundation.gestures.AbstractDragScope
            /* renamed from: dragBy-k-4lQ0M */
            public void mo320dragByk4lQ0M(long pixels) {
                androidx.compose.foundation.gestures.Draggable2DNode.this.getDrag2DScope().mo330dragByk4lQ0M(pixels);
            }
        };
        this.pointerDirectionConfig = androidx.compose.foundation.gestures.DragGestureDetectorKt.getBidirectionalPointerDirectionConfig();
    }

    public final androidx.compose.foundation.gestures.Drag2DScope getDrag2DScope() {
        return this.drag2DScope;
    }

    public final void setDrag2DScope(androidx.compose.foundation.gestures.Drag2DScope drag2DScope) {
        this.drag2DScope = drag2DScope;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    public java.lang.Object drag(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.AbstractDragScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object drag = this.state.drag(androidx.compose.foundation.MutatePriority.UserInput, new androidx.compose.foundation.gestures.Draggable2DNode$drag$2(this, function2, null), continuation);
        return drag == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    public java.lang.Object draggingBy(androidx.compose.foundation.gestures.AbstractDragScope abstractDragScope, androidx.compose.foundation.gestures.DragEvent.DragDelta dragDelta, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        abstractDragScope.mo320dragByk4lQ0M(dragDelta.getDelta());
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.AbstractDraggableNode
    public androidx.compose.foundation.gestures.PointerDirectionConfig getPointerDirectionConfig() {
        return this.pointerDirectionConfig;
    }

    public final void update(androidx.compose.foundation.gestures.Draggable2DState state, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> canDrag, boolean enabled, androidx.compose.foundation.interaction.MutableInteractionSource interactionSource, kotlin.jvm.functions.Function0<java.lang.Boolean> startDragImmediately, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onDragStarted, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onDragStopped, boolean reverseDirection) {
        boolean z;
        boolean z2 = true;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.state, state)) {
            z = false;
        } else {
            this.state = state;
            z = true;
        }
        setCanDrag(canDrag);
        if (getEnabled() != enabled) {
            setEnabled(enabled);
            if (!enabled) {
                disposeInteractionSource();
            }
        } else {
            z2 = z;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getInteractionSource(), interactionSource)) {
            disposeInteractionSource();
            setInteractionSource(interactionSource);
        }
        setStartDragImmediately(startDragImmediately);
        setOnDragStarted(onDragStarted);
        setOnDragStopped(onDragStopped);
        if (getReverseDirection() != reverseDirection) {
            setReverseDirection(reverseDirection);
        } else if (!z2) {
            return;
        }
        getPointerInputNode().resetPointerInputHandler();
    }
}

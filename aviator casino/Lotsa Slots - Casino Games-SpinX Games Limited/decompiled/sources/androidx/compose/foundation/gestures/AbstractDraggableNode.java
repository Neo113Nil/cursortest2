package androidx.compose.foundation.gestures;

/* compiled from: Draggable.kt */
@kotlin.Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B½\u0001\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012<\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012<\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0002\u0010\u001cJ\u0006\u0010H\u001a\u00020\u0015J7\u0010I\u001a\u00020\u00152'\u0010J\u001a#\b\u0001\u0012\u0004\u0012\u00020L\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160K¢\u0006\u0002\b\u0017H¦@¢\u0006\u0002\u0010MJ\b\u0010N\u001a\u00020\u0015H\u0016J\b\u0010O\u001a\u00020\u0015H\u0016J*\u0010P\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0016ø\u0001\u0000¢\u0006\u0004\bW\u0010XJ\b\u0010Y\u001a\u00020\u0015H\u0002J\u001a\u0010Z\u001a\u00020\u0015*\u00020L2\u0006\u0010[\u001a\u00020\\H¦@¢\u0006\u0002\u0010]J\u0012\u0010^\u001a\u00020\u0015*\u00020\u000fH\u0082@¢\u0006\u0002\u0010_J\u001a\u0010`\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010a\u001a\u00020bH\u0082@¢\u0006\u0002\u0010cJ\u001a\u0010d\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010a\u001a\u00020eH\u0082@¢\u0006\u0002\u0010fR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000RR\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104RR\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u0012\u00108\u001a\u000209X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"Landroidx/compose/foundation/gestures/AbstractDraggableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "canDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "Lkotlin/Function0;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "Landroidx/compose/ui/unit/Velocity;", "velocity", "reverseDirection", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "_canDrag", "_startDragImmediately", "getCanDrag", "()Lkotlin/jvm/functions/Function1;", "setCanDrag", "(Lkotlin/jvm/functions/Function1;)V", "channel", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/DragEvent;", "dragInteraction", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "getEnabled", "()Z", "setEnabled", "(Z)V", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "isListeningForEvents", "getOnDragStarted", "()Lkotlin/jvm/functions/Function3;", "setOnDragStarted", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "getOnDragStopped", "setOnDragStopped", "pointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getPointerInputNode", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getReverseDirection", "setReverseDirection", "getStartDragImmediately", "()Lkotlin/jvm/functions/Function0;", "setStartDragImmediately", "(Lkotlin/jvm/functions/Function0;)V", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "disposeInteractionSource", "drag", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/AbstractDragScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCancelPointerInput", "onDetach", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "startListeningForEvents", "draggingBy", "dragDelta", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "(Landroidx/compose/foundation/gestures/AbstractDragScope;Landroidx/compose/foundation/gestures/DragEvent$DragDelta;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragCancel", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStart", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStop", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AbstractDraggableNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.PointerInputModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> canDrag;
    private androidx.compose.foundation.interaction.DragInteraction.Start dragInteraction;
    private boolean enabled;
    private androidx.compose.foundation.interaction.MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;
    private kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onDragStarted;
    private kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onDragStopped;
    private boolean reverseDirection;
    private kotlin.jvm.functions.Function0<java.lang.Boolean> startDragImmediately;
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> _canDrag = new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$_canDrag$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Boolean invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
            return androidx.compose.foundation.gestures.AbstractDraggableNode.this.getCanDrag().invoke(pointerInputChange);
        }
    };
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> _startDragImmediately = new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$_startDragImmediately$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Boolean invoke() {
            return androidx.compose.foundation.gestures.AbstractDraggableNode.this.getStartDragImmediately().invoke();
        }
    };
    private final androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker = new androidx.compose.ui.input.pointer.util.VelocityTracker();
    private final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode pointerInputNode = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) delegate(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1(this, null)));
    private final kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.DragEvent> channel = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    public abstract java.lang.Object drag(kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.AbstractDragScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract java.lang.Object draggingBy(androidx.compose.foundation.gestures.AbstractDragScope abstractDragScope, androidx.compose.foundation.gestures.DragEvent.DragDelta dragDelta, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    public abstract androidx.compose.foundation.gestures.PointerDirectionConfig getPointerDirectionConfig();

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return androidx.compose.ui.node.PointerInputModifierNode.CC.$default$interceptOutOfBoundsChildEvents(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return androidx.compose.ui.node.PointerInputModifierNode.CC.$default$sharePointerInputWithSiblings(this);
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> getCanDrag() {
        return this.canDrag;
    }

    public final void setCanDrag(kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function1) {
        this.canDrag = function1;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final androidx.compose.foundation.interaction.MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void setInteractionSource(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void setStartDragImmediately(kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        this.startDragImmediately = function0;
    }

    public final kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getOnDragStarted() {
        return this.onDragStarted;
    }

    public final void setOnDragStarted(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        this.onDragStarted = function3;
    }

    public final kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getOnDragStopped() {
        return this.onDragStopped;
    }

    public final void setOnDragStopped(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        this.onDragStopped = function3;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    public final void setReverseDirection(boolean z) {
        this.reverseDirection = z;
    }

    public AbstractDraggableNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function1, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function32, boolean z2) {
        this.canDrag = function1;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = function0;
        this.onDragStarted = function3;
        this.onDragStopped = function32;
        this.reverseDirection = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1(this, null), 3, null);
    }

    public final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode getPointerInputNode() {
        return this.pointerInputNode;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo181onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        this.pointerInputNode.mo181onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object processDragStart(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.gestures.DragEvent.DragStarted dragStarted, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1 abstractDraggableNode$processDragStart$1;
        java.lang.Object coroutine_suspended;
        int i;
        androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource;
        androidx.compose.foundation.interaction.DragInteraction.Start start;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode2;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        androidx.compose.foundation.interaction.DragInteraction.Start start2;
        kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3;
        androidx.compose.ui.geometry.Offset m1860boximpl;
        if (continuation instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1) {
            abstractDraggableNode$processDragStart$1 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1) continuation;
            if ((abstractDraggableNode$processDragStart$1.label & Integer.MIN_VALUE) != 0) {
                abstractDraggableNode$processDragStart$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = abstractDraggableNode$processDragStart$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = abstractDraggableNode$processDragStart$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.interaction.DragInteraction.Start start3 = this.dragInteraction;
                    if (start3 != null && (mutableInteractionSource = this.interactionSource) != null) {
                        androidx.compose.foundation.interaction.DragInteraction.Cancel cancel = new androidx.compose.foundation.interaction.DragInteraction.Cancel(start3);
                        abstractDraggableNode$processDragStart$1.L$0 = this;
                        abstractDraggableNode$processDragStart$1.L$1 = coroutineScope;
                        abstractDraggableNode$processDragStart$1.L$2 = dragStarted;
                        abstractDraggableNode$processDragStart$1.label = 1;
                        if (mutableInteractionSource.emit(cancel, abstractDraggableNode$processDragStart$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    abstractDraggableNode = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        start2 = (androidx.compose.foundation.interaction.DragInteraction.Start) abstractDraggableNode$processDragStart$1.L$3;
                        dragStarted = (androidx.compose.foundation.gestures.DragEvent.DragStarted) abstractDraggableNode$processDragStart$1.L$2;
                        coroutineScope2 = (kotlinx.coroutines.CoroutineScope) abstractDraggableNode$processDragStart$1.L$1;
                        abstractDraggableNode2 = (androidx.compose.foundation.gestures.AbstractDraggableNode) abstractDraggableNode$processDragStart$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        start = start2;
                        coroutineScope = coroutineScope2;
                        abstractDraggableNode = abstractDraggableNode2;
                        abstractDraggableNode.dragInteraction = start;
                        function3 = abstractDraggableNode.onDragStarted;
                        m1860boximpl = androidx.compose.ui.geometry.Offset.m1860boximpl(dragStarted.getStartPoint());
                        abstractDraggableNode$processDragStart$1.L$0 = null;
                        abstractDraggableNode$processDragStart$1.L$1 = null;
                        abstractDraggableNode$processDragStart$1.L$2 = null;
                        abstractDraggableNode$processDragStart$1.L$3 = null;
                        abstractDraggableNode$processDragStart$1.label = 3;
                        if (function3.invoke(coroutineScope, m1860boximpl, abstractDraggableNode$processDragStart$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    androidx.compose.foundation.gestures.DragEvent.DragStarted dragStarted2 = (androidx.compose.foundation.gestures.DragEvent.DragStarted) abstractDraggableNode$processDragStart$1.L$2;
                    kotlinx.coroutines.CoroutineScope coroutineScope3 = (kotlinx.coroutines.CoroutineScope) abstractDraggableNode$processDragStart$1.L$1;
                    abstractDraggableNode = (androidx.compose.foundation.gestures.AbstractDraggableNode) abstractDraggableNode$processDragStart$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    dragStarted = dragStarted2;
                    coroutineScope = coroutineScope3;
                }
                start = new androidx.compose.foundation.interaction.DragInteraction.Start();
                mutableInteractionSource2 = abstractDraggableNode.interactionSource;
                if (mutableInteractionSource2 != null) {
                    abstractDraggableNode$processDragStart$1.L$0 = abstractDraggableNode;
                    abstractDraggableNode$processDragStart$1.L$1 = coroutineScope;
                    abstractDraggableNode$processDragStart$1.L$2 = dragStarted;
                    abstractDraggableNode$processDragStart$1.L$3 = start;
                    abstractDraggableNode$processDragStart$1.label = 2;
                    if (mutableInteractionSource2.emit(start, abstractDraggableNode$processDragStart$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    abstractDraggableNode2 = abstractDraggableNode;
                    coroutineScope2 = coroutineScope;
                    start2 = start;
                    start = start2;
                    coroutineScope = coroutineScope2;
                    abstractDraggableNode = abstractDraggableNode2;
                }
                abstractDraggableNode.dragInteraction = start;
                function3 = abstractDraggableNode.onDragStarted;
                m1860boximpl = androidx.compose.ui.geometry.Offset.m1860boximpl(dragStarted.getStartPoint());
                abstractDraggableNode$processDragStart$1.L$0 = null;
                abstractDraggableNode$processDragStart$1.L$1 = null;
                abstractDraggableNode$processDragStart$1.L$2 = null;
                abstractDraggableNode$processDragStart$1.L$3 = null;
                abstractDraggableNode$processDragStart$1.label = 3;
                if (function3.invoke(coroutineScope, m1860boximpl, abstractDraggableNode$processDragStart$1) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        abstractDraggableNode$processDragStart$1 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStart$1(this, continuation);
        java.lang.Object obj2 = abstractDraggableNode$processDragStart$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = abstractDraggableNode$processDragStart$1.label;
        if (i != 0) {
        }
        start = new androidx.compose.foundation.interaction.DragInteraction.Start();
        mutableInteractionSource2 = abstractDraggableNode.interactionSource;
        if (mutableInteractionSource2 != null) {
        }
        abstractDraggableNode.dragInteraction = start;
        function3 = abstractDraggableNode.onDragStarted;
        m1860boximpl = androidx.compose.ui.geometry.Offset.m1860boximpl(dragStarted.getStartPoint());
        abstractDraggableNode$processDragStart$1.L$0 = null;
        abstractDraggableNode$processDragStart$1.L$1 = null;
        abstractDraggableNode$processDragStart$1.L$2 = null;
        abstractDraggableNode$processDragStart$1.L$3 = null;
        abstractDraggableNode$processDragStart$1.label = 3;
        if (function3.invoke(coroutineScope, m1860boximpl, abstractDraggableNode$processDragStart$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object processDragStop(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.gestures.DragEvent.DragStopped dragStopped, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1 abstractDraggableNode$processDragStop$1;
        java.lang.Object coroutine_suspended;
        int i;
        androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode;
        kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3;
        androidx.compose.ui.unit.Velocity m4708boximpl;
        if (continuation instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1) {
            abstractDraggableNode$processDragStop$1 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1) continuation;
            if ((abstractDraggableNode$processDragStop$1.label & Integer.MIN_VALUE) != 0) {
                abstractDraggableNode$processDragStop$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = abstractDraggableNode$processDragStop$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = abstractDraggableNode$processDragStop$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.interaction.DragInteraction.Start start = this.dragInteraction;
                    if (start != null) {
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            androidx.compose.foundation.interaction.DragInteraction.Stop stop = new androidx.compose.foundation.interaction.DragInteraction.Stop(start);
                            abstractDraggableNode$processDragStop$1.L$0 = this;
                            abstractDraggableNode$processDragStop$1.L$1 = coroutineScope;
                            abstractDraggableNode$processDragStop$1.L$2 = dragStopped;
                            abstractDraggableNode$processDragStop$1.label = 1;
                            if (mutableInteractionSource.emit(stop, abstractDraggableNode$processDragStop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        abstractDraggableNode = this;
                    } else {
                        abstractDraggableNode = this;
                        function3 = abstractDraggableNode.onDragStopped;
                        m4708boximpl = androidx.compose.ui.unit.Velocity.m4708boximpl(dragStopped.getVelocity());
                        abstractDraggableNode$processDragStop$1.L$0 = null;
                        abstractDraggableNode$processDragStop$1.L$1 = null;
                        abstractDraggableNode$processDragStop$1.L$2 = null;
                        abstractDraggableNode$processDragStop$1.label = 2;
                        if (function3.invoke(coroutineScope, m4708boximpl, abstractDraggableNode$processDragStop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    androidx.compose.foundation.gestures.DragEvent.DragStopped dragStopped2 = (androidx.compose.foundation.gestures.DragEvent.DragStopped) abstractDraggableNode$processDragStop$1.L$2;
                    kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) abstractDraggableNode$processDragStop$1.L$1;
                    abstractDraggableNode = (androidx.compose.foundation.gestures.AbstractDraggableNode) abstractDraggableNode$processDragStop$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    dragStopped = dragStopped2;
                    coroutineScope = coroutineScope2;
                }
                abstractDraggableNode.dragInteraction = null;
                function3 = abstractDraggableNode.onDragStopped;
                m4708boximpl = androidx.compose.ui.unit.Velocity.m4708boximpl(dragStopped.getVelocity());
                abstractDraggableNode$processDragStop$1.L$0 = null;
                abstractDraggableNode$processDragStop$1.L$1 = null;
                abstractDraggableNode$processDragStop$1.L$2 = null;
                abstractDraggableNode$processDragStop$1.label = 2;
                if (function3.invoke(coroutineScope, m4708boximpl, abstractDraggableNode$processDragStop$1) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        abstractDraggableNode$processDragStop$1 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragStop$1(this, continuation);
        java.lang.Object obj2 = abstractDraggableNode$processDragStop$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = abstractDraggableNode$processDragStop$1.label;
        if (i != 0) {
        }
        abstractDraggableNode.dragInteraction = null;
        function3 = abstractDraggableNode.onDragStopped;
        m4708boximpl = androidx.compose.ui.unit.Velocity.m4708boximpl(dragStopped.getVelocity());
        abstractDraggableNode$processDragStop$1.L$0 = null;
        abstractDraggableNode$processDragStop$1.L$1 = null;
        abstractDraggableNode$processDragStop$1.L$2 = null;
        abstractDraggableNode$processDragStop$1.label = 2;
        if (function3.invoke(coroutineScope, m4708boximpl, abstractDraggableNode$processDragStop$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object processDragCancel(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1 abstractDraggableNode$processDragCancel$1;
        java.lang.Object coroutine_suspended;
        int i;
        androidx.compose.foundation.gestures.AbstractDraggableNode abstractDraggableNode;
        kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3;
        androidx.compose.ui.unit.Velocity m4708boximpl;
        if (continuation instanceof androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1) {
            abstractDraggableNode$processDragCancel$1 = (androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1) continuation;
            if ((abstractDraggableNode$processDragCancel$1.label & Integer.MIN_VALUE) != 0) {
                abstractDraggableNode$processDragCancel$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = abstractDraggableNode$processDragCancel$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = abstractDraggableNode$processDragCancel$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.interaction.DragInteraction.Start start = this.dragInteraction;
                    if (start != null) {
                        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            androidx.compose.foundation.interaction.DragInteraction.Cancel cancel = new androidx.compose.foundation.interaction.DragInteraction.Cancel(start);
                            abstractDraggableNode$processDragCancel$1.L$0 = this;
                            abstractDraggableNode$processDragCancel$1.L$1 = coroutineScope;
                            abstractDraggableNode$processDragCancel$1.label = 1;
                            if (mutableInteractionSource.emit(cancel, abstractDraggableNode$processDragCancel$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        abstractDraggableNode = this;
                    } else {
                        abstractDraggableNode = this;
                        function3 = abstractDraggableNode.onDragStopped;
                        m4708boximpl = androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M());
                        abstractDraggableNode$processDragCancel$1.L$0 = null;
                        abstractDraggableNode$processDragCancel$1.L$1 = null;
                        abstractDraggableNode$processDragCancel$1.label = 2;
                        if (function3.invoke(coroutineScope, m4708boximpl, abstractDraggableNode$processDragCancel$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    coroutineScope = (kotlinx.coroutines.CoroutineScope) abstractDraggableNode$processDragCancel$1.L$1;
                    abstractDraggableNode = (androidx.compose.foundation.gestures.AbstractDraggableNode) abstractDraggableNode$processDragCancel$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                abstractDraggableNode.dragInteraction = null;
                function3 = abstractDraggableNode.onDragStopped;
                m4708boximpl = androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M());
                abstractDraggableNode$processDragCancel$1.L$0 = null;
                abstractDraggableNode$processDragCancel$1.L$1 = null;
                abstractDraggableNode$processDragCancel$1.label = 2;
                if (function3.invoke(coroutineScope, m4708boximpl, abstractDraggableNode$processDragCancel$1) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        abstractDraggableNode$processDragCancel$1 = new androidx.compose.foundation.gestures.AbstractDraggableNode$processDragCancel$1(this, continuation);
        java.lang.Object obj2 = abstractDraggableNode$processDragCancel$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = abstractDraggableNode$processDragCancel$1.label;
        if (i != 0) {
        }
        abstractDraggableNode.dragInteraction = null;
        function3 = abstractDraggableNode.onDragStopped;
        m4708boximpl = androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m4728getZero9UxMQ8M());
        abstractDraggableNode$processDragCancel$1.L$0 = null;
        abstractDraggableNode$processDragCancel$1.L$1 = null;
        abstractDraggableNode$processDragCancel$1.label = 2;
        if (function3.invoke(coroutineScope, m4708boximpl, abstractDraggableNode$processDragCancel$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void disposeInteractionSource() {
        androidx.compose.foundation.interaction.DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new androidx.compose.foundation.interaction.DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }
}

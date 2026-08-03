package androidx.compose.foundation;

/* compiled from: Hoverable.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J*\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/HoverableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "hoverInteraction", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "emitEnter", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitExit", "onCancelPointerInput", "onDetach", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "tryEmitExit", "updateInteractionSource", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class HoverableNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.PointerInputModifierNode {
    private androidx.compose.foundation.interaction.HoverInteraction.Enter hoverInteraction;
    private androidx.compose.foundation.interaction.MutableInteractionSource interactionSource;

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

    public HoverableNode(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final void updateInteractionSource(androidx.compose.foundation.interaction.MutableInteractionSource interactionSource) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.interactionSource, interactionSource)) {
            return;
        }
        tryEmitExit();
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo181onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Main) {
            int type = pointerEvent.getType();
            if (androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3228getEnter7fucELk())) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.HoverableNode$onPointerEvent$1(this, null), 3, null);
            } else if (androidx.compose.ui.input.pointer.PointerEventType.m3224equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m3229getExit7fucELk())) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.HoverableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        tryEmitExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        tryEmitExit();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emitEnter(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.HoverableNode$emitEnter$1 hoverableNode$emitEnter$1;
        int i;
        androidx.compose.foundation.HoverableNode hoverableNode;
        androidx.compose.foundation.interaction.HoverInteraction.Enter enter;
        if (continuation instanceof androidx.compose.foundation.HoverableNode$emitEnter$1) {
            hoverableNode$emitEnter$1 = (androidx.compose.foundation.HoverableNode$emitEnter$1) continuation;
            if ((hoverableNode$emitEnter$1.label & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitEnter$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = hoverableNode$emitEnter$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hoverableNode$emitEnter$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.hoverInteraction == null) {
                        androidx.compose.foundation.interaction.HoverInteraction.Enter enter2 = new androidx.compose.foundation.interaction.HoverInteraction.Enter();
                        hoverableNode$emitEnter$1.L$0 = this;
                        hoverableNode$emitEnter$1.L$1 = enter2;
                        hoverableNode$emitEnter$1.label = 1;
                        if (this.interactionSource.emit(enter2, hoverableNode$emitEnter$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        hoverableNode = this;
                        enter = enter2;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enter = (androidx.compose.foundation.interaction.HoverInteraction.Enter) hoverableNode$emitEnter$1.L$1;
                hoverableNode = (androidx.compose.foundation.HoverableNode) hoverableNode$emitEnter$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                hoverableNode.hoverInteraction = enter;
                return kotlin.Unit.INSTANCE;
            }
        }
        hoverableNode$emitEnter$1 = new androidx.compose.foundation.HoverableNode$emitEnter$1(this, continuation);
        java.lang.Object obj2 = hoverableNode$emitEnter$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hoverableNode$emitEnter$1.label;
        if (i != 0) {
        }
        hoverableNode.hoverInteraction = enter;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emitExit(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.HoverableNode$emitExit$1 hoverableNode$emitExit$1;
        int i;
        androidx.compose.foundation.HoverableNode hoverableNode;
        if (continuation instanceof androidx.compose.foundation.HoverableNode$emitExit$1) {
            hoverableNode$emitExit$1 = (androidx.compose.foundation.HoverableNode$emitExit$1) continuation;
            if ((hoverableNode$emitExit$1.label & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitExit$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = hoverableNode$emitExit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hoverableNode$emitExit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.interaction.HoverInteraction.Enter enter = this.hoverInteraction;
                    if (enter != null) {
                        androidx.compose.foundation.interaction.HoverInteraction.Exit exit = new androidx.compose.foundation.interaction.HoverInteraction.Exit(enter);
                        hoverableNode$emitExit$1.L$0 = this;
                        hoverableNode$emitExit$1.label = 1;
                        if (this.interactionSource.emit(exit, hoverableNode$emitExit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        hoverableNode = this;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hoverableNode = (androidx.compose.foundation.HoverableNode) hoverableNode$emitExit$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                hoverableNode.hoverInteraction = null;
                return kotlin.Unit.INSTANCE;
            }
        }
        hoverableNode$emitExit$1 = new androidx.compose.foundation.HoverableNode$emitExit$1(this, continuation);
        java.lang.Object obj2 = hoverableNode$emitExit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hoverableNode$emitExit$1.label;
        if (i != 0) {
        }
        hoverableNode.hoverInteraction = null;
        return kotlin.Unit.INSTANCE;
    }

    public final void tryEmitExit() {
        androidx.compose.foundation.interaction.HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            this.interactionSource.tryEmit(new androidx.compose.foundation.interaction.HoverInteraction.Exit(enter));
            this.hoverInteraction = null;
        }
    }
}

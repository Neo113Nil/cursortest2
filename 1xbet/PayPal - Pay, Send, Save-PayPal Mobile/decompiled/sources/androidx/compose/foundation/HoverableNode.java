package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006J'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/HoverableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p0", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "", "getHighSpeedVideoSizes", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "p1", "Landroidx/compose/ui/unit/IntSize;", "p2", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "()V", "onDetach", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HoverableNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.PointerInputModifierNode {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.foundation.interaction.HoverInteraction.Enter Camera2StreamConfigurationMap;
    private androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoSizes;

    public HoverableNode(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource) {
        this.getHighSpeedVideoSizes = mutableInteractionSource;
    }

    public final void getHighSpeedVideoSizes(androidx.compose.foundation.interaction.MutableInteractionSource p0) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, p0)) {
            return;
        }
        getHighSpeedVideoFpsRangesFor();
        this.getHighSpeedVideoSizes = p0;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo1262onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent p0, androidx.compose.ui.input.pointer.PointerEventPass p1, long p2) {
        if (p1 == androidx.compose.ui.input.pointer.PointerEventPass.Main) {
            int type = p0.getType();
            if (androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7184getEnter7fucELk())) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.HoverableNode$onPointerEvent$1(this, null), 3, null);
            } else if (androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(type, androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7185getExit7fucELk())) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.HoverableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        getHighSpeedVideoFpsRangesFor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.HoverableNode$emitEnter$1 hoverableNode$emitEnter$1;
        int i;
        androidx.compose.foundation.interaction.HoverInteraction.Enter enter;
        if (continuation instanceof androidx.compose.foundation.HoverableNode$emitEnter$1) {
            hoverableNode$emitEnter$1 = (androidx.compose.foundation.HoverableNode$emitEnter$1) continuation;
            if ((hoverableNode$emitEnter$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitEnter$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = hoverableNode$emitEnter$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hoverableNode$emitEnter$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.Camera2StreamConfigurationMap == null) {
                        androidx.compose.foundation.interaction.HoverInteraction.Enter enter2 = new androidx.compose.foundation.interaction.HoverInteraction.Enter();
                        hoverableNode$emitEnter$1.getHighSpeedVideoFpsRangesFor = enter2;
                        hoverableNode$emitEnter$1.getHighSpeedVideoFpsRanges = 1;
                        if (this.getHighSpeedVideoSizes.emit(enter2, hoverableNode$emitEnter$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        enter = enter2;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                enter = (androidx.compose.foundation.interaction.HoverInteraction.Enter) hoverableNode$emitEnter$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = enter;
                return kotlin.Unit.INSTANCE;
            }
        }
        hoverableNode$emitEnter$1 = new androidx.compose.foundation.HoverableNode$emitEnter$1(this, continuation);
        java.lang.Object obj2 = hoverableNode$emitEnter$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hoverableNode$emitEnter$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        this.Camera2StreamConfigurationMap = enter;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.HoverableNode$emitExit$1 hoverableNode$emitExit$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.HoverableNode$emitExit$1) {
            hoverableNode$emitExit$1 = (androidx.compose.foundation.HoverableNode$emitExit$1) continuation;
            if ((hoverableNode$emitExit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitExit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = hoverableNode$emitExit$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hoverableNode$emitExit$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.interaction.HoverInteraction.Enter enter = this.Camera2StreamConfigurationMap;
                    if (enter != null) {
                        androidx.compose.foundation.interaction.HoverInteraction.Exit exit = new androidx.compose.foundation.interaction.HoverInteraction.Exit(enter);
                        hoverableNode$emitExit$1.getHighSpeedVideoFpsRanges = 1;
                        if (this.getHighSpeedVideoSizes.emit(exit, hoverableNode$emitExit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = null;
                return kotlin.Unit.INSTANCE;
            }
        }
        hoverableNode$emitExit$1 = new androidx.compose.foundation.HoverableNode$emitExit$1(this, continuation);
        java.lang.Object obj2 = hoverableNode$emitExit$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hoverableNode$emitExit$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        this.Camera2StreamConfigurationMap = null;
        return kotlin.Unit.INSTANCE;
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        androidx.compose.foundation.interaction.HoverInteraction.Enter enter = this.Camera2StreamConfigurationMap;
        if (enter != null) {
            this.getHighSpeedVideoSizes.tryEmit(new androidx.compose.foundation.interaction.HoverInteraction.Exit(enter));
            this.Camera2StreamConfigurationMap = null;
        }
    }
}

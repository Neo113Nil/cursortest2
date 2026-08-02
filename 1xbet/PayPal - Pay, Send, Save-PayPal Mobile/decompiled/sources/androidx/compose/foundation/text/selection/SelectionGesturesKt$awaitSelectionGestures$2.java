package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2", f = "SelectionGestures.kt", i = {0}, l = {111, 119, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class SelectionGesturesKt$awaitSelectionGestures$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.selection.ClicksCounter getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.text.TextDragObserver getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.text.selection.MouseSelectionObserver getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(r1, r12.getHighSpeedVideoSizes, r12.getHighResolutionOutputSizeshNQ4ISI, r13, r12) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(r1, r12.getHighSpeedVideoFpsRangesFor, r13, r12) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        if (r13 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        if (r13 != r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        java.lang.Object highSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = awaitPointerEventScope;
            this.Camera2StreamConfigurationMap = 1;
            obj = androidx.compose.foundation.text.selection.SelectionGesturesKt.access$awaitDown(awaitPointerEventScope, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
        this.getHighResolutionOutputSizeshNQ4ISI.update(pointerEvent);
        boolean isMouseOrTouchPad = androidx.compose.foundation.text.selection.SelectionGestures_androidKt.isMouseOrTouchPad(pointerEvent);
        if (isMouseOrTouchPad && androidx.compose.ui.input.pointer.PointerEvent_androidKt.m7204isPrimaryPressedaHzCxE(pointerEvent.getButtons())) {
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!changes.get(i2).isConsumed()) {
                }
            }
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = 2;
        }
        if (!isMouseOrTouchPad) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getClicks() == 1) {
                this.getHighSpeedVideoFpsRanges = null;
                this.Camera2StreamConfigurationMap = 3;
            } else {
                this.getHighSpeedVideoFpsRanges = null;
                this.Camera2StreamConfigurationMap = 4;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.selection.SelectionGesturesKt.getHighSpeedVideoFpsRangesFor(awaitPointerEventScope, this.getHighSpeedVideoFpsRangesFor, pointerEvent, this.getHighResolutionOutputSizeshNQ4ISI.getClicks(), this);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2 selectionGesturesKt$awaitSelectionGestures$2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
        selectionGesturesKt$awaitSelectionGestures$2.getHighSpeedVideoFpsRanges = obj;
        return selectionGesturesKt$awaitSelectionGestures$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionGesturesKt$awaitSelectionGestures$2(androidx.compose.foundation.text.selection.ClicksCounter clicksCounter, androidx.compose.foundation.text.selection.MouseSelectionObserver mouseSelectionObserver, androidx.compose.foundation.text.TextDragObserver textDragObserver, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = clicksCounter;
        this.getHighSpeedVideoSizes = mouseSelectionObserver;
        this.getHighSpeedVideoFpsRangesFor = textDragObserver;
    }
}

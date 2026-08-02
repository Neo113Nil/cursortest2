package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/selection/DownResolution;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.DownResolution>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRangesFor;
            long j = this.getHighSpeedVideoSizes;
            final kotlin.jvm.internal.Ref.LongRef longRef = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
            this.Camera2StreamConfigurationMap = 1;
            java.lang.Object m1462awaitTouchSlopOrCancellationjO51t88 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1462awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope2, j, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.LongRef.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj2, (androidx.compose.ui.geometry.Offset) obj3);
                }
            }, this);
            if (m1462awaitTouchSlopOrCancellationjO51t88 == coroutine_suspended) {
                return coroutine_suspended;
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj = m1462awaitTouchSlopOrCancellationjO51t88;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((androidx.compose.ui.input.pointer.PointerInputChange) obj) != null && (this.getHighSpeedVideoFpsRanges.element & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return androidx.compose.foundation.text.selection.DownResolution.getHighResolutionOutputSizeshNQ4ISI;
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) awaitPointerEventScope.getCurrentEvent().getChanges());
        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            pointerInputChange.consume();
            return androidx.compose.foundation.text.selection.DownResolution.getHighSpeedVideoFpsRangesFor;
        }
        return androidx.compose.foundation.text.selection.DownResolution.getHighSpeedVideoFpsRanges;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.geometry.Offset offset) {
        pointerInputChange.consume();
        longRef.element = offset.m5762unboximpl();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.DownResolution> continuation) {
        return ((androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.getHighSpeedVideoFpsRangesFor = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j, kotlin.jvm.internal.Ref.LongRef longRef, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRanges = longRef;
    }
}

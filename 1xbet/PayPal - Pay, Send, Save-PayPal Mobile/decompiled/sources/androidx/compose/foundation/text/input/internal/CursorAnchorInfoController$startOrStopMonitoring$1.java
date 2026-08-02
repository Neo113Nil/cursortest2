package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", f = "CursorAnchorInfoController.android.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CursorAnchorInfoController$startOrStopMonitoring$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text.input.internal.CursorAnchorInfoController getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.text.input.internal.CursorAnchorInfoController cursorAnchorInfoController = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow filterNotNull = kotlinx.coroutines.flow.FlowKt.filterNotNull(kotlinx.coroutines.flow.FlowKt.drop(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    android.view.inputmethod.CursorAnchorInfo highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.this.getHighResolutionOutputSizeshNQ4ISI();
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }), 1));
            final androidx.compose.foundation.text.input.internal.CursorAnchorInfoController cursorAnchorInfoController2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            if (filterNotNull.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    androidx.compose.foundation.text.input.internal.ComposeInputMethodManager composeInputMethodManager;
                    composeInputMethodManager = androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.this.Camera2StreamConfigurationMap;
                    composeInputMethodManager.updateCursorAnchorInfo((android.view.inputmethod.CursorAnchorInfo) obj2);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CursorAnchorInfoController$startOrStopMonitoring$1(androidx.compose.foundation.text.input.internal.CursorAnchorInfoController cursorAnchorInfoController, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cursorAnchorInfoController;
    }
}

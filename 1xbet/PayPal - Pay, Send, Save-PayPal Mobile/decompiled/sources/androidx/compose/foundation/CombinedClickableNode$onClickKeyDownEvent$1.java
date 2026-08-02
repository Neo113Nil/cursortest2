package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1", f = "Clickable.kt", i = {}, l = {1138}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CombinedClickableNode$onClickKeyDownEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.CombinedClickableNode getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function0 function0;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.DelayKt.delay(((androidx.compose.ui.platform.ViewConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this.getHighSpeedVideoFpsRangesFor, androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration())).getLongPressTimeoutMillis(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        function0 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
        if (function0 != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CombinedClickableNode$onClickKeyDownEvent$1(androidx.compose.foundation.CombinedClickableNode combinedClickableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = combinedClickableNode;
    }
}

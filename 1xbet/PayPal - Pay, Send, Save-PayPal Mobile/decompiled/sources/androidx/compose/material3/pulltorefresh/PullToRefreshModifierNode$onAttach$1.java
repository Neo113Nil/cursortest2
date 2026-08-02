package androidx.compose.material3.pulltorefresh;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1", f = "PullToRefresh.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PullToRefreshModifierNode$onAttach$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.material3.pulltorefresh.PullToRefreshState state = this.getHighSpeedVideoFpsRangesFor.getState();
            float f = this.getHighSpeedVideoFpsRangesFor.getIsRefreshing() ? 1.0f : 0.0f;
            this.getHighSpeedVideoFpsRanges = 1;
            if (state.snapTo(f, this) == coroutine_suspended) {
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
        return ((androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullToRefreshModifierNode$onAttach$1(androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = pullToRefreshModifierNode;
    }
}

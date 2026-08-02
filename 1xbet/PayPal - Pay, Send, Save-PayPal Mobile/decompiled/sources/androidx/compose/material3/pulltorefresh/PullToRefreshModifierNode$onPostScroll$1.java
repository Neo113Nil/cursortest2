package androidx.compose.material3.pulltorefresh;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1", f = "PullToRefresh.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class PullToRefreshModifierNode$onPostScroll$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        float highResolutionOutputSizeshNQ4ISI;
        int mo1412roundToPx0680j_4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.Camera2StreamConfigurationMap.getState().isAnimating()) {
                androidx.compose.material3.pulltorefresh.PullToRefreshState state = this.Camera2StreamConfigurationMap.getState();
                highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
                mo1412roundToPx0680j_4 = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(r3).mo1412roundToPx0680j_4(this.Camera2StreamConfigurationMap.threshold);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (state.snapTo(highResolutionOutputSizeshNQ4ISI / mo1412roundToPx0680j_4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
        return ((androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullToRefreshModifierNode$onPostScroll$1(androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = pullToRefreshModifierNode;
    }
}

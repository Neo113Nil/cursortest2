package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class BlockRunner$maybeRun$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.view.BlockRunner<T> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.view.CoroutineLiveData coroutineLiveData;
        kotlin.jvm.functions.Function2 function2;
        kotlin.jvm.functions.Function0 function0;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
            coroutineLiveData = ((androidx.view.BlockRunner) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
            androidx.view.LiveDataScopeImpl liveDataScopeImpl = new androidx.view.LiveDataScopeImpl(coroutineLiveData, coroutineScope.getCoroutineContext());
            function2 = ((androidx.view.BlockRunner) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            if (function2.invoke(liveDataScopeImpl, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        function0 = ((androidx.view.BlockRunner) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoSizes;
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.BlockRunner$maybeRun$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.view.BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new androidx.view.BlockRunner$maybeRun$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        blockRunner$maybeRun$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return blockRunner$maybeRun$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlockRunner$maybeRun$1(androidx.view.BlockRunner<T> blockRunner, kotlin.coroutines.Continuation<? super androidx.view.BlockRunner$maybeRun$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = blockRunner;
    }
}

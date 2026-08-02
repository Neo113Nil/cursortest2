package com.paypal.oslo.feature.pools.ui.pooldetails;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/feature/pools/ui/pooldetails/PoolDetailsState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$uiState$1", f = "PoolDetailsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PoolDetailsViewModel$uiState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel = this.Camera2StreamConfigurationMap;
        str = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
        poolDetailsViewModel.getOutputMinFrameDuration.onEvent(new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent.Initialize(str));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$uiState$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$uiState$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PoolDetailsViewModel$uiState$1(com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$uiState$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = poolDetailsViewModel;
    }
}

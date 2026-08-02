package com.paypal.oslo.feature.pools.ui.pooldetails;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1$invoke$2", f = "PoolDetailsViewModel.kt", i = {0, 0}, l = {95}, m = "invokeSuspend", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, "poolIdToRetry"}, nl = {96}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class PoolDetailsViewModel$sideEffectsMiddleware$1$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1 getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState component1 = this.Camera2StreamConfigurationMap.getStates().component1();
            com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error error = component1 instanceof com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error ? (com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState.Error) component1 : null;
            if (error == null || (str = error.getPoolId()) == null) {
                str = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            }
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(component1);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1.access$loadPoolDetails(this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, str, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1$invoke$2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PoolDetailsViewModel$sideEffectsMiddleware$1$invoke$2(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsState, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsIntent> input, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel poolDetailsViewModel, com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1 poolDetailsViewModel$sideEffectsMiddleware$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.ui.pooldetails.PoolDetailsViewModel$sideEffectsMiddleware$1$invoke$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = input;
        this.getHighResolutionOutputSizeshNQ4ISI = poolDetailsViewModel;
        this.getInputSizeshNQ4ISI = poolDetailsViewModel$sideEffectsMiddleware$1;
    }
}

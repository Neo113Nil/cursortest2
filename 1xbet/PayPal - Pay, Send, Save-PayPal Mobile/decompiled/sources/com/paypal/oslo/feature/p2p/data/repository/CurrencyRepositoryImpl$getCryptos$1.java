package com.paypal.oslo.feature.p2p.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "", "", "Lcom/paypal/oslo/feature/p2p/domain/model/CryptoItem;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCryptos$1", f = "CurrencyRepositoryImpl.kt", i = {0, 0}, l = {143}, m = "invokeSuspend", n = {"$this$flow", "cryptos"}, nl = {144}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class CurrencyRepositoryImpl$getCryptos$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends java.lang.Throwable, ? extends java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.CryptoItem>>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_CRYPTOS_REQUEST, kotlin.collections.MapsKt.emptyMap(), null, 4, null);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.p2p.domain.model.CryptoItem[]{new com.paypal.oslo.feature.p2p.domain.model.CryptoItem("btc", "Bitcoin", "BTC", "BTC", false, 16, null), new com.paypal.oslo.feature.p2p.domain.model.CryptoItem("eth", "Ethereum", "ETH", "ETH", false, 16, null), new com.paypal.oslo.feature.p2p.domain.model.CryptoItem("ltc", "Litecoin", "LTC", "LTC", false, 16, null)});
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.GET_CRYPTOS_SUCCESS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CRYPTOS_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(listOf.size()))), null, 4, null);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(listOf);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (flowCollector.emit(new arrow.core.Ior.Right(listOf), this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends java.lang.Throwable, ? extends java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.CryptoItem>>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCryptos$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCryptos$1 currencyRepositoryImpl$getCryptos$1 = new com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCryptos$1(continuation);
        currencyRepositoryImpl$getCryptos$1.Camera2StreamConfigurationMap = obj;
        return currencyRepositoryImpl$getCryptos$1;
    }

    CurrencyRepositoryImpl$getCryptos$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl$getCryptos$1> continuation) {
        super(2, continuation);
    }
}

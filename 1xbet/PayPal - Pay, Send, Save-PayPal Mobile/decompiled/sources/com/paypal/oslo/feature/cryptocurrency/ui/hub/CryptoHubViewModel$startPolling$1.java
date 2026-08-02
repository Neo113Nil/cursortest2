package com.paypal.oslo.feature.cryptocurrency.ui.hub;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1", f = "CryptoHubViewModel.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, nl = {127}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoHubViewModel$startPolling$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade cryptoHubPollDataFacade;
        com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cryptoHubPollDataFacade = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            currencyProvider = this.Camera2StreamConfigurationMap.getInputFormats;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade.invoke$default(cryptoHubPollDataFacade, currencyProvider.getCurrencyCode(), false, 2, null).collect(new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1.AnonymousClass1(this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData cryptoHubPollingData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1$1$emit$1 cryptoHubViewModel$startPolling$1$1$emit$1;
            int i;
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade pYUSDRewardsCardFacade;
            if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1$1$emit$1) {
                cryptoHubViewModel$startPolling$1$1$emit$1 = (com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1$1$emit$1) continuation;
                if ((cryptoHubViewModel$startPolling$1$1$emit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    cryptoHubViewModel$startPolling$1$1$emit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = cryptoHubViewModel$startPolling$1$1$emit$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cryptoHubViewModel$startPolling$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        pYUSDRewardsCardFacade = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings holdings = cryptoHubPollingData.getHoldings();
                        cryptoHubViewModel$startPolling$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = cryptoHubPollingData;
                        cryptoHubViewModel$startPolling$1$1$emit$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = pYUSDRewardsCardFacade.getRewardsCardUiState(holdings, cryptoHubViewModel$startPolling$1$1$emit$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cryptoHubPollingData = (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData) cryptoHubViewModel$startPolling$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.access$reduce(this.getHighSpeedVideoFpsRangesFor, cryptoHubPollingData.getHoldings(), cryptoHubPollingData.getMarketPrices(), (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState) obj);
                    return kotlin.Unit.INSTANCE;
                }
            }
            cryptoHubViewModel$startPolling$1$1$emit$1 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = cryptoHubViewModel$startPolling$1$1$emit$1.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = cryptoHubViewModel$startPolling$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
            if (i != 0) {
            }
            com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.access$reduce(this.getHighSpeedVideoFpsRangesFor, cryptoHubPollingData.getHoldings(), cryptoHubPollingData.getMarketPrices(), (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState) obj2);
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel) {
            this.getHighSpeedVideoFpsRangesFor = cryptoHubViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHubViewModel$startPolling$1(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$startPolling$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = cryptoHubViewModel;
    }
}

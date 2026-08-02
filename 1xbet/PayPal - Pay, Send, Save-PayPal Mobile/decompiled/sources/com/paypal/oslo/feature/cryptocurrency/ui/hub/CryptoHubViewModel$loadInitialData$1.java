package com.paypal.oslo.feature.cryptocurrency.ui.hub;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$loadInitialData$1", f = "CryptoHubViewModel.kt", i = {1, 2, 2}, l = {87, 95, 103}, m = "invokeSuspend", n = {"holdings", "holdings", "marketPrices"}, nl = {88, 96, 105}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoHubViewModel$loadInitialData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0060, code lost:
    
        if (r9 != r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases cryptoHubUseCases;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings;
        com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases cryptoHubUseCases2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings2;
        arrow.core.Either either;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade pYUSDRewardsCardFacade;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices cryptoMarketPrices;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices cryptoMarketPrices2 = null;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) value, true, null, 2, null)));
            cryptoHubUseCases = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = 1;
            obj = com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase.invoke$default(cryptoHubUseCases.getGetCryptoHoldings(), null, this, 1, null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cryptoMarketPrices = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices) this.getHighResolutionOutputSizeshNQ4ISI;
                    cryptoHoldings2 = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings) this.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.access$reduce(this.getHighSpeedVideoFpsRangesFor, cryptoHoldings2, cryptoMarketPrices, (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState) obj);
                    return kotlin.Unit.INSTANCE;
                }
                cryptoHoldings2 = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    cryptoMarketPrices2 = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices) ((arrow.core.Either.Right) either).getValue();
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                pYUSDRewardsCardFacade = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = cryptoHoldings2;
                this.getHighResolutionOutputSizeshNQ4ISI = cryptoMarketPrices2;
                this.Camera2StreamConfigurationMap = 3;
                obj = pYUSDRewardsCardFacade.getRewardsCardUiState(cryptoHoldings2, this);
                if (obj != coroutine_suspended) {
                    cryptoMarketPrices = cryptoMarketPrices2;
                    com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.access$reduce(this.getHighSpeedVideoFpsRangesFor, cryptoHoldings2, cryptoMarketPrices, (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState) obj);
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either2 = (arrow.core.Either) obj;
        if (either2 instanceof arrow.core.Either.Right) {
            cryptoHoldings = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings) ((arrow.core.Either.Right) either2).getValue();
        } else {
            if (!(either2 instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            cryptoHoldings = null;
        }
        cryptoHubUseCases2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = cryptoHoldings;
        this.Camera2StreamConfigurationMap = 2;
        java.lang.Object invoke$default = com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase.invoke$default(cryptoHubUseCases2.getGetCryptoMarketPrices(), null, this, 1, null);
        if (invoke$default != coroutine_suspended) {
            cryptoHoldings2 = cryptoHoldings;
            obj = invoke$default;
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Right)) {
            }
            pYUSDRewardsCardFacade = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = cryptoHoldings2;
            this.getHighResolutionOutputSizeshNQ4ISI = cryptoMarketPrices2;
            this.Camera2StreamConfigurationMap = 3;
            obj = pYUSDRewardsCardFacade.getRewardsCardUiState(cryptoHoldings2, this);
            if (obj != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$loadInitialData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$loadInitialData$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHubViewModel$loadInitialData$1(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$loadInitialData$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cryptoHubViewModel;
    }
}

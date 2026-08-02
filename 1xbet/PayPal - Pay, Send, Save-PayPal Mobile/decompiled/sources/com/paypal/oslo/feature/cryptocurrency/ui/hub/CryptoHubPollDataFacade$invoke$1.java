package com.paypal.oslo.feature.cryptocurrency.ui.hub;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubPollingData;", "holdingsResult", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "marketPricesResult", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrices;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade$invoke$1", f = "CryptoHubPollDataFacade.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoHubPollDataFacade$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings>, arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices>, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices cryptoMarketPrices;
        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrice> marketPrices;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase filterMarketPricesUseCase;
        arrow.core.Either either = (arrow.core.Either) this.Camera2StreamConfigurationMap;
        arrow.core.Either either2 = (arrow.core.Either) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices cryptoMarketPrices2 = null;
        if (either instanceof arrow.core.Either.Right) {
            cryptoHoldings = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings) ((arrow.core.Either.Right) either).getValue();
        } else {
            if (!(either instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            cryptoHoldings = null;
        }
        if (either2 instanceof arrow.core.Either.Right) {
            cryptoMarketPrices = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices) ((arrow.core.Either.Right) either2).getValue();
        } else {
            if (!(either2 instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            cryptoMarketPrices = null;
        }
        if (cryptoHoldings != null && cryptoMarketPrices != null) {
            filterMarketPricesUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            marketPrices = filterMarketPricesUseCase.invoke(cryptoMarketPrices.getMarketPrices(), cryptoHoldings);
        } else {
            marketPrices = cryptoMarketPrices != null ? cryptoMarketPrices.getMarketPrices() : null;
        }
        if (marketPrices != null && cryptoMarketPrices != null) {
            cryptoMarketPrices2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices(marketPrices, cryptoMarketPrices.getCapabilities());
        }
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData(cryptoHoldings, cryptoMarketPrices2);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings> either, arrow.core.Either<? extends com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, ? extends com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices> either2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade$invoke$1 cryptoHubPollDataFacade$invoke$1 = new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade$invoke$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        cryptoHubPollDataFacade$invoke$1.Camera2StreamConfigurationMap = either;
        cryptoHubPollDataFacade$invoke$1.getHighResolutionOutputSizeshNQ4ISI = either2;
        return cryptoHubPollDataFacade$invoke$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHubPollDataFacade$invoke$1(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade cryptoHubPollDataFacade, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubPollDataFacade$invoke$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRangesFor = cryptoHubPollDataFacade;
    }
}

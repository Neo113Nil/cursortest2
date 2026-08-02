package com.paypal.oslo.feature.cryptocurrency.ui.details;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$loadPriceHistory$1", f = "CryptoDetailsViewModel.kt", i = {}, l = {319}, m = "invokeSuspend", n = {}, nl = {323}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoDetailsViewModel$loadPriceHistory$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases cryptoDetailsUseCases;
        java.lang.String str;
        com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider;
        java.lang.Object invoke;
        java.lang.String str2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState copy;
        kotlinx.coroutines.channels.Channel channel;
        com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceHistoryUiMapper assetPriceHistoryUiMapper;
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData Camera2StreamConfigurationMap;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.ChartInteractionData chartInteractionData;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange timeframeForChangeData;
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState copy2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cryptoDetailsUseCases = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase getAssetPriceHistory = cryptoDetailsUseCases.getGetAssetPriceHistory();
            str = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange = this.Camera2StreamConfigurationMap;
            currencyProvider = this.getHighSpeedVideoSizes.getOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            invoke = getAssetPriceHistory.invoke(str, priceTimeRange, currencyProvider.getCurrencyCode(), this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange2 = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory assetPriceHistory = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory) ((arrow.core.Either.Right) either).getValue();
            assetPriceHistoryUiMapper = cryptoDetailsViewModel.getInputSizeshNQ4ISI;
            com.paypal.oslo.core.commonui.components.chart.TimeSeriesData map = assetPriceHistoryUiMapper.map(assetPriceHistory);
            Camera2StreamConfigurationMap = cryptoDetailsViewModel.Camera2StreamConfigurationMap(map, priceTimeRange2);
            mutableStateFlow3 = cryptoDetailsViewModel.getOutputStallDuration;
            mutableStateFlow4 = cryptoDetailsViewModel.getOutputStallDuration;
            com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState assetPriceDetailsUiState = (com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow4.getValue();
            if (Camera2StreamConfigurationMap == null) {
                mutableStateFlow6 = cryptoDetailsViewModel.getOutputStallDuration;
                chartInteractionData = priceTimeRange2 != com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange.DAY_24H ? ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow6.getValue()).getTimeframeChangeData() : null;
            } else {
                chartInteractionData = Camera2StreamConfigurationMap;
            }
            if (Camera2StreamConfigurationMap == null || priceTimeRange2 == null) {
                mutableStateFlow5 = cryptoDetailsViewModel.getOutputStallDuration;
                timeframeForChangeData = priceTimeRange2 != com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange.DAY_24H ? ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow5.getValue()).getTimeframeForChangeData() : null;
            } else {
                timeframeForChangeData = priceTimeRange2;
            }
            copy2 = assetPriceDetailsUiState.copy((r39 & 1) != 0 ? assetPriceDetailsUiState.isLoading : false, (r39 & 2) != 0 ? assetPriceDetailsUiState.currencyCode : null, (r39 & 4) != 0 ? assetPriceDetailsUiState.assetPriceData : null, (r39 & 8) != 0 ? assetPriceDetailsUiState.selectedTimeframe : null, (r39 & 16) != 0 ? assetPriceDetailsUiState.isLoadingPriceHistory : false, (r39 & 32) != 0 ? assetPriceDetailsUiState.priceHistoryData : map, (r39 & 64) != 0 ? assetPriceDetailsUiState.assetDescription : null, (r39 & 128) != 0 ? assetPriceDetailsUiState.chartInteractionData : null, (r39 & 256) != 0 ? assetPriceDetailsUiState.timeframeChangeData : chartInteractionData, (r39 & 512) != 0 ? assetPriceDetailsUiState.timeframeForChangeData : timeframeForChangeData, (r39 & 1024) != 0 ? assetPriceDetailsUiState.cryptoDescription : null, (r39 & 2048) != 0 ? assetPriceDetailsUiState.cryptoDescriptionLinks : null, (r39 & 4096) != 0 ? assetPriceDetailsUiState.cryptoSymbol : null, (r39 & 8192) != 0 ? assetPriceDetailsUiState.exchangeRateDisclaimer : null, (r39 & 16384) != 0 ? assetPriceDetailsUiState.regulatoryDisclaimer : null, (r39 & 32768) != 0 ? assetPriceDetailsUiState.ppdDisclosure : null, (r39 & 65536) != 0 ? assetPriceDetailsUiState.pyusdRewardsCardUiState : null, (r39 & 131072) != 0 ? assetPriceDetailsUiState.cryptoAssetHoldingData : null, (r39 & 262144) != 0 ? assetPriceDetailsUiState.isRecurringBuysEnabled : false, (r39 & 524288) != 0 ? assetPriceDetailsUiState.networkSelectionNetworks : null, (r39 & 1048576) != 0 ? assetPriceDetailsUiState.networkSelectionSelectedId : null);
            mutableStateFlow3.setValue(copy2);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError cryptocurrencyError = (com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.cryptocurrency.LoggerKt.log;
            str2 = cryptoDetailsViewModel.getHighSpeedVideoSizes;
            com.paypal.android.logger.Logger.d$default(logger, "Error loading price history", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, str2), kotlin.TuplesKt.to("timeRange", priceTimeRange2.toString()), kotlin.TuplesKt.to("error", cryptocurrencyError.toString())), null, 4, null);
            mutableStateFlow = cryptoDetailsViewModel.getOutputStallDuration;
            mutableStateFlow2 = cryptoDetailsViewModel.getOutputStallDuration;
            copy = r4.copy((r39 & 1) != 0 ? r4.isLoading : true, (r39 & 2) != 0 ? r4.currencyCode : null, (r39 & 4) != 0 ? r4.assetPriceData : null, (r39 & 8) != 0 ? r4.selectedTimeframe : null, (r39 & 16) != 0 ? r4.isLoadingPriceHistory : false, (r39 & 32) != 0 ? r4.priceHistoryData : null, (r39 & 64) != 0 ? r4.assetDescription : null, (r39 & 128) != 0 ? r4.chartInteractionData : null, (r39 & 256) != 0 ? r4.timeframeChangeData : null, (r39 & 512) != 0 ? r4.timeframeForChangeData : null, (r39 & 1024) != 0 ? r4.cryptoDescription : null, (r39 & 2048) != 0 ? r4.cryptoDescriptionLinks : null, (r39 & 4096) != 0 ? r4.cryptoSymbol : null, (r39 & 8192) != 0 ? r4.exchangeRateDisclaimer : null, (r39 & 16384) != 0 ? r4.regulatoryDisclaimer : null, (r39 & 32768) != 0 ? r4.ppdDisclosure : null, (r39 & 65536) != 0 ? r4.pyusdRewardsCardUiState : null, (r39 & 131072) != 0 ? r4.cryptoAssetHoldingData : null, (r39 & 262144) != 0 ? r4.isRecurringBuysEnabled : false, (r39 & 524288) != 0 ? r4.networkSelectionNetworks : null, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow2.getValue()).networkSelectionSelectedId : null);
            mutableStateFlow.setValue(copy);
            channel = cryptoDetailsViewModel.getOutputMinFrameDurationlomOqCM;
            channel.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToErrorScreen.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$loadPriceHistory$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$loadPriceHistory$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoDetailsViewModel$loadPriceHistory$1(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$loadPriceHistory$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = cryptoDetailsViewModel;
        this.Camera2StreamConfigurationMap = priceTimeRange;
    }
}

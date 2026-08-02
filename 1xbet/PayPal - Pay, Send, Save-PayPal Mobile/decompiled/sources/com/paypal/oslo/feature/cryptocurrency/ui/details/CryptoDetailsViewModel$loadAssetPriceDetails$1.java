package com.paypal.oslo.feature.cryptocurrency.ui.details;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$loadAssetPriceDetails$1", f = "CryptoDetailsViewModel.kt", i = {1, 2, 2}, l = {238, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE}, m = "invokeSuspend", n = {"currentPriceResult", "currentPriceResult", "holding"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 247, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoDetailsViewModel$loadAssetPriceDetails$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        if (r6 != r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        if (r2 != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0100  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState copy;
        com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases cryptoDetailsUseCases;
        java.lang.String str;
        com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider;
        java.lang.Object invoke$default;
        arrow.core.Either either;
        com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases cryptoDetailsUseCases2;
        java.lang.String str2;
        com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider2;
        java.lang.Object invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade pYUSDRewardsCardFacade;
        java.lang.String str3;
        java.lang.Object rewardsCardUiState;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding cryptoHolding;
        java.lang.String str4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState copy2;
        kotlinx.coroutines.channels.Channel channel;
        com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsCardActionsUiMapper assetPriceDetailsCardActionsUiMapper;
        com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsUiMapper assetPriceDetailsUiMapper;
        com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData copy3;
        com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory cryptoAssetDescriptionUiFactory;
        java.lang.String str5;
        com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.CryptoAssetHoldingDataMapper cryptoAssetHoldingDataMapper;
        java.lang.String str6;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState copy4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDuration;
            mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDuration;
            copy = r7.copy((r39 & 1) != 0 ? r7.isLoading : true, (r39 & 2) != 0 ? r7.currencyCode : null, (r39 & 4) != 0 ? r7.assetPriceData : null, (r39 & 8) != 0 ? r7.selectedTimeframe : null, (r39 & 16) != 0 ? r7.isLoadingPriceHistory : false, (r39 & 32) != 0 ? r7.priceHistoryData : null, (r39 & 64) != 0 ? r7.assetDescription : null, (r39 & 128) != 0 ? r7.chartInteractionData : null, (r39 & 256) != 0 ? r7.timeframeChangeData : null, (r39 & 512) != 0 ? r7.timeframeForChangeData : null, (r39 & 1024) != 0 ? r7.cryptoDescription : null, (r39 & 2048) != 0 ? r7.cryptoDescriptionLinks : null, (r39 & 4096) != 0 ? r7.cryptoSymbol : null, (r39 & 8192) != 0 ? r7.exchangeRateDisclaimer : null, (r39 & 16384) != 0 ? r7.regulatoryDisclaimer : null, (r39 & 32768) != 0 ? r7.ppdDisclosure : null, (r39 & 65536) != 0 ? r7.pyusdRewardsCardUiState : null, (r39 & 131072) != 0 ? r7.cryptoAssetHoldingData : null, (r39 & 262144) != 0 ? r7.isRecurringBuysEnabled : false, (r39 & 524288) != 0 ? r7.networkSelectionNetworks : null, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow2.getValue()).networkSelectionSelectedId : null);
            mutableStateFlow.setValue(copy);
            cryptoDetailsUseCases = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPrice = cryptoDetailsUseCases.getGetAssetCurrentPrice();
            str = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            currencyProvider = this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            invoke$default = com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase.invoke$default(getAssetCurrentPrice, str, currencyProvider.getCurrencyCode(), false, this, 4, null);
        } else {
            if (i != 1) {
                if (i == 2) {
                    either = (arrow.core.Either) this.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    invoke = obj;
                    com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding cryptoHolding2 = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) ((arrow.core.Either) invoke).getOrNull();
                    pYUSDRewardsCardFacade = this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats;
                    str3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoFpsRanges = either;
                    this.getHighSpeedVideoFpsRangesFor = cryptoHolding2;
                    this.getHighSpeedVideoSizes = 3;
                    rewardsCardUiState = pYUSDRewardsCardFacade.getRewardsCardUiState(str3, cryptoHolding2, this);
                    if (rewardsCardUiState != coroutine_suspended) {
                        cryptoHolding = cryptoHolding2;
                        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState) rewardsCardUiState;
                        com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (!(either instanceof arrow.core.Either.Right)) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cryptoHolding = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) this.getHighSpeedVideoFpsRangesFor;
                either = (arrow.core.Either) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                rewardsCardUiState = obj;
                com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState2 = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState) rewardsCardUiState;
                com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails assetPriceDetails = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails) ((arrow.core.Either.Right) either).getValue();
                    assetPriceDetailsCardActionsUiMapper = cryptoDetailsViewModel2.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsCardActionsUiState map = assetPriceDetailsCardActionsUiMapper.map(assetPriceDetails.getAssetCapabilities(), cryptoHolding != null ? cryptoHolding.getFiatAmountValue() : null);
                    assetPriceDetailsUiMapper = cryptoDetailsViewModel2.getHighSpeedVideoFpsRanges;
                    copy3 = r7.copy((r18 & 1) != 0 ? r7.assetName : null, (r18 & 2) != 0 ? r7.assetSymbol : null, (r18 & 4) != 0 ? r7.currentPrice : null, (r18 & 8) != 0 ? r7.changePercentage : null, (r18 & 16) != 0 ? r7.changeAmountWithIndicator : null, (r18 & 32) != 0 ? r7.isPositiveChange : false, (r18 & 64) != 0 ? r7.logoUrl : null, (r18 & 128) != 0 ? assetPriceDetailsUiMapper.map(assetPriceDetails).assetPriceDetailsCardActionsUiState : map);
                    cryptoAssetDescriptionUiFactory = cryptoDetailsViewModel2.getOutputStallDurationlomOqCM;
                    str5 = cryptoDetailsViewModel2.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.cryptocurrency.ui.details.model.CryptoAssetDescriptionUiState create = cryptoAssetDescriptionUiFactory.create(str5);
                    cryptoAssetHoldingDataMapper = cryptoDetailsViewModel2.getHighSpeedVideoSizesFor;
                    str6 = cryptoDetailsViewModel2.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.cryptocurrency.ui.details.components.CryptoAssetHoldingData map2 = cryptoAssetHoldingDataMapper.map(cryptoHolding, str6);
                    mutableStateFlow5 = cryptoDetailsViewModel2.getOutputStallDuration;
                    mutableStateFlow6 = cryptoDetailsViewModel2.getOutputStallDuration;
                    copy4 = r6.copy((r39 & 1) != 0 ? r6.isLoading : false, (r39 & 2) != 0 ? r6.currencyCode : null, (r39 & 4) != 0 ? r6.assetPriceData : copy3, (r39 & 8) != 0 ? r6.selectedTimeframe : null, (r39 & 16) != 0 ? r6.isLoadingPriceHistory : false, (r39 & 32) != 0 ? r6.priceHistoryData : null, (r39 & 64) != 0 ? r6.assetDescription : create, (r39 & 128) != 0 ? r6.chartInteractionData : null, (r39 & 256) != 0 ? r6.timeframeChangeData : null, (r39 & 512) != 0 ? r6.timeframeForChangeData : null, (r39 & 1024) != 0 ? r6.cryptoDescription : null, (r39 & 2048) != 0 ? r6.cryptoDescriptionLinks : null, (r39 & 4096) != 0 ? r6.cryptoSymbol : null, (r39 & 8192) != 0 ? r6.exchangeRateDisclaimer : null, (r39 & 16384) != 0 ? r6.regulatoryDisclaimer : null, (r39 & 32768) != 0 ? r6.ppdDisclosure : null, (r39 & 65536) != 0 ? r6.pyusdRewardsCardUiState : pYUSDRewardsCardUiState2, (r39 & 131072) != 0 ? r6.cryptoAssetHoldingData : map2, (r39 & 262144) != 0 ? r6.isRecurringBuysEnabled : false, (r39 & 524288) != 0 ? r6.networkSelectionNetworks : null, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow6.getValue()).networkSelectionSelectedId : null);
                    mutableStateFlow5.setValue(copy4);
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError cryptocurrencyError = (com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.cryptocurrency.LoggerKt.log;
                    str4 = cryptoDetailsViewModel2.getHighSpeedVideoSizes;
                    com.paypal.android.logger.Logger.d$default(logger, "Error loading asset price", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, str4), kotlin.TuplesKt.to("error", cryptocurrencyError.toString())), null, 4, null);
                    mutableStateFlow3 = cryptoDetailsViewModel2.getOutputStallDuration;
                    mutableStateFlow4 = cryptoDetailsViewModel2.getOutputStallDuration;
                    copy2 = r4.copy((r39 & 1) != 0 ? r4.isLoading : true, (r39 & 2) != 0 ? r4.currencyCode : null, (r39 & 4) != 0 ? r4.assetPriceData : null, (r39 & 8) != 0 ? r4.selectedTimeframe : null, (r39 & 16) != 0 ? r4.isLoadingPriceHistory : false, (r39 & 32) != 0 ? r4.priceHistoryData : null, (r39 & 64) != 0 ? r4.assetDescription : null, (r39 & 128) != 0 ? r4.chartInteractionData : null, (r39 & 256) != 0 ? r4.timeframeChangeData : null, (r39 & 512) != 0 ? r4.timeframeForChangeData : null, (r39 & 1024) != 0 ? r4.cryptoDescription : null, (r39 & 2048) != 0 ? r4.cryptoDescriptionLinks : null, (r39 & 4096) != 0 ? r4.cryptoSymbol : null, (r39 & 8192) != 0 ? r4.exchangeRateDisclaimer : null, (r39 & 16384) != 0 ? r4.regulatoryDisclaimer : null, (r39 & 32768) != 0 ? r4.ppdDisclosure : null, (r39 & 65536) != 0 ? r4.pyusdRewardsCardUiState : null, (r39 & 131072) != 0 ? r4.cryptoAssetHoldingData : null, (r39 & 262144) != 0 ? r4.isRecurringBuysEnabled : false, (r39 & 524288) != 0 ? r4.networkSelectionNetworks : null, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow4.getValue()).networkSelectionSelectedId : null);
                    mutableStateFlow3.setValue(copy2);
                    channel = cryptoDetailsViewModel2.getOutputMinFrameDurationlomOqCM;
                    channel.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToErrorScreen.INSTANCE);
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke$default = obj;
        }
        either = (arrow.core.Either) invoke$default;
        cryptoDetailsUseCases2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHolding = cryptoDetailsUseCases2.getGetAssetHolding();
        str2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
        currencyProvider2 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = either;
        this.getHighSpeedVideoSizes = 2;
        invoke = getAssetHolding.invoke(str2, currencyProvider2.getCurrencyCode(), this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$loadAssetPriceDetails$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$loadAssetPriceDetails$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoDetailsViewModel$loadAssetPriceDetails$1(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$loadAssetPriceDetails$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoDetailsViewModel;
    }
}

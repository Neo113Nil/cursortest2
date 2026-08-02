package com.paypal.oslo.feature.cryptocurrency.ui.details;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$enrollForPYUSDRewards$1", f = "CryptoDetailsViewModel.kt", i = {0, 0}, l = {478}, m = "invokeSuspend", n = {"it", "$i$a$-let-CryptoDetailsViewModel$enrollForPYUSDRewards$1$updatedState$1"}, nl = {477}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoDetailsViewModel$enrollForPYUSDRewards$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade pYUSDRewardsCardFacade;
        java.lang.Object enroll;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow7;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow8;
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState copy;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getOutputStallDuration;
            com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pyusdRewardsCardUiState = ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow.getValue()).getPyusdRewardsCardUiState();
            if (pyusdRewardsCardUiState == null || !pyusdRewardsCardUiState.isLoading()) {
                mutableStateFlow2 = this.Camera2StreamConfigurationMap.getOutputStallDuration;
                mutableStateFlow3 = this.Camera2StreamConfigurationMap.getOutputStallDuration;
                mutableStateFlow2.setValue(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiStateKt.setPyusdRewardsLoadingState((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow3.getValue(), true));
                mutableStateFlow4 = this.Camera2StreamConfigurationMap.getOutputStallDuration;
                com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pyusdRewardsCardUiState2 = ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow4.getValue()).getPyusdRewardsCardUiState();
                if (pyusdRewardsCardUiState2 != null) {
                    pYUSDRewardsCardFacade = this.Camera2StreamConfigurationMap.getInputFormats;
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pyusdRewardsCardUiState2);
                    this.getHighResolutionOutputSizeshNQ4ISI = 0;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    enroll = pYUSDRewardsCardFacade.enroll(pyusdRewardsCardUiState2, this);
                    if (enroll == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    pYUSDRewardsCardUiState = null;
                    pYUSDRewardsCardUiState2 = pYUSDRewardsCardUiState;
                    if (pYUSDRewardsCardUiState2 != null) {
                        mutableStateFlow5 = this.Camera2StreamConfigurationMap.getOutputStallDuration;
                        mutableStateFlow6 = this.Camera2StreamConfigurationMap.getOutputStallDuration;
                        mutableStateFlow5.setValue(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiStateKt.setPyusdRewardsLoadingState((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow6.getValue(), false));
                    } else {
                        if (pYUSDRewardsCardUiState2.getStatus().isAccruingRewards()) {
                            channel = this.Camera2StreamConfigurationMap.getOutputMinFrameDurationlomOqCM;
                            channel.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowPYUSDRewardsOptInSuccessBottomSheet.INSTANCE);
                        }
                        mutableStateFlow7 = this.Camera2StreamConfigurationMap.getOutputStallDuration;
                        mutableStateFlow8 = this.Camera2StreamConfigurationMap.getOutputStallDuration;
                        copy = r4.copy((r39 & 1) != 0 ? r4.isLoading : false, (r39 & 2) != 0 ? r4.currencyCode : null, (r39 & 4) != 0 ? r4.assetPriceData : null, (r39 & 8) != 0 ? r4.selectedTimeframe : null, (r39 & 16) != 0 ? r4.isLoadingPriceHistory : false, (r39 & 32) != 0 ? r4.priceHistoryData : null, (r39 & 64) != 0 ? r4.assetDescription : null, (r39 & 128) != 0 ? r4.chartInteractionData : null, (r39 & 256) != 0 ? r4.timeframeChangeData : null, (r39 & 512) != 0 ? r4.timeframeForChangeData : null, (r39 & 1024) != 0 ? r4.cryptoDescription : null, (r39 & 2048) != 0 ? r4.cryptoDescriptionLinks : null, (r39 & 4096) != 0 ? r4.cryptoSymbol : null, (r39 & 8192) != 0 ? r4.exchangeRateDisclaimer : null, (r39 & 16384) != 0 ? r4.regulatoryDisclaimer : null, (r39 & 32768) != 0 ? r4.ppdDisclosure : null, (r39 & 65536) != 0 ? r4.pyusdRewardsCardUiState : pYUSDRewardsCardUiState2, (r39 & 131072) != 0 ? r4.cryptoAssetHoldingData : null, (r39 & 262144) != 0 ? r4.isRecurringBuysEnabled : false, (r39 & 524288) != 0 ? r4.networkSelectionNetworks : null, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow8.getValue()).networkSelectionSelectedId : null);
                        mutableStateFlow7.setValue(copy);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            enroll = obj;
        }
        pYUSDRewardsCardUiState = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState) enroll;
        pYUSDRewardsCardUiState2 = pYUSDRewardsCardUiState;
        if (pYUSDRewardsCardUiState2 != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$enrollForPYUSDRewards$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$enrollForPYUSDRewards$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoDetailsViewModel$enrollForPYUSDRewards$1(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$enrollForPYUSDRewards$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = cryptoDetailsViewModel;
    }
}

package com.paypal.oslo.feature.cryptocurrency.ui.details;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$executePendingAction$1", f = "CryptoDetailsViewModel.kt", i = {0}, l = {503}, m = "invokeSuspend", n = {"isMultichain"}, nl = {504}, s = {"Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoDetailsViewModel$executePendingAction$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0091 A[LOOP:0: B:9:0x008b->B:11:0x0091, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager;
        java.lang.String str;
        com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases cryptoDetailsUseCases;
        java.lang.String str2;
        java.lang.Object invoke;
        java.util.List emptyList;
        java.util.Iterator it;
        java.util.ArrayList arrayList;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.String str3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState copy;
        kotlinx.coroutines.channels.Channel channel2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dynamicConfigurationManager = this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes;
            java.util.List<java.lang.String> multichainAssets = dynamicConfigurationManager.getMultichainAssets();
            str = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            boolean contains = multichainAssets.contains(str);
            if (contains) {
                cryptoDetailsUseCases = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworks = cryptoDetailsUseCases.getGetAvailableNetworks();
                str2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRanges = contains;
                this.getHighSpeedVideoFpsRangesFor = 1;
                invoke = getAvailableNetworks.invoke(str2, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.util.List list = emptyList;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.feature.cryptocurrency.ui.receive.mapper.NetworkOptionMapperKt.toNetworkOption((com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) it.next()));
            }
            arrayList = arrayList2;
            if (arrayList.size() > 1) {
                mutableStateFlow3 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDuration;
                mutableStateFlow4 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDuration;
                copy = r5.copy((r39 & 1) != 0 ? r5.isLoading : false, (r39 & 2) != 0 ? r5.currencyCode : null, (r39 & 4) != 0 ? r5.assetPriceData : null, (r39 & 8) != 0 ? r5.selectedTimeframe : null, (r39 & 16) != 0 ? r5.isLoadingPriceHistory : false, (r39 & 32) != 0 ? r5.priceHistoryData : null, (r39 & 64) != 0 ? r5.assetDescription : null, (r39 & 128) != 0 ? r5.chartInteractionData : null, (r39 & 256) != 0 ? r5.timeframeChangeData : null, (r39 & 512) != 0 ? r5.timeframeForChangeData : null, (r39 & 1024) != 0 ? r5.cryptoDescription : null, (r39 & 2048) != 0 ? r5.cryptoDescriptionLinks : null, (r39 & 4096) != 0 ? r5.cryptoSymbol : null, (r39 & 8192) != 0 ? r5.exchangeRateDisclaimer : null, (r39 & 16384) != 0 ? r5.regulatoryDisclaimer : null, (r39 & 32768) != 0 ? r5.ppdDisclosure : null, (r39 & 65536) != 0 ? r5.pyusdRewardsCardUiState : null, (r39 & 131072) != 0 ? r5.cryptoAssetHoldingData : null, (r39 & 262144) != 0 ? r5.isRecurringBuysEnabled : false, (r39 & 524288) != 0 ? r5.networkSelectionNetworks : arrayList, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow4.getValue()).networkSelectionSelectedId : "");
                mutableStateFlow3.setValue(copy);
                channel2 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDurationlomOqCM;
                channel2.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowNetworkSelectionSheet.INSTANCE);
            } else {
                channel = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDurationlomOqCM;
                str3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDuration;
                com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceData = ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow.getValue()).getAssetPriceData();
                java.lang.String assetName = assetPriceData != null ? assetPriceData.getAssetName() : null;
                java.lang.String str4 = assetName == null ? "" : assetName;
                mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDuration;
                com.paypal.oslo.feature.cryptocurrency.ui.details.components.AssetPriceDetailsData assetPriceData2 = ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow2.getValue()).getAssetPriceData();
                java.lang.String logoUrl = assetPriceData2 != null ? assetPriceData2.getLogoUrl() : null;
                channel.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToReceiveFlow(str3, null, str4, logoUrl == null ? "" : logoUrl, 2, null));
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        invoke = obj;
        arrow.core.Either either = (arrow.core.Either) invoke;
        if (either instanceof arrow.core.Either.Right) {
            emptyList = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            java.util.List list2 = emptyList;
            java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
            }
            arrayList = arrayList22;
            if (arrayList.size() > 1) {
            }
            return kotlin.Unit.INSTANCE;
        }
        if (either instanceof arrow.core.Either.Left) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.util.List list22 = emptyList;
            java.util.ArrayList arrayList222 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list22, 10));
            it = list22.iterator();
            while (it.hasNext()) {
            }
            arrayList = arrayList222;
            if (arrayList.size() > 1) {
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$executePendingAction$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$executePendingAction$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoDetailsViewModel$executePendingAction$1(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$executePendingAction$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoDetailsViewModel;
    }
}

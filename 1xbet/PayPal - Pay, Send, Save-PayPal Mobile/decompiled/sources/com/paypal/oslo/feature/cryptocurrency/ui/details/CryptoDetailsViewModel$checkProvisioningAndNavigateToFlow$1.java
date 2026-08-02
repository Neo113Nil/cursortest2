package com.paypal.oslo.feature.cryptocurrency.ui.details;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1", f = "CryptoDetailsViewModel.kt", i = {}, l = {537}, m = "invokeSuspend", n = {}, nl = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_ATC_OUT_SIDE_PERMISSIBLE_RANGE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.PendingAction getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cryptocurrencyProvisioningCoordinator = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
            java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability> listOf = kotlin.collections.CollectionsKt.listOf(this.getHighSpeedVideoSizes);
            final com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.this, ((java.lang.Boolean) obj2).booleanValue());
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.PendingAction pendingAction = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.this, pendingAction);
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel3 = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.PendingAction pendingAction2 = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.this, pendingAction2, (java.lang.String) obj2);
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel4 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            if (cryptocurrencyProvisioningCoordinator.checkProvisioningAndExecute(listOf, function1, function0, function12, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.this);
                }
            }, this) == coroutine_suspended) {
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel, boolean z) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState copy;
        mutableStateFlow = cryptoDetailsViewModel.getOutputStallDuration;
        mutableStateFlow2 = cryptoDetailsViewModel.getOutputStallDuration;
        copy = r0.copy((r39 & 1) != 0 ? r0.isLoading : z, (r39 & 2) != 0 ? r0.currencyCode : null, (r39 & 4) != 0 ? r0.assetPriceData : null, (r39 & 8) != 0 ? r0.selectedTimeframe : null, (r39 & 16) != 0 ? r0.isLoadingPriceHistory : false, (r39 & 32) != 0 ? r0.priceHistoryData : null, (r39 & 64) != 0 ? r0.assetDescription : null, (r39 & 128) != 0 ? r0.chartInteractionData : null, (r39 & 256) != 0 ? r0.timeframeChangeData : null, (r39 & 512) != 0 ? r0.timeframeForChangeData : null, (r39 & 1024) != 0 ? r0.cryptoDescription : null, (r39 & 2048) != 0 ? r0.cryptoDescriptionLinks : null, (r39 & 4096) != 0 ? r0.cryptoSymbol : null, (r39 & 8192) != 0 ? r0.exchangeRateDisclaimer : null, (r39 & 16384) != 0 ? r0.regulatoryDisclaimer : null, (r39 & 32768) != 0 ? r0.ppdDisclosure : null, (r39 & 65536) != 0 ? r0.pyusdRewardsCardUiState : null, (r39 & 131072) != 0 ? r0.cryptoAssetHoldingData : null, (r39 & 262144) != 0 ? r0.isRecurringBuysEnabled : false, (r39 & 524288) != 0 ? r0.networkSelectionNetworks : null, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow2.getValue()).networkSelectionSelectedId : null);
        mutableStateFlow.setValue(copy);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState copy;
        kotlinx.coroutines.channels.Channel channel;
        mutableStateFlow = cryptoDetailsViewModel.getOutputStallDuration;
        mutableStateFlow2 = cryptoDetailsViewModel.getOutputStallDuration;
        copy = r2.copy((r39 & 1) != 0 ? r2.isLoading : true, (r39 & 2) != 0 ? r2.currencyCode : null, (r39 & 4) != 0 ? r2.assetPriceData : null, (r39 & 8) != 0 ? r2.selectedTimeframe : null, (r39 & 16) != 0 ? r2.isLoadingPriceHistory : false, (r39 & 32) != 0 ? r2.priceHistoryData : null, (r39 & 64) != 0 ? r2.assetDescription : null, (r39 & 128) != 0 ? r2.chartInteractionData : null, (r39 & 256) != 0 ? r2.timeframeChangeData : null, (r39 & 512) != 0 ? r2.timeframeForChangeData : null, (r39 & 1024) != 0 ? r2.cryptoDescription : null, (r39 & 2048) != 0 ? r2.cryptoDescriptionLinks : null, (r39 & 4096) != 0 ? r2.cryptoSymbol : null, (r39 & 8192) != 0 ? r2.exchangeRateDisclaimer : null, (r39 & 16384) != 0 ? r2.regulatoryDisclaimer : null, (r39 & 32768) != 0 ? r2.ppdDisclosure : null, (r39 & 65536) != 0 ? r2.pyusdRewardsCardUiState : null, (r39 & 131072) != 0 ? r2.cryptoAssetHoldingData : null, (r39 & 262144) != 0 ? r2.isRecurringBuysEnabled : false, (r39 & 524288) != 0 ? r2.networkSelectionNetworks : null, (r39 & 1048576) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsUiState) mutableStateFlow2.getValue()).networkSelectionSelectedId : null);
        mutableStateFlow.setValue(copy);
        channel = cryptoDetailsViewModel.getOutputMinFrameDurationlomOqCM;
        channel.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToErrorScreen.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel, com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.PendingAction pendingAction, java.lang.String str) {
        kotlinx.coroutines.channels.Channel channel;
        cryptoDetailsViewModel.Camera2StreamConfigurationMap.set("pending_action", r2 != null ? pendingAction.name() : null);
        channel = cryptoDetailsViewModel.getOutputMinFrameDurationlomOqCM;
        channel.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowProvisioningFlow(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel, com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.PendingAction pendingAction) {
        cryptoDetailsViewModel.getHighResolutionOutputSizeshNQ4ISI(pendingAction);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel, com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability, com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.PendingAction pendingAction, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$checkProvisioningAndNavigateToFlow$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoDetailsViewModel;
        this.getHighSpeedVideoSizes = flowCapability;
        this.getHighSpeedVideoFpsRangesFor = pendingAction;
    }
}

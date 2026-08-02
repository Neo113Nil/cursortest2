package com.paypal.oslo.feature.cryptocurrency.ui.hub;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1", f = "CryptoHubViewModel.kt", i = {}, l = {318}, m = "invokeSuspend", n = {}, nl = {com.visa.cbp.getCertUsage.getODAData}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cryptocurrencyProvisioningCoordinator = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration;
            java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability> listOf = kotlin.collections.CollectionsKt.listOf(this.Camera2StreamConfigurationMap);
            final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.this, ((java.lang.Boolean) obj2).booleanValue());
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel2 = this.getHighSpeedVideoFpsRanges;
            final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction pendingAction = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.this, pendingAction);
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel3 = this.getHighSpeedVideoFpsRanges;
            final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction pendingAction2 = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.this, pendingAction2, (java.lang.String) obj2);
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel4 = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (cryptocurrencyProvisioningCoordinator.checkProvisioningAndExecute(listOf, function1, function0, function12, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.this);
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel, boolean z) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        mutableStateFlow = cryptoHubViewModel.getHighSpeedVideoSizesFor;
        mutableStateFlow2 = cryptoHubViewModel.getHighSpeedVideoSizesFor;
        mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) mutableStateFlow2.getValue(), z, null, 2, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel, com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction pendingAction, java.lang.String str) {
        kotlinx.coroutines.channels.Channel channel;
        cryptoHubViewModel.getHighSpeedVideoFpsRanges.set("pending_action", r2 != null ? pendingAction.name() : null);
        channel = cryptoHubViewModel.getOutputFormats;
        channel.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowProvisioningFlow(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel, com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction pendingAction) {
        cryptoHubViewModel.getHighSpeedVideoFpsRangesFor(pendingAction);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.channels.Channel channel;
        mutableStateFlow = cryptoHubViewModel.getHighSpeedVideoSizesFor;
        mutableStateFlow2 = cryptoHubViewModel.getHighSpeedVideoSizesFor;
        mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubUiState) mutableStateFlow2.getValue(), true, null, 2, null));
        channel = cryptoHubViewModel.getOutputFormats;
        channel.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToErrorScreen.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1(com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel cryptoHubViewModel, com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability, com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel.PendingAction pendingAction, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.hub.CryptoHubViewModel$checkProvisioningAndNavigateToFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = cryptoHubViewModel;
        this.Camera2StreamConfigurationMap = flowCapability;
        this.getHighSpeedVideoSizes = pendingAction;
    }
}

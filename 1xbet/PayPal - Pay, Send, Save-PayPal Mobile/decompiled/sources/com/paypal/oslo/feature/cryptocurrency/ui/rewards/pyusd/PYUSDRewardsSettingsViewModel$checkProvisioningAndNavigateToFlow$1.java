package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1", f = "PYUSDRewardsSettingsViewModel.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, nl = {192}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cryptocurrencyProvisioningCoordinator = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability> listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.BUY_SELL_CRYPTO);
            final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel.this, ((java.lang.Boolean) obj2).booleanValue());
                }
            };
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoSizes;
            final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel.this, (java.lang.String) obj2);
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel3 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            if (cryptocurrencyProvisioningCoordinator.checkProvisioningAndExecute(listOf, function1, function0, function12, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel.this);
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

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        mutableStateFlow = pYUSDRewardsSettingsViewModel.getInputSizeshNQ4ISI;
        mutableStateFlow2 = pYUSDRewardsSettingsViewModel.getInputSizeshNQ4ISI;
        mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) mutableStateFlow2.getValue(), false, true, null, false, false, false, 61, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel, boolean z) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        mutableStateFlow = pYUSDRewardsSettingsViewModel.getInputSizeshNQ4ISI;
        mutableStateFlow2 = pYUSDRewardsSettingsViewModel.getInputSizeshNQ4ISI;
        mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState.copy$default((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState) mutableStateFlow2.getValue(), z, false, null, false, false, false, 62, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel, java.lang.String str) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        mutableSharedFlow = pYUSDRewardsSettingsViewModel.getOutputFormats;
        mutableSharedFlow.tryEmit(new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect.ShowProvisioningFlow(str));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel$checkProvisioningAndNavigateToFlow$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pYUSDRewardsSettingsViewModel;
        this.getHighSpeedVideoSizes = function0;
    }
}

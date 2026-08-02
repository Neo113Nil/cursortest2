package com.paypal.oslo.feature.cryptocurrency.ui.loyalty;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1", f = "LoyaltyCryptoEntryViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, nl = {74}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cryptocurrencyProvisioningCoordinator = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability> listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.BUY_CRYPTO);
            final com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel.this, ((java.lang.Boolean) obj2).booleanValue());
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel2 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel.this);
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel3 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel.this, (java.lang.String) obj2);
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel4 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (cryptocurrencyProvisioningCoordinator.checkProvisioningAndExecute(listOf, function1, function0, function12, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel.this);
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        mutableStateFlow = loyaltyCryptoEntryViewModel.getHighSpeedVideoFpsRangesFor;
        mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState.ERROR);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel, java.lang.String str) {
        kotlinx.coroutines.channels.Channel channel;
        channel = loyaltyCryptoEntryViewModel.Camera2StreamConfigurationMap;
        channel.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect.ShowProvisioningFlow(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel) {
        kotlinx.coroutines.channels.Channel channel;
        channel = loyaltyCryptoEntryViewModel.Camera2StreamConfigurationMap;
        channel.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryEffect.NavigateToAssetSelection.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel, boolean z) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        if (z) {
            mutableStateFlow = loyaltyCryptoEntryViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.model.LoyaltyCryptoEntryUiState.LOADING);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1(com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel loyaltyCryptoEntryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.loyalty.LoyaltyCryptoEntryViewModel$checkProvisioningAndProceed$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = loyaltyCryptoEntryViewModel;
    }
}

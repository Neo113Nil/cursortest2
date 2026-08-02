package com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1", f = "ProvisioningGateViewModel.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, nl = {67}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ProvisioningGateViewModel$checkProvisioning$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator;
        com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability flowCapability;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cryptocurrencyProvisioningCoordinator = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            flowCapability = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability> listOf = kotlin.collections.CollectionsKt.listOf(flowCapability);
            final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel provisioningGateViewModel = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.this, ((java.lang.Boolean) obj2).booleanValue());
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel provisioningGateViewModel2 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.this);
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel provisioningGateViewModel3 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.this, (java.lang.String) obj2);
                }
            };
            final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel provisioningGateViewModel4 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (cryptocurrencyProvisioningCoordinator.checkProvisioningAndExecute(listOf, function1, function0, function12, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel.this);
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel provisioningGateViewModel) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        mutableStateFlow = provisioningGateViewModel.getHighSpeedVideoFpsRangesFor;
        mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Provisioned.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel provisioningGateViewModel, java.lang.String str) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        mutableStateFlow = provisioningGateViewModel.getHighSpeedVideoFpsRangesFor;
        mutableStateFlow.setValue(new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.NeedsProvisioning(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel provisioningGateViewModel, boolean z) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        if (z) {
            mutableStateFlow = provisioningGateViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Loading.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel provisioningGateViewModel) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        mutableStateFlow = provisioningGateViewModel.getHighSpeedVideoFpsRangesFor;
        mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.Error.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProvisioningGateViewModel$checkProvisioning$1(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel provisioningGateViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateViewModel$checkProvisioning$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = provisioningGateViewModel;
    }
}

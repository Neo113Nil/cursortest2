package com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$ProvisioningGateContent$2$1", f = "ProvisioningGate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ProvisioningGateKt$ProvisioningGateContent$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.getHighSpeedVideoFpsRanges.getValue().booleanValue()) {
            this.getHighSpeedVideoFpsRanges.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String str = this.Camera2StreamConfigurationMap;
            final com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState provisioningGateState = this.getHighSpeedVideoSizes;
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$ProvisioningGateContent$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$ProvisioningGateContent$2$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState provisioningGateState, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination(((com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState.NeedsProvisioning) provisioningGateState).getIntent()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$ProvisioningGateContent$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$ProvisioningGateContent$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProvisioningGateKt$ProvisioningGateContent$2$1(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateState provisioningGateState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.common.provisioning.ProvisioningGateKt$ProvisioningGateContent$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = provisioningGateState;
    }
}

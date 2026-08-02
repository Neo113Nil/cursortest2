package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUiKt$PayPalInitiatedProvisionFlowUi$1$1", f = "PayPalInitiatedProvisionFlowUi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PayPalInitiatedProvisionFlowUiKt$PayPalInitiatedProvisionFlowUi$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.Camera2StreamConfigurationMap;
        final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated payPalInitiated = this.getHighSpeedVideoSizes;
        final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUiKt$PayPalInitiatedProvisionFlowUi$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUiKt$PayPalInitiatedProvisionFlowUi$1$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated.this, str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated payPalInitiated, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(new com.paypal.oslo.feature.wallet.wallet.ui.Destination.ProvisionInstrumentsDestination(payPalInitiated, str));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUiKt$PayPalInitiatedProvisionFlowUi$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUiKt$PayPalInitiatedProvisionFlowUi$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalInitiatedProvisionFlowUiKt$PayPalInitiatedProvisionFlowUi$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated payPalInitiated, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.amexandp3.ui.PayPalInitiatedProvisionFlowUiKt$PayPalInitiatedProvisionFlowUi$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoSizes = payPalInitiated;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}

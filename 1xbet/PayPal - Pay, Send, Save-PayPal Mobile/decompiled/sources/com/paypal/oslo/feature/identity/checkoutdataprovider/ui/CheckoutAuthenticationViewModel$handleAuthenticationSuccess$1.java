package com.paypal.oslo.feature.identity.checkoutdataprovider.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel$handleAuthenticationSuccess$1", f = "CheckoutAuthenticationViewModel.kt", i = {0, 0, 0}, l = {91}, m = "invokeSuspend", n = {com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.KeyAuthCodeParam, "checkoutData", "result"}, nl = {101}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class CheckoutAuthenticationViewModel$handleAuthenticationSuccess$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore authCodeDataStore;
        com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore checkoutOutputDataStore;
        com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker identityAnalyticsTracker;
        kotlinx.coroutines.channels.Channel channel;
        com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore checkoutInputDataStore;
        com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore checkoutOutputDataStore2;
        com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore authCodeDataStore2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            authCodeDataStore = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String authCode = authCodeDataStore.getAuthCode();
            checkoutOutputDataStore = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutOutputData = checkoutOutputDataStore.getCheckoutOutputData();
            com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData = new com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData(authCode, checkoutOutputData);
            identityAnalyticsTracker = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            identityAnalyticsTracker.trackLoginSuccess();
            channel = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authCode);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutOutputData);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutAuthenticationSuccessData);
            this.Camera2StreamConfigurationMap = 1;
            if (channel.send(new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect.ReturnCheckoutSuccess(new com.paypal.oslo.feature.identity.api.navigation.result.CheckoutAuthenticationNavResult(arrow.core.EitherKt.right(checkoutAuthenticationSuccessData))), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        checkoutInputDataStore = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
        checkoutInputDataStore.clearCheckoutInputData();
        checkoutOutputDataStore2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
        checkoutOutputDataStore2.clearCheckoutOutputData();
        authCodeDataStore2 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
        authCodeDataStore2.clearAuthCode();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel$handleAuthenticationSuccess$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel$handleAuthenticationSuccess$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutAuthenticationViewModel$handleAuthenticationSuccess$1(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel checkoutAuthenticationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel$handleAuthenticationSuccess$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = checkoutAuthenticationViewModel;
    }
}

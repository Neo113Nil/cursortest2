package com.paypal.oslo.feature.inappcheckout.features.webview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler$handleCheckoutAuthenticationResult$2$1", f = "WebViewAuthenticationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class WebViewAuthenticationHandler$handleCheckoutAuthenticationResult$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.ProcessOneShotAuthenticationDataUseCase processOneShotAuthenticationDataUseCase;
        com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession;
        com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                processOneShotAuthenticationDataUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences invoke = processOneShotAuthenticationDataUseCase.invoke(this.getHighSpeedVideoFpsRangesFor);
                appSwitchSession = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                appSwitchSession.setCheckoutPreferences(invoke);
                kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs = invoke.getCheckoutURLs();
                appSwitchSession2 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                function1.invoke(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ReadyForCheckout(checkoutURLs, appSwitchSession2.getGetHighSpeedVideoSizes()));
            } catch (java.lang.IllegalStateException e) {
                checkoutLogger = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutLogger, com.paypal.android.logger.categories.Presentation.Error.INSTANCE, "Failed to process authentication result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.toString())), null, e, 8, null);
                this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event.ShowError(true, null));
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler$handleCheckoutAuthenticationResult$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler$handleCheckoutAuthenticationResult$2$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WebViewAuthenticationHandler$handleCheckoutAuthenticationResult$2$1(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler webViewAuthenticationHandler, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Event, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler$handleCheckoutAuthenticationResult$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = webViewAuthenticationHandler;
        this.getHighSpeedVideoFpsRangesFor = checkoutAuthenticationSuccessData;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}

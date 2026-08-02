package com.paypal.oslo.feature.inappcheckout.features.webview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler$handleAuthenticationEffect$1", f = "WebViewAuthenticationHandler.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, nl = {58}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class WebViewAuthenticationHandler$handleAuthenticationEffect$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData>, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            navResultManager = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow<java.lang.Object> m11582getScopedResultFlowInternalDpEMydE = navResultManager.m11582getScopedResultFlowInternalDpEMydE(this.Camera2StreamConfigurationMap.m15446getRequestIdQDVFmTU());
            if (m11582getScopedResultFlowInternalDpEMydE != null) {
                final kotlin.jvm.functions.Function1<arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData>, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = 1;
                if (m11582getScopedResultFlowInternalDpEMydE.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler$handleAuthenticationEffect$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        function1.invoke((arrow.core.Either) obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler$handleAuthenticationEffect$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler$handleAuthenticationEffect$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WebViewAuthenticationHandler$handleAuthenticationEffect$1(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler webViewAuthenticationHandler, com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication navigateToCheckoutAuthentication, kotlin.jvm.functions.Function1<? super arrow.core.Either<com.paypal.oslo.feature.identity.api.navigation.result.UserCanceled, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.features.webview.WebViewAuthenticationHandler$handleAuthenticationEffect$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = webViewAuthenticationHandler;
        this.Camera2StreamConfigurationMap = navigateToCheckoutAuthentication;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}

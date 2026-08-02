package com.paypal.oslo.feature.inappcheckout.features.webview.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$1$1", f = "AppSwitchWebViewScreen.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect> sharedFlow = this.getHighSpeedVideoFpsRangesFor;
            final com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions = this.getHighSpeedVideoFpsRanges;
            final android.content.Context context = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            if (sharedFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    android.net.Uri uri;
                    com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect effect = (com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect) obj2;
                    if (effect instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ReturnToMerchantAutomatically) {
                        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UrlLoadingInterceptingAction.RunIntent action = ((com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ReturnToMerchantAutomatically) effect).getAction();
                        if (!action.isUriValid()) {
                            action = null;
                        }
                        if (action != null && (uri = action.getUri()) != null) {
                            android.content.Context context2 = context;
                            context2.startActivity(com.paypal.oslo.feature.inappcheckout.extensions.UriExtensionKt.buildIntent(uri, context2));
                        }
                        com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions.this.getOnNavigateToHome().invoke();
                    } else if (effect instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.ForceCanceling) {
                        com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions.this.getOnNavigateToHome().invoke();
                    } else {
                        if (!(effect instanceof com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication navigateToCheckoutAuthentication = (com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect.NavigateToCheckoutAuthentication) effect;
                        com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions.this.getOnNavigateToCheckoutAuthentication().invoke(navigateToCheckoutAuthentication.getCheckoutAuthenticationContext(), com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(navigateToCheckoutAuthentication.m15446getRequestIdQDVFmTU()));
                    }
                    return kotlin.Unit.INSTANCE;
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
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$1$1(kotlinx.coroutines.flow.SharedFlow<? extends com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect> sharedFlow, com.paypal.oslo.feature.inappcheckout.features.webview.screen.actions.WebViewScreenActions webViewScreenActions, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt$AppSwitchWebViewScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = sharedFlow;
        this.getHighSpeedVideoFpsRanges = webViewScreenActions;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }
}

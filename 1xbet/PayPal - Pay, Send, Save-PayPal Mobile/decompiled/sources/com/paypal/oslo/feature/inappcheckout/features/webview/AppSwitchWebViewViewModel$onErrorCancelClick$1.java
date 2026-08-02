package com.paypal.oslo.feature.inappcheckout.features.webview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$onErrorCancelClick$1", f = "AppSwitchWebViewViewModel.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, nl = {150}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AppSwitchWebViewViewModel$onErrorCancelClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler returnToMerchantHandler;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            returnToMerchantHandler = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (returnToMerchantHandler.cancelAndSwitchBackToMerchant(this.getHighResolutionOutputSizeshNQ4ISI.getUniversalLinkData(), null, new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$onErrorCancelClick$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$onErrorCancelClick$1$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect, kotlin.Unit> {
        public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect effect) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effect, "");
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$emitEffect$1((com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel) this.receiver, effect, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.Effect effect) {
            getHighSpeedVideoFpsRanges(effect);
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(java.lang.Object obj) {
            super(1, obj, com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.class, "emitEffect", "emitEffect(Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$Effect;)V", 0);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$onErrorCancelClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$onErrorCancelClick$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSwitchWebViewViewModel$onErrorCancelClick$1(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel appSwitchWebViewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel$onErrorCancelClick$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appSwitchWebViewViewModel;
    }
}

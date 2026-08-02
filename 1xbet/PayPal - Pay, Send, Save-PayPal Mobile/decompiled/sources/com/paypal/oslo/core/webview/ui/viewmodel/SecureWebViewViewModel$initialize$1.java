package com.paypal.oslo.core.webview.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$initialize$1", f = "SecureWebViewViewModel.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class SecureWebViewViewModel$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.webview.ui.config.SecureWebViewContent getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success success;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.core.webview.ui.config.SecureWebViewContent secureWebViewContent = this.getHighSpeedVideoFpsRanges;
            if (!(secureWebViewContent instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url)) {
                if (!(secureWebViewContent instanceof com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Html)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                success = new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success(new com.paypal.oslo.core.webview.ui.state.LoadableContent.Html(((com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Html) secureWebViewContent).getData()));
                mutableStateFlow.setValue(success);
                return kotlin.Unit.INSTANCE;
            }
            this.Camera2StreamConfigurationMap = mutableStateFlow;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.lang.Object access$processUrl = com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel.access$processUrl(this.getHighSpeedVideoSizes, (com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url) secureWebViewContent, this);
            if (access$processUrl == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableStateFlow2 = mutableStateFlow;
            obj = access$processUrl;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow2 = (kotlinx.coroutines.flow.MutableStateFlow) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3 = mutableStateFlow2;
        success = (com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState) obj;
        mutableStateFlow = mutableStateFlow3;
        mutableStateFlow.setValue(success);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$initialize$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecureWebViewViewModel$initialize$1(com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel secureWebViewViewModel, com.paypal.oslo.core.webview.ui.config.SecureWebViewContent secureWebViewContent, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.webview.ui.viewmodel.SecureWebViewViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = secureWebViewViewModel;
        this.getHighSpeedVideoFpsRanges = secureWebViewContent;
    }
}

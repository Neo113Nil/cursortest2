package com.paypal.oslo.core.webview.ui.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$SecureWebViewContentSection$4$1", f = "SecureWebViewContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class SecureWebViewContentKt$SecureWebViewContentSection$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.webview.ui.state.LoadableContent getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.webview.ui.compose.WebViewState getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.webview.ui.state.LoadableContent loadableContent = this.getHighSpeedVideoFpsRanges;
        if (loadableContent instanceof com.paypal.oslo.core.webview.ui.state.LoadableContent.Url) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.getHighResolutionOutputSizeshNQ4ISI), kotlin.TuplesKt.to("header_count", java.lang.String.valueOf(((com.paypal.oslo.core.webview.ui.state.LoadableContent.Url) this.getHighSpeedVideoFpsRanges).getAdditionalHttpHeaders().size())));
            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", ((com.paypal.oslo.core.webview.ui.state.LoadableContent.Url) this.getHighSpeedVideoFpsRanges).getUrl()));
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.loadUrl(((com.paypal.oslo.core.webview.ui.state.LoadableContent.Url) this.getHighSpeedVideoFpsRanges).getUrl(), ((com.paypal.oslo.core.webview.ui.state.LoadableContent.Url) this.getHighSpeedVideoFpsRanges).getAdditionalHttpHeaders());
        } else {
            if (!(loadableContent instanceof com.paypal.oslo.core.webview.ui.state.LoadableContent.Html)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] loading HTML content", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", this.getHighResolutionOutputSizeshNQ4ISI)), null, 4, null);
            byte[] bytes = ((com.paypal.oslo.core.webview.ui.state.LoadableContent.Html) this.getHighSpeedVideoFpsRanges).getData().getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.loadData(android.util.Base64.encodeToString(bytes, 2), "text/html; charset=utf-8", "base64");
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$SecureWebViewContentSection$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$SecureWebViewContentSection$4$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecureWebViewContentKt$SecureWebViewContentSection$4$1(com.paypal.oslo.core.webview.ui.state.LoadableContent loadableContent, java.lang.String str, com.paypal.oslo.core.webview.ui.compose.WebViewState webViewState, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.webview.ui.compose.SecureWebViewContentKt$SecureWebViewContentSection$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = loadableContent;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = webViewState;
    }
}

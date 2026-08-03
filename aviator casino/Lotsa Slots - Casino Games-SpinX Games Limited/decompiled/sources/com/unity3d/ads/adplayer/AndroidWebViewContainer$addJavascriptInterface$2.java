package com.unity3d.ads.adplayer;

/* compiled from: AndroidWebViewContainer.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", f = "AndroidWebViewContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidWebViewContainer$addJavascriptInterface$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $name;
    final /* synthetic */ com.unity3d.ads.adplayer.WebViewBridge $webViewBridgeInterface;
    int label;
    final /* synthetic */ com.unity3d.ads.adplayer.AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidWebViewContainer$addJavascriptInterface$2(com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer, java.lang.String str, com.unity3d.ads.adplayer.WebViewBridge webViewBridge, kotlin.coroutines.Continuation<? super com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2> continuation) {
        super(2, continuation);
        this.this$0 = androidWebViewContainer;
        this.$name = str;
        this.$webViewBridgeInterface = webViewBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2(this.this$0, this.$name, this.$webViewBridgeInterface, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.unity3d.ads.adplayer.WebViewBridge webViewBridge = this.$webViewBridgeInterface;
        this.this$0.getWebView().addJavascriptInterface(new com.unity3d.ads.adplayer.model.WebViewBridgeInterface() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1
            @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
            @android.webkit.JavascriptInterface
            public void handleInvocation(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                com.unity3d.ads.adplayer.WebViewBridge.this.handleInvocation(message);
            }

            @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
            @android.webkit.JavascriptInterface
            public void handleCallback(java.lang.String callbackId, java.lang.String callbackStatus, java.lang.String rawParameters) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackId, "callbackId");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackStatus, "callbackStatus");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawParameters, "rawParameters");
                com.unity3d.ads.adplayer.WebViewBridge.this.handleCallback(callbackId, callbackStatus, rawParameters);
            }
        }, this.$name);
        return kotlin.Unit.INSTANCE;
    }
}

package com.adobe.marketing.mobile.services.ui.message;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler$evaluateJavascript$1", f = "DefaultInAppMessageEventHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class DefaultInAppMessageEventHandler$evaluateJavascript$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.adobe.marketing.mobile.AdobeCallback<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ android.webkit.WebView getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.webkit.WebView webView = this.getHighSpeedVideoFpsRanges;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        final com.adobe.marketing.mobile.AdobeCallback<java.lang.String> adobeCallback = this.Camera2StreamConfigurationMap;
        webView.evaluateJavascript(str, new android.webkit.ValueCallback() { // from class: com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler$evaluateJavascript$1$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj2) {
                com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler$evaluateJavascript$1.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback.this, (java.lang.String) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.AdobeCallback adobeCallback, java.lang.String str) {
        com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DefaultInAppMessageEventHandler", "Invoking callback with result: ".concat(java.lang.String.valueOf(str)), new java.lang.Object[0]);
        adobeCallback.call(str);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler$evaluateJavascript$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler$evaluateJavascript$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultInAppMessageEventHandler$evaluateJavascript$1(android.webkit.WebView webView, java.lang.String str, com.adobe.marketing.mobile.AdobeCallback<java.lang.String> adobeCallback, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler$evaluateJavascript$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = webView;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = adobeCallback;
    }
}

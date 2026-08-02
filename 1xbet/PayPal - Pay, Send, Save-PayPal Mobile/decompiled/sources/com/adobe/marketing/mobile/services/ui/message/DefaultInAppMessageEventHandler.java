package com.adobe.marketing.mobile.services.ui.message;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002!\"B%\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR4\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001c8A@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/DefaultInAppMessageEventHandler;", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageEventHandler;", "", "", "Lcom/adobe/marketing/mobile/services/ui/message/DefaultInAppMessageEventHandler$WebViewJavascriptInterface;", "scriptHandlers", "Lkotlinx/coroutines/CoroutineScope;", "mainScope", "<init>", "(Ljava/util/Map;Lkotlinx/coroutines/CoroutineScope;)V", "jsContent", "Lcom/adobe/marketing/mobile/AdobeCallback;", com.sun.jna.Callback.METHOD_NAME, "", "evaluateJavascript", "(Ljava/lang/String;Lcom/adobe/marketing/mobile/AdobeCallback;)V", "handlerName", "handleJavascriptMessage", "Landroid/webkit/WebView;", "webView", "onNewWebView$core_phoneRelease", "(Landroid/webkit/WebView;)V", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/ref/WeakReference;", "p0", "Ljava/lang/ref/WeakReference;", "getWebView$core_phoneRelease", "()Ljava/lang/ref/WeakReference;", "Companion", "WebViewJavascriptInterface"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultInAppMessageEventHandler implements com.adobe.marketing.mobile.services.ui.message.InAppMessageEventHandler {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler.WebViewJavascriptInterface> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;
    private java.lang.ref.WeakReference<android.webkit.WebView> webView;

    public DefaultInAppMessageEventHandler(java.util.Map<java.lang.String, com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler.WebViewJavascriptInterface> map, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighResolutionOutputSizeshNQ4ISI = map;
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        this.webView = new java.lang.ref.WeakReference<>(null);
    }

    public final java.lang.ref.WeakReference<android.webkit.WebView> getWebView$core_phoneRelease() {
        return this.webView;
    }

    @Override // com.adobe.marketing.mobile.services.ui.message.InAppMessageEventHandler
    public final void handleJavascriptMessage(java.lang.String handlerName, final com.adobe.marketing.mobile.AdobeCallback<java.lang.String> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler.WebViewJavascriptInterface webViewJavascriptInterface = new com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler.WebViewJavascriptInterface(new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler$handleJavascriptMessage$javascriptInterface$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                getHighSpeedVideoSizes(str);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                callback.call(str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI.put(handlerName, webViewJavascriptInterface);
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DefaultInAppMessageEventHandler", "Adding javascript interface for handler: ".concat(java.lang.String.valueOf(handlerName)), new java.lang.Object[0]);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler$handleJavascriptMessage$1(this, webViewJavascriptInterface, handlerName, null), 3, null);
    }

    @Override // com.adobe.marketing.mobile.services.ui.message.InAppMessageEventHandler
    public final void evaluateJavascript(java.lang.String jsContent, com.adobe.marketing.mobile.AdobeCallback<java.lang.String> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        if (jsContent.length() == 0) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DefaultInAppMessageEventHandler", "Javascript content is empty. Cannot evaluate javascript.", new java.lang.Object[0]);
            return;
        }
        android.webkit.WebView webView = this.webView.get();
        if (webView == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DefaultInAppMessageEventHandler", "Web view is null. Cannot evaluate javascript.", new java.lang.Object[0]);
            return;
        }
        try {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler$evaluateJavascript$1(webView, java.net.URLDecoder.decode(jsContent, "UTF-8"), callback, null), 3, null);
        } catch (java.io.UnsupportedEncodingException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported encoding exception while decoding javascript content. ");
            sb.append(e.getMessage());
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DefaultInAppMessageEventHandler", sb.toString(), new java.lang.Object[0]);
        }
    }

    public final void onNewWebView$core_phoneRelease(android.webkit.WebView webView) {
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DefaultInAppMessageEventHandler", "Internal web view was reset.", new java.lang.Object[0]);
        if (webView != null) {
            this.webView = new java.lang.ref.WeakReference<>(webView);
            for (java.util.Map.Entry<java.lang.String, com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler.WebViewJavascriptInterface> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
                java.lang.String key = entry.getKey();
                com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler.WebViewJavascriptInterface value = entry.getValue();
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DefaultInAppMessageEventHandler", "Re-adding javascript interface for handler: ".concat(java.lang.String.valueOf(key)), new java.lang.Object[0]);
                webView.addJavascriptInterface(value, key);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/DefaultInAppMessageEventHandler$WebViewJavascriptInterface;", "", "Lkotlin/Function1;", "", "", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Lkotlin/jvm/functions/Function1;)V", "js", "run", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WebViewJavascriptInterface {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Multi-variable type inference failed */
        public WebViewJavascriptInterface(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.getHighSpeedVideoFpsRangesFor = function1;
        }

        @android.webkit.JavascriptInterface
        public final void run(java.lang.String js) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(js, "");
            this.getHighSpeedVideoFpsRangesFor.invoke(js);
        }
    }
}

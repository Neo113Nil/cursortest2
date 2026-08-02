package com.adobe.marketing.mobile.services.ui.message;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageWebViewClient;", "Landroid/webkit/WebViewClient;", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;", "messageSettings", "Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;", "presentationUtilityProvider", "Lkotlin/Function1;", "", "", "onUrlLoading", "<init>", "(Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;Lkotlin/jvm/functions/Function1;)V", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "getHighSpeedVideoSizes", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "Lcom/adobe/marketing/mobile/services/ui/PresentationUtilityProvider;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class InAppMessageWebViewClient extends android.webkit.WebViewClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.services.ui.message.InAppMessageWebViewClient.Companion INSTANCE = new com.adobe.marketing.mobile.services.ui.message.InAppMessageWebViewClient.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> Camera2StreamConfigurationMap;
    private final com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public InAppMessageWebViewClient(com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings, com.adobe.marketing.mobile.services.ui.PresentationUtilityProvider presentationUtilityProvider, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppMessageSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentationUtilityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = inAppMessageSettings;
        this.getHighSpeedVideoFpsRanges = presentationUtilityProvider;
        this.Camera2StreamConfigurationMap = function1;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageWebViewClient$Companion;", "", "<init>", "()V", "", "stringUrl", "", "isValidUrl", "(Ljava/lang/String;)Z"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isValidUrl(java.lang.String stringUrl) {
            java.lang.String str = stringUrl;
            if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                return false;
            }
            try {
                new java.net.URL(stringUrl);
                return true;
            } catch (java.net.MalformedURLException unused) {
                return false;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        android.net.Uri url = request != null ? request.getUrl() : null;
        java.lang.String obj = url != null ? url.toString() : null;
        java.lang.String str = obj;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "InAppMessageWebViewClient", "Unable to handle a null or empty url.", new java.lang.Object[0]);
            return true;
        }
        return this.Camera2StreamConfigurationMap.invoke(obj).booleanValue();
    }

    @Override // android.webkit.WebViewClient
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.lang.String obj = request.getUrl().toString();
        java.lang.String str = obj;
        android.webkit.WebResourceResponse webResourceResponse = null;
        if (str == null || kotlin.text.StringsKt.isBlank(str) || !INSTANCE.isValidUrl(obj)) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "InAppMessageWebViewClient", "Cannot handle url: ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        } else {
            java.lang.String str2 = this.getHighSpeedVideoSizes.getAssetMap().get(obj);
            java.lang.String str3 = str2;
            if (str3 == null || kotlin.text.StringsKt.isBlank(str3)) {
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "InAppMessageWebViewClient", "No cache location found for url: ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
            } else {
                java.io.InputStream cachedContent = this.getHighSpeedVideoFpsRanges.getCachedContent(str2, obj);
                if (cachedContent == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Cached asset not found for url: ");
                    sb.append(obj);
                    sb.append(" from cache location ");
                    sb.append(str2);
                    sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "InAppMessageWebViewClient", sb.toString(), new java.lang.Object[0]);
                } else {
                    webResourceResponse = new android.webkit.WebResourceResponse(android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(android.webkit.MimeTypeMap.getFileExtensionFromUrl(obj)), null, cachedContent);
                }
            }
        }
        return webResourceResponse == null ? super.shouldInterceptRequest(view, request) : webResourceResponse;
    }
}

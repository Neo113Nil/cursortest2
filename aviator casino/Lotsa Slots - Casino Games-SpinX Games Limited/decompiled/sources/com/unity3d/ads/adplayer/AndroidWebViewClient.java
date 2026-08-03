package com.unity3d.ads.adplayer;

/* compiled from: AndroidWebViewClient.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "Landroidx/webkit/WebViewClientCompat;", "getCachedAsset", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/domain/GetCachedAsset;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "_isRenderProcessGone", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_onLoadFinished", "Lkotlinx/coroutines/CompletableDeferred;", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "isRenderProcessGone", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "loadErrors", "onLoadFinished", "Lkotlinx/coroutines/Deferred;", "getOnLoadFinished", "()Lkotlinx/coroutines/Deferred;", "webviewType", "", "onPageFinished", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "url", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", "request", "Landroid/webkit/WebResourceRequest;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidWebViewClient extends androidx.webkit.WebViewClientCompat {
    public static final java.lang.String BLANK_PAGE = "about:blank";
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isRenderProcessGone;
    private final kotlinx.coroutines.CompletableDeferred<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> _onLoadFinished;
    private final com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isRenderProcessGone;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> loadErrors;
    private final kotlinx.coroutines.Deferred<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> onLoadFinished;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> webviewType;

    public AndroidWebViewClient(com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCachedAsset, "getCachedAsset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        kotlinx.coroutines.CompletableDeferred<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this._onLoadFinished = CompletableDeferred$default;
        this.onLoadFinished = CompletableDeferred$default;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this._isRenderProcessGone = MutableStateFlow;
        this.isRenderProcessGone = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.webviewType = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow("");
    }

    public final kotlinx.coroutines.Deferred<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> getOnLoadFinished() {
        return this.onLoadFinished;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
        java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (kotlin.jvm.internal.Intrinsics.areEqual(url, BLANK_PAGE)) {
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> mutableStateFlow = this.loadErrors;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.unity3d.ads.adplayer.model.WebViewClientError>) value, new com.unity3d.ads.adplayer.model.WebViewClientError(url, com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_BLANK, null, 4, null))));
        }
        super.onPageFinished(view, url);
        this._onLoadFinished.complete(this.loadErrors.getValue());
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView view, android.webkit.WebResourceRequest request) {
        java.util.Map emptyMap;
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        android.net.Uri url = request.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(view, request);
        }
        try {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.unity3d.ads.adplayer.AndroidWebViewClient androidWebViewClient = this;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(url.getQueryParameter("webviewType"));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                m10798constructorimpl = null;
            }
            java.lang.String str = (java.lang.String) m10798constructorimpl;
            java.lang.String str2 = str;
            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                this.webviewType.setValue(str);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(url.getLastPathSegment(), "favicon.ico")) {
                return new android.webkit.WebResourceResponse(androidx.media3.common.MimeTypes.IMAGE_PNG, null, null);
            }
            com.unity3d.ads.core.domain.GetCachedAsset getCachedAsset = this.getCachedAsset;
            android.net.Uri url2 = request.getUrl();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url2, "request.url");
            return getCachedAsset.invoke(url2, this.webviewType.getValue());
        } catch (java.lang.Throwable th2) {
            java.lang.String message = th2.getMessage();
            if (message == null || (emptyMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", message))) == null) {
                emptyMap = kotlin.collections.MapsKt.emptyMap();
            }
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", null, emptyMap, null, null, null, 58, null);
            return super.shouldInterceptRequest(view, request);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(android.webkit.WebView view, android.webkit.RenderProcessGoneDetail detail) {
        java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError> value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detail, "detail");
        com.unity3d.ads.core.extensions.ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (!this._onLoadFinished.isCompleted()) {
            kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.unity3d.ads.adplayer.model.WebViewClientError>> mutableStateFlow = this.loadErrors;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.unity3d.ads.adplayer.model.WebViewClientError>) value, new com.unity3d.ads.adplayer.model.WebViewClientError(java.lang.String.valueOf(view.getUrl()), com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
            this._onLoadFinished.complete(this.loadErrors.getValue());
        } else {
            this._isRenderProcessGone.setValue(true);
        }
        return true;
    }
}

package com.vungle.ads.internal.presenter;

/* compiled from: WebViewManager.kt */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001(B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0004J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJM\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0004\b&\u0010'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/presenter/WebViewManager;", "", "()V", "TAG", "", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "webViewCache", "Ljava/util/LinkedHashMap;", "Lcom/vungle/ads/internal/presenter/WebViewManager$WebViewEntry;", "Lkotlin/collections/LinkedHashMap;", "destroyWebView", "", com.ironsource.X3.i.W, "destroyWebViewInternal", "getOrCreateWebView", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "getOrCreateWebViewClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "offloadExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", com.ironsource.M6.H, "Lcom/vungle/ads/internal/platform/Platform;", "preloadWebView", "adv", "templatePath", "webSettings", "Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;", "delegate", "Lcom/vungle/ads/internal/presenter/PreloadDelegate;", "loadDuration", "", "preloadWebView$vungle_ads_release", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/model/Placement;Ljava/lang/String;Lcom/vungle/ads/internal/model/AdPayload$WebViewSettings;Lcom/vungle/ads/internal/presenter/PreloadDelegate;Ljava/lang/Long;)V", "WebViewEntry", "vungle-ads_release", "executors", "Lcom/vungle/ads/internal/executor/Executors;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class WebViewManager {
    private static final java.lang.String TAG = "WebViewManager";
    public static final com.vungle.ads.internal.presenter.WebViewManager INSTANCE = new com.vungle.ads.internal.presenter.WebViewManager();
    private static final java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();
    private static final java.util.LinkedHashMap<java.lang.String, com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry> webViewCache = new java.util.LinkedHashMap<>();

    private WebViewManager() {
    }

    public final void preloadWebView$vungle_ads_release(final android.content.Context context, final com.vungle.ads.internal.model.AdPayload adv, final com.vungle.ads.internal.model.Placement placement, final java.lang.String templatePath, final com.vungle.ads.internal.model.AdPayload.WebViewSettings webSettings, final com.vungle.ads.internal.presenter.PreloadDelegate delegate, final java.lang.Long loadDuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adv, "adv");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(templatePath, "templatePath");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        java.util.concurrent.locks.ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Preload webview start. Cache size: ");
            java.util.LinkedHashMap<java.lang.String, com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry> linkedHashMap = webViewCache;
            sb.append(linkedHashMap.size());
            companion.d(TAG, sb.toString());
            final java.lang.String eventId = adv.eventId();
            if (!linkedHashMap.containsKey(eventId)) {
                com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        java.lang.Object m10798constructorimpl;
                        java.util.LinkedHashMap linkedHashMap2;
                        java.util.LinkedHashMap linkedHashMap3;
                        java.util.LinkedHashMap linkedHashMap4;
                        com.vungle.ads.internal.presenter.WebViewManager webViewManager = com.vungle.ads.internal.presenter.WebViewManager.INSTANCE;
                        final android.content.Context context2 = context;
                        com.vungle.ads.internal.model.AdPayload adPayload = adv;
                        com.vungle.ads.internal.model.Placement placement2 = placement;
                        com.vungle.ads.internal.presenter.PreloadDelegate preloadDelegate = delegate;
                        java.lang.Long l = loadDuration;
                        java.lang.String str = templatePath;
                        java.lang.String str2 = eventId;
                        com.vungle.ads.internal.model.AdPayload.WebViewSettings webViewSettings = webSettings;
                        try {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            android.webkit.WebView webView = new android.webkit.WebView(context2.getApplicationContext());
                            com.vungle.ads.internal.platform.WebViewUtil.INSTANCE.applyWebSettings(webView, webViewSettings);
                            com.vungle.ads.ServiceLocator.Companion companion3 = com.vungle.ads.ServiceLocator.INSTANCE;
                            kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.executor.Executors>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1$invoke$lambda-3$$inlined$inject$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                public final com.vungle.ads.internal.executor.Executors invoke() {
                                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context2).getService(com.vungle.ads.internal.executor.Executors.class);
                                }
                            });
                            com.vungle.ads.ServiceLocator.Companion companion4 = com.vungle.ads.ServiceLocator.INSTANCE;
                            com.vungle.ads.internal.ui.VungleWebClient vungleWebClient = new com.vungle.ads.internal.ui.VungleWebClient(adPayload, placement2, m10462invoke$lambda3$lambda1(lazy).getOFFLOAD_EXECUTOR(), m10463invoke$lambda3$lambda2(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.platform.Platform>() { // from class: com.vungle.ads.internal.presenter.WebViewManager$preloadWebView$1$1$invoke$lambda-3$$inlined$inject$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function0
                                public final com.vungle.ads.internal.platform.Platform invoke() {
                                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context2).getService(com.vungle.ads.internal.platform.Platform.class);
                                }
                            })), preloadDelegate, l);
                            vungleWebClient.setConsentStatus(com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && kotlin.jvm.internal.Intrinsics.areEqual("unknown", com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getConsentStatus()), com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRConsentTitle(), com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRConsentMessage(), com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRButtonAccept(), com.vungle.ads.internal.ConfigManager.INSTANCE.getGDPRButtonDeny());
                            webView.setWebViewClient(vungleWebClient);
                            webView.loadUrl(str);
                            linkedHashMap2 = com.vungle.ads.internal.presenter.WebViewManager.webViewCache;
                            linkedHashMap2.put(java.lang.String.valueOf(str2), new com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry(webView, vungleWebClient));
                            com.vungle.ads.AnalyticsClient analyticsClient = com.vungle.ads.AnalyticsClient.INSTANCE;
                            com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType sDKMetricType = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.CONCURRENT_CACHED_WEBVIEW_COUNT;
                            linkedHashMap3 = com.vungle.ads.internal.presenter.WebViewManager.webViewCache;
                            com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, sDKMetricType, linkedHashMap3.size(), adPayload.getLogEntry(), null, 8, null);
                            com.vungle.ads.internal.util.Logger.Companion companion5 = com.vungle.ads.internal.util.Logger.INSTANCE;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Preload complete. Cache size: ");
                            linkedHashMap4 = com.vungle.ads.internal.presenter.WebViewManager.webViewCache;
                            sb2.append(linkedHashMap4.size());
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(java.lang.Integer.valueOf(companion5.d("WebViewManager", sb2.toString())));
                        } catch (java.lang.Throwable th) {
                            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        }
                        com.vungle.ads.internal.presenter.PreloadDelegate preloadDelegate2 = delegate;
                        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
                        if (m10801exceptionOrNullimpl != null) {
                            com.vungle.ads.internal.util.Logger.INSTANCE.e("WebViewManager", "Preload webview failed", m10801exceptionOrNullimpl);
                            preloadDelegate2.onAdReadyToPlay();
                        }
                    }

                    /* renamed from: invoke$lambda-3$lambda-1, reason: not valid java name */
                    private static final com.vungle.ads.internal.executor.Executors m10462invoke$lambda3$lambda1(kotlin.Lazy<? extends com.vungle.ads.internal.executor.Executors> lazy) {
                        return lazy.getValue();
                    }

                    /* renamed from: invoke$lambda-3$lambda-2, reason: not valid java name */
                    private static final com.vungle.ads.internal.platform.Platform m10463invoke$lambda3$lambda2(kotlin.Lazy<? extends com.vungle.ads.internal.platform.Platform> lazy) {
                        return lazy.getValue();
                    }
                });
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final android.webkit.WebView getOrCreateWebView(android.content.Context context, java.lang.String key) {
        android.webkit.WebView webView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.util.concurrent.locks.ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            java.util.LinkedHashMap<java.lang.String, com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry> linkedHashMap = webViewCache;
            com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry webViewEntry = linkedHashMap.get(key);
            if (webViewEntry != null) {
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = webViewEntry.getWebView();
            } else {
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new android.webkit.WebView(context);
            }
            return webView;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final com.vungle.ads.internal.ui.VungleWebClient getOrCreateWebViewClient(com.vungle.ads.internal.model.AdPayload advertisement, com.vungle.ads.internal.model.Placement placement, com.vungle.ads.internal.executor.VungleThreadPoolExecutor offloadExecutor, com.vungle.ads.internal.platform.Platform platform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "platform");
        java.util.concurrent.locks.ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry webViewEntry = webViewCache.get(advertisement.eventId());
            com.vungle.ads.internal.ui.VungleWebClient webViewClient = webViewEntry != null ? webViewEntry.getWebViewClient() : null;
            if (webViewClient == null) {
                webViewClient = new com.vungle.ads.internal.ui.VungleWebClient(advertisement, placement, offloadExecutor, platform, null, null, 48, null);
            }
            return webViewClient;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void destroyWebView(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        java.util.concurrent.locks.ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            INSTANCE.destroyWebViewInternal(key);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void destroyWebViewInternal(java.lang.String key) {
        webViewCache.remove(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebViewManager.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/vungle/ads/internal/presenter/WebViewManager$WebViewEntry;", "", "webView", "Landroid/webkit/WebView;", "webViewClient", "Lcom/vungle/ads/internal/ui/VungleWebClient;", "(Landroid/webkit/WebView;Lcom/vungle/ads/internal/ui/VungleWebClient;)V", "getWebView", "()Landroid/webkit/WebView;", "getWebViewClient", "()Lcom/vungle/ads/internal/ui/VungleWebClient;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final /* data */ class WebViewEntry {
        private final android.webkit.WebView webView;
        private final com.vungle.ads.internal.ui.VungleWebClient webViewClient;

        public static /* synthetic */ com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry copy$default(com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry webViewEntry, android.webkit.WebView webView, com.vungle.ads.internal.ui.VungleWebClient vungleWebClient, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                webView = webViewEntry.webView;
            }
            if ((i & 2) != 0) {
                vungleWebClient = webViewEntry.webViewClient;
            }
            return webViewEntry.copy(webView, vungleWebClient);
        }

        /* renamed from: component1, reason: from getter */
        public final android.webkit.WebView getWebView() {
            return this.webView;
        }

        /* renamed from: component2, reason: from getter */
        public final com.vungle.ads.internal.ui.VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }

        public final com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry copy(android.webkit.WebView webView, com.vungle.ads.internal.ui.VungleWebClient webViewClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
            return new com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry(webView, webViewClient);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry)) {
                return false;
            }
            com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry webViewEntry = (com.vungle.ads.internal.presenter.WebViewManager.WebViewEntry) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.webView, webViewEntry.webView) && kotlin.jvm.internal.Intrinsics.areEqual(this.webViewClient, webViewEntry.webViewClient);
        }

        public int hashCode() {
            return (this.webView.hashCode() * 31) + this.webViewClient.hashCode();
        }

        public java.lang.String toString() {
            return "WebViewEntry(webView=" + this.webView + ", webViewClient=" + this.webViewClient + ')';
        }

        public WebViewEntry(android.webkit.WebView webView, com.vungle.ads.internal.ui.VungleWebClient webViewClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
            this.webView = webView;
            this.webViewClient = webViewClient;
        }

        public final android.webkit.WebView getWebView() {
            return this.webView;
        }

        public final com.vungle.ads.internal.ui.VungleWebClient getWebViewClient() {
            return this.webViewClient;
        }
    }
}

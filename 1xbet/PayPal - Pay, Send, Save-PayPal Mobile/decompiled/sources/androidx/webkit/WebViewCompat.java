package androidx.webkit;

/* loaded from: classes7.dex */
public class WebViewCompat {
    private static final android.net.Uri getHighSpeedVideoFpsRanges = android.net.Uri.parse("*");
    private static final android.net.Uri getHighSpeedVideoFpsRangesFor = android.net.Uri.parse("");
    private static final java.util.WeakHashMap<android.webkit.WebView, androidx.webkit.internal.WebViewProviderAdapter> getHighSpeedVideoSizes = new java.util.WeakHashMap<>();

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ExperimentalAsyncStartUp {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface ExperimentalSaveState {
    }

    public interface VisualStateCallback {
        void onComplete(long j);
    }

    public interface WebMessageListener {
        void onPostMessage(android.webkit.WebView webView, androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri, boolean z, androidx.webkit.JavaScriptReplyProxy javaScriptReplyProxy);
    }

    public interface WebViewStartUpCallback {
        void onSuccess(androidx.webkit.WebViewStartUpResult webViewStartUpResult);
    }

    private WebViewCompat() {
    }

    public static void postVisualStateCallback(android.webkit.WebView webView, long j, final androidx.webkit.WebViewCompat.VisualStateCallback visualStateCallback) {
        webView.postVisualStateCallback(j, new android.webkit.WebView.VisualStateCallback() { // from class: androidx.webkit.WebViewCompat.1
            @Override // android.webkit.WebView.VisualStateCallback
            public void onComplete(long j2) {
                androidx.webkit.WebViewCompat.VisualStateCallback.this.onComplete(j2);
            }
        });
    }

    @java.lang.Deprecated
    public static void startSafeBrowsing(android.content.Context context, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.START_SAFE_BROWSING;
        if (o_mr1.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForOMR1.startSafeBrowsing(context, valueCallback);
        } else {
            if (o_mr1.isSupportedByWebView()) {
                getHighSpeedVideoFpsRanges().getStatics().initSafeBrowsing(context, valueCallback);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void setSafeBrowsingAllowlist(java.util.Set<java.lang.String> set, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED;
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr12 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED;
        if (o_mr1.isSupportedByWebView()) {
            getHighSpeedVideoFpsRanges().getStatics().setSafeBrowsingAllowlist(set, valueCallback);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(set);
        if (o_mr12.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForOMR1.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            if (o_mr12.isSupportedByWebView()) {
                getHighSpeedVideoFpsRanges().getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @java.lang.Deprecated
    public static void setSafeBrowsingWhitelist(java.util.List<java.lang.String> list, android.webkit.ValueCallback<java.lang.Boolean> valueCallback) {
        setSafeBrowsingAllowlist(new java.util.HashSet(list), valueCallback);
    }

    public static android.net.Uri getSafeBrowsingPrivacyPolicyUrl() {
        androidx.webkit.internal.ApiFeature.O_MR1 o_mr1 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_PRIVACY_POLICY_URL;
        if (o_mr1.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForOMR1.getSafeBrowsingPrivacyPolicyUrl();
        }
        if (o_mr1.isSupportedByWebView()) {
            return getHighSpeedVideoFpsRanges().getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static android.content.pm.PackageInfo getCurrentWebViewPackage(android.content.Context context) {
        android.content.pm.PackageInfo currentLoadedWebViewPackage = getCurrentLoadedWebViewPackage();
        return currentLoadedWebViewPackage != null ? currentLoadedWebViewPackage : getHighSpeedVideoSizes(context);
    }

    public static android.content.pm.PackageInfo getCurrentLoadedWebViewPackage() {
        return androidx.webkit.internal.ApiHelperForO.getCurrentWebViewPackage();
    }

    private static android.content.pm.PackageInfo getHighSpeedVideoSizes(android.content.Context context) {
        try {
            java.lang.String str = (java.lang.String) java.lang.Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    private static androidx.webkit.internal.WebViewProviderAdapter getHighResolutionOutputSizeshNQ4ISI(android.webkit.WebView webView) {
        if (androidx.webkit.internal.WebViewFeatureInternal.PROVIDER_WEAKLY_REF_WEBVIEW.isSupportedByWebView()) {
            java.util.WeakHashMap<android.webkit.WebView, androidx.webkit.internal.WebViewProviderAdapter> weakHashMap = getHighSpeedVideoSizes;
            androidx.webkit.internal.WebViewProviderAdapter webViewProviderAdapter = weakHashMap.get(webView);
            if (webViewProviderAdapter != null) {
                return webViewProviderAdapter;
            }
            androidx.webkit.internal.WebViewProviderAdapter webViewProviderAdapter2 = new androidx.webkit.internal.WebViewProviderAdapter(getHighSpeedVideoFpsRangesFor(webView));
            weakHashMap.put(webView, webViewProviderAdapter2);
            return webViewProviderAdapter2;
        }
        return new androidx.webkit.internal.WebViewProviderAdapter(getHighSpeedVideoFpsRangesFor(webView));
    }

    public static androidx.webkit.WebMessagePortCompat[] createWebMessageChannel(android.webkit.WebView webView) {
        return androidx.webkit.internal.WebMessagePortImpl.portsToCompat(webView.createWebMessageChannel());
    }

    public static void postWebMessage(android.webkit.WebView webView, androidx.webkit.WebMessageCompat webMessageCompat, android.net.Uri uri) {
        if (getHighSpeedVideoFpsRanges.equals(uri)) {
            uri = getHighSpeedVideoFpsRangesFor;
        }
        androidx.webkit.internal.ApiFeature.M m = androidx.webkit.internal.WebViewFeatureInternal.POST_WEB_MESSAGE;
        if (webMessageCompat.getType() == 0) {
            webView.postWebMessage(androidx.webkit.internal.WebMessagePortImpl.compatToFrameworkMessage(webMessageCompat), uri);
        } else {
            if (m.isSupportedByWebView() && androidx.webkit.internal.WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(webMessageCompat.getType())) {
                Camera2StreamConfigurationMap(webView);
                getHighResolutionOutputSizeshNQ4ISI(webView).postWebMessage(webMessageCompat, uri);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void addWebMessageListener(android.webkit.WebView webView, java.lang.String str, java.util.Set<java.lang.String> set, androidx.webkit.WebViewCompat.WebMessageListener webMessageListener) {
        if (androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            getHighResolutionOutputSizeshNQ4ISI(webView).addWebMessageListener(str, (java.lang.String[]) set.toArray(new java.lang.String[0]), webMessageListener);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void removeWebMessageListener(android.webkit.WebView webView, java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            getHighResolutionOutputSizeshNQ4ISI(webView).removeWebMessageListener(str);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static androidx.webkit.ScriptHandler addDocumentStartJavaScript(android.webkit.WebView webView, java.lang.String str, java.util.Set<java.lang.String> set) {
        if (androidx.webkit.internal.WebViewFeatureInternal.DOCUMENT_START_SCRIPT.isSupportedByWebView()) {
            return getHighResolutionOutputSizeshNQ4ISI(webView).addDocumentStartJavaScript(str, (java.lang.String[]) set.toArray(new java.lang.String[0]));
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static android.webkit.WebViewClient getWebViewClient(android.webkit.WebView webView) {
        androidx.webkit.internal.ApiFeature.O o2 = androidx.webkit.internal.WebViewFeatureInternal.GET_WEB_VIEW_CLIENT;
        if (o2.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForO.getWebViewClient(webView);
        }
        if (o2.isSupportedByWebView()) {
            Camera2StreamConfigurationMap(webView);
            return getHighResolutionOutputSizeshNQ4ISI(webView).getWebViewClient();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static android.webkit.WebChromeClient getWebChromeClient(android.webkit.WebView webView) {
        androidx.webkit.internal.ApiFeature.O o2 = androidx.webkit.internal.WebViewFeatureInternal.GET_WEB_CHROME_CLIENT;
        if (o2.isSupportedByFramework()) {
            return androidx.webkit.internal.ApiHelperForO.getWebChromeClient(webView);
        }
        if (o2.isSupportedByWebView()) {
            Camera2StreamConfigurationMap(webView);
            return getHighResolutionOutputSizeshNQ4ISI(webView).getWebChromeClient();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static androidx.webkit.WebViewRenderProcess getWebViewRenderProcess(android.webkit.WebView webView) {
        androidx.webkit.internal.ApiFeature.Q q = androidx.webkit.internal.WebViewFeatureInternal.GET_WEB_VIEW_RENDERER;
        if (q.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcess webViewRenderProcess = androidx.webkit.internal.ApiHelperForQ.getWebViewRenderProcess(webView);
            if (webViewRenderProcess != null) {
                return androidx.webkit.internal.WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess);
            }
            return null;
        }
        if (q.isSupportedByWebView()) {
            Camera2StreamConfigurationMap(webView);
            return getHighResolutionOutputSizeshNQ4ISI(webView).getWebViewRenderProcess();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView webView, java.util.concurrent.Executor executor, androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        androidx.webkit.internal.ApiFeature.Q q = androidx.webkit.internal.WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (q.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForQ.setWebViewRenderProcessClient(webView, executor, webViewRenderProcessClient);
        } else {
            if (q.isSupportedByWebView()) {
                Camera2StreamConfigurationMap(webView);
                getHighResolutionOutputSizeshNQ4ISI(webView).setWebViewRenderProcessClient(executor, webViewRenderProcessClient);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static void setWebViewRenderProcessClient(android.webkit.WebView webView, androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        androidx.webkit.internal.ApiFeature.Q q = androidx.webkit.internal.WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (q.isSupportedByFramework()) {
            androidx.webkit.internal.ApiHelperForQ.setWebViewRenderProcessClient(webView, webViewRenderProcessClient);
        } else {
            if (q.isSupportedByWebView()) {
                Camera2StreamConfigurationMap(webView);
                getHighResolutionOutputSizeshNQ4ISI(webView).setWebViewRenderProcessClient(null, webViewRenderProcessClient);
                return;
            }
            throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public static androidx.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient(android.webkit.WebView webView) {
        androidx.webkit.internal.ApiFeature.Q q = androidx.webkit.internal.WebViewFeatureInternal.WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE;
        if (q.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcessClient webViewRenderProcessClient = androidx.webkit.internal.ApiHelperForQ.getWebViewRenderProcessClient(webView);
            if (webViewRenderProcessClient == null || !(webViewRenderProcessClient instanceof androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter)) {
                return null;
            }
            return ((androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter) webViewRenderProcessClient).getFrameworkRenderProcessClient();
        }
        if (q.isSupportedByWebView()) {
            Camera2StreamConfigurationMap(webView);
            return getHighResolutionOutputSizeshNQ4ISI(webView).getWebViewRenderProcessClient();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isMultiProcessEnabled() {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROCESS.isSupportedByWebView()) {
            return getHighSpeedVideoFpsRanges().getStatics().isMultiProcessEnabled();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static java.lang.String getVariationsHeader() {
        if (androidx.webkit.internal.WebViewFeatureInternal.GET_VARIATIONS_HEADER.isSupportedByWebView()) {
            return getHighSpeedVideoFpsRanges().getStatics().getVariationsHeader();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setProfile(android.webkit.WebView webView, java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            getHighResolutionOutputSizeshNQ4ISI(webView).setProfileWithName(str);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static androidx.webkit.Profile getProfile(android.webkit.WebView webView) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            return getHighResolutionOutputSizeshNQ4ISI(webView).getProfile();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static boolean isAudioMuted(android.webkit.WebView webView) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            return getHighResolutionOutputSizeshNQ4ISI(webView).isAudioMuted();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void setAudioMuted(android.webkit.WebView webView, boolean z) {
        if (androidx.webkit.internal.WebViewFeatureInternal.MUTE_AUDIO.isSupportedByWebView()) {
            getHighResolutionOutputSizeshNQ4ISI(webView).setAudioMuted(z);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void startUpWebView(final android.content.Context context, final androidx.webkit.WebViewStartUpConfig webViewStartUpConfig, final androidx.webkit.WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        webViewStartUpConfig.getBackgroundExecutor().execute(new java.lang.Runnable() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.webkit.WebViewCompat.getHighSpeedVideoFpsRangesFor(androidx.webkit.WebViewStartUpConfig.this, webViewStartUpCallback, context);
            }
        });
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.webkit.WebViewStartUpConfig webViewStartUpConfig, final androidx.webkit.WebViewCompat.WebViewStartUpCallback webViewStartUpCallback, android.content.Context context) {
        androidx.webkit.internal.WebViewGlueCommunicator.getWebViewClassLoader();
        if (androidx.webkit.internal.WebViewFeatureInternal.ASYNC_WEBVIEW_STARTUP.isSupportedByWebView()) {
            getHighSpeedVideoFpsRanges().startUpWebView(webViewStartUpConfig, new androidx.webkit.WebViewCompat.WebViewStartUpCallback() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda3
                @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
                public final void onSuccess(androidx.webkit.WebViewStartUpResult webViewStartUpResult) {
                    new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.webkit.WebViewCompat.WebViewStartUpCallback.this.onSuccess(webViewStartUpResult);
                        }
                    });
                }
            });
            return;
        }
        if (webViewStartUpConfig.shouldRunUiThreadStartUpTasks()) {
            android.webkit.WebSettings.getDefaultUserAgent(context.getApplicationContext());
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.webkit.WebViewCompat.WebViewStartUpCallback.this.onSuccess(new androidx.webkit.WebViewCompat.NullReturningWebViewStartUpResult());
            }
        });
    }

    public static void setDefaultTrafficStatsTag(int i) {
        if (androidx.webkit.internal.WebViewFeatureInternal.DEFAULT_TRAFFICSTATS_TAGGING.isSupportedByWebView()) {
            getHighSpeedVideoFpsRanges().getStatics().setDefaultTrafficStatsTag(i);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    static class NullReturningWebViewStartUpResult implements androidx.webkit.WebViewStartUpResult {
        @Override // androidx.webkit.WebViewStartUpResult
        public java.lang.Long getMaxTimePerTaskInUiThreadMillis() {
            return null;
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public java.util.List<androidx.webkit.StartUpLocation> getNonUiThreadBlockingStartUpLocations() {
            return null;
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public java.lang.Long getTotalTimeInUiThreadMillis() {
            return null;
        }

        @Override // androidx.webkit.WebViewStartUpResult
        public java.util.List<androidx.webkit.StartUpLocation> getUiThreadBlockingStartUpLocations() {
            return null;
        }

        private NullReturningWebViewStartUpResult() {
        }
    }

    public static void prerenderUrlAsync(android.webkit.WebView webView, java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, androidx.webkit.PrerenderOperationCallback prerenderOperationCallback) {
        if (androidx.webkit.internal.WebViewFeatureInternal.PRERENDER_WITH_URL.isSupportedByWebView()) {
            getHighResolutionOutputSizeshNQ4ISI(webView).prerenderUrlAsync(str, cancellationSignal, executor, prerenderOperationCallback);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void prerenderUrlAsync(android.webkit.WebView webView, java.lang.String str, android.os.CancellationSignal cancellationSignal, java.util.concurrent.Executor executor, androidx.webkit.SpeculativeLoadingParameters speculativeLoadingParameters, androidx.webkit.PrerenderOperationCallback prerenderOperationCallback) {
        if (androidx.webkit.internal.WebViewFeatureInternal.PRERENDER_WITH_URL.isSupportedByWebView()) {
            getHighResolutionOutputSizeshNQ4ISI(webView).prerenderUrlAsync(str, cancellationSignal, executor, speculativeLoadingParameters, prerenderOperationCallback);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void saveState(android.webkit.WebView webView, android.os.Bundle bundle, int i, boolean z) {
        if (androidx.webkit.internal.WebViewFeatureInternal.SAVE_STATE.isSupportedByWebView()) {
            getHighResolutionOutputSizeshNQ4ISI(webView).saveState(bundle, i, z);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static void setWebNavigationClient(android.webkit.WebView webView, androidx.webkit.WebNavigationClient webNavigationClient) {
        if (androidx.webkit.internal.WebViewFeatureInternal.NAVIGATION_CALLBACK_BASIC.isSupportedByWebView()) {
            getHighResolutionOutputSizeshNQ4ISI(webView).setWebNavigationClient(webNavigationClient);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @java.lang.Deprecated
    public static androidx.webkit.WebNavigationClient getWebNavigationClient(android.webkit.WebView webView) {
        if (androidx.webkit.internal.WebViewFeatureInternal.NAVIGATION_CALLBACK_BASIC.isSupportedByWebView()) {
            return getHighResolutionOutputSizeshNQ4ISI(webView).getWebNavigationClient();
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void addNavigationListener(android.webkit.WebView webView, java.util.concurrent.Executor executor, androidx.webkit.NavigationListener navigationListener) {
        if (androidx.webkit.internal.WebViewFeatureInternal.NAVIGATION_LISTENER_V1.isSupportedByWebView()) {
            getHighResolutionOutputSizeshNQ4ISI(webView).addNavigationListener(executor, navigationListener);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    public static void addNavigationListener(android.webkit.WebView webView, androidx.webkit.NavigationListener navigationListener) {
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        addNavigationListener(webView, new java.util.concurrent.Executor() { // from class: androidx.webkit.WebViewCompat$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(java.lang.Runnable runnable) {
                handler.post(runnable);
            }
        }, navigationListener);
    }

    public static void removeNavigationListener(android.webkit.WebView webView, androidx.webkit.NavigationListener navigationListener) {
        if (androidx.webkit.internal.WebViewFeatureInternal.NAVIGATION_LISTENER_V1.isSupportedByWebView()) {
            getHighResolutionOutputSizeshNQ4ISI(webView).removeNavigationListener(navigationListener);
            return;
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static androidx.webkit.internal.WebViewProviderFactory getHighSpeedVideoFpsRanges() {
        return androidx.webkit.internal.WebViewGlueCommunicator.getFactory();
    }

    private static org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface getHighSpeedVideoFpsRangesFor(android.webkit.WebView webView) {
        return getHighSpeedVideoFpsRanges().createWebView(webView);
    }

    private static void Camera2StreamConfigurationMap(android.webkit.WebView webView) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.os.Looper webViewLooper = androidx.webkit.internal.ApiHelperForP.getWebViewLooper(webView);
            if (webViewLooper == android.os.Looper.myLooper()) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("A WebView method was called on thread '");
            sb.append(java.lang.Thread.currentThread().getName());
            sb.append("'. All WebView methods must be called on the same thread. (Expected Looper ");
            sb.append(webViewLooper);
            sb.append(" called on ");
            sb.append(android.os.Looper.myLooper());
            sb.append(", FYI main Looper is ");
            sb.append(android.os.Looper.getMainLooper());
            sb.append(")");
            throw new java.lang.RuntimeException(sb.toString());
        }
        try {
            java.lang.reflect.Method declaredMethod = android.webkit.WebView.class.getDeclaredMethod("checkThread", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(webView, new java.lang.Object[0]);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}

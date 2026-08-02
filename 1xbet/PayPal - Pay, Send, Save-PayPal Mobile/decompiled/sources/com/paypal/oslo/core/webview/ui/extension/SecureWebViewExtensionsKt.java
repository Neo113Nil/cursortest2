package com.paypal.oslo.core.webview.ui.extension;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroid/webkit/WebView;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;", "securitySettings", "", "source", "", "applySecureSettings", "(Landroid/webkit/WebView;Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;Ljava/lang/String;)V", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewJavaScriptConfiguration;", "javascriptConfig", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallbackManager;", "callbackManager", "", "applyJavaScriptInterfaces", "(Landroid/webkit/WebView;Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewJavaScriptConfiguration;Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallbackManager;Ljava/lang/String;)Z", "dispose", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "applyDownloadListener", "(Landroid/webkit/WebView;Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewCallbackManager;Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureWebViewExtensionsKt {
    public static final void applySecureSettings(android.webkit.WebView webView, com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings secureWebViewSettings, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.core.webview.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to("source", str);
        pairArr[1] = kotlin.TuplesKt.to("js_enabled", java.lang.String.valueOf(secureWebViewSettings.getJavaScriptEnabled()));
        java.lang.String customUserAgentSuffix = secureWebViewSettings.getCustomUserAgentSuffix();
        if (customUserAgentSuffix == null) {
            customUserAgentSuffix = "none";
        }
        pairArr[2] = kotlin.TuplesKt.to("custom_user_agent_suffix", customUserAgentSuffix);
        com.paypal.android.logger.Logger.d$default(logger, "[Webview] applying secure settings", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        android.webkit.WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(secureWebViewSettings.getJavaScriptEnabled());
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setDomStorageEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        java.lang.String userAgentString = settings.getUserAgentString();
        java.lang.String customUserAgentSuffix2 = secureWebViewSettings.getCustomUserAgentSuffix();
        java.lang.String concat = customUserAgentSuffix2 != null ? " ".concat(java.lang.String.valueOf(customUserAgentSuffix2)) : null;
        java.lang.String str2 = concat != null ? concat : "";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(userAgentString);
        sb.append(" PayPalMobile");
        sb.append(str2);
        settings.setUserAgentString(sb.toString());
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] secure settings applied", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str), kotlin.TuplesKt.to("user_agent", webView.getSettings().getUserAgentString())), null, 4, null);
    }

    public static /* synthetic */ boolean applyJavaScriptInterfaces$default(android.webkit.WebView webView, com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration secureWebViewJavaScriptConfiguration, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallbackManager secureWebViewCallbackManager, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            secureWebViewCallbackManager = null;
        }
        return applyJavaScriptInterfaces(webView, secureWebViewJavaScriptConfiguration, secureWebViewCallbackManager, str);
    }

    public static final boolean applyJavaScriptInterfaces(android.webkit.WebView webView, com.paypal.oslo.core.webview.ui.config.SecureWebViewJavaScriptConfiguration secureWebViewJavaScriptConfiguration, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallbackManager secureWebViewCallbackManager, java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewJavaScriptConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (!secureWebViewJavaScriptConfiguration.getJsInterfaces().isEmpty() && !webView.getSettings().getJavaScriptEnabled()) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] JS interfaces configured but JavaScript is disabled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str), kotlin.TuplesKt.to("interface_count", java.lang.String.valueOf(secureWebViewJavaScriptConfiguration.getJsInterfaces().size()))), null, null, 12, null);
            if (secureWebViewCallbackManager != null) {
                secureWebViewCallbackManager.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.extension.SecureWebViewExtensionsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.webview.ui.extension.SecureWebViewExtensionsKt.m11703$r8$lambda$3XceeuUmxZd1FP_cs2la1sJqyQ((com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) obj);
                    }
                });
            }
            return false;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : secureWebViewJavaScriptConfiguration.getJsInterfaces().entrySet()) {
            final java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                webView.addJavascriptInterface(value, key);
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] JS interface registered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str), kotlin.TuplesKt.to("interface_name", key)), null, 4, null);
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            final java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
            if (m23439exceptionOrNullimpl != null) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] JS interface registration failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str), kotlin.TuplesKt.to("interface_name", key)), null, m23439exceptionOrNullimpl, 4, null);
                if (secureWebViewCallbackManager != null) {
                    secureWebViewCallbackManager.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.extension.SecureWebViewExtensionsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.core.webview.ui.extension.SecureWebViewExtensionsKt.m11705$r8$lambda$z3LeULU3jvRJ20kQRT6JHvomp8(key, m23439exceptionOrNullimpl, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) obj);
                        }
                    });
                }
            }
        }
        return true;
    }

    public static final void dispose(android.webkit.WebView webView, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] dispose started", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str)), null, 4, null);
        webView.stopLoading();
        webView.loadUrl("about:blank");
        webView.onPause();
        webView.clearFocus();
        webView.clearHistory();
        webView.clearFormData();
        webView.clearMatches();
        webView.clearSslPreferences();
        webView.clearCache(true);
        android.view.ViewParent parent = webView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.removeAllViews();
        webView.destroy();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] dispose completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str)), null, 4, null);
    }

    public static final void applyDownloadListener(android.webkit.WebView webView, final com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallbackManager secureWebViewCallbackManager, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallbackManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.webview.LoggerKt.log, "[Webview] download listener configured", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", str)), null, 4, null);
        webView.setDownloadListener(new android.webkit.DownloadListener() { // from class: com.paypal.oslo.core.webview.ui.extension.SecureWebViewExtensionsKt$$ExternalSyntheticLambda3
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j) {
                com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallbackManager.this.notifyCallbacks$webview_release(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.webview.ui.extension.SecureWebViewExtensionsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.webview.ui.extension.SecureWebViewExtensionsKt.$r8$lambda$Zbd9hCfvacvkjQKvDN5aa4B9Kqc(str2, str3, str4, str5, j, (com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback) obj);
                    }
                });
            }
        });
    }

    /* renamed from: $r8$lambda$3XceeuUmxZd1FP_cs2la1sJ-qyQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11703$r8$lambda$3XceeuUmxZd1FP_cs2la1sJqyQ(com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback, "");
        secureWebViewCallback.onLoadFailed(new com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed("JavaScript interfaces configured but JavaScript is disabled. Set javaScriptEnabled = true in SecureWebViewSettings.", null, 2, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Zbd9hCfvacvkjQKvDN5aa4B9Kqc(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        secureWebViewCallback.onDownloadRequest(str, str2, str3, str4, j);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$z3L-eULU3jvRJ20kQRT6JHvomp8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11705$r8$lambda$z3LeULU3jvRJ20kQRT6JHvomp8(java.lang.String str, java.lang.Throwable th, com.paypal.oslo.core.webview.ui.callback.SecureWebViewCallback secureWebViewCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewCallback, "");
        secureWebViewCallback.onLoadFailed(new com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed("Failed to register JavaScript interface: ".concat(java.lang.String.valueOf(str)), th));
        return kotlin.Unit.INSTANCE;
    }
}

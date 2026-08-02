package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/statsig/androidsdk/DebugView;", "", "<init>", "()V", "Companion", "DebugWebChromeClient", "DebugWebViewClient"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DebugView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.statsig.androidsdk.DebugView.Companion INSTANCE = new com.statsig.androidsdk.DebugView.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/statsig/androidsdk/DebugView$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/statsig/androidsdk/DebugView$DebugWebViewClient;", "client", "Lcom/statsig/androidsdk/DebugView$DebugWebChromeClient;", "chromeClient", "Landroid/webkit/WebView;", "getConfiguredWebView", "(Landroid/content/Context;Lcom/statsig/androidsdk/DebugView$DebugWebViewClient;Lcom/statsig/androidsdk/DebugView$DebugWebChromeClient;)Landroid/webkit/WebView;", "", "sdkKey", "", "state", "Lkotlin/Function1;", "", "", "Lcom/statsig/androidsdk/DebugViewCallback;", com.sun.jna.Callback.METHOD_NAME, "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void show(android.content.Context context, java.lang.String sdkKey, java.util.Map<java.lang.String, ? extends java.lang.Object> state, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkKey, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            final android.app.Dialog dialog = new android.app.Dialog(context, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
            java.lang.String json = new com.google.gson.Gson().toJson(state);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
            final android.webkit.WebView configuredWebView = getConfiguredWebView(context, new com.statsig.androidsdk.DebugView.DebugWebViewClient(json), new com.statsig.androidsdk.DebugView.DebugWebChromeClient(dialog, callback));
            dialog.requestWindowFeature(1);
            dialog.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() { // from class: com.statsig.androidsdk.DebugView$Companion$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
                    boolean show$lambda$0;
                    show$lambda$0 = com.statsig.androidsdk.DebugView.Companion.show$lambda$0(configuredWebView, dialog, dialogInterface, i, keyEvent);
                    return show$lambda$0;
                }
            });
            configuredWebView.loadUrl("https://console.statsig.com/client_sdk_debugger_redirect?sdkKey=".concat(java.lang.String.valueOf(sdkKey)));
            dialog.setContentView(configuredWebView);
            dialog.show();
            android.view.Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean show$lambda$0(android.webkit.WebView webView, android.app.Dialog dialog, android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
            java.util.List split$default;
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialog, "");
            if (i != 4 || keyEvent.getAction() != 1 || !webView.canGoBack()) {
                return false;
            }
            webView.goBack();
            java.lang.String url = webView.getUrl();
            if (url != null && (split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) url, new java.lang.String[]{androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR}, false, 0, 6, (java.lang.Object) null)) != null && (str = (java.lang.String) kotlin.collections.CollectionsKt.last(split$default)) != null && kotlin.text.StringsKt.startsWith$default(str, "client_sdk_debugger", false, 2, (java.lang.Object) null)) {
                dialog.dismiss();
            }
            return true;
        }

        private final android.webkit.WebView getConfiguredWebView(android.content.Context context, com.statsig.androidsdk.DebugView.DebugWebViewClient client, com.statsig.androidsdk.DebugView.DebugWebChromeClient chromeClient) {
            android.webkit.WebView webView = new android.webkit.WebView(context);
            webView.setWebViewClient(client);
            webView.setWebChromeClient(chromeClient);
            webView.setSystemUiVisibility(2);
            android.webkit.WebSettings settings = webView.getSettings();
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setJavaScriptEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setDomStorageEnabled(true);
            webView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            android.webkit.CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
            return webView;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f"}, d2 = {"Lcom/statsig/androidsdk/DebugView$DebugWebViewClient;", "Landroid/webkit/WebViewClient;", "", "json", "<init>", "(Ljava/lang/String;)V", "Landroid/webkit/WebView;", "view", "url", "", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class DebugWebViewClient extends android.webkit.WebViewClient {
        private final java.lang.String json;

        public DebugWebViewClient(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.json = str;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(android.webkit.WebView view, java.lang.String url) {
            super.onPageFinished(view, url);
            if (view != null) {
                view.evaluateJavascript("window.__StatsigAndroidDebug=true;", null);
            }
            java.lang.String str = this.json;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("window.__StatsigClientState = ");
            sb.append(str);
            sb.append(";");
            java.lang.String obj = sb.toString();
            if (view != null) {
                view.evaluateJavascript(obj, null);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004j\u0004\u0018\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012"}, d2 = {"Lcom/statsig/androidsdk/DebugView$DebugWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Landroid/app/Dialog;", androidx.view.compose.DialogNavigator.NAME, "Lkotlin/Function1;", "", "", "Lcom/statsig/androidsdk/DebugViewCallback;", com.sun.jna.Callback.METHOD_NAME, "<init>", "(Landroid/app/Dialog;Lkotlin/jvm/functions/Function1;)V", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Lkotlin/jvm/functions/Function1;", "", "closeAction", "Ljava/lang/String;", "Landroid/app/Dialog;", "reloadRequired"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class DebugWebChromeClient extends android.webkit.WebChromeClient {
        private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> callback;
        private final java.lang.String closeAction;
        private final android.app.Dialog dialog;
        private final java.lang.String reloadRequired;

        /* JADX WARN: Multi-variable type inference failed */
        public DebugWebChromeClient(android.app.Dialog dialog, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialog, "");
            this.dialog = dialog;
            this.callback = function1;
            this.closeAction = "STATSIG_ANDROID_DEBUG_CLOSE_DIALOG";
            this.reloadRequired = "STATSIG_ANDROID_DEBUG_RELOAD_REQUIRED";
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
            java.lang.String message;
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1;
            if (consoleMessage != null && (message = consoleMessage.message()) != null) {
                java.lang.String str = message;
                if (kotlin.text.StringsKt.contentEquals(str, this.closeAction, true)) {
                    this.dialog.dismiss();
                }
                if (kotlin.text.StringsKt.contentEquals(str, this.reloadRequired, true) && (function1 = this.callback) != null) {
                    function1.invoke(java.lang.Boolean.TRUE);
                }
            }
            return super.onConsoleMessage(consoleMessage);
        }
    }
}

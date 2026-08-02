package com.knotapi.knot.webview;

/* loaded from: classes9.dex */
public class KnotViewClient extends android.webkit.WebViewClient {
    public static final java.lang.String TAG = "Knot:KnotViewClient";
    public com.knotapi.knot.models.Bot bot;
    public com.knotapi.knot.webview.KnotView knotView;
    com.knotapi.knot.interfaces.MerchantViewListener merchantViewListener;
    public com.knotapi.knot.utilities.SsoCookieHelper ssoCookieHelper = new com.knotapi.knot.utilities.SsoCookieHelper();
    public boolean delayLoader = false;
    public boolean isLoaderShownForRedirection = false;
    private java.util.List<java.lang.String> preRedirectionUrls = new java.util.ArrayList();
    private java.util.List<java.lang.String> postRedirectionUrls = new java.util.ArrayList();
    private boolean loginEventFired = false;
    private boolean pageContentLoaded = false;

    public KnotViewClient(com.knotapi.knot.webview.KnotView knotView) {
        this.knotView = knotView;
        this.bot = knotView.getBot();
        this.merchantViewListener = knotView.merchantViewListener;
    }

    private java.lang.String checkInterceptorRules(java.lang.String str) {
        try {
            if (this.bot.getInterceptorRules() == null) {
                return null;
            }
            for (com.knotapi.knot.models.Interceptor interceptor : this.bot.getInterceptorRules()) {
                if (interceptor.isUrlRegex() && str.matches(interceptor.getUrl())) {
                    if (interceptor.isSendToServer()) {
                        this.knotView.mExtraInfo.interceptedHashmap.put(interceptor.getServerKey(), str);
                    }
                    if (java.util.Objects.equals(interceptor.getReplaceType(), "change_url_query_param") && str.contains(interceptor.getReplaceKey())) {
                        return com.knotapi.knot.utilities.InterceptorManager.replaceUrlParameter(str, interceptor.getReplaceKey(), interceptor.getReplaceValue());
                    }
                }
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private void checkLoginAndUIRenderedEvent(java.lang.String str) {
        if (!str.startsWith(this.bot.getLoginUrl()) || this.loginEventFired) {
            return;
        }
        com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate = this.knotView.webViewDelegate;
        if (merchantWebViewDelegate != null) {
            merchantWebViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(this.bot.getBotId()), com.knotapi.knot.utilities.Constants.META_FLOW, "url loaded", str);
        }
        this.loginEventFired = true;
    }

    private static void clearLocalAndWebStorage(com.knotapi.knot.webview.KnotView knotView) {
        knotView.clear();
        if (knotView.bot.hasClearLocalAndWebStorage() && knotView.bot.isClearLocalAndWebStorage()) {
            knotView.evaluateJavascript(com.knotapi.knot.utilities.JsScripts.CLEAR_LOCAL_STORAGE, null);
            android.webkit.WebStorage.getInstance().deleteAllData();
        }
    }

    private boolean extractElement(com.google.gson.JsonObject jsonObject, java.lang.String str, java.util.List<java.lang.String> list) {
        com.google.gson.JsonElement jsonElement = jsonObject.get(str);
        if (list != null) {
            list.clear();
        }
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return false;
        }
        try {
            if (!jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isString()) {
                return false;
            }
            java.lang.String trim = jsonElement.getAsString().trim();
            if (trim.startsWith("\"") && trim.endsWith("\"")) {
                trim = trim.substring(1, trim.length() - 1);
            }
            if (!trim.equalsIgnoreCase("true") && !trim.equalsIgnoreCase("false")) {
                java.util.Iterator<com.google.gson.JsonElement> it = com.google.gson.JsonParser.parseString(trim.replace("\\\"", "\"")).getAsJsonArray().iterator();
                while (it.hasNext()) {
                    list.add(it.next().getAsString());
                }
                return false;
            }
            return java.lang.Boolean.parseBoolean(trim);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static com.knotapi.knot.webview.KnotViewClient newInstance(com.knotapi.knot.webview.KnotView knotView) {
        clearLocalAndWebStorage(knotView);
        return com.knotapi.knot.webview.merchants.KnotViewClientResolver.getKnotViewClient(knotView);
    }

    public com.knotapi.knot.utilities.Cookie buildCookie(java.lang.String str, java.lang.String str2) {
        return com.knotapi.knot.utilities.Cookie.buildCookie(str, str2);
    }

    public void checkLoggedInInLoadResource() {
        new android.os.Handler().post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.KnotViewClient.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.knotapi.knot.webview.KnotViewClient.this.bot.isInterceptRedirectionIntent()) {
                    if (((java.lang.String) java.util.Objects.requireNonNull(com.knotapi.knot.webview.KnotViewClient.this.knotView.getUrl())).contains(com.knotapi.knot.webview.KnotViewClient.this.knotView.bot.getInterceptIntentUrl())) {
                        com.knotapi.knot.webview.KnotViewClient.this.knotView.loginDone();
                        return;
                    }
                    return;
                }
                if (com.knotapi.knot.webview.KnotViewClient.this.bot.isCheckLoggedInInLoadResource()) {
                    com.knotapi.knot.webview.KnotView knotView = com.knotapi.knot.webview.KnotViewClient.this.knotView;
                    if (knotView.isUserLoggedIn(knotView.getUrl())) {
                        com.knotapi.knot.webview.KnotViewClient.this.knotView.loginDone();
                        return;
                    }
                    return;
                }
                if (com.knotapi.knot.webview.KnotViewClient.this.bot.isCheckLoggedInWithLoggedInUrlContains()) {
                    com.knotapi.knot.webview.KnotView knotView2 = com.knotapi.knot.webview.KnotViewClient.this.knotView;
                    if (knotView2.isUserLoggedIn(knotView2.getUrl()) || com.knotapi.knot.webview.KnotViewClient.this.knotView.getUrl().contains(com.knotapi.knot.webview.KnotViewClient.this.bot.getLoggedInUrl())) {
                        com.knotapi.knot.webview.KnotViewClient.this.knotView.loginDone();
                        return;
                    }
                    return;
                }
                if (com.knotapi.knot.webview.KnotViewClient.this.bot.isCheckLoggedInWithAndroidUrlEquals()) {
                    com.knotapi.knot.webview.KnotView knotView3 = com.knotapi.knot.webview.KnotViewClient.this.knotView;
                    if (knotView3.isUserLoggedIn(knotView3.getUrl()) || com.knotapi.knot.webview.KnotViewClient.this.knotView.getUrl().equals(com.knotapi.knot.webview.KnotViewClient.this.bot.getAndroidLoggedInUrl())) {
                        com.knotapi.knot.webview.KnotViewClient.this.knotView.loginDone();
                        return;
                    }
                    return;
                }
                if (com.knotapi.knot.webview.KnotViewClient.this.bot.isCheckLoggedInWithAndroidUrlContains()) {
                    com.knotapi.knot.webview.KnotView knotView4 = com.knotapi.knot.webview.KnotViewClient.this.knotView;
                    if (knotView4.isUserLoggedIn(knotView4.getUrl()) || com.knotapi.knot.webview.KnotViewClient.this.knotView.getUrl().contains(com.knotapi.knot.webview.KnotViewClient.this.bot.getAndroidLoggedInUrl())) {
                        com.knotapi.knot.webview.KnotViewClient.this.knotView.loginDone();
                    }
                }
            }
        });
    }

    public void checkNoSubscriptionStatus() {
        com.knotapi.knot.interfaces.MerchantViewListener merchantViewListener;
        try {
            if (!this.bot.noSubscriptionUrlSameAs(this.knotView.getUrl()) || (merchantViewListener = this.merchantViewListener) == null || merchantViewListener.isErrorViewVisible()) {
                return;
            }
            showErrorPage(getErrorView());
        } catch (java.lang.Exception unused) {
        }
    }

    public void configureLogin(java.lang.String str, java.lang.String str2) {
        com.knotapi.knot.webview.KnotView knotView = this.knotView;
        knotView.loginType = str;
        if (knotView.getSettings().getUserAgentString().equals(str2)) {
            return;
        }
        this.knotView.getSettings().setUserAgentString(str2);
    }

    public com.knotapi.knot.models.Bot getBot() {
        return this.bot;
    }

    public java.util.List<com.knotapi.knot.utilities.Cookie> getCookies(java.lang.String str) {
        return new com.knotapi.knot.utilities.WebViewCookieCollector(new com.knotapi.knot.interfaces.CookieBuilder() { // from class: com.knotapi.knot.webview.KnotViewClient$$ExternalSyntheticLambda0
            @Override // com.knotapi.knot.interfaces.CookieBuilder
            public final com.knotapi.knot.utilities.Cookie buildCookie(java.lang.String str2, java.lang.String str3) {
                return com.knotapi.knot.webview.KnotViewClient.this.buildCookie(str2, str3);
            }
        }).getAllCookiesAsList(this.knotView, str);
    }

    public com.knotapi.knot.models.ErrorView getErrorView() {
        return new com.knotapi.knot.models.ErrorView(this.bot.getMerchantName(), com.knotapi.knot.utilities.Constants.subscription_title, com.knotapi.knot.utilities.Constants.subscription_subTitle, this.bot.getLogoURL(), this.bot.getTheme().get("background_color").getAsString(), this.bot.getTheme().get("text_color").getAsString(), "Custom Merchant Error Screen");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.knotapi.knot.models.ErrorView getErrorViewWithMessage(org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        try {
            str = jSONObject.optString("title");
            try {
                str2 = jSONObject.optString("content");
            } catch (java.lang.Exception unused) {
                str2 = "";
                if (str.isEmpty()) {
                }
                java.lang.String str4 = str;
                if (str2.isEmpty()) {
                }
                str3 = str2;
                if (!str3.contains(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN)) {
                }
                com.knotapi.knot.webview.KnotView knotView = this.knotView;
                this.knotView.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(this.bot.getBotId()), com.knotapi.knot.utilities.Constants.META_MERCHANT_ISSUE, str3, knotView != null ? knotView.getUrl() : "");
                return new com.knotapi.knot.models.ErrorView(this.bot.getMerchantName(), str4, str3, this.bot.getLogoURL(), this.bot.getTheme().get("background_color").getAsString(), this.bot.getTheme().get("text_color").getAsString(), "onCardSwitchNativeError");
            }
        } catch (java.lang.Exception unused2) {
            str = "";
        }
        if (str.isEmpty()) {
            str = com.knotapi.knot.utilities.Constants.subscription_title;
        }
        java.lang.String str42 = str;
        if (str2.isEmpty()) {
            str2 = com.knotapi.knot.utilities.Constants.subscription_subTitle;
        }
        str3 = str2;
        if (!str3.contains(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN) || str42.contains("unavailable")) {
            com.knotapi.knot.webview.KnotView knotView2 = this.knotView;
            this.knotView.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(this.bot.getBotId()), com.knotapi.knot.utilities.Constants.META_MERCHANT_ISSUE, str3, knotView2 != null ? knotView2.getUrl() : "");
        }
        return new com.knotapi.knot.models.ErrorView(this.bot.getMerchantName(), str42, str3, this.bot.getLogoURL(), this.bot.getTheme().get("background_color").getAsString(), this.bot.getTheme().get("text_color").getAsString(), "onCardSwitchNativeError");
    }

    public java.lang.String getUserAgent() {
        return this.bot.getUserAgent(this.knotView);
    }

    public boolean googlePasskeyLoader(android.webkit.WebResourceRequest webResourceRequest, boolean z, com.knotapi.knot.interfaces.LoaderHandler loaderHandler) {
        java.lang.String obj = webResourceRequest.getUrl().toString();
        com.google.gson.JsonObject allSettings = this.bot.getAllSettings();
        com.google.gson.JsonElement jsonElement = (allSettings == null || !allSettings.has("globalSettings")) ? null : this.bot.getAllSettings().getAsJsonObject("globalSettings").get("redirect_passkey_urls");
        if (jsonElement != null) {
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonElement.getAsString()).getAsJsonObject();
                boolean extractElement = extractElement(asJsonObject, "enableLoader", null);
                try {
                    extractElement(asJsonObject, "preRedirectionUrls", this.preRedirectionUrls);
                    extractElement(asJsonObject, "postRedirectionUrls", this.postRedirectionUrls);
                } catch (java.lang.Exception unused) {
                }
                if (extractElement && isPasskeyUrl(obj, this.preRedirectionUrls) && !this.isLoaderShownForRedirection) {
                    sendPasskeyLogs();
                    if (loaderHandler == null || !z) {
                        this.knotView.showLoader();
                    } else {
                        loaderHandler.showLoader();
                    }
                    this.isLoaderShownForRedirection = true;
                }
            } catch (java.lang.Exception unused2) {
            }
        }
        if (!isPasskeyUrl(obj, this.preRedirectionUrls) && this.isLoaderShownForRedirection) {
            this.isLoaderShownForRedirection = false;
        }
        if (isPasskeyUrl(obj, this.postRedirectionUrls)) {
            this.delayLoader = true;
        }
        return false;
    }

    public void handleLoader(java.lang.String str) {
        com.knotapi.knot.webview.KnotView knotView = this.knotView;
        if (knotView.isLoggedIn || knotView.isUserLoggedIn(str)) {
            this.knotView.showLoader();
        } else {
            this.knotView.hideLoader();
        }
    }

    public boolean isPasskeyUrl(java.lang.String str, java.util.List<java.lang.String> list) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean isUserLoggedIn(java.lang.String str) {
        if (this.knotView.isLoggedIn) {
            return true;
        }
        if (this.bot.isDetectLoginUsingCookiesAndLoggedInUrl()) {
            return this.bot.loggedInUrlSameAs(str) & com.knotapi.knot.utilities.CookiePredicate.isUserLoggedIn(this.bot, this.knotView.getCookies()).booleanValue();
        }
        return (this.bot.hasCookieActions() && this.bot.hasRequiredCookies()) ? com.knotapi.knot.utilities.CookiesActionsHandler.isUserLoggedIn(this.bot, this.knotView.getCookies()) : this.bot.hasLoggedInPredicate() ? com.knotapi.knot.utilities.CookiePredicate.isUserLoggedIn(this.bot, this.knotView.getCookies()).booleanValue() : this.bot.loggedInUrlSameAs(str);
    }

    /* renamed from: lambda$sendPasskeyLogs$0$com-knotapi-knot-webview-KnotViewClient, reason: not valid java name */
    /* synthetic */ void m10862lambda$sendPasskeyLogs$0$comknotapiknotwebviewKnotViewClient() {
        com.knotapi.knot.utilities.ScreenshotHelper.captureAndMaskScreenshot(this.knotView, new com.knotapi.knot.interfaces.ScreenshotCallback() { // from class: com.knotapi.knot.webview.KnotViewClient.1
            @Override // com.knotapi.knot.interfaces.ScreenshotCallback
            public void onScreenshotReady(java.lang.String str) {
                java.lang.String str2;
                if (com.knotapi.knot.webview.KnotViewClient.this.knotView.getUrl() != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(com.knotapi.knot.webview.KnotViewClient.this.knotView.getUrl());
                    sb.append(" || Google Passkey || Passkey page");
                    str2 = sb.toString();
                } else {
                    str2 = "";
                }
                com.knotapi.knot.webview.KnotViewClient.this.knotView.getWebViewDelegate().sendNativeLogEvent(java.lang.Integer.valueOf(com.knotapi.knot.webview.KnotViewClient.this.knotView.bot.getBotId()), com.knotapi.knot.utilities.Constants.META_SCREENSHOT, str, str2);
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(android.webkit.WebView webView, java.lang.String str) {
        super.onLoadResource(webView, str);
        try {
            if (com.knotapi.knot.utilities.CookiesActionsHandler.canAddCookies("onLoadResource", this.bot)) {
                this.knotView.addCookies(str);
            }
            this.ssoCookieHelper.saveCookiesForDomain(com.knotapi.knot.ui.activities.KnotActivity.activity, str);
            com.knotapi.knot.webview.KnotView knotView = this.knotView;
            knotView.performAllBulkActions(knotView, false);
            com.knotapi.knot.webview.KnotView knotView2 = this.knotView;
            knotView2.defaultAction(knotView2);
            handleLoader(webView.getUrl());
            checkNoSubscriptionStatus();
            checkLoggedInInLoadResource();
            this.ssoCookieHelper.fetchEmailFromWebView(webView, this.knotView, com.knotapi.knot.ui.activities.KnotActivity.activity);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
        com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate;
        super.onPageCommitVisible(webView, str);
        java.lang.String url = this.knotView.getUrl();
        if (this.bot.isInterceptRedirectionIntent() && url != null && url.contains(this.knotView.bot.getInterceptIntentUrl())) {
            this.knotView.loginDone();
        }
        if (this.pageContentLoaded || (merchantWebViewDelegate = this.knotView.webViewDelegate) == null) {
            return;
        }
        this.pageContentLoaded = true;
        merchantWebViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(this.bot.getBotId()), com.knotapi.knot.utilities.Constants.META_FLOW, "url content rendered", str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
        super.onPageFinished(webView, str);
        try {
            if (com.knotapi.knot.utilities.CookiesActionsHandler.canAddCookies("onLoadResource", this.bot)) {
                this.knotView.addCookies(str);
            }
            if (this.knotView.isUserLoggedIn(str) || this.knotView.isLoggedIn) {
                if (this.bot.getAndroidPageActions() != null) {
                    com.knotapi.knot.webview.KnotView knotView = this.knotView;
                    knotView.isLoggedIn = true;
                    com.knotapi.knot.utilities.PageActionsManager.startPageActions(str, knotView, this.bot.getAndroidPageActions());
                } else if (!this.bot.isPaymentUrlSet()) {
                    this.knotView.loginDone();
                } else if (this.bot.paymentUrlSameAs(str)) {
                    this.knotView.finalStep();
                } else {
                    this.knotView.loginDone();
                }
            }
        } catch (java.lang.Exception unused) {
        }
        this.ssoCookieHelper.saveCookiesForDomain(com.knotapi.knot.ui.activities.KnotActivity.activity, str);
        checkLoginAndUIRenderedEvent(str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            if (this.bot.getErrorViewActions() != null) {
                com.knotapi.knot.utilities.ErrorViewActionsManager.startErrorViewActions(str, this.knotView, this.bot.getErrorViewActions());
            }
            this.knotView.checkWebPageNotAvailable();
            com.knotapi.knot.utilities.SsoLoginHelper.processSSO(str, this.bot, this.knotView, this.ssoCookieHelper, null, false);
            com.knotapi.knot.utilities.ScreenshotHelper.startScreenshotFlow(webView, this.knotView, null);
            this.knotView.listenToDOMChanges();
            this.knotView.trackNativeMerchantEvents();
            this.knotView.getMerchantViewListener().sendPageUrl(str);
            com.knotapi.knot.models.Bot bot = this.bot;
            com.knotapi.knot.webview.KnotView knotView = this.knotView;
            com.knotapi.knot.utilities.RunCustomScript.runScriptInMerchantView(bot, knotView, knotView.activity, false);
            if (this.bot.isTransactionsUrlSet()) {
                this.merchantViewListener.loadTransactionUrl(this.bot.getTransactionsUrl());
            }
            if (this.bot.hasCheckLoginScript()) {
                this.knotView.evaluateJavascript(this.bot.getCheckLoginScript(), null);
            }
            if (str.equals(this.bot.getLoginUrl()) && this.bot.hasLoginScript()) {
                this.knotView.evaluateJavascript(this.bot.getLoginScript(), null);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void onStorageDetails(java.lang.String str, java.lang.String str2) {
        com.knotapi.knot.utilities.CookiesActionsHandler.updateCookies(this.knotView, this.bot);
        com.knotapi.knot.utilities.StorageHelper.validateStorages(str, str2, this.knotView, this.bot);
        if (this.ssoCookieHelper.fromReusedCookies) {
            this.knotView.clearCookies();
        }
    }

    public void sendPasskeyLogs() {
        com.knotapi.knot.webview.KnotView knotView = this.knotView;
        com.knotapi.knot.interfaces.MerchantWebViewDelegate merchantWebViewDelegate = knotView.webViewDelegate;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(knotView.bot.getBotId());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{ url: ");
        sb.append(this.knotView.getUrl());
        sb.append(" , merchantName: ");
        sb.append(this.bot.getMerchantName());
        sb.append(" }");
        merchantWebViewDelegate.sendNativeLogEvent(valueOf, "Google Passkey", sb.toString(), "Passkey Page");
        try {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.KnotViewClient$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.knotapi.knot.webview.KnotViewClient.this.m10862lambda$sendPasskeyLogs$0$comknotapiknotwebviewKnotViewClient();
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.webkit.WebViewClient
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        java.lang.String obj;
        try {
            obj = webResourceRequest.getUrl().toString();
        } catch (java.lang.Exception unused) {
        }
        if (com.knotapi.knot.utilities.Helper.matchesAnyCondition(this.bot.getBlockedUrls(), obj)) {
            return new android.webkit.WebResourceResponse("text/plain", "UTF-8", null);
        }
        if (this.ssoCookieHelper.checkShouldIntercept(webView, webResourceRequest, com.knotapi.knot.ui.activities.KnotActivity.activity, this.knotView) && this.ssoCookieHelper.shouldBlockRequest) {
            com.knotapi.knot.utilities.SsoCookieHelper ssoCookieHelper = this.ssoCookieHelper;
            return new android.webkit.WebResourceResponse(ssoCookieHelper.mimeType, ssoCookieHelper.encoding, new java.io.ByteArrayInputStream(new byte[0]));
        }
        for (java.lang.String str : com.knotapi.knot.utilities.Constants.BLOCKED_ANALYTICS_URLS) {
            if (obj.contains(str)) {
                return new android.webkit.WebResourceResponse("text/plain", "UTF-8", null);
            }
        }
        if (this.bot.isNoCORSMode() && webResourceRequest.getMethod().equals("OPTIONS")) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
            hashMap.put(com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "GET, POST, PUT, DELETE, OPTIONS");
            hashMap.put(com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "*");
            hashMap.put(com.google.common.net.HttpHeaders.ACCESS_CONTROL_MAX_AGE, "3600");
            return new android.webkit.WebResourceResponse("text/plain", "UTF-8", 200, com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton, hashMap, new java.io.ByteArrayInputStream(new byte[0]));
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
        java.util.Objects.toString(webResourceRequest.getUrl());
        java.lang.String checkInterceptorRules = checkInterceptorRules(webResourceRequest.getUrl().toString());
        if (checkInterceptorRules != null) {
            webView.loadUrl(checkInterceptorRules);
        }
        if (!this.bot.hasSupportDeepLinks() || this.bot.isSupportDeepLinks()) {
            return googlePasskeyLoader(webResourceRequest, false, null);
        }
        return true;
    }

    public void showErrorPage(com.knotapi.knot.models.ErrorView errorView) {
        try {
            com.knotapi.knot.webview.KnotView knotView = this.knotView;
            if (knotView.showErrorPage) {
                return;
            }
            knotView.showErrorPage = true;
            java.lang.String format = java.lang.String.format("?merchantId=%s&merchantCounts=%s&name=%s&logo=%s&bg=%s&color=%s&title=%s&subTitle=%s&displayedAt=%s", java.net.URLEncoder.encode(java.lang.String.valueOf(this.bot.getMerchantId()), "UTF-8"), java.net.URLEncoder.encode(java.lang.String.valueOf(this.bot.getMerchantCount()), "UTF-8"), java.net.URLEncoder.encode(errorView.getName(), "UTF-8"), java.net.URLEncoder.encode(errorView.getLogoLink(), "UTF-8"), java.net.URLEncoder.encode(errorView.getThemeBackground(), "UTF-8"), java.net.URLEncoder.encode(errorView.getThemeTextColor(), "UTF-8"), java.net.URLEncoder.encode(errorView.getTitle(), "UTF-8"), java.net.URLEncoder.encode(java.lang.String.format(errorView.getContent(), errorView.getName()), "UTF-8"), java.net.URLEncoder.encode(errorView.getDisplayedAt(), "UTF-8"));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(com.knotapi.knot.services.KnotSDKInitProvider.rootUrl);
            sb.append("/error-page");
            sb.append(format);
            this.merchantViewListener.showErrorView(sb.toString());
        } catch (java.io.UnsupportedEncodingException e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "showErrorPage()");
        }
    }
}

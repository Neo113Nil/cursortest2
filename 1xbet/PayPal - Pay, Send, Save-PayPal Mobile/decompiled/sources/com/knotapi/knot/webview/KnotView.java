package com.knotapi.knot.webview;

/* loaded from: classes9.dex */
public class KnotView extends android.webkit.WebView {
    public static final java.lang.String TAG = "Knot:KnotView";
    public android.app.Activity activity;
    public com.knotapi.knot.models.Bot bot;
    public android.content.Context context;
    public java.util.List<com.knotapi.knot.utilities.Cookie> cookies;
    public boolean fromDialog;
    com.google.gson.JsonObject globalSettings;
    private final java.util.Map<java.lang.String, java.lang.String> injectedAssets;
    boolean isEmailLinkError;
    public boolean isLoggedIn;
    public boolean isPaymentPageLoaded;
    public java.lang.Boolean isTimeOutStart;
    private com.knotapi.knot.utilities.WebAppJSFetcher jsHelper;
    public java.lang.String loginType;
    android.graphics.Bitmap logoBitmap;
    public com.knotapi.knot.models.ExtraInfo mExtraInfo;
    public com.knotapi.knot.interfaces.MerchantViewListener merchantViewListener;
    public boolean showErrorPage;
    private android.webkit.ValueCallback<java.lang.String> storageDetailsCallBack;
    private long storageValidationStartTime;
    public com.knotapi.knot.webview.KnotViewClient viewClient;
    public com.knotapi.knot.interfaces.MerchantWebViewDelegate webViewDelegate;

    public KnotView(android.content.Context context) {
        super(context);
        this.isLoggedIn = false;
        this.showErrorPage = false;
        this.isPaymentPageLoaded = false;
        this.isTimeOutStart = java.lang.Boolean.FALSE;
        this.loginType = com.knotapi.knot.utilities.Constants.NORMAL_LOGIN;
        this.fromDialog = false;
        this.globalSettings = null;
        this.storageValidationStartTime = 0L;
        this.injectedAssets = new java.util.HashMap();
        this.storageDetailsCallBack = new android.webkit.ValueCallback<java.lang.String>() { // from class: com.knotapi.knot.webview.KnotView.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(java.lang.String str) {
                java.lang.Throwable th;
                java.lang.String str2;
                try {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                        str2 = jSONObject.getString("l");
                        try {
                            com.knotapi.knot.webview.KnotView.this.onStorageDetails(str2, jSONObject.getString(lib.android.paypal.com.magnessdk.g.n2));
                        } catch (org.json.JSONException unused) {
                            java.lang.String str3 = com.knotapi.knot.webview.KnotView.TAG;
                            com.knotapi.knot.webview.KnotView.this.onStorageDetails(str2, null);
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        com.knotapi.knot.webview.KnotView.this.onStorageDetails(str, null);
                        throw th;
                    }
                } catch (org.json.JSONException unused2) {
                    str2 = null;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    str = null;
                    com.knotapi.knot.webview.KnotView.this.onStorageDetails(str, null);
                    throw th;
                }
            }
        };
        this.isEmailLinkError = false;
        this.logoBitmap = null;
        try {
            this.context = context;
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Error creating context");
        }
    }

    private void addCleanCookies(java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List<com.knotapi.knot.utilities.Cookie> list = this.cookies;
        if (list != null) {
            java.util.Iterator<com.knotapi.knot.utilities.Cookie> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(getCookieSignature(it.next()));
            }
        }
        for (com.knotapi.knot.utilities.Cookie cookie : this.viewClient.getCookies(str)) {
            if (!hashSet.contains(getCookieSignature(cookie))) {
                this.cookies.add(cookie);
                hashSet.add(getCookieSignature(cookie));
            }
        }
    }

    private void executeJavaScript(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            webView.evaluateJavascript(java.lang.String.format(str, str2), null);
        } catch (java.lang.Exception unused) {
        }
    }

    private void fetchJSForPasskeyPage(final android.webkit.WebView webView, final com.google.gson.JsonElement jsonElement) {
        if (webView == null || webView.getUrl() == null || !webView.getUrl().contains("google.com") || jsonElement == null || jsonElement.getAsString().isEmpty()) {
            return;
        }
        try {
            com.google.gson.JsonElement jsonElement2 = com.google.gson.JsonParser.parseString(jsonElement.getAsString()).getAsJsonObject().get("passkeyRedirectJS");
            if (jsonElement2 == null || !jsonElement2.isJsonPrimitive()) {
                return;
            }
            this.jsHelper.fetchJS(jsonElement2.getAsString(), new com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback() { // from class: com.knotapi.knot.webview.KnotView.3
                @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
                public void onJSCodeFetched(java.lang.String str) {
                    com.knotapi.knot.webview.KnotView.this.handleJsCode(webView, jsonElement, str);
                }

                @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
                public void onFetchFailed(java.lang.Exception exc) {
                    com.knotapi.knot.webview.KnotView.this.redirectPasskeyPage(webView, jsonElement);
                }
            });
        } catch (java.lang.Exception unused) {
            redirectPasskeyPage(webView, jsonElement);
        }
    }

    private java.lang.String getCookieSignature(com.knotapi.knot.utilities.Cookie cookie) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(cookie.f3953name);
        sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb.append(cookie.value);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleJsCode(android.webkit.WebView webView, com.google.gson.JsonElement jsonElement, java.lang.String str) {
        try {
            com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonElement.getAsString()).getAsJsonObject();
            com.google.gson.Gson gson = new com.google.gson.Gson();
            java.lang.String[] strArr = (java.lang.String[]) gson.fromJson(asJsonObject.get("passkeyTexts"), java.lang.String[].class);
            java.lang.String[] strArr2 = (java.lang.String[]) gson.fromJson(asJsonObject.get("deviceTexts"), java.lang.String[].class);
            java.lang.String[] strArr3 = (java.lang.String[]) gson.fromJson(asJsonObject.get("buttonTexts"), java.lang.String[].class);
            if (strArr == null || strArr2 == null || strArr3 == null || strArr.length <= 0 || strArr2.length <= 0 || strArr3.length <= 0 || str == null || str.isEmpty()) {
                return;
            }
            webView.evaluateJavascript(java.lang.String.format(str.concat("checkAndClick(%s, %s, %s);"), gson.toJson(strArr), gson.toJson(strArr2), gson.toJson(strArr3)), null);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isConfirmationLinkValidForMerchant(int i, java.lang.String str) {
        if (i == 91) {
            return this.bot.checkEmailLinkIsValid(str);
        }
        if (i != 102) {
            return false;
        }
        return checkEmailConfirmationRegex(str);
    }

    static /* synthetic */ void lambda$preloadImage$1(java.lang.String str, final com.knotapi.knot.interfaces.ImageLoadCallback imageLoadCallback) {
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            final android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(httpURLConnection.getInputStream());
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.knotapi.knot.interfaces.ImageLoadCallback.this.onImageLoaded(decodeStream);
                }
            });
        } catch (java.lang.Exception unused) {
            android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
            java.util.Objects.requireNonNull(imageLoadCallback);
            handler.post(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.knotapi.knot.interfaces.ImageLoadCallback.this.onImageLoadFailed();
                }
            });
        }
    }

    private void preloadImage(final java.lang.String str, final com.knotapi.knot.interfaces.ImageLoadCallback imageLoadCallback) {
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.webview.KnotView.lambda$preloadImage$1(str, imageLoadCallback);
            }
        }).start();
    }

    private void reTryCookiesDisabled(android.webkit.WebView webView, com.google.gson.JsonElement jsonElement) {
        try {
            if (!webView.getUrl().contains("google.com") || jsonElement == null || jsonElement.getAsString().isEmpty()) {
                return;
            }
            com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonElement.getAsString()).getAsJsonObject();
            java.lang.String asString = asJsonObject.has("cookiesDisabledText") ? asJsonObject.get("cookiesDisabledText").getAsString() : "Cookies are disabled";
            java.lang.String asString2 = asJsonObject.has("tryAgainText") ? asJsonObject.get("tryAgainText").getAsString() : "Try again";
            if (asString == null || asString2 == null) {
                return;
            }
            webView.evaluateJavascript(java.lang.String.format(com.knotapi.knot.utilities.JsScripts.retryCookies, asString, asString2), null);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redirectPasskeyPage(android.webkit.WebView webView, com.google.gson.JsonElement jsonElement) {
        if (webView == null || webView.getUrl() == null || !webView.getUrl().contains("google.com") || jsonElement == null || jsonElement.getAsString().isEmpty()) {
            return;
        }
        try {
            handleJsCode(webView, jsonElement, com.knotapi.knot.utilities.JsScripts.redirectPasskeyPage);
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupAndShowBottomSheet(android.graphics.Bitmap bitmap, boolean z) {
        this.isEmailLinkError = z;
        final com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog knotBottomSheetDialog = new com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog(this.webViewDelegate);
        java.lang.String invalidLinkDialogTitle = z ? getInvalidLinkDialogTitle() : getEmailDialogTitle();
        java.lang.String invalidLinkDialogMessage = z ? getInvalidLinkDialogMessage() : getEmailDialogMessage();
        if (!z) {
            this.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(this.bot.getBotId()), com.knotapi.knot.utilities.Constants.META_FLOW, "login paste link overlay", "");
        }
        com.knotapi.knot.models.DialogOptions dialogOptions = new com.knotapi.knot.models.DialogOptions(invalidLinkDialogTitle, invalidLinkDialogMessage, "", getDialogButtonText(), new android.view.View.OnClickListener() { // from class: com.knotapi.knot.webview.KnotView.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
            }
        }, new android.view.View.OnClickListener() { // from class: com.knotapi.knot.webview.KnotView.6
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.lang.String confirmationLink = knotBottomSheetDialog.getConfirmationLink();
                com.knotapi.knot.webview.KnotView knotView = com.knotapi.knot.webview.KnotView.this;
                knotView.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(knotView.bot.getBotId()), com.knotapi.knot.utilities.Constants.META_BUTTON_CLICKED, com.knotapi.knot.webview.KnotView.this.getDialogButtonText(), "Merchant Login Paste Link");
                com.knotapi.knot.webview.KnotView knotView2 = com.knotapi.knot.webview.KnotView.this;
                if (knotView2.isConfirmationLinkValidForMerchant(knotView2.bot.getMerchantId(), confirmationLink)) {
                    com.knotapi.knot.webview.KnotView.this.showLoader();
                    com.knotapi.knot.webview.KnotView.this.loadUrl(confirmationLink);
                    com.knotapi.knot.webview.KnotView.this.fromDialog = true;
                } else {
                    com.knotapi.knot.webview.KnotView knotView3 = com.knotapi.knot.webview.KnotView.this;
                    knotView3.isEmailLinkError = true;
                    knotView3.openLinkDialog(true);
                }
                knotBottomSheetDialog.closeSheet();
            }
        }, new android.view.View.OnClickListener() { // from class: com.knotapi.knot.webview.KnotView.7
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                com.knotapi.knot.webview.KnotView knotView = com.knotapi.knot.webview.KnotView.this;
                knotView.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(knotView.bot.getBotId()), com.knotapi.knot.utilities.Constants.META_BUTTON_CLICKED, "Close merchant overlay", "Merchant Login Paste Link");
                com.knotapi.knot.webview.KnotView knotView2 = com.knotapi.knot.webview.KnotView.this;
                knotView2.webViewDelegate.userCloseMerchantView(knotView2.bot.getBotId(), com.knotapi.knot.webview.KnotView.this.bot.getMerchantId());
                knotBottomSheetDialog.closeSheet();
            }
        }, getDialogHint());
        if (bitmap != null) {
            knotBottomSheetDialog.setBitmap(bitmap);
        }
        knotBottomSheetDialog.setDialogOptions(dialogOptions);
        knotBottomSheetDialog.setNonDismissible(true);
        android.app.Activity activity = this.activity;
        if (activity instanceof androidx.fragment.app.FragmentActivity) {
            knotBottomSheetDialog.show(((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager(), knotBottomSheetDialog.getTag());
        }
    }

    private void startTimeOutFunction() {
        try {
            this.webViewDelegate.setNeedTimeOutCall(true);
            this.webViewDelegate.callTimeOutErrorCallback(this.bot.getBotId());
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error executing startTimeOutFunction");
        }
    }

    public void addCookies(java.lang.String str) {
        try {
            if (this.bot.hasGetCleanCookies() && this.bot.getCleanCookies()) {
                addCleanCookies(str);
            } else {
                this.cookies = com.knotapi.knot.utilities.Cookie.mergeAll(this.cookies, this.viewClient.getCookies(str));
            }
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error executing addCookies for url ".concat(java.lang.String.valueOf(str)));
        }
    }

    public void addLocalStorage(java.lang.String str, java.lang.String str2) {
        try {
            evaluateJavascript(java.lang.String.format(com.knotapi.knot.utilities.JsScripts.ADD_TO_LOCAL_STORAGE, str, str2), null);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error evaluating js for addLocalStorage");
        }
    }

    public void adjustAppleHeight() {
        try {
            evaluateJavascript(java.lang.String.format(com.knotapi.knot.utilities.JsScripts.UPDATE_HEIGHT_COMBINED, kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO), null);
        } catch (java.lang.Exception unused) {
        }
    }

    public void captureManualScreenshot(com.knotapi.knot.webview.KnotView knotView) {
        knotView.evaluateJavascript("window.requestKnotScreenshot({ type: 'manual', reason: 'native_button' });", null);
    }

    public boolean checkEmailConfirmationRegex(java.lang.String str) {
        try {
            return java.util.regex.Pattern.compile(this.bot.getAllSettings().get("confirmationLinkRegex").getAsString()).matcher(str).matches();
        } catch (java.lang.Exception unused) {
            this.bot.getAllSettings().get("confirmationLinkRegex").getAsString();
            return false;
        }
    }

    public void checkWebPageNotAvailable() {
        evaluateJavascript(com.knotapi.knot.utilities.JsScripts.CHECK_WEBPAGE_NOT_AVAILABLE, null);
    }

    public void clear() {
        try {
            clearCache(true);
            clearFormData();
            clearHistory();
            clearCookies();
            clearLocalStorage();
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error clearing browser");
        }
    }

    public void clearCookies() {
        try {
            android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
            this.cookies.clear();
            if (com.knotapi.knot.ui.activities.KnotActivity.domainUrls != null) {
                com.knotapi.knot.utilities.Helper.resetCookies(new com.knotapi.knot.utilities.PreferenceManager().getString(this.context, com.knotapi.knot.utilities.PreferenceManager.PREF_CLIENT_COOKIES, ""));
            }
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error clearing cookies");
        }
    }

    public void clearLocalStorage() {
        try {
            evaluateJavascript(com.knotapi.knot.utilities.JsScripts.CLEAR_LOCAL_STORAGE, null);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error evaluating js for clearLocalStorage");
        }
    }

    public void defaultAction(android.webkit.WebView webView) {
        com.google.gson.JsonElement jsonElement;
        com.google.gson.JsonElement jsonElement2;
        com.google.gson.JsonElement jsonElement3;
        com.google.gson.JsonObject jsonObject = this.globalSettings;
        if (jsonObject != null) {
            jsonElement = jsonObject.get("chrome_element");
            jsonElement2 = this.globalSettings.get("disabled_cookies_element");
            jsonElement3 = this.globalSettings.get("redirect_passkey_values");
        } else {
            jsonElement = null;
            jsonElement2 = null;
            jsonElement3 = null;
        }
        performBulkAction(webView, getElementSelector(jsonElement, this.bot.getAllSettings().get("removeChromeElement")), "removeChromeElements");
        reTryCookiesDisabled(webView, jsonElement2);
        fetchJSForPasskeyPage(webView, jsonElement3);
    }

    public void finalStep() {
        try {
            this.viewClient.ssoCookieHelper.saveTempCookiesToSharedPreferencesAsync(this.activity);
            if (getUrl().equals(this.bot.getCallbackUrl()) && this.bot.getCallbackScript() != null) {
                evaluateJavascript(this.bot.getCallbackScript(), null);
            }
            this.mExtraInfo.setUserAgent(getSettings().getUserAgentString());
            addCookies(getUrl());
            captureManualScreenshot(this);
            setWebViewClient(new android.webkit.WebViewClient() { // from class: com.knotapi.knot.webview.KnotView.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest) {
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }
            });
            getStorageDetails();
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error executing finalStep");
        }
    }

    public com.knotapi.knot.models.Bot getBot() {
        return this.bot;
    }

    public java.util.List<com.knotapi.knot.utilities.Cookie> getCookies() {
        return this.cookies;
    }

    public java.lang.String getDialogButtonText() {
        return this.bot.getAllSettings().has("dialogButtonText") ? this.bot.getAllSettings().get("dialogButtonText").getAsString() : "Continue";
    }

    public java.lang.String getDialogHint() {
        if (this.bot.getAllSettings().has("dialogHint")) {
            return this.bot.getAllSettings().get("dialogHint").getAsString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://");
        sb.append(this.bot.getMerchantName().replace(" ", "").toLowerCase());
        sb.append(".com/");
        return sb.toString();
    }

    public java.lang.String getEmailDialogMessage() {
        return this.bot.getAllSettings().has("completionDialogMessage") ? this.bot.getAllSettings().get("completionDialogMessage").getAsString() : "Complete Login";
    }

    public java.lang.String getEmailDialogTitle() {
        if (this.bot.getAllSettings().has("completionDialogTitle")) {
            return this.bot.getAllSettings().get("completionDialogTitle").getAsString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("You should have received a link from ");
        sb.append(this.bot.getMerchantName() != null ? this.bot.getMerchantName() : "");
        sb.append(". Paste it into the field below.");
        return sb.toString();
    }

    public java.lang.String getInvalidLinkDialogMessage() {
        return this.bot.getAllSettings().has("invalidLinkDialogMessage") ? this.bot.getAllSettings().get("invalidLinkDialogMessage").getAsString() : "The link you pasted in does not look like a confirmation link. Please try again or tap \"Cancel\" to update your card with another merchant.";
    }

    public java.lang.String getInvalidLinkDialogTitle() {
        return this.bot.getAllSettings().has("invalidLinkDialogTitle") ? this.bot.getAllSettings().get("invalidLinkDialogTitle").getAsString() : "Error";
    }

    public com.knotapi.knot.interfaces.MerchantViewListener getMerchantViewListener() {
        return this.merchantViewListener;
    }

    public void getStorageDetails() {
        try {
            evaluateJavascript(com.knotapi.knot.utilities.JsScripts.GET_LOCAL_SESSION_STORAGE, this.storageDetailsCallBack);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error evaluating js for getStorageDetails");
        }
    }

    public long getStorageValidationStartTime() {
        return this.storageValidationStartTime;
    }

    public com.knotapi.knot.webview.KnotViewClient getViewClient() {
        return this.viewClient;
    }

    public com.knotapi.knot.interfaces.MerchantWebViewDelegate getWebViewDelegate() {
        return this.webViewDelegate;
    }

    public com.knotapi.knot.models.ExtraInfo getmExtraInfo() {
        return this.mExtraInfo;
    }

    public void handleAction(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        char c;
        str2.hashCode();
        int hashCode = str2.hashCode();
        if (hashCode == -1602791013) {
            if (str2.equals("removeElements")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -1003762255) {
            if (hashCode == -418944203 && str2.equals("removeChromeElements")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str2.equals("disableLinks")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            executeJavaScript(webView, com.knotapi.knot.utilities.JsScripts.REMOVE_ITEM, str, str2);
        } else if (c == 1) {
            executeJavaScript(webView, com.knotapi.knot.utilities.JsScripts.DISABLE_LINKS, str, str2);
        } else {
            if (c != 2) {
                return;
            }
            executeJavaScript(webView, com.knotapi.knot.utilities.JsScripts.REMOVE_CHROME_ITEM, str, str2);
        }
    }

    public void hideLoader() {
        try {
            if (!com.knotapi.knot.utilities.Helper.isUrlMatch(getUrl(), this.bot.hasHiddenPagesPattern() ? this.bot.getHiddenPagesPattern() : "", true)) {
                if (this.merchantViewListener.isLoaderVisible()) {
                    this.merchantViewListener.setLoaderVisibility(8);
                }
            } else {
                if (this.merchantViewListener.isLoaderVisible() || this.showErrorPage) {
                    return;
                }
                this.merchantViewListener.setLoaderVisibility(0);
            }
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error executing hideLoader");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.knotapi.knot.webview.KnotView init(android.app.Activity activity, com.knotapi.knot.interfaces.MerchantViewListener merchantViewListener) {
        try {
            this.activity = activity;
            this.merchantViewListener = merchantViewListener;
            this.webViewDelegate = (com.knotapi.knot.interfaces.MerchantWebViewDelegate) activity;
            this.cookies = new java.util.ArrayList();
            this.mExtraInfo = new com.knotapi.knot.models.ExtraInfo();
            listenToDOMChanges();
            this.jsHelper = com.knotapi.knot.utilities.WebAppJSFetcher.getInstance();
            return this;
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error executing init");
            return this;
        }
    }

    public boolean isUserLoggedIn(java.lang.String str) {
        return this.viewClient.isUserLoggedIn(str);
    }

    public void listenToDOMChanges() {
        try {
            java.lang.String str = this.injectedAssets.containsKey("listenDomChanges.js") ? this.injectedAssets.get("listenDomChanges.js") : com.knotapi.knot.utilities.JsScripts.LISTEN_DOM_CHANGES;
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            evaluateJavascript(str, null);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Error executing listenToDOMChanges");
        }
    }

    public void loginDone() {
        try {
            this.viewClient.ssoCookieHelper.saveTempCookiesToSharedPreferencesAsync(this.activity);
            if (this.isLoggedIn) {
                return;
            }
            captureManualScreenshot(this);
            this.isLoggedIn = true;
            if (!this.isTimeOutStart.booleanValue()) {
                this.isTimeOutStart = java.lang.Boolean.TRUE;
                startTimeOutFunction();
            }
            if (this.bot.isInterceptRedirectionIntent()) {
                getmExtraInfo().setIntentRedirection(getUrl());
                finalStep();
            }
            proceedAfterLogin();
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Error in loginDone");
        }
    }

    public void onStorageDetails(java.lang.String str, java.lang.String str2) {
        try {
            this.viewClient.onStorageDetails(str, str2);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error on viewClient while executing onStorageDetails");
        }
    }

    public void openLinkDialog(final boolean z) {
        android.graphics.Bitmap bitmap = this.logoBitmap;
        if (bitmap != null) {
            setupAndShowBottomSheet(bitmap, z);
        } else {
            preloadImage(this.bot.getLogoURL(), new com.knotapi.knot.interfaces.ImageLoadCallback() { // from class: com.knotapi.knot.webview.KnotView.4
                @Override // com.knotapi.knot.interfaces.ImageLoadCallback
                public void onImageLoadFailed() {
                    com.knotapi.knot.webview.KnotView.this.setupAndShowBottomSheet(null, z);
                }

                @Override // com.knotapi.knot.interfaces.ImageLoadCallback
                public void onImageLoaded(android.graphics.Bitmap bitmap2) {
                    com.knotapi.knot.webview.KnotView knotView = com.knotapi.knot.webview.KnotView.this;
                    knotView.logoBitmap = bitmap2;
                    knotView.setupAndShowBottomSheet(bitmap2, z);
                }
            });
        }
    }

    public void performAllBulkActions(android.webkit.WebView webView, boolean z) {
        if (z) {
            if (this.bot.hasChromeRemoveElements()) {
                performBulkAction(webView, this.bot.getChromeDisableLinks(), "disableLinks");
            }
            if (this.bot.hasChromeDisableLinks()) {
                performBulkAction(webView, this.bot.getChromeRemoveElements(), "removeElements");
                return;
            }
            return;
        }
        if (this.bot.hasDisableLinks()) {
            performBulkAction(webView, this.bot.getDisableLinks(), "disableLinks");
        }
        if (this.bot.hasRemoveElements()) {
            performBulkAction(webView, this.bot.getRemoveElements(), "removeElements");
        }
    }

    public void performBulkAction(android.webkit.WebView webView, java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                handleAction(webView, jSONArray.getString(i), str2);
            }
        } catch (org.json.JSONException | java.lang.Exception unused) {
        }
    }

    public void proceedAfterLogin() {
        try {
            if (!this.bot.isPaymentUrlSet() || this.isPaymentPageLoaded) {
                finalStep();
            } else {
                this.isPaymentPageLoaded = true;
                loadUrl(this.bot.hasPaymentsRedirectUrl() ? this.bot.getPaymentsRedirectUrl() : this.bot.hasPaymentUrlAndroid() ? this.bot.getPaymentUrlAndroid() : this.bot.getPaymentUrl());
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void removeFBWarning() {
        try {
            evaluateJavascript(com.knotapi.knot.utilities.JsScripts.REMOVE_FB_WARNING, null);
        } catch (java.lang.Exception unused) {
        }
    }

    public void sendCustomEvents(com.knotapi.knot.models.CustomEvent customEvent) {
        this.webViewDelegate.sendBotCustomEvent(customEvent);
    }

    public com.knotapi.knot.webview.KnotView setBot(com.knotapi.knot.models.Bot bot) {
        try {
            this.bot = bot;
            this.globalSettings = bot.fetchGlobalSettings();
            if (this.jsHelper == null) {
                this.jsHelper = com.knotapi.knot.utilities.WebAppJSFetcher.getInstance();
            }
            com.knotapi.knot.utilities.ScreenshotHelper.fetchScreenshotJS(this.globalSettings, this.jsHelper);
            return this;
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Error creating context");
            return this;
        }
    }

    public void setCookies(java.util.List<com.knotapi.knot.utilities.Cookie> list) {
        this.cookies = list;
    }

    public com.knotapi.knot.webview.KnotView setDefaultSettings() {
        try {
            setScrollBarStyle(0);
            android.webkit.WebView.setWebContentsDebuggingEnabled(false);
            android.webkit.WebSettings settings = getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setTextZoom(100);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setSupportMultipleWindows(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
            if (this.bot.isLoadNoCacheMode()) {
                settings.setCacheMode(2);
            } else {
                settings.setCacheMode(-1);
            }
            settings.setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            settings.setUseWideViewPort(true);
            settings.setSaveFormData(true);
            settings.setEnableSmoothTransition(true);
            settings.setSavePassword(true);
            android.webkit.CookieManager.getInstance().setAcceptCookie(true);
            android.webkit.CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
            this.viewClient = com.knotapi.knot.webview.KnotViewClient.newInstance(this);
            addJavascriptInterface(new com.knotapi.knot.webview.JSInterfaceObject(this), "JSInterface");
            setWebViewClient(this.viewClient);
            getSettings().setUserAgentString(this.viewClient.getUserAgent());
            clear();
            return this;
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Error executing setDefaultSettings");
            return this;
        }
    }

    public com.knotapi.knot.webview.KnotView setInjectedAssets(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map != null) {
            this.injectedAssets.clear();
            this.injectedAssets.putAll(map);
        }
        return this;
    }

    public void setStorageValidationStartTime(long j) {
        this.storageValidationStartTime = j;
    }

    public void showLoader() {
        try {
            if (com.knotapi.knot.utilities.Helper.isUrlMatch(getUrl(), this.bot.hasVisiblePagesPattern() ? this.bot.getVisiblePagesPattern() : "", true)) {
                if (this.merchantViewListener.isLoaderVisible()) {
                    this.merchantViewListener.setLoaderVisibility(8);
                }
            } else {
                if (this.merchantViewListener.isLoaderVisible() || this.showErrorPage) {
                    return;
                }
                this.merchantViewListener.setLoaderVisibility(0);
            }
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error executing showLoader");
        }
    }

    public com.knotapi.knot.webview.KnotView start() {
        try {
            if (this.bot.isLoginTypeAndroid()) {
                loadUrl(this.bot.getLoginUrlAndroid());
            } else {
                loadUrl(this.bot.getLoginUrl());
            }
            if (this.bot.hasCustomLoginScript()) {
                evaluateJavascript(this.bot.getCustomLoginScript(), null);
            }
            if (this.bot.hasLoginScript()) {
                startBot();
                this.merchantViewListener.hideBottomFragment();
                startTimeOutFunction();
            }
            return this;
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error executing start");
            return this;
        }
    }

    public void startBot() {
        try {
            com.knotapi.knot.models.CustomEvent customEvent = new com.knotapi.knot.models.CustomEvent(this.bot);
            customEvent.setShouldStartBot(true);
            this.webViewDelegate.sendBotCustomEvent(customEvent);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error executing startBot");
        }
    }

    public void trackNativeMerchantEvents() {
        try {
            evaluateJavascript(com.knotapi.knot.utilities.JsScripts.EVENT_TRACKER_SCRIPT, null);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error evaluating js for trackNativeMerchantEvents");
        }
    }

    private java.lang.String getElementSelector(com.google.gson.JsonElement jsonElement, com.google.gson.JsonElement jsonElement2) {
        java.lang.String str;
        com.google.gson.JsonObject asJsonObject;
        if (jsonElement != null && jsonElement.isJsonPrimitive()) {
            try {
                asJsonObject = com.google.gson.JsonParser.parseString(jsonElement.getAsString()).getAsJsonObject();
            } catch (java.lang.Exception e) {
                e.getMessage();
            }
            if (asJsonObject.has("key")) {
                str = asJsonObject.get("key").getAsString();
                return jsonElement2 != null ? str : str;
            }
        }
        str = "[\".yOnVIb .G8ZO0d li\"]";
        return jsonElement2 != null ? str : str;
    }

    public KnotView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isLoggedIn = false;
        this.showErrorPage = false;
        this.isPaymentPageLoaded = false;
        this.isTimeOutStart = java.lang.Boolean.FALSE;
        this.loginType = com.knotapi.knot.utilities.Constants.NORMAL_LOGIN;
        this.fromDialog = false;
        this.globalSettings = null;
        this.storageValidationStartTime = 0L;
        this.injectedAssets = new java.util.HashMap();
        this.storageDetailsCallBack = new android.webkit.ValueCallback<java.lang.String>() { // from class: com.knotapi.knot.webview.KnotView.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(java.lang.String str) {
                java.lang.Throwable th;
                java.lang.String str2;
                try {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                        str2 = jSONObject.getString("l");
                        try {
                            com.knotapi.knot.webview.KnotView.this.onStorageDetails(str2, jSONObject.getString(lib.android.paypal.com.magnessdk.g.n2));
                        } catch (org.json.JSONException unused) {
                            java.lang.String str3 = com.knotapi.knot.webview.KnotView.TAG;
                            com.knotapi.knot.webview.KnotView.this.onStorageDetails(str2, null);
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        com.knotapi.knot.webview.KnotView.this.onStorageDetails(str, null);
                        throw th;
                    }
                } catch (org.json.JSONException unused2) {
                    str2 = null;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    str = null;
                    com.knotapi.knot.webview.KnotView.this.onStorageDetails(str, null);
                    throw th;
                }
            }
        };
        this.isEmailLinkError = false;
        this.logoBitmap = null;
        try {
            this.context = context;
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Generic error creating context with attrs");
        }
    }
}

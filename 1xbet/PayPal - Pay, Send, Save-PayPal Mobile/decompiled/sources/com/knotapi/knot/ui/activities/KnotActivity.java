package com.knotapi.knot.ui.activities;

/* loaded from: classes9.dex */
public class KnotActivity extends androidx.appcompat.app.AppCompatActivity implements com.knotapi.knot.interfaces.MerchantClickDelegate, com.knotapi.knot.interfaces.MerchantWebViewDelegate, com.knotapi.knot.interfaces.WebAppLoadingListener, com.knotapi.knot.interfaces.ErrorReporterDelegate {
    public static final java.lang.String TAG = "Knot:KnotActivity";
    public static android.app.Activity activity;
    public static java.lang.String[] domainUrls;
    private static final java.util.Map<java.lang.String, java.lang.String> pendingAssets = new java.util.HashMap();
    public java.lang.String appRootURL;
    double cardSwitcherLoadTime;
    androidx.constraintlayout.widget.ConstraintLayout clSlowInternet;
    java.lang.String clientId;
    com.knotapi.knot.models.CustomerConfiguration customerConfiguration;
    java.lang.String entryPoint;
    com.knotapi.knot.models.Environment environment;
    com.google.gson.Gson gson;
    android.widget.ImageView imgClose;
    android.widget.ImageView imgCloseSdk;
    java.lang.String internetSpeed;
    java.lang.Boolean isBotStarted;
    java.lang.Boolean isSdkLoaded;
    java.lang.Boolean isSdkStartLoading;
    java.lang.Boolean isShowSlowInternet;
    java.lang.Boolean isWebLoadError;
    com.airbnb.lottie.LottieAnimationView lottieAnimationView;
    private java.util.Map<java.lang.String, com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment> merchantFragmentMap;
    int[] merchantIds;
    java.lang.Boolean needTimeOutCall;
    com.knotapi.knot.utilities.PreferenceManager preferenceManager;
    java.lang.String sessionId;
    android.webkit.WebView switcherWebView;
    java.lang.String timeOutErrorMessage;
    java.lang.Boolean useCategories;
    java.lang.Boolean useSearch;
    private android.os.Vibrator vibrator;
    private com.knotapi.knot.webview.WebViewManager webViewManager;
    java.lang.String version = com.knotapi.knot.BuildConfig.VERSION_NAME;
    private final java.util.List<com.knotapi.knot.models.Bot> mBots = new java.util.ArrayList();

    /* renamed from: com.knotapi.knot.ui.activities.KnotActivity$3, reason: invalid class name */
    public class AnonymousClass3 implements com.knotapi.knot.webview.WebViewManager.WebViewCreationCallback {
        final /* synthetic */ java.lang.String val$botIdStr;
        final /* synthetic */ com.knotapi.knot.models.Bot val$newBot;
        final /* synthetic */ com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment val$newFragment;

        public AnonymousClass3(com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment, com.knotapi.knot.models.Bot bot, java.lang.String str) {
            this.val$newFragment = merchantWebViewListenerFragment;
            this.val$newBot = bot;
            this.val$botIdStr = str;
        }

        /* renamed from: lambda$onWebViewCreated$0$com-knotapi-knot-ui-activities-KnotActivity$3, reason: not valid java name */
        /* synthetic */ void m10826xf501e75e(com.knotapi.knot.models.Bot bot) {
            com.knotapi.knot.ui.activities.KnotActivity.this.sendNativeLogEvent(java.lang.Integer.valueOf(bot.getBotId()), com.knotapi.knot.utilities.Constants.META_FLOW, "canceled because of null merchantWebView", "");
            com.knotapi.knot.ui.activities.KnotActivity.this.switcherWebView.goBack();
        }

        @Override // com.knotapi.knot.webview.WebViewManager.WebViewCreationCallback
        public void onWebViewCreated(com.knotapi.knot.webview.KnotView knotView) {
            if (knotView == null) {
                android.os.Handler handler = new android.os.Handler();
                final com.knotapi.knot.models.Bot bot = this.val$newBot;
                handler.postDelayed(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.activities.KnotActivity$3$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.knotapi.knot.ui.activities.KnotActivity.AnonymousClass3.this.m10826xf501e75e(bot);
                    }
                }, 10000L);
                return;
            }
            this.val$newFragment.setMerchantWebView(knotView);
            this.val$newFragment.setBot(this.val$newBot);
            this.val$newFragment.setWebViewDelegate(com.knotapi.knot.ui.activities.KnotActivity.this);
            this.val$newFragment.setMerchantIds(com.knotapi.knot.ui.activities.KnotActivity.this.merchantIds);
            this.val$newFragment.setInjectedAssets(com.knotapi.knot.ui.activities.KnotActivity.getCachedAssets());
            if (!this.val$newBot.getDetached().booleanValue()) {
                com.knotapi.knot.ui.activities.KnotActivity.this.getLifecycle().addObserver(new androidx.view.LifecycleEventObserver() { // from class: com.knotapi.knot.ui.activities.KnotActivity.3.1
                    @Override // androidx.view.LifecycleEventObserver
                    public void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                        if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME) {
                            androidx.fragment.app.FragmentManager supportFragmentManager = com.knotapi.knot.ui.activities.KnotActivity.this.getSupportFragmentManager();
                            if (!supportFragmentManager.isStateSaved() && !com.knotapi.knot.ui.activities.KnotActivity.this.isFinishing() && !com.knotapi.knot.ui.activities.KnotActivity.this.isDestroyed() && !com.knotapi.knot.ui.activities.KnotActivity.AnonymousClass3.this.val$newFragment.isAdded()) {
                                try {
                                    com.knotapi.knot.ui.activities.KnotActivity.AnonymousClass3 anonymousClass3 = com.knotapi.knot.ui.activities.KnotActivity.AnonymousClass3.this;
                                    anonymousClass3.val$newFragment.show(supportFragmentManager, anonymousClass3.val$botIdStr);
                                } catch (java.lang.IllegalStateException e) {
                                    com.knotapi.knot.services.ErrorReporter.report(e, "Failed to show fragment - FragmentManager may be destroyed");
                                }
                            }
                            com.knotapi.knot.ui.activities.KnotActivity.this.getLifecycle().removeObserver(this);
                        }
                    }
                });
            } else {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) com.knotapi.knot.ui.activities.KnotActivity.this.findViewById(com.knotapi.knot.R.id.temporary_webView_container);
                knotView.getSettings().setUserAgentString("Mozilla/5.0 (iPad; CPU OS 16_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.5 Mobile/15E148 Safari/604.1");
                frameLayout.addView(knotView);
            }
        }
    }

    public KnotActivity() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.needTimeOutCall = bool;
        this.timeOutErrorMessage = "agent";
        this.isBotStarted = bool;
        this.isShowSlowInternet = bool;
        this.entryPoint = null;
        this.internetSpeed = "";
        this.preferenceManager = null;
        this.cardSwitcherLoadTime = 0.0d;
        this.appRootURL = "";
        this.gson = new com.google.gson.Gson();
        this.merchantFragmentMap = new java.util.HashMap();
        this.isSdkLoaded = bool;
        this.isSdkStartLoading = bool;
        this.isWebLoadError = bool;
    }

    private void clearCookies() {
        android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
        cookieManager.removeAllCookies(null);
        cookieManager.flush();
        if (domainUrls != null) {
            com.knotapi.knot.utilities.Helper.resetCookies(this.preferenceManager.getString(this, com.knotapi.knot.utilities.PreferenceManager.PREF_CLIENT_COOKIES, ""));
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> getCachedAssets() {
        return pendingAssets;
    }

    static /* synthetic */ boolean lambda$getBotById$10(int i, com.knotapi.knot.models.Bot bot) {
        return bot.getBotId() == i;
    }

    static /* synthetic */ androidx.core.view.WindowInsetsCompat lambda$onCreate$0(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars());
        view.setPadding(view.getPaddingLeft(), insets.top, view.getPaddingRight(), insets.bottom);
        return androidx.core.view.WindowInsetsCompat.CONSUMED;
    }

    private void validateAndReportCredentialCapture(com.knotapi.knot.models.Bot bot, java.lang.String str, java.lang.String str2) {
        if (bot != null) {
            try {
                if (bot.getCredentialTracking()) {
                    if (str == null || str.isEmpty() || str.equals("{}")) {
                        java.lang.String merchantName = bot.getMerchantName() != null ? bot.getMerchantName() : "Unknown";
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("credentials_");
                        sb.append(bot.getMerchantId());
                        java.lang.String obj = sb.toString();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("CREDENTIAL_VALIDATION_START - ");
                        sb2.append(merchantName);
                        sb2.append(" - Session: ");
                        sb2.append(str2);
                        com.knotapi.knot.services.ErrorReporter.addBreadcrumb(sb2.toString(), "credential_validation");
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(merchantName);
                        sb3.append(" credentials not captured");
                        java.lang.Exception exc = new java.lang.Exception(sb3.toString());
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(merchantName);
                        sb4.append(" credential capture failed - Session: ");
                        sb4.append(str2);
                        com.knotapi.knot.services.ErrorReporter.reportWithBreadcrumbs(exc, sb4.toString(), obj);
                    }
                }
            } catch (java.lang.Exception e) {
                com.knotapi.knot.services.ErrorReporter.report(e, "Error executing validateAndReportCredentialCapture");
            }
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantClickDelegate
    public void attachMerchantWebView(java.lang.String str) {
        try {
            java.lang.String valueOf = java.lang.String.valueOf(new org.json.JSONObject(str).optInt("botId"));
            com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment = this.merchantFragmentMap.get(valueOf);
            if (merchantWebViewListenerFragment == null || isFinishing() || isDestroyed()) {
                return;
            }
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager.isStateSaved() || merchantWebViewListenerFragment.isAdded()) {
                return;
            }
            try {
                merchantWebViewListenerFragment.show(supportFragmentManager, valueOf);
            } catch (java.lang.IllegalStateException e) {
                com.knotapi.knot.services.ErrorReporter.report(e, "Failed to show fragment - FragmentManager may be destroyed");
            }
        } catch (org.json.JSONException unused) {
            sendNativeLogEvent(null, com.knotapi.knot.utilities.Constants.META_FLOW, "Error while parsing attach merchant web view event properties", "");
        } catch (java.lang.Exception unused2) {
        }
    }

    public void cacheDynamicAsset(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> map = pendingAssets;
        synchronized (map) {
            map.put(str, str2);
        }
    }

    public void callSlowInternetTimeOut() {
        new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.ui.activities.KnotActivity.this.m10816x32fbabae();
            }
        }, androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void callTimeOutErrorCallback(int i) {
        final com.knotapi.knot.models.Bot botById = getBotById(i);
        new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.ui.activities.KnotActivity.this.m10817x3d1d8e73(botById);
            }
        }, 120000L);
    }

    public void clear() {
        try {
            this.switcherWebView.clearCache(true);
            this.switcherWebView.clearFormData();
            this.switcherWebView.clearHistory();
            clearCookies();
            clearLocalStorage();
        } catch (java.lang.Exception unused) {
        }
    }

    public void clearLocalStorage() {
        try {
            this.switcherWebView.evaluateJavascript(com.knotapi.knot.utilities.JsScripts.CLEAR_LOCAL_STORAGE, null);
            android.webkit.WebStorage.getInstance().deleteAllData();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantClickDelegate
    public void didMerchantClick(java.lang.String str) {
        try {
            com.knotapi.knot.models.Bot botObject = com.knotapi.knot.models.Bot.getBotObject(str);
            int[] iArr = this.merchantIds;
            botObject.setMerchantCount(iArr != null ? iArr.length : 0);
            java.lang.String valueOf = java.lang.String.valueOf(botObject.getBotId());
            com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment = this.merchantFragmentMap.get(valueOf);
            if (merchantWebViewListenerFragment == null || !merchantWebViewListenerFragment.isVisible()) {
                clearCookies();
                this.isBotStarted = java.lang.Boolean.FALSE;
                this.mBots.add(botObject);
                com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment newInstance = com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment.newInstance(botObject);
                com.knotapi.knot.webview.WebViewManager webViewManager = this.webViewManager;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("merchantWebView-");
                sb.append(botObject.getBotId());
                webViewManager.createWebView(sb.toString(), botObject, this, newInstance, new com.knotapi.knot.ui.activities.KnotActivity.AnonymousClass3(newInstance, botObject, valueOf));
                this.merchantFragmentMap.put(valueOf, newInstance);
            }
        } catch (org.json.JSONException unused) {
            sendNativeLogEvent(null, com.knotapi.knot.utilities.Constants.META_FLOW, "Error while parsing merchant click event properties", "");
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void evaluateJS(final java.lang.String str) {
        runOnUiThread(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.ui.activities.KnotActivity.this.m10818lambda$evaluateJS$9$comknotapiknotuiactivitiesKnotActivity(str);
            }
        });
    }

    @Override // android.app.Activity
    public void finish() {
        trackCloseSDK();
        super.finish();
    }

    public void hideLoading() {
        runOnUiThread(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.ui.activities.KnotActivity.this.m10819lambda$hideLoading$5$comknotapiknotuiactivitiesKnotActivity();
            }
        });
    }

    public void hideSlowInternetPopup() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        this.clSlowInternet.startAnimation(alphaAnimation);
        this.clSlowInternet.setVisibility(8);
    }

    /* renamed from: lambda$callSlowInternetTimeOut$6$com-knotapi-knot-ui-activities-KnotActivity, reason: not valid java name */
    /* synthetic */ void m10816x32fbabae() {
        if (this.isShowSlowInternet.booleanValue()) {
            this.preferenceManager.saveString(this, com.knotapi.knot.utilities.PreferenceManager.PREF_INTERNET_SPEED, this.internetSpeed);
            this.preferenceManager.saveString(this, com.knotapi.knot.utilities.PreferenceManager.PREF_SDK_LOAD_TIME, java.lang.String.valueOf(this.cardSwitcherLoadTime));
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000L);
            this.clSlowInternet.setVisibility(0);
            this.clSlowInternet.startAnimation(alphaAnimation);
            trackShowSlowInternetMessage();
        }
    }

    /* renamed from: lambda$callTimeOutErrorCallback$8$com-knotapi-knot-ui-activities-KnotActivity, reason: not valid java name */
    /* synthetic */ void m10817x3d1d8e73(com.knotapi.knot.models.Bot bot) {
        if (this.needTimeOutCall.booleanValue()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotError\", { bubbles: true, detail: { merchantId: ");
            sb.append(bot != null ? java.lang.Integer.valueOf(bot.getMerchantId()) : "''");
            sb.append(", botId: ");
            sb.append(bot != null ? java.lang.Integer.valueOf(bot.getBotId()) : "''");
            sb.append(", errorMessage: \"");
            sb.append(this.timeOutErrorMessage);
            sb.append("\" } }));})();");
            evaluateJS(sb.toString());
            clear();
        }
    }

    /* renamed from: lambda$evaluateJS$9$com-knotapi-knot-ui-activities-KnotActivity, reason: not valid java name */
    /* synthetic */ void m10818lambda$evaluateJS$9$comknotapiknotuiactivitiesKnotActivity(java.lang.String str) {
        this.switcherWebView.evaluateJavascript(str, null);
    }

    /* renamed from: lambda$hideLoading$5$com-knotapi-knot-ui-activities-KnotActivity, reason: not valid java name */
    /* synthetic */ void m10819lambda$hideLoading$5$comknotapiknotuiactivitiesKnotActivity() {
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView == null || this.switcherWebView == null) {
            return;
        }
        lottieAnimationView.setVisibility(8);
        this.imgCloseSdk.setVisibility(8);
        this.switcherWebView.setVisibility(0);
    }

    /* renamed from: lambda$onConnectionStateChanged$7$com-knotapi-knot-ui-activities-KnotActivity, reason: not valid java name */
    /* synthetic */ void m10820x1cbb6ee8(java.lang.String str) {
        this.switcherWebView.evaluateJavascript(str, null);
    }

    /* renamed from: lambda$onCreate$1$com-knotapi-knot-ui-activities-KnotActivity, reason: not valid java name */
    /* synthetic */ void m10821lambda$onCreate$1$comknotapiknotuiactivitiesKnotActivity(android.view.View view) {
        hideSlowInternetPopup();
    }

    /* renamed from: lambda$onCreate$2$com-knotapi-knot-ui-activities-KnotActivity, reason: not valid java name */
    /* synthetic */ void m10822lambda$onCreate$2$comknotapiknotuiactivitiesKnotActivity(android.view.View view) {
        hideSlowInternetPopup();
    }

    /* renamed from: lambda$onCreate$3$com-knotapi-knot-ui-activities-KnotActivity, reason: not valid java name */
    /* synthetic */ void m10823lambda$onCreate$3$comknotapiknotuiactivitiesKnotActivity(android.view.View view) {
        finish();
        if (com.knotapi.knot.Knot.getInstance() == null || com.knotapi.knot.Knot.getInstance().getKnotEventDelegateListener() == null) {
            return;
        }
        com.knotapi.knot.Knot.getInstance().getKnotEventDelegateListener().onExit();
    }

    /* renamed from: lambda$showLoading$4$com-knotapi-knot-ui-activities-KnotActivity, reason: not valid java name */
    /* synthetic */ void m10824lambda$showLoading$4$comknotapiknotuiactivitiesKnotActivity() {
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.lottieAnimationView;
        if (lottieAnimationView == null || this.switcherWebView == null) {
            return;
        }
        lottieAnimationView.setVisibility(0);
        this.imgCloseSdk.setVisibility(0);
        this.switcherWebView.setVisibility(8);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    public void onConnectionStateChanged(boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(function() { window.dispatchEvent(new CustomEvent(\"androidConnectionChanged\", { bubbles: true, detail: { online: ");
        sb.append(z);
        sb.append(" } }));})();");
        final java.lang.String obj = sb.toString();
        runOnUiThread(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.ui.activities.KnotActivity.this.m10820x1cbb6ee8(obj);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.knotapi.knot.R.layout.activity_knot);
        com.knotapi.knot.Knot.getInstance().registerOpenedActivity(this);
        getDelegate().setLocalNightMode(1);
        this.vibrator = (android.os.Vibrator) getSystemService("vibrator");
        activity = this;
        this.sessionId = com.knotapi.knot.utilities.Helper.sanitizeInput(getIntent().getStringExtra("sessionId"), "sessionId");
        this.clientId = com.knotapi.knot.utilities.Helper.sanitizeInput(getIntent().getStringExtra("clientId"), "clientId");
        this.customerConfiguration = (com.knotapi.knot.models.CustomerConfiguration) getIntent().getParcelableExtra("customerConfiguration");
        try {
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(findViewById(com.knotapi.knot.R.id.root_layout), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda2
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
                    return com.knotapi.knot.ui.activities.KnotActivity.lambda$onCreate$0(view, windowInsetsCompat);
                }
            });
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "KnotActivity- error in onCreate");
        }
        if (this.sessionId == null || this.clientId == null) {
            finish();
            return;
        }
        this.merchantIds = getIntent().getIntArrayExtra("merchantIds");
        domainUrls = getIntent().getStringArrayExtra("domainUrls");
        this.useCategories = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("useCategories", true));
        this.useSearch = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("useSearch", true));
        this.entryPoint = com.knotapi.knot.utilities.Helper.sanitizeInput(getIntent().getStringExtra("entryPoint"), "entryPoint");
        try {
            com.knotapi.knot.models.Environment environment = (com.knotapi.knot.models.Environment) getIntent().getSerializableExtra("environment");
            this.environment = environment;
            if (environment == null) {
                this.environment = com.knotapi.knot.models.Environment.production;
            }
        } catch (java.lang.Exception e2) {
            com.knotapi.knot.services.ErrorReporter.report(e2, "KnotActivity- error getting environment");
        }
        this.switcherWebView = (android.webkit.WebView) findViewById(com.knotapi.knot.R.id.webView);
        this.lottieAnimationView = (com.airbnb.lottie.LottieAnimationView) findViewById(com.knotapi.knot.R.id.lottie_view);
        this.clSlowInternet = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.knotapi.knot.R.id.clSlowInternet);
        this.imgClose = (android.widget.ImageView) findViewById(com.knotapi.knot.R.id.imgClose);
        this.imgCloseSdk = (android.widget.ImageView) findViewById(com.knotapi.knot.R.id.imgCloseSdk);
        android.webkit.WebView.setWebContentsDebuggingEnabled(false);
        this.preferenceManager = new com.knotapi.knot.utilities.PreferenceManager();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            if (domainUrls != null) {
                android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (java.lang.String str : domainUrls) {
                    java.lang.String cookie = cookieManager.getCookie(str);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("domainUrls", str);
                    jSONObject.put("cookies", cookie);
                    jSONArray.put(jSONObject);
                }
                this.preferenceManager.saveString(this, com.knotapi.knot.utilities.PreferenceManager.PREF_CLIENT_COOKIES, jSONArray.toString());
            }
        } catch (org.json.JSONException unused) {
        }
        clear();
        this.clSlowInternet.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.knotapi.knot.ui.activities.KnotActivity.this.m10821lambda$onCreate$1$comknotapiknotuiactivitiesKnotActivity(view);
            }
        });
        this.imgClose.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.knotapi.knot.ui.activities.KnotActivity.this.m10822lambda$onCreate$2$comknotapiknotuiactivitiesKnotActivity(view);
            }
        });
        this.imgCloseSdk.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.knotapi.knot.ui.activities.KnotActivity.this.m10823lambda$onCreate$3$comknotapiknotuiactivitiesKnotActivity(view);
            }
        });
        this.isShowSlowInternet = java.lang.Boolean.TRUE;
        callSlowInternetTimeOut();
        this.switcherWebView.setWebViewClient(new com.knotapi.knot.ui.activities.KnotActivity.AnonymousClass1(currentTimeMillis));
        android.webkit.WebSettings settings = this.switcherWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSaveFormData(true);
        android.webkit.CookieManager.getInstance().setAcceptThirdPartyCookies(this.switcherWebView, true);
        settings.setTextZoom(100);
        this.switcherWebView.setLayerType(2, null);
        settings.setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        this.switcherWebView.setVerticalScrollBarEnabled(false);
        this.switcherWebView.addJavascriptInterface(new com.knotapi.knot.models.JavaScriptInterface(this.environment, this, this, this, this, this), "JSInterface");
        java.lang.String switcherURL = com.knotapi.knot.utilities.WebViewHelper.getSwitcherURL(this.environment, getSharedPreferences("knot_example_app_prefs", 0).getString("pref_knot_link", ""));
        this.appRootURL = switcherURL;
        com.knotapi.knot.services.KnotSDKInitProvider.rootUrl = switcherURL;
        this.switcherWebView.loadUrl(switcherURL);
        android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
        android.net.ConnectivityManager.NetworkCallback networkCallback = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.knotapi.knot.ui.activities.KnotActivity.2
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(android.net.Network network) {
                super.onAvailable(network);
                com.knotapi.knot.ui.activities.KnotActivity.this.onConnectionStateChanged(true);
                if (!com.knotapi.knot.ui.activities.KnotActivity.this.isSdkStartLoading.booleanValue() || com.knotapi.knot.ui.activities.KnotActivity.this.isSdkLoaded.booleanValue()) {
                    return;
                }
                com.knotapi.knot.ui.activities.KnotActivity.this.showLoading();
                com.knotapi.knot.ui.activities.KnotActivity.this.runOnUiThread(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.activities.KnotActivity.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.knotapi.knot.ui.activities.KnotActivity knotActivity = com.knotapi.knot.ui.activities.KnotActivity.this;
                        knotActivity.isWebLoadError = java.lang.Boolean.FALSE;
                        knotActivity.switcherWebView.loadUrl(knotActivity.appRootURL);
                    }
                });
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(android.net.Network network) {
                super.onLost(network);
                com.knotapi.knot.ui.activities.KnotActivity.this.onConnectionStateChanged(false);
            }
        };
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) getSystemService(android.net.ConnectivityManager.class);
        if (connectivityManager != null) {
            connectivityManager.requestNetwork(build, networkCallback);
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(linkDownstreamBandwidthKbps);
                sb.append("Kbps");
                this.internetSpeed = sb.toString();
            }
        }
        this.webViewManager = new com.knotapi.knot.webview.WebViewManager(this);
        com.knotapi.knot.services.ErrorReporter.registerErrorDelegate(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.switcherWebView.removeJavascriptInterface("JSInterface");
        this.switcherWebView.clearCache(true);
        this.switcherWebView.clearHistory();
        this.switcherWebView.onPause();
        this.switcherWebView.removeAllViews();
        this.switcherWebView.destroy();
        super.onDestroy();
        com.knotapi.knot.services.ErrorReporter.registerErrorDelegate(null);
        clear();
    }

    @Override // com.knotapi.knot.interfaces.WebAppLoadingListener
    public void onLoadingFinished() {
        hideLoading();
    }

    @Override // com.knotapi.knot.interfaces.WebAppLoadingListener
    public void onStartHaptics() {
        android.os.Vibrator vibrator = this.vibrator;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        findViewById(android.R.id.content).performHapticFeedback(16);
        this.vibrator.vibrate(android.os.VibrationEffect.createWaveform(new long[]{0, 50, 50, 50}, -1));
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void onTryAgain(com.knotapi.knot.models.Bot bot) {
        try {
            clearCookies();
            removeFragment(bot.getBotId(), false);
            didMerchantClick(this.gson.toJson((com.google.gson.JsonElement) bot.getAllSettings()));
        } catch (java.lang.Exception unused) {
            sendNativeLogEvent(null, com.knotapi.knot.utilities.Constants.META_FLOW, "Error while click on try again button on error view", "");
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void removeFragment(int i, boolean z) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        try {
            java.lang.String valueOf = java.lang.String.valueOf(i);
            com.knotapi.knot.ui.fragments.MerchantWebViewListenerFragment merchantWebViewListenerFragment = this.merchantFragmentMap.get(valueOf);
            if (merchantWebViewListenerFragment != null) {
                merchantWebViewListenerFragment.dismiss();
                androidx.fragment.app.FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.remove(merchantWebViewListenerFragment);
                beginTransaction.commit();
                if (z) {
                    return;
                }
                this.merchantFragmentMap.remove(valueOf);
                this.mBots.remove(getBotById(i));
            }
        } catch (java.lang.IllegalStateException e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Error removing fragment");
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendBotCustomEvent(com.knotapi.knot.models.CustomEvent customEvent) {
        evaluateJS(customEvent.getScript());
    }

    @Override // com.knotapi.knot.interfaces.ErrorReporterDelegate
    public void sendErrorToWebApp(java.lang.Exception exc, java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("errorType", exc.getClass().getSimpleName());
            jSONObject.put("errorMessage", exc.getMessage());
            jSONObject.put("contextMessage", str);
            jSONObject.put("timestamp", java.lang.System.currentTimeMillis());
            jSONObject.put("source", "android_sdk");
            jSONObject.put("stackTrace", android.util.Log.getStackTraceString(exc));
            int[] iArr = this.merchantIds;
            if (iArr != null && iArr.length > 0) {
                jSONObject.put("merchantId", iArr[0]);
            } else if (this.mBots.isEmpty()) {
                jSONObject.put("merchantId", "");
            } else {
                jSONObject.put("merchantId", this.mBots.get(0).getMerchantId());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(function() {   window.dispatchEvent(    new CustomEvent(      'mobileBotNativeRequest',       {         bubbles: true,         detail: {           name: 'androidError',           payload: ");
            sb.append(jSONObject.toString());
            sb.append("         }       }    )  );})();");
            evaluateJS(sb.toString());
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendNativeLogEvent(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.knotapi.knot.models.MerchantWebViewData.Builder message = new com.knotapi.knot.models.MerchantWebViewData.Builder().setBotId(num != null ? num.intValue() : 0).setEventType(str).setMessage(str2);
        if (str3 == null) {
            str3 = "";
        }
        sendNativeLogEvent(message.setScreenName(str3).setCookies("{}").setInteractionMap(null).build());
    }

    public void sendNativeLogEventWithSdkLoadTime(java.lang.Integer num, java.lang.String str, java.lang.String str2) {
        if (num == null) {
            num = 0;
        }
        com.knotapi.knot.models.Bot botById = getBotById(num.intValue());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.adjust.sdk.Constants.REFERRER_API_META, str);
            jSONObject.put("message", str2);
            jSONObject.put("sdkLoadTime", this.preferenceManager.getString(this, com.knotapi.knot.utilities.PreferenceManager.PREF_SDK_LOAD_TIME, ""));
            java.lang.String jSONObject2 = jSONObject.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotEvent\", { bubbles: true, detail: { merchantId: ");
            sb.append(botById != null ? java.lang.Integer.valueOf(botById.getMerchantId()) : "''");
            sb.append(", botId: ");
            sb.append(botById != null ? java.lang.Integer.valueOf(botById.getBotId()) : "''");
            sb.append(", event: ");
            sb.append(jSONObject2);
            sb.append(" } }));})();");
            evaluateJS(sb.toString());
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendUserActionEvent(int i) {
        com.knotapi.knot.models.Bot botById = getBotById(i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotEvent\", { bubbles: true, detail: { event: \"user-action-required\", merchantId: ");
        sb.append(botById != null ? java.lang.Integer.valueOf(botById.getMerchantId()) : "''");
        sb.append(", botId: ");
        sb.append(i);
        sb.append(" } }));})();");
        evaluateJS(sb.toString());
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void setNeedTimeOutCall(boolean z) {
        this.needTimeOutCall = java.lang.Boolean.valueOf(z);
    }

    public void showLoading() {
        runOnUiThread(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.ui.activities.KnotActivity.this.m10824lambda$showLoading$4$comknotapiknotuiactivitiesKnotActivity();
            }
        });
    }

    public void trackCloseSDK() {
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("entry_point", this.entryPoint);
            hashMap.put("search_enabled", this.useSearch);
            hashMap.put("categories_enabled", this.useCategories);
            int[] iArr = this.merchantIds;
            if (iArr != null && iArr.length > 0) {
                hashMap.put("merchant_id", java.lang.Integer.valueOf(iArr[0]));
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME);
            hashMap2.put("sdk_version", com.knotapi.knot.BuildConfig.VERSION_NAME);
            com.knotapi.knot.services.AnalyticsManager.getInstance(this.environment).trackEvent("SDK Closed", this.sessionId, hashMap, hashMap2);
        } catch (java.lang.Exception e) {
            com.knotapi.knot.services.ErrorReporter.report(e, "Error while closing SDK");
        }
    }

    public void trackShowSlowInternetMessage() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME);
        hashMap2.put("sdk_version", com.knotapi.knot.BuildConfig.VERSION_NAME);
        com.knotapi.knot.services.AnalyticsManager.getInstance(this.environment).trackEvent("Slow Internet Connection Message Displayed", this.sessionId, hashMap, hashMap2);
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void userCloseMerchantView(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotCloseLoginView\", { bubbles: true, detail: { merchantId: ");
        sb.append(i2);
        sb.append(" } }));})();");
        evaluateJS(sb.toString());
        com.knotapi.knot.models.Bot botById = getBotById(i);
        if (botById != null) {
            int botId = botById.getBotId();
            sendNativeLogEvent(java.lang.Integer.valueOf(botId), com.knotapi.knot.utilities.Constants.META_FLOW, getString(com.knotapi.knot.R.string.webView_closed), "");
            removeFragment(i, botById.getDetached().booleanValue());
        }
    }

    /* renamed from: com.knotapi.knot.ui.activities.KnotActivity$1, reason: invalid class name */
    public class AnonymousClass1 extends android.webkit.WebViewClient {
        final /* synthetic */ long val$cardSwitcherStartTime;

        public AnonymousClass1(long j) {
            this.val$cardSwitcherStartTime = j;
        }

        /* renamed from: lambda$onPageFinished$0$com-knotapi-knot-ui-activities-KnotActivity$1, reason: not valid java name */
        /* synthetic */ void m10825xaede09ee(java.lang.String str) {
            com.knotapi.knot.ui.activities.KnotActivity.this.sendNativeLogEventWithSdkLoadTime(null, com.knotapi.knot.utilities.Constants.META_INTERNET_SPEED, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, java.lang.String str) {
            super.onPageFinished(webView, str);
            if (!com.knotapi.knot.ui.activities.KnotActivity.this.isWebLoadError.booleanValue()) {
                com.knotapi.knot.ui.activities.KnotActivity.this.isSdkLoaded = java.lang.Boolean.TRUE;
            }
            double currentTimeMillis = (java.lang.System.currentTimeMillis() - this.val$cardSwitcherStartTime) / 1000.0d;
            com.knotapi.knot.ui.activities.KnotActivity.this.cardSwitcherLoadTime = java.lang.Math.round(currentTimeMillis * 100.0d) / 100.0d;
            com.knotapi.knot.ui.activities.KnotActivity knotActivity = com.knotapi.knot.ui.activities.KnotActivity.this;
            knotActivity.isShowSlowInternet = java.lang.Boolean.FALSE;
            final java.lang.String internetSpeed = knotActivity.preferenceManager.internetSpeed(knotActivity);
            if (!internetSpeed.isEmpty()) {
                new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: com.knotapi.knot.ui.activities.KnotActivity$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.knotapi.knot.ui.activities.KnotActivity.AnonymousClass1.this.m10825xaede09ee(internetSpeed);
                    }
                }, 2000L);
            }
            com.knotapi.knot.ui.activities.KnotActivity knotActivity2 = com.knotapi.knot.ui.activities.KnotActivity.this;
            knotActivity2.preferenceManager.saveString(knotActivity2, com.knotapi.knot.utilities.PreferenceManager.PREF_INTERNET_SPEED, "");
            if (com.knotapi.knot.ui.activities.KnotActivity.this.clSlowInternet.getVisibility() == 0) {
                com.knotapi.knot.ui.activities.KnotActivity.this.hideSlowInternetPopup();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(android.webkit.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            com.knotapi.knot.ui.activities.KnotActivity knotActivity = com.knotapi.knot.ui.activities.KnotActivity.this;
            knotActivity.isSdkStartLoading = java.lang.Boolean.TRUE;
            com.knotapi.knot.models.DeviceInfo deviceInfo = new com.knotapi.knot.models.DeviceInfo(knotActivity.getApplicationContext());
            java.lang.StringBuilder sb = new java.lang.StringBuilder("window.sessionId = \"");
            sb.append(com.knotapi.knot.ui.activities.KnotActivity.this.sessionId);
            sb.append("\";\nwindow.clientId = \"");
            sb.append(com.knotapi.knot.ui.activities.KnotActivity.this.clientId);
            sb.append("\";\nwindow.merchantIds = ");
            sb.append(java.util.Arrays.toString(com.knotapi.knot.ui.activities.KnotActivity.this.merchantIds));
            sb.append(";\nwindow.useCategories = ");
            sb.append(com.knotapi.knot.ui.activities.KnotActivity.this.useCategories);
            sb.append(";\nwindow.useSearch = ");
            sb.append(com.knotapi.knot.ui.activities.KnotActivity.this.useSearch);
            sb.append(";\nwindow.environment = \"");
            sb.append(com.knotapi.knot.ui.activities.KnotActivity.this.environment.name());
            sb.append("\";\nwindow.SDK_Version = \"");
            sb.append(com.knotapi.knot.ui.activities.KnotActivity.this.version);
            sb.append("\";\nwindow.deviceInfo = ");
            sb.append(deviceInfo.toJson());
            sb.append(";\n");
            if (com.knotapi.knot.ui.activities.KnotActivity.this.entryPoint != null) {
                sb.append("window.entryPoint = \"");
                sb.append(com.knotapi.knot.ui.activities.KnotActivity.this.entryPoint);
                sb.append("\";\n");
            }
            com.knotapi.knot.models.CustomerConfiguration customerConfiguration = com.knotapi.knot.ui.activities.KnotActivity.this.customerConfiguration;
            if (customerConfiguration != null) {
                if (customerConfiguration.getCustomerName() != null) {
                    sb.append("window.customerName = \"");
                    sb.append(com.knotapi.knot.ui.activities.KnotActivity.this.customerConfiguration.getCustomerName());
                    sb.append("\";\n");
                }
                if (com.knotapi.knot.ui.activities.KnotActivity.this.customerConfiguration.getCardName() != null) {
                    sb.append("window.cardName = \"");
                    sb.append(com.knotapi.knot.ui.activities.KnotActivity.this.customerConfiguration.getCardName());
                    sb.append("\";\n");
                }
                if (com.knotapi.knot.ui.activities.KnotActivity.this.customerConfiguration.getLogoId() != null) {
                    sb.append("window.logoId = \"");
                    sb.append(com.knotapi.knot.ui.activities.KnotActivity.this.customerConfiguration.getLogoId());
                    sb.append("\";\n");
                }
            }
            com.knotapi.knot.ui.activities.KnotActivity.this.evaluateJS(sb.toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            com.knotapi.knot.ui.activities.KnotActivity.this.isWebLoadError = java.lang.Boolean.TRUE;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
            webView.loadUrl(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, int i, java.lang.String str, java.lang.String str2) {
            super.onReceivedError(webView, i, str, str2);
            com.knotapi.knot.ui.activities.KnotActivity.this.isWebLoadError = java.lang.Boolean.TRUE;
        }
    }

    private com.knotapi.knot.models.Bot getBotById(final int i) {
        return this.mBots.stream().filter(new java.util.function.Predicate() { // from class: com.knotapi.knot.ui.activities.KnotActivity$$ExternalSyntheticLambda8
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return com.knotapi.knot.ui.activities.KnotActivity.lambda$getBotById$10(i, (com.knotapi.knot.models.Bot) obj);
            }
        }).findFirst().orElse(null);
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendRunningEvent(int i, java.lang.String str, java.lang.String str2, com.knotapi.knot.models.ExtraInfo extraInfo, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4) {
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String obj;
        java.lang.String str8;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String str9 = str;
        java.lang.String str10 = "{}";
        java.lang.String str11 = str3 == null ? "{}" : str3;
        java.lang.String str12 = str4 == null ? "{}" : str4;
        com.knotapi.knot.models.Bot botById = getBotById(i);
        if (bool.booleanValue()) {
            this.isBotStarted = java.lang.Boolean.TRUE;
        }
        java.lang.String loggedInPage = (extraInfo == null || extraInfo.getLoggedInPage() == null) ? "" : extraInfo.getLoggedInPage();
        java.lang.String userAgent = (extraInfo == null || extraInfo.getUserAgent() == null) ? "" : extraInfo.getUserAgent();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(", loggedInPage: '");
        sb.append(loggedInPage);
        sb.append("', userAgent: '");
        sb.append(userAgent);
        sb.append("'");
        java.lang.String obj4 = sb.toString();
        if (!extraInfo.getInterceptedHashmap().isEmpty()) {
            java.lang.String concat = obj4.concat(", extraInfo: { intercepted: {");
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : extraInfo.getInterceptedHashmap().entrySet()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(entry.getKey());
                sb2.append(": '");
                sb2.append(entry.getValue());
                sb2.append("',");
                concat = concat.concat(sb2.toString());
            }
            obj4 = concat.concat(" }}");
        }
        if (extraInfo.getInterceptedValues() != null && !extraInfo.getInterceptedValues().isEmpty()) {
            str10 = extraInfo.getInterceptedValues();
        }
        if (str9 != null && !str.isEmpty()) {
            str5 = userAgent;
            if (str2 != null && !str2.isEmpty()) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ");
                if (botById != null) {
                    str8 = "(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ";
                    obj3 = java.lang.Integer.valueOf(botById.getMerchantId());
                } else {
                    str8 = "(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ";
                    obj3 = "''";
                }
                sb3.append(obj3);
                sb3.append(", botId: ");
                sb3.append(botById != null ? java.lang.Integer.valueOf(botById.getBotId()) : "''");
                sb3.append(", cookies: ");
                sb3.append(str9);
                sb3.append(", extraCookies: ");
                sb3.append(str2);
                sb3.append(", localStorage: ");
                sb3.append(str11);
                sb3.append(", sessionStorage: ");
                sb3.append(str12);
                sb3.append(obj4);
                sb3.append(", internalInformation: ");
                sb3.append(str10);
                sb3.append(", shouldStartBot: ");
                sb3.append(bool);
                str6 = " } }));})();";
                sb3.append(str6);
                obj = sb3.toString();
            } else {
                str6 = " } }));})();";
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ");
                if (botById != null) {
                    str8 = "(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ";
                    obj2 = java.lang.Integer.valueOf(botById.getMerchantId());
                } else {
                    str8 = "(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ";
                    obj2 = "''";
                }
                sb4.append(obj2);
                sb4.append(", botId: ");
                sb4.append(botById != null ? java.lang.Integer.valueOf(botById.getBotId()) : "''");
                sb4.append(", cookies: ");
                sb4.append(str9);
                sb4.append(", localStorage: ");
                sb4.append(str11);
                sb4.append(", sessionStorage: ");
                sb4.append(str12);
                sb4.append(obj4);
                sb4.append(", internalInformation: ");
                sb4.append(str10);
                sb4.append(", shouldStartBot: ");
                sb4.append(bool);
                sb4.append(str6);
                obj = sb4.toString();
            }
            str7 = str8;
        } else {
            str5 = userAgent;
            str6 = " } }));})();";
            str7 = "(function() { window.dispatchEvent(new CustomEvent(\"mobileBotRun\", { bubbles: true, detail: { merchantId: ";
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(str7);
            sb5.append(botById != null ? java.lang.Integer.valueOf(botById.getMerchantId()) : "''");
            sb5.append(", botId: ");
            sb5.append(botById != null ? java.lang.Integer.valueOf(botById.getBotId()) : "''");
            sb5.append(obj4);
            sb5.append(", internalInformation: ");
            sb5.append(str10);
            sb5.append(", shouldStartBot: ");
            sb5.append(bool);
            sb5.append(str6);
            obj = sb5.toString();
        }
        if (!extraInfo.getIntentRedirection().isEmpty()) {
            java.lang.String intentRedirection = extraInfo.getIntentRedirection();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(", loggedInPage: '', userAgent: '");
            sb6.append(str5);
            sb6.append("'");
            java.lang.String obj5 = sb6.toString();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(str7);
            sb7.append(botById != null ? java.lang.Integer.valueOf(botById.getMerchantId()) : "''");
            sb7.append(", botId: ");
            sb7.append(botById != null ? java.lang.Integer.valueOf(botById.getBotId()) : "''");
            sb7.append(", cookies: ");
            if (str9 == null) {
                str9 = "";
            }
            sb7.append(str9);
            sb7.append(", extraInfo: { intentRedirect: '");
            sb7.append(intentRedirection);
            sb7.append("'}, localStorage: ");
            sb7.append(str11);
            sb7.append(", sessionStorage: ");
            sb7.append(str12);
            sb7.append(obj5);
            sb7.append(", internalInformation: ");
            sb7.append(str10);
            sb7.append(", shouldStartBot: ");
            sb7.append(bool);
            sb7.append(str6);
            obj = sb7.toString();
        }
        evaluateJS(obj);
        validateAndReportCredentialCapture(botById, str10, this.sessionId);
        this.webViewManager.destroyWebView("merchantWebView-".concat(java.lang.String.valueOf(i)));
    }

    @Override // com.knotapi.knot.interfaces.MerchantWebViewDelegate
    public void sendNativeLogEvent(com.knotapi.knot.models.MerchantWebViewData merchantWebViewData) {
        try {
            com.knotapi.knot.models.Bot botById = getBotById(merchantWebViewData.getBotId());
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.adjust.sdk.Constants.REFERRER_API_META, merchantWebViewData.getEventType());
                jSONObject.put("message", merchantWebViewData.getMessage());
                jSONObject.put("screenName", merchantWebViewData.getScreenName());
                if (merchantWebViewData.getEventType().equals(com.knotapi.knot.utilities.Constants.META_SCREENSHOT) && (botById == null || botById.getBotId() == 0)) {
                    com.knotapi.knot.services.ErrorReporter.report(new java.lang.Exception("Screenshot sent without bot"), jSONObject.toString());
                }
                java.lang.String cookies = merchantWebViewData.getCookies() != null ? merchantWebViewData.getCookies() : "{}";
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                if (merchantWebViewData.getInteractionMap() != null && !merchantWebViewData.getInteractionMap().isEmpty()) {
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : merchantWebViewData.getInteractionMap().entrySet()) {
                        try {
                            jSONObject2.put(entry.getKey(), entry.getValue());
                        } catch (org.json.JSONException unused) {
                            entry.getKey();
                        }
                    }
                }
                java.lang.String localStorage = merchantWebViewData.getLocalStorage() != null ? merchantWebViewData.getLocalStorage() : "{}";
                java.lang.String sessionStorage = merchantWebViewData.getSessionStorage() != null ? merchantWebViewData.getSessionStorage() : "{}";
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("(function() { window.dispatchEvent(new CustomEvent(\"mobileBotEvent\", { bubbles: true, detail: {");
                sb.append("merchantId: ");
                sb.append(botById != null ? java.lang.Integer.valueOf(botById.getMerchantId()) : "''");
                sb.append(", ");
                sb.append("botId: ");
                sb.append(botById != null ? java.lang.Integer.valueOf(botById.getBotId()) : "''");
                sb.append(", ");
                sb.append("event: ");
                sb.append(jSONObject.toString());
                sb.append(", ");
                if (cookies != null && !cookies.equals("{}")) {
                    sb.append("cookies: ");
                    sb.append(cookies);
                    sb.append(", ");
                }
                if (merchantWebViewData.getInteractionMap() != null && !merchantWebViewData.getInteractionMap().isEmpty()) {
                    sb.append("interactions: ");
                    sb.append(jSONObject2.toString());
                    sb.append(", ");
                }
                if (localStorage != null && !localStorage.equals("{}")) {
                    sb.append("localStorage: ");
                    sb.append(localStorage);
                    sb.append(", ");
                }
                if (sessionStorage != null && !sessionStorage.equals("{}")) {
                    sb.append("sessionStorage: ");
                    sb.append(sessionStorage);
                    sb.append(", ");
                }
                sb.append(" } }));})();");
                evaluateJS(sb.toString());
            } catch (org.json.JSONException e) {
                throw new java.lang.RuntimeException(e);
            }
        } catch (java.lang.Exception e2) {
            com.knotapi.knot.services.ErrorReporter.report(e2, "Error executing sendNativeLogEvent");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

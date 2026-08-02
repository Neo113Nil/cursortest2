package com.razorpay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.webkit.ProxyConfig;
import androidx.window.embedding.SplitRule;
import com.razorpay.CheckoutPresenterImpl;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class BaseCheckoutActivity extends Activity implements CheckoutPresenterImpl.CheckoutView, SmsAgentInterface {
    private static int UPI_REQUEST_CODE = 99;
    protected Object checkoutBridgeObject;
    private RelativeLayout container;
    private String lifecycleContext = "";
    private ViewGroup parent;
    protected CheckoutPresenter presenter;
    private WebChromeClient primaryWebChromeClient;
    private WebView primaryWebView;
    private WebViewClient primaryWebViewClient;
    private __O000_$O0 rzpbar;
    private WebChromeClient secondaryWebChromeClient;
    private WebView secondaryWebView;
    private WebViewClient secondaryWebViewClient;
    private SmsAgent smsAgent;

    public interface SetOptionsCallback {
        void onError();

        void onFeatureDisabled();

        void onOptionsSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyStatusBarScrim() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(viewGroup);
            int i = rootWindowInsets != null ? rootWindowInsets.getInsets(WindowInsetsCompat.Type.statusBars()).top : 0;
            View view = new View(this);
            view.setBackgroundColor(Color.parseColor("#99000000"));
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, i));
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    private void createContainer() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.container = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.container.setBackgroundColor(0);
        this.parent.addView(this.container);
        ViewCompat.setOnApplyWindowInsetsListener(this.container, new e());
        this.primaryWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.secondaryWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.primaryWebView.setContentDescription("primary_webview");
        this.secondaryWebView.setContentDescription("secondary_webview");
        this.container.addView(this.primaryWebView);
        this.container.addView(this.secondaryWebView);
        String progressBarColor = this.presenter.getProgressBarColor();
        if (progressBarColor != null) {
            this.rzpbar = new __O000_$O0(this, this.container, progressBarColor);
        } else {
            this.rzpbar = new __O000_$O0(this, this.container);
        }
        this.presenter.setUpAddOn();
    }

    @SuppressLint({"JavascriptInterface"})
    private boolean createPrimaryWebView(Object obj) {
        try {
            WebView webView = new WebView(this);
            this.primaryWebView = webView;
            webView.setBackgroundColor(Color.parseColor("#99000000"));
            this.primaryWebView.setContentDescription("primary_webview");
            if (CheckoutUtils.shouldDisableHardwareAcceleration(this, this.presenter.getCheckoutOptions())) {
                this.primaryWebView.setLayerType(1, null);
            }
            BaseUtils.setWebViewSettings(this, this.primaryWebView, false);
            this.primaryWebView.clearFormData();
            this.primaryWebView.addJavascriptInterface(obj, "CheckoutBridge");
            this.primaryWebView.setWebChromeClient(this.primaryWebChromeClient);
            this.primaryWebView.setWebViewClient(this.primaryWebViewClient);
            return true;
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.REASON, th.getLocalizedMessage());
            hashMap.put("webview_type", 1);
            AnalyticsEvent analyticsEvent = AnalyticsEvent.WEBVIEW_CREATION_FAILED;
            AnalyticsUtil.trackEvent(analyticsEvent, AnalyticsUtil.getJSONResponse(hashMap));
            MonitoringUtil.trackCriticalDependencyFailure(this, "webview_creation", "create", analyticsEvent.getEventName(), th.getLocalizedMessage(), true, false, "not_available");
            Lumberjack.postData();
            destroy(8, BaseConstants.WEBVIEW_CREATION_FAILED_MESSAGE);
            return false;
        }
    }

    private boolean createSecondaryWebView() {
        try {
            WebView webView = new WebView(this);
            this.secondaryWebView = webView;
            webView.setBackgroundColor(Color.parseColor("#99000000"));
            if (CheckoutUtils.shouldDisableHardwareAcceleration(this, this.presenter.getCheckoutOptions())) {
                this.secondaryWebView.setLayerType(1, null);
            }
            BaseUtils.setWebViewSettings(this, this.secondaryWebView, false);
            this.secondaryWebView.clearFormData();
            WebView webView2 = this.secondaryWebView;
            final CheckoutInteractor checkoutInteractor = (CheckoutInteractor) this.presenter;
            webView2.addJavascriptInterface(new Object(checkoutInteractor) { // from class: com.razorpay.o_$0_O
                private CheckoutInteractor interactor;

                {
                    this.interactor = checkoutInteractor;
                }

                @JavascriptInterface
                public final void relay(String str) {
                    this.interactor.sendDataToWebView(1, str);
                }
            }, "MagicBridge");
            this.secondaryWebView.addJavascriptInterface(new CheckoutBridge((CheckoutInteractor) this.presenter, 2), "CheckoutBridge");
            this.secondaryWebView.setVisibility(8);
            this.secondaryWebView.setWebChromeClient(this.secondaryWebChromeClient);
            this.secondaryWebView.setWebViewClient(this.secondaryWebViewClient);
            return true;
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.REASON, th.getLocalizedMessage());
            hashMap.put("webview_type", 2);
            AnalyticsEvent analyticsEvent = AnalyticsEvent.WEBVIEW_CREATION_FAILED;
            AnalyticsUtil.trackEvent(analyticsEvent, AnalyticsUtil.getJSONResponse(hashMap));
            MonitoringUtil.trackCriticalDependencyFailure(this, "webview_creation", "create", analyticsEvent.getEventName(), th.getLocalizedMessage(), true, false, "not_available");
            Lumberjack.postData();
            destroy(8, BaseConstants.WEBVIEW_CREATION_FAILED_MESSAGE);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WindowInsetsCompat lambda$createContainer$0(View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(view.getPaddingLeft(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars()).top, view.getPaddingRight(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom);
        return windowInsetsCompat;
    }

    private void setWebChromeClient(int i, WebChromeClient webChromeClient) {
        if (i == 1) {
            this.primaryWebChromeClient = webChromeClient;
        } else {
            if (i != 2) {
                return;
            }
            this.secondaryWebChromeClient = webChromeClient;
        }
    }

    private void setWebViewClient(int i, WebViewClient webViewClient) {
        if (i == 1) {
            this.primaryWebViewClient = webViewClient;
        } else {
            if (i != 2) {
                return;
            }
            this.secondaryWebViewClient = webViewClient;
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    @SuppressLint({"JavascriptInterface"})
    public void addJavascriptInterfaceToPrimaryWebview(Object obj, String str) {
        this.primaryWebView.addJavascriptInterface(obj, str);
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void checkSmsPermission() {
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void clearWebViewHistory(int i) {
        if (i == 1) {
            this.primaryWebView.clearHistory();
        } else {
            if (i != 2) {
                return;
            }
            this.secondaryWebView.clearHistory();
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void destroy(int i, String str) {
        BaseConfig.paymentInProgress = false;
        MonitoringUtil.clearCheckout(this);
        Intent intent = new Intent();
        intent.putExtra("RESULT", str);
        if (str == null || TextUtils.isEmpty(str)) {
            i = 5;
        }
        setResult(i, intent);
        BaseUtils.getInstance().clearMetadata();
        finish();
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public WebView getWebView(int i) {
        if (i == 1) {
            return this.primaryWebView;
        }
        if (i != 2) {
            return null;
        }
        return this.secondaryWebView;
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void hideProgressBar() {
        __O000_$O0 __o000_$o0 = this.rzpbar;
        if (__o000_$o0 != null) {
            __o000_$o0.hide();
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public boolean isWebViewVisible(int i) {
        WebView webView;
        if (i != 1) {
            return i == 2 && (webView = this.secondaryWebView) != null && webView.getVisibility() == 0;
        }
        WebView webView2 = this.primaryWebView;
        return webView2 != null && webView2.getVisibility() == 0;
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void loadData(int i, String str, String str2, String str3) {
        if (i == 1) {
            this.primaryWebView.loadData(str, str2, str3);
        } else {
            if (i != 2) {
                return;
            }
            this.secondaryWebView.loadData(str, str2, str3);
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void loadDataWithBaseURL(int i, String str, String str2, String str3, String str4, String str5) {
        if (i == 1) {
            this.primaryWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            if (i != 2) {
                return;
            }
            this.secondaryWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void loadUrl(int i, String str) {
        WebView webView;
        if (i != 1) {
            if (i == 2 && (webView = this.secondaryWebView) != null) {
                webView.loadUrl(str);
                return;
            }
            return;
        }
        WebView webView2 = this.primaryWebView;
        if (webView2 != null) {
            webView2.loadUrl(str);
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void makeWebViewVisible(int i) {
        if (i == 1) {
            if (this.primaryWebView.getVisibility() == 8) {
                this.primaryWebView.setVisibility(0);
                this.secondaryWebView.setVisibility(8);
                CheckoutUtils.dismissLoader();
                AnalyticsUtil.trackEvent(AnalyticsEvent.WEB_VIEW_SECONDARY_TO_PRIMARY_SWITCH);
                return;
            }
            return;
        }
        if (i == 2 && this.secondaryWebView.getVisibility() == 8) {
            this.primaryWebView.setVisibility(8);
            this.secondaryWebView.setVisibility(0);
            CheckoutUtils.dismissLoader();
            AnalyticsUtil.trackEvent(AnalyticsEvent.WEB_VIEW_PRIMARY_TO_SECONDARY_SWITCH);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("BaseCheckoutActivity", "onActivityResult", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            super.onActivityResult(i, i2, intent);
            if (i == 1001) {
                this.presenter.sendOtpPermissionCallback(true);
            }
            this.presenter.onActivityResultReceived(i, i2, intent);
            AnalyticsUtil.logCheckoutFunctionExit("BaseCheckoutActivity", "onActivityResult", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.presenter.backPressed(new HashMap());
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(Bundle bundle) {
        boolean z;
        requestWindowFeature(1);
        super.onCreate(bundle);
        try {
            WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                try {
                    getWindow().setStatusBarContrastEnforced(false);
                    getWindow().setNavigationBarContrastEnforced(false);
                } catch (Exception e) {
                    e = e;
                    AnalyticsUtil.reportCaughtException(e);
                    AnalyticsUtil.reportBlockingCaughtException(this, e);
                }
            }
            BaseConfig.paymentInProgress = true;
            SharedPreferenceUtil.handleSdkUpdate(this, _Oo_O_$.SDK_VERSION);
            _Oo_O_$.ensureInitialized(this);
            BaseUtils.setup();
            MonitoringUtil.startCheckout(this, "standard_checkout", BaseUtils.getKeyId(this));
            BaseUtils.checkForLatestVersion(this, _Oo_O_$.SDK_VERSION_CODE);
            this.presenter.setCheckoutLoadStartAt();
            AnalyticsUtil.trackEvent(AnalyticsEvent.CHECKOUT_INIT);
            HashMap hashMap = new HashMap();
            if (!this.lifecycleContext.isEmpty()) {
                hashMap.put(Constants.REASON, this.lifecycleContext);
            }
            AnalyticsUtil.trackEvent(AnalyticsEvent.ACTIVITY_ONCREATE_CALLED, hashMap);
            this.lifecycleContext = "";
            EventCallback eventCallback = Checkout.getEventCallback();
            if (eventCallback != null) {
                this.presenter.setEventCallback(eventCallback);
            }
            ArrayList<String> subscribedAnalyticsEvents = Checkout.getSubscribedAnalyticsEvents();
            if (subscribedAnalyticsEvents != null) {
                this.presenter.setSubscribedAnalyticsEvents(subscribedAnalyticsEvents);
            }
            AnalyticsUtil.libraryType = "CHECKOUTJS";
            final CheckoutPresenter checkoutPresenter = this.presenter;
            setWebViewClient(1, new WebViewClient(checkoutPresenter) { // from class: com.razorpay.$00oO$
                int maxRetryCount = 2;
                CheckoutPresenter presenter;

                {
                    this.presenter = checkoutPresenter;
                }

                private void O$$$__o0Oo(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, String str) {
                    boolean didCrash;
                    int rendererPriorityAtExit;
                    try {
                        HashMap hashMap2 = new HashMap();
                        if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail == null) {
                            hashMap2.put("did_crash", EnvironmentCompat.MEDIA_UNKNOWN);
                            hashMap2.put("renderer_priority_at_exit", EnvironmentCompat.MEDIA_UNKNOWN);
                        } else {
                            didCrash = renderProcessGoneDetail.didCrash();
                            hashMap2.put("did_crash", Boolean.valueOf(didCrash));
                            rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
                            hashMap2.put("renderer_priority_at_exit", Integer.valueOf(rendererPriorityAtExit));
                        }
                        hashMap2.put("manufacturer", Build.MANUFACTURER);
                        hashMap2.put("model", Build.MODEL);
                        hashMap2.put("os_version", Build.VERSION.RELEASE);
                        if (webView != null && webView.getContext() != null) {
                            int performanceClass = PerformanceUtil.getPerformanceClass(webView.getContext());
                            boolean isLowEndDevice = PerformanceUtil.isLowEndDevice(webView.getContext());
                            hashMap2.put("performance_class", Integer.valueOf(performanceClass));
                            hashMap2.put("is_low_end_device", Boolean.valueOf(isLowEndDevice));
                            ActivityManager activityManager = (ActivityManager) webView.getContext().getSystemService("activity");
                            if (activityManager != null) {
                                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                activityManager.getMemoryInfo(memoryInfo);
                                hashMap2.put("total_ram_mb", Long.valueOf(memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                            }
                        }
                        hashMap2.put("cpu_cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
                        hashMap2.put("webview_type", str);
                        AnalyticsEvent analyticsEvent = AnalyticsEvent.WEBVIEW_RENDERER_CRASHED;
                        AnalyticsUtil.trackEvent(analyticsEvent, AnalyticsUtil.getJSONResponse(hashMap2));
                        MonitoringUtil.trackCriticalDependencyFailure(webView == null ? null : webView.getContext(), "webview_renderer_process", "render", analyticsEvent.getEventName(), "WebView renderer process gone", true, false, "not_available");
                        Lumberjack.postData();
                        Logger.d("Renderer crash analytics tracked");
                    } catch (Exception e2) {
                        Logger.e("Error tracking renderer crash: " + e2.getMessage());
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    Logger.d("onPageFinished: " + str);
                    Logger.d("LOAD_TIME onPageFinished:" + System.currentTimeMillis());
                    this.presenter.onPageFinished(1, webView, str);
                    CheckoutUtils.toggleWebviewBackground(webView, str.contains(GlobalUrlConfig.instance().getL$1_I$l$()));
                }

                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    try {
                        AnalyticsUtil.logCheckoutFunctionEntry("PrimaryWebViewClient", "onPageStarted", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                        Logger.d("onPageStarted: " + str);
                        Logger.d("LOAD_TIME onPageStarted:" + System.currentTimeMillis());
                        webView.setTag(str);
                        this.presenter.onPageStarted(1, webView, str);
                        CheckoutUtils.toggleWebviewBackground(webView, str.contains(GlobalUrlConfig.instance().getL$1_I$l$()));
                        AnalyticsUtil.logCheckoutFunctionExit("PrimaryWebViewClient", "onPageStarted", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                    } catch (Exception e2) {
                        AnalyticsUtil.reportCaughtException(e2);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i2, String str, String str2) {
                    if (!str.contains("NAME_NOT_RESOLVED")) {
                        AnalyticsEvent analyticsEvent = AnalyticsEvent.WEB_VIEW_NETWORK_ERROR;
                        AnalyticsUtil.trackEvent(analyticsEvent);
                        MonitoringUtil.trackCriticalDependencyFailure(webView != null ? webView.getContext() : null, "webview_render", "load", analyticsEvent.getEventName(), str, true, false, "not_available");
                        this.presenter.destroyActivity(2, str);
                        return;
                    }
                    if (this.maxRetryCount > 0) {
                        AnalyticsUtil.trackEvent(AnalyticsEvent.WEB_VIEW_NETWORK_ERROR_RETRY);
                        this.presenter.loadForm("");
                        this.maxRetryCount--;
                    } else {
                        AnalyticsEvent analyticsEvent2 = AnalyticsEvent.WEB_VIEW_NETWORK_RETRY_EXHAUSTED;
                        AnalyticsUtil.trackEvent(analyticsEvent2);
                        MonitoringUtil.trackCriticalDependencyFailure(webView != null ? webView.getContext() : null, "webview_render", "load", analyticsEvent2.getEventName(), str, true, true, "failed");
                        this.presenter.showLoaderDialog(2, str);
                    }
                }

                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    try {
                        O$$$__o0Oo(webView, renderProcessGoneDetail, "primary_webview");
                        return true;
                    } catch (Exception e2) {
                        Logger.e("Error in onRenderProcessGone: " + e2.getMessage());
                        return true;
                    }
                }

                @Override // android.webkit.WebViewClient
                @Nullable
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    String str;
                    try {
                        Logger.d("shouldInterceptRequest: " + webResourceRequest.getUrl().toString());
                        str = webResourceRequest.getUrl().toString().substring(webResourceRequest.getUrl().toString().lastIndexOf(DomExceptionUtils.SEPARATOR) + 1);
                    } catch (Exception unused) {
                        str = "";
                    }
                    try {
                        if (!C$O0Oo$oo0o.getInstance().isFetchedPublicPageUsed && str.equalsIgnoreCase("v2-entry.modern.js")) {
                            return super.shouldInterceptRequest(webView, webResourceRequest);
                        }
                        if (!str.isEmpty()) {
                            String fileIfBuildExists = C$O0Oo$oo0o.getInstance().getFileIfBuildExists(str);
                            if (!fileIfBuildExists.isEmpty()) {
                                String str2 = str.endsWith("css") ? "text/css" : "text/javascript";
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("Access-Control-Allow-Origin", ProxyConfig.MATCH_ALL_SCHEMES);
                                return new WebResourceResponse(str2, "UTF-8", 200, "OK", hashMap2, new ByteArrayInputStream(fileIfBuildExists.getBytes()));
                            }
                        }
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    } catch (Exception e2) {
                        AnalyticsUtil.reportCaughtException(e2);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    try {
                        AnalyticsUtil.logCheckoutFunctionEntry("PrimaryWebViewClient", "shouldOverrideUrlLoading", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                        boolean shouldOverrideUrlLoading = this.presenter.shouldOverrideUrlLoading(webView, str);
                        AnalyticsUtil.logCheckoutFunctionExit("PrimaryWebViewClient", "shouldOverrideUrlLoading", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                        return shouldOverrideUrlLoading;
                    } catch (Exception e2) {
                        AnalyticsUtil.reportCaughtException(e2);
                        return false;
                    }
                }
            });
            final CheckoutPresenter checkoutPresenter2 = this.presenter;
            setWebViewClient(2, new WebViewClient(checkoutPresenter2) { // from class: com.razorpay._o$O$0
                CheckoutPresenter presenter;

                {
                    this.presenter = checkoutPresenter2;
                }

                private void O$$$__o0Oo(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, String str) {
                    boolean didCrash;
                    int rendererPriorityAtExit;
                    try {
                        HashMap hashMap2 = new HashMap();
                        if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail == null) {
                            hashMap2.put("did_crash", EnvironmentCompat.MEDIA_UNKNOWN);
                            hashMap2.put("renderer_priority_at_exit", EnvironmentCompat.MEDIA_UNKNOWN);
                        } else {
                            didCrash = renderProcessGoneDetail.didCrash();
                            hashMap2.put("did_crash", Boolean.valueOf(didCrash));
                            rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
                            hashMap2.put("renderer_priority_at_exit", Integer.valueOf(rendererPriorityAtExit));
                        }
                        hashMap2.put("manufacturer", Build.MANUFACTURER);
                        hashMap2.put("model", Build.MODEL);
                        hashMap2.put("os_version", Build.VERSION.RELEASE);
                        if (webView != null && webView.getContext() != null) {
                            int performanceClass = PerformanceUtil.getPerformanceClass(webView.getContext());
                            boolean isLowEndDevice = PerformanceUtil.isLowEndDevice(webView.getContext());
                            hashMap2.put("performance_class", Integer.valueOf(performanceClass));
                            hashMap2.put("is_low_end_device", Boolean.valueOf(isLowEndDevice));
                            ActivityManager activityManager = (ActivityManager) webView.getContext().getSystemService("activity");
                            if (activityManager != null) {
                                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                activityManager.getMemoryInfo(memoryInfo);
                                hashMap2.put("total_ram_mb", Long.valueOf(memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                            }
                        }
                        hashMap2.put("cpu_cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
                        hashMap2.put("webview_type", str);
                        AnalyticsEvent analyticsEvent = AnalyticsEvent.WEBVIEW_RENDERER_CRASHED;
                        AnalyticsUtil.trackEvent(analyticsEvent, AnalyticsUtil.getJSONResponse(hashMap2));
                        MonitoringUtil.trackCriticalDependencyFailure(webView == null ? null : webView.getContext(), "webview_renderer_process", "render", analyticsEvent.getEventName(), "WebView renderer process gone", true, false, "not_available");
                        Lumberjack.postData();
                        Logger.d("Renderer crash analytics tracked");
                    } catch (Exception e2) {
                        Logger.e("Error tracking renderer crash: " + e2.getMessage());
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    this.presenter.onPageFinished(2, webView, str);
                }

                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    webView.setTag(str);
                    this.presenter.onPageStarted(2, webView, str);
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i2, String str, String str2) {
                    AnalyticsEvent analyticsEvent = AnalyticsEvent.WEB_VIEW_SECONDARY_NETWORK_ERROR;
                    AnalyticsUtil.trackEvent(analyticsEvent);
                    MonitoringUtil.trackCriticalDependencyFailure(webView == null ? null : webView.getContext(), "webview_render", "load", analyticsEvent.getEventName(), str, true, false, "not_available");
                    this.presenter.destroyActivity(2, str);
                }

                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    try {
                        O$$$__o0Oo(webView, renderProcessGoneDetail, "secondary_webview");
                        return true;
                    } catch (Exception e2) {
                        Logger.e("Error in onRenderProcessGone: " + e2.getMessage());
                        return true;
                    }
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    return false;
                }
            });
            final CheckoutPresenter checkoutPresenter3 = this.presenter;
            setWebChromeClient(1, new WebChromeClient(checkoutPresenter3) { // from class: com.razorpay.$_$0$o0O
                CheckoutPresenter presenter;

                {
                    this.presenter = checkoutPresenter3;
                }

                @Override // android.webkit.WebChromeClient
                public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
                        return false;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(Constants.MESSAGE, consoleMessage.message());
                    hashMap2.put("source_id", consoleMessage.sourceId());
                    hashMap2.put("line_number", String.valueOf(consoleMessage.lineNumber()));
                    AnalyticsUtil.trackEvent(AnalyticsEvent.WEB_VIEW_JS_ERROR, AnalyticsUtil.getJSONResponse(hashMap2));
                    Logger.e("Webview JS Error: " + consoleMessage.message());
                    return false;
                }

                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i2) {
                    this.presenter.onProgressChanges(1, i2);
                }
            });
            final CheckoutPresenter checkoutPresenter4 = this.presenter;
            setWebChromeClient(2, new WebChromeClient(checkoutPresenter4) { // from class: com.razorpay.oO$$$_0$_0
                CheckoutPresenter presenter;

                {
                    this.presenter = checkoutPresenter4;
                }

                @Override // android.webkit.WebChromeClient
                public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                    return false;
                }

                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i2) {
                    this.presenter.onProgressChanges(2, i2);
                }
            });
            Logger.d("CheckoutActivity onCreate called");
            if (bundle == null) {
                bundle = getIntent().getExtras();
                z = false;
            } else {
                z = true;
            }
            if (bundle == null) {
                bundle = CheckoutUtils.getCheckoutActivityStateBundle(this);
            }
            if (this.presenter.setOptions(bundle, z)) {
                this.parent = (ViewGroup) findViewById(android.R.id.content);
                MonitoringUtil.setCheckoutStage("checkout_render");
                if (createPrimaryWebView(this.checkoutBridgeObject) && createSecondaryWebView()) {
                    createContainer();
                    MonitoringUtil.persistActiveCheckout(this);
                    AnalyticsUtil.logCheckoutFunctionEntry("BaseCheckoutActivity", "onCreate", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                    getWindow().getDecorView().post(new Runnable() { // from class: com.razorpay.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            BaseCheckoutActivity.this.applyStatusBarScrim();
                        }
                    });
                    if (CheckoutUtils.isDynamicUrlConfigUsed(bundle)) {
                        this.presenter.setOptionsWithDynamicUrl(this, bundle, z, new SetOptionsCallback() { // from class: com.razorpay.BaseCheckoutActivity.1
                            @Override // com.razorpay.BaseCheckoutActivity.SetOptionsCallback
                            public void onError() {
                                BaseCheckoutActivity.this.destroy(3, "Dynamic URL Config is disabled. Please contact the administrator if you believe this is wrong.");
                            }

                            @Override // com.razorpay.BaseCheckoutActivity.SetOptionsCallback
                            public void onFeatureDisabled() {
                                BaseCheckoutActivity.this.destroy(3, "Dynamic URL Config is disabled. Please contact the administrator if you believe this is wrong.");
                            }

                            @Override // com.razorpay.BaseCheckoutActivity.SetOptionsCallback
                            public void onOptionsSet() {
                                SharedPreferenceUtil.setValue(BaseCheckoutActivity.this, "optimizer_hosted", String.valueOf(true));
                                if (C$O0Oo$oo0o.getInstance().publicPageResponse == null) {
                                    BaseCheckoutActivity.this.presenter.loadForm("");
                                } else {
                                    C$O0Oo$oo0o.getInstance().isFetchedPublicPageUsed = true;
                                    BaseCheckoutActivity.this.presenter.loadFetchedForm(C$O0Oo$oo0o.getInstance().checkoutPublicUrl, C$O0Oo$oo0o.getInstance().publicPageResponse);
                                }
                            }
                        });
                    } else if (C$O0Oo$oo0o.getInstance().publicPageResponse != null) {
                        C$O0Oo$oo0o.getInstance().isFetchedPublicPageUsed = true;
                        this.presenter.loadFetchedForm(C$O0Oo$oo0o.getInstance().checkoutPublicUrl, C$O0Oo$oo0o.getInstance().publicPageResponse);
                    } else {
                        this.presenter.loadForm("");
                    }
                    this.presenter.passPrefillToSegment();
                    if ((getWindow().getAttributes().flags & 1024) != 0) {
                        O$$$__o0Oo.assistActivity(this);
                        Logger.d("FULLSCREEN");
                    } else {
                        Logger.d("NOT FULLSCREEN");
                    }
                    if (this.presenter.isAllowRotation()) {
                        return;
                    }
                    if (ResourceUtils.isTablet(this)) {
                        Logger.d("is tablet");
                        setFinishOnTouchOutside(false);
                        WindowManager.LayoutParams attributes = getWindow().getAttributes();
                        int dpToPx = ResourceUtils.dpToPx(this, 375);
                        int viewHeight = ResourceUtils.getViewHeight(this);
                        if (viewHeight > 600) {
                            viewHeight = ResourceUtils.dpToPx(this, SplitRule.SPLIT_MIN_DIMENSION_DP_DEFAULT);
                        }
                        attributes.height = viewHeight;
                        attributes.width = dpToPx;
                        getWindow().setAttributes(attributes);
                    } else if (i != 26) {
                        setRequestedOrientation(1);
                    }
                    this.presenter.fetchCondfig();
                    this.presenter.handleCardSaving();
                    try {
                        if (BaseUtils.isDeviceHaveCorrectTlsVersion()) {
                            AnalyticsUtil.logCheckoutFunctionExit("BaseCheckoutActivity", "onCreate", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                            return;
                        }
                        AnalyticsEvent analyticsEvent = AnalyticsEvent.CHECKOUT_TLS_ERROR;
                        AnalyticsUtil.trackEvent(analyticsEvent);
                        try {
                            MonitoringUtil.trackCriticalDependencyFailure(this, "tls", "check", analyticsEvent.getEventName(), "TLSv1  is not supported for security reasons", true, false, "not_available");
                            destroy(6, "TLSv1  is not supported for security reasons");
                        } catch (Exception e2) {
                            e = e2;
                            AnalyticsUtil.reportCaughtException(e);
                            AnalyticsUtil.reportBlockingCaughtException(this, e);
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            CheckoutNfcUtility.INSTANCE.cleanup(this);
            AnalyticsUtil.logCheckoutFunctionEntry("BaseCheckoutActivity", "onDestroy", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            AnalyticsUtil.trackEvent(AnalyticsEvent.ACTIVITY_ONDESTROY_CALLED);
            Logger.d("CheckoutActivity onDestroy called");
            try {
                this.presenter.cleanUpOnDestroy();
            } catch (ConcurrentModificationException e) {
                AnalyticsUtil.reportError(getClass().getName(), "S0", e.getLocalizedMessage());
                e.printStackTrace();
            }
            MonitoringUtil.clearCheckout(this);
            super.onDestroy();
            AnalyticsUtil.logCheckoutFunctionExit("BaseCheckoutActivity", "onDestroy", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e2) {
            AnalyticsUtil.reportCaughtException(e2);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        CheckoutNfcUtility.INSTANCE.disableReaderMode(this);
        HashMap hashMap = new HashMap();
        if (this.lifecycleContext.isEmpty()) {
            Logger.d("CheckoutActivity onPause called");
        } else {
            hashMap.put(Constants.REASON, this.lifecycleContext);
            Logger.d("CheckoutActivity onPause called with reason: " + this.lifecycleContext);
        }
        AnalyticsUtil.trackEvent(AnalyticsEvent.ACTIVITY_ONPAUSE_CALLED, hashMap);
        this.lifecycleContext = "";
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.presenter.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        CheckoutNfcUtility.INSTANCE.resumeReaderModeIfActive(this);
        HashMap hashMap = new HashMap();
        if (this.lifecycleContext.isEmpty()) {
            Logger.d("CheckoutActivity onResume called");
        } else {
            hashMap.put(Constants.REASON, this.lifecycleContext);
            Logger.d("CheckoutActivity onResume called with reason: " + this.lifecycleContext);
        }
        AnalyticsUtil.trackEvent(AnalyticsEvent.ACTIVITY_ONRESUME_CALLED, hashMap);
        this.lifecycleContext = "";
        super.onResume();
        this.presenter.onResumeTriggered();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.presenter.saveInstanceState(bundle);
    }

    @Override // com.razorpay.SmsAgentInterface
    public void postSms(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sender", str);
            jSONObject.put(Constants.MESSAGE, str2);
            jSONObject.toString();
            loadUrl(1, "OTPElf.showOTP('" + str2 + "','" + str + "')");
        } catch (JSONException e) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e.getMessage());
            e.printStackTrace();
        }
    }

    public void setLifecycleContext(LifecycleContext lifecycleContext, String str) {
        this.lifecycleContext = lifecycleContext.format(str);
    }

    @Override // com.razorpay.SmsAgentInterface
    public void setSmsPermission(boolean z) {
        this.presenter.sendOtpPermissionCallback(z);
        SmsAgent smsAgent = this.smsAgent;
        if (smsAgent != null) {
            smsAgent.deregisterForCallbacks(this);
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void showProgressBar(int i) {
        __O000_$O0 __o000_$o0 = this.rzpbar;
        if (__o000_$o0 != null) {
            __o000_$o0.show(i);
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void showToast(String str, int i) {
        Toast.makeText(this, str, i).show();
    }
}

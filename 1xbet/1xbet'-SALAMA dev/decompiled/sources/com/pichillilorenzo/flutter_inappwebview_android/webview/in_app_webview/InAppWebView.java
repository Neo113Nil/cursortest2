package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import A5.r;
import A5.s;
import R0.d;
import R0.q;
import R0.w;
import S0.C0431b;
import W5.AbstractC0486a1;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintJob;
import android.print.PrintManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerAction;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTrigger;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptAjaxRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptFetchRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnLoadResourceJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowBlurEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowFocusEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PluginScriptsUtil;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PrintJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PromisePolyfillJS;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.ContextMenuSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import p031e1.k;
import p136t.e;
import p150v0.a;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public final class InAppWebView extends InputAwareWebView implements InAppWebViewInterface {
    protected static final String LOG_TAG = "InAppWebView";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_";
    static Handler mHandler = new Handler();
    public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks;
    public WebViewChannelDelegate channelDelegate;
    public Runnable checkContextMenuShouldBeClosedTask;
    public Runnable checkScrollStoppedTask;
    public ContentBlockerHandler contentBlockerHandler;
    public Map<String, Object> contextMenu;
    private Point contextMenuPoint;
    public InAppWebViewSettings customSettings;
    public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks;
    private final String expectedBridgeSecret;
    public FindInteractionController findInteractionController;
    public LinearLayout floatingContextMenu;
    public GestureDetector gestureDetector;
    public Object id;
    public InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebViewChromeClient inAppWebViewChromeClient;
    public InAppWebViewClient inAppWebViewClient;
    public InAppWebViewClientCompat inAppWebViewClientCompat;
    public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
    private boolean inFullscreen;
    public int initialPositionScrollStoppedTask;
    private List<UserScript> initialUserOnlyScripts;
    private PluginScript interceptOnlyAsyncAjaxRequestsPluginScript;
    public boolean isLoading;
    private boolean javaScriptBridgeEnabled;
    public JavaScriptBridgeInterface javaScriptBridgeInterface;
    private Point lastTouch;
    public Handler mainLooperHandler;
    public int newCheckContextMenuShouldBeClosedTaskTask;
    public int newCheckScrollStoppedTask;
    public InAppWebViewFlutterPlugin plugin;
    public UserContentController userContentController;
    public Map<String, WebMessageChannel> webMessageChannels;
    public List<WebMessageListener> webMessageListeners;
    public WebViewAssetLoaderExt webViewAssetLoaderExt;
    public Integer windowId;
    public float zoomScale;

    /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView$21, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass21 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType;

        static {
            int[] iArr = new int[PreferredContentModeOptionType.values().length];
            $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType = iArr;
            try {
                iArr[PreferredContentModeOptionType.DESKTOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.RECOMMENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class DownloadStartListener implements DownloadListener {
        public DownloadStartListener() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            DownloadStartRequest downloadStartRequest = new DownloadStartRequest(str, str2, str3, str4, j, URLUtil.guessFileName(str, str3, str4), null);
            WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
            if (webViewChannelDelegate != null) {
                webViewChannelDelegate.onDownloadStarting(downloadStartRequest);
            }
        }
    }

    public InAppWebView(Context context) {
        super(context);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.expectedBridgeSecret = UUID.randomUUID().toString();
        this.javaScriptBridgeEnabled = true;
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    @Deprecated
    private void clearCookies() {
        CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.7
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
            }
        });
    }

    private void sendOnCreateContextMenuEvent() {
        HitTestResult hitTestResultFromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(getHitTestResult());
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onCreateContextMenu(hitTestResultFromWebViewHitTestResult);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void addWebMessageListener(WebMessageListener webMessageListener) {
        if (d.a("WEB_MESSAGE_LISTENER")) {
            w.b(this, webMessageListener.jsObjectName, webMessageListener.allowedOriginRules, webMessageListener.listener);
            this.webMessageListeners.add(webMessageListener);
        }
    }

    public void adjustFloatingContextMenuPosition() {
        evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.16
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                if (InAppWebView.this.floatingContextMenu != null) {
                    if (str == null || str.equalsIgnoreCase("null")) {
                        InAppWebView.this.floatingContextMenu.setVisibility(0);
                        InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                        InAppWebView inAppWebView = InAppWebView.this;
                        inAppWebView.onFloatingActionGlobalLayout(inAppWebView.contextMenuPoint.x, InAppWebView.this.contextMenuPoint.y);
                        return;
                    }
                    int i7 = InAppWebView.this.contextMenuPoint.x;
                    int height = (int) ((((double) InAppWebView.this.floatingContextMenu.getHeight()) / 3.5d) + ((double) (Util.getPixelDensity(InAppWebView.this.getContext()) * Float.parseFloat(str))));
                    InAppWebView.this.contextMenuPoint.y = height;
                    InAppWebView.this.onFloatingActionGlobalLayout(i7, height);
                }
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void callAsyncJavaScript(String str, Map<String, Object> map, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        String string = UUID.randomUUID().toString();
        if (valueCallback != null) {
            this.callAsyncJavaScriptCallbacks.put(string, valueCallback);
        }
        Iterator<String> itKeys = new JSONObject(map).keys();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(next);
            arrayList2.add("obj." + next);
        }
        String strJoin = TextUtils.join(", ", arrayList);
        evaluateJavascript(this.userContentController.generateCodeForScriptEvaluation(PluginScriptsUtil.CALL_ASYNC_JAVA_SCRIPT_WRAPPER_JS_SOURCE().replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_NAMES, strJoin).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_VALUES, TextUtils.join(", ", arrayList2)).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENTS_OBJ, Util.JSONStringify(map)).replace(PluginScriptsUtil.VAR_FUNCTION_BODY, str).replace(PluginScriptsUtil.VAR_RESULT_UUID, string).replace(PluginScriptsUtil.VAR_RESULT_UUID, string), contentWorld), null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean canScrollHorizontally() {
        return computeHorizontalScrollRange() > computeHorizontalScrollExtent();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean canScrollVertically() {
        return computeVerticalScrollRange() > computeVerticalScrollExtent();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    @Deprecated
    public void clearAllCache() {
        clearCache(true);
        clearCookies();
        clearFormData();
        WebStorage.getInstance().deleteAllData();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebMessageChannel createCompatWebMessageChannel() {
        String string = UUID.randomUUID().toString();
        WebMessageChannel webMessageChannel = new WebMessageChannel(string, this);
        this.webMessageChannels.put(string, webMessageChannel);
        return webMessageChannel;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> valueCallback) {
        WebMessageChannel webMessageChannelCreateCompatWebMessageChannel = createCompatWebMessageChannel();
        valueCallback.onReceiveValue(webMessageChannelCreateCompatWebMessageChannel);
        return webMessageChannelCreateCompatWebMessageChannel;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public WebViewClient createWebViewClient(InAppBrowserDelegate inAppBrowserDelegate) {
        boolean z4;
        PackageInfo packageInfoD = w.d(getContext());
        if (packageInfoD == null) {
            Log.d(LOG_TAG, "Using InAppWebViewClient implementation");
            return new InAppWebViewClient(inAppBrowserDelegate);
        }
        boolean z7 = "com.android.webview".equals(packageInfoD.packageName) || "com.google.android.webview".equals(packageInfoD.packageName) || "com.android.chrome".equals(packageInfoD.packageName);
        if (z7) {
            String str = packageInfoD.versionName;
            if (str == null) {
                str = "";
            }
            try {
                z4 = (str.contains(".") ? Integer.parseInt(str.split("\\.")[0]) : 0) >= 73;
            } catch (NumberFormatException unused) {
            }
        }
        if (z4 || !z7) {
            Log.d(LOG_TAG, "Using InAppWebViewClientCompat implementation");
            return new InAppWebViewClientCompat(inAppBrowserDelegate);
        }
        Log.d(LOG_TAG, "Using InAppWebViewClient implementation");
        return new InAppWebViewClient(inAppBrowserDelegate);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InputAwareWebView
    public void dispose() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        InAppWebViewManager inAppWebViewManager;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        super.dispose();
        getSettings().setJavaScriptEnabled(false);
        removeJavascriptInterface(JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME());
        if (Build.VERSION.SDK_INT >= 29 && d.a("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            w.i(this, null);
        }
        setWebChromeClient(new WebChromeClient());
        setWebViewClient(new WebViewClient() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.20
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                InAppWebView.this.destroy();
            }
        });
        this.interceptOnlyAsyncAjaxRequestsPluginScript = null;
        this.userContentController.dispose();
        FindInteractionController findInteractionController = this.findInteractionController;
        if (findInteractionController != null) {
            findInteractionController.dispose();
            this.findInteractionController = null;
        }
        WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
        if (webViewAssetLoaderExt != null) {
            webViewAssetLoaderExt.dispose();
            this.webViewAssetLoaderExt = null;
        }
        Integer num = this.windowId;
        if (num != null && (inAppWebViewFlutterPlugin = this.plugin) != null && (inAppWebViewManager = inAppWebViewFlutterPlugin.inAppWebViewManager) != null) {
            inAppWebViewManager.windowWebViewMessages.remove(num);
        }
        this.mainLooperHandler.removeCallbacksAndMessages(null);
        mHandler.removeCallbacksAndMessages(null);
        disposeWebMessageChannels();
        disposeWebMessageListeners();
        removeAllViews();
        Runnable runnable = this.checkContextMenuShouldBeClosedTask;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.checkScrollStoppedTask;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.callAsyncJavaScriptCallbacks.clear();
        this.evaluateJavaScriptContentWorldCallbacks.clear();
        this.inAppBrowserDelegate = null;
        InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = this.inAppWebViewRenderProcessClient;
        if (inAppWebViewRenderProcessClient != null) {
            inAppWebViewRenderProcessClient.dispose();
            this.inAppWebViewRenderProcessClient = null;
        }
        InAppWebViewChromeClient inAppWebViewChromeClient = this.inAppWebViewChromeClient;
        if (inAppWebViewChromeClient != null) {
            inAppWebViewChromeClient.dispose();
            this.inAppWebViewChromeClient = null;
        }
        InAppWebViewClientCompat inAppWebViewClientCompat = this.inAppWebViewClientCompat;
        if (inAppWebViewClientCompat != null) {
            inAppWebViewClientCompat.dispose();
            this.inAppWebViewClientCompat = null;
        }
        InAppWebViewClient inAppWebViewClient = this.inAppWebViewClient;
        if (inAppWebViewClient != null) {
            inAppWebViewClient.dispose();
            this.inAppWebViewClient = null;
        }
        JavaScriptBridgeInterface javaScriptBridgeInterface = this.javaScriptBridgeInterface;
        if (javaScriptBridgeInterface != null) {
            javaScriptBridgeInterface.dispose();
            this.javaScriptBridgeInterface = null;
        }
        this.plugin = null;
        loadUrl("about:blank");
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void disposeWebMessageChannels() {
        Iterator<WebMessageChannel> it = this.webMessageChannels.values().iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.webMessageChannels.clear();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void disposeWebMessageListeners() {
        Iterator<WebMessageListener> it = this.webMessageListeners.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.webMessageListeners.clear();
    }

    public void enablePluginScriptAtRuntime(final String str, final boolean z4, final PluginScript pluginScript) {
        evaluateJavascript(L.i("window.", str), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.9
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                if (str2 == null || str2.equalsIgnoreCase("null")) {
                    if (z4 && InAppWebView.this.javaScriptBridgeEnabled) {
                        InAppWebView.this.evaluateJavascript(pluginScript.getSource(), null, null);
                        InAppWebView.this.userContentController.addPluginScript(pluginScript);
                        return;
                    }
                    return;
                }
                InAppWebView.this.evaluateJavascript("window." + str + " = " + z4 + ";", null, null);
                if (z4) {
                    return;
                }
                InAppWebView.this.userContentController.removePluginScript(pluginScript);
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void evaluateJavascript(String str, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        injectDeferredObject(str, contentWorld, null, valueCallback);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebViewChannelDelegate getChannelDelegate() {
        return this.channelDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getContentHeight(ValueCallback<Integer> valueCallback) {
        valueCallback.onReceiveValue(Integer.valueOf(getContentHeight()));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getContentWidth(final ValueCallback<Integer> valueCallback) {
        evaluateJavascript("document.documentElement.scrollWidth;", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.19
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : Integer.valueOf(Integer.parseInt(str)));
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> getContextMenu() {
        return this.contextMenu;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public HashMap<String, Object> getCopyBackForwardList() {
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        int size = webBackForwardListCopyBackForwardList.getSize();
        int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i7);
            HashMap map = new HashMap();
            map.put("originalUrl", itemAtIndex.getOriginalUrl());
            map.put("title", itemAtIndex.getTitle());
            map.put("url", itemAtIndex.getUrl());
            arrayList.add(map);
        }
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("list", arrayList);
        map2.put("currentIndex", Integer.valueOf(currentIndex));
        return map2;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public InAppWebViewSettings getCustomSettings() {
        return this.customSettings;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> getCustomSettingsMap() {
        InAppWebViewSettings inAppWebViewSettings = this.customSettings;
        if (inAppWebViewSettings != null) {
            return inAppWebViewSettings.getRealSettings((InAppWebViewInterface) this);
        }
        return null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getHitTestResult(ValueCallback<HitTestResult> valueCallback) {
        valueCallback.onReceiveValue(HitTestResult.fromWebViewHitTestResult(getHitTestResult()));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public InAppBrowserDelegate getInAppBrowserDelegate() {
        return this.inAppBrowserDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public InAppWebViewFlutterPlugin getPlugin() {
        return this.plugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getSelectedText(final ValueCallback<String> valueCallback) {
        evaluateJavascript(PluginScriptsUtil.GET_SELECTED_TEXT_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.17
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : str.substring(1, str.length() - 1));
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public UserContentController getUserContentController() {
        return this.userContentController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, WebMessageChannel> getWebMessageChannels() {
        return this.webMessageChannels;
    }

    @Override // android.webkit.WebView, com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Looper getWebViewLooper() {
        return Build.VERSION.SDK_INT >= 28 ? super.getWebViewLooper() : Looper.getMainLooper();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public float getZoomScale() {
        return this.zoomScale;
    }

    public void hideContextMenu() {
        removeView(this.floatingContextMenu);
        this.floatingContextMenu = null;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onHideContextMenu();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void hideInputMethod() {
        Activity activity;
        InputMethodManager inputMethodManager;
        View view;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null || (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) == null) {
            return;
        }
        IBinder windowToken = getWindowToken();
        if (!this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            windowToken = view.getWindowToken();
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectCSSCode(String str) {
        injectDeferredObject(str, null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; if (d.head != null) { d.head.appendChild(style); } })(document);", null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectCSSFileFromUrl(String str, Map<String, Object> map) {
        String string;
        String strE;
        String str2 = "";
        if (map != null) {
            String str3 = (String) map.get("id");
            if (str3 != null) {
                strE = " link.id = '" + str3.replaceAll("'", "\\\\'") + "'; ";
            } else {
                strE = "";
            }
            String str4 = (String) map.get("media");
            if (str4 != null) {
                StringBuilder sbD = e.d(strE, " link.media = '");
                sbD.append(str4.replaceAll("'", "\\\\'"));
                sbD.append("'; ");
                strE = sbD.toString();
            }
            String str5 = (String) map.get("crossOrigin");
            if (str5 != null) {
                StringBuilder sbD2 = e.d(strE, " link.crossOrigin = '");
                sbD2.append(str5.replaceAll("'", "\\\\'"));
                sbD2.append("'; ");
                strE = sbD2.toString();
            }
            String str6 = (String) map.get("integrity");
            if (str6 != null) {
                StringBuilder sbD3 = e.d(strE, " link.integrity = '");
                sbD3.append(str6.replaceAll("'", "\\\\'"));
                sbD3.append("'; ");
                strE = sbD3.toString();
            }
            String str7 = (String) map.get("referrerPolicy");
            if (str7 != null) {
                StringBuilder sbD4 = e.d(strE, " link.referrerPolicy = '");
                sbD4.append(str7.replaceAll("'", "\\\\'"));
                sbD4.append("'; ");
                strE = sbD4.toString();
            }
            Boolean bool = (Boolean) map.get("disabled");
            if (bool != null && bool.booleanValue()) {
                strE = k.e(strE, " link.disabled = true; ");
            }
            Boolean bool2 = (Boolean) map.get("alternate");
            if (bool2 != null && bool2.booleanValue()) {
                str2 = "alternate ";
            }
            String str8 = (String) map.get("title");
            if (str8 != null) {
                StringBuilder sbD5 = e.d(strE, " link.title = '");
                sbD5.append(str8.replaceAll("'", "\\\\'"));
                sbD5.append("'; ");
                string = sbD5.toString();
            } else {
                string = strE;
            }
        } else {
            string = "";
        }
        injectDeferredObject(str, null, L.j("(function(d) { var link = d.createElement('link'); link.rel='", str2, "stylesheet'; link.type='text/css'; ", string, " link.href = %s; if (d.head != null) { d.head.appendChild(link); } })(document);"), null);
    }

    public void injectDeferredObject(String str, final ContentWorld contentWorld, String str2, final ValueCallback<String> valueCallback) {
        String str3;
        final String strReplace;
        final String string = (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? null : UUID.randomUUID().toString();
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            String string2 = jSONArray.toString();
            str3 = String.format(str2, string2.substring(1, string2.length() - 1));
        } else {
            str3 = str;
        }
        if (string == null || valueCallback == null) {
            strReplace = str3;
        } else {
            this.evaluateJavaScriptContentWorldCallbacks.put(string, valueCallback);
            strReplace = Util.replaceAll(PluginScriptsUtil.EVALUATE_JAVASCRIPT_WITH_CONTENT_WORLD_WRAPPER_JS_SOURCE(), PluginScriptsUtil.VAR_RANDOM_NAME, "_" + JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME() + "_" + Math.round(Math.random() * 1000000.0d)).replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, UserContentController.escapeCode(str)).replace(PluginScriptsUtil.VAR_RESULT_UUID, string);
        }
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10
            @Override // java.lang.Runnable
            public void run() {
                InAppWebView.this.evaluateJavascript(InAppWebView.this.userContentController.generateCodeForScriptEvaluation(strReplace, contentWorld), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10.1
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str4) {
                        ValueCallback valueCallback2;
                        AnonymousClass10 anonymousClass10 = AnonymousClass10.this;
                        if (string != null || (valueCallback2 = valueCallback) == null) {
                            return;
                        }
                        valueCallback2.onReceiveValue(str4);
                    }
                });
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectJavascriptFileFromUrl(String str, Map<String, Object> map) {
        String string = "";
        if (map != null) {
            String str2 = (String) map.get("type");
            if (str2 != null) {
                string = " script.type = '" + str2.replaceAll("'", "\\\\'") + "'; ";
            }
            String str3 = (String) map.get("id");
            if (str3 != null) {
                String strReplaceAll = str3.replaceAll("'", "\\\\'");
                StringBuilder sbD = e.d(a.o(string, " script.id = '", strReplaceAll, "'; "), " script.onload = function() {  if (window.");
                sbD.append(JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME());
                sbD.append(" != null) {    window.");
                sbD.append(JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME());
                sbD.append(".callHandler('onInjectedScriptLoaded', '");
                sbD.append(strReplaceAll);
                sbD.append("');  }};");
                StringBuilder sbD2 = e.d(sbD.toString(), " script.onerror = function() {  if (window.");
                sbD2.append(JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME());
                sbD2.append(" != null) {    window.");
                sbD2.append(JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME());
                sbD2.append(".callHandler('onInjectedScriptError', '");
                sbD2.append(strReplaceAll);
                sbD2.append("');  }};");
                string = sbD2.toString();
            }
            Boolean bool = (Boolean) map.get("async");
            if (bool != null && bool.booleanValue()) {
                string = k.e(string, " script.async = true; ");
            }
            Boolean bool2 = (Boolean) map.get("defer");
            if (bool2 != null && bool2.booleanValue()) {
                string = k.e(string, " script.defer = true; ");
            }
            String str4 = (String) map.get("crossOrigin");
            if (str4 != null) {
                StringBuilder sbD3 = e.d(string, " script.crossOrigin = '");
                sbD3.append(str4.replaceAll("'", "\\\\'"));
                sbD3.append("'; ");
                string = sbD3.toString();
            }
            String str5 = (String) map.get("integrity");
            if (str5 != null) {
                StringBuilder sbD4 = e.d(string, " script.integrity = '");
                sbD4.append(str5.replaceAll("'", "\\\\'"));
                sbD4.append("'; ");
                string = sbD4.toString();
            }
            Boolean bool3 = (Boolean) map.get("noModule");
            if (bool3 != null && bool3.booleanValue()) {
                string = k.e(string, " script.noModule = true; ");
            }
            String str6 = (String) map.get("nonce");
            if (str6 != null) {
                StringBuilder sbD5 = e.d(string, " script.nonce = '");
                sbD5.append(str6.replaceAll("'", "\\\\'"));
                sbD5.append("'; ");
                string = sbD5.toString();
            }
            String str7 = (String) map.get("referrerPolicy");
            if (str7 != null) {
                StringBuilder sbD6 = e.d(string, " script.referrerPolicy = '");
                sbD6.append(str7.replaceAll("'", "\\\\'"));
                sbD6.append("'; ");
                string = sbD6.toString();
            }
        }
        injectDeferredObject(str, null, AbstractC0486a1.h("(function(d) { var script = d.createElement('script'); ", string, " script.src = %s; if (d.body != null) { d.body.appendChild(script); } })(document);"), null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean isInFullscreen() {
        return this.inFullscreen;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean isLoading() {
        return this.isLoading;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void isSecureContext(final ValueCallback<Boolean> valueCallback) {
        evaluateJavascript("window.isSecureContext", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.18
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                if (str == null || str.isEmpty() || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("false")) {
                    valueCallback.onReceiveValue(Boolean.FALSE);
                } else {
                    valueCallback.onReceiveValue(Boolean.TRUE);
                }
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void loadFile(String str) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null) {
            return;
        }
        loadUrl(Util.getUrlAsset(inAppWebViewFlutterPlugin, str));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void loadUrl(URLRequest uRLRequest) {
        String url = uRLRequest.getUrl();
        String method = uRLRequest.getMethod();
        if (method != null && method.equals("POST")) {
            postUrl(url, uRLRequest.getBody());
            return;
        }
        Map<String, String> headers = uRLRequest.getHeaders();
        if (headers != null) {
            loadUrl(url, headers);
        } else {
            loadUrl(url);
        }
    }

    @Override // android.view.View
    public void onCreateContextMenu(ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        sendOnCreateContextMenuEvent();
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        View view;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null && !this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            view.getHandler().postDelayed(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.11
                @Override // java.lang.Runnable
                public void run() {
                    boolean zIsAcceptingText;
                    InputMethodManager inputMethodManager = (InputMethodManager) InAppWebView.this.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        try {
                            zIsAcceptingText = inputMethodManager.isAcceptingText();
                        } catch (Exception unused) {
                            zIsAcceptingText = false;
                        }
                    } else {
                        zIsAcceptingText = false;
                    }
                    View view2 = InAppWebView.this.containerView;
                    if (view2 == null || inputMethodManager == null || zIsAcceptingText) {
                        return;
                    }
                    inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 2);
                }
            }, 128L);
        }
        return inputConnectionOnCreateInputConnection;
    }

    public void onFloatingActionGlobalLayout(int i7, int i8) {
        int width = getWidth();
        getHeight();
        int width2 = this.floatingContextMenu.getWidth();
        int height = this.floatingContextMenu.getHeight();
        int i9 = i7 - (width2 / 2);
        if (i9 < 0) {
            i9 = 0;
        } else if (i9 + width2 > width) {
            i9 = width - width2;
        }
        float f7 = i8 - (height * 1.5f);
        if (f7 < 0.0f) {
            f7 = i8 + height;
        }
        updateViewLayout(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, getScrollX() + i9, getScrollY() + ((int) f7)));
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.15
            @Override // java.lang.Runnable
            public void run() {
                LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                }
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i7, int i8, boolean z4, boolean z7) {
        WebViewChannelDelegate webViewChannelDelegate;
        super.onOverScrolled(i7, i8, z4, z7);
        boolean z8 = false;
        boolean z9 = canScrollHorizontally() && z4;
        if (canScrollVertically() && z7) {
            z8 = true;
        }
        ViewParent parent = getParent();
        if ((parent instanceof PullToRefreshLayout) && z8 && i8 <= 10) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            setOverScrollMode(2);
            pullToRefreshLayout.setEnabled(pullToRefreshLayout.settings.enabled.booleanValue());
            setOverScrollMode(this.customSettings.overScrollMode.intValue());
        }
        if ((z9 || z8) && (webViewChannelDelegate = this.channelDelegate) != null) {
            webViewChannelDelegate.onOverScrolled(i7, i8, z9, z8);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        LinearLayout linearLayout = this.floatingContextMenu;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            this.floatingContextMenu.setVisibility(8);
        }
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onScrollChanged(i7, i8);
        }
    }

    public void onScrollStopped() {
        if (this.floatingContextMenu != null) {
            adjustFloatingContextMenuPosition();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.customSettings.isUserInteractionEnabled.booleanValue()) {
            return true;
        }
        this.lastTouch = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        ViewParent parent = getParent();
        if (parent instanceof PullToRefreshLayout) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            if (motionEvent.getActionMasked() == 0) {
                pullToRefreshLayout.setEnabled(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowVisibilityChanged(int i7) {
        if (!this.customSettings.allowBackgroundAudioPlaying.booleanValue()) {
            super.onWindowVisibilityChanged(i7);
        } else if (i7 != 8) {
            super.onWindowVisibilityChanged(0);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void postWebMessage(WebMessage webMessage, Uri uri, ValueCallback<String> valueCallback) {
        throw new UnsupportedOperationException();
    }

    public void prepare() {
        Double d7 = this.customSettings.alpha;
        if (d7 != null) {
            setAlpha(d7.floatValue());
        }
        this.javaScriptBridgeEnabled = this.customSettings.javaScriptBridgeEnabled.booleanValue();
        Set<String> set = this.customSettings.javaScriptBridgeOriginAllowList;
        if (set != null && set.isEmpty()) {
            this.javaScriptBridgeEnabled = false;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, inAppWebViewFlutterPlugin, getContext());
        }
        if (this.javaScriptBridgeEnabled) {
            JavaScriptBridgeInterface javaScriptBridgeInterface = new JavaScriptBridgeInterface(this, this.expectedBridgeSecret);
            this.javaScriptBridgeInterface = javaScriptBridgeInterface;
            addJavascriptInterface(javaScriptBridgeInterface, JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME());
        }
        InAppWebViewChromeClient inAppWebViewChromeClient = new InAppWebViewChromeClient(this.plugin, this, this.inAppBrowserDelegate);
        this.inAppWebViewChromeClient = inAppWebViewChromeClient;
        setWebChromeClient(inAppWebViewChromeClient);
        WebViewClient webViewClientCreateWebViewClient = createWebViewClient(this.inAppBrowserDelegate);
        if (webViewClientCreateWebViewClient instanceof InAppWebViewClientCompat) {
            InAppWebViewClientCompat inAppWebViewClientCompat = (InAppWebViewClientCompat) webViewClientCreateWebViewClient;
            this.inAppWebViewClientCompat = inAppWebViewClientCompat;
            setWebViewClient(inAppWebViewClientCompat);
        } else if (webViewClientCreateWebViewClient instanceof InAppWebViewClient) {
            InAppWebViewClient inAppWebViewClient = (InAppWebViewClient) webViewClientCreateWebViewClient;
            this.inAppWebViewClient = inAppWebViewClient;
            setWebViewClient(inAppWebViewClient);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29 && d.a("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = new InAppWebViewRenderProcessClient();
            this.inAppWebViewRenderProcessClient = inAppWebViewRenderProcessClient;
            w.i(this, inAppWebViewRenderProcessClient);
        }
        if (this.windowId == null || !d.a("DOCUMENT_START_SCRIPT")) {
            prepareAndAddUserScripts();
        }
        if (this.customSettings.useOnDownloadStart.booleanValue()) {
            setDownloadListener(new DownloadStartListener());
        }
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(this.customSettings.javaScriptEnabled.booleanValue());
        settings.setJavaScriptCanOpenWindowsAutomatically(this.customSettings.javaScriptCanOpenWindowsAutomatically.booleanValue());
        settings.setBuiltInZoomControls(this.customSettings.builtInZoomControls.booleanValue());
        settings.setDisplayZoomControls(this.customSettings.displayZoomControls.booleanValue());
        settings.setSupportMultipleWindows(this.customSettings.supportMultipleWindows.booleanValue());
        if (d.a("SAFE_BROWSING_ENABLE")) {
            boolean zBooleanValue = this.customSettings.safeBrowsingEnabled.booleanValue();
            C0431b c0431b = S0.w.f6287b;
            if (c0431b.a()) {
                settings.setSafeBrowsingEnabled(zBooleanValue);
            } else {
                if (!c0431b.b()) {
                    throw S0.w.a();
                }
                q.a(settings).q(zBooleanValue);
            }
        } else if (i7 >= 26) {
            settings.setSafeBrowsingEnabled(this.customSettings.safeBrowsingEnabled.booleanValue());
        }
        settings.setMediaPlaybackRequiresUserGesture(this.customSettings.mediaPlaybackRequiresUserGesture.booleanValue());
        settings.setDatabaseEnabled(this.customSettings.databaseEnabled.booleanValue());
        settings.setDomStorageEnabled(this.customSettings.domStorageEnabled.booleanValue());
        String str = this.customSettings.userAgent;
        if (str == null || str.isEmpty()) {
            settings.setUserAgentString(WebSettings.getDefaultUserAgent(getContext()));
        } else {
            settings.setUserAgentString(this.customSettings.userAgent);
        }
        String str2 = this.customSettings.applicationNameForUserAgent;
        if (str2 != null && !str2.isEmpty()) {
            String str3 = this.customSettings.userAgent;
            StringBuilder sbD = e.d((str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : this.customSettings.userAgent, " ");
            sbD.append(this.customSettings.applicationNameForUserAgent);
            settings.setUserAgentString(sbD.toString());
        }
        if (this.customSettings.clearCache.booleanValue()) {
            clearAllCache();
        } else if (this.customSettings.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, this.customSettings.thirdPartyCookiesEnabled.booleanValue());
        settings.setLoadWithOverviewMode(this.customSettings.loadWithOverviewMode.booleanValue());
        settings.setUseWideViewPort(this.customSettings.useWideViewPort.booleanValue());
        settings.setSupportZoom(this.customSettings.supportZoom.booleanValue());
        Integer num = this.customSettings.textZoom;
        if (num != null) {
            settings.setTextZoom(num.intValue());
        }
        setVerticalScrollBarEnabled(!this.customSettings.disableVerticalScroll.booleanValue() && this.customSettings.verticalScrollBarEnabled.booleanValue());
        setHorizontalScrollBarEnabled(!this.customSettings.disableHorizontalScroll.booleanValue() && this.customSettings.horizontalScrollBarEnabled.booleanValue());
        if (this.customSettings.transparentBackground.booleanValue()) {
            setBackgroundColor(0);
        }
        Integer num2 = this.customSettings.mixedContentMode;
        if (num2 != null) {
            settings.setMixedContentMode(num2.intValue());
        }
        settings.setAllowContentAccess(this.customSettings.allowContentAccess.booleanValue());
        settings.setAllowFileAccess(this.customSettings.allowFileAccess.booleanValue());
        settings.setAllowFileAccessFromFileURLs(this.customSettings.allowFileAccessFromFileURLs.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs(this.customSettings.allowUniversalAccessFromFileURLs.booleanValue());
        setCacheEnabled(this.customSettings.cacheEnabled.booleanValue());
        String str4 = this.customSettings.appCachePath;
        if (str4 != null && !str4.isEmpty() && this.customSettings.cacheEnabled.booleanValue()) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", this.customSettings.appCachePath);
        }
        settings.setBlockNetworkImage(this.customSettings.blockNetworkImage.booleanValue());
        settings.setBlockNetworkLoads(this.customSettings.blockNetworkLoads.booleanValue());
        Integer num3 = this.customSettings.cacheMode;
        if (num3 != null) {
            settings.setCacheMode(num3.intValue());
        }
        settings.setCursiveFontFamily(this.customSettings.cursiveFontFamily);
        settings.setDefaultFixedFontSize(this.customSettings.defaultFixedFontSize.intValue());
        settings.setDefaultFontSize(this.customSettings.defaultFontSize.intValue());
        settings.setDefaultTextEncodingName(this.customSettings.defaultTextEncodingName);
        if (this.customSettings.disabledActionModeMenuItems != null) {
            if (d.a("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                int iIntValue = this.customSettings.disabledActionModeMenuItems.intValue();
                S0.w.f6288c.getClass();
                settings.setDisabledActionModeMenuItems(iIntValue);
            } else {
                settings.setDisabledActionModeMenuItems(this.customSettings.disabledActionModeMenuItems.intValue());
            }
        }
        settings.setFantasyFontFamily(this.customSettings.fantasyFontFamily);
        settings.setFixedFontFamily(this.customSettings.fixedFontFamily);
        if (this.customSettings.forceDark != null) {
            if (d.a("FORCE_DARK")) {
                int iIntValue2 = this.customSettings.forceDark.intValue();
                C0431b c0431b2 = S0.w.f6274H;
                if (c0431b2.a()) {
                    settings.setForceDark(iIntValue2);
                } else {
                    if (!c0431b2.b()) {
                        throw S0.w.a();
                    }
                    q.a(settings).m(iIntValue2);
                }
            } else if (i7 >= 29) {
                settings.setForceDark(this.customSettings.forceDark.intValue());
            }
        }
        if (this.customSettings.forceDarkStrategy != null && d.a("FORCE_DARK_STRATEGY")) {
            try {
                int iIntValue3 = this.customSettings.forceDarkStrategy.intValue();
                if (!S0.w.f6275I.b()) {
                    throw S0.w.a();
                }
                q.a(settings).n(iIntValue3);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        settings.setGeolocationEnabled(this.customSettings.geolocationEnabled.booleanValue());
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
        if (layoutAlgorithm != null) {
            if (layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING)) {
                settings.setLayoutAlgorithm(this.customSettings.layoutAlgorithm);
            } else {
                settings.setLayoutAlgorithm(this.customSettings.layoutAlgorithm);
            }
        }
        settings.setLoadsImagesAutomatically(this.customSettings.loadsImagesAutomatically.booleanValue());
        settings.setMinimumFontSize(this.customSettings.minimumFontSize.intValue());
        settings.setMinimumLogicalFontSize(this.customSettings.minimumLogicalFontSize.intValue());
        setInitialScale(this.customSettings.initialScale.intValue());
        settings.setNeedInitialFocus(this.customSettings.needInitialFocus.booleanValue());
        if (d.a("OFF_SCREEN_PRERASTER")) {
            boolean zBooleanValue2 = this.customSettings.offscreenPreRaster.booleanValue();
            S0.w.f6286a.getClass();
            settings.setOffscreenPreRaster(zBooleanValue2);
        } else {
            settings.setOffscreenPreRaster(this.customSettings.offscreenPreRaster.booleanValue());
        }
        settings.setSansSerifFontFamily(this.customSettings.sansSerifFontFamily);
        settings.setSerifFontFamily(this.customSettings.serifFontFamily);
        settings.setStandardFontFamily(this.customSettings.standardFontFamily);
        Integer num4 = this.customSettings.preferredContentMode;
        if (num4 != null && num4.intValue() == PreferredContentModeOptionType.DESKTOP.toValue()) {
            setDesktopMode(true);
        }
        settings.setSaveFormData(this.customSettings.saveFormData.booleanValue());
        if (this.customSettings.incognito.booleanValue()) {
            setIncognito(true);
        }
        if (this.customSettings.useHybridComposition.booleanValue()) {
            if (this.customSettings.hardwareAcceleration.booleanValue()) {
                setLayerType(2, null);
            } else {
                setLayerType(0, null);
            }
        }
        setScrollBarStyle(this.customSettings.scrollBarStyle.intValue());
        InAppWebViewSettings inAppWebViewSettings = this.customSettings;
        Integer num5 = inAppWebViewSettings.scrollBarDefaultDelayBeforeFade;
        if (num5 != null) {
            setScrollBarDefaultDelayBeforeFade(num5.intValue());
        } else {
            inAppWebViewSettings.scrollBarDefaultDelayBeforeFade = Integer.valueOf(getScrollBarDefaultDelayBeforeFade());
        }
        setScrollbarFadingEnabled(this.customSettings.scrollbarFadingEnabled.booleanValue());
        InAppWebViewSettings inAppWebViewSettings2 = this.customSettings;
        Integer num6 = inAppWebViewSettings2.scrollBarFadeDuration;
        if (num6 != null) {
            setScrollBarFadeDuration(num6.intValue());
        } else {
            inAppWebViewSettings2.scrollBarFadeDuration = Integer.valueOf(getScrollBarFadeDuration());
        }
        setVerticalScrollbarPosition(this.customSettings.verticalScrollbarPosition.intValue());
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            if (this.customSettings.verticalScrollbarThumbColor != null) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarThumbColor)));
            }
            if (this.customSettings.verticalScrollbarTrackColor != null) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarTrackColor)));
            }
            if (this.customSettings.horizontalScrollbarThumbColor != null) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarThumbColor)));
            }
            if (this.customSettings.horizontalScrollbarTrackColor != null) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarTrackColor)));
            }
        }
        setOverScrollMode(this.customSettings.overScrollMode.intValue());
        Boolean bool = this.customSettings.networkAvailable;
        if (bool != null) {
            setNetworkAvailable(bool.booleanValue());
        }
        Map<String, Object> map = this.customSettings.rendererPriorityPolicy;
        if (map != null && !map.isEmpty() && i8 >= 26) {
            setRendererPriorityPolicy(((Integer) this.customSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        if (d.a("ALGORITHMIC_DARKENING") && i8 >= 29) {
            boolean zBooleanValue3 = this.customSettings.algorithmicDarkeningAllowed.booleanValue();
            if (!S0.w.f6271E.b()) {
                throw S0.w.a();
            }
            q.a(settings).k(zBooleanValue3);
        }
        if (d.a("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
            boolean zBooleanValue4 = this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue();
            if (!S0.w.f6280N.b()) {
                throw S0.w.a();
            }
            q.a(settings).l(zBooleanValue4);
        }
        if (this.customSettings.requestedWithHeaderOriginAllowList != null && d.a("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
            Set<String> set2 = this.customSettings.requestedWithHeaderOriginAllowList;
            if (!S0.w.f6282P.b()) {
                throw S0.w.a();
            }
            q.a(settings).p(set2);
        }
        this.contentBlockerHandler.getRuleList().clear();
        for (Map<String, Map<String, Object>> map2 : this.customSettings.contentBlockers) {
            this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap(map2.get("trigger")), ContentBlockerAction.fromMap(map2.get("action"))));
        }
        setFindListener(new WebView.FindListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.1
            @Override // android.webkit.WebView.FindListener
            public void onFindResultReceived(int i9, int i10, boolean z4) {
                FindInteractionChannelDelegate findInteractionChannelDelegate;
                FindInteractionController findInteractionController = InAppWebView.this.findInteractionController;
                if (findInteractionController != null && (findInteractionChannelDelegate = findInteractionController.channelDelegate) != null) {
                    findInteractionChannelDelegate.onFindResultReceived(i9, i10, z4);
                }
                WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                if (webViewChannelDelegate != null) {
                    webViewChannelDelegate.onFindResultReceived(i9, i10, z4);
                }
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                InAppWebView inAppWebView = InAppWebView.this;
                if (inAppWebView.floatingContextMenu != null) {
                    inAppWebView.hideContextMenu();
                }
                return super.onSingleTapUp(motionEvent);
            }
        });
        this.checkScrollStoppedTask = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.3
            @Override // java.lang.Runnable
            public void run() {
                int scrollY = InAppWebView.this.getScrollY();
                InAppWebView inAppWebView = InAppWebView.this;
                if (inAppWebView.initialPositionScrollStoppedTask - scrollY == 0) {
                    inAppWebView.onScrollStopped();
                    return;
                }
                inAppWebView.initialPositionScrollStoppedTask = inAppWebView.getScrollY();
                InAppWebView inAppWebView2 = InAppWebView.this;
                inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkScrollStoppedTask, inAppWebView2.newCheckScrollStoppedTask);
            }
        };
        if (!this.customSettings.useHybridComposition.booleanValue()) {
            this.checkContextMenuShouldBeClosedTask = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.4
                @Override // java.lang.Runnable
                public void run() {
                    InAppWebView inAppWebView = InAppWebView.this;
                    if (inAppWebView.floatingContextMenu != null) {
                        inAppWebView.evaluateJavascript(PluginScriptsUtil.CHECK_CONTEXT_MENU_SHOULD_BE_HIDDEN_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.4.1
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str5) {
                                if (str5 != null && !str5.equals("true")) {
                                    InAppWebView inAppWebView2 = InAppWebView.this;
                                    inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkContextMenuShouldBeClosedTask, inAppWebView2.newCheckContextMenuShouldBeClosedTaskTask);
                                } else {
                                    InAppWebView inAppWebView3 = InAppWebView.this;
                                    if (inAppWebView3.floatingContextMenu != null) {
                                        inAppWebView3.hideContextMenu();
                                    }
                                }
                            }
                        });
                    }
                }
            };
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.5
            float m_downX;
            float m_downY;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                InAppWebView.this.gestureDetector.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1) {
                    InAppWebView.this.checkScrollStoppedTask.run();
                }
                if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() && InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
                    return motionEvent.getAction() == 2;
                }
                if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() || InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.m_downX = motionEvent.getX();
                        this.m_downY = motionEvent.getY();
                    } else if (action == 1 || action == 2 || action == 3) {
                        if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue()) {
                            motionEvent.setLocation(this.m_downX, motionEvent.getY());
                        } else {
                            motionEvent.setLocation(motionEvent.getX(), this.m_downY);
                        }
                    }
                }
                return false;
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.6
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                HitTestResult hitTestResultFromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(InAppWebView.this.getHitTestResult());
                WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                if (webViewChannelDelegate == null) {
                    return false;
                }
                webViewChannelDelegate.onLongPressHitTestResult(hitTestResultFromWebViewHitTestResult);
                return false;
            }
        });
    }

    public void prepareAndAddUserScripts() {
        if (this.javaScriptBridgeEnabled) {
            UserContentController userContentController = this.userContentController;
            InAppWebViewSettings inAppWebViewSettings = this.customSettings;
            userContentController.addPluginScript(PromisePolyfillJS.PROMISE_POLYFILL_JS_PLUGIN_SCRIPT(inAppWebViewSettings.pluginScriptsOriginAllowList, inAppWebViewSettings.pluginScriptsForMainFrameOnly.booleanValue()));
            InAppWebViewSettings inAppWebViewSettings2 = this.customSettings;
            Set<String> set = inAppWebViewSettings2.javaScriptBridgeOriginAllowList;
            if (set == null) {
                set = inAppWebViewSettings2.pluginScriptsOriginAllowList;
            }
            Boolean bool = inAppWebViewSettings2.javaScriptBridgeForMainFrameOnly;
            if (bool == null) {
                bool = inAppWebViewSettings2.pluginScriptsForMainFrameOnly;
            }
            this.userContentController.addPluginScript(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_JS_PLUGIN_SCRIPT(this.expectedBridgeSecret, set, bool.booleanValue()));
            UserContentController userContentController2 = this.userContentController;
            InAppWebViewSettings inAppWebViewSettings3 = this.customSettings;
            userContentController2.addPluginScript(PrintJS.PRINT_JS_PLUGIN_SCRIPT(inAppWebViewSettings3.pluginScriptsOriginAllowList, inAppWebViewSettings3.pluginScriptsForMainFrameOnly.booleanValue()));
            this.userContentController.addPluginScript(OnWindowBlurEventJS.ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT(this.customSettings.pluginScriptsOriginAllowList));
            this.userContentController.addPluginScript(OnWindowFocusEventJS.ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT(this.customSettings.pluginScriptsOriginAllowList));
            this.interceptOnlyAsyncAjaxRequestsPluginScript = InterceptAjaxRequestJS.createInterceptOnlyAsyncAjaxRequestsPluginScript(this.customSettings.interceptOnlyAsyncAjaxRequests.booleanValue());
            if (this.customSettings.useShouldInterceptAjaxRequest.booleanValue()) {
                this.userContentController.addPluginScript(this.interceptOnlyAsyncAjaxRequestsPluginScript);
                UserContentController userContentController3 = this.userContentController;
                InAppWebViewSettings inAppWebViewSettings4 = this.customSettings;
                userContentController3.addPluginScript(InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT(inAppWebViewSettings4.pluginScriptsOriginAllowList, inAppWebViewSettings4.pluginScriptsForMainFrameOnly.booleanValue()));
            }
            if (this.customSettings.useShouldInterceptFetchRequest.booleanValue()) {
                UserContentController userContentController4 = this.userContentController;
                InAppWebViewSettings inAppWebViewSettings5 = this.customSettings;
                userContentController4.addPluginScript(InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT(inAppWebViewSettings5.pluginScriptsOriginAllowList, inAppWebViewSettings5.pluginScriptsForMainFrameOnly.booleanValue()));
            }
            if (this.customSettings.useOnLoadResource.booleanValue()) {
                UserContentController userContentController5 = this.userContentController;
                InAppWebViewSettings inAppWebViewSettings6 = this.customSettings;
                userContentController5.addPluginScript(OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT(inAppWebViewSettings6.pluginScriptsOriginAllowList, inAppWebViewSettings6.pluginScriptsForMainFrameOnly.booleanValue()));
            }
            if (!this.customSettings.useHybridComposition.booleanValue()) {
                UserContentController userContentController6 = this.userContentController;
                InAppWebViewSettings inAppWebViewSettings7 = this.customSettings;
                userContentController6.addPluginScript(PluginScriptsUtil.CHECK_GLOBAL_KEY_DOWN_EVENT_TO_HIDE_CONTEXT_MENU_JS_PLUGIN_SCRIPT(inAppWebViewSettings7.pluginScriptsOriginAllowList, inAppWebViewSettings7.pluginScriptsForMainFrameOnly.booleanValue()));
            }
        }
        this.userContentController.addUserOnlyScripts(this.initialUserOnlyScripts);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public String printCurrentPage(PrintJobSettings printJobSettings) {
        Activity activity;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null) {
            return null;
        }
        PrintManager printManager = (PrintManager) activity.getSystemService("print");
        if (printManager == null) {
            Log.e(LOG_TAG, "No PrintManager available");
            return null;
        }
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        String strI = k.i(new StringBuilder(), getTitle() != null ? getTitle() : getUrl(), " Document");
        if (printJobSettings != null) {
            String str = printJobSettings.jobName;
            if (str != null && !str.isEmpty()) {
                strI = printJobSettings.jobName;
            }
            Integer num = printJobSettings.orientation;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
                } else if (iIntValue == 1) {
                    builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
                }
            }
            MediaSizeExt mediaSizeExt = printJobSettings.mediaSize;
            if (mediaSizeExt != null) {
                builder.setMediaSize(mediaSizeExt.toMediaSize());
            }
            Integer num2 = printJobSettings.colorMode;
            if (num2 != null) {
                builder.setColorMode(num2.intValue());
            }
            Integer num3 = printJobSettings.duplexMode;
            if (num3 != null) {
                builder.setDuplexMode(num3.intValue());
            }
            ResolutionExt resolutionExt = printJobSettings.resolution;
            if (resolutionExt != null) {
                builder.setResolution(resolutionExt.toResolution());
            }
        }
        PrintJob printJobPrint = printManager.print(strI, createPrintDocumentAdapter(strI), builder.build());
        if (printJobSettings == null || !printJobSettings.handledByClient.booleanValue() || this.plugin.printJobManager == null) {
            return null;
        }
        String string = UUID.randomUUID().toString();
        PrintJobController printJobController = new PrintJobController(string, printJobPrint, printJobSettings, this.plugin);
        this.plugin.printJobManager.jobs.put(printJobController.id, printJobController);
        return string;
    }

    public ActionMode rebuildActionMode(final ActionMode actionMode, final ActionMode.Callback callback) {
        boolean z4;
        View view;
        if (!this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            onWindowFocusChanged(view.isFocused());
        }
        if (this.floatingContextMenu != null) {
            hideContextMenu();
            z4 = true;
        } else {
            z4 = false;
        }
        if (actionMode == null) {
            return null;
        }
        Menu menu = actionMode.getMenu();
        actionMode.hide(3000L);
        ArrayList<MenuItem> arrayList = new ArrayList();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        menu.clear();
        actionMode.finish();
        if (this.customSettings.disableContextMenu.booleanValue()) {
            return actionMode;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode, (ViewGroup) this, false);
        this.floatingContextMenu = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) ((HorizontalScrollView) linearLayout.getChildAt(0)).getChildAt(0);
        List arrayList2 = new ArrayList();
        ContextMenuSettings contextMenuSettings = new ContextMenuSettings();
        Map<String, Object> map = this.contextMenu;
        if (map != null) {
            arrayList2 = (List) map.get("menuItems");
            Map<String, Object> map2 = (Map) this.contextMenu.get("settings");
            if (map2 != null) {
                contextMenuSettings.parse2(map2);
            }
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        List<Map> list = arrayList2;
        Boolean bool = contextMenuSettings.hideDefaultSystemContextMenuItems;
        if (bool == null || !bool.booleanValue()) {
            for (final MenuItem menuItem : arrayList) {
                final int itemId = menuItem.getItemId();
                final String string = menuItem.getTitle().toString();
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, (ViewGroup) this, false);
                textView.setText(string);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.12
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        InAppWebView.this.hideContextMenu();
                        callback.onActionItemClicked(actionMode, menuItem);
                        WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                        if (webViewChannelDelegate != null) {
                            webViewChannelDelegate.onContextMenuActionItemClicked(itemId, string);
                        }
                    }
                });
                if (this.floatingContextMenu != null) {
                    linearLayout2.addView(textView);
                }
            }
        }
        for (Map map3 : list) {
            final int iIntValue = ((Integer) map3.get("id")).intValue();
            final String str = (String) map3.get("title");
            TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, (ViewGroup) this, false);
            textView2.setText(str);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    InAppWebView.this.hideContextMenu();
                    WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                    if (webViewChannelDelegate != null) {
                        webViewChannelDelegate.onContextMenuActionItemClicked(iIntValue, str);
                    }
                }
            });
            if (this.floatingContextMenu != null) {
                linearLayout2.addView(textView2);
            }
        }
        Point point = this.lastTouch;
        final int i8 = point != null ? point.x : 0;
        final int i9 = point != null ? point.y : 0;
        this.contextMenuPoint = new Point(i8, i9);
        LinearLayout linearLayout3 = this.floatingContextMenu;
        if (linearLayout3 != null) {
            linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.14
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    LinearLayout linearLayout4 = InAppWebView.this.floatingContextMenu;
                    if (linearLayout4 != null) {
                        linearLayout4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        if (InAppWebView.this.getSettings().getJavaScriptEnabled()) {
                            InAppWebView.this.onScrollStopped();
                        } else {
                            InAppWebView.this.onFloatingActionGlobalLayout(i8, i9);
                        }
                    }
                }
            });
            addView(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i8, i9));
            if (z4) {
                sendOnCreateContextMenuEvent();
            }
            Runnable runnable = this.checkContextMenuShouldBeClosedTask;
            if (runnable != null) {
                runnable.run();
            }
        }
        return actionMode;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> requestFocusNodeHref() {
        Message messageObtainMessage = mHandler.obtainMessage();
        requestFocusNodeHref(messageObtainMessage);
        Bundle bundlePeekData = messageObtainMessage.peekData();
        HashMap map = new HashMap();
        map.put("src", bundlePeekData.getString("src"));
        map.put("url", bundlePeekData.getString("url"));
        map.put("title", bundlePeekData.getString("title"));
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> requestImageRef() {
        Message messageObtainMessage = mHandler.obtainMessage();
        requestImageRef(messageObtainMessage);
        Bundle bundlePeekData = messageObtainMessage.peekData();
        HashMap map = new HashMap();
        map.put("url", bundlePeekData.getString("url"));
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void scrollBy(Integer num, Integer num2, Boolean bool) {
        if (!bool.booleanValue()) {
            scrollBy(num.intValue(), num2.intValue());
            return;
        }
        ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", num.intValue() + getScrollX()), PropertyValuesHolder.ofInt("scrollY", num2.intValue() + getScrollY())).setDuration(300L).start();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void scrollTo(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", num.intValue()), PropertyValuesHolder.ofInt("scrollY", num2.intValue())).setDuration(300L).start();
        } else {
            scrollTo(num.intValue(), num2.intValue());
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        ViewParent parent = getParent();
        if (parent instanceof PullToRefreshLayout) {
            ((PullToRefreshLayout) parent).setAlpha(f7);
        } else {
            super.setAlpha(f7);
        }
    }

    public void setCacheEnabled(boolean z4) {
        WebSettings settings = getSettings();
        if (!z4) {
            settings.setCacheMode(2);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
            return;
        }
        Context context = getContext();
        if (context != null) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", context.getCacheDir().getAbsolutePath());
            settings.setCacheMode(-1);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setChannelDelegate(WebViewChannelDelegate webViewChannelDelegate) {
        this.channelDelegate = webViewChannelDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setContextMenu(Map<String, Object> map) {
        this.contextMenu = map;
    }

    public void setDesktopMode(boolean z4) {
        WebSettings settings = getSettings();
        settings.setUserAgentString(z4 ? settings.getUserAgentString().replace("Mobile", "eliboM").replace("Android", "diordnA") : settings.getUserAgentString().replace("eliboM", "Mobile").replace("diordnA", "Android"));
        settings.setUseWideViewPort(z4);
        settings.setLoadWithOverviewMode(z4);
        settings.setSupportZoom(z4);
        settings.setBuiltInZoomControls(z4);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setInAppBrowserDelegate(InAppBrowserDelegate inAppBrowserDelegate) {
        this.inAppBrowserDelegate = inAppBrowserDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setInFullscreen(boolean z4) {
        this.inFullscreen = z4;
    }

    public void setIncognito(boolean z4) {
        WebSettings settings = getSettings();
        if (!z4) {
            settings.setCacheMode(-1);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
            settings.setSavePassword(true);
            settings.setSaveFormData(true);
            return;
        }
        CookieManager.getInstance().removeAllCookies(null);
        settings.setCacheMode(2);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
        clearHistory();
        clearCache(true);
        clearFormData();
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setPlugin(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setSettings(InAppWebViewSettings inAppWebViewSettings, HashMap<String, Object> map) {
        Map<String, Object> map2;
        Integer num;
        Integer num2;
        Integer num3;
        String str;
        Integer num4;
        Integer num5;
        WebSettings settings = getSettings();
        if (map.get("javaScriptEnabled") != null) {
            Boolean bool = this.customSettings.javaScriptEnabled;
            Boolean bool2 = inAppWebViewSettings.javaScriptEnabled;
            if (bool != bool2) {
                settings.setJavaScriptEnabled(bool2.booleanValue());
            }
        }
        if (map.get("useShouldInterceptAjaxRequest") != null && this.customSettings.useShouldInterceptAjaxRequest != inAppWebViewSettings.useShouldInterceptAjaxRequest) {
            String strFLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE = InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE();
            boolean zBooleanValue = inAppWebViewSettings.useShouldInterceptAjaxRequest.booleanValue();
            InAppWebViewSettings inAppWebViewSettings2 = this.customSettings;
            enablePluginScriptAtRuntime(strFLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE, zBooleanValue, InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT(inAppWebViewSettings2.pluginScriptsOriginAllowList, inAppWebViewSettings2.pluginScriptsForMainFrameOnly.booleanValue()));
        }
        if (map.get("interceptOnlyAsyncAjaxRequests") != null && this.customSettings.interceptOnlyAsyncAjaxRequests != inAppWebViewSettings.interceptOnlyAsyncAjaxRequests) {
            enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_INTERCEPT_ONLY_ASYNC_AJAX_REQUESTS_JS_SOURCE(), inAppWebViewSettings.interceptOnlyAsyncAjaxRequests.booleanValue(), this.interceptOnlyAsyncAjaxRequestsPluginScript);
        }
        if (map.get("useShouldInterceptFetchRequest") != null && this.customSettings.useShouldInterceptFetchRequest != inAppWebViewSettings.useShouldInterceptFetchRequest) {
            String strFLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE = InterceptFetchRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE();
            boolean zBooleanValue2 = inAppWebViewSettings.useShouldInterceptFetchRequest.booleanValue();
            InAppWebViewSettings inAppWebViewSettings3 = this.customSettings;
            enablePluginScriptAtRuntime(strFLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE, zBooleanValue2, InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT(inAppWebViewSettings3.pluginScriptsOriginAllowList, inAppWebViewSettings3.pluginScriptsForMainFrameOnly.booleanValue()));
        }
        if (map.get("useOnLoadResource") != null && this.customSettings.useOnLoadResource != inAppWebViewSettings.useOnLoadResource) {
            String strFLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE = OnLoadResourceJS.FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE();
            boolean zBooleanValue3 = inAppWebViewSettings.useOnLoadResource.booleanValue();
            InAppWebViewSettings inAppWebViewSettings4 = this.customSettings;
            enablePluginScriptAtRuntime(strFLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE, zBooleanValue3, OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT(inAppWebViewSettings4.pluginScriptsOriginAllowList, inAppWebViewSettings4.pluginScriptsForMainFrameOnly.booleanValue()));
        }
        if (map.get("javaScriptCanOpenWindowsAutomatically") != null) {
            Boolean bool3 = this.customSettings.javaScriptCanOpenWindowsAutomatically;
            Boolean bool4 = inAppWebViewSettings.javaScriptCanOpenWindowsAutomatically;
            if (bool3 != bool4) {
                settings.setJavaScriptCanOpenWindowsAutomatically(bool4.booleanValue());
            }
        }
        if (map.get("builtInZoomControls") != null) {
            Boolean bool5 = this.customSettings.builtInZoomControls;
            Boolean bool6 = inAppWebViewSettings.builtInZoomControls;
            if (bool5 != bool6) {
                settings.setBuiltInZoomControls(bool6.booleanValue());
            }
        }
        if (map.get("displayZoomControls") != null) {
            Boolean bool7 = this.customSettings.displayZoomControls;
            Boolean bool8 = inAppWebViewSettings.displayZoomControls;
            if (bool7 != bool8) {
                settings.setDisplayZoomControls(bool8.booleanValue());
            }
        }
        if (map.get("safeBrowsingEnabled") != null && this.customSettings.safeBrowsingEnabled != inAppWebViewSettings.safeBrowsingEnabled) {
            if (d.a("SAFE_BROWSING_ENABLE")) {
                boolean zBooleanValue4 = inAppWebViewSettings.safeBrowsingEnabled.booleanValue();
                C0431b c0431b = S0.w.f6287b;
                if (c0431b.a()) {
                    settings.setSafeBrowsingEnabled(zBooleanValue4);
                } else {
                    if (!c0431b.b()) {
                        throw S0.w.a();
                    }
                    q.a(settings).q(zBooleanValue4);
                }
            } else if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
            }
        }
        if (map.get("mediaPlaybackRequiresUserGesture") != null) {
            Boolean bool9 = this.customSettings.mediaPlaybackRequiresUserGesture;
            Boolean bool10 = inAppWebViewSettings.mediaPlaybackRequiresUserGesture;
            if (bool9 != bool10) {
                settings.setMediaPlaybackRequiresUserGesture(bool10.booleanValue());
            }
        }
        if (map.get("databaseEnabled") != null) {
            Boolean bool11 = this.customSettings.databaseEnabled;
            Boolean bool12 = inAppWebViewSettings.databaseEnabled;
            if (bool11 != bool12) {
                settings.setDatabaseEnabled(bool12.booleanValue());
            }
        }
        if (map.get("domStorageEnabled") != null) {
            Boolean bool13 = this.customSettings.domStorageEnabled;
            Boolean bool14 = inAppWebViewSettings.domStorageEnabled;
            if (bool13 != bool14) {
                settings.setDomStorageEnabled(bool14.booleanValue());
            }
        }
        if (map.get("userAgent") != null && !this.customSettings.userAgent.equals(inAppWebViewSettings.userAgent) && !inAppWebViewSettings.userAgent.isEmpty()) {
            settings.setUserAgentString(inAppWebViewSettings.userAgent);
        }
        if (map.get("applicationNameForUserAgent") != null && !this.customSettings.applicationNameForUserAgent.equals(inAppWebViewSettings.applicationNameForUserAgent) && !inAppWebViewSettings.applicationNameForUserAgent.isEmpty()) {
            String str2 = inAppWebViewSettings.userAgent;
            StringBuilder sbD = e.d((str2 == null || str2.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : inAppWebViewSettings.userAgent, " ");
            sbD.append(this.customSettings.applicationNameForUserAgent);
            settings.setUserAgentString(sbD.toString());
        }
        if (map.get("clearCache") != null && inAppWebViewSettings.clearCache.booleanValue()) {
            clearAllCache();
        } else if (map.get("clearSessionCache") != null && inAppWebViewSettings.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (map.get("thirdPartyCookiesEnabled") != null && this.customSettings.thirdPartyCookiesEnabled != inAppWebViewSettings.thirdPartyCookiesEnabled) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, inAppWebViewSettings.thirdPartyCookiesEnabled.booleanValue());
        }
        if (map.get("useWideViewPort") != null) {
            Boolean bool15 = this.customSettings.useWideViewPort;
            Boolean bool16 = inAppWebViewSettings.useWideViewPort;
            if (bool15 != bool16) {
                settings.setUseWideViewPort(bool16.booleanValue());
            }
        }
        if (map.get("supportZoom") != null) {
            Boolean bool17 = this.customSettings.supportZoom;
            Boolean bool18 = inAppWebViewSettings.supportZoom;
            if (bool17 != bool18) {
                settings.setSupportZoom(bool18.booleanValue());
            }
        }
        if (map.get("textZoom") != null && ((num5 = this.customSettings.textZoom) == null || !num5.equals(inAppWebViewSettings.textZoom))) {
            settings.setTextZoom(inAppWebViewSettings.textZoom.intValue());
        }
        if (map.get("verticalScrollBarEnabled") != null) {
            Boolean bool19 = this.customSettings.verticalScrollBarEnabled;
            Boolean bool20 = inAppWebViewSettings.verticalScrollBarEnabled;
            if (bool19 != bool20) {
                setVerticalScrollBarEnabled(bool20.booleanValue());
            }
        }
        if (map.get("horizontalScrollBarEnabled") != null) {
            Boolean bool21 = this.customSettings.horizontalScrollBarEnabled;
            Boolean bool22 = inAppWebViewSettings.horizontalScrollBarEnabled;
            if (bool21 != bool22) {
                setHorizontalScrollBarEnabled(bool22.booleanValue());
            }
        }
        boolean z4 = false;
        if (map.get("transparentBackground") != null) {
            Boolean bool23 = this.customSettings.transparentBackground;
            Boolean bool24 = inAppWebViewSettings.transparentBackground;
            if (bool23 != bool24) {
                if (bool24.booleanValue()) {
                    setBackgroundColor(0);
                } else {
                    setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (map.get("mixedContentMode") != null && ((num4 = this.customSettings.mixedContentMode) == null || !num4.equals(inAppWebViewSettings.mixedContentMode))) {
            settings.setMixedContentMode(inAppWebViewSettings.mixedContentMode.intValue());
        }
        if (map.get("supportMultipleWindows") != null) {
            Boolean bool25 = this.customSettings.supportMultipleWindows;
            Boolean bool26 = inAppWebViewSettings.supportMultipleWindows;
            if (bool25 != bool26) {
                settings.setSupportMultipleWindows(bool26.booleanValue());
            }
        }
        if (map.get("useOnDownloadStart") != null) {
            Boolean bool27 = this.customSettings.useOnDownloadStart;
            Boolean bool28 = inAppWebViewSettings.useOnDownloadStart;
            if (bool27 != bool28) {
                if (bool28.booleanValue()) {
                    setDownloadListener(new DownloadStartListener());
                } else {
                    setDownloadListener(null);
                }
            }
        }
        if (map.get("allowContentAccess") != null) {
            Boolean bool29 = this.customSettings.allowContentAccess;
            Boolean bool30 = inAppWebViewSettings.allowContentAccess;
            if (bool29 != bool30) {
                settings.setAllowContentAccess(bool30.booleanValue());
            }
        }
        if (map.get("allowFileAccess") != null) {
            Boolean bool31 = this.customSettings.allowFileAccess;
            Boolean bool32 = inAppWebViewSettings.allowFileAccess;
            if (bool31 != bool32) {
                settings.setAllowFileAccess(bool32.booleanValue());
            }
        }
        if (map.get("allowFileAccessFromFileURLs") != null) {
            Boolean bool33 = this.customSettings.allowFileAccessFromFileURLs;
            Boolean bool34 = inAppWebViewSettings.allowFileAccessFromFileURLs;
            if (bool33 != bool34) {
                settings.setAllowFileAccessFromFileURLs(bool34.booleanValue());
            }
        }
        if (map.get("allowUniversalAccessFromFileURLs") != null) {
            Boolean bool35 = this.customSettings.allowUniversalAccessFromFileURLs;
            Boolean bool36 = inAppWebViewSettings.allowUniversalAccessFromFileURLs;
            if (bool35 != bool36) {
                settings.setAllowUniversalAccessFromFileURLs(bool36.booleanValue());
            }
        }
        if (map.get("cacheEnabled") != null) {
            Boolean bool37 = this.customSettings.cacheEnabled;
            Boolean bool38 = inAppWebViewSettings.cacheEnabled;
            if (bool37 != bool38) {
                setCacheEnabled(bool38.booleanValue());
            }
        }
        if (map.get("appCachePath") != null && ((str = this.customSettings.appCachePath) == null || !str.equals(inAppWebViewSettings.appCachePath))) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", inAppWebViewSettings.appCachePath);
        }
        if (map.get("blockNetworkImage") != null) {
            Boolean bool39 = this.customSettings.blockNetworkImage;
            Boolean bool40 = inAppWebViewSettings.blockNetworkImage;
            if (bool39 != bool40) {
                settings.setBlockNetworkImage(bool40.booleanValue());
            }
        }
        if (map.get("blockNetworkLoads") != null) {
            Boolean bool41 = this.customSettings.blockNetworkLoads;
            Boolean bool42 = inAppWebViewSettings.blockNetworkLoads;
            if (bool41 != bool42) {
                settings.setBlockNetworkLoads(bool42.booleanValue());
            }
        }
        if (map.get("cacheMode") != null && !this.customSettings.cacheMode.equals(inAppWebViewSettings.cacheMode)) {
            settings.setCacheMode(inAppWebViewSettings.cacheMode.intValue());
        }
        if (map.get("cursiveFontFamily") != null && !this.customSettings.cursiveFontFamily.equals(inAppWebViewSettings.cursiveFontFamily)) {
            settings.setCursiveFontFamily(inAppWebViewSettings.cursiveFontFamily);
        }
        if (map.get("defaultFixedFontSize") != null && !this.customSettings.defaultFixedFontSize.equals(inAppWebViewSettings.defaultFixedFontSize)) {
            settings.setDefaultFixedFontSize(inAppWebViewSettings.defaultFixedFontSize.intValue());
        }
        if (map.get("defaultFontSize") != null && !this.customSettings.defaultFontSize.equals(inAppWebViewSettings.defaultFontSize)) {
            settings.setDefaultFontSize(inAppWebViewSettings.defaultFontSize.intValue());
        }
        if (map.get("defaultTextEncodingName") != null && !this.customSettings.defaultTextEncodingName.equals(inAppWebViewSettings.defaultTextEncodingName)) {
            settings.setDefaultTextEncodingName(inAppWebViewSettings.defaultTextEncodingName);
        }
        if (map.get("disabledActionModeMenuItems") != null && ((num3 = this.customSettings.disabledActionModeMenuItems) == null || !num3.equals(inAppWebViewSettings.disabledActionModeMenuItems))) {
            if (d.a("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                int iIntValue = inAppWebViewSettings.disabledActionModeMenuItems.intValue();
                S0.w.f6288c.getClass();
                settings.setDisabledActionModeMenuItems(iIntValue);
            } else {
                settings.setDisabledActionModeMenuItems(inAppWebViewSettings.disabledActionModeMenuItems.intValue());
            }
        }
        if (map.get("fantasyFontFamily") != null && !this.customSettings.fantasyFontFamily.equals(inAppWebViewSettings.fantasyFontFamily)) {
            settings.setFantasyFontFamily(inAppWebViewSettings.fantasyFontFamily);
        }
        if (map.get("fixedFontFamily") != null && !this.customSettings.fixedFontFamily.equals(inAppWebViewSettings.fixedFontFamily)) {
            settings.setFixedFontFamily(inAppWebViewSettings.fixedFontFamily);
        }
        if (map.get("forceDark") != null && !this.customSettings.forceDark.equals(inAppWebViewSettings.forceDark)) {
            if (d.a("FORCE_DARK")) {
                int iIntValue2 = inAppWebViewSettings.forceDark.intValue();
                C0431b c0431b2 = S0.w.f6274H;
                if (c0431b2.a()) {
                    settings.setForceDark(iIntValue2);
                } else {
                    if (!c0431b2.b()) {
                        throw S0.w.a();
                    }
                    q.a(settings).m(iIntValue2);
                }
            } else if (i7 >= 29) {
                settings.setForceDark(inAppWebViewSettings.forceDark.intValue());
            }
        }
        if (map.get("forceDarkStrategy") != null && !this.customSettings.forceDarkStrategy.equals(inAppWebViewSettings.forceDarkStrategy) && d.a("FORCE_DARK_STRATEGY")) {
            try {
                int iIntValue3 = inAppWebViewSettings.forceDarkStrategy.intValue();
                if (!S0.w.f6275I.b()) {
                    throw S0.w.a();
                }
                q.a(settings).n(iIntValue3);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        if (map.get("geolocationEnabled") != null) {
            Boolean bool43 = this.customSettings.geolocationEnabled;
            Boolean bool44 = inAppWebViewSettings.geolocationEnabled;
            if (bool43 != bool44) {
                settings.setGeolocationEnabled(bool44.booleanValue());
            }
        }
        if (map.get("layoutAlgorithm") != null) {
            WebSettings.LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
            WebSettings.LayoutAlgorithm layoutAlgorithm2 = inAppWebViewSettings.layoutAlgorithm;
            if (layoutAlgorithm != layoutAlgorithm2) {
                if (layoutAlgorithm2.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING)) {
                    settings.setLayoutAlgorithm(inAppWebViewSettings.layoutAlgorithm);
                } else {
                    settings.setLayoutAlgorithm(inAppWebViewSettings.layoutAlgorithm);
                }
            }
        }
        if (map.get("loadWithOverviewMode") != null) {
            Boolean bool45 = this.customSettings.loadWithOverviewMode;
            Boolean bool46 = inAppWebViewSettings.loadWithOverviewMode;
            if (bool45 != bool46) {
                settings.setLoadWithOverviewMode(bool46.booleanValue());
            }
        }
        if (map.get("loadsImagesAutomatically") != null) {
            Boolean bool47 = this.customSettings.loadsImagesAutomatically;
            Boolean bool48 = inAppWebViewSettings.loadsImagesAutomatically;
            if (bool47 != bool48) {
                settings.setLoadsImagesAutomatically(bool48.booleanValue());
            }
        }
        if (map.get("minimumFontSize") != null && !this.customSettings.minimumFontSize.equals(inAppWebViewSettings.minimumFontSize)) {
            settings.setMinimumFontSize(inAppWebViewSettings.minimumFontSize.intValue());
        }
        if (map.get("minimumLogicalFontSize") != null && !this.customSettings.minimumLogicalFontSize.equals(inAppWebViewSettings.minimumLogicalFontSize)) {
            settings.setMinimumLogicalFontSize(inAppWebViewSettings.minimumLogicalFontSize.intValue());
        }
        if (map.get("initialScale") != null && !this.customSettings.initialScale.equals(inAppWebViewSettings.initialScale)) {
            setInitialScale(inAppWebViewSettings.initialScale.intValue());
        }
        if (map.get("needInitialFocus") != null) {
            Boolean bool49 = this.customSettings.needInitialFocus;
            Boolean bool50 = inAppWebViewSettings.needInitialFocus;
            if (bool49 != bool50) {
                settings.setNeedInitialFocus(bool50.booleanValue());
            }
        }
        if (map.get("offscreenPreRaster") != null && this.customSettings.offscreenPreRaster != inAppWebViewSettings.offscreenPreRaster) {
            if (d.a("OFF_SCREEN_PRERASTER")) {
                boolean zBooleanValue5 = inAppWebViewSettings.offscreenPreRaster.booleanValue();
                S0.w.f6286a.getClass();
                settings.setOffscreenPreRaster(zBooleanValue5);
            } else {
                settings.setOffscreenPreRaster(inAppWebViewSettings.offscreenPreRaster.booleanValue());
            }
        }
        if (map.get("sansSerifFontFamily") != null && !this.customSettings.sansSerifFontFamily.equals(inAppWebViewSettings.sansSerifFontFamily)) {
            settings.setSansSerifFontFamily(inAppWebViewSettings.sansSerifFontFamily);
        }
        if (map.get("serifFontFamily") != null && !this.customSettings.serifFontFamily.equals(inAppWebViewSettings.serifFontFamily)) {
            settings.setSerifFontFamily(inAppWebViewSettings.serifFontFamily);
        }
        if (map.get("standardFontFamily") != null && !this.customSettings.standardFontFamily.equals(inAppWebViewSettings.standardFontFamily)) {
            settings.setStandardFontFamily(inAppWebViewSettings.standardFontFamily);
        }
        if (map.get("preferredContentMode") != null && !this.customSettings.preferredContentMode.equals(inAppWebViewSettings.preferredContentMode)) {
            int i8 = AnonymousClass21.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.fromValue(inAppWebViewSettings.preferredContentMode.intValue()).ordinal()];
            if (i8 == 1) {
                setDesktopMode(true);
            } else if (i8 == 2 || i8 == 3) {
                setDesktopMode(false);
            }
        }
        if (map.get("saveFormData") != null) {
            Boolean bool51 = this.customSettings.saveFormData;
            Boolean bool52 = inAppWebViewSettings.saveFormData;
            if (bool51 != bool52) {
                settings.setSaveFormData(bool52.booleanValue());
            }
        }
        if (map.get("incognito") != null) {
            Boolean bool53 = this.customSettings.incognito;
            Boolean bool54 = inAppWebViewSettings.incognito;
            if (bool53 != bool54) {
                setIncognito(bool54.booleanValue());
            }
        }
        if (this.customSettings.useHybridComposition.booleanValue() && map.get("hardwareAcceleration") != null) {
            Boolean bool55 = this.customSettings.hardwareAcceleration;
            Boolean bool56 = inAppWebViewSettings.hardwareAcceleration;
            if (bool55 != bool56) {
                if (bool56.booleanValue()) {
                    setLayerType(2, null);
                } else {
                    setLayerType(0, null);
                }
            }
        }
        if (inAppWebViewSettings.contentBlockers != null) {
            this.contentBlockerHandler.getRuleList().clear();
            for (Map<String, Map<String, Object>> map3 : inAppWebViewSettings.contentBlockers) {
                this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap(map3.get("trigger")), ContentBlockerAction.fromMap(map3.get("action"))));
            }
        }
        if (map.get("scrollBarStyle") != null && !this.customSettings.scrollBarStyle.equals(inAppWebViewSettings.scrollBarStyle)) {
            setScrollBarStyle(inAppWebViewSettings.scrollBarStyle.intValue());
        }
        if (map.get("scrollBarDefaultDelayBeforeFade") != null && ((num2 = this.customSettings.scrollBarDefaultDelayBeforeFade) == null || !num2.equals(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade))) {
            setScrollBarDefaultDelayBeforeFade(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade.intValue());
        }
        if (map.get("scrollbarFadingEnabled") != null && !this.customSettings.scrollbarFadingEnabled.equals(inAppWebViewSettings.scrollbarFadingEnabled)) {
            setScrollbarFadingEnabled(inAppWebViewSettings.scrollbarFadingEnabled.booleanValue());
        }
        if (map.get("scrollBarFadeDuration") != null && ((num = this.customSettings.scrollBarFadeDuration) == null || !num.equals(inAppWebViewSettings.scrollBarFadeDuration))) {
            setScrollBarFadeDuration(inAppWebViewSettings.scrollBarFadeDuration.intValue());
        }
        if (map.get("verticalScrollbarPosition") != null && !this.customSettings.verticalScrollbarPosition.equals(inAppWebViewSettings.verticalScrollbarPosition)) {
            setVerticalScrollbarPosition(inAppWebViewSettings.verticalScrollbarPosition.intValue());
        }
        if (map.get("disableVerticalScroll") != null) {
            Boolean bool57 = this.customSettings.disableVerticalScroll;
            Boolean bool58 = inAppWebViewSettings.disableVerticalScroll;
            if (bool57 != bool58) {
                setVerticalScrollBarEnabled(!bool58.booleanValue() && inAppWebViewSettings.verticalScrollBarEnabled.booleanValue());
            }
        }
        if (map.get("disableHorizontalScroll") != null) {
            Boolean bool59 = this.customSettings.disableHorizontalScroll;
            Boolean bool60 = inAppWebViewSettings.disableHorizontalScroll;
            if (bool59 != bool60) {
                if (!bool60.booleanValue() && inAppWebViewSettings.horizontalScrollBarEnabled.booleanValue()) {
                    z4 = true;
                }
                setHorizontalScrollBarEnabled(z4);
            }
        }
        if (map.get("overScrollMode") != null && !this.customSettings.overScrollMode.equals(inAppWebViewSettings.overScrollMode)) {
            setOverScrollMode(inAppWebViewSettings.overScrollMode.intValue());
        }
        if (map.get("networkAvailable") != null) {
            Boolean bool61 = this.customSettings.networkAvailable;
            Boolean bool62 = inAppWebViewSettings.networkAvailable;
            if (bool61 != bool62) {
                setNetworkAvailable(bool62.booleanValue());
            }
        }
        if (map.get("rendererPriorityPolicy") != null && (((map2 = this.customSettings.rendererPriorityPolicy) == null || map2.get("rendererRequestedPriority") != inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority") || this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible") != inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")) && Build.VERSION.SDK_INT >= 26)) {
            setRendererPriorityPolicy(((Integer) inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            if (map.get("verticalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarThumbColor, inAppWebViewSettings.verticalScrollbarThumbColor)) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarThumbColor)));
            }
            if (map.get("verticalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarTrackColor, inAppWebViewSettings.verticalScrollbarTrackColor)) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarTrackColor)));
            }
            if (map.get("horizontalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarThumbColor, inAppWebViewSettings.horizontalScrollbarThumbColor)) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarThumbColor)));
            }
            if (map.get("horizontalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarTrackColor, inAppWebViewSettings.horizontalScrollbarTrackColor)) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarTrackColor)));
            }
        }
        if (map.get("algorithmicDarkeningAllowed") != null && !Util.objEquals(this.customSettings.algorithmicDarkeningAllowed, inAppWebViewSettings.algorithmicDarkeningAllowed) && d.a("ALGORITHMIC_DARKENING") && i9 >= 29) {
            boolean zBooleanValue6 = inAppWebViewSettings.algorithmicDarkeningAllowed.booleanValue();
            if (!S0.w.f6271E.b()) {
                throw S0.w.a();
            }
            q.a(settings).k(zBooleanValue6);
        }
        if (map.get("enterpriseAuthenticationAppLinkPolicyEnabled") != null && !Util.objEquals(this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled, inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled) && d.a("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
            boolean zBooleanValue7 = inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue();
            if (!S0.w.f6280N.b()) {
                throw S0.w.a();
            }
            q.a(settings).l(zBooleanValue7);
        }
        if (map.get("requestedWithHeaderOriginAllowList") != null && !Util.objEquals(this.customSettings.requestedWithHeaderOriginAllowList, inAppWebViewSettings.requestedWithHeaderOriginAllowList) && d.a("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
            Set<String> set = inAppWebViewSettings.requestedWithHeaderOriginAllowList;
            if (!S0.w.f6282P.b()) {
                throw S0.w.a();
            }
            q.a(settings).p(set);
        }
        if (this.plugin != null) {
            WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
            if (webViewAssetLoaderExt != null) {
                webViewAssetLoaderExt.dispose();
            }
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, this.plugin, getContext());
        }
        this.customSettings = inAppWebViewSettings;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setUserContentController(UserContentController userContentController) {
        this.userContentController = userContentController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setWebMessageChannels(Map<String, WebMessageChannel> map) {
        this.webMessageChannels = map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void showInputMethod() {
        Activity activity;
        InputMethodManager inputMethodManager;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null || (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(this, 0);
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        Map<String, Object> map;
        return (this.customSettings.useHybridComposition.booleanValue() && !this.customSettings.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) ? super.startActionMode(callback) : rebuildActionMode(super.startActionMode(callback), callback);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void takeScreenshot(final Map<String, Object> map, final r rVar) {
        final float pixelDensity = Util.getPixelDensity(getContext());
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.8
            @Override // java.lang.Runnable
            public void run() {
                int iIntValue;
                Double d7;
                try {
                    int measuredWidth = InAppWebView.this.getMeasuredWidth();
                    int measuredHeight = InAppWebView.this.getMeasuredHeight();
                    int scrollX = InAppWebView.this.getScrollX();
                    int scrollY = InAppWebView.this.getScrollY();
                    Bitmap.CompressFormat compressFormatValueOf = Bitmap.CompressFormat.PNG;
                    Map map2 = map;
                    if (map2 != null) {
                        Map map3 = (Map) map2.get("rect");
                        if (map3 != null) {
                            scrollX = (int) Math.floor((((Double) map3.get("x")).doubleValue() * ((double) pixelDensity)) + 0.5d);
                            scrollY = (int) Math.floor((((Double) map3.get("y")).doubleValue() * ((double) pixelDensity)) + 0.5d);
                            measuredWidth = (int) Math.floor((((Double) map3.get("width")).doubleValue() * ((double) pixelDensity)) + 0.5d);
                            measuredHeight = (int) Math.floor((((Double) map3.get("height")).doubleValue() * ((double) pixelDensity)) + 0.5d);
                        }
                        int i7 = measuredWidth;
                        try {
                            compressFormatValueOf = Bitmap.CompressFormat.valueOf((String) map.get("compressFormat"));
                        } catch (IllegalArgumentException e7) {
                            Log.e(InAppWebView.LOG_TAG, "", e7);
                        }
                        iIntValue = ((Integer) map.get("quality")).intValue();
                        measuredWidth = i7;
                    } else {
                        iIntValue = 100;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.translate(-scrollX, -scrollY);
                    InAppWebView.this.draw(canvas);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Map map4 = map;
                    if (map4 != null && (d7 = (Double) map4.get("snapshotWidth")) != null) {
                        int iFloor = (int) Math.floor((d7.doubleValue() * ((double) pixelDensity)) + 0.5d);
                        bitmapCreateBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, iFloor, (int) (iFloor / (bitmapCreateBitmap.getWidth() / bitmapCreateBitmap.getHeight())), true);
                    }
                    Bitmap bitmap = bitmapCreateBitmap;
                    if (!bitmap.compress(compressFormatValueOf, iIntValue, byteArrayOutputStream)) {
                        Log.e(InAppWebView.LOG_TAG, "Screenshot cannot be compressed using compressFormat " + compressFormatValueOf.name() + " with quality " + iIntValue, null);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e8) {
                        Log.e(InAppWebView.LOG_TAG, "", e8);
                    }
                    bitmap.recycle();
                    rVar.success(byteArrayOutputStream.toByteArray());
                } catch (IllegalArgumentException e9) {
                    Log.e(InAppWebView.LOG_TAG, "", e9);
                    rVar.success(null);
                }
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getZoomScale(ValueCallback<Float> valueCallback) {
        valueCallback.onReceiveValue(Float.valueOf(this.zoomScale));
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i7) {
        Map<String, Object> map;
        if (this.customSettings.useHybridComposition.booleanValue() && !this.customSettings.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) {
            return super.startActionMode(callback, i7);
        }
        return rebuildActionMode(super.startActionMode(callback, i7), callback);
    }

    public InAppWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.expectedBridgeSecret = UUID.randomUUID().toString();
        this.javaScriptBridgeEnabled = true;
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.expectedBridgeSecret = UUID.randomUUID().toString();
        this.javaScriptBridgeEnabled = true;
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Object obj, Integer num, InAppWebViewSettings inAppWebViewSettings, Map<String, Object> map, View view, List<UserScript> list) {
        super(context, view, inAppWebViewSettings.useHybridComposition);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.expectedBridgeSecret = UUID.randomUUID().toString();
        this.javaScriptBridgeEnabled = true;
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
        this.plugin = inAppWebViewFlutterPlugin;
        this.id = obj;
        this.channelDelegate = new WebViewChannelDelegate(this, new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME_PREFIX + obj));
        this.windowId = num;
        this.customSettings = inAppWebViewSettings;
        this.contextMenu = map;
        this.initialUserOnlyScripts = list;
        Activity activity = inAppWebViewFlutterPlugin.activity;
        if (activity != null) {
            activity.registerForContextMenu(this);
        }
    }
}

package com.pichillilorenzo.flutter_inappwebview_android.webview;

import A5.o;
import A5.r;
import A5.s;
import R0.d;
import R0.w;
import S0.C0431b;
import S0.y;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class InAppWebViewManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "InAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
    public final Map<String, FlutterWebView> keepAliveWebViews;
    public InAppWebViewFlutterPlugin plugin;
    public int windowAutoincrementId;
    public final Map<Integer, Message> windowWebViewMessages;

    public InAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new s(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.keepAliveWebViews = new HashMap();
        this.windowWebViewMessages = new HashMap();
        this.windowAutoincrementId = 0;
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void clearAllCache(Context context, boolean z4) {
        WebView webView = new WebView(context);
        webView.clearCache(z4);
        webView.destroy();
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("versionName", packageInfo.versionName);
        hashMap.put("packageName", packageInfo.packageName);
        return hashMap;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        String str;
        super.dispose();
        for (FlutterWebView flutterWebView : this.keepAliveWebViews.values()) {
            if (flutterWebView != null && (str = flutterWebView.keepAliveId) != null) {
                disposeKeepAlive(str);
            }
        }
        this.keepAliveWebViews.clear();
        this.windowWebViewMessages.clear();
        this.plugin = null;
    }

    public void disposeKeepAlive(String str) {
        ViewGroup viewGroup;
        FlutterWebView flutterWebView = this.keepAliveWebViews.get(str);
        if (flutterWebView != null) {
            flutterWebView.keepAliveId = null;
            View view = flutterWebView.getView();
            if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                viewGroup.removeView(view);
            }
            flutterWebView.dispose();
        }
        if (this.keepAliveWebViews.containsKey(str)) {
            this.keepAliveWebViews.put(str, null);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, A5.q
    public void onMethodCall(o oVar, final r rVar) {
        Uri safeBrowsingPrivacyPolicyUrl;
        Context context;
        String str = oVar.f676a;
        str.getClass();
        switch (str) {
            case "disableWebView":
                if (Build.VERSION.SDK_INT >= 28) {
                    WebView.disableWebView();
                }
                rVar.success(Boolean.TRUE);
                return;
            case "setWebContentsDebuggingEnabled":
                WebView.setWebContentsDebuggingEnabled(((Boolean) oVar.a("debuggingEnabled")).booleanValue());
                rVar.success(Boolean.TRUE);
                return;
            case "enableSlowWholeDocumentDraw":
                WebView.enableSlowWholeDocumentDraw();
                rVar.success(Boolean.TRUE);
                return;
            case "getJavaScriptBridgeName":
                rVar.success(JavaScriptBridgeJS.get_JAVASCRIPT_BRIDGE_NAME());
                return;
            case "getVariationsHeader":
                if (!d.a("GET_VARIATIONS_HEADER")) {
                    rVar.success(null);
                    return;
                }
                Uri uri = w.f5874a;
                if (!S0.w.f6279M.b()) {
                    throw S0.w.a();
                }
                rVar.success(y.f6312a.getStatics().getVariationsHeader());
                return;
            case "clearClientCertPreferences":
                WebView.clearClientCertPreferences(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        rVar.success(Boolean.TRUE);
                    }
                });
                return;
            case "getSafeBrowsingPrivacyPolicyUrl":
                if (!d.a("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                    rVar.success(null);
                    return;
                }
                Uri uri2 = w.f5874a;
                C0431b c0431b = S0.w.f6292g;
                if (c0431b.a()) {
                    safeBrowsingPrivacyPolicyUrl = WebView.getSafeBrowsingPrivacyPolicyUrl();
                } else {
                    if (!c0431b.b()) {
                        throw S0.w.a();
                    }
                    safeBrowsingPrivacyPolicyUrl = y.f6312a.getStatics().getSafeBrowsingPrivacyPolicyUrl();
                }
                rVar.success(safeBrowsingPrivacyPolicyUrl.toString());
                return;
            case "setSafeBrowsingAllowlist":
                if (d.a("SAFE_BROWSING_ALLOWLIST")) {
                    w.h(new HashSet((List) oVar.a("hosts")), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.2
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            rVar.success(bool);
                        }
                    });
                    return;
                }
                if (!d.a("SAFE_BROWSING_WHITELIST")) {
                    rVar.success(Boolean.FALSE);
                    return;
                }
                List list = (List) oVar.a("hosts");
                ValueCallback<Boolean> valueCallback = new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.3
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(Boolean bool) {
                        rVar.success(bool);
                    }
                };
                Uri uri3 = w.f5874a;
                w.h(new HashSet(list), valueCallback);
                return;
            case "getDefaultUserAgent":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null) {
                    rVar.success(WebSettings.getDefaultUserAgent(inAppWebViewFlutterPlugin.applicationContext));
                    return;
                } else {
                    rVar.success(null);
                    return;
                }
            case "clearAllCache":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null) {
                    Context context2 = inAppWebViewFlutterPlugin2.activity;
                    if (context2 == null) {
                        context2 = inAppWebViewFlutterPlugin2.applicationContext;
                    }
                    if (context2 != null) {
                        clearAllCache(context2, ((Boolean) oVar.a("includeDiskFiles")).booleanValue());
                    }
                }
                rVar.success(Boolean.TRUE);
                return;
            case "setJavaScriptBridgeName":
                JavaScriptBridgeJS.set_JAVASCRIPT_BRIDGE_NAME((String) oVar.a("bridgeName"));
                rVar.success(Boolean.TRUE);
                return;
            case "getCurrentWebViewPackage":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null) {
                    context = inAppWebViewFlutterPlugin3.activity;
                    if (context == null) {
                        context = inAppWebViewFlutterPlugin3.applicationContext;
                    }
                } else {
                    context = null;
                }
                PackageInfo d7 = context != null ? w.d(context) : null;
                rVar.success(d7 != null ? convertWebViewPackageToMap(d7) : null);
                return;
            case "isMultiProcessEnabled":
                if (!d.a("MULTI_PROCESS")) {
                    rVar.success(Boolean.FALSE);
                    return;
                }
                Uri uri4 = w.f5874a;
                if (!S0.w.f6273G.b()) {
                    throw S0.w.a();
                }
                rVar.success(Boolean.valueOf(y.f6312a.getStatics().isMultiProcessEnabled()));
                return;
            case "disposeKeepAlive":
                String str2 = (String) oVar.a("keepAliveId");
                if (str2 != null) {
                    disposeKeepAlive(str2);
                }
                rVar.success(Boolean.TRUE);
                return;
            default:
                rVar.notImplemented();
                return;
        }
    }
}

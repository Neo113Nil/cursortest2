package com.applovin.impl;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.login.LoginLogger;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class s8 {
    public static void a(WebView webView) {
        b(webView, true);
    }

    public static void b(final WebView webView, final boolean z) {
        if (webView == null) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.s8$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                s8.a(webView, z);
            }
        });
    }

    public static String c(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.external_redirect_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.external_redirect_failure")) {
                return null;
            }
            str2 = LoginLogger.EVENT_EXTRAS_FAILURE;
        }
        return a("al_onExternalRedirectEvent", str2, map);
    }

    public static String d(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.preload_success")) {
            str2 = "success";
        } else {
            if (!str.equals("com.applovin.preload_failure")) {
                return null;
            }
            str2 = LoginLogger.EVENT_EXTRAS_FAILURE;
        }
        return a("al_onPreloadEvent", str2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView, boolean z) {
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeAllViews();
        if (z) {
            webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        }
        webView.onPause();
        webView.destroyDrawingCache();
        webView.destroy();
    }

    public static String b(String str, Map map) {
        String str2;
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "com.applovin.custom_tabs_failure":
                str2 = LoginLogger.EVENT_EXTRAS_FAILURE;
                break;
            case "com.applovin.custom_tabs_hidden":
                str2 = "hidden";
                break;
            case "com.applovin.custom_tabs_shown":
                str2 = "shown";
                break;
            default:
                return null;
        }
        return a("al_onInAppBrowserEvent", str2, map);
    }

    public static String a(String str, Map map) {
        String str2;
        str.hashCode();
        if (str.equals("com.applovin.custom_intent_launch_failure")) {
            str2 = LoginLogger.EVENT_EXTRAS_FAILURE;
        } else {
            if (!str.equals("com.applovin.custom_intent_launch_success")) {
                return null;
            }
            str2 = "success";
        }
        return a("al_onCustomIntentLaunchEvent", str2, map);
    }

    public static String a(Map map) {
        return a("al_onWindowInsetsInfoCollectedEvent", "success", map);
    }

    private static String a(String str, String str2, Map map) {
        JSONObject jSONObject;
        try {
            jSONObject = CollectionUtils.toJson(map);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        return "javascript:" + str + "('" + str2 + "'," + jSONObject + ");";
    }

    public static void a(final WebView webView, final String str, String str2, com.applovin.impl.sdk.l lVar) {
        if (webView == null) {
            return;
        }
        try {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a(str2, "Forwarding \"" + str + "\" to WebView");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.s8$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(str);
                }
            });
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a(str2, "Unable to forward to WebView", th);
            }
            lVar.E().a(str2, th, CollectionUtils.hashMap("operation", str));
        }
    }

    public static x4 a(final WebView webView, final String str, com.applovin.impl.sdk.l lVar) {
        final x4 x4Var = new x4("evaluateJavascript");
        if (webView == null) {
            return x4Var.a("null_webview");
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.s8$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                s8.a(webView, str, x4Var);
            }
        });
        Long l = (Long) lVar.a(c5.Y2);
        if (l.longValue() > 0) {
            o6.a(l.longValue(), x4Var, "timed_out", "evaluateJavascriptTimeout", lVar);
        } else {
            x4Var.b(null);
        }
        return x4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView, String str, final x4 x4Var) {
        Objects.requireNonNull(x4Var);
        webView.evaluateJavascript(str, new ValueCallback() { // from class: com.applovin.impl.s8$$ExternalSyntheticLambda3
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                x4.this.b((String) obj);
            }
        });
    }
}

package com.fyber.inneractive.sdk.flow.storepromo.controller.webview;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.r;
import com.fyber.inneractive.sdk.config.v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class b extends WebViewClient {
    public static final String[] c = {"https://fonts.googleapis.com", "https://fonts.googleapis.com"};

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a f5388a;
    public com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a b;

    public b(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar, com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar2) {
        this.f5388a = aVar;
        this.b = aVar2;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", str, Integer.valueOf(i), str2);
        if (a(str2)) {
            return;
        }
        String str3 = str + " errCode: " + i;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!h0.e(str2)) {
            str2 = null;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str3, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView == null) {
            a("unknown", renderProcessGoneDetail);
            return true;
        }
        a(webView.toString(), renderProcessGoneDetail);
        webView.destroy();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        IAlog.a("%s: shouldOverrideUrlLoading: url: %s", "StorePromoWebviewClient", str);
        Uri parse = Uri.parse(str);
        if (parse == null || TextUtils.isEmpty(parse.getScheme()) || TextUtils.isEmpty(parse.getAuthority()) || TextUtils.isEmpty(parse.getHost()) || !"FyRemote://".toLowerCase().contains(parse.getScheme())) {
            return true;
        }
        HashMap a2 = h0.a(parse);
        String host = parse.getHost();
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler.a aVar = this.f5388a;
        if (aVar == null) {
            return true;
        }
        aVar.a(host, a2);
        return true;
    }

    public final void a(String str, RenderProcessGoneDetail renderProcessGoneDetail) {
        String str2;
        str2 = "unknown";
        if (Build.VERSION.SDK_INT >= 26) {
            str2 = renderProcessGoneDetail != null ? String.valueOf(renderProcessGoneDetail.didCrash()) : "unknown";
            IAlog.a("%s: onRenderProcessGone: handled, webview crashed: %s view: %s", "StorePromoWebviewClient", str2, str);
        } else {
            IAlog.a("%s: onRenderProcessGone: handled, view: %s", "StorePromoWebviewClient", str);
        }
        String str3 = "Webview did crash: " + str2 + " on webview: " + str;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR;
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str3, null);
        }
    }

    public static boolean a(String str) {
        v vVar;
        if (str == null || (vVar = IAConfigManager.R.u) == null) {
            return false;
        }
        r rVar = vVar.b;
        String[] strArr = c;
        String a2 = rVar.a("font_urls", (String) null);
        if (a2 != null) {
            try {
                JSONArray jSONArray = new JSONArray(a2);
                String[] strArr2 = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr2[i] = jSONArray.getString(i);
                }
                strArr = strArr2;
            } catch (JSONException unused) {
            }
        }
        for (String str2 : strArr) {
            if (str.contains(str2.trim())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i;
        String str;
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String str2 = "";
        if (webResourceError != null) {
            if (webResourceError.getDescription() != null) {
                str2 = webResourceError.getDescription().toString();
            }
            i = webResourceError.getErrorCode();
        } else {
            i = -999;
        }
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            str = webResourceRequest.getUrl().toString();
        } else {
            str = "unknown";
        }
        IAlog.a("%s: onReceivedError: error: %s errorCode: %d, failing url: %s", "StorePromoWebviewClient", str2, Integer.valueOf(i), str);
        if (a(str)) {
            return;
        }
        String str3 = str2 + " errCode: " + i;
        com.fyber.inneractive.sdk.network.events.b bVar = com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR;
        if (!h0.e(str)) {
            str = null;
        }
        com.fyber.inneractive.sdk.flow.storepromo.controller.listener.a aVar = this.b;
        if (aVar != null) {
            aVar.a(bVar, str3, str);
        }
    }
}

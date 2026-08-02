package io.github.sabpaisaandroid.activity;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.github.sabpaisaandroid.activity.WebViewActivityLite;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class m extends WebViewClient {
    public final /* synthetic */ WebViewActivityLite a;

    public m(WebViewActivityLite webViewActivityLite) {
        this.a = webViewActivityLite;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String string = "Load Resource: " + str;
        Intrinsics.checkNotNullParameter(string, "string");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebViewActivityLite.Companion companion = WebViewActivityLite.INSTANCE;
        WebViewActivityLite webViewActivityLite = this.a;
        webViewActivityLite.getClass();
        String string = "ON Page Finished: " + url;
        Intrinsics.checkNotNullParameter(string, "string");
        webViewActivityLite.x(url);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        Uri url;
        Uri url2;
        String uri;
        boolean contains$default;
        StringBuilder sb = new StringBuilder("URl: ");
        sb.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        String string = sb.toString();
        Intrinsics.checkNotNullParameter(string, "string");
        WebViewActivityLite webViewActivityLite = this.a;
        if (webResourceRequest != null && (url2 = webResourceRequest.getUrl()) != null && (uri = url2.toString()) != null) {
            contains$default = StringsKt__StringsKt.contains$default(uri, webViewActivityLite.n, false, 2, (Object) null);
            if (!contains$default) {
                if (webView != null) {
                    webView.loadUrl(webResourceRequest.getUrl().toString());
                }
                return false;
            }
        }
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (str = url.toString()) == null) {
            str = "";
        }
        webViewActivityLite.x(str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in Java")
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        String string = "URl: " + url;
        Intrinsics.checkNotNullParameter(string, "string");
        WebViewActivityLite webViewActivityLite = this.a;
        contains$default = StringsKt__StringsKt.contains$default(url, webViewActivityLite.n, false, 2, (Object) null);
        if (contains$default) {
            webViewActivityLite.x(url);
            return true;
        }
        view.loadUrl(url);
        return false;
    }
}

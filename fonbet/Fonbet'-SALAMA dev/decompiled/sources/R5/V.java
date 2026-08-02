package R5;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes2.dex */
public final class V extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f6112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f6113b;

    public V(W w7, WebView webView) {
        this.f6113b = w7;
        this.f6112a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f6113b.f6114a;
        WebView webView2 = this.f6112a;
        if (webViewClient.shouldOverrideUrlLoading(webView2, webResourceRequest)) {
            return true;
        }
        webView2.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient webViewClient = this.f6113b.f6114a;
        WebView webView2 = this.f6112a;
        if (webViewClient.shouldOverrideUrlLoading(webView2, str)) {
            return true;
        }
        webView2.loadUrl(str);
        return true;
    }
}

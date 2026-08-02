package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebViewRenderProcessClientFrameworkAdapter extends android.webkit.WebViewRenderProcessClient {
    private final androidx.webkit.WebViewRenderProcessClient getHighSpeedVideoFpsRanges;

    public WebViewRenderProcessClientFrameworkAdapter(androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        this.getHighSpeedVideoFpsRanges = webViewRenderProcessClient;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(android.webkit.WebView webView, android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.getHighSpeedVideoFpsRanges.onRenderProcessUnresponsive(webView, androidx.webkit.internal.WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess));
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(android.webkit.WebView webView, android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.getHighSpeedVideoFpsRanges.onRenderProcessResponsive(webView, androidx.webkit.internal.WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess));
    }

    public androidx.webkit.WebViewRenderProcessClient getFrameworkRenderProcessClient() {
        return this.getHighSpeedVideoFpsRanges;
    }
}

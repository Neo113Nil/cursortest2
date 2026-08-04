package S0;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class C extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InAppWebViewRenderProcessClient f6230a;

    public C(InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient) {
        this.f6230a = inAppWebViewRenderProcessClient;
    }

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = this.f6230a;
        WeakHashMap weakHashMap = D.f6231c;
        D d7 = (D) weakHashMap.get(webViewRenderProcess);
        if (d7 == null) {
            d7 = new D();
            d7.f6233b = new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, d7);
        }
        inAppWebViewRenderProcessClient.onRenderProcessResponsive(webView, d7);
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = this.f6230a;
        WeakHashMap weakHashMap = D.f6231c;
        D d7 = (D) weakHashMap.get(webViewRenderProcess);
        if (d7 == null) {
            d7 = new D();
            d7.f6233b = new WeakReference(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, d7);
        }
        inAppWebViewRenderProcessClient.onRenderProcessUnresponsive(webView, d7);
    }
}

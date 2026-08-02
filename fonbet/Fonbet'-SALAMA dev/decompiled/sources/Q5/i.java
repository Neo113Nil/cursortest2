package Q5;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* loaded from: classes2.dex */
public final class i extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f5853a;

    public i(WebViewActivity webViewActivity) {
        this.f5853a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z7, Message message) {
        h hVar = new h(this);
        WebView webView2 = new WebView(this.f5853a.f14222c.getContext());
        webView2.setWebViewClient(hVar);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}

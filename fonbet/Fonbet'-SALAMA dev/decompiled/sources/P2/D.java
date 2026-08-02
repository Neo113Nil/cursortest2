package P2;

import I2.P;
import S0.C0431b;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f5414b;

    public /* synthetic */ D(E e7, int i7) {
        this.f5413a = i7;
        this.f5414b = e7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebViewClient webViewClient;
        E e7 = this.f5414b;
        switch (this.f5413a) {
            case 0:
                try {
                    P p5 = E2.o.f1952C.f1957c;
                    WebView webView = e7.f5415a;
                    if (Build.VERSION.SDK_INT < 26) {
                        if (R0.d.a("GET_WEB_VIEW_CLIENT")) {
                            try {
                                Uri uri = R0.w.f5874a;
                                C0431b c0431b = S0.w.f6309y;
                                if (c0431b.a()) {
                                    webViewClient = webView.getWebViewClient();
                                } else {
                                    if (!c0431b.b()) {
                                        throw S0.w.a();
                                    }
                                    R0.w.c(webView);
                                    webViewClient = R0.w.f(webView).f6313a.getWebViewClient();
                                }
                            } catch (RuntimeException e8) {
                                E2.o.f1952C.f1961g.zzw(e8, "AdUtil.getWebViewClient");
                            }
                        }
                        throw new IllegalStateException("getWebViewClient not supported");
                    }
                    webViewClient = webView.getWebViewClient();
                    if (webViewClient == e7) {
                        return;
                    }
                    if (webViewClient != null) {
                        e7.f5418d = webViewClient;
                    }
                    e7.f5415a.setWebViewClient(e7);
                    e7.a();
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            default:
                e7.f5417c.execute(new D(e7, 0));
                return;
        }
    }
}

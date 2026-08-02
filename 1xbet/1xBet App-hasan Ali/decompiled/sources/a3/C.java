package a3;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import d2.AbstractC1914b;
import e2.AbstractC1924e;
import e2.AbstractC1933n;
import e2.C1921b;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6473k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D f6474l;

    public /* synthetic */ C(D d5, int i) {
        this.f6473k = i;
        this.f6474l = d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebViewClient webViewClient;
        D d5 = this.f6474l;
        switch (this.f6473k) {
            case 0:
                d5.getClass();
                try {
                    T2.L l5 = P2.o.f4767B.f4771c;
                    int i = Build.VERSION.SDK_INT;
                    WebView webView = d5.f6475a;
                    if (i < 26) {
                        if (AbstractC2346c.x("GET_WEB_VIEW_CLIENT")) {
                            try {
                                int i5 = AbstractC1914b.f16884a;
                                C1921b c1921b = AbstractC1933n.f16913b;
                                if (c1921b.a()) {
                                    webViewClient = AbstractC1924e.d(webView);
                                } else {
                                    if (!c1921b.b()) {
                                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                                    }
                                    webViewClient = ((WebViewProviderBoundaryInterface) AbstractC1914b.b(webView).f16910l).getWebViewClient();
                                }
                            } catch (RuntimeException e3) {
                                P2.o.f4767B.f4774g.i("AdUtil.getWebViewClient", e3);
                            }
                        }
                        throw new IllegalStateException("getWebViewClient not supported");
                    }
                    webViewClient = webView.getWebViewClient();
                    if (webViewClient == d5) {
                        return;
                    }
                    if (webViewClient != null) {
                        d5.f6478d = webViewClient;
                    }
                    webView.setWebViewClient(d5);
                    d5.c();
                    return;
                } catch (IllegalStateException unused) {
                    return;
                }
            default:
                d5.f6477c.execute(new C(d5, 0));
                return;
        }
    }
}

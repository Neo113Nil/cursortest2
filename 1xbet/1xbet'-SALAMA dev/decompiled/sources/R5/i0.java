package R5;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends WebView implements io.flutter.plugin.platform.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6175d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0413i f6176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebViewClient f6177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public W f6178c;

    public i0(C0413i c0413i) {
        super((Context) c0413i.f6174a.f3681e);
        this.f6176a = c0413i;
        this.f6177b = new WebViewClient();
        this.f6178c = new W();
        setWebViewClient(this.f6177b);
        setWebChromeClient(this.f6178c);
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f6178c;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        p121q5.m mVar;
        super.onAttachedToWindow();
        this.f6176a.f6174a.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = this;
            while (true) {
                if (parent.getParent() == null) {
                    mVar = null;
                    break;
                }
                parent = parent.getParent();
                if (parent instanceof p121q5.m) {
                    mVar = (p121q5.m) parent;
                    break;
                }
            }
            if (mVar != null) {
                mVar.setImportantForAutofill(1);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(final int i7, final int i8, final int i9, final int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        this.f6176a.f6174a.l(new Runnable() { // from class: R5.h0
            @Override // java.lang.Runnable
            public final void run() {
                long j = i7;
                long j3 = i8;
                long j7 = i9;
                long j8 = i10;
                C0410f c0410f = new C0410f(4);
                i0 i0Var = this.f6169a;
                C0413i c0413i = i0Var.f6176a;
                c0413i.getClass();
                I4.j jVar = c0413i.f6174a;
                jVar.getClass();
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", jVar.a(), (Object) null, 1).L(p050g6.i.M0(i0Var, Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j7), Long.valueOf(j8)), new M(c0410f, 2));
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (!(webChromeClient instanceof W)) {
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }
        W w7 = (W) webChromeClient;
        this.f6178c = w7;
        w7.f6114a = this.f6177b;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f6177b = webViewClient;
        this.f6178c.f6114a = webViewClient;
    }

    @Override // io.flutter.plugin.platform.f
    public final void dispose() {
    }

    @Override // io.flutter.plugin.platform.f
    public View getView() {
        return this;
    }
}

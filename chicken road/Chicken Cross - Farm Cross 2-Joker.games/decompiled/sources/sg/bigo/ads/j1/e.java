package sg.bigo.ads.j1;

import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class e extends sg.bigo.ads.E1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f13009a;

    public e(h hVar) {
        this.f13009a = hVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        h hVar = this.f13009a;
        if (hVar.e != null && !hVar.F()) {
            this.f13009a.e.setProgress(i);
        }
        this.f13009a.h(i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        this.f13009a.e(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        h hVar = this.f13009a;
        if (hVar.s == null) {
            hVar.s = new a(hVar.f12687a);
        }
        hVar.s.a(valueCallback, fileChooserParams);
        return true;
    }
}

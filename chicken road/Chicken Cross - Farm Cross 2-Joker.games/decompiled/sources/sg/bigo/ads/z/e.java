package sg.bigo.ads.z;

import android.webkit.WebView;
import android.widget.ProgressBar;

/* loaded from: classes3.dex */
public final class e extends sg.bigo.ads.E1.g {

    /* renamed from: a, reason: collision with root package name */
    public final g f13425a;

    public e(g gVar) {
        this.f13425a = gVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        ProgressBar progressBar = this.f13425a.n;
        if (progressBar == null || i <= 5) {
            return;
        }
        if (i > 95) {
            i = 95;
        }
        progressBar.setProgress(i);
    }
}

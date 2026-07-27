package sg.bigo.ads.E1;

import android.content.Context;
import android.webkit.WebChromeClient;

/* loaded from: classes3.dex */
public abstract class f extends k {
    public boolean d;
    public final d e;
    public e f;
    public g g;

    public f(Context context) {
        super(context);
        this.d = false;
        d dVar = new d();
        this.e = dVar;
        addJavascriptInterface(new c(this, dVar), "bigossp");
    }

    public g getCustomWebChromeClient() {
        return this.g;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.g = webChromeClient instanceof g ? (g) webChromeClient : null;
        super.setWebChromeClient(webChromeClient);
    }
}

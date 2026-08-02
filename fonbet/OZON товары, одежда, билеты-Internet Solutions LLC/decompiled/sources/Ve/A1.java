package Ve;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class A1 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S7 f28570a;

    public A1(S7 s72) {
        this.f28570a = s72;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InterfaceC4693v4 interfaceC4693v4 = this.f28570a.f29948d;
        if (interfaceC4693v4 == null) {
            Intrinsics.n("urlProcessor");
            throw null;
        }
        String str2 = (String) ((C4532pg) interfaceC4693v4).f31791e.getValue();
        if (str2 != null) {
            return kotlin.text.h.t(String.valueOf(str), str2, false);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        InterfaceC4693v4 interfaceC4693v4 = this.f28570a.f29948d;
        String str = null;
        if (interfaceC4693v4 != null) {
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                str = url.toString();
            }
            String str2 = (String) ((C4532pg) interfaceC4693v4).f31791e.getValue();
            if (str2 != null) {
                return kotlin.text.h.t(String.valueOf(str), str2, false);
            }
            return false;
        }
        Intrinsics.n("urlProcessor");
        throw null;
    }
}

package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* loaded from: classes6.dex */
public final class F extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ G f109;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f110;

    public F(G g, String str) {
        this.f109 = g;
        this.f110 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo5316() {
        WebView webView = this.f109.f112;
        String str = this.f110;
        String str2 = V.f137;
        if (webView != null) {
            if (webView.getHandler() == null && webView.getRootView() == null) {
                return;
            }
            webView.loadUrl(AbstractC1196.m5920("4gsLSi/tv0j4HkdOKu+hCekeEkl0rA==\n", "iGp9K1yOzSE=\n", new StringBuilder(), str).append(StringFog.decrypt("M06r+Q==\n", "EWeCwtIv7TA=\n")).toString());
        }
    }
}

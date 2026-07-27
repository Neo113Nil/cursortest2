package sg.bigo.ads.x1;

import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class l extends sg.bigo.ads.E1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f13396a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f d;

    public l(f fVar, sg.bigo.ads.E1.k kVar, String str, String str2) {
        this.d = fVar;
        this.f13396a = kVar;
        this.b = str;
        this.c = str2;
    }

    @Override // sg.bigo.ads.E1.h
    public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f13396a.destroy();
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        f fVar = this.d;
        String str2 = this.b;
        String str3 = this.c;
        fVar.getClass();
        HashMap hashMap = new HashMap(fVar.g);
        if (TextUtils.isEmpty(str2)) {
            str2 = "unknown";
        }
        hashMap.put("action", str2);
        hashMap.put("track_url", str);
        hashMap.put("domain_front", "");
        hashMap.put("track_name", str3);
        hashMap.put("states", "success");
        hashMap.put("retry", "0");
        hashMap.put("out_ad", String.valueOf(fVar.h));
        if ("impl_track".equals(str2)) {
            sg.bigo.ads.s1.b.a("06002013", hashMap);
        } else if ("click_track".equals(str2)) {
            sg.bigo.ads.s1.b.a("06002014", hashMap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}

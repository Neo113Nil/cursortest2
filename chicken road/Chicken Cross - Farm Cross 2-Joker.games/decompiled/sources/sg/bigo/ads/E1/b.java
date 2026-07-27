package sg.bigo.ads.E1;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.U.o;
import sg.bigo.ads.U.q;
import sg.bigo.ads.f0.l;

/* loaded from: classes3.dex */
public final class b extends l {
    public static final b g = new b();
    public String e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    @Override // sg.bigo.ads.f0.l
    public final String a() {
        return null;
    }

    @Override // sg.bigo.ads.f0.l
    public final boolean a(String str) {
        return true;
    }

    @Override // sg.bigo.ads.f0.l
    public final String b(Context context) {
        return o.a(new StringBuilder().append(q.a(context)), File.separator, "bannerjs");
    }

    @Override // sg.bigo.ads.f0.l
    public final String c() {
        return this.e;
    }

    @Override // sg.bigo.ads.f0.l
    public final String d() {
        return "BannerJsManager";
    }

    public final boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.equals(str, str2)) ? false : true;
    }

    public final String e() {
        return (String) sg.bigo.ads.F0.b.a("sp_ads", "sp_banner_js_downloaded_url", "", 3);
    }

    @Override // sg.bigo.ads.f0.l
    public final String b() {
        return "banner_insert_js.js";
    }

    @Override // sg.bigo.ads.f0.l
    public final void b(String str) {
        sg.bigo.ads.F0.b.b("sp_ads", "sp_banner_js_downloaded_url", str, 3);
    }
}

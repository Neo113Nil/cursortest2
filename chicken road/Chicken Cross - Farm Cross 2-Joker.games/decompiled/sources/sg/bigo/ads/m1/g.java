package sg.bigo.ads.m1;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.bigosg.Omid;
import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.AdSessionConfiguration;
import com.iab.omid.library.bigosg.adsession.AdSessionContext;
import com.iab.omid.library.bigosg.adsession.CreativeType;
import com.iab.omid.library.bigosg.adsession.ImpressionType;
import com.iab.omid.library.bigosg.adsession.Owner;
import com.iab.omid.library.bigosg.adsession.Partner;
import java.io.File;
import java.net.URI;
import java.util.Objects;
import sg.bigo.ads.U.o;
import sg.bigo.ads.U.q;
import sg.bigo.ads.f0.l;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class g extends l {
    public String e = "";

    public final c a(WebView webView, View... viewArr) {
        AdSession adSession;
        if (!this.b) {
            return null;
        }
        try {
            adSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Bigosg", "5.10.1"), webView, null));
            try {
                adSession.registerAdView(webView);
                for (View view : viewArr) {
                    if (view != null) {
                        adSession.addFriendlyObstruction(view);
                    }
                }
                adSession.start();
                adSession.getAdSessionId();
                return new c(adSession, null);
            } catch (Exception e) {
                e = e;
                AbstractC5496a.b("OMSDK", "createHtmlOmsdkEvent error: " + e.getMessage());
                if (adSession != null) {
                    adSession.finish();
                }
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            adSession = null;
        }
    }

    @Override // sg.bigo.ads.f0.l
    public final String b(Context context) {
        return o.a(new StringBuilder().append(q.a(context)), File.separator, "omsdk");
    }

    @Override // sg.bigo.ads.f0.l
    public final String c() {
        return this.e;
    }

    @Override // sg.bigo.ads.f0.l
    public final String d() {
        return "OMSDK";
    }

    @Override // sg.bigo.ads.f0.l
    public final String a() {
        return "";
    }

    public final String e() {
        return (String) sg.bigo.ads.F0.b.a("sp_ads", "sp_omid_service_downloaded_url", "", 3);
    }

    public final boolean a(String str, String str2) {
        boolean z;
        String str3;
        String str4 = "";
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                z = true;
            } else {
                try {
                    str3 = new URI(str).getPath();
                } catch (Exception unused) {
                    str3 = "";
                }
                try {
                    str4 = new URI(str2).getPath();
                } catch (Exception unused2) {
                }
                z = Objects.equals(str3, str4);
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.f0.l
    public final boolean a(String str) {
        return str.contains("omidGlobal");
    }

    @Override // sg.bigo.ads.f0.l
    public final String b() {
        return "omsdk-v1.js";
    }

    @Override // sg.bigo.ads.f0.l
    public final void a(Context context, String str, String str2) {
        String str3;
        super.a(context, str, str2);
        if (new File(o.a(new StringBuilder().append(b(context)), File.separator, "omsdk-v1.js")).exists()) {
            try {
                str3 = Omid.getVersion();
            } catch (Throwable th) {
                AbstractC5496a.b("OMSDK", "getOMVersion error: " + th.getMessage());
                str3 = "";
            }
            sg.bigo.ads.F0.b.b("sp_ads", "sp_omsdk_cached_version", str3, 3);
        }
    }

    @Override // sg.bigo.ads.f0.l
    public final void b(String str) {
        sg.bigo.ads.F0.b.b("sp_ads", "sp_omid_service_downloaded_url", str, 3);
    }
}

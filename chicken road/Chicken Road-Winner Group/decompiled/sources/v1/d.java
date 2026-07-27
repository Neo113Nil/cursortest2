package v1;

import Y1.C0077a;
import a.AbstractC0086a;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.s0;
import o1.h;
import o1.i;
import org.json.JSONObject;
import q1.C1172b;
import s1.C1201h;
import z1.C1262a;

/* loaded from: classes.dex */
public final class d extends AbstractC1217a {

    /* renamed from: g, reason: collision with root package name */
    public WebView f10413g;

    /* renamed from: h, reason: collision with root package name */
    public Long f10414h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f10415i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10416j;

    public d(String str, Map map, String str2) {
        super(str);
        this.f10414h = null;
        this.f10415i = map;
        this.f10416j = str2;
    }

    @Override // v1.AbstractC1217a
    public final void d(i iVar, s0 s0Var) {
        JSONObject jSONObject = new JSONObject();
        Map unmodifiableMap = Collections.unmodifiableMap((HashMap) s0Var.f9881d);
        for (String str : unmodifiableMap.keySet()) {
            h hVar = (h) unmodifiableMap.get(str);
            hVar.getClass();
            JSONObject jSONObject2 = new JSONObject();
            w1.b.b(jSONObject2, "vendorKey", hVar.f10165a);
            w1.b.b(jSONObject2, "resourceUrl", hVar.f10166b.toString());
            w1.b.b(jSONObject2, "verificationParameters", hVar.f10167c);
            w1.b.b(jSONObject, str, jSONObject2);
        }
        e(iVar, s0Var, jSONObject);
    }

    @Override // v1.AbstractC1217a
    public final void f() {
        super.f();
        new Handler().postDelayed(new A.b(this), Math.max(4000 - (this.f10414h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f10414h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f10413g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007c  */
    @Override // v1.AbstractC1217a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        c cVar;
        WebView webView;
        C1201h c1201h = C1201h.f10330b;
        Context context = c1201h.f10331a;
        WebView webView2 = new WebView(context);
        this.f10413g = webView2;
        boolean z3 = true;
        webView2.getSettings().setJavaScriptEnabled(true);
        this.f10413g.getSettings().setAllowContentAccess(false);
        this.f10413g.getSettings().setAllowFileAccess(false);
        WebView webView3 = this.f10413g;
        if (AbstractC0086a.E("WEB_MESSAGE_LISTENER")) {
            try {
                if (((ArrayList) C1172b.b(c1201h.f10331a).a()).size() <= 0) {
                    z3 = false;
                }
            } catch (Exception unused) {
            }
            if (z3) {
                C0077a.b(webView3);
                cVar = new c(this, 1);
                this.f10413g.setWebViewClient(cVar);
                this.f10407b = new C1262a(this.f10413g);
                webView = this.f10413g;
                if (webView != null) {
                    String str = this.f10416j;
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                webView.evaluateJavascript(str, null);
                            } catch (IllegalStateException unused2) {
                                webView.loadUrl("javascript: " + str);
                            }
                        }
                    } catch (Exception e3) {
                        e3.getMessage();
                    }
                }
                Map map = this.f10415i;
                for (String str2 : map.keySet()) {
                    String externalForm = ((h) map.get(str2)).f10166b.toExternalForm();
                    WebView webView4 = this.f10413g;
                    if (externalForm != null && !TextUtils.isEmpty(str2)) {
                        String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                        if (webView4 != null && !TextUtils.isEmpty(replace)) {
                            try {
                                try {
                                    webView4.evaluateJavascript(replace, null);
                                } catch (IllegalStateException unused3) {
                                    webView4.loadUrl("javascript: " + replace);
                                }
                            } catch (Exception e4) {
                                e4.getMessage();
                            }
                        }
                    }
                }
                this.f10414h = Long.valueOf(System.nanoTime());
            }
        }
        if (((ArrayList) C1172b.b(context).a()).size() > 0) {
            cVar = new c(this, 0);
            this.f10413g.setWebViewClient(cVar);
            this.f10407b = new C1262a(this.f10413g);
            webView = this.f10413g;
            if (webView != null) {
            }
            Map map2 = this.f10415i;
            while (r3.hasNext()) {
            }
            this.f10414h = Long.valueOf(System.nanoTime());
        }
        cVar = new c(this, 1);
        this.f10413g.setWebViewClient(cVar);
        this.f10407b = new C1262a(this.f10413g);
        webView = this.f10413g;
        if (webView != null) {
        }
        Map map22 = this.f10415i;
        while (r3.hasNext()) {
        }
        this.f10414h = Long.valueOf(System.nanoTime());
    }
}

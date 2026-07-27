package sg.bigo.ads.k1;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.ironsource.U3;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.f.C5105j;
import sg.bigo.ads.f.C5111p;

/* renamed from: sg.bigo.ads.k1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5262c extends sg.bigo.ads.E1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5271l f13030a;

    public C5262c(C5271l c5271l) {
        this.f13030a = c5271l;
    }

    @Override // sg.bigo.ads.E1.g
    public final void a(String str, String str2) {
        InterfaceC5279u interfaceC5279u;
        sg.bigo.ads.f.z zVar;
        String str3;
        InterfaceC5267h interfaceC5267h = this.f13030a.c;
        if (interfaceC5267h == null || !(interfaceC5267h instanceof C5275p) || (interfaceC5279u = ((C5275p) interfaceC5267h).f13040a.h) == null || !(interfaceC5279u instanceof C5105j)) {
            return;
        }
        C5111p c5111p = ((C5105j) interfaceC5279u).b;
        c5111p.getClass();
        try {
            if (TextUtils.equals(str, "om_adEvent")) {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString("adSessionId");
                String optString2 = jSONObject.optString("type");
                int hashCode = optString2.hashCode();
                if (hashCode == -1097519099) {
                    str3 = U3.i.r;
                } else if (hashCode != 10775234) {
                    if (hashCode == 120623625) {
                        str3 = "impression";
                    }
                } else if (optString2.equals("geometryChange")) {
                    c5111p.a(optString, jSONObject.optJSONObject("data"));
                }
                optString2.equals(str3);
            } else {
                if (!TextUtils.equals(str, "om_errorEvent")) {
                    return;
                }
                if (TextUtils.equals(new JSONObject(str2).optString("type"), "om_adEvent") && (zVar = c5111p.i) != null) {
                    zVar.c();
                }
            }
        } catch (JSONException unused) {
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        InterfaceC5267h interfaceC5267h = this.f13030a.c;
        return interfaceC5267h != null ? interfaceC5267h.a(consoleMessage) : super.onConsoleMessage(consoleMessage);
    }

    @Override // sg.bigo.ads.E1.g, android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        InterfaceC5267h interfaceC5267h = this.f13030a.c;
        if (interfaceC5267h != null) {
            return interfaceC5267h.a(str2, jsResult);
        }
        if (webView.getContext() instanceof Activity) {
            return false;
        }
        jsResult.confirm();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        InterfaceC5267h interfaceC5267h = this.f13030a.c;
        if (interfaceC5267h != null) {
            interfaceC5267h.a(webView, i);
        }
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
    }
}

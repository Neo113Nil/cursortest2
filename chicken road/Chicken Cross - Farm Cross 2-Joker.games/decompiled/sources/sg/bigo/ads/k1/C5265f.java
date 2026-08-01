package sg.bigo.ads.k1;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinMediationProvider;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.k1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5265f extends U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5271l f13035a;

    public C5265f(C5271l c5271l) {
        this.f13035a = c5271l;
    }

    @Override // sg.bigo.ads.E1.h
    public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f13035a.a(renderProcessGoneDetail);
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        d0 d0Var;
        super.onPageFinished(webView, str);
        C5271l c5271l = this.f13035a;
        if (c5271l.f) {
            return;
        }
        c5271l.f = true;
        C5270k c5270k = c5271l.d;
        if (c5270k != null && (d0Var = c5270k.i) != null) {
            d0Var.i = true;
            if (!d0Var.f) {
                d0Var.f = true;
                d0Var.c.removeCallbacks(d0Var.b);
                d0Var.c.postDelayed(d0Var.b, 500L);
            }
        }
        InterfaceC5267h interfaceC5267h = c5271l.c;
        if (interfaceC5267h != null) {
            interfaceC5267h.d();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        AbstractC5496a.a("MraidBridge", "Error: " + str);
        super.onReceivedError(webView, i, str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r0.b) <= 3000) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0058, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r8.b) <= 3000) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        Uri uri2;
        InterfaceC5267h interfaceC5267h;
        C5271l c5271l = this.f13035a;
        c5271l.getClass();
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String scheme = parse.getScheme();
                String host = parse.getHost();
                if (!AppLovinMediationProvider.MOPUB.equals(scheme)) {
                    sg.bigo.ads.O0.b bVar = c5271l.e;
                    if (bVar != null) {
                        if (!c5271l.g) {
                            uri = parse;
                        } else if (bVar.f12474a.f12473a) {
                            uri = parse;
                        }
                        if (!CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
                            try {
                                uri2 = Uri.parse("mraid://open?url=" + URLEncoder.encode(str, "UTF-8"));
                                host = uri2.getHost();
                                scheme = uri2.getScheme();
                            } catch (UnsupportedEncodingException unused) {
                                AbstractC5496a.a("MraidBridge", "Invalid MRAID URL encoding: " + str);
                                c5271l.a(I.b, "Non-mraid URL is invalid");
                            }
                            if (!CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
                                sg.bigo.ads.O0.b bVar2 = c5271l.e;
                                if (bVar2 != null) {
                                }
                                return false;
                            }
                            try {
                                for (I i : I.values()) {
                                    if (!i.f13015a.equals(host)) {
                                    }
                                    break;
                                }
                                break;
                                c5271l.a(i, C5271l.a(uri2));
                            } catch (IllegalArgumentException | C5272m e) {
                                c5271l.a(i, e.getMessage());
                            }
                            i = I.c;
                            c5271l.a("window.mraidbridge.nativeCallComplete(" + JSONObject.quote(i.f13015a) + ")");
                        }
                        uri2 = uri;
                        if (!CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
                        }
                    }
                    uri = parse;
                    uri2 = uri;
                    if (!CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
                    }
                } else if ("failLoad".equals(host) && c5271l.f13038a == 1 && (interfaceC5267h = c5271l.c) != null) {
                    interfaceC5267h.c();
                }
            }
        } catch (Exception unused2) {
        }
        return true;
    }
}

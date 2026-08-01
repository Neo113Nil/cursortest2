package sg.bigo.ads.z;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import sg.bigo.ads.E1.h;
import sg.bigo.ads.I.p;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.R;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.F1;

/* loaded from: classes3.dex */
public final class f extends h {

    /* renamed from: a, reason: collision with root package name */
    public final g f13426a;

    public f(g gVar) {
        this.f13426a = gVar;
    }

    @Override // sg.bigo.ads.E1.h
    public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
        sg.bigo.ads.s1.b.a(3002, 10105, "The render process was gone.", (sg.bigo.ads.P.c) null);
        this.f13426a.f12687a.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (2 != r10) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageFinished(WebView webView, String str) {
        int i;
        g gVar;
        View view;
        super.onPageFinished(webView, str);
        Integer a2 = z.a(this.f13426a.p.a("video_play_page.loading_timing"));
        int intValue = a2 != null ? a2.intValue() : 0;
        if (intValue != 2 && intValue != 3 && intValue != 4 && (view = (gVar = this.f13426a).m) != null) {
            gVar.o = false;
            view.setVisibility(8);
        }
        if (g.s) {
            q qVar = this.f13426a.p;
            if (qVar != null) {
                Integer a3 = z.a(qVar.a("video_play_page.imp_timing"));
                i = a3 != null ? a3.intValue() : 1;
                if (1 != i) {
                }
                if (2 == i) {
                    g gVar2 = this.f13426a;
                    gVar2.getClass();
                    ViewGroup viewGroup = (ViewGroup) gVar2.f12687a.findViewById(R.id.inter_native_ad_view);
                    if (viewGroup != null) {
                        F1 f1 = new F1(((C5185l1) gVar2.e).D());
                        f1.e = gVar2.c;
                        f1.a(viewGroup, viewGroup, 1, 1, 0, null);
                    }
                }
            }
            i = 1;
            if (2 == i) {
            }
        } else {
            g gVar3 = this.f13426a;
            gVar3.getClass();
            ViewGroup viewGroup2 = (ViewGroup) gVar3.f12687a.findViewById(R.id.bigo_ad_bottom_privacy_content);
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
        g.s = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        sg.bigo.ads.O0.b bVar;
        this.f13426a.T();
        g gVar = this.f13426a;
        AdCountDownButton adCountDownButton = gVar.g;
        if (adCountDownButton != null && (!(gVar instanceof p) || ((p) gVar).u)) {
            adCountDownButton.setVisibility(8);
        }
        g gVar2 = this.f13426a;
        if (gVar2.d != null && (bVar = gVar2.q) != null && System.currentTimeMillis() - bVar.b <= 3000) {
            sg.bigo.ads.P.f fVar = new sg.bigo.ads.P.f();
            fVar.m = 2;
            ((C5185l1) gVar2.d).D().a(gVar2.q.c, 0, 1, fVar);
        }
        super.onPageStarted(webView, str, bitmap);
        g gVar3 = this.f13426a;
        int i = 3;
        if (g.s) {
            Integer a2 = z.a(gVar3.p.a("video_play_page.webview_force_time"));
            int intValue = a2 != null ? a2.intValue() : 0;
            if (intValue == 5 || intValue == 6 || intValue == 7 || intValue == 8) {
                i = intValue - 3;
            }
            i = 0;
        } else {
            Integer a3 = z.a(gVar3.p.a("video_play_page.webview2_force_time"));
            int intValue2 = a3 != null ? a3.intValue() : 0;
            if (intValue2 != 0) {
                if (intValue2 == 1 || intValue2 == 2 || intValue2 == 3 || intValue2 == 4) {
                    i = intValue2 + 1;
                }
            }
            i = 0;
        }
        AdCountDownButton adCountDownButton2 = gVar3.g;
        if (adCountDownButton2 != null) {
            if (i > 0) {
                adCountDownButton2.postDelayed(new d(gVar3), i * 1000);
            } else {
                adCountDownButton2.setVisibility(0);
            }
        }
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // sg.bigo.ads.E1.h, android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }
}

package sg.bigo.ads.F;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import sg.bigo.ads.K0.AbstractC4944a;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.Q;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.L0.C;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.s0.u;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* loaded from: classes3.dex */
public final class r implements InnerBannerAd {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.C.l f12298a;
    public final j b;
    public Boolean c;
    public q d;
    public final sg.bigo.ads.G.h e;
    public final k f;
    public int g;
    public boolean h;
    public long i;
    public sg.bigo.ads.Q.c j;
    public final n k;
    public final l l;

    public r(sg.bigo.ads.P.j jVar) {
        sg.bigo.ads.G.h hVar;
        this.g = 0;
        this.h = false;
        n nVar = new n(this);
        this.k = nVar;
        this.l = new l(this);
        sg.bigo.ads.C.l a2 = sg.bigo.ads.C.f.a(jVar);
        this.f12298a = a2;
        if (a2 == null) {
            return;
        }
        a2.setAdInteractionListener(nVar);
        this.f = new k(jVar);
        this.b = new j(a2);
        sg.bigo.ads.U0.g gVar = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) a2.e())).I0;
        if (a2 != null) {
            Context context = a2.k.f;
            hVar = sg.bigo.ads.G.h.h.equals(new sg.bigo.ads.U.r(gVar != null ? gVar.f12571a : 0, gVar != null ? gVar.b : 0)) ? new sg.bigo.ads.G.i(a2, context) : new sg.bigo.ads.G.j(a2, context);
        } else {
            hVar = null;
        }
        this.e = hVar;
        this.c = Boolean.FALSE;
        this.d = null;
        this.g = 0;
        this.h = false;
    }

    public final void a() {
        a(this.j, 2, false);
        j jVar = this.b;
        o oVar = this.d.f12297a;
        sg.bigo.ads.C.l lVar = jVar.b;
        if (lVar == null) {
            return;
        }
        sg.bigo.ads.P.c cVar = (InterfaceC5087a) lVar.e();
        sg.bigo.ads.U0.h hVar = ((sg.bigo.ads.U0.k) cVar).y0;
        if (hVar == null) {
            oVar.a(jVar.b, 3001, 10103, "banner icon is empty");
            return;
        }
        String str = hVar.c;
        if (I.a((CharSequence) str)) {
            oVar.a(jVar.b, 3001, 10103, "banner icon url is empty");
        } else if (sg.bigo.ads.O.g.f12472a.B.a(9) && URLUtil.isHttpUrl(str)) {
            oVar.a(jVar.b, 3001, 10118, "Invalid http banner icon url");
        } else {
            u.f13300a.a(jVar.b.k.e, AbstractRunnableC5522h.a("BannerIconCreativeNet", AbstractRunnableC5522h.e != null ? 40 : 5, true), str, ((sg.bigo.ads.U0.b) cVar).T, new i(jVar, oVar));
        }
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final View adView() {
        if (!AbstractC5446j.e() && Q.f12348a) {
            throw new IllegalArgumentException("adView() must run on UI thread");
        }
        if (this.f12298a == null) {
            return null;
        }
        if (isExpired()) {
            this.f12298a.b(2000, 1, "The ad is expired.");
            return null;
        }
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar.u) {
            lVar.b(2000, 1, "The ad is destroyed.");
            return null;
        }
        sg.bigo.ads.G.h hVar = this.e;
        if (hVar != null) {
            return hVar.b;
        }
        lVar.b(2000, 0, "mNativeBannerRender is null.");
        return null;
    }

    public final void b() {
        q qVar = this.d;
        if (qVar != null) {
            qVar.f12297a = null;
            qVar.b = null;
            this.d = null;
        }
        sg.bigo.ads.G.h hVar = this.e;
        if (hVar != null) {
            FrameLayout frameLayout = hVar.b;
            if (frameLayout != null) {
                X.c(frameLayout);
                hVar.b = null;
            }
            MediaView mediaView = hVar.d;
            if (mediaView != null) {
                X.c(mediaView);
                hVar.d.destroy();
                hVar.d = null;
            }
            hVar.c = null;
        }
        j jVar = this.b;
        if (jVar != null) {
            ImageView imageView = jVar.f12290a;
            if (imageView != null) {
                X.c(imageView);
                jVar.f12290a = null;
            }
            sg.bigo.ads.C.l lVar = jVar.b;
            if (lVar != null) {
                lVar.destroy();
                jVar.b = null;
            }
        }
    }

    public final void c() {
        j jVar;
        sg.bigo.ads.G.h hVar = this.e;
        if (hVar == null || (jVar = this.b) == null) {
            return;
        }
        ImageView imageView = jVar.f12290a;
        k kVar = this.f;
        int i = (kVar == null || kVar.c != 2) ? 3 : 1;
        if (hVar.b == null) {
            return;
        }
        AbstractC5446j.b(new sg.bigo.ads.G.a(hVar, AbstractC4944a.a(hVar.c, hVar.e(), hVar.b, true), imageView, i));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Ad ad) {
        Ad ad2 = ad;
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar != null) {
            return lVar.compareTo(ad2);
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.Ad
    public final void destroy() {
        destroyInMainThread();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void destroyInMainThread() {
        if (AbstractC5446j.e()) {
            b();
        } else {
            AbstractC5446j.a(2, new m(this));
        }
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar != null) {
            sg.bigo.ads.s1.b.a(lVar.e(), SystemClock.elapsedRealtime() - this.i);
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final AdBid getBid() {
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar != null) {
            return lVar.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getCreativeId() {
        sg.bigo.ads.C.l lVar = this.f12298a;
        return lVar != null ? lVar.getCreativeId() : "";
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getExtraInfo(String str) {
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar != null) {
            return lVar.getExtraInfo(str);
        }
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        sg.bigo.ads.G.h hVar = this.e;
        if (hVar != null) {
            return hVar.f();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.P.c getInnerBannerAdData() {
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar != null) {
            return lVar.e();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final C getWatermarkView() {
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar != null) {
            return lVar.getWatermarkView();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        sg.bigo.ads.G.h hVar = this.e;
        if (hVar != null) {
            return hVar.g();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(sg.bigo.ads.Q.c cVar) {
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar == null) {
            cVar.a(this, 1005, 1253, "native banner mNativeAd is null");
            return;
        }
        lVar.a(true);
        this.j = cVar;
        if (this.d == null) {
            this.d = new q(this, cVar);
        }
        a(1, 2);
        a(2, 2);
        a(3, 2);
        sg.bigo.ads.C.l lVar2 = this.f12298a;
        if (lVar2 != null) {
            lVar2.X = this;
            lVar2.a(this.d.b, 0);
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar != null) {
            return ((sg.bigo.ads.U0.b) lVar.k.f12482a).a();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar != null) {
            return ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).Y0;
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.P.c cVar) {
        if (cVar instanceof InterfaceC5087a) {
            ((sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar)).Y0 = true;
        }
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar != null) {
            lVar.y();
        }
    }

    @Override // sg.bigo.ads.api.Ad
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.k.f12294a = adInteractionListener;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar == null) {
            return 0;
        }
        int i = lVar.h + 1;
        lVar.h = i;
        return i;
    }

    public final void a(int i, int i2) {
        Integer valueOf;
        String str;
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar == null) {
            return;
        }
        if (i == 1) {
            valueOf = Integer.valueOf(i2);
            str = "icon_sta";
        } else {
            if (i != 2) {
                if (i == 3 && (lVar instanceof sg.bigo.ads.D.g)) {
                    Integer valueOf2 = Integer.valueOf(i2);
                    synchronized (lVar) {
                        lVar.N.put("vid_sta", valueOf2);
                    }
                    return;
                }
                return;
            }
            valueOf = Integer.valueOf(i2);
            str = "img_sta";
        }
        lVar.a(str, valueOf);
    }

    public final synchronized void a(sg.bigo.ads.Q.c cVar, int i, boolean z) {
        Boolean bool;
        if (cVar == null) {
            return;
        }
        if (this.c.booleanValue()) {
            return;
        }
        k kVar = this.f;
        int i2 = 2;
        if (kVar != null && kVar.f12291a == 2 && i == 2) {
            c();
            cVar.a(this);
            this.c = Boolean.TRUE;
            return;
        }
        sg.bigo.ads.C.l lVar = this.f12298a;
        if (lVar != null && ((sg.bigo.ads.U0.k) ((InterfaceC5087a) lVar.e())).p()) {
            i2 = 3;
        }
        if (!z) {
            if (this.g == i2 || this.h) {
                if (this.h) {
                    cVar.a(this, 1005, 1006, "native banner VAST parse failed");
                } else {
                    cVar.a(this, 1005, 1253, "native banner download icon & main resources all failed");
                }
                bool = Boolean.TRUE;
            }
        }
        c();
        cVar.a(this);
        bool = Boolean.TRUE;
        this.c = bool;
    }
}

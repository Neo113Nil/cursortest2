package sg.bigo.ads.f;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.InterfaceC4394ee;
import sg.bigo.ads.K0.Q;
import sg.bigo.ads.K0.X;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.f.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5095H extends sg.bigo.ads.e.h implements InnerBannerAd {
    public InnerBannerAd Q;
    public FrameLayout R;
    public sg.bigo.ads.P.j S;
    public final C5094G T;
    public sg.bigo.ads.Z0.l U;
    public C5088A V;
    public final C5092E W;

    public C5095H(sg.bigo.ads.P.j jVar) {
        super(jVar);
        this.W = new C5092E(this);
        sg.bigo.ads.T0.p pVar = jVar.b;
        if (pVar.v != 3 && pVar.j) {
            C5094G c5094g = new C5094G(this);
            this.T = c5094g;
            int i = jVar.b.k;
            if (i >= 10) {
                c5094g.f12759a = i * 1000;
            }
        }
        InnerBannerAd a2 = AbstractC5112q.a(jVar);
        this.Q = a2;
        if (a2 == null) {
            throw new IllegalArgumentException("UnifiedBannerWrapper Illegal adx type.");
        }
    }

    @Override // sg.bigo.ads.Q.b, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(Ad ad) {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            return innerBannerAd.compareTo(ad);
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final View adView() {
        if (!AbstractC5446j.e() && Q.f12348a) {
            throw new IllegalArgumentException("adView() must run on UI thread");
        }
        if (isExpired()) {
            b(2000, 1, "The ad is expired.");
            return null;
        }
        if (this.u) {
            b(2000, 1, "The ad is destroyed.");
            return null;
        }
        FrameLayout frameLayout = this.R;
        return frameLayout != null ? frameLayout : y();
    }

    @Override // sg.bigo.ads.e.h
    public final void destroyInMainThread() {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            innerBannerAd.destroy();
        }
        C5094G c5094g = this.T;
        if (c5094g != null) {
            c5094g.b.removeCallbacksAndMessages(null);
        }
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.Q.b
    public final sg.bigo.ads.P.c e() {
        return getInnerBannerAdData();
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.api.Ad
    public final AdBid getBid() {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            return innerBannerAd.getBid();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getCreativeId() {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            return innerBannerAd.getCreativeId();
        }
        return null;
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.api.Ad
    public final String getExtraInfo(String str) {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            return innerBannerAd.getExtraInfo(str);
        }
        return null;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            return innerBannerAd.getHeight();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.P.c getInnerBannerAdData() {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            return innerBannerAd.getInnerBannerAdData();
        }
        return null;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.L0.C getWatermarkView() {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd == null) {
            return null;
        }
        return innerBannerAd.getWatermarkView();
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd == null) {
            return null;
        }
        return innerBannerAd.getWebView();
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            return innerBannerAd.getWidth();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(sg.bigo.ads.Q.c cVar) {
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            return innerBannerAd.isExpired();
        }
        return false;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            return innerBannerAd.isInnerBannerAdFromAutoRefresh();
        }
        return false;
    }

    @Override // sg.bigo.ads.Q.b
    public final int l() {
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            return innerBannerAd.updateFormOpenTimes();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.P.c cVar) {
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.api.Ad
    public final void setAdInteractionListener(AdInteractionListener adInteractionListener) {
        this.j = adInteractionListener;
        C5092E c5092e = this.W;
        c5092e.f12757a = adInteractionListener;
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            innerBannerAd.setAdInteractionListener(c5092e);
        }
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        return 0;
    }

    public final FrameLayout y() {
        if (this.R == null) {
            this.R = new FrameLayout(this.k.e);
        }
        if (this.Q == null) {
            return null;
        }
        this.R.removeAllViews();
        X.a(this.Q.adView(), this.R, null, -1);
        sg.bigo.ads.L0.C.a(this.k.e, this.R, getWatermarkView());
        return this.R;
    }

    @Override // sg.bigo.ads.e.h, sg.bigo.ads.Q.b
    public final void a(sg.bigo.ads.Q.c cVar) {
        if (this.U == null) {
            this.U = ((sg.bigo.ads.Z0.g) cVar).d;
        }
        sg.bigo.ads.Z0.g gVar = (sg.bigo.ads.Z0.g) cVar;
        C5088A c5088a = new C5088A(this, gVar);
        this.V = c5088a;
        InnerBannerAd innerBannerAd = this.Q;
        if (innerBannerAd != null) {
            innerBannerAd.handleInnerBannerAdResponse(c5088a);
        } else {
            gVar.a(this, 1005, InterfaceC4394ee.c.d, "banner adx_type error");
        }
    }
}

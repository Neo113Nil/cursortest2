package sg.bigo.ads.f;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.InterfaceC4394ee;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class v extends sg.bigo.ads.e.m implements InnerBannerAd {
    public final C5111p S;
    public FrameLayout T;
    public final boolean U;
    public boolean V;
    public final AtomicBoolean W;
    public boolean X;
    public final AdError[] Y;
    public boolean Z;

    public v(sg.bigo.ads.P.j jVar) {
        super(jVar);
        C5111p c5111p;
        AdError[] adErrorArr = new AdError[1];
        this.Y = adErrorArr;
        this.Z = false;
        this.W = new AtomicBoolean(false);
        if (((sg.bigo.ads.U0.b) jVar.f12482a).k == 3) {
            try {
                sg.bigo.ads.U0.c cVar = (sg.bigo.ads.U0.c) this.k.f12482a;
                boolean a2 = cVar.a(32);
                this.U = a2;
                Context context = this.k.e;
                int a3 = jVar.c.a();
                c5111p = new C5111p(context, jVar, this, cVar, (a3 == 3 || a3 == 4) ? 2 : 1, new C5113r(this), a2);
            } catch (Exception unused) {
                adErrorArr[0] = new AdError(InterfaceC4394ee.c.d, "Unable to init banner ad due to invalid ad data");
                c5111p = null;
            }
            this.S = c5111p;
        }
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final View adView() {
        C5111p c5111p = this.S;
        if (c5111p == null) {
            return null;
        }
        if (!c5111p.w && c5111p != null) {
            AbstractC5446j.b(new u(this, new t((sg.bigo.ads.U0.c) this.k.f12482a, SystemClock.elapsedRealtime())));
        }
        View a2 = this.S.a();
        if (this.T == null) {
            this.T = new FrameLayout(a2.getContext());
        }
        this.T.removeAllViews();
        this.T.addView(a2);
        if (!this.q) {
            this.q = true;
            this.A = SystemClock.elapsedRealtime();
        }
        this.R.a(this.T, this.Z);
        return this.T;
    }

    @Override // sg.bigo.ads.e.h
    public final void destroyInMainThread() {
        sg.bigo.ads.e.l lVar = this.R;
        AbstractC5446j.a(lVar.k);
        lVar.j = false;
        C5111p c5111p = this.S;
        if (c5111p != null) {
            if (AbstractC5446j.e()) {
                c5111p.b();
            } else {
                AbstractC5446j.a(2, null, new RunnableC5104i(c5111p), 0L);
            }
        }
        if (!this.X) {
            this.X = true;
        }
        AbstractC5446j.a(3, new s(this));
        sg.bigo.ads.s1.b.a(this.k.f12482a, SystemClock.elapsedRealtime() - this.w);
    }

    @Override // sg.bigo.ads.api.Ad
    public final String getCreativeId() {
        sg.bigo.ads.U0.c cVar;
        C5111p c5111p = this.S;
        return (c5111p == null || (cVar = c5111p.m) == null) ? "" : cVar.n;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getHeight() {
        sg.bigo.ads.U0.g gVar;
        int i;
        C5111p c5111p = this.S;
        if (c5111p == null) {
            return 0;
        }
        sg.bigo.ads.U0.c cVar = c5111p.m;
        return (cVar == null || (gVar = cVar.x0) == null || gVar.f12571a <= 0 || (i = gVar.b) <= 0) ? c5111p.c().getHeight() : i;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.P.c getInnerBannerAdData() {
        return this.k.f12482a;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final sg.bigo.ads.L0.C getWatermarkView() {
        C5111p c5111p = this.S;
        if (c5111p == null) {
            return null;
        }
        return c5111p.x;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final WebView getWebView() {
        C5111p c5111p = this.S;
        if (c5111p == null) {
            return null;
        }
        return c5111p.b;
    }

    @Override // sg.bigo.ads.api.BannerAd
    public final int getWidth() {
        sg.bigo.ads.U0.g gVar;
        int i;
        C5111p c5111p = this.S;
        if (c5111p == null) {
            return 0;
        }
        sg.bigo.ads.U0.c cVar = c5111p.m;
        return (cVar == null || (gVar = cVar.x0) == null || (i = gVar.f12571a) <= 0 || gVar.b <= 0) ? c5111p.c().getWidth() : i;
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void handleInnerBannerAdResponse(sg.bigo.ads.Q.c cVar) {
        AdError adError;
        boolean z;
        String str;
        String str2;
        boolean z2 = false;
        this.X = false;
        if (this.S == null) {
            AdError[] adErrorArr = this.Y;
            adError = adErrorArr[0];
            if (adError != null) {
                adErrorArr[0] = null;
            } else {
                adError = new AdError(InterfaceC4394ee.a.b, "Failed to create html ads.");
            }
        } else {
            try {
                sg.bigo.ads.U0.g gVar = ((sg.bigo.ads.U0.c) this.k.f12482a).x0;
                if (gVar != null && !TextUtils.isEmpty(gVar.c)) {
                    adError = null;
                }
                adError = new AdError(InterfaceC4394ee.a.c, "Empty content.");
            } catch (Exception unused) {
                adError = new AdError(InterfaceC4394ee.c.d, "BannerAd with invalid AdData class type.");
            }
        }
        if (adError != null) {
            cVar.a(this, 1005, adError.getCode(), adError.getMessage());
            return;
        }
        sg.bigo.ads.U0.d dVar = this.S.m.y0;
        if (dVar != null && dVar.f12569a) {
            try {
                z = ((sg.bigo.ads.U0.c) this.k.f12482a).z0;
            } catch (Exception unused2) {
                z = false;
            }
            if (!z) {
                try {
                    sg.bigo.ads.U0.c cVar2 = (sg.bigo.ads.U0.c) this.k.f12482a;
                    this.S.getClass();
                    x xVar = w.f12778a;
                    xVar.getClass();
                    if (!((sg.bigo.ads.U0.b) this.k.f12482a).a() && !this.s && !this.u) {
                        synchronized (xVar.f12779a) {
                            Iterator it = xVar.f12779a.iterator();
                            while (it.hasNext()) {
                                sg.bigo.ads.e.h hVar = (sg.bigo.ads.e.h) ((WeakReference) it.next()).get();
                                if (hVar == this) {
                                    z2 = true;
                                } else if (hVar == null || hVar.isExpired() || hVar.t() || hVar.u) {
                                    it.remove();
                                }
                            }
                            if (!z2 && xVar.f12779a.size() < 3) {
                                xVar.f12779a.add(new WeakReference(this));
                                this.X = true;
                                cVar2.A0 = true;
                                if (this.S != null) {
                                    t tVar = new t((sg.bigo.ads.U0.c) this.k.f12482a, SystemClock.elapsedRealtime());
                                    C5111p c5111p = this.S;
                                    c5111p.getClass();
                                    AbstractC5446j.a(2, null, new RunnableC5103h(c5111p, tVar), 0L);
                                }
                            }
                        }
                    }
                    str = "BannerAd";
                    str2 = "Banner preload limit 3 BannerAds.";
                } catch (Exception unused3) {
                    str = "BannerAd";
                    str2 = "Banner preload, not BannerAdData type.";
                }
                AbstractC5496a.b(str, str2);
            }
        }
        cVar.a(this);
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final boolean isInnerBannerAdFromAutoRefresh() {
        try {
            return ((sg.bigo.ads.U0.c) this.k.f12482a).z0;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final void markFromAutoFresh(sg.bigo.ads.P.c cVar) {
        this.Z = true;
        if (cVar instanceof sg.bigo.ads.U0.c) {
            ((sg.bigo.ads.U0.c) cVar).z0 = true;
        }
        y();
    }

    @Override // sg.bigo.ads.e.h
    public final void u() {
        C5111p c5111p = this.S;
        if (c5111p != null) {
            AbstractC5098c.a(c5111p, 6);
            Ad ad = c5111p.l;
            if (ad instanceof v) {
                v vVar = (v) ad;
                WeakHashMap weakHashMap = AbstractC5098c.f12761a;
                C5096a c5096a = (C5096a) weakHashMap.get(c5111p);
                if (c5096a == null) {
                    c5096a = new C5096a();
                    weakHashMap.put(c5111p, c5096a);
                }
                long[] jArr = c5096a.f12760a;
                Long valueOf = Long.valueOf(jArr[6] - jArr[4]);
                synchronized (vVar) {
                    vVar.N.put("attach_render_cost", valueOf);
                }
            }
        }
        super.u();
        C5111p c5111p2 = this.S;
        if (c5111p2 != null) {
            c5111p2.e();
        }
        if (!this.X) {
            this.X = true;
        }
        AbstractC5446j.a(3, new s(this));
    }

    @Override // sg.bigo.ads.api.InnerBannerAd
    public final int updateFormOpenTimes() {
        int i = this.h + 1;
        this.h = i;
        return i;
    }

    @Override // sg.bigo.ads.e.h
    public final void w() {
        a("clicked");
        z();
    }

    @Override // sg.bigo.ads.e.h
    public final void x() {
        if (!this.U || this.V) {
            z();
        }
    }

    public final void z() {
        if (this.W.compareAndSet(false, true)) {
            a("impression");
        }
    }
}

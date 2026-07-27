package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.w1;
import com.fyber.inneractive.sdk.web.i0;
import com.iab.omid.library.fyber.adsession.AdSession;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class v extends p0 implements com.fyber.inneractive.sdk.rtb.watermark.a {
    public w1 F;
    public com.fyber.inneractive.sdk.external.f J;
    public com.fyber.inneractive.sdk.util.viewtime.b K;
    public u x;
    public IAmraidWebViewController z;
    public boolean y = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public UnitDisplayType G = UnitDisplayType.INTERSTITIAL;
    public boolean H = false;
    public boolean I = false;

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean I() {
        return !this.C && this.z.X;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int K() {
        Integer a2;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null) {
            return -1;
        }
        q0 q0Var = (q0) xVar;
        if (q0Var.c == null || q0Var.c.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (a2 = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.b).c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_clickable_area_dp")) == null) {
            return -1;
        }
        return a2.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int L() {
        Integer a2;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null) {
            return -1;
        }
        q0 q0Var = (q0) xVar;
        if (q0Var.c == null || q0Var.c.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (a2 = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.b).c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_visible_size_dp")) == null) {
            return -1;
        }
        return a2.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long M() {
        int i;
        com.fyber.inneractive.sdk.response.e eVar;
        x0 x0Var;
        int i2 = 5;
        if (this.G == UnitDisplayType.REWARDED) {
            IAmraidWebViewController iAmraidWebViewController = this.z;
            if (iAmraidWebViewController != null) {
                synchronized (i0.s0) {
                    x0Var = iAmraidWebViewController.q0;
                }
            } else {
                x0Var = x0.c;
            }
            i = x0Var.a() ? x0Var.f5419a : IAConfigManager.R.u.b.a("rewarded_mraid_delay", 31, 30);
            IAlog.a("%sGetting rewarded total delay of %d seconds", IAlog.a(this), Integer.valueOf(i));
        } else {
            x0 O = O();
            if (O.a()) {
                i = O.f5419a;
            } else {
                com.fyber.inneractive.sdk.config.v vVar = IAConfigManager.R.u;
                if (vVar == null) {
                    i = 5;
                } else {
                    com.fyber.inneractive.sdk.config.r rVar = vVar.b;
                    int b = rVar.b("mraid_x_delay_v2", 5, 0);
                    com.fyber.inneractive.sdk.config.o a2 = rVar.a("int_configuration");
                    if (a2 == null || !a2.f5272a.containsKey("close_d")) {
                        if (this.G == UnitDisplayType.INTERSTITIAL) {
                            CreativeType creativeType = CreativeType.PLAYABLE;
                            com.fyber.inneractive.sdk.flow.x xVar = this.b;
                            if (creativeType.equals((xVar == null || (eVar = ((q0) xVar).b) == null) ? null : ((com.fyber.inneractive.sdk.response.f) eVar).J)) {
                                i = rVar.b("d_ad_int_pl", b, 5);
                            }
                        }
                        i = b;
                    } else {
                        if (a2.f5272a.containsKey("close_d")) {
                            i = Integer.parseInt((String) a2.f5272a.get("close_d"));
                            if (i >= 0 || i > 30) {
                                i = 5;
                            }
                            this.t = true;
                        }
                        i = 5;
                        if (i >= 0) {
                        }
                        i = 5;
                        this.t = true;
                    }
                }
            }
        }
        if (InneractiveAdManager.isCurrentUserAChild()) {
            if (A()) {
                Integer a3 = ((com.fyber.inneractive.sdk.config.global.features.c) ((q0) this.b).c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).a("skip_time_sec");
                int intValue = a3 != null ? a3.intValue() : 5;
                if (intValue >= 0 && intValue <= 8) {
                    i2 = intValue;
                }
            } else {
                i2 = Math.min(i, 5);
            }
            i = Math.min(i2, i);
        }
        return i * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean N() {
        return false;
    }

    public final x0 O() {
        x0 x0Var;
        IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController == null) {
            return x0.c;
        }
        synchronized (i0.s0) {
            x0Var = iAmraidWebViewController.q0;
        }
        return x0Var;
    }

    public final void Q() {
        IAmraidWebViewController iAmraidWebViewController;
        if (this.b == null || (iAmraidWebViewController = this.z) == null) {
            IAlog.a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController.b;
        if (mVar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            mVar.setLayoutParams(layoutParams);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) {
        x0 x0Var;
        com.fyber.inneractive.sdk.config.x0 x0Var2;
        super.a(eVar, activity);
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        com.fyber.inneractive.sdk.config.q0 q0Var = (xVar == null || (x0Var2 = ((q0) xVar).d) == null) ? null : ((w0) x0Var2).c;
        if (q0Var == null) {
            IAlog.f("%sNo display config for full screen mraid ad renderer! Cannot render", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
        }
        IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((q0) xVar).i : null;
        this.z = iAmraidWebViewController;
        if (iAmraidWebViewController == null || iAmraidWebViewController.b == null) {
            IAlog.f("%sWeb view controller content is not valid. Web view might have crashed", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Web view could not be loaded");
        }
        ((q0) xVar).e();
        this.G = q0Var.b;
        this.A = false;
        this.B = false;
        this.K = new com.fyber.inneractive.sdk.util.viewtime.b(this.f5328a);
        this.k = eVar;
        if (this.z == null) {
            IAlog.f("InneractiveFullscreenMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.b);
            return;
        }
        View closeButton = eVar.getCloseButton();
        if (closeButton != null) {
            this.z.a(closeButton, com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton);
        }
        com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) ((q0) this.b).b;
        int i = fVar.e;
        int i2 = fVar.f;
        boolean z = (i == 300 && i2 == 250) || (i == 600 && i2 == 500);
        this.C = z;
        if (z) {
            this.z.setAdDefaultSize(com.fyber.inneractive.sdk.util.o.a(i), com.fyber.inneractive.sdk.util.o.a(i2));
        }
        if (this.x == null) {
            this.x = new u(this);
        }
        this.z.setListener(this.x);
        InneractiveAdSpot inneractiveAdSpot = this.f5328a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && activity != null) {
            com.fyber.inneractive.sdk.flow.x adContent = this.f5328a.getAdContent();
            com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(activity, false, adContent.f5418a, adContent.b, adContent.c);
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.ia_identifier_overlay);
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = gVar.d;
            iFyberAdIdentifier.k = corner;
            iFyberAdIdentifier.a(viewGroup);
            viewGroup.setVisibility(0);
            this.z.a(viewGroup, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
        }
        Q();
        IAmraidWebViewController iAmraidWebViewController2 = this.z;
        ViewGroup layout = this.k.getLayout();
        InneractiveAdRequest inneractiveAdRequest = ((q0) this.b).f5418a;
        com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController2.b;
        if (mVar != null) {
            layout.addView(mVar);
            l0.f5956a.a(layout.getContext(), iAmraidWebViewController2.b, iAmraidWebViewController2);
            com.fyber.inneractive.sdk.web.m mVar2 = iAmraidWebViewController2.b;
            if (mVar2 != null) {
                mVar2.setTapListener(iAmraidWebViewController2);
            }
        }
        this.A = true;
        if (this.G == UnitDisplayType.REWARDED) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            IAmraidWebViewController iAmraidWebViewController3 = this.z;
            if (iAmraidWebViewController3 != null) {
                synchronized (i0.s0) {
                    x0Var = iAmraidWebViewController3.q0;
                }
            } else {
                x0Var = x0.c;
            }
            w1 w1Var = new w1(timeUnit, x0Var.a() ? x0Var.f5419a : IAConfigManager.R.u.b.a("rewarded_mraid_delay", 31, 30));
            this.F = w1Var;
            w1Var.e = new t(this);
            w1Var.d = false;
            w1Var.c.sendEmptyMessage(1932593528);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        InneractiveUnitController.EventsListener eventsListener;
        if (this.A && !this.B && (eventsListener = this.c) != null) {
            this.B = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f5328a);
        }
        this.x = null;
        w1 w1Var = this.F;
        if (w1Var != null) {
            w1Var.e = null;
            this.F = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController == null || (eVar = iAmraidWebViewController.I) == null) {
            return;
        }
        try {
            AdSession adSession = eVar.f5445a;
            if (adSession == null || view == null) {
                return;
            }
            adSession.removeFriendlyObstruction(view);
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void k() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        InneractiveUnitController.EventsListener eventsListener;
        if (this.G == UnitDisplayType.REWARDED && this.H) {
            P();
        }
        if (!this.B && (eventsListener = this.c) != null) {
            this.B = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f5328a);
        }
        com.fyber.inneractive.sdk.util.viewtime.b bVar = this.K;
        if (bVar != null && bVar.c != 0) {
            String a2 = com.fyber.inneractive.sdk.util.c0.a(System.currentTimeMillis(), bVar.c, bVar.e);
            InneractiveAdSpot inneractiveAdSpot = bVar.b;
            com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.INTERSTITIAL_VIEW_TIME;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f5418a : null;
            com.fyber.inneractive.sdk.response.e eVar = adContent != null ? adContent.b : null;
            JSONArray b = (adContent == null || (rVar = adContent.c) == null) ? null : rVar.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
            wVar.c = uVar;
            wVar.f5514a = inneractiveAdRequest;
            wVar.d = b;
            wVar.a("time", a2);
            wVar.a((String) null);
            bVar.c = 0L;
            bVar.d = 0L;
            bVar.e = 0L;
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f5328a;
        if (inneractiveAdSpot2 == null || !(inneractiveAdSpot2 instanceof com.fyber.inneractive.sdk.flow.i0)) {
            return;
        }
        ((com.fyber.inneractive.sdk.flow.i0) inneractiveAdSpot2).a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void m() {
        w1 w1Var;
        w1 w1Var2 = this.m;
        if (w1Var2 != null) {
            w1Var2.d = false;
            w1Var2.a(SystemClock.uptimeMillis());
        }
        w1 w1Var3 = this.o;
        if (w1Var3 != null) {
            w1Var3.d = false;
            w1Var3.a(SystemClock.uptimeMillis());
        }
        if (this.G == UnitDisplayType.REWARDED && (w1Var = this.F) != null) {
            w1Var.d = false;
            w1Var.a(SystemClock.uptimeMillis());
        }
        com.fyber.inneractive.sdk.util.viewtime.b bVar = this.K;
        if (bVar != null) {
            if (bVar.c == 0) {
                bVar.c = System.currentTimeMillis();
            }
            if (bVar.d > 0) {
                bVar.e += System.currentTimeMillis() - bVar.d;
                bVar.d = 0L;
            }
        }
        this.v.a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void r() {
        w1 w1Var;
        w1 w1Var2 = this.m;
        if (w1Var2 != null) {
            w1Var2.d = true;
            u1 u1Var = w1Var2.c;
            if (u1Var != null) {
                u1Var.removeMessages(1932593528);
            }
        }
        w1 w1Var3 = this.o;
        if (w1Var3 != null) {
            w1Var3.d = true;
            u1 u1Var2 = w1Var3.c;
            if (u1Var2 != null) {
                u1Var2.removeMessages(1932593528);
            }
        }
        if (this.G == UnitDisplayType.REWARDED && (w1Var = this.F) != null) {
            w1Var.d = true;
            u1 u1Var3 = w1Var.c;
            if (u1Var3 != null) {
                u1Var3.removeMessages(1932593528);
            }
        }
        com.fyber.inneractive.sdk.util.viewtime.b bVar = this.K;
        if (bVar != null) {
            bVar.d = System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar = this.v;
        if (aVar.b && aVar.e == 0) {
            aVar.e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean u() {
        boolean z;
        if (this.k == null) {
            z = true;
        } else if (this.G == UnitDisplayType.REWARDED) {
            if (this.H) {
                P();
            }
            z = this.H;
        } else {
            z = this.p;
        }
        if (!z) {
            return true;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.k;
        if (eVar == null) {
            return false;
        }
        eVar.dismissAd(true);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context w() {
        IAmraidWebViewController iAmraidWebViewController = this.z;
        return c(iAmraidWebViewController != null ? iAmraidWebViewController.b : null);
    }

    public final void P() {
        WeakReference weakReference;
        IAlog.a("%sprovide reward called", IAlog.a(this));
        if (this.I) {
            IAlog.a("%sreward was already provided", IAlog.a(this));
            return;
        }
        IAlog.a("%sreward sent", IAlog.a(this));
        if (this.J != null) {
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION;
            com.fyber.inneractive.sdk.cache.session.enums.c cVar = com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY;
            com.fyber.inneractive.sdk.cache.session.e eVar = IAConfigManager.R.x.f5237a;
            if (eVar != null) {
                com.fyber.inneractive.sdk.util.r.f5965a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
            }
            com.fyber.inneractive.sdk.external.f fVar = this.J;
            weakReference = ((s0) fVar.f5316a).mAdSpot;
            com.fyber.inneractive.sdk.flow.i0 i0Var = (com.fyber.inneractive.sdk.flow.i0) com.fyber.inneractive.sdk.util.v.a(weakReference);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = fVar.f5316a.b;
            if (inneractiveFullScreenAdRewardedListener != null && i0Var != null) {
                inneractiveFullScreenAdRewardedListener.onAdRewarded(i0Var);
            }
        }
        IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController == null || !iAmraidWebViewController.D) {
            H();
        }
        this.I = true;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void b(boolean z) {
        if (!I()) {
            if (z) {
                this.v.a((String) null);
            } else {
                com.fyber.inneractive.sdk.util.a aVar = this.v;
                aVar.d = 0L;
                aVar.e = 0L;
                aVar.f = 0L;
                aVar.b = false;
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.k;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
        Q();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j) {
        if (this.G == UnitDisplayType.REWARDED) {
            return 0L;
        }
        if (this.t) {
            return j;
        }
        long j2 = 13;
        try {
            j2 = Long.parseLong(IAConfigManager.R.u.b.a("mraid_x_fallback_delay", Long.toString(13L)));
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.f fVar) {
        this.J = fVar;
    }

    @Override // com.fyber.inneractive.sdk.rtb.watermark.a
    public final void a(FrameLayout frameLayout) {
        IAmraidWebViewController iAmraidWebViewController = this.z;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(frameLayout, com.fyber.inneractive.sdk.measurement.tracker.d.Watermark);
        }
    }
}

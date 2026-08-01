package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.c1;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.y0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.m0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.player.controller.g0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.w1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class x extends p0 implements g0, com.fyber.inneractive.sdk.flow.storepromo.observer.a, com.fyber.inneractive.sdk.rtb.watermark.a {
    public WeakReference A;
    public com.fyber.inneractive.sdk.external.f E;
    public f0 G;
    public com.fyber.inneractive.sdk.util.viewtime.c M;
    public com.fyber.inneractive.sdk.interfaces.e x;
    public com.fyber.inneractive.sdk.player.ui.m y;
    public com.fyber.inneractive.sdk.player.controller.b z;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public UnitDisplayType F = UnitDisplayType.INTERSTITIAL;
    public boolean H = false;
    public final w I = new w(this);
    public final RelativeLayout.LayoutParams J = new RelativeLayout.LayoutParams(-1, -1);
    public boolean K = false;
    public boolean L = false;

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean B() {
        com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
        return mVar != null && mVar.b();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void G() {
        View view = this.j;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean I() {
        return this.K;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int K() {
        Integer a2;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null) {
            return -1;
        }
        t0 t0Var = (t0) xVar;
        if (t0Var.c == null || (a2 = ((com.fyber.inneractive.sdk.config.global.features.s) t0Var.c.a(com.fyber.inneractive.sdk.config.global.features.s.class)).a("close_clickable_area_dp")) == null) {
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
        t0 t0Var = (t0) xVar;
        if (t0Var.c == null || (a2 = ((com.fyber.inneractive.sdk.config.global.features.s) t0Var.c.a(com.fyber.inneractive.sdk.config.global.features.s.class)).a("close_visible_size_dp")) == null) {
            return -1;
        }
        return a2.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long M() {
        int a2;
        long j;
        f0 f0Var;
        boolean a3 = x0.a(P()).a();
        if (InneractiveAdManager.isCurrentUserAChild() && !a3) {
            if (A()) {
                Integer a4 = ((com.fyber.inneractive.sdk.config.global.features.c) ((t0) this.b).c.a(com.fyber.inneractive.sdk.config.global.features.c.class)).a("end_card_skip_time_sec");
                int intValue = a4 != null ? a4.intValue() : 0;
                if (intValue < 0 || intValue > 5) {
                    intValue = 0;
                }
                if (intValue > 0) {
                    IAlog.a("%s: overriding endcard dismiss time with child mode with %d", IAlog.a(this), Integer.valueOf(intValue));
                    return intValue;
                }
            }
            IAlog.a("%s: overriding endcard dismiss time with child mode with %d", IAlog.a(this), 0);
            return 0L;
        }
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.z;
        if (bVar == null && (f0Var = this.G) != null) {
            bVar = f0Var.f5894a;
        }
        com.fyber.inneractive.sdk.flow.endcard.k j2 = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        if (j2 != null) {
            com.fyber.inneractive.sdk.flow.endcard.b a5 = j2.g.get() ? j2.b.a() : j2.a();
            a2 = a5 != null ? a5.f : j2.f;
        } else {
            String str = com.fyber.inneractive.sdk.flow.endcard.h.d;
            a2 = IAConfigManager.R.u.b.a("vast_endcard_x_delay", 5, 0);
        }
        long j3 = a2;
        if (x0.a(P()).f5419a >= 0 && j3 < 0) {
            j3 = 0;
        }
        com.fyber.inneractive.sdk.config.o a6 = IAConfigManager.R.u.b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        if (!a3 && !InneractiveAdManager.isCurrentUserAChild()) {
            if (a6.f5272a.containsKey("endcard_cr") || a6.f5272a.containsKey("endcard_ci")) {
                String str2 = this.F != UnitDisplayType.REWARDED ? "endcard_ci" : "endcard_cr";
                if (a6.f5272a.containsKey(str2)) {
                    j = Long.parseLong((String) a6.f5272a.get(str2));
                    if (j >= 0 && j <= 5) {
                        IAlog.a("%s : overriding endcard dismiss time for type: %s with: %d sec.", IAlog.a(this), this.F, Long.valueOf(j));
                        this.t = true;
                        j3 = j;
                    }
                }
                j = j3;
                if (j >= 0) {
                    IAlog.a("%s : overriding endcard dismiss time for type: %s with: %d sec.", IAlog.a(this), this.F, Long.valueOf(j));
                    this.t = true;
                    j3 = j;
                }
            }
        }
        return j3 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean N() {
        com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
        return mVar != null && mVar.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r1.b <= (-1)) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        if (this.C || this.c == null) {
            return;
        }
        this.C = true;
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null) {
            if (!eVar.wasDismissedByUser() && !IAConfigManager.R.u.b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).a()) {
                x0 a2 = x0.a(P());
                if (a2.f5419a >= 0) {
                }
            }
            com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLOSE;
            com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
            if (xVar2 != null) {
                t0 t0Var = (t0) xVar2;
                if (t0Var.i != null) {
                    String[] strArr = {xVar.a()};
                    com.fyber.inneractive.sdk.player.t tVar = t0Var.i;
                    if (tVar != null) {
                        tVar.a("EVENT_TRACKING", strArr);
                    }
                }
            }
            com.fyber.inneractive.sdk.model.vast.x xVar3 = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLOSE_LINEAR;
            com.fyber.inneractive.sdk.flow.x xVar4 = this.b;
            if (xVar4 != null) {
                t0 t0Var2 = (t0) xVar4;
                if (t0Var2.i != null) {
                    String[] strArr2 = {xVar3.a()};
                    com.fyber.inneractive.sdk.player.t tVar2 = t0Var2.i;
                    if (tVar2 != null) {
                        tVar2.a("EVENT_TRACKING", strArr2);
                    }
                }
            }
        }
        ((InneractiveFullscreenAdEventsListener) this.c).onAdDismissed(this.f5328a);
    }

    public final com.fyber.inneractive.sdk.player.n P() {
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
            t0 t0Var = (t0) xVar;
            if (t0Var.i != null && (t0Var.i.f instanceof com.fyber.inneractive.sdk.player.n)) {
                return (com.fyber.inneractive.sdk.player.n) t0Var.i.f;
            }
        }
        return null;
    }

    public final void Q() {
        com.fyber.inneractive.sdk.config.x0 x0Var;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null || (x0Var = ((t0) xVar).d) == null) {
            return;
        }
        w0 w0Var = (w0) x0Var;
        if (w0Var.c != null) {
            UnitDisplayType unitDisplayType = w0Var.c.b;
            c1 c1Var = IAConfigManager.R.x;
            com.fyber.inneractive.sdk.cache.session.enums.c cVar = unitDisplayType == UnitDisplayType.REWARDED ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO;
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
            com.fyber.inneractive.sdk.cache.session.e eVar = c1Var.f5237a;
            if (eVar != null) {
                com.fyber.inneractive.sdk.util.r.f5965a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        boolean booleanValue;
        Boolean c;
        com.fyber.inneractive.sdk.config.global.r rVar;
        f0 f0Var;
        IAConfigManager iAConfigManager = IAConfigManager.R;
        com.fyber.inneractive.sdk.config.r rVar2 = iAConfigManager.u.b;
        rVar2.getClass();
        String str = iAConfigManager.d;
        if ((rVar2.b.containsKey(str) ? (com.fyber.inneractive.sdk.config.p) rVar2.b.get(str) : new com.fyber.inneractive.sdk.config.p()).f5274a.containsKey(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
            return false;
        }
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.z;
        if (bVar == null && (f0Var = this.G) != null) {
            bVar = f0Var.f5894a;
        }
        com.fyber.inneractive.sdk.config.global.features.v vVar = null;
        com.fyber.inneractive.sdk.flow.endcard.k j = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        com.fyber.inneractive.sdk.flow.endcard.b a2 = j != null ? j.b.a() : null;
        if (a2 == null || a2.i() != com.fyber.inneractive.sdk.model.vast.i.Static) {
            return false;
        }
        com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
        if (xVar2 != null && (rVar = ((t0) xVar2).c) != null) {
            vVar = (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class);
        }
        UnitDisplayType unitDisplayType = this.F;
        vVar.getClass();
        int i = com.fyber.inneractive.sdk.config.global.features.t.f5254a[unitDisplayType.ordinal()];
        if (i == 1) {
            Boolean c2 = vVar.c("countdown_rv");
            if (c2 == null) {
                return false;
            }
            booleanValue = c2.booleanValue();
        } else {
            if (i != 2 || (c = vVar.c("countdown_iv")) == null) {
                return false;
            }
            booleanValue = c.booleanValue();
        }
        return booleanValue;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void c() {
        if (!this.D) {
            this.u.a(true);
        }
        this.D = true;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null) {
            eVar.destroy();
        }
        if (this.B) {
            O();
        }
        com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.z) bVar).b(this);
            this.z.destroy();
            this.z = null;
        }
        com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
        if (mVar != null) {
            mVar.destroy();
            this.y = null;
        }
        this.x = null;
        this.A = null;
        this.M = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void e() {
        Q();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void f() {
        this.K = true;
        m0 m0Var = this.w;
        if (m0Var != null) {
            m0Var.cancel();
            this.w = null;
        }
        if (!this.s) {
            this.s = true;
            com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
            if (eVar != null) {
                d(eVar.isCloseButtonDisplay());
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar2 = this.x;
        if (eVar2 == null || !eVar2.isCloseButtonDisplay()) {
            return;
        }
        e(true ^ this.t);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void g() {
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.M;
        if (cVar != null) {
            com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
            cVar.d = mVar != null && mVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void h() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null) {
            eVar.dismissAd(false);
        }
        a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void i() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null) {
            eVar.dismissAd(true);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void j() {
        c1 c1Var = IAConfigManager.R.x;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar = this.F == UnitDisplayType.INTERSTITIAL ? com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
        com.fyber.inneractive.sdk.cache.session.e eVar = c1Var.f5237a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f5965a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
        }
        E();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void k() {
        O();
        InneractiveAdSpot inneractiveAdSpot = this.f5328a;
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof i0)) {
            return;
        }
        ((i0) inneractiveAdSpot).a();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void m() {
        w1 w1Var = this.m;
        if (w1Var != null) {
            w1Var.d = false;
            w1Var.a(SystemClock.uptimeMillis());
        }
        w1 w1Var2 = this.o;
        if (w1Var2 != null) {
            w1Var2.d = false;
            w1Var2.a(SystemClock.uptimeMillis());
        }
        this.v.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onPlayerError() {
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.A);
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null) {
            eVar.dismissAd(false);
        }
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onProgress(int i, int i2) {
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.M;
        if (cVar != null && i2 > -1) {
            cVar.f5975a = i2;
        }
        this.u.a();
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.A);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onProgress(i, i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void r() {
        w1 w1Var = this.m;
        if (w1Var != null) {
            w1Var.d = true;
            u1 u1Var = w1Var.c;
            if (u1Var != null) {
                u1Var.removeMessages(1932593528);
            }
        }
        w1 w1Var2 = this.o;
        if (w1Var2 != null) {
            w1Var2.d = true;
            u1 u1Var2 = w1Var2.c;
            if (u1Var2 != null) {
                u1Var2.removeMessages(1932593528);
            }
        }
        com.fyber.inneractive.sdk.util.a aVar = this.u;
        if (aVar.b && aVar.e == 0) {
            aVar.e = System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar2 = this.v;
        if (aVar2.b && aVar2.e == 0) {
            aVar2.e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean u() {
        com.fyber.inneractive.sdk.player.t tVar;
        com.fyber.inneractive.sdk.player.controller.b bVar;
        com.fyber.inneractive.sdk.interfaces.e eVar;
        com.fyber.inneractive.sdk.player.ui.m mVar;
        com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar;
        View view;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2;
        View view2;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null || (tVar = ((t0) xVar).i) == null || (bVar = this.z) == null || (eVar = this.x) == null || (mVar = this.y) == null) {
            return false;
        }
        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) tVar.f;
        com.fyber.inneractive.sdk.flow.storepromo.b bVar3 = nVar.w;
        if (bVar3 != null && (bVar2 = bVar3.d) != null && (cVar = bVar2.d) != null && cVar.b != null && (view = cVar.f5408a) != null && view.getParent() != null && cVar.b.getVisibility() == 0) {
            com.fyber.inneractive.sdk.flow.storepromo.b bVar4 = nVar.w;
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar5 = bVar4.d;
            if (bVar5 == null || (cVar2 = bVar5.d) == null || cVar2.b == null || (view2 = cVar2.f5408a) == null || view2.getParent() == null || cVar2.b.getVisibility() != 0) {
                IAlog.f("StorePromoManager: hidePromo: unable hide promo: controller null or not ready", new Object[0]);
            } else {
                bVar4.d.a();
            }
        } else if (mVar.c()) {
            if (this.p) {
                eVar.dismissAd(true);
            }
        } else if (bVar.b()) {
            com.fyber.inneractive.sdk.player.controller.z zVar = (com.fyber.inneractive.sdk.player.controller.z) bVar;
            if (zVar.B()) {
                zVar.g(true);
            } else {
                zVar.d(true);
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void v() {
        View view = this.j;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) {
        y0 y0Var;
        super.a(eVar, activity);
        this.x = eVar;
        boolean z = false;
        this.B = false;
        this.C = false;
        this.L = false;
        InneractiveUnitController selectedUnitController = this.f5328a.getSelectedUnitController();
        if (selectedUnitController != null) {
            if (selectedUnitController instanceof InneractiveFullscreenUnitController) {
                InneractiveContentController selectedContentController = selectedUnitController.getSelectedContentController();
                if (selectedContentController != null) {
                    if (selectedContentController instanceof InneractiveFullscreenVideoContentController) {
                        this.A = new WeakReference((InneractiveFullscreenVideoContentController) selectedContentController);
                    } else {
                        IAlog.f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), selectedContentController.getClass().getSimpleName());
                    }
                }
            } else {
                IAlog.f("%sWrong type of unit controller found. Expecting InneractiveFullscreenUnitController", IAlog.a(this));
            }
        }
        com.fyber.inneractive.sdk.config.x0 x0Var = this.f5328a.getAdContent().d;
        if (x0Var != null && (y0Var = ((w0) x0Var).f) != null) {
            this.F = y0Var.j;
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
            ((t0) xVar).e();
        }
        com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
        com.fyber.inneractive.sdk.util.viewtime.c cVar = null;
        com.fyber.inneractive.sdk.player.t tVar = xVar2 != null ? ((t0) xVar2).i : null;
        Context context = this.x.getLayout().getContext();
        if (tVar != null) {
            com.fyber.inneractive.sdk.player.a aVar = tVar.f;
            if (aVar == null || ((com.fyber.inneractive.sdk.player.n) aVar).f5792a == null) {
                IAlog.f("%sFull screen video ad renderer is not valid.", IAlog.a(this));
                throw new InneractiveUnitController.AdDisplayError("Full screen video could not be loaded");
            }
            f fVar = aVar != null ? new f(tVar) : null;
            this.G = fVar;
            this.y = fVar.a(context, ((t0) this.b).c);
            com.fyber.inneractive.sdk.player.controller.b a2 = this.G.a(this.f5328a, (t0) this.b);
            this.z = a2;
            this.G.b();
            a2.b(false);
            com.fyber.inneractive.sdk.player.controller.z zVar = (com.fyber.inneractive.sdk.player.controller.z) this.z;
            zVar.getClass();
            zVar.g = this;
            ((com.fyber.inneractive.sdk.player.controller.z) this.z).a(this);
            ((com.fyber.inneractive.sdk.player.ui.e) this.y).f();
            this.J.addRule(13);
            this.x.getLayout().addView((View) this.y, this.J);
            this.j = ((View) this.y).findViewById(R.id.ia_click_overlay);
            this.G.a(this.I);
            this.B = true;
            com.fyber.inneractive.sdk.player.n P = P();
            if (P == null || this.z == null) {
                IAlog.b("%s%s is null, cannot create VideoViewTime", IAlog.a(this), P == null ? "mediaPlayerFlowManager" : "mUIController");
            } else {
                int c = P.f5792a.c();
                com.fyber.inneractive.sdk.flow.x xVar3 = this.b;
                com.fyber.inneractive.sdk.util.a aVar2 = this.u;
                int l = ((com.fyber.inneractive.sdk.player.controller.z) this.z).l() * 1000;
                boolean a3 = com.fyber.inneractive.sdk.player.f.a(P);
                boolean a4 = x0.a(P()).a();
                if (InneractiveAdManager.isCurrentUserAChild() || a4 || this.F != UnitDisplayType.REWARDED) {
                    z = a3;
                } else if (c > l) {
                    z = true;
                }
                cVar = new com.fyber.inneractive.sdk.util.viewtime.c(xVar3, aVar2, z);
            }
            this.M = cVar;
        }
    }

    public final void f(boolean z) {
        if (N() && this.K) {
            return;
        }
        if (z) {
            com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
            com.fyber.inneractive.sdk.flow.endcard.k j = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
            com.fyber.inneractive.sdk.flow.endcard.o oVar = j != null ? (com.fyber.inneractive.sdk.flow.endcard.o) j.b.a(com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card) : null;
            this.v.a(oVar != null ? oVar.g().toString() : null);
            return;
        }
        com.fyber.inneractive.sdk.util.a aVar = this.v;
        aVar.d = 0L;
        aVar.e = 0L;
        aVar.f = 0L;
        aVar.b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (((r3 == null || (r3 = r3.B) == null || !android.text.TextUtils.equals(r3, "1")) ? false : true) != false) goto L55;
     */
    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        com.fyber.inneractive.sdk.model.vast.o oVar;
        ViewGroup viewGroup;
        f(z);
        com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
        com.fyber.inneractive.sdk.flow.endcard.k j = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
        if ((mVar == null || (viewGroup = ((com.fyber.inneractive.sdk.player.ui.s) mVar).r) == null || viewGroup.getVisibility() != 0) && !this.H) {
            if (j != null) {
                com.fyber.inneractive.sdk.response.g gVar = j.f5341a.d;
            }
            com.fyber.inneractive.sdk.flow.endcard.b b = j != null ? j.b() : null;
            boolean z2 = x0.a(P()).f5419a >= 0;
            if (b != null && (oVar = b.c.e.f) != null && oVar.d && !z2) {
                this.K = false;
                this.p = false;
                com.fyber.inneractive.sdk.interfaces.e eVar = this.k;
                if (eVar != null) {
                    eVar.disableCloseButton();
                }
                com.fyber.inneractive.sdk.util.a aVar = this.v;
                aVar.d = 0L;
                aVar.e = 0L;
                aVar.f = 0L;
                aVar.b = false;
                Runnable runnable = this.l;
                if (runnable != null) {
                    com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable);
                    this.l = null;
                }
                Runnable runnable2 = this.n;
                if (runnable2 != null) {
                    com.fyber.inneractive.sdk.util.r.b.removeCallbacks(runnable2);
                    this.n = null;
                }
                J();
                this.G.f5894a.a(b);
                com.fyber.inneractive.sdk.interfaces.e eVar2 = this.x;
                if (eVar2 != null) {
                    eVar2.secondEndCardWasDisplayed();
                    return;
                }
                return;
            }
            com.fyber.inneractive.sdk.interfaces.e eVar3 = this.x;
            if (eVar3 != null) {
                eVar3.destroy();
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar4 = this.x;
        if (eVar4 != null) {
            eVar4.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final boolean b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
        if (bVar == null) {
            IAlog.f("Unable to register store promo observer - ui controller unavailable", new Object[0]);
            return false;
        }
        return ((com.fyber.inneractive.sdk.player.controller.z) bVar).a(aVar);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.f fVar) {
        this.E = fVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        Context context;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        Q();
        if (this.y.getContext() == null) {
            context = com.fyber.inneractive.sdk.util.o.f5960a;
        } else {
            context = this.y.getContext();
        }
        Context context2 = context;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        return a(context2, (xVar == null || (eVar = ((t0) xVar).b) == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).N) == null) ? null : bVar.b, g1Var, gVar, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z, Orientation orientation) {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar != null) {
            eVar.setActivityOrientation(z, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(String str, String str2) {
        IAlog.a(IAlog.a(this) + "full screen video ad renderer callback: onSuspiciousNoUserWebActionDetected", new Object[0]);
        com.fyber.inneractive.sdk.interfaces.e eVar = this.x;
        if (eVar == null || eVar.getLayout() == null || this.x.getLayout().getContext() == null) {
            return;
        }
        if (!this.L) {
            com.fyber.inneractive.sdk.network.b0.a(this.x.getLayout().getContext(), str, str2, this.b);
            this.L = true;
            IAlog.a(IAlog.a(this) + "reporting auto redirect", new Object[0]);
            return;
        }
        IAlog.a(IAlog.a(this) + "redirect already reported for this ad", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var, boolean z) {
        f0 f0Var;
        if (this.F == UnitDisplayType.INTERSTITIAL) {
            this.H = true;
        }
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.z;
        if (bVar == null && (f0Var = this.G) != null) {
            bVar = f0Var.f5894a;
        }
        com.fyber.inneractive.sdk.flow.endcard.k j = bVar != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar).j() : null;
        com.fyber.inneractive.sdk.flow.endcard.b a2 = j != null ? j.b.a() : null;
        if (a2 != null) {
            Q();
            com.fyber.inneractive.sdk.util.d0 a3 = a(a2.c.f5421a, str, g1Var, a2.g(), false, null);
            if (a3.f5945a != com.fyber.inneractive.sdk.util.g0.FAILED) {
                t0 t0Var = a2.c.b;
                String[] strArr = {com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK.toString()};
                com.fyber.inneractive.sdk.player.t tVar = t0Var.i;
                if (tVar != null) {
                    tVar.a("EVENT_TRACKING", strArr);
                }
            }
            return a3;
        }
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("No Companion clicked"));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(int i, boolean z) {
        WeakReference weakReference;
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.M;
        if (cVar != null && i > -1) {
            cVar.f5975a = i;
        }
        if (cVar != null) {
            cVar.a(z);
            this.M = null;
        }
        InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = (InneractiveFullscreenVideoContentController) com.fyber.inneractive.sdk.util.v.a(this.A);
        if (inneractiveFullscreenVideoContentController != null) {
            inneractiveFullscreenVideoContentController.onCompleted();
        }
        c1 c1Var = IAConfigManager.R.x;
        UnitDisplayType unitDisplayType = this.F;
        UnitDisplayType unitDisplayType2 = UnitDisplayType.REWARDED;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar2 = unitDisplayType == unitDisplayType2 ? com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_VIDEO : com.fyber.inneractive.sdk.cache.session.enums.c.INTERSTITIAL_VIDEO;
        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION;
        com.fyber.inneractive.sdk.cache.session.e eVar = c1Var.f5237a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f5965a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar2));
        }
        if (this.F == unitDisplayType2) {
            com.fyber.inneractive.sdk.external.f fVar = this.E;
            if (fVar != null) {
                weakReference = ((s0) fVar.f5316a).mAdSpot;
                i0 i0Var = (i0) com.fyber.inneractive.sdk.util.v.a(weakReference);
                InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = fVar.f5316a.b;
                if (inneractiveFullScreenAdRewardedListener != null && i0Var != null) {
                    inneractiveFullScreenAdRewardedListener.onAdRewarded(i0Var);
                }
            }
            H();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null || ((t0) xVar).i == null) {
            return;
        }
        J();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r0.b <= (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r0 = r4.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        r0.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        if (r5 != false) goto L29;
     */
    @Override // com.fyber.inneractive.sdk.player.controller.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        com.fyber.inneractive.sdk.player.t tVar;
        if (z) {
            com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_SKIP;
            com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
            if (xVar2 != null) {
                t0 t0Var = (t0) xVar2;
                if (t0Var.i != null) {
                    String[] strArr = {xVar.a()};
                    com.fyber.inneractive.sdk.player.t tVar2 = t0Var.i;
                    if (tVar2 != null) {
                        tVar2.a("EVENT_TRACKING", strArr);
                    }
                }
            }
        }
        com.fyber.inneractive.sdk.flow.x xVar3 = this.b;
        if (xVar3 == null || (tVar = ((t0) xVar3).i) == null) {
            return;
        }
        tVar.a("TRACKING_COMPLETED", new String[0]);
        J();
        String[] strArr2 = new String[0];
        com.fyber.inneractive.sdk.player.t tVar3 = ((t0) this.b).i;
        if (tVar3 != null) {
            tVar3.a("TRACKING_COMPLETED", strArr2);
        }
        x0 a2 = x0.a(P());
        if (z) {
            if (a2.f5419a >= 0) {
            }
        } else {
            a2.getClass();
        }
        if (IAConfigManager.R.u.b.a(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD).a()) {
        }
        com.fyber.inneractive.sdk.util.viewtime.c cVar = this.M;
        if (cVar != null) {
            cVar.a(z);
            this.M = null;
        }
        f(z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view, String str) {
        if (view != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(c(view), str);
            c(view);
            c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view) {
        c(view);
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j) {
        if (this.t) {
            return j;
        }
        long j2 = 12;
        try {
            j2 = Long.parseLong(IAConfigManager.R.u.b.a("vast_endcard_x_fallback_delay", Long.toString(12L)));
        } catch (Throwable unused) {
        }
        return j2 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.player.controller.b bVar = this.z;
        if (bVar == null) {
            IAlog.f("Unable to unregister store promo observer - ui controller unavailable", new Object[0]);
        } else {
            ((com.fyber.inneractive.sdk.player.controller.z) bVar).b(aVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.storepromo.observer.a
    public final void a(com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar) {
        if (this.F == UnitDisplayType.INTERSTITIAL) {
            IAlog.a("InneractiveFullscreenVideoAdRenderer: update: StorePromo isClicked: %s", Boolean.valueOf(bVar.b));
            this.H = bVar.b;
        }
    }

    @Override // com.fyber.inneractive.sdk.rtb.watermark.a
    public final void a(FrameLayout frameLayout) {
        com.fyber.inneractive.sdk.player.ui.m mVar = this.y;
        if (mVar != null) {
            ((com.fyber.inneractive.sdk.player.ui.e) mVar).setWatermarkView(frameLayout);
        }
    }
}

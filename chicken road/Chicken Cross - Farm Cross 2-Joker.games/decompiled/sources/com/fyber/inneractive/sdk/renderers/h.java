package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.config.x0;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.g0;

/* loaded from: classes4.dex */
public final class h implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f5896a;

    public h(n nVar) {
        this.f5896a = nVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        x0 x0Var;
        String str2;
        n nVar = this.f5896a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(nVar));
        ViewGroup viewGroup = this.f5896a.p;
        Context context = (viewGroup == null || viewGroup.getContext() == null) ? com.fyber.inneractive.sdk.util.o.f5960a : this.f5896a.p.getContext();
        if (context != null) {
            n nVar2 = this.f5896a;
            if (nVar2.f) {
                com.fyber.inneractive.sdk.flow.x xVar = nVar2.b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).b : null;
                if (eVar != null && (str2 = eVar.l) != null && str2.trim().length() > 0) {
                    IAlog.d("AD_CLICKED", new Object[0]);
                    z0.b(str2);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = this.f5896a.b;
                if (xVar2 != null && (x0Var = ((q0) xVar2).d) != null) {
                    w0 w0Var = (w0) x0Var;
                    if (w0Var.c != null) {
                        com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.CLICK;
                        com.fyber.inneractive.sdk.cache.session.enums.c cVar = w0Var.c.b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY;
                        com.fyber.inneractive.sdk.cache.session.e eVar2 = IAConfigManager.R.x.f5237a;
                        if (eVar2 != null) {
                            com.fyber.inneractive.sdk.util.r.f5965a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, aVar, cVar));
                        }
                    }
                }
                return this.f5896a.a(context, str, g1Var, com.fyber.inneractive.sdk.util.g.DISPLAY, false, null);
            }
        }
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("No context or no native click detected"));
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        this.f5896a.d(true);
        n nVar = this.f5896a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(nVar));
        n nVar2 = this.f5896a;
        InneractiveUnitController.EventsListener eventsListener = nVar2.c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdResized(nVar2.f5328a);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        n nVar = this.f5896a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(nVar));
        n nVar2 = this.f5896a;
        InneractiveUnitController.EventsListener eventsListener = nVar2.c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdExpanded(nVar2.f5328a);
        }
        n nVar3 = this.f5896a;
        nVar3.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(nVar3));
        this.f5896a.d(true);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void e() {
        n nVar = this.f5896a;
        nVar.w();
        nVar.c(false);
        this.f5896a.F();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        n nVar = this.f5896a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(nVar));
        n nVar2 = this.f5896a;
        InneractiveUnitController.EventsListener eventsListener = nVar2.c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdCollapsed(nVar2.f5328a);
        }
        this.f5896a.N();
        n nVar3 = this.f5896a;
        nVar3.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(nVar3));
    }

    @Override // com.fyber.inneractive.sdk.web.g0
    public final void b() {
        this.f5896a.H();
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        this.f5896a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) {
        n nVar = this.f5896a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(nVar));
        ViewGroup viewGroup = this.f5896a.p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        n nVar2 = this.f5896a;
        if (!nVar2.v) {
            com.fyber.inneractive.sdk.network.b0.a(nVar2.p.getContext(), str, str2, this.f5896a.b);
            n nVar3 = this.f5896a;
            nVar3.v = true;
            nVar3.getClass();
            IAlog.a("%sreporting auto redirect", IAlog.a(nVar3));
            return;
        }
        nVar2.getClass();
        IAlog.a("%sredirect already reported for this ad", IAlog.a(nVar2));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(boolean z) {
        x0 x0Var;
        com.fyber.inneractive.sdk.config.q0 q0Var;
        com.fyber.inneractive.sdk.cache.session.enums.c cVar;
        n nVar = this.f5896a;
        nVar.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(nVar), Boolean.valueOf(z));
        if (z) {
            n nVar2 = this.f5896a;
            if (!nVar2.o) {
                IAlog.a("%sonShownForTheFirstTime called", IAlog.a(nVar2));
                com.fyber.inneractive.sdk.flow.x xVar = nVar2.b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).b : null;
                if (eVar != null) {
                    IAmraidWebViewController iAmraidWebViewController = nVar2.m;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.l();
                    }
                    String str = eVar.k;
                    if (str != null && str.trim().length() > 0) {
                        IAlog.e("%sfiring impression!", IAlog.a(nVar2));
                        IAlog.d("AD_IMPRESSION", new Object[0]);
                        z0.b(str);
                    }
                    nVar2.E();
                }
                long K = nVar2.K();
                nVar2.k = K;
                if (K != 0) {
                    nVar2.a(true, K);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = nVar2.b;
                if (xVar2 != null && (x0Var = ((q0) xVar2).d) != null && (q0Var = ((w0) x0Var).c) != null) {
                    com.fyber.inneractive.sdk.cache.session.enums.a aVar = com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION;
                    if (q0Var.b == UnitDisplayType.MRECT) {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY;
                    } else {
                        cVar = com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY;
                    }
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = IAConfigManager.R.x.f5237a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.util.r.f5965a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, aVar, cVar));
                    }
                }
                this.f5896a.o = true;
                return;
            }
            d dVar = nVar2.y;
            if (dVar != null && !dVar.h && !dVar.g && dVar.f != 0) {
                dVar.f = 0L;
                dVar.g = true;
                dVar.a();
            }
            this.f5896a.N();
            return;
        }
        d dVar2 = this.f5896a.y;
        if (dVar2 != null && dVar2.g) {
            dVar2.g = false;
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar2.j);
        }
        this.f5896a.d(false);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        boolean startRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(com.fyber.inneractive.sdk.util.o.a(this.f5896a.x()), str);
        if (startRichMediaIntent) {
            n nVar = this.f5896a;
            if (nVar.c != null) {
                nVar.c(false);
            }
        }
        return startRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        n nVar = this.f5896a;
        InneractiveUnitController.EventsListener eventsListener = nVar.c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdEnteredErrorState(nVar.f5328a, mraidVideoFailedToDisplayError);
        }
    }
}

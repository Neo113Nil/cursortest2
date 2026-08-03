package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public abstract class z implements com.fyber.inneractive.sdk.player.controller.b, com.fyber.inneractive.sdk.player.controller.p, com.fyber.inneractive.sdk.player.controller.o, com.fyber.inneractive.sdk.player.ui.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.f f3899a;
    public final com.fyber.inneractive.sdk.config.s0 b;
    public final com.fyber.inneractive.sdk.config.global.r c;
    public final com.fyber.inneractive.sdk.player.ui.s d;
    public com.fyber.inneractive.sdk.player.controller.x e;
    public com.fyber.inneractive.sdk.player.controller.g0 g;
    public java.lang.Runnable j;
    public boolean k;
    public com.fyber.inneractive.sdk.player.controller.u m;
    public final boolean n;
    public com.fyber.inneractive.sdk.player.ui.g u;
    public final java.lang.String v;
    public int f = 0;
    public boolean h = false;
    public float i = -0.1f;
    public boolean l = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public com.fyber.inneractive.sdk.ignite.m t = com.fyber.inneractive.sdk.ignite.m.NONE;
    public boolean w = false;
    public boolean y = false;
    public final com.fyber.inneractive.sdk.config.enums.Skip x = null;

    public z(com.fyber.inneractive.sdk.player.f fVar, com.fyber.inneractive.sdk.player.ui.s sVar, com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, boolean z, java.lang.String str) {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        this.f3899a = fVar;
        this.b = s0Var;
        this.c = rVar;
        this.d = sVar;
        this.n = z;
        this.v = str;
        sVar.setListener(this);
        if (fVar == null || (qVar = fVar.f4138a) == null) {
            return;
        }
        if (!qVar.b.contains(this)) {
            qVar.b.add(this);
        }
        com.fyber.inneractive.sdk.player.controller.q qVar2 = fVar.f4138a;
        if (qVar2.c.contains(this)) {
            return;
        }
        qVar2.c.add(this);
    }

    public abstract boolean A();

    public boolean B() {
        boolean z;
        com.fyber.inneractive.sdk.player.f fVar;
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.b;
        if (s0Var != null) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
            if (r0Var.f != null && r0Var.f.j == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED) {
                z = true;
                if (com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild() || !z || this.d == null || (fVar = this.f3899a) == null || (qVar = fVar.f4138a) == null) {
                    return false;
                }
                int b = qVar.b() / 1000;
                return (this.f3899a.f4138a.c() / 1000) - b <= 0 || b < l();
            }
        }
        z = false;
        if (com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
        }
        return false;
    }

    public void C() {
        java.lang.Boolean c;
        com.fyber.inneractive.sdk.config.global.r rVar = this.c;
        com.fyber.inneractive.sdk.config.global.features.v vVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class) : null;
        boolean booleanValue = (vVar == null || (c = vVar.c("show_cta")) == null) ? true : c.booleanValue();
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.g;
        if (g0Var != null) {
            this.t = g0Var.o();
        }
        com.fyber.inneractive.sdk.ignite.m mVar = this.t;
        this.d.a(mVar == com.fyber.inneractive.sdk.ignite.m.NONE ? booleanValue : true, mVar);
    }

    public final void D() {
        com.fyber.inneractive.sdk.flow.endcard.b bVar;
        com.fyber.inneractive.sdk.player.controller.g0 g0Var;
        com.fyber.inneractive.sdk.flow.storepromo.controller.c cVar;
        boolean z;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar2;
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar3;
        android.view.View view;
        android.view.View view2;
        com.fyber.inneractive.sdk.flow.endcard.b bVar2;
        com.fyber.inneractive.sdk.model.vast.o oVar;
        this.d.i();
        com.fyber.inneractive.sdk.flow.endcard.k j = j();
        if (j != null) {
            bVar = j.a();
            com.fyber.inneractive.sdk.flow.endcard.h hVar = j.e;
            com.fyber.inneractive.sdk.flow.endcard.m mVar = j.b;
            hVar.getClass();
            if (mVar.f3697a.size() >= 1) {
                com.fyber.inneractive.sdk.flow.endcard.b a2 = mVar.a();
                com.fyber.inneractive.sdk.model.vast.i iVar = com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
                java.util.Iterator it = mVar.f3697a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bVar2 = null;
                        break;
                    } else {
                        bVar2 = (com.fyber.inneractive.sdk.flow.endcard.b) it.next();
                        if (bVar2.i() == iVar) {
                            break;
                        }
                    }
                }
                if (a2 != null && a2.i() != com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card && a2.i() != com.fyber.inneractive.sdk.model.vast.i.Default_End_Card && a2.l() && (oVar = a2.c.e.f) != null && oVar.d && bVar2 != null && bVar2.l()) {
                    hVar.a(a2, bVar2.l());
                    hVar.a(bVar2, true, a2.k());
                } else if (a2 == bVar2 || a2 == null || a2.g() == com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD) {
                    hVar.a(a2, false, false);
                } else {
                    hVar.a(a2, false);
                }
            }
        } else {
            bVar = null;
        }
        if (bVar == null) {
            if (e() || (g0Var = this.g) == null) {
                return;
            }
            g0Var.i();
            return;
        }
        a(bVar);
        if (n() != null) {
            com.fyber.inneractive.sdk.flow.storepromo.b n = n();
            com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar3 = n.d;
            if (bVar3 == null || (cVar = bVar3.c) == null || !(z = cVar.e)) {
                n.f3732a.a();
                n.a();
                n.a((n.d == null ? com.fyber.inneractive.sdk.flow.storepromo.events.a.CONTROLLER_NOT_INITIALIZED : com.fyber.inneractive.sdk.flow.storepromo.events.a.TEMPLATE_NOT_LOADED).name(), (java.lang.String) null, (java.lang.String) null);
                return;
            }
            bVar3.i = j;
            if (cVar == null || !z || (cVar2 = bVar3.d) == null || bVar3.g) {
                return;
            }
            if (cVar2.b == null || (view2 = cVar2.f3755a) == null || view2.getParent() == null || cVar2.b.getVisibility() != 0) {
                com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar4 = bVar3.d;
                if (cVar4.b == null || cVar4.f3755a == null) {
                    com.fyber.inneractive.sdk.util.IAlog.f("StorePromoView: show: missing container or content", new java.lang.Object[0]);
                    return;
                }
                cVar4.a();
                com.fyber.inneractive.sdk.util.v.a(cVar4.b);
                sVar.addView(cVar4.b);
                cVar4.f3755a.setAnimation(cVar4.c);
                cVar4.b.setVisibility(0);
                com.fyber.inneractive.sdk.flow.storepromo.b bVar4 = cVar4.f;
                if (bVar4 != null) {
                    com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar5 = bVar4.d;
                    com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar6 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar5 == null || (cVar3 = bVar5.d) == null || cVar3.b == null || (view = cVar3.f3755a) == null || view.getParent() == null || cVar3.b.getVisibility() != 0) ? false : true, bVar4.i);
                    java.util.Iterator it2 = bVar4.h.iterator();
                    while (it2.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it2.next()).a(bVar6);
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(bVar4.g);
                    try {
                        jSONObject.put("screenshots", valueOf);
                    } catch (java.lang.Exception unused) {
                        com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "screenshots", valueOf);
                    }
                    com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_EVENT_SP_IMPRESSION;
                    com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = bVar4.c;
                    com.fyber.inneractive.sdk.response.e eVar = bVar4.b;
                    java.lang.String str = bVar4.f;
                    com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(uVar, inneractiveAdRequest, eVar);
                    try {
                        jSONObject.put("templateURL", str);
                    } catch (java.lang.Exception unused2) {
                        com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str);
                    }
                    wVar.f.put(jSONObject);
                    wVar.a((java.lang.String) null);
                }
            }
        }
    }

    public void E() {
        boolean z;
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.controller.q qVar2;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null && (((qVar2 = fVar.f4138a) != null && qVar2.e == com.fyber.inneractive.sdk.player.enums.b.Completed) || this.q)) {
            fVar.a();
        }
        boolean a2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("endcard").a();
        com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
        com.fyber.inneractive.sdk.player.f fVar2 = this.f3899a;
        sVar.e((fVar2 == null || (qVar = fVar2.f4138a) == null || qVar.e != com.fyber.inneractive.sdk.player.enums.b.Completed) && !(((z = this.q) && !a2) || this.r || (z && a2)));
    }

    public void a() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
    }

    public abstract void b(com.fyber.inneractive.sdk.util.g1 g1Var);

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public boolean b() {
        com.fyber.inneractive.sdk.player.ui.s sVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null) {
            return false;
        }
        if (!this.h && fVar.f4138a != null && ((sVar = this.d) == null || !sVar.a())) {
            int c = this.f3899a.f4138a.c();
            com.fyber.inneractive.sdk.player.f fVar2 = this.f3899a;
            if (!com.fyber.inneractive.sdk.player.f.a(c, com.fyber.inneractive.sdk.player.f.a(fVar2), ((com.fyber.inneractive.sdk.player.n) fVar2).s) || this.h || this.f != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
        if (this.o && !this.l) {
            this.l = true;
        }
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public void destroy() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        android.app.Application application;
        com.fyber.inneractive.sdk.player.controller.u uVar = this.m;
        if (uVar != null && (application = com.fyber.inneractive.sdk.util.o.f4302a) != null) {
            application.unregisterActivityLifecycleCallbacks(uVar);
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sdestroy called", com.fyber.inneractive.sdk.util.IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null && (qVar = fVar.f4138a) != null) {
            qVar.b.remove(this);
            this.f3899a.f4138a.c.remove(this);
        }
        g();
        java.lang.Runnable runnable = this.j;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.j = null;
        }
        this.g = null;
    }

    public boolean e() {
        java.lang.String str;
        com.fyber.inneractive.sdk.flow.endcard.k j = j();
        if (j == null) {
            return false;
        }
        com.fyber.inneractive.sdk.response.g gVar = j.f3688a.d;
        return (gVar != null && (str = gVar.B) != null && android.text.TextUtils.equals(str, "1")) ^ true;
    }

    public final void f(boolean z) {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null && (qVar = fVar.f4138a) != null) {
            qVar.b(z);
        }
        this.d.setMuteButtonState(true);
    }

    public void g() {
        if (this.u != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sdestroyTextureView", com.fyber.inneractive.sdk.util.IAlog.a(this));
        }
    }

    public void h(boolean z) {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null) {
            if (!fVar.g) {
                E();
                return;
            }
            if (z && (qVar = fVar.f4138a) != null) {
                qVar.a(0, true);
                return;
            }
            com.fyber.inneractive.sdk.player.controller.q qVar2 = fVar.f4138a;
            if (qVar2 != null) {
                com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.e;
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                    qVar2.a(1, true);
                } else {
                    qVar2.j();
                }
            }
        }
    }

    public abstract int i();

    public final void i(boolean z) {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null && (qVar = fVar.f4138a) != null) {
            qVar.d(z);
        }
        this.d.setMuteButtonState(false);
    }

    public final com.fyber.inneractive.sdk.flow.endcard.k j() {
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).t;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.web.b0 k() {
        return new com.fyber.inneractive.sdk.player.controller.w(this);
    }

    public final int l() {
        int i;
        try {
            i = java.lang.Integer.parseInt(com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("max_rv_tsec", java.lang.Integer.toString(30)));
        } catch (java.lang.Throwable unused) {
            i = 30;
        }
        if (i < 1) {
            return 30;
        }
        return i;
    }

    public final float m() {
        try {
            return ((android.media.AudioManager) this.d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (java.lang.Throwable unused) {
            return 1.0f;
        }
    }

    public com.fyber.inneractive.sdk.flow.storepromo.b n() {
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null) {
            return ((com.fyber.inneractive.sdk.player.n) fVar).v;
        }
        return null;
    }

    public abstract int o();

    public final boolean p() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || (qVar = fVar.f4138a) == null) {
            return false;
        }
        return qVar.g() || ((double) m()) == 0.0d;
    }

    public final void q() {
        this.d.a(true);
        this.d.e(false);
        java.lang.Runnable runnable = this.j;
        if (runnable == null) {
            if (runnable == null) {
                this.j = new com.fyber.inneractive.sdk.player.controller.t(this);
            }
            int i = i();
            com.fyber.inneractive.sdk.util.IAlog.a("%s Starting buffering timeout with %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(i));
            this.d.postDelayed(this.j, i);
        }
    }

    public abstract void r();

    public void s() {
        if (B()) {
            g(false);
        } else {
            d(false);
        }
    }

    public abstract void t();

    public void u() {
        java.lang.Runnable runnable = this.j;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.j = null;
        }
        this.d.a(false);
        E();
    }

    public abstract void v();

    public void w() {
    }

    public void x() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        this.d.a(false);
        this.d.e(false);
        java.lang.Runnable runnable = this.j;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.j = null;
        }
        if (this.f3899a != null && A() && !this.h) {
            int c = this.f3899a.f4138a.c();
            com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
            if (com.fyber.inneractive.sdk.player.f.a(c, com.fyber.inneractive.sdk.player.f.a(fVar), ((com.fyber.inneractive.sdk.player.n) fVar).s)) {
                if (this.f <= 0) {
                    this.d.g(true);
                    h();
                } else {
                    com.fyber.inneractive.sdk.player.f fVar2 = this.f3899a;
                    if (fVar2 != null && (qVar = fVar2.f4138a) != null) {
                        if (this.f >= qVar.c() / 1000) {
                            this.d.g(false);
                        }
                    }
                    if (!this.p) {
                        this.d.g(true);
                        b(this.f);
                        this.p = true;
                    }
                }
            }
        }
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.g;
        if (g0Var != null && !this.k) {
            this.k = true;
            g0Var.j();
        }
        this.q = false;
    }

    public final void y() {
        com.fyber.inneractive.sdk.player.ui.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
        if (sVar != null) {
            sVar.o();
        }
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null && fVar.f4138a != null && (gVar = this.u) != null) {
            gVar.invalidate();
            this.u.requestLayout();
        }
        com.fyber.inneractive.sdk.player.ui.s sVar2 = this.d;
        if (sVar2 != null) {
            sVar2.invalidate();
            this.d.requestLayout();
        }
    }

    public void z() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || (qVar = fVar.f4138a) == null) {
            return;
        }
        if (qVar.e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            com.fyber.inneractive.sdk.util.IAlog.a("%spauseVideo called in bad state! %s", com.fyber.inneractive.sdk.util.IAlog.a(this), qVar.e);
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%spauseVideo %s", com.fyber.inneractive.sdk.util.IAlog.a(this), this.d);
        android.view.TextureView textureView = qVar.j;
        if (textureView == null || textureView.getParent() == null || textureView.getParent() != this.d.getTextureHost()) {
            return;
        }
        qVar.i();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void a(com.fyber.inneractive.sdk.flow.endcard.b bVar) {
        com.fyber.inneractive.sdk.web.i1 i1Var;
        com.fyber.inneractive.sdk.util.IAlog.a("IAVideoUIControllerBase: showEndCard: dismiss time: %d sec.", java.lang.Integer.valueOf(bVar.f));
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
            com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) bVar;
            com.fyber.inneractive.sdk.player.ui.b bVar2 = new com.fyber.inneractive.sdk.player.ui.b(a(cVar.d()));
            if (bVar2.f4160a) {
                com.fyber.inneractive.sdk.web.b0 k = k();
                com.fyber.inneractive.sdk.flow.endcard.a aVar = (com.fyber.inneractive.sdk.flow.endcard.a) cVar.f();
                if ((aVar instanceof com.fyber.inneractive.sdk.flow.endcard.u) && (i1Var = ((com.fyber.inneractive.sdk.flow.endcard.u) aVar).e().f3879a) != null) {
                    i1Var.setListener(k);
                }
                this.d.e(false);
                this.d.a(cVar, bVar2);
                android.view.ViewGroup viewGroup = this.d.m;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                    return;
                }
                return;
            }
            return;
        }
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.o) {
            com.fyber.inneractive.sdk.flow.endcard.o oVar = (com.fyber.inneractive.sdk.flow.endcard.o) bVar;
            com.fyber.inneractive.sdk.player.ui.b bVar3 = new com.fyber.inneractive.sdk.player.ui.b(a(oVar.d()));
            if (bVar3.f4160a) {
                com.fyber.inneractive.sdk.web.b0 k2 = k();
                com.fyber.inneractive.sdk.web.i1 i1Var2 = ((com.fyber.inneractive.sdk.flow.endcard.p) oVar.f()).e().f3879a;
                if (i1Var2 != null) {
                    i1Var2.setListener(k2);
                }
                this.d.a(oVar, bVar3);
                return;
            }
            return;
        }
        if (bVar instanceof com.fyber.inneractive.sdk.flow.endcard.d) {
            com.fyber.inneractive.sdk.flow.endcard.d dVar = (com.fyber.inneractive.sdk.flow.endcard.d) bVar;
            com.fyber.inneractive.sdk.player.ui.c d = dVar.d();
            java.lang.String str = this.v;
            if (str == null) {
                com.fyber.inneractive.sdk.config.global.r rVar = this.c;
                if (rVar != null) {
                    com.fyber.inneractive.sdk.config.global.features.d dVar2 = (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class);
                    dVar2.d(com.fyber.inneractive.sdk.config.IAConfigManager.N.o);
                    com.fyber.inneractive.sdk.model.vast.a aVar2 = dVar2.e;
                    if (aVar2 != null && aVar2.d) {
                        str = aVar2.f3798a;
                    }
                }
                str = null;
            }
            d.c = str;
            com.fyber.inneractive.sdk.player.ui.b bVar4 = new com.fyber.inneractive.sdk.player.ui.b(a(d));
            if (bVar4.f4160a) {
                this.d.e(false);
                this.d.a(dVar, bVar4);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.n
    public void c() {
        com.fyber.inneractive.sdk.util.IAlog.a("%sonVideoViewDetachedFromWindow", com.fyber.inneractive.sdk.util.IAlog.a(this));
        g();
    }

    public final void e(boolean z) {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || (qVar = fVar.f4138a) == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar.e;
        if (z && bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.d.c()) {
            h(false);
            return;
        }
        if (!z && bVar == com.fyber.inneractive.sdk.player.enums.b.Paused && this.d.c()) {
            int b = qVar.b();
            int c = qVar.c();
            if (b <= 0 || b > c) {
                return;
            }
            qVar.a(b - 1, false);
            qVar.a(b, false);
        }
    }

    public void g(boolean z) {
        com.fyber.inneractive.sdk.config.global.features.c cVar;
        android.content.Context context = this.d.getContext();
        com.fyber.inneractive.sdk.config.global.r rVar = this.c;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.c cVar2 = (com.fyber.inneractive.sdk.config.global.features.c) rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            cVar2.getClass();
            if (new java.util.ArrayList(cVar2.c.values()).size() > 0) {
                cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
                new com.fyber.inneractive.sdk.player.controller.f0(context, cVar, new com.fyber.inneractive.sdk.player.controller.v(this, z)).b.show();
            }
        }
        cVar = null;
        new com.fyber.inneractive.sdk.player.controller.f0(context, cVar, new com.fyber.inneractive.sdk.player.controller.v(this, z)).b.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00eb, code lost:
    
        if (r1.e == com.fyber.inneractive.sdk.player.enums.b.Completed) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f2, code lost:
    
        if (r0 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f6, code lost:
    
        if (r5.r != false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z) {
        com.fyber.inneractive.sdk.player.f fVar;
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.config.t0 t0Var;
        int i;
        com.fyber.inneractive.sdk.measurement.f fVar2;
        com.fyber.inneractive.sdk.player.controller.q qVar2;
        com.fyber.inneractive.sdk.config.s0 s0Var;
        com.fyber.inneractive.sdk.config.t0 t0Var2;
        this.q = true;
        com.fyber.inneractive.sdk.config.x0 x0Var = com.fyber.inneractive.sdk.config.IAConfigManager.N.w;
        if (z && x0Var != null && (s0Var = this.b) != null && (t0Var2 = ((com.fyber.inneractive.sdk.config.r0) s0Var).f) != null) {
            x0Var.a(t0Var2.j, "LAST_VAST_SKIPED", "1");
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.f3899a;
        if (fVar3 != null && (qVar2 = fVar3.f4138a) != null) {
            qVar2.k();
            this.f3899a.f4138a.i();
        }
        com.fyber.inneractive.sdk.player.f fVar4 = this.f3899a;
        if (fVar4 != null && z && (fVar2 = fVar4.e) != null && fVar2.c != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s skipped", "OMVideo");
            try {
                fVar2.c.skipped();
            } catch (java.lang.Throwable th) {
                fVar2.a(th);
            }
        }
        if (!this.d.c()) {
            this.d.a(false);
            java.lang.Runnable runnable = this.j;
            if (runnable != null) {
                this.d.removeCallbacks(runnable);
                this.j = null;
            }
            this.k = false;
            this.h = true;
            com.fyber.inneractive.sdk.config.s0 s0Var2 = this.b;
            if (s0Var2 != null && (t0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var2).f) != null && t0Var.j == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED && this.g != null) {
                com.fyber.inneractive.sdk.player.f fVar5 = this.f3899a;
                com.fyber.inneractive.sdk.player.controller.q qVar3 = fVar5 != null ? fVar5.f4138a : null;
                if ((fVar5 != null ? fVar5.f4138a : null) != null) {
                    i = (fVar5 != null ? fVar5.f4138a : null).b();
                } else {
                    i = -1;
                }
                boolean z2 = this.q;
                if (z2 && this.f3899a != null && qVar3 != null) {
                    int b = qVar3.b();
                    int c = qVar3.c() - b;
                    int l = l() * 1000;
                    if (c > 0 && b < l) {
                        this.y = true;
                    } else {
                        this.g.a(i, this.q);
                    }
                } else {
                    this.g.a(i, z2);
                }
            }
        }
        if (z) {
            boolean a2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("endcard").a();
            com.fyber.inneractive.sdk.player.f fVar6 = this.f3899a;
            if (fVar6 != null) {
                com.fyber.inneractive.sdk.player.controller.q qVar4 = fVar6.f4138a;
                if (qVar4 != null) {
                }
            }
            if (this.q) {
            }
        }
        D();
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.g;
        if (g0Var != null && (this.f <= 0 || this.h || ((fVar = this.f3899a) != null && (qVar = fVar.f4138a) != null && qVar.e == com.fyber.inneractive.sdk.player.enums.b.Completed))) {
            g0Var.a(z);
        }
        g();
    }

    public void f() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.controller.q qVar2;
        com.fyber.inneractive.sdk.measurement.f fVar;
        if (this.u == null) {
            com.fyber.inneractive.sdk.player.ui.g gVar = new com.fyber.inneractive.sdk.player.ui.g(this.d);
            this.u = gVar;
            gVar.setId(com.fyber.inneractive.sdk.R.id.ia_inn_texture_view);
            com.fyber.inneractive.sdk.player.f fVar2 = this.f3899a;
            if (fVar2 != null && (fVar = fVar2.e) != null) {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
                android.view.View[] trackingFriendlyView = sVar.getTrackingFriendlyView();
                com.iab.omid.library.fyber.adsession.AdSession adSession = fVar.f3787a;
                if (adSession != null) {
                    try {
                        adSession.registerAdView(sVar);
                    } catch (java.lang.Throwable th) {
                        fVar.a(th);
                    }
                }
                if (fVar.f3787a != null && trackingFriendlyView != null) {
                    for (android.view.View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                fVar.f3787a.addFriendlyObstruction(view, com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
                            } catch (java.lang.Throwable th2) {
                                fVar.a(th2);
                            }
                        }
                    }
                }
                android.view.View[] trackingFriendlyViewObstructionPurposeOther = this.d.getTrackingFriendlyViewObstructionPurposeOther();
                if (fVar.f3787a != null) {
                    for (android.view.View view2 : trackingFriendlyViewObstructionPurposeOther) {
                        if (view2 != null) {
                            try {
                                fVar.f3787a.addFriendlyObstruction(view2, com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose.OTHER, null);
                            } catch (java.lang.Throwable th3) {
                                fVar.a(th3);
                            }
                        }
                    }
                }
                if (this.d.getWatermarkView() != null) {
                    android.view.View watermarkView = this.d.getWatermarkView();
                    com.iab.omid.library.fyber.adsession.AdSession adSession2 = fVar.f3787a;
                    if (adSession2 != null) {
                        adSession2.addFriendlyObstruction(watermarkView, com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose.NOT_VISIBLE, com.fyber.inneractive.sdk.measurement.tracker.d.Watermark.name());
                    }
                }
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sconnectToTextureView called %s", com.fyber.inneractive.sdk.util.IAlog.a(this), this.d.getTextureHost());
        if (this.u != null && this.d.getTextureHost().equals(this.u.getParent())) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sconnectToTextureView called but already connected", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.player.f fVar3 = this.f3899a;
        if (fVar3 != null && (qVar2 = fVar3.f4138a) != null) {
            qVar2.a(this.u);
        }
        com.fyber.inneractive.sdk.player.ui.g gVar2 = this.u;
        if (gVar2 != null && gVar2.getParent() == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%supdateView adding texture to parent", com.fyber.inneractive.sdk.util.IAlog.a(this));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            this.d.getTextureHost().addView(this.u, layoutParams);
        }
        this.l = false;
        com.fyber.inneractive.sdk.player.controller.x xVar = new com.fyber.inneractive.sdk.player.controller.x(this);
        this.e = xVar;
        com.fyber.inneractive.sdk.player.f fVar4 = this.f3899a;
        if (fVar4 == null || (qVar = fVar4.f4138a) == null) {
            return;
        }
        qVar.d = xVar;
    }

    public void h() {
        if (A()) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.c;
            java.lang.String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(com.fyber.inneractive.sdk.config.IAConfigManager.N.o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.e;
                if (aVar != null && aVar.d) {
                    str = aVar.b;
                }
            }
            if (android.text.TextUtils.isEmpty(this.v) && str != null) {
                this.d.setSkipText(str);
            } else {
                com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
                sVar.setSkipText(sVar.getContext().getString(com.fyber.inneractive.sdk.R.string.ia_video_skip_text));
            }
            this.d.h();
            this.f = 0;
            com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.g;
            if (g0Var != null) {
                g0Var.c();
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.b
    public void b(boolean z) {
        com.fyber.inneractive.sdk.util.IAlog.a("%sinitUI", com.fyber.inneractive.sdk.util.IAlog.a(this));
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || fVar.f4138a == null) {
            return;
        }
        this.d.setUnitConfig(this.b);
        this.d.a(this.n, this.f3899a.f4138a.f(), this.f3899a.f4138a.e());
        if (A()) {
            this.f = o();
        } else {
            this.d.g(false);
        }
        if (!z) {
            a(this.f3899a.f4138a.b());
            a(this.f3899a.f4138a.e, false);
        }
        this.d.setMuteButtonState(p());
    }

    public final void b(int i) {
        if (this.d != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.c;
            java.lang.String str = null;
            com.fyber.inneractive.sdk.config.global.features.d dVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.d) rVar.a(com.fyber.inneractive.sdk.config.global.features.d.class) : null;
            if (dVar != null) {
                dVar.d(com.fyber.inneractive.sdk.config.IAConfigManager.N.o);
                com.fyber.inneractive.sdk.model.vast.a aVar = dVar.e;
                if (aVar != null && aVar.d) {
                    str = aVar.c;
                }
            }
            if (android.text.TextUtils.isEmpty(this.v) && str != null) {
                this.d.setSkipText(str.replaceFirst("\\[TIME\\]", java.lang.Integer.toString(i)));
            } else {
                this.d.setSkipText(java.lang.String.valueOf(i));
            }
        }
    }

    public final void b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null) {
            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
            if (nVar.v != null) {
                com.fyber.inneractive.sdk.flow.storepromo.b bVar = nVar.v;
                bVar.getClass();
                synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.k) {
                    bVar.h.remove(aVar);
                }
                return;
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.f("Unable to remove store promo observer, promo manager is unavailable", new java.lang.Object[0]);
    }

    public final com.fyber.inneractive.sdk.player.ui.c a(com.fyber.inneractive.sdk.player.ui.c cVar) {
        java.lang.String string;
        cVar.h = this.f3899a != null && com.fyber.inneractive.sdk.player.f.a(this.c, this.t);
        com.fyber.inneractive.sdk.config.global.r rVar = this.c;
        com.fyber.inneractive.sdk.config.global.features.o oVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.o) rVar.a(com.fyber.inneractive.sdk.config.global.features.o.class) : null;
        if (oVar != null) {
            string = oVar.a("app_info_button_text", "App Info");
            if (string != null && string.length() > 30) {
                string = string.substring(0, 30);
            }
        } else {
            string = this.d.getContext().getString(com.fyber.inneractive.sdk.R.string.ia_video_app_info_text);
        }
        cVar.i = string;
        cVar.g = this.t;
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        com.fyber.inneractive.sdk.util.IAlog.a("%sonPlayerStateChanged with %s", com.fyber.inneractive.sdk.util.IAlog.a(this), bVar);
        a(bVar, true);
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar, boolean z) {
        com.fyber.inneractive.sdk.player.controller.g0 g0Var;
        int i;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        switch (com.fyber.inneractive.sdk.player.controller.y.f3898a[bVar.ordinal()]) {
            case 1:
                boolean z2 = this.w;
                if (z2) {
                    com.fyber.inneractive.sdk.util.IAlog.a("IAVideoUIControllerBase playerStateUpdated=%s mBuffering=%s", bVar, java.lang.String.valueOf(z2));
                    q();
                    break;
                }
                break;
            case 2:
                if (this.o) {
                    E();
                    w();
                    break;
                }
                break;
            case 3:
                if (this.o) {
                    this.w = true;
                    q();
                    break;
                }
                break;
            case 4:
                if (this.w) {
                    this.w = false;
                }
                if (this.o) {
                    x();
                    break;
                }
                break;
            case 5:
                u();
                break;
            case 6:
                if (this.o || (!e() && !this.s)) {
                    this.s = true;
                    if (!this.d.c()) {
                        this.d.a(false);
                        java.lang.Runnable runnable = this.j;
                        if (runnable != null) {
                            this.d.removeCallbacks(runnable);
                            this.j = null;
                        }
                        E();
                        D();
                        this.k = false;
                        this.h = true;
                    }
                    if (z && (g0Var = this.g) != null) {
                        boolean z3 = this.q;
                        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
                        if ((fVar != null ? fVar.f4138a : null) != null) {
                            i = (fVar != null ? fVar.f4138a : null).b();
                        } else {
                            i = -1;
                        }
                        g0Var.a(i, z3);
                        break;
                    }
                }
                break;
            case 7:
                if (this.o || ((sVar = this.d) != null && sVar.isShown())) {
                    s();
                    break;
                }
                break;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.o
    public final void a(int i) {
        com.fyber.inneractive.sdk.config.s0 s0Var;
        com.fyber.inneractive.sdk.config.t0 t0Var;
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar == null || fVar.f4138a == null) {
            return;
        }
        float m = m();
        com.fyber.inneractive.sdk.player.f fVar2 = this.f3899a;
        if (fVar2 != null && (qVar = fVar2.f4138a) != null && qVar.h()) {
            float f = this.i;
            if (m != f) {
                if (m > 0.0f && f >= 0.0f && p()) {
                    i(true);
                } else if (m == 0.0d) {
                    f(true);
                }
            }
            this.d.setMuteButtonState(p());
        }
        this.i = m;
        int c = this.f3899a.f4138a.c();
        int b = this.f3899a.f4138a.b();
        int i2 = b / 1000;
        int i3 = c / 1000;
        int i4 = i3 - i2;
        if (i4 < 0 || (!this.f3899a.f4138a.h() && b == c)) {
            i4 = 0;
        }
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.g;
        if (g0Var != null) {
            g0Var.onProgress(c, b);
        }
        if (this.d.l()) {
            return;
        }
        this.d.setRemainingTime(java.lang.Integer.toString(i4));
        if (this.f < i3) {
            if (A()) {
                int c2 = this.f3899a.f4138a.c();
                com.fyber.inneractive.sdk.player.f fVar3 = this.f3899a;
                if (com.fyber.inneractive.sdk.player.f.a(c2, com.fyber.inneractive.sdk.player.f.a(fVar3), ((com.fyber.inneractive.sdk.player.n) fVar3).s) && !this.h) {
                    int i5 = this.f;
                    if (i2 < i5) {
                        b(i5 - i2);
                    } else {
                        this.f = 0;
                        h();
                    }
                    this.d.g(true);
                }
            }
            this.d.g(false);
        } else {
            this.d.g(false);
            b(i4);
        }
        if (this.f3899a.f4138a.e != com.fyber.inneractive.sdk.player.enums.b.Paused) {
            this.d.a(c, b);
            int l = l();
            if (i3 <= l || i2 <= l || (s0Var = this.b) == null || (t0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f) == null || t0Var.j != com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED) {
                return;
            }
            h();
            this.d.g(true);
        }
    }

    public final void a(java.lang.String str) {
        com.fyber.inneractive.sdk.config.x0 x0Var = com.fyber.inneractive.sdk.config.IAConfigManager.N.w;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.b;
        if (s0Var != null) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
            if (r0Var.f != null) {
                x0Var.a(r0Var.f.j, "LAST_VAST_CLICKED_TYPE", str);
            }
        }
    }

    public void a(boolean z) {
        com.fyber.inneractive.sdk.player.f fVar;
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.controller.x xVar;
        com.fyber.inneractive.sdk.player.ui.s sVar;
        int i;
        android.app.Application application;
        if (this.o == z || (fVar = this.f3899a) == null || fVar.f4138a == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sonVisibilityChanged: %s my video view is%s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Boolean.valueOf(z), this.d);
        if (z) {
            this.o = true;
            com.fyber.inneractive.sdk.player.enums.b bVar = this.f3899a.f4138a.e;
            if (bVar != com.fyber.inneractive.sdk.player.enums.b.Completed && !this.d.c()) {
                if (bVar != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
                        this.f3899a.getClass();
                    } else {
                        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress || bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                            x();
                        }
                        com.fyber.inneractive.sdk.player.f fVar2 = this.f3899a;
                        if (!fVar2.j) {
                            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar2;
                            nVar.a(nVar.p, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CREATIVE_VIEW);
                            fVar2.j = true;
                        }
                        f();
                        if (this.m != null || (application = com.fyber.inneractive.sdk.util.o.f4302a) == null) {
                            return;
                        }
                        com.fyber.inneractive.sdk.player.controller.u uVar = new com.fyber.inneractive.sdk.player.controller.u(this);
                        this.m = uVar;
                        application.registerActivityLifecycleCallbacks(uVar);
                        return;
                    }
                }
                s();
                return;
            }
            if (!this.s) {
                this.s = true;
                if (!this.y) {
                    if (!this.d.c()) {
                        this.d.a(false);
                        java.lang.Runnable runnable = this.j;
                        if (runnable != null) {
                            this.d.removeCallbacks(runnable);
                            this.j = null;
                        }
                        E();
                        D();
                        this.k = false;
                        this.h = true;
                    }
                    com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.g;
                    if (g0Var != null) {
                        boolean z2 = this.q;
                        com.fyber.inneractive.sdk.player.f fVar3 = this.f3899a;
                        if ((fVar3 != null ? fVar3.f4138a : null) != null) {
                            i = (fVar3 != null ? fVar3.f4138a : null).b();
                        } else {
                            i = -1;
                        }
                        g0Var.a(i, z2);
                    }
                }
            }
            com.fyber.inneractive.sdk.player.ui.s sVar2 = this.d;
            if (sVar2 != null) {
                sVar2.k();
                return;
            }
            return;
        }
        this.o = false;
        com.fyber.inneractive.sdk.player.f fVar4 = this.f3899a;
        if (fVar4 != null && (qVar = fVar4.f4138a) != null && (xVar = qVar.d) != null && xVar.equals(this.e)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sonVisibilityChanged pausing video", com.fyber.inneractive.sdk.util.IAlog.a(this));
            z();
            if (this.f3899a.f4138a.e == com.fyber.inneractive.sdk.player.enums.b.Completed || ((sVar = this.d) != null && sVar.c())) {
                this.d.j();
            }
        }
        com.fyber.inneractive.sdk.player.ui.s sVar3 = this.d;
        if (sVar3 == null || !sVar3.h) {
            g();
        }
    }

    public final void a(int i, com.fyber.inneractive.sdk.util.g1 g1Var) {
        com.fyber.inneractive.sdk.util.IAlog.a("onClicked called with %d", java.lang.Integer.valueOf(i));
        switch (i) {
            case 1:
                if (p()) {
                    i(true);
                    com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
                    if (fVar != null) {
                        com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
                        nVar.a(nVar.p, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_UNMUTE);
                    }
                } else {
                    f(true);
                    com.fyber.inneractive.sdk.player.f fVar2 = this.f3899a;
                    if (fVar2 != null) {
                        com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                        nVar2.a(nVar2.p, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.MUTE, com.fyber.inneractive.sdk.model.vast.x.EVENT_MUTE);
                    }
                }
                this.d.setMuteButtonState(p());
                break;
            case 2:
                v();
                break;
            case 3:
                a(com.fyber.inneractive.sdk.config.w0.CTA_BUTTON.a());
                a(false, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.CTA, g1Var);
                break;
            case 4:
                a(com.fyber.inneractive.sdk.config.w0.COMPANION.a());
                com.fyber.inneractive.sdk.player.f fVar3 = this.f3899a;
                java.lang.String str = null;
                if (fVar3 != null) {
                    com.fyber.inneractive.sdk.player.n nVar3 = (com.fyber.inneractive.sdk.player.n) fVar3;
                    com.fyber.inneractive.sdk.flow.endcard.b a2 = nVar3.t.b.a();
                    if (a2 instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) a2;
                        java.lang.String str2 = cVar.g.g;
                        if (android.text.TextUtils.isEmpty(str2)) {
                            com.fyber.inneractive.sdk.model.vast.b bVar = nVar3.p;
                            if (bVar != null) {
                                str = bVar.b;
                            }
                        } else {
                            str = str2;
                        }
                        fVar3.a(cVar, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    }
                }
                com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
                if (sVar != null) {
                    sVar.g();
                }
                com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.g;
                if (g0Var != null) {
                    g0Var.a(str, g1Var, false);
                    break;
                }
                break;
            case 5:
                t();
                break;
            case 6:
                if (B()) {
                    g(true);
                    break;
                } else {
                    d(true);
                    break;
                }
            case 7:
                b(g1Var);
                break;
            case 8:
                a(com.fyber.inneractive.sdk.config.w0.COMPANION.a());
                a(true, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.COMPANION, g1Var);
                break;
            case 9:
                com.fyber.inneractive.sdk.player.f fVar4 = this.f3899a;
                if (fVar4 != null && !this.d.h) {
                    fVar4.g = true;
                    h(false);
                    break;
                }
                break;
            case 10:
                a(com.fyber.inneractive.sdk.config.w0.APP_INFO.a());
                a(false, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.APP_INFO, g1Var);
                break;
            case 11:
                a(com.fyber.inneractive.sdk.config.w0.STORE_PROMO.a());
                a(false, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.STORE_PROMO, g1Var);
                break;
        }
    }

    public final boolean a(boolean z, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin videoClickOrigin, com.fyber.inneractive.sdk.util.g1 g1Var) {
        com.fyber.inneractive.sdk.util.g gVar;
        com.fyber.inneractive.sdk.player.ui.s sVar = this.d;
        if (sVar != null) {
            sVar.g();
        }
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.g;
        boolean z2 = false;
        if (g0Var != null) {
            if (z) {
                com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
                if (fVar != null) {
                    com.fyber.inneractive.sdk.model.vast.b bVar = ((com.fyber.inneractive.sdk.player.n) fVar).p;
                    g0Var.a(bVar != null ? bVar.b : null, g1Var, true);
                    com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) this.f3899a;
                    nVar.a(nVar.p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                }
            } else {
                int i = com.fyber.inneractive.sdk.player.controller.y.b[videoClickOrigin.ordinal()];
                if (i == 1) {
                    gVar = com.fyber.inneractive.sdk.util.g.STORE_PROMO_CTA;
                } else if (i == 2) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CLICK;
                } else if (i != 3) {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_CTA;
                } else {
                    gVar = com.fyber.inneractive.sdk.util.g.VIDEO_APP_INFO;
                }
                com.fyber.inneractive.sdk.util.d0 a2 = this.g.a(g1Var, gVar);
                com.fyber.inneractive.sdk.player.f fVar2 = this.f3899a;
                if (fVar2 != null) {
                    com.fyber.inneractive.sdk.player.n nVar2 = (com.fyber.inneractive.sdk.player.n) fVar2;
                    nVar2.a(nVar2.p, videoClickOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                    com.fyber.inneractive.sdk.measurement.f fVar3 = this.f3899a.e;
                    if (fVar3 != null && fVar3.c != null) {
                        com.fyber.inneractive.sdk.util.IAlog.a("%s click", "OMVideo");
                        try {
                            fVar3.c.adUserInteraction(com.iab.omid.library.fyber.adsession.media.InteractionType.CLICK);
                        } catch (java.lang.Throwable th) {
                            fVar3.a(th);
                        }
                    }
                }
                if (a2.f4288a != com.fyber.inneractive.sdk.util.g0.FAILED) {
                    z2 = true;
                }
            }
        }
        if (videoClickOrigin == com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO) {
            a(com.fyber.inneractive.sdk.config.w0.VIDEO.a());
        }
        return z2;
    }

    public final boolean a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        com.fyber.inneractive.sdk.player.f fVar = this.f3899a;
        if (fVar != null) {
            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
            if (nVar.v != null) {
                com.fyber.inneractive.sdk.flow.storepromo.b bVar = nVar.v;
                bVar.getClass();
                synchronized (com.fyber.inneractive.sdk.flow.storepromo.b.k) {
                    bVar.h.add(aVar);
                }
                return true;
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.f("Unable to add store promo observer, promo manager is unavailable", new java.lang.Object[0]);
        return false;
    }
}

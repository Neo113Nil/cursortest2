package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class w extends com.fyber.inneractive.sdk.web.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.controller.z f3896a;

    public w(com.fyber.inneractive.sdk.player.controller.z zVar) {
        this.f3896a = zVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f3896a;
        zVar.getClass();
        sb.append(com.fyber.inneractive.sdk.util.IAlog.a(zVar));
        sb.append("web view callback: onSuspiciousNoUserWebActionDetected");
        com.fyber.inneractive.sdk.util.IAlog.a(sb.toString(), new java.lang.Object[0]);
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.f3896a.g;
        if (g0Var != null) {
            g0Var.a(str, str2);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z) {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f3896a;
        zVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sonCustomCloseButtonAvailableEnabled : %s", com.fyber.inneractive.sdk.util.IAlog.a(zVar), java.lang.Boolean.valueOf(z));
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.f3896a.g;
        if (g0Var == null || !z) {
            return;
        }
        g0Var.f();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f3896a;
        if (zVar.g != null) {
            com.fyber.inneractive.sdk.player.ui.s sVar = zVar.d;
            this.f3896a.g.a(sVar != null ? sVar.getEndCardView() : null);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f3896a;
        if (zVar.g != null) {
            com.fyber.inneractive.sdk.player.ui.s sVar = zVar.d;
            this.f3896a.g.a(sVar != null ? sVar.getEndCardView() : null);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void e() {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f3896a;
        zVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onClickedAndOpen", com.fyber.inneractive.sdk.util.IAlog.a(zVar));
        this.f3896a.a(com.fyber.inneractive.sdk.config.w0.COMPANION.a());
        com.fyber.inneractive.sdk.player.controller.z zVar2 = this.f3896a;
        if (zVar2.g != null) {
            com.fyber.inneractive.sdk.player.f fVar = zVar2.f3899a;
            if (fVar != null) {
                com.fyber.inneractive.sdk.flow.endcard.b a2 = ((com.fyber.inneractive.sdk.player.n) fVar).t.b.a();
                if (a2 instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                    fVar.a((com.fyber.inneractive.sdk.flow.endcard.c) a2, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                }
            }
            com.fyber.inneractive.sdk.util.IAlog.d("AD_CLICKED", new java.lang.Object[0]);
            this.f3896a.g.e();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.f3896a.g;
        if (g0Var != null) {
            g0Var.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f3896a;
        zVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view callback: onClicked", com.fyber.inneractive.sdk.util.IAlog.a(zVar));
        this.f3896a.a(com.fyber.inneractive.sdk.config.w0.COMPANION.a());
        com.fyber.inneractive.sdk.player.controller.z zVar2 = this.f3896a;
        if (zVar2.g != null) {
            com.fyber.inneractive.sdk.player.f fVar = zVar2.f3899a;
            if (fVar != null) {
                com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
                com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.t;
                com.fyber.inneractive.sdk.flow.endcard.b a2 = kVar.b.a();
                com.fyber.inneractive.sdk.flow.endcard.c cVar = a2;
                if (a2 != 0) {
                    boolean j = a2.j();
                    cVar = a2;
                    if (j) {
                        com.fyber.inneractive.sdk.flow.endcard.c cVar2 = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.b.a(com.fyber.inneractive.sdk.model.vast.i.Other);
                        cVar = cVar2;
                        if (cVar2 == null) {
                            com.fyber.inneractive.sdk.flow.endcard.c cVar3 = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.b.a(com.fyber.inneractive.sdk.model.vast.i.Html);
                            cVar = cVar3;
                            if (cVar3 == null) {
                                com.fyber.inneractive.sdk.flow.endcard.c cVar4 = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.b.a(com.fyber.inneractive.sdk.model.vast.i.Iframe);
                                cVar = cVar4;
                                if (cVar4 == null) {
                                    cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.b.a(com.fyber.inneractive.sdk.model.vast.i.Static);
                                }
                            }
                        }
                    }
                }
                com.fyber.inneractive.sdk.flow.endcard.b a3 = nVar.t.b.a();
                com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK;
                com.fyber.inneractive.sdk.flow.endcard.c cVar5 = cVar instanceof com.fyber.inneractive.sdk.response.i ? cVar : null;
                java.util.List a4 = cVar5 != null ? cVar5.a(xVar) : null;
                if (a4 != null && !a4.isEmpty()) {
                    fVar.a(cVar, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.COMPANION, xVar);
                } else {
                    this.f3896a.getClass();
                    if ((a3 instanceof com.fyber.inneractive.sdk.flow.endcard.o) && ((com.fyber.inneractive.sdk.flow.endcard.o) a3).h.b > 0) {
                        nVar.a(nVar.p, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.COMPANION, xVar);
                    }
                }
            }
            com.fyber.inneractive.sdk.util.IAlog.d("AD_CLICKED", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.player.ui.s sVar = this.f3896a.d;
            if (sVar != null) {
                sVar.g();
            }
            return this.f3896a.g.a(str, g1Var, false);
        }
        return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new java.lang.Exception("mListener is null, internal SDK fatal error"));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.f3896a.g;
        if (g0Var != null) {
            g0Var.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(java.lang.String str) {
        android.view.View endCardView = this.f3896a.d.getEndCardView();
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.f3896a.g;
        if (g0Var == null) {
            return false;
        }
        g0Var.a(endCardView, str);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(com.fyber.inneractive.sdk.ui.IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.f3896a.g;
        if (g0Var != null) {
            g0Var.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z, com.fyber.inneractive.sdk.config.enums.Orientation orientation) {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f3896a;
        zVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", com.fyber.inneractive.sdk.util.IAlog.a(zVar), java.lang.Boolean.valueOf(z), orientation.toString());
        com.fyber.inneractive.sdk.player.controller.g0 g0Var = this.f3896a.g;
        if (g0Var != null) {
            g0Var.a(z, orientation);
        }
    }
}

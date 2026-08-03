package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.j f3691a;
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.companion.b b = new com.fyber.inneractive.sdk.flow.endcard.loaders.companion.b();
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.companion.e c = new com.fyber.inneractive.sdk.flow.endcard.loaders.companion.e();
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.companion.f d = new com.fyber.inneractive.sdk.flow.endcard.loaders.companion.f();
    public final com.fyber.inneractive.sdk.flow.x0 e;
    public java.util.Iterator f;
    public com.fyber.inneractive.sdk.flow.endcard.c g;
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b h;

    public a(com.fyber.inneractive.sdk.flow.endcard.j jVar, com.fyber.inneractive.sdk.flow.x0 x0Var, com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar) {
        this.f3691a = jVar;
        this.e = x0Var;
        this.h = bVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar = this.h;
        com.fyber.inneractive.sdk.flow.endcard.c cVar = this.g;
        bVar.getClass();
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : onCompanionLoadSuccess: endcard type: %s", "EndCardLoader", cVar.i());
            bVar.d.a(cVar);
        }
    }

    public final void b() {
        java.util.Iterator it = this.f;
        if (it == null || !it.hasNext()) {
            return;
        }
        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) this.f.next();
        this.g = cVar;
        java.lang.String str = null;
        if (cVar instanceof com.fyber.inneractive.sdk.flow.endcard.r) {
            com.fyber.inneractive.sdk.flow.endcard.r rVar = (com.fyber.inneractive.sdk.flow.endcard.r) cVar;
            this.b.getClass();
            java.lang.String str2 = rVar.g.f;
            com.fyber.inneractive.sdk.flow.x0 x0Var = rVar.c;
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_COMPANION_LOAD_ATTEMPT;
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = x0Var.c;
            com.fyber.inneractive.sdk.response.g gVar = x0Var.d;
            org.json.JSONArray jSONArray = x0Var.f;
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
            wVar.c = uVar;
            wVar.f3860a = inneractiveAdRequest;
            wVar.d = jSONArray;
            wVar.a((java.lang.String) null);
            com.fyber.inneractive.sdk.flow.endcard.u uVar2 = (com.fyber.inneractive.sdk.flow.endcard.u) rVar.f();
            uVar2.e = str2;
            uVar2.a(this);
            return;
        }
        if (cVar instanceof com.fyber.inneractive.sdk.flow.endcard.v) {
            com.fyber.inneractive.sdk.flow.endcard.loaders.companion.e eVar = this.c;
            com.fyber.inneractive.sdk.flow.endcard.v vVar = (com.fyber.inneractive.sdk.flow.endcard.v) cVar;
            eVar.getClass();
            com.fyber.inneractive.sdk.model.vast.k kVar = vVar.h;
            int i = com.fyber.inneractive.sdk.flow.endcard.loaders.companion.c.f3692a[kVar.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                com.fyber.inneractive.sdk.util.IAlog.f("%s Invalid static type: %s", "StaticCompanionEndCardLoader", kVar);
                return;
            }
            java.lang.String str3 = vVar.g.f;
            if (android.text.TextUtils.isEmpty(str3)) {
                return;
            }
            com.fyber.inneractive.sdk.util.IAlog.c("%s load Static End-Card image %s", "StaticCompanionEndCardLoader", str3);
            com.fyber.inneractive.sdk.flow.x0 x0Var2 = vVar.c;
            com.fyber.inneractive.sdk.network.u uVar3 = com.fyber.inneractive.sdk.network.u.VAST_COMPANION_LOAD_ATTEMPT;
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest2 = x0Var2.c;
            com.fyber.inneractive.sdk.response.g gVar2 = x0Var2.d;
            org.json.JSONArray jSONArray2 = x0Var2.f;
            com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(gVar2);
            wVar2.c = uVar3;
            wVar2.f3860a = inneractiveAdRequest2;
            wVar2.d = jSONArray2;
            wVar2.a((java.lang.String) null);
            com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.e1(new com.fyber.inneractive.sdk.flow.endcard.loaders.companion.d(eVar, vVar, this), vVar.g.f, vVar.c.b.c));
            return;
        }
        if (cVar instanceof com.fyber.inneractive.sdk.flow.endcard.x) {
            com.fyber.inneractive.sdk.flow.endcard.x xVar = (com.fyber.inneractive.sdk.flow.endcard.x) cVar;
            this.d.getClass();
            if (xVar.g.f3800a != com.fyber.inneractive.sdk.model.vast.i.Static) {
                com.fyber.inneractive.sdk.flow.x0 x0Var3 = xVar.c;
                com.fyber.inneractive.sdk.network.u uVar4 = com.fyber.inneractive.sdk.network.u.VAST_COMPANION_LOAD_ATTEMPT;
                com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest3 = x0Var3.c;
                com.fyber.inneractive.sdk.response.g gVar3 = x0Var3.d;
                org.json.JSONArray jSONArray3 = x0Var3.f;
                com.fyber.inneractive.sdk.network.w wVar3 = new com.fyber.inneractive.sdk.network.w(gVar3);
                wVar3.c = uVar4;
                wVar3.f3860a = inneractiveAdRequest3;
                wVar3.d = jSONArray3;
                wVar3.a((java.lang.String) null);
                java.lang.String str4 = xVar.g.f;
                java.lang.String b = com.fyber.inneractive.sdk.util.o.b("fyb_iframe_endcard_tmpl.html");
                if (!android.text.TextUtils.isEmpty(b)) {
                    b = b.replace("$__SrcIframeUrl__$", str4);
                }
                com.fyber.inneractive.sdk.flow.endcard.u uVar5 = (com.fyber.inneractive.sdk.flow.endcard.u) xVar.f();
                uVar5.e = b;
                uVar5.a(this);
                return;
            }
            com.fyber.inneractive.sdk.flow.x0 x0Var4 = xVar.c;
            com.fyber.inneractive.sdk.network.u uVar6 = com.fyber.inneractive.sdk.network.u.VAST_COMPANION_LOAD_ATTEMPT;
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest4 = x0Var4.c;
            com.fyber.inneractive.sdk.response.g gVar4 = x0Var4.d;
            org.json.JSONArray jSONArray4 = x0Var4.f;
            com.fyber.inneractive.sdk.network.w wVar4 = new com.fyber.inneractive.sdk.network.w(gVar4);
            wVar4.c = uVar6;
            wVar4.f3860a = inneractiveAdRequest4;
            wVar4.d = jSONArray4;
            wVar4.a((java.lang.String) null);
            com.fyber.inneractive.sdk.model.vast.c cVar2 = xVar.g;
            java.lang.String str5 = cVar2.f;
            java.lang.String str6 = cVar2.g;
            if (android.text.TextUtils.isEmpty(str6)) {
                com.fyber.inneractive.sdk.model.vast.b bVar = xVar.c.d.L;
                if (bVar != null) {
                    str = bVar.b;
                }
            } else {
                str = str6;
            }
            java.lang.String b2 = com.fyber.inneractive.sdk.util.o.b("fyb_static_endcard_tmpl.html");
            if (!android.text.TextUtils.isEmpty(b2)) {
                b2 = b2.replace("$__IMGSRC__$", str5);
                if (str != null) {
                    b2 = b2.replace("$__IMGHREF__$", str.replace("\"", "\\\""));
                }
            }
            com.fyber.inneractive.sdk.flow.endcard.u uVar7 = (com.fyber.inneractive.sdk.flow.endcard.u) xVar.f();
            uVar7.e = b2;
            if (android.text.TextUtils.isEmpty(b2)) {
                throw new com.fyber.inneractive.sdk.flow.vast.h("End-Card HTML not loaded", "No template");
            }
            com.fyber.inneractive.sdk.player.controller.d e = uVar7.e();
            e.a();
            com.fyber.inneractive.sdk.web.i1 i1Var = e.f3879a;
            if (i1Var != null) {
                i1Var.F = false;
            }
            e.a(b2, new com.fyber.inneractive.sdk.flow.endcard.t(uVar7, this), !(uVar7 instanceof com.fyber.inneractive.sdk.flow.endcard.p));
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a(java.lang.String str) {
        this.h.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s : onCompanionLoadFailure: error: %s", "EndCardLoader", str);
        b();
    }
}

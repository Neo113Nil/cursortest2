package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class q implements com.fyber.inneractive.sdk.web.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.s f3730a;

    public q(com.fyber.inneractive.sdk.flow.s sVar) {
        this.f3730a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        com.fyber.inneractive.sdk.flow.s sVar = this.f3730a;
        sVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view returned onReady!", com.fyber.inneractive.sdk.util.IAlog.a(sVar));
        com.fyber.inneractive.sdk.response.e eVar = this.f3730a.b;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = eVar != null ? ((com.fyber.inneractive.sdk.response.f) eVar).n : null;
        if (unitDisplayType != null && unitDisplayType.isFullscreenUnit()) {
            com.fyber.inneractive.sdk.flow.s sVar2 = this.f3730a;
            sVar2.getClass();
            try {
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EVENT_READY_ON_CLIENT;
                com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = sVar2.f3705a;
                com.fyber.inneractive.sdk.flow.x xVar = sVar2.c;
                new com.fyber.inneractive.sdk.network.w(uVar, inneractiveAdRequest, xVar != null ? ((com.fyber.inneractive.sdk.flow.q0) xVar).b : null).a((java.lang.String) null);
            } catch (java.lang.Exception unused) {
            }
        }
        this.f3730a.f();
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.flow.s sVar = this.f3730a;
        sVar.getClass();
        com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(sVar.b, sVar.f3705a, "send_failed_display_creatives", sVar.g.b()), inneractiveInfrastructureError));
        com.fyber.inneractive.sdk.flow.s sVar2 = this.f3730a;
        sVar2.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sweb view returned onFailedLoading!", com.fyber.inneractive.sdk.util.IAlog.a(sVar2));
        this.f3730a.b(inneractiveInfrastructureError);
        if (inneractiveInfrastructureError.getErrorCode() == com.fyber.inneractive.sdk.external.InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.MRAID_ERROR_UNSECURE_CONTENT;
            com.fyber.inneractive.sdk.flow.s sVar3 = this.f3730a;
            new com.fyber.inneractive.sdk.network.w(tVar, sVar3.f3705a, sVar3.b).a((java.lang.String) null);
        }
    }
}

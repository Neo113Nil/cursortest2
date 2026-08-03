package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.bidder.adm.y f3677a;
    public final /* synthetic */ com.fyber.inneractive.sdk.config.global.r b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.h0 d;

    public c0(com.fyber.inneractive.sdk.flow.h0 h0Var, com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.config.global.r rVar, java.lang.String str) {
        this.d = h0Var;
        this.f3677a = yVar;
        this.b = rVar;
        this.c = str;
    }

    public final void a() {
        com.fyber.inneractive.sdk.config.global.q qVar;
        com.fyber.inneractive.sdk.config.global.b bVar;
        com.fyber.inneractive.sdk.config.global.k kVar;
        com.fyber.inneractive.sdk.config.global.l lVar;
        com.fyber.inneractive.sdk.config.global.q qVar2;
        com.fyber.inneractive.sdk.util.IAlog.a("%s : InneractiveAdSpotImpl markup data available", com.fyber.inneractive.sdk.flow.h0.a(this.d));
        if (this.d.n.get()) {
            com.fyber.inneractive.sdk.flow.h0 h0Var = this.d;
            com.fyber.inneractive.sdk.flow.p pVar = h0Var.l;
            h0Var.a(h0Var.e);
            return;
        }
        com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f3677a.f3542a;
        if (admParametersOuterClass$AdmParameters != null) {
            com.fyber.inneractive.sdk.config.global.r rVar = this.b;
            java.util.List<com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
            rVar.getClass();
            com.fyber.inneractive.sdk.config.global.a aVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.y;
            aVar.getClass();
            for (com.fyber.inneractive.sdk.config.global.features.i iVar : rVar.b.values()) {
                if (iVar != null && (lVar = aVar.f3599a) != null && (qVar2 = (com.fyber.inneractive.sdk.config.global.q) lVar.f3608a.get(iVar.b)) != null) {
                    iVar.f3610a = qVar2.f3610a;
                }
            }
            if (abExperimentsList == null || abExperimentsList.size() <= 0) {
                return;
            }
            com.fyber.inneractive.sdk.config.global.a aVar2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.y;
            aVar2.b = rVar;
            for (com.fyber.inneractive.sdk.config.global.features.i iVar2 : rVar.b.values()) {
                for (com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.Experiment experiment : abExperimentsList) {
                    java.lang.String identifier = experiment.getIdentifier();
                    java.lang.String variant = experiment.getVariant();
                    com.fyber.inneractive.sdk.config.global.l lVar2 = aVar2.f3599a;
                    if (lVar2 != null && (qVar = (com.fyber.inneractive.sdk.config.global.q) lVar2.f3608a.get(iVar2.b)) != null && (bVar = (com.fyber.inneractive.sdk.config.global.b) qVar.c.get(identifier)) != null) {
                        java.util.Iterator it = bVar.c.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                kVar = (com.fyber.inneractive.sdk.config.global.k) it.next();
                                if (kVar.b.equals(variant)) {
                                    break;
                                }
                            } else {
                                kVar = null;
                                break;
                            }
                        }
                        iVar2.c.put(bVar.f3600a, bVar);
                        if (kVar != null) {
                            iVar2.d.put(bVar.f3600a, kVar);
                        }
                    }
                }
            }
        }
    }

    public final void a(java.lang.Exception exc, com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode, com.fyber.inneractive.sdk.response.e... eVarArr) {
        com.fyber.inneractive.sdk.flow.i iVar;
        com.fyber.inneractive.sdk.network.t tVar;
        if (this.d.n.get()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : onResponseDataError: spot is already destroyed won't continue", com.fyber.inneractive.sdk.flow.h0.a(this.d));
            com.fyber.inneractive.sdk.flow.h0 h0Var = this.d;
            com.fyber.inneractive.sdk.flow.p pVar = h0Var.l;
            h0Var.a(h0Var.e);
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s : InneractiveAdSpotImpl data error", com.fyber.inneractive.sdk.flow.h0.a(this.d));
        com.fyber.inneractive.sdk.response.e eVar = eVarArr.length > 0 ? eVarArr[0] : null;
        this.d.getClass();
        if (exc.getCause() instanceof com.fyber.inneractive.sdk.response.nativead.a) {
            iVar = com.fyber.inneractive.sdk.flow.i.NATIVE_AD_PARSING_ERROR;
        } else {
            iVar = com.fyber.inneractive.sdk.flow.i.ADM_FETCH_FAILED;
        }
        com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(inneractiveErrorCode, iVar);
        com.fyber.inneractive.sdk.flow.e0 e0Var = this.d.d;
        if (e0Var != null) {
            e0Var.a(null, eVar, inneractiveInfrastructureError);
        }
        com.fyber.inneractive.sdk.flow.p pVar2 = this.d.l;
        if (pVar2 != null) {
            com.fyber.inneractive.sdk.util.IAlog.e("%sgot handleFailedLoading! with: %s", pVar2.d(), inneractiveInfrastructureError);
            com.fyber.inneractive.sdk.flow.n nVar = pVar2.b;
            if (nVar != null) {
                ((com.fyber.inneractive.sdk.flow.e0) nVar).a(null, eVar, inneractiveInfrastructureError);
            }
            if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != com.fyber.inneractive.sdk.flow.i.NATIVE_AD_PARSING_ERROR) {
                pVar2.a(null, eVar);
            }
        }
        com.fyber.inneractive.sdk.flow.h0 h0Var2 = this.d;
        java.lang.String str = this.c;
        com.fyber.inneractive.sdk.config.global.r rVar = this.b;
        h0Var2.getClass();
        int i = com.fyber.inneractive.sdk.flow.f0.f3701a[inneractiveErrorCode.ordinal()];
        if (i == 1 || i == 2) {
            tVar = com.fyber.inneractive.sdk.network.t.FATAL_ADM_MARKUP_FETCHING_ERROR;
        } else if (i != 3) {
            tVar = com.fyber.inneractive.sdk.network.t.FATAL_ADM_PARSING_ERROR;
        } else {
            tVar = com.fyber.inneractive.sdk.network.t.NATIVE_ERROR_INVALID_NATIVE_RESPONSE;
        }
        if (eVar != null) {
            eVar.A = false;
        }
        java.lang.String name = exc.getClass().getName();
        if (exc instanceof com.fyber.inneractive.sdk.network.k1) {
            name = "NetworkStackException";
        }
        org.json.JSONArray b = rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.b = tVar;
        wVar.f3860a = null;
        wVar.d = b;
        com.fyber.inneractive.sdk.network.x xVar = new com.fyber.inneractive.sdk.network.x();
        xVar.a(name, "exception").a(exc.getLocalizedMessage() != null ? exc.getLocalizedMessage() : exc, "message");
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode2 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD;
        if (inneractiveErrorCode == inneractiveErrorCode2 && exc.getCause() != null && exc.getCause().getCause() != null) {
            xVar.a(exc.getCause().getCause().getMessage(), "reason");
        } else if (inneractiveErrorCode != inneractiveErrorCode2) {
            xVar.a(str, "admPayload");
        }
        wVar.f.put(xVar.f3861a);
        wVar.a((java.lang.String) null);
    }
}

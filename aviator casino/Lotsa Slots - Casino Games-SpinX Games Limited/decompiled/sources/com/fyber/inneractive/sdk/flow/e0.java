package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class e0 implements com.fyber.inneractive.sdk.flow.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.h0 f3681a;

    public e0(com.fyber.inneractive.sdk.flow.h0 h0Var) {
        this.f3681a = h0Var;
    }

    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (this.f3681a.n.get()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : onAdRequestFailed: spot is already destroyed", com.fyber.inneractive.sdk.flow.h0.a(this.f3681a));
            com.fyber.inneractive.sdk.flow.h0 h0Var = this.f3681a;
            com.fyber.inneractive.sdk.flow.p pVar = h0Var.l;
            h0Var.a(h0Var.e);
            return;
        }
        if (this.f3681a.b != null) {
            if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                this.f3681a.a(inneractiveAdRequest, eVar);
            }
            com.fyber.inneractive.sdk.flow.h0 h0Var2 = this.f3681a;
            if (!h0Var2.j) {
                com.fyber.inneractive.sdk.flow.g0 g0Var = h0Var2.i;
                if (g0Var != null) {
                    g0Var.onAdRefreshFailed(h0Var2, inneractiveInfrastructureError.getErrorCode());
                    return;
                }
                return;
            }
            com.fyber.inneractive.sdk.flow.m mVar = h0Var2.h;
            com.fyber.inneractive.sdk.flow.p pVar2 = h0Var2.l;
            org.json.JSONArray jSONArray = null;
            com.fyber.inneractive.sdk.config.global.r rVar2 = pVar2 != null ? pVar2.c : null;
            if (mVar != null && (rVar = mVar.c) != null) {
                jSONArray = rVar.b();
            } else if (rVar2 != null) {
                jSONArray = rVar2.b();
            }
            com.fyber.inneractive.sdk.flow.a.a(inneractiveAdRequest, inneractiveInfrastructureError, h0Var2.e, eVar, jSONArray);
            com.fyber.inneractive.sdk.flow.h0 h0Var3 = this.f3681a;
            com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener requestListener = h0Var3.b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(h0Var3, inneractiveInfrastructureError.getErrorCode());
            }
        }
    }
}

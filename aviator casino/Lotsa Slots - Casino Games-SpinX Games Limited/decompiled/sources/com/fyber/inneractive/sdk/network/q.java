package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class q implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.network.s f3853a;

    public q(com.fyber.inneractive.sdk.network.s sVar) {
        this.f3853a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        com.fyber.inneractive.sdk.flow.o oVar;
        com.fyber.inneractive.sdk.response.e eVar = (com.fyber.inneractive.sdk.response.e) obj;
        if (exc == null) {
            com.fyber.inneractive.sdk.network.s sVar = this.f3853a;
            sVar.a(sVar.e, eVar);
            return;
        }
        this.f3853a.getClass();
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode = exc instanceof com.fyber.inneractive.sdk.network.k1 ? ((com.fyber.inneractive.sdk.network.k1) exc).f3844a == 204 ? com.fyber.inneractive.sdk.external.InneractiveErrorCode.NO_FILL : com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INTERNAL_ERROR : exc instanceof java.io.FileNotFoundException ? com.fyber.inneractive.sdk.external.InneractiveErrorCode.CONNECTION_ERROR : exc instanceof com.fyber.inneractive.sdk.network.n0 ? com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE : com.fyber.inneractive.sdk.external.InneractiveErrorCode.CONNECTION_ERROR;
        com.fyber.inneractive.sdk.network.s sVar2 = this.f3853a;
        com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(inneractiveErrorCode, com.fyber.inneractive.sdk.flow.i.NETWORK_ERROR, exc);
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = sVar2.e;
        if (sVar2.f3848a == null) {
            return;
        }
        if (sVar2.b) {
            com.fyber.inneractive.sdk.util.IAlog.e("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new java.lang.Object[0]);
        } else {
            if (sVar2.b || (oVar = sVar2.f3848a) == null) {
                return;
            }
            oVar.a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }
}

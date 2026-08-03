package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public final class k implements com.fyber.inneractive.sdk.flow.i0, com.fyber.inneractive.sdk.flow.r0 {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.external.InneractiveUnitController f4375a;
    public com.fyber.inneractive.sdk.flow.x b;
    public boolean d = false;
    public final java.lang.String c = java.util.UUID.randomUUID().toString();

    public k(com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController, com.fyber.inneractive.sdk.flow.x xVar) {
        this.f4375a = inneractiveUnitController;
        this.b = xVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.r0
    public final void a(com.fyber.inneractive.sdk.flow.g0 g0Var) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() {
        com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController = this.f4375a;
        if (inneractiveUnitController != null) {
            inneractiveUnitController.destroy();
        }
        a();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final com.fyber.inneractive.sdk.flow.x getAdContent() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest getCurrentProcessedRequest() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final java.lang.String getLocalUniqueId() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final com.fyber.inneractive.sdk.external.InneractiveMediationName getMediationName() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final java.lang.String getMediationNameString() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final java.lang.String getMediationVersion() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final java.lang.String getRequestedSpotId() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final com.fyber.inneractive.sdk.external.InneractiveUnitController getSelectedUnitController() {
        return this.f4375a;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final boolean isReady() {
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar == null) {
            return false;
        }
        com.fyber.inneractive.sdk.response.e eVar = xVar.b;
        boolean z = eVar != null && eVar.f4251a < java.lang.System.currentTimeMillis();
        if (z) {
            com.fyber.inneractive.sdk.flow.x xVar2 = this.b;
            com.fyber.inneractive.sdk.response.e eVar2 = xVar2.b;
            if (!this.d && eVar2 != null && eVar2.c != 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j = eVar2.f4251a;
                if (j < currentTimeMillis) {
                    long minutes = java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(j - java.lang.System.currentTimeMillis());
                    long j2 = eVar2.b;
                    com.fyber.inneractive.sdk.util.IAlog.a("Firing Event 802 - AdExpired - time passed- " + minutes + ", sessionTimeOut - " + j2, new java.lang.Object[0]);
                    com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_EXPIRED;
                    com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = xVar2.f3765a;
                    org.json.JSONArray b = xVar2.c.b();
                    com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar2);
                    wVar.b = tVar;
                    wVar.f3860a = inneractiveAdRequest;
                    wVar.d = b;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    java.lang.Long valueOf = java.lang.Long.valueOf(minutes);
                    try {
                        jSONObject.put("time_passed", valueOf);
                    } catch (java.lang.Exception unused) {
                        com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                    }
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(j2);
                    try {
                        jSONObject.put("timeout", valueOf2);
                    } catch (java.lang.Exception unused2) {
                        com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                    }
                    wVar.f.put(jSONObject);
                    wVar.a((java.lang.String) null);
                    this.d = true;
                }
            }
        }
        return !z;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(java.lang.String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(com.fyber.inneractive.sdk.external.InneractiveMediationName inneractiveMediationName) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(java.lang.String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(java.lang.String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener requestListener) {
    }

    @Override // com.fyber.inneractive.sdk.flow.i0
    public final void a() {
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        if (xVar != null) {
            xVar.destroy();
        }
        this.b = null;
        this.f4375a = null;
        com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().removeSpot(this);
    }
}

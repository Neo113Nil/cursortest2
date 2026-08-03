package com.fyber.inneractive.sdk.flow.nativead.mainasset;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.flow.nativead.mainasset.d, com.fyber.inneractive.sdk.flow.nativead.s {
    public static final java.lang.String h = com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.flow.nativead.mainasset.b.class);

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.f f3718a;
    public com.fyber.inneractive.sdk.flow.nativead.mainasset.c b;
    public com.fyber.inneractive.sdk.network.u0 c;
    public com.fyber.inneractive.sdk.flow.nativead.b d = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;
    public com.fyber.inneractive.sdk.response.nativead.j e;
    public com.fyber.inneractive.sdk.config.global.r f;
    public long g;

    public b(com.fyber.inneractive.sdk.response.nativead.f fVar, com.fyber.inneractive.sdk.flow.nativead.f fVar2, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f3718a = fVar;
        this.b = fVar2;
        this.e = jVar;
        this.f = rVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.s
    public final void a(com.fyber.inneractive.sdk.flow.nativead.g gVar, java.lang.Exception exc, com.fyber.inneractive.sdk.response.nativead.f fVar) {
        java.lang.String str;
        if (this.d == com.fyber.inneractive.sdk.flow.nativead.b.LOADED) {
            return;
        }
        if (gVar == null) {
            this.d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
            com.fyber.inneractive.sdk.flow.i iVar = com.fyber.inneractive.sdk.flow.i.NATIVE_AD_IMAGE_LOAD_FAILED;
            if (exc != null) {
                str = exc.getMessage();
            } else {
                str = "Failed to download main media image: " + iVar.name();
            }
            com.fyber.inneractive.sdk.util.IAlog.f("%s : %s", h, str);
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
            com.fyber.inneractive.sdk.flow.nativead.mainasset.c cVar = this.b;
            if (cVar != null) {
                ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, str);
                return;
            }
            return;
        }
        if (this.e != null && this.f != null) {
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EVENT_READY_ON_CLIENT;
            com.fyber.inneractive.sdk.response.nativead.j jVar = this.e;
            org.json.JSONArray b = this.f.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(jVar);
            wVar.c = uVar;
            wVar.f3860a = null;
            wVar.d = b;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.g;
            com.fyber.inneractive.sdk.util.IAlog.a("%sMain image load took: " + currentTimeMillis + " msec", com.fyber.inneractive.sdk.util.IAlog.a(this));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str2 = this.f3718a.d.f4255a;
            try {
                jSONObject.put("url", str2);
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "url", str2);
            }
            java.lang.String b2 = com.fyber.inneractive.sdk.util.u.b(gVar.b);
            try {
                jSONObject.put("mime", b2);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "mime", b2);
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis);
            try {
                jSONObject.put("load_time", valueOf);
            } catch (java.lang.Exception unused3) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "load_time", valueOf);
            }
            wVar.f.put(jSONObject);
            wVar.a((java.lang.String) null);
        }
        this.d = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        com.fyber.inneractive.sdk.flow.nativead.mainasset.c cVar2 = this.b;
        if (cVar2 != null) {
            com.fyber.inneractive.sdk.flow.nativead.f fVar2 = (com.fyber.inneractive.sdk.flow.nativead.f) cVar2;
            fVar2.d.add(gVar);
            fVar2.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.c cVar;
        java.lang.String str;
        com.fyber.inneractive.sdk.response.nativead.f fVar = this.f3718a;
        if (fVar != null && (cVar = fVar.d) != null && (str = cVar.f4255a) != null && !str.trim().isEmpty()) {
            this.g = java.lang.System.currentTimeMillis();
            this.d = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            com.fyber.inneractive.sdk.flow.nativead.t tVar = new com.fyber.inneractive.sdk.flow.nativead.t(this.f3718a, this);
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            com.fyber.inneractive.sdk.network.u0 u0Var = new com.fyber.inneractive.sdk.network.u0(tVar, iAConfigManager.u.f3614a, new com.fyber.inneractive.sdk.cache.d(this.f3718a.d.f4255a));
            this.c = u0Var;
            iAConfigManager.r.a(u0Var);
            return;
        }
        com.fyber.inneractive.sdk.flow.nativead.mainasset.a aVar = new com.fyber.inneractive.sdk.flow.nativead.mainasset.a("Main media image is not loadable");
        this.d = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        com.fyber.inneractive.sdk.flow.i iVar = com.fyber.inneractive.sdk.flow.i.NATIVE_AD_IMAGE_LOAD_FAILED;
        java.lang.String message = aVar.getMessage();
        com.fyber.inneractive.sdk.util.IAlog.f("%s : %s", h, message);
        com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, iVar);
        com.fyber.inneractive.sdk.flow.nativead.mainasset.c cVar2 = this.b;
        if (cVar2 != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar2).a(inneractiveInfrastructureError, message);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        com.fyber.inneractive.sdk.network.u0 u0Var = this.c;
        if (u0Var != null) {
            u0Var.c();
            this.c = null;
        }
        this.e = null;
        this.f = null;
        this.f3718a = null;
        this.b = null;
        this.d = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.d == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}

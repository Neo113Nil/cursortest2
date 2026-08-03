package com.fyber.inneractive.sdk.flow.nativead.mainasset;

/* loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.flow.nativead.mainasset.d, com.fyber.inneractive.sdk.player.s {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f3719a;
    public final com.fyber.inneractive.sdk.response.nativead.f b;
    public com.fyber.inneractive.sdk.response.g c;
    public com.fyber.inneractive.sdk.external.InneractiveAdRequest d;
    public com.fyber.inneractive.sdk.flow.nativead.mainasset.c e;
    public com.fyber.inneractive.sdk.flow.nativead.b g = com.fyber.inneractive.sdk.flow.nativead.b.UNINITIALIZED;
    public com.fyber.inneractive.sdk.flow.u f = new com.fyber.inneractive.sdk.flow.u();

    public f(com.fyber.inneractive.sdk.response.nativead.f fVar, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, java.lang.String str, com.fyber.inneractive.sdk.flow.nativead.f fVar2) {
        this.b = fVar;
        this.f3719a = rVar;
        this.c = gVar;
        this.d = inneractiveAdRequest;
        this.e = fVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void a(com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError2 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(inneractiveInfrastructureError.getErrorCode(), com.fyber.inneractive.sdk.flow.i.NATIVE_AD_VIDEO_LOAD_FAILED);
        this.g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        com.fyber.inneractive.sdk.flow.nativead.mainasset.c cVar = this.e;
        if (cVar != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError2, "onAdFailedToLoad");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void b() {
        com.fyber.inneractive.sdk.response.nativead.f fVar;
        com.fyber.inneractive.sdk.response.nativead.e eVar;
        java.lang.String str;
        com.fyber.inneractive.sdk.response.g gVar;
        if (this.f != null && (fVar = this.b) != null && (eVar = fVar.c) != null && (str = eVar.f4257a) != null && !str.trim().isEmpty() && (gVar = this.c) != null) {
            this.g = com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
            this.f.a(this.f3719a, gVar, this.d, this);
            return;
        }
        com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.VIDEO_ERROR_NULL);
        this.g = com.fyber.inneractive.sdk.flow.nativead.b.FAILED;
        com.fyber.inneractive.sdk.flow.nativead.mainasset.c cVar = this.e;
        if (cVar != null) {
            ((com.fyber.inneractive.sdk.flow.nativead.f) cVar).a(inneractiveInfrastructureError, "mVideoContentLoader is null, can't start loading");
        }
        com.fyber.inneractive.sdk.util.IAlog.b("%smVideoContentLoader is null, can't start loading", com.fyber.inneractive.sdk.util.IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.player.s
    public final void c() {
        com.fyber.inneractive.sdk.flow.u uVar;
        this.g = com.fyber.inneractive.sdk.flow.nativead.b.LOADED;
        com.fyber.inneractive.sdk.flow.nativead.mainasset.c cVar = this.e;
        if (cVar == null || (uVar = this.f) == null) {
            com.fyber.inneractive.sdk.util.IAlog.b("%sCan't notify success, required member is null in onAdLoaded. Is null: mLoadListener: %s, mVideoContentLoader: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Boolean.valueOf(this.e == null), java.lang.Boolean.valueOf(this.f == null));
            return;
        }
        com.fyber.inneractive.sdk.flow.t0 t0Var = (com.fyber.inneractive.sdk.flow.t0) uVar.c;
        com.fyber.inneractive.sdk.flow.nativead.f fVar = (com.fyber.inneractive.sdk.flow.nativead.f) cVar;
        fVar.getClass();
        if (t0Var == null) {
            fVar.a(new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT), "Undetectable main media");
            return;
        }
        if (t0Var != null) {
            fVar.e = t0Var;
        }
        fVar.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.u uVar = this.f;
        if (uVar != null) {
            com.fyber.inneractive.sdk.flow.x xVar = uVar.c;
            if (xVar != null) {
                ((com.fyber.inneractive.sdk.flow.t0) xVar).destroy();
            }
            com.fyber.inneractive.sdk.flow.u uVar2 = this.f;
            uVar2.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", com.fyber.inneractive.sdk.util.IAlog.a(uVar2));
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(uVar2.l);
            uVar2.k.a();
            this.f = null;
        }
        this.e = null;
        this.d = null;
        this.c = null;
        this.g = com.fyber.inneractive.sdk.flow.nativead.b.DESTROYED;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.c
    public final boolean a() {
        return this.g == com.fyber.inneractive.sdk.flow.nativead.b.LOADING;
    }
}

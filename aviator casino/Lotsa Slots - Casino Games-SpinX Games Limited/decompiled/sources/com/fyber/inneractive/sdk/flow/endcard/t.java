package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class t implements com.fyber.inneractive.sdk.web.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f3700a;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.endcard.u b;

    public t(com.fyber.inneractive.sdk.flow.endcard.u uVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.b = uVar;
        this.f3700a = aVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        this.b.h.set(false);
        this.b.i.a(iVar);
        this.f3700a.a();
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.b.h.set(false);
        this.b.i.a(iVar, inneractiveInfrastructureError);
        this.f3700a.a(inneractiveInfrastructureError.description());
    }
}

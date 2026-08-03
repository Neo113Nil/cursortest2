package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class s implements com.fyber.inneractive.sdk.web.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.endcard.u f3699a;

    public s(com.fyber.inneractive.sdk.flow.endcard.u uVar) {
        this.f3699a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s End-Card loaded", this.f3699a.f3682a);
        this.f3699a.h.set(false);
        com.fyber.inneractive.sdk.flow.endcard.u uVar = this.f3699a;
        uVar.getClass();
        boolean z = iVar != null;
        uVar.f = z;
        com.fyber.inneractive.sdk.web.m mVar = z ? iVar.b : null;
        java.lang.String str = com.fyber.inneractive.sdk.config.IAConfigManager.N.E.e;
        if (!uVar.f() || mVar == null || android.text.TextUtils.isEmpty(str)) {
            uVar.b.m();
        } else {
            com.fyber.inneractive.sdk.util.q0.a(mVar, str, uVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.g
    public final void a(com.fyber.inneractive.sdk.web.i iVar, com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.util.IAlog.f("%s End-Card failed to load!", this.f3699a.f3682a);
        this.f3699a.h.set(false);
        com.fyber.inneractive.sdk.flow.endcard.u uVar = this.f3699a;
        uVar.f = false;
        uVar.b.a(inneractiveInfrastructureError);
    }
}

package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

/* loaded from: classes3.dex */
public final class a implements com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.x0 f3694a;
    public final com.fyber.inneractive.sdk.flow.endcard.j b;
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b c;
    public com.fyber.inneractive.sdk.flow.endcard.o d;

    public a(com.fyber.inneractive.sdk.flow.endcard.j jVar, com.fyber.inneractive.sdk.flow.x0 x0Var, com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar) {
        this.b = jVar;
        this.f3694a = x0Var;
        this.c = bVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a() {
        com.fyber.inneractive.sdk.flow.endcard.loaders.b bVar = this.c;
        com.fyber.inneractive.sdk.flow.endcard.o oVar = this.d;
        bVar.getClass();
        if (oVar != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : onCompanionLoadSuccess: endcard type: %s", "EndCardLoader", oVar.i());
            bVar.d.a(oVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a
    public final void a(java.lang.String str) {
        this.c.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s : onCompanionLoadFailure: error: %s", "EndCardLoader", str);
    }
}

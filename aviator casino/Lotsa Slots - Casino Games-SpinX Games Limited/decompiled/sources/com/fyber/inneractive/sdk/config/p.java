package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class p implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.s f3624a;

    public p(com.fyber.inneractive.sdk.config.s sVar) {
        this.f3624a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        com.fyber.inneractive.sdk.config.o oVar = (com.fyber.inneractive.sdk.config.o) obj;
        if (oVar != null) {
            com.fyber.inneractive.sdk.config.s sVar = this.f3624a;
            if (oVar.equals(sVar.b)) {
                return;
            }
            sVar.d = true;
            sVar.b = oVar;
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.config.q(sVar));
        }
    }
}

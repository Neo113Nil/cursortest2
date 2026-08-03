package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class p extends com.fyber.inneractive.sdk.flow.endcard.u {
    public final java.lang.String j;
    public java.lang.String k;
    public boolean l;

    public p(com.fyber.inneractive.sdk.flow.endcard.o oVar) {
        super(oVar);
        com.fyber.inneractive.sdk.model.vast.o oVar2 = oVar.c.e.f;
        this.j = oVar2 != null ? oVar2.f3809a : null;
    }

    public final void b(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        if (android.text.TextUtils.isEmpty(this.e) || android.text.TextUtils.isEmpty(this.k)) {
            return;
        }
        if (this.f || !this.h.compareAndSet(false, true)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sisWebLoaded: %s, mFmpEndCardPrepareInProgress: %s", this.f3682a, java.lang.Boolean.valueOf(this.f), java.lang.Boolean.valueOf(this.h.get()));
        } else {
            a(aVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final com.fyber.inneractive.sdk.flow.endcard.q d() {
        com.fyber.inneractive.sdk.flow.endcard.b bVar = this.b;
        return new com.fyber.inneractive.sdk.flow.endcard.q(bVar.c.e, (com.fyber.inneractive.sdk.flow.endcard.o) bVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final boolean f() {
        return false;
    }
}

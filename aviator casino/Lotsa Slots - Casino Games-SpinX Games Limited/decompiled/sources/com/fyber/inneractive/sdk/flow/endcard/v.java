package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class v extends com.fyber.inneractive.sdk.flow.endcard.c {
    public final com.fyber.inneractive.sdk.model.vast.k h;

    public v(com.fyber.inneractive.sdk.flow.x0 x0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i) {
        super(x0Var, cVar, i);
        this.h = cVar.b;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.flow.endcard.n c() {
        return new com.fyber.inneractive.sdk.flow.endcard.w(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.c, com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        return super.l() && ((com.fyber.inneractive.sdk.flow.endcard.w) f()).c != null;
    }
}

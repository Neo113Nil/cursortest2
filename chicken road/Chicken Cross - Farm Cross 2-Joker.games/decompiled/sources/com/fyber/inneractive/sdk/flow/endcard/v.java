package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.flow.y0;

/* loaded from: classes4.dex */
public final class v extends c {
    public final com.fyber.inneractive.sdk.model.vast.k h;

    public v(y0 y0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i) {
        super(y0Var, cVar, i);
        this.h = cVar.b;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new w(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.c, com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        return super.l() && ((w) f()).c != null;
    }
}

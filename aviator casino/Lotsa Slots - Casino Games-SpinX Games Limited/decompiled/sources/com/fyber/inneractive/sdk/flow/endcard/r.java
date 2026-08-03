package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class r extends com.fyber.inneractive.sdk.flow.endcard.c {
    public r(com.fyber.inneractive.sdk.flow.x0 x0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i) {
        super(x0Var, cVar, i);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(org.json.JSONArray jSONArray) {
        this.b = jSONArray;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.flow.endcard.n c() {
        return new com.fyber.inneractive.sdk.flow.endcard.u(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean k() {
        org.json.JSONArray jSONArray = this.b;
        return jSONArray != null && jSONArray.length() > 0;
    }
}

package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f3766a;
    public final com.fyber.inneractive.sdk.flow.t0 b;
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest c;
    public final com.fyber.inneractive.sdk.response.g d;
    public final com.fyber.inneractive.sdk.model.vast.b e;
    public final org.json.JSONArray f;
    public final com.fyber.inneractive.sdk.config.global.features.v g;

    public x0(android.content.Context context, com.fyber.inneractive.sdk.flow.t0 t0Var) {
        com.fyber.inneractive.sdk.config.global.features.v vVar;
        org.json.JSONArray jSONArray;
        com.fyber.inneractive.sdk.config.global.r rVar = t0Var.c;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = t0Var.f3765a;
        com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var.b;
        com.fyber.inneractive.sdk.model.vast.b bVar = gVar.L;
        if (rVar != null) {
            vVar = (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class);
            jSONArray = rVar.b();
        } else {
            vVar = null;
            jSONArray = null;
        }
        this.f3766a = context;
        this.b = t0Var;
        this.c = inneractiveAdRequest;
        this.d = gVar;
        this.e = bVar;
        this.g = vVar;
        this.f = jSONArray;
    }
}

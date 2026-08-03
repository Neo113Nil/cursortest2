package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.web.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4337a;
    public final com.fyber.inneractive.sdk.util.g1 b;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i c;

    public h(com.fyber.inneractive.sdk.web.i iVar, java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        this.c = iVar;
        this.b = g1Var;
        this.f4337a = str;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final java.lang.String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final java.lang.String c() {
        return "open";
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        com.fyber.inneractive.sdk.web.i iVar = this.c;
        java.lang.String str = this.f4337a;
        com.fyber.inneractive.sdk.util.g1 g1Var = this.b;
        com.fyber.inneractive.sdk.web.j1 j1Var = iVar.g;
        if (j1Var != null) {
            com.fyber.inneractive.sdk.util.g0 g0Var = j1Var.a(str, g1Var).f4288a;
        }
    }

    public final java.lang.String toString() {
        return "action: open url: " + this.f4337a;
    }
}

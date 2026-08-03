package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class p0 implements com.digitalturbine.ignite.authenticator.listeners.internal.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4349a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.v0 c;

    public p0(com.fyber.inneractive.sdk.web.v0 v0Var, java.lang.String str, java.lang.String str2) {
        this.c = v0Var;
        this.f4349a = str;
        this.b = str2;
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.a
    public final void a() {
        com.fyber.inneractive.sdk.web.v0 v0Var = this.c;
        v0Var.b.a(v0Var.c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f, v0Var.d, v0Var.h.f3757a));
        this.c.d("onShowInstallStarted();");
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.a
    public final void a(java.lang.String str) {
        com.fyber.inneractive.sdk.web.v0 v0Var = this.c;
        v0Var.b.m();
        v0Var.d("onInstallationFailed();");
        com.fyber.inneractive.sdk.web.v0 v0Var2 = this.c;
        v0Var2.h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, this.f4349a, this.b, v0Var2.d);
    }
}

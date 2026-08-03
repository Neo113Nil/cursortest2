package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class q0 implements com.digitalturbine.ignite.authenticator.listeners.internal.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.v0 f4351a;

    public q0(com.fyber.inneractive.sdk.web.v0 v0Var) {
        this.f4351a = v0Var;
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.a
    public final void a() {
        com.fyber.inneractive.sdk.util.IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectSuccess", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.web.v0 v0Var = this.f4351a;
        v0Var.b.a(v0Var.c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f, v0Var.d, v0Var.h.f3757a));
        this.f4351a.d("onShowInstallStarted();");
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.a
    public final void a(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectFailed: error: %s", str);
    }
}

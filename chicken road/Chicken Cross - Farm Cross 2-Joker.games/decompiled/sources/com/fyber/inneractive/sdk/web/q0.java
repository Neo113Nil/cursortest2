package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class q0 implements com.digitalturbine.ignite.authenticator.listeners.internal.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f6009a;

    public q0(v0 v0Var) {
        this.f6009a = v0Var;
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.a
    public final void a() {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectSuccess", new Object[0]);
        v0 v0Var = this.f6009a;
        v0Var.b.a(v0Var.c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f, v0Var.d, v0Var.h.f5410a));
        this.f6009a.d("onShowInstallStarted();");
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.internal.a
    public final void a(String str) {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectFailed: error: %s", str);
    }
}

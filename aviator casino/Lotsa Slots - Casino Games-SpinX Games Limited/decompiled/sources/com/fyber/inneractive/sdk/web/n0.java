package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.v0 f4345a;

    public n0(com.fyber.inneractive.sdk.web.v0 v0Var) {
        this.f4345a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.v0 v0Var = this.f4345a;
        v0Var.f4361a.stopLoading();
        com.fyber.inneractive.sdk.util.IAlog.a("%sonLoadTimeout after %d msec", com.fyber.inneractive.sdk.util.IAlog.a(v0Var), java.lang.Long.valueOf(v0Var.n));
        com.fyber.inneractive.sdk.flow.v vVar = v0Var.h;
        if (vVar == null || v0Var.d == null) {
            return;
        }
        vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_LOAD_WEBPAGE, v0Var.k, com.fyber.inneractive.sdk.ignite.j.LOAD_WEBPAGE_TIMEOUT.a(), v0Var.d);
    }
}

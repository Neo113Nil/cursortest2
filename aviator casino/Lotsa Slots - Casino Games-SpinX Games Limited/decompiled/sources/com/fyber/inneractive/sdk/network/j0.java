package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.network.t0 f3842a;
    public final /* synthetic */ com.fyber.inneractive.sdk.network.l0 b;

    public j0(com.fyber.inneractive.sdk.network.l0 l0Var, com.fyber.inneractive.sdk.network.t0 t0Var) {
        this.b = l0Var;
        this.f3842a = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.util.IAlog.e("retryNetworkRequest pre-execute - %s", this.f3842a.getClass().getName());
        this.b.a(this.f3842a);
    }
}

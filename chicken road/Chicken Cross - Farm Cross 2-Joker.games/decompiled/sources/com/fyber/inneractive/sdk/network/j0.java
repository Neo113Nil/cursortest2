package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f5496a;
    public final /* synthetic */ l0 b;

    public j0(l0 l0Var, t0 t0Var) {
        this.b = l0Var;
        this.f5496a = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.e("retryNetworkRequest pre-execute - %s", this.f5496a.getClass().getName());
        this.b.a(this.f5496a);
    }
}

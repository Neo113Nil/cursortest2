package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.v0 f4356a;

    public s0(com.fyber.inneractive.sdk.web.v0 v0Var) {
        this.f4356a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4356a.u.compareAndSet(false, true)) {
            this.f4356a.d("onCancelResult(true);");
            this.f4356a.v.set(false);
        }
    }
}

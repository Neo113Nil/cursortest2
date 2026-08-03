package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.v0 f4353a;

    public r0(com.fyber.inneractive.sdk.web.v0 v0Var) {
        this.f4353a = v0Var;
    }

    public final void a(boolean z) {
        if (this.f4353a.u.compareAndSet(false, true)) {
            this.f4353a.d("onCancelResult(" + z + ");");
            this.f4353a.v.set(false);
        }
    }
}

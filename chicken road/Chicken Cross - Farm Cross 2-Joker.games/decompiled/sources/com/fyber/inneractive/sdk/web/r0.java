package com.fyber.inneractive.sdk.web;

/* loaded from: classes4.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f6011a;

    public r0(v0 v0Var) {
        this.f6011a = v0Var;
    }

    public final void a(boolean z) {
        if (this.f6011a.u.compareAndSet(false, true)) {
            this.f6011a.d("onCancelResult(" + z + ");");
            this.f6011a.v.set(false);
        }
    }
}

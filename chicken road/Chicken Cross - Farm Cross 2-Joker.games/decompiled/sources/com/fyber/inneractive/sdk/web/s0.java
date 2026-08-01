package com.fyber.inneractive.sdk.web;

/* loaded from: classes4.dex */
public final class s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f6014a;

    public s0(v0 v0Var) {
        this.f6014a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6014a.u.compareAndSet(false, true)) {
            this.f6014a.d("onCancelResult(true);");
            this.f6014a.v.set(false);
        }
    }
}

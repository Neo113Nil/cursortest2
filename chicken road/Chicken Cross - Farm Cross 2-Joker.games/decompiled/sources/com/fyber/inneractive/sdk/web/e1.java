package com.fyber.inneractive.sdk.web;

/* loaded from: classes4.dex */
public final class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f5991a;

    public e1(i1 i1Var) {
        this.f5991a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f5991a.b;
        if (mVar != null) {
            mVar.getViewTreeObserver().addOnPreDrawListener(this.f5991a.K);
        }
    }
}

package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i1 f4333a;

    public e1(com.fyber.inneractive.sdk.web.i1 i1Var) {
        this.f4333a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.m mVar = this.f4333a.b;
        if (mVar != null) {
            mVar.getViewTreeObserver().addOnPreDrawListener(this.f4333a.K);
        }
    }
}

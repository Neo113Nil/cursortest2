package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class p implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i0 f4348a;

    public p(com.fyber.inneractive.sdk.web.i0 i0Var) {
        this.f4348a = i0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.fyber.inneractive.sdk.web.m mVar = this.f4348a.b;
        if (mVar == null) {
            return false;
        }
        mVar.getViewTreeObserver().removeOnPreDrawListener(this);
        com.fyber.inneractive.sdk.web.i0 i0Var = this.f4348a;
        i0Var.a(i0Var.b.getContext(), true);
        return false;
    }
}

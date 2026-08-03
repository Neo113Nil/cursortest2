package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class f1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i1 f4335a;

    public f1(com.fyber.inneractive.sdk.web.i1 i1Var) {
        this.f4335a = i1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.fyber.inneractive.sdk.web.m mVar;
        com.fyber.inneractive.sdk.web.m mVar2 = this.f4335a.b;
        if (mVar2 == null) {
            return false;
        }
        mVar2.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f4335a.k();
        com.fyber.inneractive.sdk.web.i1 i1Var = this.f4335a;
        i1Var.a(new com.fyber.inneractive.sdk.mraid.b0(i1Var.G));
        com.fyber.inneractive.sdk.web.i1 i1Var2 = this.f4335a;
        if (i1Var2.G == com.fyber.inneractive.sdk.web.c0.INTERSTITIAL && (mVar = i1Var2.b) != null) {
            mVar.a("if (window.showInterstitial) { showInterstitial(); }");
        }
        this.f4335a.j();
        com.fyber.inneractive.sdk.web.i1 i1Var3 = this.f4335a;
        i1Var3.a(com.fyber.inneractive.sdk.util.o.a(i1Var3.b), true);
        this.f4335a.n();
        com.fyber.inneractive.sdk.util.r.b.postDelayed(this.f4335a.L, 250L);
        return false;
    }
}

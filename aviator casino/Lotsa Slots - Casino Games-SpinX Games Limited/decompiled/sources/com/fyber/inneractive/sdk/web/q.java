package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i0 f4350a;

    public q(com.fyber.inneractive.sdk.web.i0 i0Var) {
        this.f4350a = i0Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (i != 4 || !this.f4350a.p()) {
            return false;
        }
        com.fyber.inneractive.sdk.util.IAlog.e("back button pressed while ad is expanded, ad will be collapsed.", new java.lang.Object[0]);
        this.f4350a.o();
        return true;
    }
}

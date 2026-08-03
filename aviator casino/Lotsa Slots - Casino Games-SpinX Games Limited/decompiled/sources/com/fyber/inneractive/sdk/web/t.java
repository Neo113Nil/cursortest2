package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class t implements android.window.OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i0 f4357a;

    public t(com.fyber.inneractive.sdk.web.i0 i0Var) {
        this.f4357a = i0Var;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        com.fyber.inneractive.sdk.web.i0 i0Var = this.f4357a;
        if (i0Var.p()) {
            com.fyber.inneractive.sdk.util.IAlog.e("back button pressed while ad is expanded, ad will be collapsed.", new java.lang.Object[0]);
            i0Var.o();
        }
    }
}

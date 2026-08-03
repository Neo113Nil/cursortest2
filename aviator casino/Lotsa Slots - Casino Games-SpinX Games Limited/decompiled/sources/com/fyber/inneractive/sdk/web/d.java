package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i f4329a;

    public d(com.fyber.inneractive.sdk.web.i1 i1Var) {
        this.f4329a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.i iVar = this.f4329a;
        if (iVar.k) {
            com.fyber.inneractive.sdk.util.IAlog.a("No user web action detected for : %s blocking.", iVar.l);
            com.fyber.inneractive.sdk.web.i iVar2 = this.f4329a;
            java.lang.String c = iVar2.l.c();
            java.lang.String a2 = this.f4329a.l.a();
            com.fyber.inneractive.sdk.web.j1 j1Var = iVar2.g;
            if (j1Var != null) {
                j1Var.a(c, a2);
            }
            com.fyber.inneractive.sdk.util.IAlog.d("AD_AUTO_CLICK_DETECTED", new java.lang.Object[0]);
            this.f4329a.l.b();
            this.f4329a.i();
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("User web action detected for: %s", iVar.l);
            this.f4329a.l.d();
        }
        this.f4329a.l = null;
    }
}

package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class f0 implements com.fyber.inneractive.sdk.web.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.mraid.e f4334a;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i0 b;

    public f0(com.fyber.inneractive.sdk.web.i0 i0Var, com.fyber.inneractive.sdk.mraid.e eVar) {
        this.b = i0Var;
        this.f4334a = eVar;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final java.lang.String a() {
        return this.f4334a.c();
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
        com.fyber.inneractive.sdk.mraid.e eVar = this.f4334a;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final java.lang.String c() {
        return this.f4334a.f3823a;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController = (com.fyber.inneractive.sdk.ui.IAmraidWebViewController) this.b;
        if (iAmraidWebViewController.I != null) {
            iAmraidWebViewController.I.a();
        }
        this.f4334a.a();
    }

    public final java.lang.String toString() {
        return "action = " + this.f4334a.f3823a + " url = " + this.f4334a.c();
    }
}

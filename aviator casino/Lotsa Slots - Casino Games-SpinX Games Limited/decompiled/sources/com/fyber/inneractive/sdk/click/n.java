package com.fyber.inneractive.sdk.click;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.click.b f3580a;
    public final /* synthetic */ com.fyber.inneractive.sdk.click.r b;

    public n(com.fyber.inneractive.sdk.click.r rVar, com.fyber.inneractive.sdk.click.b bVar) {
        this.b = rVar;
        this.f3580a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.click.o oVar = this.b.e;
        if (oVar != null) {
            oVar.a(this.f3580a);
        }
    }
}

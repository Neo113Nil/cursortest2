package com.fyber.inneractive.sdk.click;

/* loaded from: classes4.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f5231a;
    public final /* synthetic */ r b;

    public n(r rVar, b bVar) {
        this.b = rVar;
        this.f5231a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.b.e;
        if (oVar != null) {
            oVar.a(this.f5231a);
        }
    }
}

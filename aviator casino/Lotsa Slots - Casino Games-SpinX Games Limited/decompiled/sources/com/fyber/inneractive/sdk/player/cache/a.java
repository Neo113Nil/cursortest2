package com.fyber.inneractive.sdk.player.cache;

/* loaded from: classes3.dex */
public final class a implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.cache.g f3866a;

    public a(com.fyber.inneractive.sdk.player.cache.g gVar) {
        this.f3866a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        synchronized (this.f3866a) {
            com.fyber.inneractive.sdk.player.cache.g gVar = this.f3866a;
            if (gVar.i == null) {
                return null;
            }
            gVar.d();
            com.fyber.inneractive.sdk.player.cache.g gVar2 = this.f3866a;
            int i = gVar2.k;
            if (i >= 2000 && i >= gVar2.j.size()) {
                this.f3866a.c();
                this.f3866a.k = 0;
            }
            return null;
        }
    }
}

package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.d f3674a;

    public b(com.fyber.inneractive.sdk.flow.d dVar) {
        this.f3674a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s : ContentLoadTimeoutHandler Executing timeout task", com.fyber.inneractive.sdk.util.IAlog.a(this.f3674a));
        this.f3674a.b.a();
    }
}

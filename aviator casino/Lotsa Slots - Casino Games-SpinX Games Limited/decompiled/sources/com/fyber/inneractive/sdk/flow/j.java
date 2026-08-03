package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.k f3704a;

    public j(com.fyber.inneractive.sdk.flow.k kVar) {
        this.f3704a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.flow.k kVar = this.f3704a;
        kVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s : IAAdContentLoaderImpl : retry load ad task started execution", com.fyber.inneractive.sdk.util.IAlog.a(kVar));
        this.f3704a.b();
    }
}

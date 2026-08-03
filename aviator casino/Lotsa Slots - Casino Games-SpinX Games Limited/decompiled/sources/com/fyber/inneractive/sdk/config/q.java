package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.s f3625a;

    public q(com.fyber.inneractive.sdk.config.s sVar) {
        this.f3625a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.config.s sVar = this.f3625a;
        java.util.Iterator it = sVar.c.iterator();
        while (it.hasNext()) {
            ((com.fyber.inneractive.sdk.config.r) it.next()).onGlobalConfigChanged(sVar, sVar.b);
        }
    }
}

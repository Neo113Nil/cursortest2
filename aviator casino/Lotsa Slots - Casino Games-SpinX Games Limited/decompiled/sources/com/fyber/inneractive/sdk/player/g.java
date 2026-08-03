package com.fyber.inneractive.sdk.player;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.h f4139a;

    public g(com.fyber.inneractive.sdk.player.h hVar) {
        this.f4139a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.h hVar = this.f4139a;
        hVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("player progress monitor: run started", new java.lang.Object[0]);
        int b = hVar.f4140a.b();
        if (!hVar.d) {
            com.fyber.inneractive.sdk.util.IAlog.a("run: 2 seconds passed? played for %d since last play started", java.lang.Integer.valueOf(b));
            if (b >= 2000) {
                com.fyber.inneractive.sdk.util.IAlog.a("run: setting played 2 seconds flag", new java.lang.Object[0]);
                hVar.d = true;
            }
        }
        hVar.f4140a.a(b);
    }
}

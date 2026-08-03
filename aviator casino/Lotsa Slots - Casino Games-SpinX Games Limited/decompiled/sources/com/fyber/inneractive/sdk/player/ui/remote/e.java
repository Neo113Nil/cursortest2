package com.fyber.inneractive.sdk.player.ui.remote;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.remote.d f4172a;
    public boolean c = false;
    public final java.util.concurrent.ConcurrentHashMap b = new java.util.concurrent.ConcurrentHashMap();

    public e(com.fyber.inneractive.sdk.player.ui.remote.d dVar) {
        this.f4172a = dVar;
    }

    public final void a(java.lang.String str, java.lang.String str2, boolean z) {
        if (!z) {
            this.b.put(str, str2);
            return;
        }
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f4172a;
        if (dVar != null) {
            dVar.b.a(str2);
        }
    }

    public final void a(int i, com.fyber.inneractive.sdk.util.g1 g1Var) {
        com.fyber.inneractive.sdk.player.ui.n nVar;
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f4172a;
        if (dVar == null || (nVar = dVar.e) == null) {
            return;
        }
        ((com.fyber.inneractive.sdk.player.controller.z) nVar).a(i, g1Var);
    }
}

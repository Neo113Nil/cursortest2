package com.fyber.inneractive.sdk.player.ui.remote;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.ui.remote.d f4169a;

    public b(com.fyber.inneractive.sdk.player.ui.remote.d dVar) {
        this.f4169a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s : remote UI load timeout task executed", "RemoteUIWebviewController");
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f4169a;
        dVar.g = true;
        com.fyber.inneractive.sdk.util.IAlog.a("%s : UI load timed out", "RemoteUIWebviewController");
        com.fyber.inneractive.sdk.util.r.b.post(dVar.l);
    }
}

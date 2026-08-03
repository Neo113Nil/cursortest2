package com.fyber.inneractive.sdk.player.ui.remote;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.ui.remote.d f4170a;

    public c(com.fyber.inneractive.sdk.player.ui.remote.d dVar) {
        this.f4170a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s : remote UI failed task executed", "RemoteUIWebviewController");
        com.fyber.inneractive.sdk.player.ui.remote.d dVar = this.f4170a;
        if (dVar.h) {
            return;
        }
        dVar.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_LOAD_TIMEOUT, "Loading remote UI timed out", true, null);
    }
}

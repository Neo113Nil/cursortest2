package com.fyber.inneractive.sdk.player.mediaplayer;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.mediaplayer.p f4144a;

    public c(com.fyber.inneractive.sdk.player.mediaplayer.p pVar) {
        this.f4144a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.util.IAlog.a("%sCannot wait for video size anymore", this.f4144a.b());
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f4144a;
        if (pVar.r == 0) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sCannot wait for video size anymore. duration is still 0 - aborting", pVar.b());
            com.fyber.inneractive.sdk.player.mediaplayer.p pVar2 = this.f4144a;
            pVar2.onError(pVar2, 0, 0);
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("%sCannot wait for video size anymore. moving into ready", pVar.b());
            com.fyber.inneractive.sdk.player.mediaplayer.p pVar3 = this.f4144a;
            pVar3.f = true;
            pVar3.c();
        }
    }
}

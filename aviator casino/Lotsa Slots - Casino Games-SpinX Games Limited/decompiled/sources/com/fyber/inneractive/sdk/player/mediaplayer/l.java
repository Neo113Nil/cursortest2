package com.fyber.inneractive.sdk.player.mediaplayer;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.mediaplayer.p f4153a;

    public l(com.fyber.inneractive.sdk.player.mediaplayer.p pVar) {
        this.f4153a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f4153a;
        java.lang.String b = pVar.b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        pVar.setVolume(0.0f, 0.0f);
        com.fyber.inneractive.sdk.util.IAlog.e(b + "timelog: mute took " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " msec", new java.lang.Object[0]);
    }
}

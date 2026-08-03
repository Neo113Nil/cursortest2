package com.fyber.inneractive.sdk.player.mediaplayer;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4151a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.mediaplayer.p b;

    public j(com.fyber.inneractive.sdk.player.mediaplayer.p pVar, int i) {
        this.b = pVar;
        this.f4151a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.b;
        int i = this.f4151a;
        java.lang.String b = pVar.b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        pVar.seekTo(i);
        com.fyber.inneractive.sdk.util.IAlog.e(b + "timelog: seekTo took " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " msec", new java.lang.Object[0]);
    }
}

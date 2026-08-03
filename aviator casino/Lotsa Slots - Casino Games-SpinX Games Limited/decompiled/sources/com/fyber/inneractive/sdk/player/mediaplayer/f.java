package com.fyber.inneractive.sdk.player.mediaplayer;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f4147a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.mediaplayer.p b;

    public f(com.fyber.inneractive.sdk.player.mediaplayer.p pVar, android.view.Surface surface) {
        this.b = pVar;
        this.f4147a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.mediaplayer.p.a(this.b, this.f4147a);
    }
}

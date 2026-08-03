package com.fyber.inneractive.sdk.player.mediaplayer;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceHolder f4146a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.mediaplayer.p b;

    public e(com.fyber.inneractive.sdk.player.mediaplayer.p pVar, android.view.SurfaceHolder surfaceHolder) {
        this.b = pVar;
        this.f4146a = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.mediaplayer.p.a(this.b, this.f4146a);
    }
}

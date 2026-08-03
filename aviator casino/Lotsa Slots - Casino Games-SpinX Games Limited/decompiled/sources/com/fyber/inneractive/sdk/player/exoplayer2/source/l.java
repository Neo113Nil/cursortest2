package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.io.IOException f4058a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.source.p b;

    public l(com.fyber.inneractive.sdk.player.exoplayer2.source.p pVar, java.io.IOException iOException) {
        this.b = pVar;
        this.f4058a = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.controller.b0 b0Var = this.b.e;
        java.io.IOException iOException = this.f4058a;
        if (((com.fyber.inneractive.sdk.player.controller.f) b0Var.f3877a.get()) != null) {
            iOException.getCause();
        }
    }
}

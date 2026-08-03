package com.fyber.inneractive.sdk.player.mediaplayer;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f4145a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.mediaplayer.p b;

    public d(com.fyber.inneractive.sdk.player.mediaplayer.p pVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.b = pVar;
        this.f4145a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.mediaplayer.n nVar = this.b.i;
        if (nVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.q) nVar).a(this.f4145a);
        }
    }
}

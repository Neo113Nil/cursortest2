package com.fyber.inneractive.sdk.player.mediaplayer;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4142a;
    public final /* synthetic */ int b;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.mediaplayer.p c;

    public a(com.fyber.inneractive.sdk.player.mediaplayer.p pVar, int i, int i2) {
        this.c = pVar;
        this.f4142a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.i != null) {
            java.util.Locale locale = java.util.Locale.ENGLISH;
            java.lang.String str = "Player Error: " + this.f4142a + ", " + this.b;
            com.fyber.inneractive.sdk.player.mediaplayer.n nVar = this.c.i;
            com.fyber.inneractive.sdk.player.mediaplayer.o oVar = new com.fyber.inneractive.sdk.player.mediaplayer.o(str);
            com.fyber.inneractive.sdk.player.controller.q qVar = (com.fyber.inneractive.sdk.player.controller.q) nVar;
            qVar.a(com.fyber.inneractive.sdk.player.enums.b.Error);
            com.fyber.inneractive.sdk.util.IAlog.a("%sonPlayerError called with: %s for onPlayerError", com.fyber.inneractive.sdk.util.IAlog.a(qVar), oVar);
            qVar.i.post(new com.fyber.inneractive.sdk.player.controller.j(qVar, oVar));
            qVar.k();
        }
    }
}

package com.fyber.inneractive.sdk.player.ui.remote;

/* loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.web.remoteui.a {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.s f4173a;
    public boolean h;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean i = false;
    public boolean j = false;
    public com.fyber.inneractive.sdk.ignite.m k = com.fyber.inneractive.sdk.ignite.m.NONE;
    public java.lang.String l = "";

    public f(com.fyber.inneractive.sdk.player.ui.o oVar) {
        this.f4173a = null;
        this.h = false;
        this.f4173a = oVar;
        this.h = oVar.I;
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, java.lang.String str, boolean z, java.util.HashMap hashMap) {
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f4173a;
        if (sVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s: showFallback: fallback won't be displayed because it is null", "RemoteUiFallbackHandler");
            return;
        }
        sVar.g(this.b);
        this.f4173a.d(this.i);
        this.f4173a.f(this.f);
        this.f4173a.a(this.e, this.k);
        this.f4173a.c(this.h);
        this.f4173a.a(this.j, this.l);
        this.f4173a.b(this.g);
        this.f4173a.e(this.c);
        this.f4173a.a(this.d);
    }
}

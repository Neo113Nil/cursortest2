package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class a extends com.fyber.inneractive.sdk.player.controller.q {
    public com.fyber.inneractive.sdk.player.mediaplayer.p p;
    public int q;
    public final int r;
    public int s;
    public boolean t;

    public a(android.content.Context context) {
        super(context);
        this.q = 0;
        this.r = 2;
        this.s = 0;
        this.t = false;
        com.fyber.inneractive.sdk.util.IAlog.a("Creating IAAndroidMediaPlayerController", new java.lang.Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
        if (pVar != null) {
            pVar.reset();
            this.p.release();
            this.p = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void b(boolean z) {
        if (g() && this.n) {
            return;
        }
        this.n = z;
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
        if (pVar != null) {
            pVar.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int c() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
        if (pVar != null) {
            return pVar.r;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void d(boolean z) {
        if (g() || !this.n) {
            this.n = z;
            com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
            if (pVar != null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s unmute", pVar.b());
                pVar.d = false;
                if (pVar.a()) {
                    pVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.m(pVar));
                } else {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s unmute called when player is not ready!", pVar.b());
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int e() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
        if (pVar != null) {
            return pVar.t;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int f() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
        if (pVar != null) {
            return pVar.s;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean g() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
        if (pVar != null) {
            return pVar.d;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void i() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
        if (pVar != null) {
            pVar.pause();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void j() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
        if (pVar != null) {
            pVar.start();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i, boolean z) {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
        if (pVar != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s seek to called with = %d mPlayAfterSeek = %s", pVar.b(), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z));
            if (!pVar.a()) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s seek called when player is not ready!", pVar.b());
                return;
            }
            com.fyber.inneractive.sdk.player.enums.b bVar = pVar.b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Seeking;
            if (bVar == bVar2) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s seek called when player is already seeking!", pVar.b());
                return;
            }
            pVar.a(bVar2);
            pVar.c = z;
            pVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.j(pVar, i));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int b() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
        if (pVar != null) {
            return pVar.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final java.lang.String d() {
        return "media";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(android.view.Surface surface) {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.p;
        if (pVar != null) {
            pVar.setSurface(surface);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(boolean z) {
        if (this.p == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("MediaPlayerController: creating media player", new java.lang.Object[0]);
            this.p = new com.fyber.inneractive.sdk.player.mediaplayer.p(this.f3891a, this, this.i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(java.lang.String str, int i) {
        this.p.a(str);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i) {
        this.i.post(new com.fyber.inneractive.sdk.player.controller.l(this, i));
        if (i >= c()) {
            a(com.fyber.inneractive.sdk.player.enums.b.Completed);
        } else if (i == this.q) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sVideo is stuck! Progress doesn't change", com.fyber.inneractive.sdk.util.IAlog.a(this));
            int i2 = this.s + 1;
            this.s = i2;
            if (i2 == this.r) {
                a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                this.t = true;
            }
        } else if (this.t) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sVideo progress was stuck! but now it goes forward. Remove buffering state", com.fyber.inneractive.sdk.util.IAlog.a(this));
            a(com.fyber.inneractive.sdk.player.enums.b.Playing);
            this.s = 0;
            this.t = false;
        }
        this.q = i;
    }
}

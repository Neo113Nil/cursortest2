package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class f extends com.fyber.inneractive.sdk.player.controller.q {
    public final boolean A;
    public final java.util.concurrent.CopyOnWriteArrayList B;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u C;
    public boolean D;
    public int E;
    public final int p;
    public final com.fyber.inneractive.sdk.config.global.r q;
    public final int r;
    public com.fyber.inneractive.sdk.player.exoplayer2.g s;
    public int t;
    public int u;
    public boolean v;
    public com.fyber.inneractive.sdk.player.exoplayer2.a[] w;
    public android.os.Handler x;
    public com.fyber.inneractive.sdk.player.controller.b0 y;
    public boolean z;

    public f(android.content.Context context, boolean z, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(context);
        java.lang.Integer a2;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.z = false;
        this.B = new java.util.concurrent.CopyOnWriteArrayList();
        this.C = null;
        this.E = 0;
        this.A = z;
        this.q = rVar;
        this.r = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("extractor_source_retry_count", 6, 3);
        com.fyber.inneractive.sdk.config.global.features.v vVar = rVar != null ? (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class) : null;
        this.p = (vVar == null || (a2 = vVar.a("max_tries")) == null) ? 0 : a2.intValue();
        com.fyber.inneractive.sdk.util.IAlog.a("Creating IAExoPlayer2Controller", new java.lang.Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a() {
        if (this.s != null) {
            if (!this.z) {
                this.z = true;
                com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.player.controller.e(this));
            }
            com.fyber.inneractive.sdk.player.controller.b0 b0Var = this.y;
            if (b0Var != null) {
                b0Var.f3877a.clear();
            }
            this.y = null;
        }
        java.util.Iterator it = this.B.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
        this.B.clear();
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void b(boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        this.n = z;
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.w;
        if (aVarArr == null || (gVar = this.s) == null || this.z || aVarArr.length < 2) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, java.lang.Float.valueOf(0.0f)));
        this.v = true;
        c(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int c() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.s;
        if (gVar == null || this.z) {
            return 0;
        }
        return (int) (gVar.m.c() ? -9223372036854775807L : com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.m.a(gVar.a(), gVar.f).f));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void d(boolean z) {
        this.n = z;
        if (this.s == null || this.z) {
            return;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) this.f3891a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = streamVolume / streamMaxVolume;
        com.fyber.inneractive.sdk.util.IAlog.a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", java.lang.Integer.valueOf(streamMaxVolume), java.lang.Integer.valueOf(streamVolume), java.lang.Float.valueOf(f));
        if (streamVolume == 0) {
            com.fyber.inneractive.sdk.util.IAlog.a("Avoided unmute - Device is muted", new java.lang.Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.w;
        if (aVarArr != null && aVarArr.length >= 2) {
            this.s.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[1], 2, java.lang.Float.valueOf(f)));
        }
        this.v = false;
        c(false);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int e() {
        return this.u;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int f() {
        return this.t;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean g() {
        return this.v;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean h() {
        return (this.s == null || this.z || this.e != com.fyber.inneractive.sdk.player.enums.b.Playing) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void i() {
        com.fyber.inneractive.sdk.player.enums.b bVar;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = this.e;
        if (bVar2 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar2 == (bVar = com.fyber.inneractive.sdk.player.enums.b.Paused) || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s paused called when player is in mState: %s ignoring", com.fyber.inneractive.sdk.util.IAlog.a(this), bVar2);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.s;
        if (gVar != null && !this.z) {
            gVar.a(false);
        }
        k();
        a(bVar);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void j() {
        com.fyber.inneractive.sdk.util.IAlog.a("%sstart called", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (h()) {
            return;
        }
        a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
        this.s.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int b() {
        long j;
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.s;
        if (gVar == null || this.z) {
            return 0;
        }
        if (!gVar.m.c() && gVar.k <= 0) {
            gVar.m.a(gVar.q.f4031a, gVar.g, false);
            j = com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.q.c) + com.fyber.inneractive.sdk.player.exoplayer2.b.a(gVar.g.e);
        } else {
            j = gVar.s;
        }
        return (int) j;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i, boolean z) {
        com.fyber.inneractive.sdk.util.IAlog.a("%sseekTo called with %d playAfterSeek = %s", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z));
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.s;
        if (gVar == null || this.z) {
            return;
        }
        gVar.a(z);
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.s;
        gVar2.a(gVar2.a(), i);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final java.lang.String d() {
        return this.A ? "exo_c" : "exo";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(android.view.Surface surface) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        com.fyber.inneractive.sdk.util.IAlog.a("%ssetSurface called with %s", com.fyber.inneractive.sdk.util.IAlog.a(this), surface);
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.w;
        if (aVarArr == null || (gVar = this.s) == null || this.z) {
            return;
        }
        gVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.e(aVarArr[0], 1, surface));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(boolean z) {
        if (this.s != null || this.z) {
            return;
        }
        this.D = z;
        com.fyber.inneractive.sdk.util.IAlog.a("%sMediaPlayerController: creating media player", com.fyber.inneractive.sdk.util.IAlog.a(this));
        com.fyber.inneractive.sdk.player.controller.b0 b0Var = this.y;
        if (b0Var != null) {
            b0Var.f3877a.clear();
        }
        this.y = new com.fyber.inneractive.sdk.player.controller.b0(this);
        this.x = new android.os.Handler(android.os.Looper.getMainLooper());
        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.a[z ? 2 : 1];
        this.w = aVarArr;
        aVarArr[0] = new com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer(this.x, this.y);
        if (z) {
            this.w[1] = new com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.g(this.w, new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d(), new com.fyber.inneractive.sdk.player.exoplayer2.c());
        this.s = gVar;
        gVar.e.add(this.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    @Override // com.fyber.inneractive.sdk.player.controller.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(java.lang.String str, int i) {
        java.io.File a2;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g fVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.u jVar;
        if (this.s == null || this.z) {
            return;
        }
        char c = 0;
        com.fyber.inneractive.sdk.util.IAlog.a("%sloadMediaPlayerUri called with %s", com.fyber.inneractive.sdk.util.IAlog.a(this), str);
        android.net.Uri parse = android.net.Uri.parse(str);
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        java.lang.String path = parse.getPath();
        if (path != null) {
            java.lang.String lowerCase = path.toLowerCase();
            if (!lowerCase.endsWith(".mpd")) {
                if (lowerCase.endsWith(".m3u8")) {
                    c = 2;
                } else if (lowerCase.endsWith(".ism") || lowerCase.endsWith(".isml") || lowerCase.endsWith(".ism/manifest") || lowerCase.endsWith(".isml/manifest")) {
                    c = 1;
                }
            }
            if (!this.A && com.fyber.inneractive.sdk.player.cache.n.f.c && com.fyber.inneractive.sdk.util.s.a() && c != 2) {
                fVar = new com.fyber.inneractive.sdk.player.cache.i(this, i, this.q);
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.m();
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.o oVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.o(this.f3891a, mVar, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.q(com.fyber.inneractive.sdk.config.IAConfigManager.N.x.a(), mVar));
                a2 = com.fyber.inneractive.sdk.player.cache.n.a(this.f3891a, "ia-vid-cache-ex2");
                if (a2 == null) {
                    fVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.f(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l(a2, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.j()), oVar);
                } else {
                    gVar = oVar;
                    if (c == 2) {
                        jVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.q(parse, gVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.c(), this.r, this.x, this.y);
                    } else {
                        jVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j(parse, gVar, this.x, this.y);
                    }
                    this.C = jVar;
                    a(jVar);
                    return;
                }
            }
            gVar = fVar;
            if (c == 2) {
            }
            this.C = jVar;
            a(jVar);
            return;
        }
        c = 3;
        if (!this.A) {
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.m();
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.o oVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.o(this.f3891a, mVar2, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.q(com.fyber.inneractive.sdk.config.IAConfigManager.N.x.a(), mVar2));
        a2 = com.fyber.inneractive.sdk.player.cache.n.a(this.f3891a, "ia-vid-cache-ex2");
        if (a2 == null) {
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.s;
        if (gVar == null || uVar == null) {
            return;
        }
        if (!gVar.m.c() || gVar.n != null) {
            gVar.m = com.fyber.inneractive.sdk.player.exoplayer2.x.f4137a;
            gVar.n = null;
            java.util.Iterator it = gVar.e.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.controller.b0) it.next()).getClass();
            }
        }
        if (gVar.h) {
            gVar.h = false;
            int i = com.fyber.inneractive.sdk.player.exoplayer2.source.z.d;
            gVar.o = gVar.b;
            ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) gVar.f4029a).getClass();
            java.util.Iterator it2 = gVar.e.iterator();
            while (it2.hasNext()) {
                ((com.fyber.inneractive.sdk.player.controller.b0) it2.next()).getClass();
            }
        }
        gVar.l++;
        gVar.d.f.obtainMessage(0, 1, 0, uVar).sendToTarget();
        a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
    }
}

package com.fyber.inneractive.sdk.player.mediaplayer;

/* loaded from: classes3.dex */
public final class p extends android.media.MediaPlayer implements android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4155a;
    public final android.os.Handler h;
    public com.fyber.inneractive.sdk.player.mediaplayer.n i;
    public android.view.Surface j;
    public android.view.SurfaceHolder k;
    public long l;
    public android.os.HandlerThread n;
    public android.os.Handler o;
    public com.fyber.inneractive.sdk.player.mediaplayer.c p;
    public com.fyber.inneractive.sdk.player.mediaplayer.b q;
    public volatile com.fyber.inneractive.sdk.player.enums.b b = com.fyber.inneractive.sdk.player.enums.b.Idle;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public int m = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;

    public p(android.content.Context context, com.fyber.inneractive.sdk.player.mediaplayer.n nVar, android.os.Handler handler) {
        this.f4155a = context;
        this.i = nVar;
        this.h = handler;
        setOnPreparedListener(this);
        setOnErrorListener(this);
        setOnSeekCompleteListener(this);
        setOnVideoSizeChangedListener(this);
        super.setOnCompletionListener(this);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("MP-Worker");
        this.n = handlerThread;
        handlerThread.start();
        this.o = new android.os.Handler(this.n.getLooper());
        this.q = new com.fyber.inneractive.sdk.player.mediaplayer.b(this);
    }

    public static void b(com.fyber.inneractive.sdk.player.mediaplayer.p pVar) {
        java.lang.String b = pVar.b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.release();
        com.fyber.inneractive.sdk.util.IAlog.e(b + "timelog: release took " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " msec", new java.lang.Object[0]);
    }

    public static void c(com.fyber.inneractive.sdk.player.mediaplayer.p pVar) {
        java.lang.String b = pVar.b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = pVar.b;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Prepared || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed || bVar == com.fyber.inneractive.sdk.player.enums.b.Start_in_progress) {
            super.start();
            pVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("%s Start called in wrong mState! %s", pVar.b(), bVar);
            if (pVar.b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
                pVar.c = true;
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.e(b + "timelog: start took " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " msec", new java.lang.Object[0]);
    }

    public final boolean a() {
        return (this.b == com.fyber.inneractive.sdk.player.enums.b.Idle || this.b == com.fyber.inneractive.sdk.player.enums.b.Preparing) ? false : true;
    }

    public final void d() {
        this.d = true;
        if (a()) {
            a(new com.fyber.inneractive.sdk.player.mediaplayer.l(this));
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("%s mute called when player is not ready!", b());
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s mute", b());
    }

    public final void e() {
        java.lang.String b = b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.fyber.inneractive.sdk.player.enums.b bVar = this.b;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Idle;
        if (bVar == bVar2) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s reset called, but player is already resetted. Do nothing", b());
            return;
        }
        a(bVar2);
        try {
            super.reset();
        } catch (java.lang.Exception unused) {
        }
        com.fyber.inneractive.sdk.util.IAlog.e(b + "timelog: reset took " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " msec", new java.lang.Object[0]);
    }

    @Override // android.media.MediaPlayer
    public final int getCurrentPosition() {
        if (a()) {
            return super.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.media.MediaPlayer
    public final int getDuration() {
        return this.r;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoHeight() {
        return this.t;
    }

    @Override // android.media.MediaPlayer
    public final int getVideoWidth() {
        return this.s;
    }

    @Override // android.media.MediaPlayer
    public final boolean isPlaying() {
        return a() && this.b != com.fyber.inneractive.sdk.player.enums.b.Paused && super.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
        a(com.fyber.inneractive.sdk.player.enums.b.Completed);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        com.fyber.inneractive.sdk.util.IAlog.f("%s onError code = %d code2 = %d", b(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        e();
        this.h.post(new com.fyber.inneractive.sdk.player.mediaplayer.a(this, i, i2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s onPrepared %s gotPrepared = %s", b(), this, java.lang.Boolean.valueOf(this.g));
        com.fyber.inneractive.sdk.util.IAlog.a("%sMedia prepare time took %d msec", b(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.l));
        if (this.b != com.fyber.inneractive.sdk.player.enums.b.Preparing && this.b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s onPrepared: previous error encountered. Aborting", b());
        } else if (this.g) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s onPrepared called again??? We are already prepared", b());
        } else {
            this.g = true;
            c();
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s onSeekComplete called current position = %d", b(), java.lang.Integer.valueOf(mediaPlayer.getCurrentPosition()));
        if (this.b != com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s onSeekComplete called when Story is not seeking", b());
            return;
        }
        if (this.d) {
            d();
        }
        if (!this.c) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s onSeekComplete mPlayAfterSeek = false", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Paused);
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("%s onSeekComplete mPlayAfterSeek = true", b());
            this.b = com.fyber.inneractive.sdk.player.enums.b.Paused;
            start();
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s onVideoSizeChanged %d, %d", b(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        if (this.f) {
            return;
        }
        com.fyber.inneractive.sdk.player.mediaplayer.c cVar = this.p;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(cVar);
            com.fyber.inneractive.sdk.util.IAlog.a("%s onVideoSizeChanged cancelling prepared runnable", b());
        }
        this.f = true;
        if (i == 0 || i2 == 0) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s onVideoSizeChanged - Invalid video size!", b());
            onError(this, 0, 0);
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("%sMedia got video size time took %d msec", b(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.l));
            this.s = i;
            this.t = i2;
            c();
        }
    }

    @Override // android.media.MediaPlayer
    public final void pause() {
        if (this.b != com.fyber.inneractive.sdk.player.enums.b.Idle && this.b != com.fyber.inneractive.sdk.player.enums.b.Completed) {
            com.fyber.inneractive.sdk.player.enums.b bVar = this.b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Paused;
            if (bVar != bVar2 && this.b != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
                a(bVar2);
                if (a()) {
                    a(new com.fyber.inneractive.sdk.player.mediaplayer.k(this));
                } else {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s paused called when player is not ready!", b());
                }
                com.fyber.inneractive.sdk.util.IAlog.a("%s pause", b());
                return;
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s paused called when player is in mState: %s ignoring", b(), this.b);
    }

    @Override // android.media.MediaPlayer
    public final void release() {
        if (!this.e) {
            a(new com.fyber.inneractive.sdk.player.mediaplayer.g(this));
        }
        this.i = null;
        this.q = null;
        this.e = true;
        com.fyber.inneractive.sdk.util.IAlog.a("%s release called", b());
    }

    @Override // android.media.MediaPlayer
    public final void reset() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s reset called", b());
        com.fyber.inneractive.sdk.player.mediaplayer.c cVar = this.p;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(cVar);
        }
        a(new com.fyber.inneractive.sdk.player.mediaplayer.h(this));
    }

    @Override // android.media.MediaPlayer
    public final void setDisplay(android.view.SurfaceHolder surfaceHolder) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s setDisplay called", b());
        if (!a()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s setDisplay called when player is not ready!", b());
            return;
        }
        android.view.SurfaceHolder surfaceHolder2 = this.k;
        if (surfaceHolder2 != null && surfaceHolder2.equals(surfaceHolder)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s setDisplay called with existing surface. ignoring!", b());
        } else {
            this.k = surfaceHolder;
            a(new com.fyber.inneractive.sdk.player.mediaplayer.e(this, surfaceHolder));
        }
    }

    @Override // android.media.MediaPlayer
    public final void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener onCompletionListener) {
        throw new java.lang.IllegalAccessError("Please use IAplayerCallbacks to receive completion events");
    }

    @Override // android.media.MediaPlayer
    public final void setSurface(android.view.Surface surface) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s setSurface called", b());
        android.view.Surface surface2 = this.j;
        if (surface2 != null && surface2.equals(surface)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s setSurface called with existing surface. ignoring!", b());
        } else {
            this.j = surface;
            a(new com.fyber.inneractive.sdk.player.mediaplayer.f(this, surface));
        }
    }

    @Override // android.media.MediaPlayer
    public final void start() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s Start called", b());
        if (!a()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s MediaPlayer: Start called when player is not ready! - mState = %s", b(), this.b);
            return;
        }
        if (this.b == com.fyber.inneractive.sdk.player.enums.b.Seeking) {
            this.c = true;
        } else if (isPlaying()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s MediaPlayer: Start called when player is already playing. do nothing", b());
        } else {
            a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
            a(new com.fyber.inneractive.sdk.player.mediaplayer.i(this));
        }
    }

    @Override // android.media.MediaPlayer
    public final void stop() {
        java.lang.String b = b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (a()) {
            super.stop();
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s stop called", b());
        com.fyber.inneractive.sdk.util.IAlog.e(b + "timelog: stop took " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " msec", new java.lang.Object[0]);
    }

    public final void a(java.lang.String str) {
        java.lang.String b = b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f = false;
        this.g = false;
        if (isPlaying()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s loadUri stopping play before refresh", b());
            stop();
        }
        this.l = java.lang.System.currentTimeMillis();
        e();
        com.fyber.inneractive.sdk.util.IAlog.a("%s calling setDataSource with %s", b(), str);
        try {
            setDataSource(str);
            com.fyber.inneractive.sdk.util.IAlog.a("%s setDataSource succeeded, calling prepareAsync", b());
            a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
            try {
                prepareAsync();
            } catch (java.lang.IllegalStateException e) {
                com.fyber.inneractive.sdk.util.IAlog.b("%s prepareAsync failed with illegal mState exception: %s", b(), e.getMessage());
                this.m++;
                if (this.m < 5) {
                    a(str);
                }
                this.m = 0;
            }
            com.fyber.inneractive.sdk.util.IAlog.e(b + "timelog: loadUri took " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " msec", new java.lang.Object[0]);
        } catch (java.lang.Exception e2) {
            com.fyber.inneractive.sdk.util.IAlog.b("%s error setting data source %s", b(), str);
            com.fyber.inneractive.sdk.util.IAlog.b("%s exception message: %s", b(), e2.getMessage());
        }
    }

    public final java.lang.String b() {
        return "mp(" + this + "): T:" + java.lang.Thread.currentThread().getId() + "-" + java.lang.Thread.currentThread().getName() + ": ";
    }

    public static void d(com.fyber.inneractive.sdk.player.mediaplayer.p pVar) {
        java.lang.String b = pVar.b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (super.isPlaying()) {
            super.pause();
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("%s paused called cannot set to pause, canceled", pVar.b());
        }
        com.fyber.inneractive.sdk.util.IAlog.e(b + "timelog: delayed pause took " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " msec", new java.lang.Object[0]);
    }

    public final void c() {
        if (this.g) {
            if (this.f) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sMedia load time took %d msec", b(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.l));
                this.r = super.getDuration();
                a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                if (this.d) {
                    d();
                    return;
                }
                return;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%sGot prepared only, waiting for video size", b());
            if (this.p == null) {
                this.p = new com.fyber.inneractive.sdk.player.mediaplayer.c(this);
            }
            com.fyber.inneractive.sdk.util.r.b.postDelayed(this.p, 2000L);
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s updatePlayerState - %s", b(), bVar);
        if (this.b == bVar) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s updatePlayerState - mState didn't change!", b());
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s updatePlayerState - changing from %s to %s", b(), this.b, bVar);
        this.b = bVar;
        this.h.post(new com.fyber.inneractive.sdk.player.mediaplayer.d(this, bVar));
    }

    public static void a(com.fyber.inneractive.sdk.player.mediaplayer.p pVar, android.view.Surface surface) {
        java.lang.String b = pVar.b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.fyber.inneractive.sdk.util.IAlog.a("%s setSurface called with %s", pVar.b(), surface);
        try {
            super.setSurface(surface);
            if (surface == null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s setSurface with null! current surface cleared", pVar.b());
            } else {
                com.fyber.inneractive.sdk.util.IAlog.a("%s setSurface - replacing surface!", pVar.b());
            }
            com.fyber.inneractive.sdk.util.IAlog.e(b + "timelog: setSurface took " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " msec", new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s super.setSurface threw exception!", pVar.b());
        }
    }

    public static void a(com.fyber.inneractive.sdk.player.mediaplayer.p pVar, android.view.SurfaceHolder surfaceHolder) {
        java.lang.String b = pVar.b();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.fyber.inneractive.sdk.util.IAlog.a("%s setDisplay called with %s", pVar.b(), surfaceHolder);
        try {
            super.setDisplay(surfaceHolder);
            if (surfaceHolder == null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s setDisplay with null! current display cleared", pVar.b());
            } else {
                com.fyber.inneractive.sdk.util.IAlog.a("%s setDisplay - replacing surface holder!", pVar.b());
            }
            com.fyber.inneractive.sdk.util.IAlog.e(b + "timelog: setDisplayInternal took " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " msec", new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s super.setDisplay threw exception!", pVar.b());
        }
    }

    public final void a(java.lang.Runnable runnable) {
        android.os.Handler handler;
        android.os.Handler handler2;
        android.os.HandlerThread handlerThread = this.n;
        if (handlerThread != null && handlerThread.isAlive() && !this.n.isInterrupted() && (handler2 = this.o) != null) {
            handler2.post(runnable);
        }
        if ((this.s == 0 || this.t == 0 || this.r == 0) && (handler = this.o) != null) {
            handler.post(this.q);
        }
    }

    public static void a(com.fyber.inneractive.sdk.player.mediaplayer.p pVar) {
        if (pVar.a()) {
            pVar.s = super.getVideoWidth();
            pVar.t = super.getVideoHeight();
            pVar.r = super.getDuration();
        }
    }
}

package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public abstract class q implements com.fyber.inneractive.sdk.player.mediaplayer.n {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f3891a;
    public com.fyber.inneractive.sdk.player.controller.x d;
    public com.fyber.inneractive.sdk.player.c f;
    public boolean g;
    public final android.os.Handler i;
    public android.view.TextureView j;
    public android.graphics.SurfaceTexture k;
    public android.view.Surface l;
    public com.fyber.inneractive.sdk.player.controller.i m;
    public boolean o;
    public com.fyber.inneractive.sdk.player.enums.b e = com.fyber.inneractive.sdk.player.enums.b.Idle;
    public boolean n = false;
    public final java.util.concurrent.CopyOnWriteArrayList b = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.concurrent.CopyOnWriteArrayList c = new java.util.concurrent.CopyOnWriteArrayList();
    public com.fyber.inneractive.sdk.player.h h = new com.fyber.inneractive.sdk.player.h(this);

    public q(android.content.Context context) {
        this.f3891a = context.getApplicationContext();
        this.i = new android.os.Handler(context.getMainLooper());
        a(true);
    }

    public abstract void a(int i, boolean z);

    public abstract void a(android.view.Surface surface);

    public abstract void a(java.lang.String str, int i);

    public abstract void a(boolean z);

    public abstract int b();

    public abstract void b(boolean z);

    public abstract int c();

    public final void c(boolean z) {
        com.fyber.inneractive.sdk.measurement.f fVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f;
        if (cVar == null || (fVar = cVar.f3865a.e) == null) {
            return;
        }
        if (z) {
            if (fVar.c == null || !fVar.d) {
                return;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("%s mute", "OMVideo");
            try {
                fVar.c.volumeChange(0.0f);
                return;
            } catch (java.lang.Throwable th) {
                fVar.a(th);
                return;
            }
        }
        if (fVar.c == null || !fVar.d) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s unMute", "OMVideo");
        try {
            fVar.c.volumeChange(1.0f);
        } catch (java.lang.Throwable th2) {
            fVar.a(th2);
        }
    }

    public abstract java.lang.String d();

    public abstract void d(boolean z);

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public boolean h() {
        return this.e == com.fyber.inneractive.sdk.player.enums.b.Playing;
    }

    public abstract void i();

    public abstract void j();

    public final void k() {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        com.fyber.inneractive.sdk.player.h hVar = this.h;
        if (hVar == null || (scheduledThreadPoolExecutor = hVar.b) == null) {
            return;
        }
        scheduledThreadPoolExecutor.shutdownNow();
        hVar.b = null;
    }

    public void a() {
        com.fyber.inneractive.sdk.util.IAlog.a("%sdestroy started", com.fyber.inneractive.sdk.util.IAlog.a(this));
        k();
        this.h = null;
        com.fyber.inneractive.sdk.util.v.a(this.j);
        this.j = null;
        android.graphics.SurfaceTexture surfaceTexture = this.k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.k = null;
        }
        android.view.Surface surface = this.l;
        if (surface != null) {
            surface.release();
            this.l = null;
        }
        this.i.removeCallbacksAndMessages(null);
        this.b.clear();
        this.f = null;
        this.g = true;
        com.fyber.inneractive.sdk.util.IAlog.a("%sdestroy finished", com.fyber.inneractive.sdk.util.IAlog.a(this));
    }

    public final void a(android.view.TextureView textureView) {
        android.view.TextureView textureView2 = this.j;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(null);
            }
            this.j = textureView;
            if (textureView != null) {
                com.fyber.inneractive.sdk.player.controller.i iVar = this.m;
                if (iVar == null) {
                    iVar = new com.fyber.inneractive.sdk.player.controller.i(this);
                    this.m = iVar;
                }
                textureView.setSurfaceTextureListener(iVar);
            }
            if (this.k != null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%scalling setSurfaceTexture with cached texture", com.fyber.inneractive.sdk.util.IAlog.a(this));
                if (this.j.getSurfaceTexture() != null && this.j.getSurfaceTexture().equals(this.k)) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%scalling setSurfaceTexture with cached texture failed", com.fyber.inneractive.sdk.util.IAlog.a(this));
                } else {
                    com.fyber.inneractive.sdk.util.IAlog.a("%scalling setSurfaceTexture with cached texture success", com.fyber.inneractive.sdk.util.IAlog.a(this));
                    this.j.setSurfaceTexture(this.k);
                }
            }
        }
    }

    public static void a(com.fyber.inneractive.sdk.player.controller.q qVar, android.graphics.SurfaceTexture surfaceTexture) {
        boolean z = !surfaceTexture.equals(qVar.k);
        android.graphics.SurfaceTexture surfaceTexture2 = qVar.k;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        qVar.k = surfaceTexture;
        android.view.Surface surface = qVar.l;
        if (surface == null || z) {
            if (surface != null) {
                surface.release();
            }
            qVar.l = new android.view.Surface(qVar.k);
        }
        qVar.a(qVar.l);
    }

    public void a(int i) {
        this.i.post(new com.fyber.inneractive.sdk.player.controller.l(this, i));
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        if (bVar == this.e) {
            return;
        }
        this.e = bVar;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            com.fyber.inneractive.sdk.player.h hVar = this.h;
            if (hVar != null && hVar.b == null) {
                java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
                hVar.b = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(hVar.c, 100, 1000, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            k();
        }
        this.i.post(new com.fyber.inneractive.sdk.player.controller.m(this, bVar));
    }
}

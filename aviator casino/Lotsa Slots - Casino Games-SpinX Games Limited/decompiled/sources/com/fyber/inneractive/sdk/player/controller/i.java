package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class i implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.controller.q f3885a;

    public i(com.fyber.inneractive.sdk.player.controller.q qVar) {
        this.f3885a = qVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        com.fyber.inneractive.sdk.player.controller.q qVar = this.f3885a;
        qVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s onSurfaceTextureAvailable", com.fyber.inneractive.sdk.util.IAlog.a(qVar));
        com.fyber.inneractive.sdk.player.controller.q.a(this.f3885a, surfaceTexture);
        com.fyber.inneractive.sdk.player.controller.q qVar2 = this.f3885a;
        com.fyber.inneractive.sdk.player.controller.x xVar = qVar2.d;
        if (xVar != null) {
            android.view.TextureView textureView = qVar2.j;
            com.fyber.inneractive.sdk.player.controller.z zVar = xVar.f3897a;
            zVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%s onTextureViewAvailable", com.fyber.inneractive.sdk.util.IAlog.a(zVar));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.fyber.inneractive.sdk.player.controller.q qVar = this.f3885a;
        qVar.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s onSurfaceTextureDestroyed", com.fyber.inneractive.sdk.util.IAlog.a(qVar));
        this.f3885a.i();
        this.f3885a.a((android.view.Surface) null);
        com.fyber.inneractive.sdk.player.controller.q qVar2 = this.f3885a;
        qVar2.o = true;
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.e;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Error || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
            qVar2.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%sReleasing surface texture", com.fyber.inneractive.sdk.util.IAlog.a(qVar2));
            this.f3885a.k = null;
            return true;
        }
        qVar2.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s caching surface texture", com.fyber.inneractive.sdk.util.IAlog.a(qVar2));
        com.fyber.inneractive.sdk.player.controller.q qVar3 = this.f3885a;
        qVar3.k = surfaceTexture;
        qVar3.i.post(new com.fyber.inneractive.sdk.player.controller.h(this));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        com.fyber.inneractive.sdk.player.controller.q qVar = this.f3885a;
        if (qVar.e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            int b = qVar.b();
            int c = qVar.c();
            if (b <= 0 || b > c) {
                return;
            }
            qVar.a(b - 1, false);
            qVar.a(b, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.Surface surface;
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.player.controller.q qVar2 = this.f3885a;
        com.fyber.inneractive.sdk.player.controller.x xVar = qVar2.d;
        if (xVar != null) {
            android.view.TextureView textureView = qVar2.j;
            com.fyber.inneractive.sdk.player.f fVar = xVar.f3897a.f3899a;
            if (fVar != null && (qVar = fVar.f4138a) != null) {
                qVar.i.post(new com.fyber.inneractive.sdk.player.controller.n(qVar));
            }
        }
        com.fyber.inneractive.sdk.player.controller.q qVar3 = this.f3885a;
        if (!qVar3.o || (surface = qVar3.l) == null) {
            return;
        }
        qVar3.a(surface);
        this.f3885a.o = false;
    }
}

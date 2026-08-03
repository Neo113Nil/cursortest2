package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.controller.i f3884a;

    public h(com.fyber.inneractive.sdk.player.controller.i iVar) {
        this.f3884a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.controller.q qVar = this.f3884a.f3885a;
        com.fyber.inneractive.sdk.player.controller.x xVar = qVar.d;
        if (xVar != null) {
            android.view.TextureView textureView = qVar.j;
            com.fyber.inneractive.sdk.player.controller.z zVar = xVar.f3897a;
            zVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.a("%s onTextureViewDestroyed", com.fyber.inneractive.sdk.util.IAlog.a(zVar));
        }
    }
}

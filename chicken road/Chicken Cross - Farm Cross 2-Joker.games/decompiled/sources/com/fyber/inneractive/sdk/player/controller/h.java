package com.fyber.inneractive.sdk.player.controller;

import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f5538a;

    public h(i iVar) {
        this.f5538a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f5538a.f5539a;
        x xVar = qVar.d;
        if (xVar != null) {
            TextureView textureView = qVar.j;
            z zVar = xVar.f5551a;
            zVar.getClass();
            IAlog.a("%s onTextureViewDestroyed", IAlog.a(zVar));
        }
    }
}

package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.controller.z f3893a;

    public t(com.fyber.inneractive.sdk.player.controller.z zVar) {
        this.f3893a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f3893a;
        zVar.j = null;
        zVar.r();
    }
}

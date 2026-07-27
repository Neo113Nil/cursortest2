package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes4.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f5547a;

    public t(z zVar) {
        this.f5547a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z zVar = this.f5547a;
        zVar.j = null;
        zVar.r();
    }
}

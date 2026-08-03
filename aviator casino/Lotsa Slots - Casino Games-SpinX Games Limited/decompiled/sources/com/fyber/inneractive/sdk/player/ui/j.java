package com.fyber.inneractive.sdk.player.ui;

/* loaded from: classes3.dex */
public final class j implements com.fyber.inneractive.sdk.util.u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4165a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.ui.l b;

    public j(com.fyber.inneractive.sdk.player.ui.l lVar, int i) {
        this.b = lVar;
        this.f4165a = i;
    }

    @Override // com.fyber.inneractive.sdk.util.u1
    public final void a() {
        if (this.b.h) {
            com.fyber.inneractive.sdk.util.IAlog.a("Autoclick is aborted - app in background", new java.lang.Object[0]);
        } else {
            com.fyber.inneractive.sdk.util.IAlog.a("Autoclick is triggered", new java.lang.Object[0]);
            ((com.fyber.inneractive.sdk.player.controller.z) this.b.g).a(this.f4165a, com.fyber.inneractive.sdk.player.ui.l.J);
        }
        this.b.p();
    }
}

package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class w implements com.fyber.inneractive.sdk.player.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.renderers.x f4249a;

    public w(com.fyber.inneractive.sdk.renderers.x xVar) {
        this.f4249a = xVar;
    }

    @Override // com.fyber.inneractive.sdk.player.e
    public final void a() {
        this.f4249a.z.b(false);
        ((com.fyber.inneractive.sdk.player.controller.z) this.f4249a.z).y();
    }
}

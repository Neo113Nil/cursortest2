package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class o implements com.fyber.inneractive.sdk.player.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.renderers.r f4244a;

    public o(com.fyber.inneractive.sdk.renderers.r rVar) {
        this.f4244a = rVar;
    }

    @Override // com.fyber.inneractive.sdk.player.e
    public final void a() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f4244a.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
            ((com.fyber.inneractive.sdk.player.controller.s) this.f4244a.k).y();
        }
    }
}

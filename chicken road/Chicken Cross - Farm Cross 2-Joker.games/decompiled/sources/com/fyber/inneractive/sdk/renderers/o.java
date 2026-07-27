package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes4.dex */
public final class o implements com.fyber.inneractive.sdk.player.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f5901a;

    public o(r rVar) {
        this.f5901a = rVar;
    }

    @Override // com.fyber.inneractive.sdk.player.e
    public final void a() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f5901a.k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
            ((com.fyber.inneractive.sdk.player.controller.s) this.f5901a.k).y();
        }
    }
}

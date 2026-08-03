package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.controller.f0 f3880a;

    public d0(com.fyber.inneractive.sdk.player.controller.f0 f0Var) {
        this.f3880a = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        this.f3880a.b.dismiss();
        com.fyber.inneractive.sdk.player.controller.v vVar = this.f3880a.f3883a;
        vVar.b.d(vVar.f3895a);
    }
}

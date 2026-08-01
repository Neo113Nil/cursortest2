package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;

/* loaded from: classes4.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f5799a;
    public final /* synthetic */ p b;

    public d(p pVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.b = pVar;
        this.f5799a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.b.i;
        if (nVar != null) {
            ((q) nVar).a(this.f5799a);
        }
    }
}

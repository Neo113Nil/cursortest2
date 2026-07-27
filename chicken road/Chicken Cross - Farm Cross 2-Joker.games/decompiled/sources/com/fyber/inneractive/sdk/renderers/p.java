package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f5902a;

    public p(r rVar) {
        this.f5902a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.f5902a;
        if (rVar.t != null) {
            rVar.getClass();
            IAlog.a("%sIdle state reached!", IAlog.a(rVar));
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f5902a.k;
            if (bVar != null) {
                ((com.fyber.inneractive.sdk.player.controller.s) bVar).j(true);
            }
            this.f5902a.t = null;
        }
    }
}

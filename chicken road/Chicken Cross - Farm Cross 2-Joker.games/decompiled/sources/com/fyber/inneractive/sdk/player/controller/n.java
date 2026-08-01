package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f5544a;

    public n(q qVar) {
        this.f5544a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator it = this.f5544a.b.iterator();
            while (it.hasNext()) {
                ((p) it.next()).d();
            }
        } catch (Exception e) {
            if (IAlog.f5940a <= 3) {
                q qVar = this.f5544a;
                qVar.getClass();
                IAlog.a("%sonDrawnToSurface callback threw an exception!", e, IAlog.a(qVar));
            }
        }
    }
}

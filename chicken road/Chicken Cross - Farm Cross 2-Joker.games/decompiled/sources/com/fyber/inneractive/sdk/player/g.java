package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f5793a;

    public g(h hVar) {
        this.f5793a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f5793a;
        hVar.getClass();
        IAlog.a("player progress monitor: run started", new Object[0]);
        int b = hVar.f5794a.b();
        if (!hVar.d) {
            IAlog.a("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(b));
            if (b >= 2000) {
                IAlog.a("run: setting played 2 seconds flag", new Object[0]);
                hVar.d = true;
            }
        }
        hVar.f5794a.a(b);
    }
}

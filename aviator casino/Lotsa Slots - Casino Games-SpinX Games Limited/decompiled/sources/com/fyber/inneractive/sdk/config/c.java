package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class c implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.e f3586a;

    public c(com.fyber.inneractive.sdk.config.e eVar) {
        this.f3586a = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        if (this.f3586a.f.hasMessages(123) || this.f3586a.b.get()) {
            return;
        }
        this.f3586a.f.sendEmptyMessageDelayed(123, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.cache.session.g gVar;
        this.f3586a.f.removeMessages(123);
        com.fyber.inneractive.sdk.config.e eVar = this.f3586a;
        if (eVar.b.compareAndSet(true, false)) {
            if (eVar.c) {
                com.fyber.inneractive.sdk.util.IAlog.a("onActivityResumed: restartSession", new java.lang.Object[0]);
                eVar.c = false;
                com.fyber.inneractive.sdk.config.x0 x0Var = eVar.e;
                if (x0Var != null) {
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = x0Var.f3644a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.cache.session.i iVar = eVar2.f3564a;
                        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (gVar = (com.fyber.inneractive.sdk.cache.session.g) iVar.f3568a.get(cVar)) != null && gVar.f3567a != 0) {
                                eVar2.a(cVar, gVar);
                            }
                        }
                        com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION, com.fyber.inneractive.sdk.cache.session.enums.c.NONE));
                    }
                    eVar.e.d.put("SESSION_STAMP", java.lang.Long.toString(android.os.SystemClock.elapsedRealtime()));
                    eVar.e.c.clear();
                }
            }
            com.fyber.inneractive.sdk.util.v1 v1Var = eVar.d;
            if (v1Var != null) {
                v1Var.d = false;
                v1Var.f = 0L;
                com.fyber.inneractive.sdk.util.t1 t1Var = v1Var.c;
                if (t1Var != null) {
                    t1Var.removeMessages(1932593528);
                }
            }
        }
        for (com.fyber.inneractive.sdk.util.z0 z0Var : this.f3586a.f3594a) {
            if (z0Var.c) {
                z0Var.c = false;
                com.fyber.inneractive.sdk.config.e eVar3 = com.fyber.inneractive.sdk.config.IAConfigManager.N.w.b;
                if (eVar3 != null) {
                    eVar3.f3594a.remove(z0Var);
                }
                java.lang.String a2 = com.fyber.inneractive.sdk.util.c0.a(java.lang.System.currentTimeMillis(), z0Var.b, 0L);
                z0Var.b = 0L;
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.TIME_SPENT_IN_PLAY_STORE;
                com.fyber.inneractive.sdk.flow.x xVar = z0Var.f4322a;
                com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = xVar == null ? null : xVar.f3765a;
                com.fyber.inneractive.sdk.response.e eVar4 = xVar == null ? null : xVar.b;
                org.json.JSONArray b = (xVar == null || (rVar = xVar.c) == null) ? null : rVar.b();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar4);
                wVar.c = uVar;
                wVar.f3860a = inneractiveAdRequest;
                wVar.d = b;
                wVar.a("appstore_time", a2);
                wVar.a((java.lang.String) null);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }
}

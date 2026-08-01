package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.u1;
import com.fyber.inneractive.sdk.util.w1;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f5236a;

    public c(e eVar) {
        this.f5236a = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f5236a.f.hasMessages(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) || this.f5236a.b.get()) {
            return;
        }
        this.f5236a.f.sendEmptyMessageDelayed(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 3000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.cache.session.g gVar;
        this.f5236a.f.removeMessages(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        e eVar = this.f5236a;
        if (eVar.b.compareAndSet(true, false)) {
            if (eVar.c) {
                IAlog.a("onActivityResumed: restartSession", new Object[0]);
                eVar.c = false;
                c1 c1Var = eVar.e;
                if (c1Var != null) {
                    com.fyber.inneractive.sdk.cache.session.e eVar2 = c1Var.f5237a;
                    if (eVar2 != null) {
                        com.fyber.inneractive.sdk.cache.session.i iVar = eVar2.f5215a;
                        for (com.fyber.inneractive.sdk.cache.session.enums.c cVar : com.fyber.inneractive.sdk.cache.session.enums.c.values()) {
                            if (cVar != com.fyber.inneractive.sdk.cache.session.enums.c.NONE && (gVar = (com.fyber.inneractive.sdk.cache.session.g) iVar.f5219a.get(cVar)) != null && gVar.f5218a != 0) {
                                eVar2.a(cVar, gVar);
                            }
                        }
                        com.fyber.inneractive.sdk.util.r.f5965a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar2, com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION, com.fyber.inneractive.sdk.cache.session.enums.c.NONE));
                    }
                    eVar.e.d.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                    eVar.e.c.clear();
                }
            }
            w1 w1Var = eVar.d;
            if (w1Var != null) {
                w1Var.d = false;
                w1Var.f = 0L;
                u1 u1Var = w1Var.c;
                if (u1Var != null) {
                    u1Var.removeMessages(1932593528);
                }
            }
        }
        for (com.fyber.inneractive.sdk.util.z0 z0Var : this.f5236a.f5244a) {
            if (z0Var.c) {
                z0Var.c = false;
                e eVar3 = IAConfigManager.R.x.b;
                if (eVar3 != null) {
                    eVar3.f5244a.remove(z0Var);
                }
                String a2 = com.fyber.inneractive.sdk.util.c0.a(System.currentTimeMillis(), z0Var.b, 0L);
                z0Var.b = 0L;
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.TIME_SPENT_IN_PLAY_STORE;
                com.fyber.inneractive.sdk.flow.x xVar = z0Var.f5980a;
                InneractiveAdRequest inneractiveAdRequest = xVar == null ? null : xVar.f5418a;
                com.fyber.inneractive.sdk.response.e eVar4 = xVar == null ? null : xVar.b;
                JSONArray b = (xVar == null || (rVar = xVar.c) == null) ? null : rVar.b();
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar4);
                wVar.c = uVar;
                wVar.f5514a = inneractiveAdRequest;
                wVar.d = b;
                wVar.a("appstore_time", a2);
                wVar.a((String) null);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}

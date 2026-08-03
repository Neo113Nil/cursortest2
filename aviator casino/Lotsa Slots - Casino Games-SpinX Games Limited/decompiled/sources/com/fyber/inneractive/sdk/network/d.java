package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class d implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.network.f f3834a;

    public d(com.fyber.inneractive.sdk.network.f fVar) {
        this.f3834a = fVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        com.fyber.inneractive.sdk.network.f fVar = this.f3834a;
        com.fyber.inneractive.sdk.util.d1 d1Var = fVar.d;
        if (d1Var != null) {
            d1Var.post(new com.fyber.inneractive.sdk.network.c(fVar, 20150330, 3500L));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        com.fyber.inneractive.sdk.util.d1 d1Var = this.f3834a.d;
        if (d1Var != null) {
            d1Var.removeMessages(20150330);
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

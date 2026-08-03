package com.ironsource;

/* renamed from: com.ironsource.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3086i implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.Mc f6296a;

    public C3086i(com.ironsource.Mc mc) {
        this.f6296a = mc;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        if (com.ironsource.sdk.utils.SDKUtils.isIronSourceActivity(activity)) {
            return;
        }
        this.f6296a.d(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        if (com.ironsource.sdk.utils.SDKUtils.isIronSourceActivity(activity)) {
            return;
        }
        this.f6296a.e(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}

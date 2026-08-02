package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public class Js implements Application.ActivityLifecycleCallbacks {

    /* renamed from: k, reason: collision with root package name */
    public boolean f10075k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10076l;

    /* renamed from: m, reason: collision with root package name */
    public Is f10077m;

    public void a(boolean z3) {
    }

    public boolean b() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f10076l) {
            this.f10076l = true;
            if (this.f10075k) {
                a(true);
                Is is = this.f10077m;
                if (is != null) {
                    is.d(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z3 = runningAppProcessInfo.importance == 100 || b();
        if (this.f10076l != z3) {
            this.f10076l = z3;
            if (this.f10075k) {
                a(z3);
                Is is = this.f10077m;
                if (is != null) {
                    is.d(z3);
                }
            }
        }
    }
}

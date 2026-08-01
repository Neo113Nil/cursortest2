package com.google.android.play.core.hsdp.service;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zzal implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzat zzb;

    zzal(zzat zzatVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzatVar);
        this.zzb = zzatVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.zza) {
            this.zzb.zza();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity == this.zza) {
            this.zzb.zza();
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

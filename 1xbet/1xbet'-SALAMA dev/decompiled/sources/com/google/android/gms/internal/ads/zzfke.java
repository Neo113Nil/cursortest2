package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class zzfke implements Application.ActivityLifecycleCallbacks {
    protected boolean zza;
    private boolean zzb;
    private zzfkd zzc;

    private final void zza(boolean z4) {
        if (this.zza != z4) {
            this.zza = z4;
            if (this.zzb) {
                zzb(z4);
                zzfkd zzfkdVar = this.zzc;
                if (zzfkdVar != null) {
                    zzfkdVar.zzc(z4);
                }
            }
        }
    }

    private final boolean zzh() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || zzc();
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
        zza(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(zzh());
    }

    public void zzb(boolean z4) {
    }

    public boolean zzc() {
        return false;
    }

    public final void zzd(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void zze(zzfkd zzfkdVar) {
        this.zzc = zzfkdVar;
    }

    public final void zzf() {
        this.zzb = true;
        boolean zZzh = zzh();
        this.zza = zZzh;
        zzb(zZzh);
    }

    public final void zzg() {
        this.zzb = false;
        this.zzc = null;
    }
}

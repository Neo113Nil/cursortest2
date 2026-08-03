package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzfa implements android.app.Application.ActivityLifecycleCallbacks {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfb zza;

    zzfa(com.google.android.gms.internal.measurement.zzfb zzfbVar) {
        java.util.Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzet(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzez(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzew(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzev(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        com.google.android.gms.internal.measurement.zzco zzcoVar = new com.google.android.gms.internal.measurement.zzco();
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzey(this, activity, zzcoVar));
        android.os.Bundle zze = zzcoVar.zze(50L);
        if (zze != null) {
            bundle.putAll(zze);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzeu(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzex(this, activity));
    }
}

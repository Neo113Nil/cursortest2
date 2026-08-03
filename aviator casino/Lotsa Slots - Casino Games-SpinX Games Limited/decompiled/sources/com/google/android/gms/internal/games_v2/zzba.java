package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
final class zzba implements android.app.Application.ActivityLifecycleCallbacks {
    final /* synthetic */ com.google.android.gms.internal.games_v2.zzbb zza;
    private final android.app.Application zzb;
    private boolean zzc = false;

    /* synthetic */ zzba(com.google.android.gms.internal.games_v2.zzbb zzbbVar, android.app.Application application, com.google.android.gms.internal.games_v2.zzaz zzazVar) {
        this.zza = zzbbVar;
        this.zzb = application;
    }

    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.games_v2.zzba zzbaVar) {
        if (zzbaVar.zzc) {
            return;
        }
        zzbaVar.zzb.registerActivityLifecycleCallbacks(zzbaVar);
        zzbaVar.zzc = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.zzb.unregisterActivityLifecycleCallbacks(this);
        if (this.zzc) {
            this.zzc = false;
            com.google.android.gms.internal.games_v2.zzfn.zza("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
            this.zza.zzc.zza();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
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

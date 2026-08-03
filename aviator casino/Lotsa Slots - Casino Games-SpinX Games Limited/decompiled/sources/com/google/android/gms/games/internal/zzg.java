package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class zzg {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();
    private final android.app.Application zzc;
    private java.lang.ref.WeakReference zzg;
    private final android.app.Application.ActivityLifecycleCallbacks zzd = new com.google.android.gms.games.internal.zzf(this, null);
    private final java.lang.Object zze = new java.lang.Object();
    private final java.util.Set zzf = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    private boolean zzh = false;

    public zzg(android.app.Application application) {
        this.zzc = application;
    }

    public static com.google.android.gms.games.internal.zzg zzb(android.app.Application application) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(application);
        java.util.concurrent.atomic.AtomicReference atomicReference = zzb;
        com.google.android.gms.games.internal.zzg zzgVar = (com.google.android.gms.games.internal.zzg) atomicReference.get();
        if (zzgVar != null) {
            return zzgVar;
        }
        com.google.android.gms.games.internal.zzg zzgVar2 = new com.google.android.gms.games.internal.zzg(application);
        while (!androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, null, zzgVar2) && atomicReference.get() == null) {
        }
        return (com.google.android.gms.games.internal.zzg) zzb.get();
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.games.internal.zzg zzgVar, android.app.Activity activity) {
        synchronized (zzgVar.zze) {
            java.lang.ref.WeakReference weakReference = zzgVar.zzg;
            if (weakReference == null) {
                return;
            }
            if (weakReference.get() == activity) {
                zzgVar.zzg = null;
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzd(com.google.android.gms.games.internal.zzg zzgVar, android.app.Activity activity) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity);
        synchronized (zzgVar.zze) {
            if (zzgVar.zza() == activity) {
                return;
            }
            zzgVar.zzg = new java.lang.ref.WeakReference(activity);
            java.util.Iterator it = zzgVar.zzf.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.games.internal.zzd) it.next()).zza(activity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzf(com.google.android.gms.games.internal.zzd zzdVar) {
        android.app.Activity zza2 = zza();
        if (zza2 == null) {
            return;
        }
        zzdVar.zza(zza2);
    }

    public final android.app.Activity zza() {
        android.app.Activity activity;
        synchronized (this.zze) {
            java.lang.ref.WeakReference weakReference = this.zzg;
            activity = weakReference == null ? null : (android.app.Activity) weakReference.get();
        }
        return activity;
    }

    public final void zze(final com.google.android.gms.games.internal.zzd zzdVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzdVar);
        synchronized (this.zze) {
            this.zzf.add(zzdVar);
        }
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            zzf(zzdVar);
        } else {
            com.google.android.gms.tasks.TaskExecutors.MAIN_THREAD.execute(new java.lang.Runnable() { // from class: com.google.android.gms.games.internal.zzc
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.games.internal.zzg.this.zzf(zzdVar);
                }
            });
        }
    }

    public final void zzg() {
        synchronized (this.zze) {
            if (!this.zzh) {
                this.zzc.registerActivityLifecycleCallbacks(this.zzd);
                this.zzh = true;
            }
        }
    }
}

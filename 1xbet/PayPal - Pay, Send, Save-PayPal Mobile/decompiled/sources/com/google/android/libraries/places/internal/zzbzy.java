package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbzy {
    private static final com.google.android.libraries.places.internal.zzbzy zza = new com.google.android.libraries.places.internal.zzbzy(new com.google.android.libraries.places.internal.zzbzu());
    private final java.util.IdentityHashMap zzb = new java.util.IdentityHashMap();
    private java.util.concurrent.ScheduledExecutorService zzc;

    zzbzy(com.google.android.libraries.places.internal.zzbzu zzbzuVar) {
    }

    public static java.lang.Object zza(com.google.android.libraries.places.internal.zzbzx zzbzxVar) {
        return zza.zzc(zzbzxVar);
    }

    public static java.lang.Object zzb(com.google.android.libraries.places.internal.zzbzx zzbzxVar, java.lang.Object obj) {
        zza.zzd(zzbzxVar, obj);
        return null;
    }

    final java.lang.Object zzc(com.google.android.libraries.places.internal.zzbzx zzbzxVar) {
        java.lang.Object obj;
        synchronized (this) {
            java.util.IdentityHashMap identityHashMap = this.zzb;
            com.google.android.libraries.places.internal.zzbzw zzbzwVar = (com.google.android.libraries.places.internal.zzbzw) identityHashMap.get(zzbzxVar);
            if (zzbzwVar == null) {
                zzbzwVar = new com.google.android.libraries.places.internal.zzbzw(zzbzxVar.zzb());
                identityHashMap.put(zzbzxVar, zzbzwVar);
            }
            java.util.concurrent.ScheduledFuture scheduledFuture = zzbzwVar.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                zzbzwVar.zzc = null;
            }
            zzbzwVar.zzb++;
            obj = zzbzwVar.zza;
        }
        return obj;
    }

    final java.lang.Object zzd(com.google.android.libraries.places.internal.zzbzx zzbzxVar, java.lang.Object obj) {
        synchronized (this) {
            com.google.android.libraries.places.internal.zzbzw zzbzwVar = (com.google.android.libraries.places.internal.zzbzw) this.zzb.get(zzbzxVar);
            if (zzbzwVar == null) {
                throw new java.lang.IllegalArgumentException("No cached instance found for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzbzxVar))));
            }
            com.google.common.base.Preconditions.checkArgument(obj == zzbzwVar.zza, "Releasing the wrong instance");
            com.google.common.base.Preconditions.checkState(zzbzwVar.zzb > 0, "Refcount has already reached zero");
            int i = zzbzwVar.zzb - 1;
            zzbzwVar.zzb = i;
            if (i == 0) {
                com.google.common.base.Preconditions.checkState(zzbzwVar.zzc == null, "Destroy task already scheduled");
                if (this.zzc == null) {
                    this.zzc = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(com.google.android.libraries.places.internal.zzbsz.zzd("grpc-shared-destroyer-%d", true));
                }
                zzbzwVar.zzc = this.zzc.schedule(new com.google.android.libraries.places.internal.zzbuf(new com.google.android.libraries.places.internal.zzbzv(this, zzbzwVar, zzbzxVar, obj)), 1L, java.util.concurrent.TimeUnit.SECONDS);
            }
        }
        return null;
    }

    final /* synthetic */ void zzg(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzc = null;
    }

    final /* synthetic */ java.util.concurrent.ScheduledExecutorService zzf() {
        return this.zzc;
    }

    final /* synthetic */ java.util.IdentityHashMap zze() {
        return this.zzb;
    }
}

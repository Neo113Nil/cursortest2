package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzjm implements com.google.common.util.concurrent.FutureCallback {
    final /* synthetic */ com.google.android.libraries.places.internal.zzjp zza;

    zzjm(com.google.android.libraries.places.internal.zzjp zzjpVar) {
        java.util.Objects.requireNonNull(zzjpVar);
        this.zza = zzjpVar;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final /* synthetic */ void onSuccess(java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzbha zzbhaVar = (com.google.android.libraries.places.internal.zzbha) obj;
        long zzc = zzbhaVar.zzc();
        final com.google.android.libraries.places.internal.zzjp zzjpVar = this.zza;
        zzjpVar.zzd = java.lang.Long.valueOf(zzc & 4294967295L);
        zzjpVar.zze = zzbhaVar.zze();
        java.lang.Long l = zzjpVar.zzd;
        if (l != null) {
            zzjpVar.zzf = zzjpVar.zzc(l.longValue());
        }
        com.google.android.libraries.places.internal.zzbfw zzbfwVar = zzjpVar.zze;
        if (zzbfwVar != null) {
            long zzc2 = (zzbfwVar.zzc() - 3600) - java.time.Instant.now().getEpochSecond();
            if (zzc2 > 0) {
                zzjpVar.zzb.schedule(new java.util.concurrent.Callable() { // from class: com.google.android.libraries.places.internal.zzjn
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ java.lang.Object call() {
                        return com.google.android.libraries.places.internal.zzjp.this.zzb();
                    }
                }, zzc2, java.util.concurrent.TimeUnit.SECONDS);
            }
        }
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(java.lang.Throwable th) {
        com.google.android.libraries.places.internal.zzjp zzjpVar = this.zza;
        zzjpVar.zzd = null;
        zzjpVar.zze = null;
        zzjpVar.zzf = null;
    }
}

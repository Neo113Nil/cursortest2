package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbzv implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzw zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzx zzb;
    final /* synthetic */ java.lang.Object zzc;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzy zzd;

    zzbzv(com.google.android.libraries.places.internal.zzbzy zzbzyVar, com.google.android.libraries.places.internal.zzbzw zzbzwVar, com.google.android.libraries.places.internal.zzbzx zzbzxVar, java.lang.Object obj) {
        this.zza = zzbzwVar;
        this.zzb = zzbzxVar;
        this.zzc = obj;
        java.util.Objects.requireNonNull(zzbzyVar);
        this.zzd = zzbzyVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzd) {
            if (this.zza.zzb == 0) {
                try {
                    this.zzb.zza(this.zzc);
                    com.google.android.libraries.places.internal.zzbzy zzbzyVar = this.zzd;
                    zzbzyVar.zze().remove(this.zzb);
                    if (zzbzyVar.zze().isEmpty()) {
                        zzbzyVar.zzf().shutdown();
                        zzbzyVar.zzg(null);
                    }
                } catch (java.lang.Throwable th) {
                    com.google.android.libraries.places.internal.zzbzy zzbzyVar2 = this.zzd;
                    zzbzyVar2.zze().remove(this.zzb);
                    if (zzbzyVar2.zze().isEmpty()) {
                        zzbzyVar2.zzf().shutdown();
                        zzbzyVar2.zzg(null);
                    }
                    throw th;
                }
            }
        }
    }
}

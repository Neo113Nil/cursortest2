package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbyn extends com.google.android.libraries.places.internal.zzbje {
    long zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbzf zzc;
    private final com.google.android.libraries.places.internal.zzbzd zzd;

    zzbyn(com.google.android.libraries.places.internal.zzbzf zzbzfVar, com.google.android.libraries.places.internal.zzbzd zzbzdVar) {
        java.util.Objects.requireNonNull(zzbzfVar);
        this.zzc = zzbzfVar;
        this.zzd = zzbzdVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbnt
    public final void zza(long j) {
        com.google.android.libraries.places.internal.zzbzf zzbzfVar = this.zzc;
        if (zzbzfVar.zzQ().zzf == null) {
            synchronized (zzbzfVar.zzK()) {
                if (zzbzfVar.zzQ().zzf == null) {
                    com.google.android.libraries.places.internal.zzbzd zzbzdVar = this.zzd;
                    if (!zzbzdVar.zzb) {
                        long j2 = this.zzb + j;
                        this.zzb = j2;
                        if (j2 <= zzbzfVar.zzW()) {
                            return;
                        }
                        if (j2 > zzbzfVar.zzM()) {
                            zzbzdVar.zzc = true;
                        } else {
                            long zza = zzbzfVar.zzL().zza(j2 - zzbzfVar.zzW());
                            zzbzfVar.zzX(this.zzb);
                            if (zza > zzbzfVar.zzN()) {
                                zzbzdVar.zzc = true;
                            }
                        }
                        java.lang.Runnable zzo = zzbzdVar.zzc ? zzbzfVar.zzo(zzbzdVar) : null;
                        if (zzo != null) {
                            zzo.run();
                        }
                    }
                }
            }
        }
    }
}

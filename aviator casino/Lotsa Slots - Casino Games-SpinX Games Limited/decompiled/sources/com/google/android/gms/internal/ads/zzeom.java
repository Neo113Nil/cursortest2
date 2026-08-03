package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzeom implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkf zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzeon zzb;

    zzeom(com.google.android.gms.internal.ads.zzeon zzeonVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        this.zza = zzfkfVar;
        java.util.Objects.requireNonNull(zzeonVar);
        this.zzb = zzeonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzeon zzeonVar = this.zzb;
        synchronized (zzeonVar) {
            com.google.android.gms.internal.ads.zzeoo zzc = zzeonVar.zzc();
            com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zza;
            zzc.zzc(th, zzfkfVar);
            com.google.android.gms.internal.ads.zzfkf zza = zzeonVar.zzc().zza();
            if (zzfkfVar.zzav) {
                while (zza != null) {
                    zzeonVar.zzb(zza);
                    zza = zzeonVar.zzc().zza();
                }
            } else if (zza != null) {
                zzeonVar.zzb(zza);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzeon zzeonVar = this.zzb;
        com.google.android.gms.internal.ads.zzepe zzepeVar = (com.google.android.gms.internal.ads.zzepe) obj;
        synchronized (zzeonVar) {
            zzeonVar.zzc().zzb(zzepeVar, this.zza);
            com.google.android.gms.internal.ads.zzfkf zza = zzeonVar.zzc().zza();
            if (zza != null) {
                zzeonVar.zzb(zza);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzesf implements com.google.android.gms.internal.ads.zzetr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzesg zza;

    zzesf(com.google.android.gms.internal.ads.zzesg zzesgVar) {
        java.util.Objects.requireNonNull(zzesgVar);
        this.zza = zzesgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final void zza() {
        com.google.android.gms.internal.ads.zzesg zzesgVar = this.zza;
        synchronized (zzesgVar) {
            zzesgVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzesg zzesgVar = this.zza;
        com.google.android.gms.internal.ads.zzcvl zzcvlVar = (com.google.android.gms.internal.ads.zzcvl) obj;
        synchronized (zzesgVar) {
            if (zzesgVar.zzM() != null) {
                if (zzcvlVar.zzo() != null && zzesgVar.zzM().zzo() != null) {
                    zzcvlVar.zzo().zzb(zzesgVar.zzM().zzo().zza());
                }
                zzesgVar.zzM().zzd();
            }
            zzesgVar.zzN(zzcvlVar);
            zzesgVar.zzM().zzj();
        }
    }
}

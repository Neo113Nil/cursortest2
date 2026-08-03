package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfgj implements com.google.android.gms.internal.ads.zzetr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfgm zza;

    zzfgj(com.google.android.gms.internal.ads.zzfgm zzfgmVar) {
        java.util.Objects.requireNonNull(zzfgmVar);
        this.zza = zzfgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final void zza() {
        com.google.android.gms.internal.ads.zzfgm zzfgmVar = this.zza;
        synchronized (zzfgmVar) {
            zzfgmVar.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcvf zzcvfVar = (com.google.android.gms.internal.ads.zzcvf) obj;
        com.google.android.gms.internal.ads.zzfgm zzfgmVar = this.zza;
        synchronized (zzfgmVar) {
            com.google.android.gms.internal.ads.zzcvf zzcvfVar2 = zzfgmVar.zza;
            if (zzcvfVar2 != null) {
                zzcvfVar2.zzd();
            }
            zzfgmVar.zza = zzcvfVar;
            zzcvfVar.zza(zzfgmVar);
            zzfgmVar.zzO().zzt(new com.google.android.gms.internal.ads.zzcvg(zzcvfVar, zzfgmVar, zzfgmVar.zzO(), zzfgmVar.zzV()));
            zzcvfVar.zzj();
        }
    }
}

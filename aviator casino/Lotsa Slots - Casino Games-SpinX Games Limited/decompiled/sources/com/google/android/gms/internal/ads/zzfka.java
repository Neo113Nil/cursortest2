package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfka implements com.google.android.gms.internal.ads.zzetr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkc zza;

    zzfka(com.google.android.gms.internal.ads.zzfkc zzfkcVar) {
        java.util.Objects.requireNonNull(zzfkcVar);
        this.zza = zzfkcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final void zza() {
        com.google.android.gms.internal.ads.zzfkc zzfkcVar = this.zza;
        synchronized (zzfkcVar) {
            zzfkcVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfkc zzfkcVar = this.zza;
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = (com.google.android.gms.internal.ads.zzdvm) obj;
        synchronized (zzfkcVar) {
            zzfkcVar.zzx(zzdvmVar);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeu)).booleanValue()) {
                zzdvmVar.zzh().zza = zzfkcVar.zzv();
            }
            zzfkcVar.zzw().zzj();
        }
    }
}

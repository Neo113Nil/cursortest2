package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbtd implements com.google.android.gms.internal.ads.zzcga {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbtt zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbtu zzc;

    zzbtd(com.google.android.gms.internal.ads.zzbtu zzbtuVar, com.google.android.gms.internal.ads.zzbtt zzbttVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        this.zza = zzbttVar;
        this.zzb = zzfpwVar;
        java.util.Objects.requireNonNull(zzbtuVar);
        this.zzc = zzbtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcga
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        com.google.android.gms.internal.ads.zzbtu zzbtuVar = this.zzc;
        synchronized (zzbtuVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
            zzbtuVar.zzl(0);
            if (zzbtuVar.zzi() != null && this.zza != zzbtuVar.zzi()) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                zzbtuVar.zzi().zzc();
            }
            zzbtuVar.zzj(this.zza);
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzd.zze()).booleanValue() && zzbtuVar.zzh() != null) {
                com.google.android.gms.internal.ads.zzfqj zzh = zzbtuVar.zzh();
                com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzb;
                zzfpwVar.zzd(true);
                zzh.zzb(zzfpwVar.zzm());
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}

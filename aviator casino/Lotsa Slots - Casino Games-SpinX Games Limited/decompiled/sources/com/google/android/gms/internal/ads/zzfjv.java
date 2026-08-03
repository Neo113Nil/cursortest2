package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfjv implements com.google.android.gms.internal.ads.zzetr {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfjw zza;

    zzfjv(com.google.android.gms.internal.ads.zzfjw zzfjwVar) {
        java.util.Objects.requireNonNull(zzfjwVar);
        this.zza = zzfjwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final void zza() {
        com.google.android.gms.internal.ads.zzfjw zzfjwVar = this.zza;
        synchronized (zzfjwVar) {
            zzfjwVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfjw zzfjwVar = this.zza;
        com.google.android.gms.internal.ads.zzdvm zzdvmVar = (com.google.android.gms.internal.ads.zzdvm) obj;
        synchronized (zzfjwVar) {
            zzfjwVar.zzx(zzdvmVar);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeu)).booleanValue()) {
                zzdvmVar.zzh().zza = zzfjwVar.zzv();
            }
            zzfjwVar.zzw().zzj();
        }
    }
}

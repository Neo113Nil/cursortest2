package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzduq implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkf zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfki zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzctj zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdux zzd;

    zzduq(com.google.android.gms.internal.ads.zzdux zzduxVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.internal.ads.zzctj zzctjVar) {
        this.zza = zzfkfVar;
        this.zzb = zzfkiVar;
        this.zzc = zzctjVar;
        java.util.Objects.requireNonNull(zzduxVar);
        this.zzd = zzduxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = (com.google.android.gms.internal.ads.zzcku) obj;
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zza;
        zzckuVar.zzaD(zzfkfVar, this.zzb);
        com.google.android.gms.internal.ads.zzcms zzP = zzckuVar.zzP();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlA)).booleanValue() && zzP != null) {
            com.google.android.gms.internal.ads.zzctj zzctjVar = this.zzc;
            com.google.android.gms.internal.ads.zzdux zzduxVar = this.zzd;
            zzP.zzd(zzctjVar, zzduxVar.zzm(), zzduxVar.zzn());
            zzP.zze(zzctjVar, zzduxVar.zzm(), zzduxVar.zzl());
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoz)).booleanValue() || zzP == null) {
            return;
        }
        zzP.zzb(zzfkfVar);
    }
}

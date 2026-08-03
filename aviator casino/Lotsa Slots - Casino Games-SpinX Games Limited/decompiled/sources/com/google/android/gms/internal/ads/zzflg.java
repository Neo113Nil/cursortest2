package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzflg implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcku zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzctj zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfsc zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzekg zzd;

    zzflg(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzctj zzctjVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzekg zzekgVar) {
        this.zza = zzckuVar;
        this.zzb = zzctjVar;
        this.zzc = zzfscVar;
        this.zzd = zzekgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzctj zzctjVar;
        java.lang.String str = (java.lang.String) obj;
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        com.google.android.gms.internal.ads.zzfkf zzC = zzckuVar.zzC();
        if (zzC != null && !zzC.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzC.zzax;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlw)).booleanValue() && (zzctjVar = this.zzb) != null && com.google.android.gms.internal.ads.zzctj.zzc(str)) {
                zzctjVar.zza(str, this.zzc, com.google.android.gms.ads.internal.client.zzay.zzh(), zzvVar);
                return;
            } else {
                this.zzc.zzb(str, zzvVar, null, null);
                return;
            }
        }
        com.google.android.gms.internal.ads.zzfki zzaC = zzckuVar.zzaC();
        if (zzaC == null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(new java.lang.IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        boolean zzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(zzckuVar.getContext());
        boolean z = false;
        boolean z2 = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhj)).booleanValue() && zzC != null && zzC.zzS;
        if (zzC != null && zzC.zzad != null) {
            z = true;
        }
        this.zzd.zze(new com.google.android.gms.internal.ads.zzeki(currentTimeMillis, zzaC.zzb, str, (zzs || z2 || z) ? 2 : 1));
    }
}

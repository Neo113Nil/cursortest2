package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfme implements zzhcv {
    final /* synthetic */ zzclm zza;
    final /* synthetic */ zzcub zzb;
    final /* synthetic */ zzfte zzc;
    final /* synthetic */ zzele zzd;

    zzfme(zzclm zzclmVar, zzcub zzcubVar, zzfte zzfteVar, zzele zzeleVar) {
        this.zza = zzclmVar;
        this.zzb = zzcubVar;
        this.zzc = zzfteVar;
        this.zzd = zzeleVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcub zzcubVar;
        String str = (String) obj;
        zzclm zzclmVar = this.zza;
        zzfld zzC = zzclmVar.zzC();
        if (zzC != null && !zzC.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzC.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlH)).booleanValue() && (zzcubVar = this.zzb) != null && zzcub.zzc(str)) {
                zzcubVar.zza(str, this.zzc, com.google.android.gms.ads.internal.client.zzay.zzh(), zzvVar);
                return;
            } else {
                this.zzc.zzb(str, zzvVar, null, null);
                return;
            }
        }
        zzflg zzaC = zzclmVar.zzaC();
        if (zzaC == null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        boolean zzt = com.google.android.gms.ads.internal.zzt.zzh().zzt(zzclmVar.getContext());
        boolean z = false;
        boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhp)).booleanValue() && zzC != null && zzC.zzS;
        if (zzC != null && zzC.zzad != null) {
            z = true;
        }
        this.zzd.zze(new zzelg(currentTimeMillis, zzaC.zzb, str, (zzt || z2 || z) ? 2 : 1));
    }
}

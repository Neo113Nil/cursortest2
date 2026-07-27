package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzdvo implements zzhcv {
    final /* synthetic */ zzfld zza;
    final /* synthetic */ zzflg zzb;
    final /* synthetic */ zzcub zzc;
    final /* synthetic */ zzdvv zzd;

    zzdvo(zzdvv zzdvvVar, zzfld zzfldVar, zzflg zzflgVar, zzcub zzcubVar) {
        this.zza = zzfldVar;
        this.zzb = zzflgVar;
        this.zzc = zzcubVar;
        Objects.requireNonNull(zzdvvVar);
        this.zzd = zzdvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzclm zzclmVar = (zzclm) obj;
        zzfld zzfldVar = this.zza;
        zzclmVar.zzaD(zzfldVar, this.zzb);
        zzcnk zzP = zzclmVar.zzP();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlL)).booleanValue() && zzP != null) {
            zzcub zzcubVar = this.zzc;
            zzdvv zzdvvVar = this.zzd;
            zzP.zzd(zzcubVar, zzdvvVar.zzm(), zzdvvVar.zzn());
            zzP.zze(zzcubVar, zzdvvVar.zzm(), zzdvvVar.zzl());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoQ)).booleanValue() || zzP == null) {
            return;
        }
        zzP.zzb(zzfldVar);
    }
}

package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdwh implements zzbra {
    private final zzdew zza;
    private final zzcct zzb;
    private final String zzc;
    private final String zzd;

    public zzdwh(zzdew zzdewVar, zzfld zzfldVar) {
        this.zza = zzdewVar;
        this.zzb = zzfldVar.zzl;
        this.zzc = zzfldVar.zzj;
        this.zzd = zzfldVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zza() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    @ParametersAreNonnullByDefault
    public final void zzb(zzcct zzcctVar) {
        int i;
        String str;
        zzcct zzcctVar2 = this.zzb;
        if (zzcctVar2 != null) {
            zzcctVar = zzcctVar2;
        }
        if (zzcctVar != null) {
            str = zzcctVar.zza;
            i = zzcctVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zze(new zzcce(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbra
    public final void zzc() {
        this.zza.zzf();
    }
}

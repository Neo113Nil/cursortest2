package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdvj implements com.google.android.gms.internal.ads.zzbqi {
    private final com.google.android.gms.internal.ads.zzddy zza;
    private final com.google.android.gms.internal.ads.zzccb zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    public zzdvj(com.google.android.gms.internal.ads.zzddy zzddyVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        this.zza = zzddyVar;
        this.zzb = zzfkfVar.zzl;
        this.zzc = zzfkfVar.zzj;
        this.zzd = zzfkfVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    public final void zza() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    @javax.annotation.ParametersAreNonnullByDefault
    public final void zzb(com.google.android.gms.internal.ads.zzccb zzccbVar) {
        int i;
        java.lang.String str;
        com.google.android.gms.internal.ads.zzccb zzccbVar2 = this.zzb;
        if (zzccbVar2 != null) {
            zzccbVar = zzccbVar2;
        }
        if (zzccbVar != null) {
            str = zzccbVar.zza;
            i = zzccbVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zze(new com.google.android.gms.internal.ads.zzcbm(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    public final void zzc() {
        this.zza.zzf();
    }
}

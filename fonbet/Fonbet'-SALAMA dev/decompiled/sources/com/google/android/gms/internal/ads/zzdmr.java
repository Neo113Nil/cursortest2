package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdmr implements zzbjq {
    private final zzcvx zza;
    private final zzbvm zzb;
    private final String zzc;
    private final String zzd;

    public zzdmr(zzcvx zzcvxVar, zzfaf zzfafVar) {
        this.zza = zzcvxVar;
        this.zzb = zzfafVar.zzl;
        this.zzc = zzfafVar.zzj;
        this.zzd = zzfafVar.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zza(zzbvm zzbvmVar) {
        int i7;
        String str;
        zzbvm zzbvmVar2 = this.zzb;
        if (zzbvmVar2 != null) {
            zzbvmVar = zzbvmVar2;
        }
        if (zzbvmVar != null) {
            str = zzbvmVar.zza;
            i7 = zzbvmVar.zzb;
        } else {
            i7 = 1;
            str = "";
        }
        this.zza.zzd(new zzbux(str, i7), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzc() {
        this.zza.zzf();
    }
}

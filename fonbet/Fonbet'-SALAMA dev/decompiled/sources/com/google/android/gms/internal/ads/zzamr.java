package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzamr implements zzamz {
    private zzz zza;
    private zzek zzb;
    private zzaeb zzc;

    public zzamr(String str, String str2) {
        zzx zzxVar = new zzx();
        zzxVar.zzE("video/mp2t");
        zzxVar.zzad(str);
        this.zza = zzxVar.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zza(zzed zzedVar) {
        zzcv.zzb(this.zzb);
        int i7 = zzen.zza;
        long zze = this.zzb.zze();
        long zzf = this.zzb.zzf();
        if (zze == -9223372036854775807L || zzf == -9223372036854775807L) {
            return;
        }
        zzz zzzVar = this.zza;
        if (zzf != zzzVar.zzt) {
            zzx zzb = zzzVar.zzb();
            zzb.zzah(zzf);
            zzz zzaj = zzb.zzaj();
            this.zza = zzaj;
            this.zzc.zzm(zzaj);
        }
        int zzb2 = zzedVar.zzb();
        this.zzc.zzr(zzedVar, zzb2);
        this.zzc.zzt(zze, 1, zzb2, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzek zzekVar, zzacy zzacyVar, zzanm zzanmVar) {
        this.zzb = zzekVar;
        zzanmVar.zzc();
        zzaeb zzw = zzacyVar.zzw(zzanmVar.zza(), 5);
        this.zzc = zzw;
        zzw.zzm(this.zza);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        long jZze = this.zzb.zze();
        long jZzf = this.zzb.zzf();
        if (jZze == -9223372036854775807L || jZzf == -9223372036854775807L) {
            return;
        }
        zzz zzzVar = this.zza;
        if (jZzf != zzzVar.zzt) {
            zzx zzxVarZzb = zzzVar.zzb();
            zzxVarZzb.zzah(jZzf);
            zzz zzzVarZzaj = zzxVarZzb.zzaj();
            this.zza = zzzVarZzaj;
            this.zzc.zzm(zzzVarZzaj);
        }
        int iZzb = zzedVar.zzb();
        this.zzc.zzr(zzedVar, iZzb);
        this.zzc.zzt(jZze, 1, iZzb, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzek zzekVar, zzacy zzacyVar, zzanm zzanmVar) {
        this.zzb = zzekVar;
        zzanmVar.zzc();
        zzaeb zzaebVarZzw = zzacyVar.zzw(zzanmVar.zza(), 5);
        this.zzc = zzaebVarZzw;
        zzaebVarZzw.zzm(this.zza);
    }
}

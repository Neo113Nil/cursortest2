package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzaex implements zzacf {
    private final zzadg zza;
    private final int zzb;
    private final zzadb zzc = new zzadb();

    public /* synthetic */ zzaex(zzadg zzadgVar, int i7, zzaey zzaeyVar) {
        this.zza = zzadgVar;
        this.zzb = i7;
    }

    private final long zzc(zzacw zzacwVar) {
        while (zzacwVar.zze() < zzacwVar.zzd() - 6) {
            zzadg zzadgVar = this.zza;
            int i7 = this.zzb;
            zzadb zzadbVar = this.zzc;
            long jZze = zzacwVar.zze();
            byte[] bArr = new byte[2];
            zzacwVar.zzh(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i7) {
                zzacwVar.zzj();
                zzacwVar.zzg((int) (jZze - zzacwVar.zzf()));
            } else {
                zzed zzedVar = new zzed(16);
                System.arraycopy(bArr, 0, zzedVar.zzN(), 0, 2);
                zzedVar.zzK(zzacz.zza(zzacwVar, zzedVar.zzN(), 2, 14));
                zzacwVar.zzj();
                zzacwVar.zzg((int) (jZze - zzacwVar.zzf()));
                if (zzadc.zzc(zzedVar, zzadgVar, i7, zzadbVar)) {
                    break;
                }
            }
            zzacwVar.zzg(1);
        }
        if (zzacwVar.zze() < zzacwVar.zzd() - 6) {
            return this.zzc.zza;
        }
        zzacwVar.zzg((int) (zzacwVar.zzd() - zzacwVar.zze()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final zzace zza(zzacw zzacwVar, long j) {
        long jZzf = zzacwVar.zzf();
        long jZzc = zzc(zzacwVar);
        long jZze = zzacwVar.zze();
        zzacwVar.zzg(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzacwVar);
        long jZze2 = zzacwVar.zze();
        if (jZzc > j || jZzc2 <= j) {
            return jZzc2 <= j ? zzace.zzf(jZzc2, jZze2) : zzace.zzd(jZzc, jZzf);
        }
        return zzace.zze(jZze);
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final /* synthetic */ void zzb() {
    }
}

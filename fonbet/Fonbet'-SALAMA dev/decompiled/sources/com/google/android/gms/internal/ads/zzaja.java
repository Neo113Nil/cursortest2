package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaja {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzed zzg = new zzed(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzacw zzacwVar, boolean z4) {
        zza();
        this.zzg.zzI(27);
        if (zzacz.zzc(zzacwVar, this.zzg.zzN(), 0, 27, z4) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z4) {
                    return false;
                }
                throw zzaz.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int zzm = this.zzg.zzm();
            this.zzc = zzm;
            this.zzd = zzm + 27;
            this.zzg.zzI(zzm);
            if (zzacz.zzc(zzacwVar, this.zzg.zzN(), 0, this.zzc, z4)) {
                for (int i7 = 0; i7 < this.zzc; i7++) {
                    this.zzf[i7] = this.zzg.zzm();
                    this.zze += this.zzf[i7];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzacw zzacwVar, long j) {
        zzcv.zzd(zzacwVar.zzf() == zzacwVar.zze());
        this.zzg.zzI(4);
        while (true) {
            if ((j == -1 || zzacwVar.zzf() + 4 < j) && zzacz.zzc(zzacwVar, this.zzg.zzN(), 0, 4, true)) {
                this.zzg.zzL(0);
                if (this.zzg.zzu() == 1332176723) {
                    zzacwVar.zzj();
                    return true;
                }
                zzacwVar.zzk(1);
            }
        }
        do {
            if (j != -1 && zzacwVar.zzf() >= j) {
                break;
            }
        } while (zzacwVar.zzc(1) != -1);
        return false;
    }
}

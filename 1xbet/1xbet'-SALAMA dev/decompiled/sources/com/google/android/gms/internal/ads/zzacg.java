package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class zzacg {
    protected final zzaca zza;
    protected final zzacf zzb;
    protected zzacc zzc;
    private final int zzd;

    public zzacg(zzacd zzacdVar, zzacf zzacfVar, long j, long j3, long j7, long j8, long j9, long j10, int i7) {
        this.zzb = zzacfVar;
        this.zzd = i7;
        this.zza = new zzaca(zzacdVar, j, 0L, j7, j8, j9, j10);
    }

    public static final int zzf(zzacw zzacwVar, long j, zzadr zzadrVar) {
        if (j == zzacwVar.zzf()) {
            return 0;
        }
        zzadrVar.zza = j;
        return 1;
    }

    public static final boolean zzg(zzacw zzacwVar, long j) {
        long jZzf = j - zzacwVar.zzf();
        if (jZzf < 0 || jZzf > 262144) {
            return false;
        }
        zzacwVar.zzk((int) jZzf);
        return true;
    }

    public final int zza(zzacw zzacwVar, zzadr zzadrVar) {
        while (true) {
            zzacc zzaccVar = this.zzc;
            zzcv.zzb(zzaccVar);
            long j = zzaccVar.zzf;
            long j3 = zzaccVar.zzg;
            long j7 = zzaccVar.zzh;
            if (j3 - j <= this.zzd) {
                zzc(false, j);
                return zzf(zzacwVar, j, zzadrVar);
            }
            if (!zzg(zzacwVar, j7)) {
                return zzf(zzacwVar, j7, zzadrVar);
            }
            zzacwVar.zzj();
            zzace zzaceVarZza = this.zzb.zza(zzacwVar, zzaccVar.zzb);
            int i7 = zzaceVarZza.zzb;
            if (i7 == -3) {
                zzc(false, j7);
                return zzf(zzacwVar, j7, zzadrVar);
            }
            if (i7 == -2) {
                zzacc.zzh(zzaccVar, zzaceVarZza.zzc, zzaceVarZza.zzd);
            } else {
                if (i7 != -1) {
                    zzg(zzacwVar, zzaceVarZza.zzd);
                    zzc(true, zzaceVarZza.zzd);
                    return zzf(zzacwVar, zzaceVarZza.zzd, zzadrVar);
                }
                zzacc.zzg(zzaccVar, zzaceVarZza.zzc, zzaceVarZza.zzd);
            }
        }
    }

    public final zzadu zzb() {
        return this.zza;
    }

    public final void zzc(boolean z4, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        zzacc zzaccVar = this.zzc;
        if (zzaccVar == null || zzaccVar.zza != j) {
            zzaca zzacaVar = this.zza;
            this.zzc = new zzacc(j, zzacaVar.zzf(j), 0L, zzacaVar.zzc, zzacaVar.zzd, zzacaVar.zze, zzacaVar.zzf);
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        long zzf = j - zzacwVar.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        zzacwVar.zzk((int) zzf);
        return true;
    }

    public final int zza(zzacw zzacwVar, zzadr zzadrVar) {
        long j;
        long j3;
        long j7;
        long j8;
        int i7;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        while (true) {
            zzacc zzaccVar = this.zzc;
            zzcv.zzb(zzaccVar);
            j = zzaccVar.zzf;
            j3 = zzaccVar.zzg;
            j7 = zzaccVar.zzh;
            if (j3 - j <= this.zzd) {
                zzc(false, j);
                return zzf(zzacwVar, j, zzadrVar);
            }
            if (!zzg(zzacwVar, j7)) {
                return zzf(zzacwVar, j7, zzadrVar);
            }
            zzacwVar.zzj();
            zzacf zzacfVar = this.zzb;
            j8 = zzaccVar.zzb;
            zzace zza = zzacfVar.zza(zzacwVar, j8);
            i7 = zza.zzb;
            if (i7 == -3) {
                zzc(false, j7);
                return zzf(zzacwVar, j7, zzadrVar);
            }
            if (i7 == -2) {
                j14 = zza.zzc;
                j15 = zza.zzd;
                zzacc.zzh(zzaccVar, j14, j15);
            } else {
                if (i7 != -1) {
                    j9 = zza.zzd;
                    zzg(zzacwVar, j9);
                    j10 = zza.zzd;
                    zzc(true, j10);
                    j11 = zza.zzd;
                    return zzf(zzacwVar, j11, zzadrVar);
                }
                j12 = zza.zzc;
                j13 = zza.zzd;
                zzacc.zzg(zzaccVar, j12, j13);
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
        long j3;
        long j7;
        long j8;
        long j9;
        long j10;
        zzacc zzaccVar = this.zzc;
        if (zzaccVar != null) {
            j10 = zzaccVar.zza;
            if (j10 == j) {
                return;
            }
        }
        zzaca zzacaVar = this.zza;
        long zzf = zzacaVar.zzf(j);
        j3 = zzacaVar.zzc;
        j7 = zzacaVar.zzd;
        j8 = zzacaVar.zze;
        j9 = zzacaVar.zzf;
        this.zzc = new zzacc(j, zzf, 0L, j3, j7, j8, j9);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}

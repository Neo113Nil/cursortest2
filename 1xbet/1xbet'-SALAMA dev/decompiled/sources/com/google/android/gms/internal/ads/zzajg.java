package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
abstract class zzajg {
    private zzaeb zzb;
    private zzacy zzc;
    private zzajb zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzaiz zza = new zzaiz();
    private zzajd zzj = new zzajd();

    public abstract long zza(zzed zzedVar);

    public void zzb(boolean z4) {
        int i7;
        if (z4) {
            this.zzj = new zzajd();
            this.zzf = 0L;
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.zzh = i7;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract boolean zzc(zzed zzedVar, long j, zzajd zzajdVar);

    public final int zze(zzacw zzacwVar, zzadr zzadrVar) {
        zzcv.zzb(this.zzb);
        int i7 = zzen.zza;
        int i8 = this.zzh;
        if (i8 == 0) {
            while (this.zza.zze(zzacwVar)) {
                long jZzf = zzacwVar.zzf();
                long j = this.zzf;
                this.zzk = jZzf - j;
                if (zzc(this.zza.zza(), j, this.zzj)) {
                    this.zzf = zzacwVar.zzf();
                } else {
                    zzz zzzVar = this.zzj.zza;
                    this.zzi = zzzVar.zzF;
                    if (!this.zzm) {
                        this.zzb.zzm(zzzVar);
                        this.zzm = true;
                    }
                    zzajb zzajbVar = this.zzj.zzb;
                    if (zzajbVar != null) {
                        this.zzd = zzajbVar;
                    } else if (zzacwVar.zzd() == -1) {
                        this.zzd = new zzaje(null);
                    } else {
                        zzaja zzajaVarZzb = this.zza.zzb();
                        this.zzd = new zzaiv(this, this.zzf, zzacwVar.zzd(), zzajaVarZzb.zzd + zzajaVarZzb.zze, zzajaVarZzb.zzb, (zzajaVarZzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                }
            }
            this.zzh = 3;
            return -1;
        }
        if (i8 == 1) {
            zzacwVar.zzk((int) this.zzf);
            this.zzh = 2;
            return 0;
        }
        if (i8 != 2) {
            return -1;
        }
        long jZzd = this.zzd.zzd(zzacwVar);
        if (jZzd >= 0) {
            zzadrVar.zza = jZzd;
            return 1;
        }
        if (jZzd < -1) {
            zzi(-(jZzd + 2));
        }
        if (!this.zzl) {
            zzadu zzaduVarZze = this.zzd.zze();
            zzcv.zzb(zzaduVarZze);
            this.zzc.zzP(zzaduVarZze);
            this.zzb.zzl(zzaduVarZze.zza());
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzacwVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzed zzedVarZza = this.zza.zza();
        long jZza = zza(zzedVarZza);
        if (jZza >= 0) {
            long j3 = this.zzg;
            if (j3 + jZza >= this.zze) {
                long jZzf2 = zzf(j3);
                this.zzb.zzr(zzedVarZza, zzedVarZza.zze());
                this.zzb.zzt(jZzf2, 1, zzedVarZza.zze(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += jZza;
        return 0;
    }

    public final long zzf(long j) {
        return (j * 1000000) / ((long) this.zzi);
    }

    public final long zzg(long j) {
        return (((long) this.zzi) * j) / 1000000;
    }

    public final void zzh(zzacy zzacyVar, zzaeb zzaebVar) {
        this.zzc = zzacyVar;
        this.zzb = zzaebVar;
        zzb(true);
    }

    public void zzi(long j) {
        this.zzg = j;
    }

    public final void zzj(long j, long j3) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long jZzg = zzg(j3);
            this.zze = jZzg;
            zzajb zzajbVar = this.zzd;
            int i7 = zzen.zza;
            zzajbVar.zzg(jZzg);
            this.zzh = 2;
        }
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
                long zzf = zzacwVar.zzf();
                long j = this.zzf;
                this.zzk = zzf - j;
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
                        zzaja zzb = this.zza.zzb();
                        this.zzd = new zzaiv(this, this.zzf, zzacwVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, (zzb.zza & 4) != 0);
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
        long zzd = this.zzd.zzd(zzacwVar);
        if (zzd >= 0) {
            zzadrVar.zza = zzd;
            return 1;
        }
        if (zzd < -1) {
            zzi(-(zzd + 2));
        }
        if (!this.zzl) {
            zzadu zze = this.zzd.zze();
            zzcv.zzb(zze);
            this.zzc.zzP(zze);
            this.zzb.zzl(zze.zza());
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzacwVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzed zza = this.zza.zza();
        long zza2 = zza(zza);
        if (zza2 >= 0) {
            long j3 = this.zzg;
            if (j3 + zza2 >= this.zze) {
                long zzf2 = zzf(j3);
                this.zzb.zzr(zza, zza.zze());
                this.zzb.zzt(zzf2, 1, zza.zze(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += zza2;
        return 0;
    }

    public final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    public final long zzg(long j) {
        return (this.zzi * j) / 1000000;
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
            long zzg = zzg(j3);
            this.zze = zzg;
            zzajb zzajbVar = this.zzd;
            int i7 = zzen.zza;
            zzajbVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzamz {
    private com.google.android.gms.internal.ads.zzahk zzb;
    private com.google.android.gms.internal.ads.zzagb zzc;
    private com.google.android.gms.internal.ads.zzamv zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final com.google.android.gms.internal.ads.zzamt zza = new com.google.android.gms.internal.ads.zzamt();
    private com.google.android.gms.internal.ads.zzamx zzj = new com.google.android.gms.internal.ads.zzamx();

    protected void zza(boolean z) {
        int i;
        if (z) {
            this.zzj = new com.google.android.gms.internal.ads.zzamx();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract long zzb(com.google.android.gms.internal.ads.zzet zzetVar);

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(com.google.android.gms.internal.ads.zzet zzetVar, long j, com.google.android.gms.internal.ads.zzamx zzamxVar) throws java.io.IOException;

    final void zze(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzahk zzahkVar) {
        this.zzc = zzagbVar;
        this.zzb = zzahkVar;
        zza(true);
    }

    final void zzf(long j, long j2) {
        this.zza.zza();
        if (j == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            this.zze = zzi(j2);
            com.google.android.gms.internal.ads.zzamv zzamvVar = this.zzd;
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            zzamvVar.zzb(this.zze);
            this.zzh = 2;
        }
    }

    final int zzg(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        this.zzb.getClass();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int i = this.zzh;
        if (i == 0) {
            while (true) {
                com.google.android.gms.internal.ads.zzamt zzamtVar = this.zza;
                if (!zzamtVar.zzb(zzafzVar)) {
                    this.zzh = 3;
                    return -1;
                }
                long zzn = zzafzVar.zzn();
                long j = this.zzf;
                this.zzk = zzn - j;
                if (zzc(zzamtVar.zzd(), j, this.zzj)) {
                    this.zzf = zzafzVar.zzn();
                } else {
                    com.google.android.gms.internal.ads.zzv zzvVar = this.zzj.zza;
                    this.zzi = zzvVar.zzI;
                    if (!this.zzm) {
                        this.zzb.zzA(zzvVar);
                        this.zzm = true;
                    }
                    com.google.android.gms.internal.ads.zzamv zzamvVar = this.zzj.zzb;
                    if (zzamvVar != null) {
                        this.zzd = zzamvVar;
                    } else if (zzafzVar.zzo() == -1) {
                        this.zzd = new com.google.android.gms.internal.ads.zzamy(null);
                    } else {
                        com.google.android.gms.internal.ads.zzamu zzc = zzamtVar.zzc();
                        this.zzd = new com.google.android.gms.internal.ads.zzamo(this, this.zzf, zzafzVar.zzo(), zzc.zzd + zzc.zze, zzc.zzb, (zzc.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    zzamtVar.zze();
                }
            }
        } else {
            if (i == 1) {
                zzafzVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i != 2) {
                return -1;
            }
            long zza = this.zzd.zza(zzafzVar);
            if (zza >= 0) {
                zzagyVar.zza = zza;
                return 1;
            }
            if (zza < -1) {
                zzj(-(zza + 2));
            }
            if (!this.zzl) {
                com.google.android.gms.internal.ads.zzahb zzc2 = this.zzd.zzc();
                zzc2.getClass();
                this.zzc.zzw(zzc2);
                this.zzb.zzO(zzc2.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzafzVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            com.google.android.gms.internal.ads.zzet zzd = this.zza.zzd();
            long zzb = zzb(zzd);
            if (zzb >= 0) {
                long j2 = this.zzg;
                if (j2 + zzb >= this.zze) {
                    long zzh = zzh(j2);
                    this.zzb.zzc(zzd, zzd.zze());
                    this.zzb.zze(zzh, 1, zzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += zzb;
        }
        return 0;
    }

    protected final long zzh(long j) {
        return (j * 1000000) / this.zzi;
    }

    protected final long zzi(long j) {
        return (this.zzi * j) / 1000000;
    }

    protected void zzj(long j) {
        this.zzg = j;
    }
}

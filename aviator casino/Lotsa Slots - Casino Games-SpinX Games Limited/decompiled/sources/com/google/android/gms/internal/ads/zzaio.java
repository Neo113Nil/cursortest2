package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaio implements com.google.android.gms.internal.ads.zzafy {
    private com.google.android.gms.internal.ads.zzagb zzb;
    private com.google.android.gms.internal.ads.zzaix zzc;
    private com.google.android.gms.internal.ads.zzafz zzd;
    private com.google.android.gms.internal.ads.zzahg zze;
    private com.google.android.gms.internal.ads.zzamc zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet(16);
    private long zzk = -1;
    private int zzg = 0;

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        int i;
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(16);
        boolean z = true;
        while (true) {
            zzetVar.zza(8);
            if (!zzafzVar.zzh(zzetVar.zzi(), 0, 8, true)) {
                break;
            }
            long zzz = zzetVar.zzz();
            int zzB = zzetVar.zzB();
            if (zzz != 1) {
                i = 8;
            } else {
                if (!zzafzVar.zzh(zzetVar.zzi(), 8, 8, true)) {
                    break;
                }
                zzz = zzetVar.zzJ();
                i = 16;
            }
            long j = i;
            if (zzz < j) {
                break;
            }
            int i2 = (int) (zzz - j);
            if (z) {
                if (zzB != 1718909296 || i2 < 8) {
                    break;
                }
                zzetVar.zza(4);
                com.google.android.gms.internal.ads.zzafp zzafpVar = (com.google.android.gms.internal.ads.zzafp) zzafzVar;
                zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
                if (zzetVar.zzB() != 1751476579) {
                    break;
                }
                zzafpVar.zzj(i2 - 4, false);
            } else {
                if (zzB == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    ((com.google.android.gms.internal.ads.zzafp) zzafzVar).zzj(i2, false);
                }
            }
            z = false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zzb = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        if (j != 0) {
            if (this.zzg == 3) {
                com.google.android.gms.internal.ads.zzamc zzamcVar = this.zzf;
                zzamcVar.getClass();
                zzamcVar.zze(j, j2);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    private final void zzh() {
        com.google.android.gms.internal.ads.zzagb zzagbVar = this.zzb;
        zzagbVar.getClass();
        zzagbVar.zzv();
        this.zzb.zzw(new com.google.android.gms.internal.ads.zzaha(-9223372036854775807L, 0L));
        this.zzg = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
                    if (!zzafzVar.zzb(zzetVar.zzi(), 0, 8, true)) {
                        zzh();
                        return -1;
                    }
                    this.zzj = 8;
                    zzetVar.zzh(0);
                    this.zzi = zzetVar.zzz();
                    this.zzh = zzetVar.zzB();
                }
                long j = this.zzi;
                if (j == 1) {
                    com.google.android.gms.internal.ads.zzet zzetVar2 = this.zza;
                    zzafzVar.zzc(zzetVar2.zzi(), 8, 8);
                    this.zzj += 8;
                    j = zzetVar2.zzJ();
                    this.zzi = j;
                }
                if (this.zzh == 1836086884) {
                    long zzn = zzafzVar.zzn();
                    this.zzk = zzn;
                    long j2 = this.zzj;
                    com.google.android.gms.internal.ads.zzaix zzaixVar = new com.google.android.gms.internal.ads.zzaix(0L, zzn - j2, -9223372036854775807L, zzn, j - j2);
                    this.zzc = zzaixVar;
                    com.google.android.gms.internal.ads.zzagb zzagbVar = this.zzb;
                    zzagbVar.getClass();
                    com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(1024, 4);
                    com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                    zztVar.zzn("image/heic");
                    zztVar.zzl(new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, zzaixVar));
                    zzu.zzA(zztVar.zzO());
                    this.zzg = 2;
                } else {
                    this.zzg = 1;
                }
            } else if (i == 1) {
                zzafzVar.zzf((int) (this.zzi - this.zzj));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzafzVar != this.zzd) {
                        this.zzd = zzafzVar;
                        this.zze = new com.google.android.gms.internal.ads.zzahg(zzafzVar, this.zzk);
                    }
                    com.google.android.gms.internal.ads.zzamc zzamcVar = this.zzf;
                    zzamcVar.getClass();
                    int zzd = zzamcVar.zzd(this.zze, zzagyVar);
                    if (zzd == 1) {
                        zzagyVar.zza += this.zzk;
                    }
                    return zzd;
                }
                if (this.zzf == null) {
                    this.zzf = new com.google.android.gms.internal.ads.zzamc(com.google.android.gms.internal.ads.zzanj.zza, 8);
                }
                com.google.android.gms.internal.ads.zzahg zzahgVar = new com.google.android.gms.internal.ads.zzahg(zzafzVar, this.zzk);
                this.zze = zzahgVar;
                if (this.zzf.zza(zzahgVar)) {
                    com.google.android.gms.internal.ads.zzamc zzamcVar2 = this.zzf;
                    long j3 = this.zzk;
                    com.google.android.gms.internal.ads.zzagb zzagbVar2 = this.zzb;
                    zzagbVar2.getClass();
                    zzamcVar2.zzc(new com.google.android.gms.internal.ads.zzahi(j3, zzagbVar2));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaig implements com.google.android.gms.internal.ads.zzafy {
    private final byte[] zza;
    private final com.google.android.gms.internal.ads.zzet zzb;
    private final com.google.android.gms.internal.ads.zzagf zzc;
    private com.google.android.gms.internal.ads.zzagb zzd;
    private com.google.android.gms.internal.ads.zzahk zze;
    private int zzf;
    private com.google.android.gms.internal.ads.zzap zzg;
    private com.google.android.gms.internal.ads.zzagl zzh;
    private int zzi;
    private int zzj;
    private com.google.android.gms.internal.ads.zzaie zzk;
    private int zzl;
    private long zzm;

    static {
        int i = com.google.android.gms.internal.ads.zzaif.zza;
    }

    public zzaig() {
        throw null;
    }

    public zzaig(int i) {
        this.zza = new byte[42];
        this.zzb = new com.google.android.gms.internal.ads.zzet(new byte[32768], 0);
        this.zzc = new com.google.android.gms.internal.ads.zzagf();
        this.zzf = 0;
    }

    private final long zzh(com.google.android.gms.internal.ads.zzet zzetVar, boolean z) {
        boolean z2;
        this.zzh.getClass();
        int zzg = zzetVar.zzg();
        while (zzg <= zzetVar.zze() - 16) {
            zzetVar.zzh(zzg);
            com.google.android.gms.internal.ads.zzagl zzaglVar = this.zzh;
            int i = this.zzj;
            com.google.android.gms.internal.ads.zzagf zzagfVar = this.zzc;
            if (com.google.android.gms.internal.ads.zzagg.zza(zzetVar, zzaglVar, i, zzagfVar)) {
                zzetVar.zzh(zzg);
                return zzagfVar.zza;
            }
            zzg++;
        }
        if (!z) {
            zzetVar.zzh(zzg);
            return -1L;
        }
        while (zzg <= zzetVar.zze() - this.zzi) {
            zzetVar.zzh(zzg);
            try {
                z2 = com.google.android.gms.internal.ads.zzagg.zza(zzetVar, this.zzh, this.zzj, this.zzc);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (zzetVar.zzg() <= zzetVar.zze() && z2) {
                zzetVar.zzh(zzg);
                return this.zzc.zza;
            }
            zzg++;
        }
        zzetVar.zzh(zzetVar.zze());
        return -1L;
    }

    private final void zzi() {
        long j = this.zzm * 1000000;
        com.google.android.gms.internal.ads.zzagl zzaglVar = this.zzh;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zze.zze(j / zzaglVar.zze, 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzagi.zza(zzafzVar, false);
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(4);
        ((com.google.android.gms.internal.ads.zzafp) zzafzVar).zzh(zzetVar.zzi(), 0, 4, false);
        return zzetVar.zzz() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zzd = zzagbVar;
        this.zze = zzagbVar.zzu(0, 1);
        zzagbVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzf = 0;
        } else {
            com.google.android.gms.internal.ads.zzaie zzaieVar = this.zzk;
            if (zzaieVar != null) {
                zzaieVar.zzb(j2);
            }
        }
        this.zzm = j2 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        boolean zzb;
        com.google.android.gms.internal.ads.zzagl zzaglVar;
        com.google.android.gms.internal.ads.zzahb zzahaVar;
        boolean z;
        int i = this.zzf;
        if (i == 0) {
            zzafzVar.zzl();
            long zzm = zzafzVar.zzm();
            com.google.android.gms.internal.ads.zzap zza = com.google.android.gms.internal.ads.zzagi.zza(zzafzVar, true);
            zzafzVar.zzf((int) (zzafzVar.zzm() - zzm));
            this.zzg = zza;
            this.zzf = 1;
            return 0;
        }
        if (i == 1) {
            zzafzVar.zzi(this.zza, 0, 42);
            zzafzVar.zzl();
            this.zzf = 2;
            return 0;
        }
        if (i == 2) {
            com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(4);
            zzafzVar.zzc(zzetVar.zzi(), 0, 4);
            if (zzetVar.zzz() != 1716281667) {
                throw com.google.android.gms.internal.ads.zzat.zzb("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i == 3) {
            com.google.android.gms.internal.ads.zzagh zzaghVar = new com.google.android.gms.internal.ads.zzagh(this.zzh);
            do {
                zzb = com.google.android.gms.internal.ads.zzagi.zzb(zzafzVar, zzaghVar);
                zzaglVar = zzaghVar.zza;
                java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                this.zzh = zzaglVar;
            } while (!zzb);
            zzaglVar.getClass();
            this.zzi = java.lang.Math.max(zzaglVar.zzc, 6);
            com.google.android.gms.internal.ads.zzv zzc = this.zzh.zzc(this.zza, this.zzg);
            com.google.android.gms.internal.ads.zzahk zzahkVar = this.zze;
            com.google.android.gms.internal.ads.zzt zza2 = zzc.zza();
            zza2.zzn("audio/flac");
            zzahkVar.zzA(zza2.zzO());
            this.zze.zzO(this.zzh.zza());
            this.zzf = 4;
            return 0;
        }
        if (i == 4) {
            zzafzVar.zzl();
            com.google.android.gms.internal.ads.zzet zzetVar2 = new com.google.android.gms.internal.ads.zzet(2);
            zzafzVar.zzi(zzetVar2.zzi(), 0, 2);
            int zzt = zzetVar2.zzt();
            if ((zzt >> 2) != 16382) {
                zzafzVar.zzl();
                throw com.google.android.gms.internal.ads.zzat.zzb("First frame does not start with sync code.", null);
            }
            zzafzVar.zzl();
            this.zzj = zzt;
            com.google.android.gms.internal.ads.zzagb zzagbVar = this.zzd;
            java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
            long zzn = zzafzVar.zzn();
            long zzo = zzafzVar.zzo();
            com.google.android.gms.internal.ads.zzagl zzaglVar2 = this.zzh;
            zzaglVar2.getClass();
            com.google.android.gms.internal.ads.zzagk zzagkVar = zzaglVar2.zzk;
            if (zzagkVar != null && zzagkVar.zza.length > 0) {
                zzahaVar = new com.google.android.gms.internal.ads.zzagj(zzaglVar2, zzn);
            } else if (zzo == -1 || zzaglVar2.zzj <= 0) {
                zzahaVar = new com.google.android.gms.internal.ads.zzaha(zzaglVar2.zza(), 0L);
            } else {
                com.google.android.gms.internal.ads.zzaie zzaieVar = new com.google.android.gms.internal.ads.zzaie(zzaglVar2, this.zzj, zzn, zzo);
                this.zzk = zzaieVar;
                zzahaVar = zzaieVar.zza();
            }
            zzagbVar.zzw(zzahaVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        com.google.android.gms.internal.ads.zzagl zzaglVar3 = this.zzh;
        zzaglVar3.getClass();
        com.google.android.gms.internal.ads.zzaie zzaieVar2 = this.zzk;
        if (zzaieVar2 != null && zzaieVar2.zzc()) {
            return zzaieVar2.zzd(zzafzVar, zzagyVar);
        }
        if (this.zzm == -1) {
            this.zzm = com.google.android.gms.internal.ads.zzagg.zzb(zzafzVar, zzaglVar3);
            return 0;
        }
        com.google.android.gms.internal.ads.zzet zzetVar3 = this.zzb;
        int zze = zzetVar3.zze();
        if (zze < 32768) {
            int zza3 = zzafzVar.zza(zzetVar3.zzi(), zze, 32768 - zze);
            z = zza3 == -1;
            if (!z) {
                zzetVar3.zzf(zze + zza3);
            } else if (zzetVar3.zzd() == 0) {
                zzi();
                return -1;
            }
        } else {
            z = false;
        }
        int zzg = zzetVar3.zzg();
        int i2 = this.zzl;
        int i3 = this.zzi;
        if (i2 < i3) {
            zzetVar3.zzk(java.lang.Math.min(i3 - i2, zzetVar3.zzd()));
        }
        long zzh = zzh(zzetVar3, z);
        int zzg2 = zzetVar3.zzg() - zzg;
        zzetVar3.zzh(zzg);
        this.zze.zzc(zzetVar3, zzg2);
        this.zzl += zzg2;
        if (zzh != -1) {
            zzi();
            this.zzl = 0;
            this.zzm = zzh;
        }
        int length = zzetVar3.zzi().length - zzetVar3.zze();
        if (zzetVar3.zzd() >= 16 || length >= 16) {
            return 0;
        }
        int zzd = zzetVar3.zzd();
        java.lang.System.arraycopy(zzetVar3.zzi(), zzetVar3.zzg(), zzetVar3.zzi(), 0, zzd);
        zzetVar3.zzh(0);
        zzetVar3.zzf(zzd);
        return 0;
    }
}

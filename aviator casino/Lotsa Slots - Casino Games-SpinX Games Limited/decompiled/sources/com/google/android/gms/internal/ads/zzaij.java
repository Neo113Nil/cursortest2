package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaij implements com.google.android.gms.internal.ads.zzafy {
    private com.google.android.gms.internal.ads.zzagb zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private com.google.android.gms.internal.ads.zzaih zzo;
    private com.google.android.gms.internal.ads.zzain zzp;
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet(4);
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet(9);
    private final com.google.android.gms.internal.ads.zzet zzc = new com.google.android.gms.internal.ads.zzet(11);
    private final com.google.android.gms.internal.ads.zzet zzd = new com.google.android.gms.internal.ads.zzet();
    private final com.google.android.gms.internal.ads.zzaik zze = new com.google.android.gms.internal.ads.zzaik();
    private int zzg = 1;

    static {
        int i = com.google.android.gms.internal.ads.zzaii.zza;
    }

    private final com.google.android.gms.internal.ads.zzet zzh(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzd;
        if (this.zzl > zzetVar.zzj()) {
            int zzj = zzetVar.zzj();
            zzetVar.zzb(new byte[java.lang.Math.max(zzj + zzj, this.zzl)], 0);
        } else {
            zzetVar.zzh(0);
        }
        zzetVar.zzf(this.zzl);
        zzafzVar.zzc(zzetVar.zzi(), 0, this.zzl);
        return zzetVar;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    private final void zzi() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzw(new com.google.android.gms.internal.ads.zzaha(-9223372036854775807L, 0L));
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        com.google.android.gms.internal.ads.zzafp zzafpVar = (com.google.android.gms.internal.ads.zzafp) zzafzVar;
        zzafpVar.zzh(zzetVar.zzi(), 0, 3, false);
        zzetVar.zzh(0);
        if (zzetVar.zzx() != 4607062) {
            return false;
        }
        zzafpVar.zzh(zzetVar.zzi(), 0, 2, false);
        zzetVar.zzh(0);
        if ((zzetVar.zzt() & androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
        zzetVar.zzh(0);
        int zzB = zzetVar.zzB();
        zzafzVar.zzl();
        zzafpVar.zzj(zzB, false);
        zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
        zzetVar.zzh(0);
        return zzetVar.zzB() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ java.util.List zzb() {
        java.util.List zzi;
        zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(com.google.android.gms.internal.ads.zzagb zzagbVar) {
        this.zzf = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public /* synthetic */ com.google.android.gms.internal.ads.zzafy zzg() {
        return com.google.android.gms.internal.ads.zzafy.CC.$default$zzg(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzafy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        boolean zzf;
        boolean z;
        this.zzf.getClass();
        while (true) {
            int i = this.zzg;
            int i2 = 8;
            if (i == 1) {
                com.google.android.gms.internal.ads.zzet zzetVar = this.zzb;
                if (!zzafzVar.zzb(zzetVar.zzi(), 0, 9, true)) {
                    return -1;
                }
                zzetVar.zzh(0);
                zzetVar.zzk(4);
                int zzs = zzetVar.zzs();
                int i3 = zzs & 4;
                int i4 = zzs & 1;
                if (i3 != 0 && this.zzo == null) {
                    this.zzo = new com.google.android.gms.internal.ads.zzaih(this.zzf.zzu(8, 1));
                }
                if (i4 != 0 && this.zzp == null) {
                    this.zzp = new com.google.android.gms.internal.ads.zzain(this.zzf.zzu(9, 2));
                }
                this.zzf.zzv();
                this.zzj = zzetVar.zzB() - 5;
                this.zzg = 2;
            } else if (i == 2) {
                zzafzVar.zzf(this.zzj);
                this.zzj = 0;
                this.zzg = 3;
            } else if (i == 3) {
                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzc;
                if (!zzafzVar.zzb(zzetVar2.zzi(), 0, 11, true)) {
                    return -1;
                }
                zzetVar2.zzh(0);
                this.zzk = zzetVar2.zzs();
                this.zzl = zzetVar2.zzx();
                this.zzm = zzetVar2.zzx();
                this.zzm = ((zzetVar2.zzs() << 24) | this.zzm) * 1000;
                zzetVar2.zzk(3);
                this.zzg = 4;
            } else {
                if (i != 4) {
                    throw new java.lang.IllegalStateException();
                }
                long j = this.zzh ? this.zzi + this.zzm : this.zze.zzc() == -9223372036854775807L ? 0L : this.zzm;
                int i5 = this.zzk;
                if (i5 != 8) {
                    i2 = i5;
                } else if (this.zzo != null) {
                    zzi();
                    zzf = this.zzo.zzf(zzh(zzafzVar), j);
                    z = true;
                    if (!this.zzh && zzf) {
                        this.zzh = true;
                        this.zzi = this.zze.zzc() != -9223372036854775807L ? -this.zzm : 0L;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (!z) {
                        return 0;
                    }
                }
                if (i2 == 9) {
                    if (this.zzp != null) {
                        zzi();
                        zzf = this.zzp.zzf(zzh(zzafzVar), j);
                        z = true;
                    }
                    zzafzVar.zzf(this.zzl);
                    zzf = false;
                    z = false;
                } else {
                    if (i2 == 18 && !this.zzn) {
                        com.google.android.gms.internal.ads.zzaik zzaikVar = this.zze;
                        zzf = zzaikVar.zzf(zzh(zzafzVar), j);
                        long zzc = zzaikVar.zzc();
                        if (zzc != -9223372036854775807L) {
                            this.zzf.zzw(new com.google.android.gms.internal.ads.zzagu(zzaikVar.zze(), zzaikVar.zzd(), zzc));
                            this.zzn = true;
                        }
                        z = true;
                    }
                    zzafzVar.zzf(this.zzl);
                    zzf = false;
                    z = false;
                }
                if (!this.zzh) {
                    this.zzh = true;
                    this.zzi = this.zze.zzc() != -9223372036854775807L ? -this.zzm : 0L;
                }
                this.zzj = 4;
                this.zzg = 2;
                if (!z) {
                }
            }
        }
    }
}

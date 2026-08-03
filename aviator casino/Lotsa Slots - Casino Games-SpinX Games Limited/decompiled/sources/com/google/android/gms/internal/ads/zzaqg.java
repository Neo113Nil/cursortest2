package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaqg implements com.google.android.gms.internal.ads.zzapt {
    private java.lang.String zzf;
    private com.google.android.gms.internal.ads.zzahk zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final java.lang.String zza = "video/mp2t";
    private int zze = 0;
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet(new byte[15], 2);
    private final com.google.android.gms.internal.ads.zzes zzc = new com.google.android.gms.internal.ads.zzes();
    private final com.google.android.gms.internal.ads.zzet zzd = new com.google.android.gms.internal.ads.zzet();
    private final com.google.android.gms.internal.ads.zzaqh zzq = new com.google.android.gms.internal.ads.zzaqh();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzaqg(java.lang.String str) {
    }

    private static final void zzf(com.google.android.gms.internal.ads.zzet zzetVar, com.google.android.gms.internal.ads.zzet zzetVar2, boolean z) {
        int zzg = zzetVar.zzg();
        int min = java.lang.Math.min(zzetVar.zzd(), zzetVar2.zzd());
        zzetVar.zzm(zzetVar2.zzi(), zzetVar2.zzg(), min);
        zzetVar2.zzk(min);
        if (z) {
            zzetVar.zzh(zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzf = zzarhVar.zzc();
        this.zzg = zzagbVar.zzu(zzarhVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        this.zzl = i;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.zzj) {
                this.zzi = d;
            } else {
                this.zzh = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzat {
        int i;
        this.zzg.getClass();
        while (zzetVar.zzd() > 0) {
            int i2 = this.zze;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.zzl;
                if ((i4 & 2) != 0) {
                    if ((i4 & 4) == 0) {
                        while (zzetVar.zzd() > 0) {
                            int i5 = this.zzm << 8;
                            this.zzm = i5;
                            int zzs = i5 | zzetVar.zzs();
                            this.zzm = zzs;
                            if ((zzs & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) == 12583333) {
                                zzetVar.zzh(zzetVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzetVar.zzh(zzetVar.zze());
            } else if (i2 != 1) {
                com.google.android.gms.internal.ads.zzaqh zzaqhVar = this.zzq;
                int i6 = zzaqhVar.zza;
                if (i6 == 1 || i6 == 17) {
                    zzf(zzetVar, this.zzd, true);
                }
                int min = java.lang.Math.min(zzetVar.zzd(), zzaqhVar.zzc - this.zzo);
                this.zzg.zzc(zzetVar, min);
                int i7 = this.zzo + min;
                this.zzo = i7;
                if (i7 == zzaqhVar.zzc) {
                    int i8 = zzaqhVar.zza;
                    if (i8 == 1) {
                        byte[] zzi = this.zzd.zzi();
                        com.google.android.gms.internal.ads.zzaqi zzb = com.google.android.gms.internal.ads.zzaqj.zzb(new com.google.android.gms.internal.ads.zzes(zzi, zzi.length));
                        this.zzr = zzb.zzb;
                        this.zzs = zzb.zzc;
                        long j = this.zzu;
                        long j2 = zzaqhVar.zzb;
                        if (j != j2) {
                            this.zzu = j2;
                            int i9 = zzb.zza;
                            java.lang.String str = "mhm1";
                            if (i9 != -1) {
                                java.lang.String format = java.lang.String.format(".%02X", java.lang.Integer.valueOf(i9));
                                java.lang.String.valueOf(format);
                                str = "mhm1".concat(java.lang.String.valueOf(format));
                            }
                            byte[] bArr = zzb.zzd;
                            com.google.android.gms.internal.ads.zzgwm zzgwmVar = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgwmVar = com.google.android.gms.internal.ads.zzgwm.zzk(com.google.android.gms.internal.ads.zzfl.zzb, bArr);
                            }
                            com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                            zztVar.zza(this.zzf);
                            zztVar.zzn(this.zza);
                            zztVar.zzo("audio/mhm1");
                            zztVar.zzH(this.zzr);
                            zztVar.zzk(str);
                            zztVar.zzr(zzgwmVar);
                            this.zzg.zzA(zztVar.zzO());
                        }
                        this.zzv = true;
                    } else if (i8 == 17) {
                        byte[] zzi2 = this.zzd.zzi();
                        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(zzi2, zzi2.length);
                        if (zzesVar.zzi()) {
                            zzesVar.zzh(2);
                            i3 = zzesVar.zzj(13);
                        }
                        this.zzt = i3;
                    } else if (i8 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i10 = this.zzs - this.zzt;
                        double d = this.zzr;
                        long round = java.lang.Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (i10 * 1000000.0d) / d;
                        }
                        this.zzg.zze(round, i, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzb;
                zzf(zzetVar, zzetVar2, false);
                if (zzetVar2.zzd() == 0) {
                    com.google.android.gms.internal.ads.zzes zzesVar2 = this.zzc;
                    int zze = zzetVar2.zze();
                    zzesVar2.zzb(zzetVar2.zzi(), zze);
                    com.google.android.gms.internal.ads.zzaqh zzaqhVar2 = this.zzq;
                    if (com.google.android.gms.internal.ads.zzaqj.zza(zzesVar2, zzaqhVar2)) {
                        this.zzo = 0;
                        this.zzp += zzaqhVar2.zzc + zze;
                        zzetVar2.zzh(0);
                        this.zzg.zzc(zzetVar2, zzetVar2.zze());
                        zzetVar2.zza(2);
                        this.zzd.zza(zzaqhVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzetVar2.zze() < 15) {
                        zzetVar2.zzf(zzetVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
    }
}

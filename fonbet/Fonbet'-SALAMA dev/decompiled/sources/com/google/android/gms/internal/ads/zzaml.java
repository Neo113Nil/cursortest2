package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaml implements zzaly {
    private String zzf;
    private zzaeb zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzed zzb = new zzed(new byte[15], 2);
    private final zzec zzc = new zzec();
    private final zzed zzd = new zzed();
    private final zzamm zzq = new zzamm();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzaml(String str) {
    }

    private static final void zzf(zzed zzedVar, zzed zzedVar2, boolean z4) {
        int zzd = zzedVar.zzd();
        int min = Math.min(zzedVar.zzb(), zzedVar2.zzb());
        zzedVar.zzH(zzedVar2.zzN(), zzedVar2.zzd(), min);
        zzedVar2.zzM(min);
        if (z4) {
            zzedVar.zzL(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) {
        int i7;
        zzcv.zzb(this.zzg);
        while (zzedVar.zzb() > 0) {
            int i8 = this.zze;
            int i9 = 0;
            if (i8 == 0) {
                int i10 = this.zzl;
                if ((i10 & 2) != 0) {
                    if ((i10 & 4) == 0) {
                        while (zzedVar.zzb() > 0) {
                            int i11 = this.zzm << 8;
                            this.zzm = i11;
                            int zzm = i11 | zzedVar.zzm();
                            this.zzm = zzm;
                            if ((zzm & 16777215) == 12583333) {
                                zzedVar.zzL(zzedVar.zzd() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzedVar.zzL(zzedVar.zze());
            } else if (i8 != 1) {
                int i12 = this.zzq.zza;
                if (i12 == 1 || i12 == 17) {
                    zzf(zzedVar, this.zzd, true);
                }
                int min = Math.min(zzedVar.zzb(), this.zzq.zzc - this.zzo);
                this.zzg.zzr(zzedVar, min);
                int i13 = this.zzo + min;
                this.zzo = i13;
                zzamm zzammVar = this.zzq;
                if (i13 == zzammVar.zzc) {
                    int i14 = zzammVar.zza;
                    if (i14 == 1) {
                        byte[] zzN = this.zzd.zzN();
                        zzamn zza = zzamp.zza(new zzec(zzN, zzN.length));
                        this.zzr = zza.zzb;
                        this.zzs = zza.zzc;
                        long j = this.zzu;
                        long j3 = this.zzq.zzb;
                        if (j != j3) {
                            this.zzu = j3;
                            int i15 = zza.zza;
                            String concat = i15 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i15))) : "mhm1";
                            byte[] bArr = zza.zzd;
                            zzfwh zzfwhVar = null;
                            if (bArr != null && bArr.length > 0) {
                                zzfwhVar = zzfwh.zzp(zzen.zzc, bArr);
                            }
                            zzx zzxVar = new zzx();
                            zzxVar.zzO(this.zzf);
                            zzxVar.zzE(this.zza);
                            zzxVar.zzad("audio/mhm1");
                            zzxVar.zzae(this.zzr);
                            zzxVar.zzC(concat);
                            zzxVar.zzP(zzfwhVar);
                            this.zzg.zzm(zzxVar.zzaj());
                        }
                        this.zzv = true;
                    } else if (i14 == 17) {
                        byte[] zzN2 = this.zzd.zzN();
                        zzec zzecVar = new zzec(zzN2, zzN2.length);
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(2);
                            i9 = zzecVar.zzd(13);
                        }
                        this.zzt = i9;
                    } else if (i14 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        int i16 = this.zzs - this.zzt;
                        double d7 = this.zzr;
                        long round = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (i16 * 1000000.0d) / d7;
                        }
                        this.zzg.zzt(round, i7, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzf(zzedVar, this.zzb, false);
                zzed zzedVar2 = this.zzb;
                if (zzedVar2.zzb() == 0) {
                    zzec zzecVar2 = this.zzc;
                    int zze = zzedVar2.zze();
                    zzecVar2.zzk(zzedVar2.zzN(), zze);
                    if (zzamp.zzb(this.zzc, this.zzq)) {
                        this.zzo = 0;
                        this.zzp = this.zzq.zzc + zze + this.zzp;
                        this.zzb.zzL(0);
                        zzaeb zzaebVar = this.zzg;
                        zzed zzedVar3 = this.zzb;
                        zzaebVar.zzr(zzedVar3, zzedVar3.zze());
                        this.zzb.zzI(2);
                        this.zzd.zzI(this.zzq.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else {
                        zzed zzedVar4 = this.zzb;
                        if (zzedVar4.zze() < 15) {
                            zzedVar4.zzK(zzedVar4.zze() + 1);
                        }
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzf = zzanmVar.zzb();
        this.zzg = zzacyVar.zzw(zzanmVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        this.zzl = i7;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j != -9223372036854775807L) {
            double d7 = j;
            if (this.zzj) {
                this.zzi = d7;
            } else {
                this.zzh = d7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zzI(2);
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
}

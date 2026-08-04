package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
        int iZzd = zzedVar.zzd();
        int iMin = Math.min(zzedVar.zzb(), zzedVar2.zzb());
        zzedVar.zzH(zzedVar2.zzN(), zzedVar2.zzd(), iMin);
        zzedVar2.zzM(iMin);
        if (z4) {
            zzedVar.zzL(iZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) throws zzaz {
        int i7;
        zzcv.zzb(this.zzg);
        while (zzedVar.zzb() > 0) {
            int i8 = this.zze;
            int iZzd = 0;
            if (i8 == 0) {
                int i9 = this.zzl;
                if ((i9 & 2) != 0) {
                    if ((i9 & 4) == 0) {
                        while (zzedVar.zzb() > 0) {
                            int i10 = this.zzm << 8;
                            this.zzm = i10;
                            int iZzm = i10 | zzedVar.zzm();
                            this.zzm = iZzm;
                            if ((iZzm & 16777215) == 12583333) {
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
                int i11 = this.zzq.zza;
                if (i11 == 1 || i11 == 17) {
                    zzf(zzedVar, this.zzd, true);
                }
                int iMin = Math.min(zzedVar.zzb(), this.zzq.zzc - this.zzo);
                this.zzg.zzr(zzedVar, iMin);
                int i12 = this.zzo + iMin;
                this.zzo = i12;
                zzamm zzammVar = this.zzq;
                if (i12 == zzammVar.zzc) {
                    int i13 = zzammVar.zza;
                    if (i13 == 1) {
                        byte[] bArrZzN = this.zzd.zzN();
                        zzamn zzamnVarZza = zzamp.zza(new zzec(bArrZzN, bArrZzN.length));
                        this.zzr = zzamnVarZza.zzb;
                        this.zzs = zzamnVarZza.zzc;
                        long j = this.zzu;
                        long j3 = this.zzq.zzb;
                        if (j != j3) {
                            this.zzu = j3;
                            int i14 = zzamnVarZza.zza;
                            String strConcat = i14 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i14))) : "mhm1";
                            byte[] bArr = zzamnVarZza.zzd;
                            zzfwh zzfwhVarZzp = null;
                            if (bArr != null && bArr.length > 0) {
                                zzfwhVarZzp = zzfwh.zzp(zzen.zzc, bArr);
                            }
                            zzx zzxVar = new zzx();
                            zzxVar.zzO(this.zzf);
                            zzxVar.zzE(this.zza);
                            zzxVar.zzad("audio/mhm1");
                            zzxVar.zzae(this.zzr);
                            zzxVar.zzC(strConcat);
                            zzxVar.zzP(zzfwhVarZzp);
                            this.zzg.zzm(zzxVar.zzaj());
                        }
                        this.zzv = true;
                    } else if (i13 == 17) {
                        byte[] bArrZzN2 = this.zzd.zzN();
                        zzec zzecVar = new zzec(bArrZzN2, bArrZzN2.length);
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(2);
                            iZzd = zzecVar.zzd(13);
                        }
                        this.zzt = iZzd;
                    } else if (i13 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        int i15 = this.zzs - this.zzt;
                        double d7 = this.zzr;
                        long jRound = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (((double) i15) * 1000000.0d) / d7;
                        }
                        this.zzg.zzt(jRound, i7, this.zzp, 0, null);
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
                    int iZze = zzedVar2.zze();
                    zzecVar2.zzk(zzedVar2.zzN(), iZze);
                    if (zzamp.zzb(this.zzc, this.zzq)) {
                        this.zzo = 0;
                        this.zzp = this.zzq.zzc + iZze + this.zzp;
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

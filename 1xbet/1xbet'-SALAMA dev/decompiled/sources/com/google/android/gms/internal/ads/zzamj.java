package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zzamj implements zzaly {
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzed zzd;
    private final zzec zze;
    private zzaeb zzf;
    private String zzg;
    private zzz zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private String zzw;

    public zzamj(String str, int i7, String str2) {
        this.zza = str;
        this.zzb = i7;
        zzed zzedVar = new zzed(1024);
        this.zzd = zzedVar;
        byte[] bArrZzN = zzedVar.zzN();
        this.zze = new zzec(bArrZzN, bArrZzN.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzf(zzec zzecVar) throws zzaz {
        int iZza = zzecVar.zza();
        zzabp zzabpVarZzb = zzabr.zzb(zzecVar, true);
        this.zzw = zzabpVarZzb.zzc;
        this.zzt = zzabpVarZzb.zza;
        this.zzv = zzabpVarZzb.zzb;
        return iZza - zzecVar.zza();
    }

    private static long zzg(zzec zzecVar) {
        return zzecVar.zzd((zzecVar.zzd(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) throws zzaz {
        int i7;
        int i8;
        int iZzd;
        boolean zZzp;
        zzcv.zzb(this.zzf);
        while (zzedVar.zzb() > 0) {
            int i9 = this.zzi;
            if (i9 != 0) {
                if (i9 == 1) {
                    int iZzm = zzedVar.zzm();
                    if ((iZzm & 224) == 224) {
                        this.zzl = iZzm;
                        this.zzi = 2;
                    } else if (iZzm != 86) {
                        this.zzi = 0;
                    }
                } else if (i9 != 2) {
                    int iMin = Math.min(zzedVar.zzb(), this.zzk - this.zzj);
                    zzedVar.zzH(this.zze.zza, this.zzj, iMin);
                    int i10 = this.zzj + iMin;
                    this.zzj = i10;
                    if (i10 == this.zzk) {
                        this.zze.zzl(0);
                        zzec zzecVar = this.zze;
                        if (zzecVar.zzp()) {
                            if (this.zzn) {
                            }
                            this.zzi = 0;
                        } else {
                            this.zzn = true;
                            int iZzd2 = zzecVar.zzd(1);
                            if (iZzd2 == 1) {
                                iZzd = zzecVar.zzd(1);
                                i8 = 1;
                            } else {
                                i8 = iZzd2;
                                iZzd = 0;
                            }
                            this.zzo = iZzd;
                            if (iZzd != 0) {
                                throw zzaz.zza(null, null);
                            }
                            if (i8 == 1) {
                                zzg(zzecVar);
                                i8 = 1;
                            }
                            if (!zzecVar.zzp()) {
                                throw zzaz.zza(null, null);
                            }
                            this.zzp = zzecVar.zzd(6);
                            int iZzd3 = zzecVar.zzd(4);
                            int iZzd4 = zzecVar.zzd(3);
                            if (iZzd3 != 0 || iZzd4 != 0) {
                                throw zzaz.zza(null, null);
                            }
                            if (i8 == 0) {
                                int iZzc = zzecVar.zzc();
                                int iZzf = zzf(zzecVar);
                                zzecVar.zzl(iZzc);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzecVar.zzh(bArr, 0, iZzf);
                                zzx zzxVar = new zzx();
                                zzxVar.zzO(this.zzg);
                                zzxVar.zzE(this.zzc);
                                zzxVar.zzad("audio/mp4a-latm");
                                zzxVar.zzC(this.zzw);
                                zzxVar.zzB(this.zzv);
                                zzxVar.zzae(this.zzt);
                                zzxVar.zzP(Collections.singletonList(bArr));
                                zzxVar.zzS(this.zza);
                                zzxVar.zzab(this.zzb);
                                zzz zzzVarZzaj = zzxVar.zzaj();
                                if (!zzzVarZzaj.equals(this.zzh)) {
                                    this.zzh = zzzVarZzaj;
                                    this.zzu = 1024000000 / ((long) zzzVarZzaj.zzF);
                                    this.zzf.zzm(zzzVarZzaj);
                                }
                            } else {
                                zzecVar.zzn(((int) zzg(zzecVar)) - zzf(zzecVar));
                            }
                            int iZzd5 = zzecVar.zzd(3);
                            this.zzq = iZzd5;
                            if (iZzd5 == 0) {
                                zzecVar.zzn(8);
                            } else if (iZzd5 == 1) {
                                zzecVar.zzn(9);
                            } else if (iZzd5 == 3 || iZzd5 == 4 || iZzd5 == 5) {
                                zzecVar.zzn(6);
                            } else {
                                if (iZzd5 != 6 && iZzd5 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzecVar.zzn(1);
                            }
                            boolean zZzp2 = zzecVar.zzp();
                            this.zzr = zZzp2;
                            this.zzs = 0L;
                            if (zZzp2) {
                                if (i8 != 1) {
                                    do {
                                        zZzp = zzecVar.zzp();
                                        this.zzs = (this.zzs << 8) + ((long) zzecVar.zzd(8));
                                    } while (zZzp);
                                } else {
                                    this.zzs = zzg(zzecVar);
                                }
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzaz.zza(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzaz.zza(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzaz.zza(null, null);
                        }
                        int i11 = 0;
                        while (true) {
                            int iZzd6 = zzecVar.zzd(8);
                            i7 = i11 + iZzd6;
                            if (iZzd6 != 255) {
                                break;
                            } else {
                                i11 = i7;
                            }
                        }
                        int iZzc2 = zzecVar.zzc();
                        if ((iZzc2 & 7) == 0) {
                            this.zzd.zzL(iZzc2 >> 3);
                        } else {
                            zzecVar.zzh(this.zzd.zzN(), 0, i7 * 8);
                            this.zzd.zzL(0);
                        }
                        this.zzf.zzr(this.zzd, i7);
                        zzcv.zzf(this.zzm != -9223372036854775807L);
                        this.zzf.zzt(this.zzm, 1, i7, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzecVar.zzn((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzm2 = ((this.zzl & (-225)) << 8) | zzedVar.zzm();
                    this.zzk = iZzm2;
                    zzed zzedVar2 = this.zzd;
                    if (iZzm2 > zzedVar2.zzN().length) {
                        zzedVar2.zzI(iZzm2);
                        zzec zzecVar2 = this.zze;
                        byte[] bArrZzN = this.zzd.zzN();
                        zzecVar2.zzk(bArrZzN, bArrZzN.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzedVar.zzm() == 86) {
                this.zzi = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzf = zzacyVar.zzw(zzanmVar.zza(), 1);
        this.zzg = zzanmVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zzalw implements zzaly {
    private final zzed zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzaeb zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzalw(String str, int i7, int i8, String str2) {
        this.zza = new zzed(new byte[i8]);
        this.zzc = str;
        this.zzd = i7;
    }

    private final void zzf(zzacs zzacsVar) {
        int i7;
        int i8 = zzacsVar.zzb;
        if (i8 == -2147483647 || (i7 = zzacsVar.zzc) == -1) {
            return;
        }
        zzz zzzVar = this.zzl;
        if (zzzVar != null && i7 == zzzVar.zzE && i8 == zzzVar.zzF) {
            String str = zzacsVar.zza;
            String str2 = zzzVar.zzo;
            int i9 = zzen.zza;
            if (Objects.equals(str, str2)) {
                return;
            }
        }
        zzz zzzVar2 = this.zzl;
        zzx zzxVar = zzzVar2 == null ? new zzx() : zzzVar2.zzb();
        zzxVar.zzO(this.zzf);
        zzxVar.zzE(this.zze);
        zzxVar.zzad(zzacsVar.zza);
        zzxVar.zzB(zzacsVar.zzc);
        zzxVar.zzae(zzacsVar.zzb);
        zzxVar.zzS(this.zzc);
        zzxVar.zzab(this.zzd);
        zzz zzzVarZzaj = zzxVar.zzaj();
        this.zzl = zzzVarZzaj;
        this.zzg.zzm(zzzVarZzaj);
    }

    private final boolean zzg(zzed zzedVar, byte[] bArr, int i7) {
        int iMin = Math.min(zzedVar.zzb(), i7 - this.zzi);
        zzedVar.zzH(bArr, this.zzi, iMin);
        int i8 = this.zzi + iMin;
        this.zzi = i8;
        return i8 == i7;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01df  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e6  */
    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) throws zzaz {
        int i7;
        int i8;
        byte b7;
        boolean z4;
        int i9;
        int i10;
        byte b8;
        int i11;
        byte b9;
        int i12;
        int i13;
        zzcv.zzb(this.zzg);
        while (zzedVar.zzb() > 0) {
            int i14 = this.zzh;
            if (i14 == 0) {
                while (zzedVar.zzb() > 0) {
                    int i15 = this.zzj << 8;
                    this.zzj = i15;
                    int iZzm = i15 | zzedVar.zzm();
                    this.zzj = iZzm;
                    if (iZzm == 2147385345 || iZzm == -25230976 || iZzm == 536864768 || iZzm == -14745368) {
                        i13 = 1;
                    } else if (iZzm == 1683496997 || iZzm == 622876772) {
                        i13 = 2;
                    } else if (iZzm == 1078008818 || iZzm == -233094848) {
                        i13 = 3;
                    } else {
                        i13 = (iZzm == 1908687592 || iZzm == -398277519) ? 4 : 0;
                    }
                    this.zzn = i13;
                    if (i13 != 0) {
                        byte[] bArrZzN = this.zza.zzN();
                        int i16 = this.zzj;
                        bArrZzN[0] = (byte) ((i16 >> 24) & 255);
                        bArrZzN[1] = (byte) ((i16 >> 16) & 255);
                        bArrZzN[2] = (byte) ((i16 >> 8) & 255);
                        bArrZzN[3] = (byte) (i16 & 255);
                        this.zzi = 4;
                        this.zzj = 0;
                        if (i13 != 3 && i13 != 4) {
                            if (i13 != 1) {
                                this.zzh = 2;
                                break;
                            } else {
                                this.zzh = 1;
                                break;
                            }
                        }
                        this.zzh = 4;
                        break;
                    }
                }
            } else if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            if (i14 != 5) {
                                int iMin = Math.min(zzedVar.zzb(), this.zzm - this.zzi);
                                this.zzg.zzr(zzedVar, iMin);
                                int i17 = this.zzi + iMin;
                                this.zzi = i17;
                                if (i17 == this.zzm) {
                                    zzcv.zzf(this.zzq != -9223372036854775807L);
                                    this.zzg.zzt(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                                    this.zzq += this.zzk;
                                    this.zzh = 0;
                                }
                            } else if (zzg(zzedVar, this.zza.zzN(), this.zzp)) {
                                zzacs zzacsVarZze = zzacu.zze(this.zza.zzN(), this.zzb);
                                if (this.zzn == 3) {
                                    zzf(zzacsVarZze);
                                }
                                this.zzm = zzacsVarZze.zzd;
                                long j = zzacsVarZze.zze;
                                this.zzk = j != -9223372036854775807L ? j : 0L;
                                this.zza.zzL(0);
                                this.zzg.zzr(this.zza, this.zzp);
                                this.zzh = 6;
                            }
                        } else if (zzg(zzedVar, this.zza.zzN(), 6)) {
                            int iZzb = zzacu.zzb(this.zza.zzN());
                            this.zzp = iZzb;
                            int i18 = this.zzi;
                            if (i18 > iZzb) {
                                int i19 = i18 - iZzb;
                                this.zzi = i18 - i19;
                                zzedVar.zzL(zzedVar.zzd() - i19);
                            }
                            this.zzh = 5;
                        }
                    } else if (zzg(zzedVar, this.zza.zzN(), this.zzo)) {
                        zzacs zzacsVarZzd = zzacu.zzd(this.zza.zzN());
                        zzf(zzacsVarZzd);
                        this.zzm = zzacsVarZzd.zzd;
                        long j3 = zzacsVarZzd.zze;
                        this.zzk = j3 != -9223372036854775807L ? j3 : 0L;
                        this.zza.zzL(0);
                        this.zzg.zzr(this.zza, this.zzo);
                        this.zzh = 6;
                    }
                } else if (zzg(zzedVar, this.zza.zzN(), 7)) {
                    this.zzo = zzacu.zza(this.zza.zzN());
                    this.zzh = 3;
                }
            } else if (zzg(zzedVar, this.zza.zzN(), 18)) {
                byte[] bArrZzN2 = this.zza.zzN();
                if (this.zzl == null) {
                    zzz zzzVarZzc = zzacu.zzc(bArrZzN2, this.zzf, this.zzc, this.zzd, this.zze, null);
                    this.zzl = zzzVarZzc;
                    this.zzg.zzm(zzzVarZzc);
                }
                byte b10 = bArrZzN2[0];
                if (b10 != -2) {
                    if (b10 == -1) {
                        i12 = ((bArrZzN2[7] & 3) << 12) | ((bArrZzN2[6] & 255) << 4) | ((bArrZzN2[9] & 60) >> 2);
                    } else if (b10 != 31) {
                        i7 = (bArrZzN2[5] & 3) << 12;
                        i8 = (bArrZzN2[6] & 255) << 4;
                        b7 = bArrZzN2[7];
                    } else {
                        i12 = ((bArrZzN2[8] & 60) >> 2) | ((3 & bArrZzN2[6]) << 12) | ((bArrZzN2[7] & 255) << 4);
                    }
                    i9 = i12 + 1;
                    z4 = true;
                    if (z4) {
                        i9 = (i9 * 16) / 14;
                    }
                    this.zzm = i9;
                    if (b10 != -2) {
                        if (b10 != -1) {
                            i10 = (bArrZzN2[4] & 7) << 4;
                            b9 = bArrZzN2[7];
                        } else if (b10 != 31) {
                            i10 = (bArrZzN2[4] & 1) << 6;
                            b8 = bArrZzN2[5];
                        } else {
                            i10 = (bArrZzN2[5] & 7) << 4;
                            b9 = bArrZzN2[6];
                        }
                        i11 = b9 & 60;
                        this.zzk = zzfzk.zzb(zzen.zzt((((i11 >> 2) | i10) + 1) * 32, this.zzl.zzF));
                        this.zza.zzL(0);
                        this.zzg.zzr(this.zza, 18);
                        this.zzh = 6;
                    } else {
                        i10 = (bArrZzN2[5] & 1) << 6;
                        b8 = bArrZzN2[4];
                    }
                    i11 = b8 & 252;
                    this.zzk = zzfzk.zzb(zzen.zzt((((i11 >> 2) | i10) + 1) * 32, this.zzl.zzF));
                    this.zza.zzL(0);
                    this.zzg.zzr(this.zza, 18);
                    this.zzh = 6;
                } else {
                    i7 = (bArrZzN2[4] & 3) << 12;
                    i8 = (bArrZzN2[7] & 255) << 4;
                    b7 = bArrZzN2[6];
                }
                i9 = (i7 | i8 | ((b7 & 240) >> 4)) + 1;
                z4 = false;
                if (z4) {
                    i9 = (i9 * 16) / 14;
                }
                this.zzm = i9;
                if (b10 != -2) {
                    if (b10 != -1) {
                        i10 = (bArrZzN2[4] & 7) << 4;
                        b9 = bArrZzN2[7];
                    } else if (b10 != 31) {
                        i10 = (bArrZzN2[4] & 1) << 6;
                        b8 = bArrZzN2[5];
                    } else {
                        i10 = (bArrZzN2[5] & 7) << 4;
                        b9 = bArrZzN2[6];
                    }
                    i11 = b9 & 60;
                    this.zzk = zzfzk.zzb(zzen.zzt((((i11 >> 2) | i10) + 1) * 32, this.zzl.zzF));
                    this.zza.zzL(0);
                    this.zzg.zzr(this.zza, 18);
                    this.zzh = 6;
                } else {
                    i10 = (bArrZzN2[5] & 1) << 6;
                    b8 = bArrZzN2[4];
                }
                i11 = b8 & 252;
                this.zzk = zzfzk.zzb(zzen.zzt((((i11 >> 2) | i10) + 1) * 32, this.zzl.zzF));
                this.zza.zzL(0);
                this.zzg.zzr(this.zza, 18);
                this.zzh = 6;
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
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }
}

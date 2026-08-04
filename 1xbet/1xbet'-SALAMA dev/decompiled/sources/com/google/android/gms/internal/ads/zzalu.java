package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zzalu implements zzaly {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzaeb zzi;
    private zzaeb zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzaeb zzw;
    private long zzx;
    private final zzec zzc = new zzec(new byte[7], 7);
    private final zzed zzd = new zzed(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzalu(boolean z4, String str, int i7, String str2) {
        this.zzb = z4;
        this.zze = str;
        this.zzf = i7;
        this.zzg = str2;
        zzh();
    }

    public static boolean zzf(int i7) {
        return (i7 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzh();
    }

    private final void zzh() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzi() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private final void zzj(zzaeb zzaebVar, long j, int i7, int i8) {
        this.zzk = 4;
        this.zzl = i7;
        this.zzw = zzaebVar;
        this.zzx = j;
        this.zzu = i8;
    }

    private final boolean zzk(zzed zzedVar, byte[] bArr, int i7) {
        int iMin = Math.min(zzedVar.zzb(), i7 - this.zzl);
        zzedVar.zzH(bArr, this.zzl, iMin);
        int i8 = this.zzl + iMin;
        this.zzl = i8;
        return i8 == i7;
    }

    private static final boolean zzl(byte b7, byte b8) {
        return zzf((b8 & 255) | 65280);
    }

    private static final boolean zzm(zzed zzedVar, byte[] bArr, int i7) {
        if (zzedVar.zzb() < i7) {
            return false;
        }
        zzedVar.zzH(bArr, 0, i7);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0296  */
    /* JADX WARN: Code duplicated, block: B:111:0x029a  */
    /* JADX WARN: Code duplicated, block: B:113:0x029e  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:146:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0221  */
    /* JADX WARN: Code duplicated, block: B:77:0x0231  */
    /* JADX WARN: Code duplicated, block: B:79:0x023c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0240  */
    /* JADX WARN: Code duplicated, block: B:83:0x0243  */
    /* JADX WARN: Code duplicated, block: B:88:0x0252  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zza(zzed zzedVar) {
        int i7;
        int i8;
        int i9;
        char c3;
        int i10;
        int i11;
        int iZzd;
        byte[] bArrZzN;
        int iZze;
        int i12;
        byte b7;
        int i13;
        int i14;
        int i15;
        byte b8;
        int i16 = 0;
        int i17 = 2;
        this.zzi.getClass();
        int i18 = zzen.zza;
        while (zzedVar.zzb() > 0) {
            int i19 = this.zzk;
            int i20 = 13;
            char c4 = 7;
            if (i19 == 0) {
                byte[] bArrZzN2 = zzedVar.zzN();
                int iZzd2 = zzedVar.zzd();
                int iZze2 = zzedVar.zze();
                while (true) {
                    if (iZzd2 < iZze2) {
                        int i21 = iZzd2 + 1;
                        byte b9 = bArrZzN2[iZzd2];
                        int i22 = b9 & 255;
                        if (this.zzm == 512 && zzl((byte) -1, (byte) i22)) {
                            if (!this.zzo) {
                                int i23 = iZzd2 - 1;
                                zzedVar.zzL(iZzd2);
                                if (zzm(zzedVar, this.zzc.zza, 1)) {
                                    this.zzc.zzl(4);
                                    int iZzd3 = this.zzc.zzd(1);
                                    int i24 = this.zzp;
                                    if (i24 != -1 && iZzd3 != i24) {
                                        c4 = 7;
                                    } else if (this.zzq == -1) {
                                        if (zzm(zzedVar, this.zzc.zza, 4)) {
                                            this.zzc.zzl(14);
                                            iZzd = this.zzc.zzd(i20);
                                            c4 = 7;
                                            if (iZzd >= 7) {
                                                bArrZzN = zzedVar.zzN();
                                                iZze = zzedVar.zze();
                                                i12 = i23 + iZzd;
                                                if (i12 >= iZze) {
                                                    b7 = bArrZzN[i12];
                                                    if (b7 == -1) {
                                                        i15 = i12 + 1;
                                                        if (i15 != iZze) {
                                                            b8 = bArrZzN[i15];
                                                            if (zzl((byte) -1, b8) || ((b8 & 8) >> 3) != iZzd3) {
                                                            }
                                                        }
                                                    } else if (b7 == 73 || ((i13 = i12 + 1) != iZze && (bArrZzN[i13] != 68 || ((i14 = i12 + 2) != iZze && bArrZzN[i14] != 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else if (zzm(zzedVar, this.zzc.zza, 1)) {
                                        this.zzc.zzl(i17);
                                        if (this.zzc.zzd(4) == this.zzq) {
                                            zzedVar.zzL(iZzd2 + 1);
                                            if (zzm(zzedVar, this.zzc.zza, 4)) {
                                                this.zzc.zzl(14);
                                                iZzd = this.zzc.zzd(i20);
                                                c4 = 7;
                                                if (iZzd >= 7) {
                                                    bArrZzN = zzedVar.zzN();
                                                    iZze = zzedVar.zze();
                                                    i12 = i23 + iZzd;
                                                    if (i12 >= iZze) {
                                                        b7 = bArrZzN[i12];
                                                        if (b7 == -1) {
                                                            i15 = i12 + 1;
                                                            if (i15 != iZze) {
                                                                b8 = bArrZzN[i15];
                                                                if (zzl((byte) -1, b8)) {
                                                                }
                                                            }
                                                        } else if (b7 == 73) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            c4 = 7;
                                        }
                                    }
                                } else {
                                    c4 = c4;
                                }
                                i7 = this.zzm;
                                i8 = i7 | i22;
                                if (i8 != 329) {
                                    i9 = 2;
                                    c3 = 3;
                                    i10 = 0;
                                    i11 = 768;
                                } else if (i8 != 511) {
                                    i9 = 2;
                                    c3 = 3;
                                    i10 = 0;
                                    i11 = 512;
                                } else if (i8 != 836) {
                                    i9 = 2;
                                    c3 = 3;
                                    i10 = 0;
                                    i11 = 1024;
                                } else if (i8 != 1075) {
                                    this.zzk = 2;
                                    this.zzl = 3;
                                    this.zzu = 0;
                                    this.zzd.zzL(0);
                                    zzedVar.zzL(i21);
                                    i17 = 2;
                                    i16 = 0;
                                } else if (i7 != 256) {
                                    this.zzm = 256;
                                    i20 = 13;
                                    i16 = 0;
                                    i17 = 2;
                                } else {
                                    i9 = 2;
                                    c3 = 3;
                                    i10 = 0;
                                    i16 = i10;
                                    iZzd2 = i21;
                                    i17 = i9;
                                    i20 = 13;
                                }
                                this.zzm = i11;
                                i16 = i10;
                                iZzd2 = i21;
                                i17 = i9;
                                i20 = 13;
                            }
                            this.zzr = (b9 & 8) >> 3;
                            this.zzn = 1 == ((b9 & 1) ^ 1);
                            if (this.zzo) {
                                zzi();
                            } else {
                                this.zzk = 1;
                                this.zzl = 0;
                            }
                            zzedVar.zzL(i21);
                            i16 = 0;
                            i17 = 2;
                        } else {
                            c4 = c4;
                            i7 = this.zzm;
                            i8 = i7 | i22;
                            if (i8 != 329) {
                                i9 = 2;
                                c3 = 3;
                                i10 = 0;
                                i11 = 768;
                            } else if (i8 != 511) {
                                i9 = 2;
                                c3 = 3;
                                i10 = 0;
                                i11 = 512;
                            } else if (i8 != 836) {
                                i9 = 2;
                                c3 = 3;
                                i10 = 0;
                                i11 = 1024;
                            } else if (i8 != 1075) {
                                this.zzk = 2;
                                this.zzl = 3;
                                this.zzu = 0;
                                this.zzd.zzL(0);
                                zzedVar.zzL(i21);
                                i17 = 2;
                                i16 = 0;
                            } else if (i7 != 256) {
                                this.zzm = 256;
                                i20 = 13;
                                i16 = 0;
                                i17 = 2;
                            } else {
                                i9 = 2;
                                c3 = 3;
                                i10 = 0;
                                i16 = i10;
                                iZzd2 = i21;
                                i17 = i9;
                                i20 = 13;
                            }
                            this.zzm = i11;
                            i16 = i10;
                            iZzd2 = i21;
                            i17 = i9;
                            i20 = 13;
                        }
                    } else {
                        zzedVar.zzL(iZzd2);
                    }
                }
            } else if (i19 != 1) {
                if (i19 != i17) {
                    if (i19 != 3) {
                        int iMin = Math.min(zzedVar.zzb(), this.zzu - this.zzl);
                        this.zzw.zzr(zzedVar, iMin);
                        int i25 = this.zzl + iMin;
                        this.zzl = i25;
                        if (i25 == this.zzu) {
                            zzcv.zzf(this.zzv != -9223372036854775807L ? 1 : i16);
                            this.zzw.zzt(this.zzv, 1, this.zzu, 0, null);
                            this.zzv += this.zzx;
                            zzh();
                        }
                    } else {
                        if (zzk(zzedVar, this.zzc.zza, true != this.zzn ? 5 : 7)) {
                            this.zzc.zzl(i16);
                            if (this.zzs) {
                                this.zzc.zzn(10);
                            } else {
                                int iZzd4 = this.zzc.zzd(i17) + 1;
                                if (iZzd4 != i17) {
                                    zzdq.zzf("AdtsReader", "Detected audio object type: " + iZzd4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzn(5);
                                int iZzd5 = this.zzc.zzd(3);
                                int i26 = this.zzq;
                                byte[] bArr = new byte[i17];
                                bArr[i16] = (byte) (((i26 >> 1) & 7) | 16);
                                bArr[1] = (byte) (((iZzd5 << 3) & 120) | ((i26 << 7) & 128));
                                zzabp zzabpVarZza = zzabr.zza(bArr);
                                zzx zzxVar = new zzx();
                                zzxVar.zzO(this.zzh);
                                zzxVar.zzE(this.zzg);
                                zzxVar.zzad("audio/mp4a-latm");
                                zzxVar.zzC(zzabpVarZza.zzc);
                                zzxVar.zzB(zzabpVarZza.zzb);
                                zzxVar.zzae(zzabpVarZza.zza);
                                zzxVar.zzP(Collections.singletonList(bArr));
                                zzxVar.zzS(this.zze);
                                zzxVar.zzab(this.zzf);
                                zzz zzzVarZzaj = zzxVar.zzaj();
                                this.zzt = 1024000000 / ((long) zzzVarZzaj.zzF);
                                this.zzi.zzm(zzzVarZzaj);
                                this.zzs = true;
                            }
                            this.zzc.zzn(4);
                            int iZzd6 = this.zzc.zzd(13);
                            zzj(this.zzi, this.zzt, 0, this.zzn ? iZzd6 - 9 : iZzd6 - 7);
                        }
                    }
                } else if (zzk(zzedVar, this.zzd.zzN(), 10)) {
                    this.zzj.zzr(this.zzd, 10);
                    this.zzd.zzL(6);
                    zzj(this.zzj, 0L, 10, this.zzd.zzl() + 10);
                }
            } else if (zzedVar.zzb() != 0) {
                zzec zzecVar = this.zzc;
                zzecVar.zza[i16] = zzedVar.zzN()[zzedVar.zzd()];
                zzecVar.zzl(i17);
                int iZzd7 = this.zzc.zzd(4);
                int i27 = this.zzq;
                if (i27 == -1 || iZzd7 == i27) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = iZzd7;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzb(zzacy zzacyVar, zzanm zzanmVar) {
        zzanmVar.zzc();
        this.zzh = zzanmVar.zzb();
        zzaeb zzaebVarZzw = zzacyVar.zzw(zzanmVar.zza(), 1);
        this.zzi = zzaebVarZzw;
        this.zzw = zzaebVarZzw;
        if (!this.zzb) {
            this.zzj = new zzacq();
            return;
        }
        zzanmVar.zzc();
        zzaeb zzaebVarZzw2 = zzacyVar.zzw(zzanmVar.zza(), 5);
        this.zzj = zzaebVarZzw2;
        zzx zzxVar = new zzx();
        zzxVar.zzO(zzanmVar.zzb());
        zzxVar.zzE(this.zzg);
        zzxVar.zzad("application/id3");
        zzaebVarZzw2.zzm(zzxVar.zzaj());
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzd(long j, int i7) {
        this.zzv = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zze() {
        this.zzv = -9223372036854775807L;
        zzg();
    }
}

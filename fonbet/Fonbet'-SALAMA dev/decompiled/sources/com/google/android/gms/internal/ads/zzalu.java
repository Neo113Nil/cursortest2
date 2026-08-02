package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
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
        int min = Math.min(zzedVar.zzb(), i7 - this.zzl);
        zzedVar.zzH(bArr, this.zzl, min);
        int i8 = this.zzl + min;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzed zzedVar) {
        int i7;
        byte b7;
        char c3;
        int i8;
        int i9;
        char c4;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 2;
        this.zzi.getClass();
        int i14 = zzen.zza;
        while (zzedVar.zzb() > 0) {
            int i15 = this.zzk;
            int i16 = 13;
            char c7 = 7;
            if (i15 == 0) {
                byte[] zzN = zzedVar.zzN();
                int zzd = zzedVar.zzd();
                int zze = zzedVar.zze();
                while (true) {
                    if (zzd >= zze) {
                        zzedVar.zzL(zzd);
                        break;
                    }
                    i7 = zzd + 1;
                    b7 = zzN[zzd];
                    int i17 = b7 & 255;
                    if (this.zzm == 512 && zzl((byte) -1, (byte) i17)) {
                        if (this.zzo) {
                            break;
                        }
                        int i18 = zzd - 1;
                        zzedVar.zzL(zzd);
                        if (zzm(zzedVar, this.zzc.zza, 1)) {
                            this.zzc.zzl(4);
                            int zzd2 = this.zzc.zzd(1);
                            int i19 = this.zzp;
                            if (i19 == -1 || zzd2 == i19) {
                                if (this.zzq != -1) {
                                    if (!zzm(zzedVar, this.zzc.zza, 1)) {
                                        break;
                                    }
                                    this.zzc.zzl(i13);
                                    if (this.zzc.zzd(4) == this.zzq) {
                                        zzedVar.zzL(zzd + 1);
                                    }
                                }
                                if (!zzm(zzedVar, this.zzc.zza, 4)) {
                                    break;
                                }
                                this.zzc.zzl(14);
                                int zzd3 = this.zzc.zzd(i16);
                                c3 = 7;
                                if (zzd3 >= 7) {
                                    byte[] zzN2 = zzedVar.zzN();
                                    int zze2 = zzedVar.zze();
                                    int i20 = i18 + zzd3;
                                    if (i20 < zze2) {
                                        byte b8 = zzN2[i20];
                                        if (b8 != -1) {
                                            if (b8 == 73) {
                                                int i21 = i20 + 1;
                                                if (i21 == zze2) {
                                                    break;
                                                }
                                                if (zzN2[i21] == 68) {
                                                    int i22 = i20 + 2;
                                                    if (i22 == zze2) {
                                                        break;
                                                    } else if (zzN2[i22] == 51) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i23 = i20 + 1;
                                            if (i23 == zze2) {
                                                break;
                                            }
                                            byte b9 = zzN2[i23];
                                            if (zzl((byte) -1, b9) && ((b9 & 8) >> 3) == zzd2) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                int i24 = this.zzm;
                                i8 = i24 | i17;
                                if (i8 == 329) {
                                    i9 = 2;
                                    c4 = 3;
                                    i10 = 0;
                                    i11 = 768;
                                } else if (i8 == 511) {
                                    i9 = 2;
                                    c4 = 3;
                                    i10 = 0;
                                    i11 = 512;
                                } else if (i8 == 836) {
                                    i9 = 2;
                                    c4 = 3;
                                    i10 = 0;
                                    i11 = 1024;
                                } else {
                                    if (i8 == 1075) {
                                        this.zzk = 2;
                                        this.zzl = 3;
                                        this.zzu = 0;
                                        this.zzd.zzL(0);
                                        zzedVar.zzL(i7);
                                        i13 = 2;
                                        i12 = 0;
                                        break;
                                    }
                                    if (i24 != 256) {
                                        this.zzm = 256;
                                        c7 = c3;
                                        i16 = 13;
                                        i12 = 0;
                                        i13 = 2;
                                    } else {
                                        i9 = 2;
                                        c4 = 3;
                                        i10 = 0;
                                        i12 = i10;
                                        zzd = i7;
                                        c7 = c3;
                                        i13 = i9;
                                        i16 = 13;
                                    }
                                }
                                this.zzm = i11;
                                i12 = i10;
                                zzd = i7;
                                c7 = c3;
                                i13 = i9;
                                i16 = 13;
                            }
                            c3 = 7;
                            int i242 = this.zzm;
                            i8 = i242 | i17;
                            if (i8 == 329) {
                            }
                            this.zzm = i11;
                            i12 = i10;
                            zzd = i7;
                            c7 = c3;
                            i13 = i9;
                            i16 = 13;
                        }
                    }
                    c3 = c7;
                    int i2422 = this.zzm;
                    i8 = i2422 | i17;
                    if (i8 == 329) {
                    }
                    this.zzm = i11;
                    i12 = i10;
                    zzd = i7;
                    c7 = c3;
                    i13 = i9;
                    i16 = 13;
                }
                this.zzr = (b7 & 8) >> 3;
                this.zzn = 1 == ((b7 & 1) ^ 1);
                if (this.zzo) {
                    zzi();
                } else {
                    this.zzk = 1;
                    this.zzl = 0;
                }
                zzedVar.zzL(i7);
                i12 = 0;
                i13 = 2;
            } else if (i15 != 1) {
                if (i15 != i13) {
                    if (i15 != 3) {
                        int min = Math.min(zzedVar.zzb(), this.zzu - this.zzl);
                        this.zzw.zzr(zzedVar, min);
                        int i25 = this.zzl + min;
                        this.zzl = i25;
                        if (i25 == this.zzu) {
                            zzcv.zzf(this.zzv != -9223372036854775807L ? 1 : i12);
                            this.zzw.zzt(this.zzv, 1, this.zzu, 0, null);
                            this.zzv += this.zzx;
                            zzh();
                        }
                    } else {
                        if (zzk(zzedVar, this.zzc.zza, true != this.zzn ? 5 : 7)) {
                            this.zzc.zzl(i12);
                            if (this.zzs) {
                                this.zzc.zzn(10);
                            } else {
                                int zzd4 = this.zzc.zzd(i13) + 1;
                                if (zzd4 != i13) {
                                    zzdq.zzf("AdtsReader", "Detected audio object type: " + zzd4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzn(5);
                                int zzd5 = this.zzc.zzd(3);
                                int i26 = this.zzq;
                                byte[] bArr = new byte[i13];
                                bArr[i12] = (byte) (((i26 >> 1) & 7) | 16);
                                bArr[1] = (byte) (((zzd5 << 3) & 120) | ((i26 << 7) & 128));
                                zzabp zza2 = zzabr.zza(bArr);
                                zzx zzxVar = new zzx();
                                zzxVar.zzO(this.zzh);
                                zzxVar.zzE(this.zzg);
                                zzxVar.zzad("audio/mp4a-latm");
                                zzxVar.zzC(zza2.zzc);
                                zzxVar.zzB(zza2.zzb);
                                zzxVar.zzae(zza2.zza);
                                zzxVar.zzP(Collections.singletonList(bArr));
                                zzxVar.zzS(this.zze);
                                zzxVar.zzab(this.zzf);
                                zzz zzaj = zzxVar.zzaj();
                                this.zzt = 1024000000 / zzaj.zzF;
                                this.zzi.zzm(zzaj);
                                this.zzs = true;
                            }
                            this.zzc.zzn(4);
                            int zzd6 = this.zzc.zzd(13);
                            zzj(this.zzi, this.zzt, 0, this.zzn ? zzd6 - 9 : zzd6 - 7);
                        }
                    }
                } else if (zzk(zzedVar, this.zzd.zzN(), 10)) {
                    this.zzj.zzr(this.zzd, 10);
                    this.zzd.zzL(6);
                    zzj(this.zzj, 0L, 10, this.zzd.zzl() + 10);
                }
            } else if (zzedVar.zzb() != 0) {
                zzec zzecVar = this.zzc;
                zzecVar.zza[i12] = zzedVar.zzN()[zzedVar.zzd()];
                zzecVar.zzl(i13);
                int zzd7 = this.zzc.zzd(4);
                int i27 = this.zzq;
                if (i27 == -1 || zzd7 == i27) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = zzd7;
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
        zzaeb zzw = zzacyVar.zzw(zzanmVar.zza(), 1);
        this.zzi = zzw;
        this.zzw = zzw;
        if (!this.zzb) {
            this.zzj = new zzacq();
            return;
        }
        zzanmVar.zzc();
        zzaeb zzw2 = zzacyVar.zzw(zzanmVar.zza(), 5);
        this.zzj = zzw2;
        zzx zzxVar = new zzx();
        zzxVar.zzO(zzanmVar.zzb());
        zzxVar.zzE(this.zzg);
        zzxVar.zzad("application/id3");
        zzw2.zzm(zzxVar.zzaj());
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

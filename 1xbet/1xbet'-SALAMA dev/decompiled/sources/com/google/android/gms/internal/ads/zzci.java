package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzci {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzci(int i7, int i8, float f7, float f8, int i9) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = f7;
        this.zzd = f8;
        this.zze = i7 / i9;
        this.zzf = i7 / 400;
        int i10 = i7 / 65;
        this.zzg = i10;
        int i11 = i10 + i10;
        this.zzh = i11;
        this.zzi = new short[i11];
        int i12 = i11 * i8;
        this.zzj = new short[i12];
        this.zzl = new short[i12];
        this.zzn = new short[i12];
    }

    private final int zzg(short[] sArr, int i7, int i8, int i9) {
        int i10 = 1;
        int i11 = 255;
        int i12 = 0;
        int i13 = 0;
        while (i8 <= i9) {
            int iAbs = 0;
            for (int i14 = 0; i14 < i8; i14++) {
                int i15 = this.zzb * i7;
                iAbs += Math.abs(sArr[i15 + i14] - sArr[(i15 + i8) + i14]);
            }
            int i16 = iAbs * i12;
            int i17 = i10 * i8;
            if (i16 < i17) {
                i10 = iAbs;
            }
            if (i16 < i17) {
                i12 = i8;
            }
            int i18 = iAbs * i11;
            int i19 = i13 * i8;
            if (i18 > i19) {
                i13 = iAbs;
            }
            if (i18 > i19) {
                i11 = i8;
            }
            i8++;
        }
        this.zzu = i10 / i12;
        this.zzv = i13 / i11;
        return i12;
    }

    private final void zzh(short[] sArr, int i7, int i8) {
        short[] sArrZzl = zzl(this.zzl, this.zzm, i8);
        this.zzl = sArrZzl;
        int i9 = this.zzm;
        int i10 = this.zzb;
        System.arraycopy(sArr, i7 * i10, sArrZzl, i9 * i10, i8 * i10);
        this.zzm += i8;
    }

    private final void zzi(short[] sArr, int i7, int i8) {
        int i9;
        for (int i10 = 0; i10 < this.zzh / i8; i10++) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.zzb;
                i9 = i13 * i8;
                if (i11 < i9) {
                    i12 += sArr[(i9 * i10) + (i13 * i7) + i11];
                    i11++;
                }
            }
            this.zzi[i10] = (short) (i12 / i9);
        }
    }

    private static void zzj(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = (i10 * i8) + i12;
            int i14 = (i11 * i8) + i12;
            int i15 = (i9 * i8) + i12;
            for (int i16 = 0; i16 < i7; i16++) {
                sArr[i15] = (short) (((sArr3[i14] * i16) + ((i7 - i16) * sArr2[i13])) / i7);
                i15 += i8;
                i13 += i8;
                i14 += i8;
            }
        }
    }

    private final void zzk() {
        int iZzg;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long j;
        long j3;
        double d7 = this.zzc / this.zzd;
        int i13 = this.zzm;
        int i14 = 0;
        int i15 = 1;
        if (d7 > 1.0000100135803223d || d7 < 0.9999899864196777d) {
            int i16 = this.zzk;
            if (i16 >= this.zzh) {
                int i17 = 0;
                while (true) {
                    int i18 = this.zzr;
                    if (i18 > 0) {
                        int iMin = Math.min(this.zzh, i18);
                        zzh(this.zzj, i17, iMin);
                        this.zzr -= iMin;
                        i17 += iMin;
                    } else {
                        short[] sArr = this.zzj;
                        int i19 = this.zza;
                        int i20 = i19 > 4000 ? i19 / 4000 : i15;
                        if (this.zzb == i15 && i20 == i15) {
                            iZzg = zzg(sArr, i17, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i17, i20);
                            int iZzg2 = zzg(this.zzi, i14, this.zzf / i20, this.zzg / i20);
                            if (i20 != i15) {
                                int i21 = iZzg2 * i20;
                                int i22 = i20 * 4;
                                int i23 = this.zzf;
                                int i24 = i21 - i22;
                                if (i24 >= i23) {
                                    i23 = i24;
                                }
                                int i25 = i21 + i22;
                                int i26 = this.zzg;
                                if (i25 > i26) {
                                    i25 = i26;
                                }
                                if (this.zzb == i15) {
                                    iZzg = zzg(sArr, i17, i23, i25);
                                } else {
                                    zzi(sArr, i17, i15);
                                    iZzg = zzg(this.zzi, i14, i23, i25);
                                }
                            } else {
                                iZzg = iZzg2;
                            }
                        }
                        int i27 = this.zzu;
                        int i28 = (i27 == 0 || (i9 = this.zzs) == 0 || this.zzv > i27 * 3 || i27 + i27 <= this.zzt * 3) ? iZzg : i9;
                        int i29 = i17 + i28;
                        this.zzt = i27;
                        this.zzs = iZzg;
                        double d8 = i28;
                        if (d7 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            double d9 = (-1.0d) + d7;
                            if (d7 >= 2.0d) {
                                double d10 = (d8 / d9) + this.zzw;
                                int iRound = (int) Math.round(d10);
                                this.zzw = d10 - ((double) iRound);
                                i8 = iRound;
                            } else {
                                double d11 = ((d8 * (2.0d - d7)) / d9) + this.zzw;
                                int iRound2 = (int) Math.round(d11);
                                this.zzr = iRound2;
                                this.zzw = d11 - ((double) iRound2);
                                i8 = i28;
                            }
                            short[] sArrZzl = zzl(this.zzl, this.zzm, i8);
                            this.zzl = sArrZzl;
                            zzj(i8, this.zzb, sArrZzl, this.zzm, sArr2, i17, sArr2, i29);
                            this.zzm += i8;
                            i17 = i28 + i8 + i17;
                        } else {
                            int i30 = i28;
                            short[] sArr3 = this.zzj;
                            double d12 = 1.0d - d7;
                            if (d7 < 0.5d) {
                                double d13 = ((d8 * d7) / d12) + this.zzw;
                                int iRound3 = (int) Math.round(d13);
                                this.zzw = d13 - ((double) iRound3);
                                i7 = iRound3;
                            } else {
                                double d14 = ((d8 * ((d7 + d7) - 1.0d)) / d12) + this.zzw;
                                int iRound4 = (int) Math.round(d14);
                                this.zzr = iRound4;
                                this.zzw = d14 - ((double) iRound4);
                                i7 = i30;
                            }
                            int i31 = i30 + i7;
                            short[] sArrZzl2 = zzl(this.zzl, this.zzm, i31);
                            this.zzl = sArrZzl2;
                            int i32 = this.zzb;
                            System.arraycopy(sArr3, i17 * i32, sArrZzl2, this.zzm * i32, i32 * i30);
                            zzj(i7, this.zzb, this.zzl, this.zzm + i30, sArr3, i29, sArr3, i17);
                            this.zzm += i31;
                            i17 += i7;
                        }
                    }
                    if (this.zzh + i17 > i16) {
                        break;
                    }
                    i14 = 0;
                    i15 = 1;
                }
                int i33 = this.zzk - i17;
                short[] sArr4 = this.zzj;
                int i34 = this.zzb;
                System.arraycopy(sArr4, i17 * i34, sArr4, 0, i34 * i33);
                this.zzk = i33;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        float f7 = this.zze * this.zzd;
        if (f7 == 1.0f || this.zzm == i13) {
            return;
        }
        int i35 = this.zza;
        float f8 = i35 / f7;
        long j7 = i35;
        long j8 = (long) f8;
        while (j8 != 0 && j7 != 0 && j8 % 2 == 0 && j7 % 2 == 0) {
            j8 /= 2;
            j7 /= 2;
        }
        int i36 = this.zzm - i13;
        short[] sArrZzl3 = zzl(this.zzn, this.zzo, i36);
        this.zzn = sArrZzl3;
        short[] sArr5 = this.zzl;
        int i37 = this.zzb;
        System.arraycopy(sArr5, i13 * i37, sArrZzl3, this.zzo * i37, i37 * i36);
        this.zzm = i13;
        this.zzo += i36;
        int i38 = 0;
        while (true) {
            i10 = this.zzo;
            i11 = i10 - 1;
            if (i38 >= i11) {
                break;
            }
            while (true) {
                i12 = this.zzp + 1;
                j = i12;
                long j9 = j * j8;
                j3 = this.zzq;
                if (j9 <= j3 * j7) {
                    break;
                }
                this.zzl = zzl(this.zzl, this.zzm, 1);
                int i39 = 0;
                while (true) {
                    int i40 = this.zzb;
                    if (i39 < i40) {
                        short[] sArr6 = this.zzl;
                        int i41 = this.zzm * i40;
                        short[] sArr7 = this.zzn;
                        int i42 = (i38 * i40) + i39;
                        short s7 = sArr7[i42];
                        short s8 = sArr7[i42 + i40];
                        long j10 = ((long) this.zzq) * j7;
                        int i43 = this.zzp;
                        long j11 = j7;
                        long j12 = ((long) (i43 + 1)) * j8;
                        long j13 = j12 - (((long) i43) * j8);
                        long j14 = j12 - j10;
                        sArr6[i41 + i39] = (short) ((((j13 - j14) * ((long) s8)) + (j14 * ((long) s7))) / j13);
                        i39++;
                        j7 = j11;
                        j8 = j8;
                    }
                }
                this.zzq++;
                this.zzm++;
                j7 = j7;
                j8 = j8;
            }
            long j15 = j7;
            long j16 = j8;
            this.zzp = i12;
            if (j == j15) {
                this.zzp = 0;
                zzcv.zzf(j3 == j16);
                this.zzq = 0;
            }
            i38++;
            j7 = j15;
            j8 = j16;
        }
        if (i11 != 0) {
            short[] sArr8 = this.zzn;
            int i44 = this.zzb;
            System.arraycopy(sArr8, i11 * i44, sArr8, 0, (i10 - i11) * i44);
            this.zzo -= i11;
        }
    }

    private final short[] zzl(short[] sArr, int i7, int i8) {
        int length = sArr.length;
        int i9 = this.zzb;
        int i10 = length / i9;
        return i7 + i8 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i8) * i9);
    }

    public final int zza() {
        zzcv.zzf(this.zzm >= 0);
        int i7 = this.zzm * this.zzb;
        return i7 + i7;
    }

    public final int zzb() {
        int i7 = this.zzk * this.zzb;
        return i7 + i7;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0d;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        zzcv.zzf(this.zzm >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * iMin);
        int i7 = this.zzm - iMin;
        this.zzm = i7;
        int i8 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, iMin * i8, sArr, 0, i7 * i8);
    }

    public final void zze() {
        int i7;
        int i8 = this.zzk;
        int i9 = this.zzr;
        int i10 = this.zzm;
        float f7 = this.zzc;
        float f8 = this.zzd;
        int i11 = i10 + ((int) ((((((((double) (i8 - i9)) / ((double) (f7 / f8))) + ((double) i9)) + this.zzw) + ((double) this.zzo)) / ((double) (this.zze * f8))) + 0.5d));
        this.zzw = 0.0d;
        int i12 = this.zzh;
        this.zzj = zzl(this.zzj, i8, i12 + i12 + i8);
        int i13 = 0;
        while (true) {
            int i14 = this.zzh;
            int i15 = this.zzb;
            i7 = i14 + i14;
            if (i13 >= i7 * i15) {
                break;
            }
            this.zzj[(i15 * i8) + i13] = 0;
            i13++;
        }
        this.zzk += i7;
        zzk();
        if (this.zzm > i11) {
            this.zzm = Math.max(i11, 0);
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i7 = this.zzb;
        int i8 = iRemaining / i7;
        int i9 = i7 * i8;
        short[] sArrZzl = zzl(this.zzj, this.zzk, i8);
        this.zzj = sArrZzl;
        shortBuffer.get(sArrZzl, this.zzk * this.zzb, (i9 + i9) / 2);
        this.zzk += i8;
        zzk();
    }
}

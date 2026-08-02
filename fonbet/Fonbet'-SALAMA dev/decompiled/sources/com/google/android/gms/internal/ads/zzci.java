package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
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
            int i14 = 0;
            for (int i15 = 0; i15 < i8; i15++) {
                int i16 = this.zzb * i7;
                i14 += Math.abs(sArr[i16 + i15] - sArr[(i16 + i8) + i15]);
            }
            int i17 = i14 * i12;
            int i18 = i10 * i8;
            if (i17 < i18) {
                i10 = i14;
            }
            if (i17 < i18) {
                i12 = i8;
            }
            int i19 = i14 * i11;
            int i20 = i13 * i8;
            if (i19 > i20) {
                i13 = i14;
            }
            if (i19 > i20) {
                i11 = i8;
            }
            i8++;
        }
        this.zzu = i10 / i12;
        this.zzv = i13 / i11;
        return i12;
    }

    private final void zzh(short[] sArr, int i7, int i8) {
        short[] zzl = zzl(this.zzl, this.zzm, i8);
        this.zzl = zzl;
        int i9 = this.zzm;
        int i10 = this.zzb;
        System.arraycopy(sArr, i7 * i10, zzl, i9 * i10, i8 * i10);
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
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j;
        long j3;
        double d7 = this.zzc / this.zzd;
        int i14 = this.zzm;
        int i15 = 0;
        int i16 = 1;
        if (d7 > 1.0000100135803223d || d7 < 0.9999899864196777d) {
            int i17 = this.zzk;
            if (i17 >= this.zzh) {
                int i18 = 0;
                while (true) {
                    int i19 = this.zzr;
                    if (i19 > 0) {
                        int min = Math.min(this.zzh, i19);
                        zzh(this.zzj, i18, min);
                        this.zzr -= min;
                        i18 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i20 = this.zza;
                        int i21 = i20 > 4000 ? i20 / 4000 : i16;
                        if (this.zzb == i16 && i21 == i16) {
                            i7 = zzg(sArr, i18, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i18, i21);
                            int zzg = zzg(this.zzi, i15, this.zzf / i21, this.zzg / i21);
                            if (i21 != i16) {
                                int i22 = zzg * i21;
                                int i23 = i21 * 4;
                                int i24 = this.zzf;
                                int i25 = i22 - i23;
                                if (i25 >= i24) {
                                    i24 = i25;
                                }
                                int i26 = i22 + i23;
                                int i27 = this.zzg;
                                if (i26 > i27) {
                                    i26 = i27;
                                }
                                if (this.zzb == i16) {
                                    i7 = zzg(sArr, i18, i24, i26);
                                } else {
                                    zzi(sArr, i18, i16);
                                    i7 = zzg(this.zzi, i15, i24, i26);
                                }
                            } else {
                                i7 = zzg;
                            }
                        }
                        int i28 = this.zzu;
                        int i29 = (i28 == 0 || (i10 = this.zzs) == 0 || this.zzv > i28 * 3 || i28 + i28 <= this.zzt * 3) ? i7 : i10;
                        int i30 = i18 + i29;
                        this.zzt = i28;
                        this.zzs = i7;
                        double d8 = i29;
                        if (d7 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            double d9 = (-1.0d) + d7;
                            if (d7 >= 2.0d) {
                                double d10 = (d8 / d9) + this.zzw;
                                int round = (int) Math.round(d10);
                                this.zzw = d10 - round;
                                i9 = round;
                            } else {
                                double d11 = ((d8 * (2.0d - d7)) / d9) + this.zzw;
                                int round2 = (int) Math.round(d11);
                                this.zzr = round2;
                                this.zzw = d11 - round2;
                                i9 = i29;
                            }
                            short[] zzl = zzl(this.zzl, this.zzm, i9);
                            this.zzl = zzl;
                            zzj(i9, this.zzb, zzl, this.zzm, sArr2, i18, sArr2, i30);
                            this.zzm += i9;
                            i18 = i29 + i9 + i18;
                        } else {
                            int i31 = i29;
                            short[] sArr3 = this.zzj;
                            double d12 = 1.0d - d7;
                            if (d7 < 0.5d) {
                                double d13 = ((d8 * d7) / d12) + this.zzw;
                                int round3 = (int) Math.round(d13);
                                this.zzw = d13 - round3;
                                i8 = round3;
                            } else {
                                double d14 = ((d8 * ((d7 + d7) - 1.0d)) / d12) + this.zzw;
                                int round4 = (int) Math.round(d14);
                                this.zzr = round4;
                                this.zzw = d14 - round4;
                                i8 = i31;
                            }
                            int i32 = i31 + i8;
                            short[] zzl2 = zzl(this.zzl, this.zzm, i32);
                            this.zzl = zzl2;
                            int i33 = this.zzb;
                            System.arraycopy(sArr3, i18 * i33, zzl2, this.zzm * i33, i33 * i31);
                            zzj(i8, this.zzb, this.zzl, this.zzm + i31, sArr3, i30, sArr3, i18);
                            this.zzm += i32;
                            i18 += i8;
                        }
                    }
                    if (this.zzh + i18 > i17) {
                        break;
                    }
                    i15 = 0;
                    i16 = 1;
                }
                int i34 = this.zzk - i18;
                short[] sArr4 = this.zzj;
                int i35 = this.zzb;
                System.arraycopy(sArr4, i18 * i35, sArr4, 0, i35 * i34);
                this.zzk = i34;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        float f7 = this.zze * this.zzd;
        if (f7 == 1.0f || this.zzm == i14) {
            return;
        }
        int i36 = this.zza;
        float f8 = i36 / f7;
        long j7 = i36;
        long j8 = (long) f8;
        while (j8 != 0 && j7 != 0 && j8 % 2 == 0 && j7 % 2 == 0) {
            j8 /= 2;
            j7 /= 2;
        }
        int i37 = this.zzm - i14;
        short[] zzl3 = zzl(this.zzn, this.zzo, i37);
        this.zzn = zzl3;
        short[] sArr5 = this.zzl;
        int i38 = this.zzb;
        System.arraycopy(sArr5, i14 * i38, zzl3, this.zzo * i38, i38 * i37);
        this.zzm = i14;
        this.zzo += i37;
        int i39 = 0;
        while (true) {
            i11 = this.zzo;
            i12 = i11 - 1;
            if (i39 >= i12) {
                break;
            }
            while (true) {
                i13 = this.zzp + 1;
                j = i13;
                long j9 = j * j8;
                j3 = this.zzq;
                if (j9 <= j3 * j7) {
                    break;
                }
                this.zzl = zzl(this.zzl, this.zzm, 1);
                int i40 = 0;
                while (true) {
                    int i41 = this.zzb;
                    if (i40 < i41) {
                        short[] sArr6 = this.zzl;
                        int i42 = this.zzm * i41;
                        short[] sArr7 = this.zzn;
                        int i43 = (i39 * i41) + i40;
                        short s7 = sArr7[i43];
                        short s8 = sArr7[i43 + i41];
                        long j10 = this.zzq * j7;
                        long j11 = j7;
                        long j12 = (r13 + 1) * j8;
                        long j13 = j12 - (this.zzp * j8);
                        long j14 = j12 - j10;
                        sArr6[i42 + i40] = (short) ((((j13 - j14) * s8) + (j14 * s7)) / j13);
                        i40++;
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
            this.zzp = i13;
            if (j == j15) {
                this.zzp = 0;
                zzcv.zzf(j3 == j16);
                this.zzq = 0;
            }
            i39++;
            j7 = j15;
            j8 = j16;
        }
        if (i12 != 0) {
            short[] sArr8 = this.zzn;
            int i44 = this.zzb;
            System.arraycopy(sArr8, i12 * i44, sArr8, 0, (i11 - i12) * i44);
            this.zzo -= i12;
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
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i7 = this.zzm - min;
        this.zzm = i7;
        int i8 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, min * i8, sArr, 0, i7 * i8);
    }

    public final void zze() {
        int i7;
        int i8 = this.zzk;
        int i9 = this.zzr;
        int i10 = this.zzm;
        float f7 = this.zzc;
        float f8 = this.zzd;
        int i11 = i10 + ((int) (((((((i8 - i9) / (f7 / f8)) + i9) + this.zzw) + this.zzo) / (this.zze * f8)) + 0.5d));
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
        int remaining = shortBuffer.remaining();
        int i7 = this.zzb;
        int i8 = remaining / i7;
        int i9 = i7 * i8;
        short[] zzl = zzl(this.zzj, this.zzk, i8);
        this.zzj = zzl;
        shortBuffer.get(zzl, this.zzk * this.zzb, (i9 + i9) / 2);
        this.zzk += i8;
        zzk();
    }
}

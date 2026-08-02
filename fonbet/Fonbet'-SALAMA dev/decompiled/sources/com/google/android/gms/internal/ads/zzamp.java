package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbd;

/* loaded from: classes.dex */
final class zzamp {
    public static zzamn zza(zzec zzecVar) {
        int i7;
        int i8;
        char c3;
        int i9;
        int i10;
        char c4;
        int zzd = zzecVar.zzd(8);
        int i11 = 5;
        int zzd2 = zzecVar.zzd(5);
        if (zzd2 != 31) {
            switch (zzd2) {
                case 0:
                    i7 = 96000;
                    break;
                case 1:
                    i7 = 88200;
                    break;
                case 2:
                    i7 = 64000;
                    break;
                case 3:
                    i7 = 48000;
                    break;
                case 4:
                    i7 = 44100;
                    break;
                case 5:
                    i7 = 32000;
                    break;
                case 6:
                    i7 = 24000;
                    break;
                case 7:
                    i7 = 22050;
                    break;
                case 8:
                    i7 = 16000;
                    break;
                case 9:
                    i7 = 12000;
                    break;
                case 10:
                    i7 = 11025;
                    break;
                case 11:
                    i7 = 8000;
                    break;
                case 12:
                    i7 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzaz.zzc("Unsupported sampling rate index " + zzd2);
                case 15:
                    i7 = 57600;
                    break;
                case 16:
                    i7 = 51200;
                    break;
                case 17:
                    i7 = 40000;
                    break;
                case 18:
                    i7 = 38400;
                    break;
                case 19:
                    i7 = 34150;
                    break;
                case 20:
                    i7 = 28800;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    i7 = 25600;
                    break;
                case 22:
                    i7 = 20000;
                    break;
                case 23:
                    i7 = 19200;
                    break;
                case 24:
                    i7 = 17075;
                    break;
                case 25:
                    i7 = 14400;
                    break;
                case 26:
                    i7 = 12800;
                    break;
                case 27:
                    i7 = 9600;
                    break;
            }
        } else {
            i7 = zzecVar.zzd(24);
        }
        int zzd3 = zzecVar.zzd(3);
        int i12 = 1;
        if (zzd3 == 0) {
            i8 = 768;
        } else if (zzd3 == 1) {
            i8 = 1024;
        } else if (zzd3 == 2 || zzd3 == 3) {
            i8 = 2048;
        } else {
            if (zzd3 != 4) {
                throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
            }
            i8 = 4096;
        }
        if (zzd3 == 0 || zzd3 == 1) {
            c3 = 0;
        } else if (zzd3 == 2) {
            c3 = 2;
        } else if (zzd3 == 3) {
            c3 = 3;
        } else {
            if (zzd3 != 4) {
                throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
            }
            c3 = 1;
        }
        zzecVar.zzn(2);
        zze(zzecVar);
        int zzd4 = zzecVar.zzd(5);
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = 16;
            if (i13 < zzd4 + 1) {
                int zzd5 = zzecVar.zzd(3);
                i14 += zzc(zzecVar, 5, 8, 16) + 1;
                if ((zzd5 == 0 || zzd5 == 2) && zzecVar.zzp()) {
                    zze(zzecVar);
                }
                i13++;
            } else {
                int zzc = zzc(zzecVar, 4, 8, 16) + 1;
                zzecVar.zzm();
                int i16 = 0;
                while (true) {
                    double d7 = 2.0d;
                    if (i16 >= zzc) {
                        int i17 = zzd;
                        byte[] bArr = null;
                        if (zzecVar.zzp()) {
                            int zzc2 = zzc(zzecVar, 2, 4, 8) + 1;
                            for (int i18 = 0; i18 < zzc2; i18++) {
                                int zzc3 = zzc(zzecVar, 4, 8, 16);
                                int zzc4 = zzc(zzecVar, 4, 8, 16);
                                if (zzc3 == 7) {
                                    int zzd6 = zzecVar.zzd(4) + 1;
                                    zzecVar.zzn(4);
                                    byte[] bArr2 = new byte[zzd6];
                                    for (int i19 = 0; i19 < zzd6; i19++) {
                                        bArr2[i19] = (byte) zzecVar.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzecVar.zzn(zzc4 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i7) {
                            case 14700:
                            case 16000:
                                d7 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d7 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d7 = 1.0d;
                                break;
                            default:
                                throw zzaz.zzc("Unsupported sampling rate " + i7);
                        }
                        return new zzamn(i17, (int) (i7 * d7), (int) (i8 * d7), bArr3, null);
                    }
                    int zzd7 = zzecVar.zzd(2);
                    if (zzd7 == 0) {
                        i9 = zzd;
                        zzf(zzecVar);
                        if (c3 > 0) {
                            zzd(zzecVar);
                        }
                    } else if (zzd7 != i12) {
                        if (zzd7 == 3) {
                            zzc(zzecVar, 4, 8, i15);
                            int zzc5 = zzc(zzecVar, 4, 8, i15);
                            if (zzecVar.zzp()) {
                                zzc(zzecVar, 8, i15, 0);
                            }
                            zzecVar.zzm();
                            if (zzc5 > 0) {
                                zzecVar.zzn(zzc5 * 8);
                            }
                        }
                        i9 = zzd;
                    } else {
                        if (zzf(zzecVar)) {
                            zzecVar.zzm();
                        }
                        if (c3 > 0) {
                            zzd(zzecVar);
                            i10 = zzecVar.zzd(2);
                            c4 = c3;
                        } else {
                            i10 = 0;
                            c4 = 0;
                        }
                        if (i10 > 0) {
                            zzecVar.zzn(6);
                            int zzd8 = zzecVar.zzd(2);
                            zzecVar.zzn(4);
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(i11);
                            }
                            if (i10 == 2 || i10 == 3) {
                                zzecVar.zzn(6);
                            }
                            if (zzd8 == 2) {
                                zzecVar.zzm();
                            }
                        }
                        i9 = zzd;
                        int floor = ((int) Math.floor(Math.log(i14 - 1) / Math.log(2.0d))) + 1;
                        int zzd9 = zzecVar.zzd(2);
                        if (zzd9 > 0 && zzecVar.zzp()) {
                            zzecVar.zzn(floor);
                        }
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(floor);
                        }
                        if (c4 == 0 && zzd9 == 0) {
                            zzecVar.zzm();
                        }
                    }
                    i16++;
                    zzd = i9;
                    i11 = 5;
                    i12 = 1;
                    i15 = 16;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzb(zzec zzecVar, zzamm zzammVar) {
        long zze;
        zzecVar.zzb();
        int zzc = zzc(zzecVar, 3, 8, 8);
        zzammVar.zza = zzc;
        if (zzc == -1) {
            return false;
        }
        zzcv.zzd(Math.max(Math.max(2, 8), 32) <= 63);
        zzfzf.zza(zzfzf.zza(3L, 255L), 4294967296L);
        if (zzecVar.zza() >= 2) {
            zze = zzecVar.zze(2);
            if (zze == 3) {
                if (zzecVar.zza() >= 8) {
                    long zze2 = zzecVar.zze(8);
                    long j = 3 + zze2;
                    if (zze2 != 255) {
                        zze = j;
                    } else if (zzecVar.zza() >= 32) {
                        zze = zzecVar.zze(32) + j;
                    }
                }
            }
            zzammVar.zzb = zze;
            if (zze != -1) {
                return false;
            }
            if (zze > 16) {
                throw zzaz.zzc("Contains sub-stream with an invalid packet label " + zze);
            }
            if (zze == 0) {
                int i7 = zzammVar.zza;
                if (i7 == 1) {
                    throw zzaz.zza("Mpegh3daConfig packet with invalid packet label 0", null);
                }
                if (i7 == 2) {
                    throw zzaz.zza("Mpegh3daFrame packet with invalid packet label 0", null);
                }
                if (i7 == 17) {
                    throw zzaz.zza("AudioTruncation packet with invalid packet label 0", null);
                }
            }
            int zzc2 = zzc(zzecVar, 11, 24, 24);
            zzammVar.zzc = zzc2;
            return zzc2 != -1;
        }
        zze = -1;
        zzammVar.zzb = zze;
        if (zze != -1) {
        }
    }

    private static int zzc(zzec zzecVar, int i7, int i8, int i9) {
        zzcv.zzd(Math.max(Math.max(i7, i8), i9) <= 31);
        int i10 = (1 << i7) - 1;
        int i11 = (1 << i8) - 1;
        zzfzd.zza(zzfzd.zza(i10, i11), 1 << i9);
        if (zzecVar.zza() < i7) {
            return -1;
        }
        int zzd = zzecVar.zzd(i7);
        if (zzd != i10) {
            return zzd;
        }
        if (zzecVar.zza() < i8) {
            return -1;
        }
        int zzd2 = zzecVar.zzd(i8);
        int i12 = zzd + zzd2;
        if (zzd2 != i11) {
            return i12;
        }
        if (zzecVar.zza() < i9) {
            return -1;
        }
        return i12 + zzecVar.zzd(i9);
    }

    private static void zzd(zzec zzecVar) {
        zzecVar.zzn(3);
        zzecVar.zzn(8);
        boolean zzp = zzecVar.zzp();
        boolean zzp2 = zzecVar.zzp();
        if (zzp) {
            zzecVar.zzn(5);
        }
        if (zzp2) {
            zzecVar.zzn(6);
        }
    }

    private static void zze(zzec zzecVar) {
        int zzd;
        int zzd2 = zzecVar.zzd(2);
        if (zzd2 == 0) {
            zzecVar.zzn(6);
            return;
        }
        int zzc = zzc(zzecVar, 5, 8, 16) + 1;
        if (zzd2 == 1) {
            zzecVar.zzn(zzc * 7);
            return;
        }
        if (zzd2 == 2) {
            boolean zzp = zzecVar.zzp();
            int i7 = true != zzp ? 5 : 1;
            int i8 = true == zzp ? 7 : 5;
            int i9 = true == zzp ? 8 : 6;
            int i10 = 0;
            while (i10 < zzc) {
                if (zzecVar.zzp()) {
                    zzecVar.zzn(7);
                    zzd = 0;
                } else {
                    if (zzecVar.zzd(2) == 3 && zzecVar.zzd(i8) * i7 != 0) {
                        zzecVar.zzm();
                    }
                    zzd = zzecVar.zzd(i9) * i7;
                    if (zzd != 0 && zzd != 180) {
                        zzecVar.zzm();
                    }
                    zzecVar.zzm();
                }
                if (zzd != 0 && zzd != 180 && zzecVar.zzp()) {
                    i10++;
                }
                i10++;
            }
        }
    }

    private static boolean zzf(zzec zzecVar) {
        zzecVar.zzn(3);
        boolean zzp = zzecVar.zzp();
        if (zzp) {
            zzecVar.zzn(13);
        }
        return zzp;
    }
}

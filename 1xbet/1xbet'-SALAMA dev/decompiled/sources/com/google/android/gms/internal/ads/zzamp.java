package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzamp {
    public static zzamn zza(zzec zzecVar) throws zzaz {
        int iZzd;
        int i7;
        char c3;
        int i8;
        int iZzd2;
        char c4;
        int iZzd3 = zzecVar.zzd(8);
        int i9 = 5;
        int iZzd4 = zzecVar.zzd(5);
        if (iZzd4 != 31) {
            switch (iZzd4) {
                case 0:
                    iZzd = 96000;
                    break;
                case 1:
                    iZzd = 88200;
                    break;
                case 2:
                    iZzd = 64000;
                    break;
                case 3:
                    iZzd = 48000;
                    break;
                case 4:
                    iZzd = 44100;
                    break;
                case 5:
                    iZzd = 32000;
                    break;
                case 6:
                    iZzd = 24000;
                    break;
                case 7:
                    iZzd = 22050;
                    break;
                case 8:
                    iZzd = 16000;
                    break;
                case 9:
                    iZzd = 12000;
                    break;
                case 10:
                    iZzd = 11025;
                    break;
                case 11:
                    iZzd = 8000;
                    break;
                case 12:
                    iZzd = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzaz.zzc("Unsupported sampling rate index " + iZzd4);
                case 15:
                    iZzd = 57600;
                    break;
                case 16:
                    iZzd = 51200;
                    break;
                case 17:
                    iZzd = 40000;
                    break;
                case 18:
                    iZzd = 38400;
                    break;
                case 19:
                    iZzd = 34150;
                    break;
                case 20:
                    iZzd = 28800;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    iZzd = 25600;
                    break;
                case 22:
                    iZzd = 20000;
                    break;
                case 23:
                    iZzd = 19200;
                    break;
                case 24:
                    iZzd = 17075;
                    break;
                case 25:
                    iZzd = 14400;
                    break;
                case 26:
                    iZzd = 12800;
                    break;
                case 27:
                    iZzd = 9600;
                    break;
            }
        } else {
            iZzd = zzecVar.zzd(24);
        }
        int iZzd5 = zzecVar.zzd(3);
        int i10 = 1;
        if (iZzd5 == 0) {
            i7 = 768;
        } else if (iZzd5 == 1) {
            i7 = 1024;
        } else if (iZzd5 == 2 || iZzd5 == 3) {
            i7 = 2048;
        } else {
            if (iZzd5 != 4) {
                throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + iZzd5);
            }
            i7 = 4096;
        }
        if (iZzd5 == 0 || iZzd5 == 1) {
            c3 = 0;
        } else if (iZzd5 == 2) {
            c3 = 2;
        } else if (iZzd5 == 3) {
            c3 = 3;
        } else {
            if (iZzd5 != 4) {
                throw zzaz.zzc("Unsupported coreSbrFrameLengthIndex " + iZzd5);
            }
            c3 = 1;
        }
        zzecVar.zzn(2);
        zze(zzecVar);
        int iZzd6 = zzecVar.zzd(5);
        int i11 = 0;
        int iZzc = 0;
        while (true) {
            int i12 = 16;
            if (i11 < iZzd6 + 1) {
                int iZzd7 = zzecVar.zzd(3);
                iZzc += zzc(zzecVar, 5, 8, 16) + 1;
                if ((iZzd7 == 0 || iZzd7 == 2) && zzecVar.zzp()) {
                    zze(zzecVar);
                }
                i11++;
            } else {
                int iZzc2 = zzc(zzecVar, 4, 8, 16) + 1;
                zzecVar.zzm();
                int i13 = 0;
                while (true) {
                    double d7 = 2.0d;
                    if (i13 >= iZzc2) {
                        int i14 = iZzd3;
                        byte[] bArr = null;
                        if (zzecVar.zzp()) {
                            int iZzc3 = zzc(zzecVar, 2, 4, 8) + 1;
                            for (int i15 = 0; i15 < iZzc3; i15++) {
                                int iZzc4 = zzc(zzecVar, 4, 8, 16);
                                int iZzc5 = zzc(zzecVar, 4, 8, 16);
                                if (iZzc4 == 7) {
                                    int iZzd8 = zzecVar.zzd(4) + 1;
                                    zzecVar.zzn(4);
                                    byte[] bArr2 = new byte[iZzd8];
                                    for (int i16 = 0; i16 < iZzd8; i16++) {
                                        bArr2[i16] = (byte) zzecVar.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzecVar.zzn(iZzc5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzd) {
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
                                throw zzaz.zzc("Unsupported sampling rate " + iZzd);
                        }
                        return new zzamn(i14, (int) (((double) iZzd) * d7), (int) (((double) i7) * d7), bArr3, null);
                    }
                    int iZzd9 = zzecVar.zzd(2);
                    if (iZzd9 == 0) {
                        i8 = iZzd3;
                        zzf(zzecVar);
                        if (c3 > 0) {
                            zzd(zzecVar);
                        }
                    } else if (iZzd9 != i10) {
                        if (iZzd9 == 3) {
                            zzc(zzecVar, 4, 8, i12);
                            int iZzc6 = zzc(zzecVar, 4, 8, i12);
                            if (zzecVar.zzp()) {
                                zzc(zzecVar, 8, i12, 0);
                            }
                            zzecVar.zzm();
                            if (iZzc6 > 0) {
                                zzecVar.zzn(iZzc6 * 8);
                            }
                        }
                        i8 = iZzd3;
                    } else {
                        if (zzf(zzecVar)) {
                            zzecVar.zzm();
                        }
                        if (c3 > 0) {
                            zzd(zzecVar);
                            iZzd2 = zzecVar.zzd(2);
                            c4 = c3;
                        } else {
                            iZzd2 = 0;
                            c4 = 0;
                        }
                        if (iZzd2 > 0) {
                            zzecVar.zzn(6);
                            int iZzd10 = zzecVar.zzd(2);
                            zzecVar.zzn(4);
                            if (zzecVar.zzp()) {
                                zzecVar.zzn(i9);
                            }
                            if (iZzd2 == 2 || iZzd2 == 3) {
                                zzecVar.zzn(6);
                            }
                            if (iZzd10 == 2) {
                                zzecVar.zzm();
                            }
                        }
                        i8 = iZzd3;
                        int iFloor = ((int) Math.floor(Math.log(iZzc - 1) / Math.log(2.0d))) + 1;
                        int iZzd11 = zzecVar.zzd(2);
                        if (iZzd11 > 0 && zzecVar.zzp()) {
                            zzecVar.zzn(iFloor);
                        }
                        if (zzecVar.zzp()) {
                            zzecVar.zzn(iFloor);
                        }
                        if (c4 == 0 && iZzd11 == 0) {
                            zzecVar.zzm();
                        }
                    }
                    i13++;
                    iZzd3 = i8;
                    i9 = 5;
                    i10 = 1;
                    i12 = 16;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042  */
    public static boolean zzb(zzec zzecVar, zzamm zzammVar) throws zzaz {
        long jZze;
        zzecVar.zzb();
        int iZzc = zzc(zzecVar, 3, 8, 8);
        zzammVar.zza = iZzc;
        if (iZzc == -1) {
            return false;
        }
        zzcv.zzd(Math.max(Math.max(2, 8), 32) <= 63);
        zzfzf.zza(zzfzf.zza(3L, 255L), 4294967296L);
        if (zzecVar.zza() < 2) {
            jZze = -1;
        } else {
            jZze = zzecVar.zze(2);
            if (jZze == 3) {
                if (zzecVar.zza() < 8) {
                    jZze = -1;
                } else {
                    long jZze2 = zzecVar.zze(8);
                    long j = 3 + jZze2;
                    if (jZze2 != 255) {
                        jZze = j;
                    } else if (zzecVar.zza() < 32) {
                        jZze = -1;
                    } else {
                        jZze = zzecVar.zze(32) + j;
                    }
                }
            }
        }
        zzammVar.zzb = jZze;
        if (jZze == -1) {
            return false;
        }
        if (jZze > 16) {
            throw zzaz.zzc("Contains sub-stream with an invalid packet label " + jZze);
        }
        if (jZze == 0) {
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
        int iZzc2 = zzc(zzecVar, 11, 24, 24);
        zzammVar.zzc = iZzc2;
        return iZzc2 != -1;
    }

    private static int zzc(zzec zzecVar, int i7, int i8, int i9) {
        zzcv.zzd(Math.max(Math.max(i7, i8), i9) <= 31);
        int i10 = (1 << i7) - 1;
        int i11 = (1 << i8) - 1;
        zzfzd.zza(zzfzd.zza(i10, i11), 1 << i9);
        if (zzecVar.zza() < i7) {
            return -1;
        }
        int iZzd = zzecVar.zzd(i7);
        if (iZzd != i10) {
            return iZzd;
        }
        if (zzecVar.zza() < i8) {
            return -1;
        }
        int iZzd2 = zzecVar.zzd(i8);
        int i12 = iZzd + iZzd2;
        if (iZzd2 != i11) {
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
        boolean zZzp = zzecVar.zzp();
        boolean zZzp2 = zzecVar.zzp();
        if (zZzp) {
            zzecVar.zzn(5);
        }
        if (zZzp2) {
            zzecVar.zzn(6);
        }
    }

    private static void zze(zzec zzecVar) {
        int iZzd;
        int iZzd2 = zzecVar.zzd(2);
        if (iZzd2 == 0) {
            zzecVar.zzn(6);
            return;
        }
        int iZzc = zzc(zzecVar, 5, 8, 16) + 1;
        if (iZzd2 == 1) {
            zzecVar.zzn(iZzc * 7);
            return;
        }
        if (iZzd2 == 2) {
            boolean zZzp = zzecVar.zzp();
            int i7 = true != zZzp ? 5 : 1;
            int i8 = true == zZzp ? 7 : 5;
            int i9 = true == zZzp ? 8 : 6;
            int i10 = 0;
            while (i10 < iZzc) {
                if (zzecVar.zzp()) {
                    zzecVar.zzn(7);
                    iZzd = 0;
                } else {
                    if (zzecVar.zzd(2) == 3 && zzecVar.zzd(i8) * i7 != 0) {
                        zzecVar.zzm();
                    }
                    iZzd = zzecVar.zzd(i9) * i7;
                    if (iZzd != 0 && iZzd != 180) {
                        zzecVar.zzm();
                    }
                    zzecVar.zzm();
                }
                if (iZzd != 0 && iZzd != 180 && zzecVar.zzp()) {
                    i10++;
                }
                i10++;
            }
        }
    }

    private static boolean zzf(zzec zzecVar) {
        zzecVar.zzn(3);
        boolean zZzp = zzecVar.zzp();
        if (zZzp) {
            zzecVar.zzn(13);
        }
        return zZzp;
    }
}

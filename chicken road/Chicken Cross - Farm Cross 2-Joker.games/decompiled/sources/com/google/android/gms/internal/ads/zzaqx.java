package com.google.android.gms.internal.ads;

import com.google.android.material.internal.ViewUtils;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaqx {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(zzet zzetVar, zzaqv zzaqvVar) throws zzat {
        long zzk;
        zzetVar.zze();
        int zzf = zzf(zzetVar, 3, 8, 8);
        zzaqvVar.zza = zzf;
        if (zzf == -1) {
            return false;
        }
        zzguk.zza(Math.max(Math.max(2, 8), 32) <= 63);
        Math.addExact(Math.addExact(3L, 255L), 4294967296L);
        if (zzetVar.zzc() >= 2) {
            zzk = zzetVar.zzk(2);
            if (zzk == 3) {
                if (zzetVar.zzc() >= 8) {
                    long zzk2 = zzetVar.zzk(8);
                    long j = 3 + zzk2;
                    if (zzk2 != 255) {
                        zzk = j;
                    } else if (zzetVar.zzc() >= 32) {
                        zzk = zzetVar.zzk(32) + j;
                    }
                }
            }
            zzaqvVar.zzb = zzk;
            if (zzk != -1) {
                return false;
            }
            if (zzk > 16) {
                StringBuilder sb = new StringBuilder(String.valueOf(zzk).length() + 49);
                sb.append("Contains sub-stream with an invalid packet label ");
                sb.append(zzk);
                throw zzat.zzc(sb.toString());
            }
            if (zzk == 0) {
                int i = zzaqvVar.zza;
                if (i == 1) {
                    throw zzat.zzb("Mpegh3daConfig packet with invalid packet label 0", null);
                }
                if (i == 2) {
                    throw zzat.zzb("Mpegh3daFrame packet with invalid packet label 0", null);
                }
                if (i == 17) {
                    throw zzat.zzb("AudioTruncation packet with invalid packet label 0", null);
                }
            }
            int zzf2 = zzf(zzetVar, 11, 24, 24);
            zzaqvVar.zzc = zzf2;
            return zzf2 != -1;
        }
        zzk = -1;
        zzaqvVar.zzb = zzk;
        if (zzk != -1) {
        }
    }

    public static zzaqw zzb(zzet zzetVar) throws zzat {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        char c2;
        int zzj = zzetVar.zzj(8);
        int i5 = 5;
        int zzj2 = zzetVar.zzj(5);
        if (zzj2 != 31) {
            switch (zzj2) {
                case 0:
                    i = 96000;
                    break;
                case 1:
                    i = 88200;
                    break;
                case 2:
                    i = 64000;
                    break;
                case 3:
                    i = 48000;
                    break;
                case 4:
                    i = 44100;
                    break;
                case 5:
                    i = 32000;
                    break;
                case 6:
                    i = 24000;
                    break;
                case 7:
                    i = 22050;
                    break;
                case 8:
                    i = 16000;
                    break;
                case 9:
                    i = 12000;
                    break;
                case 10:
                    i = 11025;
                    break;
                case 11:
                    i = 8000;
                    break;
                case 12:
                    i = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(zzj2).length() + 32);
                    sb.append("Unsupported sampling rate index ");
                    sb.append(zzj2);
                    throw zzat.zzc(sb.toString());
                case 15:
                    i = 57600;
                    break;
                case 16:
                    i = 51200;
                    break;
                case 17:
                    i = 40000;
                    break;
                case 18:
                    i = 38400;
                    break;
                case 19:
                    i = 34150;
                    break;
                case 20:
                    i = 28800;
                    break;
                case 21:
                    i = 25600;
                    break;
                case 22:
                    i = 20000;
                    break;
                case 23:
                    i = 19200;
                    break;
                case 24:
                    i = 17075;
                    break;
                case 25:
                    i = 14400;
                    break;
                case 26:
                    i = 12800;
                    break;
                case 27:
                    i = 9600;
                    break;
            }
        } else {
            i = zzetVar.zzj(24);
        }
        int zzj3 = zzetVar.zzj(3);
        int i6 = 1;
        if (zzj3 == 0) {
            i2 = ViewUtils.EDGE_TO_EDGE_FLAGS;
        } else if (zzj3 == 1) {
            i2 = 1024;
        } else if (zzj3 == 2 || zzj3 == 3) {
            i2 = 2048;
        } else {
            if (zzj3 != 4) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(zzj3).length() + 36);
                sb2.append("Unsupported coreSbrFrameLengthIndex ");
                sb2.append(zzj3);
                throw zzat.zzc(sb2.toString());
            }
            i2 = 4096;
        }
        if (zzj3 == 0 || zzj3 == 1) {
            c = 0;
        } else if (zzj3 == 2) {
            c = 2;
        } else if (zzj3 == 3) {
            c = 3;
        } else {
            if (zzj3 != 4) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(zzj3).length() + 36);
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(zzj3);
                throw zzat.zzc(sb3.toString());
            }
            c = 1;
        }
        zzetVar.zzh(2);
        zzc(zzetVar);
        int zzj4 = zzetVar.zzj(5);
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = 16;
            if (i7 < zzj4 + 1) {
                int zzj5 = zzetVar.zzj(3);
                i8 += zzf(zzetVar, 5, 8, 16) + 1;
                if ((zzj5 == 0 || zzj5 == 2) && zzetVar.zzi()) {
                    zzc(zzetVar);
                }
                i7++;
            } else {
                int zzf = zzf(zzetVar, 4, 8, 16) + 1;
                zzetVar.zzg();
                int i10 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i10 >= zzf) {
                        int i11 = zzj;
                        byte[] bArr = null;
                        if (zzetVar.zzi()) {
                            int zzf2 = zzf(zzetVar, 2, 4, 8) + 1;
                            for (int i12 = 0; i12 < zzf2; i12++) {
                                int zzf3 = zzf(zzetVar, 4, 8, 16);
                                int zzf4 = zzf(zzetVar, 4, 8, 16);
                                if (zzf3 == 7) {
                                    int zzj6 = zzetVar.zzj(4) + 1;
                                    zzetVar.zzh(4);
                                    byte[] bArr2 = new byte[zzj6];
                                    for (int i13 = 0; i13 < zzj6; i13++) {
                                        bArr2[i13] = (byte) zzetVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzetVar.zzh(zzf4 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i) {
                            case 14700:
                            case 16000:
                                d = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d = 1.0d;
                                break;
                            default:
                                StringBuilder sb4 = new StringBuilder(String.valueOf(i).length() + 26);
                                sb4.append("Unsupported sampling rate ");
                                sb4.append(i);
                                throw zzat.zzc(sb4.toString());
                        }
                        return new zzaqw(i11, (int) (i * d), (int) (i2 * d), bArr3, null);
                    }
                    int zzj7 = zzetVar.zzj(2);
                    if (zzj7 == 0) {
                        i3 = zzj;
                        zzd(zzetVar);
                        if (c > 0) {
                            zze(zzetVar);
                        }
                    } else if (zzj7 != i6) {
                        if (zzj7 == 3) {
                            zzf(zzetVar, 4, 8, i9);
                            int zzf5 = zzf(zzetVar, 4, 8, i9);
                            if (zzetVar.zzi()) {
                                zzf(zzetVar, 8, i9, 0);
                            }
                            zzetVar.zzg();
                            if (zzf5 > 0) {
                                zzetVar.zzh(zzf5 * 8);
                            }
                        }
                        i3 = zzj;
                    } else {
                        if (zzd(zzetVar)) {
                            zzetVar.zzg();
                        }
                        if (c > 0) {
                            zze(zzetVar);
                            i4 = zzetVar.zzj(2);
                            c2 = c;
                        } else {
                            i4 = 0;
                            c2 = 0;
                        }
                        if (i4 > 0) {
                            zzetVar.zzh(6);
                            int zzj8 = zzetVar.zzj(2);
                            zzetVar.zzh(4);
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(i5);
                            }
                            if (i4 == 2 || i4 == 3) {
                                zzetVar.zzh(6);
                            }
                            if (zzj8 == 2) {
                                zzetVar.zzg();
                            }
                        }
                        i3 = zzj;
                        int floor = ((int) Math.floor(Math.log(i8 - 1) / Math.log(2.0d))) + 1;
                        int zzj9 = zzetVar.zzj(2);
                        if (zzj9 > 0 && zzetVar.zzi()) {
                            zzetVar.zzh(floor);
                        }
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(floor);
                        }
                        if (c2 == 0 && zzj9 == 0) {
                            zzetVar.zzg();
                        }
                    }
                    i10++;
                    zzj = i3;
                    i5 = 5;
                    i6 = 1;
                    i9 = 16;
                }
            }
        }
    }

    private static void zzc(zzet zzetVar) {
        int zzj;
        int zzj2 = zzetVar.zzj(2);
        if (zzj2 == 0) {
            zzetVar.zzh(6);
            return;
        }
        int zzf = zzf(zzetVar, 5, 8, 16) + 1;
        if (zzj2 == 1) {
            zzetVar.zzh(zzf * 7);
            return;
        }
        if (zzj2 == 2) {
            boolean zzi = zzetVar.zzi();
            int i = true != zzi ? 5 : 1;
            int i2 = true == zzi ? 7 : 5;
            int i3 = true == zzi ? 8 : 6;
            int i4 = 0;
            while (i4 < zzf) {
                if (zzetVar.zzi()) {
                    zzetVar.zzh(7);
                    zzj = 0;
                } else {
                    if (zzetVar.zzj(2) == 3 && zzetVar.zzj(i2) * i != 0) {
                        zzetVar.zzg();
                    }
                    zzj = zzetVar.zzj(i3) * i;
                    if (zzj != 0 && zzj != 180) {
                        zzetVar.zzg();
                    }
                    zzetVar.zzg();
                }
                if (zzj != 0 && zzj != 180 && zzetVar.zzi()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    private static boolean zzd(zzet zzetVar) {
        zzetVar.zzh(3);
        boolean zzi = zzetVar.zzi();
        if (zzi) {
            zzetVar.zzh(13);
        }
        return zzi;
    }

    private static void zze(zzet zzetVar) {
        zzetVar.zzh(3);
        zzetVar.zzh(8);
        boolean zzi = zzetVar.zzi();
        boolean zzi2 = zzetVar.zzi();
        if (zzi) {
            zzetVar.zzh(5);
        }
        if (zzi2) {
            zzetVar.zzh(6);
        }
    }

    private static int zzf(zzet zzetVar, int i, int i2, int i3) {
        zzguk.zza(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        Math.addExact(Math.addExact(i4, i5), 1 << i3);
        if (zzetVar.zzc() < i) {
            return -1;
        }
        int zzj = zzetVar.zzj(i);
        if (zzj != i4) {
            return zzj;
        }
        if (zzetVar.zzc() < i2) {
            return -1;
        }
        int zzj2 = zzetVar.zzj(i2);
        int i6 = zzj + zzj2;
        if (zzj2 != i5) {
            return i6;
        }
        if (zzetVar.zzc() < i3) {
            return -1;
        }
        return i6 + zzetVar.zzj(i3);
    }
}

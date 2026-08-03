package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaqj {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(com.google.android.gms.internal.ads.zzes zzesVar, com.google.android.gms.internal.ads.zzaqh zzaqhVar) throws com.google.android.gms.internal.ads.zzat {
        long zzk;
        zzesVar.zze();
        int zzf = zzf(zzesVar, 3, 8, 8);
        zzaqhVar.zza = zzf;
        if (zzf == -1) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgtj.zza(java.lang.Math.max(java.lang.Math.max(2, 8), 32) <= 63);
        com.google.android.gms.internal.ads.zzet$$ExternalSyntheticBackport0.m(com.google.android.gms.internal.ads.zzet$$ExternalSyntheticBackport0.m(3L, 255L), 4294967296L);
        if (zzesVar.zzc() >= 2) {
            zzk = zzesVar.zzk(2);
            if (zzk == 3) {
                if (zzesVar.zzc() >= 8) {
                    long zzk2 = zzesVar.zzk(8);
                    long j = 3 + zzk2;
                    if (zzk2 != 255) {
                        zzk = j;
                    } else if (zzesVar.zzc() >= 32) {
                        zzk = zzesVar.zzk(32) + j;
                    }
                }
            }
            zzaqhVar.zzb = zzk;
            if (zzk != -1) {
                return false;
            }
            if (zzk > 16) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzk).length() + 49);
                sb.append("Contains sub-stream with an invalid packet label ");
                sb.append(zzk);
                throw com.google.android.gms.internal.ads.zzat.zzc(sb.toString());
            }
            if (zzk == 0) {
                int i = zzaqhVar.zza;
                if (i == 1) {
                    throw com.google.android.gms.internal.ads.zzat.zzb("Mpegh3daConfig packet with invalid packet label 0", null);
                }
                if (i == 2) {
                    throw com.google.android.gms.internal.ads.zzat.zzb("Mpegh3daFrame packet with invalid packet label 0", null);
                }
                if (i == 17) {
                    throw com.google.android.gms.internal.ads.zzat.zzb("AudioTruncation packet with invalid packet label 0", null);
                }
            }
            int zzf2 = zzf(zzesVar, 11, 24, 24);
            zzaqhVar.zzc = zzf2;
            return zzf2 != -1;
        }
        zzk = -1;
        zzaqhVar.zzb = zzk;
        if (zzk != -1) {
        }
    }

    public static com.google.android.gms.internal.ads.zzaqi zzb(com.google.android.gms.internal.ads.zzes zzesVar) throws com.google.android.gms.internal.ads.zzat {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        char c2;
        int zzj = zzesVar.zzj(8);
        int i5 = 5;
        int zzj2 = zzesVar.zzj(5);
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
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzj2).length() + 32);
                    sb.append("Unsupported sampling rate index ");
                    sb.append(zzj2);
                    throw com.google.android.gms.internal.ads.zzat.zzc(sb.toString());
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
                    i = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
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
            i = zzesVar.zzj(24);
        }
        int zzj3 = zzesVar.zzj(3);
        int i6 = 1;
        if (zzj3 == 0) {
            i2 = 768;
        } else if (zzj3 == 1) {
            i2 = 1024;
        } else if (zzj3 == 2 || zzj3 == 3) {
            i2 = 2048;
        } else {
            if (zzj3 != 4) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(zzj3).length() + 36);
                sb2.append("Unsupported coreSbrFrameLengthIndex ");
                sb2.append(zzj3);
                throw com.google.android.gms.internal.ads.zzat.zzc(sb2.toString());
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
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(zzj3).length() + 36);
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(zzj3);
                throw com.google.android.gms.internal.ads.zzat.zzc(sb3.toString());
            }
            c = 1;
        }
        zzesVar.zzh(2);
        zzc(zzesVar);
        int zzj4 = zzesVar.zzj(5);
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = 16;
            if (i7 < zzj4 + 1) {
                int zzj5 = zzesVar.zzj(3);
                i8 += zzf(zzesVar, 5, 8, 16) + 1;
                if ((zzj5 == 0 || zzj5 == 2) && zzesVar.zzi()) {
                    zzc(zzesVar);
                }
                i7++;
            } else {
                int zzf = zzf(zzesVar, 4, 8, 16) + 1;
                zzesVar.zzg();
                int i10 = 0;
                while (true) {
                    double d = 2.0d;
                    if (i10 >= zzf) {
                        int i11 = zzj;
                        byte[] bArr = null;
                        if (zzesVar.zzi()) {
                            int zzf2 = zzf(zzesVar, 2, 4, 8) + 1;
                            for (int i12 = 0; i12 < zzf2; i12++) {
                                int zzf3 = zzf(zzesVar, 4, 8, 16);
                                int zzf4 = zzf(zzesVar, 4, 8, 16);
                                if (zzf3 == 7) {
                                    int zzj6 = zzesVar.zzj(4) + 1;
                                    zzesVar.zzh(4);
                                    byte[] bArr2 = new byte[zzj6];
                                    for (int i13 = 0; i13 < zzj6; i13++) {
                                        bArr2[i13] = (byte) zzesVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzesVar.zzh(zzf4 * 8);
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
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 26);
                                sb4.append("Unsupported sampling rate ");
                                sb4.append(i);
                                throw com.google.android.gms.internal.ads.zzat.zzc(sb4.toString());
                        }
                        return new com.google.android.gms.internal.ads.zzaqi(i11, (int) (i * d), (int) (i2 * d), bArr3, null);
                    }
                    int zzj7 = zzesVar.zzj(2);
                    if (zzj7 == 0) {
                        i3 = zzj;
                        zzd(zzesVar);
                        if (c > 0) {
                            zze(zzesVar);
                        }
                    } else if (zzj7 != i6) {
                        if (zzj7 == 3) {
                            zzf(zzesVar, 4, 8, i9);
                            int zzf5 = zzf(zzesVar, 4, 8, i9);
                            if (zzesVar.zzi()) {
                                zzf(zzesVar, 8, i9, 0);
                            }
                            zzesVar.zzg();
                            if (zzf5 > 0) {
                                zzesVar.zzh(zzf5 * 8);
                            }
                        }
                        i3 = zzj;
                    } else {
                        if (zzd(zzesVar)) {
                            zzesVar.zzg();
                        }
                        if (c > 0) {
                            zze(zzesVar);
                            i4 = zzesVar.zzj(2);
                            c2 = c;
                        } else {
                            i4 = 0;
                            c2 = 0;
                        }
                        if (i4 > 0) {
                            zzesVar.zzh(6);
                            int zzj8 = zzesVar.zzj(2);
                            zzesVar.zzh(4);
                            if (zzesVar.zzi()) {
                                zzesVar.zzh(i5);
                            }
                            if (i4 == 2 || i4 == 3) {
                                zzesVar.zzh(6);
                            }
                            if (zzj8 == 2) {
                                zzesVar.zzg();
                            }
                        }
                        i3 = zzj;
                        int floor = ((int) java.lang.Math.floor(java.lang.Math.log(i8 - 1) / java.lang.Math.log(2.0d))) + 1;
                        int zzj9 = zzesVar.zzj(2);
                        if (zzj9 > 0 && zzesVar.zzi()) {
                            zzesVar.zzh(floor);
                        }
                        if (zzesVar.zzi()) {
                            zzesVar.zzh(floor);
                        }
                        if (c2 == 0 && zzj9 == 0) {
                            zzesVar.zzg();
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

    private static void zzc(com.google.android.gms.internal.ads.zzes zzesVar) {
        int zzj;
        int zzj2 = zzesVar.zzj(2);
        if (zzj2 == 0) {
            zzesVar.zzh(6);
            return;
        }
        int zzf = zzf(zzesVar, 5, 8, 16) + 1;
        if (zzj2 == 1) {
            zzesVar.zzh(zzf * 7);
            return;
        }
        if (zzj2 == 2) {
            boolean zzi = zzesVar.zzi();
            int i = true != zzi ? 5 : 1;
            int i2 = true == zzi ? 7 : 5;
            int i3 = true == zzi ? 8 : 6;
            int i4 = 0;
            while (i4 < zzf) {
                if (zzesVar.zzi()) {
                    zzesVar.zzh(7);
                    zzj = 0;
                } else {
                    if (zzesVar.zzj(2) == 3 && zzesVar.zzj(i2) * i != 0) {
                        zzesVar.zzg();
                    }
                    zzj = zzesVar.zzj(i3) * i;
                    if (zzj != 0 && zzj != 180) {
                        zzesVar.zzg();
                    }
                    zzesVar.zzg();
                }
                if (zzj != 0 && zzj != 180 && zzesVar.zzi()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    private static boolean zzd(com.google.android.gms.internal.ads.zzes zzesVar) {
        zzesVar.zzh(3);
        boolean zzi = zzesVar.zzi();
        if (zzi) {
            zzesVar.zzh(13);
        }
        return zzi;
    }

    private static void zze(com.google.android.gms.internal.ads.zzes zzesVar) {
        zzesVar.zzh(3);
        zzesVar.zzh(8);
        boolean zzi = zzesVar.zzi();
        boolean zzi2 = zzesVar.zzi();
        if (zzi) {
            zzesVar.zzh(5);
        }
        if (zzi2) {
            zzesVar.zzh(6);
        }
    }

    private static int zzf(com.google.android.gms.internal.ads.zzes zzesVar, int i, int i2, int i3) {
        com.google.android.gms.internal.ads.zzgtj.zza(java.lang.Math.max(java.lang.Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        com.google.android.gms.internal.ads.zzet$$ExternalSyntheticBackport0.m(com.google.android.gms.internal.ads.zzet$$ExternalSyntheticBackport0.m(i4, i5), 1 << i3);
        if (zzesVar.zzc() < i) {
            return -1;
        }
        int zzj = zzesVar.zzj(i);
        if (zzj != i4) {
            return zzj;
        }
        if (zzesVar.zzc() < i2) {
            return -1;
        }
        int zzj2 = zzesVar.zzj(i2);
        int i6 = zzj + zzj2;
        if (zzj2 != i5) {
            return i6;
        }
        if (zzesVar.zzc() < i3) {
            return -1;
        }
        return i6 + zzesVar.zzj(i3);
    }
}

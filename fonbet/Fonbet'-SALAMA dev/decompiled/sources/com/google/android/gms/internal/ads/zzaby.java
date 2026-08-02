package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbd;

/* loaded from: classes.dex */
public final class zzaby {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, zzbbd.zzq.zzf, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzz zza(zzed zzedVar, String str, String str2, zzs zzsVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean zzp;
        int zzd;
        int zzd2;
        int i13;
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        zzec zzecVar = new zzec();
        zzecVar.zzj(zzedVar);
        int zza2 = zzecVar.zza();
        int zzd3 = zzecVar.zzd(3);
        if (zzd3 > 1) {
            throw zzaz.zzc("Unsupported AC-4 DSI version: " + zzd3);
        }
        int zzd4 = zzecVar.zzd(7);
        int i18 = true != zzecVar.zzp() ? 44100 : 48000;
        zzecVar.zzn(4);
        int zzd5 = zzecVar.zzd(9);
        if (zzd4 > 1) {
            if (zzd3 == 0) {
                throw zzaz.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzecVar.zzp()) {
                zzecVar.zzn(16);
                if (zzecVar.zzp()) {
                    zzecVar.zzn(128);
                }
            }
        }
        if (zzd3 == 1) {
            if (!zzg(zzecVar)) {
                throw zzaz.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzecVar.zzf();
        }
        zzabv zzabvVar = new zzabv(null);
        for (int i19 = 0; i19 < zzd5; i19++) {
            if (zzd3 == 0) {
                zzp = zzecVar.zzp();
                zzd = zzecVar.zzd(5);
                zzd2 = zzecVar.zzd(5);
                i13 = 0;
                z4 = false;
                i14 = 0;
            } else {
                int zzd6 = zzecVar.zzd(8);
                i14 = zzecVar.zzd(8);
                if (i14 == 255) {
                    i14 = zzecVar.zzd(16) + 255;
                }
                if (zzd6 > 2) {
                    zzecVar.zzn(i14 * 8);
                } else {
                    i13 = (zza2 - zzecVar.zza()) / 8;
                    int zzd7 = zzecVar.zzd(5);
                    z4 = zzd7 == 31;
                    zzd2 = zzd6;
                    zzd = zzd7;
                    zzp = false;
                }
            }
            if (zzp || z4 || zzd != 6) {
                zzabvVar.zzf = zzecVar.zzd(3);
                if (zzecVar.zzp()) {
                    zzecVar.zzn(5);
                }
                zzecVar.zzn(2);
                if (zzd3 == 1) {
                    if (zzd2 != 1) {
                        if (zzd2 == 2) {
                            zzd2 = 2;
                        }
                    }
                    zzecVar.zzn(2);
                }
                zzecVar.zzn(5);
                zzecVar.zzn(10);
                if (zzd3 == 1) {
                    if (zzd2 > 0) {
                        zzabvVar.zza = zzecVar.zzp();
                    }
                    if (zzabvVar.zza) {
                        if (zzd2 == 1) {
                            i17 = 1;
                        } else if (zzd2 == 2) {
                            i17 = 2;
                        } else {
                            i15 = 2;
                            i17 = zzd2;
                            zzecVar.zzn(24);
                            i16 = 1;
                        }
                        int zzd8 = zzecVar.zzd(5);
                        if (zzd8 >= 0 && zzd8 <= 15) {
                            zzabvVar.zzb = zzd8;
                        }
                        if (zzd8 < 11 || zzd8 > 14) {
                            i15 = 2;
                        } else {
                            zzabvVar.zzd = zzecVar.zzp();
                            i15 = 2;
                            zzabvVar.zze = zzecVar.zzd(2);
                        }
                        zzecVar.zzn(24);
                        i16 = 1;
                    } else {
                        i15 = 2;
                        i16 = 1;
                        i17 = zzd2;
                    }
                    if (zzd2 == i16 || zzd2 == i15) {
                        if (zzecVar.zzp() && zzecVar.zzp()) {
                            zzecVar.zzn(i15);
                        }
                        if (zzecVar.zzp()) {
                            zzecVar.zzm();
                            int i20 = 8;
                            int zzd9 = zzecVar.zzd(8);
                            int i21 = 0;
                            while (i21 < zzd9) {
                                zzecVar.zzn(i20);
                                i21++;
                                i20 = 8;
                            }
                        }
                    }
                    zzd2 = i17;
                }
                if (zzp || z4) {
                    i8 = 2;
                    if (zzd2 == 0) {
                        zzd(zzecVar, zzabvVar);
                        zzd2 = 0;
                        zzecVar.zzm();
                        if (!zzecVar.zzp()) {
                            i10 = 7;
                            if (zzd2 > 0) {
                                if (zzecVar.zzp() && !zzg(zzecVar)) {
                                    throw zzaz.zzc("Can't parse bitrate DSI.");
                                }
                                if (zzecVar.zzp()) {
                                    zzecVar.zzf();
                                    zzecVar.zzo(zzecVar.zzd(16));
                                    int zzd10 = zzecVar.zzd(5);
                                    for (int i22 = 0; i22 < zzd10; i22++) {
                                        zzecVar.zzn(3);
                                        zzecVar.zzn(8);
                                    }
                                }
                            }
                            i7 = 3;
                            i11 = 8;
                            zzecVar.zzf();
                            if (zzd3 == 1) {
                                int zza3 = ((zza2 - zzecVar.zza()) / 8) - i13;
                                if (i14 < zza3) {
                                    throw zzaz.zzc("pres_bytes is smaller than presentation bytes read.");
                                }
                                zzecVar.zzo(i14 - zza3);
                            }
                            if (zzabvVar.zza) {
                                i9 = -1;
                            } else {
                                i9 = -1;
                                if (zzabvVar.zzb == -1) {
                                    throw zzaz.zzc("Can't determine channel mode of presentation " + i19);
                                }
                            }
                            if (zzabvVar.zza) {
                                int i23 = zzabvVar.zzb;
                                boolean z7 = zzabvVar.zzd;
                                int i24 = zzabvVar.zze;
                                switch (i23) {
                                    case 0:
                                        i12 = 11;
                                        i8 = 1;
                                        break;
                                    case 1:
                                        i12 = 11;
                                        break;
                                    case 2:
                                        i8 = i7;
                                        i12 = 11;
                                        break;
                                    case 3:
                                        i8 = 5;
                                        i12 = 11;
                                        break;
                                    case 4:
                                        i12 = 11;
                                        i8 = 6;
                                        break;
                                    case 5:
                                    case 7:
                                    case 9:
                                        i8 = i10;
                                        i12 = 11;
                                        break;
                                    case 6:
                                    case 8:
                                    case 10:
                                        i8 = i11;
                                        i12 = 11;
                                        break;
                                    case 11:
                                        i12 = 11;
                                        i8 = 11;
                                        break;
                                    case 12:
                                        i8 = 12;
                                        i12 = 11;
                                        break;
                                    case 13:
                                        i8 = 13;
                                        i12 = 11;
                                        break;
                                    case 14:
                                        i12 = 11;
                                        i8 = 14;
                                        break;
                                    case 15:
                                        i12 = 11;
                                        i8 = 24;
                                        break;
                                    default:
                                        i8 = i9;
                                        i12 = 11;
                                        break;
                                }
                                if (i23 == i12 || i23 == 12 || i23 == 13 || i23 == 14) {
                                    if (!z7) {
                                        i8 -= 2;
                                    }
                                    if (i24 == 0) {
                                        i8 -= 4;
                                    } else if (i24 == 1) {
                                        i8 -= 2;
                                    }
                                }
                            } else {
                                i8 = zzabvVar.zzc + 1;
                                if (zzabvVar.zzf == 4 && i8 == 17) {
                                    i8 = 21;
                                }
                            }
                            if (i8 <= 0) {
                                throw zzaz.zzc("Can't determine channel count of presentation.");
                            }
                            zzx zzxVar = new zzx();
                            zzxVar.zzO(str);
                            zzxVar.zzad("audio/ac4");
                            zzxVar.zzB(i8);
                            zzxVar.zzae(i18);
                            zzxVar.zzH(zzsVar);
                            zzxVar.zzS(str2);
                            return zzxVar.zzaj();
                        }
                    } else {
                        zze(zzecVar, zzabvVar);
                        zzecVar.zzm();
                        if (!zzecVar.zzp()) {
                        }
                    }
                } else {
                    zzecVar.zzm();
                    if (zzd == 0 || zzd == 1 || zzd == 2) {
                        if (zzd2 == 0) {
                            i8 = 2;
                            for (int i25 = 0; i25 < 2; i25++) {
                                zzd(zzecVar, zzabvVar);
                            }
                            zzd2 = 0;
                            zzecVar.zzm();
                            if (!zzecVar.zzp()) {
                            }
                        } else {
                            i8 = 2;
                            for (int i26 = 0; i26 < 2; i26++) {
                                zze(zzecVar, zzabvVar);
                            }
                            zzecVar.zzm();
                            if (!zzecVar.zzp()) {
                            }
                        }
                    } else if (zzd != 3 && zzd != 4) {
                        if (zzd != 5) {
                            int zzd11 = zzecVar.zzd(7);
                            for (int i27 = 0; i27 < zzd11; i27++) {
                                zzecVar.zzn(8);
                            }
                        } else if (zzd2 == 0) {
                            zzd(zzecVar, zzabvVar);
                            i8 = 2;
                            zzd2 = 0;
                            zzecVar.zzm();
                            if (!zzecVar.zzp()) {
                            }
                        } else {
                            int zzd12 = zzecVar.zzd(3);
                            for (int i28 = 0; i28 < zzd12 + 2; i28++) {
                                zze(zzecVar, zzabvVar);
                            }
                        }
                        i8 = 2;
                        zzecVar.zzm();
                        if (!zzecVar.zzp()) {
                        }
                    } else if (zzd2 == 0) {
                        for (int i29 = 0; i29 < 3; i29++) {
                            zzd(zzecVar, zzabvVar);
                        }
                        i8 = 2;
                        zzd2 = 0;
                        zzecVar.zzm();
                        if (!zzecVar.zzp()) {
                        }
                    } else {
                        int i30 = 0;
                        for (int i31 = 3; i30 < i31; i31 = 3) {
                            zze(zzecVar, zzabvVar);
                            i30++;
                        }
                        i8 = 2;
                        zzecVar.zzm();
                        if (!zzecVar.zzp()) {
                        }
                    }
                }
            } else {
                i8 = 2;
            }
            i10 = 7;
            int zzd13 = zzecVar.zzd(7);
            for (int i32 = 0; i32 < zzd13; i32++) {
                zzecVar.zzn(15);
            }
            if (zzd2 > 0) {
            }
            i7 = 3;
            i11 = 8;
            zzecVar.zzf();
            if (zzd3 == 1) {
            }
            if (zzabvVar.zza) {
            }
            if (zzabvVar.zza) {
            }
            if (i8 <= 0) {
            }
        }
        i7 = 3;
        i8 = 2;
        i9 = -1;
        i10 = 7;
        i11 = 8;
        if (zzabvVar.zza) {
        }
        if (i8 <= 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        if (r12 != 11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        if (r12 != 11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        if (r12 != 8) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzabw zzb(zzec zzecVar) {
        int i7;
        int i8;
        int i9;
        int zzd;
        int zzd2 = zzecVar.zzd(16);
        int zzd3 = zzecVar.zzd(16);
        if (zzd3 == 65535) {
            zzd3 = zzecVar.zzd(24);
            i7 = 7;
        } else {
            i7 = 4;
        }
        int i10 = zzd3 + i7;
        if (zzd2 == 44097) {
            i10 += 2;
        }
        int i11 = i10;
        int zzd4 = zzecVar.zzd(2);
        int i12 = 0;
        if (zzd4 == 3) {
            int i13 = 0;
            while (true) {
                zzd = zzecVar.zzd(2) + i13;
                if (!zzecVar.zzp()) {
                    break;
                }
                i13 = (zzd + 1) << 2;
            }
            i8 = zzd + 3;
        } else {
            i8 = zzd4;
        }
        int zzd5 = zzecVar.zzd(10);
        if (zzecVar.zzp() && zzecVar.zzd(3) > 0) {
            zzecVar.zzn(2);
        }
        int i14 = true != zzecVar.zzp() ? 44100 : 48000;
        int zzd6 = zzecVar.zzd(4);
        if (i14 == 44100 && zzd6 == 13) {
            i9 = zzb[13];
        } else {
            if (i14 == 48000 && zzd6 < 14) {
                i12 = zzb[zzd6];
                int i15 = zzd5 % 5;
                if (i15 != 1) {
                    if (i15 == 2) {
                        if (zzd6 != 8) {
                        }
                        i12++;
                    } else if (i15 != 3) {
                        if (i15 == 4) {
                            if (zzd6 != 3) {
                                if (zzd6 != 8) {
                                }
                            }
                            i12++;
                        }
                    }
                }
                if (zzd6 != 3) {
                }
                i12++;
            }
            i9 = i12;
        }
        return new zzabw(i8, 2, i14, i11, i9, null);
    }

    public static void zzc(int i7, zzed zzedVar) {
        zzedVar.zzI(7);
        byte[] zzN = zzedVar.zzN();
        zzN[0] = -84;
        zzN[1] = 64;
        zzN[2] = -1;
        zzN[3] = -1;
        zzN[4] = (byte) ((i7 >> 16) & 255);
        zzN[5] = (byte) ((i7 >> 8) & 255);
        zzN[6] = (byte) (i7 & 255);
    }

    private static void zzd(zzec zzecVar, zzabv zzabvVar) {
        int zzd = zzecVar.zzd(5);
        zzecVar.zzn(2);
        if (zzecVar.zzp()) {
            zzecVar.zzn(5);
        }
        if (zzd >= 7 && zzd <= 10) {
            zzecVar.zzm();
        }
        if (zzecVar.zzp()) {
            int zzd2 = zzecVar.zzd(3);
            if (zzabvVar.zzb == -1 && zzd >= 0 && zzd <= 15 && (zzd2 == 0 || zzd2 == 1)) {
                zzabvVar.zzb = zzd;
            }
            if (zzecVar.zzp()) {
                zzf(zzecVar);
            }
        }
    }

    private static void zze(zzec zzecVar, zzabv zzabvVar) {
        zzecVar.zzn(2);
        boolean zzp = zzecVar.zzp();
        int zzd = zzecVar.zzd(8);
        for (int i7 = 0; i7 < zzd; i7++) {
            zzecVar.zzn(2);
            if (zzecVar.zzp()) {
                zzecVar.zzn(5);
            }
            if (zzp) {
                zzecVar.zzn(24);
            } else {
                if (zzecVar.zzp()) {
                    if (!zzecVar.zzp()) {
                        zzecVar.zzn(4);
                    }
                    zzabvVar.zzc = zzecVar.zzd(6) + 1;
                }
                zzecVar.zzn(4);
            }
        }
        if (zzecVar.zzp()) {
            zzecVar.zzn(3);
            if (zzecVar.zzp()) {
                zzf(zzecVar);
            }
        }
    }

    private static void zzf(zzec zzecVar) {
        int zzd = zzecVar.zzd(6);
        if (zzd < 2 || zzd > 42) {
            throw zzaz.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(zzd)));
        }
        zzecVar.zzn(zzd * 8);
    }

    private static boolean zzg(zzec zzecVar) {
        if (zzecVar.zza() < 66) {
            return false;
        }
        zzecVar.zzn(66);
        return true;
    }
}

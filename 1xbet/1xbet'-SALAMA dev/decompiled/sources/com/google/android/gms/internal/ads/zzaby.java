package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzaby {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, zzbbd.zzq.zzf, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:144:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:146:0x0204  */
    /* JADX WARN: Code duplicated, block: B:153:0x0218  */
    /* JADX WARN: Code duplicated, block: B:155:0x022b A[LOOP:2: B:154:0x0229->B:155:0x022b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x0240  */
    /* JADX WARN: Code duplicated, block: B:160:0x0249  */
    /* JADX WARN: Code duplicated, block: B:161:0x024e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0259  */
    /* JADX WARN: Code duplicated, block: B:168:0x025f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0272  */
    /* JADX WARN: Instruction removed from duplicated block: B:168:0x025f, please report this as an issue */
    public static zzz zza(zzed zzedVar, String str, String str2, zzs zzsVar) throws zzaz {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean zZzp;
        int iZzd;
        int iZzd2;
        int iZza;
        boolean z4;
        int iZzd3;
        int i13;
        int i14;
        int i15;
        int iZza2;
        int iZzd4;
        int i16;
        zzec zzecVar = new zzec();
        zzecVar.zzj(zzedVar);
        int iZza3 = zzecVar.zza();
        int iZzd5 = zzecVar.zzd(3);
        if (iZzd5 > 1) {
            throw zzaz.zzc("Unsupported AC-4 DSI version: " + iZzd5);
        }
        int iZzd6 = zzecVar.zzd(7);
        int i17 = true != zzecVar.zzp() ? 44100 : 48000;
        zzecVar.zzn(4);
        int iZzd7 = zzecVar.zzd(9);
        if (iZzd6 > 1) {
            if (iZzd5 == 0) {
                throw zzaz.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzecVar.zzp()) {
                zzecVar.zzn(16);
                if (zzecVar.zzp()) {
                    zzecVar.zzn(128);
                }
            }
        }
        if (iZzd5 == 1) {
            if (!zzg(zzecVar)) {
                throw zzaz.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzecVar.zzf();
        }
        zzabv zzabvVar = new zzabv(null);
        int i18 = 0;
        while (true) {
            if (i18 < iZzd7) {
                if (iZzd5 == 0) {
                    zZzp = zzecVar.zzp();
                    iZzd = zzecVar.zzd(5);
                    iZzd2 = zzecVar.zzd(5);
                    iZza = 0;
                    z4 = false;
                    iZzd3 = 0;
                } else {
                    int iZzd8 = zzecVar.zzd(8);
                    iZzd3 = zzecVar.zzd(8);
                    if (iZzd3 == 255) {
                        iZzd3 = zzecVar.zzd(16) + 255;
                    }
                    if (iZzd8 > 2) {
                        zzecVar.zzn(iZzd3 * 8);
                        i18++;
                    } else {
                        iZza = (iZza3 - zzecVar.zza()) / 8;
                        int iZzd9 = zzecVar.zzd(5);
                        z4 = iZzd9 == 31;
                        iZzd2 = iZzd8;
                        iZzd = iZzd9;
                        zZzp = false;
                    }
                }
                if (zZzp || z4 || iZzd != 6) {
                    zzabvVar.zzf = zzecVar.zzd(3);
                    if (zzecVar.zzp()) {
                        zzecVar.zzn(5);
                    }
                    zzecVar.zzn(2);
                    if (iZzd5 == 1) {
                        if (iZzd2 == 1) {
                            zzecVar.zzn(2);
                        } else {
                            if (iZzd2 == 2) {
                                iZzd2 = 2;
                                zzecVar.zzn(2);
                            }
                            if (iZzd2 > 0) {
                                if (!zzecVar.zzp() && !zzg(zzecVar)) {
                                    throw zzaz.zzc("Can't parse bitrate DSI.");
                                }
                                if (zzecVar.zzp()) {
                                    zzecVar.zzf();
                                    zzecVar.zzo(zzecVar.zzd(16));
                                    iZzd4 = zzecVar.zzd(5);
                                    for (i16 = 0; i16 < iZzd4; i16++) {
                                        zzecVar.zzn(3);
                                        zzecVar.zzn(8);
                                    }
                                }
                            }
                            i7 = 3;
                            i11 = 8;
                            zzecVar.zzf();
                            if (iZzd5 == 1) {
                                iZza2 = ((iZza3 - zzecVar.zza()) / 8) - iZza;
                                if (iZzd3 < iZza2) {
                                    throw zzaz.zzc("pres_bytes is smaller than presentation bytes read.");
                                }
                                zzecVar.zzo(iZzd3 - iZza2);
                            }
                            if (zzabvVar.zza) {
                                i9 = -1;
                                if (zzabvVar.zzb == -1) {
                                    throw zzaz.zzc("Can't determine channel mode of presentation " + i18);
                                }
                            } else {
                                i9 = -1;
                            }
                        }
                    }
                    zzecVar.zzn(5);
                    zzecVar.zzn(10);
                    if (iZzd5 == 1) {
                        if (iZzd2 > 0) {
                            zzabvVar.zza = zzecVar.zzp();
                        }
                        if (zzabvVar.zza) {
                            if (iZzd2 != 1) {
                                if (iZzd2 == 2) {
                                    i15 = 2;
                                } else {
                                    i13 = 2;
                                    i15 = iZzd2;
                                }
                                zzecVar.zzn(24);
                                i14 = 1;
                            } else {
                                i15 = 1;
                            }
                            int iZzd10 = zzecVar.zzd(5);
                            if (iZzd10 >= 0 && iZzd10 <= 15) {
                                zzabvVar.zzb = iZzd10;
                            }
                            if (iZzd10 < 11 || iZzd10 > 14) {
                                i13 = 2;
                            } else {
                                zzabvVar.zzd = zzecVar.zzp();
                                i13 = 2;
                                zzabvVar.zze = zzecVar.zzd(2);
                            }
                            zzecVar.zzn(24);
                            i14 = 1;
                        } else {
                            i13 = 2;
                            i14 = 1;
                            i15 = iZzd2;
                        }
                        if (iZzd2 == i14 || iZzd2 == i13) {
                            if (zzecVar.zzp() && zzecVar.zzp()) {
                                zzecVar.zzn(i13);
                            }
                            if (zzecVar.zzp()) {
                                zzecVar.zzm();
                                int i19 = 8;
                                int iZzd11 = zzecVar.zzd(8);
                                int i20 = 0;
                                while (i20 < iZzd11) {
                                    zzecVar.zzn(i19);
                                    i20++;
                                    i19 = 8;
                                }
                            }
                        }
                        iZzd2 = i15;
                    }
                    if (zZzp || z4) {
                        i8 = 2;
                        if (iZzd2 == 0) {
                            zzd(zzecVar, zzabvVar);
                            iZzd2 = 0;
                        } else {
                            zze(zzecVar, zzabvVar);
                        }
                    } else {
                        zzecVar.zzm();
                        if (iZzd == 0 || iZzd == 1 || iZzd == 2) {
                            if (iZzd2 == 0) {
                                i8 = 2;
                                for (int i21 = 0; i21 < 2; i21++) {
                                    zzd(zzecVar, zzabvVar);
                                }
                                iZzd2 = 0;
                            } else {
                                i8 = 2;
                                for (int i22 = 0; i22 < 2; i22++) {
                                    zze(zzecVar, zzabvVar);
                                }
                            }
                        } else if (iZzd != 3 && iZzd != 4) {
                            if (iZzd != 5) {
                                int iZzd12 = zzecVar.zzd(7);
                                for (int i23 = 0; i23 < iZzd12; i23++) {
                                    zzecVar.zzn(8);
                                }
                            } else if (iZzd2 == 0) {
                                zzd(zzecVar, zzabvVar);
                                i8 = 2;
                                iZzd2 = 0;
                            } else {
                                int iZzd13 = zzecVar.zzd(3);
                                for (int i24 = 0; i24 < iZzd13 + 2; i24++) {
                                    zze(zzecVar, zzabvVar);
                                }
                            }
                            i8 = 2;
                        } else if (iZzd2 == 0) {
                            for (int i25 = 0; i25 < 3; i25++) {
                                zzd(zzecVar, zzabvVar);
                            }
                            i8 = 2;
                            iZzd2 = 0;
                        } else {
                            int i26 = 0;
                            for (int i27 = 3; i26 < i27; i27 = 3) {
                                zze(zzecVar, zzabvVar);
                                i26++;
                            }
                            i8 = 2;
                        }
                    }
                    zzecVar.zzm();
                    if (!zzecVar.zzp()) {
                        i10 = 7;
                    }
                    if (iZzd2 > 0) {
                        if (!zzecVar.zzp()) {
                        }
                        if (zzecVar.zzp()) {
                            zzecVar.zzf();
                            zzecVar.zzo(zzecVar.zzd(16));
                            iZzd4 = zzecVar.zzd(5);
                            while (i16 < iZzd4) {
                                zzecVar.zzn(3);
                                zzecVar.zzn(8);
                            }
                        }
                    }
                    i7 = 3;
                    i11 = 8;
                    zzecVar.zzf();
                    if (iZzd5 == 1) {
                        iZza2 = ((iZza3 - zzecVar.zza()) / 8) - iZza;
                        if (iZzd3 < iZza2) {
                            throw zzaz.zzc("pres_bytes is smaller than presentation bytes read.");
                        }
                        zzecVar.zzo(iZzd3 - iZza2);
                    }
                    if (zzabvVar.zza) {
                        i9 = -1;
                        if (zzabvVar.zzb == -1) {
                            throw zzaz.zzc("Can't determine channel mode of presentation " + i18);
                        }
                    } else {
                        i9 = -1;
                    }
                } else {
                    i8 = 2;
                }
                i10 = 7;
                int iZzd14 = zzecVar.zzd(7);
                for (int i28 = 0; i28 < iZzd14; i28++) {
                    zzecVar.zzn(15);
                }
                if (iZzd2 > 0) {
                    if (!zzecVar.zzp()) {
                    }
                    if (zzecVar.zzp()) {
                        zzecVar.zzf();
                        zzecVar.zzo(zzecVar.zzd(16));
                        iZzd4 = zzecVar.zzd(5);
                        while (i16 < iZzd4) {
                            zzecVar.zzn(3);
                            zzecVar.zzn(8);
                        }
                    }
                }
                i7 = 3;
                i11 = 8;
                zzecVar.zzf();
                if (iZzd5 == 1) {
                    iZza2 = ((iZza3 - zzecVar.zza()) / 8) - iZza;
                    if (iZzd3 < iZza2) {
                        throw zzaz.zzc("pres_bytes is smaller than presentation bytes read.");
                    }
                    zzecVar.zzo(iZzd3 - iZza2);
                }
                if (zzabvVar.zza) {
                    i9 = -1;
                    if (zzabvVar.zzb == -1) {
                        throw zzaz.zzc("Can't determine channel mode of presentation " + i18);
                    }
                } else {
                    i9 = -1;
                }
            } else {
                i7 = 3;
                i8 = 2;
                i9 = -1;
                i10 = 7;
                i11 = 8;
            }
            if (zzabvVar.zza) {
                int i29 = zzabvVar.zzb;
                boolean z7 = zzabvVar.zzd;
                int i30 = zzabvVar.zze;
                switch (i29) {
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
                if (i29 == i12 || i29 == 12 || i29 == 13 || i29 == 14) {
                    if (!z7) {
                        i8 -= 2;
                    }
                    if (i30 == 0) {
                        i8 -= 4;
                    } else if (i30 == 1) {
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
            zzxVar.zzae(i17);
            zzxVar.zzH(zzsVar);
            zzxVar.zzS(str2);
            return zzxVar.zzaj();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    public static zzabw zzb(zzec zzecVar) {
        int i7;
        int i8;
        int i9;
        int iZzd;
        int iZzd2 = zzecVar.zzd(16);
        int iZzd3 = zzecVar.zzd(16);
        if (iZzd3 == 65535) {
            iZzd3 = zzecVar.zzd(24);
            i7 = 7;
        } else {
            i7 = 4;
        }
        int i10 = iZzd3 + i7;
        if (iZzd2 == 44097) {
            i10 += 2;
        }
        int i11 = i10;
        int iZzd4 = zzecVar.zzd(2);
        int i12 = 0;
        if (iZzd4 == 3) {
            int i13 = 0;
            while (true) {
                iZzd = zzecVar.zzd(2) + i13;
                if (!zzecVar.zzp()) {
                    break;
                }
                i13 = (iZzd + 1) << 2;
            }
            i8 = iZzd + 3;
        } else {
            i8 = iZzd4;
        }
        int iZzd5 = zzecVar.zzd(10);
        if (zzecVar.zzp() && zzecVar.zzd(3) > 0) {
            zzecVar.zzn(2);
        }
        int i14 = true != zzecVar.zzp() ? 44100 : 48000;
        int iZzd6 = zzecVar.zzd(4);
        if (i14 == 44100 && iZzd6 == 13) {
            i9 = zzb[13];
        } else {
            if (i14 == 48000 && iZzd6 < 14) {
                i12 = zzb[iZzd6];
                int i15 = iZzd5 % 5;
                if (i15 == 1) {
                    if (iZzd6 != 3 || iZzd6 == 8) {
                        i12++;
                    }
                } else if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 == 4 && (iZzd6 == 3 || iZzd6 == 8 || iZzd6 == 11)) {
                            i12++;
                        }
                    } else if (iZzd6 != 3) {
                        i12++;
                    } else {
                        i12++;
                    }
                } else if (iZzd6 == 8 || iZzd6 == 11) {
                    i12++;
                }
            }
            i9 = i12;
        }
        return new zzabw(i8, 2, i14, i11, i9, null);
    }

    public static void zzc(int i7, zzed zzedVar) {
        zzedVar.zzI(7);
        byte[] bArrZzN = zzedVar.zzN();
        bArrZzN[0] = -84;
        bArrZzN[1] = 64;
        bArrZzN[2] = -1;
        bArrZzN[3] = -1;
        bArrZzN[4] = (byte) ((i7 >> 16) & 255);
        bArrZzN[5] = (byte) ((i7 >> 8) & 255);
        bArrZzN[6] = (byte) (i7 & 255);
    }

    private static void zzd(zzec zzecVar, zzabv zzabvVar) throws zzaz {
        int iZzd = zzecVar.zzd(5);
        zzecVar.zzn(2);
        if (zzecVar.zzp()) {
            zzecVar.zzn(5);
        }
        if (iZzd >= 7 && iZzd <= 10) {
            zzecVar.zzm();
        }
        if (zzecVar.zzp()) {
            int iZzd2 = zzecVar.zzd(3);
            if (zzabvVar.zzb == -1 && iZzd >= 0 && iZzd <= 15 && (iZzd2 == 0 || iZzd2 == 1)) {
                zzabvVar.zzb = iZzd;
            }
            if (zzecVar.zzp()) {
                zzf(zzecVar);
            }
        }
    }

    private static void zze(zzec zzecVar, zzabv zzabvVar) throws zzaz {
        zzecVar.zzn(2);
        boolean zZzp = zzecVar.zzp();
        int iZzd = zzecVar.zzd(8);
        for (int i7 = 0; i7 < iZzd; i7++) {
            zzecVar.zzn(2);
            if (zzecVar.zzp()) {
                zzecVar.zzn(5);
            }
            if (zZzp) {
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

    private static void zzf(zzec zzecVar) throws zzaz {
        int iZzd = zzecVar.zzd(6);
        if (iZzd < 2 || iZzd > 42) {
            throw zzaz.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzd)));
        }
        zzecVar.zzn(iZzd * 8);
    }

    private static boolean zzg(zzec zzecVar) {
        if (zzecVar.zza() < 66) {
            return false;
        }
        zzecVar.zzn(66);
        return true;
    }
}

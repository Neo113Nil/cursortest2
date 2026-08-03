package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzafb {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:107:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0377  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzv zza(com.google.android.gms.internal.ads.zzet zzetVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzq zzqVar) throws com.google.android.gms.internal.ads.zzat {
        int i;
        int i2;
        boolean zzi;
        int zzj;
        int zzj2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes();
        zzesVar.zza(zzetVar);
        int zzc = zzesVar.zzc();
        int zzj3 = zzesVar.zzj(3);
        if (zzj3 > 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzj3).length() + 30);
            sb.append("Unsupported AC-4 DSI version: ");
            sb.append(zzj3);
            throw com.google.android.gms.internal.ads.zzat.zzc(sb.toString());
        }
        int zzj4 = zzesVar.zzj(7);
        int i7 = true != zzesVar.zzi() ? 44100 : 48000;
        zzesVar.zzh(4);
        int zzj5 = zzesVar.zzj(9);
        if (zzj4 > 1) {
            if (zzj3 == 0) {
                throw com.google.android.gms.internal.ads.zzat.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzesVar.zzi()) {
                zzesVar.zzh(16);
                if (zzesVar.zzi()) {
                    zzesVar.zzh(128);
                }
            }
        }
        if (zzj3 == 1) {
            if (!zzg(zzesVar)) {
                throw com.google.android.gms.internal.ads.zzat.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzesVar.zzm();
        }
        com.google.android.gms.internal.ads.zzaez zzaezVar = new com.google.android.gms.internal.ads.zzaez(null);
        for (int i8 = 0; i8 < zzj5; i8++) {
            if (zzj3 == 0) {
                zzi = zzesVar.zzi();
                zzj = zzesVar.zzj(5);
                zzj2 = zzesVar.zzj(5);
                i3 = 0;
                i4 = 0;
                z = false;
            } else {
                int zzj6 = zzesVar.zzj(8);
                i4 = zzesVar.zzj(8);
                if (i4 == 255) {
                    i4 = zzesVar.zzj(16) + 255;
                }
                if (zzj6 > 2) {
                    zzesVar.zzh(i4 * 8);
                } else {
                    i3 = (zzc - zzesVar.zzc()) / 8;
                    int zzj7 = zzesVar.zzj(5);
                    z = zzj7 == 31;
                    zzj2 = zzj6;
                    zzj = zzj7;
                    zzi = false;
                }
            }
            zzaezVar.zzf = zzj2;
            if (zzi || z || zzj != 6) {
                zzaezVar.zzg = zzesVar.zzj(3);
                if (zzesVar.zzi()) {
                    zzesVar.zzh(5);
                }
                zzesVar.zzh(2);
                if (zzj3 == 1) {
                    if (zzj2 != 1) {
                        if (zzj2 == 2) {
                            zzj2 = 2;
                        }
                    }
                    zzesVar.zzh(2);
                }
                zzesVar.zzh(5);
                zzesVar.zzh(10);
                if (zzj3 == 1) {
                    if (zzj2 > 0) {
                        zzaezVar.zza = zzesVar.zzi();
                    }
                    if (zzaezVar.zza) {
                        if (zzj2 == 1) {
                            i6 = 1;
                        } else if (zzj2 == 2) {
                            i6 = 2;
                        } else {
                            i6 = zzj2;
                            i5 = 2;
                            zzesVar.zzh(24);
                        }
                        int zzj8 = zzesVar.zzj(5);
                        if (zzj8 >= 0 && zzj8 <= 15) {
                            zzaezVar.zzb = zzj8;
                        }
                        if (zzj8 >= 11 && zzj8 <= 14) {
                            zzaezVar.zzd = zzesVar.zzi();
                            i5 = 2;
                            zzaezVar.zze = zzesVar.zzj(2);
                            zzesVar.zzh(24);
                        }
                        i5 = 2;
                        zzesVar.zzh(24);
                    } else {
                        i5 = 2;
                        i6 = zzj2;
                    }
                    if (zzj2 == 1 || zzj2 == i5) {
                        if (zzesVar.zzi() && zzesVar.zzi()) {
                            zzesVar.zzh(i5);
                        }
                        if (zzesVar.zzi()) {
                            zzesVar.zzg();
                            int i9 = 8;
                            int zzj9 = zzesVar.zzj(8);
                            int i10 = 0;
                            while (i10 < zzj9) {
                                zzesVar.zzh(i9);
                                i10++;
                                i9 = 8;
                            }
                        }
                    }
                    zzj2 = i6;
                }
                if (!zzi && !z) {
                    zzesVar.zzg();
                    if (zzj == 0 || zzj == 1 || zzj == 2) {
                        if (zzj2 == 0) {
                            for (int i11 = 0; i11 < 2; i11++) {
                                zzd(zzesVar, zzaezVar);
                            }
                            zzj2 = 0;
                            zzesVar.zzg();
                            if (!zzesVar.zzi()) {
                            }
                        } else {
                            int i12 = 0;
                            for (int i13 = 2; i12 < i13; i13 = 2) {
                                zze(zzesVar, zzaezVar);
                                i12++;
                            }
                            zzesVar.zzg();
                            if (!zzesVar.zzi()) {
                            }
                        }
                    } else if (zzj != 3 && zzj != 4) {
                        if (zzj != 5) {
                            int zzj10 = zzesVar.zzj(7);
                            for (int i14 = 0; i14 < zzj10; i14++) {
                                zzesVar.zzh(8);
                            }
                        } else if (zzj2 == 0) {
                            zzd(zzesVar, zzaezVar);
                            zzj2 = 0;
                        } else {
                            int zzj11 = zzesVar.zzj(3);
                            for (int i15 = 0; i15 < zzj11 + 2; i15++) {
                                zze(zzesVar, zzaezVar);
                            }
                        }
                        zzesVar.zzg();
                        if (!zzesVar.zzi()) {
                        }
                    } else if (zzj2 == 0) {
                        for (int i16 = 0; i16 < 3; i16++) {
                            zzd(zzesVar, zzaezVar);
                        }
                        zzj2 = 0;
                        zzesVar.zzg();
                        if (!zzesVar.zzi()) {
                        }
                    } else {
                        int i17 = 0;
                        for (int i18 = 3; i17 < i18; i18 = 3) {
                            zze(zzesVar, zzaezVar);
                            i17++;
                        }
                        zzesVar.zzg();
                        if (!zzesVar.zzi()) {
                        }
                    }
                } else if (zzj2 == 0) {
                    zzd(zzesVar, zzaezVar);
                    zzj2 = 0;
                    zzesVar.zzg();
                    if (!zzesVar.zzi()) {
                        i = 7;
                        if (zzj2 > 0) {
                            if (zzesVar.zzi() && !zzg(zzesVar)) {
                                throw com.google.android.gms.internal.ads.zzat.zzc("Can't parse bitrate DSI.");
                            }
                            if (zzesVar.zzi()) {
                                zzesVar.zzm();
                                zzesVar.zzo(zzesVar.zzj(16));
                                int zzj12 = zzesVar.zzj(5);
                                for (int i19 = 0; i19 < zzj12; i19++) {
                                    zzesVar.zzh(3);
                                    zzesVar.zzh(8);
                                }
                                zzesVar.zzm();
                                if (zzj3 == 1) {
                                    int zzc2 = ((zzc - zzesVar.zzc()) / 8) - i3;
                                    if (i4 < zzc2) {
                                        throw com.google.android.gms.internal.ads.zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                                    }
                                    zzesVar.zzo(i4 - zzc2);
                                }
                                if (!zzaezVar.zza && zzaezVar.zzb == -1) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(i8).length() + 45);
                                    sb2.append("Can't determine channel mode of presentation ");
                                    sb2.append(i8);
                                    throw com.google.android.gms.internal.ads.zzat.zzc(sb2.toString());
                                }
                                if (zzaezVar.zza) {
                                    int i20 = zzaezVar.zzc;
                                    if (i20 > 0) {
                                        i2 = i20 + 1;
                                        if (zzaezVar.zzg == 4 && i2 == 17) {
                                            i2 = 21;
                                        }
                                    } else {
                                        int i21 = zzaezVar.zzg;
                                        if (i21 != 0) {
                                            if (i21 == 1) {
                                                i2 = 6;
                                            } else if (i21 == 2) {
                                                i2 = 8;
                                            } else if (i21 == 3) {
                                                i2 = 10;
                                            } else if (i21 != 4) {
                                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i21).length() + 33);
                                                sb3.append("AC-4 level ");
                                                sb3.append(i21);
                                                sb3.append(" has not been defined.");
                                                com.google.android.gms.internal.ads.zzeg.zzc("Ac4Util", sb3.toString());
                                            } else {
                                                i2 = 12;
                                            }
                                        }
                                        i2 = 2;
                                    }
                                } else {
                                    int i22 = zzaezVar.zzb;
                                    boolean z2 = zzaezVar.zzd;
                                    int i23 = zzaezVar.zze;
                                    switch (i22) {
                                        case 0:
                                            i = 1;
                                            break;
                                        case 1:
                                            i = 2;
                                            break;
                                        case 2:
                                            i = 3;
                                            break;
                                        case 3:
                                            i = 5;
                                            break;
                                        case 4:
                                            i = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i = 8;
                                            break;
                                        case 11:
                                            i = 11;
                                            break;
                                        case 12:
                                            i = 12;
                                            break;
                                        case 13:
                                            i = 13;
                                            break;
                                        case 14:
                                            i = 14;
                                            break;
                                        case 15:
                                            i = 24;
                                            break;
                                        default:
                                            i = -1;
                                            break;
                                    }
                                    if (i22 == 11 || i22 == 12 || i22 == 13 || i22 == 14) {
                                        if (!z2) {
                                            i -= 2;
                                        }
                                        i2 = i;
                                        if (i23 == 0) {
                                            i2 -= 4;
                                        } else if (i23 == 1) {
                                            i2 -= 2;
                                        }
                                    } else {
                                        i2 = i;
                                    }
                                }
                                if (i2 > 0) {
                                    throw com.google.android.gms.internal.ads.zzat.zzc("Cannot determine channel count of presentation.");
                                }
                                java.lang.Object[] objArr = {java.lang.Integer.valueOf(zzj4), java.lang.Integer.valueOf(zzaezVar.zzf), java.lang.Integer.valueOf(zzaezVar.zzg)};
                                java.lang.String str3 = com.google.android.gms.internal.ads.zzfl.zza;
                                java.lang.String format = java.lang.String.format(java.util.Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                                zztVar.zza(str);
                                zztVar.zzo("audio/ac4");
                                zztVar.zzG(i2);
                                zztVar.zzH(i7);
                                zztVar.zzs(zzqVar);
                                zztVar.zze(str2);
                                zztVar.zzk(format);
                                return zztVar.zzO();
                            }
                        }
                        zzesVar.zzm();
                        if (zzj3 == 1) {
                        }
                        if (!zzaezVar.zza) {
                            java.lang.StringBuilder sb22 = new java.lang.StringBuilder(java.lang.String.valueOf(i8).length() + 45);
                            sb22.append("Can't determine channel mode of presentation ");
                            sb22.append(i8);
                            throw com.google.android.gms.internal.ads.zzat.zzc(sb22.toString());
                        }
                        if (zzaezVar.zza) {
                        }
                        if (i2 > 0) {
                        }
                    }
                } else {
                    zze(zzesVar, zzaezVar);
                    zzesVar.zzg();
                    if (!zzesVar.zzi()) {
                    }
                }
            }
            i = 7;
            int zzj13 = zzesVar.zzj(7);
            for (int i24 = 0; i24 < zzj13; i24++) {
                zzesVar.zzh(15);
            }
            if (zzj2 > 0) {
            }
            zzesVar.zzm();
            if (zzj3 == 1) {
            }
            if (!zzaezVar.zza) {
            }
            if (zzaezVar.zza) {
            }
            if (i2 > 0) {
            }
        }
        i = 7;
        if (zzaezVar.zza) {
        }
        if (i2 > 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        if (r12 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r12 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r12 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzafa zzb(com.google.android.gms.internal.ads.zzes zzesVar) {
        int i;
        int i2;
        int zzj;
        int zzj2 = zzesVar.zzj(16);
        int zzj3 = zzesVar.zzj(16);
        if (zzj3 == 65535) {
            zzj3 = zzesVar.zzj(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = zzj3 + i;
        if (zzj2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int zzj4 = zzesVar.zzj(2);
        if (zzj4 == 3) {
            int i5 = 0;
            while (true) {
                zzj = i5 + zzesVar.zzj(2);
                if (!zzesVar.zzi()) {
                    break;
                }
                i5 = (zzj + 1) << 2;
            }
            zzj4 = zzj + 3;
        }
        int i6 = zzj4;
        int zzj5 = zzesVar.zzj(10);
        if (zzesVar.zzi() && zzesVar.zzj(3) > 0) {
            zzesVar.zzh(2);
        }
        int i7 = true != zzesVar.zzi() ? 44100 : 48000;
        int zzj6 = zzesVar.zzj(4);
        if (i7 == 44100 && zzj6 == 13) {
            i2 = zzb[13];
        } else if (i7 != 48000 || zzj6 >= 14) {
            i2 = 0;
        } else {
            int i8 = zzb[zzj6];
            int i9 = zzj5 % 5;
            if (i9 != 1) {
                if (i9 == 2) {
                    if (zzj6 != 8) {
                    }
                    i8++;
                    i2 = i8;
                } else if (i9 != 3) {
                    if (i9 == 4) {
                        if (zzj6 != 3) {
                            if (zzj6 != 8) {
                            }
                        }
                        i8++;
                    }
                    i2 = i8;
                }
            }
            if (zzj6 != 3) {
            }
            i8++;
            i2 = i8;
        }
        return new com.google.android.gms.internal.ads.zzafa(i6, 2, i7, i4, i2, null);
    }

    public static void zzc(int i, com.google.android.gms.internal.ads.zzet zzetVar) {
        zzetVar.zza(7);
        byte[] zzi = zzetVar.zzi();
        zzi[0] = -84;
        zzi[1] = com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO;
        zzi[2] = -1;
        zzi[3] = -1;
        zzi[4] = (byte) ((i >> 16) & 255);
        zzi[5] = (byte) ((i >> 8) & 255);
        zzi[6] = (byte) (i & 255);
    }

    private static void zzd(com.google.android.gms.internal.ads.zzes zzesVar, com.google.android.gms.internal.ads.zzaez zzaezVar) throws com.google.android.gms.internal.ads.zzat {
        int zzj = zzesVar.zzj(5);
        zzesVar.zzh(2);
        if (zzesVar.zzi()) {
            zzesVar.zzh(5);
        }
        if (zzj >= 7 && zzj <= 10) {
            zzesVar.zzg();
        }
        if (zzesVar.zzi()) {
            int zzj2 = zzesVar.zzj(3);
            if (zzaezVar.zzb == -1 && zzj >= 0 && zzj <= 15 && (zzj2 == 0 || zzj2 == 1)) {
                zzaezVar.zzb = zzj;
            }
            if (zzesVar.zzi()) {
                zzf(zzesVar);
            }
        }
    }

    private static void zze(com.google.android.gms.internal.ads.zzes zzesVar, com.google.android.gms.internal.ads.zzaez zzaezVar) throws com.google.android.gms.internal.ads.zzat {
        zzesVar.zzh(2);
        boolean zzi = zzesVar.zzi();
        int zzj = zzesVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzesVar.zzh(2);
            if (zzesVar.zzi()) {
                zzesVar.zzh(5);
            }
            if (zzi) {
                zzesVar.zzh(24);
            } else {
                if (zzesVar.zzi()) {
                    if (!zzesVar.zzi()) {
                        zzesVar.zzh(4);
                    }
                    zzaezVar.zzc = zzesVar.zzj(6) + 1;
                }
                zzesVar.zzh(4);
            }
        }
        if (zzesVar.zzi()) {
            zzesVar.zzh(3);
            if (zzesVar.zzi()) {
                zzf(zzesVar);
            }
        }
    }

    private static void zzf(com.google.android.gms.internal.ads.zzes zzesVar) throws com.google.android.gms.internal.ads.zzat {
        int zzj = zzesVar.zzj(6);
        if (zzj < 2 || zzj > 42) {
            throw com.google.android.gms.internal.ads.zzat.zzc(java.lang.String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", java.lang.Integer.valueOf(zzj)));
        }
        zzesVar.zzh(zzj * 8);
    }

    private static boolean zzg(com.google.android.gms.internal.ads.zzes zzesVar) {
        if (zzesVar.zzc() < 66) {
            return false;
        }
        zzesVar.zzh(66);
        return true;
    }
}

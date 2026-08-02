package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzacy {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {AdError.CACHE_ERROR_CODE, AdError.SERVER_ERROR_CODE, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:108:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x033f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzz zza(zzen zzenVar, String str, String str2, zzs zzsVar) throws zzaz {
        int i;
        int i2;
        int i3;
        int i4;
        boolean zzp;
        int i5;
        int i6;
        boolean z;
        int i7;
        int zzd;
        int zzd2;
        int i8;
        int i9;
        int i10;
        int i11;
        zzem zzemVar = new zzem();
        zzemVar.zzj(zzenVar);
        int zza2 = zzemVar.zza();
        int zzd3 = zzemVar.zzd(3);
        if (zzd3 > 1) {
            throw zzaz.zzc("Unsupported AC-4 DSI version: " + zzd3);
        }
        int zzd4 = zzemVar.zzd(7);
        int i12 = true != zzemVar.zzp() ? 44100 : 48000;
        zzemVar.zzn(4);
        int zzd5 = zzemVar.zzd(9);
        if (zzd4 > 1) {
            if (zzd3 == 0) {
                throw zzaz.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzemVar.zzp()) {
                zzemVar.zzn(16);
                if (zzemVar.zzp()) {
                    zzemVar.zzn(128);
                }
            }
        }
        if (zzd3 == 1) {
            if (!zzg(zzemVar)) {
                throw zzaz.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzemVar.zzf();
        }
        zzacv zzacvVar = new zzacv(null);
        for (int i13 = 0; i13 < zzd5; i13++) {
            if (zzd3 == 0) {
                zzp = zzemVar.zzp();
                i5 = 0;
                i6 = 0;
                z = false;
                i7 = 8;
                zzd = zzemVar.zzd(5);
                zzd2 = zzemVar.zzd(5);
            } else {
                int zzd6 = zzemVar.zzd(8);
                i5 = zzemVar.zzd(8);
                i7 = 8;
                if (i5 == 255) {
                    i5 = zzemVar.zzd(16) + 255;
                }
                if (zzd6 > 2) {
                    zzemVar.zzn(i5 * 8);
                } else {
                    int zza3 = (zza2 - zzemVar.zza()) / 8;
                    zzd = zzemVar.zzd(5);
                    z = zzd == 31;
                    zzd2 = zzd6;
                    i6 = zza3;
                    zzp = false;
                }
            }
            zzacvVar.zzf = zzd2;
            if (zzp || z || zzd != 6) {
                zzacvVar.zzg = zzemVar.zzd(3);
                if (zzemVar.zzp()) {
                    zzemVar.zzn(5);
                }
                zzemVar.zzn(2);
                if (zzd3 == 1) {
                    if (zzd2 != 1) {
                        if (zzd2 == 2) {
                            zzd2 = 2;
                        }
                    }
                    zzemVar.zzn(2);
                }
                zzemVar.zzn(5);
                zzemVar.zzn(10);
                if (zzd3 == 1) {
                    if (zzd2 > 0) {
                        zzacvVar.zza = zzemVar.zzp();
                    }
                    if (zzacvVar.zza) {
                        if (zzd2 != 1) {
                            i9 = 2;
                            if (zzd2 == 2) {
                                i11 = 2;
                            } else {
                                i8 = zza2;
                                i11 = zzd2;
                                zzemVar.zzn(24);
                                i10 = 1;
                            }
                        } else {
                            i11 = 1;
                        }
                        i8 = zza2;
                        int zzd7 = zzemVar.zzd(5);
                        if (zzd7 >= 0 && zzd7 <= 15) {
                            zzacvVar.zzb = zzd7;
                        }
                        if (zzd7 < 11 || zzd7 > 14) {
                            i9 = 2;
                        } else {
                            zzacvVar.zzd = zzemVar.zzp();
                            i9 = 2;
                            zzacvVar.zze = zzemVar.zzd(2);
                        }
                        zzemVar.zzn(24);
                        i10 = 1;
                    } else {
                        i8 = zza2;
                        i9 = 2;
                        i10 = 1;
                        i11 = zzd2;
                    }
                    if (zzd2 == i10 || zzd2 == i9) {
                        if (zzemVar.zzp() && zzemVar.zzp()) {
                            zzemVar.zzn(i9);
                        }
                        if (zzemVar.zzp()) {
                            zzemVar.zzm();
                            int i14 = i7;
                            int zzd8 = zzemVar.zzd(i14);
                            int i15 = 0;
                            while (i15 < zzd8) {
                                zzemVar.zzn(i14);
                                i15++;
                                i14 = 8;
                            }
                        }
                    }
                    zzd2 = i11;
                } else {
                    i8 = zza2;
                }
                if (!zzp && !z) {
                    zzemVar.zzm();
                    if (zzd == 0 || zzd == 1 || zzd == 2) {
                        if (zzd2 == 0) {
                            for (int i16 = 0; i16 < 2; i16++) {
                                zzd(zzemVar, zzacvVar);
                            }
                            zzd2 = 0;
                            zzemVar.zzm();
                            if (!zzemVar.zzp()) {
                            }
                        } else {
                            for (int i17 = 0; i17 < 2; i17++) {
                                zze(zzemVar, zzacvVar);
                            }
                            zzemVar.zzm();
                            if (!zzemVar.zzp()) {
                            }
                        }
                    } else if (zzd != 3 && zzd != 4) {
                        if (zzd != 5) {
                            int zzd9 = zzemVar.zzd(7);
                            for (int i18 = 0; i18 < zzd9; i18++) {
                                zzemVar.zzn(8);
                            }
                        } else if (zzd2 == 0) {
                            zzd(zzemVar, zzacvVar);
                            zzd2 = 0;
                        } else {
                            int zzd10 = zzemVar.zzd(3);
                            for (int i19 = 0; i19 < zzd10 + 2; i19++) {
                                zze(zzemVar, zzacvVar);
                            }
                        }
                        zzemVar.zzm();
                        if (!zzemVar.zzp()) {
                        }
                    } else if (zzd2 == 0) {
                        for (int i20 = 0; i20 < 3; i20++) {
                            zzd(zzemVar, zzacvVar);
                        }
                        zzd2 = 0;
                        zzemVar.zzm();
                        if (!zzemVar.zzp()) {
                        }
                    } else {
                        for (int i21 = 0; i21 < 3; i21++) {
                            zze(zzemVar, zzacvVar);
                        }
                        zzemVar.zzm();
                        if (!zzemVar.zzp()) {
                        }
                    }
                } else if (zzd2 == 0) {
                    zzd(zzemVar, zzacvVar);
                    zzd2 = 0;
                    zzemVar.zzm();
                    if (!zzemVar.zzp()) {
                        i3 = 7;
                        if (zzd2 > 0) {
                            if (zzemVar.zzp() && !zzg(zzemVar)) {
                                throw zzaz.zzc("Can't parse bitrate DSI.");
                            }
                            if (zzemVar.zzp()) {
                                zzemVar.zzf();
                                zzemVar.zzo(zzemVar.zzd(16));
                                i = 5;
                                int zzd11 = zzemVar.zzd(5);
                                for (int i22 = 0; i22 < zzd11; i22++) {
                                    zzemVar.zzn(3);
                                    zzemVar.zzn(8);
                                }
                                i2 = 8;
                                zzemVar.zzf();
                                if (zzd3 == 1) {
                                    int zza4 = ((i8 - zzemVar.zza()) / i2) - i6;
                                    if (i5 < zza4) {
                                        throw zzaz.zzc("pres_bytes is smaller than presentation bytes read.");
                                    }
                                    zzemVar.zzo(i5 - zza4);
                                }
                                if (zzacvVar.zza) {
                                    i4 = -1;
                                    if (zzacvVar.zzb == -1) {
                                        throw zzaz.zzc("Can't determine channel mode of presentation " + i13);
                                    }
                                }
                                i4 = -1;
                            }
                        }
                        i2 = 8;
                        i = 5;
                        zzemVar.zzf();
                        if (zzd3 == 1) {
                        }
                        if (zzacvVar.zza) {
                        }
                        i4 = -1;
                    }
                } else {
                    zze(zzemVar, zzacvVar);
                    zzemVar.zzm();
                    if (!zzemVar.zzp()) {
                    }
                }
                if (zzacvVar.zza) {
                    int i23 = zzacvVar.zzb;
                    boolean z2 = zzacvVar.zzd;
                    int i24 = zzacvVar.zze;
                    switch (i23) {
                        case 0:
                            i3 = 1;
                            break;
                        case 1:
                            i3 = 2;
                            break;
                        case 2:
                            i3 = 3;
                            break;
                        case 3:
                            i3 = i;
                            break;
                        case 4:
                            i3 = 6;
                            break;
                        case 5:
                        case 7:
                        case 9:
                            break;
                        case 6:
                        case 8:
                        case 10:
                            i3 = i2;
                            break;
                        case 11:
                            i3 = 11;
                            break;
                        case 12:
                            i3 = 12;
                            break;
                        case 13:
                            i3 = 13;
                            break;
                        case 14:
                            i3 = 14;
                            break;
                        case 15:
                            i3 = 24;
                            break;
                        default:
                            i3 = i4;
                            break;
                    }
                    if (i23 == 11 || i23 == 12 || i23 == 13 || i23 == 14) {
                        if (!z2) {
                            i3 -= 2;
                        }
                        if (i24 == 0) {
                            i3 -= 4;
                        } else if (i24 == 1) {
                            i3 -= 2;
                        }
                    }
                } else {
                    i3 = zzacvVar.zzc + 1;
                    if (zzacvVar.zzg == 4 && i3 == 17) {
                        i3 = 21;
                    }
                }
                if (i3 <= 0) {
                    throw zzaz.zzc("Can't determine channel count of presentation.");
                }
                Object[] objArr = {Integer.valueOf(zzd4), Integer.valueOf(zzacvVar.zzf), Integer.valueOf(zzacvVar.zzg)};
                String str3 = zzex.zza;
                String format = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                zzx zzxVar = new zzx();
                zzxVar.zzS(str);
                zzxVar.zzah("audio/ac4");
                zzxVar.zzD(i3);
                zzxVar.zzai(i12);
                zzxVar.zzL(zzsVar);
                zzxVar.zzW(str2);
                zzxVar.zzE(format);
                return zzxVar.zzan();
            }
            i8 = zza2;
            i3 = 7;
            int zzd12 = zzemVar.zzd(7);
            for (int i25 = 0; i25 < zzd12; i25++) {
                zzemVar.zzn(15);
            }
            if (zzd2 > 0) {
            }
            i2 = 8;
            i = 5;
            zzemVar.zzf();
            if (zzd3 == 1) {
            }
            if (zzacvVar.zza) {
            }
            i4 = -1;
            if (zzacvVar.zza) {
            }
            if (i3 <= 0) {
            }
        }
        i = 5;
        i2 = 8;
        i3 = 7;
        i4 = -1;
        if (zzacvVar.zza) {
        }
        if (i3 <= 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
    
        if (r11 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzacw zzb(zzem zzemVar) {
        int i;
        int i2;
        int zzd;
        int zzd2 = zzemVar.zzd(16);
        int zzd3 = zzemVar.zzd(16);
        if (zzd3 == 65535) {
            zzd3 = zzemVar.zzd(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = zzd3 + i;
        if (zzd2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int zzd4 = zzemVar.zzd(2);
        int i5 = 0;
        if (zzd4 == 3) {
            int i6 = 0;
            while (true) {
                zzd = i6 + zzemVar.zzd(2);
                if (!zzemVar.zzp()) {
                    break;
                }
                i6 = (zzd + 1) << 2;
            }
            zzd4 = zzd + 3;
        }
        int i7 = zzd4;
        int zzd5 = zzemVar.zzd(10);
        if (zzemVar.zzp() && zzemVar.zzd(3) > 0) {
            zzemVar.zzn(2);
        }
        int i8 = 44100;
        if (true != zzemVar.zzp()) {
            i2 = 44100;
        } else {
            i2 = 44100;
            i8 = 48000;
        }
        int zzd6 = zzemVar.zzd(4);
        if (i8 == i2 && zzd6 == 13) {
            i5 = zzb[13];
        } else if (i8 == 48000 && zzd6 < 14) {
            i5 = zzb[zzd6];
            int i9 = zzd5 % 5;
            if (i9 != 1) {
                if (i9 == 2) {
                    if (zzd6 != 8) {
                    }
                    i5++;
                } else if (i9 != 3) {
                    if (i9 == 4) {
                        if (zzd6 != 3) {
                            if (zzd6 != 8) {
                            }
                        }
                        i5++;
                    }
                }
            }
            if (zzd6 != 3) {
            }
            i5++;
        }
        return new zzacw(i7, 2, i8, i4, i5, null);
    }

    public static void zzc(int i, zzen zzenVar) {
        zzenVar.zzI(7);
        byte[] zzN = zzenVar.zzN();
        zzN[0] = -84;
        zzN[1] = 64;
        zzN[2] = -1;
        zzN[3] = -1;
        zzN[4] = (byte) ((i >> 16) & 255);
        zzN[5] = (byte) ((i >> 8) & 255);
        zzN[6] = (byte) (i & 255);
    }

    private static void zzd(zzem zzemVar, zzacv zzacvVar) throws zzaz {
        int zzd = zzemVar.zzd(5);
        zzemVar.zzn(2);
        if (zzemVar.zzp()) {
            zzemVar.zzn(5);
        }
        if (zzd >= 7 && zzd <= 10) {
            zzemVar.zzm();
        }
        if (zzemVar.zzp()) {
            int zzd2 = zzemVar.zzd(3);
            if (zzacvVar.zzb == -1 && zzd >= 0 && zzd <= 15 && (zzd2 == 0 || zzd2 == 1)) {
                zzacvVar.zzb = zzd;
            }
            if (zzemVar.zzp()) {
                zzf(zzemVar);
            }
        }
    }

    private static void zze(zzem zzemVar, zzacv zzacvVar) throws zzaz {
        zzemVar.zzn(2);
        boolean zzp = zzemVar.zzp();
        int zzd = zzemVar.zzd(8);
        for (int i = 0; i < zzd; i++) {
            zzemVar.zzn(2);
            if (zzemVar.zzp()) {
                zzemVar.zzn(5);
            }
            if (zzp) {
                zzemVar.zzn(24);
            } else {
                if (zzemVar.zzp()) {
                    if (!zzemVar.zzp()) {
                        zzemVar.zzn(4);
                    }
                    zzacvVar.zzc = zzemVar.zzd(6) + 1;
                }
                zzemVar.zzn(4);
            }
        }
        if (zzemVar.zzp()) {
            zzemVar.zzn(3);
            if (zzemVar.zzp()) {
                zzf(zzemVar);
            }
        }
    }

    private static void zzf(zzem zzemVar) throws zzaz {
        int zzd = zzemVar.zzd(6);
        if (zzd < 2 || zzd > 42) {
            throw zzaz.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(zzd)));
        }
        zzemVar.zzn(zzd * 8);
    }

    private static boolean zzg(zzem zzemVar) {
        if (zzemVar.zza() < 66) {
            return false;
        }
        zzemVar.zzn(66);
        return true;
    }
}

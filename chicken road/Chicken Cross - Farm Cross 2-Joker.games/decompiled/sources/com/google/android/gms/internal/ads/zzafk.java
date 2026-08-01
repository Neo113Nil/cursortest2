package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzafk {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:109:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0387  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzv zza(zzeu zzeuVar, String str, String str2, zzq zzqVar) throws zzat {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean zzi;
        int zzj;
        int zzj2;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        zzet zzetVar = new zzet();
        zzetVar.zza(zzeuVar);
        int zzc = zzetVar.zzc();
        int zzj3 = zzetVar.zzj(3);
        if (zzj3 > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 30);
            sb.append("Unsupported AC-4 DSI version: ");
            sb.append(zzj3);
            throw zzat.zzc(sb.toString());
        }
        int zzj4 = zzetVar.zzj(7);
        int i13 = true != zzetVar.zzi() ? 44100 : 48000;
        zzetVar.zzh(4);
        int zzj5 = zzetVar.zzj(9);
        if (zzj4 > 1) {
            if (zzj3 == 0) {
                throw zzat.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzetVar.zzi()) {
                zzetVar.zzh(16);
                if (zzetVar.zzi()) {
                    zzetVar.zzh(128);
                }
            }
        }
        if (zzj3 == 1) {
            if (!zzg(zzetVar)) {
                throw zzat.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzetVar.zzm();
        }
        zzafi zzafiVar = new zzafi(null);
        for (int i14 = 0; i14 < zzj5; i14++) {
            if (zzj3 == 0) {
                zzi = zzetVar.zzi();
                zzj = zzetVar.zzj(5);
                zzj2 = zzetVar.zzj(5);
                i9 = 0;
                i10 = 0;
                z = false;
            } else {
                int zzj6 = zzetVar.zzj(8);
                i10 = zzetVar.zzj(8);
                if (i10 == 255) {
                    i10 = zzetVar.zzj(16) + 255;
                }
                if (zzj6 > 2) {
                    zzetVar.zzh(i10 * 8);
                } else {
                    i9 = (zzc - zzetVar.zzc()) / 8;
                    int zzj7 = zzetVar.zzj(5);
                    z = zzj7 == 31;
                    zzj2 = zzj6;
                    zzj = zzj7;
                    zzi = false;
                }
            }
            zzafiVar.zzf = zzj2;
            if (zzi || z || zzj != 6) {
                zzafiVar.zzg = zzetVar.zzj(3);
                if (zzetVar.zzi()) {
                    zzetVar.zzh(5);
                }
                zzetVar.zzh(2);
                if (zzj3 == 1) {
                    if (zzj2 != 1) {
                        if (zzj2 == 2) {
                            zzj2 = 2;
                        }
                    }
                    zzetVar.zzh(2);
                }
                zzetVar.zzh(5);
                zzetVar.zzh(10);
                if (zzj3 == 1) {
                    if (zzj2 > 0) {
                        zzafiVar.zza = zzetVar.zzi();
                    }
                    if (zzafiVar.zza) {
                        if (zzj2 == 1) {
                            i12 = 1;
                        } else if (zzj2 == 2) {
                            i12 = 2;
                        } else {
                            i11 = 2;
                            i12 = zzj2;
                            zzetVar.zzh(24);
                        }
                        int zzj8 = zzetVar.zzj(5);
                        if (zzj8 >= 0 && zzj8 <= 15) {
                            zzafiVar.zzb = zzj8;
                        }
                        if (zzj8 < 11 || zzj8 > 14) {
                            i11 = 2;
                        } else {
                            zzafiVar.zzd = zzetVar.zzi();
                            i11 = 2;
                            zzafiVar.zze = zzetVar.zzj(2);
                        }
                        zzetVar.zzh(24);
                    } else {
                        i11 = 2;
                        i12 = zzj2;
                    }
                    if (zzj2 == 1 || zzj2 == i11) {
                        if (zzetVar.zzi() && zzetVar.zzi()) {
                            zzetVar.zzh(i11);
                        }
                        if (zzetVar.zzi()) {
                            zzetVar.zzg();
                            int i15 = 8;
                            int zzj9 = zzetVar.zzj(8);
                            int i16 = 0;
                            while (i16 < zzj9) {
                                zzetVar.zzh(i15);
                                i16++;
                                i15 = 8;
                            }
                        }
                    }
                    zzj2 = i12;
                }
                if (!zzi && !z) {
                    zzetVar.zzg();
                    if (zzj == 0 || zzj == 1 || zzj == 2) {
                        if (zzj2 == 0) {
                            for (int i17 = 0; i17 < 2; i17++) {
                                zzd(zzetVar, zzafiVar);
                            }
                            zzj2 = 0;
                            zzetVar.zzg();
                            if (!zzetVar.zzi()) {
                            }
                        } else {
                            int i18 = 0;
                            for (int i19 = 2; i18 < i19; i19 = 2) {
                                zze(zzetVar, zzafiVar);
                                i18++;
                            }
                            zzetVar.zzg();
                            if (!zzetVar.zzi()) {
                            }
                        }
                    } else if (zzj != 3 && zzj != 4) {
                        if (zzj != 5) {
                            int zzj10 = zzetVar.zzj(7);
                            for (int i20 = 0; i20 < zzj10; i20++) {
                                zzetVar.zzh(8);
                            }
                        } else if (zzj2 == 0) {
                            zzd(zzetVar, zzafiVar);
                            zzj2 = 0;
                        } else {
                            int zzj11 = zzetVar.zzj(3);
                            for (int i21 = 0; i21 < zzj11 + 2; i21++) {
                                zze(zzetVar, zzafiVar);
                            }
                        }
                        zzetVar.zzg();
                        if (!zzetVar.zzi()) {
                        }
                    } else if (zzj2 == 0) {
                        for (int i22 = 0; i22 < 3; i22++) {
                            zzd(zzetVar, zzafiVar);
                        }
                        zzj2 = 0;
                        zzetVar.zzg();
                        if (!zzetVar.zzi()) {
                        }
                    } else {
                        int i23 = 0;
                        for (int i24 = 3; i23 < i24; i24 = 3) {
                            zze(zzetVar, zzafiVar);
                            i23++;
                        }
                        zzetVar.zzg();
                        if (!zzetVar.zzi()) {
                        }
                    }
                } else if (zzj2 == 0) {
                    zzd(zzetVar, zzafiVar);
                    zzj2 = 0;
                    zzetVar.zzg();
                    if (!zzetVar.zzi()) {
                        i4 = 7;
                        if (zzj2 > 0) {
                            if (zzetVar.zzi() && !zzg(zzetVar)) {
                                throw zzat.zzc("Can't parse bitrate DSI.");
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzm();
                                zzetVar.zzo(zzetVar.zzj(16));
                                i = 5;
                                int zzj12 = zzetVar.zzj(5);
                                for (int i25 = 0; i25 < zzj12; i25++) {
                                    zzetVar.zzh(3);
                                    zzetVar.zzh(8);
                                }
                                i2 = 8;
                                zzetVar.zzm();
                                if (zzj3 == 1) {
                                    int zzc2 = ((zzc - zzetVar.zzc()) / 8) - i9;
                                    if (i10 < zzc2) {
                                        throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                                    }
                                    zzetVar.zzo(i10 - zzc2);
                                }
                                if (zzafiVar.zza) {
                                    i3 = -1;
                                    if (zzafiVar.zzb == -1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + 45);
                                        sb2.append("Can't determine channel mode of presentation ");
                                        sb2.append(i14);
                                        throw zzat.zzc(sb2.toString());
                                    }
                                } else {
                                    i3 = -1;
                                }
                                if (zzafiVar.zza) {
                                    int i26 = zzafiVar.zzc;
                                    if (i26 > 0) {
                                        i6 = i26 + 1;
                                        if (zzafiVar.zzg == 4 && i6 == 17) {
                                            i6 = 21;
                                        }
                                    } else {
                                        int i27 = zzafiVar.zzg;
                                        if (i27 == 0) {
                                            i5 = 2;
                                        } else if (i27 != 1) {
                                            i5 = 2;
                                            if (i27 == 2) {
                                                i6 = i2;
                                            } else if (i27 == 3) {
                                                i6 = 10;
                                            } else if (i27 != 4) {
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(i27).length() + 33);
                                                sb3.append("AC-4 level ");
                                                sb3.append(i27);
                                                sb3.append(" has not been defined.");
                                                zzeh.zzc("Ac4Util", sb3.toString());
                                            } else {
                                                i6 = 12;
                                            }
                                        } else {
                                            i6 = 6;
                                        }
                                        i6 = i5;
                                    }
                                } else {
                                    int i28 = zzafiVar.zzb;
                                    boolean z2 = zzafiVar.zzd;
                                    int i29 = zzafiVar.zze;
                                    switch (i28) {
                                        case 0:
                                            i7 = 11;
                                            i8 = 1;
                                            break;
                                        case 1:
                                            i7 = 11;
                                            i8 = 2;
                                            break;
                                        case 2:
                                            i7 = 11;
                                            i8 = 3;
                                            break;
                                        case 3:
                                            i8 = i;
                                            i7 = 11;
                                            break;
                                        case 4:
                                            i7 = 11;
                                            i8 = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            i8 = i4;
                                            i7 = 11;
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i8 = i2;
                                            i7 = 11;
                                            break;
                                        case 11:
                                            i7 = 11;
                                            i8 = 11;
                                            break;
                                        case 12:
                                            i8 = 12;
                                            i7 = 11;
                                            break;
                                        case 13:
                                            i8 = 13;
                                            i7 = 11;
                                            break;
                                        case 14:
                                            i7 = 11;
                                            i8 = 14;
                                            break;
                                        case 15:
                                            i7 = 11;
                                            i8 = 24;
                                            break;
                                        default:
                                            i8 = i3;
                                            i7 = 11;
                                            break;
                                    }
                                    if (i28 == i7 || i28 == 12 || i28 == 13 || i28 == 14) {
                                        if (!z2) {
                                            i8 -= 2;
                                        }
                                        i6 = i8;
                                        if (i29 == 0) {
                                            i6 -= 4;
                                        } else if (i29 == 1) {
                                            i6 -= 2;
                                        }
                                    } else {
                                        i6 = i8;
                                    }
                                }
                                if (i6 > 0) {
                                    throw zzat.zzc("Cannot determine channel count of presentation.");
                                }
                                Object[] objArr = {Integer.valueOf(zzj4), Integer.valueOf(zzafiVar.zzf), Integer.valueOf(zzafiVar.zzg)};
                                String str3 = zzfm.zza;
                                String format = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                zzt zztVar = new zzt();
                                zztVar.zza(str);
                                zztVar.zzo("audio/ac4");
                                zztVar.zzH(i6);
                                zztVar.zzJ(i13);
                                zztVar.zzs(zzqVar);
                                zztVar.zze(str2);
                                zztVar.zzk(format);
                                return zztVar.zzQ();
                            }
                        }
                        i = 5;
                        i2 = 8;
                        zzetVar.zzm();
                        if (zzj3 == 1) {
                        }
                        if (zzafiVar.zza) {
                        }
                        if (zzafiVar.zza) {
                        }
                        if (i6 > 0) {
                        }
                    }
                } else {
                    zze(zzetVar, zzafiVar);
                    zzetVar.zzg();
                    if (!zzetVar.zzi()) {
                    }
                }
            }
            i4 = 7;
            int zzj13 = zzetVar.zzj(7);
            for (int i30 = 0; i30 < zzj13; i30++) {
                zzetVar.zzh(15);
            }
            if (zzj2 > 0) {
            }
            i = 5;
            i2 = 8;
            zzetVar.zzm();
            if (zzj3 == 1) {
            }
            if (zzafiVar.zza) {
            }
            if (zzafiVar.zza) {
            }
            if (i6 > 0) {
            }
        }
        i = 5;
        i2 = 8;
        i3 = -1;
        i4 = 7;
        if (zzafiVar.zza) {
        }
        if (i6 > 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r12 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        if (r12 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
    
        if (r12 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzafj zzb(zzet zzetVar) {
        int i;
        int i2;
        int zzj;
        int zzj2 = zzetVar.zzj(16);
        int zzj3 = zzetVar.zzj(16);
        if (zzj3 == 65535) {
            zzj3 = zzetVar.zzj(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = zzj3 + i;
        if (zzj2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int zzj4 = zzetVar.zzj(2);
        int i5 = 0;
        if (zzj4 == 3) {
            int i6 = 0;
            while (true) {
                zzj = i6 + zzetVar.zzj(2);
                if (!zzetVar.zzi()) {
                    break;
                }
                i6 = (zzj + 1) << 2;
            }
            zzj4 = zzj + 3;
        }
        int i7 = zzj4;
        int zzj5 = zzetVar.zzj(10);
        if (zzetVar.zzi() && zzetVar.zzj(3) > 0) {
            zzetVar.zzh(2);
        }
        int i8 = true != zzetVar.zzi() ? 44100 : 48000;
        int zzj6 = zzetVar.zzj(4);
        if (i8 == 44100 && zzj6 == 13) {
            i2 = zzb[13];
        } else {
            if (i8 == 48000 && zzj6 < 14) {
                i5 = zzb[zzj6];
                int i9 = zzj5 % 5;
                if (i9 != 1) {
                    if (i9 == 2) {
                        if (zzj6 != 8) {
                        }
                        i5++;
                    } else if (i9 != 3) {
                        if (i9 == 4) {
                            if (zzj6 != 3) {
                                if (zzj6 != 8) {
                                }
                            }
                            i5++;
                        }
                    }
                }
                if (zzj6 != 3) {
                }
                i5++;
            }
            i2 = i5;
        }
        return new zzafj(i7, 2, i8, i4, i2, null);
    }

    public static void zzc(int i, zzeu zzeuVar) {
        zzeuVar.zza(7);
        byte[] zzi = zzeuVar.zzi();
        zzi[0] = -84;
        zzi[1] = SignedBytes.MAX_POWER_OF_TWO;
        zzi[2] = -1;
        zzi[3] = -1;
        zzi[4] = (byte) ((i >> 16) & 255);
        zzi[5] = (byte) ((i >> 8) & 255);
        zzi[6] = (byte) (i & 255);
    }

    private static void zzd(zzet zzetVar, zzafi zzafiVar) throws zzat {
        int zzj = zzetVar.zzj(5);
        zzetVar.zzh(2);
        if (zzetVar.zzi()) {
            zzetVar.zzh(5);
        }
        if (zzj >= 7 && zzj <= 10) {
            zzetVar.zzg();
        }
        if (zzetVar.zzi()) {
            int zzj2 = zzetVar.zzj(3);
            if (zzafiVar.zzb == -1 && zzj >= 0 && zzj <= 15 && (zzj2 == 0 || zzj2 == 1)) {
                zzafiVar.zzb = zzj;
            }
            if (zzetVar.zzi()) {
                zzf(zzetVar);
            }
        }
    }

    private static void zze(zzet zzetVar, zzafi zzafiVar) throws zzat {
        zzetVar.zzh(2);
        boolean zzi = zzetVar.zzi();
        int zzj = zzetVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzetVar.zzh(2);
            if (zzetVar.zzi()) {
                zzetVar.zzh(5);
            }
            if (zzi) {
                zzetVar.zzh(24);
            } else {
                if (zzetVar.zzi()) {
                    if (!zzetVar.zzi()) {
                        zzetVar.zzh(4);
                    }
                    zzafiVar.zzc = zzetVar.zzj(6) + 1;
                }
                zzetVar.zzh(4);
            }
        }
        if (zzetVar.zzi()) {
            zzetVar.zzh(3);
            if (zzetVar.zzi()) {
                zzf(zzetVar);
            }
        }
    }

    private static void zzf(zzet zzetVar) throws zzat {
        int zzj = zzetVar.zzj(6);
        if (zzj < 2 || zzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(zzj)));
        }
        zzetVar.zzh(zzj * 8);
    }

    private static boolean zzg(zzet zzetVar) {
        if (zzetVar.zzc() < 66) {
            return false;
        }
        zzetVar.zzh(66);
        return true;
    }
}

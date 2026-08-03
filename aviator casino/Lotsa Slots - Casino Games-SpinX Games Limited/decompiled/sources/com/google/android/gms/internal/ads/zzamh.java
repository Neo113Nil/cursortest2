package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzamh {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static com.google.android.gms.internal.ads.zzahf zza(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        return zzc(zzafzVar, true);
    }

    public static com.google.android.gms.internal.ads.zzahf zzb(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        return zzc(zzafzVar, false);
    }

    private static com.google.android.gms.internal.ads.zzahf zzc(com.google.android.gms.internal.ads.zzafz zzafzVar, boolean z) throws java.io.IOException {
        int i;
        long j;
        int i2;
        int i3;
        long j2;
        int[] iArr;
        long zzo = zzafzVar.zzo();
        long j3 = android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        long j4 = -1;
        if (zzo != -1 && zzo <= android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j3 = zzo;
        }
        com.google.android.gms.internal.ads.zzet zzetVar = new com.google.android.gms.internal.ads.zzet(64);
        int i4 = (int) j3;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (i6 < i4) {
            zzetVar.zza(8);
            boolean z3 = true;
            if (!zzafzVar.zzh(zzetVar.zzi(), i5, 8, true)) {
                break;
            }
            long zzz = zzetVar.zzz();
            int zzB = zzetVar.zzB();
            if (zzz == 1) {
                zzafzVar.zzi(zzetVar.zzi(), 8, 8);
                i2 = 16;
                zzetVar.zzf(16);
                i = i4;
                j = zzetVar.zzD();
            } else {
                if (zzz == 0) {
                    long zzo2 = zzafzVar.zzo();
                    if (zzo2 != j4) {
                        zzz = (zzo2 - zzafzVar.zzm()) + 8;
                    }
                }
                i = i4;
                j = zzz;
                i2 = 8;
            }
            long j5 = i2;
            if (j < j5) {
                if (zzB == 1718773093) {
                    if (i2 == 8) {
                        j = 8;
                        zzB = 1718773093;
                    } else {
                        zzB = 1718773093;
                    }
                }
                return new com.google.android.gms.internal.ads.zzakx(zzB, j, i2);
            }
            i6 += i2;
            if (zzB != 1836019574) {
                if (zzB == 1970628964) {
                    zzB = 1970628964;
                } else {
                    i3 = i;
                    if (zzB != 1953653099 || zzB == 1835297121 || zzB == 1835626086) {
                        j2 = zzo;
                        i5 = 0;
                    } else {
                        if (zzB == 1836019558 || zzB == 1836475768) {
                            i5 = 1;
                            break;
                        }
                        z2 |= !(zzB != 1835295092);
                        if (zzB == 1937007212) {
                            if (j > 1000000) {
                                i5 = 0;
                                break;
                            }
                            zzB = 1937007212;
                        }
                        j2 = zzo;
                        if ((i6 + j) - j5 >= i3) {
                            i5 = 0;
                            break;
                        }
                        int i7 = (int) (j - j5);
                        i6 += i7;
                        if (zzB != 1718909296) {
                            i5 = 0;
                            if (i7 != 0) {
                                zzafzVar.zzk(i7);
                            }
                        } else {
                            if (i7 < 8) {
                                return new com.google.android.gms.internal.ads.zzakx(1718909296, i7, 8);
                            }
                            zzetVar.zza(i7);
                            i5 = 0;
                            zzafzVar.zzi(zzetVar.zzi(), 0, i7);
                            int zzB2 = zzetVar.zzB();
                            boolean zzd = zzd(zzB2) | z2;
                            zzetVar.zzk(4);
                            int zzd2 = zzetVar.zzd() / 4;
                            if (!zzd && zzd2 > 0) {
                                iArr = new int[zzd2];
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= zzd2) {
                                        z3 = zzd;
                                        break;
                                    }
                                    int zzB3 = zzetVar.zzB();
                                    iArr[i8] = zzB3;
                                    if (zzd(zzB3)) {
                                        break;
                                    }
                                    i8++;
                                }
                            } else {
                                z3 = zzd;
                                iArr = null;
                            }
                            if (!z3) {
                                return new com.google.android.gms.internal.ads.zzamm(zzB2, iArr);
                            }
                            z2 = z3;
                        }
                    }
                    i4 = i3;
                    zzo = j2;
                    j4 = -1;
                }
            }
            i3 = i + ((int) j);
            if (zzo != -1 && i3 > zzo) {
                i3 = (int) zzo;
            }
            if (zzB == 1836019574) {
                i4 = i3;
                i5 = 0;
                j4 = -1;
            }
            if (zzB != 1953653099) {
            }
            j2 = zzo;
            i5 = 0;
            i4 = i3;
            zzo = j2;
            j4 = -1;
        }
        if (!z2) {
            return com.google.android.gms.internal.ads.zzamd.zza;
        }
        if (z != i5) {
            return i5 != 0 ? com.google.android.gms.internal.ads.zzals.zza : com.google.android.gms.internal.ads.zzals.zzb;
        }
        return null;
    }

    private static boolean zzd(int i) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}

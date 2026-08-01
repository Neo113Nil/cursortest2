package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzamu {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzaho zza(zzagi zzagiVar) throws IOException {
        return zzc(zzagiVar, true);
    }

    public static zzaho zzb(zzagi zzagiVar) throws IOException {
        return zzc(zzagiVar, false);
    }

    private static zzaho zzc(zzagi zzagiVar, boolean z) throws IOException {
        long j;
        zzeu zzeuVar;
        int i;
        zzeu zzeuVar2;
        int i2;
        boolean z2;
        int[] iArr;
        long zzo = zzagiVar.zzo();
        long j2 = -1;
        long j3 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (zzo != -1 && zzo <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j3 = zzo;
        }
        zzeu zzeuVar3 = new zzeu(64);
        int i3 = (int) j3;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i3) {
            zzeuVar3.zza(8);
            if (!zzagiVar.zzh(zzeuVar3.zzi(), i4, 8, true)) {
                break;
            }
            long zzz = zzeuVar3.zzz();
            int zzB = zzeuVar3.zzB();
            if (zzz == 1) {
                zzagiVar.zzi(zzeuVar3.zzi(), 8, 8);
                i = 16;
                zzeuVar3.zzf(16);
                j = zzeuVar3.zzD();
                zzeuVar = zzeuVar3;
            } else {
                if (zzz == 0) {
                    long zzo2 = zzagiVar.zzo();
                    if (zzo2 != j2) {
                        zzz = (zzo2 - zzagiVar.zzm()) + 8;
                    }
                }
                j = zzz;
                zzeuVar = zzeuVar3;
                i = 8;
            }
            long j4 = i;
            if (j < j4) {
                if (zzB == 1718773093) {
                    if (i == 8) {
                        zzB = 1718773093;
                        j = 8;
                    } else {
                        zzB = 1718773093;
                    }
                }
                return new zzalj(zzB, j, i);
            }
            i5 += i;
            if (zzB != 1836019574) {
                if (zzB == 1970628964) {
                    zzB = 1970628964;
                } else {
                    if (zzB != 1953653099 || zzB == 1835297121 || zzB == 1835626086) {
                        zzeuVar2 = zzeuVar;
                        i2 = 0;
                    } else {
                        if (zzB == 1836019558 || zzB == 1836475768) {
                            i4 = 1;
                            break;
                        }
                        z3 |= !(zzB != 1835295092);
                        if (zzB == 1937007212) {
                            if (j > 1000000) {
                                i4 = 0;
                                break;
                            }
                            zzB = 1937007212;
                        }
                        if ((i5 + j) - j4 >= i3) {
                            i4 = 0;
                            break;
                        }
                        int i6 = (int) (j - j4);
                        i5 += i6;
                        if (zzB != 1718909296) {
                            zzeuVar2 = zzeuVar;
                            i2 = 0;
                            if (i6 != 0) {
                                zzagiVar.zzk(i6);
                            }
                        } else {
                            if (i6 < 8) {
                                return new zzalj(1718909296, i6, 8);
                            }
                            zzeuVar2 = zzeuVar;
                            zzeuVar2.zza(i6);
                            i2 = 0;
                            zzagiVar.zzi(zzeuVar2.zzi(), 0, i6);
                            int zzB2 = zzeuVar2.zzB();
                            boolean zzd = zzd(zzB2) | z3;
                            zzeuVar2.zzk(4);
                            int zzd2 = zzeuVar2.zzd() / 4;
                            if (!zzd && zzd2 > 0) {
                                int[] iArr2 = new int[zzd2];
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= zzd2) {
                                        z2 = zzd;
                                        iArr = iArr2;
                                        break;
                                    }
                                    int zzB3 = zzeuVar2.zzB();
                                    iArr2[i7] = zzB3;
                                    if (zzd(zzB3)) {
                                        iArr = iArr2;
                                        z2 = true;
                                        break;
                                    }
                                    i7++;
                                }
                            } else {
                                z2 = zzd;
                                iArr = null;
                            }
                            if (!z2) {
                                return new zzana(zzB2, iArr);
                            }
                            z3 = z2;
                        }
                    }
                    i4 = i2;
                    zzeuVar3 = zzeuVar2;
                    j2 = -1;
                }
            }
            i3 += (int) j;
            if (zzo != -1 && i3 > zzo) {
                i3 = (int) zzo;
            }
            if (zzB == 1836019574) {
                zzeuVar3 = zzeuVar;
                j2 = -1;
                i4 = 0;
            } else {
                if (zzB != 1953653099) {
                }
                zzeuVar2 = zzeuVar;
                i2 = 0;
                i4 = i2;
                zzeuVar3 = zzeuVar2;
                j2 = -1;
            }
        }
        if (!z3) {
            return zzamq.zza;
        }
        if (z != i4) {
            return i4 != 0 ? zzame.zza : zzame.zzb;
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

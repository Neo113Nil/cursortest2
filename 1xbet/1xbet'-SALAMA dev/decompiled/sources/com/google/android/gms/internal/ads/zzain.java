package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzain {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzady zza(zzacw zzacwVar) {
        return zzc(zzacwVar, true, false);
    }

    public static zzady zzb(zzacw zzacwVar, boolean z4) {
        return zzc(zzacwVar, false, z4);
    }

    private static zzady zzc(zzacw zzacwVar, boolean z4, boolean z7) {
        int i7;
        zzed zzedVar;
        int i8;
        int[] iArr;
        long jZzd = zzacwVar.zzd();
        long j = -1;
        long j3 = 4096;
        if (jZzd != -1 && jZzd <= 4096) {
            j3 = jZzd;
        }
        zzed zzedVar2 = new zzed(64);
        int i9 = (int) j3;
        int i10 = 0;
        int i11 = 0;
        boolean z8 = false;
        while (i11 < i9) {
            zzedVar2.zzI(8);
            boolean z9 = true;
            if (!zzacwVar.zzm(zzedVar2.zzN(), i10, 8, true)) {
                break;
            }
            long jZzu = zzedVar2.zzu();
            int iZzg = zzedVar2.zzg();
            if (jZzu == 1) {
                zzacwVar.zzh(zzedVar2.zzN(), 8, 8);
                i7 = 16;
                zzedVar2.zzK(16);
                jZzu = zzedVar2.zzt();
            } else {
                if (jZzu == 0) {
                    long jZzd2 = zzacwVar.zzd();
                    if (jZzd2 != j) {
                        jZzu = (jZzd2 - zzacwVar.zze()) + 8;
                    }
                }
                i7 = 8;
            }
            long j7 = jZzu;
            long j8 = i7;
            if (j7 < j8) {
                return new zzahk(iZzg, j7, i7);
            }
            i11 += i7;
            if (iZzg == 1836019574) {
                i9 += (int) j7;
                if (jZzd != -1 && i9 > jZzd) {
                    i9 = (int) jZzd;
                }
                zzedVar2 = zzedVar2;
                j = -1;
                i10 = 0;
            } else {
                if (iZzg == 1836019558 || iZzg == 1836475768) {
                    i10 = 1;
                    break;
                }
                z8 |= !(iZzg != 1835295092);
                long j9 = jZzd;
                if ((((long) i11) + j7) - j8 >= i9) {
                    i10 = 0;
                    break;
                }
                int i12 = (int) (j7 - j8);
                i11 += i12;
                if (iZzg != 1718909296) {
                    zzedVar = zzedVar2;
                    i8 = 0;
                    if (i12 != 0) {
                        zzacwVar.zzg(i12);
                    }
                } else {
                    if (i12 < 8) {
                        return new zzahk(1718909296, i12, 8);
                    }
                    zzedVar = zzedVar2;
                    zzedVar.zzI(i12);
                    i8 = 0;
                    zzacwVar.zzh(zzedVar.zzN(), 0, i12);
                    int iZzg2 = zzedVar.zzg();
                    boolean zZzd = zzd(iZzg2, z7) | z8;
                    zzedVar.zzM(4);
                    int iZzb = zzedVar.zzb() / 4;
                    if (!zZzd && iZzb > 0) {
                        iArr = new int[iZzb];
                        int i13 = 0;
                        while (true) {
                            if (i13 >= iZzb) {
                                z9 = zZzd;
                                break;
                            }
                            int iZzg3 = zzedVar.zzg();
                            iArr[i13] = iZzg3;
                            if (zzd(iZzg3, z7)) {
                                break;
                            }
                            i13++;
                        }
                    } else {
                        z9 = zZzd;
                        iArr = null;
                    }
                    if (!z9) {
                        return new zzais(iZzg2, iArr);
                    }
                    z8 = z9;
                }
                zzedVar2 = zzedVar;
                i10 = i8;
                jZzd = j9;
                j = -1;
            }
        }
        if (!z8) {
            return zzaij.zza;
        }
        if (z4 != i10) {
            return i10 != 0 ? zzaid.zza : zzaid.zzb;
        }
        return null;
    }

    private static boolean zzd(int i7, boolean z4) {
        if ((i7 >>> 8) == 3368816) {
            return true;
        }
        if (i7 == 1751476579) {
            if (z4) {
                return true;
            }
            i7 = 1751476579;
        }
        int[] iArr = zza;
        for (int i8 = 0; i8 < 29; i8++) {
            if (iArr[i8] == i7) {
                return true;
            }
        }
        return false;
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzain {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzady zza(zzacw zzacwVar) {
        return zzc(zzacwVar, true, false);
    }

    public static zzady zzb(zzacw zzacwVar, boolean z4) {
        return zzc(zzacwVar, false, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
    
        if (r11 != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0128, code lost:
    
        return com.google.android.gms.internal.ads.zzaij.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012b, code lost:
    
        if (r25 == r8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012d, code lost:
    
        if (r8 == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return com.google.android.gms.internal.ads.zzaid.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0134, code lost:
    
        return com.google.android.gms.internal.ads.zzaid.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009f, code lost:
    
        r8 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzady zzc(zzacw zzacwVar, boolean z4, boolean z7) {
        zzed zzedVar;
        int i7;
        zzed zzedVar2;
        int i8;
        int[] iArr;
        long zzd = zzacwVar.zzd();
        long j = -1;
        long j3 = 4096;
        if (zzd != -1 && zzd <= 4096) {
            j3 = zzd;
        }
        zzed zzedVar3 = new zzed(64);
        int i9 = (int) j3;
        int i10 = 0;
        int i11 = 0;
        boolean z8 = false;
        while (true) {
            if (i11 >= i9) {
                break;
            }
            zzedVar3.zzI(8);
            boolean z9 = true;
            if (!zzacwVar.zzm(zzedVar3.zzN(), i10, 8, true)) {
                break;
            }
            long zzu = zzedVar3.zzu();
            int zzg = zzedVar3.zzg();
            if (zzu == 1) {
                zzacwVar.zzh(zzedVar3.zzN(), 8, 8);
                i7 = 16;
                zzedVar3.zzK(16);
                zzu = zzedVar3.zzt();
                zzedVar = zzedVar3;
            } else {
                if (zzu == 0) {
                    long zzd2 = zzacwVar.zzd();
                    if (zzd2 != j) {
                        zzu = (zzd2 - zzacwVar.zze()) + 8;
                    }
                }
                zzedVar = zzedVar3;
                i7 = 8;
            }
            long j7 = zzu;
            long j8 = i7;
            if (j7 < j8) {
                return new zzahk(zzg, j7, i7);
            }
            i11 += i7;
            if (zzg == 1836019574) {
                i9 += (int) j7;
                if (zzd != -1 && i9 > zzd) {
                    i9 = (int) zzd;
                }
                zzedVar3 = zzedVar;
                j = -1;
                i10 = 0;
            } else {
                if (zzg == 1836019558 || zzg == 1836475768) {
                    break;
                }
                z8 |= !(zzg != 1835295092);
                long j9 = zzd;
                if ((i11 + j7) - j8 >= i9) {
                    i10 = 0;
                    break;
                }
                int i12 = (int) (j7 - j8);
                i11 += i12;
                if (zzg != 1718909296) {
                    zzedVar2 = zzedVar;
                    i8 = 0;
                    if (i12 != 0) {
                        zzacwVar.zzg(i12);
                    }
                } else {
                    if (i12 < 8) {
                        return new zzahk(1718909296, i12, 8);
                    }
                    zzedVar2 = zzedVar;
                    zzedVar2.zzI(i12);
                    i8 = 0;
                    zzacwVar.zzh(zzedVar2.zzN(), 0, i12);
                    int zzg2 = zzedVar2.zzg();
                    boolean zzd3 = zzd(zzg2, z7) | z8;
                    zzedVar2.zzM(4);
                    int zzb = zzedVar2.zzb() / 4;
                    if (!zzd3 && zzb > 0) {
                        iArr = new int[zzb];
                        int i13 = 0;
                        while (true) {
                            if (i13 >= zzb) {
                                z9 = zzd3;
                                break;
                            }
                            int zzg3 = zzedVar2.zzg();
                            iArr[i13] = zzg3;
                            if (zzd(zzg3, z7)) {
                                break;
                            }
                            i13++;
                        }
                    } else {
                        z9 = zzd3;
                        iArr = null;
                    }
                    if (!z9) {
                        return new zzais(zzg2, iArr);
                    }
                    z8 = z9;
                }
                zzedVar3 = zzedVar2;
                i10 = i8;
                zzd = j9;
                j = -1;
            }
        }
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

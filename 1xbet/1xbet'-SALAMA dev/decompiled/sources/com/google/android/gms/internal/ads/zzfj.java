package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzfj {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i7, int i8, boolean[] zArr) {
        int i9 = i8 - i7;
        zzcv.zzf(i9 >= 0);
        if (i9 == 0) {
            return i8;
        }
        if (zArr[0]) {
            zzi(zArr);
            return i7 - 3;
        }
        if (i9 > 1 && zArr[1] && bArr[i7] == 1) {
            zzi(zArr);
            return i7 - 2;
        }
        if (i9 > 2 && zArr[2] && bArr[i7] == 0 && bArr[i7 + 1] == 1) {
            zzi(zArr);
            return i7 - 1;
        }
        int i10 = i8 - 1;
        int i11 = i7 + 2;
        while (i11 < i10) {
            byte b7 = bArr[i11];
            if ((b7 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b7 == 1) {
                    zzi(zArr);
                    return i12;
                }
                i11 = i12;
            }
            i11 += 3;
        }
        zArr[0] = i9 <= 2 ? !(i9 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i8 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i8 + (-3)] == 0 && bArr[i8 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i9 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i8 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i8;
    }

    public static int zzb(zzz zzzVar) {
        if (Objects.equals(zzzVar.zzo, "video/avc")) {
            return 1;
        }
        return (Objects.equals(zzzVar.zzo, "video/hevc") || zzay.zzg(zzzVar.zzk, "video/hevc")) ? 2 : 0;
    }

    public static int zzc(byte[] bArr, int i7) {
        int i8;
        synchronized (zzc) {
            int i9 = 0;
            int i10 = 0;
            while (i9 < i7) {
                while (true) {
                    try {
                        if (i9 >= i7 - 2) {
                            i9 = i7;
                            break;
                        }
                        int i11 = i9 + 1;
                        if (bArr[i9] == 0 && bArr[i11] == 0 && bArr[i9 + 2] == 3) {
                            break;
                        }
                        i9 = i11;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i9 < i7) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i10) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i10] = i9;
                    i9 += 3;
                    i10++;
                }
            }
            i8 = i7 - i10;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = zzd[i14] - i12;
                System.arraycopy(bArr, i12, bArr, i13, i15);
                int i16 = i13 + i15;
                int i17 = i16 + 1;
                bArr[i16] = 0;
                i13 = i16 + 2;
                bArr[i17] = 0;
                i12 += i15 + 3;
            }
            System.arraycopy(bArr, i12, bArr, i13, i8 - i13);
        }
        return i8;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    public static zzfd zzd(byte[] bArr, int i7, int i8, zzfg zzfgVar) {
        int i9;
        boolean z4;
        int i10;
        int iZzc;
        int iZzc2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        int i16;
        int i17;
        int i18;
        int iZzb;
        int i19;
        zzff zzffVar;
        int i20;
        int iZza;
        int i21;
        int i22;
        zzfb zzfbVar;
        zzex zzexVarZzm = zzm(new zzfk(bArr, i7, i8));
        zzfk zzfkVar = new zzfk(bArr, i7 + 2, i8);
        zzfkVar.zzf(4);
        int iZza2 = zzfkVar.zza(3);
        if (zzexVarZzm.zzb != 0) {
            i9 = 7;
            if (iZza2 == 7) {
                z4 = true;
            } else {
                i9 = iZza2;
                z4 = false;
            }
        } else {
            i9 = iZza2;
            z4 = false;
        }
        int i23 = (zzfgVar == null || zzfgVar.zza.isEmpty()) ? 0 : ((zzew) zzfgVar.zza.get(Math.min(zzexVarZzm.zzb, zzfgVar.zza.size() - 1))).zza;
        zzey zzeyVarZzn = null;
        if (!z4) {
            zzfkVar.zze();
            zzeyVarZzn = zzn(zzfkVar, true, i9, null);
        } else if (zzfgVar != null) {
            zzez zzezVar = zzfgVar.zzb;
            int i24 = zzezVar.zzb[i23];
            if (zzezVar.zza.size() > i24) {
                zzeyVarZzn = (zzey) zzfgVar.zzb.zza.get(i24);
            }
        }
        int iZzc3 = zzfkVar.zzc();
        if (z4) {
            int iZza3 = zzfkVar.zzh() ? zzfkVar.zza(8) : -1;
            if (zzfgVar == null || (zzfbVar = zzfgVar.zzc) == null) {
                i13 = 0;
                iZzc2 = 0;
                i11 = 0;
                i12 = 0;
                iZzc = 0;
            } else {
                if (iZza3 == -1) {
                    iZza3 = zzfbVar.zzb[i23];
                }
                if (iZza3 == -1 || zzfbVar.zza.size() <= iZza3) {
                    i13 = 0;
                    iZzc2 = 0;
                    i11 = 0;
                    i12 = 0;
                    iZzc = 0;
                } else {
                    zzfa zzfaVar = (zzfa) zzfgVar.zzc.zza.get(iZza3);
                    int i25 = zzfaVar.zza;
                    int i26 = zzfaVar.zzd;
                    iZzc = zzfaVar.zze;
                    int i27 = zzfaVar.zzb;
                    iZzc2 = zzfaVar.zzc;
                    i13 = i26;
                    i11 = i25;
                    i12 = i27;
                }
            }
        } else {
            int iZzc4 = zzfkVar.zzc();
            if (iZzc4 == 3) {
                zzfkVar.zze();
                i10 = 3;
            } else {
                i10 = iZzc4;
            }
            int iZzc5 = zzfkVar.zzc();
            iZzc = zzfkVar.zzc();
            if (zzfkVar.zzh()) {
                int iZzc6 = zzfkVar.zzc();
                int iZzc7 = zzfkVar.zzc();
                int iZzc8 = zzfkVar.zzc();
                int iZzc9 = zzfkVar.zzc();
                iZzc5 = zzl(iZzc5, i10, iZzc6, iZzc7);
                iZzc = zzk(iZzc, i10, iZzc8, iZzc9);
            }
            int iZzc10 = zzfkVar.zzc();
            iZzc2 = zzfkVar.zzc();
            i11 = iZzc4;
            int i28 = iZzc5;
            i12 = iZzc10;
            i13 = i28;
        }
        int iZzc11 = zzfkVar.zzc();
        if (z4) {
            i14 = i13;
            i15 = -1;
        } else {
            int i29 = true != zzfkVar.zzh() ? i9 : 0;
            int iMax = -1;
            while (i29 <= i9) {
                zzfkVar.zzc();
                iMax = Math.max(zzfkVar.zzc(), iMax);
                zzfkVar.zzc();
                i29++;
                i13 = i13;
            }
            i14 = i13;
            i15 = iMax;
        }
        zzfkVar.zzc();
        zzfkVar.zzc();
        zzfkVar.zzc();
        zzfkVar.zzc();
        zzfkVar.zzc();
        zzfkVar.zzc();
        if (zzfkVar.zzh()) {
            int i30 = 6;
            if (z4 && zzfkVar.zzh()) {
                zzfkVar.zzf(6);
            } else if (zzfkVar.zzh()) {
                int i31 = 4;
                int i32 = 0;
                while (i32 < i31) {
                    int i33 = 0;
                    while (i33 < i30) {
                        if (zzfkVar.zzh()) {
                            int iMin = Math.min(64, 1 << ((i32 + i32) + 4));
                            if (i32 > 1) {
                                zzfkVar.zzb();
                            }
                            for (int i34 = 0; i34 < iMin; i34++) {
                                zzfkVar.zzb();
                            }
                            i22 = 3;
                        } else {
                            zzfkVar.zzc();
                            i22 = 3;
                        }
                        i33 += i32 == i22 ? 3 : 1;
                        iZzc3 = iZzc3;
                        i15 = i15;
                        i30 = 6;
                    }
                    i32++;
                    i31 = 4;
                    i30 = 6;
                }
            }
        }
        int i35 = i15;
        int i36 = iZzc3;
        zzfkVar.zzf(2);
        if (zzfkVar.zzh()) {
            zzfkVar.zzf(8);
            zzfkVar.zzc();
            zzfkVar.zzc();
            zzfkVar.zze();
        }
        int iZzc12 = zzfkVar.zzc();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i37 = iZzc2;
        int i38 = 0;
        int iZzc13 = -1;
        int i39 = -1;
        while (i38 < iZzc12) {
            if (i38 == 0 || !zzfkVar.zzh()) {
                int iZzc14 = zzfkVar.zzc();
                iZzc13 = zzfkVar.zzc();
                int[] iArr2 = new int[iZzc14];
                int i40 = 0;
                while (i40 < iZzc14) {
                    iArr2[i40] = (i40 > 0 ? iArr2[i40 - 1] : 0) - (zzfkVar.zzc() + 1);
                    zzfkVar.zze();
                    i40++;
                }
                int[] iArr3 = new int[iZzc13];
                int i41 = 0;
                while (i41 < iZzc13) {
                    iArr3[i41] = zzfkVar.zzc() + 1 + (i41 > 0 ? iArr3[i41 - 1] : 0);
                    zzfkVar.zze();
                    i41++;
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i39 = iZzc14;
            } else {
                int i42 = i39 + iZzc13;
                boolean zZzh = zzfkVar.zzh();
                boolean z7 = true;
                int iZzc15 = zzfkVar.zzc() + 1;
                int i43 = 1 - ((zZzh ? 1 : 0) + (zZzh ? 1 : 0));
                int i44 = i42 + 1;
                boolean[] zArr = new boolean[i44];
                int i45 = 0;
                while (i45 <= i42) {
                    if (zzfkVar.zzh()) {
                        zArr[i45] = z7;
                    } else {
                        zArr[i45] = zzfkVar.zzh();
                    }
                    i45++;
                    z7 = true;
                }
                int i46 = iZzc13 - 1;
                int[] iArr4 = new int[i44];
                int[] iArr5 = new int[i44];
                int i47 = 0;
                while (true) {
                    i21 = i43 * iZzc15;
                    if (i46 < 0) {
                        break;
                    }
                    int i48 = iArrCopyOf[i46] + i21;
                    if (i48 < 0 && zArr[i39 + i46]) {
                        iArr4[i47] = i48;
                        i47++;
                    }
                    i46--;
                }
                if (i21 < 0 && zArr[i42]) {
                    iArr4[i47] = i21;
                    i47++;
                }
                int i49 = i47;
                for (int i50 = 0; i50 < i39; i50++) {
                    int i51 = iArr[i50] + i21;
                    if (i51 < 0 && zArr[i50]) {
                        iArr4[i49] = i51;
                        i49++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i49);
                int i52 = 0;
                for (int i53 = i39 - 1; i53 >= 0; i53--) {
                    int i54 = iArr[i53] + i21;
                    if (i54 > 0 && zArr[i53]) {
                        iArr5[i52] = i54;
                        i52++;
                    }
                }
                if (i21 > 0 && zArr[i42]) {
                    iArr5[i52] = i21;
                    i52++;
                }
                int i55 = i52;
                for (int i56 = 0; i56 < iZzc13; i56++) {
                    int i57 = iArrCopyOf[i56] + i21;
                    if (i57 > 0 && zArr[i39 + i56]) {
                        iArr5[i55] = i57;
                        i55++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i55);
                iArr = iArrCopyOf2;
                i39 = i49;
                iZzc13 = i55;
            }
            i38++;
            iZzc12 = iZzc12;
            i9 = i9;
            zzexVarZzm = zzexVarZzm;
            i12 = i12;
            i11 = i11;
            zzeyVarZzn = zzeyVarZzn;
        }
        zzex zzexVar = zzexVarZzm;
        int i58 = i9;
        int i59 = i11;
        int i60 = i12;
        zzey zzeyVar = zzeyVarZzn;
        if (zzfkVar.zzh()) {
            int iZzc16 = zzfkVar.zzc();
            for (int i61 = 0; i61 < iZzc16; i61++) {
                zzfkVar.zzf(iZzc11 + 5);
            }
        }
        zzfkVar.zzf(2);
        float f8 = 1.0f;
        if (zzfkVar.zzh()) {
            if (zzfkVar.zzh()) {
                int iZza4 = zzfkVar.zza(8);
                if (iZza4 == 255) {
                    int iZza5 = zzfkVar.zza(16);
                    int iZza6 = zzfkVar.zza(16);
                    if (iZza5 != 0 && iZza6 != 0) {
                        f8 = iZza5 / iZza6;
                    }
                } else if (iZza4 < 17) {
                    f8 = zzb[iZza4];
                } else {
                    AbstractC0486a1.k(iZza4, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (zzfkVar.zzh()) {
                zzfkVar.zze();
            }
            if (zzfkVar.zzh()) {
                zzfkVar.zzf(3);
                i19 = true != zzfkVar.zzh() ? 2 : 1;
                if (zzfkVar.zzh()) {
                    int iZza7 = zzfkVar.zza(8);
                    int iZza8 = zzfkVar.zza(8);
                    zzfkVar.zzf(8);
                    iZza = zzk.zza(iZza7);
                    iZzb = zzk.zzb(iZza8);
                } else {
                    iZzb = -1;
                    iZza = -1;
                }
            } else if (zzfgVar == null || (zzffVar = zzfgVar.zzd) == null || zzffVar.zza.size() <= (i20 = zzffVar.zzb[i23])) {
                iZzb = -1;
                i19 = -1;
                iZza = -1;
            } else {
                zzfe zzfeVar = (zzfe) zzfgVar.zzd.zza.get(i20);
                iZza = zzfeVar.zza;
                int i62 = zzfeVar.zzb;
                iZzb = zzfeVar.zzc;
                i19 = i62;
            }
            if (zzfkVar.zzh()) {
                zzfkVar.zzc();
                zzfkVar.zzc();
            }
            zzfkVar.zze();
            if (zzfkVar.zzh()) {
                iZzc += iZzc;
            }
            i18 = iZzb;
            f7 = f8;
            i16 = i19;
            i17 = iZza;
        } else {
            f7 = 1.0f;
            i16 = -1;
            i17 = -1;
            i18 = -1;
        }
        return new zzfd(zzexVar, i58, zzeyVar, i59, i60, i37, i36, i14, iZzc, f7, i35, i17, i16, i18);
    }

    /* JADX WARN: Code duplicated, block: B:444:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    public static zzfg zze(byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        int[] iArr;
        int i11;
        zzff zzffVar;
        boolean z4;
        int iZza;
        int iZza2;
        int iZza3;
        int iZza4;
        int i12;
        int i13;
        int i14;
        int[] iArr2;
        int i15;
        boolean[][] zArr;
        int i16;
        boolean[][] zArr2;
        int[] iArr3;
        int i17;
        int i18;
        boolean z7;
        boolean zZzh;
        int i19;
        int i20;
        int i21;
        int iZzc;
        int i22;
        int i23;
        int i24;
        boolean z8;
        boolean z9;
        zzfk zzfkVar = new zzfk(bArr, i7, i8);
        zzex zzexVarZzm = zzm(zzfkVar);
        zzfkVar.zzf(4);
        boolean zZzh2 = zzfkVar.zzh();
        boolean zZzh3 = zzfkVar.zzh();
        int iZza5 = zzfkVar.zza(6);
        int i25 = iZza5 + 1;
        int iZza6 = zzfkVar.zza(3);
        zzfkVar.zzf(17);
        int i26 = 1;
        zzey zzeyVarZzn = zzn(zzfkVar, true, iZza6, null);
        int i27 = 0;
        for (int i28 = true != zzfkVar.zzh() ? iZza6 : 0; i28 <= iZza6; i28++) {
            zzfkVar.zzc();
            zzfkVar.zzc();
            zzfkVar.zzc();
        }
        int iZza7 = zzfkVar.zza(6);
        int iZzc2 = zzfkVar.zzc() + 1;
        zzez zzezVar = new zzez(zzfwh.zzo(zzeyVarZzn), new int[1]);
        boolean z10 = i25 >= 2 && iZzc2 >= 2;
        boolean z11 = zZzh2 && zZzh3;
        int i29 = iZza7 + 1;
        if (!z10 || !z11 || i29 < i25) {
            return new zzfg(zzexVarZzm, null, zzezVar, null, null);
        }
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iZzc2, i29);
        int[] iArr5 = new int[iZzc2];
        int[] iArr6 = new int[iZzc2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        while (i26 < iZzc2) {
            int i30 = i27;
            while (i27 <= iZza7) {
                if (zzfkVar.zzh()) {
                    iArr4[i26][i30] = i27;
                    iArr6[i26] = i27;
                    i30++;
                }
                iArr5[i26] = i30;
                i27++;
            }
            i26++;
            i27 = 0;
        }
        if (zzfkVar.zzh()) {
            zzfkVar.zzf(64);
            if (zzfkVar.zzh()) {
                zzfkVar.zzc();
            }
            int iZzc3 = zzfkVar.zzc();
            for (int i31 = 0; i31 < iZzc3; i31++) {
                zzfkVar.zzc();
                if (i31 == 0 || zzfkVar.zzh()) {
                    boolean zZzh4 = zzfkVar.zzh();
                    boolean zZzh5 = zzfkVar.zzh();
                    z9 = zZzh4;
                    z8 = zZzh5;
                    if (zZzh4 || zZzh5) {
                        zZzh = zzfkVar.zzh();
                        if (zZzh) {
                            zzfkVar.zzf(19);
                        }
                        zzfkVar.zzf(8);
                        if (zZzh) {
                            zzfkVar.zzf(4);
                        }
                        zzfkVar.zzf(15);
                        i20 = zZzh4;
                        i19 = zZzh5;
                    }
                    i21 = 0;
                    while (i21 <= iZza6) {
                        if (!zzfkVar.zzh() || zzfkVar.zzh()) {
                            zzfkVar.zzc();
                        } else {
                            if (zzfkVar.zzh()) {
                                iZzc = 0;
                            }
                            i22 = i20 + i19;
                            int[][] iArr7 = iArr4;
                            i23 = 0;
                            while (i23 < i22) {
                                int i32 = i22;
                                for (i24 = 0; i24 <= iZzc; i24++) {
                                    zzfkVar.zzc();
                                    zzfkVar.zzc();
                                    if (zZzh) {
                                        zzfkVar.zzc();
                                        zzfkVar.zzc();
                                    }
                                    zzfkVar.zze();
                                }
                                i23++;
                                i22 = i32;
                            }
                            i21++;
                            iArr6 = iArr6;
                            iZzc3 = iZzc3;
                            iArr4 = iArr7;
                        }
                        iZzc = zzfkVar.zzc();
                        i22 = i20 + i19;
                        int[][] iArr8 = iArr4;
                        i23 = 0;
                        while (i23 < i22) {
                            int i33 = i22;
                            while (i24 <= iZzc) {
                                zzfkVar.zzc();
                                zzfkVar.zzc();
                                if (zZzh) {
                                    zzfkVar.zzc();
                                    zzfkVar.zzc();
                                }
                                zzfkVar.zze();
                            }
                            i23++;
                            i22 = i33;
                        }
                        i21++;
                        iArr6 = iArr6;
                        iZzc3 = iZzc3;
                        iArr4 = iArr8;
                    }
                } else {
                    z9 = false;
                    z8 = false;
                }
                zZzh = false;
                i20 = z9;
                i19 = z8;
                i21 = 0;
                while (i21 <= iZza6) {
                    if (zzfkVar.zzh()) {
                        zzfkVar.zzc();
                        iZzc = zzfkVar.zzc();
                    } else {
                        zzfkVar.zzc();
                        iZzc = zzfkVar.zzc();
                    }
                    i22 = i20 + i19;
                    int[][] iArr9 = iArr4;
                    i23 = 0;
                    while (i23 < i22) {
                        int i34 = i22;
                        while (i24 <= iZzc) {
                            zzfkVar.zzc();
                            zzfkVar.zzc();
                            if (zZzh) {
                                zzfkVar.zzc();
                                zzfkVar.zzc();
                            }
                            zzfkVar.zze();
                        }
                        i23++;
                        i22 = i34;
                    }
                    i21++;
                    iArr6 = iArr6;
                    iZzc3 = iZzc3;
                    iArr4 = iArr9;
                }
            }
        }
        int[][] iArr10 = iArr4;
        int[] iArr11 = iArr6;
        if (!zzfkVar.zzh()) {
            return new zzfg(zzexVarZzm, null, zzezVar, null, null);
        }
        zzfkVar.zzd();
        zzey zzeyVarZzn2 = zzn(zzfkVar, false, iZza6, zzeyVarZzn);
        boolean zZzh6 = zzfkVar.zzh();
        boolean[] zArr3 = new boolean[16];
        int i35 = 0;
        for (int i36 = 0; i36 < 16; i36++) {
            boolean zZzh7 = zzfkVar.zzh();
            zArr3[i36] = zZzh7;
            if (zZzh7) {
                i35++;
            }
        }
        if (i35 == 0 || !zArr3[1]) {
            return new zzfg(zzexVarZzm, null, zzezVar, null, null);
        }
        int i37 = i35 + 1;
        int[] iArr12 = new int[i35];
        for (int i38 = 0; i38 < i35 - (zZzh6 ? 1 : 0); i38++) {
            iArr12[i38] = zzfkVar.zza(3);
        }
        int[] iArr13 = new int[i37];
        if (zZzh6) {
            for (int i39 = 1; i39 < i35; i39++) {
                for (int i40 = 0; i40 < i39; i40++) {
                    iArr13[i39] = iArr12[i40] + 1 + iArr13[i39];
                }
            }
            iArr13[i35] = 6;
        }
        int[][] iArr14 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i25, i35);
        int[] iArr15 = new int[i25];
        iArr15[0] = 0;
        boolean zZzh8 = zzfkVar.zzh();
        int i41 = 1;
        while (i41 < i25) {
            if (zZzh8) {
                iArr15[i41] = zzfkVar.zza(6);
            } else {
                iArr15[i41] = i41;
            }
            if (zZzh6) {
                z7 = zZzh6 ? 1 : 0;
                int i42 = 0;
                while (i42 < i35) {
                    int i43 = i42 + 1;
                    iArr14[i41][i42] = (iArr15[i41] & ((1 << iArr13[i43]) - 1)) >> iArr13[i42];
                    i42 = i43;
                }
            } else {
                int i44 = 0;
                while (i44 < i35) {
                    iArr14[i41][i44] = zzfkVar.zza(iArr12[i44] + 1);
                    i44++;
                    zZzh6 = zZzh6 ? 1 : 0;
                }
                z7 = zZzh6;
            }
            i41++;
            zZzh6 = z7;
        }
        int[] iArr16 = new int[i29];
        int i45 = 1;
        for (int i46 = 0; i46 < i25; i46++) {
            iArr16[iArr15[i46]] = -1;
            int i47 = 0;
            int i48 = 0;
            while (i47 < 16) {
                if (zArr3[i47]) {
                    i17 = 1;
                    if (i47 == 1) {
                        iArr16[iArr15[i46]] = iArr14[i46][i48];
                        i18 = 1;
                    } else {
                        i18 = i47;
                    }
                    i48++;
                    i47 = i18;
                } else {
                    i17 = 1;
                }
                i47 += i17;
            }
            if (i46 > 0) {
                int i49 = 0;
                while (true) {
                    if (i49 >= i46) {
                        i45++;
                        break;
                    }
                    if (iArr16[iArr15[i46]] == iArr16[iArr15[i49]]) {
                        break;
                    }
                    i49++;
                }
            }
        }
        int iZza8 = zzfkVar.zza(4);
        if (i45 < 2 || iZza8 == 0) {
            return new zzfg(zzexVarZzm, null, zzezVar, null, null);
        }
        int[] iArr17 = new int[i45];
        for (int i50 = 0; i50 < i45; i50++) {
            iArr17[i50] = zzfkVar.zza(iZza8);
        }
        int[] iArr18 = new int[i29];
        for (int i51 = 0; i51 < i25; i51++) {
            iArr18[Math.min(iArr15[i51], iZza7)] = i51;
        }
        zzfwe zzfweVar = new zzfwe();
        int i52 = 0;
        while (i52 <= iZza7) {
            int[] iArr19 = iArr16;
            int iMin = Math.min(iArr16[i52], i45 - 1);
            zzfweVar.zzf(new zzew(iArr18[i52], iMin >= 0 ? iArr17[iMin] : -1));
            i52++;
            iArr16 = iArr19;
        }
        zzfwh zzfwhVarZzi = zzfweVar.zzi();
        if (((zzew) zzfwhVarZzi.get(0)).zzb == -1) {
            return new zzfg(zzexVarZzm, null, zzezVar, null, null);
        }
        int i53 = 1;
        while (true) {
            if (i53 > iZza7) {
                i9 = -1;
                i53 = -1;
                break;
            }
            i9 = -1;
            if (((zzew) zzfwhVarZzi.get(i53)).zzb != -1) {
                break;
            }
            i53++;
        }
        if (i53 == i9) {
            return new zzfg(zzexVarZzm, null, zzezVar, null, null);
        }
        Class cls = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls, i25, i25);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls, i25, i25);
        for (int i54 = 1; i54 < i25; i54++) {
            for (int i55 = 0; i55 < i54; i55++) {
                boolean[] zArr6 = zArr4[i54];
                boolean[] zArr7 = zArr5[i54];
                boolean zZzh9 = zzfkVar.zzh();
                zArr7[i55] = zZzh9;
                zArr6[i55] = zZzh9;
            }
        }
        for (int i56 = 1; i56 < i25; i56++) {
            for (int i57 = 0; i57 < iZza5; i57++) {
                for (int i58 = 0; i58 < i56; i58++) {
                    boolean[] zArr8 = zArr5[i56];
                    if (zArr8[i58] && zArr5[i58][i57]) {
                        zArr8[i57] = true;
                        break;
                    }
                }
            }
        }
        int[] iArr20 = new int[i29];
        for (int i59 = 0; i59 < i25; i59++) {
            int i60 = 0;
            for (int i61 = 0; i61 < i59; i61++) {
                i60 += zArr4[i59][i61] ? 1 : 0;
            }
            iArr20[iArr15[i59]] = i60;
        }
        int i62 = 0;
        for (int i63 = 0; i63 < i25; i63++) {
            if (iArr20[iArr15[i63]] == 0) {
                i62++;
            }
        }
        if (i62 > 1) {
            return new zzfg(zzexVarZzm, null, zzezVar, null, null);
        }
        int[] iArr21 = new int[i25];
        int[] iArr22 = new int[i10];
        if (zzfkVar.zzh()) {
            int i64 = 0;
            while (i64 < i25) {
                i10 = iZzc2;
                iArr21[i64] = zzfkVar.zza(3);
                i64++;
                iArr15 = iArr15;
            }
            i10 = iZzc2;
            iArr = iArr15;
            i11 = iZza6;
        } else {
            i10 = iZzc2;
            iArr = iArr15;
            i11 = iZza6;
            Arrays.fill(iArr21, 0, i25, i11);
        }
        int i65 = 0;
        while (i65 < i10) {
            int i66 = i53;
            boolean[][] zArr9 = zArr5;
            int[] iArr23 = iArr20;
            int iMax = 0;
            for (int i67 = 0; i67 < iArr5[i65]; i67++) {
                iMax = Math.max(iMax, iArr21[((zzew) zzfwhVarZzi.get(iArr10[i65][i67])).zza]);
            }
            iArr22[i65] = iMax + 1;
            i65++;
            zArr5 = zArr9;
            iArr20 = iArr23;
            i53 = i66;
        }
        int i68 = i53;
        boolean[][] zArr10 = zArr5;
        int[] iArr24 = iArr20;
        if (zzfkVar.zzh()) {
            int i69 = 0;
            while (i69 < iZza5) {
                int i70 = i69 + 1;
                for (int i71 = i70; i71 < i25; i71++) {
                    if (zArr4[i71][i69]) {
                        zzfkVar.zzf(3);
                    }
                }
                i69 = i70;
            }
        }
        zzfkVar.zze();
        int iZzc4 = zzfkVar.zzc() + 1;
        zzfwe zzfweVar2 = new zzfwe();
        zzfweVar2.zzf(zzeyVarZzn);
        if (iZzc4 > 1) {
            zzey zzeyVarZzn3 = zzeyVarZzn2;
            zzfweVar2.zzf(zzeyVarZzn3);
            for (int i72 = 2; i72 < iZzc4; i72++) {
                zzeyVarZzn3 = zzn(zzfkVar, zzfkVar.zzh(), i11, zzeyVarZzn3);
                zzfweVar2.zzf(zzeyVarZzn3);
            }
        }
        zzfwh zzfwhVarZzi2 = zzfweVar2.zzi();
        int iZzc5 = zzfkVar.zzc() + i10;
        if (iZzc5 > i10) {
            return new zzfg(zzexVarZzm, null, zzezVar, null, null);
        }
        int iZza9 = zzfkVar.zza(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iZzc5, i29);
        int[] iArr25 = new int[iZzc5];
        int[] iArr26 = new int[iZzc5];
        int i73 = 0;
        while (i73 < i10) {
            int i74 = i10;
            iArr25[i73] = 0;
            int i75 = iArr11[i73];
            iArr26[i73] = i75;
            if (iZza9 == 0) {
                zArr2 = zArr4;
                i16 = i25;
                iArr3 = iArr22;
                Arrays.fill(zArr11[i73], 0, iArr5[i73], true);
                iArr25[i73] = iArr5[i73];
            } else {
                i16 = i25;
                zArr2 = zArr4;
                iArr3 = iArr22;
                if (iZza9 == 1) {
                    for (int i76 = 0; i76 < iArr5[i73]; i76++) {
                        zArr11[i73][i76] = iArr10[i73][i76] == i75;
                    }
                    iArr25[i73] = 1;
                } else {
                    zArr11[0][0] = true;
                    iArr25[0] = 1;
                }
                i73++;
                i10 = i74;
                zArr4 = zArr2;
                iArr22 = iArr3;
                i25 = i16;
            }
            i73++;
            i10 = i74;
            zArr4 = zArr2;
            iArr22 = iArr3;
            i25 = i16;
        }
        int i77 = i25;
        boolean[][] zArr12 = zArr4;
        int[] iArr27 = iArr22;
        int i78 = i10;
        int[] iArr28 = new int[i29];
        int i79 = 2;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iZzc5, i29);
        int i80 = 0;
        int i81 = 1;
        while (i81 < iZzc5) {
            if (iZza9 == i79) {
                for (int i82 = 0; i82 < iArr5[i81]; i82++) {
                    zArr11[i81][i82] = zzfkVar.zzh();
                    int i83 = iArr25[i81];
                    boolean z12 = zArr11[i81][i82];
                    iArr25[i81] = i83 + (z12 ? 1 : 0);
                    if (z12) {
                        iArr26[i81] = iArr10[i81][i82];
                    }
                }
            }
            if (i80 != 0) {
                i12 = iZza9;
                i13 = i68;
            } else if (iArr10[i81][0] == 0 && zArr11[i81][0]) {
                i80 = 0;
                int i84 = 1;
                while (i84 < iArr5[i81]) {
                    int i85 = iZza9;
                    int i86 = i68;
                    if (iArr10[i81][i84] == i86 && zArr11[i81][i86]) {
                        i80 = i81;
                    }
                    i84++;
                    i68 = i86;
                    iZza9 = i85;
                }
                i12 = iZza9;
                i13 = i68;
            } else {
                i12 = iZza9;
                i13 = i68;
                i80 = 0;
            }
            int i87 = 0;
            while (i87 < iArr5[i81]) {
                if (iZzc4 > 1) {
                    zArr13[i81][i87] = zArr11[i81][i87];
                    iArr2 = iArr26;
                    i15 = i13;
                    i14 = iZzc4;
                    int iZza10 = zzfza.zza(iZzc4, RoundingMode.CEILING);
                    if (zArr13[i81][i87]) {
                        zArr = zArr11;
                        break;
                    }
                    int i88 = ((zzew) zzfwhVarZzi.get(iArr10[i81][i87])).zza;
                    int i89 = 0;
                    while (true) {
                        if (i89 >= i87) {
                            zArr = zArr11;
                            break;
                        }
                        zArr = zArr11;
                        if (zArr10[i88][((zzew) zzfwhVarZzi.get(iArr10[i81][i89])).zza]) {
                            zArr13[i81][i87] = true;
                            break;
                        }
                        i89++;
                        zArr11 = zArr;
                    }
                    if (zArr13[i81][i87]) {
                        if (i80 <= 0 || i81 != i80) {
                            zzfkVar.zzf(iZza10);
                        } else {
                            iArr28[i87] = zzfkVar.zza(iZza10);
                        }
                    }
                } else {
                    i14 = iZzc4;
                    iArr2 = iArr26;
                    i15 = i13;
                    zArr = zArr11;
                }
                i87++;
                iArr26 = iArr2;
                i13 = i15;
                iZzc4 = i14;
                zArr11 = zArr;
            }
            int i90 = iZzc4;
            int[] iArr29 = iArr26;
            i68 = i13;
            boolean[][] zArr14 = zArr11;
            if (iArr25[i81] == 1 && iArr24[iArr29[i81]] > 0) {
                zzfkVar.zze();
            }
            i81++;
            iArr26 = iArr29;
            iZza9 = i12;
            iZzc4 = i90;
            zArr11 = zArr14;
            i79 = 2;
        }
        if (i80 == 0) {
            return new zzfg(zzexVarZzm, null, zzezVar, null, null);
        }
        int iZzc6 = zzfkVar.zzc();
        int i91 = iZzc6 + 1;
        zzfwe zzfweVarZzi = zzfwh.zzi(i91);
        int[] iArr30 = new int[i77];
        int i92 = 0;
        while (i92 < i91) {
            int iZza11 = zzfkVar.zza(16);
            int iZza12 = zzfkVar.zza(16);
            if (zzfkVar.zzh()) {
                iZza2 = zzfkVar.zza(2);
                if (iZza2 == 3) {
                    zzfkVar.zze();
                }
                iZza3 = zzfkVar.zza(4);
                iZza4 = zzfkVar.zza(4);
            } else {
                iZza2 = 0;
                iZza3 = 0;
                iZza4 = 0;
            }
            if (zzfkVar.zzh()) {
                int iZzc7 = zzfkVar.zzc();
                int iZzc8 = zzfkVar.zzc();
                int iZzc9 = zzfkVar.zzc();
                int iZzc10 = zzfkVar.zzc();
                iZza11 = zzl(iZza11, iZza2, iZzc7, iZzc8);
                iZza12 = zzk(iZza12, iZza2, iZzc9, iZzc10);
            }
            zzfweVarZzi.zzf(new zzfa(iZza2, iZza3, iZza4, iZza11, iZza12));
            i92++;
            zzfwhVarZzi = zzfwhVarZzi;
            zzexVarZzm = zzexVarZzm;
            iArr28 = iArr28;
        }
        zzex zzexVar = zzexVarZzm;
        zzfwh zzfwhVar = zzfwhVarZzi;
        int[] iArr31 = iArr28;
        if (i91 <= 1 || !zzfkVar.zzh()) {
            for (int i93 = 1; i93 < i77; i93++) {
                iArr30[i93] = Math.min(i93, iZzc6);
            }
        } else {
            int iZza13 = zzfza.zza(i91, RoundingMode.CEILING);
            for (int i94 = 1; i94 < i77; i94++) {
                iArr30[i94] = zzfkVar.zza(iZza13);
            }
        }
        zzfb zzfbVar = new zzfb(zzfweVarZzi.zzi(), iArr30);
        zzfkVar.zzf(2);
        for (int i95 = 1; i95 < i77; i95++) {
            if (iArr24[iArr[i95]] == 0) {
                zzfkVar.zze();
            }
        }
        for (int i96 = 1; i96 < iZzc5; i96++) {
            boolean zZzh10 = zzfkVar.zzh();
            int i97 = 0;
            while (i97 < iArr27[i96]) {
                if ((i97 <= 0 || !zZzh10) ? i97 == 0 : zzfkVar.zzh()) {
                    for (int i98 = 0; i98 < iArr5[i96]; i98++) {
                        if (zArr13[i96][i98]) {
                            zzfkVar.zzc();
                        }
                    }
                    zzfkVar.zzc();
                    zzfkVar.zzc();
                }
                i97++;
            }
        }
        int iZzc11 = zzfkVar.zzc() + 2;
        if (zzfkVar.zzh()) {
            zzfkVar.zzf(iZzc11);
        } else {
            for (int i99 = 1; i99 < i77; i99++) {
                for (int i100 = 0; i100 < i99; i100++) {
                    if (zArr12[i99][i100]) {
                        zzfkVar.zzf(iZzc11);
                    }
                }
            }
        }
        int iZzc12 = zzfkVar.zzc();
        for (int i101 = 1; i101 <= iZzc12; i101++) {
            zzfkVar.zzf(8);
        }
        if (zzfkVar.zzh()) {
            zzfkVar.zzd();
            if (zzfkVar.zzh() || zzfkVar.zzh()) {
                zzfkVar.zze();
            }
            boolean zZzh11 = zzfkVar.zzh();
            boolean zZzh12 = zzfkVar.zzh();
            if (zZzh11 || zZzh12) {
                for (int i102 = 0; i102 < i78; i102++) {
                    for (int i103 = 0; i103 < iArr27[i102]; i103++) {
                        boolean zZzh13 = zZzh11 ? zzfkVar.zzh() : false;
                        boolean zZzh14 = zZzh12 ? zzfkVar.zzh() : false;
                        if (zZzh13) {
                            zzfkVar.zzf(32);
                        }
                        if (zZzh14) {
                            zzfkVar.zzf(18);
                        }
                    }
                }
            }
            boolean zZzh15 = zzfkVar.zzh();
            if (zZzh15) {
                z4 = true;
                iZza = zzfkVar.zza(4) + 1;
            } else {
                z4 = true;
                iZza = i77;
            }
            zzfwe zzfweVarZzi2 = zzfwh.zzi(iZza);
            int[] iArr32 = new int[i77];
            int i104 = 0;
            while (i104 < iZza) {
                zzfkVar.zzf(3);
                int i105 = z4 != zzfkVar.zzh() ? 2 : 1;
                int iZza14 = zzk.zza(zzfkVar.zza(8));
                int iZzb = zzk.zzb(zzfkVar.zza(8));
                zzfkVar.zzf(8);
                zzfweVarZzi2.zzf(new zzfe(iZza14, i105, iZzb));
                i104++;
                z4 = true;
            }
            if (zZzh15 && iZza > 1) {
                for (int i106 = 0; i106 < i77; i106++) {
                    iArr32[i106] = zzfkVar.zza(4);
                }
            }
            zzffVar = new zzff(zzfweVarZzi2.zzi(), iArr32);
        } else {
            zzffVar = null;
        }
        return new zzfg(zzexVar, zzfwhVar, new zzez(zzfwhVarZzi2, iArr31), zzfbVar, zzffVar);
    }

    public static zzfh zzf(byte[] bArr, int i7, int i8) {
        zzfk zzfkVar = new zzfk(bArr, 4, i8);
        int iZzc = zzfkVar.zzc();
        int iZzc2 = zzfkVar.zzc();
        zzfkVar.zze();
        return new zzfh(iZzc, iZzc2, zzfkVar.zzh());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:113:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:122:0x0201  */
    /* JADX WARN: Code duplicated, block: B:125:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0215  */
    /* JADX WARN: Code duplicated, block: B:131:0x021c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0228  */
    /* JADX WARN: Code duplicated, block: B:136:0x0248  */
    /* JADX WARN: Code duplicated, block: B:137:0x024f  */
    /* JADX WARN: Code duplicated, block: B:142:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    /* JADX WARN: Code duplicated, block: B:67:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x013e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0167 A[PHI: r2
      0x0167: PHI (r2v25 int) = (r2v4 int), (r2v3 int) binds: [B:86:0x016c, B:82:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x016a A[PHI: r2
      0x016a: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v26 int) binds: [B:72:0x014f, B:74:0x0153, B:76:0x0157, B:78:0x015b, B:80:0x015f, B:83:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x016e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x017e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0188  */
    /* JADX WARN: Code duplicated, block: B:98:0x0199  */
    /* JADX WARN: Code duplicated, block: B:99:0x019c  */
    public static zzfi zzg(byte[] bArr, int i7, int i8) {
        int iZzc;
        int i9;
        boolean zZzh;
        int iZzc2;
        int iZzc3;
        int i10;
        int i11;
        int i12;
        int i13;
        int iZzb;
        int i14;
        int iZzc4;
        boolean z4;
        boolean zZzh2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iZzb2;
        float f7;
        float f8;
        boolean zZzh3;
        boolean zZzh4;
        int iZza;
        int iZza2;
        int i24;
        int i25;
        zzfk zzfkVar = new zzfk(bArr, i7, i8);
        int iZza3 = zzfkVar.zza(8);
        int iZza4 = zzfkVar.zza(8);
        int iZza5 = zzfkVar.zza(8);
        int iZzc5 = zzfkVar.zzc();
        if (iZza3 == 100 || iZza3 == 110 || iZza3 == 122 || iZza3 == 244 || iZza3 == 44 || iZza3 == 83 || iZza3 == 86 || iZza3 == 118 || iZza3 == 128) {
            iZzc = zzfkVar.zzc();
            if (iZzc == 3) {
                zZzh = zzfkVar.zzh();
                i9 = 3;
            } else {
                i9 = iZzc;
                zZzh = false;
            }
            iZzc2 = zzfkVar.zzc();
            iZzc3 = zzfkVar.zzc();
            zzfkVar.zze();
            if (zzfkVar.zzh()) {
                if (i9 != 3) {
                    i10 = 8;
                } else {
                    i10 = 12;
                }
                for (i11 = 0; i11 < i10; i11++) {
                    if (!zzfkVar.zzh()) {
                        if (i11 < 6) {
                            i12 = 16;
                        } else {
                            i12 = 64;
                        }
                        iZzb = 8;
                        i14 = 8;
                        for (i13 = 0; i13 < i12; i13++) {
                            if (iZzb != 0) {
                                iZzb = ((zzfkVar.zzb() + i14) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i14 = iZzb;
                            }
                        }
                    }
                }
            }
        } else if (iZza3 == 138) {
            iZza3 = 138;
            iZzc = zzfkVar.zzc();
            if (iZzc == 3) {
                zZzh = zzfkVar.zzh();
                i9 = 3;
            } else {
                i9 = iZzc;
                zZzh = false;
            }
            iZzc2 = zzfkVar.zzc();
            iZzc3 = zzfkVar.zzc();
            zzfkVar.zze();
            if (zzfkVar.zzh()) {
                if (i9 != 3) {
                    i10 = 8;
                } else {
                    i10 = 12;
                }
                while (i11 < i10) {
                    if (!zzfkVar.zzh()) {
                        if (i11 < 6) {
                            i12 = 16;
                        } else {
                            i12 = 64;
                        }
                        iZzb = 8;
                        i14 = 8;
                        while (i13 < i12) {
                            if (iZzb != 0) {
                                iZzb = ((zzfkVar.zzb() + i14) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i14 = iZzb;
                            }
                        }
                    }
                }
            }
        } else {
            iZzc = 1;
            zZzh = false;
            iZzc2 = 0;
            iZzc3 = 0;
        }
        int iZzc6 = zzfkVar.zzc() + 4;
        int iZzc7 = zzfkVar.zzc();
        if (iZzc7 != 0) {
            if (iZzc7 == 1) {
                boolean zZzh5 = zzfkVar.zzh();
                zzfkVar.zzb();
                zzfkVar.zzb();
                long jZzc = zzfkVar.zzc();
                for (int i26 = 0; i26 < jZzc; i26++) {
                    zzfkVar.zzc();
                }
                z4 = zZzh5;
                iZzc7 = 1;
                iZzc4 = 0;
            } else {
                iZzc4 = 0;
            }
            int iZzc8 = zzfkVar.zzc();
            zzfkVar.zze();
            int iZzc9 = zzfkVar.zzc() + 1;
            int iZzc10 = zzfkVar.zzc() + 1;
            zZzh2 = zzfkVar.zzh();
            i15 = 2 - (zZzh2 ? 1 : 0);
            if (!zZzh2) {
                zzfkVar.zze();
            }
            zzfkVar.zze();
            i16 = iZzc9 * 16;
            i17 = iZzc10 * i15 * 16;
            if (zzfkVar.zzh()) {
                int iZzc11 = zzfkVar.zzc();
                int iZzc12 = zzfkVar.zzc();
                int iZzc13 = zzfkVar.zzc();
                int iZzc14 = zzfkVar.zzc();
                if (iZzc == 0) {
                    i24 = 1;
                } else {
                    if (iZzc == 3) {
                        i24 = 1;
                    } else {
                        i24 = 2;
                    }
                    if (iZzc == 1) {
                        i25 = 2;
                    } else {
                        i25 = 1;
                    }
                    i15 *= i25;
                }
                i16 -= (iZzc11 + iZzc12) * i24;
                i17 -= (iZzc13 + iZzc14) * i15;
            }
            int i27 = i16;
            int i28 = i17;
            if (iZza3 != 44 || iZza3 == 86 || iZza3 == 100 || iZza3 == 110 || iZza3 == 122) {
                if ((iZza4 & 16) != 0) {
                    i18 = iZza3;
                    i19 = 0;
                } else {
                    i18 = iZza3;
                    i19 = 16;
                }
            } else if (iZza3 == 244) {
                iZza3 = 244;
                if ((iZza4 & 16) != 0) {
                    i18 = iZza3;
                    i19 = 0;
                } else {
                    i18 = iZza3;
                    i19 = 16;
                }
            } else {
                i18 = iZza3;
                i19 = 16;
            }
            i20 = -1;
            if (zzfkVar.zzh()) {
                if (zzfkVar.zzh()) {
                    iZza = zzfkVar.zza(8);
                    if (iZza == 255) {
                        iZza2 = zzfkVar.zza(16);
                        int iZza6 = zzfkVar.zza(16);
                        if (iZza2 != 0 || iZza6 == 0) {
                            f8 = 1.0f;
                        } else {
                            f8 = iZza2 / iZza6;
                        }
                    } else if (iZza < 17) {
                        f8 = zzb[iZza];
                    } else {
                        AbstractC0486a1.k(iZza, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        f8 = 1.0f;
                    }
                } else {
                    f8 = 1.0f;
                }
                if (zzfkVar.zzh()) {
                    zzfkVar.zze();
                }
                if (zzfkVar.zzh()) {
                    zzfkVar.zzf(3);
                    int i29 = true != zzfkVar.zzh() ? 2 : 1;
                    if (zzfkVar.zzh()) {
                        int iZza7 = zzfkVar.zza(8);
                        int iZza8 = zzfkVar.zza(8);
                        zzfkVar.zzf(8);
                        int iZza9 = zzk.zza(iZza7);
                        iZzb2 = zzk.zzb(iZza8);
                        i22 = iZza9;
                    } else {
                        i22 = -1;
                        iZzb2 = -1;
                    }
                    i20 = i29;
                } else {
                    i22 = -1;
                    iZzb2 = -1;
                }
                if (zzfkVar.zzh()) {
                    zzfkVar.zzc();
                    zzfkVar.zzc();
                }
                if (zzfkVar.zzh()) {
                    zzfkVar.zzf(65);
                }
                zZzh3 = zzfkVar.zzh();
                if (zZzh3) {
                    zzo(zzfkVar);
                }
                zZzh4 = zzfkVar.zzh();
                if (zZzh4) {
                    zzo(zzfkVar);
                }
                if (zZzh3 || zZzh4) {
                    zzfkVar.zze();
                }
                zzfkVar.zze();
                if (zzfkVar.zzh()) {
                    zzfkVar.zze();
                    zzfkVar.zzc();
                    zzfkVar.zzc();
                    zzfkVar.zzc();
                    zzfkVar.zzc();
                    int iZzc15 = zzfkVar.zzc();
                    zzfkVar.zzc();
                    i21 = iZzc15;
                } else {
                    i21 = i19;
                }
                i23 = i20;
                f7 = f8;
            } else {
                i21 = i19;
                i22 = -1;
                i23 = -1;
                iZzb2 = -1;
                f7 = 1.0f;
            }
            return new zzfi(i18, iZza4, iZza5, iZzc5, iZzc8, i27, i28, f7, iZzc2, iZzc3, zZzh, zZzh2, iZzc6, iZzc7, iZzc4, z4, i22, i23, iZzb2, i21);
        }
        iZzc4 = zzfkVar.zzc() + 4;
        z4 = false;
        int iZzc16 = zzfkVar.zzc();
        zzfkVar.zze();
        int iZzc17 = zzfkVar.zzc() + 1;
        int iZzc18 = zzfkVar.zzc() + 1;
        zZzh2 = zzfkVar.zzh();
        i15 = 2 - (zZzh2 ? 1 : 0);
        if (!zZzh2) {
            zzfkVar.zze();
        }
        zzfkVar.zze();
        i16 = iZzc17 * 16;
        i17 = iZzc18 * i15 * 16;
        if (zzfkVar.zzh()) {
            int iZzc19 = zzfkVar.zzc();
            int iZzc110 = zzfkVar.zzc();
            int iZzc111 = zzfkVar.zzc();
            int iZzc112 = zzfkVar.zzc();
            if (iZzc == 0) {
                i24 = 1;
            } else {
                if (iZzc == 3) {
                    i24 = 1;
                } else {
                    i24 = 2;
                }
                if (iZzc == 1) {
                    i25 = 2;
                } else {
                    i25 = 1;
                }
                i15 *= i25;
            }
            i16 -= (iZzc19 + iZzc110) * i24;
            i17 -= (iZzc111 + iZzc112) * i15;
        }
        int i210 = i16;
        int i211 = i17;
        if (iZza3 != 44) {
            if ((iZza4 & 16) != 0) {
                i18 = iZza3;
                i19 = 0;
            } else {
                i18 = iZza3;
                i19 = 16;
            }
        } else if ((iZza4 & 16) != 0) {
            i18 = iZza3;
            i19 = 0;
        } else {
            i18 = iZza3;
            i19 = 16;
        }
        i20 = -1;
        if (zzfkVar.zzh()) {
            if (zzfkVar.zzh()) {
                f8 = 1.0f;
            } else {
                iZza = zzfkVar.zza(8);
                if (iZza == 255) {
                    iZza2 = zzfkVar.zza(16);
                    int iZza10 = zzfkVar.zza(16);
                    if (iZza2 != 0) {
                        f8 = 1.0f;
                    } else {
                        f8 = 1.0f;
                    }
                } else if (iZza < 17) {
                    f8 = zzb[iZza];
                } else {
                    AbstractC0486a1.k(iZza, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    f8 = 1.0f;
                }
            }
            if (zzfkVar.zzh()) {
                zzfkVar.zze();
            }
            if (zzfkVar.zzh()) {
                zzfkVar.zzf(3);
                if (true != zzfkVar.zzh()) {
                }
                if (zzfkVar.zzh()) {
                    int iZza11 = zzfkVar.zza(8);
                    int iZza12 = zzfkVar.zza(8);
                    zzfkVar.zzf(8);
                    int iZza13 = zzk.zza(iZza11);
                    iZzb2 = zzk.zzb(iZza12);
                    i22 = iZza13;
                } else {
                    i22 = -1;
                    iZzb2 = -1;
                }
                i20 = i29;
            } else {
                i22 = -1;
                iZzb2 = -1;
            }
            if (zzfkVar.zzh()) {
                zzfkVar.zzc();
                zzfkVar.zzc();
            }
            if (zzfkVar.zzh()) {
                zzfkVar.zzf(65);
            }
            zZzh3 = zzfkVar.zzh();
            if (zZzh3) {
                zzo(zzfkVar);
            }
            zZzh4 = zzfkVar.zzh();
            if (zZzh4) {
                zzo(zzfkVar);
            }
            if (zZzh3) {
                zzfkVar.zze();
            } else {
                zzfkVar.zze();
            }
            zzfkVar.zze();
            if (zzfkVar.zzh()) {
                zzfkVar.zze();
                zzfkVar.zzc();
                zzfkVar.zzc();
                zzfkVar.zzc();
                zzfkVar.zzc();
                int iZzc113 = zzfkVar.zzc();
                zzfkVar.zzc();
                i21 = iZzc113;
            } else {
                i21 = i19;
            }
            i23 = i20;
            f7 = f8;
        } else {
            i21 = i19;
            i22 = -1;
            i23 = -1;
            iZzb2 = -1;
            f7 = 1.0f;
        }
        return new zzfi(i18, iZza4, iZza5, iZzc5, iZzc16, i210, i211, f7, iZzc2, iZzc3, zZzh, zZzh2, iZzc6, iZzc7, iZzc4, z4, i22, i23, iZzb2, i21);
    }

    public static String zzh(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            byte[] bArr = (byte[]) list.get(i7);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i8 = zzfwh.zzd;
                zzfwe zzfweVar = new zzfwe();
                int i9 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i9 >= length2) {
                        break;
                    }
                    int iZza = zza(bArr, i9, length2, zArr);
                    if (iZza != length2) {
                        zzfweVar.zzf(Integer.valueOf(iZza));
                    }
                    i9 = iZza + 3;
                }
                zzfwh zzfwhVarZzi = zzfweVar.zzi();
                for (int i10 = 0; i10 < zzfwhVarZzi.size(); i10++) {
                    if (((Integer) zzfwhVarZzi.get(i10)).intValue() + 3 < length) {
                        zzfk zzfkVar = new zzfk(bArr, ((Integer) zzfwhVarZzi.get(i10)).intValue() + 3, length);
                        zzex zzexVarZzm = zzm(zzfkVar);
                        if (zzexVarZzm.zza == 33 && zzexVarZzm.zzb == 0) {
                            zzfkVar.zzf(4);
                            int iZza2 = zzfkVar.zza(3);
                            zzfkVar.zze();
                            zzey zzeyVarZzn = zzn(zzfkVar, true, iZza2, null);
                            return zzda.zzd(zzeyVarZzn.zza, zzeyVarZzn.zzb, zzeyVarZzn.zzc, zzeyVarZzn.zzd, zzeyVarZzn.zze, zzeyVarZzn.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void zzi(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean zzj(byte[] bArr, int i7, int i8, zzz zzzVar) {
        int i9;
        if (Objects.equals(zzzVar.zzo, "video/avc")) {
            byte b7 = bArr[4];
            if (((b7 & 96) >> 5) == 0 && ((i9 = b7 & 31) == 1 || i9 == 9 || i9 == 14)) {
                return false;
            }
        } else if (Objects.equals(zzzVar.zzo, "video/hevc")) {
            zzex zzexVarZzm = zzm(new zzfk(bArr, 4, i8 + 4));
            int i10 = zzexVarZzm.zza;
            if (i10 == 35) {
                return false;
            }
            if (i10 <= 14 && i10 % 2 == 0 && zzexVarZzm.zzc == zzzVar.zzD - 1) {
                return false;
            }
        }
        return true;
    }

    private static int zzk(int i7, int i8, int i9, int i10) {
        return i7 - ((i9 + i10) * (i8 == 1 ? 2 : 1));
    }

    private static int zzl(int i7, int i8, int i9, int i10) {
        int i11 = 2;
        if (i8 != 1 && i8 != 2) {
            i11 = 1;
        }
        return i7 - ((i9 + i10) * i11);
    }

    private static zzex zzm(zzfk zzfkVar) {
        zzfkVar.zze();
        return new zzex(zzfkVar.zza(6), zzfkVar.zza(6), zzfkVar.zza(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    private static zzey zzn(zzfk zzfkVar, boolean z4, int i7, zzey zzeyVar) {
        int[] iArr;
        int i8;
        boolean z7;
        int i9;
        int i10;
        boolean zZzh;
        int iZza;
        int i11;
        int i12;
        int[] iArr2 = new int[6];
        if (!z4) {
            if (zzeyVar != null) {
                int i13 = zzeyVar.zza;
                zZzh = zzeyVar.zzb;
                iZza = zzeyVar.zzc;
                i11 = zzeyVar.zzd;
                iArr2 = zzeyVar.zze;
                i8 = i13;
            } else {
                iArr = iArr2;
                i8 = 0;
                z7 = false;
                i9 = 0;
                i10 = 0;
            }
            int iZza2 = zzfkVar.zza(8);
            i12 = 0;
            for (int i14 = 0; i14 < i7; i14++) {
                if (zzfkVar.zzh()) {
                    i12 += 88;
                }
                if (zzfkVar.zzh()) {
                    i12 += 8;
                }
            }
            zzfkVar.zzf(i12);
            if (i7 > 0) {
                int i15 = 8 - i7;
                zzfkVar.zzf(i15 + i15);
            }
            return new zzey(i8, z7, i9, i10, iArr, iZza2);
        }
        int iZza3 = zzfkVar.zza(2);
        zZzh = zzfkVar.zzh();
        iZza = zzfkVar.zza(5);
        i11 = 0;
        for (int i16 = 0; i16 < 32; i16++) {
            if (zzfkVar.zzh()) {
                i11 |= 1 << i16;
            }
        }
        for (int i17 = 0; i17 < 6; i17++) {
            iArr2[i17] = zzfkVar.zza(8);
        }
        i8 = iZza3;
        iArr = iArr2;
        z7 = zZzh;
        i9 = iZza;
        i10 = i11;
        int iZza4 = zzfkVar.zza(8);
        i12 = 0;
        while (i14 < i7) {
            if (zzfkVar.zzh()) {
                i12 += 88;
            }
            if (zzfkVar.zzh()) {
                i12 += 8;
            }
        }
        zzfkVar.zzf(i12);
        if (i7 > 0) {
            int i18 = 8 - i7;
            zzfkVar.zzf(i18 + i18);
        }
        return new zzey(i8, z7, i9, i10, iArr, iZza4);
    }

    private static void zzo(zzfk zzfkVar) {
        int iZzc = zzfkVar.zzc() + 1;
        zzfkVar.zzf(8);
        for (int i7 = 0; i7 < iZzc; i7++) {
            zzfkVar.zzc();
            zzfkVar.zzc();
            zzfkVar.zze();
        }
        zzfkVar.zzf(20);
    }
}

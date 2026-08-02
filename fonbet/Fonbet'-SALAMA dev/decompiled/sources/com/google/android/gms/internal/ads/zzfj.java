package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfd zzd(byte[] bArr, int i7, int i8, zzfg zzfgVar) {
        int i9;
        boolean z4;
        int i10;
        int zzc2;
        int zzc3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int zzc4;
        int i16;
        float f7;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        zzff zzffVar;
        int i22;
        int i23;
        int i24;
        zzex zzexVar;
        int i25;
        int i26;
        int i27;
        zzey zzeyVar;
        int i28;
        int i29;
        int i30;
        int i31;
        zzfb zzfbVar;
        zzex zzm = zzm(new zzfk(bArr, i7, i8));
        zzfk zzfkVar = new zzfk(bArr, i7 + 2, i8);
        zzfkVar.zzf(4);
        int zza2 = zzfkVar.zza(3);
        if (zzm.zzb != 0) {
            i9 = 7;
            if (zza2 == 7) {
                z4 = true;
                int i32 = (zzfgVar != null || zzfgVar.zza.isEmpty()) ? 0 : ((zzew) zzfgVar.zza.get(Math.min(zzm.zzb, zzfgVar.zza.size() - 1))).zza;
                zzey zzeyVar2 = null;
                if (z4) {
                    zzfkVar.zze();
                    zzeyVar2 = zzn(zzfkVar, true, i9, null);
                } else if (zzfgVar != null) {
                    zzez zzezVar = zzfgVar.zzb;
                    int i33 = zzezVar.zzb[i32];
                    if (zzezVar.zza.size() > i33) {
                        zzeyVar2 = (zzey) zzfgVar.zzb.zza.get(i33);
                    }
                }
                int zzc5 = zzfkVar.zzc();
                if (z4) {
                    int zzc6 = zzfkVar.zzc();
                    if (zzc6 == 3) {
                        zzfkVar.zze();
                        i10 = 3;
                    } else {
                        i10 = zzc6;
                    }
                    int zzc7 = zzfkVar.zzc();
                    zzc2 = zzfkVar.zzc();
                    if (zzfkVar.zzh()) {
                        int zzc8 = zzfkVar.zzc();
                        int zzc9 = zzfkVar.zzc();
                        int zzc10 = zzfkVar.zzc();
                        int zzc11 = zzfkVar.zzc();
                        zzc7 = zzl(zzc7, i10, zzc8, zzc9);
                        zzc2 = zzk(zzc2, i10, zzc10, zzc11);
                    }
                    int zzc12 = zzfkVar.zzc();
                    zzc3 = zzfkVar.zzc();
                    i11 = zzc6;
                    int i34 = zzc7;
                    i12 = zzc12;
                    i13 = i34;
                } else {
                    int zza3 = zzfkVar.zzh() ? zzfkVar.zza(8) : -1;
                    if (zzfgVar != null && (zzfbVar = zzfgVar.zzc) != null) {
                        if (zza3 == -1) {
                            zza3 = zzfbVar.zzb[i32];
                        }
                        if (zza3 != -1 && zzfbVar.zza.size() > zza3) {
                            zzfa zzfaVar = (zzfa) zzfgVar.zzc.zza.get(zza3);
                            int i35 = zzfaVar.zza;
                            int i36 = zzfaVar.zzd;
                            zzc2 = zzfaVar.zze;
                            int i37 = zzfaVar.zzb;
                            zzc3 = zzfaVar.zzc;
                            i13 = i36;
                            i11 = i35;
                            i12 = i37;
                        }
                    }
                    i13 = 0;
                    zzc3 = 0;
                    i11 = 0;
                    i12 = 0;
                    zzc2 = 0;
                }
                int zzc13 = zzfkVar.zzc();
                if (z4) {
                    int i38 = true != zzfkVar.zzh() ? i9 : 0;
                    int i39 = -1;
                    while (i38 <= i9) {
                        zzfkVar.zzc();
                        i39 = Math.max(zzfkVar.zzc(), i39);
                        zzfkVar.zzc();
                        i38++;
                        i13 = i13;
                    }
                    i14 = i13;
                    i15 = i39;
                } else {
                    i14 = i13;
                    i15 = -1;
                }
                zzfkVar.zzc();
                zzfkVar.zzc();
                zzfkVar.zzc();
                zzfkVar.zzc();
                zzfkVar.zzc();
                zzfkVar.zzc();
                if (zzfkVar.zzh()) {
                    int i40 = 6;
                    if (z4 && zzfkVar.zzh()) {
                        zzfkVar.zzf(6);
                    } else if (zzfkVar.zzh()) {
                        int i41 = 4;
                        int i42 = 0;
                        while (i42 < i41) {
                            int i43 = 0;
                            while (i43 < i40) {
                                if (zzfkVar.zzh()) {
                                    i29 = i15;
                                    i30 = zzc5;
                                    int min = Math.min(64, 1 << ((i42 + i42) + 4));
                                    if (i42 > 1) {
                                        zzfkVar.zzb();
                                    }
                                    for (int i44 = 0; i44 < min; i44++) {
                                        zzfkVar.zzb();
                                    }
                                    i31 = 3;
                                } else {
                                    zzfkVar.zzc();
                                    i29 = i15;
                                    i30 = zzc5;
                                    i31 = 3;
                                }
                                i43 += i42 == i31 ? 3 : 1;
                                zzc5 = i30;
                                i15 = i29;
                                i40 = 6;
                            }
                            i42++;
                            i41 = 4;
                            i40 = 6;
                        }
                    }
                }
                int i45 = i15;
                int i46 = zzc5;
                zzfkVar.zzf(2);
                if (zzfkVar.zzh()) {
                    zzfkVar.zzf(8);
                    zzfkVar.zzc();
                    zzfkVar.zzc();
                    zzfkVar.zze();
                }
                zzc4 = zzfkVar.zzc();
                int[] iArr = new int[0];
                int[] iArr2 = new int[0];
                int i47 = zzc3;
                i16 = 0;
                int i48 = -1;
                int i49 = -1;
                while (i16 < zzc4) {
                    if (i16 == 0 || !zzfkVar.zzh()) {
                        i24 = zzc4;
                        zzexVar = zzm;
                        i25 = i9;
                        i26 = i11;
                        i27 = i12;
                        zzeyVar = zzeyVar2;
                        int zzc14 = zzfkVar.zzc();
                        i48 = zzfkVar.zzc();
                        int[] iArr3 = new int[zzc14];
                        int i50 = 0;
                        while (i50 < zzc14) {
                            iArr3[i50] = (i50 > 0 ? iArr3[i50 - 1] : 0) - (zzfkVar.zzc() + 1);
                            zzfkVar.zze();
                            i50++;
                        }
                        int[] iArr4 = new int[i48];
                        int i51 = 0;
                        while (i51 < i48) {
                            iArr4[i51] = zzfkVar.zzc() + 1 + (i51 > 0 ? iArr4[i51 - 1] : 0);
                            zzfkVar.zze();
                            i51++;
                        }
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i49 = zzc14;
                    } else {
                        i24 = zzc4;
                        int i52 = i49 + i48;
                        boolean zzh = zzfkVar.zzh();
                        boolean z7 = true;
                        int zzc15 = zzfkVar.zzc() + 1;
                        int i53 = 1 - ((zzh ? 1 : 0) + (zzh ? 1 : 0));
                        i27 = i12;
                        int i54 = i52 + 1;
                        i26 = i11;
                        boolean[] zArr = new boolean[i54];
                        zzeyVar = zzeyVar2;
                        int i55 = 0;
                        while (i55 <= i52) {
                            if (zzfkVar.zzh()) {
                                zArr[i55] = z7;
                            } else {
                                zArr[i55] = zzfkVar.zzh();
                            }
                            i55++;
                            z7 = true;
                        }
                        int i56 = i48 - 1;
                        int[] iArr5 = new int[i54];
                        int[] iArr6 = new int[i54];
                        int i57 = 0;
                        while (true) {
                            i28 = i53 * zzc15;
                            if (i56 < 0) {
                                break;
                            }
                            int i58 = iArr2[i56] + i28;
                            if (i58 < 0 && zArr[i49 + i56]) {
                                iArr5[i57] = i58;
                                i57++;
                            }
                            i56--;
                        }
                        if (i28 < 0 && zArr[i52]) {
                            iArr5[i57] = i28;
                            i57++;
                        }
                        zzexVar = zzm;
                        i25 = i9;
                        int i59 = i57;
                        for (int i60 = 0; i60 < i49; i60++) {
                            int i61 = iArr[i60] + i28;
                            if (i61 < 0 && zArr[i60]) {
                                iArr5[i59] = i61;
                                i59++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr5, i59);
                        int i62 = 0;
                        for (int i63 = i49 - 1; i63 >= 0; i63--) {
                            int i64 = iArr[i63] + i28;
                            if (i64 > 0 && zArr[i63]) {
                                iArr6[i62] = i64;
                                i62++;
                            }
                        }
                        if (i28 > 0 && zArr[i52]) {
                            iArr6[i62] = i28;
                            i62++;
                        }
                        int i65 = i62;
                        for (int i66 = 0; i66 < i48; i66++) {
                            int i67 = iArr2[i66] + i28;
                            if (i67 > 0 && zArr[i49 + i66]) {
                                iArr6[i65] = i67;
                                i65++;
                            }
                        }
                        iArr2 = Arrays.copyOf(iArr6, i65);
                        iArr = copyOf;
                        i49 = i59;
                        i48 = i65;
                    }
                    i16++;
                    zzc4 = i24;
                    i9 = i25;
                    zzm = zzexVar;
                    i12 = i27;
                    i11 = i26;
                    zzeyVar2 = zzeyVar;
                }
                zzex zzexVar2 = zzm;
                int i68 = i9;
                int i69 = i11;
                int i70 = i12;
                zzey zzeyVar3 = zzeyVar2;
                if (zzfkVar.zzh()) {
                    int zzc16 = zzfkVar.zzc();
                    for (int i71 = 0; i71 < zzc16; i71++) {
                        zzfkVar.zzf(zzc13 + 5);
                    }
                }
                zzfkVar.zzf(2);
                float f8 = 1.0f;
                if (zzfkVar.zzh()) {
                    f7 = 1.0f;
                    i17 = -1;
                    i18 = -1;
                    i19 = -1;
                } else {
                    if (zzfkVar.zzh()) {
                        int zza4 = zzfkVar.zza(8);
                        if (zza4 == 255) {
                            int zza5 = zzfkVar.zza(16);
                            int zza6 = zzfkVar.zza(16);
                            if (zza5 != 0 && zza6 != 0) {
                                f8 = zza5 / zza6;
                            }
                        } else if (zza4 < 17) {
                            f8 = zzb[zza4];
                        } else {
                            AbstractC0486a1.k(zza4, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                        }
                    }
                    if (zzfkVar.zzh()) {
                        zzfkVar.zze();
                    }
                    if (zzfkVar.zzh()) {
                        zzfkVar.zzf(3);
                        i21 = true != zzfkVar.zzh() ? 2 : 1;
                        if (zzfkVar.zzh()) {
                            int zza7 = zzfkVar.zza(8);
                            int zza8 = zzfkVar.zza(8);
                            zzfkVar.zzf(8);
                            i23 = zzk.zza(zza7);
                            i20 = zzk.zzb(zza8);
                            if (zzfkVar.zzh()) {
                                zzfkVar.zzc();
                                zzfkVar.zzc();
                            }
                            zzfkVar.zze();
                            if (zzfkVar.zzh()) {
                                zzc2 += zzc2;
                            }
                            i19 = i20;
                            f7 = f8;
                            i17 = i21;
                            i18 = i23;
                        } else {
                            i20 = -1;
                            i23 = -1;
                            if (zzfkVar.zzh()) {
                            }
                            zzfkVar.zze();
                            if (zzfkVar.zzh()) {
                            }
                            i19 = i20;
                            f7 = f8;
                            i17 = i21;
                            i18 = i23;
                        }
                    } else if (zzfgVar == null || (zzffVar = zzfgVar.zzd) == null || zzffVar.zza.size() <= (i22 = zzffVar.zzb[i32])) {
                        i20 = -1;
                        i21 = -1;
                        i23 = -1;
                        if (zzfkVar.zzh()) {
                        }
                        zzfkVar.zze();
                        if (zzfkVar.zzh()) {
                        }
                        i19 = i20;
                        f7 = f8;
                        i17 = i21;
                        i18 = i23;
                    } else {
                        zzfe zzfeVar = (zzfe) zzfgVar.zzd.zza.get(i22);
                        i23 = zzfeVar.zza;
                        int i72 = zzfeVar.zzb;
                        i20 = zzfeVar.zzc;
                        i21 = i72;
                        if (zzfkVar.zzh()) {
                        }
                        zzfkVar.zze();
                        if (zzfkVar.zzh()) {
                        }
                        i19 = i20;
                        f7 = f8;
                        i17 = i21;
                        i18 = i23;
                    }
                }
                return new zzfd(zzexVar2, i68, zzeyVar3, i69, i70, i47, i46, i14, zzc2, f7, i45, i18, i17, i19);
            }
        }
        i9 = zza2;
        z4 = false;
        if (zzfgVar != null) {
        }
        zzey zzeyVar22 = null;
        if (z4) {
        }
        int zzc52 = zzfkVar.zzc();
        if (z4) {
        }
        int zzc132 = zzfkVar.zzc();
        if (z4) {
        }
        zzfkVar.zzc();
        zzfkVar.zzc();
        zzfkVar.zzc();
        zzfkVar.zzc();
        zzfkVar.zzc();
        zzfkVar.zzc();
        if (zzfkVar.zzh()) {
        }
        int i452 = i15;
        int i462 = zzc52;
        zzfkVar.zzf(2);
        if (zzfkVar.zzh()) {
        }
        zzc4 = zzfkVar.zzc();
        int[] iArr7 = new int[0];
        int[] iArr22 = new int[0];
        int i472 = zzc3;
        i16 = 0;
        int i482 = -1;
        int i492 = -1;
        while (i16 < zzc4) {
        }
        zzex zzexVar22 = zzm;
        int i682 = i9;
        int i692 = i11;
        int i702 = i12;
        zzey zzeyVar32 = zzeyVar22;
        if (zzfkVar.zzh()) {
        }
        zzfkVar.zzf(2);
        float f82 = 1.0f;
        if (zzfkVar.zzh()) {
        }
        return new zzfd(zzexVar22, i682, zzeyVar32, i692, i702, i472, i462, i14, zzc2, f7, i452, i18, i17, i19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfg zze(byte[] bArr, int i7, int i8) {
        int i9;
        int[] iArr;
        int i10;
        zzff zzffVar;
        boolean z4;
        int i11;
        int i12;
        int i13;
        int i14;
        zzex zzexVar;
        zzfwh zzfwhVar;
        int[] iArr2;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr3;
        int i19;
        boolean[][] zArr;
        int i20;
        boolean[][] zArr2;
        int[] iArr4;
        int i21;
        int i22;
        boolean z7;
        boolean zzh;
        int i23;
        int i24;
        int i25;
        int i26;
        int zzc2;
        int[] iArr5;
        int i27;
        int i28;
        boolean z8;
        boolean z9;
        zzfk zzfkVar = new zzfk(bArr, i7, i8);
        zzex zzm = zzm(zzfkVar);
        zzfkVar.zzf(4);
        boolean zzh2 = zzfkVar.zzh();
        boolean zzh3 = zzfkVar.zzh();
        int zza2 = zzfkVar.zza(6);
        int i29 = zza2 + 1;
        int zza3 = zzfkVar.zza(3);
        zzfkVar.zzf(17);
        int i30 = 1;
        zzey zzn = zzn(zzfkVar, true, zza3, null);
        int i31 = 0;
        for (int i32 = true != zzfkVar.zzh() ? zza3 : 0; i32 <= zza3; i32++) {
            zzfkVar.zzc();
            zzfkVar.zzc();
            zzfkVar.zzc();
        }
        int zza4 = zzfkVar.zza(6);
        int zzc3 = zzfkVar.zzc() + 1;
        zzez zzezVar = new zzez(zzfwh.zzo(zzn), new int[1]);
        boolean z10 = i29 >= 2 && zzc3 >= 2;
        boolean z11 = zzh2 && zzh3;
        int i33 = zza4 + 1;
        if (!z10 || !z11 || i33 < i29) {
            return new zzfg(zzm, null, zzezVar, null, null);
        }
        int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, zzc3, i33);
        int[] iArr7 = new int[zzc3];
        int[] iArr8 = new int[zzc3];
        iArr6[0][0] = 0;
        iArr7[0] = 1;
        iArr8[0] = 0;
        while (i30 < zzc3) {
            int i34 = i31;
            while (i31 <= zza4) {
                if (zzfkVar.zzh()) {
                    iArr6[i30][i34] = i31;
                    iArr8[i30] = i31;
                    i34++;
                }
                iArr7[i30] = i34;
                i31++;
            }
            i30++;
            i31 = 0;
        }
        if (zzfkVar.zzh()) {
            zzfkVar.zzf(64);
            if (zzfkVar.zzh()) {
                zzfkVar.zzc();
            }
            int zzc4 = zzfkVar.zzc();
            for (int i35 = 0; i35 < zzc4; i35++) {
                zzfkVar.zzc();
                if (i35 == 0 || zzfkVar.zzh()) {
                    boolean zzh4 = zzfkVar.zzh();
                    boolean zzh5 = zzfkVar.zzh();
                    z9 = zzh4;
                    z8 = zzh5;
                    if (zzh4 || zzh5) {
                        zzh = zzfkVar.zzh();
                        if (zzh) {
                            zzfkVar.zzf(19);
                        }
                        zzfkVar.zzf(8);
                        if (zzh) {
                            zzfkVar.zzf(4);
                        }
                        zzfkVar.zzf(15);
                        i24 = zzh4;
                        i23 = zzh5;
                        i25 = 0;
                        while (i25 <= zza3) {
                            if (zzfkVar.zzh() || zzfkVar.zzh()) {
                                zzfkVar.zzc();
                            } else if (zzfkVar.zzh()) {
                                iArr5 = iArr8;
                                i26 = zzc4;
                                zzc2 = 0;
                                i27 = i24 + i23;
                                int[][] iArr9 = iArr6;
                                i28 = 0;
                                while (i28 < i27) {
                                    int i36 = i27;
                                    for (int i37 = 0; i37 <= zzc2; i37++) {
                                        zzfkVar.zzc();
                                        zzfkVar.zzc();
                                        if (zzh) {
                                            zzfkVar.zzc();
                                            zzfkVar.zzc();
                                        }
                                        zzfkVar.zze();
                                    }
                                    i28++;
                                    i27 = i36;
                                }
                                i25++;
                                iArr8 = iArr5;
                                zzc4 = i26;
                                iArr6 = iArr9;
                            }
                            i26 = zzc4;
                            zzc2 = zzfkVar.zzc();
                            iArr5 = iArr8;
                            i27 = i24 + i23;
                            int[][] iArr92 = iArr6;
                            i28 = 0;
                            while (i28 < i27) {
                            }
                            i25++;
                            iArr8 = iArr5;
                            zzc4 = i26;
                            iArr6 = iArr92;
                        }
                    }
                } else {
                    z9 = false;
                    z8 = false;
                }
                zzh = false;
                i24 = z9;
                i23 = z8;
                i25 = 0;
                while (i25 <= zza3) {
                }
            }
        }
        int[][] iArr10 = iArr6;
        int[] iArr11 = iArr8;
        if (!zzfkVar.zzh()) {
            return new zzfg(zzm, null, zzezVar, null, null);
        }
        zzfkVar.zzd();
        zzey zzn2 = zzn(zzfkVar, false, zza3, zzn);
        boolean zzh6 = zzfkVar.zzh();
        boolean[] zArr3 = new boolean[16];
        int i38 = 0;
        for (int i39 = 0; i39 < 16; i39++) {
            boolean zzh7 = zzfkVar.zzh();
            zArr3[i39] = zzh7;
            if (zzh7) {
                i38++;
            }
        }
        if (i38 == 0 || !zArr3[1]) {
            return new zzfg(zzm, null, zzezVar, null, null);
        }
        int i40 = i38 + 1;
        int[] iArr12 = new int[i38];
        for (int i41 = 0; i41 < i38 - (zzh6 ? 1 : 0); i41++) {
            iArr12[i41] = zzfkVar.zza(3);
        }
        int[] iArr13 = new int[i40];
        if (zzh6) {
            for (int i42 = 1; i42 < i38; i42++) {
                for (int i43 = 0; i43 < i42; i43++) {
                    iArr13[i42] = iArr12[i43] + 1 + iArr13[i42];
                }
            }
            iArr13[i38] = 6;
        }
        int[][] iArr14 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i29, i38);
        int[] iArr15 = new int[i29];
        iArr15[0] = 0;
        boolean zzh8 = zzfkVar.zzh();
        int i44 = 1;
        while (i44 < i29) {
            if (zzh8) {
                iArr15[i44] = zzfkVar.zza(6);
            } else {
                iArr15[i44] = i44;
            }
            if (zzh6) {
                z7 = zzh6 ? 1 : 0;
                for (int i45 = 0; i45 < i38; i45++) {
                    iArr14[i44][i45] = (iArr15[i44] & ((1 << iArr13[r31]) - 1)) >> iArr13[i45];
                }
            } else {
                int i46 = 0;
                while (i46 < i38) {
                    iArr14[i44][i46] = zzfkVar.zza(iArr12[i46] + 1);
                    i46++;
                    zzh6 = zzh6;
                }
                z7 = zzh6;
            }
            i44++;
            zzh6 = z7;
        }
        int[] iArr16 = new int[i33];
        int i47 = 1;
        for (int i48 = 0; i48 < i29; i48++) {
            iArr16[iArr15[i48]] = -1;
            int i49 = 0;
            int i50 = 0;
            while (i49 < 16) {
                if (zArr3[i49]) {
                    i21 = 1;
                    if (i49 == 1) {
                        iArr16[iArr15[i48]] = iArr14[i48][i50];
                        i22 = 1;
                    } else {
                        i22 = i49;
                    }
                    i50++;
                    i49 = i22;
                } else {
                    i21 = 1;
                }
                i49 += i21;
            }
            if (i48 > 0) {
                int i51 = 0;
                while (true) {
                    if (i51 >= i48) {
                        i47++;
                        break;
                    }
                    if (iArr16[iArr15[i48]] == iArr16[iArr15[i51]]) {
                        break;
                    }
                    i51++;
                }
            }
        }
        int zza5 = zzfkVar.zza(4);
        if (i47 < 2 || zza5 == 0) {
            return new zzfg(zzm, null, zzezVar, null, null);
        }
        int[] iArr17 = new int[i47];
        for (int i52 = 0; i52 < i47; i52++) {
            iArr17[i52] = zzfkVar.zza(zza5);
        }
        int[] iArr18 = new int[i33];
        for (int i53 = 0; i53 < i29; i53++) {
            iArr18[Math.min(iArr15[i53], zza4)] = i53;
        }
        zzfwe zzfweVar = new zzfwe();
        int i54 = 0;
        while (i54 <= zza4) {
            int[] iArr19 = iArr16;
            int min = Math.min(iArr16[i54], i47 - 1);
            zzfweVar.zzf(new zzew(iArr18[i54], min >= 0 ? iArr17[min] : -1));
            i54++;
            iArr16 = iArr19;
        }
        zzfwh zzi = zzfweVar.zzi();
        if (((zzew) zzi.get(0)).zzb == -1) {
            return new zzfg(zzm, null, zzezVar, null, null);
        }
        int i55 = 1;
        while (true) {
            if (i55 > zza4) {
                i9 = -1;
                i55 = -1;
                break;
            }
            i9 = -1;
            if (((zzew) zzi.get(i55)).zzb != -1) {
                break;
            }
            i55++;
        }
        if (i55 == i9) {
            return new zzfg(zzm, null, zzezVar, null, null);
        }
        Class cls = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls, i29, i29);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls, i29, i29);
        for (int i56 = 1; i56 < i29; i56++) {
            for (int i57 = 0; i57 < i56; i57++) {
                boolean[] zArr6 = zArr4[i56];
                boolean[] zArr7 = zArr5[i56];
                boolean zzh9 = zzfkVar.zzh();
                zArr7[i57] = zzh9;
                zArr6[i57] = zzh9;
            }
        }
        for (int i58 = 1; i58 < i29; i58++) {
            for (int i59 = 0; i59 < zza2; i59++) {
                int i60 = 0;
                while (true) {
                    if (i60 < i58) {
                        boolean[] zArr8 = zArr5[i58];
                        if (zArr8[i60] && zArr5[i60][i59]) {
                            zArr8[i59] = true;
                            break;
                        }
                        i60++;
                    }
                }
            }
        }
        int[] iArr20 = new int[i33];
        for (int i61 = 0; i61 < i29; i61++) {
            int i62 = 0;
            for (int i63 = 0; i63 < i61; i63++) {
                i62 += zArr4[i61][i63] ? 1 : 0;
            }
            iArr20[iArr15[i61]] = i62;
        }
        int i64 = 0;
        for (int i65 = 0; i65 < i29; i65++) {
            if (iArr20[iArr15[i65]] == 0) {
                i64++;
            }
        }
        if (i64 > 1) {
            return new zzfg(zzm, null, zzezVar, null, null);
        }
        int[] iArr21 = new int[i29];
        int i66 = zzc3;
        int[] iArr22 = new int[i66];
        if (zzfkVar.zzh()) {
            int i67 = 0;
            while (i67 < i29) {
                iArr21[i67] = zzfkVar.zza(3);
                i67++;
                iArr15 = iArr15;
            }
            iArr = iArr15;
            i10 = zza3;
        } else {
            iArr = iArr15;
            i10 = zza3;
            Arrays.fill(iArr21, 0, i29, i10);
        }
        int i68 = 0;
        while (i68 < i66) {
            int i69 = i55;
            boolean[][] zArr9 = zArr5;
            int[] iArr23 = iArr20;
            int i70 = 0;
            for (int i71 = 0; i71 < iArr7[i68]; i71++) {
                i70 = Math.max(i70, iArr21[((zzew) zzi.get(iArr10[i68][i71])).zza]);
            }
            iArr22[i68] = i70 + 1;
            i68++;
            zArr5 = zArr9;
            iArr20 = iArr23;
            i55 = i69;
        }
        int i72 = i55;
        boolean[][] zArr10 = zArr5;
        int[] iArr24 = iArr20;
        if (zzfkVar.zzh()) {
            int i73 = 0;
            while (i73 < zza2) {
                int i74 = i73 + 1;
                for (int i75 = i74; i75 < i29; i75++) {
                    if (zArr4[i75][i73]) {
                        zzfkVar.zzf(3);
                    }
                }
                i73 = i74;
            }
        }
        zzfkVar.zze();
        int zzc5 = zzfkVar.zzc() + 1;
        zzfwe zzfweVar2 = new zzfwe();
        zzfweVar2.zzf(zzn);
        if (zzc5 > 1) {
            zzey zzeyVar = zzn2;
            zzfweVar2.zzf(zzeyVar);
            for (int i76 = 2; i76 < zzc5; i76++) {
                zzeyVar = zzn(zzfkVar, zzfkVar.zzh(), i10, zzeyVar);
                zzfweVar2.zzf(zzeyVar);
            }
        }
        zzfwh zzi2 = zzfweVar2.zzi();
        int zzc6 = zzfkVar.zzc() + i66;
        if (zzc6 > i66) {
            return new zzfg(zzm, null, zzezVar, null, null);
        }
        int zza6 = zzfkVar.zza(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, zzc6, i33);
        int[] iArr25 = new int[zzc6];
        int[] iArr26 = new int[zzc6];
        int i77 = 0;
        while (i77 < i66) {
            int i78 = i66;
            iArr25[i77] = 0;
            int i79 = iArr11[i77];
            iArr26[i77] = i79;
            if (zza6 == 0) {
                zArr2 = zArr4;
                i20 = i29;
                iArr4 = iArr22;
                Arrays.fill(zArr11[i77], 0, iArr7[i77], true);
                iArr25[i77] = iArr7[i77];
            } else {
                i20 = i29;
                zArr2 = zArr4;
                iArr4 = iArr22;
                if (zza6 == 1) {
                    for (int i80 = 0; i80 < iArr7[i77]; i80++) {
                        zArr11[i77][i80] = iArr10[i77][i80] == i79;
                    }
                    iArr25[i77] = 1;
                } else {
                    zArr11[0][0] = true;
                    iArr25[0] = 1;
                    i77++;
                    i66 = i78;
                    zArr4 = zArr2;
                    iArr22 = iArr4;
                    i29 = i20;
                }
            }
            i77++;
            i66 = i78;
            zArr4 = zArr2;
            iArr22 = iArr4;
            i29 = i20;
        }
        int i81 = i29;
        boolean[][] zArr12 = zArr4;
        int[] iArr27 = iArr22;
        int i82 = i66;
        int[] iArr28 = new int[i33];
        int i83 = 2;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, zzc6, i33);
        int i84 = 0;
        int i85 = 1;
        while (i85 < zzc6) {
            if (zza6 == i83) {
                for (int i86 = 0; i86 < iArr7[i85]; i86++) {
                    zArr11[i85][i86] = zzfkVar.zzh();
                    int i87 = iArr25[i85];
                    boolean z12 = zArr11[i85][i86];
                    iArr25[i85] = i87 + (z12 ? 1 : 0);
                    if (z12) {
                        iArr26[i85] = iArr10[i85][i86];
                    }
                }
            }
            if (i84 == 0) {
                if (iArr10[i85][0] == 0 && zArr11[i85][0]) {
                    i84 = 0;
                    int i88 = 1;
                    while (i88 < iArr7[i85]) {
                        int i89 = zza6;
                        int i90 = i72;
                        if (iArr10[i85][i88] == i90 && zArr11[i85][i90]) {
                            i84 = i85;
                        }
                        i88++;
                        i72 = i90;
                        zza6 = i89;
                    }
                } else {
                    i15 = zza6;
                    i16 = i72;
                    i84 = 0;
                    i17 = 0;
                    while (i17 < iArr7[i85]) {
                        if (zzc5 > 1) {
                            zArr13[i85][i17] = zArr11[i85][i17];
                            iArr3 = iArr26;
                            i19 = i16;
                            i18 = zzc5;
                            int zza7 = zzfza.zza(zzc5, RoundingMode.CEILING);
                            if (!zArr13[i85][i17]) {
                                int i91 = ((zzew) zzi.get(iArr10[i85][i17])).zza;
                                int i92 = 0;
                                while (i92 < i17) {
                                    zArr = zArr11;
                                    if (zArr10[i91][((zzew) zzi.get(iArr10[i85][i92])).zza]) {
                                        zArr13[i85][i17] = true;
                                        break;
                                    }
                                    i92++;
                                    zArr11 = zArr;
                                }
                            }
                            zArr = zArr11;
                            if (zArr13[i85][i17]) {
                                if (i84 <= 0 || i85 != i84) {
                                    zzfkVar.zzf(zza7);
                                } else {
                                    iArr28[i17] = zzfkVar.zza(zza7);
                                }
                            }
                        } else {
                            i18 = zzc5;
                            iArr3 = iArr26;
                            i19 = i16;
                            zArr = zArr11;
                        }
                        i17++;
                        iArr26 = iArr3;
                        i16 = i19;
                        zzc5 = i18;
                        zArr11 = zArr;
                    }
                    int i93 = zzc5;
                    int[] iArr29 = iArr26;
                    i72 = i16;
                    boolean[][] zArr14 = zArr11;
                    if (iArr25[i85] == 1 && iArr24[iArr29[i85]] > 0) {
                        zzfkVar.zze();
                    }
                    i85++;
                    iArr26 = iArr29;
                    zza6 = i15;
                    zzc5 = i93;
                    zArr11 = zArr14;
                    i83 = 2;
                }
            }
            i15 = zza6;
            i16 = i72;
            i17 = 0;
            while (i17 < iArr7[i85]) {
            }
            int i932 = zzc5;
            int[] iArr292 = iArr26;
            i72 = i16;
            boolean[][] zArr142 = zArr11;
            if (iArr25[i85] == 1) {
                zzfkVar.zze();
            }
            i85++;
            iArr26 = iArr292;
            zza6 = i15;
            zzc5 = i932;
            zArr11 = zArr142;
            i83 = 2;
        }
        if (i84 == 0) {
            return new zzfg(zzm, null, zzezVar, null, null);
        }
        int zzc7 = zzfkVar.zzc();
        int i94 = zzc7 + 1;
        zzfwe zzi3 = zzfwh.zzi(i94);
        int[] iArr30 = new int[i81];
        int i95 = 0;
        while (i95 < i94) {
            int zza8 = zzfkVar.zza(16);
            int zza9 = zzfkVar.zza(16);
            if (zzfkVar.zzh()) {
                i12 = zzfkVar.zza(2);
                if (i12 == 3) {
                    zzfkVar.zze();
                }
                i13 = zzfkVar.zza(4);
                i14 = zzfkVar.zza(4);
            } else {
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            if (zzfkVar.zzh()) {
                int zzc8 = zzfkVar.zzc();
                zzfwhVar = zzi;
                int zzc9 = zzfkVar.zzc();
                zzexVar = zzm;
                int zzc10 = zzfkVar.zzc();
                iArr2 = iArr28;
                int zzc11 = zzfkVar.zzc();
                zza8 = zzl(zza8, i12, zzc8, zzc9);
                zza9 = zzk(zza9, i12, zzc10, zzc11);
            } else {
                zzexVar = zzm;
                zzfwhVar = zzi;
                iArr2 = iArr28;
            }
            zzi3.zzf(new zzfa(i12, i13, i14, zza8, zza9));
            i95++;
            zzi = zzfwhVar;
            zzm = zzexVar;
            iArr28 = iArr2;
        }
        zzex zzexVar2 = zzm;
        zzfwh zzfwhVar2 = zzi;
        int[] iArr31 = iArr28;
        if (i94 <= 1 || !zzfkVar.zzh()) {
            for (int i96 = 1; i96 < i81; i96++) {
                iArr30[i96] = Math.min(i96, zzc7);
            }
        } else {
            int zza10 = zzfza.zza(i94, RoundingMode.CEILING);
            for (int i97 = 1; i97 < i81; i97++) {
                iArr30[i97] = zzfkVar.zza(zza10);
            }
        }
        zzfb zzfbVar = new zzfb(zzi3.zzi(), iArr30);
        zzfkVar.zzf(2);
        for (int i98 = 1; i98 < i81; i98++) {
            if (iArr24[iArr[i98]] == 0) {
                zzfkVar.zze();
            }
        }
        for (int i99 = 1; i99 < zzc6; i99++) {
            boolean zzh10 = zzfkVar.zzh();
            int i100 = 0;
            while (i100 < iArr27[i99]) {
                if ((i100 <= 0 || !zzh10) ? i100 == 0 : zzfkVar.zzh()) {
                    for (int i101 = 0; i101 < iArr7[i99]; i101++) {
                        if (zArr13[i99][i101]) {
                            zzfkVar.zzc();
                        }
                    }
                    zzfkVar.zzc();
                    zzfkVar.zzc();
                }
                i100++;
            }
        }
        int zzc12 = zzfkVar.zzc() + 2;
        if (zzfkVar.zzh()) {
            zzfkVar.zzf(zzc12);
        } else {
            for (int i102 = 1; i102 < i81; i102++) {
                for (int i103 = 0; i103 < i102; i103++) {
                    if (zArr12[i102][i103]) {
                        zzfkVar.zzf(zzc12);
                    }
                }
            }
        }
        int zzc13 = zzfkVar.zzc();
        for (int i104 = 1; i104 <= zzc13; i104++) {
            zzfkVar.zzf(8);
        }
        if (zzfkVar.zzh()) {
            zzfkVar.zzd();
            if (zzfkVar.zzh() || zzfkVar.zzh()) {
                zzfkVar.zze();
            }
            boolean zzh11 = zzfkVar.zzh();
            boolean zzh12 = zzfkVar.zzh();
            if (zzh11 || zzh12) {
                for (int i105 = 0; i105 < i82; i105++) {
                    for (int i106 = 0; i106 < iArr27[i105]; i106++) {
                        boolean zzh13 = zzh11 ? zzfkVar.zzh() : false;
                        boolean zzh14 = zzh12 ? zzfkVar.zzh() : false;
                        if (zzh13) {
                            zzfkVar.zzf(32);
                        }
                        if (zzh14) {
                            zzfkVar.zzf(18);
                        }
                    }
                }
            }
            boolean zzh15 = zzfkVar.zzh();
            if (zzh15) {
                z4 = true;
                i11 = zzfkVar.zza(4) + 1;
            } else {
                z4 = true;
                i11 = i81;
            }
            zzfwe zzi4 = zzfwh.zzi(i11);
            int[] iArr32 = new int[i81];
            int i107 = 0;
            while (i107 < i11) {
                zzfkVar.zzf(3);
                int i108 = z4 != zzfkVar.zzh() ? 2 : 1;
                int zza11 = zzk.zza(zzfkVar.zza(8));
                int zzb2 = zzk.zzb(zzfkVar.zza(8));
                zzfkVar.zzf(8);
                zzi4.zzf(new zzfe(zza11, i108, zzb2));
                i107++;
                z4 = true;
            }
            if (zzh15 && i11 > 1) {
                for (int i109 = 0; i109 < i81; i109++) {
                    iArr32[i109] = zzfkVar.zza(4);
                }
            }
            zzffVar = new zzff(zzi4.zzi(), iArr32);
        } else {
            zzffVar = null;
        }
        return new zzfg(zzexVar2, zzfwhVar2, new zzez(zzi2, iArr31), zzfbVar, zzffVar);
    }

    public static zzfh zzf(byte[] bArr, int i7, int i8) {
        zzfk zzfkVar = new zzfk(bArr, 4, i8);
        int zzc2 = zzfkVar.zzc();
        int zzc3 = zzfkVar.zzc();
        zzfkVar.zze();
        return new zzfh(zzc2, zzc3, zzfkVar.zzh());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfi zzg(byte[] bArr, int i7, int i8) {
        int zzc2;
        int i9;
        boolean z4;
        int zzc3;
        int zzc4;
        int zzc5;
        int i10;
        int i11;
        boolean z7;
        boolean zzh;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f7;
        float f8;
        int i18;
        int i19;
        boolean zzh2;
        boolean zzh3;
        int i20;
        zzfk zzfkVar = new zzfk(bArr, i7, i8);
        int zza2 = zzfkVar.zza(8);
        int zza3 = zzfkVar.zza(8);
        int zza4 = zzfkVar.zza(8);
        int zzc6 = zzfkVar.zzc();
        if (zza2 != 100 && zza2 != 110 && zza2 != 122 && zza2 != 244 && zza2 != 44 && zza2 != 83 && zza2 != 86 && zza2 != 118 && zza2 != 128) {
            if (zza2 != 138) {
                zzc2 = 1;
                z4 = false;
                zzc3 = 0;
                zzc4 = 0;
                int zzc7 = zzfkVar.zzc() + 4;
                zzc5 = zzfkVar.zzc();
                if (zzc5 != 0) {
                    i10 = zzc5;
                    i11 = zzfkVar.zzc() + 4;
                } else {
                    if (zzc5 == 1) {
                        boolean zzh4 = zzfkVar.zzh();
                        zzfkVar.zzb();
                        zzfkVar.zzb();
                        long zzc8 = zzfkVar.zzc();
                        for (int i21 = 0; i21 < zzc8; i21++) {
                            zzfkVar.zzc();
                        }
                        z7 = zzh4;
                        i10 = 1;
                        i11 = 0;
                        int zzc9 = zzfkVar.zzc();
                        zzfkVar.zze();
                        int zzc10 = zzfkVar.zzc() + 1;
                        int zzc11 = zzfkVar.zzc() + 1;
                        zzh = zzfkVar.zzh();
                        int i22 = 2 - (zzh ? 1 : 0);
                        if (!zzh) {
                            zzfkVar.zze();
                        }
                        zzfkVar.zze();
                        int i23 = zzc10 * 16;
                        int i24 = zzc11 * i22 * 16;
                        if (zzfkVar.zzh()) {
                            int zzc12 = zzfkVar.zzc();
                            int zzc13 = zzfkVar.zzc();
                            int zzc14 = zzfkVar.zzc();
                            int zzc15 = zzfkVar.zzc();
                            if (zzc2 == 0) {
                                i20 = 1;
                            } else {
                                i20 = zzc2 == 3 ? 1 : 2;
                                i22 *= zzc2 == 1 ? 2 : 1;
                            }
                            i23 -= (zzc12 + zzc13) * i20;
                            i24 -= (zzc14 + zzc15) * i22;
                        }
                        int i25 = i23;
                        int i26 = i24;
                        if (zza2 != 44 && zza2 != 86 && zza2 != 100 && zza2 != 110 && zza2 != 122) {
                            if (zza2 == 244) {
                                zza2 = 244;
                            }
                            i12 = zza2;
                            i13 = 16;
                            int i27 = -1;
                            if (zzfkVar.zzh()) {
                                i14 = i13;
                                i15 = -1;
                                i16 = -1;
                                i17 = -1;
                                f7 = 1.0f;
                            } else {
                                if (zzfkVar.zzh()) {
                                    int zza5 = zzfkVar.zza(8);
                                    if (zza5 == 255) {
                                        int zza6 = zzfkVar.zza(16);
                                        int zza7 = zzfkVar.zza(16);
                                        if (zza6 != 0 && zza7 != 0) {
                                            f8 = zza6 / zza7;
                                            if (zzfkVar.zzh()) {
                                                zzfkVar.zze();
                                            }
                                            if (zzfkVar.zzh()) {
                                                zzfkVar.zzf(3);
                                                int i28 = true != zzfkVar.zzh() ? 2 : 1;
                                                if (zzfkVar.zzh()) {
                                                    int zza8 = zzfkVar.zza(8);
                                                    int zza9 = zzfkVar.zza(8);
                                                    zzfkVar.zzf(8);
                                                    int zza10 = zzk.zza(zza8);
                                                    i19 = zzk.zzb(zza9);
                                                    i18 = zza10;
                                                } else {
                                                    i18 = -1;
                                                    i19 = -1;
                                                }
                                                i27 = i28;
                                            } else {
                                                i18 = -1;
                                                i19 = -1;
                                            }
                                            if (zzfkVar.zzh()) {
                                                zzfkVar.zzc();
                                                zzfkVar.zzc();
                                            }
                                            if (zzfkVar.zzh()) {
                                                zzfkVar.zzf(65);
                                            }
                                            zzh2 = zzfkVar.zzh();
                                            if (zzh2) {
                                                zzo(zzfkVar);
                                            }
                                            zzh3 = zzfkVar.zzh();
                                            if (zzh3) {
                                                zzo(zzfkVar);
                                            }
                                            if (!zzh2 || zzh3) {
                                                zzfkVar.zze();
                                            }
                                            zzfkVar.zze();
                                            if (zzfkVar.zzh()) {
                                                zzfkVar.zze();
                                                zzfkVar.zzc();
                                                zzfkVar.zzc();
                                                zzfkVar.zzc();
                                                zzfkVar.zzc();
                                                int zzc16 = zzfkVar.zzc();
                                                zzfkVar.zzc();
                                                i15 = i18;
                                                i17 = i19;
                                                i14 = zzc16;
                                            } else {
                                                i15 = i18;
                                                i17 = i19;
                                                i14 = i13;
                                            }
                                            i16 = i27;
                                            f7 = f8;
                                        }
                                    } else if (zza5 < 17) {
                                        f8 = zzb[zza5];
                                        if (zzfkVar.zzh()) {
                                        }
                                        if (zzfkVar.zzh()) {
                                        }
                                        if (zzfkVar.zzh()) {
                                        }
                                        if (zzfkVar.zzh()) {
                                        }
                                        zzh2 = zzfkVar.zzh();
                                        if (zzh2) {
                                        }
                                        zzh3 = zzfkVar.zzh();
                                        if (zzh3) {
                                        }
                                        if (!zzh2) {
                                        }
                                        zzfkVar.zze();
                                        zzfkVar.zze();
                                        if (zzfkVar.zzh()) {
                                        }
                                        i16 = i27;
                                        f7 = f8;
                                    } else {
                                        AbstractC0486a1.k(zza5, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                                    }
                                }
                                f8 = 1.0f;
                                if (zzfkVar.zzh()) {
                                }
                                if (zzfkVar.zzh()) {
                                }
                                if (zzfkVar.zzh()) {
                                }
                                if (zzfkVar.zzh()) {
                                }
                                zzh2 = zzfkVar.zzh();
                                if (zzh2) {
                                }
                                zzh3 = zzfkVar.zzh();
                                if (zzh3) {
                                }
                                if (!zzh2) {
                                }
                                zzfkVar.zze();
                                zzfkVar.zze();
                                if (zzfkVar.zzh()) {
                                }
                                i16 = i27;
                                f7 = f8;
                            }
                            return new zzfi(i12, zza3, zza4, zzc6, zzc9, i25, i26, f7, zzc3, zzc4, z4, zzh, zzc7, i10, i11, z7, i15, i16, i17, i14);
                        }
                        if ((zza3 & 16) != 0) {
                            i12 = zza2;
                            i13 = 0;
                            int i272 = -1;
                            if (zzfkVar.zzh()) {
                            }
                            return new zzfi(i12, zza3, zza4, zzc6, zzc9, i25, i26, f7, zzc3, zzc4, z4, zzh, zzc7, i10, i11, z7, i15, i16, i17, i14);
                        }
                        i12 = zza2;
                        i13 = 16;
                        int i2722 = -1;
                        if (zzfkVar.zzh()) {
                        }
                        return new zzfi(i12, zza3, zza4, zzc6, zzc9, i25, i26, f7, zzc3, zzc4, z4, zzh, zzc7, i10, i11, z7, i15, i16, i17, i14);
                    }
                    i10 = zzc5;
                    i11 = 0;
                }
                z7 = false;
                int zzc92 = zzfkVar.zzc();
                zzfkVar.zze();
                int zzc102 = zzfkVar.zzc() + 1;
                int zzc112 = zzfkVar.zzc() + 1;
                zzh = zzfkVar.zzh();
                int i222 = 2 - (zzh ? 1 : 0);
                if (!zzh) {
                }
                zzfkVar.zze();
                int i232 = zzc102 * 16;
                int i242 = zzc112 * i222 * 16;
                if (zzfkVar.zzh()) {
                }
                int i252 = i232;
                int i262 = i242;
                if (zza2 != 44) {
                    if (zza2 == 244) {
                    }
                    i12 = zza2;
                    i13 = 16;
                    int i27222 = -1;
                    if (zzfkVar.zzh()) {
                    }
                    return new zzfi(i12, zza3, zza4, zzc6, zzc92, i252, i262, f7, zzc3, zzc4, z4, zzh, zzc7, i10, i11, z7, i15, i16, i17, i14);
                }
                if ((zza3 & 16) != 0) {
                }
                i12 = zza2;
                i13 = 16;
                int i272222 = -1;
                if (zzfkVar.zzh()) {
                }
                return new zzfi(i12, zza3, zza4, zzc6, zzc92, i252, i262, f7, zzc3, zzc4, z4, zzh, zzc7, i10, i11, z7, i15, i16, i17, i14);
            }
            zza2 = 138;
        }
        zzc2 = zzfkVar.zzc();
        if (zzc2 == 3) {
            z4 = zzfkVar.zzh();
            i9 = 3;
        } else {
            i9 = zzc2;
            z4 = false;
        }
        zzc3 = zzfkVar.zzc();
        zzc4 = zzfkVar.zzc();
        zzfkVar.zze();
        if (zzfkVar.zzh()) {
            int i29 = i9 != 3 ? 8 : 12;
            int i30 = 0;
            while (i30 < i29) {
                if (zzfkVar.zzh()) {
                    int i31 = i30 < 6 ? 16 : 64;
                    int i32 = 8;
                    int i33 = 8;
                    for (int i34 = 0; i34 < i31; i34++) {
                        if (i32 != 0) {
                            i32 = ((zzfkVar.zzb() + i33) + 256) % 256;
                        }
                        if (i32 != 0) {
                            i33 = i32;
                        }
                    }
                }
                i30++;
            }
        }
        int zzc72 = zzfkVar.zzc() + 4;
        zzc5 = zzfkVar.zzc();
        if (zzc5 != 0) {
        }
        z7 = false;
        int zzc922 = zzfkVar.zzc();
        zzfkVar.zze();
        int zzc1022 = zzfkVar.zzc() + 1;
        int zzc1122 = zzfkVar.zzc() + 1;
        zzh = zzfkVar.zzh();
        int i2222 = 2 - (zzh ? 1 : 0);
        if (!zzh) {
        }
        zzfkVar.zze();
        int i2322 = zzc1022 * 16;
        int i2422 = zzc1122 * i2222 * 16;
        if (zzfkVar.zzh()) {
        }
        int i2522 = i2322;
        int i2622 = i2422;
        if (zza2 != 44) {
        }
        if ((zza3 & 16) != 0) {
        }
        i12 = zza2;
        i13 = 16;
        int i2722222 = -1;
        if (zzfkVar.zzh()) {
        }
        return new zzfi(i12, zza3, zza4, zzc6, zzc922, i2522, i2622, f7, zzc3, zzc4, z4, zzh, zzc72, i10, i11, z7, i15, i16, i17, i14);
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
                    int zza2 = zza(bArr, i9, length2, zArr);
                    if (zza2 != length2) {
                        zzfweVar.zzf(Integer.valueOf(zza2));
                    }
                    i9 = zza2 + 3;
                }
                zzfwh zzi = zzfweVar.zzi();
                for (int i10 = 0; i10 < zzi.size(); i10++) {
                    if (((Integer) zzi.get(i10)).intValue() + 3 < length) {
                        zzfk zzfkVar = new zzfk(bArr, ((Integer) zzi.get(i10)).intValue() + 3, length);
                        zzex zzm = zzm(zzfkVar);
                        if (zzm.zza == 33 && zzm.zzb == 0) {
                            zzfkVar.zzf(4);
                            int zza3 = zzfkVar.zza(3);
                            zzfkVar.zze();
                            zzey zzn = zzn(zzfkVar, true, zza3, null);
                            return zzda.zzd(zzn.zza, zzn.zzb, zzn.zzc, zzn.zzd, zzn.zze, zzn.zzf);
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
            zzex zzm = zzm(new zzfk(bArr, 4, i8 + 4));
            int i10 = zzm.zza;
            if (i10 == 35) {
                return false;
            }
            if (i10 <= 14 && i10 % 2 == 0 && zzm.zzc == zzzVar.zzD - 1) {
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzey zzn(zzfk zzfkVar, boolean z4, int i7, zzey zzeyVar) {
        int[] iArr;
        int i8;
        boolean z7;
        int i9;
        int i10;
        boolean z8;
        int i11;
        int i12;
        int[] iArr2 = new int[6];
        if (z4) {
            int zza2 = zzfkVar.zza(2);
            z8 = zzfkVar.zzh();
            i11 = zzfkVar.zza(5);
            i12 = 0;
            for (int i13 = 0; i13 < 32; i13++) {
                if (zzfkVar.zzh()) {
                    i12 |= 1 << i13;
                }
            }
            for (int i14 = 0; i14 < 6; i14++) {
                iArr2[i14] = zzfkVar.zza(8);
            }
            i8 = zza2;
        } else {
            if (zzeyVar == null) {
                iArr = iArr2;
                i8 = 0;
                z7 = false;
                i9 = 0;
                i10 = 0;
                int zza3 = zzfkVar.zza(8);
                int i15 = 0;
                for (int i16 = 0; i16 < i7; i16++) {
                    if (zzfkVar.zzh()) {
                        i15 += 88;
                    }
                    if (zzfkVar.zzh()) {
                        i15 += 8;
                    }
                }
                zzfkVar.zzf(i15);
                if (i7 > 0) {
                    int i17 = 8 - i7;
                    zzfkVar.zzf(i17 + i17);
                }
                return new zzey(i8, z7, i9, i10, iArr, zza3);
            }
            int i18 = zzeyVar.zza;
            z8 = zzeyVar.zzb;
            i11 = zzeyVar.zzc;
            i12 = zzeyVar.zzd;
            iArr2 = zzeyVar.zze;
            i8 = i18;
        }
        iArr = iArr2;
        z7 = z8;
        i9 = i11;
        i10 = i12;
        int zza32 = zzfkVar.zza(8);
        int i152 = 0;
        while (i16 < i7) {
        }
        zzfkVar.zzf(i152);
        if (i7 > 0) {
        }
        return new zzey(i8, z7, i9, i10, iArr, zza32);
    }

    private static void zzo(zzfk zzfkVar) {
        int zzc2 = zzfkVar.zzc() + 1;
        zzfkVar.zzf(8);
        for (int i7 = 0; i7 < zzc2; i7++) {
            zzfkVar.zzc();
            zzfkVar.zzc();
            zzfkVar.zze();
        }
        zzfkVar.zzf(20);
    }
}

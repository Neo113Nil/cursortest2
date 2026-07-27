package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgr {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static boolean zzb(zzv zzvVar, byte[] bArr, int i) {
        char c;
        String zzq = zzq(zzvVar);
        if (zzq == null) {
            return false;
        }
        int hashCode = zzq.hashCode();
        if (hashCode == -1662541442) {
            if (zzq.equals("video/hevc")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 1331836730) {
            if (hashCode == 1331856911 && zzq.equals("video/vvc")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (zzq.equals("video/avc")) {
                c = 0;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c == 2 && ((bArr[5] & 248) >> 3) == 23 : ((bArr[4] & 126) >> 1) == 39 : (bArr[4] & Ascii.US) == 6;
    }

    public static int zzc(zzv zzvVar) {
        String zzq = zzq(zzvVar);
        if (Objects.equals(zzq, "video/avc")) {
            return 1;
        }
        return (Objects.equals(zzq, "video/hevc") || Objects.equals(zzq, "video/vvc")) ? 2 : 0;
    }

    public static boolean zzd(byte[] bArr, int i, int i2, zzv zzvVar) {
        int i3;
        String str = zzvVar.zzp;
        if (Objects.equals(str, "video/avc")) {
            byte b = bArr[4];
            if (((b & 96) >> 5) == 0 && ((i3 = b & Ascii.US) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(str, "video/hevc")) {
            zzgf zzl = zzl(new zzgz(bArr, 4, i2 + 4));
            int i4 = zzl.zza;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && zzl.zzc == zzvVar.zzH - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0230 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgq zze(byte[] bArr, int i, int i2) {
        int zzg;
        int i3;
        boolean z;
        int zzg2;
        int zzg3;
        int zzg4;
        int i4;
        int i5;
        boolean z2;
        boolean zze;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f;
        float f2;
        int i12;
        int i13;
        boolean zze2;
        boolean zze3;
        int i14;
        zzgz zzgzVar = new zzgz(bArr, i, i2);
        int zzf = zzgzVar.zzf(8);
        int zzf2 = zzgzVar.zzf(8);
        int zzf3 = zzgzVar.zzf(8);
        int zzg5 = zzgzVar.zzg();
        if (zzf != 100 && zzf != 110 && zzf != 122 && zzf != 244 && zzf != 44 && zzf != 83 && zzf != 86 && zzf != 118 && zzf != 128) {
            if (zzf != 138) {
                zzg = 1;
                z = false;
                zzg2 = 0;
                zzg3 = 0;
                int zzg6 = zzgzVar.zzg() + 4;
                zzg4 = zzgzVar.zzg();
                if (zzg4 != 0) {
                    i4 = zzg4;
                    i5 = zzgzVar.zzg() + 4;
                } else {
                    if (zzg4 == 1) {
                        boolean zze4 = zzgzVar.zze();
                        zzgzVar.zzh();
                        zzgzVar.zzh();
                        long zzg7 = zzgzVar.zzg();
                        for (int i15 = 0; i15 < zzg7; i15++) {
                            zzgzVar.zzg();
                        }
                        z2 = zze4;
                        i4 = 1;
                        i5 = 0;
                        int zzg8 = zzgzVar.zzg();
                        zzgzVar.zza();
                        int zzg9 = zzgzVar.zzg() + 1;
                        int zzg10 = zzgzVar.zzg() + 1;
                        zze = zzgzVar.zze();
                        int i16 = 2 - (zze ? 1 : 0);
                        if (!zze) {
                            zzgzVar.zza();
                        }
                        zzgzVar.zza();
                        int i17 = zzg9 * 16;
                        int i18 = zzg10 * i16 * 16;
                        if (zzgzVar.zze()) {
                            int zzg11 = zzgzVar.zzg();
                            int zzg12 = zzgzVar.zzg();
                            int zzg13 = zzgzVar.zzg();
                            int zzg14 = zzgzVar.zzg();
                            if (zzg == 0) {
                                i14 = 1;
                            } else {
                                i14 = zzg == 3 ? 1 : 2;
                                i16 *= zzg == 1 ? 2 : 1;
                            }
                            i17 -= (zzg11 + zzg12) * i14;
                            i18 -= (zzg13 + zzg14) * i16;
                        }
                        int i19 = i17;
                        int i20 = i18;
                        if (zzf != 44 && zzf != 86 && zzf != 100 && zzf != 110 && zzf != 122) {
                            if (zzf == 244) {
                                zzf = 244;
                            }
                            i6 = zzf;
                            i7 = 16;
                            int i21 = -1;
                            if (zzgzVar.zze()) {
                                i8 = i7;
                                i9 = -1;
                                i10 = -1;
                                i11 = -1;
                                f = 1.0f;
                            } else {
                                if (zzgzVar.zze()) {
                                    int zzf4 = zzgzVar.zzf(8);
                                    if (zzf4 == 255) {
                                        int zzf5 = zzgzVar.zzf(16);
                                        int zzf6 = zzgzVar.zzf(16);
                                        if (zzf5 != 0 && zzf6 != 0) {
                                            f2 = zzf5 / zzf6;
                                            if (zzgzVar.zze()) {
                                                zzgzVar.zza();
                                            }
                                            if (zzgzVar.zze()) {
                                                zzgzVar.zzb(3);
                                                int i22 = true != zzgzVar.zze() ? 2 : 1;
                                                if (zzgzVar.zze()) {
                                                    int zzf7 = zzgzVar.zzf(8);
                                                    int zzf8 = zzgzVar.zzf(8);
                                                    zzgzVar.zzb(8);
                                                    int zzb2 = zzi.zzb(zzf7);
                                                    i13 = zzi.zzc(zzf8);
                                                    i12 = zzb2;
                                                } else {
                                                    i12 = -1;
                                                    i13 = -1;
                                                }
                                                i21 = i22;
                                            } else {
                                                i12 = -1;
                                                i13 = -1;
                                            }
                                            if (zzgzVar.zze()) {
                                                zzgzVar.zzg();
                                                zzgzVar.zzg();
                                            }
                                            if (zzgzVar.zze()) {
                                                zzgzVar.zzb(65);
                                            }
                                            zze2 = zzgzVar.zze();
                                            if (zze2) {
                                                zzp(zzgzVar);
                                            }
                                            zze3 = zzgzVar.zze();
                                            if (zze3) {
                                                zzp(zzgzVar);
                                            }
                                            if (!zze2 || zze3) {
                                                zzgzVar.zza();
                                            }
                                            zzgzVar.zza();
                                            if (zzgzVar.zze()) {
                                                zzgzVar.zza();
                                                zzgzVar.zzg();
                                                zzgzVar.zzg();
                                                zzgzVar.zzg();
                                                zzgzVar.zzg();
                                                int zzg15 = zzgzVar.zzg();
                                                zzgzVar.zzg();
                                                i9 = i12;
                                                i11 = i13;
                                                i8 = zzg15;
                                            } else {
                                                i9 = i12;
                                                i11 = i13;
                                                i8 = i7;
                                            }
                                            i10 = i21;
                                            f = f2;
                                        }
                                    } else if (zzf4 < 17) {
                                        f2 = zzb[zzf4];
                                        if (zzgzVar.zze()) {
                                        }
                                        if (zzgzVar.zze()) {
                                        }
                                        if (zzgzVar.zze()) {
                                        }
                                        if (zzgzVar.zze()) {
                                        }
                                        zze2 = zzgzVar.zze();
                                        if (zze2) {
                                        }
                                        zze3 = zzgzVar.zze();
                                        if (zze3) {
                                        }
                                        if (!zze2) {
                                        }
                                        zzgzVar.zza();
                                        zzgzVar.zza();
                                        if (zzgzVar.zze()) {
                                        }
                                        i10 = i21;
                                        f = f2;
                                    } else {
                                        StringBuilder sb = new StringBuilder(String.valueOf(zzf4).length() + 35);
                                        sb.append("Unexpected aspect_ratio_idc value: ");
                                        sb.append(zzf4);
                                        zzeh.zzc("NalUnitUtil", sb.toString());
                                    }
                                }
                                f2 = 1.0f;
                                if (zzgzVar.zze()) {
                                }
                                if (zzgzVar.zze()) {
                                }
                                if (zzgzVar.zze()) {
                                }
                                if (zzgzVar.zze()) {
                                }
                                zze2 = zzgzVar.zze();
                                if (zze2) {
                                }
                                zze3 = zzgzVar.zze();
                                if (zze3) {
                                }
                                if (!zze2) {
                                }
                                zzgzVar.zza();
                                zzgzVar.zza();
                                if (zzgzVar.zze()) {
                                }
                                i10 = i21;
                                f = f2;
                            }
                            return new zzgq(i6, zzf2, zzf3, zzg5, zzg8, i19, i20, f, zzg2, zzg3, z, zze, zzg6, i4, i5, z2, i9, i10, i11, i8);
                        }
                        if ((zzf2 & 16) != 0) {
                            i6 = zzf;
                            i7 = 0;
                            int i212 = -1;
                            if (zzgzVar.zze()) {
                            }
                            return new zzgq(i6, zzf2, zzf3, zzg5, zzg8, i19, i20, f, zzg2, zzg3, z, zze, zzg6, i4, i5, z2, i9, i10, i11, i8);
                        }
                        i6 = zzf;
                        i7 = 16;
                        int i2122 = -1;
                        if (zzgzVar.zze()) {
                        }
                        return new zzgq(i6, zzf2, zzf3, zzg5, zzg8, i19, i20, f, zzg2, zzg3, z, zze, zzg6, i4, i5, z2, i9, i10, i11, i8);
                    }
                    i4 = zzg4;
                    i5 = 0;
                }
                z2 = false;
                int zzg82 = zzgzVar.zzg();
                zzgzVar.zza();
                int zzg92 = zzgzVar.zzg() + 1;
                int zzg102 = zzgzVar.zzg() + 1;
                zze = zzgzVar.zze();
                int i162 = 2 - (zze ? 1 : 0);
                if (!zze) {
                }
                zzgzVar.zza();
                int i172 = zzg92 * 16;
                int i182 = zzg102 * i162 * 16;
                if (zzgzVar.zze()) {
                }
                int i192 = i172;
                int i202 = i182;
                if (zzf != 44) {
                    if (zzf == 244) {
                    }
                    i6 = zzf;
                    i7 = 16;
                    int i21222 = -1;
                    if (zzgzVar.zze()) {
                    }
                    return new zzgq(i6, zzf2, zzf3, zzg5, zzg82, i192, i202, f, zzg2, zzg3, z, zze, zzg6, i4, i5, z2, i9, i10, i11, i8);
                }
                if ((zzf2 & 16) != 0) {
                }
                i6 = zzf;
                i7 = 16;
                int i212222 = -1;
                if (zzgzVar.zze()) {
                }
                return new zzgq(i6, zzf2, zzf3, zzg5, zzg82, i192, i202, f, zzg2, zzg3, z, zze, zzg6, i4, i5, z2, i9, i10, i11, i8);
            }
            zzf = 138;
        }
        zzg = zzgzVar.zzg();
        if (zzg == 3) {
            z = zzgzVar.zze();
            i3 = 3;
        } else {
            i3 = zzg;
            z = false;
        }
        zzg2 = zzgzVar.zzg();
        zzg3 = zzgzVar.zzg();
        zzgzVar.zza();
        if (zzgzVar.zze()) {
            int i23 = i3 != 3 ? 8 : 12;
            int i24 = 0;
            while (i24 < i23) {
                if (zzgzVar.zze()) {
                    int i25 = i24 < 6 ? 16 : 64;
                    int i26 = 8;
                    int i27 = 8;
                    for (int i28 = 0; i28 < i25; i28++) {
                        if (i26 != 0) {
                            i26 = ((i27 + zzgzVar.zzh()) + 256) % 256;
                        }
                        if (i26 != 0) {
                            i27 = i26;
                        }
                    }
                }
                i24++;
            }
        }
        int zzg62 = zzgzVar.zzg() + 4;
        zzg4 = zzgzVar.zzg();
        if (zzg4 != 0) {
        }
        z2 = false;
        int zzg822 = zzgzVar.zzg();
        zzgzVar.zza();
        int zzg922 = zzgzVar.zzg() + 1;
        int zzg1022 = zzgzVar.zzg() + 1;
        zze = zzgzVar.zze();
        int i1622 = 2 - (zze ? 1 : 0);
        if (!zze) {
        }
        zzgzVar.zza();
        int i1722 = zzg922 * 16;
        int i1822 = zzg1022 * i1622 * 16;
        if (zzgzVar.zze()) {
        }
        int i1922 = i1722;
        int i2022 = i1822;
        if (zzf != 44) {
        }
        if ((zzf2 & 16) != 0) {
        }
        i6 = zzf;
        i7 = 16;
        int i2122222 = -1;
        if (zzgzVar.zze()) {
        }
        return new zzgq(i6, zzf2, zzf3, zzg5, zzg822, i1922, i2022, f, zzg2, zzg3, z, zze, zzg62, i4, i5, z2, i9, i10, i11, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:349:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgo zzf(byte[] bArr, int i, int i2) {
        int i3;
        int[] iArr;
        int i4;
        zzgn zzgnVar;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        zzgf zzgfVar;
        zzgxm zzgxmVar;
        int[] iArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr3;
        int i13;
        boolean[][] zArr;
        int i14;
        boolean[][] zArr2;
        int[] iArr4;
        int i15;
        int i16;
        boolean z2;
        boolean zze;
        int i17;
        int i18;
        int i19;
        int i20;
        int zzg;
        int[] iArr5;
        int i21;
        int i22;
        boolean z3;
        boolean z4;
        zzgz zzgzVar = new zzgz(bArr, i, i2);
        zzgf zzl = zzl(zzgzVar);
        zzgzVar.zzb(4);
        boolean zze2 = zzgzVar.zze();
        boolean zze3 = zzgzVar.zze();
        int zzf = zzgzVar.zzf(6);
        int i23 = zzf + 1;
        int zzf2 = zzgzVar.zzf(3);
        zzgzVar.zzb(17);
        int i24 = 1;
        zzgg zzm = zzm(zzgzVar, true, zzf2, null);
        int i25 = 0;
        for (int i26 = true != zzgzVar.zze() ? zzf2 : 0; i26 <= zzf2; i26++) {
            zzgzVar.zzg();
            zzgzVar.zzg();
            zzgzVar.zzg();
        }
        int zzf3 = zzgzVar.zzf(6);
        int zzg2 = zzgzVar.zzg() + 1;
        zzgh zzghVar = new zzgh(zzgxm.zzj(zzm), new int[1]);
        boolean z5 = i23 >= 2 && zzg2 >= 2;
        boolean z6 = zze2 && zze3;
        int i27 = zzf3 + 1;
        if (!z5 || !z6 || i27 < i23) {
            return new zzgo(zzl, null, zzghVar, null, null);
        }
        int[][] iArr6 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, zzg2, i27);
        int[] iArr7 = new int[zzg2];
        int[] iArr8 = new int[zzg2];
        iArr6[0][0] = 0;
        iArr7[0] = 1;
        iArr8[0] = 0;
        while (i24 < zzg2) {
            int i28 = i25;
            while (i25 <= zzf3) {
                if (zzgzVar.zze()) {
                    iArr6[i24][i28] = i25;
                    iArr8[i24] = i25;
                    i28++;
                }
                iArr7[i24] = i28;
                i25++;
            }
            i24++;
            i25 = 0;
        }
        if (zzgzVar.zze()) {
            zzgzVar.zzb(64);
            if (zzgzVar.zze()) {
                zzgzVar.zzg();
            }
            int zzg3 = zzgzVar.zzg();
            for (int i29 = 0; i29 < zzg3; i29++) {
                zzgzVar.zzg();
                if (i29 == 0 || zzgzVar.zze()) {
                    boolean zze4 = zzgzVar.zze();
                    boolean zze5 = zzgzVar.zze();
                    z4 = zze4;
                    z3 = zze5;
                    if (zze4 || zze5) {
                        zze = zzgzVar.zze();
                        if (zze) {
                            zzgzVar.zzb(19);
                        }
                        zzgzVar.zzb(8);
                        if (zze) {
                            zzgzVar.zzb(4);
                        }
                        zzgzVar.zzb(15);
                        i18 = zze4;
                        i17 = zze5;
                        i19 = 0;
                        while (i19 <= zzf2) {
                            if (zzgzVar.zze() || zzgzVar.zze()) {
                                zzgzVar.zzg();
                            } else if (zzgzVar.zze()) {
                                iArr5 = iArr8;
                                i20 = zzg3;
                                zzg = 0;
                                i21 = i18 + i17;
                                int[][] iArr9 = iArr6;
                                i22 = 0;
                                while (i22 < i21) {
                                    int i30 = i21;
                                    for (int i31 = 0; i31 <= zzg; i31++) {
                                        zzgzVar.zzg();
                                        zzgzVar.zzg();
                                        if (zze) {
                                            zzgzVar.zzg();
                                            zzgzVar.zzg();
                                        }
                                        zzgzVar.zza();
                                    }
                                    i22++;
                                    i21 = i30;
                                }
                                i19++;
                                iArr8 = iArr5;
                                zzg3 = i20;
                                iArr6 = iArr9;
                            }
                            i20 = zzg3;
                            zzg = zzgzVar.zzg();
                            iArr5 = iArr8;
                            i21 = i18 + i17;
                            int[][] iArr92 = iArr6;
                            i22 = 0;
                            while (i22 < i21) {
                            }
                            i19++;
                            iArr8 = iArr5;
                            zzg3 = i20;
                            iArr6 = iArr92;
                        }
                    }
                } else {
                    z4 = false;
                    z3 = false;
                }
                zze = false;
                i18 = z4;
                i17 = z3;
                i19 = 0;
                while (i19 <= zzf2) {
                }
            }
        }
        int[][] iArr10 = iArr6;
        int[] iArr11 = iArr8;
        if (!zzgzVar.zze()) {
            return new zzgo(zzl, null, zzghVar, null, null);
        }
        zzgzVar.zzc();
        zzgg zzm2 = zzm(zzgzVar, false, zzf2, zzm);
        boolean zze6 = zzgzVar.zze();
        boolean[] zArr3 = new boolean[16];
        int i32 = 0;
        for (int i33 = 0; i33 < 16; i33++) {
            boolean zze7 = zzgzVar.zze();
            zArr3[i33] = zze7;
            if (zze7) {
                i32++;
            }
        }
        if (i32 == 0 || !zArr3[1]) {
            return new zzgo(zzl, null, zzghVar, null, null);
        }
        int i34 = i32 + 1;
        int[] iArr12 = new int[i32];
        for (int i35 = 0; i35 < i32 - (zze6 ? 1 : 0); i35++) {
            iArr12[i35] = zzgzVar.zzf(3);
        }
        int[] iArr13 = new int[i34];
        if (zze6) {
            for (int i36 = 1; i36 < i32; i36++) {
                for (int i37 = 0; i37 < i36; i37++) {
                    iArr13[i36] = iArr13[i36] + iArr12[i37] + 1;
                }
            }
            iArr13[i32] = 6;
        }
        int[][] iArr14 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i23, i32);
        int[] iArr15 = new int[i23];
        iArr15[0] = 0;
        boolean zze8 = zzgzVar.zze();
        int i38 = 1;
        while (i38 < i23) {
            if (zze8) {
                iArr15[i38] = zzgzVar.zzf(6);
            } else {
                iArr15[i38] = i38;
            }
            if (zze6) {
                z2 = zze6 ? 1 : 0;
                for (int i39 = 0; i39 < i32; i39++) {
                    iArr14[i38][i39] = (iArr15[i38] & ((1 << iArr13[r31]) - 1)) >> iArr13[i39];
                }
            } else {
                int i40 = 0;
                while (i40 < i32) {
                    iArr14[i38][i40] = zzgzVar.zzf(iArr12[i40] + 1);
                    i40++;
                    zze6 = zze6;
                }
                z2 = zze6;
            }
            i38++;
            zze6 = z2;
        }
        int[] iArr16 = new int[i27];
        int i41 = 1;
        for (int i42 = 0; i42 < i23; i42++) {
            iArr16[iArr15[i42]] = -1;
            int i43 = 0;
            int i44 = 0;
            while (i43 < 16) {
                if (zArr3[i43]) {
                    i15 = 1;
                    if (i43 == 1) {
                        iArr16[iArr15[i42]] = iArr14[i42][i44];
                        i16 = 1;
                    } else {
                        i16 = i43;
                    }
                    i44++;
                    i43 = i16;
                } else {
                    i15 = 1;
                }
                i43 += i15;
            }
            if (i42 > 0) {
                int i45 = 0;
                while (true) {
                    if (i45 >= i42) {
                        i41++;
                        break;
                    }
                    if (iArr16[iArr15[i42]] == iArr16[iArr15[i45]]) {
                        break;
                    }
                    i45++;
                }
            }
        }
        int zzf4 = zzgzVar.zzf(4);
        if (i41 < 2 || zzf4 == 0) {
            return new zzgo(zzl, null, zzghVar, null, null);
        }
        int[] iArr17 = new int[i41];
        for (int i46 = 0; i46 < i41; i46++) {
            iArr17[i46] = zzgzVar.zzf(zzf4);
        }
        int[] iArr18 = new int[i27];
        for (int i47 = 0; i47 < i23; i47++) {
            iArr18[Math.min(iArr15[i47], zzf3)] = i47;
        }
        zzgxj zzgxjVar = new zzgxj();
        int i48 = 0;
        while (i48 <= zzf3) {
            int[] iArr19 = iArr16;
            int min = Math.min(iArr16[i48], i41 - 1);
            zzgxjVar.zzf(new zzge(iArr18[i48], min >= 0 ? iArr17[min] : -1));
            i48++;
            iArr16 = iArr19;
        }
        zzgxm zzi = zzgxjVar.zzi();
        if (((zzge) zzi.get(0)).zzb == -1) {
            return new zzgo(zzl, null, zzghVar, null, null);
        }
        int i49 = 1;
        while (true) {
            if (i49 > zzf3) {
                i3 = -1;
                i49 = -1;
                break;
            }
            i3 = -1;
            if (((zzge) zzi.get(i49)).zzb != -1) {
                break;
            }
            i49++;
        }
        if (i49 == i3) {
            return new zzgo(zzl, null, zzghVar, null, null);
        }
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i23, i23);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i23, i23);
        for (int i50 = 1; i50 < i23; i50++) {
            for (int i51 = 0; i51 < i50; i51++) {
                boolean[] zArr6 = zArr4[i50];
                boolean[] zArr7 = zArr5[i50];
                boolean zze9 = zzgzVar.zze();
                zArr7[i51] = zze9;
                zArr6[i51] = zze9;
            }
        }
        for (int i52 = 1; i52 < i23; i52++) {
            for (int i53 = 0; i53 < zzf; i53++) {
                int i54 = 0;
                while (true) {
                    if (i54 < i52) {
                        boolean[] zArr8 = zArr5[i52];
                        if (zArr8[i54] && zArr5[i54][i53]) {
                            zArr8[i53] = true;
                            break;
                        }
                        i54++;
                    }
                }
            }
        }
        int[] iArr20 = new int[i27];
        for (int i55 = 0; i55 < i23; i55++) {
            int i56 = 0;
            for (int i57 = 0; i57 < i55; i57++) {
                i56 += zArr4[i55][i57] ? 1 : 0;
            }
            iArr20[iArr15[i55]] = i56;
        }
        int i58 = 0;
        for (int i59 = 0; i59 < i23; i59++) {
            if (iArr20[iArr15[i59]] == 0) {
                i58++;
            }
        }
        if (i58 > 1) {
            return new zzgo(zzl, null, zzghVar, null, null);
        }
        int[] iArr21 = new int[i23];
        int i60 = zzg2;
        int[] iArr22 = new int[i60];
        if (zzgzVar.zze()) {
            int i61 = 0;
            while (i61 < i23) {
                iArr21[i61] = zzgzVar.zzf(3);
                i61++;
                iArr15 = iArr15;
            }
            iArr = iArr15;
            i4 = zzf2;
        } else {
            iArr = iArr15;
            i4 = zzf2;
            Arrays.fill(iArr21, 0, i23, i4);
        }
        int i62 = 0;
        while (i62 < i60) {
            int i63 = i49;
            boolean[][] zArr9 = zArr5;
            int[] iArr23 = iArr20;
            int i64 = 0;
            for (int i65 = 0; i65 < iArr7[i62]; i65++) {
                i64 = Math.max(i64, iArr21[((zzge) zzi.get(iArr10[i62][i65])).zza]);
            }
            iArr22[i62] = i64 + 1;
            i62++;
            zArr5 = zArr9;
            iArr20 = iArr23;
            i49 = i63;
        }
        int i66 = i49;
        boolean[][] zArr10 = zArr5;
        int[] iArr24 = iArr20;
        if (zzgzVar.zze()) {
            int i67 = 0;
            while (i67 < zzf) {
                int i68 = i67 + 1;
                for (int i69 = i68; i69 < i23; i69++) {
                    if (zArr4[i69][i67]) {
                        zzgzVar.zzb(3);
                    }
                }
                i67 = i68;
            }
        }
        zzgzVar.zza();
        int zzg4 = zzgzVar.zzg() + 1;
        zzgxj zzgxjVar2 = new zzgxj();
        zzgxjVar2.zzf(zzm);
        if (zzg4 > 1) {
            zzgg zzggVar = zzm2;
            zzgxjVar2.zzf(zzggVar);
            for (int i70 = 2; i70 < zzg4; i70++) {
                zzggVar = zzm(zzgzVar, zzgzVar.zze(), i4, zzggVar);
                zzgxjVar2.zzf(zzggVar);
            }
        }
        zzgxm zzi2 = zzgxjVar2.zzi();
        int zzg5 = zzgzVar.zzg() + i60;
        if (zzg5 > i60) {
            return new zzgo(zzl, null, zzghVar, null, null);
        }
        int zzf5 = zzgzVar.zzf(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, zzg5, i27);
        int[] iArr25 = new int[zzg5];
        int[] iArr26 = new int[zzg5];
        int i71 = 0;
        while (i71 < i60) {
            int i72 = i60;
            iArr25[i71] = 0;
            int i73 = iArr11[i71];
            iArr26[i71] = i73;
            if (zzf5 == 0) {
                zArr2 = zArr4;
                i14 = i23;
                iArr4 = iArr22;
                Arrays.fill(zArr11[i71], 0, iArr7[i71], true);
                iArr25[i71] = iArr7[i71];
            } else {
                i14 = i23;
                zArr2 = zArr4;
                iArr4 = iArr22;
                if (zzf5 == 1) {
                    for (int i74 = 0; i74 < iArr7[i71]; i74++) {
                        zArr11[i71][i74] = iArr10[i71][i74] == i73;
                    }
                    iArr25[i71] = 1;
                } else {
                    zArr11[0][0] = true;
                    iArr25[0] = 1;
                    i71++;
                    i60 = i72;
                    zArr4 = zArr2;
                    iArr22 = iArr4;
                    i23 = i14;
                }
            }
            i71++;
            i60 = i72;
            zArr4 = zArr2;
            iArr22 = iArr4;
            i23 = i14;
        }
        int i75 = i23;
        boolean[][] zArr12 = zArr4;
        int[] iArr27 = iArr22;
        int i76 = i60;
        int[] iArr28 = new int[i27];
        int i77 = 2;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, zzg5, i27);
        int i78 = 0;
        int i79 = 1;
        while (i79 < zzg5) {
            if (zzf5 == i77) {
                for (int i80 = 0; i80 < iArr7[i79]; i80++) {
                    zArr11[i79][i80] = zzgzVar.zze();
                    int i81 = iArr25[i79];
                    boolean z7 = zArr11[i79][i80];
                    iArr25[i79] = i81 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr26[i79] = iArr10[i79][i80];
                    }
                }
            }
            if (i78 == 0) {
                if (iArr10[i79][0] == 0 && zArr11[i79][0]) {
                    i78 = 0;
                    int i82 = 1;
                    while (i82 < iArr7[i79]) {
                        int i83 = zzf5;
                        int i84 = i66;
                        if (iArr10[i79][i82] == i84 && zArr11[i79][i84]) {
                            i78 = i79;
                        }
                        i82++;
                        i66 = i84;
                        zzf5 = i83;
                    }
                } else {
                    i9 = zzf5;
                    i10 = i66;
                    i78 = 0;
                    i11 = 0;
                    while (i11 < iArr7[i79]) {
                        if (zzg4 > 1) {
                            zArr13[i79][i11] = zArr11[i79][i11];
                            iArr3 = iArr26;
                            i13 = i10;
                            i12 = zzg4;
                            int zzc2 = zzhaw.zzc(zzg4, RoundingMode.CEILING);
                            if (!zArr13[i79][i11]) {
                                int i85 = ((zzge) zzi.get(iArr10[i79][i11])).zza;
                                int i86 = 0;
                                while (i86 < i11) {
                                    zArr = zArr11;
                                    if (zArr10[i85][((zzge) zzi.get(iArr10[i79][i86])).zza]) {
                                        zArr13[i79][i11] = true;
                                        break;
                                    }
                                    i86++;
                                    zArr11 = zArr;
                                }
                            }
                            zArr = zArr11;
                            if (zArr13[i79][i11]) {
                                if (i78 <= 0 || i79 != i78) {
                                    zzgzVar.zzb(zzc2);
                                } else {
                                    iArr28[i11] = zzgzVar.zzf(zzc2);
                                }
                            }
                        } else {
                            i12 = zzg4;
                            iArr3 = iArr26;
                            i13 = i10;
                            zArr = zArr11;
                        }
                        i11++;
                        iArr26 = iArr3;
                        i10 = i13;
                        zzg4 = i12;
                        zArr11 = zArr;
                    }
                    int i87 = zzg4;
                    int[] iArr29 = iArr26;
                    i66 = i10;
                    boolean[][] zArr14 = zArr11;
                    if (iArr25[i79] == 1 && iArr24[iArr29[i79]] > 0) {
                        zzgzVar.zza();
                    }
                    i79++;
                    iArr26 = iArr29;
                    zzf5 = i9;
                    zzg4 = i87;
                    zArr11 = zArr14;
                    i77 = 2;
                }
            }
            i9 = zzf5;
            i10 = i66;
            i11 = 0;
            while (i11 < iArr7[i79]) {
            }
            int i872 = zzg4;
            int[] iArr292 = iArr26;
            i66 = i10;
            boolean[][] zArr142 = zArr11;
            if (iArr25[i79] == 1) {
                zzgzVar.zza();
            }
            i79++;
            iArr26 = iArr292;
            zzf5 = i9;
            zzg4 = i872;
            zArr11 = zArr142;
            i77 = 2;
        }
        if (i78 == 0) {
            return new zzgo(zzl, null, zzghVar, null, null);
        }
        int zzg6 = zzgzVar.zzg();
        int i88 = zzg6 + 1;
        zzgxj zzv = zzgxm.zzv(i88);
        int[] iArr30 = new int[i75];
        int i89 = 0;
        while (i89 < i88) {
            int zzf6 = zzgzVar.zzf(16);
            int zzf7 = zzgzVar.zzf(16);
            if (zzgzVar.zze()) {
                i6 = zzgzVar.zzf(2);
                if (i6 == 3) {
                    zzgzVar.zza();
                }
                i7 = zzgzVar.zzf(4);
                i8 = zzgzVar.zzf(4);
            } else {
                i6 = 0;
                i7 = 0;
                i8 = 0;
            }
            if (zzgzVar.zze()) {
                int zzg7 = zzgzVar.zzg();
                zzgxmVar = zzi;
                int zzg8 = zzgzVar.zzg();
                zzgfVar = zzl;
                int zzg9 = zzgzVar.zzg();
                iArr2 = iArr28;
                int zzg10 = zzgzVar.zzg();
                zzf6 = zzn(zzf6, i6, zzg7, zzg8);
                zzf7 = zzo(zzf7, i6, zzg9, zzg10);
            } else {
                zzgfVar = zzl;
                zzgxmVar = zzi;
                iArr2 = iArr28;
            }
            zzv.zzf(new zzgi(i6, i7, i8, zzf6, zzf7));
            i89++;
            zzi = zzgxmVar;
            zzl = zzgfVar;
            iArr28 = iArr2;
        }
        zzgf zzgfVar2 = zzl;
        zzgxm zzgxmVar2 = zzi;
        int[] iArr31 = iArr28;
        if (i88 <= 1 || !zzgzVar.zze()) {
            for (int i90 = 1; i90 < i75; i90++) {
                iArr30[i90] = Math.min(i90, zzg6);
            }
        } else {
            int zzc3 = zzhaw.zzc(i88, RoundingMode.CEILING);
            for (int i91 = 1; i91 < i75; i91++) {
                iArr30[i91] = zzgzVar.zzf(zzc3);
            }
        }
        zzgj zzgjVar = new zzgj(zzv.zzi(), iArr30);
        zzgzVar.zzb(2);
        for (int i92 = 1; i92 < i75; i92++) {
            if (iArr24[iArr[i92]] == 0) {
                zzgzVar.zza();
            }
        }
        for (int i93 = 1; i93 < zzg5; i93++) {
            boolean zze10 = zzgzVar.zze();
            int i94 = 0;
            while (i94 < iArr27[i93]) {
                if ((i94 <= 0 || !zze10) ? i94 == 0 : zzgzVar.zze()) {
                    for (int i95 = 0; i95 < iArr7[i93]; i95++) {
                        if (zArr13[i93][i95]) {
                            zzgzVar.zzg();
                        }
                    }
                    zzgzVar.zzg();
                    zzgzVar.zzg();
                }
                i94++;
            }
        }
        int zzg11 = zzgzVar.zzg() + 2;
        if (zzgzVar.zze()) {
            zzgzVar.zzb(zzg11);
        } else {
            for (int i96 = 1; i96 < i75; i96++) {
                for (int i97 = 0; i97 < i96; i97++) {
                    if (zArr12[i96][i97]) {
                        zzgzVar.zzb(zzg11);
                    }
                }
            }
        }
        int zzg12 = zzgzVar.zzg();
        for (int i98 = 1; i98 <= zzg12; i98++) {
            zzgzVar.zzb(8);
        }
        if (zzgzVar.zze()) {
            zzgzVar.zzc();
            if (zzgzVar.zze() || zzgzVar.zze()) {
                zzgzVar.zza();
            }
            boolean zze11 = zzgzVar.zze();
            boolean zze12 = zzgzVar.zze();
            if (zze11 || zze12) {
                for (int i99 = 0; i99 < i76; i99++) {
                    for (int i100 = 0; i100 < iArr27[i99]; i100++) {
                        boolean zze13 = zze11 ? zzgzVar.zze() : false;
                        boolean zze14 = zze12 ? zzgzVar.zze() : false;
                        if (zze13) {
                            zzgzVar.zzb(32);
                        }
                        if (zze14) {
                            zzgzVar.zzb(18);
                        }
                    }
                }
            }
            boolean zze15 = zzgzVar.zze();
            if (zze15) {
                z = true;
                i5 = zzgzVar.zzf(4) + 1;
            } else {
                z = true;
                i5 = i75;
            }
            zzgxj zzv2 = zzgxm.zzv(i5);
            int[] iArr32 = new int[i75];
            int i101 = 0;
            while (i101 < i5) {
                zzgzVar.zzb(3);
                int i102 = z != zzgzVar.zze() ? 2 : 1;
                int zzb2 = zzi.zzb(zzgzVar.zzf(8));
                int zzc4 = zzi.zzc(zzgzVar.zzf(8));
                zzgzVar.zzb(8);
                zzv2.zzf(new zzgm(zzb2, i102, zzc4));
                i101++;
                z = true;
            }
            if (zze15 && i5 > 1) {
                for (int i103 = 0; i103 < i75; i103++) {
                    iArr32[i103] = zzgzVar.zzf(4);
                }
            }
            zzgnVar = new zzgn(zzv2.zzi(), iArr32);
        } else {
            zzgnVar = null;
        }
        return new zzgo(zzgfVar2, zzgxmVar2, new zzgh(zzi2, iArr31), zzgjVar, zzgnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgl zzg(byte[] bArr, int i, int i2, zzgo zzgoVar) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzg;
        int zzg2;
        int i11;
        int i12;
        int i13;
        int i14;
        int zzg3;
        int i15;
        float f;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzgn zzgnVar;
        int i21;
        int i22;
        int i23;
        int i24;
        zzgf zzgfVar;
        int i25;
        zzgg zzggVar;
        int i26;
        int i27;
        int i28;
        int i29;
        zzgj zzgjVar;
        zzgf zzl = zzl(new zzgz(bArr, i, i2));
        zzgz zzgzVar = new zzgz(bArr, i + 2, i2);
        zzgzVar.zzb(4);
        int zzf = zzgzVar.zzf(3);
        int i30 = zzl.zzb;
        if (i30 == 0 || zzf != 7) {
            z = false;
        } else {
            zzf = 7;
            z = true;
        }
        if (zzgoVar != null) {
            zzgxm zzgxmVar = zzgoVar.zza;
            if (!zzgxmVar.isEmpty()) {
                i3 = ((zzge) zzgxmVar.get(Math.min(i30, zzgxmVar.size() - 1))).zza;
                zzgg zzggVar2 = null;
                if (z) {
                    zzgzVar.zza();
                    zzggVar2 = zzm(zzgzVar, true, zzf, null);
                } else if (zzgoVar != null) {
                    zzgh zzghVar = zzgoVar.zzb;
                    int i31 = zzghVar.zzb[i3];
                    zzgxm zzgxmVar2 = zzghVar.zza;
                    if (zzgxmVar2.size() > i31) {
                        zzggVar2 = (zzgg) zzgxmVar2.get(i31);
                    }
                }
                int zzg4 = zzgzVar.zzg();
                if (z) {
                    int zzg5 = zzgzVar.zzg();
                    if (zzg5 == 3) {
                        zzgzVar.zza();
                        i4 = 3;
                    } else {
                        i4 = zzg5;
                    }
                    int zzg6 = zzgzVar.zzg();
                    int zzg7 = zzgzVar.zzg();
                    if (zzgzVar.zze()) {
                        int zzg8 = zzgzVar.zzg();
                        int zzg9 = zzgzVar.zzg();
                        int zzg10 = zzgzVar.zzg();
                        int zzg11 = zzgzVar.zzg();
                        i5 = zzn(zzg6, i4, zzg8, zzg9);
                        i6 = zzo(zzg7, i4, zzg10, zzg11);
                    } else {
                        i5 = zzg6;
                        i6 = zzg7;
                    }
                    i7 = i5;
                    i8 = zzg6;
                    i9 = zzg7;
                    i10 = i6;
                    zzg = zzgzVar.zzg();
                    zzg2 = zzgzVar.zzg();
                    i11 = zzg5;
                } else {
                    int zzf2 = zzgzVar.zze() ? zzgzVar.zzf(8) : -1;
                    if (zzgoVar != null && (zzgjVar = zzgoVar.zzc) != null) {
                        if (zzf2 == -1) {
                            zzf2 = zzgjVar.zzb[i3];
                        }
                        if (zzf2 != -1) {
                            zzgxm zzgxmVar3 = zzgjVar.zza;
                            if (zzgxmVar3.size() > zzf2) {
                                zzgi zzgiVar = (zzgi) zzgxmVar3.get(zzf2);
                                int i32 = zzgiVar.zza;
                                i7 = zzgiVar.zzd;
                                i10 = zzgiVar.zze;
                                zzg = zzgiVar.zzb;
                                i9 = i10;
                                i8 = i7;
                                zzg2 = zzgiVar.zzc;
                                i11 = i32;
                            }
                        }
                    }
                    zzg = 0;
                    i8 = 0;
                    i11 = 0;
                    zzg2 = 0;
                    i10 = 0;
                    i7 = 0;
                    i9 = 0;
                }
                int zzg12 = zzgzVar.zzg();
                if (z) {
                    i12 = i8;
                    int i33 = true != zzgzVar.zze() ? zzf : 0;
                    int i34 = -1;
                    while (i33 <= zzf) {
                        zzgzVar.zzg();
                        i34 = Math.max(zzgzVar.zzg(), i34);
                        zzgzVar.zzg();
                        i33++;
                        i7 = i7;
                    }
                    i13 = i7;
                    i14 = i34;
                } else {
                    i12 = i8;
                    i13 = i7;
                    i14 = -1;
                }
                zzgzVar.zzg();
                zzgzVar.zzg();
                zzgzVar.zzg();
                zzgzVar.zzg();
                zzgzVar.zzg();
                zzgzVar.zzg();
                if (zzgzVar.zze()) {
                    int i35 = 6;
                    if (z && zzgzVar.zze()) {
                        zzgzVar.zzb(6);
                    } else if (zzgzVar.zze()) {
                        int i36 = 0;
                        int i37 = 4;
                        while (i36 < i37) {
                            int i38 = 0;
                            while (i38 < i35) {
                                if (zzgzVar.zze()) {
                                    i27 = i14;
                                    i28 = zzg4;
                                    int min = Math.min(64, 1 << ((i36 + i36) + 4));
                                    if (i36 > 1) {
                                        zzgzVar.zzh();
                                    }
                                    for (int i39 = 0; i39 < min; i39++) {
                                        zzgzVar.zzh();
                                    }
                                    i29 = 3;
                                } else {
                                    zzgzVar.zzg();
                                    i27 = i14;
                                    i28 = zzg4;
                                    i29 = 3;
                                }
                                i38 += i36 == i29 ? 3 : 1;
                                zzg4 = i28;
                                i14 = i27;
                                i35 = 6;
                            }
                            i36++;
                            i37 = 4;
                            i35 = 6;
                        }
                    }
                }
                int i40 = i14;
                int i41 = zzg4;
                zzgzVar.zzb(2);
                if (zzgzVar.zze()) {
                    zzgzVar.zzb(8);
                    zzgzVar.zzg();
                    zzgzVar.zzg();
                    zzgzVar.zza();
                }
                zzg3 = zzgzVar.zzg();
                int[] iArr = new int[0];
                int[] iArr2 = new int[0];
                i15 = 0;
                int i42 = zzg2;
                int i43 = -1;
                int i44 = -1;
                while (i15 < zzg3) {
                    if (i15 == 0 || !zzgzVar.zze()) {
                        i22 = zzg;
                        i23 = zzg3;
                        i24 = zzf;
                        zzgfVar = zzl;
                        i25 = i11;
                        zzggVar = zzggVar2;
                        int zzg13 = zzgzVar.zzg();
                        int zzg14 = zzgzVar.zzg();
                        int[] iArr3 = new int[zzg13];
                        int i45 = 0;
                        while (i45 < zzg13) {
                            iArr3[i45] = (i45 > 0 ? iArr3[i45 - 1] : 0) - (zzgzVar.zzg() + 1);
                            zzgzVar.zza();
                            i45++;
                        }
                        int[] iArr4 = new int[zzg14];
                        int i46 = 0;
                        while (i46 < zzg14) {
                            iArr4[i46] = (i46 > 0 ? iArr4[i46 - 1] : 0) + zzgzVar.zzg() + 1;
                            zzgzVar.zza();
                            i46++;
                        }
                        i43 = zzg13;
                        i44 = zzg14;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    } else {
                        i23 = zzg3;
                        int i47 = i43 + i44;
                        boolean zze = zzgzVar.zze();
                        boolean z2 = true;
                        int zzg15 = zzgzVar.zzg() + 1;
                        int i48 = 1 - ((zze ? 1 : 0) + (zze ? 1 : 0));
                        i22 = zzg;
                        int i49 = i47 + 1;
                        i25 = i11;
                        boolean[] zArr = new boolean[i49];
                        zzggVar = zzggVar2;
                        int i50 = 0;
                        while (i50 <= i47) {
                            if (zzgzVar.zze()) {
                                zArr[i50] = z2;
                            } else {
                                zArr[i50] = zzgzVar.zze();
                            }
                            i50++;
                            z2 = true;
                        }
                        int i51 = i44 - 1;
                        int[] iArr5 = new int[i49];
                        int[] iArr6 = new int[i49];
                        int i52 = 0;
                        while (true) {
                            i26 = i48 * zzg15;
                            if (i51 < 0) {
                                break;
                            }
                            int i53 = iArr2[i51] + i26;
                            if (i53 < 0 && zArr[i43 + i51]) {
                                iArr5[i52] = i53;
                                i52++;
                            }
                            i51--;
                        }
                        if (i26 < 0 && zArr[i47]) {
                            iArr5[i52] = i26;
                            i52++;
                        }
                        i24 = zzf;
                        zzgfVar = zzl;
                        int i54 = i52;
                        for (int i55 = 0; i55 < i43; i55++) {
                            int i56 = iArr[i55] + i26;
                            if (i56 < 0 && zArr[i55]) {
                                iArr5[i54] = i56;
                                i54++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr5, i54);
                        int i57 = 0;
                        for (int i58 = i43 - 1; i58 >= 0; i58--) {
                            int i59 = iArr[i58] + i26;
                            if (i59 > 0 && zArr[i58]) {
                                iArr6[i57] = i59;
                                i57++;
                            }
                        }
                        if (i26 > 0 && zArr[i47]) {
                            iArr6[i57] = i26;
                            i57++;
                        }
                        int i60 = i57;
                        for (int i61 = 0; i61 < i44; i61++) {
                            int i62 = iArr2[i61] + i26;
                            if (i62 > 0 && zArr[i43 + i61]) {
                                iArr6[i60] = i62;
                                i60++;
                            }
                        }
                        iArr2 = Arrays.copyOf(iArr6, i60);
                        i44 = i60;
                        i43 = i54;
                        iArr = copyOf;
                    }
                    i15++;
                    zzg3 = i23;
                    zzf = i24;
                    zzl = zzgfVar;
                    zzg = i22;
                    i11 = i25;
                    zzggVar2 = zzggVar;
                }
                int i63 = zzg;
                int i64 = zzf;
                zzgf zzgfVar2 = zzl;
                int i65 = i11;
                zzgg zzggVar3 = zzggVar2;
                if (zzgzVar.zze()) {
                    int zzg16 = zzgzVar.zzg();
                    for (int i66 = 0; i66 < zzg16; i66++) {
                        zzgzVar.zzb(zzg12 + 5);
                    }
                }
                zzgzVar.zzb(2);
                float f2 = 1.0f;
                if (zzgzVar.zze()) {
                    f = 1.0f;
                    i16 = -1;
                    i17 = -1;
                    i18 = -1;
                } else {
                    if (zzgzVar.zze()) {
                        int zzf3 = zzgzVar.zzf(8);
                        if (zzf3 == 255) {
                            int zzf4 = zzgzVar.zzf(16);
                            int zzf5 = zzgzVar.zzf(16);
                            if (zzf4 != 0 && zzf5 != 0) {
                                f2 = zzf4 / zzf5;
                            }
                        } else if (zzf3 < 17) {
                            f2 = zzb[zzf3];
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(zzf3).length() + 35);
                            sb.append("Unexpected aspect_ratio_idc value: ");
                            sb.append(zzf3);
                            zzeh.zzc("NalUnitUtil", sb.toString());
                        }
                    }
                    if (zzgzVar.zze()) {
                        zzgzVar.zza();
                    }
                    if (zzgzVar.zze()) {
                        zzgzVar.zzb(3);
                        i20 = true != zzgzVar.zze() ? 2 : 1;
                        if (zzgzVar.zze()) {
                            int zzf6 = zzgzVar.zzf(8);
                            int zzf7 = zzgzVar.zzf(8);
                            zzgzVar.zzb(8);
                            i21 = zzi.zzb(zzf6);
                            i19 = zzi.zzc(zzf7);
                            if (zzgzVar.zze()) {
                                zzgzVar.zzg();
                                zzgzVar.zzg();
                            }
                            zzgzVar.zza();
                            if (zzgzVar.zze()) {
                                i10 += i10;
                            }
                            i17 = i19;
                            f = f2;
                            i16 = i20;
                            i18 = i21;
                        } else {
                            i19 = -1;
                            i21 = -1;
                            if (zzgzVar.zze()) {
                            }
                            zzgzVar.zza();
                            if (zzgzVar.zze()) {
                            }
                            i17 = i19;
                            f = f2;
                            i16 = i20;
                            i18 = i21;
                        }
                    } else {
                        if (zzgoVar != null && (zzgnVar = zzgoVar.zzd) != null) {
                            int i67 = zzgnVar.zzb[i3];
                            zzgxm zzgxmVar4 = zzgnVar.zza;
                            if (zzgxmVar4.size() > i67) {
                                zzgm zzgmVar = (zzgm) zzgxmVar4.get(i67);
                                i21 = zzgmVar.zza;
                                int i68 = zzgmVar.zzb;
                                i19 = zzgmVar.zzc;
                                i20 = i68;
                                if (zzgzVar.zze()) {
                                }
                                zzgzVar.zza();
                                if (zzgzVar.zze()) {
                                }
                                i17 = i19;
                                f = f2;
                                i16 = i20;
                                i18 = i21;
                            }
                        }
                        i19 = -1;
                        i20 = -1;
                        i21 = -1;
                        if (zzgzVar.zze()) {
                        }
                        zzgzVar.zza();
                        if (zzgzVar.zze()) {
                        }
                        i17 = i19;
                        f = f2;
                        i16 = i20;
                        i18 = i21;
                    }
                }
                return new zzgl(zzgfVar2, i64, zzggVar3, i65, i63, i42, i41, i13, i10, i12, i9, f, i40, i18, i16, i17);
            }
        }
        i3 = 0;
        zzgg zzggVar22 = null;
        if (z) {
        }
        int zzg42 = zzgzVar.zzg();
        if (z) {
        }
        int zzg122 = zzgzVar.zzg();
        if (z) {
        }
        zzgzVar.zzg();
        zzgzVar.zzg();
        zzgzVar.zzg();
        zzgzVar.zzg();
        zzgzVar.zzg();
        zzgzVar.zzg();
        if (zzgzVar.zze()) {
        }
        int i402 = i14;
        int i412 = zzg42;
        zzgzVar.zzb(2);
        if (zzgzVar.zze()) {
        }
        zzg3 = zzgzVar.zzg();
        int[] iArr7 = new int[0];
        int[] iArr22 = new int[0];
        i15 = 0;
        int i422 = zzg2;
        int i432 = -1;
        int i442 = -1;
        while (i15 < zzg3) {
        }
        int i632 = zzg;
        int i642 = zzf;
        zzgf zzgfVar22 = zzl;
        int i652 = i11;
        zzgg zzggVar32 = zzggVar22;
        if (zzgzVar.zze()) {
        }
        zzgzVar.zzb(2);
        float f22 = 1.0f;
        if (zzgzVar.zze()) {
        }
        return new zzgl(zzgfVar22, i642, zzggVar32, i652, i632, i422, i412, i13, i10, i12, i9, f, i402, i18, i16, i17);
    }

    public static zzgp zzh(byte[] bArr, int i, int i2) {
        zzgz zzgzVar = new zzgz(bArr, 4, i2);
        int zzg = zzgzVar.zzg();
        int zzg2 = zzgzVar.zzg();
        zzgzVar.zza();
        return new zzgp(zzg, zzg2, zzgzVar.zze());
    }

    public static int zzi(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzguk.zzi(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zzj(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zzj(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zzj(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    zzj(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static void zzj(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String zzk(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i2 = zzgxm.zzd;
                zzgxj zzgxjVar = new zzgxj();
                int i3 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i3 >= length2) {
                        break;
                    }
                    int zzi = zzi(bArr, i3, length2, zArr);
                    if (zzi != length2) {
                        zzgxjVar.zzf(Integer.valueOf(zzi));
                    }
                    i3 = zzi + 3;
                }
                zzgxm zzi2 = zzgxjVar.zzi();
                for (int i4 = 0; i4 < zzi2.size(); i4++) {
                    if (((Integer) zzi2.get(i4)).intValue() + 3 < length) {
                        zzgz zzgzVar = new zzgz(bArr, ((Integer) zzi2.get(i4)).intValue() + 3, length);
                        zzgf zzl = zzl(zzgzVar);
                        if (zzl.zza == 33 && zzl.zzb == 0) {
                            zzgzVar.zzb(4);
                            int zzf = zzgzVar.zzf(3);
                            zzgzVar.zza();
                            zzgg zzm = zzm(zzgzVar, true, zzf, null);
                            return zzdr.zzc(zzm.zza, zzm.zzb, zzm.zzc, zzm.zzd, zzm.zze, zzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static zzgf zzl(zzgz zzgzVar) {
        zzgzVar.zza();
        return new zzgf(zzgzVar.zzf(6), zzgzVar.zzf(6), zzgzVar.zzf(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzgg zzm(zzgz zzgzVar, boolean z, int i, zzgg zzggVar) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            int zzf = zzgzVar.zzf(2);
            z3 = zzgzVar.zze();
            i5 = zzgzVar.zzf(5);
            i6 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (zzgzVar.zze()) {
                    i6 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = zzgzVar.zzf(8);
            }
            i2 = zzf;
        } else {
            if (zzggVar == null) {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
                int zzf2 = zzgzVar.zzf(8);
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    if (zzgzVar.zze()) {
                        i9 += 88;
                    }
                    if (zzgzVar.zze()) {
                        i9 += 8;
                    }
                }
                zzgzVar.zzb(i9);
                if (i > 0) {
                    int i11 = 8 - i;
                    zzgzVar.zzb(i11 + i11);
                }
                return new zzgg(i2, z2, i3, i4, iArr, zzf2);
            }
            int i12 = zzggVar.zza;
            z3 = zzggVar.zzb;
            i5 = zzggVar.zzc;
            i6 = zzggVar.zzd;
            iArr2 = zzggVar.zze;
            i2 = i12;
        }
        iArr = iArr2;
        z2 = z3;
        i3 = i5;
        i4 = i6;
        int zzf22 = zzgzVar.zzf(8);
        int i92 = 0;
        while (i10 < i) {
        }
        zzgzVar.zzb(i92);
        if (i > 0) {
        }
        return new zzgg(i2, z2, i3, i4, iArr, zzf22);
    }

    private static int zzn(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (i2 != 1 && i2 != 2) {
            i5 = 1;
        }
        return i - (i5 * (i3 + i4));
    }

    private static int zzo(int i, int i2, int i3, int i4) {
        return i - ((i2 == 1 ? 2 : 1) * (i3 + i4));
    }

    private static void zzp(zzgz zzgzVar) {
        int zzg = zzgzVar.zzg() + 1;
        zzgzVar.zzb(8);
        for (int i = 0; i < zzg; i++) {
            zzgzVar.zzg();
            zzgzVar.zzg();
            zzgzVar.zza();
        }
        zzgzVar.zzb(20);
    }

    private static String zzq(zzv zzvVar) {
        String str;
        String str2 = zzvVar.zzp;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.zzk) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }

    public static int zza(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = zzd[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }
}

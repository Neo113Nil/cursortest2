package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgp {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final java.lang.Object zzc = new java.lang.Object();
    private static int[] zzd = new int[10];

    public static boolean zzb(com.google.android.gms.internal.ads.zzv zzvVar, byte[] bArr, int i) {
        char c;
        java.lang.String zzq = zzq(zzvVar);
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
        return c != 0 ? c != 1 ? c == 2 && ((bArr[5] & 248) >> 3) == 23 : ((bArr[4] & 126) >> 1) == 39 : (bArr[4] & com.google.common.base.Ascii.US) == 6;
    }

    public static int zzc(com.google.android.gms.internal.ads.zzv zzvVar) {
        java.lang.String zzq = zzq(zzvVar);
        if (java.util.Objects.equals(zzq, "video/avc")) {
            return 1;
        }
        return (java.util.Objects.equals(zzq, "video/hevc") || java.util.Objects.equals(zzq, "video/vvc")) ? 2 : 0;
    }

    public static boolean zzd(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzv zzvVar) {
        int i3;
        java.lang.String str = zzvVar.zzp;
        if (java.util.Objects.equals(str, "video/avc")) {
            byte b = bArr[4];
            if (((b & 96) >> 5) == 0 && ((i3 = b & com.google.common.base.Ascii.US) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (java.util.Objects.equals(str, "video/hevc")) {
            com.google.android.gms.internal.ads.zzgd zzl = zzl(new com.google.android.gms.internal.ads.zzgw(bArr, 4, i2 + 4));
            int i4 = zzl.zza;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && zzl.zzc == zzvVar.zzG - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0233 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzgo zze(byte[] bArr, int i, int i2) {
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
        float f;
        int i9;
        int i10;
        int i11;
        float f2;
        int i12;
        int i13;
        boolean zze2;
        boolean zze3;
        int i14;
        com.google.android.gms.internal.ads.zzgw zzgwVar = new com.google.android.gms.internal.ads.zzgw(bArr, i, i2);
        int zzf = zzgwVar.zzf(8);
        int zzf2 = zzgwVar.zzf(8);
        int zzf3 = zzgwVar.zzf(8);
        int zzg5 = zzgwVar.zzg();
        if (zzf != 100 && zzf != 110 && zzf != 122 && zzf != 244 && zzf != 44 && zzf != 83 && zzf != 86 && zzf != 118 && zzf != 128) {
            if (zzf != 138) {
                zzg = 1;
                z = false;
                zzg2 = 0;
                zzg3 = 0;
                int zzg6 = zzgwVar.zzg() + 4;
                zzg4 = zzgwVar.zzg();
                if (zzg4 != 0) {
                    i4 = zzg4;
                    i5 = zzgwVar.zzg() + 4;
                } else {
                    if (zzg4 == 1) {
                        boolean zze4 = zzgwVar.zze();
                        zzgwVar.zzh();
                        zzgwVar.zzh();
                        long zzg7 = zzgwVar.zzg();
                        for (int i15 = 0; i15 < zzg7; i15++) {
                            zzgwVar.zzg();
                        }
                        z2 = zze4;
                        i4 = 1;
                        i5 = 0;
                        int zzg8 = zzgwVar.zzg();
                        zzgwVar.zza();
                        int zzg9 = zzgwVar.zzg() + 1;
                        int zzg10 = zzgwVar.zzg() + 1;
                        zze = zzgwVar.zze();
                        int i16 = 2 - (zze ? 1 : 0);
                        if (!zze) {
                            zzgwVar.zza();
                        }
                        zzgwVar.zza();
                        int i17 = zzg9 * 16;
                        int i18 = zzg10 * i16 * 16;
                        if (zzgwVar.zze()) {
                            int zzg11 = zzgwVar.zzg();
                            int zzg12 = zzgwVar.zzg();
                            int zzg13 = zzgwVar.zzg();
                            int zzg14 = zzgwVar.zzg();
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
                            if (zzgwVar.zze()) {
                                i8 = i7;
                                f = 1.0f;
                                i9 = -1;
                                i10 = -1;
                                i11 = -1;
                            } else {
                                if (zzgwVar.zze()) {
                                    int zzf4 = zzgwVar.zzf(8);
                                    if (zzf4 == 255) {
                                        int zzf5 = zzgwVar.zzf(16);
                                        int zzf6 = zzgwVar.zzf(16);
                                        if (zzf5 != 0 && zzf6 != 0) {
                                            f2 = zzf5 / zzf6;
                                            if (zzgwVar.zze()) {
                                                zzgwVar.zza();
                                            }
                                            if (zzgwVar.zze()) {
                                                zzgwVar.zzb(3);
                                                int i22 = true != zzgwVar.zze() ? 2 : 1;
                                                if (zzgwVar.zze()) {
                                                    int zzf7 = zzgwVar.zzf(8);
                                                    int zzf8 = zzgwVar.zzf(8);
                                                    zzgwVar.zzb(8);
                                                    int zzb2 = com.google.android.gms.internal.ads.zzi.zzb(zzf7);
                                                    i13 = com.google.android.gms.internal.ads.zzi.zzc(zzf8);
                                                    i12 = zzb2;
                                                    i21 = i22;
                                                    if (zzgwVar.zze()) {
                                                        zzgwVar.zzg();
                                                        zzgwVar.zzg();
                                                    }
                                                    if (zzgwVar.zze()) {
                                                        zzgwVar.zzb(65);
                                                    }
                                                    zze2 = zzgwVar.zze();
                                                    if (zze2) {
                                                        zzp(zzgwVar);
                                                    }
                                                    zze3 = zzgwVar.zze();
                                                    if (zze3) {
                                                        zzp(zzgwVar);
                                                    }
                                                    if (!zze2 || zze3) {
                                                        zzgwVar.zza();
                                                    }
                                                    zzgwVar.zza();
                                                    if (zzgwVar.zze()) {
                                                        i9 = i12;
                                                        i11 = i13;
                                                        i8 = i7;
                                                    } else {
                                                        zzgwVar.zza();
                                                        zzgwVar.zzg();
                                                        zzgwVar.zzg();
                                                        zzgwVar.zzg();
                                                        zzgwVar.zzg();
                                                        int zzg15 = zzgwVar.zzg();
                                                        zzgwVar.zzg();
                                                        i9 = i12;
                                                        i11 = i13;
                                                        i8 = zzg15;
                                                    }
                                                    i10 = i21;
                                                    f = f2;
                                                } else {
                                                    i21 = i22;
                                                }
                                            }
                                            i12 = -1;
                                            i13 = -1;
                                            if (zzgwVar.zze()) {
                                            }
                                            if (zzgwVar.zze()) {
                                            }
                                            zze2 = zzgwVar.zze();
                                            if (zze2) {
                                            }
                                            zze3 = zzgwVar.zze();
                                            if (zze3) {
                                            }
                                            if (!zze2) {
                                            }
                                            zzgwVar.zza();
                                            zzgwVar.zza();
                                            if (zzgwVar.zze()) {
                                            }
                                            i10 = i21;
                                            f = f2;
                                        }
                                    } else if (zzf4 < 17) {
                                        f2 = zzb[zzf4];
                                        if (zzgwVar.zze()) {
                                        }
                                        if (zzgwVar.zze()) {
                                        }
                                        i12 = -1;
                                        i13 = -1;
                                        if (zzgwVar.zze()) {
                                        }
                                        if (zzgwVar.zze()) {
                                        }
                                        zze2 = zzgwVar.zze();
                                        if (zze2) {
                                        }
                                        zze3 = zzgwVar.zze();
                                        if (zze3) {
                                        }
                                        if (!zze2) {
                                        }
                                        zzgwVar.zza();
                                        zzgwVar.zza();
                                        if (zzgwVar.zze()) {
                                        }
                                        i10 = i21;
                                        f = f2;
                                    } else {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzf4).length() + 35);
                                        sb.append("Unexpected aspect_ratio_idc value: ");
                                        sb.append(zzf4);
                                        com.google.android.gms.internal.ads.zzeg.zzc("NalUnitUtil", sb.toString());
                                    }
                                }
                                f2 = 1.0f;
                                if (zzgwVar.zze()) {
                                }
                                if (zzgwVar.zze()) {
                                }
                                i12 = -1;
                                i13 = -1;
                                if (zzgwVar.zze()) {
                                }
                                if (zzgwVar.zze()) {
                                }
                                zze2 = zzgwVar.zze();
                                if (zze2) {
                                }
                                zze3 = zzgwVar.zze();
                                if (zze3) {
                                }
                                if (!zze2) {
                                }
                                zzgwVar.zza();
                                zzgwVar.zza();
                                if (zzgwVar.zze()) {
                                }
                                i10 = i21;
                                f = f2;
                            }
                            return new com.google.android.gms.internal.ads.zzgo(i6, zzf2, zzf3, zzg5, zzg8, i19, i20, f, zzg2, zzg3, z, zze, zzg6, i4, i5, z2, i9, i10, i11, i8);
                        }
                        if ((zzf2 & 16) != 0) {
                            i6 = zzf;
                            i7 = 0;
                            int i212 = -1;
                            if (zzgwVar.zze()) {
                            }
                            return new com.google.android.gms.internal.ads.zzgo(i6, zzf2, zzf3, zzg5, zzg8, i19, i20, f, zzg2, zzg3, z, zze, zzg6, i4, i5, z2, i9, i10, i11, i8);
                        }
                        i6 = zzf;
                        i7 = 16;
                        int i2122 = -1;
                        if (zzgwVar.zze()) {
                        }
                        return new com.google.android.gms.internal.ads.zzgo(i6, zzf2, zzf3, zzg5, zzg8, i19, i20, f, zzg2, zzg3, z, zze, zzg6, i4, i5, z2, i9, i10, i11, i8);
                    }
                    i4 = zzg4;
                    i5 = 0;
                }
                z2 = false;
                int zzg82 = zzgwVar.zzg();
                zzgwVar.zza();
                int zzg92 = zzgwVar.zzg() + 1;
                int zzg102 = zzgwVar.zzg() + 1;
                zze = zzgwVar.zze();
                int i162 = 2 - (zze ? 1 : 0);
                if (!zze) {
                }
                zzgwVar.zza();
                int i172 = zzg92 * 16;
                int i182 = zzg102 * i162 * 16;
                if (zzgwVar.zze()) {
                }
                int i192 = i172;
                int i202 = i182;
                if (zzf != 44) {
                    if (zzf == 244) {
                    }
                    i6 = zzf;
                    i7 = 16;
                    int i21222 = -1;
                    if (zzgwVar.zze()) {
                    }
                    return new com.google.android.gms.internal.ads.zzgo(i6, zzf2, zzf3, zzg5, zzg82, i192, i202, f, zzg2, zzg3, z, zze, zzg6, i4, i5, z2, i9, i10, i11, i8);
                }
                if ((zzf2 & 16) != 0) {
                }
                i6 = zzf;
                i7 = 16;
                int i212222 = -1;
                if (zzgwVar.zze()) {
                }
                return new com.google.android.gms.internal.ads.zzgo(i6, zzf2, zzf3, zzg5, zzg82, i192, i202, f, zzg2, zzg3, z, zze, zzg6, i4, i5, z2, i9, i10, i11, i8);
            }
            zzf = 138;
        }
        zzg = zzgwVar.zzg();
        if (zzg == 3) {
            z = zzgwVar.zze();
            i3 = 3;
        } else {
            i3 = zzg;
            z = false;
        }
        zzg2 = zzgwVar.zzg();
        zzg3 = zzgwVar.zzg();
        zzgwVar.zza();
        if (zzgwVar.zze()) {
            int i23 = i3 != 3 ? 8 : 12;
            int i24 = 0;
            while (i24 < i23) {
                if (zzgwVar.zze()) {
                    int i25 = i24 < 6 ? 16 : 64;
                    int i26 = 8;
                    int i27 = 8;
                    for (int i28 = 0; i28 < i25; i28++) {
                        if (i26 != 0) {
                            i26 = ((i27 + zzgwVar.zzh()) + 256) % 256;
                        }
                        if (i26 != 0) {
                            i27 = i26;
                        }
                    }
                }
                i24++;
            }
        }
        int zzg62 = zzgwVar.zzg() + 4;
        zzg4 = zzgwVar.zzg();
        if (zzg4 != 0) {
        }
        z2 = false;
        int zzg822 = zzgwVar.zzg();
        zzgwVar.zza();
        int zzg922 = zzgwVar.zzg() + 1;
        int zzg1022 = zzgwVar.zzg() + 1;
        zze = zzgwVar.zze();
        int i1622 = 2 - (zze ? 1 : 0);
        if (!zze) {
        }
        zzgwVar.zza();
        int i1722 = zzg922 * 16;
        int i1822 = zzg1022 * i1622 * 16;
        if (zzgwVar.zze()) {
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
        if (zzgwVar.zze()) {
        }
        return new com.google.android.gms.internal.ads.zzgo(i6, zzf2, zzf3, zzg5, zzg822, i1922, i2022, f, zzg2, zzg3, z, zze, zzg62, i4, i5, z2, i9, i10, i11, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzgm zzf(byte[] bArr, int i, int i2) {
        int i3;
        int[] iArr;
        int i4;
        com.google.android.gms.internal.ads.zzgl zzglVar;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        com.google.android.gms.internal.ads.zzgd zzgdVar;
        com.google.android.gms.internal.ads.zzgwm zzgwmVar;
        int[] iArr2;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean[][] zArr;
        int i15;
        int i16;
        boolean[][] zArr2;
        int[] iArr3;
        int i17;
        int i18;
        boolean z2;
        boolean zze;
        int i19;
        int i20;
        int i21;
        int i22;
        int zzg;
        int[] iArr4;
        int i23;
        int i24;
        boolean z3;
        boolean z4;
        com.google.android.gms.internal.ads.zzgw zzgwVar = new com.google.android.gms.internal.ads.zzgw(bArr, i, i2);
        com.google.android.gms.internal.ads.zzgd zzl = zzl(zzgwVar);
        zzgwVar.zzb(4);
        boolean zze2 = zzgwVar.zze();
        boolean zze3 = zzgwVar.zze();
        int zzf = zzgwVar.zzf(6);
        int i25 = zzf + 1;
        int zzf2 = zzgwVar.zzf(3);
        zzgwVar.zzb(17);
        int i26 = 1;
        com.google.android.gms.internal.ads.zzge zzm = zzm(zzgwVar, true, zzf2, null);
        int i27 = 0;
        for (int i28 = true != zzgwVar.zze() ? zzf2 : 0; i28 <= zzf2; i28++) {
            zzgwVar.zzg();
            zzgwVar.zzg();
            zzgwVar.zzg();
        }
        int zzf3 = zzgwVar.zzf(6);
        int zzg2 = zzgwVar.zzg() + 1;
        com.google.android.gms.internal.ads.zzgf zzgfVar = new com.google.android.gms.internal.ads.zzgf(com.google.android.gms.internal.ads.zzgwm.zzj(zzm), new int[1]);
        boolean z5 = i25 >= 2 && zzg2 >= 2;
        boolean z6 = zze2 && zze3;
        int i29 = zzf3 + 1;
        if (!z5 || !z6 || i29 < i25) {
            return new com.google.android.gms.internal.ads.zzgm(zzl, null, zzgfVar, null, null);
        }
        int[][] iArr5 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, zzg2, i29);
        int[] iArr6 = new int[zzg2];
        int[] iArr7 = new int[zzg2];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        while (i26 < zzg2) {
            int i30 = 0;
            while (i27 <= zzf3) {
                if (zzgwVar.zze()) {
                    iArr5[i26][i30] = i27;
                    iArr7[i26] = i27;
                    i30++;
                }
                iArr6[i26] = i30;
                i27++;
            }
            i26++;
            i27 = 0;
        }
        if (zzgwVar.zze()) {
            zzgwVar.zzb(64);
            if (zzgwVar.zze()) {
                zzgwVar.zzg();
            }
            int zzg3 = zzgwVar.zzg();
            for (int i31 = 0; i31 < zzg3; i31++) {
                zzgwVar.zzg();
                if (i31 == 0 || zzgwVar.zze()) {
                    boolean zze4 = zzgwVar.zze();
                    boolean zze5 = zzgwVar.zze();
                    z4 = zze4;
                    z3 = zze5;
                    if (zze4 || zze5) {
                        zze = zzgwVar.zze();
                        if (zze) {
                            zzgwVar.zzb(19);
                        }
                        zzgwVar.zzb(8);
                        if (zze) {
                            zzgwVar.zzb(4);
                        }
                        zzgwVar.zzb(15);
                        i20 = zze4;
                        i19 = zze5;
                        i21 = 0;
                        while (i21 <= zzf2) {
                            if (zzgwVar.zze() || zzgwVar.zze()) {
                                zzgwVar.zzg();
                            } else if (zzgwVar.zze()) {
                                iArr4 = iArr7;
                                i22 = zzg3;
                                zzg = 0;
                                i23 = i20 + i19;
                                int[][] iArr8 = iArr5;
                                i24 = 0;
                                while (i24 < i23) {
                                    int i32 = i23;
                                    for (int i33 = 0; i33 <= zzg; i33++) {
                                        zzgwVar.zzg();
                                        zzgwVar.zzg();
                                        if (zze) {
                                            zzgwVar.zzg();
                                            zzgwVar.zzg();
                                        }
                                        zzgwVar.zza();
                                    }
                                    i24++;
                                    i23 = i32;
                                }
                                i21++;
                                iArr7 = iArr4;
                                zzg3 = i22;
                                iArr5 = iArr8;
                            }
                            i22 = zzg3;
                            zzg = zzgwVar.zzg();
                            iArr4 = iArr7;
                            i23 = i20 + i19;
                            int[][] iArr82 = iArr5;
                            i24 = 0;
                            while (i24 < i23) {
                            }
                            i21++;
                            iArr7 = iArr4;
                            zzg3 = i22;
                            iArr5 = iArr82;
                        }
                    }
                } else {
                    z4 = false;
                    z3 = false;
                }
                zze = false;
                i20 = z4;
                i19 = z3;
                i21 = 0;
                while (i21 <= zzf2) {
                }
            }
        }
        int[][] iArr9 = iArr5;
        int[] iArr10 = iArr7;
        if (!zzgwVar.zze()) {
            return new com.google.android.gms.internal.ads.zzgm(zzl, null, zzgfVar, null, null);
        }
        zzgwVar.zzc();
        com.google.android.gms.internal.ads.zzge zzm2 = zzm(zzgwVar, false, zzf2, zzm);
        boolean zze6 = zzgwVar.zze();
        boolean[] zArr3 = new boolean[16];
        int i34 = 0;
        for (int i35 = 0; i35 < 16; i35++) {
            boolean zze7 = zzgwVar.zze();
            zArr3[i35] = zze7;
            if (zze7) {
                i34++;
            }
        }
        if (i34 == 0 || !zArr3[1]) {
            return new com.google.android.gms.internal.ads.zzgm(zzl, null, zzgfVar, null, null);
        }
        int i36 = i34 + 1;
        int[] iArr11 = new int[i34];
        for (int i37 = 0; i37 < i34 - (zze6 ? 1 : 0); i37++) {
            iArr11[i37] = zzgwVar.zzf(3);
        }
        int[] iArr12 = new int[i36];
        if (zze6) {
            for (int i38 = 1; i38 < i34; i38++) {
                for (int i39 = 0; i39 < i38; i39++) {
                    iArr12[i38] = iArr12[i38] + iArr11[i39] + 1;
                }
            }
            iArr12[i34] = 6;
        }
        int[][] iArr13 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i25, i34);
        int[] iArr14 = new int[i25];
        iArr14[0] = 0;
        boolean zze8 = zzgwVar.zze();
        int i40 = 1;
        while (i40 < i25) {
            if (zze8) {
                iArr14[i40] = zzgwVar.zzf(6);
            } else {
                iArr14[i40] = i40;
            }
            if (zze6) {
                z2 = zze6 ? 1 : 0;
                for (int i41 = 0; i41 < i34; i41++) {
                    iArr13[i40][i41] = (iArr14[i40] & ((1 << iArr12[r31]) - 1)) >> iArr12[i41];
                }
            } else {
                int i42 = 0;
                while (i42 < i34) {
                    iArr13[i40][i42] = zzgwVar.zzf(iArr11[i42] + 1);
                    i42++;
                    zze6 = zze6;
                }
                z2 = zze6;
            }
            i40++;
            zze6 = z2;
        }
        int[] iArr15 = new int[i29];
        int i43 = 1;
        for (int i44 = 0; i44 < i25; i44++) {
            iArr15[iArr14[i44]] = -1;
            int i45 = 0;
            int i46 = 0;
            while (i45 < 16) {
                if (zArr3[i45]) {
                    i17 = 1;
                    if (i45 == 1) {
                        iArr15[iArr14[i44]] = iArr13[i44][i46];
                        i18 = 1;
                    } else {
                        i18 = i45;
                    }
                    i46++;
                    i45 = i18;
                } else {
                    i17 = 1;
                }
                i45 += i17;
            }
            if (i44 > 0) {
                int i47 = 0;
                while (true) {
                    if (i47 >= i44) {
                        i43++;
                        break;
                    }
                    if (iArr15[iArr14[i44]] == iArr15[iArr14[i47]]) {
                        break;
                    }
                    i47++;
                }
            }
        }
        int zzf4 = zzgwVar.zzf(4);
        if (i43 < 2 || zzf4 == 0) {
            return new com.google.android.gms.internal.ads.zzgm(zzl, null, zzgfVar, null, null);
        }
        int[] iArr16 = new int[i43];
        for (int i48 = 0; i48 < i43; i48++) {
            iArr16[i48] = zzgwVar.zzf(zzf4);
        }
        int[] iArr17 = new int[i29];
        for (int i49 = 0; i49 < i25; i49++) {
            iArr17[java.lang.Math.min(iArr14[i49], zzf3)] = i49;
        }
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        int i50 = 0;
        while (i50 <= zzf3) {
            int[] iArr18 = iArr15;
            int min = java.lang.Math.min(iArr15[i50], i43 - 1);
            zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzgc(iArr17[i50], min >= 0 ? iArr16[min] : -1));
            i50++;
            iArr15 = iArr18;
        }
        com.google.android.gms.internal.ads.zzgwm zzi = zzgwjVar.zzi();
        if (((com.google.android.gms.internal.ads.zzgc) zzi.get(0)).zzb == -1) {
            return new com.google.android.gms.internal.ads.zzgm(zzl, null, zzgfVar, null, null);
        }
        int i51 = 1;
        while (true) {
            if (i51 > zzf3) {
                i3 = -1;
                i51 = -1;
                break;
            }
            i3 = -1;
            if (((com.google.android.gms.internal.ads.zzgc) zzi.get(i51)).zzb != -1) {
                break;
            }
            i51++;
        }
        if (i51 == i3) {
            return new com.google.android.gms.internal.ads.zzgm(zzl, null, zzgfVar, null, null);
        }
        boolean[][] zArr4 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, i25, i25);
        boolean[][] zArr5 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, i25, i25);
        for (int i52 = 1; i52 < i25; i52++) {
            for (int i53 = 0; i53 < i52; i53++) {
                boolean[] zArr6 = zArr4[i52];
                boolean[] zArr7 = zArr5[i52];
                boolean zze9 = zzgwVar.zze();
                zArr7[i53] = zze9;
                zArr6[i53] = zze9;
            }
        }
        for (int i54 = 1; i54 < i25; i54++) {
            for (int i55 = 0; i55 < zzf; i55++) {
                int i56 = 0;
                while (true) {
                    if (i56 < i54) {
                        boolean[] zArr8 = zArr5[i54];
                        if (zArr8[i56] && zArr5[i56][i55]) {
                            zArr8[i55] = true;
                            break;
                        }
                        i56++;
                    }
                }
            }
        }
        int[] iArr19 = new int[i29];
        for (int i57 = 0; i57 < i25; i57++) {
            int i58 = 0;
            for (int i59 = 0; i59 < i57; i59++) {
                i58 += zArr4[i57][i59] ? 1 : 0;
            }
            iArr19[iArr14[i57]] = i58;
        }
        int i60 = 0;
        for (int i61 = 0; i61 < i25; i61++) {
            if (iArr19[iArr14[i61]] == 0) {
                i60++;
            }
        }
        if (i60 > 1) {
            return new com.google.android.gms.internal.ads.zzgm(zzl, null, zzgfVar, null, null);
        }
        int[] iArr20 = new int[i25];
        int i62 = zzg2;
        int[] iArr21 = new int[i62];
        if (zzgwVar.zze()) {
            int i63 = 0;
            while (i63 < i25) {
                iArr20[i63] = zzgwVar.zzf(3);
                i63++;
                iArr14 = iArr14;
            }
            iArr = iArr14;
            i4 = zzf2;
        } else {
            iArr = iArr14;
            i4 = zzf2;
            java.util.Arrays.fill(iArr20, 0, i25, i4);
        }
        int i64 = 0;
        while (i64 < i62) {
            int i65 = i51;
            boolean[][] zArr9 = zArr5;
            int[] iArr22 = iArr19;
            int i66 = 0;
            for (int i67 = 0; i67 < iArr6[i64]; i67++) {
                i66 = java.lang.Math.max(i66, iArr20[((com.google.android.gms.internal.ads.zzgc) zzi.get(iArr9[i64][i67])).zza]);
            }
            iArr21[i64] = i66 + 1;
            i64++;
            zArr5 = zArr9;
            iArr19 = iArr22;
            i51 = i65;
        }
        int i68 = i51;
        boolean[][] zArr10 = zArr5;
        int[] iArr23 = iArr19;
        if (zzgwVar.zze()) {
            int i69 = 0;
            while (i69 < zzf) {
                int i70 = i69 + 1;
                for (int i71 = i70; i71 < i25; i71++) {
                    if (zArr4[i71][i69]) {
                        zzgwVar.zzb(3);
                    }
                }
                i69 = i70;
            }
        }
        zzgwVar.zza();
        int zzg4 = zzgwVar.zzg() + 1;
        com.google.android.gms.internal.ads.zzgwj zzgwjVar2 = new com.google.android.gms.internal.ads.zzgwj();
        zzgwjVar2.zzf(zzm);
        if (zzg4 > 1) {
            com.google.android.gms.internal.ads.zzge zzgeVar = zzm2;
            zzgwjVar2.zzf(zzgeVar);
            for (int i72 = 2; i72 < zzg4; i72++) {
                zzgeVar = zzm(zzgwVar, zzgwVar.zze(), i4, zzgeVar);
                zzgwjVar2.zzf(zzgeVar);
            }
        }
        com.google.android.gms.internal.ads.zzgwm zzi2 = zzgwjVar2.zzi();
        int zzg5 = zzgwVar.zzg() + i62;
        if (zzg5 > i62) {
            return new com.google.android.gms.internal.ads.zzgm(zzl, null, zzgfVar, null, null);
        }
        int zzf5 = zzgwVar.zzf(2);
        boolean[][] zArr11 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, zzg5, i29);
        int[] iArr24 = new int[zzg5];
        int[] iArr25 = new int[zzg5];
        int i73 = 0;
        while (i73 < i62) {
            int i74 = i62;
            iArr24[i73] = 0;
            int i75 = iArr10[i73];
            iArr25[i73] = i75;
            if (zzf5 == 0) {
                zArr2 = zArr4;
                i16 = i25;
                iArr3 = iArr21;
                java.util.Arrays.fill(zArr11[i73], 0, iArr6[i73], true);
                iArr24[i73] = iArr6[i73];
            } else {
                i16 = i25;
                zArr2 = zArr4;
                iArr3 = iArr21;
                if (zzf5 == 1) {
                    for (int i76 = 0; i76 < iArr6[i73]; i76++) {
                        zArr11[i73][i76] = iArr9[i73][i76] == i75;
                    }
                    iArr24[i73] = 1;
                } else {
                    zArr11[0][0] = true;
                    iArr24[0] = 1;
                }
            }
            i73++;
            i62 = i74;
            zArr4 = zArr2;
            iArr21 = iArr3;
            i25 = i16;
        }
        int i77 = i25;
        boolean[][] zArr12 = zArr4;
        int[] iArr26 = iArr21;
        int i78 = i62;
        int[] iArr27 = new int[i29];
        boolean[][] zArr13 = (boolean[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Boolean.TYPE, zzg5, i29);
        int i79 = 0;
        int i80 = 1;
        while (i80 < zzg5) {
            if (zzf5 == 2) {
                for (int i81 = 0; i81 < iArr6[i80]; i81++) {
                    zArr11[i80][i81] = zzgwVar.zze();
                    int i82 = iArr24[i80];
                    boolean z7 = zArr11[i80][i81];
                    iArr24[i80] = i82 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr25[i80] = iArr9[i80][i81];
                    }
                }
            }
            if (i79 == 0) {
                if (iArr9[i80][0] == 0 && zArr11[i80][0]) {
                    i79 = 0;
                    int i83 = 1;
                    while (i83 < iArr6[i80]) {
                        int i84 = zzf5;
                        int i85 = i68;
                        if (iArr9[i80][i83] == i85 && zArr11[i80][i85]) {
                            i79 = i80;
                        }
                        i83++;
                        i68 = i85;
                        zzf5 = i84;
                    }
                } else {
                    i11 = zzf5;
                    i12 = i68;
                    i79 = 0;
                    i13 = 0;
                    while (i13 < iArr6[i80]) {
                        if (zzg4 > 1) {
                            zArr13[i80][i13] = zArr11[i80][i13];
                            boolean[][] zArr14 = zArr11;
                            i15 = i12;
                            i14 = zzg4;
                            int zzc2 = com.google.android.gms.internal.ads.zzgzw.zzc(zzg4, java.math.RoundingMode.CEILING);
                            if (!zArr13[i80][i13]) {
                                int i86 = ((com.google.android.gms.internal.ads.zzgc) zzi.get(iArr9[i80][i13])).zza;
                                int i87 = 0;
                                while (i87 < i13) {
                                    zArr = zArr14;
                                    if (zArr10[i86][((com.google.android.gms.internal.ads.zzgc) zzi.get(iArr9[i80][i87])).zza]) {
                                        zArr13[i80][i13] = true;
                                        break;
                                    }
                                    i87++;
                                    zArr14 = zArr;
                                }
                            }
                            zArr = zArr14;
                            if (zArr13[i80][i13]) {
                                if (i79 <= 0 || i80 != i79) {
                                    zzgwVar.zzb(zzc2);
                                } else {
                                    iArr27[i13] = zzgwVar.zzf(zzc2);
                                }
                            }
                        } else {
                            i14 = zzg4;
                            zArr = zArr11;
                            i15 = i12;
                        }
                        i13++;
                        i12 = i15;
                        zzg4 = i14;
                        zArr11 = zArr;
                    }
                    int i88 = zzg4;
                    boolean[][] zArr15 = zArr11;
                    i68 = i12;
                    if (iArr24[i80] == 1 && iArr23[iArr25[i80]] > 0) {
                        zzgwVar.zza();
                    }
                    i80++;
                    zzf5 = i11;
                    zzg4 = i88;
                    zArr11 = zArr15;
                }
            }
            i11 = zzf5;
            i12 = i68;
            i13 = 0;
            while (i13 < iArr6[i80]) {
            }
            int i882 = zzg4;
            boolean[][] zArr152 = zArr11;
            i68 = i12;
            if (iArr24[i80] == 1) {
                zzgwVar.zza();
            }
            i80++;
            zzf5 = i11;
            zzg4 = i882;
            zArr11 = zArr152;
        }
        if (i79 == 0) {
            return new com.google.android.gms.internal.ads.zzgm(zzl, null, zzgfVar, null, null);
        }
        int zzg6 = zzgwVar.zzg();
        int i89 = zzg6 + 1;
        com.google.android.gms.internal.ads.zzgwj zzv = com.google.android.gms.internal.ads.zzgwm.zzv(i89);
        int[] iArr28 = new int[i77];
        int i90 = 0;
        while (i90 < i89) {
            int zzf6 = zzgwVar.zzf(16);
            int zzf7 = zzgwVar.zzf(16);
            if (zzgwVar.zze()) {
                i8 = zzgwVar.zzf(2);
                if (i8 == 3) {
                    zzgwVar.zza();
                }
                i9 = zzgwVar.zzf(4);
                i10 = zzgwVar.zzf(4);
            } else {
                i8 = 0;
                i9 = 0;
                i10 = 0;
            }
            if (zzgwVar.zze()) {
                int zzg7 = zzgwVar.zzg();
                zzgwmVar = zzi;
                int zzg8 = zzgwVar.zzg();
                zzgdVar = zzl;
                int zzg9 = zzgwVar.zzg();
                iArr2 = iArr27;
                int zzg10 = zzgwVar.zzg();
                zzf6 = zzn(zzf6, i8, zzg7, zzg8);
                zzf7 = zzo(zzf7, i8, zzg9, zzg10);
            } else {
                zzgdVar = zzl;
                zzgwmVar = zzi;
                iArr2 = iArr27;
            }
            zzv.zzf(new com.google.android.gms.internal.ads.zzgg(i8, i9, i10, zzf6, zzf7));
            i90++;
            zzi = zzgwmVar;
            zzl = zzgdVar;
            iArr27 = iArr2;
        }
        com.google.android.gms.internal.ads.zzgd zzgdVar2 = zzl;
        com.google.android.gms.internal.ads.zzgwm zzgwmVar2 = zzi;
        int[] iArr29 = iArr27;
        if (i89 <= 1 || !zzgwVar.zze()) {
            for (int i91 = 1; i91 < i77; i91++) {
                iArr28[i91] = java.lang.Math.min(i91, zzg6);
            }
        } else {
            int zzc3 = com.google.android.gms.internal.ads.zzgzw.zzc(i89, java.math.RoundingMode.CEILING);
            for (int i92 = 1; i92 < i77; i92++) {
                iArr28[i92] = zzgwVar.zzf(zzc3);
            }
        }
        com.google.android.gms.internal.ads.zzgh zzghVar = new com.google.android.gms.internal.ads.zzgh(zzv.zzi(), iArr28);
        zzgwVar.zzb(2);
        for (int i93 = 1; i93 < i77; i93++) {
            if (iArr23[iArr[i93]] == 0) {
                zzgwVar.zza();
            }
        }
        for (int i94 = 1; i94 < zzg5; i94++) {
            boolean zze10 = zzgwVar.zze();
            while (i6 < iArr26[i94]) {
                if (i6 <= 0 || !zze10) {
                    i6 = i6 != 0 ? i6 + 1 : 0;
                    for (i7 = 0; i7 < iArr6[i94]; i7++) {
                        if (zArr13[i94][i7]) {
                            zzgwVar.zzg();
                        }
                    }
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                } else {
                    if (!zzgwVar.zze()) {
                    }
                    while (i7 < iArr6[i94]) {
                    }
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                }
            }
        }
        int zzg11 = zzgwVar.zzg() + 2;
        if (zzgwVar.zze()) {
            zzgwVar.zzb(zzg11);
        } else {
            for (int i95 = 1; i95 < i77; i95++) {
                for (int i96 = 0; i96 < i95; i96++) {
                    if (zArr12[i95][i96]) {
                        zzgwVar.zzb(zzg11);
                    }
                }
            }
        }
        int zzg12 = zzgwVar.zzg();
        for (int i97 = 1; i97 <= zzg12; i97++) {
            zzgwVar.zzb(8);
        }
        if (zzgwVar.zze()) {
            zzgwVar.zzc();
            if (zzgwVar.zze() || zzgwVar.zze()) {
                zzgwVar.zza();
            }
            boolean zze11 = zzgwVar.zze();
            boolean zze12 = zzgwVar.zze();
            if (zze11 || zze12) {
                for (int i98 = 0; i98 < i78; i98++) {
                    for (int i99 = 0; i99 < iArr26[i98]; i99++) {
                        boolean zze13 = zze11 ? zzgwVar.zze() : false;
                        boolean zze14 = zze12 ? zzgwVar.zze() : false;
                        if (zze13) {
                            zzgwVar.zzb(32);
                        }
                        if (zze14) {
                            zzgwVar.zzb(18);
                        }
                    }
                }
            }
            boolean zze15 = zzgwVar.zze();
            if (zze15) {
                z = true;
                i5 = zzgwVar.zzf(4) + 1;
            } else {
                z = true;
                i5 = i77;
            }
            com.google.android.gms.internal.ads.zzgwj zzv2 = com.google.android.gms.internal.ads.zzgwm.zzv(i5);
            int[] iArr30 = new int[i77];
            int i100 = 0;
            while (i100 < i5) {
                zzgwVar.zzb(3);
                int i101 = z != zzgwVar.zze() ? 2 : 1;
                int zzb2 = com.google.android.gms.internal.ads.zzi.zzb(zzgwVar.zzf(8));
                int zzc4 = com.google.android.gms.internal.ads.zzi.zzc(zzgwVar.zzf(8));
                zzgwVar.zzb(8);
                zzv2.zzf(new com.google.android.gms.internal.ads.zzgk(zzb2, i101, zzc4));
                i100++;
                z = true;
            }
            if (zze15 && i5 > 1) {
                for (int i102 = 0; i102 < i77; i102++) {
                    iArr30[i102] = zzgwVar.zzf(4);
                }
            }
            zzglVar = new com.google.android.gms.internal.ads.zzgl(zzv2.zzi(), iArr30);
        } else {
            zzglVar = null;
        }
        return new com.google.android.gms.internal.ads.zzgm(zzgdVar2, zzgwmVar2, new com.google.android.gms.internal.ads.zzgf(zzi2, iArr29), zzghVar, zzglVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.ads.zzgj zzg(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzgm zzgmVar) {
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
        int i16;
        int i17;
        float f;
        int i18;
        int i19;
        int i20;
        com.google.android.gms.internal.ads.zzgl zzglVar;
        int i21;
        int i22;
        int i23;
        int i24;
        com.google.android.gms.internal.ads.zzgd zzgdVar;
        int i25;
        com.google.android.gms.internal.ads.zzge zzgeVar;
        int i26;
        int i27;
        int i28;
        int i29;
        com.google.android.gms.internal.ads.zzgh zzghVar;
        com.google.android.gms.internal.ads.zzgd zzl = zzl(new com.google.android.gms.internal.ads.zzgw(bArr, i, i2));
        com.google.android.gms.internal.ads.zzgw zzgwVar = new com.google.android.gms.internal.ads.zzgw(bArr, i + 2, i2);
        zzgwVar.zzb(4);
        int zzf = zzgwVar.zzf(3);
        int i30 = zzl.zzb;
        if (i30 == 0 || zzf != 7) {
            z = false;
        } else {
            zzf = 7;
            z = true;
        }
        if (zzgmVar != null) {
            com.google.android.gms.internal.ads.zzgwm zzgwmVar = zzgmVar.zza;
            if (!zzgwmVar.isEmpty()) {
                i3 = ((com.google.android.gms.internal.ads.zzgc) zzgwmVar.get(java.lang.Math.min(i30, zzgwmVar.size() - 1))).zza;
                com.google.android.gms.internal.ads.zzge zzgeVar2 = null;
                if (z) {
                    zzgwVar.zza();
                    zzgeVar2 = zzm(zzgwVar, true, zzf, null);
                } else if (zzgmVar != null) {
                    com.google.android.gms.internal.ads.zzgf zzgfVar = zzgmVar.zzb;
                    int i31 = zzgfVar.zzb[i3];
                    com.google.android.gms.internal.ads.zzgwm zzgwmVar2 = zzgfVar.zza;
                    if (zzgwmVar2.size() > i31) {
                        zzgeVar2 = (com.google.android.gms.internal.ads.zzge) zzgwmVar2.get(i31);
                    }
                }
                int zzg4 = zzgwVar.zzg();
                if (z) {
                    int zzg5 = zzgwVar.zzg();
                    if (zzg5 == 3) {
                        zzgwVar.zza();
                        i4 = 3;
                    } else {
                        i4 = zzg5;
                    }
                    int zzg6 = zzgwVar.zzg();
                    int zzg7 = zzgwVar.zzg();
                    if (zzgwVar.zze()) {
                        int zzg8 = zzgwVar.zzg();
                        int zzg9 = zzgwVar.zzg();
                        int zzg10 = zzgwVar.zzg();
                        int zzg11 = zzgwVar.zzg();
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
                    zzg = zzgwVar.zzg();
                    zzg2 = zzgwVar.zzg();
                    i11 = zzg5;
                } else {
                    int zzf2 = zzgwVar.zze() ? zzgwVar.zzf(8) : -1;
                    if (zzgmVar != null && (zzghVar = zzgmVar.zzc) != null) {
                        if (zzf2 == -1) {
                            zzf2 = zzghVar.zzb[i3];
                        }
                        if (zzf2 != -1) {
                            com.google.android.gms.internal.ads.zzgwm zzgwmVar3 = zzghVar.zza;
                            if (zzgwmVar3.size() > zzf2) {
                                com.google.android.gms.internal.ads.zzgg zzggVar = (com.google.android.gms.internal.ads.zzgg) zzgwmVar3.get(zzf2);
                                int i32 = zzggVar.zza;
                                i7 = zzggVar.zzd;
                                i10 = zzggVar.zze;
                                zzg = zzggVar.zzb;
                                i9 = i10;
                                i8 = i7;
                                zzg2 = zzggVar.zzc;
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
                int zzg12 = zzgwVar.zzg();
                if (z) {
                    i12 = i8;
                    int i33 = true != zzgwVar.zze() ? zzf : 0;
                    int i34 = -1;
                    while (i33 <= zzf) {
                        zzgwVar.zzg();
                        i34 = java.lang.Math.max(zzgwVar.zzg(), i34);
                        zzgwVar.zzg();
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
                zzgwVar.zzg();
                zzgwVar.zzg();
                zzgwVar.zzg();
                zzgwVar.zzg();
                zzgwVar.zzg();
                zzgwVar.zzg();
                if (zzgwVar.zze()) {
                    int i35 = 6;
                    if (z && zzgwVar.zze()) {
                        zzgwVar.zzb(6);
                    } else if (zzgwVar.zze()) {
                        int i36 = 0;
                        while (i36 < 4) {
                            int i37 = 0;
                            while (i37 < i35) {
                                if (zzgwVar.zze()) {
                                    i27 = i14;
                                    i28 = zzg4;
                                    int min = java.lang.Math.min(64, 1 << ((i36 + i36) + 4));
                                    if (i36 > 1) {
                                        zzgwVar.zzh();
                                    }
                                    for (int i38 = 0; i38 < min; i38++) {
                                        zzgwVar.zzh();
                                    }
                                    i29 = 3;
                                } else {
                                    zzgwVar.zzg();
                                    i27 = i14;
                                    i28 = zzg4;
                                    i29 = 3;
                                }
                                i37 += i36 == i29 ? 3 : 1;
                                zzg4 = i28;
                                i14 = i27;
                                i35 = 6;
                            }
                            i36++;
                            i35 = 6;
                        }
                    }
                }
                int i39 = i14;
                int i40 = zzg4;
                zzgwVar.zzb(2);
                if (zzgwVar.zze()) {
                    zzgwVar.zzb(8);
                    zzgwVar.zzg();
                    zzgwVar.zzg();
                    zzgwVar.zza();
                }
                zzg3 = zzgwVar.zzg();
                int[] iArr = new int[0];
                int[] iArr2 = new int[0];
                int i41 = zzg2;
                int i42 = -1;
                int i43 = -1;
                i15 = 0;
                while (i15 < zzg3) {
                    if (i15 == 0 || !zzgwVar.zze()) {
                        i22 = zzg;
                        i23 = zzg3;
                        i24 = zzf;
                        zzgdVar = zzl;
                        i25 = i11;
                        zzgeVar = zzgeVar2;
                        int zzg13 = zzgwVar.zzg();
                        int zzg14 = zzgwVar.zzg();
                        int[] iArr3 = new int[zzg13];
                        int i44 = 0;
                        while (i44 < zzg13) {
                            iArr3[i44] = (i44 > 0 ? iArr3[i44 - 1] : 0) - (zzgwVar.zzg() + 1);
                            zzgwVar.zza();
                            i44++;
                        }
                        int[] iArr4 = new int[zzg14];
                        int i45 = 0;
                        while (i45 < zzg14) {
                            iArr4[i45] = (i45 > 0 ? iArr4[i45 - 1] : 0) + zzgwVar.zzg() + 1;
                            zzgwVar.zza();
                            i45++;
                        }
                        i42 = zzg13;
                        i43 = zzg14;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    } else {
                        i23 = zzg3;
                        int i46 = i42 + i43;
                        boolean zze = zzgwVar.zze();
                        boolean z2 = true;
                        int zzg15 = zzgwVar.zzg() + 1;
                        int i47 = 1 - ((zze ? 1 : 0) + (zze ? 1 : 0));
                        i22 = zzg;
                        int i48 = i46 + 1;
                        i25 = i11;
                        boolean[] zArr = new boolean[i48];
                        zzgeVar = zzgeVar2;
                        int i49 = 0;
                        while (i49 <= i46) {
                            if (zzgwVar.zze()) {
                                zArr[i49] = z2;
                            } else {
                                zArr[i49] = zzgwVar.zze();
                            }
                            i49++;
                            z2 = true;
                        }
                        int i50 = i43 - 1;
                        int[] iArr5 = new int[i48];
                        int[] iArr6 = new int[i48];
                        int i51 = 0;
                        while (true) {
                            i26 = i47 * zzg15;
                            if (i50 < 0) {
                                break;
                            }
                            int i52 = iArr2[i50] + i26;
                            if (i52 < 0 && zArr[i42 + i50]) {
                                iArr5[i51] = i52;
                                i51++;
                            }
                            i50--;
                        }
                        if (i26 < 0 && zArr[i46]) {
                            iArr5[i51] = i26;
                            i51++;
                        }
                        i24 = zzf;
                        zzgdVar = zzl;
                        int i53 = i51;
                        for (int i54 = 0; i54 < i42; i54++) {
                            int i55 = iArr[i54] + i26;
                            if (i55 < 0 && zArr[i54]) {
                                iArr5[i53] = i55;
                                i53++;
                            }
                        }
                        int[] copyOf = java.util.Arrays.copyOf(iArr5, i53);
                        int i56 = 0;
                        for (int i57 = i42 - 1; i57 >= 0; i57--) {
                            int i58 = iArr[i57] + i26;
                            if (i58 > 0 && zArr[i57]) {
                                iArr6[i56] = i58;
                                i56++;
                            }
                        }
                        if (i26 > 0 && zArr[i46]) {
                            iArr6[i56] = i26;
                            i56++;
                        }
                        int i59 = i56;
                        for (int i60 = 0; i60 < i43; i60++) {
                            int i61 = iArr2[i60] + i26;
                            if (i61 > 0 && zArr[i42 + i60]) {
                                iArr6[i59] = i61;
                                i59++;
                            }
                        }
                        iArr2 = java.util.Arrays.copyOf(iArr6, i59);
                        i43 = i59;
                        i42 = i53;
                        iArr = copyOf;
                    }
                    i15++;
                    zzg3 = i23;
                    zzf = i24;
                    zzl = zzgdVar;
                    zzg = i22;
                    i11 = i25;
                    zzgeVar2 = zzgeVar;
                }
                int i62 = zzg;
                int i63 = zzf;
                com.google.android.gms.internal.ads.zzgd zzgdVar2 = zzl;
                int i64 = i11;
                com.google.android.gms.internal.ads.zzge zzgeVar3 = zzgeVar2;
                if (zzgwVar.zze()) {
                    int zzg16 = zzgwVar.zzg();
                    for (int i65 = 0; i65 < zzg16; i65++) {
                        zzgwVar.zzb(zzg12 + 5);
                    }
                }
                zzgwVar.zzb(2);
                float f2 = 1.0f;
                if (zzgwVar.zze()) {
                    i16 = -1;
                    i17 = -1;
                    f = 1.0f;
                    i18 = -1;
                } else {
                    if (zzgwVar.zze()) {
                        int zzf3 = zzgwVar.zzf(8);
                        if (zzf3 == 255) {
                            int zzf4 = zzgwVar.zzf(16);
                            int zzf5 = zzgwVar.zzf(16);
                            if (zzf4 != 0 && zzf5 != 0) {
                                f2 = zzf4 / zzf5;
                            }
                        } else if (zzf3 < 17) {
                            f2 = zzb[zzf3];
                        } else {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzf3).length() + 35);
                            sb.append("Unexpected aspect_ratio_idc value: ");
                            sb.append(zzf3);
                            com.google.android.gms.internal.ads.zzeg.zzc("NalUnitUtil", sb.toString());
                        }
                    }
                    if (zzgwVar.zze()) {
                        zzgwVar.zza();
                    }
                    if (zzgwVar.zze()) {
                        zzgwVar.zzb(3);
                        i20 = true != zzgwVar.zze() ? 2 : 1;
                        if (zzgwVar.zze()) {
                            int zzf6 = zzgwVar.zzf(8);
                            int zzf7 = zzgwVar.zzf(8);
                            zzgwVar.zzb(8);
                            i21 = com.google.android.gms.internal.ads.zzi.zzb(zzf6);
                            i19 = com.google.android.gms.internal.ads.zzi.zzc(zzf7);
                            if (zzgwVar.zze()) {
                                zzgwVar.zzg();
                                zzgwVar.zzg();
                            }
                            zzgwVar.zza();
                            if (zzgwVar.zze()) {
                                i10 += i10;
                            }
                            i17 = i19;
                            f = f2;
                            i16 = i20;
                            i18 = i21;
                        } else {
                            i19 = -1;
                            i21 = -1;
                            if (zzgwVar.zze()) {
                            }
                            zzgwVar.zza();
                            if (zzgwVar.zze()) {
                            }
                            i17 = i19;
                            f = f2;
                            i16 = i20;
                            i18 = i21;
                        }
                    } else {
                        if (zzgmVar != null && (zzglVar = zzgmVar.zzd) != null) {
                            int i66 = zzglVar.zzb[i3];
                            com.google.android.gms.internal.ads.zzgwm zzgwmVar4 = zzglVar.zza;
                            if (zzgwmVar4.size() > i66) {
                                com.google.android.gms.internal.ads.zzgk zzgkVar = (com.google.android.gms.internal.ads.zzgk) zzgwmVar4.get(i66);
                                i21 = zzgkVar.zza;
                                int i67 = zzgkVar.zzb;
                                i19 = zzgkVar.zzc;
                                i20 = i67;
                                if (zzgwVar.zze()) {
                                }
                                zzgwVar.zza();
                                if (zzgwVar.zze()) {
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
                        if (zzgwVar.zze()) {
                        }
                        zzgwVar.zza();
                        if (zzgwVar.zze()) {
                        }
                        i17 = i19;
                        f = f2;
                        i16 = i20;
                        i18 = i21;
                    }
                }
                return new com.google.android.gms.internal.ads.zzgj(zzgdVar2, i63, zzgeVar3, i64, i62, i41, i40, i13, i10, i12, i9, f, i39, i18, i16, i17);
            }
        }
        i3 = 0;
        com.google.android.gms.internal.ads.zzge zzgeVar22 = null;
        if (z) {
        }
        int zzg42 = zzgwVar.zzg();
        if (z) {
        }
        int zzg122 = zzgwVar.zzg();
        if (z) {
        }
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        zzgwVar.zzg();
        if (zzgwVar.zze()) {
        }
        int i392 = i14;
        int i402 = zzg42;
        zzgwVar.zzb(2);
        if (zzgwVar.zze()) {
        }
        zzg3 = zzgwVar.zzg();
        int[] iArr7 = new int[0];
        int[] iArr22 = new int[0];
        int i412 = zzg2;
        int i422 = -1;
        int i432 = -1;
        i15 = 0;
        while (i15 < zzg3) {
        }
        int i622 = zzg;
        int i632 = zzf;
        com.google.android.gms.internal.ads.zzgd zzgdVar22 = zzl;
        int i642 = i11;
        com.google.android.gms.internal.ads.zzge zzgeVar32 = zzgeVar22;
        if (zzgwVar.zze()) {
        }
        zzgwVar.zzb(2);
        float f22 = 1.0f;
        if (zzgwVar.zze()) {
        }
        return new com.google.android.gms.internal.ads.zzgj(zzgdVar22, i632, zzgeVar32, i642, i622, i412, i402, i13, i10, i12, i9, f, i392, i18, i16, i17);
    }

    public static com.google.android.gms.internal.ads.zzgn zzh(byte[] bArr, int i, int i2) {
        com.google.android.gms.internal.ads.zzgw zzgwVar = new com.google.android.gms.internal.ads.zzgw(bArr, 4, i2);
        int zzg = zzgwVar.zzg();
        int zzg2 = zzgwVar.zzg();
        zzgwVar.zza();
        return new com.google.android.gms.internal.ads.zzgn(zzg, zzg2, zzgwVar.zze());
    }

    public static int zzi(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        com.google.android.gms.internal.ads.zzgtj.zzi(i3 >= 0);
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

    public static java.lang.String zzk(java.util.List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i2 = com.google.android.gms.internal.ads.zzgwm.zzd;
                com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
                int i3 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i3 >= length2) {
                        break;
                    }
                    int zzi = zzi(bArr, i3, length2, zArr);
                    if (zzi != length2) {
                        zzgwjVar.zzf(java.lang.Integer.valueOf(zzi));
                    }
                    i3 = zzi + 3;
                }
                com.google.android.gms.internal.ads.zzgwm zzi2 = zzgwjVar.zzi();
                for (int i4 = 0; i4 < zzi2.size(); i4++) {
                    if (((java.lang.Integer) zzi2.get(i4)).intValue() + 3 < length) {
                        com.google.android.gms.internal.ads.zzgw zzgwVar = new com.google.android.gms.internal.ads.zzgw(bArr, ((java.lang.Integer) zzi2.get(i4)).intValue() + 3, length);
                        com.google.android.gms.internal.ads.zzgd zzl = zzl(zzgwVar);
                        if (zzl.zza == 33 && zzl.zzb == 0) {
                            zzgwVar.zzb(4);
                            int zzf = zzgwVar.zzf(3);
                            zzgwVar.zza();
                            com.google.android.gms.internal.ads.zzge zzm = zzm(zzgwVar, true, zzf, null);
                            return com.google.android.gms.internal.ads.zzdq.zzc(zzm.zza, zzm.zzb, zzm.zzc, zzm.zzd, zzm.zze, zzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static com.google.android.gms.internal.ads.zzgd zzl(com.google.android.gms.internal.ads.zzgw zzgwVar) {
        zzgwVar.zza();
        return new com.google.android.gms.internal.ads.zzgd(zzgwVar.zzf(6), zzgwVar.zzf(6), zzgwVar.zzf(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.gms.internal.ads.zzge zzm(com.google.android.gms.internal.ads.zzgw zzgwVar, boolean z, int i, com.google.android.gms.internal.ads.zzge zzgeVar) {
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
            int zzf = zzgwVar.zzf(2);
            z3 = zzgwVar.zze();
            i5 = zzgwVar.zzf(5);
            i6 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (zzgwVar.zze()) {
                    i6 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = zzgwVar.zzf(8);
            }
            i2 = zzf;
        } else {
            if (zzgeVar == null) {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
                int zzf2 = zzgwVar.zzf(8);
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    if (zzgwVar.zze()) {
                        i9 += 88;
                    }
                    if (zzgwVar.zze()) {
                        i9 += 8;
                    }
                }
                zzgwVar.zzb(i9);
                if (i > 0) {
                    int i11 = 8 - i;
                    zzgwVar.zzb(i11 + i11);
                }
                return new com.google.android.gms.internal.ads.zzge(i2, z2, i3, i4, iArr, zzf2);
            }
            int i12 = zzgeVar.zza;
            z3 = zzgeVar.zzb;
            i5 = zzgeVar.zzc;
            i6 = zzgeVar.zzd;
            iArr2 = zzgeVar.zze;
            i2 = i12;
        }
        iArr = iArr2;
        z2 = z3;
        i3 = i5;
        i4 = i6;
        int zzf22 = zzgwVar.zzf(8);
        int i92 = 0;
        while (i10 < i) {
        }
        zzgwVar.zzb(i92);
        if (i > 0) {
        }
        return new com.google.android.gms.internal.ads.zzge(i2, z2, i3, i4, iArr, zzf22);
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

    private static void zzp(com.google.android.gms.internal.ads.zzgw zzgwVar) {
        int zzg = zzgwVar.zzg() + 1;
        zzgwVar.zzb(8);
        for (int i = 0; i < zzg; i++) {
            zzgwVar.zzg();
            zzgwVar.zzg();
            zzgwVar.zza();
        }
        zzgwVar.zzb(20);
    }

    private static java.lang.String zzq(com.google.android.gms.internal.ads.zzv zzvVar) {
        java.lang.String str;
        java.lang.String str2 = zzvVar.zzp;
        if (java.util.Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.zzk) != null) {
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
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = java.util.Arrays.copyOf(iArr, length + length);
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
                java.lang.System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            java.lang.System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }
}

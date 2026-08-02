package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzahw {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        int i7 = zzen.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i7) {
        return (i7 >> 24) & 255;
    }

    public static zzav zzb(zzeq zzeqVar) {
        zzep zzepVar;
        zzer zzb2 = zzeqVar.zzb(1751411826);
        zzer zzb3 = zzeqVar.zzb(1801812339);
        zzer zzb4 = zzeqVar.zzb(1768715124);
        if (zzb2 != null && zzb3 != null && zzb4 != null && zzi(zzb2.zza) == 1835299937) {
            zzed zzedVar = zzb3.zza;
            zzedVar.zzL(12);
            int zzg = zzedVar.zzg();
            String[] strArr = new String[zzg];
            for (int i7 = 0; i7 < zzg; i7++) {
                int zzg2 = zzedVar.zzg();
                zzedVar.zzM(4);
                strArr[i7] = zzedVar.zzB(zzg2 - 8, StandardCharsets.UTF_8);
            }
            zzed zzedVar2 = zzb4.zza;
            zzedVar2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzedVar2.zzb() > 8) {
                int zzg3 = zzedVar2.zzg() + zzedVar2.zzd();
                int zzg4 = zzedVar2.zzg() - 1;
                if (zzg4 < 0 || zzg4 >= zzg) {
                    AbstractC0486a1.k(zzg4, "Skipped metadata with unknown key index: ", "BoxParsers");
                } else {
                    String str = strArr[zzg4];
                    while (true) {
                        int zzd = zzedVar2.zzd();
                        if (zzd >= zzg3) {
                            zzepVar = null;
                            break;
                        }
                        int zzg5 = zzedVar2.zzg();
                        if (zzedVar2.zzg() == 1684108385) {
                            int zzg6 = zzedVar2.zzg();
                            int zzg7 = zzedVar2.zzg();
                            int i8 = zzg5 - 16;
                            byte[] bArr = new byte[i8];
                            zzedVar2.zzH(bArr, 0, i8);
                            zzepVar = new zzep(str, bArr, zzg7, zzg6);
                            break;
                        }
                        zzedVar2.zzL(zzd + zzg5);
                    }
                    if (zzepVar != null) {
                        arrayList.add(zzepVar);
                    }
                }
                zzedVar2.zzL(zzg3);
            }
            if (!arrayList.isEmpty()) {
                return new zzav(arrayList);
            }
        }
        return null;
    }

    public static zzav zzc(zzer zzerVar) {
        int zzn;
        zzed zzedVar = zzerVar.zza;
        zzedVar.zzL(8);
        zzav zzavVar = new zzav(-9223372036854775807L, new zzau[0]);
        while (zzedVar.zzb() >= 8) {
            int zzd = zzedVar.zzd();
            int zzg = zzedVar.zzg() + zzd;
            int zzg2 = zzedVar.zzg();
            zzav zzavVar2 = null;
            if (zzg2 == 1835365473) {
                zzedVar.zzL(zzd);
                zzedVar.zzM(8);
                zzg(zzedVar);
                while (true) {
                    if (zzedVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd2 = zzedVar.zzd();
                    int zzg3 = zzedVar.zzg() + zzd2;
                    if (zzedVar.zzg() == 1768715124) {
                        zzedVar.zzL(zzd2);
                        zzedVar.zzM(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzedVar.zzd() < zzg3) {
                            zzau zza2 = zzaie.zza(zzedVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzavVar2 = new zzav(arrayList);
                        }
                    } else {
                        zzedVar.zzL(zzg3);
                    }
                }
                zzavVar = zzavVar.zzd(zzavVar2);
            } else if (zzg2 == 1936553057) {
                zzedVar.zzL(zzd);
                zzedVar.zzM(12);
                while (true) {
                    if (zzedVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd3 = zzedVar.zzd();
                    int zzg4 = zzedVar.zzg();
                    if (zzedVar.zzg() != 1935766900) {
                        zzedVar.zzL(zzd3 + zzg4);
                    } else if (zzg4 >= 16) {
                        zzedVar.zzM(4);
                        int i7 = -1;
                        int i8 = 0;
                        for (int i9 = 0; i9 < 2; i9++) {
                            int zzm = zzedVar.zzm();
                            int zzm2 = zzedVar.zzm();
                            if (zzm == 0) {
                                i7 = zzm2;
                            } else if (zzm == 1) {
                                i8 = zzm2;
                            }
                        }
                        if (i7 == 12) {
                            zzn = 240;
                        } else if (i7 == 13) {
                            zzn = 120;
                        } else {
                            if (i7 == 21 && zzedVar.zzb() >= 8 && zzedVar.zzd() + 8 <= zzg) {
                                int zzg5 = zzedVar.zzg();
                                int zzg6 = zzedVar.zzg();
                                if (zzg5 >= 12 && zzg6 == 1936877170) {
                                    zzn = zzedVar.zzn();
                                }
                            }
                            zzn = -2147483647;
                        }
                        if (zzn != -2147483647) {
                            zzavVar2 = new zzav(-9223372036854775807L, new zzagp(zzn, i8));
                        }
                    }
                }
                zzavVar = zzavVar.zzd(zzavVar2);
            } else if (zzg2 == -1451722374) {
                zzavVar = zzavVar.zzd(zzl(zzedVar));
            }
            zzedVar.zzL(zzg);
        }
        return zzavVar;
    }

    public static zzev zzd(zzed zzedVar) {
        long zzt;
        long zzt2;
        zzedVar.zzL(8);
        if (zza(zzedVar.zzg()) == 0) {
            zzt = zzedVar.zzu();
            zzt2 = zzedVar.zzu();
        } else {
            zzt = zzedVar.zzt();
            zzt2 = zzedVar.zzt();
        }
        return new zzev(zzt, zzt2, zzedVar.zzu());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0563 A[EDGE_INSN: B:139:0x0563->B:140:0x0563 BREAK  A[LOOP:5: B:98:0x04bd->B:133:0x0557], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzair zze(zzaio zzaioVar, zzeq zzeqVar, zzadj zzadjVar) {
        zzahp zzahtVar;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z7;
        zzaio zzaioVar2;
        boolean z8;
        long[] jArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        long[] jArr2;
        int i16;
        long[] jArr3;
        int[] iArr2;
        long j;
        int i17;
        long[] jArr4;
        int[] iArr3;
        int i18;
        int i19;
        int i20;
        long[] jArr5;
        int i21;
        int length;
        boolean z9;
        int i22;
        long[] jArr6;
        int i23;
        boolean z10;
        int i24;
        zzaio zzaioVar3;
        int[] iArr4;
        int[] iArr5;
        int i25;
        long[] jArr7;
        boolean z11;
        int i26;
        int length2;
        zzaio zzaioVar4 = zzaioVar;
        zzer zzb2 = zzeqVar.zzb(1937011578);
        if (zzb2 != null) {
            zzahtVar = new zzahs(zzb2, zzaioVar4.zzg);
        } else {
            zzer zzb3 = zzeqVar.zzb(1937013298);
            if (zzb3 == null) {
                throw zzaz.zza("Track has no sample table size information", null);
            }
            zzahtVar = new zzaht(zzb3);
        }
        int zzb4 = zzahtVar.zzb();
        if (zzb4 == 0) {
            return new zzair(zzaioVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (zzaioVar4.zzb == 2) {
            long j3 = zzaioVar4.zzf;
            if (j3 > 0) {
                zzx zzb5 = zzaioVar4.zzg.zzb();
                zzb5.zzK(zzb4 / (j3 / 1000000.0f));
                zzaioVar4 = zzaioVar4.zza(zzb5.zzaj());
            }
        }
        zzaio zzaioVar5 = zzaioVar4;
        zzer zzb6 = zzeqVar.zzb(1937007471);
        if (zzb6 == null) {
            zzb6 = zzeqVar.zzb(1668232756);
            zzb6.getClass();
            z4 = true;
        } else {
            z4 = false;
        }
        zzer zzb7 = zzeqVar.zzb(1937011555);
        zzb7.getClass();
        zzed zzedVar = zzb7.zza;
        zzer zzb8 = zzeqVar.zzb(1937011827);
        zzb8.getClass();
        zzed zzedVar2 = zzb8.zza;
        zzer zzb9 = zzeqVar.zzb(1937011571);
        zzed zzedVar3 = zzb9 != null ? zzb9.zza : null;
        zzer zzb10 = zzeqVar.zzb(1668576371);
        zzed zzedVar4 = zzb10 != null ? zzb10.zza : null;
        zzahl zzahlVar = new zzahl(zzedVar, zzb6.zza, z4);
        zzedVar2.zzL(12);
        int zzp = zzedVar2.zzp() - 1;
        int zzp2 = zzedVar2.zzp();
        int zzp3 = zzedVar2.zzp();
        if (zzedVar4 != null) {
            zzedVar4.zzL(12);
            i7 = zzedVar4.zzp();
        } else {
            i7 = 0;
        }
        if (zzedVar3 != null) {
            zzedVar3.zzL(12);
            i9 = zzedVar3.zzp();
            if (i9 > 0) {
                i8 = zzedVar3.zzp() - 1;
            } else {
                i8 = -1;
                zzedVar3 = null;
            }
        } else {
            i8 = -1;
            i9 = 0;
        }
        int zza2 = zzahtVar.zza();
        zzz zzzVar = zzaioVar5.zzg;
        if (zza2 != -1) {
            String str = zzzVar.zzo;
            if (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && zzp == 0) {
                if (i7 == 0 && i9 == 0) {
                    int i27 = zzahlVar.zza;
                    long[] jArr8 = new long[i27];
                    int[] iArr6 = new int[i27];
                    while (zzahlVar.zza()) {
                        int i28 = zzahlVar.zzb;
                        jArr8[i28] = zzahlVar.zzd;
                        iArr6[i28] = zzahlVar.zzc;
                    }
                    long j7 = zzp3;
                    int i29 = 8192 / zza2;
                    int i30 = 0;
                    for (int i31 = 0; i31 < i27; i31++) {
                        int i32 = iArr6[i31];
                        int i33 = zzen.zza;
                        i30 += ((i32 + i29) - 1) / i29;
                    }
                    long[] jArr9 = new long[i30];
                    int[] iArr7 = new int[i30];
                    long[] jArr10 = new long[i30];
                    int[] iArr8 = new int[i30];
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 0;
                    int i37 = 0;
                    while (i35 < i27) {
                        int i38 = iArr6[i35];
                        long j8 = jArr8[i35];
                        int i39 = i37;
                        int i40 = i27;
                        int i41 = i36;
                        int i42 = i39;
                        long[] jArr11 = jArr8;
                        int i43 = i38;
                        while (i43 > 0) {
                            int min = Math.min(i29, i43);
                            jArr9[i42] = j8;
                            int[] iArr9 = iArr6;
                            int i44 = zza2 * min;
                            iArr7[i42] = i44;
                            i41 = Math.max(i41, i44);
                            jArr10[i42] = i34 * j7;
                            iArr8[i42] = 1;
                            j8 += iArr7[i42];
                            i34 += min;
                            i43 -= min;
                            i42++;
                            zza2 = zza2;
                            i29 = i29;
                            iArr6 = iArr9;
                        }
                        i35++;
                        i29 = i29;
                        jArr8 = jArr11;
                        iArr6 = iArr6;
                        int i45 = i42;
                        i36 = i41;
                        i27 = i40;
                        i37 = i45;
                    }
                    j = j7 * i34;
                    jArr3 = jArr9;
                    iArr2 = iArr7;
                    jArr4 = jArr10;
                    zzaioVar2 = zzaioVar5;
                    i17 = i36;
                    iArr3 = iArr8;
                    long j9 = zzaioVar2.zzc;
                    jArr5 = zzaioVar2.zzi;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    int[] iArr10 = iArr3;
                    long zzu = zzen.zzu(j, 1000000L, j9, roundingMode);
                    if (jArr5 != null) {
                        zzen.zzG(jArr4, 1000000L, zzaioVar2.zzc);
                        return new zzair(zzaioVar2, jArr3, iArr2, i17, jArr4, iArr10, zzu);
                    }
                    int[] iArr11 = iArr10;
                    zzaio zzaioVar6 = zzaioVar2;
                    if (jArr5.length == 1 && zzaioVar6.zzb == 1 && (length2 = jArr4.length) >= 2) {
                        long[] jArr12 = zzaioVar6.zzj;
                        jArr12.getClass();
                        long j10 = jArr12[0];
                        long zzu2 = j10 + zzen.zzu(jArr5[0], zzaioVar6.zzc, zzaioVar6.zzd, roundingMode);
                        int i46 = length2 - 1;
                        int max = Math.max(0, Math.min(4, i46));
                        int max2 = Math.max(0, Math.min(length2 - 4, i46));
                        long j11 = jArr4[0];
                        if (j11 <= j10 && j10 < jArr4[max] && jArr4[max2] < zzu2 && zzu2 <= j) {
                            i21 = zzb4;
                            long zzu3 = zzen.zzu(j10 - j11, zzaioVar6.zzg.zzF, zzaioVar6.zzc, roundingMode);
                            long zzu4 = zzen.zzu(j - zzu2, zzaioVar6.zzg.zzF, zzaioVar6.zzc, roundingMode);
                            if (zzu3 == 0) {
                                if (zzu4 != 0) {
                                    zzu3 = 0;
                                }
                                long[] jArr13 = zzaioVar6.zzi;
                                length = jArr13.length;
                                if (length == 1) {
                                    if (jArr13[0] == 0) {
                                        long[] jArr14 = zzaioVar6.zzj;
                                        jArr14.getClass();
                                        long j12 = jArr14[0];
                                        for (int i47 = 0; i47 < jArr4.length; i47++) {
                                            jArr4[i47] = zzen.zzu(jArr4[i47] - j12, 1000000L, zzaioVar6.zzc, RoundingMode.DOWN);
                                        }
                                        return new zzair(zzaioVar6, jArr3, iArr2, i17, jArr4, iArr11, zzen.zzu(j - j12, 1000000L, zzaioVar6.zzc, RoundingMode.DOWN));
                                    }
                                    length = 1;
                                }
                                boolean z12 = zzaioVar6.zzb == 1;
                                long[] jArr15 = zzaioVar6.zzj;
                                int[] iArr12 = new int[length];
                                int[] iArr13 = new int[length];
                                jArr15.getClass();
                                int i48 = 0;
                                z9 = false;
                                i22 = 0;
                                int i49 = 0;
                                while (true) {
                                    jArr6 = zzaioVar6.zzi;
                                    i23 = i17;
                                    if (i22 >= jArr6.length) {
                                        break;
                                    }
                                    int[] iArr14 = iArr2;
                                    long j13 = jArr15[i22];
                                    if (j13 != -1) {
                                        jArr7 = jArr3;
                                        boolean z13 = z9;
                                        i25 = i21;
                                        long zzu5 = zzen.zzu(jArr6[i22], zzaioVar6.zzc, zzaioVar6.zzd, RoundingMode.DOWN);
                                        iArr12[i22] = zzen.zzd(jArr4, j13, true, true);
                                        long j14 = j13 + zzu5;
                                        iArr13[i22] = zzen.zza(jArr4, j14, z12, false);
                                        int i50 = iArr12[i22];
                                        while (true) {
                                            i26 = iArr12[i22];
                                            if (i26 < 0 || (iArr11[i26] & 1) != 0) {
                                                break;
                                            }
                                            iArr12[i22] = i26 - 1;
                                        }
                                        if (i26 < 0) {
                                            iArr12[i22] = i50;
                                            while (true) {
                                                i26 = iArr12[i22];
                                                if (i26 >= iArr13[i22] || (iArr11[i26] & 1) != 0) {
                                                    break;
                                                }
                                                iArr12[i22] = i26 + 1;
                                            }
                                        }
                                        if (zzaioVar6.zzb == 2 && i26 != iArr13[i22]) {
                                            while (true) {
                                                int i51 = iArr13[i22];
                                                if (i51 >= jArr4.length - 1) {
                                                    break;
                                                }
                                                int i52 = i51 + 1;
                                                if (jArr4[i52] > j14) {
                                                    break;
                                                }
                                                iArr13[i22] = i52;
                                            }
                                        }
                                        int i53 = iArr13[i22];
                                        int i54 = iArr12[i22];
                                        int i55 = (i53 - i54) + i48;
                                        z11 = z13 | (i49 != i54);
                                        i49 = i53;
                                        i48 = i55;
                                    } else {
                                        i25 = i21;
                                        jArr7 = jArr3;
                                        z11 = z9;
                                    }
                                    i22++;
                                    iArr2 = iArr14;
                                    z9 = z11;
                                    jArr3 = jArr7;
                                    i21 = i25;
                                    i17 = i23;
                                }
                                int[] iArr15 = iArr2;
                                long[] jArr16 = jArr3;
                                boolean z14 = z9 | (i48 != i21);
                                long[] jArr17 = z14 ? new long[i48] : jArr16;
                                int[] iArr16 = z14 ? new int[i48] : iArr15;
                                int i56 = true == z14 ? 0 : i23;
                                int[] iArr17 = z14 ? new int[i48] : iArr11;
                                long[] jArr18 = new long[i48];
                                int i57 = i56;
                                z10 = false;
                                int i58 = 0;
                                i24 = 0;
                                long j15 = 0;
                                while (i24 < zzaioVar6.zzi.length) {
                                    long j16 = zzaioVar6.zzj[i24];
                                    int i59 = iArr12[i24];
                                    int i60 = iArr13[i24];
                                    int[] iArr18 = iArr12;
                                    if (z14) {
                                        int i61 = i60 - i59;
                                        iArr4 = iArr13;
                                        System.arraycopy(jArr16, i59, jArr17, i58, i61);
                                        iArr5 = iArr15;
                                        System.arraycopy(iArr5, i59, iArr16, i58, i61);
                                        System.arraycopy(iArr11, i59, iArr17, i58, i61);
                                    } else {
                                        iArr4 = iArr13;
                                        iArr5 = iArr15;
                                    }
                                    while (i59 < i60) {
                                        int[] iArr19 = iArr11;
                                        int i62 = i24;
                                        long j17 = zzaioVar6.zzd;
                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                        long zzu6 = zzen.zzu(j15, 1000000L, j17, roundingMode2);
                                        long[] jArr19 = jArr4;
                                        long zzu7 = zzen.zzu(jArr4[i59] - j16, 1000000L, zzaioVar6.zzc, roundingMode2);
                                        z10 = (!(zzu7 >= 0)) | z10;
                                        jArr18[i58] = zzu6 + zzu7;
                                        if (z14 && iArr16[i58] > i57) {
                                            i57 = iArr5[i59];
                                        }
                                        i58++;
                                        i59++;
                                        iArr11 = iArr19;
                                        i24 = i62;
                                        jArr4 = jArr19;
                                    }
                                    int i63 = i24;
                                    j15 += zzaioVar6.zzi[i63];
                                    i24 = i63 + 1;
                                    iArr11 = iArr11;
                                    iArr15 = iArr5;
                                    iArr12 = iArr18;
                                    iArr13 = iArr4;
                                    jArr4 = jArr4;
                                }
                                long zzu8 = zzen.zzu(j15, 1000000L, zzaioVar6.zzd, RoundingMode.DOWN);
                                if (z10) {
                                    zzx zzb11 = zzaioVar6.zzg.zzb();
                                    zzb11.zzL(true);
                                    zzaioVar3 = zzaioVar6.zza(zzb11.zzaj());
                                } else {
                                    zzaioVar3 = zzaioVar6;
                                }
                                return new zzair(zzaioVar3, jArr17, iArr16, i57, jArr18, iArr17, zzu8);
                            }
                            if (zzu3 <= 2147483647L && zzu4 <= 2147483647L) {
                                zzadjVar.zza = (int) zzu3;
                                zzadjVar.zzb = (int) zzu4;
                                zzen.zzG(jArr4, 1000000L, zzaioVar6.zzc);
                                return new zzair(zzaioVar6, jArr3, iArr2, i17, jArr4, iArr11, zzen.zzu(zzaioVar6.zzi[0], 1000000L, zzaioVar6.zzd, roundingMode));
                            }
                            long[] jArr132 = zzaioVar6.zzi;
                            length = jArr132.length;
                            if (length == 1) {
                            }
                            if (zzaioVar6.zzb == 1) {
                            }
                            long[] jArr152 = zzaioVar6.zzj;
                            int[] iArr122 = new int[length];
                            int[] iArr132 = new int[length];
                            jArr152.getClass();
                            int i482 = 0;
                            z9 = false;
                            i22 = 0;
                            int i492 = 0;
                            while (true) {
                                jArr6 = zzaioVar6.zzi;
                                i23 = i17;
                                if (i22 >= jArr6.length) {
                                }
                                i22++;
                                iArr2 = iArr14;
                                z9 = z11;
                                jArr3 = jArr7;
                                i21 = i25;
                                i17 = i23;
                            }
                            int[] iArr152 = iArr2;
                            long[] jArr162 = jArr3;
                            boolean z142 = z9 | (i482 != i21);
                            if (z142) {
                            }
                            if (z142) {
                            }
                            if (true == z142) {
                            }
                            if (z142) {
                            }
                            long[] jArr182 = new long[i482];
                            int i572 = i56;
                            z10 = false;
                            int i582 = 0;
                            i24 = 0;
                            long j152 = 0;
                            while (i24 < zzaioVar6.zzi.length) {
                            }
                            long zzu82 = zzen.zzu(j152, 1000000L, zzaioVar6.zzd, RoundingMode.DOWN);
                            if (z10) {
                            }
                            return new zzair(zzaioVar3, jArr17, iArr16, i572, jArr182, iArr17, zzu82);
                        }
                    }
                    i21 = zzb4;
                    long[] jArr1322 = zzaioVar6.zzi;
                    length = jArr1322.length;
                    if (length == 1) {
                    }
                    if (zzaioVar6.zzb == 1) {
                    }
                    long[] jArr1522 = zzaioVar6.zzj;
                    int[] iArr1222 = new int[length];
                    int[] iArr1322 = new int[length];
                    jArr1522.getClass();
                    int i4822 = 0;
                    z9 = false;
                    i22 = 0;
                    int i4922 = 0;
                    while (true) {
                        jArr6 = zzaioVar6.zzi;
                        i23 = i17;
                        if (i22 >= jArr6.length) {
                        }
                        i22++;
                        iArr2 = iArr14;
                        z9 = z11;
                        jArr3 = jArr7;
                        i21 = i25;
                        i17 = i23;
                    }
                    int[] iArr1522 = iArr2;
                    long[] jArr1622 = jArr3;
                    boolean z1422 = z9 | (i4822 != i21);
                    if (z1422) {
                    }
                    if (z1422) {
                    }
                    if (true == z1422) {
                    }
                    if (z1422) {
                    }
                    long[] jArr1822 = new long[i4822];
                    int i5722 = i56;
                    z10 = false;
                    int i5822 = 0;
                    i24 = 0;
                    long j1522 = 0;
                    while (i24 < zzaioVar6.zzi.length) {
                    }
                    long zzu822 = zzen.zzu(j1522, 1000000L, zzaioVar6.zzd, RoundingMode.DOWN);
                    if (z10) {
                    }
                    return new zzair(zzaioVar3, jArr17, iArr16, i5722, jArr1822, iArr17, zzu822);
                }
                zzp = 0;
            }
        }
        long[] jArr20 = new long[zzb4];
        int[] iArr20 = new int[zzb4];
        long[] jArr21 = new long[zzb4];
        int[] iArr21 = new int[zzb4];
        int i64 = zzp;
        int i65 = i8;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        long j18 = 0;
        long j19 = 0;
        int i70 = 0;
        while (true) {
            if (i67 >= zzb4) {
                i10 = zzp2;
                i11 = i66;
                break;
            }
            long j20 = j18;
            boolean z15 = true;
            while (true) {
                if (i69 != 0) {
                    i18 = zzb4;
                    i10 = zzp2;
                    i19 = zzp3;
                    i20 = i69;
                    break;
                }
                z15 = zzahlVar.zza();
                if (!z15) {
                    i18 = zzb4;
                    i10 = zzp2;
                    i19 = zzp3;
                    i20 = 0;
                    break;
                }
                int i71 = zzp2;
                long j21 = zzahlVar.zzd;
                i69 = zzahlVar.zzc;
                j20 = j21;
                zzp2 = i71;
                zzp3 = zzp3;
                zzb4 = zzb4;
            }
            if (!z15) {
                zzdq.zzf("BoxParsers", "Unexpected end of chunk data");
                jArr20 = Arrays.copyOf(jArr20, i67);
                iArr20 = Arrays.copyOf(iArr20, i67);
                jArr21 = Arrays.copyOf(jArr21, i67);
                iArr21 = Arrays.copyOf(iArr21, i67);
                i11 = i66;
                zzb4 = i67;
                break;
            }
            int i72 = i66;
            if (zzedVar4 != null) {
                while (true) {
                    if (i70 != 0) {
                        break;
                    }
                    if (i7 <= 0) {
                        i70 = 0;
                        break;
                    }
                    i7--;
                    i70 = zzedVar4.zzp();
                    i72 = zzedVar4.zzg();
                }
                i70--;
            }
            jArr20[i67] = j20;
            int zzc = zzahtVar.zzc();
            iArr20[i67] = zzc;
            int i73 = zzc > i68 ? zzc : i68;
            jArr21[i67] = j19 + i72;
            iArr21[i67] = zzedVar3 == null ? 1 : 0;
            if (i67 == i65) {
                iArr21[i67] = 1;
                i9--;
                if (i9 > 0) {
                    zzedVar3.getClass();
                    i65 = zzedVar3.zzp() - 1;
                }
            }
            zzed zzedVar5 = zzedVar3;
            int i74 = i19;
            long[] jArr22 = jArr21;
            j19 += i74;
            int i75 = i10 - 1;
            if (i75 == 0) {
                if (i64 > 0) {
                    i75 = zzedVar2.zzp();
                    i64--;
                    i74 = zzedVar2.zzg();
                } else {
                    i75 = 0;
                }
            }
            long[] jArr23 = jArr20;
            long j22 = j20 + iArr20[i67];
            i69 = i20 - 1;
            i67++;
            zzp3 = i74;
            jArr21 = jArr22;
            zzb4 = i18;
            i68 = i73;
            i66 = i72;
            zzp2 = i75;
            zzedVar3 = zzedVar5;
            j18 = j22;
            jArr20 = jArr23;
            iArr20 = iArr20;
        }
        long j23 = j19 + i11;
        if (zzedVar4 != null) {
            while (i7 > 0) {
                if (zzedVar4.zzp() != 0) {
                    z7 = false;
                    break;
                }
                zzedVar4.zzg();
                i7--;
            }
        }
        z7 = true;
        if (i9 == 0) {
            if (i10 == 0) {
                if (i69 != 0) {
                    i9 = 0;
                    zzaioVar2 = zzaioVar5;
                    z8 = z7;
                    jArr = jArr20;
                    i12 = i69;
                } else if (i64 != 0) {
                    i9 = 0;
                    i12 = 0;
                    zzaioVar2 = zzaioVar5;
                    z8 = z7;
                    jArr = jArr20;
                } else if (i70 != 0) {
                    i9 = 0;
                    i12 = 0;
                    i14 = 0;
                    zzaioVar2 = zzaioVar5;
                    z8 = z7;
                    jArr = jArr20;
                    i15 = i70;
                    i13 = 0;
                    iArr = iArr20;
                    i16 = zzb4;
                    jArr2 = jArr21;
                    StringBuilder g3 = AbstractC1663a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", i9, ", remainingSamplesAtTimestampDelta ");
                    g3.append(i13);
                    g3.append(", remainingSamplesInChunk ");
                    g3.append(i12);
                    g3.append(", remainingTimestampDeltaChanges ");
                    g3.append(i14);
                    g3.append(", remainingSamplesAtTimestampOffset ");
                    g3.append(i15);
                    g3.append(true == z8 ? ", ctts invalid" : "");
                    zzdq.zzf("BoxParsers", g3.toString());
                    jArr3 = jArr;
                    iArr2 = iArr;
                    j = j23;
                    i17 = i68;
                    zzb4 = i16;
                    jArr4 = jArr2;
                    iArr3 = iArr21;
                    long j92 = zzaioVar2.zzc;
                    jArr5 = zzaioVar2.zzi;
                    RoundingMode roundingMode3 = RoundingMode.DOWN;
                    int[] iArr102 = iArr3;
                    long zzu9 = zzen.zzu(j, 1000000L, j92, roundingMode3);
                    if (jArr5 != null) {
                    }
                } else if (z7) {
                    zzaioVar2 = zzaioVar5;
                    jArr = jArr20;
                    iArr = iArr20;
                    i16 = zzb4;
                    jArr2 = jArr21;
                    jArr3 = jArr;
                    iArr2 = iArr;
                    j = j23;
                    i17 = i68;
                    zzb4 = i16;
                    jArr4 = jArr2;
                    iArr3 = iArr21;
                    long j922 = zzaioVar2.zzc;
                    jArr5 = zzaioVar2.zzi;
                    RoundingMode roundingMode32 = RoundingMode.DOWN;
                    int[] iArr1022 = iArr3;
                    long zzu92 = zzen.zzu(j, 1000000L, j922, roundingMode32);
                    if (jArr5 != null) {
                    }
                } else {
                    i13 = 0;
                    i9 = 0;
                    i12 = 0;
                    i14 = 0;
                    i15 = 0;
                    z8 = false;
                    zzaioVar2 = zzaioVar5;
                    jArr = jArr20;
                    iArr = iArr20;
                    i16 = zzb4;
                    jArr2 = jArr21;
                    StringBuilder g32 = AbstractC1663a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", i9, ", remainingSamplesAtTimestampDelta ");
                    g32.append(i13);
                    g32.append(", remainingSamplesInChunk ");
                    g32.append(i12);
                    g32.append(", remainingTimestampDeltaChanges ");
                    g32.append(i14);
                    g32.append(", remainingSamplesAtTimestampOffset ");
                    g32.append(i15);
                    g32.append(true == z8 ? ", ctts invalid" : "");
                    zzdq.zzf("BoxParsers", g32.toString());
                    jArr3 = jArr;
                    iArr2 = iArr;
                    j = j23;
                    i17 = i68;
                    zzb4 = i16;
                    jArr4 = jArr2;
                    iArr3 = iArr21;
                    long j9222 = zzaioVar2.zzc;
                    jArr5 = zzaioVar2.zzi;
                    RoundingMode roundingMode322 = RoundingMode.DOWN;
                    int[] iArr10222 = iArr3;
                    long zzu922 = zzen.zzu(j, 1000000L, j9222, roundingMode322);
                    if (jArr5 != null) {
                    }
                }
                i14 = i64;
                i15 = i70;
                i13 = 0;
                iArr = iArr20;
                i16 = zzb4;
                jArr2 = jArr21;
                StringBuilder g322 = AbstractC1663a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", i9, ", remainingSamplesAtTimestampDelta ");
                g322.append(i13);
                g322.append(", remainingSamplesInChunk ");
                g322.append(i12);
                g322.append(", remainingTimestampDeltaChanges ");
                g322.append(i14);
                g322.append(", remainingSamplesAtTimestampOffset ");
                g322.append(i15);
                g322.append(true == z8 ? ", ctts invalid" : "");
                zzdq.zzf("BoxParsers", g322.toString());
                jArr3 = jArr;
                iArr2 = iArr;
                j = j23;
                i17 = i68;
                zzb4 = i16;
                jArr4 = jArr2;
                iArr3 = iArr21;
                long j92222 = zzaioVar2.zzc;
                jArr5 = zzaioVar2.zzi;
                RoundingMode roundingMode3222 = RoundingMode.DOWN;
                int[] iArr102222 = iArr3;
                long zzu9222 = zzen.zzu(j, 1000000L, j92222, roundingMode3222);
                if (jArr5 != null) {
                }
            } else {
                i9 = 0;
            }
        }
        zzaioVar2 = zzaioVar5;
        z8 = z7;
        jArr = jArr20;
        i12 = i69;
        i13 = i10;
        i14 = i64;
        i15 = i70;
        iArr = iArr20;
        i16 = zzb4;
        jArr2 = jArr21;
        StringBuilder g3222 = AbstractC1663a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", i9, ", remainingSamplesAtTimestampDelta ");
        g3222.append(i13);
        g3222.append(", remainingSamplesInChunk ");
        g3222.append(i12);
        g3222.append(", remainingTimestampDeltaChanges ");
        g3222.append(i14);
        g3222.append(", remainingSamplesAtTimestampOffset ");
        g3222.append(i15);
        g3222.append(true == z8 ? ", ctts invalid" : "");
        zzdq.zzf("BoxParsers", g3222.toString());
        jArr3 = jArr;
        iArr2 = iArr;
        j = j23;
        i17 = i68;
        zzb4 = i16;
        jArr4 = jArr2;
        iArr3 = iArr21;
        long j922222 = zzaioVar2.zzc;
        jArr5 = zzaioVar2.zzi;
        RoundingMode roundingMode32222 = RoundingMode.DOWN;
        int[] iArr1022222 = iArr3;
        long zzu92222 = zzen.zzu(j, 1000000L, j922222, roundingMode32222);
        if (jArr5 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0c57  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0ded  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0df1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0e71 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzf(zzeq zzeqVar, zzadj zzadjVar, long j, zzs zzsVar, boolean z4, boolean z7, zzfsw zzfswVar) {
        long j3;
        long j7;
        int i7;
        long j8;
        long j9;
        int zza2;
        int i8;
        int i9;
        long j10;
        zzer zzb2;
        int i10;
        int i11;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        String str4;
        int i12;
        zzeq zzeqVar2;
        int i13;
        long[] jArr;
        long[] jArr2;
        zzz zzzVar;
        zzaio zzaioVar;
        int i14;
        long j11;
        long j12;
        zzfsw zzfswVar2;
        Pair create;
        int i15;
        int i16;
        ArrayList arrayList2;
        String str5;
        String str6;
        int i17;
        zzeq zzeqVar3;
        long j13;
        zzed zzedVar;
        zzs zzsVar2;
        int i18;
        String str7;
        int i19;
        int i20;
        int i21;
        char c3;
        char c4;
        int i22;
        int i23;
        zzahr zzahrVar;
        long j14;
        long j15;
        int i24;
        int i25;
        int i26;
        boolean z8;
        int i27;
        String str8;
        int i28;
        zzahr zzahrVar2;
        int i29;
        int i30;
        zzfg zzfgVar;
        List list;
        boolean z9;
        String str9;
        byte[] bArr;
        String str10;
        boolean z10;
        int i31;
        boolean z11;
        boolean z12;
        int i32;
        zzahn zzahnVar;
        zzahq zzahqVar;
        boolean z13;
        zzahn zzahnVar2;
        zzahq zzahqVar2;
        boolean z14;
        zzahr zzahrVar3;
        boolean z15;
        String str11;
        int i33;
        boolean z16;
        boolean z17;
        String str12;
        boolean z18;
        boolean z19;
        boolean z20;
        int i34;
        int i35;
        int i36;
        String str13;
        long j16;
        zzfwh zzfwhVar;
        long j17;
        ArrayList arrayList3;
        int i37;
        zzeq zzeqVar4 = zzeqVar;
        String str14 = "video/hevc";
        String str15 = "video/3gpp";
        String str16 = "application/ttml+xml";
        int i38 = 1835297121;
        int i39 = 4;
        int i40 = 8;
        ArrayList arrayList4 = new ArrayList();
        int i41 = 0;
        while (i41 < zzeqVar4.zzc.size()) {
            zzeq zzeqVar5 = (zzeq) zzeqVar4.zzc.get(i41);
            if (zzeqVar5.zzd != 1953653099) {
                i12 = i41;
                arrayList3 = arrayList4;
                i13 = i40;
                str4 = str14;
                str2 = str15;
                str3 = str16;
                i37 = i38;
            } else {
                zzer zzb3 = zzeqVar4.zzb(1836476516);
                zzb3.getClass();
                zzeq zza3 = zzeqVar5.zza(i38);
                zza3.getClass();
                zzer zzb4 = zza3.zzb(1751411826);
                zzb4.getClass();
                int zzi = zzi(zzb4.zza);
                int i42 = zzi == 1936684398 ? 1 : zzi == 1986618469 ? 2 : (zzi == 1952807028 || zzi == 1935832172 || zzi == 1937072756 || zzi == 1668047728) ? 3 : zzi == 1835365473 ? 5 : -1;
                if (i42 == -1) {
                    zzfswVar2 = zzfswVar;
                    i12 = i41;
                    zzeqVar2 = zzeqVar5;
                    arrayList = arrayList4;
                    i13 = i40;
                    str4 = str14;
                    str2 = str15;
                    str3 = str16;
                    zzaioVar = null;
                } else {
                    zzer zzb5 = zzeqVar5.zzb(1953196132);
                    zzb5.getClass();
                    zzed zzedVar2 = zzb5.zza;
                    zzedVar2.zzL(i40);
                    int zza4 = zza(zzedVar2.zzg());
                    if (zza4 != 0) {
                        i40 = 16;
                    }
                    zzedVar2.zzM(i40);
                    int zzg = zzedVar2.zzg();
                    zzedVar2.zzM(i39);
                    int zzd = zzedVar2.zzd();
                    int i43 = 0;
                    while (true) {
                        int i44 = zza4 == 0 ? 4 : 8;
                        j3 = -9223372036854775807L;
                        if (i43 >= i44) {
                            zzedVar2.zzM(i44);
                            break;
                        }
                        if (zzedVar2.zzN()[zzd + i43] != -1) {
                            long zzu = zza4 == 0 ? zzedVar2.zzu() : zzedVar2.zzw();
                            if (zzu != 0) {
                                j7 = zzu;
                            }
                        } else {
                            i43++;
                        }
                    }
                    j7 = -9223372036854775807L;
                    zzedVar2.zzM(16);
                    int zzg2 = zzedVar2.zzg();
                    int zzg3 = zzedVar2.zzg();
                    zzedVar2.zzM(4);
                    int zzg4 = zzedVar2.zzg();
                    int zzg5 = zzedVar2.zzg();
                    int i45 = i41;
                    int i46 = 65536;
                    zzeq zzeqVar6 = zzeqVar5;
                    if (zzg2 == 0) {
                        if (zzg3 == 65536) {
                            if (zzg4 != -65536) {
                                zzg3 = 65536;
                            } else if (zzg5 == 0) {
                                i7 = 90;
                                zzahu zzahuVar = new zzahu(zzg, j7, i7);
                                if (j == -9223372036854775807L) {
                                    j17 = zzahuVar.zzb;
                                    j8 = j17;
                                } else {
                                    j8 = j;
                                }
                                j9 = zzd(zzb3.zza).zzc;
                                long zzu2 = j8 == -9223372036854775807L ? -9223372036854775807L : zzen.zzu(j8, 1000000L, j9, RoundingMode.DOWN);
                                zzeq zza5 = zza3.zza(1835626086);
                                zza5.getClass();
                                zzeq zza6 = zza5.zza(1937007212);
                                zza6.getClass();
                                zzer zzb6 = zza3.zzb(1835296868);
                                zzb6.getClass();
                                zzed zzedVar3 = zzb6.zza;
                                zzedVar3.zzL(8);
                                zza2 = zza(zzedVar3.zzg());
                                zzedVar3.zzM(zza2 == 0 ? 8 : 16);
                                long zzu3 = zzedVar3.zzu();
                                int zzd2 = zzedVar3.zzd();
                                i8 = 0;
                                while (true) {
                                    i9 = zza2 == 0 ? 4 : 8;
                                    if (i8 >= i9) {
                                        j10 = j9;
                                        zzedVar3.zzM(i9);
                                        break;
                                    }
                                    j10 = j9;
                                    if (zzedVar3.zzN()[zzd2 + i8] != -1) {
                                        long zzu4 = zza2 == 0 ? zzedVar3.zzu() : zzedVar3.zzw();
                                        if (zzu4 != 0) {
                                            j3 = zzen.zzu(zzu4, 1000000L, zzu3, RoundingMode.DOWN);
                                        }
                                    } else {
                                        i8++;
                                        j9 = j10;
                                    }
                                }
                                long j18 = j3;
                                int zzq = zzedVar3.zzq();
                                StringBuilder sb = new StringBuilder();
                                sb.append((char) (((zzq >> 10) & 31) + 96));
                                sb.append((char) (((zzq >> 5) & 31) + 96));
                                sb.append((char) ((zzq & 31) + 96));
                                zzaho zzahoVar = new zzaho(zzu3, j18, sb.toString());
                                zzb2 = zza6.zzb(1937011556);
                                if (zzb2 == null) {
                                    throw zzaz.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                                }
                                i10 = zzahuVar.zza;
                                i11 = zzahuVar.zzc;
                                str = zzahoVar.zzc;
                                zzed zzedVar4 = zzb2.zza;
                                char c7 = '\f';
                                zzedVar4.zzL(12);
                                int zzg6 = zzedVar4.zzg();
                                str2 = str15;
                                zzahr zzahrVar4 = new zzahr(zzg6);
                                str3 = str16;
                                int i47 = 0;
                                while (i47 < zzg6) {
                                    zzaho zzahoVar2 = zzahoVar;
                                    int zzd3 = zzedVar4.zzd();
                                    zzahu zzahuVar2 = zzahuVar;
                                    int zzg7 = zzedVar4.zzg();
                                    String str17 = "childAtomSize must be positive";
                                    zzacz.zzb(zzg7 > 0, "childAtomSize must be positive");
                                    int zzg8 = zzedVar4.zzg();
                                    int i48 = 1701733238;
                                    if (zzg8 == 1635148593 || zzg8 == 1635148595 || zzg8 == 1701733238 || zzg8 == 1831958048 || zzg8 == 1836070006 || zzg8 == 1752589105 || zzg8 == 1751479857 || zzg8 == 1932670515 || zzg8 == 1211250227 || zzg8 == 1748121139 || zzg8 == 1987063864 || zzg8 == 1987063865 || zzg8 == 1635135537 || zzg8 == 1685479798 || zzg8 == 1685479729 || zzg8 == 1685481573 || zzg8 == 1685481521 || zzg8 == 1634760241) {
                                        i15 = zzg6;
                                        i16 = i42;
                                        arrayList2 = arrayList4;
                                        str5 = str;
                                        int i49 = i11;
                                        int i50 = i10;
                                        str6 = str14;
                                        i17 = i45;
                                        zzeqVar3 = zzeqVar6;
                                        j13 = j10;
                                        int i51 = zzg8;
                                        zzedVar = zzedVar4;
                                        zzedVar.zzL(zzd3 + 16);
                                        zzedVar.zzM(16);
                                        int zzq2 = zzedVar.zzq();
                                        int zzq3 = zzedVar.zzq();
                                        zzedVar.zzM(50);
                                        int zzd4 = zzedVar.zzd();
                                        if (i51 == 1701733238) {
                                            Pair zzj = zzj(zzedVar, zzd3, zzg7);
                                            if (zzj != null) {
                                                int intValue = ((Integer) zzj.first).intValue();
                                                zzsVar2 = zzsVar == null ? null : zzsVar.zzb(((zzaip) zzj.second).zzb);
                                                zzahrVar4.zza[i47] = (zzaip) zzj.second;
                                                i48 = intValue;
                                            } else {
                                                zzsVar2 = zzsVar;
                                            }
                                            zzedVar.zzL(zzd4);
                                            i51 = i48;
                                        } else {
                                            zzsVar2 = zzsVar;
                                        }
                                        if (i51 == 1831958048) {
                                            str7 = "video/mpeg";
                                            i18 = i51;
                                        } else if (i51 == 1211250227) {
                                            i18 = 1211250227;
                                            str7 = str2;
                                        } else {
                                            i18 = i51;
                                            str7 = null;
                                        }
                                        zzs zzsVar3 = zzsVar2;
                                        float f7 = 1.0f;
                                        int i52 = i18;
                                        i19 = i47;
                                        int i53 = -1;
                                        int i54 = -1;
                                        int i55 = 8;
                                        zzfg zzfgVar2 = null;
                                        int i56 = 8;
                                        int i57 = -1;
                                        List list2 = null;
                                        ByteBuffer byteBuffer = null;
                                        zzahm zzahmVar = null;
                                        boolean z21 = false;
                                        byte[] bArr2 = null;
                                        String str18 = null;
                                        int i58 = -1;
                                        int i59 = -1;
                                        String str19 = str7;
                                        int i60 = zzd4;
                                        int i61 = -1;
                                        while (i60 - zzd3 < zzg7) {
                                            zzedVar.zzL(i60);
                                            int zzd5 = zzedVar.zzd();
                                            int zzg9 = zzedVar.zzg();
                                            if (zzg9 == 0) {
                                                i24 = i60;
                                                if (zzedVar.zzd() - zzd3 == zzg7) {
                                                    break;
                                                }
                                                i25 = 0;
                                            } else {
                                                i24 = i60;
                                                i25 = zzg9;
                                            }
                                            if (i25 > 0) {
                                                i26 = zzd3;
                                                z8 = true;
                                            } else {
                                                i26 = zzd3;
                                                z8 = false;
                                            }
                                            zzacz.zzb(z8, str17);
                                            int zzg10 = zzedVar.zzg();
                                            int i62 = zzg7;
                                            if (zzg10 == 1635148611) {
                                                int i63 = zzd5 + 8;
                                                zzacz.zzb(str19 == null, null);
                                                zzedVar.zzL(i63);
                                                zzabz zza7 = zzabz.zza(zzedVar);
                                                List list3 = zza7.zza;
                                                zzahrVar4.zzc = zza7.zzb;
                                                if (z21) {
                                                    z20 = true;
                                                } else {
                                                    f7 = zza7.zzk;
                                                    z20 = false;
                                                }
                                                String str20 = zza7.zzl;
                                                int i64 = zza7.zzj;
                                                int i65 = zza7.zzg;
                                                int i66 = zza7.zzh;
                                                int i67 = zza7.zzi;
                                                int i68 = zza7.zze;
                                                i27 = zza7.zzf;
                                                str8 = str17;
                                                str18 = str20;
                                                i58 = i64;
                                                zzahrVar2 = zzahrVar4;
                                                i57 = i67;
                                                str19 = "video/avc";
                                                i56 = i68;
                                                i29 = i61;
                                                z21 = z20;
                                                i53 = i66;
                                                list2 = list3;
                                                i54 = i65;
                                            } else {
                                                int i69 = i61;
                                                if (zzg10 == 1752589123) {
                                                    int i70 = zzd5 + 8;
                                                    if (str19 == null) {
                                                        str12 = null;
                                                        z18 = true;
                                                    } else {
                                                        str12 = null;
                                                        z18 = false;
                                                    }
                                                    zzacz.zzb(z18, str12);
                                                    zzedVar.zzL(i70);
                                                    zzadk zza8 = zzadk.zza(zzedVar);
                                                    List list4 = zza8.zza;
                                                    zzahrVar4.zzc = zza8.zzb;
                                                    if (z21) {
                                                        z19 = true;
                                                    } else {
                                                        f7 = zza8.zzj;
                                                        z19 = false;
                                                    }
                                                    int i71 = zza8.zzk;
                                                    int i72 = zza8.zzc;
                                                    String str21 = zza8.zzl;
                                                    int i73 = zza8.zzi;
                                                    if (i73 == -1) {
                                                        i73 = i69;
                                                    }
                                                    int i74 = zza8.zzf;
                                                    int i75 = zza8.zzg;
                                                    int i76 = zza8.zzh;
                                                    int i77 = zza8.zzd;
                                                    i58 = i71;
                                                    i59 = i72;
                                                    str8 = str17;
                                                    z21 = z19;
                                                    str18 = str21;
                                                    i29 = i73;
                                                    i57 = i76;
                                                    i54 = i74;
                                                    zzahrVar2 = zzahrVar4;
                                                    i27 = zza8.zze;
                                                    zzfgVar2 = zza8.zzm;
                                                    list2 = list4;
                                                    i56 = i77;
                                                    i53 = i75;
                                                    str19 = str6;
                                                } else if (zzg10 == 1818785347) {
                                                    int i78 = zzd5 + 8;
                                                    String str22 = str6;
                                                    zzacz.zzb(str22.equals(str19), "lhvC must follow hvcC atom");
                                                    if (zzfgVar2 != null) {
                                                        z16 = zzfgVar2.zza.size() >= 2;
                                                    } else {
                                                        z16 = false;
                                                        zzfgVar2 = null;
                                                    }
                                                    zzacz.zzb(z16, "must have at least two layers");
                                                    zzedVar.zzL(i78);
                                                    zzfgVar2.getClass();
                                                    zzadk zzb7 = zzadk.zzb(zzedVar, zzfgVar2);
                                                    zzacz.zzb(zzahrVar4.zzc == zzb7.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                    int i79 = zzb7.zzf;
                                                    if (i79 != -1) {
                                                        zzacz.zzb(i54 == i79, "colorSpace must be the same for both views");
                                                    }
                                                    int i80 = zzb7.zzg;
                                                    if (i80 != -1) {
                                                        zzacz.zzb(i53 == i80, "colorRange must be the same for both views");
                                                    }
                                                    int i81 = zzb7.zzh;
                                                    if (i81 != -1) {
                                                        zzacz.zzb(i57 == i81, "colorTransfer must be the same for both views");
                                                    }
                                                    zzacz.zzb(i56 == zzb7.zzd, "bitdepthLuma must be the same for both views");
                                                    zzacz.zzb(i55 == zzb7.zze, "bitdepthChroma must be the same for both views");
                                                    if (list2 != null) {
                                                        int i82 = zzfwh.zzd;
                                                        zzfwe zzfweVar = new zzfwe();
                                                        zzfweVar.zzh(list2);
                                                        zzfweVar.zzh(zzb7.zza);
                                                        list2 = zzfweVar.zzi();
                                                        z17 = false;
                                                    } else {
                                                        z17 = false;
                                                        zzacz.zzb(false, "initializationData must be already set from hvcC atom");
                                                    }
                                                    str18 = zzb7.zzl;
                                                    i27 = i55;
                                                    str8 = str17;
                                                    zzahrVar2 = zzahrVar4;
                                                    str6 = str22;
                                                    i29 = i69;
                                                    str19 = "video/mv-hevc";
                                                } else {
                                                    String str23 = str6;
                                                    if (zzg10 == 1986361461) {
                                                        zzedVar.zzL(zzd5 + 8);
                                                        int zzd6 = zzedVar.zzd();
                                                        str6 = str23;
                                                        zzahn zzahnVar3 = null;
                                                        while (zzd6 - zzd5 < i25) {
                                                            zzedVar.zzL(zzd6);
                                                            int zzg11 = zzedVar.zzg();
                                                            if (zzg11 > 0) {
                                                                zzahrVar3 = zzahrVar4;
                                                                z15 = true;
                                                            } else {
                                                                zzahrVar3 = zzahrVar4;
                                                                z15 = false;
                                                            }
                                                            zzacz.zzb(z15, str17);
                                                            int i83 = i55;
                                                            if (zzedVar.zzg() == 1702454643) {
                                                                zzedVar.zzL(zzd6 + 8);
                                                                int zzd7 = zzedVar.zzd();
                                                                while (true) {
                                                                    if (zzd7 - zzd6 >= zzg11) {
                                                                        str11 = str17;
                                                                        i33 = i56;
                                                                        zzahnVar3 = null;
                                                                        break;
                                                                    }
                                                                    zzedVar.zzL(zzd7);
                                                                    int zzg12 = zzedVar.zzg();
                                                                    zzacz.zzb(zzg12 > 0, str17);
                                                                    str11 = str17;
                                                                    if (zzedVar.zzg() == 1937011305) {
                                                                        zzedVar.zzM(4);
                                                                        int zzm = zzedVar.zzm();
                                                                        i33 = i56;
                                                                        zzahnVar3 = new zzahn(new zzahq(1 == (zzm & 1), (zzm & 2) == 2, (zzm & 8) == 8));
                                                                    } else {
                                                                        zzd7 += zzg12;
                                                                        str17 = str11;
                                                                    }
                                                                }
                                                            } else {
                                                                str11 = str17;
                                                                i33 = i56;
                                                            }
                                                            zzd6 += zzg11;
                                                            zzahrVar4 = zzahrVar3;
                                                            i55 = i83;
                                                            str17 = str11;
                                                            i56 = i33;
                                                        }
                                                        i27 = i55;
                                                        str8 = str17;
                                                        i28 = i56;
                                                        zzahrVar2 = zzahrVar4;
                                                        zzahv zzahvVar = zzahnVar3 == null ? null : new zzahv(zzahnVar3);
                                                        if (zzahvVar != null) {
                                                            if (zzfgVar2 == null) {
                                                                z12 = true;
                                                                i29 = i69;
                                                                i32 = -1;
                                                                zzfgVar2 = null;
                                                            } else if (zzfgVar2.zza.size() >= 2) {
                                                                zzacz.zzb(zzahvVar.zzb(), "both eye views must be marked as available");
                                                                zzahnVar2 = zzahvVar.zza;
                                                                zzahqVar2 = zzahnVar2.zza;
                                                                z14 = zzahqVar2.zzc;
                                                                zzacz.zzb(!z14, "for MV-HEVC, eye_views_reversed must be set to false");
                                                                i30 = i53;
                                                                list = list2;
                                                                i29 = i69;
                                                                zzfgVar = zzfgVar2;
                                                                zzfgVar2 = zzfgVar;
                                                                i56 = i28;
                                                                i53 = i30;
                                                                list2 = list;
                                                            } else {
                                                                z12 = true;
                                                                i29 = i69;
                                                                i32 = -1;
                                                            }
                                                            if (i29 != i32) {
                                                                i56 = i28;
                                                                break;
                                                                break;
                                                            }
                                                            zzahnVar = zzahvVar.zza;
                                                            zzahqVar = zzahnVar.zza;
                                                            z13 = zzahqVar.zzc;
                                                            if (z12 == z13) {
                                                                i29 = 5;
                                                                i56 = i28;
                                                                break;
                                                                break;
                                                            }
                                                            i56 = i28;
                                                            i29 = 4;
                                                            break;
                                                        }
                                                        i29 = i69;
                                                        i30 = i53;
                                                        zzfgVar = zzfgVar2;
                                                        list = list2;
                                                        zzfgVar2 = zzfgVar;
                                                        i56 = i28;
                                                        i53 = i30;
                                                        list2 = list;
                                                    } else {
                                                        i27 = i55;
                                                        str8 = str17;
                                                        i28 = i56;
                                                        zzahrVar2 = zzahrVar4;
                                                        str6 = str23;
                                                        i29 = i69;
                                                        if (zzg10 == 1685480259 || zzg10 == 1685485123) {
                                                            i30 = i53;
                                                            zzfgVar = zzfgVar2;
                                                            list = list2;
                                                            zzacr zza9 = zzacr.zza(zzedVar);
                                                            if (zza9 != null) {
                                                                str18 = zza9.zza;
                                                                str19 = "video/dolby-vision";
                                                            }
                                                        } else if (zzg10 != 1987076931) {
                                                            int i84 = i52;
                                                            if (zzg10 != 1635135811) {
                                                                if (zzg10 == 1668050025) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = zzn();
                                                                    }
                                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                                    byteBuffer2.position(21);
                                                                    byteBuffer2.putShort(zzedVar.zzE());
                                                                    byteBuffer2.putShort(zzedVar.zzE());
                                                                    byteBuffer = byteBuffer2;
                                                                    i52 = i84;
                                                                    i56 = i28;
                                                                } else {
                                                                    if (zzg10 == 1835295606) {
                                                                        if (byteBuffer == null) {
                                                                            byteBuffer = zzn();
                                                                        }
                                                                        ByteBuffer byteBuffer3 = byteBuffer;
                                                                        short zzE = zzedVar.zzE();
                                                                        short zzE2 = zzedVar.zzE();
                                                                        short zzE3 = zzedVar.zzE();
                                                                        short zzE4 = zzedVar.zzE();
                                                                        short zzE5 = zzedVar.zzE();
                                                                        i52 = i84;
                                                                        short zzE6 = zzedVar.zzE();
                                                                        zzfgVar = zzfgVar2;
                                                                        short zzE7 = zzedVar.zzE();
                                                                        i30 = i53;
                                                                        short zzE8 = zzedVar.zzE();
                                                                        long zzu5 = zzedVar.zzu();
                                                                        long zzu6 = zzedVar.zzu();
                                                                        list = list2;
                                                                        byteBuffer3.position(1);
                                                                        byteBuffer3.putShort(zzE5);
                                                                        byteBuffer3.putShort(zzE6);
                                                                        byteBuffer3.putShort(zzE);
                                                                        byteBuffer3.putShort(zzE2);
                                                                        byteBuffer3.putShort(zzE3);
                                                                        byteBuffer3.putShort(zzE4);
                                                                        byteBuffer3.putShort(zzE7);
                                                                        byteBuffer3.putShort(zzE8);
                                                                        byteBuffer3.putShort((short) (zzu5 / 10000));
                                                                        byteBuffer3.putShort((short) (zzu6 / 10000));
                                                                        byteBuffer = byteBuffer3;
                                                                    } else {
                                                                        i30 = i53;
                                                                        i52 = i84;
                                                                        zzfgVar = zzfgVar2;
                                                                        list = list2;
                                                                        if (zzg10 == 1681012275) {
                                                                            if (str19 == null) {
                                                                                str10 = null;
                                                                                z10 = true;
                                                                            } else {
                                                                                str10 = null;
                                                                                z10 = false;
                                                                            }
                                                                            zzacz.zzb(z10, str10);
                                                                            str19 = str2;
                                                                        } else if (zzg10 == 1702061171) {
                                                                            zzacz.zzb(str19 == null, null);
                                                                            zzahm zzm2 = zzm(zzedVar, zzd5);
                                                                            str9 = zzm2.zza;
                                                                            bArr = zzm2.zzb;
                                                                            if (bArr != null) {
                                                                                zzahmVar = zzm2;
                                                                                str19 = str9;
                                                                                list2 = zzfwh.zzo(bArr);
                                                                                zzfgVar2 = zzfgVar;
                                                                                i56 = i28;
                                                                                i53 = i30;
                                                                            } else {
                                                                                zzahmVar = zzm2;
                                                                                str19 = str9;
                                                                            }
                                                                        } else if (zzg10 == 1885434736) {
                                                                            zzedVar.zzL(zzd5 + 8);
                                                                            f7 = zzedVar.zzp() / zzedVar.zzp();
                                                                            zzfgVar2 = zzfgVar;
                                                                            i56 = i28;
                                                                            i53 = i30;
                                                                            list2 = list;
                                                                            z21 = true;
                                                                        } else if (zzg10 == 1937126244) {
                                                                            int i85 = zzd5 + 8;
                                                                            while (i85 - zzd5 < i25) {
                                                                                zzedVar.zzL(i85);
                                                                                int zzg13 = zzedVar.zzg() + i85;
                                                                                if (zzedVar.zzg() == 1886547818) {
                                                                                    bArr2 = Arrays.copyOfRange(zzedVar.zzN(), i85, zzg13);
                                                                                } else {
                                                                                    i85 = zzg13;
                                                                                }
                                                                            }
                                                                            zzfgVar2 = zzfgVar;
                                                                            i56 = i28;
                                                                            i53 = i30;
                                                                            list2 = list;
                                                                            bArr2 = null;
                                                                        } else if (zzg10 == 1936995172) {
                                                                            int zzm3 = zzedVar.zzm();
                                                                            zzedVar.zzM(3);
                                                                            if (zzm3 == 0) {
                                                                                int zzm4 = zzedVar.zzm();
                                                                                if (zzm4 == 0) {
                                                                                    zzfgVar2 = zzfgVar;
                                                                                    i56 = i28;
                                                                                    i53 = i30;
                                                                                    list2 = list;
                                                                                    i29 = 0;
                                                                                } else if (zzm4 == 1) {
                                                                                    zzfgVar2 = zzfgVar;
                                                                                    i56 = i28;
                                                                                    i53 = i30;
                                                                                    list2 = list;
                                                                                    i29 = 1;
                                                                                } else if (zzm4 == 2) {
                                                                                    zzfgVar2 = zzfgVar;
                                                                                    i56 = i28;
                                                                                    i53 = i30;
                                                                                    list2 = list;
                                                                                    i29 = 2;
                                                                                } else if (zzm4 == 3) {
                                                                                    i29 = 3;
                                                                                }
                                                                            }
                                                                        } else if (zzg10 == 1634760259) {
                                                                            int i86 = i25 - 12;
                                                                            byte[] bArr3 = new byte[i86];
                                                                            zzedVar.zzL(zzd5 + 12);
                                                                            zzedVar.zzH(bArr3, 0, i86);
                                                                            zzfwh zzo = zzfwh.zzo(bArr3);
                                                                            zzed zzedVar5 = new zzed(bArr3);
                                                                            zzi zziVar = new zzi();
                                                                            byte[] zzN = zzedVar5.zzN();
                                                                            zzec zzecVar = new zzec(zzN, zzN.length);
                                                                            int i87 = 8;
                                                                            zzecVar.zzl(zzedVar5.zzd() * 8);
                                                                            int i88 = 1;
                                                                            zzecVar.zzo(1);
                                                                            int zzd8 = zzecVar.zzd(8);
                                                                            int i89 = 0;
                                                                            while (i89 < zzd8) {
                                                                                zzecVar.zzo(i88);
                                                                                int zzd9 = zzecVar.zzd(i87);
                                                                                int i90 = 0;
                                                                                while (i90 < zzd9) {
                                                                                    zzecVar.zzn(6);
                                                                                    boolean zzp = zzecVar.zzp();
                                                                                    zzecVar.zzm();
                                                                                    zzecVar.zzo(11);
                                                                                    zzecVar.zzn(4);
                                                                                    int zzd10 = zzecVar.zzd(4) + 8;
                                                                                    zziVar.zzf(zzd10);
                                                                                    zziVar.zza(zzd10);
                                                                                    zzecVar.zzo(1);
                                                                                    if (zzp) {
                                                                                        int zzd11 = zzecVar.zzd(i87);
                                                                                        int zzd12 = zzecVar.zzd(i87);
                                                                                        zzecVar.zzo(1);
                                                                                        boolean zzp2 = zzecVar.zzp();
                                                                                        zziVar.zzc(zzk.zza(zzd11));
                                                                                        zziVar.zzb(true != zzp2 ? 2 : 1);
                                                                                        zziVar.zzd(zzk.zzb(zzd12));
                                                                                    }
                                                                                    i90++;
                                                                                    i87 = 8;
                                                                                }
                                                                                i89++;
                                                                                i88 = 1;
                                                                                i87 = 8;
                                                                            }
                                                                            zzk zzg14 = zziVar.zzg();
                                                                            int i91 = zzg14.zzf;
                                                                            int i92 = zzg14.zzg;
                                                                            int i93 = zzg14.zzb;
                                                                            int i94 = zzg14.zzc;
                                                                            list2 = zzo;
                                                                            i27 = i92;
                                                                            str19 = "video/apv";
                                                                            zzfgVar2 = zzfgVar;
                                                                            i57 = zzg14.zzd;
                                                                            i53 = i94;
                                                                            i56 = i91;
                                                                            i54 = i93;
                                                                        } else if (zzg10 == 1668246642 && i54 == -1) {
                                                                            if (i57 == -1) {
                                                                                int zzg15 = zzedVar.zzg();
                                                                                if (zzg15 == 1852009592 || zzg15 == 1852009571) {
                                                                                    int zzq4 = zzedVar.zzq();
                                                                                    int zzq5 = zzedVar.zzq();
                                                                                    zzedVar.zzM(2);
                                                                                    if (i25 == 19) {
                                                                                        if ((zzedVar.zzm() & 128) != 0) {
                                                                                            i25 = 19;
                                                                                            z9 = true;
                                                                                            int zza10 = zzk.zza(zzq4);
                                                                                            int i95 = true == z9 ? 2 : 1;
                                                                                            int zzb8 = zzk.zzb(zzq5);
                                                                                            zzfgVar2 = zzfgVar;
                                                                                            i56 = i28;
                                                                                            list2 = list;
                                                                                            i54 = zza10;
                                                                                            i53 = i95;
                                                                                            i57 = zzb8;
                                                                                        } else {
                                                                                            i25 = 19;
                                                                                        }
                                                                                    }
                                                                                    z9 = false;
                                                                                    int zza102 = zzk.zza(zzq4);
                                                                                    if (true == z9) {
                                                                                    }
                                                                                    int zzb82 = zzk.zzb(zzq5);
                                                                                    zzfgVar2 = zzfgVar;
                                                                                    i56 = i28;
                                                                                    list2 = list;
                                                                                    i54 = zza102;
                                                                                    i53 = i95;
                                                                                    i57 = zzb82;
                                                                                } else {
                                                                                    zzdq.zzf("BoxParsers", "Unsupported color type: ".concat(zzet.zze(zzg15)));
                                                                                    i54 = -1;
                                                                                    i57 = -1;
                                                                                }
                                                                            } else {
                                                                                i54 = -1;
                                                                            }
                                                                        }
                                                                    }
                                                                    zzfgVar2 = zzfgVar;
                                                                    i56 = i28;
                                                                    i53 = i30;
                                                                    list2 = list;
                                                                }
                                                                break;
                                                                break;
                                                            }
                                                            int i96 = i25 - 8;
                                                            byte[] bArr4 = new byte[i96];
                                                            zzedVar.zzH(bArr4, 0, i96);
                                                            zzfwh zzo2 = zzfwh.zzo(bArr4);
                                                            zzedVar.zzL(zzd5 + 8);
                                                            zzk zzk = zzk(zzedVar);
                                                            int i97 = zzk.zzf;
                                                            int i98 = zzk.zzg;
                                                            int i99 = zzk.zzb;
                                                            int i100 = zzk.zzc;
                                                            i52 = i84;
                                                            i27 = i98;
                                                            str19 = "video/av01";
                                                            list2 = zzo2;
                                                            i56 = i97;
                                                            i54 = i99;
                                                            i57 = zzk.zzd;
                                                            i53 = i100;
                                                        } else {
                                                            int i101 = zzd5 + 12;
                                                            zzacz.zzb(str19 == null, null);
                                                            zzedVar.zzL(i101);
                                                            byte zzm5 = (byte) zzedVar.zzm();
                                                            byte zzm6 = (byte) zzedVar.zzm();
                                                            int zzm7 = zzedVar.zzm();
                                                            i56 = zzm7 >> 4;
                                                            int i102 = zzm7 >> 1;
                                                            int i103 = i52;
                                                            String str24 = i103 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                            if (str24.equals("video/x-vnd.on2.vp9")) {
                                                                int i104 = zzda.zza;
                                                                i31 = 1;
                                                                z11 = false;
                                                                list2 = zzfwh.zzo(new byte[]{1, 1, zzm5, 2, 1, zzm6, 3, 1, (byte) i56, 4, 1, (byte) (i102 & 7)});
                                                            } else {
                                                                i31 = 1;
                                                                z11 = false;
                                                            }
                                                            int i105 = zzm7 & 1;
                                                            int zzm8 = zzedVar.zzm();
                                                            int zzm9 = zzedVar.zzm();
                                                            int zza11 = zzk.zza(zzm8);
                                                            int i106 = i31 != i105 ? 2 : 1;
                                                            int zzb9 = zzk.zzb(zzm9);
                                                            i54 = zza11;
                                                            i52 = i103;
                                                            i27 = i56;
                                                            i53 = i106;
                                                            str19 = str24;
                                                            i57 = zzb9;
                                                        }
                                                        zzfgVar2 = zzfgVar;
                                                        i56 = i28;
                                                        i53 = i30;
                                                        list2 = list;
                                                    }
                                                }
                                            }
                                            i60 = i24 + i25;
                                            i61 = i29;
                                            zzd3 = i26;
                                            zzg7 = i62;
                                            zzahrVar4 = zzahrVar2;
                                            i55 = i27;
                                            str17 = str8;
                                        }
                                        i20 = zzd3;
                                        int i107 = i53;
                                        int i108 = i61;
                                        int i109 = i55;
                                        int i110 = i56;
                                        List list5 = list2;
                                        zzahr zzahrVar5 = zzahrVar4;
                                        i21 = zzg7;
                                        c3 = 65535;
                                        c4 = '\f';
                                        if (str19 == null) {
                                            i22 = i50;
                                            zzahrVar = zzahrVar5;
                                            i23 = i49;
                                        } else {
                                            zzx zzxVar = new zzx();
                                            i22 = i50;
                                            zzxVar.zzN(i22);
                                            zzxVar.zzad(str19);
                                            zzxVar.zzC(str18);
                                            zzxVar.zzai(zzq2);
                                            zzxVar.zzM(zzq3);
                                            zzxVar.zzZ(f7);
                                            i23 = i49;
                                            zzxVar.zzac(i23);
                                            zzxVar.zzaa(bArr2);
                                            zzxVar.zzag(i108);
                                            zzxVar.zzP(list5);
                                            zzxVar.zzU(i58);
                                            zzxVar.zzV(i59);
                                            zzxVar.zzH(zzsVar3);
                                            zzi zziVar2 = new zzi();
                                            zziVar2.zzc(i54);
                                            zziVar2.zzb(i107);
                                            zziVar2.zzd(i57);
                                            zziVar2.zze(byteBuffer != null ? byteBuffer.array() : null);
                                            zziVar2.zzf(i110);
                                            zziVar2.zza(i109);
                                            zzxVar.zzD(zziVar2.zzg());
                                            if (zzahmVar != null) {
                                                j14 = zzahmVar.zzc;
                                                zzxVar.zzA(zzfzk.zze(j14));
                                                j15 = zzahmVar.zzd;
                                                zzxVar.zzY(zzfzk.zze(j15));
                                            }
                                            zzahrVar = zzahrVar5;
                                            zzahrVar.zzb = zzxVar.zzaj();
                                        }
                                    } else {
                                        if (zzg8 == 1836069985 || zzg8 == 1701733217 || zzg8 == 1633889587 || zzg8 == 1700998451 || zzg8 == 1633889588 || zzg8 == 1835823201 || zzg8 == 1685353315 || zzg8 == 1685353317 || zzg8 == 1685353320 || zzg8 == 1685353324 || zzg8 == 1685353336 || zzg8 == 1935764850 || zzg8 == 1935767394 || zzg8 == 1819304813 || zzg8 == 1936684916 || zzg8 == 1953984371 || zzg8 == 778924082 || zzg8 == 778924083 || zzg8 == 1835557169 || zzg8 == 1835560241 || zzg8 == 1634492771 || zzg8 == 1634492791 || zzg8 == 1970037111 || zzg8 == 1332770163 || zzg8 == 1716281667) {
                                            i34 = i11;
                                            str6 = str14;
                                            i35 = zzg8;
                                            i17 = i45;
                                        } else if (zzg8 == 1767992678) {
                                            i34 = i11;
                                            str6 = str14;
                                            i17 = i45;
                                            i35 = zzg8;
                                        } else if (zzg8 == 1414810956 || zzg8 == 1954034535 || zzg8 == 2004251764 || zzg8 == 1937010800 || zzg8 == 1664495672) {
                                            zzedVar4.zzL(zzd3 + 16);
                                            if (zzg8 == 1414810956) {
                                                i36 = i11;
                                                str6 = str14;
                                                str13 = str3;
                                            } else if (zzg8 == 1954034535) {
                                                int i111 = zzg7 - 16;
                                                byte[] bArr5 = new byte[i111];
                                                zzedVar4.zzH(bArr5, 0, i111);
                                                zzfwhVar = zzfwh.zzo(bArr5);
                                                str13 = "application/x-quicktime-tx3g";
                                                i36 = i11;
                                                str6 = str14;
                                                j16 = Long.MAX_VALUE;
                                                zzx zzxVar2 = new zzx();
                                                zzxVar2.zzN(i10);
                                                zzxVar2.zzad(str13);
                                                zzxVar2.zzS(str);
                                                zzxVar2.zzah(j16);
                                                zzxVar2.zzP(zzfwhVar);
                                                zzahrVar4.zzb = zzxVar2.zzaj();
                                                i20 = zzd3;
                                                i15 = zzg6;
                                                zzedVar = zzedVar4;
                                                i16 = i42;
                                                arrayList2 = arrayList4;
                                                str5 = str;
                                                i22 = i10;
                                                zzahrVar = zzahrVar4;
                                                i21 = zzg7;
                                                i23 = i36;
                                                i17 = i45;
                                                zzeqVar3 = zzeqVar6;
                                                j13 = j10;
                                                c3 = 65535;
                                                c4 = '\f';
                                                i19 = i47;
                                            } else if (zzg8 == 2004251764) {
                                                str13 = "application/x-mp4-vtt";
                                                i36 = i11;
                                                str6 = str14;
                                            } else {
                                                str6 = str14;
                                                if (zzg8 == 1937010800) {
                                                    i36 = i11;
                                                    str13 = str3;
                                                    j16 = 0;
                                                } else {
                                                    zzahrVar4.zzd = 1;
                                                    i36 = i11;
                                                    str13 = "application/x-mp4-cea-608";
                                                    j16 = Long.MAX_VALUE;
                                                }
                                                zzfwhVar = null;
                                                zzx zzxVar22 = new zzx();
                                                zzxVar22.zzN(i10);
                                                zzxVar22.zzad(str13);
                                                zzxVar22.zzS(str);
                                                zzxVar22.zzah(j16);
                                                zzxVar22.zzP(zzfwhVar);
                                                zzahrVar4.zzb = zzxVar22.zzaj();
                                                i20 = zzd3;
                                                i15 = zzg6;
                                                zzedVar = zzedVar4;
                                                i16 = i42;
                                                arrayList2 = arrayList4;
                                                str5 = str;
                                                i22 = i10;
                                                zzahrVar = zzahrVar4;
                                                i21 = zzg7;
                                                i23 = i36;
                                                i17 = i45;
                                                zzeqVar3 = zzeqVar6;
                                                j13 = j10;
                                                c3 = 65535;
                                                c4 = '\f';
                                                i19 = i47;
                                            }
                                            j16 = Long.MAX_VALUE;
                                            zzfwhVar = null;
                                            zzx zzxVar222 = new zzx();
                                            zzxVar222.zzN(i10);
                                            zzxVar222.zzad(str13);
                                            zzxVar222.zzS(str);
                                            zzxVar222.zzah(j16);
                                            zzxVar222.zzP(zzfwhVar);
                                            zzahrVar4.zzb = zzxVar222.zzaj();
                                            i20 = zzd3;
                                            i15 = zzg6;
                                            zzedVar = zzedVar4;
                                            i16 = i42;
                                            arrayList2 = arrayList4;
                                            str5 = str;
                                            i22 = i10;
                                            zzahrVar = zzahrVar4;
                                            i21 = zzg7;
                                            i23 = i36;
                                            i17 = i45;
                                            zzeqVar3 = zzeqVar6;
                                            j13 = j10;
                                            c3 = 65535;
                                            c4 = '\f';
                                            i19 = i47;
                                        } else {
                                            if (zzg8 == 1835365492) {
                                                zzedVar4.zzL(zzd3 + 16);
                                                zzedVar4.zzy((char) 0);
                                                String zzy = zzedVar4.zzy((char) 0);
                                                if (zzy != null) {
                                                    zzx zzxVar3 = new zzx();
                                                    zzxVar3.zzN(i10);
                                                    zzxVar3.zzad(zzy);
                                                    zzahrVar4.zzb = zzxVar3.zzaj();
                                                }
                                            } else if (zzg8 == 1667329389) {
                                                zzx zzxVar4 = new zzx();
                                                zzxVar4.zzN(i10);
                                                zzxVar4.zzad("application/x-camera-motion");
                                                zzahrVar4.zzb = zzxVar4.zzaj();
                                            }
                                            i20 = zzd3;
                                            i15 = zzg6;
                                            i16 = i42;
                                            arrayList2 = arrayList4;
                                            str5 = str;
                                            i23 = i11;
                                            i22 = i10;
                                            str6 = str14;
                                            zzahrVar = zzahrVar4;
                                            i21 = zzg7;
                                            i17 = i45;
                                            zzeqVar3 = zzeqVar6;
                                            j13 = j10;
                                            c3 = 65535;
                                            zzedVar = zzedVar4;
                                            i19 = i47;
                                            c4 = '\f';
                                        }
                                        i15 = zzg6;
                                        zzeqVar3 = zzeqVar6;
                                        zzedVar = zzedVar4;
                                        i16 = i42;
                                        arrayList2 = arrayList4;
                                        str5 = str;
                                        j13 = j10;
                                        zzo(zzedVar4, i35, zzd3, zzg7, i10, str, z7, zzsVar, zzahrVar4, i47);
                                        i20 = zzd3;
                                        zzahrVar = zzahrVar4;
                                        i19 = i47;
                                        i21 = zzg7;
                                        i22 = i10;
                                        i23 = i34;
                                        c3 = 65535;
                                        c4 = '\f';
                                    }
                                    zzedVar.zzL(i20 + i21);
                                    i47 = i19 + 1;
                                    zzahrVar4 = zzahrVar;
                                    c7 = c4;
                                    i10 = i22;
                                    i11 = i23;
                                    zzedVar4 = zzedVar;
                                    str14 = str6;
                                    str = str5;
                                    zzg6 = i15;
                                    i42 = i16;
                                    i45 = i17;
                                    zzahuVar = zzahuVar2;
                                    zzahoVar = zzahoVar2;
                                    j10 = j13;
                                    zzeqVar6 = zzeqVar3;
                                    arrayList4 = arrayList2;
                                }
                                zzaho zzahoVar3 = zzahoVar;
                                int i112 = i42;
                                arrayList = arrayList4;
                                str4 = str14;
                                zzahr zzahrVar6 = zzahrVar4;
                                zzahu zzahuVar3 = zzahuVar;
                                i12 = i45;
                                zzeq zzeqVar7 = zzeqVar6;
                                long j19 = j10;
                                i39 = 4;
                                if (z4) {
                                    zzeqVar2 = zzeqVar7;
                                } else {
                                    zzeqVar2 = zzeqVar7;
                                    zzeq zza12 = zzeqVar2.zza(1701082227);
                                    if (zza12 != null) {
                                        zzer zzb10 = zza12.zzb(1701606260);
                                        if (zzb10 == null) {
                                            create = null;
                                            i13 = 8;
                                        } else {
                                            zzed zzedVar6 = zzb10.zza;
                                            i13 = 8;
                                            zzedVar6.zzL(8);
                                            int zza13 = zza(zzedVar6.zzg());
                                            int zzp3 = zzedVar6.zzp();
                                            long[] jArr3 = new long[zzp3];
                                            long[] jArr4 = new long[zzp3];
                                            for (int i113 = 0; i113 < zzp3; i113++) {
                                                jArr3[i113] = zza13 == 1 ? zzedVar6.zzw() : zzedVar6.zzu();
                                                jArr4[i113] = zza13 == 1 ? zzedVar6.zzt() : zzedVar6.zzg();
                                                if (zzedVar6.zzE() != 1) {
                                                    throw new IllegalArgumentException("Unsupported media rate.");
                                                }
                                                zzedVar6.zzM(2);
                                            }
                                            create = Pair.create(jArr3, jArr4);
                                        }
                                        if (create != null) {
                                            jArr2 = (long[]) create.first;
                                            jArr = (long[]) create.second;
                                            zzzVar = zzahrVar6.zzb;
                                            if (zzzVar == null) {
                                                zzfswVar2 = zzfswVar;
                                                zzaioVar = null;
                                            } else {
                                                i14 = zzahuVar3.zza;
                                                j11 = zzahoVar3.zza;
                                                j12 = zzahoVar3.zzb;
                                                zzaioVar = new zzaio(i14, i112, j11, j19, zzu2, j12, zzzVar, zzahrVar6.zzd, zzahrVar6.zza, zzahrVar6.zzc, jArr2, jArr);
                                                zzfswVar2 = zzfswVar;
                                            }
                                        }
                                        jArr = null;
                                        jArr2 = null;
                                        zzzVar = zzahrVar6.zzb;
                                        if (zzzVar == null) {
                                        }
                                    }
                                }
                                i13 = 8;
                                jArr = null;
                                jArr2 = null;
                                zzzVar = zzahrVar6.zzb;
                                if (zzzVar == null) {
                                }
                            } else {
                                zzg3 = 65536;
                                zzg4 = -65536;
                            }
                        }
                        zzg2 = 0;
                    }
                    if (zzg2 == 0) {
                        if (zzg3 == -65536) {
                            if (zzg4 != 65536) {
                                i46 = zzg4;
                            } else if (zzg5 == 0) {
                                i7 = 270;
                                zzahu zzahuVar4 = new zzahu(zzg, j7, i7);
                                if (j == -9223372036854775807L) {
                                }
                                j9 = zzd(zzb3.zza).zzc;
                                if (j8 == -9223372036854775807L) {
                                }
                                zzeq zza52 = zza3.zza(1835626086);
                                zza52.getClass();
                                zzeq zza62 = zza52.zza(1937007212);
                                zza62.getClass();
                                zzer zzb62 = zza3.zzb(1835296868);
                                zzb62.getClass();
                                zzed zzedVar32 = zzb62.zza;
                                zzedVar32.zzL(8);
                                zza2 = zza(zzedVar32.zzg());
                                zzedVar32.zzM(zza2 == 0 ? 8 : 16);
                                long zzu32 = zzedVar32.zzu();
                                int zzd22 = zzedVar32.zzd();
                                i8 = 0;
                                while (true) {
                                    if (zza2 == 0) {
                                    }
                                    if (i8 >= i9) {
                                    }
                                    i8++;
                                    j9 = j10;
                                }
                                long j182 = j3;
                                int zzq6 = zzedVar32.zzq();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append((char) (((zzq6 >> 10) & 31) + 96));
                                sb2.append((char) (((zzq6 >> 5) & 31) + 96));
                                sb2.append((char) ((zzq6 & 31) + 96));
                                zzaho zzahoVar4 = new zzaho(zzu32, j182, sb2.toString());
                                zzb2 = zza62.zzb(1937011556);
                                if (zzb2 == null) {
                                }
                            }
                            zzg3 = -65536;
                        } else {
                            i46 = zzg4;
                        }
                        zzg2 = 0;
                    } else {
                        i46 = zzg4;
                    }
                    i7 = (zzg2 == -65536 && zzg3 == 0 && i46 == 0 && zzg5 == -65536) ? 180 : 0;
                    zzahu zzahuVar42 = new zzahu(zzg, j7, i7);
                    if (j == -9223372036854775807L) {
                    }
                    j9 = zzd(zzb3.zza).zzc;
                    if (j8 == -9223372036854775807L) {
                    }
                    zzeq zza522 = zza3.zza(1835626086);
                    zza522.getClass();
                    zzeq zza622 = zza522.zza(1937007212);
                    zza622.getClass();
                    zzer zzb622 = zza3.zzb(1835296868);
                    zzb622.getClass();
                    zzed zzedVar322 = zzb622.zza;
                    zzedVar322.zzL(8);
                    zza2 = zza(zzedVar322.zzg());
                    zzedVar322.zzM(zza2 == 0 ? 8 : 16);
                    long zzu322 = zzedVar322.zzu();
                    int zzd222 = zzedVar322.zzd();
                    i8 = 0;
                    while (true) {
                        if (zza2 == 0) {
                        }
                        if (i8 >= i9) {
                        }
                        i8++;
                        j9 = j10;
                    }
                    long j1822 = j3;
                    int zzq62 = zzedVar322.zzq();
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append((char) (((zzq62 >> 10) & 31) + 96));
                    sb22.append((char) (((zzq62 >> 5) & 31) + 96));
                    sb22.append((char) ((zzq62 & 31) + 96));
                    zzaho zzahoVar42 = new zzaho(zzu322, j1822, sb22.toString());
                    zzb2 = zza622.zzb(1937011556);
                    if (zzb2 == null) {
                    }
                }
                zzaio zzaioVar2 = (zzaio) zzfswVar2.apply(zzaioVar);
                if (zzaioVar2 != null) {
                    i37 = 1835297121;
                    zzeq zza14 = zzeqVar2.zza(1835297121);
                    zza14.getClass();
                    zzeq zza15 = zza14.zza(1835626086);
                    zza15.getClass();
                    zzeq zza16 = zza15.zza(1937007212);
                    zza16.getClass();
                    zzair zze = zze(zzaioVar2, zza16, zzadjVar);
                    arrayList3 = arrayList;
                    arrayList3.add(zze);
                } else {
                    arrayList3 = arrayList;
                    i37 = 1835297121;
                }
            }
            zzeqVar4 = zzeqVar;
            i40 = i13;
            i38 = i37;
            i41 = i12 + 1;
            str14 = str4;
            str15 = str2;
            str16 = str3;
            arrayList4 = arrayList3;
        }
        return arrayList4;
    }

    public static void zzg(zzed zzedVar) {
        int zzd = zzedVar.zzd();
        zzedVar.zzM(4);
        if (zzedVar.zzg() != 1751411826) {
            zzd += 4;
        }
        zzedVar.zzL(zzd);
    }

    private static int zzh(zzed zzedVar) {
        int zzm = zzedVar.zzm();
        int i7 = zzm & 127;
        while ((zzm & 128) == 128) {
            zzm = zzedVar.zzm();
            i7 = (i7 << 7) | (zzm & 127);
        }
        return i7;
    }

    private static int zzi(zzed zzedVar) {
        zzedVar.zzL(16);
        return zzedVar.zzg();
    }

    private static Pair zzj(zzed zzedVar, int i7, int i8) {
        Integer num;
        zzaip zzaipVar;
        Pair create;
        int i9;
        int i10;
        byte[] bArr;
        int zzd = zzedVar.zzd();
        while (zzd - i7 < i8) {
            zzedVar.zzL(zzd);
            int zzg = zzedVar.zzg();
            zzacz.zzb(zzg > 0, "childAtomSize must be positive");
            if (zzedVar.zzg() == 1936289382) {
                int i11 = zzd + 8;
                int i12 = 0;
                int i13 = -1;
                String str = null;
                Integer num2 = null;
                while (i11 - zzd < zzg) {
                    zzedVar.zzL(i11);
                    int zzg2 = zzedVar.zzg();
                    int zzg3 = zzedVar.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzedVar.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzedVar.zzM(4);
                        str = zzedVar.zzB(4, StandardCharsets.UTF_8);
                    } else if (zzg3 == 1935894633) {
                        i13 = i11;
                        i12 = zzg2;
                    }
                    i11 += zzg2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzacz.zzb(num2 != null, "frma atom is mandatory");
                    zzacz.zzb(i13 != -1, "schi atom is mandatory");
                    int i14 = i13 + 8;
                    while (true) {
                        if (i14 - i13 >= i12) {
                            num = num2;
                            zzaipVar = null;
                            break;
                        }
                        zzedVar.zzL(i14);
                        int zzg4 = zzedVar.zzg();
                        if (zzedVar.zzg() == 1952804451) {
                            int zza2 = zza(zzedVar.zzg());
                            zzedVar.zzM(1);
                            if (zza2 == 0) {
                                zzedVar.zzM(1);
                                i9 = 0;
                                i10 = 0;
                            } else {
                                int zzm = zzedVar.zzm();
                                int i15 = (zzm & 240) >> 4;
                                i9 = zzm & 15;
                                i10 = i15;
                            }
                            boolean z4 = zzedVar.zzm() == 1;
                            int zzm2 = zzedVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzedVar.zzH(bArr2, 0, 16);
                            if (z4 && zzm2 == 0) {
                                int zzm3 = zzedVar.zzm();
                                byte[] bArr3 = new byte[zzm3];
                                zzedVar.zzH(bArr3, 0, zzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzaipVar = new zzaip(z4, str, zzm2, bArr2, i10, i9, bArr);
                        } else {
                            i14 += zzg4;
                        }
                    }
                    zzacz.zzb(zzaipVar != null, "tenc atom is mandatory");
                    int i16 = zzen.zza;
                    create = Pair.create(num, zzaipVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzd += zzg;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0141, code lost:
    
        if (r6 == 1) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzk zzk(zzed zzedVar) {
        int i7;
        int zzd;
        int zzd2;
        zzi zziVar = new zzi();
        byte[] zzN = zzedVar.zzN();
        zzec zzecVar = new zzec(zzN, zzN.length);
        zzecVar.zzl(zzedVar.zzd() * 8);
        zzecVar.zzo(1);
        int zzd3 = zzecVar.zzd(3);
        zzecVar.zzn(6);
        boolean zzp = zzecVar.zzp();
        boolean zzp2 = zzecVar.zzp();
        boolean z4 = false;
        if (zzd3 == 2) {
            if (zzp) {
                i7 = true == zzp2 ? 12 : 10;
                zziVar.zzf(i7);
                zziVar.zza(i7);
                int i8 = 13;
                zzecVar.zzn(13);
                zzecVar.zzm();
                zzd = zzecVar.zzd(4);
                if (zzd == 1) {
                    zzdq.zze("BoxParsers", "Unsupported obu_type: " + zzd);
                    return zziVar.zzg();
                }
                if (zzecVar.zzp()) {
                    zzdq.zze("BoxParsers", "Unsupported obu_extension_flag");
                    return zziVar.zzg();
                }
                boolean zzp3 = zzecVar.zzp();
                zzecVar.zzm();
                if (zzp3 && zzecVar.zzd(8) > 127) {
                    zzdq.zze("BoxParsers", "Excessive obu_size");
                    return zziVar.zzg();
                }
                int zzd4 = zzecVar.zzd(3);
                zzecVar.zzm();
                if (zzecVar.zzp()) {
                    zzdq.zze("BoxParsers", "Unsupported reduced_still_picture_header");
                    return zziVar.zzg();
                }
                if (zzecVar.zzp()) {
                    zzdq.zze("BoxParsers", "Unsupported timing_info_present_flag");
                    return zziVar.zzg();
                }
                if (zzecVar.zzp()) {
                    zzdq.zze("BoxParsers", "Unsupported initial_display_delay_present_flag");
                    return zziVar.zzg();
                }
                int zzd5 = zzecVar.zzd(5);
                for (int i9 = 0; i9 <= zzd5; i9++) {
                    zzecVar.zzn(12);
                    if (zzecVar.zzd(5) > 7) {
                        zzecVar.zzm();
                    }
                }
                int zzd6 = zzecVar.zzd(4);
                int zzd7 = zzecVar.zzd(4);
                zzecVar.zzn(zzd6 + 1);
                zzecVar.zzn(zzd7 + 1);
                if (zzecVar.zzp()) {
                    zzecVar.zzn(7);
                }
                zzecVar.zzn(7);
                boolean zzp4 = zzecVar.zzp();
                if (zzp4) {
                    zzecVar.zzn(2);
                }
                if ((zzecVar.zzp() || zzecVar.zzd(1) > 0) && !zzecVar.zzp()) {
                    zzecVar.zzn(1);
                }
                if (zzp4) {
                    zzecVar.zzn(3);
                }
                zzecVar.zzn(3);
                boolean zzp5 = zzecVar.zzp();
                if (zzd4 == 2) {
                    if (zzp5) {
                        zzecVar.zzm();
                    }
                }
                if (zzecVar.zzp()) {
                    z4 = true;
                }
                if (zzecVar.zzp()) {
                    int zzd8 = zzecVar.zzd(8);
                    int zzd9 = zzecVar.zzd(8);
                    int zzd10 = zzecVar.zzd(8);
                    if (!z4 && zzd8 == 1) {
                        if (zzd9 != 13) {
                            zzd8 = 1;
                        } else if (zzd10 == 0) {
                            zzd2 = 1;
                            zzd8 = 1;
                            zziVar.zzc(zzk.zza(zzd8));
                            zziVar.zzb(zzd2 != 1 ? 2 : 1);
                            zziVar.zzd(zzk.zzb(i8));
                        } else {
                            zzd8 = 1;
                            zzd2 = zzecVar.zzd(1);
                            zziVar.zzc(zzk.zza(zzd8));
                            zziVar.zzb(zzd2 != 1 ? 2 : 1);
                            zziVar.zzd(zzk.zzb(i8));
                        }
                    }
                    i8 = zzd9;
                    zzd2 = zzecVar.zzd(1);
                    zziVar.zzc(zzk.zza(zzd8));
                    zziVar.zzb(zzd2 != 1 ? 2 : 1);
                    zziVar.zzd(zzk.zzb(i8));
                }
                return zziVar.zzg();
            }
            zzp = false;
            zzd3 = 2;
        }
        if (zzd3 <= 2) {
            i7 = true != zzp ? 8 : 10;
            zziVar.zzf(i7);
            zziVar.zza(i7);
        }
        int i82 = 13;
        zzecVar.zzn(13);
        zzecVar.zzm();
        zzd = zzecVar.zzd(4);
        if (zzd == 1) {
        }
    }

    private static zzav zzl(zzed zzedVar) {
        short zzE = zzedVar.zzE();
        zzedVar.zzM(2);
        String zzB = zzedVar.zzB(zzE, StandardCharsets.UTF_8);
        int max = Math.max(zzB.lastIndexOf(43), zzB.lastIndexOf(45));
        try {
            return new zzav(-9223372036854775807L, new zzeu(Float.parseFloat(zzB.substring(0, max)), Float.parseFloat(zzB.substring(max, zzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzahm zzm(zzed zzedVar, int i7) {
        zzedVar.zzL(i7 + 12);
        zzedVar.zzM(1);
        zzh(zzedVar);
        zzedVar.zzM(2);
        int zzm = zzedVar.zzm();
        if ((zzm & 128) != 0) {
            zzedVar.zzM(2);
        }
        if ((zzm & 64) != 0) {
            zzedVar.zzM(zzedVar.zzm());
        }
        if ((zzm & 32) != 0) {
            zzedVar.zzM(2);
        }
        zzedVar.zzM(1);
        zzh(zzedVar);
        String zzd = zzay.zzd(zzedVar.zzm());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzahm(zzd, null, -1L, -1L);
        }
        zzedVar.zzM(4);
        long zzu = zzedVar.zzu();
        long zzu2 = zzedVar.zzu();
        zzedVar.zzM(1);
        int zzh = zzh(zzedVar);
        byte[] bArr = new byte[zzh];
        zzedVar.zzH(bArr, 0, zzh);
        return new zzahm(zzd, bArr, zzu2 <= 0 ? -1L : zzu2, zzu > 0 ? zzu : -1L);
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void zzo(zzed zzedVar, int i7, int i8, int i9, int i10, String str, boolean z4, zzs zzsVar, zzahr zzahrVar, int i11) {
        int i12;
        int zzn;
        int zzg;
        int i13;
        int i14;
        String str2;
        long j;
        long j3;
        String str3;
        int i15;
        int i16;
        byte[] bArr;
        int i17;
        int i18;
        String str4;
        boolean z7;
        boolean z8;
        zzed zzedVar2 = zzedVar;
        int i19 = i7;
        int i20 = i8;
        int i21 = i9;
        zzs zzsVar2 = zzsVar;
        zzedVar2.zzL(i20 + 16);
        if (z4) {
            i12 = zzedVar.zzq();
            zzedVar2.zzM(6);
        } else {
            zzedVar2.zzM(8);
            i12 = 0;
        }
        if (i12 == 0 || i12 == 1) {
            int zzq = zzedVar.zzq();
            zzedVar2.zzM(6);
            zzn = zzedVar.zzn();
            zzedVar2.zzL(zzedVar.zzd() - 4);
            zzg = zzedVar.zzg();
            if (i12 == 1) {
                zzedVar2.zzM(16);
            }
            i13 = zzq;
            i14 = -1;
        } else {
            if (i12 != 2) {
                return;
            }
            zzedVar2.zzM(16);
            zzn = (int) Math.round(Double.longBitsToDouble(zzedVar.zzt()));
            int zzp = zzedVar.zzp();
            zzedVar2.zzM(4);
            int zzp2 = zzedVar.zzp();
            int zzp3 = zzedVar.zzp();
            int i22 = zzp3 & 1;
            int i23 = zzp3 & 2;
            if (i22 == 0) {
                if (zzp2 == 8) {
                    i14 = 3;
                } else if (zzp2 == 16) {
                    i14 = i23 != 0 ? 268435456 : 2;
                } else if (zzp2 == 24) {
                    i14 = i23 != 0 ? 1342177280 : 21;
                } else {
                    if (zzp2 == 32) {
                        i14 = i23 != 0 ? 1610612736 : 22;
                    }
                    i14 = -1;
                }
                zzedVar2.zzM(8);
                i13 = zzp;
                zzg = 0;
            } else {
                if (zzp2 == 32) {
                    i14 = 4;
                    zzedVar2.zzM(8);
                    i13 = zzp;
                    zzg = 0;
                }
                i14 = -1;
                zzedVar2.zzM(8);
                i13 = zzp;
                zzg = 0;
            }
        }
        if (i19 == 1767992678) {
            i13 = -1;
            zzn = -1;
        } else {
            if (i19 == 1935764850) {
                zzn = 8000;
            } else if (i19 == 1935767394) {
                zzn = 16000;
                i19 = 1935767394;
            }
            i13 = 1;
        }
        int zzd = zzedVar.zzd();
        int i24 = 1701733217;
        if (i19 == 1701733217) {
            Pair zzj = zzj(zzedVar2, i20, i21);
            if (zzj != null) {
                i24 = ((Integer) zzj.first).intValue();
                zzsVar2 = zzsVar2 == null ? null : zzsVar2.zzb(((zzaip) zzj.second).zzb);
                zzahrVar.zza[i11] = (zzaip) zzj.second;
            }
            i19 = i24;
            zzedVar2.zzL(zzd);
        }
        String str5 = "audio/mhm1";
        if (i19 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i19 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i19 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i19 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i19 == 1685353320 || i19 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i19 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i19 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i19 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i19 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i19 != 1936684916) {
                if (i19 == 1953984371) {
                    str2 = "audio/raw";
                    i14 = 268435456;
                } else if (i19 != 1819304813) {
                    str2 = (i19 == 778924082 || i19 == 778924083) ? "audio/mpeg" : i19 == 1835557169 ? "audio/mha1" : i19 == 1835560241 ? "audio/mhm1" : i19 == 1634492771 ? "audio/alac" : i19 == 1634492791 ? "audio/g711-alaw" : i19 == 1970037111 ? "audio/g711-mlaw" : i19 == 1332770163 ? "audio/opus" : i19 == 1716281667 ? "audio/flac" : i19 == 1835823201 ? "audio/true-hd" : i19 == 1767992678 ? "audio/iamf" : null;
                } else if (i14 != -1) {
                    str2 = "audio/raw";
                }
            }
            str2 = "audio/raw";
            i14 = 2;
        }
        int i25 = i14;
        String str6 = null;
        List list = null;
        zzahm zzahmVar = null;
        while (zzd - i20 < i21) {
            zzedVar2.zzL(zzd);
            int zzg2 = zzedVar.zzg();
            String str7 = "childAtomSize must be positive";
            zzacz.zzb(zzg2 > 0, "childAtomSize must be positive");
            int zzg3 = zzedVar.zzg();
            String str8 = str6;
            if (zzg3 == 1835557187) {
                zzedVar2.zzL(zzd + 8);
                zzedVar2.zzM(1);
                int zzm = zzedVar.zzm();
                zzedVar2.zzM(1);
                String format = Objects.equals(str2, str5) ? String.format("mhm1.%02X", Integer.valueOf(zzm)) : String.format("mha1.%02X", Integer.valueOf(zzm));
                int zzq2 = zzedVar.zzq();
                byte[] bArr2 = new byte[zzq2];
                zzedVar2.zzH(bArr2, 0, zzq2);
                list = list == null ? zzfwh.zzo(bArr2) : zzfwh.zzp(bArr2, (byte[]) list.get(0));
                str3 = str5;
                str6 = format;
            } else if (zzg3 == 1835557200) {
                zzedVar2.zzL(zzd + 8);
                int zzm2 = zzedVar.zzm();
                if (zzm2 > 0) {
                    byte[] bArr3 = new byte[zzm2];
                    zzedVar2.zzH(bArr3, 0, zzm2);
                    if (list == null) {
                        list = zzfwh.zzo(bArr3);
                        str3 = str5;
                        str6 = str8;
                    } else {
                        list = zzfwh.zzp((byte[]) list.get(0), bArr3);
                        str3 = str5;
                        str6 = str8;
                    }
                } else {
                    str3 = str5;
                    str6 = str8;
                }
            } else {
                if (zzg3 == 1702061171) {
                    str3 = str5;
                    i15 = zzd;
                    i16 = -1;
                } else if (z4 && zzg3 == 2002876005) {
                    int zzd2 = zzedVar.zzd();
                    if (zzd2 >= zzd) {
                        i18 = zzd2;
                        str4 = null;
                        z7 = true;
                    } else {
                        i18 = zzd2;
                        str4 = null;
                        z7 = false;
                    }
                    zzacz.zzb(z7, str4);
                    int i26 = i18;
                    while (true) {
                        if (i26 - zzd >= zzg2) {
                            str3 = str5;
                            i15 = -1;
                            break;
                        }
                        zzedVar2.zzL(i26);
                        int zzg4 = zzedVar.zzg();
                        if (zzg4 > 0) {
                            str3 = str5;
                            z8 = true;
                        } else {
                            str3 = str5;
                            z8 = false;
                        }
                        zzacz.zzb(z8, str7);
                        String str9 = str7;
                        if (zzedVar.zzg() == 1702061171) {
                            i15 = i26;
                            break;
                        } else {
                            i26 += zzg4;
                            str5 = str3;
                            str7 = str9;
                        }
                    }
                    i16 = -1;
                } else {
                    str3 = str5;
                    if (zzg3 == 1684103987) {
                        zzedVar2.zzL(zzd + 8);
                        zzahrVar.zzb = zzabu.zzc(zzedVar2, Integer.toString(i10), str, zzsVar2);
                    } else if (zzg3 == 1684366131) {
                        zzedVar2.zzL(zzd + 8);
                        zzahrVar.zzb = zzabu.zzd(zzedVar2, Integer.toString(i10), str, zzsVar2);
                    } else if (zzg3 == 1684103988) {
                        zzedVar2.zzL(zzd + 8);
                        zzahrVar.zzb = zzaby.zza(zzedVar2, Integer.toString(i10), str, zzsVar2);
                    } else if (zzg3 != 1684892784) {
                        if (zzg3 == 1684305011 || zzg3 == 1969517683) {
                            zzx zzxVar = new zzx();
                            zzxVar.zzN(i10);
                            zzxVar.zzad(str2);
                            zzxVar.zzB(i13);
                            zzxVar.zzae(zzn);
                            zzxVar.zzH(zzsVar2);
                            zzxVar.zzS(str);
                            zzahrVar.zzb = zzxVar.zzaj();
                        } else if (zzg3 == 1682927731) {
                            int i27 = zzg2 - 8;
                            byte[] bArr4 = zzb;
                            byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i27);
                            zzedVar2.zzL(zzd + 8);
                            zzedVar2.zzH(copyOf, bArr4.length, i27);
                            list = zzadq.zze(copyOf);
                            str6 = str8;
                        } else {
                            if (zzg3 == 1684425825) {
                                byte[] bArr5 = new byte[zzg2 - 8];
                                bArr5[0] = 102;
                                bArr5[1] = 76;
                                bArr5[2] = 97;
                                bArr5[3] = 67;
                                zzedVar2.zzL(zzd + 12);
                                zzedVar2.zzH(bArr5, 4, zzg2 - 12);
                                list = zzfwh.zzo(bArr5);
                            } else if (zzg3 == 1634492771) {
                                int i28 = zzg2 - 12;
                                byte[] bArr6 = new byte[i28];
                                zzedVar2.zzL(zzd + 12);
                                zzedVar2.zzH(bArr6, 0, i28);
                                int i29 = zzda.zza;
                                zzed zzedVar3 = new zzed(bArr6);
                                zzedVar3.zzL(9);
                                int zzm3 = zzedVar3.zzm();
                                zzedVar3.zzL(20);
                                Pair create = Pair.create(Integer.valueOf(zzedVar3.zzp()), Integer.valueOf(zzm3));
                                int intValue = ((Integer) create.first).intValue();
                                int intValue2 = ((Integer) create.second).intValue();
                                list = zzfwh.zzo(bArr6);
                                zzn = intValue;
                                str6 = str8;
                                i13 = intValue2;
                            } else if (zzg3 == 1767990114) {
                                zzedVar2.zzL(zzd + 9);
                                int zzb2 = zzfzk.zzb(zzedVar.zzv());
                                byte[] bArr7 = new byte[zzb2];
                                zzedVar2.zzH(bArr7, 0, zzb2);
                                list = zzfwh.zzo(bArr7);
                            }
                            str6 = str8;
                        }
                        str6 = str8;
                    } else {
                        if (zzg <= 0) {
                            throw zzaz.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + zzg, null);
                        }
                        zzn = zzg;
                        str6 = str8;
                        i13 = 2;
                    }
                    str6 = str8;
                }
                if (i15 != i16) {
                    zzahmVar = zzm(zzedVar2, i15);
                    str2 = zzahmVar.zza;
                    bArr = zzahmVar.zzb;
                    if (bArr != null) {
                        if ("audio/vorbis".equals(str2)) {
                            zzed zzedVar4 = new zzed(bArr);
                            int i30 = 1;
                            zzedVar4.zzM(1);
                            int i31 = 0;
                            while (true) {
                                if (zzedVar4.zzb() <= 0) {
                                    i17 = 255;
                                    break;
                                }
                                i17 = 255;
                                if (zzedVar4.zzf() != 255) {
                                    break;
                                }
                                zzedVar4.zzM(i30);
                                i31 += 255;
                                i30 = 1;
                            }
                            int zzm4 = zzedVar4.zzm() + i31;
                            int i32 = 0;
                            while (zzedVar4.zzb() > 0 && zzedVar4.zzf() == i17) {
                                zzedVar4.zzM(1);
                                i32 += i17;
                            }
                            int zzm5 = zzedVar4.zzm() + i32;
                            byte[] bArr8 = new byte[zzm4];
                            int zzd3 = zzedVar4.zzd();
                            System.arraycopy(bArr, zzd3, bArr8, 0, zzm4);
                            int i33 = zzd3 + zzm4 + zzm5;
                            int length = bArr.length - i33;
                            byte[] bArr9 = new byte[length];
                            System.arraycopy(bArr, i33, bArr9, 0, length);
                            list = zzfwh.zzp(bArr8, bArr9);
                            str6 = str8;
                        } else {
                            if ("audio/mp4a-latm".equals(str2)) {
                                zzabp zza2 = zzabr.zza(bArr);
                                zzn = zza2.zza;
                                i13 = zza2.zzb;
                                str6 = zza2.zzc;
                            } else {
                                str6 = str8;
                            }
                            list = zzfwh.zzo(bArr);
                        }
                    }
                }
                str6 = str8;
            }
            zzd += zzg2;
            zzedVar2 = zzedVar;
            i20 = i8;
            i21 = i9;
            str5 = str3;
        }
        String str10 = str6;
        if (zzahrVar.zzb != null || str2 == null) {
            return;
        }
        zzx zzxVar2 = new zzx();
        zzxVar2.zzN(i10);
        zzxVar2.zzad(str2);
        zzxVar2.zzC(str10);
        zzxVar2.zzB(i13);
        zzxVar2.zzae(zzn);
        zzxVar2.zzX(i25);
        zzxVar2.zzP(list);
        zzxVar2.zzH(zzsVar2);
        zzxVar2.zzS(str);
        if (zzahmVar != null) {
            j = zzahmVar.zzc;
            zzxVar2.zzA(zzfzk.zze(j));
            j3 = zzahmVar.zzd;
            zzxVar2.zzY(zzfzk.zze(j3));
        }
        zzahrVar.zzb = zzxVar2.zzaj();
    }
}

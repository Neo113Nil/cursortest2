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

/* JADX INFO: loaded from: classes.dex */
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
        zzer zzerVarZzb = zzeqVar.zzb(1751411826);
        zzer zzerVarZzb2 = zzeqVar.zzb(1801812339);
        zzer zzerVarZzb3 = zzeqVar.zzb(1768715124);
        if (zzerVarZzb != null && zzerVarZzb2 != null && zzerVarZzb3 != null && zzi(zzerVarZzb.zza) == 1835299937) {
            zzed zzedVar = zzerVarZzb2.zza;
            zzedVar.zzL(12);
            int iZzg = zzedVar.zzg();
            String[] strArr = new String[iZzg];
            for (int i7 = 0; i7 < iZzg; i7++) {
                int iZzg2 = zzedVar.zzg();
                zzedVar.zzM(4);
                strArr[i7] = zzedVar.zzB(iZzg2 - 8, StandardCharsets.UTF_8);
            }
            zzed zzedVar2 = zzerVarZzb3.zza;
            zzedVar2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzedVar2.zzb() > 8) {
                int iZzg3 = zzedVar2.zzg() + zzedVar2.zzd();
                int iZzg4 = zzedVar2.zzg() - 1;
                if (iZzg4 < 0 || iZzg4 >= iZzg) {
                    AbstractC0486a1.k(iZzg4, "Skipped metadata with unknown key index: ", "BoxParsers");
                } else {
                    String str = strArr[iZzg4];
                    while (true) {
                        int iZzd = zzedVar2.zzd();
                        if (iZzd >= iZzg3) {
                            zzepVar = null;
                            break;
                        }
                        int iZzg5 = zzedVar2.zzg();
                        if (zzedVar2.zzg() == 1684108385) {
                            int iZzg6 = zzedVar2.zzg();
                            int iZzg7 = zzedVar2.zzg();
                            int i8 = iZzg5 - 16;
                            byte[] bArr = new byte[i8];
                            zzedVar2.zzH(bArr, 0, i8);
                            zzepVar = new zzep(str, bArr, iZzg7, iZzg6);
                            break;
                        }
                        zzedVar2.zzL(iZzd + iZzg5);
                    }
                    if (zzepVar != null) {
                        arrayList.add(zzepVar);
                    }
                }
                zzedVar2.zzL(iZzg3);
            }
            if (!arrayList.isEmpty()) {
                return new zzav(arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    public static zzav zzc(zzer zzerVar) {
        int iZzn;
        zzed zzedVar = zzerVar.zza;
        zzedVar.zzL(8);
        zzav zzavVar = new zzav(-9223372036854775807L, new zzau[0]);
        while (zzedVar.zzb() >= 8) {
            int iZzd = zzedVar.zzd();
            int iZzg = zzedVar.zzg() + iZzd;
            int iZzg2 = zzedVar.zzg();
            zzav zzavVar2 = null;
            if (iZzg2 == 1835365473) {
                zzedVar.zzL(iZzd);
                zzedVar.zzM(8);
                zzg(zzedVar);
                while (zzedVar.zzd() < iZzg) {
                    int iZzd2 = zzedVar.zzd();
                    int iZzg3 = zzedVar.zzg() + iZzd2;
                    if (zzedVar.zzg() == 1768715124) {
                        zzedVar.zzL(iZzd2);
                        zzedVar.zzM(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzedVar.zzd() < iZzg3) {
                            zzau zzauVarZza = zzaie.zza(zzedVar);
                            if (zzauVarZza != null) {
                                arrayList.add(zzauVarZza);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzavVar2 = new zzav(arrayList);
                            break;
                        }
                        break;
                    }
                    zzedVar.zzL(iZzg3);
                }
                zzavVar = zzavVar.zzd(zzavVar2);
            } else if (iZzg2 == 1936553057) {
                zzedVar.zzL(iZzd);
                zzedVar.zzM(12);
                while (zzedVar.zzd() < iZzg) {
                    int iZzd3 = zzedVar.zzd();
                    int iZzg4 = zzedVar.zzg();
                    if (zzedVar.zzg() == 1935766900) {
                        if (iZzg4 < 16) {
                            break;
                        }
                        zzedVar.zzM(4);
                        int i7 = -1;
                        int i8 = 0;
                        for (int i9 = 0; i9 < 2; i9++) {
                            int iZzm = zzedVar.zzm();
                            int iZzm2 = zzedVar.zzm();
                            if (iZzm == 0) {
                                i7 = iZzm2;
                            } else if (iZzm == 1) {
                                i8 = iZzm2;
                            }
                        }
                        if (i7 == 12) {
                            iZzn = 240;
                        } else if (i7 == 13) {
                            iZzn = 120;
                        } else if (i7 == 21 && zzedVar.zzb() >= 8 && zzedVar.zzd() + 8 <= iZzg) {
                            int iZzg5 = zzedVar.zzg();
                            int iZzg6 = zzedVar.zzg();
                            if (iZzg5 < 12 || iZzg6 != 1936877170) {
                                iZzn = -2147483647;
                            } else {
                                iZzn = zzedVar.zzn();
                            }
                        } else {
                            iZzn = -2147483647;
                        }
                        if (iZzn == -2147483647) {
                            break;
                        }
                        zzavVar2 = new zzav(-9223372036854775807L, new zzagp(iZzn, i8));
                        break;
                    }
                    zzedVar.zzL(iZzd3 + iZzg4);
                }
                zzavVar = zzavVar.zzd(zzavVar2);
            } else if (iZzg2 == -1451722374) {
                zzavVar = zzavVar.zzd(zzl(zzedVar));
            }
            zzedVar.zzL(iZzg);
        }
        return zzavVar;
    }

    public static zzev zzd(zzed zzedVar) {
        long jZzt;
        long jZzt2;
        zzedVar.zzL(8);
        if (zza(zzedVar.zzg()) == 0) {
            jZzt = zzedVar.zzu();
            jZzt2 = zzedVar.zzu();
        } else {
            jZzt = zzedVar.zzt();
            jZzt2 = zzedVar.zzt();
        }
        return new zzev(jZzt, jZzt2, zzedVar.zzu());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0276 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0278  */
    /* JADX WARN: Code duplicated, block: B:105:0x0284  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b7 A[DONT_INVERT, LOOP:14: B:110:0x02b7->B:114:0x02c1, LOOP_START, PHI: r19
      0x02b7: PHI (r19v6 int) = (r19v2 int), (r19v7 int) binds: [B:109:0x02b5, B:114:0x02c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c1 A[LOOP:14: B:110:0x02b7->B:114:0x02c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x02c8 A[EDGE_INSN: B:115:0x02c8->B:116:0x02c9 BREAK  A[LOOP:14: B:110:0x02b7->B:114:0x02c1]] */
    /* JADX WARN: Code duplicated, block: B:117:0x02cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x02cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x02d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x02d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:128:0x0302  */
    /* JADX WARN: Code duplicated, block: B:129:0x030b  */
    /* JADX WARN: Code duplicated, block: B:130:0x030c A[PHI: r1
      0x030c: PHI (r1v11 int) = (r1v10 int), (r1v14 int) binds: [B:116:0x02c9, B:129:0x030b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x0349  */
    /* JADX WARN: Code duplicated, block: B:134:0x034c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0457  */
    /* JADX WARN: Code duplicated, block: B:283:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1 A[PHI: r9
      0x01b1: PHI (r9v5 int) = (r9v4 int), (r9v4 int), (r9v36 int), (r9v4 int) binds: [B:40:0x00f3, B:47:0x010f, B:64:0x01b0, B:46:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01dd A[LOOP:12: B:69:0x01d5->B:72:0x01dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x021e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0223 A[ADDED_TO_REGION, LOOP:13: B:80:0x0223->B:82:0x0227, LOOP_START, PHI: r12 r19 r29
      0x0223: PHI (r12v17 int) = (r12v14 int), (r12v18 int) binds: [B:78:0x0220, B:82:0x0227] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r19v9 int) = (r19v2 int), (r19v10 int) binds: [B:78:0x0220, B:82:0x0227] A[DONT_GENERATE, DONT_INLINE]
      0x0223: PHI (r29v3 int) = (r29v1 int), (r29v7 int) binds: [B:78:0x0220, B:82:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x0225 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0227 A[LOOP:13: B:80:0x0223->B:82:0x0227, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0244  */
    /* JADX WARN: Code duplicated, block: B:89:0x0247  */
    /* JADX WARN: Code duplicated, block: B:92:0x0250  */
    /* JADX WARN: Code duplicated, block: B:93:0x0252  */
    /* JADX WARN: Code duplicated, block: B:96:0x0257  */
    /* JADX WARN: Code duplicated, block: B:98:0x025e  */
    public static zzair zze(zzaio zzaioVar, zzeq zzeqVar, zzadj zzadjVar) throws zzaz {
        zzahp zzahtVar;
        boolean z4;
        int iZzp;
        int iZzp2;
        int iZzp3;
        long[] jArrCopyOf;
        int[] iArrCopyOf;
        long[] jArrCopyOf2;
        int[] iArrCopyOf2;
        int i7;
        zzaio zzaioVar2;
        int iZzp4;
        int i8;
        int i9;
        int i10;
        int i11;
        long j;
        long j3;
        int iZzp5;
        boolean z7;
        int i12;
        int i13;
        int i14;
        int i15;
        long[] jArr;
        int[] iArr;
        long j7;
        int i16;
        long[] jArr2;
        int[] iArr2;
        String str;
        long j8;
        boolean zZza;
        int i17;
        int iZzg;
        int iZzc;
        int i18;
        int i19;
        int iZzg2;
        int iZzp6;
        int i20;
        int i21;
        zzaio zzaioVarZza;
        int[] iArr3;
        boolean z8;
        int i22;
        int length;
        zzaio zzaioVarZza2 = zzaioVar;
        zzer zzerVarZzb = zzeqVar.zzb(1937011578);
        if (zzerVarZzb != null) {
            zzahtVar = new zzahs(zzerVarZzb, zzaioVarZza2.zzg);
        } else {
            zzer zzerVarZzb2 = zzeqVar.zzb(1937013298);
            if (zzerVarZzb2 == null) {
                throw zzaz.zza("Track has no sample table size information", null);
            }
            zzahtVar = new zzaht(zzerVarZzb2);
        }
        int iZzb = zzahtVar.zzb();
        if (iZzb == 0) {
            return new zzair(zzaioVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (zzaioVarZza2.zzb == 2) {
            long j9 = zzaioVarZza2.zzf;
            if (j9 > 0) {
                zzx zzxVarZzb = zzaioVarZza2.zzg.zzb();
                zzxVarZzb.zzK(iZzb / (j9 / 1000000.0f));
                zzaioVarZza2 = zzaioVarZza2.zza(zzxVarZzb.zzaj());
            }
        }
        zzaio zzaioVar3 = zzaioVarZza2;
        zzer zzerVarZzb3 = zzeqVar.zzb(1937007471);
        if (zzerVarZzb3 == null) {
            zzerVarZzb3 = zzeqVar.zzb(1668232756);
            zzerVarZzb3.getClass();
            z4 = true;
        } else {
            z4 = false;
        }
        zzer zzerVarZzb4 = zzeqVar.zzb(1937011555);
        zzerVarZzb4.getClass();
        zzed zzedVar = zzerVarZzb4.zza;
        zzer zzerVarZzb5 = zzeqVar.zzb(1937011827);
        zzerVarZzb5.getClass();
        zzed zzedVar2 = zzerVarZzb5.zza;
        zzer zzerVarZzb6 = zzeqVar.zzb(1937011571);
        zzed zzedVar3 = zzerVarZzb6 != null ? zzerVarZzb6.zza : null;
        zzer zzerVarZzb7 = zzeqVar.zzb(1668576371);
        zzed zzedVar4 = zzerVarZzb7 != null ? zzerVarZzb7.zza : null;
        zzahl zzahlVar = new zzahl(zzedVar, zzerVarZzb3.zza, z4);
        zzedVar2.zzL(12);
        int iZzp7 = zzedVar2.zzp() - 1;
        int iZzp8 = zzedVar2.zzp();
        int iZzp9 = zzedVar2.zzp();
        if (zzedVar4 != null) {
            zzedVar4.zzL(12);
            iZzp = zzedVar4.zzp();
        } else {
            iZzp = 0;
        }
        if (zzedVar3 != null) {
            zzedVar3.zzL(12);
            iZzp3 = zzedVar3.zzp();
            if (iZzp3 > 0) {
                iZzp2 = zzedVar3.zzp() - 1;
            } else {
                iZzp2 = -1;
                zzedVar3 = null;
            }
        } else {
            iZzp2 = -1;
            iZzp3 = 0;
        }
        int iZza = zzahtVar.zza();
        zzz zzzVar = zzaioVar3.zzg;
        if (iZza != -1) {
            String str2 = zzzVar.zzo;
            if ((!"audio/raw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/g711-alaw".equals(str2)) || iZzp7 != 0) {
                jArrCopyOf = new long[iZzb];
                iArrCopyOf = new int[iZzb];
                jArrCopyOf2 = new long[iZzb];
                iArrCopyOf2 = new int[iZzb];
                i7 = iZzp7;
                zzaioVar2 = zzaioVar3;
                iZzp4 = iZzp2;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                j = 0;
                j3 = 0;
                iZzp5 = 0;
                while (true) {
                    if (i9 >= iZzb) {
                        iZzp8 = iZzp8;
                        break;
                    }
                    j8 = j;
                    zZza = true;
                    while (true) {
                        if (i11 != 0) {
                            i17 = i11;
                            break;
                        }
                        zZza = zzahlVar.zza();
                        if (!zZza) {
                            i17 = 0;
                            break;
                        }
                        int i23 = iZzp8;
                        long j10 = zzahlVar.zzd;
                        i11 = zzahlVar.zzc;
                        j8 = j10;
                        iZzp8 = i23;
                        iZzp9 = iZzp9;
                        iZzb = iZzb;
                    }
                    if (!zZza) {
                        zzdq.zzf("BoxParsers", "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i9);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i9);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i9);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i9);
                        iZzb = i9;
                        break;
                    }
                    iZzg = i8;
                    if (zzedVar4 != null) {
                        while (iZzp5 == 0) {
                            if (iZzp <= 0) {
                                iZzp5 = 0;
                                break;
                            }
                            iZzp--;
                            iZzp5 = zzedVar4.zzp();
                            iZzg = zzedVar4.zzg();
                        }
                        iZzp5--;
                    }
                    jArrCopyOf[i9] = j8;
                    iZzc = zzahtVar.zzc();
                    iArrCopyOf[i9] = iZzc;
                    if (iZzc > i10) {
                        i18 = iZzc;
                    } else {
                        i18 = i10;
                    }
                    jArrCopyOf2[i9] = j3 + ((long) iZzg);
                    if (zzedVar3 == null) {
                        i19 = 1;
                    } else {
                        i19 = 0;
                    }
                    iArrCopyOf2[i9] = i19;
                    if (i9 == iZzp4) {
                        iArrCopyOf2[i9] = 1;
                        iZzp3--;
                        if (iZzp3 > 0) {
                            zzedVar3.getClass();
                            iZzp4 = zzedVar3.zzp() - 1;
                        }
                    }
                    zzed zzedVar5 = zzedVar3;
                    iZzg2 = iZzp9;
                    long[] jArr3 = jArrCopyOf2;
                    j3 += (long) iZzg2;
                    iZzp6 = iZzp8 - 1;
                    if (iZzp6 == 0) {
                        if (i7 > 0) {
                            iZzp6 = zzedVar2.zzp();
                            i7--;
                            iZzg2 = zzedVar2.zzg();
                        } else {
                            iZzp6 = 0;
                        }
                    }
                    long[] jArr4 = jArrCopyOf;
                    long j11 = j8 + ((long) iArrCopyOf[i9]);
                    i11 = i17 - 1;
                    i9++;
                    iZzp9 = iZzg2;
                    jArrCopyOf2 = jArr3;
                    iZzb = iZzb;
                    i10 = i18;
                    i8 = iZzg;
                    iZzp8 = iZzp6;
                    zzedVar3 = zzedVar5;
                    j = j11;
                    jArrCopyOf = jArr4;
                    iArrCopyOf = iArrCopyOf;
                }
                long j12 = j3 + ((long) i8);
                if (zzedVar4 == null) {
                    z7 = true;
                    break;
                }
                while (true) {
                    if (iZzp <= 0) {
                        z7 = true;
                        break;
                    }
                    if (zzedVar4.zzp() != 0) {
                        z7 = false;
                        break;
                    }
                    zzedVar4.zzg();
                    iZzp--;
                }
                if (iZzp3 != 0) {
                    zzaioVar2 = zzaioVar2;
                    z7 = z7;
                    jArrCopyOf = jArrCopyOf;
                    i12 = i11;
                    i13 = iZzp8;
                    i14 = i7;
                    i15 = iZzp5;
                    StringBuilder sbG = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                    sbG.append(i13);
                    sbG.append(", remainingSamplesInChunk ");
                    sbG.append(i12);
                    sbG.append(", remainingTimestampDeltaChanges ");
                    sbG.append(i14);
                    sbG.append(", remainingSamplesAtTimestampOffset ");
                    sbG.append(i15);
                    if (true != z7) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sbG.append(str);
                    zzdq.zzf("BoxParsers", sbG.toString());
                } else if (iZzp8 == 0) {
                    if (i11 != 0) {
                        iZzp3 = 0;
                        i12 = i11;
                    } else if (i7 != 0) {
                        iZzp3 = 0;
                        i12 = 0;
                    } else if (iZzp5 != 0) {
                        iZzp3 = 0;
                        i12 = 0;
                        i14 = 0;
                        zzaioVar2 = zzaioVar2;
                        z7 = z7;
                        jArrCopyOf = jArrCopyOf;
                        i15 = iZzp5;
                        i13 = 0;
                        StringBuilder sbG2 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                        sbG2.append(i13);
                        sbG2.append(", remainingSamplesInChunk ");
                        sbG2.append(i12);
                        sbG2.append(", remainingTimestampDeltaChanges ");
                        sbG2.append(i14);
                        sbG2.append(", remainingSamplesAtTimestampOffset ");
                        sbG2.append(i15);
                        if (true != z7) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sbG2.append(str);
                        zzdq.zzf("BoxParsers", sbG2.toString());
                    } else if (z7) {
                        zzaioVar2 = zzaioVar2;
                        jArrCopyOf = jArrCopyOf;
                    } else {
                        i13 = 0;
                        iZzp3 = 0;
                        i12 = 0;
                        i14 = 0;
                        i15 = 0;
                        z7 = false;
                        zzaioVar2 = zzaioVar2;
                        jArrCopyOf = jArrCopyOf;
                        StringBuilder sbG3 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                        sbG3.append(i13);
                        sbG3.append(", remainingSamplesInChunk ");
                        sbG3.append(i12);
                        sbG3.append(", remainingTimestampDeltaChanges ");
                        sbG3.append(i14);
                        sbG3.append(", remainingSamplesAtTimestampOffset ");
                        sbG3.append(i15);
                        if (true != z7) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sbG3.append(str);
                        zzdq.zzf("BoxParsers", sbG3.toString());
                    }
                    i14 = i7;
                    i15 = iZzp5;
                    i13 = 0;
                    StringBuilder sbG4 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                    sbG4.append(i13);
                    sbG4.append(", remainingSamplesInChunk ");
                    sbG4.append(i12);
                    sbG4.append(", remainingTimestampDeltaChanges ");
                    sbG4.append(i14);
                    sbG4.append(", remainingSamplesAtTimestampOffset ");
                    sbG4.append(i15);
                    if (true != z7) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sbG4.append(str);
                    zzdq.zzf("BoxParsers", sbG4.toString());
                } else {
                    iZzp3 = 0;
                    zzaioVar2 = zzaioVar2;
                    z7 = z7;
                    jArrCopyOf = jArrCopyOf;
                    i12 = i11;
                    i13 = iZzp8;
                    i14 = i7;
                    i15 = iZzp5;
                    StringBuilder sbG5 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                    sbG5.append(i13);
                    sbG5.append(", remainingSamplesInChunk ");
                    sbG5.append(i12);
                    sbG5.append(", remainingTimestampDeltaChanges ");
                    sbG5.append(i14);
                    sbG5.append(", remainingSamplesAtTimestampOffset ");
                    sbG5.append(i15);
                    if (true != z7) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sbG5.append(str);
                    zzdq.zzf("BoxParsers", sbG5.toString());
                }
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                j7 = j12;
                i16 = i10;
                iZzb = iZzb;
                jArr2 = jArrCopyOf2;
                iArr2 = iArrCopyOf2;
            } else if (iZzp == 0 && iZzp3 == 0) {
                int i24 = zzahlVar.zza;
                long[] jArr5 = new long[i24];
                int[] iArr4 = new int[i24];
                while (zzahlVar.zza()) {
                    int i25 = zzahlVar.zzb;
                    jArr5[i25] = zzahlVar.zzd;
                    iArr4[i25] = zzahlVar.zzc;
                }
                long j13 = iZzp9;
                int i26 = 8192 / iZza;
                int i27 = 0;
                for (int i28 = 0; i28 < i24; i28++) {
                    int i29 = iArr4[i28];
                    int i30 = zzen.zza;
                    i27 += ((i29 + i26) - 1) / i26;
                }
                long[] jArr6 = new long[i27];
                int[] iArr5 = new int[i27];
                long[] jArr7 = new long[i27];
                int[] iArr6 = new int[i27];
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                while (i32 < i24) {
                    int i35 = iArr4[i32];
                    long j14 = jArr5[i32];
                    int i36 = i34;
                    int i37 = i24;
                    int iMax = i33;
                    int i38 = i36;
                    long[] jArr8 = jArr5;
                    int i39 = i35;
                    while (i39 > 0) {
                        int iMin = Math.min(i26, i39);
                        jArr6[i38] = j14;
                        int[] iArr7 = iArr4;
                        int i40 = iZza * iMin;
                        iArr5[i38] = i40;
                        iMax = Math.max(iMax, i40);
                        jArr7[i38] = ((long) i31) * j13;
                        iArr6[i38] = 1;
                        j14 += (long) iArr5[i38];
                        i31 += iMin;
                        i39 -= iMin;
                        i38++;
                        iZza = iZza;
                        i26 = i26;
                        iArr4 = iArr7;
                    }
                    i32++;
                    i26 = i26;
                    jArr5 = jArr8;
                    iArr4 = iArr4;
                    int i41 = i38;
                    i33 = iMax;
                    i24 = i37;
                    i34 = i41;
                }
                j7 = j13 * ((long) i31);
                jArr = jArr6;
                iArr = iArr5;
                jArr2 = jArr7;
                zzaioVar2 = zzaioVar3;
                i16 = i33;
                iArr2 = iArr6;
            } else {
                iZzp7 = 0;
                jArrCopyOf = new long[iZzb];
                iArrCopyOf = new int[iZzb];
                jArrCopyOf2 = new long[iZzb];
                iArrCopyOf2 = new int[iZzb];
                i7 = iZzp7;
                zzaioVar2 = zzaioVar3;
                iZzp4 = iZzp2;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                j = 0;
                j3 = 0;
                iZzp5 = 0;
                while (true) {
                    if (i9 >= iZzb) {
                        iZzp8 = iZzp8;
                        break;
                    }
                    j8 = j;
                    zZza = true;
                    while (true) {
                        if (i11 != 0) {
                            i17 = i11;
                            break;
                        }
                        zZza = zzahlVar.zza();
                        if (!zZza) {
                            i17 = 0;
                            break;
                        }
                        int i210 = iZzp8;
                        long j15 = zzahlVar.zzd;
                        i11 = zzahlVar.zzc;
                        j8 = j15;
                        iZzp8 = i210;
                        iZzp9 = iZzp9;
                        iZzb = iZzb;
                    }
                    if (!zZza) {
                        zzdq.zzf("BoxParsers", "Unexpected end of chunk data");
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i9);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i9);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i9);
                        iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i9);
                        iZzb = i9;
                        break;
                    }
                    iZzg = i8;
                    if (zzedVar4 != null) {
                        while (iZzp5 == 0) {
                            if (iZzp <= 0) {
                                iZzp5 = 0;
                                break;
                            }
                            iZzp--;
                            iZzp5 = zzedVar4.zzp();
                            iZzg = zzedVar4.zzg();
                        }
                        iZzp5--;
                    }
                    jArrCopyOf[i9] = j8;
                    iZzc = zzahtVar.zzc();
                    iArrCopyOf[i9] = iZzc;
                    if (iZzc > i10) {
                        i18 = iZzc;
                    } else {
                        i18 = i10;
                    }
                    jArrCopyOf2[i9] = j3 + ((long) iZzg);
                    if (zzedVar3 == null) {
                        i19 = 1;
                    } else {
                        i19 = 0;
                    }
                    iArrCopyOf2[i9] = i19;
                    if (i9 == iZzp4) {
                        iArrCopyOf2[i9] = 1;
                        iZzp3--;
                        if (iZzp3 > 0) {
                            zzedVar3.getClass();
                            iZzp4 = zzedVar3.zzp() - 1;
                        }
                    }
                    zzed zzedVar6 = zzedVar3;
                    iZzg2 = iZzp9;
                    long[] jArr9 = jArrCopyOf2;
                    j3 += (long) iZzg2;
                    iZzp6 = iZzp8 - 1;
                    if (iZzp6 == 0) {
                        if (i7 > 0) {
                            iZzp6 = zzedVar2.zzp();
                            i7--;
                            iZzg2 = zzedVar2.zzg();
                        } else {
                            iZzp6 = 0;
                        }
                    }
                    long[] jArr10 = jArrCopyOf;
                    long j16 = j8 + ((long) iArrCopyOf[i9]);
                    i11 = i17 - 1;
                    i9++;
                    iZzp9 = iZzg2;
                    jArrCopyOf2 = jArr9;
                    iZzb = iZzb;
                    i10 = i18;
                    i8 = iZzg;
                    iZzp8 = iZzp6;
                    zzedVar3 = zzedVar6;
                    j = j16;
                    jArrCopyOf = jArr10;
                    iArrCopyOf = iArrCopyOf;
                }
                long j17 = j3 + ((long) i8);
                if (zzedVar4 == null) {
                    z7 = true;
                    break;
                }
                while (true) {
                    if (iZzp <= 0) {
                        z7 = true;
                        break;
                    }
                    if (zzedVar4.zzp() != 0) {
                        z7 = false;
                        break;
                    }
                    zzedVar4.zzg();
                    iZzp--;
                }
                if (iZzp3 != 0) {
                    zzaioVar2 = zzaioVar2;
                    z7 = z7;
                    jArrCopyOf = jArrCopyOf;
                    i12 = i11;
                    i13 = iZzp8;
                    i14 = i7;
                    i15 = iZzp5;
                    StringBuilder sbG6 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                    sbG6.append(i13);
                    sbG6.append(", remainingSamplesInChunk ");
                    sbG6.append(i12);
                    sbG6.append(", remainingTimestampDeltaChanges ");
                    sbG6.append(i14);
                    sbG6.append(", remainingSamplesAtTimestampOffset ");
                    sbG6.append(i15);
                    if (true != z7) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sbG6.append(str);
                    zzdq.zzf("BoxParsers", sbG6.toString());
                } else if (iZzp8 == 0) {
                    if (i11 != 0) {
                        iZzp3 = 0;
                        i12 = i11;
                    } else if (i7 != 0) {
                        iZzp3 = 0;
                        i12 = 0;
                    } else if (iZzp5 != 0) {
                        iZzp3 = 0;
                        i12 = 0;
                        i14 = 0;
                        zzaioVar2 = zzaioVar2;
                        z7 = z7;
                        jArrCopyOf = jArrCopyOf;
                        i15 = iZzp5;
                        i13 = 0;
                        StringBuilder sbG7 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                        sbG7.append(i13);
                        sbG7.append(", remainingSamplesInChunk ");
                        sbG7.append(i12);
                        sbG7.append(", remainingTimestampDeltaChanges ");
                        sbG7.append(i14);
                        sbG7.append(", remainingSamplesAtTimestampOffset ");
                        sbG7.append(i15);
                        if (true != z7) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sbG7.append(str);
                        zzdq.zzf("BoxParsers", sbG7.toString());
                    } else if (z7) {
                        i13 = 0;
                        iZzp3 = 0;
                        i12 = 0;
                        i14 = 0;
                        i15 = 0;
                        z7 = false;
                        zzaioVar2 = zzaioVar2;
                        jArrCopyOf = jArrCopyOf;
                        StringBuilder sbG8 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                        sbG8.append(i13);
                        sbG8.append(", remainingSamplesInChunk ");
                        sbG8.append(i12);
                        sbG8.append(", remainingTimestampDeltaChanges ");
                        sbG8.append(i14);
                        sbG8.append(", remainingSamplesAtTimestampOffset ");
                        sbG8.append(i15);
                        if (true != z7) {
                            str = ", ctts invalid";
                        } else {
                            str = "";
                        }
                        sbG8.append(str);
                        zzdq.zzf("BoxParsers", sbG8.toString());
                    } else {
                        zzaioVar2 = zzaioVar2;
                        jArrCopyOf = jArrCopyOf;
                    }
                    i14 = i7;
                    i15 = iZzp5;
                    i13 = 0;
                    StringBuilder sbG9 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                    sbG9.append(i13);
                    sbG9.append(", remainingSamplesInChunk ");
                    sbG9.append(i12);
                    sbG9.append(", remainingTimestampDeltaChanges ");
                    sbG9.append(i14);
                    sbG9.append(", remainingSamplesAtTimestampOffset ");
                    sbG9.append(i15);
                    if (true != z7) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sbG9.append(str);
                    zzdq.zzf("BoxParsers", sbG9.toString());
                } else {
                    iZzp3 = 0;
                    zzaioVar2 = zzaioVar2;
                    z7 = z7;
                    jArrCopyOf = jArrCopyOf;
                    i12 = i11;
                    i13 = iZzp8;
                    i14 = i7;
                    i15 = iZzp5;
                    StringBuilder sbG10 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                    sbG10.append(i13);
                    sbG10.append(", remainingSamplesInChunk ");
                    sbG10.append(i12);
                    sbG10.append(", remainingTimestampDeltaChanges ");
                    sbG10.append(i14);
                    sbG10.append(", remainingSamplesAtTimestampOffset ");
                    sbG10.append(i15);
                    if (true != z7) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sbG10.append(str);
                    zzdq.zzf("BoxParsers", sbG10.toString());
                }
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                j7 = j17;
                i16 = i10;
                iZzb = iZzb;
                jArr2 = jArrCopyOf2;
                iArr2 = iArrCopyOf2;
            }
        } else {
            jArrCopyOf = new long[iZzb];
            iArrCopyOf = new int[iZzb];
            jArrCopyOf2 = new long[iZzb];
            iArrCopyOf2 = new int[iZzb];
            i7 = iZzp7;
            zzaioVar2 = zzaioVar3;
            iZzp4 = iZzp2;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
            j = 0;
            j3 = 0;
            iZzp5 = 0;
            while (true) {
                if (i9 >= iZzb) {
                    iZzp8 = iZzp8;
                    break;
                }
                j8 = j;
                zZza = true;
                while (true) {
                    if (i11 != 0) {
                        i17 = i11;
                        break;
                    }
                    zZza = zzahlVar.zza();
                    if (!zZza) {
                        i17 = 0;
                        break;
                    }
                    int i211 = iZzp8;
                    long j18 = zzahlVar.zzd;
                    i11 = zzahlVar.zzc;
                    j8 = j18;
                    iZzp8 = i211;
                    iZzp9 = iZzp9;
                    iZzb = iZzb;
                }
                if (!zZza) {
                    zzdq.zzf("BoxParsers", "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i9);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i9);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i9);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i9);
                    iZzb = i9;
                    break;
                }
                iZzg = i8;
                if (zzedVar4 != null) {
                    while (iZzp5 == 0) {
                        if (iZzp <= 0) {
                            iZzp5 = 0;
                            break;
                        }
                        iZzp--;
                        iZzp5 = zzedVar4.zzp();
                        iZzg = zzedVar4.zzg();
                    }
                    iZzp5--;
                }
                jArrCopyOf[i9] = j8;
                iZzc = zzahtVar.zzc();
                iArrCopyOf[i9] = iZzc;
                if (iZzc > i10) {
                    i18 = iZzc;
                } else {
                    i18 = i10;
                }
                jArrCopyOf2[i9] = j3 + ((long) iZzg);
                if (zzedVar3 == null) {
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                iArrCopyOf2[i9] = i19;
                if (i9 == iZzp4) {
                    iArrCopyOf2[i9] = 1;
                    iZzp3--;
                    if (iZzp3 > 0) {
                        zzedVar3.getClass();
                        iZzp4 = zzedVar3.zzp() - 1;
                    }
                }
                zzed zzedVar7 = zzedVar3;
                iZzg2 = iZzp9;
                long[] jArr11 = jArrCopyOf2;
                j3 += (long) iZzg2;
                iZzp6 = iZzp8 - 1;
                if (iZzp6 == 0) {
                    if (i7 > 0) {
                        iZzp6 = zzedVar2.zzp();
                        i7--;
                        iZzg2 = zzedVar2.zzg();
                    } else {
                        iZzp6 = 0;
                    }
                }
                long[] jArr12 = jArrCopyOf;
                long j19 = j8 + ((long) iArrCopyOf[i9]);
                i11 = i17 - 1;
                i9++;
                iZzp9 = iZzg2;
                jArrCopyOf2 = jArr11;
                iZzb = iZzb;
                i10 = i18;
                i8 = iZzg;
                iZzp8 = iZzp6;
                zzedVar3 = zzedVar7;
                j = j19;
                jArrCopyOf = jArr12;
                iArrCopyOf = iArrCopyOf;
            }
            long j110 = j3 + ((long) i8);
            if (zzedVar4 == null) {
                z7 = true;
                break;
            }
            while (true) {
                if (iZzp <= 0) {
                    z7 = true;
                    break;
                }
                if (zzedVar4.zzp() != 0) {
                    z7 = false;
                    break;
                }
                zzedVar4.zzg();
                iZzp--;
            }
            if (iZzp3 != 0) {
                zzaioVar2 = zzaioVar2;
                z7 = z7;
                jArrCopyOf = jArrCopyOf;
                i12 = i11;
                i13 = iZzp8;
                i14 = i7;
                i15 = iZzp5;
                StringBuilder sbG11 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                sbG11.append(i13);
                sbG11.append(", remainingSamplesInChunk ");
                sbG11.append(i12);
                sbG11.append(", remainingTimestampDeltaChanges ");
                sbG11.append(i14);
                sbG11.append(", remainingSamplesAtTimestampOffset ");
                sbG11.append(i15);
                if (true != z7) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sbG11.append(str);
                zzdq.zzf("BoxParsers", sbG11.toString());
            } else if (iZzp8 == 0) {
                if (i11 != 0) {
                    iZzp3 = 0;
                    i12 = i11;
                } else if (i7 != 0) {
                    iZzp3 = 0;
                    i12 = 0;
                } else if (iZzp5 != 0) {
                    iZzp3 = 0;
                    i12 = 0;
                    i14 = 0;
                    zzaioVar2 = zzaioVar2;
                    z7 = z7;
                    jArrCopyOf = jArrCopyOf;
                    i15 = iZzp5;
                    i13 = 0;
                    StringBuilder sbG12 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                    sbG12.append(i13);
                    sbG12.append(", remainingSamplesInChunk ");
                    sbG12.append(i12);
                    sbG12.append(", remainingTimestampDeltaChanges ");
                    sbG12.append(i14);
                    sbG12.append(", remainingSamplesAtTimestampOffset ");
                    sbG12.append(i15);
                    if (true != z7) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sbG12.append(str);
                    zzdq.zzf("BoxParsers", sbG12.toString());
                } else if (z7) {
                    i13 = 0;
                    iZzp3 = 0;
                    i12 = 0;
                    i14 = 0;
                    i15 = 0;
                    z7 = false;
                    zzaioVar2 = zzaioVar2;
                    jArrCopyOf = jArrCopyOf;
                    StringBuilder sbG13 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                    sbG13.append(i13);
                    sbG13.append(", remainingSamplesInChunk ");
                    sbG13.append(i12);
                    sbG13.append(", remainingTimestampDeltaChanges ");
                    sbG13.append(i14);
                    sbG13.append(", remainingSamplesAtTimestampOffset ");
                    sbG13.append(i15);
                    if (true != z7) {
                        str = ", ctts invalid";
                    } else {
                        str = "";
                    }
                    sbG13.append(str);
                    zzdq.zzf("BoxParsers", sbG13.toString());
                } else {
                    zzaioVar2 = zzaioVar2;
                    jArrCopyOf = jArrCopyOf;
                }
                i14 = i7;
                i15 = iZzp5;
                i13 = 0;
                StringBuilder sbG14 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                sbG14.append(i13);
                sbG14.append(", remainingSamplesInChunk ");
                sbG14.append(i12);
                sbG14.append(", remainingTimestampDeltaChanges ");
                sbG14.append(i14);
                sbG14.append(", remainingSamplesAtTimestampOffset ");
                sbG14.append(i15);
                if (true != z7) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sbG14.append(str);
                zzdq.zzf("BoxParsers", sbG14.toString());
            } else {
                iZzp3 = 0;
                zzaioVar2 = zzaioVar2;
                z7 = z7;
                jArrCopyOf = jArrCopyOf;
                i12 = i11;
                i13 = iZzp8;
                i14 = i7;
                i15 = iZzp5;
                StringBuilder sbG15 = p150v0.a.g("Inconsistent stbl box for track ", zzaioVar2.zza, ": remainingSynchronizationSamples ", iZzp3, ", remainingSamplesAtTimestampDelta ");
                sbG15.append(i13);
                sbG15.append(", remainingSamplesInChunk ");
                sbG15.append(i12);
                sbG15.append(", remainingTimestampDeltaChanges ");
                sbG15.append(i14);
                sbG15.append(", remainingSamplesAtTimestampOffset ");
                sbG15.append(i15);
                if (true != z7) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sbG15.append(str);
                zzdq.zzf("BoxParsers", sbG15.toString());
            }
            jArr = jArrCopyOf;
            iArr = iArrCopyOf;
            j7 = j110;
            i16 = i10;
            iZzb = iZzb;
            jArr2 = jArrCopyOf2;
            iArr2 = iArrCopyOf2;
        }
        long j20 = zzaioVar2.zzc;
        long[] jArr13 = zzaioVar2.zzi;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int[] iArr8 = iArr2;
        long jZzu = zzen.zzu(j7, 1000000L, j20, roundingMode);
        if (jArr13 == null) {
            zzen.zzG(jArr2, 1000000L, zzaioVar2.zzc);
            return new zzair(zzaioVar2, jArr, iArr, i16, jArr2, iArr8, jZzu);
        }
        int[] iArr9 = iArr8;
        zzaio zzaioVar4 = zzaioVar2;
        if (jArr13.length == 1 && zzaioVar4.zzb == 1 && (length = jArr2.length) >= 2) {
            long[] jArr14 = zzaioVar4.zzj;
            jArr14.getClass();
            long j21 = jArr14[0];
            long jZzu2 = j21 + zzen.zzu(jArr13[0], zzaioVar4.zzc, zzaioVar4.zzd, roundingMode);
            int i42 = length - 1;
            int iMax2 = Math.max(0, Math.min(4, i42));
            int iMax3 = Math.max(0, Math.min(length - 4, i42));
            long j22 = jArr2[0];
            if (j22 > j21 || j21 >= jArr2[iMax2] || jArr2[iMax3] >= jZzu2 || jZzu2 > j7) {
                i20 = iZzb;
            } else {
                i20 = iZzb;
                long jZzu3 = zzen.zzu(j21 - j22, zzaioVar4.zzg.zzF, zzaioVar4.zzc, roundingMode);
                long jZzu4 = zzen.zzu(j7 - jZzu2, zzaioVar4.zzg.zzF, zzaioVar4.zzc, roundingMode);
                if (jZzu3 != 0) {
                    if (jZzu3 <= 2147483647L && jZzu4 <= 2147483647L) {
                        zzadjVar.zza = (int) jZzu3;
                        zzadjVar.zzb = (int) jZzu4;
                        zzen.zzG(jArr2, 1000000L, zzaioVar4.zzc);
                        return new zzair(zzaioVar4, jArr, iArr, i16, jArr2, iArr9, zzen.zzu(zzaioVar4.zzi[0], 1000000L, zzaioVar4.zzd, roundingMode));
                    }
                } else if (jZzu4 != 0) {
                    jZzu3 = 0;
                    if (jZzu3 <= 2147483647L) {
                        zzadjVar.zza = (int) jZzu3;
                        zzadjVar.zzb = (int) jZzu4;
                        zzen.zzG(jArr2, 1000000L, zzaioVar4.zzc);
                        return new zzair(zzaioVar4, jArr, iArr, i16, jArr2, iArr9, zzen.zzu(zzaioVar4.zzi[0], 1000000L, zzaioVar4.zzd, roundingMode));
                    }
                }
            }
        } else {
            i20 = iZzb;
        }
        long[] jArr15 = zzaioVar4.zzi;
        int length2 = jArr15.length;
        if (length2 == 1) {
            if (jArr15[0] == 0) {
                long[] jArr16 = zzaioVar4.zzj;
                jArr16.getClass();
                long j23 = jArr16[0];
                for (int i43 = 0; i43 < jArr2.length; i43++) {
                    jArr2[i43] = zzen.zzu(jArr2[i43] - j23, 1000000L, zzaioVar4.zzc, RoundingMode.DOWN);
                }
                return new zzair(zzaioVar4, jArr, iArr, i16, jArr2, iArr9, zzen.zzu(j7 - j23, 1000000L, zzaioVar4.zzc, RoundingMode.DOWN));
            }
            length2 = 1;
        }
        boolean z9 = zzaioVar4.zzb == 1;
        long[] jArr17 = zzaioVar4.zzj;
        int[] iArr10 = new int[length2];
        int[] iArr11 = new int[length2];
        jArr17.getClass();
        int i44 = 0;
        boolean z10 = false;
        int i45 = 0;
        int i46 = 0;
        while (true) {
            long[] jArr18 = zzaioVar4.zzi;
            i21 = i16;
            if (i45 >= jArr18.length) {
                break;
            }
            int[] iArr12 = iArr;
            long j24 = jArr17[i45];
            if (j24 != -1) {
                boolean z11 = z10;
                long jZzu5 = zzen.zzu(jArr18[i45], zzaioVar4.zzc, zzaioVar4.zzd, RoundingMode.DOWN);
                iArr10[i45] = zzen.zzd(jArr2, j24, true, true);
                long j25 = j24 + jZzu5;
                iArr11[i45] = zzen.zza(jArr2, j25, z9, false);
                int i47 = iArr10[i45];
                while (true) {
                    i22 = iArr10[i45];
                    if (i22 < 0 || (iArr9[i22] & 1) != 0) {
                        break;
                    }
                    iArr10[i45] = i22 - 1;
                }
                if (i22 < 0) {
                    iArr10[i45] = i47;
                    while (true) {
                        i22 = iArr10[i45];
                        if (i22 >= iArr11[i45] || (iArr9[i22] & 1) != 0) {
                            break;
                        }
                        iArr10[i45] = i22 + 1;
                    }
                }
                if (zzaioVar4.zzb == 2 && i22 != iArr11[i45]) {
                    while (true) {
                        int i48 = iArr11[i45];
                        if (i48 >= jArr2.length - 1) {
                            break;
                        }
                        int i49 = i48 + 1;
                        if (jArr2[i49] > j25) {
                            break;
                        }
                        iArr11[i45] = i49;
                    }
                }
                int i50 = iArr11[i45];
                int i51 = iArr10[i45];
                int i52 = (i50 - i51) + i44;
                z8 = z11 | (i46 != i51);
                i46 = i50;
                i44 = i52;
            } else {
                z8 = z10;
            }
            i45++;
            iArr = iArr12;
            z10 = z8;
            jArr = jArr;
            i20 = i20;
            i16 = i21;
        }
        int[] iArr13 = iArr;
        long[] jArr19 = jArr;
        boolean z12 = z10 | (i44 != i20);
        long[] jArr20 = z12 ? new long[i44] : jArr19;
        int[] iArr14 = z12 ? new int[i44] : iArr13;
        int i53 = true == z12 ? 0 : i21;
        int[] iArr15 = z12 ? new int[i44] : iArr9;
        long[] jArr21 = new long[i44];
        int i54 = i53;
        boolean z13 = false;
        int i55 = 0;
        int i56 = 0;
        long j26 = 0;
        while (i56 < zzaioVar4.zzi.length) {
            long j27 = zzaioVar4.zzj[i56];
            int i57 = iArr10[i56];
            int i58 = iArr11[i56];
            int[] iArr16 = iArr10;
            if (z12) {
                int i59 = i58 - i57;
                System.arraycopy(jArr19, i57, jArr20, i55, i59);
                iArr3 = iArr13;
                System.arraycopy(iArr3, i57, iArr14, i55, i59);
                System.arraycopy(iArr9, i57, iArr15, i55, i59);
            } else {
                iArr3 = iArr13;
            }
            while (i57 < i58) {
                int[] iArr17 = iArr9;
                int i60 = i56;
                long j28 = zzaioVar4.zzd;
                RoundingMode roundingMode2 = RoundingMode.DOWN;
                long jZzu6 = zzen.zzu(j26, 1000000L, j28, roundingMode2);
                long[] jArr22 = jArr2;
                long jZzu7 = zzen.zzu(jArr2[i57] - j27, 1000000L, zzaioVar4.zzc, roundingMode2);
                z13 = (!(jZzu7 >= 0)) | z13;
                jArr21[i55] = jZzu6 + jZzu7;
                if (z12 && iArr14[i55] > i54) {
                    i54 = iArr3[i57];
                }
                i55++;
                i57++;
                iArr9 = iArr17;
                i56 = i60;
                jArr2 = jArr22;
            }
            int i61 = i56;
            j26 += zzaioVar4.zzi[i61];
            i56 = i61 + 1;
            iArr9 = iArr9;
            iArr13 = iArr3;
            iArr10 = iArr16;
            iArr11 = iArr11;
            jArr2 = jArr2;
        }
        long jZzu8 = zzen.zzu(j26, 1000000L, zzaioVar4.zzd, RoundingMode.DOWN);
        if (z13) {
            zzx zzxVarZzb2 = zzaioVar4.zzg.zzb();
            zzxVarZzb2.zzL(true);
            zzaioVarZza = zzaioVar4.zza(zzxVarZzb2.zzaj());
        } else {
            zzaioVarZza = zzaioVar4;
        }
        return new zzair(zzaioVarZza, jArr20, iArr14, i54, jArr21, iArr15, jZzu8);
    }

    /* JADX WARN: Code duplicated, block: B:575:0x0ded  */
    /* JADX WARN: Code duplicated, block: B:576:0x0df1  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x015f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x0169  */
    /* JADX WARN: Code duplicated, block: B:75:0x0175  */
    public static List zzf(zzeq zzeqVar, zzadj zzadjVar, long j, zzs zzsVar, boolean z4, boolean z7, zzfsw zzfswVar) {
        int i7;
        long jZzu;
        long j3;
        int i8;
        long j7;
        String str;
        String str2;
        ArrayList arrayList;
        String str3;
        int i9;
        zzeq zzeqVar2;
        int i10;
        long[] jArr;
        long[] jArr2;
        zzz zzzVar;
        zzaio zzaioVar;
        Pair pairCreate;
        int i11;
        int i12;
        ArrayList arrayList2;
        String str4;
        zzeq zzeqVar3;
        long j8;
        zzed zzedVar;
        zzs zzsVarZzb;
        int i13;
        String str5;
        int i14;
        int i15;
        int i16;
        byte b7;
        char c3;
        int i17;
        int i18;
        zzahr zzahrVar;
        int i19;
        int i20;
        int i21;
        String str6;
        int i22;
        zzahr zzahrVar2;
        int i23;
        zzfg zzfgVar;
        List list;
        boolean z8;
        String str7;
        boolean z9;
        int i24;
        boolean z10;
        boolean z11;
        byte b8;
        String str8;
        boolean z12;
        boolean z13;
        String str9;
        boolean z14;
        boolean z15;
        boolean z16;
        String str10;
        zzfwh zzfwhVarZzo;
        ArrayList arrayList3;
        int i25;
        String str11 = "video/hevc";
        String str12 = "video/3gpp";
        String str13 = "application/ttml+xml";
        int i26 = 1835297121;
        int i27 = 4;
        int i28 = 8;
        ArrayList arrayList4 = new ArrayList();
        int i29 = 0;
        while (i29 < zzeqVar.zzc.size()) {
            zzeq zzeqVar4 = (zzeq) zzeqVar.zzc.get(i29);
            if (zzeqVar4.zzd != 1953653099) {
                i9 = i29;
                arrayList3 = arrayList4;
                i10 = i28;
                str3 = str11;
                str = str12;
                str2 = str13;
                i25 = i26;
            } else {
                zzer zzerVarZzb = zzeqVar.zzb(1836476516);
                zzerVarZzb.getClass();
                zzeq zzeqVarZza = zzeqVar4.zza(i26);
                zzeqVarZza.getClass();
                zzer zzerVarZzb2 = zzeqVarZza.zzb(1751411826);
                zzerVarZzb2.getClass();
                int iZzi = zzi(zzerVarZzb2.zza);
                if (iZzi == 1936684398) {
                    i7 = 1;
                } else if (iZzi == 1986618469) {
                    i7 = 2;
                } else if (iZzi == 1952807028 || iZzi == 1935832172 || iZzi == 1937072756 || iZzi == 1668047728) {
                    i7 = 3;
                } else {
                    i7 = iZzi == 1835365473 ? 5 : -1;
                }
                if (i7 == -1) {
                    i9 = i29;
                    zzeqVar2 = zzeqVar4;
                    arrayList = arrayList4;
                    i10 = i28;
                    str3 = str11;
                    str = str12;
                    str2 = str13;
                    zzaioVar = null;
                } else {
                    zzer zzerVarZzb3 = zzeqVar4.zzb(1953196132);
                    zzerVarZzb3.getClass();
                    zzed zzedVar2 = zzerVarZzb3.zza;
                    zzedVar2.zzL(i28);
                    int iZza = zza(zzedVar2.zzg());
                    if (iZza != 0) {
                        i28 = 16;
                    }
                    zzedVar2.zzM(i28);
                    int iZzg = zzedVar2.zzg();
                    zzedVar2.zzM(i27);
                    int iZzd = zzedVar2.zzd();
                    int i30 = 0;
                    while (true) {
                        int i31 = iZza == 0 ? 4 : 8;
                        jZzu = -9223372036854775807L;
                        if (i30 >= i31) {
                            zzedVar2.zzM(i31);
                        } else {
                            if (zzedVar2.zzN()[iZzd + i30] != -1) {
                                long jZzu2 = iZza == 0 ? zzedVar2.zzu() : zzedVar2.zzw();
                                if (jZzu2 != 0) {
                                    j3 = jZzu2;
                                    break;
                                }
                                break;
                            }
                            i30++;
                        }
                        j3 = -9223372036854775807L;
                        break;
                    }
                    zzedVar2.zzM(16);
                    int iZzg2 = zzedVar2.zzg();
                    int iZzg3 = zzedVar2.zzg();
                    zzedVar2.zzM(4);
                    int iZzg4 = zzedVar2.zzg();
                    int iZzg5 = zzedVar2.zzg();
                    int i32 = i29;
                    int i33 = 65536;
                    zzeq zzeqVar5 = zzeqVar4;
                    if (iZzg2 != 0) {
                        if (iZzg2 == 0) {
                            if (iZzg3 == -65536) {
                                if (iZzg4 == 65536) {
                                    i33 = iZzg4;
                                } else if (iZzg5 == 0) {
                                    i8 = 270;
                                }
                                iZzg3 = -65536;
                            } else {
                                i33 = iZzg4;
                            }
                            iZzg2 = 0;
                        } else {
                            i33 = iZzg4;
                        }
                        if (iZzg2 != -65536 && iZzg3 == 0 && i33 == 0 && iZzg5 == -65536) {
                            i8 = 180;
                        } else {
                            i8 = 0;
                        }
                    } else {
                        if (iZzg3 == 65536) {
                            if (iZzg4 != -65536) {
                                iZzg3 = 65536;
                            } else if (iZzg5 == 0) {
                                i8 = 90;
                            } else {
                                iZzg3 = 65536;
                                iZzg4 = -65536;
                            }
                        }
                        iZzg2 = 0;
                        if (iZzg2 == 0) {
                            if (iZzg3 == -65536) {
                                if (iZzg4 == 65536) {
                                    i33 = iZzg4;
                                } else if (iZzg5 == 0) {
                                    i8 = 270;
                                }
                                iZzg3 = -65536;
                            } else {
                                i33 = iZzg4;
                            }
                            iZzg2 = 0;
                        } else {
                            i33 = iZzg4;
                        }
                        if (iZzg2 != -65536) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                        }
                    }
                    zzahu zzahuVar = new zzahu(iZzg, j3, i8);
                    long j9 = j == -9223372036854775807L ? zzahuVar.zzb : j;
                    long j10 = zzd(zzerVarZzb.zza).zzc;
                    long jZzu3 = j9 == -9223372036854775807L ? -9223372036854775807L : zzen.zzu(j9, 1000000L, j10, RoundingMode.DOWN);
                    zzeq zzeqVarZza2 = zzeqVarZza.zza(1835626086);
                    zzeqVarZza2.getClass();
                    zzeq zzeqVarZza3 = zzeqVarZza2.zza(1937007212);
                    zzeqVarZza3.getClass();
                    zzer zzerVarZzb4 = zzeqVarZza.zzb(1835296868);
                    zzerVarZzb4.getClass();
                    zzed zzedVar3 = zzerVarZzb4.zza;
                    zzedVar3.zzL(8);
                    int iZza2 = zza(zzedVar3.zzg());
                    zzedVar3.zzM(iZza2 == 0 ? 8 : 16);
                    long jZzu4 = zzedVar3.zzu();
                    int iZzd2 = zzedVar3.zzd();
                    int i34 = 0;
                    while (true) {
                        int i35 = iZza2 == 0 ? 4 : 8;
                        if (i34 >= i35) {
                            j7 = j10;
                            zzedVar3.zzM(i35);
                            break;
                        }
                        j7 = j10;
                        if (zzedVar3.zzN()[iZzd2 + i34] != -1) {
                            long jZzu5 = iZza2 == 0 ? zzedVar3.zzu() : zzedVar3.zzw();
                            if (jZzu5 == 0) {
                                break;
                            }
                            jZzu = zzen.zzu(jZzu5, 1000000L, jZzu4, RoundingMode.DOWN);
                            break;
                        }
                        i34++;
                        j10 = j7;
                    }
                    long j11 = jZzu;
                    int iZzq = zzedVar3.zzq();
                    StringBuilder sb = new StringBuilder();
                    sb.append((char) (((iZzq >> 10) & 31) + 96));
                    sb.append((char) (((iZzq >> 5) & 31) + 96));
                    sb.append((char) ((iZzq & 31) + 96));
                    zzaho zzahoVar = new zzaho(jZzu4, j11, sb.toString());
                    zzer zzerVarZzb5 = zzeqVarZza3.zzb(1937011556);
                    if (zzerVarZzb5 == null) {
                        throw zzaz.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                    }
                    int i36 = zzahuVar.zza;
                    int i37 = zzahuVar.zzc;
                    String str14 = zzahoVar.zzc;
                    zzed zzedVar4 = zzerVarZzb5.zza;
                    char c4 = '\f';
                    zzedVar4.zzL(12);
                    int iZzg6 = zzedVar4.zzg();
                    str = str12;
                    zzahr zzahrVar3 = new zzahr(iZzg6);
                    str2 = str13;
                    int i38 = 0;
                    while (i38 < iZzg6) {
                        zzaho zzahoVar2 = zzahoVar;
                        int iZzd3 = zzedVar4.zzd();
                        zzahu zzahuVar2 = zzahuVar;
                        int iZzg7 = zzedVar4.zzg();
                        String str15 = "childAtomSize must be positive";
                        zzacz.zzb(iZzg7 > 0, "childAtomSize must be positive");
                        int iZzg8 = zzedVar4.zzg();
                        int i39 = 1701733238;
                        if (iZzg8 == 1635148593 || iZzg8 == 1635148595 || iZzg8 == 1701733238 || iZzg8 == 1831958048 || iZzg8 == 1836070006 || iZzg8 == 1752589105 || iZzg8 == 1751479857 || iZzg8 == 1932670515 || iZzg8 == 1211250227 || iZzg8 == 1748121139 || iZzg8 == 1987063864 || iZzg8 == 1987063865 || iZzg8 == 1635135537 || iZzg8 == 1685479798 || iZzg8 == 1685479729 || iZzg8 == 1685481573 || iZzg8 == 1685481521 || iZzg8 == 1634760241) {
                            i11 = iZzg6;
                            i12 = i7;
                            arrayList2 = arrayList4;
                            str4 = str14;
                            int i40 = i37;
                            int i41 = i36;
                            str11 = str11;
                            i32 = i32;
                            zzeqVar3 = zzeqVar5;
                            j8 = j7;
                            int i42 = iZzg8;
                            zzedVar = zzedVar4;
                            zzedVar.zzL(iZzd3 + 16);
                            zzedVar.zzM(16);
                            int iZzq2 = zzedVar.zzq();
                            int iZzq3 = zzedVar.zzq();
                            zzedVar.zzM(50);
                            int iZzd4 = zzedVar.zzd();
                            if (i42 == 1701733238) {
                                Pair pairZzj = zzj(zzedVar, iZzd3, iZzg7);
                                if (pairZzj != null) {
                                    int iIntValue = ((Integer) pairZzj.first).intValue();
                                    zzsVarZzb = zzsVar == null ? null : zzsVar.zzb(((zzaip) pairZzj.second).zzb);
                                    zzahrVar3.zza[i38] = (zzaip) pairZzj.second;
                                    i39 = iIntValue;
                                } else {
                                    zzsVarZzb = zzsVar;
                                }
                                zzedVar.zzL(iZzd4);
                                i42 = i39;
                            } else {
                                zzsVarZzb = zzsVar;
                            }
                            if (i42 == 1831958048) {
                                str5 = "video/mpeg";
                                i13 = i42;
                            } else if (i42 == 1211250227) {
                                i13 = 1211250227;
                                str5 = str;
                            } else {
                                i13 = i42;
                                str5 = null;
                            }
                            zzs zzsVar2 = zzsVarZzb;
                            float fZzp = 1.0f;
                            int i43 = i13;
                            i14 = i38;
                            int i44 = -1;
                            int i45 = -1;
                            int i46 = 8;
                            zzfg zzfgVar2 = null;
                            int i47 = 8;
                            int i48 = -1;
                            List listZzo = null;
                            ByteBuffer byteBufferZzn = null;
                            zzahm zzahmVar = null;
                            boolean z17 = false;
                            byte[] bArrCopyOfRange = null;
                            String str16 = null;
                            int i49 = -1;
                            int i50 = -1;
                            String str17 = str5;
                            int i51 = iZzd4;
                            int i52 = -1;
                            while (i51 - iZzd3 < iZzg7) {
                                zzedVar.zzL(i51);
                                int iZzd5 = zzedVar.zzd();
                                int iZzg9 = zzedVar.zzg();
                                if (iZzg9 != 0) {
                                    i19 = iZzg9;
                                } else {
                                    if (zzedVar.zzd() - iZzd3 == iZzg7) {
                                        break;
                                    }
                                    i19 = 0;
                                }
                                zzacz.zzb(i19 > 0, str15);
                                int iZzg10 = zzedVar.zzg();
                                int i53 = iZzg7;
                                if (iZzg10 == 1635148611) {
                                    int i54 = iZzd5 + 8;
                                    zzacz.zzb(str17 == null, null);
                                    zzedVar.zzL(i54);
                                    zzabz zzabzVarZza = zzabz.zza(zzedVar);
                                    List list2 = zzabzVarZza.zza;
                                    zzahrVar3.zzc = zzabzVarZza.zzb;
                                    if (z17) {
                                        z16 = true;
                                    } else {
                                        fZzp = zzabzVarZza.zzk;
                                        z16 = false;
                                    }
                                    String str18 = zzabzVarZza.zzl;
                                    int i55 = zzabzVarZza.zzj;
                                    int i56 = zzabzVarZza.zzg;
                                    int i57 = zzabzVarZza.zzh;
                                    int i58 = zzabzVarZza.zzi;
                                    int i59 = zzabzVarZza.zze;
                                    i21 = zzabzVarZza.zzf;
                                    str6 = str15;
                                    str16 = str18;
                                    i49 = i55;
                                    zzahrVar2 = zzahrVar3;
                                    i48 = i58;
                                    str17 = "video/avc";
                                    i47 = i59;
                                    i20 = i52;
                                    z17 = z16;
                                    i44 = i57;
                                    listZzo = list2;
                                    i45 = i56;
                                } else {
                                    i20 = i52;
                                    if (iZzg10 == 1752589123) {
                                        int i60 = iZzd5 + 8;
                                        if (str17 == null) {
                                            str9 = null;
                                            z14 = true;
                                        } else {
                                            str9 = null;
                                            z14 = false;
                                        }
                                        zzacz.zzb(z14, str9);
                                        zzedVar.zzL(i60);
                                        zzadk zzadkVarZza = zzadk.zza(zzedVar);
                                        List list3 = zzadkVarZza.zza;
                                        zzahrVar3.zzc = zzadkVarZza.zzb;
                                        if (z17) {
                                            z15 = true;
                                        } else {
                                            fZzp = zzadkVarZza.zzj;
                                            z15 = false;
                                        }
                                        int i61 = zzadkVarZza.zzk;
                                        int i62 = zzadkVarZza.zzc;
                                        String str19 = zzadkVarZza.zzl;
                                        int i63 = zzadkVarZza.zzi;
                                        if (i63 == -1) {
                                            i63 = i20;
                                        }
                                        int i64 = zzadkVarZza.zzf;
                                        int i65 = zzadkVarZza.zzg;
                                        int i66 = zzadkVarZza.zzh;
                                        int i67 = zzadkVarZza.zzd;
                                        i49 = i61;
                                        i50 = i62;
                                        str6 = str15;
                                        z17 = z15;
                                        str16 = str19;
                                        i20 = i63;
                                        i48 = i66;
                                        i45 = i64;
                                        zzahrVar2 = zzahrVar3;
                                        i21 = zzadkVarZza.zze;
                                        zzfgVar2 = zzadkVarZza.zzm;
                                        listZzo = list3;
                                        i47 = i67;
                                        i44 = i65;
                                        str17 = str11;
                                    } else if (iZzg10 == 1818785347) {
                                        int i68 = iZzd5 + 8;
                                        String str20 = str11;
                                        zzacz.zzb(str20.equals(str17), "lhvC must follow hvcC atom");
                                        if (zzfgVar2 != null) {
                                            z12 = zzfgVar2.zza.size() >= 2;
                                        } else {
                                            z12 = false;
                                            zzfgVar2 = null;
                                        }
                                        zzacz.zzb(z12, "must have at least two layers");
                                        zzedVar.zzL(i68);
                                        zzfgVar2.getClass();
                                        zzadk zzadkVarZzb = zzadk.zzb(zzedVar, zzfgVar2);
                                        zzacz.zzb(zzahrVar3.zzc == zzadkVarZzb.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                        int i69 = zzadkVarZzb.zzf;
                                        if (i69 != -1) {
                                            zzacz.zzb(i45 == i69, "colorSpace must be the same for both views");
                                        }
                                        int i70 = zzadkVarZzb.zzg;
                                        if (i70 != -1) {
                                            zzacz.zzb(i44 == i70, "colorRange must be the same for both views");
                                        }
                                        int i71 = zzadkVarZzb.zzh;
                                        if (i71 != -1) {
                                            zzacz.zzb(i48 == i71, "colorTransfer must be the same for both views");
                                        }
                                        zzacz.zzb(i47 == zzadkVarZzb.zzd, "bitdepthLuma must be the same for both views");
                                        zzacz.zzb(i46 == zzadkVarZzb.zze, "bitdepthChroma must be the same for both views");
                                        if (listZzo != null) {
                                            int i72 = zzfwh.zzd;
                                            zzfwe zzfweVar = new zzfwe();
                                            zzfweVar.zzh(listZzo);
                                            zzfweVar.zzh(zzadkVarZzb.zza);
                                            listZzo = zzfweVar.zzi();
                                            z13 = false;
                                        } else {
                                            z13 = false;
                                            zzacz.zzb(false, "initializationData must be already set from hvcC atom");
                                        }
                                        str16 = zzadkVarZzb.zzl;
                                        i21 = i46;
                                        str6 = str15;
                                        zzahrVar2 = zzahrVar3;
                                        str11 = str20;
                                        i20 = i20;
                                        str17 = "video/mv-hevc";
                                    } else {
                                        String str21 = str11;
                                        if (iZzg10 == 1986361461) {
                                            zzedVar.zzL(iZzd5 + 8);
                                            int iZzd6 = zzedVar.zzd();
                                            str11 = str21;
                                            zzahn zzahnVar = null;
                                            while (iZzd6 - iZzd5 < i19) {
                                                zzedVar.zzL(iZzd6);
                                                int iZzg11 = zzedVar.zzg();
                                                zzacz.zzb(iZzg11 > 0, str15);
                                                int i73 = i46;
                                                if (zzedVar.zzg() == 1702454643) {
                                                    zzedVar.zzL(iZzd6 + 8);
                                                    int iZzd7 = zzedVar.zzd();
                                                    while (true) {
                                                        if (iZzd7 - iZzd6 >= iZzg11) {
                                                            str8 = str15;
                                                            zzahnVar = null;
                                                            break;
                                                        }
                                                        zzedVar.zzL(iZzd7);
                                                        int iZzg12 = zzedVar.zzg();
                                                        zzacz.zzb(iZzg12 > 0, str15);
                                                        str8 = str15;
                                                        if (zzedVar.zzg() == 1937011305) {
                                                            zzedVar.zzM(4);
                                                            int iZzm = zzedVar.zzm();
                                                            zzahnVar = new zzahn(new zzahq(1 == (iZzm & 1), (iZzm & 2) == 2, (iZzm & 8) == 8));
                                                            break;
                                                        }
                                                        iZzd7 += iZzg12;
                                                        str15 = str8;
                                                    }
                                                } else {
                                                    str8 = str15;
                                                }
                                                iZzd6 += iZzg11;
                                                zzahrVar3 = zzahrVar3;
                                                i46 = i73;
                                                str15 = str8;
                                                i47 = i47;
                                            }
                                            i21 = i46;
                                            str6 = str15;
                                            i22 = i47;
                                            zzahrVar2 = zzahrVar3;
                                            zzahv zzahvVar = zzahnVar == null ? null : new zzahv(zzahnVar);
                                            if (zzahvVar != null) {
                                                if (zzfgVar2 == null) {
                                                    z11 = true;
                                                    b8 = -1;
                                                    zzfgVar2 = null;
                                                } else if (zzfgVar2.zza.size() >= 2) {
                                                    zzacz.zzb(zzahvVar.zzb(), "both eye views must be marked as available");
                                                    zzacz.zzb(!zzahvVar.zza.zza.zzc, "for MV-HEVC, eye_views_reversed must be set to false");
                                                    i23 = i44;
                                                    list = listZzo;
                                                    i20 = i20;
                                                    zzfgVar = zzfgVar2;
                                                } else {
                                                    z11 = true;
                                                    b8 = -1;
                                                }
                                                if (i20 != b8) {
                                                    i47 = i22;
                                                } else if (z11 != zzahvVar.zza.zza.zzc) {
                                                    i47 = i22;
                                                    i20 = 4;
                                                } else {
                                                    i20 = 5;
                                                    i47 = i22;
                                                }
                                            } else {
                                                i20 = i20;
                                                i23 = i44;
                                                zzfgVar = zzfgVar2;
                                                list = listZzo;
                                            }
                                            zzfgVar2 = zzfgVar;
                                            i47 = i22;
                                            i44 = i23;
                                            listZzo = list;
                                        } else {
                                            i21 = i46;
                                            str6 = str15;
                                            i22 = i47;
                                            zzahrVar2 = zzahrVar3;
                                            str11 = str21;
                                            i20 = i20;
                                            if (iZzg10 == 1685480259 || iZzg10 == 1685485123) {
                                                i23 = i44;
                                                zzfgVar = zzfgVar2;
                                                list = listZzo;
                                                zzacr zzacrVarZza = zzacr.zza(zzedVar);
                                                if (zzacrVarZza != null) {
                                                    str16 = zzacrVarZza.zza;
                                                    str17 = "video/dolby-vision";
                                                }
                                            } else if (iZzg10 == 1987076931) {
                                                int i74 = iZzd5 + 12;
                                                zzacz.zzb(str17 == null, null);
                                                zzedVar.zzL(i74);
                                                byte bZzm = (byte) zzedVar.zzm();
                                                byte bZzm2 = (byte) zzedVar.zzm();
                                                int iZzm2 = zzedVar.zzm();
                                                i47 = iZzm2 >> 4;
                                                int i75 = iZzm2 >> 1;
                                                int i76 = i43;
                                                String str22 = i76 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                if (str22.equals("video/x-vnd.on2.vp9")) {
                                                    int i77 = zzda.zza;
                                                    i24 = 1;
                                                    z10 = false;
                                                    listZzo = zzfwh.zzo(new byte[]{1, 1, bZzm, 2, 1, bZzm2, 3, 1, (byte) i47, 4, 1, (byte) (i75 & 7)});
                                                } else {
                                                    i24 = 1;
                                                    z10 = false;
                                                }
                                                int i78 = iZzm2 & 1;
                                                int iZzm3 = zzedVar.zzm();
                                                int iZzm4 = zzedVar.zzm();
                                                int iZza3 = zzk.zza(iZzm3);
                                                int i79 = i24 != i78 ? 2 : 1;
                                                int iZzb = zzk.zzb(iZzm4);
                                                i45 = iZza3;
                                                i43 = i76;
                                                i21 = i47;
                                                i44 = i79;
                                                str17 = str22;
                                                i48 = iZzb;
                                            } else {
                                                int i80 = i43;
                                                if (iZzg10 == 1635135811) {
                                                    int i81 = i19 - 8;
                                                    byte[] bArr = new byte[i81];
                                                    zzedVar.zzH(bArr, 0, i81);
                                                    zzfwh zzfwhVarZzo2 = zzfwh.zzo(bArr);
                                                    zzedVar.zzL(iZzd5 + 8);
                                                    zzk zzkVarZzk = zzk(zzedVar);
                                                    int i82 = zzkVarZzk.zzf;
                                                    int i83 = zzkVarZzk.zzg;
                                                    int i84 = zzkVarZzk.zzb;
                                                    int i85 = zzkVarZzk.zzc;
                                                    i43 = i80;
                                                    i21 = i83;
                                                    str17 = "video/av01";
                                                    listZzo = zzfwhVarZzo2;
                                                    i47 = i82;
                                                    i45 = i84;
                                                    i48 = zzkVarZzk.zzd;
                                                    i44 = i85;
                                                } else if (iZzg10 == 1668050025) {
                                                    if (byteBufferZzn == null) {
                                                        byteBufferZzn = zzn();
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferZzn;
                                                    byteBuffer.position(21);
                                                    byteBuffer.putShort(zzedVar.zzE());
                                                    byteBuffer.putShort(zzedVar.zzE());
                                                    byteBufferZzn = byteBuffer;
                                                    i43 = i80;
                                                    i47 = i22;
                                                } else {
                                                    if (iZzg10 == 1835295606) {
                                                        if (byteBufferZzn == null) {
                                                            byteBufferZzn = zzn();
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBufferZzn;
                                                        short sZzE = zzedVar.zzE();
                                                        short sZzE2 = zzedVar.zzE();
                                                        short sZzE3 = zzedVar.zzE();
                                                        short sZzE4 = zzedVar.zzE();
                                                        short sZzE5 = zzedVar.zzE();
                                                        i43 = i80;
                                                        short sZzE6 = zzedVar.zzE();
                                                        zzfgVar = zzfgVar2;
                                                        short sZzE7 = zzedVar.zzE();
                                                        i23 = i44;
                                                        short sZzE8 = zzedVar.zzE();
                                                        long jZzu6 = zzedVar.zzu();
                                                        long jZzu7 = zzedVar.zzu();
                                                        list = listZzo;
                                                        byteBuffer2.position(1);
                                                        byteBuffer2.putShort(sZzE5);
                                                        byteBuffer2.putShort(sZzE6);
                                                        byteBuffer2.putShort(sZzE);
                                                        byteBuffer2.putShort(sZzE2);
                                                        byteBuffer2.putShort(sZzE3);
                                                        byteBuffer2.putShort(sZzE4);
                                                        byteBuffer2.putShort(sZzE7);
                                                        byteBuffer2.putShort(sZzE8);
                                                        byteBuffer2.putShort((short) (jZzu6 / 10000));
                                                        byteBuffer2.putShort((short) (jZzu7 / 10000));
                                                        byteBufferZzn = byteBuffer2;
                                                    } else {
                                                        i23 = i44;
                                                        i43 = i80;
                                                        zzfgVar = zzfgVar2;
                                                        list = listZzo;
                                                        if (iZzg10 == 1681012275) {
                                                            if (str17 == null) {
                                                                str7 = null;
                                                                z9 = true;
                                                            } else {
                                                                str7 = null;
                                                                z9 = false;
                                                            }
                                                            zzacz.zzb(z9, str7);
                                                            str17 = str;
                                                        } else if (iZzg10 == 1702061171) {
                                                            zzacz.zzb(str17 == null, null);
                                                            zzahm zzahmVarZzm = zzm(zzedVar, iZzd5);
                                                            String str23 = zzahmVarZzm.zza;
                                                            byte[] bArr2 = zzahmVarZzm.zzb;
                                                            if (bArr2 != null) {
                                                                zzahmVar = zzahmVarZzm;
                                                                str17 = str23;
                                                                listZzo = zzfwh.zzo(bArr2);
                                                                zzfgVar2 = zzfgVar;
                                                                i47 = i22;
                                                                i44 = i23;
                                                            } else {
                                                                zzahmVar = zzahmVarZzm;
                                                                str17 = str23;
                                                            }
                                                        } else if (iZzg10 == 1885434736) {
                                                            zzedVar.zzL(iZzd5 + 8);
                                                            fZzp = zzedVar.zzp() / zzedVar.zzp();
                                                            zzfgVar2 = zzfgVar;
                                                            i47 = i22;
                                                            i44 = i23;
                                                            listZzo = list;
                                                            z17 = true;
                                                        } else if (iZzg10 == 1937126244) {
                                                            int i86 = iZzd5 + 8;
                                                            while (true) {
                                                                if (i86 - iZzd5 < i19) {
                                                                    zzedVar.zzL(i86);
                                                                    int iZzg13 = zzedVar.zzg() + i86;
                                                                    if (zzedVar.zzg() == 1886547818) {
                                                                        bArrCopyOfRange = Arrays.copyOfRange(zzedVar.zzN(), i86, iZzg13);
                                                                    } else {
                                                                        i86 = iZzg13;
                                                                    }
                                                                } else {
                                                                    zzfgVar2 = zzfgVar;
                                                                    i47 = i22;
                                                                    i44 = i23;
                                                                    listZzo = list;
                                                                    bArrCopyOfRange = null;
                                                                }
                                                            }
                                                        } else if (iZzg10 == 1936995172) {
                                                            int iZzm5 = zzedVar.zzm();
                                                            zzedVar.zzM(3);
                                                            if (iZzm5 == 0) {
                                                                int iZzm6 = zzedVar.zzm();
                                                                if (iZzm6 == 0) {
                                                                    zzfgVar2 = zzfgVar;
                                                                    i47 = i22;
                                                                    i44 = i23;
                                                                    listZzo = list;
                                                                    i20 = 0;
                                                                } else if (iZzm6 == 1) {
                                                                    zzfgVar2 = zzfgVar;
                                                                    i47 = i22;
                                                                    i44 = i23;
                                                                    listZzo = list;
                                                                    i20 = 1;
                                                                } else if (iZzm6 == 2) {
                                                                    zzfgVar2 = zzfgVar;
                                                                    i47 = i22;
                                                                    i44 = i23;
                                                                    listZzo = list;
                                                                    i20 = 2;
                                                                } else if (iZzm6 == 3) {
                                                                    i20 = 3;
                                                                }
                                                            }
                                                        } else if (iZzg10 == 1634760259) {
                                                            int i87 = i19 - 12;
                                                            byte[] bArr3 = new byte[i87];
                                                            zzedVar.zzL(iZzd5 + 12);
                                                            zzedVar.zzH(bArr3, 0, i87);
                                                            zzfwh zzfwhVarZzo3 = zzfwh.zzo(bArr3);
                                                            zzed zzedVar5 = new zzed(bArr3);
                                                            zzi zziVar = new zzi();
                                                            byte[] bArrZzN = zzedVar5.zzN();
                                                            zzec zzecVar = new zzec(bArrZzN, bArrZzN.length);
                                                            int i88 = 8;
                                                            zzecVar.zzl(zzedVar5.zzd() * 8);
                                                            int i89 = 1;
                                                            zzecVar.zzo(1);
                                                            int iZzd8 = zzecVar.zzd(8);
                                                            int i90 = 0;
                                                            while (i90 < iZzd8) {
                                                                zzecVar.zzo(i89);
                                                                int iZzd9 = zzecVar.zzd(i88);
                                                                int i91 = 0;
                                                                while (i91 < iZzd9) {
                                                                    zzecVar.zzn(6);
                                                                    boolean zZzp = zzecVar.zzp();
                                                                    zzecVar.zzm();
                                                                    zzecVar.zzo(11);
                                                                    zzecVar.zzn(4);
                                                                    int iZzd10 = zzecVar.zzd(4) + 8;
                                                                    zziVar.zzf(iZzd10);
                                                                    zziVar.zza(iZzd10);
                                                                    zzecVar.zzo(1);
                                                                    if (zZzp) {
                                                                        int iZzd11 = zzecVar.zzd(i88);
                                                                        int iZzd12 = zzecVar.zzd(i88);
                                                                        zzecVar.zzo(1);
                                                                        boolean zZzp2 = zzecVar.zzp();
                                                                        zziVar.zzc(zzk.zza(iZzd11));
                                                                        zziVar.zzb(true != zZzp2 ? 2 : 1);
                                                                        zziVar.zzd(zzk.zzb(iZzd12));
                                                                    }
                                                                    i91++;
                                                                    i88 = 8;
                                                                }
                                                                i90++;
                                                                i89 = 1;
                                                                i88 = 8;
                                                            }
                                                            zzk zzkVarZzg = zziVar.zzg();
                                                            int i92 = zzkVarZzg.zzf;
                                                            int i93 = zzkVarZzg.zzg;
                                                            int i94 = zzkVarZzg.zzb;
                                                            int i95 = zzkVarZzg.zzc;
                                                            listZzo = zzfwhVarZzo3;
                                                            i21 = i93;
                                                            str17 = "video/apv";
                                                            zzfgVar2 = zzfgVar;
                                                            i48 = zzkVarZzg.zzd;
                                                            i44 = i95;
                                                            i47 = i92;
                                                            i45 = i94;
                                                        } else if (iZzg10 == 1668246642 && i45 == -1) {
                                                            if (i48 == -1) {
                                                                int iZzg14 = zzedVar.zzg();
                                                                if (iZzg14 == 1852009592 || iZzg14 == 1852009571) {
                                                                    int iZzq4 = zzedVar.zzq();
                                                                    int iZzq5 = zzedVar.zzq();
                                                                    zzedVar.zzM(2);
                                                                    if (i19 != 19) {
                                                                        z8 = false;
                                                                    } else if ((zzedVar.zzm() & 128) != 0) {
                                                                        i19 = 19;
                                                                        z8 = true;
                                                                    } else {
                                                                        i19 = 19;
                                                                        z8 = false;
                                                                    }
                                                                    int iZza4 = zzk.zza(iZzq4);
                                                                    int i96 = true != z8 ? 2 : 1;
                                                                    int iZzb2 = zzk.zzb(iZzq5);
                                                                    zzfgVar2 = zzfgVar;
                                                                    i47 = i22;
                                                                    listZzo = list;
                                                                    i45 = iZza4;
                                                                    i44 = i96;
                                                                    i48 = iZzb2;
                                                                } else {
                                                                    zzdq.zzf("BoxParsers", "Unsupported color type: ".concat(zzet.zze(iZzg14)));
                                                                    i45 = -1;
                                                                    i48 = -1;
                                                                }
                                                            } else {
                                                                i45 = -1;
                                                            }
                                                        }
                                                    }
                                                    zzfgVar2 = zzfgVar;
                                                    i47 = i22;
                                                    i44 = i23;
                                                    listZzo = list;
                                                }
                                            }
                                            zzfgVar2 = zzfgVar;
                                            i47 = i22;
                                            i44 = i23;
                                            listZzo = list;
                                        }
                                    }
                                }
                                i51 += i19;
                                i52 = i20;
                                iZzd3 = iZzd3;
                                iZzg7 = i53;
                                zzahrVar3 = zzahrVar2;
                                i46 = i21;
                                str15 = str6;
                            }
                            i15 = iZzd3;
                            int i97 = i44;
                            int i98 = i52;
                            int i99 = i46;
                            int i100 = i47;
                            List list4 = listZzo;
                            zzahr zzahrVar4 = zzahrVar3;
                            i16 = iZzg7;
                            b7 = -1;
                            c3 = '\f';
                            if (str17 == null) {
                                i17 = i41;
                                zzahrVar = zzahrVar4;
                                i18 = i40;
                            } else {
                                zzx zzxVar = new zzx();
                                i17 = i41;
                                zzxVar.zzN(i17);
                                zzxVar.zzad(str17);
                                zzxVar.zzC(str16);
                                zzxVar.zzai(iZzq2);
                                zzxVar.zzM(iZzq3);
                                zzxVar.zzZ(fZzp);
                                i18 = i40;
                                zzxVar.zzac(i18);
                                zzxVar.zzaa(bArrCopyOfRange);
                                zzxVar.zzag(i98);
                                zzxVar.zzP(list4);
                                zzxVar.zzU(i49);
                                zzxVar.zzV(i50);
                                zzxVar.zzH(zzsVar2);
                                zzi zziVar2 = new zzi();
                                zziVar2.zzc(i45);
                                zziVar2.zzb(i97);
                                zziVar2.zzd(i48);
                                zziVar2.zze(byteBufferZzn != null ? byteBufferZzn.array() : null);
                                zziVar2.zzf(i100);
                                zziVar2.zza(i99);
                                zzxVar.zzD(zziVar2.zzg());
                                if (zzahmVar != null) {
                                    zzxVar.zzA(zzfzk.zze(zzahmVar.zzc));
                                    zzxVar.zzY(zzfzk.zze(zzahmVar.zzd));
                                }
                                zzahrVar = zzahrVar4;
                                zzahrVar.zzb = zzxVar.zzaj();
                            }
                        } else if (iZzg8 == 1836069985 || iZzg8 == 1701733217 || iZzg8 == 1633889587 || iZzg8 == 1700998451 || iZzg8 == 1633889588 || iZzg8 == 1835823201 || iZzg8 == 1685353315 || iZzg8 == 1685353317 || iZzg8 == 1685353320 || iZzg8 == 1685353324 || iZzg8 == 1685353336 || iZzg8 == 1935764850 || iZzg8 == 1935767394 || iZzg8 == 1819304813 || iZzg8 == 1936684916 || iZzg8 == 1953984371 || iZzg8 == 778924082 || iZzg8 == 778924083 || iZzg8 == 1835557169 || iZzg8 == 1835560241 || iZzg8 == 1634492771 || iZzg8 == 1634492791 || iZzg8 == 1970037111 || iZzg8 == 1332770163 || iZzg8 == 1716281667 || iZzg8 == 1767992678) {
                            i11 = iZzg6;
                            zzeqVar3 = zzeqVar5;
                            zzedVar = zzedVar4;
                            i12 = i7;
                            arrayList2 = arrayList4;
                            str4 = str14;
                            j8 = j7;
                            zzo(zzedVar4, iZzg8, iZzd3, iZzg7, i36, str14, z7, zzsVar, zzahrVar3, i38);
                            i15 = iZzd3;
                            zzahrVar = zzahrVar3;
                            i14 = i38;
                            i16 = iZzg7;
                            i17 = i36;
                            i18 = i37;
                            b7 = -1;
                            c3 = '\f';
                        } else if (iZzg8 == 1414810956 || iZzg8 == 1954034535 || iZzg8 == 2004251764 || iZzg8 == 1937010800 || iZzg8 == 1664495672) {
                            zzedVar4.zzL(iZzd3 + 16);
                            long j12 = Long.MAX_VALUE;
                            if (iZzg8 == 1414810956) {
                                str10 = str2;
                            } else {
                                if (iZzg8 == 1954034535) {
                                    int i101 = iZzg7 - 16;
                                    byte[] bArr4 = new byte[i101];
                                    zzedVar4.zzH(bArr4, 0, i101);
                                    zzfwhVarZzo = zzfwh.zzo(bArr4);
                                    str10 = "application/x-quicktime-tx3g";
                                    i37 = i37;
                                    str11 = str11;
                                } else if (iZzg8 == 2004251764) {
                                    str10 = "application/x-mp4-vtt";
                                } else {
                                    str11 = str11;
                                    if (iZzg8 == 1937010800) {
                                        str10 = str2;
                                        j12 = 0;
                                    } else {
                                        zzahrVar3.zzd = 1;
                                        str10 = "application/x-mp4-cea-608";
                                        j12 = Long.MAX_VALUE;
                                    }
                                    zzfwhVarZzo = null;
                                }
                                zzx zzxVar2 = new zzx();
                                zzxVar2.zzN(i36);
                                zzxVar2.zzad(str10);
                                zzxVar2.zzS(str14);
                                zzxVar2.zzah(j12);
                                zzxVar2.zzP(zzfwhVarZzo);
                                zzahrVar3.zzb = zzxVar2.zzaj();
                                i15 = iZzd3;
                                i11 = iZzg6;
                                zzedVar = zzedVar4;
                                i12 = i7;
                                arrayList2 = arrayList4;
                                str4 = str14;
                                i17 = i36;
                                zzahrVar = zzahrVar3;
                                i16 = iZzg7;
                                i18 = i37;
                                i32 = i32;
                                zzeqVar3 = zzeqVar5;
                                j8 = j7;
                                b7 = -1;
                                c3 = '\f';
                                i14 = i38;
                            }
                            zzfwhVarZzo = null;
                            zzx zzxVar3 = new zzx();
                            zzxVar3.zzN(i36);
                            zzxVar3.zzad(str10);
                            zzxVar3.zzS(str14);
                            zzxVar3.zzah(j12);
                            zzxVar3.zzP(zzfwhVarZzo);
                            zzahrVar3.zzb = zzxVar3.zzaj();
                            i15 = iZzd3;
                            i11 = iZzg6;
                            zzedVar = zzedVar4;
                            i12 = i7;
                            arrayList2 = arrayList4;
                            str4 = str14;
                            i17 = i36;
                            zzahrVar = zzahrVar3;
                            i16 = iZzg7;
                            i18 = i37;
                            i32 = i32;
                            zzeqVar3 = zzeqVar5;
                            j8 = j7;
                            b7 = -1;
                            c3 = '\f';
                            i14 = i38;
                        } else {
                            if (iZzg8 == 1835365492) {
                                zzedVar4.zzL(iZzd3 + 16);
                                zzedVar4.zzy((char) 0);
                                String strZzy = zzedVar4.zzy((char) 0);
                                if (strZzy != null) {
                                    zzx zzxVar4 = new zzx();
                                    zzxVar4.zzN(i36);
                                    zzxVar4.zzad(strZzy);
                                    zzahrVar3.zzb = zzxVar4.zzaj();
                                }
                            } else if (iZzg8 == 1667329389) {
                                zzx zzxVar5 = new zzx();
                                zzxVar5.zzN(i36);
                                zzxVar5.zzad("application/x-camera-motion");
                                zzahrVar3.zzb = zzxVar5.zzaj();
                            }
                            i15 = iZzd3;
                            i11 = iZzg6;
                            i12 = i7;
                            arrayList2 = arrayList4;
                            str4 = str14;
                            i18 = i37;
                            i17 = i36;
                            str11 = str11;
                            zzahrVar = zzahrVar3;
                            i16 = iZzg7;
                            i32 = i32;
                            zzeqVar3 = zzeqVar5;
                            j8 = j7;
                            b7 = -1;
                            zzedVar = zzedVar4;
                            i14 = i38;
                            c3 = '\f';
                        }
                        zzedVar.zzL(i15 + i16);
                        i38 = i14 + 1;
                        zzahrVar3 = zzahrVar;
                        c4 = c3;
                        i36 = i17;
                        i37 = i18;
                        zzedVar4 = zzedVar;
                        str11 = str11;
                        str14 = str4;
                        iZzg6 = i11;
                        i7 = i12;
                        i32 = i32;
                        zzahuVar = zzahuVar2;
                        zzahoVar = zzahoVar2;
                        j7 = j8;
                        zzeqVar5 = zzeqVar3;
                        arrayList4 = arrayList2;
                    }
                    zzaho zzahoVar3 = zzahoVar;
                    int i102 = i7;
                    arrayList = arrayList4;
                    str3 = str11;
                    zzahr zzahrVar5 = zzahrVar3;
                    zzahu zzahuVar3 = zzahuVar;
                    i9 = i32;
                    zzeq zzeqVar6 = zzeqVar5;
                    long j13 = j7;
                    i27 = 4;
                    if (z4) {
                        zzeqVar2 = zzeqVar6;
                    } else {
                        zzeqVar2 = zzeqVar6;
                        zzeq zzeqVarZza4 = zzeqVar2.zza(1701082227);
                        if (zzeqVarZza4 != null) {
                            zzer zzerVarZzb6 = zzeqVarZza4.zzb(1701606260);
                            if (zzerVarZzb6 == null) {
                                pairCreate = null;
                                i10 = 8;
                            } else {
                                zzed zzedVar6 = zzerVarZzb6.zza;
                                i10 = 8;
                                zzedVar6.zzL(8);
                                int iZza5 = zza(zzedVar6.zzg());
                                int iZzp = zzedVar6.zzp();
                                long[] jArr3 = new long[iZzp];
                                long[] jArr4 = new long[iZzp];
                                for (int i103 = 0; i103 < iZzp; i103++) {
                                    jArr3[i103] = iZza5 == 1 ? zzedVar6.zzw() : zzedVar6.zzu();
                                    jArr4[i103] = iZza5 == 1 ? zzedVar6.zzt() : zzedVar6.zzg();
                                    if (zzedVar6.zzE() != 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    zzedVar6.zzM(2);
                                }
                                pairCreate = Pair.create(jArr3, jArr4);
                            }
                            if (pairCreate != null) {
                                jArr2 = (long[]) pairCreate.first;
                                jArr = (long[]) pairCreate.second;
                            }
                            zzzVar = zzahrVar5.zzb;
                            if (zzzVar == null) {
                                zzaioVar = null;
                            } else {
                                zzaioVar = new zzaio(zzahuVar3.zza, i102, zzahoVar3.zza, j13, jZzu3, zzahoVar3.zzb, zzzVar, zzahrVar5.zzd, zzahrVar5.zza, zzahrVar5.zzc, jArr2, jArr);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        zzzVar = zzahrVar5.zzb;
                        if (zzzVar == null) {
                            zzaioVar = null;
                        } else {
                            zzaioVar = new zzaio(zzahuVar3.zza, i102, zzahoVar3.zza, j13, jZzu3, zzahoVar3.zzb, zzzVar, zzahrVar5.zzd, zzahrVar5.zza, zzahrVar5.zzc, jArr2, jArr);
                        }
                    }
                    i10 = 8;
                    jArr = null;
                    jArr2 = null;
                    zzzVar = zzahrVar5.zzb;
                    if (zzzVar == null) {
                        zzaioVar = null;
                    } else {
                        zzaioVar = new zzaio(zzahuVar3.zza, i102, zzahoVar3.zza, j13, jZzu3, zzahoVar3.zzb, zzzVar, zzahrVar5.zzd, zzahrVar5.zza, zzahrVar5.zzc, jArr2, jArr);
                    }
                }
                zzaio zzaioVar2 = (zzaio) zzfswVar.apply(zzaioVar);
                if (zzaioVar2 != null) {
                    i25 = 1835297121;
                    zzeq zzeqVarZza5 = zzeqVar2.zza(1835297121);
                    zzeqVarZza5.getClass();
                    zzeq zzeqVarZza6 = zzeqVarZza5.zza(1835626086);
                    zzeqVarZza6.getClass();
                    zzeq zzeqVarZza7 = zzeqVarZza6.zza(1937007212);
                    zzeqVarZza7.getClass();
                    zzair zzairVarZze = zze(zzaioVar2, zzeqVarZza7, zzadjVar);
                    arrayList3 = arrayList;
                    arrayList3.add(zzairVarZze);
                } else {
                    arrayList3 = arrayList;
                    i25 = 1835297121;
                }
            }
            i28 = i10;
            i26 = i25;
            i29 = i9 + 1;
            str11 = str3;
            str12 = str;
            str13 = str2;
            arrayList4 = arrayList3;
        }
        return arrayList4;
    }

    public static void zzg(zzed zzedVar) {
        int iZzd = zzedVar.zzd();
        zzedVar.zzM(4);
        if (zzedVar.zzg() != 1751411826) {
            iZzd += 4;
        }
        zzedVar.zzL(iZzd);
    }

    private static int zzh(zzed zzedVar) {
        int iZzm = zzedVar.zzm();
        int i7 = iZzm & 127;
        while ((iZzm & 128) == 128) {
            iZzm = zzedVar.zzm();
            i7 = (i7 << 7) | (iZzm & 127);
        }
        return i7;
    }

    private static int zzi(zzed zzedVar) {
        zzedVar.zzL(16);
        return zzedVar.zzg();
    }

    private static Pair zzj(zzed zzedVar, int i7, int i8) throws zzaz {
        zzaip zzaipVar;
        Pair pairCreate;
        int i9;
        int i10;
        byte[] bArr;
        int iZzd = zzedVar.zzd();
        while (iZzd - i7 < i8) {
            zzedVar.zzL(iZzd);
            int iZzg = zzedVar.zzg();
            zzacz.zzb(iZzg > 0, "childAtomSize must be positive");
            if (zzedVar.zzg() == 1936289382) {
                int i11 = iZzd + 8;
                int i12 = 0;
                int i13 = -1;
                String strZzB = null;
                Integer numValueOf = null;
                while (i11 - iZzd < iZzg) {
                    zzedVar.zzL(i11);
                    int iZzg2 = zzedVar.zzg();
                    int iZzg3 = zzedVar.zzg();
                    if (iZzg3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzedVar.zzg());
                    } else if (iZzg3 == 1935894637) {
                        zzedVar.zzM(4);
                        strZzB = zzedVar.zzB(4, StandardCharsets.UTF_8);
                    } else if (iZzg3 == 1935894633) {
                        i13 = i11;
                        i12 = iZzg2;
                    }
                    i11 += iZzg2;
                }
                if ("cenc".equals(strZzB) || "cbc1".equals(strZzB) || "cens".equals(strZzB) || "cbcs".equals(strZzB)) {
                    zzacz.zzb(numValueOf != null, "frma atom is mandatory");
                    zzacz.zzb(i13 != -1, "schi atom is mandatory");
                    int i14 = i13 + 8;
                    while (true) {
                        if (i14 - i13 >= i12) {
                            zzaipVar = null;
                            break;
                        }
                        zzedVar.zzL(i14);
                        int iZzg4 = zzedVar.zzg();
                        if (zzedVar.zzg() == 1952804451) {
                            int iZza = zza(zzedVar.zzg());
                            zzedVar.zzM(1);
                            if (iZza == 0) {
                                zzedVar.zzM(1);
                                i9 = 0;
                                i10 = 0;
                            } else {
                                int iZzm = zzedVar.zzm();
                                int i15 = (iZzm & 240) >> 4;
                                i9 = iZzm & 15;
                                i10 = i15;
                            }
                            boolean z4 = zzedVar.zzm() == 1;
                            int iZzm2 = zzedVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzedVar.zzH(bArr2, 0, 16);
                            if (z4 && iZzm2 == 0) {
                                int iZzm3 = zzedVar.zzm();
                                byte[] bArr3 = new byte[iZzm3];
                                zzedVar.zzH(bArr3, 0, iZzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            zzaipVar = new zzaip(z4, strZzB, iZzm2, bArr2, i10, i9, bArr);
                            break;
                        }
                        i14 += iZzg4;
                    }
                    zzacz.zzb(zzaipVar != null, "tenc atom is mandatory");
                    int i16 = zzen.zza;
                    pairCreate = Pair.create(numValueOf, zzaipVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzd += iZzg;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:75:0x0151  */
    /* JADX WARN: Code duplicated, block: B:83:0x016b A[PHI: r3
      0x016b: PHI (r3v5 int) = (r3v4 int), (r3v4 int), (r3v8 int) binds: [B:76:0x015d, B:77:0x015f, B:82:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x017a  */
    private static zzk zzk(zzed zzedVar) {
        int i7;
        int iZzd;
        int iZzd2;
        zzi zziVar = new zzi();
        byte[] bArrZzN = zzedVar.zzN();
        zzec zzecVar = new zzec(bArrZzN, bArrZzN.length);
        zzecVar.zzl(zzedVar.zzd() * 8);
        zzecVar.zzo(1);
        int iZzd3 = zzecVar.zzd(3);
        zzecVar.zzn(6);
        boolean zZzp = zzecVar.zzp();
        boolean zZzp2 = zzecVar.zzp();
        boolean z4 = false;
        if (iZzd3 != 2) {
            if (iZzd3 <= 2) {
                i7 = true != zZzp ? 8 : 10;
                zziVar.zzf(i7);
                zziVar.zza(i7);
            }
        } else if (zZzp) {
            i7 = true == zZzp2 ? 12 : 10;
            zziVar.zzf(i7);
            zziVar.zza(i7);
        } else {
            zZzp = false;
            iZzd3 = 2;
            if (iZzd3 <= 2) {
                if (true != zZzp) {
                }
                zziVar.zzf(i7);
                zziVar.zza(i7);
            }
        }
        int i8 = 13;
        zzecVar.zzn(13);
        zzecVar.zzm();
        int iZzd4 = zzecVar.zzd(4);
        if (iZzd4 != 1) {
            zzdq.zze("BoxParsers", "Unsupported obu_type: " + iZzd4);
            return zziVar.zzg();
        }
        if (zzecVar.zzp()) {
            zzdq.zze("BoxParsers", "Unsupported obu_extension_flag");
            return zziVar.zzg();
        }
        boolean zZzp3 = zzecVar.zzp();
        zzecVar.zzm();
        if (zZzp3 && zzecVar.zzd(8) > 127) {
            zzdq.zze("BoxParsers", "Excessive obu_size");
            return zziVar.zzg();
        }
        int iZzd5 = zzecVar.zzd(3);
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
        int iZzd6 = zzecVar.zzd(5);
        for (int i9 = 0; i9 <= iZzd6; i9++) {
            zzecVar.zzn(12);
            if (zzecVar.zzd(5) > 7) {
                zzecVar.zzm();
            }
        }
        int iZzd7 = zzecVar.zzd(4);
        int iZzd8 = zzecVar.zzd(4);
        zzecVar.zzn(iZzd7 + 1);
        zzecVar.zzn(iZzd8 + 1);
        if (zzecVar.zzp()) {
            zzecVar.zzn(7);
        }
        zzecVar.zzn(7);
        boolean zZzp4 = zzecVar.zzp();
        if (zZzp4) {
            zzecVar.zzn(2);
        }
        if ((zzecVar.zzp() || zzecVar.zzd(1) > 0) && !zzecVar.zzp()) {
            zzecVar.zzn(1);
        }
        if (zZzp4) {
            zzecVar.zzn(3);
        }
        zzecVar.zzn(3);
        boolean zZzp5 = zzecVar.zzp();
        if (iZzd5 != 2) {
            if (iZzd5 != 1) {
            }
            if (zzecVar.zzp()) {
                int iZzd9 = zzecVar.zzd(8);
                iZzd = zzecVar.zzd(8);
                int iZzd10 = zzecVar.zzd(8);
                if (!z4 || iZzd9 != 1) {
                    i8 = iZzd;
                    iZzd2 = zzecVar.zzd(1);
                } else if (iZzd != 13) {
                    iZzd9 = 1;
                    i8 = iZzd;
                    iZzd2 = zzecVar.zzd(1);
                } else if (iZzd10 == 0) {
                    iZzd2 = 1;
                    iZzd9 = 1;
                } else {
                    iZzd9 = 1;
                    iZzd2 = zzecVar.zzd(1);
                }
                zziVar.zzc(zzk.zza(iZzd9));
                zziVar.zzb(iZzd2 != 1 ? 2 : 1);
                zziVar.zzd(zzk.zzb(i8));
            }
            return zziVar.zzg();
        }
        if (zZzp5) {
            zzecVar.zzm();
        }
        if (zzecVar.zzp()) {
            z4 = true;
        }
        if (zzecVar.zzp()) {
            int iZzd11 = zzecVar.zzd(8);
            iZzd = zzecVar.zzd(8);
            int iZzd12 = zzecVar.zzd(8);
            if (!z4) {
                i8 = iZzd;
                iZzd2 = zzecVar.zzd(1);
            } else {
                i8 = iZzd;
                iZzd2 = zzecVar.zzd(1);
            }
            zziVar.zzc(zzk.zza(iZzd11));
            zziVar.zzb(iZzd2 != 1 ? 2 : 1);
            zziVar.zzd(zzk.zzb(i8));
        }
        return zziVar.zzg();
    }

    private static zzav zzl(zzed zzedVar) {
        short sZzE = zzedVar.zzE();
        zzedVar.zzM(2);
        String strZzB = zzedVar.zzB(sZzE, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzB.lastIndexOf(43), strZzB.lastIndexOf(45));
        try {
            return new zzav(-9223372036854775807L, new zzeu(Float.parseFloat(strZzB.substring(0, iMax)), Float.parseFloat(strZzB.substring(iMax, strZzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzahm zzm(zzed zzedVar, int i7) {
        zzedVar.zzL(i7 + 12);
        zzedVar.zzM(1);
        zzh(zzedVar);
        zzedVar.zzM(2);
        int iZzm = zzedVar.zzm();
        if ((iZzm & 128) != 0) {
            zzedVar.zzM(2);
        }
        if ((iZzm & 64) != 0) {
            zzedVar.zzM(zzedVar.zzm());
        }
        if ((iZzm & 32) != 0) {
            zzedVar.zzM(2);
        }
        zzedVar.zzM(1);
        zzh(zzedVar);
        String strZzd = zzay.zzd(zzedVar.zzm());
        if ("audio/mpeg".equals(strZzd) || "audio/vnd.dts".equals(strZzd) || "audio/vnd.dts.hd".equals(strZzd)) {
            return new zzahm(strZzd, null, -1L, -1L);
        }
        zzedVar.zzM(4);
        long jZzu = zzedVar.zzu();
        long jZzu2 = zzedVar.zzu();
        zzedVar.zzM(1);
        int iZzh = zzh(zzedVar);
        byte[] bArr = new byte[iZzh];
        zzedVar.zzH(bArr, 0, iZzh);
        return new zzahm(strZzd, bArr, jZzu2 <= 0 ? -1L : jZzu2, jZzu > 0 ? jZzu : -1L);
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Code duplicated, block: B:242:0x04df A[PHI: r1 r16 r24
      0x04df: PHI (r1v34 java.lang.String) = (r1v29 java.lang.String), (r1v35 java.lang.String), (r1v29 java.lang.String), (r1v29 java.lang.String) binds: [B:217:0x044d, B:219:0x045b, B:215:0x0423, B:213:0x0407] A[DONT_GENERATE, DONT_INLINE]
      0x04df: PHI (r16v3 com.google.android.gms.internal.ads.zzahm) = 
      (r16v2 com.google.android.gms.internal.ads.zzahm)
      (r16v4 com.google.android.gms.internal.ads.zzahm)
      (r16v2 com.google.android.gms.internal.ads.zzahm)
      (r16v2 com.google.android.gms.internal.ads.zzahm)
     binds: [B:217:0x044d, B:219:0x045b, B:215:0x0423, B:213:0x0407] A[DONT_GENERATE, DONT_INLINE]
      0x04df: PHI (r24v1 java.lang.String) = (r24v2 java.lang.String), (r24v2 java.lang.String), (r24v3 java.lang.String), (r24v3 java.lang.String) binds: [B:217:0x044d, B:219:0x045b, B:215:0x0423, B:213:0x0407] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    private static void zzo(zzed zzedVar, int i7, int i8, int i9, int i10, String str, boolean z4, zzs zzsVar, zzahr zzahrVar, int i11) throws zzaz {
        int iZzq;
        int iZzn;
        int iZzg;
        int i12;
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        String str3;
        boolean z7;
        zzed zzedVar2 = zzedVar;
        int i17 = i7;
        int i18 = i8;
        int i19 = i9;
        zzs zzsVarZzb = zzsVar;
        zzedVar2.zzL(i18 + 16);
        if (z4) {
            iZzq = zzedVar.zzq();
            zzedVar2.zzM(6);
        } else {
            zzedVar2.zzM(8);
            iZzq = 0;
        }
        if (iZzq == 0 || iZzq == 1) {
            int iZzq2 = zzedVar.zzq();
            zzedVar2.zzM(6);
            iZzn = zzedVar.zzn();
            zzedVar2.zzL(zzedVar.zzd() - 4);
            iZzg = zzedVar.zzg();
            if (iZzq == 1) {
                zzedVar2.zzM(16);
            }
            i12 = iZzq2;
            i13 = -1;
        } else {
            if (iZzq != 2) {
                return;
            }
            zzedVar2.zzM(16);
            iZzn = (int) Math.round(Double.longBitsToDouble(zzedVar.zzt()));
            int iZzp = zzedVar.zzp();
            zzedVar2.zzM(4);
            int iZzp2 = zzedVar.zzp();
            int iZzp3 = zzedVar.zzp();
            int i20 = iZzp3 & 1;
            int i21 = iZzp3 & 2;
            if (i20 == 0) {
                if (iZzp2 == 8) {
                    i13 = 3;
                } else if (iZzp2 == 16) {
                    i13 = i21 != 0 ? 268435456 : 2;
                } else if (iZzp2 == 24) {
                    i13 = i21 != 0 ? 1342177280 : 21;
                } else if (iZzp2 == 32) {
                    i13 = i21 != 0 ? 1610612736 : 22;
                } else {
                    i13 = -1;
                }
            } else if (iZzp2 == 32) {
                i13 = 4;
            } else {
                i13 = -1;
            }
            zzedVar2.zzM(8);
            i12 = iZzp;
            iZzg = 0;
        }
        if (i17 == 1767992678) {
            i12 = -1;
            iZzn = -1;
        } else {
            if (i17 == 1935764850) {
                iZzn = 8000;
            } else if (i17 == 1935767394) {
                iZzn = 16000;
                i17 = 1935767394;
            }
            i12 = 1;
        }
        int iZzd = zzedVar.zzd();
        int iIntValue = 1701733217;
        if (i17 == 1701733217) {
            Pair pairZzj = zzj(zzedVar2, i18, i19);
            if (pairZzj != null) {
                iIntValue = ((Integer) pairZzj.first).intValue();
                zzsVarZzb = zzsVarZzb == null ? null : zzsVarZzb.zzb(((zzaip) pairZzj.second).zzb);
                zzahrVar.zza[i11] = (zzaip) pairZzj.second;
            }
            i17 = iIntValue;
            zzedVar2.zzL(iZzd);
        }
        String str4 = "audio/mhm1";
        if (i17 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i17 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i17 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i17 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i17 == 1685353320 || i17 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i17 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i17 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i17 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i17 == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (i17 == 1936684916) {
            str2 = "audio/raw";
            i13 = 2;
        } else if (i17 == 1953984371) {
            str2 = "audio/raw";
            i13 = 268435456;
        } else if (i17 == 1819304813) {
            if (i13 == -1) {
                str2 = "audio/raw";
                i13 = 2;
            } else {
                str2 = "audio/raw";
            }
        } else if (i17 == 778924082 || i17 == 778924083) {
            str2 = "audio/mpeg";
        } else if (i17 == 1835557169) {
            str2 = "audio/mha1";
        } else if (i17 == 1835560241) {
            str2 = "audio/mhm1";
        } else if (i17 == 1634492771) {
            str2 = "audio/alac";
        } else if (i17 == 1634492791) {
            str2 = "audio/g711-alaw";
        } else if (i17 == 1970037111) {
            str2 = "audio/g711-mlaw";
        } else if (i17 == 1332770163) {
            str2 = "audio/opus";
        } else if (i17 == 1716281667) {
            str2 = "audio/flac";
        } else if (i17 == 1835823201) {
            str2 = "audio/true-hd";
        } else {
            str2 = i17 == 1767992678 ? "audio/iamf" : null;
        }
        int i22 = i13;
        String str5 = null;
        List listZzo = null;
        zzahm zzahmVarZzm = null;
        while (iZzd - i18 < i19) {
            zzedVar2.zzL(iZzd);
            int iZzg2 = zzedVar.zzg();
            String str6 = "childAtomSize must be positive";
            zzacz.zzb(iZzg2 > 0, "childAtomSize must be positive");
            int iZzg3 = zzedVar.zzg();
            str5 = str5;
            if (iZzg3 == 1835557187) {
                zzedVar2.zzL(iZzd + 8);
                zzedVar2.zzM(1);
                int iZzm = zzedVar.zzm();
                zzedVar2.zzM(1);
                String str7 = Objects.equals(str2, str4) ? String.format("mhm1.%02X", Integer.valueOf(iZzm)) : String.format("mha1.%02X", Integer.valueOf(iZzm));
                int iZzq3 = zzedVar.zzq();
                byte[] bArr = new byte[iZzq3];
                zzedVar2.zzH(bArr, 0, iZzq3);
                listZzo = listZzo == null ? zzfwh.zzo(bArr) : zzfwh.zzp(bArr, (byte[]) listZzo.get(0));
                str4 = str4;
                str5 = str7;
            } else if (iZzg3 == 1835557200) {
                zzedVar2.zzL(iZzd + 8);
                int iZzm2 = zzedVar.zzm();
                if (iZzm2 > 0) {
                    byte[] bArr2 = new byte[iZzm2];
                    zzedVar2.zzH(bArr2, 0, iZzm2);
                    if (listZzo == null) {
                        listZzo = zzfwh.zzo(bArr2);
                        str4 = str4;
                    } else {
                        listZzo = zzfwh.zzp((byte[]) listZzo.get(0), bArr2);
                        str4 = str4;
                    }
                } else {
                    str4 = str4;
                    str5 = str5;
                }
            } else {
                if (iZzg3 == 1702061171) {
                    str4 = str4;
                    i14 = iZzd;
                    i15 = -1;
                } else if (z4 && iZzg3 == 2002876005) {
                    int iZzd2 = zzedVar.zzd();
                    if (iZzd2 >= iZzd) {
                        str3 = null;
                        z7 = true;
                    } else {
                        str3 = null;
                        z7 = false;
                    }
                    zzacz.zzb(z7, str3);
                    int i23 = iZzd2;
                    while (true) {
                        if (i23 - iZzd >= iZzg2) {
                            str4 = str4;
                            i14 = -1;
                            break;
                        }
                        zzedVar2.zzL(i23);
                        int iZzg4 = zzedVar.zzg();
                        zzacz.zzb(iZzg4 > 0, str6);
                        String str8 = str6;
                        if (zzedVar.zzg() == 1702061171) {
                            i14 = i23;
                            break;
                        } else {
                            i23 += iZzg4;
                            str4 = str4;
                            str6 = str8;
                        }
                    }
                    i15 = -1;
                } else {
                    str4 = str4;
                    if (iZzg3 == 1684103987) {
                        zzedVar2.zzL(iZzd + 8);
                        zzahrVar.zzb = zzabu.zzc(zzedVar2, Integer.toString(i10), str, zzsVarZzb);
                    } else if (iZzg3 == 1684366131) {
                        zzedVar2.zzL(iZzd + 8);
                        zzahrVar.zzb = zzabu.zzd(zzedVar2, Integer.toString(i10), str, zzsVarZzb);
                    } else if (iZzg3 == 1684103988) {
                        zzedVar2.zzL(iZzd + 8);
                        zzahrVar.zzb = zzaby.zza(zzedVar2, Integer.toString(i10), str, zzsVarZzb);
                    } else if (iZzg3 != 1684892784) {
                        if (iZzg3 == 1684305011 || iZzg3 == 1969517683) {
                            zzx zzxVar = new zzx();
                            zzxVar.zzN(i10);
                            zzxVar.zzad(str2);
                            zzxVar.zzB(i12);
                            zzxVar.zzae(iZzn);
                            zzxVar.zzH(zzsVarZzb);
                            zzxVar.zzS(str);
                            zzahrVar.zzb = zzxVar.zzaj();
                        } else if (iZzg3 == 1682927731) {
                            int i24 = iZzg2 - 8;
                            byte[] bArr3 = zzb;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i24);
                            zzedVar2.zzL(iZzd + 8);
                            zzedVar2.zzH(bArrCopyOf, bArr3.length, i24);
                            listZzo = zzadq.zze(bArrCopyOf);
                        } else {
                            if (iZzg3 == 1684425825) {
                                byte[] bArr4 = new byte[iZzg2 - 8];
                                bArr4[0] = 102;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                zzedVar2.zzL(iZzd + 12);
                                zzedVar2.zzH(bArr4, 4, iZzg2 - 12);
                                listZzo = zzfwh.zzo(bArr4);
                            } else if (iZzg3 == 1634492771) {
                                int i25 = iZzg2 - 12;
                                byte[] bArr5 = new byte[i25];
                                zzedVar2.zzL(iZzd + 12);
                                zzedVar2.zzH(bArr5, 0, i25);
                                int i26 = zzda.zza;
                                zzed zzedVar3 = new zzed(bArr5);
                                zzedVar3.zzL(9);
                                int iZzm3 = zzedVar3.zzm();
                                zzedVar3.zzL(20);
                                Pair pairCreate = Pair.create(Integer.valueOf(zzedVar3.zzp()), Integer.valueOf(iZzm3));
                                int iIntValue2 = ((Integer) pairCreate.first).intValue();
                                int iIntValue3 = ((Integer) pairCreate.second).intValue();
                                listZzo = zzfwh.zzo(bArr5);
                                iZzn = iIntValue2;
                                str5 = str5;
                                i12 = iIntValue3;
                            } else if (iZzg3 == 1767990114) {
                                zzedVar2.zzL(iZzd + 9);
                                int iZzb = zzfzk.zzb(zzedVar.zzv());
                                byte[] bArr6 = new byte[iZzb];
                                zzedVar2.zzH(bArr6, 0, iZzb);
                                listZzo = zzfwh.zzo(bArr6);
                            }
                            str5 = str5;
                        }
                        str5 = str5;
                    } else {
                        if (iZzg <= 0) {
                            throw zzaz.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + iZzg, null);
                        }
                        iZzn = iZzg;
                        i12 = 2;
                    }
                    str5 = str5;
                }
                if (i14 != i15) {
                    zzahmVarZzm = zzm(zzedVar2, i14);
                    str2 = zzahmVarZzm.zza;
                    byte[] bArr7 = zzahmVarZzm.zzb;
                    if (bArr7 != null) {
                        if ("audio/vorbis".equals(str2)) {
                            zzed zzedVar4 = new zzed(bArr7);
                            int i27 = 1;
                            zzedVar4.zzM(1);
                            int i28 = 0;
                            while (true) {
                                if (zzedVar4.zzb() <= 0) {
                                    i16 = 255;
                                    break;
                                }
                                i16 = 255;
                                if (zzedVar4.zzf() != 255) {
                                    break;
                                }
                                zzedVar4.zzM(i27);
                                i28 += 255;
                                i27 = 1;
                            }
                            int iZzm4 = zzedVar4.zzm() + i28;
                            int i29 = 0;
                            while (zzedVar4.zzb() > 0 && zzedVar4.zzf() == i16) {
                                zzedVar4.zzM(1);
                                i29 += i16;
                            }
                            int iZzm5 = zzedVar4.zzm() + i29;
                            byte[] bArr8 = new byte[iZzm4];
                            int iZzd3 = zzedVar4.zzd();
                            System.arraycopy(bArr7, iZzd3, bArr8, 0, iZzm4);
                            int i30 = iZzd3 + iZzm4 + iZzm5;
                            int length = bArr7.length - i30;
                            byte[] bArr9 = new byte[length];
                            System.arraycopy(bArr7, i30, bArr9, 0, length);
                            listZzo = zzfwh.zzp(bArr8, bArr9);
                        } else {
                            if ("audio/mp4a-latm".equals(str2)) {
                                zzabp zzabpVarZza = zzabr.zza(bArr7);
                                iZzn = zzabpVarZza.zza;
                                i12 = zzabpVarZza.zzb;
                                str5 = zzabpVarZza.zzc;
                            } else {
                                str5 = str5;
                            }
                            listZzo = zzfwh.zzo(bArr7);
                        }
                    }
                    str5 = str5;
                } else {
                    str5 = str5;
                }
            }
            iZzd += iZzg2;
            zzedVar2 = zzedVar;
            i18 = i8;
            i19 = i9;
            str4 = str4;
        }
        String str9 = str5;
        if (zzahrVar.zzb != null || str2 == null) {
            return;
        }
        zzx zzxVar2 = new zzx();
        zzxVar2.zzN(i10);
        zzxVar2.zzad(str2);
        zzxVar2.zzC(str9);
        zzxVar2.zzB(i12);
        zzxVar2.zzae(iZzn);
        zzxVar2.zzX(i22);
        zzxVar2.zzP(listZzo);
        zzxVar2.zzH(zzsVarZzb);
        zzxVar2.zzS(str);
        if (zzahmVarZzm != null) {
            zzxVar2.zzA(zzfzk.zze(zzahmVarZzm.zzc));
            zzxVar2.zzY(zzfzk.zze(zzahmVarZzm.zzd));
        }
        zzahrVar.zzb = zzxVar2.zzaj();
    }
}

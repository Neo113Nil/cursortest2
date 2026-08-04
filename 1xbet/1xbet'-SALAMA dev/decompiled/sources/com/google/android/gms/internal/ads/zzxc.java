package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzxc extends zzxe {
    public zzxc(zzbo zzboVar, int[] iArr, int i7, zzyv zzyvVar, long j, long j3, long j7, int i8, int i9, float f7, float f8, List list, zzcz zzczVar) {
        super(zzboVar, iArr, 0);
        zzfwh.zzl(list);
    }

    public static /* bridge */ /* synthetic */ zzfwh zzh(zzyg[] zzygVarArr) {
        int i7;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                break;
            }
            zzyg zzygVar = zzygVarArr[i9];
            if (zzygVar == null || zzygVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i10 = zzfwh.zzd;
                zzfwe zzfweVar = new zzfwe();
                zzfweVar.zzf(new zzxa(0L, 0L));
                arrayList.add(zzfweVar);
            }
            i9++;
        }
        long[][] jArr = new long[2][];
        for (int i11 = 0; i11 < 2; i11++) {
            zzyg zzygVar2 = zzygVarArr[i11];
            if (zzygVar2 == null) {
                jArr[i11] = new long[0];
            } else {
                jArr[i11] = new long[zzygVar2.zzb.length];
                int i12 = 0;
                while (true) {
                    int[] iArr2 = zzygVar2.zzb;
                    if (i12 >= iArr2.length) {
                        break;
                    }
                    long j = zzygVar2.zza.zzb(iArr2[i12]).zzj;
                    long[] jArr2 = jArr[i11];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i12] = j;
                    i12++;
                }
                Arrays.sort(jArr[i11]);
            }
        }
        int[] iArr3 = new int[2];
        long[] jArr3 = new long[2];
        for (int i13 = 0; i13 < 2; i13++) {
            long[] jArr4 = jArr[i13];
            jArr3[i13] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzi(arrayList, jArr3);
        zzfws zzfwsVarZza = zzfxn.zzc(zzfxs.zzc()).zzb(2).zza();
        int i14 = 0;
        for (i7 = 2; i14 < i7; i7 = 2) {
            int length = jArr[i14].length;
            if (length <= 1) {
                iArr = iArr3;
            } else {
                double[] dArr = new double[length];
                int i15 = i8;
                while (true) {
                    long[] jArr5 = jArr[i14];
                    double dLog = 0.0d;
                    if (i15 >= jArr5.length) {
                        break;
                    }
                    int[] iArr4 = iArr3;
                    long j3 = jArr5[i15];
                    if (j3 != -1) {
                        dLog = Math.log(j3);
                    }
                    dArr[i15] = dLog;
                    i15++;
                    iArr3 = iArr4;
                }
                iArr = iArr3;
                int i16 = length - 1;
                double d7 = dArr[i16] - dArr[i8];
                int i17 = i8;
                while (i17 < i16) {
                    double d8 = dArr[i17];
                    i17++;
                    zzfwsVarZza.zzq(Double.valueOf(d7 == 0.0d ? 1.0d : (((d8 + dArr[i17]) * 0.5d) - dArr[i8]) / d7), Integer.valueOf(i14));
                    i8 = 0;
                }
            }
            i14++;
            iArr3 = iArr;
            i8 = 0;
        }
        int[] iArr5 = iArr3;
        zzfwh zzfwhVarZzl = zzfwh.zzl(zzfwsVarZza.zzr());
        for (int i18 = 0; i18 < zzfwhVarZzl.size(); i18++) {
            int iIntValue = ((Integer) zzfwhVarZzl.get(i18)).intValue();
            int i19 = iArr5[iIntValue] + 1;
            iArr5[iIntValue] = i19;
            jArr3[iIntValue] = jArr[iIntValue][i19];
            zzi(arrayList, jArr3);
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (arrayList.get(i20) != null) {
                long j7 = jArr3[i20];
                jArr3[i20] = j7 + j7;
            }
        }
        zzi(arrayList, jArr3);
        zzfwe zzfweVar2 = new zzfwe();
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            zzfwe zzfweVar3 = (zzfwe) arrayList.get(i21);
            zzfweVar2.zzf(zzfweVar3 == null ? zzfwh.zzn() : zzfweVar3.zzi());
        }
        return zzfweVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i7 = 0; i7 < 2; i7++) {
            j += jArr[i7];
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            zzfwe zzfweVar = (zzfwe) list.get(i8);
            if (zzfweVar != null) {
                zzfweVar.zzf(new zzxa(j, jArr[i8]));
            }
        }
    }
}

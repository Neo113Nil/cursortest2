package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzzy extends zzaaa {
    protected zzzy(zzbg zzbgVar, int[] iArr, int i, zzabu zzabuVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdp zzdpVar) {
        super(zzbgVar, iArr, 0);
        zzgxm.zzq(list);
    }

    static /* synthetic */ zzgxm zzd(zzabd[] zzabdVarArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i4 >= 2) {
                break;
            }
            zzabd zzabdVar = zzabdVarArr[i4];
            if (zzabdVar == null || zzabdVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i5 = zzgxm.zzd;
                zzgxj zzgxjVar = new zzgxj();
                zzgxjVar.zzf(new zzzw(0L, 0L));
                arrayList.add(zzgxjVar);
            }
            i4++;
        }
        long[][] jArr = new long[2][];
        for (int i6 = 0; i6 < 2; i6++) {
            zzabd zzabdVar2 = zzabdVarArr[i6];
            if (zzabdVar2 == null) {
                jArr[i6] = new long[0];
            } else {
                int[] iArr = zzabdVar2.zzb;
                jArr[i6] = new long[iArr.length];
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    long j = zzabdVar2.zza.zza(iArr[i7]).zzj;
                    long[] jArr2 = jArr[i6];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i7] = j;
                }
                Arrays.sort(jArr[i6]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i8 = 0; i8 < 2; i8++) {
            long[] jArr4 = jArr[i8];
            jArr3[i8] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzi(arrayList, jArr3);
        zzgyh zza = zzgzb.zzc(zzgzg.zzb()).zzb(2).zza();
        int i9 = 0;
        while (i9 < i) {
            int length = jArr[i9].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i10 = i3;
                while (true) {
                    long[] jArr5 = jArr[i9];
                    double d = 0.0d;
                    if (i10 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i10];
                    if (j2 != -1) {
                        d = Math.log(j2);
                    }
                    dArr[i10] = d;
                    i10++;
                }
                int i11 = length - 1;
                double d2 = dArr[i11] - dArr[i3];
                int i12 = i3;
                while (i12 < i11) {
                    double d3 = dArr[i12];
                    i12++;
                    zza.zze(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i12]) * 0.5d) - dArr[i3]) / d2), Integer.valueOf(i9));
                    i3 = 0;
                }
            }
            i9++;
            i3 = 0;
            i = 2;
            i2 = 1;
        }
        zzgxm zzq = zzgxm.zzq(zza.zzt());
        for (int i13 = 0; i13 < zzq.size(); i13++) {
            int intValue = ((Integer) zzq.get(i13)).intValue();
            int i14 = iArr2[intValue] + 1;
            iArr2[intValue] = i14;
            jArr3[intValue] = jArr[intValue][i14];
            zzi(arrayList, jArr3);
        }
        for (int i15 = 0; i15 < 2; i15++) {
            if (arrayList.get(i15) != null) {
                long j3 = jArr3[i15];
                jArr3[i15] = j3 + j3;
            }
        }
        zzi(arrayList, jArr3);
        zzgxj zzgxjVar2 = new zzgxj();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            zzgxj zzgxjVar3 = (zzgxj) arrayList.get(i16);
            zzgxjVar2.zzf(zzgxjVar3 == null ? zzgxm.zzi() : zzgxjVar3.zzi());
        }
        return zzgxjVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgxj zzgxjVar = (zzgxj) list.get(i2);
            if (zzgxjVar != null) {
                zzgxjVar.zzf(new zzzw(j, jArr[i2]));
            }
        }
    }
}

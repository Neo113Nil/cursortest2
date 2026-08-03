package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzzu extends com.google.android.gms.internal.ads.zzzw {
    protected zzzu(com.google.android.gms.internal.ads.zzbg zzbgVar, int[] iArr, int i, com.google.android.gms.internal.ads.zzabq zzabqVar, long j, long j2, long j3, int i2, int i3, float f, float f2, java.util.List list, com.google.android.gms.internal.ads.zzdo zzdoVar) {
        super(zzbgVar, iArr, 0);
        com.google.android.gms.internal.ads.zzgwm.zzq(list);
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzgwm zzd(com.google.android.gms.internal.ads.zzaaz[] zzaazVarArr) {
        int i;
        int i2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            com.google.android.gms.internal.ads.zzaaz zzaazVar = zzaazVarArr[i3];
            if (zzaazVar == null || zzaazVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i4 = com.google.android.gms.internal.ads.zzgwm.zzd;
                com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
                zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzzs(0L, 0L));
                arrayList.add(zzgwjVar);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            com.google.android.gms.internal.ads.zzaaz zzaazVar2 = zzaazVarArr[i5];
            if (zzaazVar2 == null) {
                jArr[i5] = new long[0];
            } else {
                int[] iArr = zzaazVar2.zzb;
                jArr[i5] = new long[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    long j = zzaazVar2.zza.zza(iArr[i6]).zzj;
                    long[] jArr2 = jArr[i5];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i6] = j;
                }
                java.util.Arrays.sort(jArr[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr4 = jArr[i7];
            jArr3[i7] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        zzi(arrayList, jArr3);
        com.google.android.gms.internal.ads.zzgxh zza = com.google.android.gms.internal.ads.zzgyb.zzc(com.google.android.gms.internal.ads.zzgyg.zzb()).zzb(2).zza();
        int i8 = 0;
        while (i8 < i) {
            int length = jArr[i8].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i9 = 0;
                while (true) {
                    long[] jArr5 = jArr[i8];
                    double d = 0.0d;
                    if (i9 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i9];
                    if (j2 != -1) {
                        d = java.lang.Math.log(j2);
                    }
                    dArr[i9] = d;
                    i9++;
                }
                int i10 = length - 1;
                double d2 = dArr[i10] - dArr[c];
                int i11 = 0;
                while (i11 < i10) {
                    double d3 = dArr[i11];
                    i11++;
                    zza.zze(java.lang.Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i11]) * 0.5d) - dArr[c]) / d2), java.lang.Integer.valueOf(i8));
                    c = 0;
                }
            }
            i8++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        com.google.android.gms.internal.ads.zzgwm zzq = com.google.android.gms.internal.ads.zzgwm.zzq(zza.zzt());
        for (int i12 = 0; i12 < zzq.size(); i12++) {
            int intValue = ((java.lang.Integer) zzq.get(i12)).intValue();
            int i13 = iArr2[intValue] + 1;
            iArr2[intValue] = i13;
            jArr3[intValue] = jArr[intValue][i13];
            zzi(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j3 = jArr3[i14];
                jArr3[i14] = j3 + j3;
            }
        }
        zzi(arrayList, jArr3);
        com.google.android.gms.internal.ads.zzgwj zzgwjVar2 = new com.google.android.gms.internal.ads.zzgwj();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            com.google.android.gms.internal.ads.zzgwj zzgwjVar3 = (com.google.android.gms.internal.ads.zzgwj) arrayList.get(i15);
            zzgwjVar2.zzf(zzgwjVar3 == null ? com.google.android.gms.internal.ads.zzgwm.zzi() : zzgwjVar3.zzi());
        }
        return zzgwjVar2.zzi();
    }

    private static void zzi(java.util.List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.google.android.gms.internal.ads.zzgwj zzgwjVar = (com.google.android.gms.internal.ads.zzgwj) list.get(i2);
            if (zzgwjVar != null) {
                zzgwjVar.zzf(new com.google.android.gms.internal.ads.zzzs(j, jArr[i2]));
            }
        }
    }
}

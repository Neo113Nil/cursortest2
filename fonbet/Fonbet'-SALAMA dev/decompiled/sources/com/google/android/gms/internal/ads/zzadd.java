package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzadd {
    public static zzav zza(zzacw zzacwVar, boolean z4) {
        zzav zza = new zzadl().zza(zzacwVar, z4 ? null : zzage.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzadf zzb(zzed zzedVar) {
        zzedVar.zzM(1);
        int zzo = zzedVar.zzo();
        long zzd = zzedVar.zzd();
        long j = zzo;
        int i7 = zzo / 18;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            long zzt = zzedVar.zzt();
            if (zzt == -1) {
                jArr = Arrays.copyOf(jArr, i8);
                jArr2 = Arrays.copyOf(jArr2, i8);
                break;
            }
            jArr[i8] = zzt;
            jArr2[i8] = zzedVar.zzt();
            zzedVar.zzM(2);
            i8++;
        }
        zzedVar.zzM((int) ((zzd + j) - zzedVar.zzd()));
        return new zzadf(jArr, jArr2);
    }
}

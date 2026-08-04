package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzadd {
    public static zzav zza(zzacw zzacwVar, boolean z4) {
        zzav zzavVarZza = new zzadl().zza(zzacwVar, z4 ? null : zzage.zza);
        if (zzavVarZza == null || zzavVarZza.zza() == 0) {
            return null;
        }
        return zzavVarZza;
    }

    public static zzadf zzb(zzed zzedVar) {
        zzedVar.zzM(1);
        int iZzo = zzedVar.zzo();
        long jZzd = zzedVar.zzd();
        long j = iZzo;
        int i7 = iZzo / 18;
        long[] jArrCopyOf = new long[i7];
        long[] jArrCopyOf2 = new long[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            long jZzt = zzedVar.zzt();
            if (jZzt == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i8);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i8);
                break;
            }
            jArrCopyOf[i8] = jZzt;
            jArrCopyOf2[i8] = zzedVar.zzt();
            zzedVar.zzM(2);
        }
        zzedVar.zzM((int) ((jZzd + j) - ((long) zzedVar.zzd())));
        return new zzadf(jArrCopyOf, jArrCopyOf2);
    }
}

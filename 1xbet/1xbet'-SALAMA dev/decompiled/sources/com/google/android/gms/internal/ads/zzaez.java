package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzaez extends zzacg {
    public zzaez(final zzadg zzadgVar, int i7, long j, long j3) {
        long j7;
        Objects.requireNonNull(zzadgVar);
        zzacd zzacdVar = new zzacd() { // from class: com.google.android.gms.internal.ads.zzaew
            @Override // com.google.android.gms.internal.ads.zzacd
            public final long zza(long j8) {
                return zzadgVar.zzb(j8);
            }
        };
        zzaex zzaexVar = new zzaex(zzadgVar, i7, null);
        long jZza = zzadgVar.zza();
        long j8 = zzadgVar.zzj;
        int i8 = zzadgVar.zzd;
        if (i8 > 0) {
            j7 = ((((long) i8) + ((long) zzadgVar.zzc)) / 2) + 1;
        } else {
            int i9 = zzadgVar.zza;
            long j9 = 4096;
            if (i9 == zzadgVar.zzb && i9 > 0) {
                j9 = i9;
            }
            j7 = (((j9 * ((long) zzadgVar.zzg)) * ((long) zzadgVar.zzh)) / 8) + 64;
        }
        super(zzacdVar, zzaexVar, jZza, 0L, j8, j, j3, j7, Math.max(6, zzadgVar.zzc));
    }
}

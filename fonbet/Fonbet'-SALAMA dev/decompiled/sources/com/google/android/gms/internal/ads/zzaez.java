package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzaez extends zzacg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaez(final zzadg zzadgVar, int i7, long j, long j3) {
        super(r1, r2, r3, 0L, r7, j, j3, r13, Math.max(6, zzadgVar.zzc));
        long j7;
        Objects.requireNonNull(zzadgVar);
        zzacd zzacdVar = new zzacd() { // from class: com.google.android.gms.internal.ads.zzaew
            @Override // com.google.android.gms.internal.ads.zzacd
            public final long zza(long j8) {
                return zzadg.this.zzb(j8);
            }
        };
        zzaex zzaexVar = new zzaex(zzadgVar, i7, null);
        long zza = zzadgVar.zza();
        long j8 = zzadgVar.zzj;
        int i8 = zzadgVar.zzd;
        if (i8 > 0) {
            j7 = ((i8 + zzadgVar.zzc) / 2) + 1;
        } else {
            int i9 = zzadgVar.zza;
            long j9 = 4096;
            if (i9 == zzadgVar.zzb && i9 > 0) {
                j9 = i9;
            }
            j7 = (((j9 * zzadgVar.zzg) * zzadgVar.zzh) / 8) + 64;
        }
    }
}

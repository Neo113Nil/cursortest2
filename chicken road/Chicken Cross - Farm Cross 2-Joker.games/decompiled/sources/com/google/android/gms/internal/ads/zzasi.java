package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzasi implements zzahk {
    private final zzasf zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzasi(zzasf zzasfVar, int i, long j, long j2) {
        this.zza = zzasfVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzasfVar.zzd;
        this.zzd = j3;
        this.zze = zze(j3);
    }

    private final long zze(long j) {
        return zzfm.zzw(j * this.zzb, 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        long j2 = this.zzb;
        zzasf zzasfVar = this.zza;
        long j3 = (zzasfVar.zzc * j) / (j2 * 1000000);
        String str = zzfm.zza;
        long j4 = this.zzd - 1;
        long max = Math.max(0L, Math.min(j3, j4));
        long j5 = zzasfVar.zzd;
        long zze = zze(max);
        long j6 = this.zzc;
        zzahl zzahlVar = new zzahl(zze, (max * j5) + j6);
        if (zze >= j || max == j4) {
            return new zzahi(zzahlVar, zzahlVar);
        }
        long j7 = max + 1;
        return new zzahi(zzahlVar, new zzahl(zze(j7), j6 + (j5 * j7)));
    }
}

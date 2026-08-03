package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaru implements com.google.android.gms.internal.ads.zzahb {
    private final com.google.android.gms.internal.ads.zzarr zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaru(com.google.android.gms.internal.ads.zzarr zzarrVar, int i, long j, long j2) {
        this.zza = zzarrVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzarrVar.zzd;
        this.zzd = j3;
        this.zze = zze(j3);
    }

    private final long zze(long j) {
        return com.google.android.gms.internal.ads.zzfl.zzv(j * this.zzb, 1000000L, this.zza.zzc, java.math.RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        long j2 = this.zzb;
        com.google.android.gms.internal.ads.zzarr zzarrVar = this.zza;
        long j3 = (zzarrVar.zzc * j) / (j2 * 1000000);
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        long j4 = this.zzd - 1;
        long max = java.lang.Math.max(0L, java.lang.Math.min(j3, j4));
        long j5 = zzarrVar.zzd;
        long zze = zze(max);
        long j6 = this.zzc;
        com.google.android.gms.internal.ads.zzahc zzahcVar = new com.google.android.gms.internal.ads.zzahc(zze, (max * j5) + j6);
        if (zze >= j || max == j4) {
            return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
        }
        long j7 = max + 1;
        return new com.google.android.gms.internal.ads.zzagz(zzahcVar, new com.google.android.gms.internal.ads.zzahc(zze(j7), j6 + (j5 * j7)));
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}

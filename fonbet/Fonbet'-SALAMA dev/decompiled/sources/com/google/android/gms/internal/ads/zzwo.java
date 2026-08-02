package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class zzwo extends zzbn {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;
    private final zzap zzf;
    private final zzaj zzg;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zza("SinglePeriodTimeline");
        zzadVar.zzb(Uri.EMPTY);
        zzadVar.zzc();
    }

    public zzwo(long j, long j3, long j7, long j8, long j9, long j10, long j11, boolean z4, boolean z7, boolean z8, Object obj, zzap zzapVar, zzaj zzajVar) {
        this.zzc = j8;
        this.zzd = j9;
        this.zze = z4;
        zzapVar.getClass();
        this.zzf = zzapVar;
        this.zzg = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbl zzd(int i7, zzbl zzblVar, boolean z4) {
        zzcv.zza(i7, 0, 1);
        zzblVar.zzi(null, z4 ? zzb : null, 0, this.zzc, 0L, zzb.zza, false);
        return zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbm zze(int i7, zzbm zzbmVar, long j) {
        zzcv.zza(i7, 0, 1);
        Object obj = zzbm.zza;
        zzap zzapVar = this.zzf;
        long j3 = this.zzd;
        zzbmVar.zza(obj, zzapVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zze, false, this.zzg, 0L, j3, 0, 0, 0L);
        return zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final Object zzf(int i7) {
        zzcv.zza(i7, 0, 1);
        return zzb;
    }
}

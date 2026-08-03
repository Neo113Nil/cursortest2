package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaop implements com.google.android.gms.internal.ads.zzang {
    private final com.google.android.gms.internal.ads.zzaoi zza;
    private final long[] zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;
    private final java.util.Map zze;

    public zzaop(com.google.android.gms.internal.ads.zzaoi zzaoiVar, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        this.zza = zzaoiVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = java.util.Collections.unmodifiableMap(map);
        this.zzb = zzaoiVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final long zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final java.util.List zzc(long j) {
        return this.zza.zzh(j, this.zzc, this.zzd, this.zze);
    }
}

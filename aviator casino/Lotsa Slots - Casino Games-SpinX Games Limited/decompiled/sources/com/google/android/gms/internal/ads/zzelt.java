package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzelt implements com.google.android.gms.internal.ads.zzels {
    public final com.google.android.gms.internal.ads.zzels zza;
    private final com.google.android.gms.internal.ads.zzgta zzb;

    public zzelt(com.google.android.gms.internal.ads.zzels zzelsVar, com.google.android.gms.internal.ads.zzgta zzgtaVar) {
        this.zza = zzelsVar;
        this.zzb = zzgtaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        return this.zza.zza(zzfkqVar, zzfkfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        return com.google.android.gms.internal.ads.zzhbw.zzk(this.zza.zzb(zzfkqVar, zzfkfVar), this.zzb, com.google.android.gms.internal.ads.zzcfr.zza);
    }
}

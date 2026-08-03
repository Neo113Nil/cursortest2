package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeuh implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzfky zzb;
    private final long zzc;

    zzeuh(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzfky zzfkyVar, long j) {
        this.zza = clock;
        this.zzb = zzfkyVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzeui(this.zzb, this.zza.currentTimeMillis(), this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 4;
    }
}

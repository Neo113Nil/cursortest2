package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzewl implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzfky zza;

    zzewl(com.google.android.gms.internal.ads.zzfky zzfkyVar) {
        this.zza = zzfkyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzewm(this.zza.zzq));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 58;
    }
}

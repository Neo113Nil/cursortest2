package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzevr implements com.google.android.gms.internal.ads.zzfck {
    private final java.util.concurrent.Executor zza;
    private final com.google.android.gms.internal.ads.zzcfd zzb;

    zzevr(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzcfd zzcfdVar) {
        this.zza = executor;
        this.zzb = zzcfdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdO)).booleanValue()) {
            return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzevs(null));
        }
        com.google.android.gms.internal.ads.zzcfd zzcfdVar = this.zzb;
        return com.google.android.gms.internal.ads.zzhbw.zzk(zzcfdVar.zzq(), com.google.android.gms.internal.ads.zzevq.zza, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 10;
    }
}

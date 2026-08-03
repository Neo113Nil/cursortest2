package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeiq {
    private final com.google.android.gms.internal.ads.zzcaw zza;

    zzeiq(com.google.android.gms.internal.ads.zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    public final void zza() {
        com.google.common.util.concurrent.ListenableFuture zza = this.zza.zza();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziG)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcfu.zzb(zza, "persistFlags");
        } else {
            com.google.android.gms.internal.ads.zzcfu.zza(zza, "persistFlags", com.google.android.gms.internal.ads.zzcfr.zzh);
        }
    }
}

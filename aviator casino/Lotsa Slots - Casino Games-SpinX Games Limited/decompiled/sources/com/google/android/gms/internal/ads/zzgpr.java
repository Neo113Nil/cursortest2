package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgpr implements com.google.android.gms.internal.ads.zzgpe, com.google.android.gms.internal.ads.zzgfd {
    private final android.content.Context zza;
    private final java.util.concurrent.ExecutorService zzb;
    private android.net.NetworkCapabilities zzc = null;

    zzgpr(android.content.Context context, java.util.concurrent.ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return android.os.Build.VERSION.SDK_INT < 24 ? com.google.android.gms.internal.ads.zzhbw.zzb() : com.google.android.gms.internal.ads.zzhbw.zze(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgpq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgpr.this.zze();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzb(java.util.Map map) {
        android.net.NetworkCapabilities networkCapabilities;
        long j;
        synchronized (this) {
            networkCapabilities = this.zzc;
        }
        map.put("ntc", networkCapabilities);
        synchronized (this) {
            android.net.NetworkCapabilities networkCapabilities2 = this.zzc;
            if (networkCapabilities2 != null) {
                if (networkCapabilities2.hasTransport(4)) {
                    j = 2;
                } else if (this.zzc.hasTransport(1)) {
                    j = 1;
                } else if (this.zzc.hasTransport(0)) {
                    j = 0;
                }
            }
            j = -1;
        }
        map.put("nt", java.lang.Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzc(java.util.Map map, android.content.Context context, android.view.View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzd(java.util.Map map) {
    }

    final /* synthetic */ void zze() {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            return;
        }
        com.google.android.gms.internal.ads.zzgpp zzgppVar = new com.google.android.gms.internal.ads.zzgpp(this);
        try {
            java.lang.Object systemService = this.zza.getSystemService("connectivity");
            systemService.getClass();
            ((android.net.ConnectivityManager) systemService).registerDefaultNetworkCallback(zzgppVar);
        } catch (java.lang.Throwable unused) {
        }
    }

    final /* synthetic */ void zzf(android.net.NetworkCapabilities networkCapabilities) {
        this.zzc = networkCapabilities;
    }
}

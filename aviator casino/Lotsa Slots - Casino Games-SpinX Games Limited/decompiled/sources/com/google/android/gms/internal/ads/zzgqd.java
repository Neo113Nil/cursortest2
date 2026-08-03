package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgqd implements com.google.android.gms.internal.ads.zzgpe, com.google.android.gms.internal.ads.zzgfd {
    static final java.lang.String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private final android.content.Context zzb;
    private final java.util.concurrent.ExecutorService zzc;
    private final java.lang.String[] zzd;
    private long zze = 0;
    private long zzf = 0;
    private long zzg = -1;
    private boolean zzh = false;

    zzgqd(android.content.Context context, com.google.android.gms.internal.ads.zzgcn zzgcnVar, java.util.concurrent.ExecutorService executorService, java.lang.String[] strArr) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = strArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return android.os.Build.VERSION.SDK_INT < 30 ? com.google.android.gms.internal.ads.zzhbw.zzb() : com.google.android.gms.internal.ads.zzhbw.zze(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgqc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgqd.this.zzf();
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzb(java.util.Map map) {
        long j;
        long j2;
        zze();
        synchronized (this) {
            j = this.zzh ? this.zzf - this.zze : -1L;
        }
        map.put("vs", java.lang.Long.valueOf(j));
        synchronized (this) {
            j2 = this.zzg;
            this.zzg = -1L;
        }
        map.put("vf", java.lang.Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzc(java.util.Map map, android.content.Context context, android.view.View view) {
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzd(java.util.Map map) {
        zze();
    }

    final void zze() {
        synchronized (this) {
            if (this.zzh) {
                this.zzf = java.lang.System.currentTimeMillis();
            }
        }
    }

    final /* synthetic */ void zzf() {
        com.google.android.gms.internal.ads.zzgqb zzgqbVar = new com.google.android.gms.internal.ads.zzgqb(this);
        try {
            java.lang.Object systemService = this.zzb.getSystemService("appops");
            systemService.getClass();
            ((android.app.AppOpsManager) systemService).startWatchingActive(this.zzd, this.zzc, zzgqbVar);
        } catch (java.lang.Throwable unused) {
        }
    }

    final /* synthetic */ void zzg(long j) {
        this.zze = j;
    }

    final /* synthetic */ long zzh() {
        return this.zzf;
    }

    final /* synthetic */ void zzi(long j) {
        this.zzg = j;
    }

    final /* synthetic */ void zzj(boolean z) {
        this.zzh = z;
    }
}

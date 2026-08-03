package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzehg {
    private final com.google.android.gms.internal.ads.zzcnj zza;
    private final android.content.Context zzb;
    private final java.util.concurrent.Executor zzc;

    zzehg(com.google.android.gms.internal.ads.zzcnj zzcnjVar, android.content.Context context, java.util.concurrent.Executor executor) {
        this.zza = zzcnjVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzehf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzehg.this.zzb();
            }
        });
    }

    final /* synthetic */ void zzb() {
        com.google.android.gms.internal.ads.zzehi zzh = this.zza.zzh();
        zzh.zzb(this.zzb);
        zzh.zza().zza().zza();
    }
}

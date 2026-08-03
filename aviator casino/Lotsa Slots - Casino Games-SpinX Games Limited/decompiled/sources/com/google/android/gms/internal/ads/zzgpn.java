package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgpn implements com.google.android.gms.internal.ads.zzgpe, com.google.android.gms.internal.ads.zzgfd {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgqh zzb;
    private final com.google.android.gms.internal.ads.zzhcg zzc;
    private final com.google.android.gms.internal.ads.zzgdf zzd;
    private final java.util.concurrent.atomic.AtomicBoolean zze = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.google.common.util.concurrent.ListenableFuture zzf = com.google.android.gms.internal.ads.zzhbw.zza(null);

    zzgpn(android.content.Context context, com.google.android.gms.internal.ads.zzgqh zzgqhVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzgdf zzgdfVar) {
        this.zza = context;
        this.zzb = zzgqhVar;
        this.zzc = zzhcgVar;
        this.zzd = zzgdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return (this.zze.getAndSet(true) || !this.zzd.zze()) ? com.google.android.gms.internal.ads.zzhbw.zzb() : this.zzc.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzgpm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzgpn.this.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzb(java.util.Map map) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzc(java.util.Map map, android.content.Context context, android.view.View view) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final void zzd(java.util.Map map) {
        map.put("gs", this.zzf);
    }

    final /* synthetic */ void zze() {
        com.google.common.util.concurrent.ListenableFuture zzc = this.zzc.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgpl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzgpn.this.zzf();
            }
        });
        this.zzb.zze(53, zzc);
        this.zzf = zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzaym zzf() {
        android.content.Context context = this.zza;
        try {
            return com.google.android.gms.internal.ads.zzfxn.zza(context, context.getPackageName(), java.lang.Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzexa implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;

    zzexa(com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        this.zza = zzhcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable(this) { // from class: com.google.android.gms.internal.ads.zzewz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzb();
                java.lang.Long.valueOf(currentTimeMillis).getClass();
                return new com.google.android.gms.internal.ads.zzexb(currentTimeMillis);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 55;
    }
}

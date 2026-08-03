package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzfac implements java.util.concurrent.Callable {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzfac zza = new com.google.android.gms.internal.ads.zzfac();

    private /* synthetic */ zzfac() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", com.google.android.gms.ads.internal.zzt.zzh().zzl());
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpP)).booleanValue()) {
            android.app.ActivityManager.MemoryInfo zzw = com.google.android.gms.ads.internal.zzt.zzh().zzw();
            if (zzw != null) {
                if (com.google.android.gms.common.util.PlatformVersion.isAtLeastU()) {
                    bundle.putLong("a_ad_mem", zzw.advertisedMem);
                }
                bundle.putLong("a_total", zzw.totalMem);
                bundle.putLong("a_avai", zzw.availMem);
                bundle.putLong("a_threshold", zzw.threshold);
                bundle.putBoolean("a_is_low_mem", zzw.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new com.google.android.gms.internal.ads.zzfae(bundle);
    }
}

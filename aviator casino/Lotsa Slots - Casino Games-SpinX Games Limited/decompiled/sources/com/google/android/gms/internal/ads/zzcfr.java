package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcfr {
    public static final com.google.android.gms.internal.ads.zzhcg zza;
    public static final com.google.android.gms.internal.ads.zzhcg zzb;
    public static final com.google.android.gms.internal.ads.zzhcg zzc;
    public static final java.util.concurrent.ScheduledExecutorService zzd;
    public static final com.google.android.gms.internal.ads.zzhch zze;
    public static final com.google.android.gms.internal.ads.zzhcg zzf;
    public static final java.util.concurrent.ExecutorService zzg;
    public static final com.google.android.gms.internal.ads.zzhcg zzh;

    static {
        java.util.concurrent.Executor executor;
        java.util.concurrent.Executor executor2;
        java.util.concurrent.Executor executor3;
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
            com.google.android.gms.internal.ads.zzgal.zza();
            executor = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool(new com.google.android.gms.internal.ads.zzcfo(androidx.webkit.Profile.DEFAULT_PROFILE_NAME)));
        } else {
            if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(com.google.android.gms.internal.ads.zzbiq.zzmI) != null) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zze(com.google.android.gms.internal.ads.zzbiq.zzmI)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(com.google.android.gms.internal.ads.zzbiq.zzmJ) != null) {
                        if (com.google.android.gms.ads.internal.client.zzba.zzc().zze(com.google.android.gms.internal.ads.zzbiq.zzmK) != null) {
                            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zze(com.google.android.gms.internal.ads.zzbiq.zzmJ)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zze(com.google.android.gms.internal.ads.zzbiq.zzmJ)).intValue(), 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.zzcfo(androidx.webkit.Profile.DEFAULT_PROFILE_NAME));
                            threadPoolExecutor.allowCoreThreadTimeOut(((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zze(com.google.android.gms.internal.ads.zzbiq.zzmK)).booleanValue());
                            executor = threadPoolExecutor;
                        }
                    }
                }
            }
            executor = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.google.android.gms.internal.ads.zzcfo(androidx.webkit.Profile.DEFAULT_PROFILE_NAME));
        }
        zza = new com.google.android.gms.internal.ads.zzcfq(executor, null);
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
            executor2 = com.google.android.gms.internal.ads.zzgal.zza().zza(5, new com.google.android.gms.internal.ads.zzcfo("Loader"), 1);
        } else {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = new java.util.concurrent.ThreadPoolExecutor(5, 5, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.zzcfo("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor2;
        }
        zzb = new com.google.android.gms.internal.ads.zzcfq(executor2, null);
        if (com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
            executor3 = com.google.android.gms.internal.ads.zzgal.zza().zzc(new com.google.android.gms.internal.ads.zzcfo("Activeview"), 1);
        } else {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor3 = new java.util.concurrent.ThreadPoolExecutor(1, 1, 10L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.internal.ads.zzcfo("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor3 = threadPoolExecutor3;
        }
        zzc = new com.google.android.gms.internal.ads.zzcfq(executor3, null);
        com.google.android.gms.internal.ads.zzcfn zzcfnVar = new com.google.android.gms.internal.ads.zzcfn(3, new com.google.android.gms.internal.ads.zzcfo(com.facebook.appevents.AppEventsConstants.EVENT_NAME_SCHEDULE));
        zzd = zzcfnVar;
        zze = com.google.android.gms.internal.ads.zzhcn.zzc(zzcfnVar);
        zzf = new com.google.android.gms.internal.ads.zzcfq(new com.google.android.gms.internal.ads.zzcfp(), null);
        zzg = java.util.concurrent.Executors.newSingleThreadExecutor(new com.google.android.gms.internal.ads.zzcfo("AdQualityMetrics"));
        zzh = new com.google.android.gms.internal.ads.zzcfq(com.google.android.gms.internal.ads.zzhcn.zza(), null);
    }
}

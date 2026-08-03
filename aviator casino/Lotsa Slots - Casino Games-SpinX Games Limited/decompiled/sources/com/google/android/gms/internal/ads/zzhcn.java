package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhcn {
    public static java.util.concurrent.Executor zza() {
        return com.google.android.gms.internal.ads.zzhbl.INSTANCE;
    }

    public static com.google.android.gms.internal.ads.zzhcg zzb(java.util.concurrent.ExecutorService executorService) {
        if (executorService instanceof com.google.android.gms.internal.ads.zzhcg) {
            return (com.google.android.gms.internal.ads.zzhcg) executorService;
        }
        return executorService instanceof java.util.concurrent.ScheduledExecutorService ? new com.google.android.gms.internal.ads.zzhcm((java.util.concurrent.ScheduledExecutorService) executorService) : new com.google.android.gms.internal.ads.zzhci(executorService);
    }

    public static com.google.android.gms.internal.ads.zzhch zzc(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return new com.google.android.gms.internal.ads.zzhcm(scheduledExecutorService);
    }

    static java.util.concurrent.Executor zzd(final java.util.concurrent.Executor executor, final com.google.android.gms.internal.ads.zzhap zzhapVar) {
        executor.getClass();
        return executor == com.google.android.gms.internal.ads.zzhbl.INSTANCE ? executor : new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.zzhcj
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(java.lang.Runnable runnable) {
                com.google.android.gms.internal.ads.zzhcn.zzf(executor, zzhapVar, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzf(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzhap zzhapVar, java.lang.Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            zzhapVar.zzb(e);
        }
    }
}

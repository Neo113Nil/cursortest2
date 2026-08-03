package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhbw extends com.google.android.gms.internal.ads.zzhby {
    public static com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
        return obj == null ? com.google.android.gms.internal.ads.zzhca.zza : new com.google.android.gms.internal.ads.zzhca(obj);
    }

    public static com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzhca.zza;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzd(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzhcv zzhcvVar = new com.google.android.gms.internal.ads.zzhcv(callable);
        executor.execute(zzhcvVar);
        return zzhcvVar;
    }

    public static com.google.common.util.concurrent.ListenableFuture zze(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzhcv zze = com.google.android.gms.internal.ads.zzhcv.zze(runnable, null);
        executor.execute(zze);
        return zze;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzhbd zzhbdVar, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.zzhcv zzhcvVar = new com.google.android.gms.internal.ads.zzhcv(zzhbdVar);
        executor.execute(zzhcvVar);
        return zzhcvVar;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzg(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Class cls, com.google.android.gms.internal.ads.zzgta zzgtaVar, java.util.concurrent.Executor executor) {
        int i = com.google.android.gms.internal.ads.zzhao.zzd;
        com.google.android.gms.internal.ads.zzhan zzhanVar = new com.google.android.gms.internal.ads.zzhan(listenableFuture, cls, zzgtaVar);
        listenableFuture.addListener(zzhanVar, com.google.android.gms.internal.ads.zzhcn.zzd(executor, zzhanVar));
        return zzhanVar;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzh(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Class cls, com.google.android.gms.internal.ads.zzhbe zzhbeVar, java.util.concurrent.Executor executor) {
        int i = com.google.android.gms.internal.ads.zzhao.zzd;
        com.google.android.gms.internal.ads.zzham zzhamVar = new com.google.android.gms.internal.ads.zzham(listenableFuture, cls, zzhbeVar);
        listenableFuture.addListener(zzhamVar, com.google.android.gms.internal.ads.zzhcn.zzd(executor, zzhamVar));
        return zzhamVar;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzi(com.google.common.util.concurrent.ListenableFuture listenableFuture, long j, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : com.google.android.gms.internal.ads.zzhcs.zze(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static com.google.common.util.concurrent.ListenableFuture zzj(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzhbe zzhbeVar, java.util.concurrent.Executor executor) {
        int i = com.google.android.gms.internal.ads.zzhav.zzc;
        com.google.android.gms.internal.ads.zzhat zzhatVar = new com.google.android.gms.internal.ads.zzhat(listenableFuture, zzhbeVar);
        listenableFuture.addListener(zzhatVar, com.google.android.gms.internal.ads.zzhcn.zzd(executor, zzhatVar));
        return zzhatVar;
    }

    public static com.google.common.util.concurrent.ListenableFuture zzk(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzgta zzgtaVar, java.util.concurrent.Executor executor) {
        int i = com.google.android.gms.internal.ads.zzhav.zzc;
        com.google.android.gms.internal.ads.zzhau zzhauVar = new com.google.android.gms.internal.ads.zzhau(listenableFuture, zzgtaVar);
        listenableFuture.addListener(zzhauVar, com.google.android.gms.internal.ads.zzhcn.zzd(executor, zzhauVar));
        return zzhauVar;
    }

    @java.lang.SafeVarargs
    public static com.google.common.util.concurrent.ListenableFuture zzl(com.google.common.util.concurrent.ListenableFuture... listenableFutureArr) {
        return new com.google.android.gms.internal.ads.zzhbf(com.google.android.gms.internal.ads.zzgwm.zzr(listenableFutureArr), true);
    }

    public static com.google.common.util.concurrent.ListenableFuture zzm(java.lang.Iterable iterable) {
        return new com.google.android.gms.internal.ads.zzhbf(com.google.android.gms.internal.ads.zzgwm.zzp(iterable), true);
    }

    public static com.google.android.gms.internal.ads.zzhbv zzn(java.lang.Iterable iterable) {
        return new com.google.android.gms.internal.ads.zzhbv(false, com.google.android.gms.internal.ads.zzgwm.zzp(iterable), null);
    }

    @java.lang.SafeVarargs
    public static com.google.android.gms.internal.ads.zzhbv zzo(com.google.common.util.concurrent.ListenableFuture... listenableFutureArr) {
        return new com.google.android.gms.internal.ads.zzhbv(true, com.google.android.gms.internal.ads.zzgwm.zzr(listenableFutureArr), null);
    }

    public static com.google.android.gms.internal.ads.zzhbv zzp(java.lang.Iterable iterable) {
        return new com.google.android.gms.internal.ads.zzhbv(true, com.google.android.gms.internal.ads.zzgwm.zzp(iterable), null);
    }

    @java.lang.SafeVarargs
    public static com.google.common.util.concurrent.ListenableFuture zzq(com.google.common.util.concurrent.ListenableFuture... listenableFutureArr) {
        return new com.google.android.gms.internal.ads.zzhbf(com.google.android.gms.internal.ads.zzgwm.zzr(listenableFutureArr), false);
    }

    public static java.lang.Object zzs(java.util.concurrent.Future future) throws java.util.concurrent.ExecutionException {
        if (future.isDone()) {
            return com.google.android.gms.internal.ads.zzhcx.zza(future);
        }
        throw new java.lang.IllegalStateException(com.google.android.gms.internal.ads.zzgua.zzd("Future was expected to be done: %s", future));
    }

    public static java.lang.Object zzt(java.util.concurrent.Future future) {
        try {
            return com.google.android.gms.internal.ads.zzhcx.zza(future);
        } catch (java.util.concurrent.ExecutionException e) {
            if (e.getCause() instanceof java.lang.Error) {
                throw new com.google.android.gms.internal.ads.zzhbm((java.lang.Error) e.getCause());
            }
            throw new com.google.android.gms.internal.ads.zzhcw(e.getCause());
        }
    }

    public static com.google.common.util.concurrent.ListenableFuture zzc(java.lang.Throwable th) {
        th.getClass();
        return new com.google.android.gms.internal.ads.zzhbz(th);
    }

    public static void zzr(com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzhbt zzhbtVar, java.util.concurrent.Executor executor) {
        zzhbtVar.getClass();
        listenableFuture.addListener(new com.google.android.gms.internal.ads.zzhbu(listenableFuture, zzhbtVar), executor);
    }
}

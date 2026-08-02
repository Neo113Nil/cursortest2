package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzgbu {
    public static zzgbn zza(ExecutorService executorService) {
        if (executorService instanceof zzgbn) {
            return (zzgbn) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzgbt((ScheduledExecutorService) executorService) : new zzgbq(executorService);
    }

    public static zzgbo zzb(ScheduledExecutorService scheduledExecutorService) {
        return new zzgbt(scheduledExecutorService);
    }

    public static Executor zzc() {
        return zzgaq.INSTANCE;
    }

    public static Executor zzd(final Executor executor, final zzfzr zzfzrVar) {
        executor.getClass();
        return executor == zzgaq.INSTANCE ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.zzgbp
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                zzgbu.zze(executor, zzfzrVar, runnable);
            }
        };
    }

    public static /* synthetic */ void zze(Executor executor, zzfzr zzfzrVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e7) {
            zzfzrVar.zzd(e7);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
class zzgbq extends zzfzw {
    private final ExecutorService zza;

    public zzgbq(ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.zza.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.zza.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.zza.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.zza.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.zza.shutdownNow();
    }

    public final String toString() {
        return AbstractC1663a.o(super.toString(), "[", String.valueOf(this.zza), "]");
    }
}

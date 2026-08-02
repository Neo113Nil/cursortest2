package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Vw extends C0606Hd implements Rw {

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f11966m;

    public Vw(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.f11966m = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.C0606Hd, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        AbstractC1211kk.p(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j5, TimeUnit timeUnit) {
        RunnableFutureC0823bx runnableFutureC0823bx = new RunnableFutureC0823bx(Executors.callable(runnable, null));
        return new Tw(runnableFutureC0823bx, this.f11966m.schedule(runnableFutureC0823bx, j5, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        Uw uw = new Uw(runnable);
        return new Tw(uw, this.f11966m.scheduleAtFixedRate(uw, j5, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        Uw uw = new Uw(runnable);
        return new Tw(uw, this.f11966m.scheduleWithFixedDelay(uw, j5, j6, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j5, TimeUnit timeUnit) {
        RunnableFutureC0823bx runnableFutureC0823bx = new RunnableFutureC0823bx(callable);
        return new Tw(runnableFutureC0823bx, this.f11966m.schedule(runnableFutureC0823bx, j5, timeUnit));
    }
}

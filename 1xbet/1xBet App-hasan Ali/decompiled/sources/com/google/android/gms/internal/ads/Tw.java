package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Tw extends AbstractC0952et implements ScheduledFuture, E3.a, Future {

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC1403ow f11701m;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledFuture f11702n;

    public Tw(AbstractC1403ow abstractC1403ow, ScheduledFuture scheduledFuture) {
        super(7);
        this.f11701m = abstractC1403ow;
        this.f11702n = scheduledFuture;
    }

    @Override // E3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f11701m.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean cancel = this.f11701m.cancel(z3);
        if (cancel) {
            this.f11702n.cancel(z3);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f11702n.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f11701m.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f11702n.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11701m.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11701m.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final /* synthetic */ Object j() {
        return this.f11701m;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return this.f11701m.get(j5, timeUnit);
    }
}

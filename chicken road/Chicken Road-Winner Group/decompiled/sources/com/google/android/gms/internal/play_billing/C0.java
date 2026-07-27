package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class C0 extends AbstractC0181d1 implements ScheduledFuture, InterfaceFutureC0242y0, Future {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0210n0 f2607b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledFuture f2608c;

    public C0(AbstractC0210n0 abstractC0210n0, ScheduledFuture scheduledFuture) {
        super(4);
        this.f2607b = abstractC0210n0;
        this.f2608c = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC0242y0
    public final void a(Runnable runnable, Executor executor) {
        this.f2607b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean cancel = this.f2607b.cancel(z3);
        if (cancel) {
            this.f2608c.cancel(z3);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f2608c.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f2607b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f2608c.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2607b.f2782a instanceof C0177c0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2607b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f2607b.get(j3, timeUnit);
    }
}

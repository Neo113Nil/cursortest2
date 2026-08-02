package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0606Hd extends AbstractExecutorService implements Qw, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9409k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Executor f9410l;

    public C0606Hd(Executor executor) {
        this.f9410l = executor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j5, TimeUnit timeUnit) {
        switch (this.f9409k) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f9410l).awaitTermination(j5, timeUnit);
        }
    }

    public final E3.a b(Runnable runnable) {
        return (E3.a) super.submit(runnable);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        AbstractC1211kk.o(this);
    }

    public final E3.a d(Callable callable) {
        return (E3.a) super.submit(callable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9409k) {
            case 0:
                this.f9410l.execute(runnable);
                break;
            default:
                ((ExecutorService) this.f9410l).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f9409k) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f9410l).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f9409k) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f9410l).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC0823bx(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f9409k) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.f9410l).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f9409k) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f9410l).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (E3.a) super.submit(runnable);
    }

    public String toString() {
        switch (this.f9409k) {
            case 1:
                return super.toString() + "[" + String.valueOf((ExecutorService) this.f9410l) + "]";
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC0823bx(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (E3.a) super.submit(runnable, obj);
    }

    public C0606Hd(ExecutorService executorService) {
        executorService.getClass();
        this.f9410l = executorService;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (E3.a) super.submit(callable);
    }
}

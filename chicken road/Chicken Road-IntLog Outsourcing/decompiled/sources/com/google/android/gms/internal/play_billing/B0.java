package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class B0 extends AbstractExecutorService implements InterfaceExecutorServiceC0389z0 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f5025a;

    public B0(ExecutorService executorService) {
        executorService.getClass();
        this.f5025a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f5025a.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5025a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f5025a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f5025a.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new J0(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f5025a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f5025a.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (InterfaceFutureC0386y0) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + String.valueOf(this.f5025a) + "]";
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new J0(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC0386y0) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (InterfaceFutureC0386y0) super.submit(callable);
    }
}

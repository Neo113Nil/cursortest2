package com.google.common.util.concurrent;

import com.google.common.util.concurrent.w;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class e extends AbstractExecutorService implements v, AutoCloseable {
    @Override // com.google.common.util.concurrent.v, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        w.a aVar;
        boolean isTerminated;
        if (this == ForkJoinPool.commonPool() || (isTerminated = (aVar = (w.a) this).isTerminated())) {
            return;
        }
        aVar.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = aVar.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    aVar.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new y(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.v
    public final u<?> submit(Runnable runnable) {
        return (u) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new y(Executors.callable(runnable, t));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.v
    public final Future submit(Runnable runnable) {
        return (u) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.v
    public final <T> u<T> submit(Runnable runnable, T t) {
        return (u) super.submit(runnable, (Runnable) t);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.v
    public final Future submit(Runnable runnable, Object obj) {
        return (u) super.submit(runnable, (Runnable) obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.v
    public final <T> u<T> submit(Callable<T> callable) {
        return (u) super.submit((Callable) callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.v
    public final Future submit(Callable callable) {
        return (u) super.submit(callable);
    }
}

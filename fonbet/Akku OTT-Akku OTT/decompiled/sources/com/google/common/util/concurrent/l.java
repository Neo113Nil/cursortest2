package com.google.common.util.concurrent;

import com.google.common.collect.A;
import com.google.common.util.concurrent.m;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public abstract class l<V> extends A implements Future<V> {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return ((m.a) this).a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return ((m.a) this).a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ((m.a) this).a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return ((m.a) this).a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return ((m.a) this).a.get(j, timeUnit);
    }
}

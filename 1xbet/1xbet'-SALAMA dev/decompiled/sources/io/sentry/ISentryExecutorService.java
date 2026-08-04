package io.sentry;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public interface ISentryExecutorService {
    void close(long j);

    boolean isClosed();

    Future<?> schedule(Runnable runnable, long j);

    Future<?> submit(Runnable runnable);

    <T> Future<T> submit(Callable<T> callable);
}

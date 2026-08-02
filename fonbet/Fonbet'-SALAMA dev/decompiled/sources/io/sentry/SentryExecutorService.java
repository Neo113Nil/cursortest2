package io.sentry;

import io.sentry.util.AutoClosableReentrantLock;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class SentryExecutorService implements ISentryExecutorService {
    private final ScheduledExecutorService executorService;
    private final AutoClosableReentrantLock lock;

    public static final class SentryExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        private SentryExecutorServiceThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("SentryExecutorServiceThreadFactory-");
            int i7 = this.cnt;
            this.cnt = i7 + 1;
            sb.append(i7);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public SentryExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.lock = new AutoClosableReentrantLock();
        this.executorService = scheduledExecutorService;
    }

    @Override // io.sentry.ISentryExecutorService
    public void close(long j) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (!this.executorService.isShutdown()) {
                this.executorService.shutdown();
                try {
                    if (!this.executorService.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        this.executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.executorService.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.ISentryExecutorService
    public boolean isClosed() {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            boolean isShutdown = this.executorService.isShutdown();
            if (acquire != null) {
                acquire.close();
            }
            return isShutdown;
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // io.sentry.ISentryExecutorService
    public Future<?> schedule(Runnable runnable, long j) {
        return this.executorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.ISentryExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.executorService.submit(runnable);
    }

    @Override // io.sentry.ISentryExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.executorService.submit(callable);
    }

    public SentryExecutorService() {
        this(Executors.newSingleThreadScheduledExecutor(new SentryExecutorServiceThreadFactory()));
    }
}

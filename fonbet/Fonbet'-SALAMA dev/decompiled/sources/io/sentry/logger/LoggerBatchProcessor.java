package io.sentry.logger;

import io.sentry.ISentryClient;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryLogEvent;
import io.sentry.SentryLogEvents;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.modules.a;
import io.sentry.transport.ReusableCountLatch;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class LoggerBatchProcessor implements ILoggerBatchProcessor {
    public static final int FLUSH_AFTER_MS = 5000;
    public static final int MAX_BATCH_SIZE = 100;
    private static final AutoClosableReentrantLock scheduleLock = new AutoClosableReentrantLock();
    private final ISentryClient client;
    private final SentryOptions options;
    private volatile Future<?> scheduledFlush;
    private volatile boolean hasScheduled = false;
    private final ReusableCountLatch pendingCount = new ReusableCountLatch();
    private final Queue<SentryLogEvent> queue = new ConcurrentLinkedQueue();
    private final ISentryExecutorService executorService = new SentryExecutorService();

    public class BatchRunnable implements Runnable {
        private BatchRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoggerBatchProcessor.this.flush();
        }
    }

    public LoggerBatchProcessor(SentryOptions sentryOptions, ISentryClient iSentryClient) {
        this.options = sentryOptions;
        this.client = iSentryClient;
    }

    private void flushBatch() {
        ArrayList arrayList = new ArrayList(100);
        do {
            SentryLogEvent poll = this.queue.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
            if (this.queue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        this.client.captureBatchedLogEvents(new SentryLogEvents(arrayList));
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            this.pendingCount.decrement();
        }
    }

    private void flushInternal() {
        do {
            flushBatch();
        } while (this.queue.size() >= 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$0() {
        this.executorService.close(this.options.getShutdownTimeoutMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeSchedule(boolean z4, boolean z7) {
        if (this.hasScheduled && !z4) {
            return;
        }
        ISentryLifecycleToken acquire = scheduleLock.acquire();
        try {
            Future<?> future = this.scheduledFlush;
            if (!z4) {
                if (future != null) {
                    if (!future.isDone()) {
                        if (future.isCancelled()) {
                        }
                        if (acquire == null) {
                            acquire.close();
                            return;
                        }
                        return;
                    }
                }
            }
            this.hasScheduled = true;
            this.scheduledFlush = this.executorService.schedule(new BatchRunnable(), z7 ? 0 : FLUSH_AFTER_MS);
            if (acquire == null) {
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

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void add(SentryLogEvent sentryLogEvent) {
        this.pendingCount.increment();
        this.queue.offer(sentryLogEvent);
        maybeSchedule(false, false);
    }

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void close(boolean z4) {
        if (z4) {
            maybeSchedule(true, true);
            this.executorService.submit(new a(this, 4));
        } else {
            this.executorService.close(this.options.getShutdownTimeoutMillis());
            while (!this.queue.isEmpty()) {
                flushBatch();
            }
        }
    }

    @Override // io.sentry.logger.ILoggerBatchProcessor
    public void flush(long j) {
        maybeSchedule(true, true);
        try {
            this.pendingCount.waitTillZero(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to flush log events", e7);
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush() {
        flushInternal();
        ISentryLifecycleToken acquire = scheduleLock.acquire();
        try {
            if (!this.queue.isEmpty()) {
                maybeSchedule(true, false);
            } else {
                this.hasScheduled = false;
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
}

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

/* JADX INFO: loaded from: classes2.dex */
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
            SentryLogEvent sentryLogEventPoll = this.queue.poll();
            if (sentryLogEventPoll != null) {
                arrayList.add(sentryLogEventPoll);
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

    private void maybeSchedule(boolean z4, boolean z7) {
        if (!this.hasScheduled || z4) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = scheduleLock.acquire();
            try {
                Future<?> future = this.scheduledFlush;
                if (z4 || future == null || future.isDone() || future.isCancelled()) {
                    this.hasScheduled = true;
                    this.scheduledFlush = this.executorService.schedule(new BatchRunnable(), z7 ? 0 : FLUSH_AFTER_MS);
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
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
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = scheduleLock.acquire();
        try {
            if (!this.queue.isEmpty()) {
                maybeSchedule(true, false);
            } else {
                this.hasScheduled = false;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}

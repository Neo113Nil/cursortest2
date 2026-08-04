package io.sentry.transport;

import A1.C0048w;
import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.RequestDetails;
import io.sentry.SentryDateProvider;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.clientreport.DiscardReason;
import io.sentry.hints.Cached;
import io.sentry.hints.DiskFlushNotification;
import io.sentry.hints.Enqueable;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.HintUtils;
import io.sentry.util.LogUtils;
import io.sentry.util.Objects;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncHttpTransport implements ITransport {
    private final HttpConnection connection;
    private volatile Runnable currentRunnable;
    private final IEnvelopeCache envelopeCache;
    private final QueuedThreadPoolExecutor executor;
    private final SentryOptions options;
    private final RateLimiter rateLimiter;
    private final ITransportGate transportGate;

    public static final class AsyncConnectionThreadFactory implements ThreadFactory {
        private int cnt;

        private AsyncConnectionThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("SentryAsyncConnection-");
            int i7 = this.cnt;
            this.cnt = i7 + 1;
            sb.append(i7);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public final class EnvelopeSender implements Runnable {
        private final SentryEnvelope envelope;
        private final IEnvelopeCache envelopeCache;
        private final TransportResult failedResult = TransportResult.error();
        private final Hint hint;

        public EnvelopeSender(SentryEnvelope sentryEnvelope, Hint hint, IEnvelopeCache iEnvelopeCache) {
            this.envelope = (SentryEnvelope) Objects.requireNonNull(sentryEnvelope, "Envelope is required.");
            this.hint = hint;
            this.envelopeCache = (IEnvelopeCache) Objects.requireNonNull(iEnvelopeCache, "EnvelopeCache is required.");
        }

        private TransportResult flush() {
            TransportResult transportResult = this.failedResult;
            this.envelope.getHeader().setSentAt(null);
            this.envelopeCache.store(this.envelope, this.hint);
            HintUtils.runIfHasType(this.hint, DiskFlushNotification.class, new c(this));
            if (!AsyncHttpTransport.this.transportGate.isConnected()) {
                HintUtils.runIfHasType(this.hint, Retryable.class, new e(1), new c(this));
                return transportResult;
            }
            SentryEnvelope sentryEnvelopeAttachReportToEnvelope = AsyncHttpTransport.this.options.getClientReportRecorder().attachReportToEnvelope(this.envelope);
            try {
                sentryEnvelopeAttachReportToEnvelope.getHeader().setSentAt(DateUtils.nanosToDate(AsyncHttpTransport.this.options.getDateProvider().now().nanoTimestamp()));
                TransportResult transportResultSend = AsyncHttpTransport.this.connection.send(sentryEnvelopeAttachReportToEnvelope);
                if (transportResultSend.isSuccess()) {
                    this.envelopeCache.discard(this.envelope);
                    return transportResultSend;
                }
                String str = "The transport failed to send the envelope with response code " + transportResultSend.getResponseCode();
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.ERROR, str, new Object[0]);
                if (transportResultSend.getResponseCode() >= 400 && transportResultSend.getResponseCode() != 429) {
                    HintUtils.runIfDoesNotHaveType(this.hint, Retryable.class, new d(this, sentryEnvelopeAttachReportToEnvelope, 0));
                }
                throw new IllegalStateException(str);
            } catch (IOException e7) {
                HintUtils.runIfHasType(this.hint, Retryable.class, new e(0), new d(this, sentryEnvelopeAttachReportToEnvelope, 1));
                throw new IllegalStateException("Sending the event failed.", e7);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$flush$1(DiskFlushNotification diskFlushNotification) {
            if (!diskFlushNotification.isFlushable(this.envelope.getHeader().getEventId())) {
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            } else {
                diskFlushNotification.markFlushed();
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Disk flush envelope fired", new Object[0]);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$flush$2(SentryEnvelope sentryEnvelope, Object obj) {
            AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.NETWORK_ERROR, sentryEnvelope);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$flush$4(SentryEnvelope sentryEnvelope, Object obj, Class cls) {
            LogUtils.logNotInstanceOf(cls, obj, AsyncHttpTransport.this.options.getLogger());
            AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.NETWORK_ERROR, sentryEnvelope);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$flush$6(Object obj, Class cls) {
            LogUtils.logNotInstanceOf(cls, obj, AsyncHttpTransport.this.options.getLogger());
            AsyncHttpTransport.this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.NETWORK_ERROR, this.envelope);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(TransportResult transportResult, SubmissionResult submissionResult) {
            AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(transportResult.isSuccess()));
            submissionResult.setResult(transportResult.isSuccess());
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncHttpTransport.this.currentRunnable = this;
            TransportResult transportResultFlush = this.failedResult;
            try {
                transportResultFlush = flush();
                AsyncHttpTransport.this.options.getLogger().log(SentryLevel.DEBUG, "Envelope flushed", new Object[0]);
                HintUtils.runIfHasType(this.hint, SubmissionResult.class, new d(this, transportResultFlush, 2));
                AsyncHttpTransport.this.currentRunnable = null;
            } catch (Throwable th) {
                try {
                    AsyncHttpTransport.this.options.getLogger().log(SentryLevel.ERROR, th, "Envelope submission failed", new Object[0]);
                    throw th;
                } catch (Throwable th2) {
                    HintUtils.runIfHasType(this.hint, SubmissionResult.class, new d(this, transportResultFlush, 2));
                    AsyncHttpTransport.this.currentRunnable = null;
                    throw th2;
                }
            }
        }
    }

    public AsyncHttpTransport(SentryOptions sentryOptions, RateLimiter rateLimiter, ITransportGate iTransportGate, RequestDetails requestDetails) {
        this(initExecutor(sentryOptions.getMaxQueueSize(), sentryOptions.getEnvelopeDiskCache(), sentryOptions.getLogger(), sentryOptions.getDateProvider()), sentryOptions, rateLimiter, iTransportGate, new HttpConnection(sentryOptions, requestDetails, rateLimiter));
    }

    private static QueuedThreadPoolExecutor initExecutor(int i7, final IEnvelopeCache iEnvelopeCache, final ILogger iLogger, SentryDateProvider sentryDateProvider) {
        return new QueuedThreadPoolExecutor(1, i7, new AsyncConnectionThreadFactory(), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                AsyncHttpTransport.lambda$initExecutor$1(iEnvelopeCache, iLogger, runnable, threadPoolExecutor);
            }
        }, iLogger, sentryDateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initExecutor$1(IEnvelopeCache iEnvelopeCache, ILogger iLogger, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (runnable instanceof EnvelopeSender) {
            EnvelopeSender envelopeSender = (EnvelopeSender) runnable;
            if (!HintUtils.hasType(envelopeSender.hint, Cached.class)) {
                iEnvelopeCache.store(envelopeSender.envelope, envelopeSender.hint);
            }
            markHintWhenSendingFailed(envelopeSender.hint, true);
            iLogger.log(SentryLevel.WARNING, "Envelope rejected", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$send$0(Enqueable enqueable) {
        enqueable.markEnqueued();
        this.options.getLogger().log(SentryLevel.DEBUG, "Envelope enqueued", new Object[0]);
    }

    private static void markHintWhenSendingFailed(Hint hint, boolean z4) {
        HintUtils.runIfHasType(hint, SubmissionResult.class, new e(2));
        HintUtils.runIfHasType(hint, Retryable.class, new C0048w(z4, 6));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close(false);
    }

    @Override // io.sentry.transport.ITransport
    public void flush(long j) {
        this.executor.waitTillIdle(j);
    }

    @Override // io.sentry.transport.ITransport
    public RateLimiter getRateLimiter() {
        return this.rateLimiter;
    }

    @Override // io.sentry.transport.ITransport
    public boolean isHealthy() {
        return (this.rateLimiter.isAnyRateLimitActive() || this.executor.didRejectRecently()) ? false : true;
    }

    @Override // io.sentry.transport.ITransport
    public void send(SentryEnvelope sentryEnvelope, Hint hint) {
        IEnvelopeCache noOpEnvelopeCache = this.envelopeCache;
        boolean z4 = false;
        if (HintUtils.hasType(hint, Cached.class)) {
            noOpEnvelopeCache = NoOpEnvelopeCache.getInstance();
            this.options.getLogger().log(SentryLevel.DEBUG, "Captured Envelope is already cached", new Object[0]);
            z4 = true;
        }
        SentryEnvelope sentryEnvelopeFilter = this.rateLimiter.filter(sentryEnvelope, hint);
        if (sentryEnvelopeFilter == null) {
            if (z4) {
                this.envelopeCache.discard(sentryEnvelope);
                return;
            }
            return;
        }
        if (HintUtils.hasType(hint, UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class)) {
            sentryEnvelopeFilter = this.options.getClientReportRecorder().attachReportToEnvelope(sentryEnvelopeFilter);
        }
        Future<?> futureSubmit = this.executor.submit(new EnvelopeSender(sentryEnvelopeFilter, hint, noOpEnvelopeCache));
        if (futureSubmit == null || !futureSubmit.isCancelled()) {
            HintUtils.runIfHasType(hint, Enqueable.class, new b(this, 0));
        } else {
            this.options.getClientReportRecorder().recordLostEnvelope(DiscardReason.QUEUE_OVERFLOW, sentryEnvelopeFilter);
        }
    }

    @Override // io.sentry.transport.ITransport
    public void close(boolean z4) {
        long flushTimeoutMillis;
        this.rateLimiter.close();
        this.executor.shutdown();
        this.options.getLogger().log(SentryLevel.DEBUG, "Shutting down", new Object[0]);
        if (z4) {
            flushTimeoutMillis = 0;
        } else {
            try {
                flushTimeoutMillis = this.options.getFlushTimeoutMillis();
            } catch (InterruptedException unused) {
                this.options.getLogger().log(SentryLevel.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
                Thread.currentThread().interrupt();
                return;
            }
        }
        if (this.executor.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
            return;
        }
        this.options.getLogger().log(SentryLevel.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
        this.executor.shutdownNow();
        if (this.currentRunnable != null) {
            this.executor.getRejectedExecutionHandler().rejectedExecution(this.currentRunnable, this.executor);
        }
    }

    public AsyncHttpTransport(QueuedThreadPoolExecutor queuedThreadPoolExecutor, SentryOptions sentryOptions, RateLimiter rateLimiter, ITransportGate iTransportGate, HttpConnection httpConnection) {
        this.currentRunnable = null;
        this.executor = (QueuedThreadPoolExecutor) Objects.requireNonNull(queuedThreadPoolExecutor, "executor is required");
        this.envelopeCache = (IEnvelopeCache) Objects.requireNonNull(sentryOptions.getEnvelopeDiskCache(), "envelopeCache is required");
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options is required");
        this.rateLimiter = (RateLimiter) Objects.requireNonNull(rateLimiter, "rateLimiter is required");
        this.transportGate = (ITransportGate) Objects.requireNonNull(iTransportGate, "transportGate is required");
        this.connection = (HttpConnection) Objects.requireNonNull(httpConnection, "httpConnection is required");
    }
}

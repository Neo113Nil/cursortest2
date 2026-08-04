package io.sentry.android.replay.util;

import C6.o;
import W5.AbstractC0486a1;
import io.sentry.ISentryExecutorService;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorsKt {
    public static final void gracefullyShutdown(ExecutorService executorService, SentryOptions sentryOptions) {
        h.e(executorService, "<this>");
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        synchronized (executorService) {
            if (!executorService.isShutdown()) {
                executorService.shutdown();
            }
            try {
                if (!executorService.awaitTermination(sentryOptions.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                    executorService.shutdownNow();
                }
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final ScheduledFuture<?> scheduleAtFixedRateSafely(ScheduledExecutorService scheduledExecutorService, SentryOptions sentryOptions, String str, long j, long j3, TimeUnit timeUnit, Runnable runnable) {
        h.e(scheduledExecutorService, "<this>");
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(str, "taskName");
        h.e(timeUnit, "unit");
        h.e(runnable, "task");
        try {
            return scheduledExecutorService.scheduleAtFixedRate(new a(runnable, sentryOptions, str, 0), j, j3, timeUnit);
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, AbstractC0486a1.h("Failed to submit task ", str, " to executor"), th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleAtFixedRateSafely$lambda$3(Runnable runnable, SentryOptions sentryOptions, String str) {
        h.e(runnable, "$task");
        h.e(sentryOptions, "$options");
        h.e(str, "$taskName");
        try {
            runnable.run();
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to execute task ".concat(str), th);
        }
    }

    public static final Future<?> submitSafely(ISentryExecutorService iSentryExecutorService, SentryOptions sentryOptions, String str, Runnable runnable) {
        h.e(iSentryExecutorService, "<this>");
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(str, "taskName");
        h.e(runnable, "task");
        try {
            return iSentryExecutorService.submit(new a(runnable, sentryOptions, str, 2));
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, AbstractC0486a1.h("Failed to submit task ", str, " to executor"), th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitSafely$lambda$1(Runnable runnable, SentryOptions sentryOptions, String str) {
        h.e(runnable, "$task");
        h.e(sentryOptions, "$options");
        h.e(str, "$taskName");
        try {
            runnable.run();
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to execute task ".concat(str), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitSafely$lambda$2(Runnable runnable, SentryOptions sentryOptions, String str) {
        h.e(runnable, "$task");
        h.e(sentryOptions, "$options");
        h.e(str, "$taskName");
        try {
            runnable.run();
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Failed to execute task ".concat(str), th);
        }
    }

    public static final Future<?> submitSafely(ExecutorService executorService, SentryOptions sentryOptions, String str, Runnable runnable) {
        h.e(executorService, "<this>");
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(str, "taskName");
        h.e(runnable, "task");
        String name = Thread.currentThread().getName();
        h.d(name, "currentThread().name");
        if (o.B0(name, "SentryReplayIntegration")) {
            runnable.run();
            return null;
        }
        try {
            return executorService.submit(new a(runnable, sentryOptions, str, 1));
        } catch (Throwable th) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, AbstractC0486a1.h("Failed to submit task ", str, " to executor"), th);
            return null;
        }
    }
}

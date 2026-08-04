package io.sentry.logger;

import io.sentry.SentryLogEvent;

/* JADX INFO: loaded from: classes2.dex */
public interface ILoggerBatchProcessor {
    void add(SentryLogEvent sentryLogEvent);

    void close(boolean z4);

    void flush(long j);
}

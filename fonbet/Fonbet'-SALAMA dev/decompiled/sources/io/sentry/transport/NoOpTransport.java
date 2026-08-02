package io.sentry.transport;

import io.sentry.Hint;
import io.sentry.SentryEnvelope;

/* loaded from: classes2.dex */
public final class NoOpTransport implements ITransport {
    private static final NoOpTransport instance = new NoOpTransport();

    private NoOpTransport() {
    }

    public static NoOpTransport getInstance() {
        return instance;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.transport.ITransport
    public void flush(long j) {
    }

    @Override // io.sentry.transport.ITransport
    public RateLimiter getRateLimiter() {
        return null;
    }

    @Override // io.sentry.transport.ITransport
    public void send(SentryEnvelope sentryEnvelope, Hint hint) {
    }

    @Override // io.sentry.transport.ITransport
    public void close(boolean z4) {
    }
}

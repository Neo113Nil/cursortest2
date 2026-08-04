package io.sentry;

import io.sentry.protocol.SentryId;

/* JADX INFO: loaded from: classes2.dex */
public final class NoOpContinuousProfiler implements IContinuousProfiler {
    private static final NoOpContinuousProfiler instance = new NoOpContinuousProfiler();

    private NoOpContinuousProfiler() {
    }

    public static NoOpContinuousProfiler getInstance() {
        return instance;
    }

    @Override // io.sentry.IContinuousProfiler
    public void close(boolean z4) {
    }

    @Override // io.sentry.IContinuousProfiler
    public SentryId getProfilerId() {
        return SentryId.EMPTY_ID;
    }

    @Override // io.sentry.IContinuousProfiler
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.IContinuousProfiler
    public void reevaluateSampling() {
    }

    @Override // io.sentry.IContinuousProfiler
    public void startProfiler(ProfileLifecycle profileLifecycle, TracesSampler tracesSampler) {
    }

    @Override // io.sentry.IContinuousProfiler
    public void stopProfiler(ProfileLifecycle profileLifecycle) {
    }
}

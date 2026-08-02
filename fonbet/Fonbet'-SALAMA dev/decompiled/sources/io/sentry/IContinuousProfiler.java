package io.sentry;

import io.sentry.protocol.SentryId;

/* loaded from: classes2.dex */
public interface IContinuousProfiler {
    void close(boolean z4);

    SentryId getProfilerId();

    boolean isRunning();

    void reevaluateSampling();

    void startProfiler(ProfileLifecycle profileLifecycle, TracesSampler tracesSampler);

    void stopProfiler(ProfileLifecycle profileLifecycle);
}

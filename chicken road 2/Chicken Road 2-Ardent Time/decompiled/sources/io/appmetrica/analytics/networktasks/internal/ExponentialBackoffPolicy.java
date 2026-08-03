package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public interface ExponentialBackoffPolicy {
    boolean canBeExecuted(io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig retryPolicyConfig);

    void onAllHostsAttemptsFinished(boolean z2);

    void onHostAttemptFinished(boolean z2);
}

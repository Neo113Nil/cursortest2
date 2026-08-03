package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public final class AllHostsExponentialBackoffPolicy implements io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder f7376a;

    public AllHostsExponentialBackoffPolicy(io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder exponentialBackoffDataHolder) {
        this.f7376a = exponentialBackoffDataHolder;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public boolean canBeExecuted(io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig retryPolicyConfig) {
        return this.f7376a.wasLastAttemptLongAgoEnough(retryPolicyConfig);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onAllHostsAttemptsFinished(boolean z2) {
        if (z2) {
            this.f7376a.reset();
        } else {
            this.f7376a.updateLastAttemptInfo();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy
    public void onHostAttemptFinished(boolean z2) {
    }
}

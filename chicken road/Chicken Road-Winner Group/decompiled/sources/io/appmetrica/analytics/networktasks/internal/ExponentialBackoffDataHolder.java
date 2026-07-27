package io.appmetrica.analytics.networktasks.internal;

import B0.c;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* loaded from: classes.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f8887a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeProvider f8888b;

    /* renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f8889c;

    /* renamed from: d, reason: collision with root package name */
    private long f8890d;

    /* renamed from: e, reason: collision with root package name */
    private int f8891e;
    private final String f;

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f8891e = 1;
        this.f8890d = 0L;
        this.f8889c.saveNextSendAttemptNumber(1);
        this.f8889c.saveLastAttemptTimeSeconds(this.f8890d);
    }

    public void updateLastAttemptInfo() {
        long currentTimeSeconds = this.f8888b.currentTimeSeconds();
        this.f8890d = currentTimeSeconds;
        this.f8891e++;
        this.f8889c.saveLastAttemptTimeSeconds(currentTimeSeconds);
        this.f8889c.saveNextSendAttemptNumber(this.f8891e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j3 = this.f8890d;
            if (j3 != 0) {
                TimePassedChecker timePassedChecker = this.f8887a;
                int i3 = ((1 << (this.f8891e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i4 = retryPolicyConfig.maxIntervalSeconds;
                if (i3 > i4) {
                    i3 = i4;
                }
                return timePassedChecker.didTimePassSeconds(j3, i3, this.f);
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f8889c = hostRetryInfoProvider;
        this.f8888b = systemTimeProvider;
        this.f8887a = timePassedChecker;
        this.f8890d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f8891e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f = c.k("[ExponentialBackoffDataHolder-", str, "]");
    }
}

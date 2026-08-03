package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class ExponentialBackoffDataHolder {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker f7387a;

    /* renamed from: b, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.time.TimeProvider f7388b;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider f7389c;

    /* renamed from: d, reason: collision with root package name */
    private long f7390d;

    /* renamed from: e, reason: collision with root package name */
    private int f7391e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.String f7392f;

    public ExponentialBackoffDataHolder(io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider hostRetryInfoProvider, java.lang.String str) {
        this(hostRetryInfoProvider, new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider(), new io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker(), str);
    }

    public void reset() {
        this.f7391e = 1;
        this.f7390d = 0L;
        this.f7389c.saveNextSendAttemptNumber(1);
        this.f7389c.saveLastAttemptTimeSeconds(this.f7390d);
    }

    public void updateLastAttemptInfo() {
        long currentTimeSeconds = this.f7388b.currentTimeSeconds();
        this.f7390d = currentTimeSeconds;
        this.f7391e++;
        this.f7389c.saveLastAttemptTimeSeconds(currentTimeSeconds);
        this.f7389c.saveNextSendAttemptNumber(this.f7391e);
    }

    public boolean wasLastAttemptLongAgoEnough(io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j2 = this.f7390d;
            if (j2 != 0) {
                io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker timePassedChecker = this.f7387a;
                int i2 = ((1 << (this.f7391e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i3 = retryPolicyConfig.maxIntervalSeconds;
                if (i2 > i3) {
                    i2 = i3;
                }
                return timePassedChecker.didTimePassSeconds(j2, i2, this.f7392f);
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider hostRetryInfoProvider, io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider systemTimeProvider, io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker timePassedChecker, java.lang.String str) {
        this.f7389c = hostRetryInfoProvider;
        this.f7388b = systemTimeProvider;
        this.f7387a = timePassedChecker;
        this.f7390d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f7391e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f7392f = "[ExponentialBackoffDataHolder-" + str + "]";
    }
}

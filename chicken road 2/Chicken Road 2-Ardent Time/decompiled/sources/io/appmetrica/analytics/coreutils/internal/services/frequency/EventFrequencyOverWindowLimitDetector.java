package io.appmetrica.analytics.coreutils.internal.services.frequency;

/* loaded from: classes.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a, reason: collision with root package name */
    private long f3784a;

    /* renamed from: b, reason: collision with root package name */
    private int f3785b;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage f3786c;

    /* renamed from: d, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f3787d = new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j2, int i2, io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage eventFrequencyStorage) {
        this.f3784a = j2;
        this.f3785b = i2;
        this.f3786c = eventFrequencyStorage;
    }

    public final boolean detect(java.lang.String str) {
        long longValue;
        long uptimeMillis = this.f3787d.uptimeMillis();
        io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage eventFrequencyStorage = this.f3786c;
        java.lang.Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, uptimeMillis);
            longValue = uptimeMillis;
        } else {
            longValue = windowStart.longValue();
        }
        long j2 = uptimeMillis - longValue;
        if (j2 < 0 || j2 > this.f3784a) {
            this.f3786c.putWindowStart(str, uptimeMillis);
            this.f3786c.putWindowOccurrencesCount(str, 1);
            return false;
        }
        java.lang.Integer windowOccurrencesCount = this.f3786c.getWindowOccurrencesCount(str);
        int intValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f3786c.putWindowOccurrencesCount(str, intValue);
        return intValue > this.f3785b;
    }

    public final synchronized void updateParameters(long j2, int i2) {
        this.f3784a = j2;
        this.f3785b = i2;
    }
}

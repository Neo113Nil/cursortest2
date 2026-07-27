package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a, reason: collision with root package name */
    private long f6287a;

    /* renamed from: b, reason: collision with root package name */
    private int f6288b;

    /* renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f6289c;

    /* renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f6290d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j2, int i2, EventFrequencyStorage eventFrequencyStorage) {
        this.f6287a = j2;
        this.f6288b = i2;
        this.f6289c = eventFrequencyStorage;
    }

    public final boolean detect(String str) {
        long longValue;
        long uptimeMillis = this.f6290d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f6289c;
        Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, uptimeMillis);
            longValue = uptimeMillis;
        } else {
            longValue = windowStart.longValue();
        }
        long j2 = uptimeMillis - longValue;
        if (j2 < 0 || j2 > this.f6287a) {
            this.f6289c.putWindowStart(str, uptimeMillis);
            this.f6289c.putWindowOccurrencesCount(str, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f6289c.getWindowOccurrencesCount(str);
        int intValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f6289c.putWindowOccurrencesCount(str, intValue);
        return intValue > this.f6288b;
    }

    public final synchronized void updateParameters(long j2, int i2) {
        this.f6287a = j2;
        this.f6288b = i2;
    }
}

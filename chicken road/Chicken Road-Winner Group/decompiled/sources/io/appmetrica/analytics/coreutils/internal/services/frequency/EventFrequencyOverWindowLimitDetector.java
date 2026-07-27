package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a, reason: collision with root package name */
    private long f5467a;

    /* renamed from: b, reason: collision with root package name */
    private int f5468b;

    /* renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f5469c;

    /* renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f5470d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j3, int i3, EventFrequencyStorage eventFrequencyStorage) {
        this.f5467a = j3;
        this.f5468b = i3;
        this.f5469c = eventFrequencyStorage;
    }

    public final boolean detect(String str) {
        long longValue;
        long uptimeMillis = this.f5470d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f5469c;
        Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, uptimeMillis);
            longValue = uptimeMillis;
        } else {
            longValue = windowStart.longValue();
        }
        long j3 = uptimeMillis - longValue;
        if (j3 < 0 || j3 > this.f5467a) {
            this.f5469c.putWindowStart(str, uptimeMillis);
            this.f5469c.putWindowOccurrencesCount(str, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f5469c.getWindowOccurrencesCount(str);
        int intValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f5469c.putWindowOccurrencesCount(str, intValue);
        return intValue > this.f5468b;
    }

    public final synchronized void updateParameters(long j3, int i3) {
        this.f5467a = j3;
        this.f5468b = i3;
    }
}

package io.appmetrica.analytics.coreutils.internal.services.frequency;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class InMemoryEventFrequencyStorage implements EventFrequencyStorage {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f5471a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f5472b = new LinkedHashMap();

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public Integer getWindowOccurrencesCount(String str) {
        return (Integer) this.f5472b.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public Long getWindowStart(String str) {
        return (Long) this.f5471a.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowOccurrencesCount(String str, int i3) {
        this.f5472b.put(str, Integer.valueOf(i3));
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowStart(String str, long j3) {
        this.f5471a.put(str, Long.valueOf(j3));
    }
}

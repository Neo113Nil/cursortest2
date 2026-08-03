package io.appmetrica.analytics.coreutils.internal.services.frequency;

/* loaded from: classes.dex */
public final class InMemoryEventFrequencyStorage implements io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.LinkedHashMap f3788a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final java.util.LinkedHashMap f3789b = new java.util.LinkedHashMap();

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public java.lang.Integer getWindowOccurrencesCount(java.lang.String str) {
        return (java.lang.Integer) this.f3789b.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public java.lang.Long getWindowStart(java.lang.String str) {
        return (java.lang.Long) this.f3788a.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowOccurrencesCount(java.lang.String str, int i2) {
        this.f3789b.put(str, java.lang.Integer.valueOf(i2));
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowStart(java.lang.String str, long j2) {
        this.f3788a.put(str, java.lang.Long.valueOf(j2));
    }
}

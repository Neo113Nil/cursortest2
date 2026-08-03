package io.appmetrica.analytics.coreutils.internal.services.frequency;

/* loaded from: classes.dex */
public interface EventFrequencyStorage {
    java.lang.Integer getWindowOccurrencesCount(java.lang.String str);

    java.lang.Long getWindowStart(java.lang.String str);

    void putWindowOccurrencesCount(java.lang.String str, int i2);

    void putWindowStart(java.lang.String str, long j2);
}

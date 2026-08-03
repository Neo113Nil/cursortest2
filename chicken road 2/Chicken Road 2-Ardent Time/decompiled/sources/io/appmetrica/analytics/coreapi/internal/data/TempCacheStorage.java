package io.appmetrica.analytics.coreapi.internal.data;

/* loaded from: classes.dex */
public interface TempCacheStorage {

    public interface Entry {
        byte[] getData();

        long getId();

        java.lang.String getScope();

        long getTimestamp();
    }

    io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry get(java.lang.String str);

    java.util.Collection<io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry> get(java.lang.String str, int i2);

    long put(java.lang.String str, long j2, byte[] bArr);

    void remove(long j2);

    void removeOlderThan(java.lang.String str, long j2);
}

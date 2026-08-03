package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.tn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728tn implements io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage f6867a;

    public C0728tn(android.content.Context context, io.appmetrica.analytics.impl.Sm sm, io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage tempCacheStorage) {
        this.f6867a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry get(java.lang.String str) {
        return this.f6867a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(java.lang.String str, long j2, byte[] bArr) {
        return this.f6867a.put(str, j2, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j2) {
        this.f6867a.remove(j2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(java.lang.String str, long j2) {
        this.f6867a.removeOlderThan(str, j2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final java.util.Collection<io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry> get(java.lang.String str, int i2) {
        return this.f6867a.get(str, i2);
    }
}

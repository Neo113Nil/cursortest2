package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.vn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0917vn implements TempCacheStorage {

    /* renamed from: a, reason: collision with root package name */
    public final TempCacheStorage f8533a;

    public C0917vn(Context context, Wm wm, TempCacheStorage tempCacheStorage) {
        this.f8533a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final TempCacheStorage.Entry get(String str) {
        return this.f8533a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(String str, long j3, byte[] bArr) {
        return this.f8533a.put(str, j3, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j3) {
        this.f8533a.remove(j3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(String str, long j3) {
        this.f8533a.removeOlderThan(str, j3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final Collection<TempCacheStorage.Entry> get(String str, int i3) {
        return this.f8533a.get(str, i3);
    }
}

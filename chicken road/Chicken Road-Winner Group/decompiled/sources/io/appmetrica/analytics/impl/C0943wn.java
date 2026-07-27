package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.wn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943wn implements TempCacheStorage.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f8596a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8597b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8598c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8599d;

    public C0943wn(long j3, String str, long j4, byte[] bArr) {
        this.f8596a = j3;
        this.f8597b = str;
        this.f8598c = j4;
        this.f8599d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0943wn.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        C0943wn c0943wn = (C0943wn) obj;
        if (this.f8596a == c0943wn.f8596a && kotlin.jvm.internal.j.a(this.f8597b, c0943wn.f8597b) && this.f8598c == c0943wn.f8598c) {
            return Arrays.equals(this.f8599d, c0943wn.f8599d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.f8599d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f8596a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final String getScope() {
        return this.f8597b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f8598c;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8599d) + ((Long.hashCode(this.f8598c) + ((this.f8597b.hashCode() + (Long.hashCode(this.f8596a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TempCacheEntry(id=" + this.f8596a + ", scope='" + this.f8597b + "', timestamp=" + this.f8598c + ", data=array[" + this.f8599d.length + "])";
    }
}

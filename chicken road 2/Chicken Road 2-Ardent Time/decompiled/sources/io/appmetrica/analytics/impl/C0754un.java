package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.un, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754un implements io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final long f6935a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f6936b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6937c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f6938d;

    public C0754un(long j2, java.lang.String str, long j3, byte[] bArr) {
        this.f6935a = j2;
        this.f6936b = str;
        this.f6937c = j3;
        this.f6938d = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.impl.C0754un.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.db.storage.TempCacheEntry");
        }
        io.appmetrica.analytics.impl.C0754un c0754un = (io.appmetrica.analytics.impl.C0754un) obj;
        if (this.f6935a == c0754un.f6935a && kotlin.jvm.internal.i.a(this.f6936b, c0754un.f6936b) && this.f6937c == c0754un.f6937c) {
            return java.util.Arrays.equals(this.f6938d, c0754un.f6938d);
        }
        return false;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final byte[] getData() {
        return this.f6938d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getId() {
        return this.f6935a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final java.lang.String getScope() {
        return this.f6936b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage.Entry
    public final long getTimestamp() {
        return this.f6937c;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f6938d) + ((java.lang.Long.hashCode(this.f6937c) + B1.a.e(this.f6936b, java.lang.Long.hashCode(this.f6935a) * 31, 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TempCacheEntry(id=" + this.f6935a + ", scope='" + this.f6936b + "', timestamp=" + this.f6937c + ", data=array[" + this.f6938d.length + "])";
    }
}

package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295d3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5692a;

    public C0295d3(long j2) {
        this.f5692a = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && io.appmetrica.analytics.impl.C0295d3.class == obj.getClass() && this.f5692a == ((io.appmetrica.analytics.impl.C0295d3) obj).f5692a;
    }

    public final int hashCode() {
        long j2 = this.f5692a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final java.lang.String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f5692a + '}';
    }
}

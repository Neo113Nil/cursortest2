package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gm {

    /* renamed from: a, reason: collision with root package name */
    public final long f4352a;

    public Gm(long j2) {
        this.f4352a = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && io.appmetrica.analytics.impl.Gm.class == obj.getClass() && this.f4352a == ((io.appmetrica.analytics.impl.Gm) obj).f4352a;
    }

    public final int hashCode() {
        long j2 = this.f4352a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final java.lang.String toString() {
        return "StatSending{disabledReportingInterval=" + this.f4352a + '}';
    }
}

package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class B9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f4105a;

    public B9(long j2) {
        this.f4105a = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof io.appmetrica.analytics.impl.B9) && this.f4105a == ((io.appmetrica.analytics.impl.B9) obj).f4105a;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f4105a);
    }

    public final java.lang.String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f4105a + ')';
    }
}

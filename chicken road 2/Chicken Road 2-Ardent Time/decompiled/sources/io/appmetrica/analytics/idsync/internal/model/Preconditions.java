package io.appmetrica.analytics.idsync.internal.model;

/* loaded from: classes.dex */
public final class Preconditions {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.idsync.internal.model.NetworkType f3992a;

    public Preconditions(io.appmetrica.analytics.idsync.internal.model.NetworkType networkType) {
        this.f3992a = networkType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.idsync.internal.model.Preconditions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f3992a == ((io.appmetrica.analytics.idsync.internal.model.Preconditions) obj).f3992a;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.Preconditions");
    }

    public final io.appmetrica.analytics.idsync.internal.model.NetworkType getNetworkType() {
        return this.f3992a;
    }

    public int hashCode() {
        return this.f3992a.hashCode();
    }

    public java.lang.String toString() {
        return "Preconditions(networkType=" + this.f3992a + ')';
    }
}

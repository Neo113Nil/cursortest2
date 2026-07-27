package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Km {

    /* renamed from: a, reason: collision with root package name */
    public final long f6196a;

    public Km(long j3) {
        this.f6196a = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Km.class == obj.getClass() && this.f6196a == ((Km) obj).f6196a;
    }

    public final int hashCode() {
        long j3 = this.f6196a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f6196a + '}';
    }
}

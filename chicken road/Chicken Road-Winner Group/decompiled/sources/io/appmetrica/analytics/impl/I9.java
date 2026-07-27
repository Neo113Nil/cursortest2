package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class I9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f6092a;

    public I9(long j3) {
        this.f6092a = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I9) && this.f6092a == ((I9) obj).f6092a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6092a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f6092a + ')';
    }
}

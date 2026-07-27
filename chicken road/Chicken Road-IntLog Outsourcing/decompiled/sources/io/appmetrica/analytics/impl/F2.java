package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class F2 {

    /* renamed from: a, reason: collision with root package name */
    public final E2 f6769a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f6770b;

    public F2(E2 e22, Boolean bool) {
        this.f6769a = e22;
        this.f6770b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F2.class != obj.getClass()) {
            return false;
        }
        F2 f22 = (F2) obj;
        if (this.f6769a != f22.f6769a) {
            return false;
        }
        Boolean bool = this.f6770b;
        return bool != null ? bool.equals(f22.f6770b) : f22.f6770b == null;
    }

    public final int hashCode() {
        E2 e22 = this.f6769a;
        int hashCode = (e22 != null ? e22.hashCode() : 0) * 31;
        Boolean bool = this.f6770b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f6769a + ", mBackgroundRestricted=" + this.f6770b + '}';
    }
}

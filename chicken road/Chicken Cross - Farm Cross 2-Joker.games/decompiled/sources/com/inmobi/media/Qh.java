package com.inmobi.media;

/* loaded from: classes6.dex */
public final class Qh extends AbstractC3778hq {

    /* renamed from: a, reason: collision with root package name */
    public final int f6805a;

    public Qh(int i) {
        this.f6805a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Qh) && this.f6805a == ((Qh) obj).f6805a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6805a);
    }

    public final String toString() {
        return "PollingVisibilityTrackerConfig(pollingIntervalInMillis=" + this.f6805a + ")";
    }
}

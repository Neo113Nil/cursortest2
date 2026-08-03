package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Hg extends com.inmobi.media.AbstractC2574lo {

    /* renamed from: a, reason: collision with root package name */
    public final int f4746a;

    public Hg(int i) {
        this.f4746a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.Hg) && this.f4746a == ((com.inmobi.media.Hg) obj).f4746a;
    }

    public final int hashCode() {
        return this.f4746a;
    }

    public final java.lang.String toString() {
        return "PollingVisibilityTrackerConfig(pollingIntervalInMillis=" + this.f4746a + ")";
    }
}

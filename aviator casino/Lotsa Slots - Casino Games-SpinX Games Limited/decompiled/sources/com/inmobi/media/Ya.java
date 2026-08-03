package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ya extends com.inmobi.media.AbstractC2272ab {

    /* renamed from: a, reason: collision with root package name */
    public final int f5063a;

    public Ya(int i) {
        this.f5063a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.Ya) && this.f5063a == ((com.inmobi.media.Ya) obj).f5063a;
    }

    public final int hashCode() {
        return this.f5063a;
    }

    public final java.lang.String toString() {
        return "InValid(errorCode=" + this.f5063a + ")";
    }
}

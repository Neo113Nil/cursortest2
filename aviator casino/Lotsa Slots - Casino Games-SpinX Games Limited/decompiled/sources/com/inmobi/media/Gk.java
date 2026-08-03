package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Gk {

    /* renamed from: a, reason: collision with root package name */
    public final long f4729a;
    public final long b;
    public final long c;

    public Gk(long j, long j2, long j3) {
        this.f4729a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Gk)) {
            return false;
        }
        com.inmobi.media.Gk gk = (com.inmobi.media.Gk) obj;
        return this.f4729a == gk.f4729a && this.b == gk.b && this.c == gk.c;
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.c) + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.b) + (kotlin.UByte$$ExternalSyntheticBackport0.m(this.f4729a) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TimeoutConfig(connectTimeoutInSec=" + this.f4729a + ", readTimeoutInSec=" + this.b + ", callTimeoutInSec=" + this.c + ")";
    }
}

package com.inmobi.media;

/* loaded from: classes6.dex */
public final class Cm {

    /* renamed from: a, reason: collision with root package name */
    public final long f6499a;
    public final long b;
    public final long c;

    public Cm(long j, long j2, long j3) {
        this.f6499a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cm)) {
            return false;
        }
        Cm cm = (Cm) obj;
        return this.f6499a == cm.f6499a && this.b == cm.b && this.c == cm.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((Long.hashCode(this.b) + (Long.hashCode(this.f6499a) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutConfig(connectTimeoutInSec=" + this.f6499a + ", readTimeoutInSec=" + this.b + ", callTimeoutInSec=" + this.c + ")";
    }
}

package com.inmobi.media;

/* renamed from: com.inmobi.media.ck, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3631ck {

    /* renamed from: a, reason: collision with root package name */
    public final int f7052a;
    public final long b;

    public C3631ck(int i, long j, int i2) {
        this.f7052a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3631ck)) {
            return false;
        }
        C3631ck c3631ck = (C3631ck) obj;
        return this.f7052a == c3631ck.f7052a && this.b == c3631ck.b && Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + ((Long.hashCode(this.b) + (Integer.hashCode(this.f7052a) * 31)) * 31);
    }

    public final String toString() {
        return "RetryPolicy(maxRetries=" + this.f7052a + ", retryInterval=" + this.b + ", delayFactor=1.0)";
    }

    public C3631ck(long j, int i) {
        this.f7052a = i;
        this.b = j;
    }
}

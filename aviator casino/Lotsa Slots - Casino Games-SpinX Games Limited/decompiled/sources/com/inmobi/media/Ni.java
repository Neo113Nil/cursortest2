package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ni {

    /* renamed from: a, reason: collision with root package name */
    public final int f4859a;
    public final long b;

    public Ni(int i, long j, int i2) {
        this.f4859a = i;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.Ni)) {
            return false;
        }
        com.inmobi.media.Ni ni = (com.inmobi.media.Ni) obj;
        return this.f4859a == ni.f4859a && this.b == ni.b && java.lang.Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(1.0d) + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.b) + (this.f4859a * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "RetryPolicy(maxRetries=" + this.f4859a + ", retryInterval=" + this.b + ", delayFactor=1.0)";
    }

    public Ni(long j, int i) {
        this.f4859a = i;
        this.b = j;
    }
}

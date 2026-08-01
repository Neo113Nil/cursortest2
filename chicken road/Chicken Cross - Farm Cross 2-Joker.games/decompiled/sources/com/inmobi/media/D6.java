package com.inmobi.media;

/* loaded from: classes6.dex */
public final class D6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6506a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public String k;

    public D6(int i, long j, long j2, long j3, int i2, int i3, int i4, int i5, long j4, long j5) {
        this.f6506a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = j4;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D6)) {
            return false;
        }
        D6 d6 = (D6) obj;
        return this.f6506a == d6.f6506a && this.b == d6.b && this.c == d6.c && this.d == d6.d && this.e == d6.e && this.f == d6.f && this.g == d6.g && this.h == d6.h && this.i == d6.i && this.j == d6.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((Long.hashCode(this.i) + Hj.a(this.h, Hj.a(this.g, Hj.a(this.f, Hj.a(this.e, (Long.hashCode(this.d) + ((Long.hashCode(this.c) + ((Long.hashCode(this.b) + (Integer.hashCode(this.f6506a) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "EventConfig(maxRetryCount=" + this.f6506a + ", timeToLiveInSec=" + this.b + ", processingInterval=" + this.c + ", ingestionLatencyInSec=" + this.d + ", minBatchSizeWifi=" + this.e + ", maxBatchSizeWifi=" + this.f + ", minBatchSizeMobile=" + this.g + ", maxBatchSizeMobile=" + this.h + ", retryIntervalWifi=" + this.i + ", retryIntervalMobile=" + this.j + ")";
    }
}

package com.inmobi.media;

/* renamed from: com.inmobi.media.g6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2426g6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5213a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public java.lang.String k;

    public C2426g6(int i, long j, long j2, long j3, int i2, int i3, int i4, int i5, long j4, long j5) {
        this.f5213a = i;
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2426g6)) {
            return false;
        }
        com.inmobi.media.C2426g6 c2426g6 = (com.inmobi.media.C2426g6) obj;
        return this.f5213a == c2426g6.f5213a && this.b == c2426g6.b && this.c == c2426g6.c && this.d == c2426g6.d && this.e == c2426g6.e && this.f == c2426g6.f && this.g == c2426g6.g && this.h == c2426g6.h && this.i == c2426g6.i && this.j == c2426g6.j;
    }

    public final int hashCode() {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(this.j) + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.i) + com.inmobi.media.AbstractC2755si.a(this.h, com.inmobi.media.AbstractC2755si.a(this.g, com.inmobi.media.AbstractC2755si.a(this.f, com.inmobi.media.AbstractC2755si.a(this.e, (kotlin.UByte$$ExternalSyntheticBackport0.m(this.d) + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.c) + ((kotlin.UByte$$ExternalSyntheticBackport0.m(this.b) + (this.f5213a * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final java.lang.String toString() {
        return "EventConfig(maxRetryCount=" + this.f5213a + ", timeToLiveInSec=" + this.b + ", processingInterval=" + this.c + ", ingestionLatencyInSec=" + this.d + ", minBatchSizeWifi=" + this.e + ", maxBatchSizeWifi=" + this.f + ", minBatchSizeMobile=" + this.g + ", maxBatchSizeMobile=" + this.h + ", retryIntervalWifi=" + this.i + ", retryIntervalMobile=" + this.j + ")";
    }
}

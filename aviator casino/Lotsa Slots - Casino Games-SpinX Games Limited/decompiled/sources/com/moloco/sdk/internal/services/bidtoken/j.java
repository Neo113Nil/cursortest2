package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class j {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f7226a;
    public final int b;
    public final long c;

    public j(long j, int i, long j2) {
        this.f7226a = j;
        this.b = i;
        this.c = j2;
    }

    public final long a() {
        return this.f7226a;
    }

    public final int b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.c;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.bidtoken.j)) {
            return false;
        }
        com.moloco.sdk.internal.services.bidtoken.j jVar = (com.moloco.sdk.internal.services.bidtoken.j) obj;
        return this.f7226a == jVar.f7226a && this.b == jVar.b && this.c == jVar.c;
    }

    public final long f() {
        return this.f7226a;
    }

    public int hashCode() {
        return (((kotlin.UByte$$ExternalSyntheticBackport0.m(this.f7226a) * 31) + this.b) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.c);
    }

    public java.lang.String toString() {
        return "BidTokenHttpRequestInfo(requestTimeoutMillis=" + this.f7226a + ", fetchRetryMax=" + this.b + ", fetchRetryDelayMillis=" + this.c + ')';
    }

    public final com.moloco.sdk.internal.services.bidtoken.j a(long j, int i, long j2) {
        return new com.moloco.sdk.internal.services.bidtoken.j(j, i, j2);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.j a(com.moloco.sdk.internal.services.bidtoken.j jVar, long j, int i, long j2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = jVar.f7226a;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            i = jVar.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j2 = jVar.c;
        }
        return jVar.a(j3, i3, j2);
    }
}

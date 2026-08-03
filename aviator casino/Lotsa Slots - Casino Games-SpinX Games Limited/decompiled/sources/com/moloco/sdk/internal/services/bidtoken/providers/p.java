package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class p {
    public static final int i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7242a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public p(java.lang.String sessionId, long j, long j2, int i2, int i3, int i4, int i5, int i6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f7242a = sessionId;
        this.b = j;
        this.c = j2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
    }

    public final java.lang.String a() {
        return this.f7242a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.bidtoken.providers.p)) {
            return false;
        }
        com.moloco.sdk.internal.services.bidtoken.providers.p pVar = (com.moloco.sdk.internal.services.bidtoken.providers.p) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7242a, pVar.f7242a) && this.b == pVar.b && this.c == pVar.c && this.d == pVar.d && this.e == pVar.e && this.f == pVar.f && this.g == pVar.g && this.h == pVar.h;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((((((this.f7242a.hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.b)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.c)) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }

    public final int i() {
        return this.d;
    }

    public final int j() {
        return this.g;
    }

    public final long k() {
        return this.c;
    }

    public final int l() {
        return this.e;
    }

    public final int m() {
        return this.f;
    }

    public final int n() {
        return this.h;
    }

    public final java.lang.String o() {
        return this.f7242a;
    }

    public final long p() {
        return this.b;
    }

    public final boolean q() {
        return this.f7242a.length() > 0;
    }

    public java.lang.String toString() {
        return "IlrdSignal(sessionId=" + this.f7242a + ", sessionStartTs=" + this.b + ", lastImpressionTs=" + this.c + ", bannerImpressionCount=" + this.d + ", mrecImpressionCount=" + this.e + ", nativeImpressionCount=" + this.f + ", interstitialImpressionCount=" + this.g + ", rewardedImpressionCount=" + this.h + ')';
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.p a(java.lang.String sessionId, long j, long j2, int i2, int i3, int i4, int i5, int i6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new com.moloco.sdk.internal.services.bidtoken.providers.p(sessionId, j, j2, i2, i3, i4, i5, i6);
    }
}

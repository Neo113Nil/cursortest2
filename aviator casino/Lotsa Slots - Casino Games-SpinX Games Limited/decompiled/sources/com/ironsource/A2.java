package com.ironsource;

/* loaded from: classes5.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> f5607a;
    private final int b;
    private final boolean c;
    private final long d;
    private final java.util.List<com.ironsource.C3171md> e;
    private final com.ironsource.C3211p f;
    private final long g;
    private final int h;
    private final long i;

    /* JADX WARN: Multi-variable type inference failed */
    public A2(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> providerOrder, int i, boolean z, long j, java.util.List<com.ironsource.C3171md> placements, com.ironsource.C3211p auction, long j2, int i2, long j3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placements, "placements");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auction, "auction");
        this.f5607a = providerOrder;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = placements;
        this.f = auction;
        this.g = j2;
        this.h = i2;
        this.i = j3;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> a() {
        return this.f5607a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final java.util.List<com.ironsource.C3171md> e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.A2)) {
            return false;
        }
        com.ironsource.A2 a2 = (com.ironsource.A2) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5607a, a2.f5607a) && this.b == a2.b && this.c == a2.c && this.d == a2.d && kotlin.jvm.internal.Intrinsics.areEqual(this.e, a2.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, a2.f) && this.g == a2.g && this.h == a2.h && this.i == a2.i;
    }

    public final com.ironsource.C3211p f() {
        return this.f;
    }

    public final long g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f5607a.hashCode() * 31) + this.b) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((((((hashCode + i) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.g)) * 31) + this.h) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.i);
    }

    public final long i() {
        return this.i;
    }

    public final long j() {
        return this.g;
    }

    public final boolean k() {
        return this.c;
    }

    public final com.ironsource.C3211p l() {
        return this.f;
    }

    public final int m() {
        return this.h;
    }

    public final long n() {
        return this.d;
    }

    public final long o() {
        return this.i;
    }

    public final int p() {
        return this.b;
    }

    public final java.util.List<com.ironsource.C3171md> q() {
        return this.e;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> r() {
        return this.f5607a;
    }

    public java.lang.String toString() {
        return "BannerAdFormatConfig2(providerOrder=" + this.f5607a + ", parallelLoad=" + this.b + ", advancedLoading=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", placements=" + this.e + ", auction=" + this.f + ", adapterTimeoutMillis=" + this.g + ", bannerInterval=" + this.h + ", impressionTimeout=" + this.i + ")";
    }

    public final com.ironsource.A2 a(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> providerOrder, int i, boolean z, long j, java.util.List<com.ironsource.C3171md> placements, com.ironsource.C3211p auction, long j2, int i2, long j3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placements, "placements");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auction, "auction");
        return new com.ironsource.A2(providerOrder, i, z, j, placements, auction, j2, i2, j3);
    }
}

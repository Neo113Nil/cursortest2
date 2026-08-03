package com.ironsource;

/* renamed from: com.ironsource.g6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3057g6 {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> f6270a;
    private final int b;
    private final boolean c;
    private final long d;
    private final java.util.List<com.ironsource.C3171md> e;
    private final com.ironsource.C3211p f;
    private final int g;
    private final java.lang.Integer h;

    /* JADX WARN: Multi-variable type inference failed */
    public C3057g6(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> providerOrder, int i, boolean z, long j, java.util.List<com.ironsource.C3171md> placements, com.ironsource.C3211p auction, int i2, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placements, "placements");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auction, "auction");
        this.f6270a = providerOrder;
        this.b = i;
        this.c = z;
        this.d = j;
        this.e = placements;
        this.f = auction;
        this.g = i2;
        this.h = num;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> a() {
        return this.f6270a;
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
        if (!(obj instanceof com.ironsource.C3057g6)) {
            return false;
        }
        com.ironsource.C3057g6 c3057g6 = (com.ironsource.C3057g6) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6270a, c3057g6.f6270a) && this.b == c3057g6.b && this.c == c3057g6.c && this.d == c3057g6.d && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c3057g6.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c3057g6.f) && this.g == c3057g6.g && kotlin.jvm.internal.Intrinsics.areEqual(this.h, c3057g6.h);
    }

    public final com.ironsource.C3211p f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final java.lang.Integer h() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f6270a.hashCode() * 31) + this.b) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int m = (((((((((hashCode + i) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31;
        java.lang.Integer num = this.h;
        return m + (num == null ? 0 : num.hashCode());
    }

    public final int i() {
        return this.g;
    }

    public final boolean j() {
        return this.c;
    }

    public final com.ironsource.C3211p k() {
        return this.f;
    }

    public final long l() {
        return this.d;
    }

    public final java.lang.Integer m() {
        return this.h;
    }

    public final int n() {
        return this.b;
    }

    public final java.util.List<com.ironsource.C3171md> o() {
        return this.e;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> p() {
        return this.f6270a;
    }

    public java.lang.String toString() {
        return "FullscreenAdFormatConfig2(providerOrder=" + this.f6270a + ", parallelLoad=" + this.b + ", advancedLoading=" + this.c + ", collectBiddingDataTimeout=" + this.d + ", placements=" + this.e + ", auction=" + this.f + ", adapterTimeoutSecs=" + this.g + ", expiredDurationMins=" + this.h + ")";
    }

    public final com.ironsource.C3057g6 a(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> providerOrder, int i, boolean z, long j, java.util.List<com.ironsource.C3171md> placements, com.ironsource.C3211p auction, int i2, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placements, "placements");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auction, "auction");
        return new com.ironsource.C3057g6(providerOrder, i, z, j, placements, auction, i2, num);
    }
}

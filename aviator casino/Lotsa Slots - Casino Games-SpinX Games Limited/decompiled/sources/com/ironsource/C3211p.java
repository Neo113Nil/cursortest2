package com.ironsource;

/* renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3211p {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6546a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final int d;
    private final long e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;

    public C3211p(java.lang.String auctionData, java.lang.String auctioneerURL, java.lang.String extAuctioneerURL, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctioneerURL, "auctioneerURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extAuctioneerURL, "extAuctioneerURL");
        this.f6546a = auctionData;
        this.b = auctioneerURL;
        this.c = extAuctioneerURL;
        this.d = i;
        this.e = j;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = i3;
        this.j = z3;
        this.k = z4;
    }

    public final java.lang.String a() {
        return this.f6546a;
    }

    public final boolean b() {
        return this.j;
    }

    public final boolean c() {
        return this.k;
    }

    public final java.lang.String d() {
        return this.b;
    }

    public final java.lang.String e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3211p)) {
            return false;
        }
        com.ironsource.C3211p c3211p = (com.ironsource.C3211p) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6546a, c3211p.f6546a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3211p.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3211p.c) && this.d == c3211p.d && this.e == c3211p.e && this.f == c3211p.f && this.g == c3211p.g && this.h == c3211p.h && this.i == c3211p.i && this.j == c3211p.j && this.k == c3211p.k;
    }

    public final int f() {
        return this.d;
    }

    public final long g() {
        return this.e;
    }

    public final int h() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.f6546a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.e)) * 31) + this.f) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.h;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + this.i) * 31;
        boolean z3 = this.j;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.k;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean j() {
        return this.h;
    }

    public final int k() {
        return this.i;
    }

    public final java.lang.String l() {
        return this.f6546a;
    }

    public final int m() {
        return this.f;
    }

    public final long n() {
        return this.e;
    }

    public final int o() {
        return this.d;
    }

    public final java.lang.String p() {
        return this.b;
    }

    public final boolean q() {
        return this.g;
    }

    public final boolean r() {
        return this.h;
    }

    public final boolean s() {
        return this.k;
    }

    public final int t() {
        return this.i;
    }

    public java.lang.String toString() {
        return "AdFormatAuctionConfig2(auctionData=" + this.f6546a + ", auctioneerURL=" + this.b + ", extAuctioneerURL=" + this.c + ", auctionTrials=" + this.d + ", auctionTimeout=" + this.e + ", auctionSavedHistoryLimit=" + this.f + ", compressAuctionRequest=" + this.g + ", compressAuctionResponse=" + this.h + ", encryptionVersion=" + this.i + ", tokenPerAdapter=" + this.j + ", enableAuctionFallback=" + this.k + ")";
    }

    public final java.lang.String u() {
        return this.c;
    }

    public final boolean v() {
        return this.j;
    }

    public final com.ironsource.C3211p a(java.lang.String auctionData, java.lang.String auctioneerURL, java.lang.String extAuctioneerURL, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctioneerURL, "auctioneerURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extAuctioneerURL, "extAuctioneerURL");
        return new com.ironsource.C3211p(auctionData, auctioneerURL, extAuctioneerURL, i, j, i2, z, z2, i3, z3, z4);
    }
}

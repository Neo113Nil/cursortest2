package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4576p {

    /* renamed from: a, reason: collision with root package name */
    private final String f8473a;
    private final String b;
    private final String c;
    private final int d;
    private final long e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;

    public C4576p(String auctionData, String auctioneerURL, String extAuctioneerURL, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(auctioneerURL, "auctioneerURL");
        Intrinsics.checkNotNullParameter(extAuctioneerURL, "extAuctioneerURL");
        this.f8473a = auctionData;
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

    public final String a() {
        return this.f8473a;
    }

    public final boolean b() {
        return this.j;
    }

    public final boolean c() {
        return this.k;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4576p)) {
            return false;
        }
        C4576p c4576p = (C4576p) obj;
        return Intrinsics.areEqual(this.f8473a, c4576p.f8473a) && Intrinsics.areEqual(this.b, c4576p.b) && Intrinsics.areEqual(this.c, c4576p.c) && this.d == c4576p.d && this.e == c4576p.e && this.f == c4576p.f && this.g == c4576p.g && this.h == c4576p.h && this.i == c4576p.i && this.j == c4576p.j && this.k == c4576p.k;
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
        int hashCode = ((((((((((this.f8473a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Long.hashCode(this.e)) * 31) + Integer.hashCode(this.f)) * 31;
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
        int hashCode2 = (((i2 + i3) * 31) + Integer.hashCode(this.i)) * 31;
        boolean z3 = this.j;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        boolean z4 = this.k;
        return i5 + (z4 ? 1 : z4 ? 1 : 0);
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

    public final String l() {
        return this.f8473a;
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

    public final String p() {
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

    public String toString() {
        return "AdFormatAuctionConfig2(auctionData=" + this.f8473a + ", auctioneerURL=" + this.b + ", extAuctioneerURL=" + this.c + ", auctionTrials=" + this.d + ", auctionTimeout=" + this.e + ", auctionSavedHistoryLimit=" + this.f + ", compressAuctionRequest=" + this.g + ", compressAuctionResponse=" + this.h + ", encryptionVersion=" + this.i + ", tokenPerAdapter=" + this.j + ", enableAuctionFallback=" + this.k + ")";
    }

    public final String u() {
        return this.c;
    }

    public final boolean v() {
        return this.j;
    }

    public final C4576p a(String auctionData, String auctioneerURL, String extAuctioneerURL, int i, long j, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(auctioneerURL, "auctioneerURL");
        Intrinsics.checkNotNullParameter(extAuctioneerURL, "extAuctioneerURL");
        return new C4576p(auctionData, auctioneerURL, extAuctioneerURL, i, j, i2, z, z2, i3, z3, z4);
    }
}
